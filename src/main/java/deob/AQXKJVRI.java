package deob;

@ObfuscatedName("AQXKJVRI")
public class AQXKJVRI {

	@ObfuscatedName("AQXKJVRI.b")
	public int field2;

	@ObfuscatedName("AQXKJVRI.c")
	public int[] field3;

	@ObfuscatedName("AQXKJVRI.d")
	public int[][] field4;

	public AQXKJVRI(CFARFRSG arg0) {
		field2 = arg0.method30();
		field3 = new int[field2];
		field4 = new int[field2][];

		for (int var2 = 0; var2 < field2; var2++) {
			field3[var2] = arg0.method30();
		}

		for (int var3 = 0; var3 < field2; var3++) {
			int var4 = arg0.method30();
			field4[var3] = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				field4[var3][var5] = arg0.method30();
			}
		}
	}
}
