package deob;

@ObfuscatedName("QICGPMWF")
public class QICGPMWF {

	@ObfuscatedName("QICGPMWF.b")
	public int field1136;

	@ObfuscatedName("QICGPMWF.c")
	public int[] field1137;

	@ObfuscatedName("QICGPMWF.d")
	public int[][] field1138;

	public QICGPMWF(TQYMAXSO arg0) {
		field1136 = arg0.method468();
		field1137 = new int[field1136];
		field1138 = new int[field1136][];

		for (int var2 = 0; var2 < field1136; var2++) {
			field1137[var2] = arg0.method468();
		}

		for (int var3 = 0; var3 < field1136; var3++) {
			int var4 = arg0.method468();
			field1138[var3] = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				field1138[var3][var5] = arg0.method468();
			}
		}
	}
}
