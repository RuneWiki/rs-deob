package deob;

@ObfuscatedName("MXTMAEWO")
public class MXTMAEWO {

	@ObfuscatedName("MXTMAEWO.b")
	public int field975;

	@ObfuscatedName("MXTMAEWO.c")
	public int[] field976;

	@ObfuscatedName("MXTMAEWO.d")
	public int[][] field977;

	public MXTMAEWO(EILHLJCE arg0) {
		field975 = arg0.method224();
		field976 = new int[field975];
		field977 = new int[field975][];

		for (int var2 = 0; var2 < field975; var2++) {
			field976[var2] = arg0.method224();
		}

		for (int var3 = 0; var3 < field975; var3++) {
			int var4 = arg0.method224();
			field977[var3] = new int[var4];
			for (int var5 = 0; var5 < var4; var5++) {
				field977[var3][var5] = arg0.method224();
			}
		}
	}
}
