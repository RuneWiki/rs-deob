package deob;

@ObfuscatedName("HXORSAZH")
public class HXORSAZH {

	@ObfuscatedName("HXORSAZH.b")
	public int field671;

	@ObfuscatedName("HXORSAZH.e")
	public int field674;

	@ObfuscatedName("HXORSAZH.f")
	public int field675;

	@ObfuscatedName("HXORSAZH.g")
	public int field676;

	@ObfuscatedName("HXORSAZH.h")
	public int field677;

	@ObfuscatedName("HXORSAZH.i")
	public int field678;

	@ObfuscatedName("HXORSAZH.j")
	public int field679;

	@ObfuscatedName("HXORSAZH.k")
	public int field680;

	@ObfuscatedName("HXORSAZH.l")
	public int field681;

	@ObfuscatedName("HXORSAZH.c")
	public int[] field672;

	@ObfuscatedName("HXORSAZH.d")
	public int[] field673;

	@ObfuscatedName("HXORSAZH.a(ILTQYMAXSO;)V")
	public final void method222(TQYMAXSO arg0) {
		field676 = arg0.method468();
		field674 = arg0.method473();
		field675 = arg0.method473();
		method223(arg0);
	}

	@ObfuscatedName("HXORSAZH.a(LTQYMAXSO;I)V")
	public final void method223(TQYMAXSO arg0) {
		field671 = arg0.method468();
		field672 = new int[field671];
		field673 = new int[field671];
		for (int var2 = 0; var2 < field671; var2++) {
			field672[var2] = arg0.method470();
			field673[var2] = arg0.method470();
		}
	}

	@ObfuscatedName("HXORSAZH.a(Z)V")
	public final void method224() {
		field677 = 0;
		field678 = 0;
		field679 = 0;
		field680 = 0;
		field681 = 0;
	}

	@ObfuscatedName("HXORSAZH.a(IB)I")
	public final int method225(int arg0) {
		if (field681 >= field677) {
			field680 = field673[field678++] << 15;

			if (field678 >= field671) {
				field678 = field671 - 1;
			}

			field677 = (int) (field672[field678] / 65536.0D * arg0);
			if (field677 > field681) {
				field679 = ((field673[field678] << 15) - field680) / (field677 - field681);
			}
		}

		field680 += field679;
		field681++;
		return field680 - field679 >> 15;
	}
}
