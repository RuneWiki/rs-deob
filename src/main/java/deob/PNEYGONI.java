package deob;

@ObfuscatedName("PNEYGONI")
public final class PNEYGONI {

	@ObfuscatedName("PNEYGONI.c")
	public OGGHOMII field1126 = new OGGHOMII();

	@ObfuscatedName("PNEYGONI.d")
	public OGGHOMII field1127;

	public PNEYGONI() {
		field1126.field1016 = field1126;
		field1126.field1017 = field1126;
	}

	@ObfuscatedName("PNEYGONI.a(LOGGHOMII;)V")
	public void method438(OGGHOMII arg0) {
		if (arg0.field1017 != null) {
			arg0.method384();
		}

		arg0.field1017 = field1126.field1017;
		arg0.field1016 = field1126;
		arg0.field1017.field1016 = arg0;
		arg0.field1016.field1017 = arg0;
	}

	@ObfuscatedName("PNEYGONI.a()LOGGHOMII;")
	public OGGHOMII method439() {
		OGGHOMII var1 = field1126.field1016;
		if (field1126 == var1) {
			return null;
		} else {
			var1.method384();
			return var1;
		}
	}

	@ObfuscatedName("PNEYGONI.b()LOGGHOMII;")
	public OGGHOMII method440() {
		OGGHOMII var1 = field1126.field1016;
		if (field1126 == var1) {
			field1127 = null;
			return null;
		} else {
			field1127 = var1.field1016;
			return var1;
		}
	}

	@ObfuscatedName("PNEYGONI.a(I)LOGGHOMII;")
	public OGGHOMII method441() {
		OGGHOMII var1 = field1127;
		if (field1126 == var1) {
			field1127 = null;
			return null;
		} else {
			field1127 = var1.field1016;
			return var1;
		}
	}

	@ObfuscatedName("PNEYGONI.c()I")
	public int method442() {
		int var1 = 0;
		for (OGGHOMII var2 = field1126.field1016; var2 != field1126; var2 = var2.field1016) {
			var1++;
		}

		return var1;
	}
}
