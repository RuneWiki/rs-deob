package deob;

@ObfuscatedName("VLFCQHDE")
public class VLFCQHDE {

	@ObfuscatedName("VLFCQHDE.b")
	public int field1418;

	@ObfuscatedName("VLFCQHDE.c")
	public int[] field1419;

	@ObfuscatedName("VLFCQHDE.d")
	public int[][] field1420;

	public VLFCQHDE(MUKVLYLC arg0) {
		field1418 = arg0.method292();
		field1419 = new int[field1418];
		field1420 = new int[field1418][];

		for (int var2 = 0; var2 < field1418; var2++) {
			field1419[var2] = arg0.method292();
		}

		for (int var3 = 0; var3 < field1418; var3++) {
			int var4 = arg0.method292();
			field1420[var3] = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				field1420[var3][var5] = arg0.method292();
			}
		}
	}
}
