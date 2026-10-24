package deob;

@ObfuscatedName("XEMMPKIX")
public class XEMMPKIX {

	@ObfuscatedName("XEMMPKIX.a")
	public int field1319;

	@ObfuscatedName("XEMMPKIX.b")
	public int[] field1320;

	@ObfuscatedName("XEMMPKIX.c")
	public int[][] field1321;

	public XEMMPKIX(PGNBHFUF arg0) {
		field1319 = arg0.method420();
		field1320 = new int[field1319];
		field1321 = new int[field1319][];

		for (int var2 = 0; var2 < field1319; var2++) {
			field1320[var2] = arg0.method420();
		}

		for (int var3 = 0; var3 < field1319; var3++) {
			int var4 = arg0.method420();
			field1321[var3] = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				field1321[var3][var5] = arg0.method420();
			}
		}
	}
}
