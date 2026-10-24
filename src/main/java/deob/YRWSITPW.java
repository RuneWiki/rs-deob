package deob;

@ObfuscatedName("YRWSITPW")
public class YRWSITPW {

	@ObfuscatedName("YRWSITPW.b")
	public int field1406;

	@ObfuscatedName("YRWSITPW.c")
	public int[] field1407;

	@ObfuscatedName("YRWSITPW.d")
	public int[][] field1408;

	public YRWSITPW(XQPFGONL arg0) {
		field1406 = arg0.method478();
		field1407 = new int[field1406];
		field1408 = new int[field1406][];

		for (int var2 = 0; var2 < field1406; var2++) {
			field1407[var2] = arg0.method478();
		}

		for (int var3 = 0; var3 < field1406; var3++) {
			int var4 = arg0.method478();
			field1408[var3] = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				field1408[var3][var5] = arg0.method478();
			}
		}
	}
}
