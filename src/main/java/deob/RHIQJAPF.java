package deob;

@ObfuscatedName("RHIQJAPF")
public class RHIQJAPF {

	@ObfuscatedName("RHIQJAPF.a")
	public int field1262;

	@ObfuscatedName("RHIQJAPF.b")
	public int[] field1263;

	@ObfuscatedName("RHIQJAPF.c")
	public int[][] field1264;

	public RHIQJAPF(MVHXDWGI arg0) {
		field1262 = arg0.method357();
		field1263 = new int[field1262];
		field1264 = new int[field1262][];

		for (int var2 = 0; var2 < field1262; var2++) {
			field1263[var2] = arg0.method357();
		}

		for (int var3 = 0; var3 < field1262; var3++) {
			int var4 = arg0.method357();
			field1264[var3] = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				field1264[var3][var5] = arg0.method357();
			}
		}
	}
}
