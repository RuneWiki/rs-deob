package deob;

@ObfuscatedName("TJOELOUM")
public class TJOELOUM {

	@ObfuscatedName("TJOELOUM.b")
	public int field1264;

	@ObfuscatedName("TJOELOUM.c")
	public int[] field1265;

	@ObfuscatedName("TJOELOUM.d")
	public int[][] field1266;

	public TJOELOUM(GHHPHSRU arg0) {
		field1264 = arg0.method202();
		field1265 = new int[field1264];
		field1266 = new int[field1264][];

		for (int var2 = 0; var2 < field1264; var2++) {
			field1265[var2] = arg0.method202();
		}

		for (int var3 = 0; var3 < field1264; var3++) {
			int var4 = arg0.method202();
			field1266[var3] = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				field1266[var3][var5] = arg0.method202();
			}
		}
	}
}
