package deob;

@ObfuscatedName("QZXSFRVC")
public class QZXSFRVC {

	@ObfuscatedName("QZXSFRVC.c")
	public int field1148;

	@ObfuscatedName("QZXSFRVC.d")
	public int[] field1149;

	@ObfuscatedName("QZXSFRVC.e")
	public int[][] field1150;

	public QZXSFRVC(LBBVYYXO arg0) {
		field1148 = arg0.method369();
		field1149 = new int[field1148];
		field1150 = new int[field1148][];

		for (int var2 = 0; var2 < field1148; var2++) {
			field1149[var2] = arg0.method369();
		}

		for (int var3 = 0; var3 < field1148; var3++) {
			int var4 = arg0.method369();
			field1150[var3] = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				field1150[var3][var5] = arg0.method369();
			}
		}
	}
}
