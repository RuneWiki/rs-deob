package deob;

@ObfuscatedName("BMKJVFXV")
public final class BMKJVFXV {

	@ObfuscatedName("BMKJVFXV.e")
	public ICYNFRTV field49 = new ICYNFRTV();

	@ObfuscatedName("BMKJVFXV.i")
	public ELLPUVEP field53 = new ELLPUVEP();

	@ObfuscatedName("BMKJVFXV.f")
	public int field50;

	@ObfuscatedName("BMKJVFXV.g")
	public int field51;

	@ObfuscatedName("BMKJVFXV.h")
	public LTJSGGCA field52;

	@ObfuscatedName("BMKJVFXV.c")
	public int field47;

	@ObfuscatedName("BMKJVFXV.d")
	public int field48;

	public BMKJVFXV(int arg0) {
		field50 = arg0;
		field51 = arg0;
		field52 = new LTJSGGCA(1024);
	}

	@ObfuscatedName("BMKJVFXV.a(J)LICYNFRTV;")
	public ICYNFRTV method32(long arg0) {
		ICYNFRTV var3 = (ICYNFRTV) field52.method363(arg0);
		if (var3 == null) {
			field47++;
		} else {
			field53.method280(var3);
			field48++;
		}

		return var3;
	}

	@ObfuscatedName("BMKJVFXV.a(JLICYNFRTV;B)V")
	public void method33(long arg0, ICYNFRTV arg1) {
		if (field51 == 0) {
			ICYNFRTV var4 = field53.method281();
			var4.method518();
			var4.method320();

			if (field49 == var4) {
				ICYNFRTV var5 = field53.method281();
				var5.method518();
				var5.method320();
			}
		} else {
			field51--;
		}

		field52.method364(arg1, arg0);
		field53.method280(arg1);
	}

	@ObfuscatedName("BMKJVFXV.a()V")
	public void method34() {
		while (true) {
			ICYNFRTV var1 = field53.method281();
			if (var1 == null) {
				field51 = field50;
				return;
			}

			var1.method518();
			var1.method320();
		}
	}
}
