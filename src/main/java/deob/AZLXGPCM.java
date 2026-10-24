package deob;

@ObfuscatedName("AZLXGPCM")
public class AZLXGPCM {

	@ObfuscatedName("AZLXGPCM.a")
	public int field117;

	@ObfuscatedName("AZLXGPCM.b")
	public int[] field118;

	@ObfuscatedName("AZLXGPCM.c")
	public int[][] field119;

	public AZLXGPCM(YOXDZEVD arg0) {
		field117 = arg0.method549();
		field118 = new int[field117];
		field119 = new int[field117][];

		for (int var2 = 0; var2 < field117; var2++) {
			field118[var2] = arg0.method549();
		}

		for (int var3 = 0; var3 < field117; var3++) {
			int var4 = arg0.method549();
			field119[var3] = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				field119[var3][var5] = arg0.method549();
			}
		}
	}
}
