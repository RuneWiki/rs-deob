package deob;

@ObfuscatedName("WHXBCNTD")
public class WHXBCNTD {

	@ObfuscatedName("WHXBCNTD.a")
	public int field1326;

	@ObfuscatedName("WHXBCNTD.b")
	public int[] field1327;

	@ObfuscatedName("WHXBCNTD.c")
	public int[][] field1328;

	public WHXBCNTD(CMGGUSPR arg0) {
		field1326 = arg0.method194();
		field1327 = new int[field1326];
		field1328 = new int[field1326][];

		for (int var2 = 0; var2 < field1326; var2++) {
			field1327[var2] = arg0.method194();
		}

		for (int var3 = 0; var3 < field1326; var3++) {
			int var4 = arg0.method194();
			field1328[var3] = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				field1328[var3][var5] = arg0.method194();
			}
		}
	}
}
