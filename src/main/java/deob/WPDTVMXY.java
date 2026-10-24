package deob;

@ObfuscatedName("WPDTVMXY")
public class WPDTVMXY {

	@ObfuscatedName("WPDTVMXY.a")
	public int field1420;

	@ObfuscatedName("WPDTVMXY.b")
	public int[] field1421;

	@ObfuscatedName("WPDTVMXY.c")
	public int[][] field1422;

	public WPDTVMXY(PKHWFJLM arg0) {
		field1420 = arg0.method330();
		field1421 = new int[field1420];
		field1422 = new int[field1420][];

		for (int var2 = 0; var2 < field1420; var2++) {
			field1421[var2] = arg0.method330();
		}

		for (int var3 = 0; var3 < field1420; var3++) {
			int var4 = arg0.method330();
			field1422[var3] = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				field1422[var3][var5] = arg0.method330();
			}
		}
	}
}
