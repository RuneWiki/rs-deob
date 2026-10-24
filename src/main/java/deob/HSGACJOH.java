package deob;

@ObfuscatedName("HSGACJOH")
public class HSGACJOH {

	@ObfuscatedName("HSGACJOH.a")
	public int field713;

	@ObfuscatedName("HSGACJOH.b")
	public int[] field714;

	@ObfuscatedName("HSGACJOH.c")
	public int[][] field715;

	public HSGACJOH(DNRIFKTO arg0) {
		field713 = arg0.method189();
		field714 = new int[field713];
		field715 = new int[field713][];

		for (int var2 = 0; var2 < field713; var2++) {
			field714[var2] = arg0.method189();
		}

		for (int var3 = 0; var3 < field713; var3++) {
			int var4 = arg0.method189();
			field715[var3] = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				field715[var3][var5] = arg0.method189();
			}
		}
	}
}
