package deob;

@ObfuscatedName("NSCXCZCZ")
public class NSCXCZCZ {

	@ObfuscatedName("NSCXCZCZ.b")
	public int field909;

	@ObfuscatedName("NSCXCZCZ.c")
	public int[] field910;

	@ObfuscatedName("NSCXCZCZ.d")
	public int[][] field911;

	public NSCXCZCZ(JHKSAGUC arg0) {
		field909 = arg0.method306();
		field910 = new int[field909];
		field911 = new int[field909][];

		for (int var2 = 0; var2 < field909; var2++) {
			field910[var2] = arg0.method306();
		}

		for (int var3 = 0; var3 < field909; var3++) {
			int var4 = arg0.method306();
			field911[var3] = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				field911[var3][var5] = arg0.method306();
			}
		}
	}
}
