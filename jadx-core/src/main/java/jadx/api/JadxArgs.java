package jadx.api;

import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.List;
import java.util.Set;

public class JadxArgs {

	public static final int DEFAULT_THREADS_COUNT = Math.max(1, Runtime.getRuntime().availableProcessors() / 2);

	public static final String DEFAULT_OUT_DIR = "jadx-output";
	public static final String DEFAULT_SRC_DIR = "sources";
	public static final String DEFAULT_RES_DIR = "resources";

	private List<File> inputFiles = new ArrayList<>(1);

	private File outDir;
	private File outDirSrc;
	private File outDirRes;

	private int threadsCount = DEFAULT_THREADS_COUNT;

	private boolean cfgOutput = false;
	private boolean rawCFGOutput = false;

	private boolean fallbackMode = false;
	private boolean showInconsistentCode = false;

	private boolean useImports = true;
	private boolean debugInfo = true;
	private boolean inlineAnonymousClasses = true;

	private boolean skipResources = false;
	private boolean skipSources = false;

	private boolean deobfuscationOn = false;
	private boolean deobfuscationForceSave = false;
	private boolean useSourceNameAsClassAlias = false;

	private int deobfuscationMinLength = 0;
	private int deobfuscationMaxLength = Integer.MAX_VALUE;

	private boolean escapeUnicode = false;
	private boolean replaceConsts = true;
	private boolean respectBytecodeAccModifiers = false;
	private boolean exportAsGradleProject = false;

	private boolean fsCaseSensitive;

	public enum RENAME {CASE, VALID, PRINTABLE}

	private Set<RENAME> renameFlags = EnumSet.allOf(RENAME.class);

	public JadxArgs() {
		// use default options
	}

	public void setRootDir(File rootDir) {
		setOutDir(rootDir);
		setOutDirSrc(new File(rootDir, DEFAULT_SRC_DIR));
		setOutDirRes(new File(rootDir, DEFAULT_RES_DIR));
	}

	public List<File> getInputFiles() {
		return inputFiles;
	}

	public void setInputFile(File inputFile) {
		this.inputFiles = Collections.singletonList(inputFile);
	}

	public void setInputFiles(List<File> inputFiles) {
		this.inputFiles = inputFiles;
	}

	public File getOutDir() {
		return outDir;
	}

	public void setOutDir(File outDir) {
		this.outDir = outDir;
	}

	public File getOutDirSrc() {
		return outDirSrc;
	}

	public void setOutDirSrc(File outDirSrc) {
		this.outDirSrc = outDirSrc;
	}

	public File getOutDirRes() {
		return outDirRes;
	}

	public void setOutDirRes(File outDirRes) {
		this.outDirRes = outDirRes;
	}

	public int getThreadsCount() {
		return threadsCount;
	}

	public void setThreadsCount(int threadsCount) {
		this.threadsCount = threadsCount;
	}

	public boolean isCfgOutput() {
		return cfgOutput;
	}

	public void setCfgOutput(boolean cfgOutput) {
		this.cfgOutput = cfgOutput;
	}

	public boolean isRawCFGOutput() {
		return rawCFGOutput;
	}

	public void setRawCFGOutput(boolean rawCFGOutput) {
		this.rawCFGOutput = rawCFGOutput;
	}

	public boolean isFallbackMode() {
		return fallbackMode;
	}

	public void setFallbackMode(boolean fallbackMode) {
		this.fallbackMode = fallbackMode;
	}

	public boolean isShowInconsistentCode() {
		return showInconsistentCode;
	}

	public void setShowInconsistentCode(boolean showInconsistentCode) {
		this.showInconsistentCode = showInconsistentCode;
	}

	public boolean isUseImports() {
		return useImports;
	}

	public void setUseImports(boolean useImports) {
		this.useImports = useImports;
	}

	public boolean isDebugInfo() {
		return debugInfo;
	}

	public void setDebugInfo(boolean debugInfo) {
		this.debugInfo = debugInfo;
	}

	public boolean isInlineAnonymousClasses() {
		return inlineAnonymousClasses;
	}

	public void setInlineAnonymousClasses(boolean inlineAnonymousClasses) {
		this.inlineAnonymousClasses = inlineAnonymousClasses;
	}

	public boolean isSkipResources() {
		return skipResources;
	}

	public void setSkipResources(boolean skipResources) {
		this.skipResources = skipResources;
	}

	public boolean isSkipSources() {
		return skipSources;
	}

	public void setSkipSources(boolean skipSources) {
		this.skipSources = skipSources;
	}

	public boolean isDeobfuscationOn() {
		return deobfuscationOn;
	}

	public void setDeobfuscationOn(boolean deobfuscationOn) {
		this.deobfuscationOn = deobfuscationOn;
	}

	public boolean isDeobfuscationForceSave() {
		return deobfuscationForceSave;
	}

	public void setDeobfuscationForceSave(boolean deobfuscationForceSave) {
		this.deobfuscationForceSave = deobfuscationForceSave;
	}

	public boolean isUseSourceNameAsClassAlias() {
		return useSourceNameAsClassAlias;
	}

	public void setUseSourceNameAsClassAlias(boolean useSourceNameAsClassAlias) {
		this.useSourceNameAsClassAlias = useSourceNameAsClassAlias;
	}

	public int getDeobfuscationMinLength() {
		return deobfuscationMinLength;
	}

	public void setDeobfuscationMinLength(int deobfuscationMinLength) {
		this.deobfuscationMinLength = deobfuscationMinLength;
	}

	public int getDeobfuscationMaxLength() {
		return deobfuscationMaxLength;
	}

	public void setDeobfuscationMaxLength(int deobfuscationMaxLength) {
		this.deobfuscationMaxLength = deobfuscationMaxLength;
	}

	public boolean isEscapeUnicode() {
		return escapeUnicode;
	}

	public void setEscapeUnicode(boolean escapeUnicode) {
		this.escapeUnicode = escapeUnicode;
	}

	public boolean isReplaceConsts() {
		return replaceConsts;
	}

	public void setReplaceConsts(boolean replaceConsts) {
		this.replaceConsts = replaceConsts;
	}

	public boolean isRespectBytecodeAccModifiers() {
		return respectBytecodeAccModifiers;
	}

	public void setRespectBytecodeAccModifiers(boolean respectBytecodeAccModifiers) {
		this.respectBytecodeAccModifiers = respectBytecodeAccModifiers;
	}

	public boolean isExportAsGradleProject() {
		return exportAsGradleProject;
	}

	public void setExportAsGradleProject(boolean exportAsGradleProject) {
		this.exportAsGradleProject = exportAsGradleProject;
	}

	public boolean isFsCaseSensitive() {
		return fsCaseSensitive;
	}

	public void setFsCaseSensitive(boolean fsCaseSensitive) {
		this.fsCaseSensitive = fsCaseSensitive;
	}

	public boolean isRenameCaseSensitive() {
		return renameFlags.contains(RENAME.CASE);
	}

	public void setRenameCaseSensitive(boolean renameCaseSensitive) {
		if (renameCaseSensitive && !isRenameCaseSensitive()) {
			renameFlags.add(RENAME.CASE);
		} else if (!renameCaseSensitive && isRenameCaseSensitive()) {
			renameFlags.remove(RENAME.CASE);
		}
	}

	public boolean isRenameValid() {
		return renameFlags.contains(RENAME.VALID);
	}

	public void setRenameValid(boolean renameValid) {
		if (renameValid && !isRenameValid()) {
			renameFlags.add(RENAME.VALID);
		} else if (!renameValid && isRenameValid()) {
			renameFlags.remove(RENAME.VALID);
		}
	}

	public boolean isRenamePrintable() {
		return renameFlags.contains(RENAME.PRINTABLE);
	}

	public void setRenamePrintable(boolean renamePrintable) {
		if (renamePrintable && !isRenamePrintable()) {
			renameFlags.add(RENAME.PRINTABLE);
		} else if (!renamePrintable && isRenamePrintable()) {
			renameFlags.remove(RENAME.PRINTABLE);
		}
	}

	@Override
	public String toString() {
		return "JadxArgs{" + "inputFiles=" + inputFiles +
			       ", outDir=" + outDir +
			       ", outDirSrc=" + outDirSrc +
			       ", outDirRes=" + outDirRes +
			       ", threadsCount=" + threadsCount +
			       ", cfgOutput=" + cfgOutput +
			       ", rawCFGOutput=" + rawCFGOutput +
			       ", fallbackMode=" + fallbackMode +
			       ", showInconsistentCode=" + showInconsistentCode +
			       ", useImports=" + useImports +
			       ", skipResources=" + skipResources +
			       ", skipSources=" + skipSources +
			       ", deobfuscationOn=" + deobfuscationOn +
			       ", deobfuscationForceSave=" + deobfuscationForceSave +
			       ", useSourceNameAsClassAlias=" + useSourceNameAsClassAlias +
			       ", deobfuscationMinLength=" + deobfuscationMinLength +
			       ", deobfuscationMaxLength=" + deobfuscationMaxLength +
			       ", escapeUnicode=" + escapeUnicode +
			       ", replaceConsts=" + replaceConsts +
			       ", respectBytecodeAccModifiers=" + respectBytecodeAccModifiers +
			       ", exportAsGradleProject=" + exportAsGradleProject +
			       ", fsCaseSensitive=" + fsCaseSensitive +
			       ", renameFlags=" + renameFlags +
			       '}';
	}
}
