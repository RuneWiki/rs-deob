package deob;

@ObfuscatedName("KEEMQUKU")
public class KEEMQUKU {

	@ObfuscatedName("KEEMQUKU.b")
	public int field965;

	@ObfuscatedName("KEEMQUKU.e")
	public int field968;

	@ObfuscatedName("KEEMQUKU.f")
	public int field969;

	@ObfuscatedName("KEEMQUKU.g")
	public int field970;

	@ObfuscatedName("KEEMQUKU.h")
	public int field971;

	@ObfuscatedName("KEEMQUKU.i")
	public int field972;

	@ObfuscatedName("KEEMQUKU.j")
	public int field973;

	@ObfuscatedName("KEEMQUKU.k")
	public int field974;

	@ObfuscatedName("KEEMQUKU.l")
	public int field975;

	@ObfuscatedName("KEEMQUKU.c")
	public int[] field966;

	@ObfuscatedName("KEEMQUKU.d")
	public int[] field967;

	@ObfuscatedName("KEEMQUKU.a(LPQBRPYKE;Z)V")
	public final void method272(PQBRPYKE arg0) {
		field970 = arg0.method340();
		field968 = arg0.method345();
		field969 = arg0.method345();
		method273(arg0);
	}

	@ObfuscatedName("KEEMQUKU.a(ILPQBRPYKE;)V")
	public final void method273(PQBRPYKE arg0) {
		field965 = arg0.method340();
		field966 = new int[field965];
		field967 = new int[field965];
		for (int var2 = 0; var2 < field965; var2++) {
			field966[var2] = arg0.method342();
			field967[var2] = arg0.method342();
		}
	}

	@ObfuscatedName("KEEMQUKU.a(I)V")
	public final void method274() {
		field971 = 0;
		field972 = 0;
		field973 = 0;
		field974 = 0;
		field975 = 0;
	}

	@ObfuscatedName("KEEMQUKU.a(BI)I")
	public final int method275(int arg0) {
		if (field975 >= field971) {
			field974 = field967[field972++] << 15;

			if (field972 >= field965) {
				field972 = field965 - 1;
			}

			field971 = (int) (field966[field972] / 65536.0D * arg0);
			if (field971 > field975) {
				field973 = ((field967[field972] << 15) - field974) / (field971 - field975);
			}
		}

		field974 += field973;
		field975++;
		return field974 - field973 >> 15;
	}
}
