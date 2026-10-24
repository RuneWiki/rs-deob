package deob;

@ObfuscatedName("FGDIESUZ")
public class FGDIESUZ {

	@ObfuscatedName("FGDIESUZ.a")
	public int field692;

	@ObfuscatedName("FGDIESUZ.b")
	public int[] field693;

	@ObfuscatedName("FGDIESUZ.c")
	public int[][] field694;

	public FGDIESUZ(TKPFKOXP arg0) {
		field692 = arg0.method529();
		field693 = new int[field692];
		field694 = new int[field692][];

		for (int var2 = 0; var2 < field692; var2++) {
			field693[var2] = arg0.method529();
		}

		for (int var3 = 0; var3 < field692; var3++) {
			int var4 = arg0.method529();
			field694[var3] = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				field694[var3][var5] = arg0.method529();
			}
		}
	}
}
