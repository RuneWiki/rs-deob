package deob;

@ObfuscatedName("YMEZTXZW")
public class YMEZTXZW {

	@ObfuscatedName("YMEZTXZW.b")
	public int field1505;

	@ObfuscatedName("YMEZTXZW.c")
	public int[] field1506;

	@ObfuscatedName("YMEZTXZW.d")
	public int[][] field1507;

	public YMEZTXZW(RGCGKKUR arg0) {
		field1505 = arg0.method455();
		field1506 = new int[field1505];
		field1507 = new int[field1505][];

		for (int var2 = 0; var2 < field1505; var2++) {
			field1506[var2] = arg0.method455();
		}

		for (int var3 = 0; var3 < field1505; var3++) {
			int var4 = arg0.method455();
			field1507[var3] = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				field1507[var3][var5] = arg0.method455();
			}
		}
	}
}
