package deob;

@ObfuscatedName("GCTCRUHH")
public class GCTCRUHH {

	@ObfuscatedName("GCTCRUHH.a")
	public int field718;

	@ObfuscatedName("GCTCRUHH.b")
	public int[] field719;

	@ObfuscatedName("GCTCRUHH.c")
	public int[][] field720;

	public GCTCRUHH(BFQIDHPO arg0) {
		field718 = arg0.method54();
		field719 = new int[field718];
		field720 = new int[field718][];

		for (int var2 = 0; var2 < field718; var2++) {
			field719[var2] = arg0.method54();
		}

		for (int var3 = 0; var3 < field718; var3++) {
			int var4 = arg0.method54();
			field720[var3] = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				field720[var3][var5] = arg0.method54();
			}
		}
	}
}
