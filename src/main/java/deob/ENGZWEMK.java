package deob;

@ObfuscatedName("ENGZWEMK")
public class ENGZWEMK {

	@ObfuscatedName("ENGZWEMK.d")
	public int field675;

	@ObfuscatedName("ENGZWEMK.g")
	public int field678;

	@ObfuscatedName("ENGZWEMK.h")
	public int field679;

	@ObfuscatedName("ENGZWEMK.i")
	public int field680;

	@ObfuscatedName("ENGZWEMK.j")
	public int field681;

	@ObfuscatedName("ENGZWEMK.k")
	public int field682;

	@ObfuscatedName("ENGZWEMK.l")
	public int field683;

	@ObfuscatedName("ENGZWEMK.m")
	public int field684;

	@ObfuscatedName("ENGZWEMK.n")
	public int field685;

	@ObfuscatedName("ENGZWEMK.e")
	public int[] field676;

	@ObfuscatedName("ENGZWEMK.f")
	public int[] field677;

	@ObfuscatedName("ENGZWEMK.a(LPKHWFJLM;Z)V")
	public final void method221(PKHWFJLM arg0) {
		field680 = arg0.method330();
		field678 = arg0.method335();
		field679 = arg0.method335();
		method222(arg0);
	}

	@ObfuscatedName("ENGZWEMK.b(LPKHWFJLM;Z)V")
	public final void method222(PKHWFJLM arg0) {
		field675 = arg0.method330();
		field676 = new int[field675];
		field677 = new int[field675];
		for (int var2 = 0; var2 < field675; var2++) {
			field676[var2] = arg0.method332();
			field677[var2] = arg0.method332();
		}
	}

	@ObfuscatedName("ENGZWEMK.a(B)V")
	public final void method223() {
		field681 = 0;
		field682 = 0;
		field683 = 0;
		field684 = 0;
		field685 = 0;
	}

	@ObfuscatedName("ENGZWEMK.a(II)I")
	public final int method224(int arg0) {
		if (field685 >= field681) {
			field684 = field677[field682++] << 15;

			if (field682 >= field675) {
				field682 = field675 - 1;
			}

			field681 = (int) (field676[field682] / 65536.0D * arg0);
			if (field681 > field685) {
				field683 = ((field677[field682] << 15) - field684) / (field681 - field685);
			}
		}

		field684 += field683;
		field685++;
		return field684 - field683 >> 15;
	}
}
