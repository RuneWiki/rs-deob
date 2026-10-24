package deob;

@ObfuscatedName("GOPFMRDJ")
public final class GOPFMRDJ {

	@ObfuscatedName("GOPFMRDJ.h")
	public ZAQWNGNJ field703 = new ZAQWNGNJ();

	@ObfuscatedName("GOPFMRDJ.l")
	public LVGEETWD field707 = new LVGEETWD();

	@ObfuscatedName("GOPFMRDJ.i")
	public int field704;

	@ObfuscatedName("GOPFMRDJ.j")
	public int field705;

	@ObfuscatedName("GOPFMRDJ.k")
	public LVXNVCAS field706;

	@ObfuscatedName("GOPFMRDJ.f")
	public int field701;

	@ObfuscatedName("GOPFMRDJ.g")
	public int field702;

	public GOPFMRDJ(int arg0) {
		field704 = arg0;
		field705 = arg0;
		field706 = new LVXNVCAS(1024);
	}

	@ObfuscatedName("GOPFMRDJ.a(J)LZAQWNGNJ;")
	public ZAQWNGNJ method220(long arg0) {
		ZAQWNGNJ var3 = (ZAQWNGNJ) field706.method362(arg0);
		if (var3 == null) {
			field701++;
		} else {
			field707.method357(var3);
			field702++;
		}

		return var3;
	}

	@ObfuscatedName("GOPFMRDJ.a(JBLZAQWNGNJ;)V")
	public void method221(long arg0, ZAQWNGNJ arg1) {
		if (field705 == 0) {
			ZAQWNGNJ var4 = field707.method358();
			var4.method195();
			var4.method537();

			if (field703 == var4) {
				ZAQWNGNJ var5 = field707.method358();
				var5.method195();
				var5.method537();
			}
		} else {
			field705--;
		}

		field706.method363(arg0, arg1);
		field707.method357(arg1);
	}

	@ObfuscatedName("GOPFMRDJ.a()V")
	public void method222() {
		while (true) {
			ZAQWNGNJ var1 = field707.method358();
			if (var1 == null) {
				field705 = field704;
				return;
			}

			var1.method195();
			var1.method537();
		}
	}
}
