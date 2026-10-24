package deob;

@ObfuscatedName("RPKBYPNF")
public class RPKBYPNF {

	@ObfuscatedName("RPKBYPNF.e")
	public int field983;

	@ObfuscatedName("RPKBYPNF.h")
	public int field986;

	@ObfuscatedName("RPKBYPNF.i")
	public int field987;

	@ObfuscatedName("RPKBYPNF.j")
	public int field988;

	@ObfuscatedName("RPKBYPNF.k")
	public int field989;

	@ObfuscatedName("RPKBYPNF.l")
	public int field990;

	@ObfuscatedName("RPKBYPNF.m")
	public int field991;

	@ObfuscatedName("RPKBYPNF.n")
	public int field992;

	@ObfuscatedName("RPKBYPNF.o")
	public int field993;

	@ObfuscatedName("RPKBYPNF.f")
	public int[] field984;

	@ObfuscatedName("RPKBYPNF.g")
	public int[] field985;

	@ObfuscatedName("RPKBYPNF.a(LMQZHAILV;I)V")
	public final void method473(MQZHAILV arg0) {
		field988 = arg0.method325();
		field986 = arg0.method330();
		field987 = arg0.method330();
		method474(arg0);
	}

	@ObfuscatedName("RPKBYPNF.a(LMQZHAILV;B)V")
	public final void method474(MQZHAILV arg0) {
		field983 = arg0.method325();
		field984 = new int[field983];
		field985 = new int[field983];
		for (int var2 = 0; var2 < field983; var2++) {
			field984[var2] = arg0.method327();
			field985[var2] = arg0.method327();
		}
	}

	@ObfuscatedName("RPKBYPNF.a(B)V")
	public final void method475() {
		field989 = 0;
		field990 = 0;
		field991 = 0;
		field992 = 0;
		field993 = 0;
	}

	@ObfuscatedName("RPKBYPNF.a(IB)I")
	public final int method476(int arg0) {
		if (field993 >= field989) {
			field992 = field985[field990++] << 15;

			if (field990 >= field983) {
				field990 = field983 - 1;
			}

			field989 = (int) (field984[field990] / 65536.0D * arg0);
			if (field989 > field993) {
				field991 = ((field985[field990] << 15) - field992) / (field989 - field993);
			}
		}

		field992 += field991;
		field993++;
		return field992 - field991 >> 15;
	}
}
