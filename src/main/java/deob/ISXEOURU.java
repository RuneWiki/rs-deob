package deob;

@ObfuscatedName("ISXEOURU")
public final class ISXEOURU {

	@ObfuscatedName("ISXEOURU.e")
	public CJDGAOKT field804 = new CJDGAOKT();

	@ObfuscatedName("ISXEOURU.i")
	public LOPREVUC field808 = new LOPREVUC();

	@ObfuscatedName("ISXEOURU.f")
	public int field805;

	@ObfuscatedName("ISXEOURU.g")
	public int field806;

	@ObfuscatedName("ISXEOURU.h")
	public YDSZUOCR field807;

	@ObfuscatedName("ISXEOURU.c")
	public int field802;

	@ObfuscatedName("ISXEOURU.d")
	public int field803;

	public ISXEOURU(int arg0) {
		field805 = arg0;
		field806 = arg0;
		field807 = new YDSZUOCR(1024);
	}

	@ObfuscatedName("ISXEOURU.a(J)LCJDGAOKT;")
	public CJDGAOKT method228(long arg0) {
		CJDGAOKT var3 = (CJDGAOKT) field807.method518(arg0);
		if (var3 == null) {
			field802++;
		} else {
			field808.method259(var3);
			field803++;
		}

		return var3;
	}

	@ObfuscatedName("ISXEOURU.a(IJLCJDGAOKT;)V")
	public void method229(long arg0, CJDGAOKT arg1) {
		if (field806 == 0) {
			CJDGAOKT var4 = field808.method260();
			var4.method591();
			var4.method37();

			if (field804 == var4) {
				CJDGAOKT var5 = field808.method260();
				var5.method591();
				var5.method37();
			}
		} else {
			field806--;
		}

		field807.method519(arg1, arg0);
		field808.method259(arg1);
	}

	@ObfuscatedName("ISXEOURU.a()V")
	public void method230() {
		while (true) {
			CJDGAOKT var1 = field808.method260();
			if (var1 == null) {
				field806 = field805;
				return;
			}

			var1.method591();
			var1.method37();
		}
	}
}
