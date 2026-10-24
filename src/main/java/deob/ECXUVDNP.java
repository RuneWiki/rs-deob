package deob;

@ObfuscatedName("ECXUVDNP")
public final class ECXUVDNP {

	@ObfuscatedName("ECXUVDNP.c")
	public YLJOEYBF field570 = new YLJOEYBF();

	@ObfuscatedName("ECXUVDNP.g")
	public SYRXWHZM field574 = new SYRXWHZM();

	@ObfuscatedName("ECXUVDNP.d")
	public int field571;

	@ObfuscatedName("ECXUVDNP.e")
	public int field572;

	@ObfuscatedName("ECXUVDNP.f")
	public HZUGKGVT field573;

	@ObfuscatedName("ECXUVDNP.a")
	public int field568;

	@ObfuscatedName("ECXUVDNP.b")
	public int field569;

	public ECXUVDNP(int arg0) {
		field571 = arg0;
		field572 = arg0;
		field573 = new HZUGKGVT(1024);
	}

	@ObfuscatedName("ECXUVDNP.a(J)LYLJOEYBF;")
	public YLJOEYBF method221(long arg0) {
		YLJOEYBF var3 = (YLJOEYBF) field573.method248(arg0);
		if (var3 == null) {
			field568++;
		} else {
			field574.method481(var3);
			field569++;
		}

		return var3;
	}

	@ObfuscatedName("ECXUVDNP.a(JLYLJOEYBF;I)V")
	public void method222(long arg0, YLJOEYBF arg1) {
		if (field572 == 0) {
			YLJOEYBF var4 = field574.method482();
			var4.method492();
			var4.method545();

			if (field570 == var4) {
				YLJOEYBF var5 = field574.method482();
				var5.method492();
				var5.method545();
			}
		} else {
			field572--;
		}

		field573.method249(arg0, arg1);
		field574.method481(arg1);
	}

	@ObfuscatedName("ECXUVDNP.a()V")
	public void method223() {
		while (true) {
			YLJOEYBF var1 = field574.method482();
			if (var1 == null) {
				field572 = field571;
				return;
			}

			var1.method492();
			var1.method545();
		}
	}
}
