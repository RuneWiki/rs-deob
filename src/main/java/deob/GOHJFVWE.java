package deob;

@ObfuscatedName("GOHJFVWE")
public final class GOHJFVWE {

	@ObfuscatedName("GOHJFVWE.f")
	public JJFDBATQ field714 = new JJFDBATQ();

	@ObfuscatedName("GOHJFVWE.j")
	public XWKFKQRL field718 = new XWKFKQRL();

	@ObfuscatedName("GOHJFVWE.g")
	public int field715;

	@ObfuscatedName("GOHJFVWE.h")
	public int field716;

	@ObfuscatedName("GOHJFVWE.i")
	public STTRNURD field717;

	@ObfuscatedName("GOHJFVWE.d")
	public int field712;

	@ObfuscatedName("GOHJFVWE.e")
	public int field713;

	public GOHJFVWE(int arg0) {
		field715 = arg0;
		field716 = arg0;
		field717 = new STTRNURD(1024);
	}

	@ObfuscatedName("GOHJFVWE.a(J)LJJFDBATQ;")
	public JJFDBATQ method227(long arg0) {
		JJFDBATQ var3 = (JJFDBATQ) field717.method414(arg0);
		if (var3 == null) {
			field712++;
		} else {
			field718.method520(var3);
			field713++;
		}

		return var3;
	}

	@ObfuscatedName("GOHJFVWE.a(ILJJFDBATQ;J)V")
	public void method228(JJFDBATQ arg0, long arg1) {
		if (field716 == 0) {
			JJFDBATQ var4 = field718.method521();
			var4.method589();
			var4.method278();

			if (field714 == var4) {
				JJFDBATQ var5 = field718.method521();
				var5.method589();
				var5.method278();
			}
		} else {
			field716--;
		}

		field717.method415(arg1, arg0);
		field718.method520(arg0);
	}

	@ObfuscatedName("GOHJFVWE.a()V")
	public void method229() {
		while (true) {
			JJFDBATQ var1 = field718.method521();
			if (var1 == null) {
				field716 = field715;
				return;
			}

			var1.method589();
			var1.method278();
		}
	}
}
