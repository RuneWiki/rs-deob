package deob;

@ObfuscatedName("ANHDGPPA")
public class ANHDGPPA {

	@ObfuscatedName("ANHDGPPA.b")
	public int field31;

	@ObfuscatedName("ANHDGPPA.c")
	public int[] field32;

	@ObfuscatedName("ANHDGPPA.d")
	public int[][] field33;

	public ANHDGPPA(XJCNBMKS arg0) {
		field31 = arg0.method534();
		field32 = new int[field31];
		field33 = new int[field31][];

		for (int var2 = 0; var2 < field31; var2++) {
			field32[var2] = arg0.method534();
		}

		for (int var3 = 0; var3 < field31; var3++) {
			int var4 = arg0.method534();
			field33[var3] = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				field33[var3][var5] = arg0.method534();
			}
		}
	}
}
