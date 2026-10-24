package deob;

@ObfuscatedName("OSKYDPYJ")
public class OSKYDPYJ {

	@ObfuscatedName("OSKYDPYJ.b")
	public int field1059;

	@ObfuscatedName("OSKYDPYJ.c")
	public int[] field1060;

	@ObfuscatedName("OSKYDPYJ.d")
	public int[][] field1061;

	public OSKYDPYJ(KHOMSBHW arg0) {
		field1059 = arg0.method349();
		field1060 = new int[field1059];
		field1061 = new int[field1059][];

		for (int var2 = 0; var2 < field1059; var2++) {
			field1060[var2] = arg0.method349();
		}

		for (int var3 = 0; var3 < field1059; var3++) {
			int var4 = arg0.method349();
			field1061[var3] = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				field1061[var3][var5] = arg0.method349();
			}
		}
	}
}
