package deob;

@ObfuscatedName("NSRSHTPL")
public class NSRSHTPL {

	@ObfuscatedName("NSRSHTPL.c")
	public int field936;

	@ObfuscatedName("NSRSHTPL.f")
	public int field939;

	@ObfuscatedName("NSRSHTPL.g")
	public int field940;

	@ObfuscatedName("NSRSHTPL.h")
	public int field941;

	@ObfuscatedName("NSRSHTPL.i")
	public int field942;

	@ObfuscatedName("NSRSHTPL.j")
	public int field943;

	@ObfuscatedName("NSRSHTPL.k")
	public int field944;

	@ObfuscatedName("NSRSHTPL.l")
	public int field945;

	@ObfuscatedName("NSRSHTPL.m")
	public int field946;

	@ObfuscatedName("NSRSHTPL.d")
	public int[] field937;

	@ObfuscatedName("NSRSHTPL.e")
	public int[] field938;

	@ObfuscatedName("NSRSHTPL.a(BLYOXDZEVD;)V")
	public final void method338(YOXDZEVD arg0) {
		field941 = arg0.method549();
		field939 = arg0.method554();
		field940 = arg0.method554();
		method339(arg0);
	}

	@ObfuscatedName("NSRSHTPL.a(ILYOXDZEVD;)V")
	public final void method339(YOXDZEVD arg0) {
		field936 = arg0.method549();
		field937 = new int[field936];
		field938 = new int[field936];
		for (int var2 = 0; var2 < field936; var2++) {
			field937[var2] = arg0.method551();
			field938[var2] = arg0.method551();
		}
	}

	@ObfuscatedName("NSRSHTPL.a(B)V")
	public final void method340() {
		field942 = 0;
		field943 = 0;
		field944 = 0;
		field945 = 0;
		field946 = 0;
	}

	@ObfuscatedName("NSRSHTPL.a(II)I")
	public final int method341(int arg0) {
		if (field946 >= field942) {
			field945 = field938[field943++] << 15;

			if (field943 >= field936) {
				field943 = field936 - 1;
			}

			field942 = (int) (field937[field943] / 65536.0D * arg0);
			if (field942 > field946) {
				field944 = ((field938[field943] << 15) - field945) / (field942 - field946);
			}
		}

		field945 += field944;
		field946++;
		return field945 - field944 >> 15;
	}
}
