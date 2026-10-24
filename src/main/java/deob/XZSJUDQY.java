package deob;

@ObfuscatedName("XZSJUDQY")
public class XZSJUDQY {

	@ObfuscatedName("XZSJUDQY.a")
	public int field1506;

	@ObfuscatedName("XZSJUDQY.b")
	public int[] field1507;

	@ObfuscatedName("XZSJUDQY.c")
	public int[][] field1508;

	public XZSJUDQY(WBEWPIXO arg0) {
		field1506 = arg0.method515();
		field1507 = new int[field1506];
		field1508 = new int[field1506][];

		for (int var2 = 0; var2 < field1506; var2++) {
			field1507[var2] = arg0.method515();
		}

		for (int var3 = 0; var3 < field1506; var3++) {
			int var4 = arg0.method515();
			field1508[var3] = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				field1508[var3][var5] = arg0.method515();
			}
		}
	}
}
