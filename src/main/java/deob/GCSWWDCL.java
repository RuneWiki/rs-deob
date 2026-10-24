package deob;

@ObfuscatedName("GCSWWDCL")
public class GCSWWDCL {

	@ObfuscatedName("GCSWWDCL.c")
	public int field547;

	@ObfuscatedName("GCSWWDCL.d")
	public int[] field548;

	@ObfuscatedName("GCSWWDCL.e")
	public int[][] field549;

	public GCSWWDCL(FTMSICIZ arg0) {
		field547 = arg0.method213();
		field548 = new int[field547];
		field549 = new int[field547][];

		for (int var2 = 0; var2 < field547; var2++) {
			field548[var2] = arg0.method213();
		}

		for (int var3 = 0; var3 < field547; var3++) {
			int var4 = arg0.method213();
			field549[var3] = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				field549[var3][var5] = arg0.method213();
			}
		}
	}
}
