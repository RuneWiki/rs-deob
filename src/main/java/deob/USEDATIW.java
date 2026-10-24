package deob;

@ObfuscatedName("USEDATIW")
public class USEDATIW {

	@ObfuscatedName("USEDATIW.b")
	public int field1289;

	@ObfuscatedName("USEDATIW.c")
	public int[] field1290;

	@ObfuscatedName("USEDATIW.d")
	public int[][] field1291;

	public USEDATIW(NHEPCMLW arg0) {
		field1289 = arg0.method349();
		field1290 = new int[field1289];
		field1291 = new int[field1289][];

		for (int var2 = 0; var2 < field1289; var2++) {
			field1290[var2] = arg0.method349();
		}

		for (int var3 = 0; var3 < field1289; var3++) {
			int var4 = arg0.method349();
			field1291[var3] = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				field1291[var3][var5] = arg0.method349();
			}
		}
	}
}
