package deob;

@ObfuscatedName("TULKBDIJ")
public class TULKBDIJ {

	@ObfuscatedName("TULKBDIJ.a")
	public int field1255;

	@ObfuscatedName("TULKBDIJ.b")
	public int[] field1256;

	@ObfuscatedName("TULKBDIJ.c")
	public int[][] field1257;

	public TULKBDIJ(EYMNCFMK arg0) {
		field1255 = arg0.method239();
		field1256 = new int[field1255];
		field1257 = new int[field1255][];

		for (int var2 = 0; var2 < field1255; var2++) {
			field1256[var2] = arg0.method239();
		}

		for (int var3 = 0; var3 < field1255; var3++) {
			int var4 = arg0.method239();
			field1257[var3] = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				field1257[var3][var5] = arg0.method239();
			}
		}
	}
}
