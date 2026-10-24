package deob;

@ObfuscatedName("TMLYUVVT")
public class TMLYUVVT {

	@ObfuscatedName("TMLYUVVT.b")
	public int field1183;

	@ObfuscatedName("TMLYUVVT.c")
	public int[] field1184;

	@ObfuscatedName("TMLYUVVT.d")
	public int[][] field1185;

	public TMLYUVVT(UAWAYCTK arg0) {
		field1183 = arg0.method455();
		field1184 = new int[field1183];
		field1185 = new int[field1183][];

		for (int var2 = 0; var2 < field1183; var2++) {
			field1184[var2] = arg0.method455();
		}

		for (int var3 = 0; var3 < field1183; var3++) {
			int var4 = arg0.method455();
			field1185[var3] = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				field1185[var3][var5] = arg0.method455();
			}
		}
	}
}
