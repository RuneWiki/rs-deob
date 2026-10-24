package deob;

@ObfuscatedName("ELLPUVEP")
public final class ELLPUVEP {

	@ObfuscatedName("ELLPUVEP.b")
	public ICYNFRTV field559 = new ICYNFRTV();

	@ObfuscatedName("ELLPUVEP.c")
	public ICYNFRTV field560;

	public ELLPUVEP() {
		field559.field711 = field559;
		field559.field712 = field559;
	}

	@ObfuscatedName("ELLPUVEP.a(LICYNFRTV;)V")
	public void method280(ICYNFRTV arg0) {
		if (arg0.field712 != null) {
			arg0.method320();
		}

		arg0.field712 = field559.field712;
		arg0.field711 = field559;
		arg0.field712.field711 = arg0;
		arg0.field711.field712 = arg0;
	}

	@ObfuscatedName("ELLPUVEP.a()LICYNFRTV;")
	public ICYNFRTV method281() {
		ICYNFRTV var1 = field559.field711;
		if (field559 == var1) {
			return null;
		} else {
			var1.method320();
			return var1;
		}
	}

	@ObfuscatedName("ELLPUVEP.b()LICYNFRTV;")
	public ICYNFRTV method282() {
		ICYNFRTV var1 = field559.field711;
		if (field559 == var1) {
			field560 = null;
			return null;
		} else {
			field560 = var1.field711;
			return var1;
		}
	}

	@ObfuscatedName("ELLPUVEP.a(Z)LICYNFRTV;")
	public ICYNFRTV method283() {
		ICYNFRTV var1 = field560;
		if (field559 == var1) {
			field560 = null;
			return null;
		} else {
			field560 = var1.field711;
			return var1;
		}
	}

	@ObfuscatedName("ELLPUVEP.c()I")
	public int method284() {
		int var1 = 0;
		for (ICYNFRTV var2 = field559.field711; var2 != field559; var2 = var2.field711) {
			var1++;
		}

		return var1;
	}
}
