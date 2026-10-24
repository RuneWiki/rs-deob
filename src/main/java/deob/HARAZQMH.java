package deob;

@ObfuscatedName("HARAZQMH")
public final class HARAZQMH {

	@ObfuscatedName("HARAZQMH.d")
	public IOXDUYYH field736 = new IOXDUYYH();

	@ObfuscatedName("HARAZQMH.h")
	public ABNYIQPF field740 = new ABNYIQPF();

	@ObfuscatedName("HARAZQMH.e")
	public int field737;

	@ObfuscatedName("HARAZQMH.f")
	public int field738;

	@ObfuscatedName("HARAZQMH.g")
	public JVZXLCGT field739;

	@ObfuscatedName("HARAZQMH.b")
	public int field734;

	@ObfuscatedName("HARAZQMH.c")
	public int field735;

	public HARAZQMH(int arg0) {
		field737 = arg0;
		field738 = arg0;
		field739 = new JVZXLCGT(1024);
	}

	@ObfuscatedName("HARAZQMH.a(J)LIOXDUYYH;")
	public IOXDUYYH method299(long arg0) {
		IOXDUYYH var3 = (IOXDUYYH) field739.method341(arg0);
		if (var3 == null) {
			field734++;
		} else {
			field740.method2(var3);
			field735++;
		}

		return var3;
	}

	@ObfuscatedName("HARAZQMH.a(BJLIOXDUYYH;)V")
	public void method300(long arg0, IOXDUYYH arg1) {
		if (field738 == 0) {
			IOXDUYYH var4 = field740.method3();
			var4.method1();
			var4.method304();

			if (field736 == var4) {
				IOXDUYYH var5 = field740.method3();
				var5.method1();
				var5.method304();
			}
		} else {
			field738--;
		}

		field739.method342(arg1, arg0);
		field740.method2(arg1);
	}

	@ObfuscatedName("HARAZQMH.a()V")
	public void method301() {
		while (true) {
			IOXDUYYH var1 = field740.method3();
			if (var1 == null) {
				field738 = field737;
				return;
			}

			var1.method1();
			var1.method304();
		}
	}
}
