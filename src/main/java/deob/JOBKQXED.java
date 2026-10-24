package deob;

@ObfuscatedName("JOBKQXED")
public class JOBKQXED {

	@ObfuscatedName("JOBKQXED.c")
	public int field825;

	@ObfuscatedName("JOBKQXED.f")
	public int field828;

	@ObfuscatedName("JOBKQXED.g")
	public int field829;

	@ObfuscatedName("JOBKQXED.h")
	public int field830;

	@ObfuscatedName("JOBKQXED.i")
	public int field831;

	@ObfuscatedName("JOBKQXED.j")
	public int field832;

	@ObfuscatedName("JOBKQXED.k")
	public int field833;

	@ObfuscatedName("JOBKQXED.l")
	public int field834;

	@ObfuscatedName("JOBKQXED.m")
	public int field835;

	@ObfuscatedName("JOBKQXED.d")
	public int[] field826;

	@ObfuscatedName("JOBKQXED.e")
	public int[] field827;

	@ObfuscatedName("JOBKQXED.a(LCMGGUSPR;I)V")
	public final void method337(CMGGUSPR arg0) {
		field830 = arg0.method194();
		field828 = arg0.method199();
		field829 = arg0.method199();
		method338(arg0);
	}

	@ObfuscatedName("JOBKQXED.a(ZLCMGGUSPR;)V")
	public final void method338(CMGGUSPR arg0) {
		field825 = arg0.method194();
		field826 = new int[field825];
		field827 = new int[field825];
		for (int var2 = 0; var2 < field825; var2++) {
			field826[var2] = arg0.method196();
			field827[var2] = arg0.method196();
		}
	}

	@ObfuscatedName("JOBKQXED.a(B)V")
	public final void method339() {
		field831 = 0;
		field832 = 0;
		field833 = 0;
		field834 = 0;
		field835 = 0;
	}

	@ObfuscatedName("JOBKQXED.a(IB)I")
	public final int method340(int arg0) {
		if (field835 >= field831) {
			field834 = field827[field832++] << 15;

			if (field832 >= field825) {
				field832 = field825 - 1;
			}

			field831 = (int) (field826[field832] / 65536.0D * arg0);
			if (field831 > field835) {
				field833 = ((field827[field832] << 15) - field834) / (field831 - field835);
			}
		}

		field834 += field833;
		field835++;
		return field834 - field833 >> 15;
	}
}
