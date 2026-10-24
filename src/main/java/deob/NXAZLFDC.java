package deob;

@ObfuscatedName("NXAZLFDC")
public class NXAZLFDC {

	@ObfuscatedName("NXAZLFDC.c")
	public int field982;

	@ObfuscatedName("NXAZLFDC.f")
	public int field985;

	@ObfuscatedName("NXAZLFDC.g")
	public int field986;

	@ObfuscatedName("NXAZLFDC.h")
	public int field987;

	@ObfuscatedName("NXAZLFDC.i")
	public int field988;

	@ObfuscatedName("NXAZLFDC.j")
	public int field989;

	@ObfuscatedName("NXAZLFDC.k")
	public int field990;

	@ObfuscatedName("NXAZLFDC.l")
	public int field991;

	@ObfuscatedName("NXAZLFDC.m")
	public int field992;

	@ObfuscatedName("NXAZLFDC.d")
	public int[] field983;

	@ObfuscatedName("NXAZLFDC.e")
	public int[] field984;

	@ObfuscatedName("NXAZLFDC.a(LLDILQFVA;I)V")
	public final void method498(LDILQFVA arg0) {
		field987 = arg0.method402();
		field985 = arg0.method407();
		field986 = arg0.method407();
		method499(arg0);
	}

	@ObfuscatedName("NXAZLFDC.a(LLDILQFVA;Z)V")
	public final void method499(LDILQFVA arg0) {
		field982 = arg0.method402();
		field983 = new int[field982];
		field984 = new int[field982];
		for (int var2 = 0; var2 < field982; var2++) {
			field983[var2] = arg0.method404();
			field984[var2] = arg0.method404();
		}
	}

	@ObfuscatedName("NXAZLFDC.a(I)V")
	public final void method500() {
		field988 = 0;
		field989 = 0;
		field990 = 0;
		field991 = 0;
		field992 = 0;
	}

	@ObfuscatedName("NXAZLFDC.a(IB)I")
	public final int method501(int arg0) {
		if (field992 >= field988) {
			field991 = field984[field989++] << 15;

			if (field989 >= field982) {
				field989 = field982 - 1;
			}

			field988 = (int) (field983[field989] / 65536.0D * arg0);
			if (field988 > field992) {
				field990 = ((field984[field989] << 15) - field991) / (field988 - field992);
			}
		}

		field991 += field990;
		field992++;
		return field991 - field990 >> 15;
	}
}
