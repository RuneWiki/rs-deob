package deob;

@ObfuscatedName("ETJKXQLD")
public class ETJKXQLD {

	@ObfuscatedName("ETJKXQLD.a")
	public int field608;

	@ObfuscatedName("ETJKXQLD.b")
	public int[] field609;

	@ObfuscatedName("ETJKXQLD.c")
	public int[][] field610;

	public ETJKXQLD(LDILQFVA arg0) {
		field608 = arg0.method402();
		field609 = new int[field608];
		field610 = new int[field608][];

		for (int var2 = 0; var2 < field608; var2++) {
			field609[var2] = arg0.method402();
		}

		for (int var3 = 0; var3 < field608; var3++) {
			int var4 = arg0.method402();
			field610[var3] = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				field610[var3][var5] = arg0.method402();
			}
		}
	}
}
