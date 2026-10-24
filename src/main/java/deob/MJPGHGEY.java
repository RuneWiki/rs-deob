package deob;

@ObfuscatedName("MJPGHGEY")
public class MJPGHGEY {

	@ObfuscatedName("MJPGHGEY.a")
	public int field1023;

	@ObfuscatedName("MJPGHGEY.b")
	public int[] field1024;

	@ObfuscatedName("MJPGHGEY.c")
	public int[][] field1025;

	public MJPGHGEY(PQBRPYKE arg0) {
		field1023 = arg0.method340();
		field1024 = new int[field1023];
		field1025 = new int[field1023][];

		for (int var2 = 0; var2 < field1023; var2++) {
			field1024[var2] = arg0.method340();
		}

		for (int var3 = 0; var3 < field1023; var3++) {
			int var4 = arg0.method340();
			field1025[var3] = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				field1025[var3][var5] = arg0.method340();
			}
		}
	}
}
