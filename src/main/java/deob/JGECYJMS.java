package deob;

@ObfuscatedName("JGECYJMS")
public final class JGECYJMS {

	@ObfuscatedName("JGECYJMS.e")
	public USMRNXZO field740 = new USMRNXZO();

	@ObfuscatedName("JGECYJMS.i")
	public JLOKOMHZ field744 = new JLOKOMHZ();

	@ObfuscatedName("JGECYJMS.f")
	public int field741;

	@ObfuscatedName("JGECYJMS.g")
	public int field742;

	@ObfuscatedName("JGECYJMS.h")
	public YFWIPPMU field743;

	@ObfuscatedName("JGECYJMS.c")
	public int field738;

	@ObfuscatedName("JGECYJMS.d")
	public int field739;

	public JGECYJMS(int arg0) {
		field741 = arg0;
		field742 = arg0;
		field743 = new YFWIPPMU(1024);
	}

	@ObfuscatedName("JGECYJMS.a(J)LUSMRNXZO;")
	public USMRNXZO method230(long arg0) {
		USMRNXZO var3 = (USMRNXZO) field743.method582(arg0);
		if (var3 == null) {
			field738++;
		} else {
			field744.method233(var3);
			field739++;
		}

		return var3;
	}

	@ObfuscatedName("JGECYJMS.a(JILUSMRNXZO;)V")
	public void method231(long arg0, USMRNXZO arg1) {
		if (field742 == 0) {
			USMRNXZO var4 = field744.method234();
			var4.method272();
			var4.method531();

			if (field740 == var4) {
				USMRNXZO var5 = field744.method234();
				var5.method272();
				var5.method531();
			}
		} else {
			field742--;
		}

		field743.method583(arg0, arg1);
		field744.method233(arg1);
	}

	@ObfuscatedName("JGECYJMS.a()V")
	public void method232() {
		while (true) {
			USMRNXZO var1 = field744.method234();
			if (var1 == null) {
				field742 = field741;
				return;
			}

			var1.method272();
			var1.method531();
		}
	}
}
