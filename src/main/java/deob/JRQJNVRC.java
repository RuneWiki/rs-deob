package deob;

@ObfuscatedName("JRQJNVRC")
public class JRQJNVRC {

	@ObfuscatedName("JRQJNVRC.b")
	public int field1053;

	@ObfuscatedName("JRQJNVRC.c")
	public int[] field1054;

	@ObfuscatedName("JRQJNVRC.d")
	public int[][] field1055;

	public JRQJNVRC(INLHDAGO arg0) {
		field1053 = arg0.method308();
		field1054 = new int[field1053];
		field1055 = new int[field1053][];

		for (int var2 = 0; var2 < field1053; var2++) {
			field1054[var2] = arg0.method308();
		}

		for (int var3 = 0; var3 < field1053; var3++) {
			int var4 = arg0.method308();
			field1055[var3] = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				field1055[var3][var5] = arg0.method308();
			}
		}
	}
}
