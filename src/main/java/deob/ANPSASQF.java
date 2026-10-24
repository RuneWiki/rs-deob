package deob;

@ObfuscatedName("ANPSASQF")
public class ANPSASQF {

	@ObfuscatedName("ANPSASQF.d")
	public int field10;

	@ObfuscatedName("ANPSASQF.g")
	public int field13;

	@ObfuscatedName("ANPSASQF.h")
	public int field14;

	@ObfuscatedName("ANPSASQF.i")
	public int field15;

	@ObfuscatedName("ANPSASQF.j")
	public int field16;

	@ObfuscatedName("ANPSASQF.k")
	public int field17;

	@ObfuscatedName("ANPSASQF.l")
	public int field18;

	@ObfuscatedName("ANPSASQF.m")
	public int field19;

	@ObfuscatedName("ANPSASQF.n")
	public int field20;

	@ObfuscatedName("ANPSASQF.e")
	public int[] field11;

	@ObfuscatedName("ANPSASQF.f")
	public int[] field12;

	@ObfuscatedName("ANPSASQF.a(BLEYMNCFMK;)V")
	public final void method3(EYMNCFMK arg0) {
		field15 = arg0.method239();
		field13 = arg0.method244();
		field14 = arg0.method244();
		method4(arg0);
	}

	@ObfuscatedName("ANPSASQF.a(LEYMNCFMK;I)V")
	public final void method4(EYMNCFMK arg0) {
		field10 = arg0.method239();
		field11 = new int[field10];
		field12 = new int[field10];
		for (int var2 = 0; var2 < field10; var2++) {
			field11[var2] = arg0.method241();
			field12[var2] = arg0.method241();
		}
	}

	@ObfuscatedName("ANPSASQF.a(I)V")
	public final void method5() {
		field16 = 0;
		field17 = 0;
		field18 = 0;
		field19 = 0;
		field20 = 0;
	}

	@ObfuscatedName("ANPSASQF.a(BI)I")
	public final int method6(int arg0) {
		if (field20 >= field16) {
			field19 = field12[field17++] << 15;

			if (field17 >= field10) {
				field17 = field10 - 1;
			}

			field16 = (int) (field11[field17] / 65536.0D * arg0);
			if (field16 > field20) {
				field18 = ((field12[field17] << 15) - field19) / (field16 - field20);
			}
		}

		field19 += field18;
		field20++;
		return field19 - field18 >> 15;
	}
}
