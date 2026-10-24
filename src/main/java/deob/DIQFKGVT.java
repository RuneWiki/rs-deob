package deob;

@ObfuscatedName("DIQFKGVT")
public class DIQFKGVT {

	@ObfuscatedName("DIQFKGVT.b")
	public int field637;

	@ObfuscatedName("DIQFKGVT.c")
	public int[] field638;

	@ObfuscatedName("DIQFKGVT.d")
	public int[][] field639;

	public DIQFKGVT(ZOMNSJJM arg0) {
		field637 = arg0.method547();
		field638 = new int[field637];
		field639 = new int[field637][];

		for (int var2 = 0; var2 < field637; var2++) {
			field638[var2] = arg0.method547();
		}

		for (int var3 = 0; var3 < field637; var3++) {
			int var4 = arg0.method547();
			field639[var3] = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				field639[var3][var5] = arg0.method547();
			}
		}
	}
}
