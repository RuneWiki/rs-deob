package deob;

@ObfuscatedName("AAITTAMV")
public final class AAITTAMV {

	@ObfuscatedName("AAITTAMV.e")
	public EDVKOEOK field1 = new EDVKOEOK();

	@ObfuscatedName("AAITTAMV.f")
	public EDVKOEOK field2;

	public AAITTAMV() {
		field1.field495 = field1;
		field1.field496 = field1;
	}

	@ObfuscatedName("AAITTAMV.a(LEDVKOEOK;)V")
	public void method1(EDVKOEOK arg0) {
		if (arg0.field496 != null) {
			arg0.method188();
		}

		arg0.field496 = field1.field496;
		arg0.field495 = field1;
		arg0.field496.field495 = arg0;
		arg0.field495.field496 = arg0;
	}

	@ObfuscatedName("AAITTAMV.a()LEDVKOEOK;")
	public EDVKOEOK method2() {
		EDVKOEOK var1 = field1.field495;
		if (field1 == var1) {
			return null;
		} else {
			var1.method188();
			return var1;
		}
	}

	@ObfuscatedName("AAITTAMV.b()LEDVKOEOK;")
	public EDVKOEOK method3() {
		EDVKOEOK var1 = field1.field495;
		if (field1 == var1) {
			field2 = null;
			return null;
		} else {
			field2 = var1.field495;
			return var1;
		}
	}

	@ObfuscatedName("AAITTAMV.a(Z)LEDVKOEOK;")
	public EDVKOEOK method4() {
		EDVKOEOK var1 = field2;
		if (field1 == var1) {
			field2 = null;
			return null;
		} else {
			field2 = var1.field495;
			return var1;
		}
	}

	@ObfuscatedName("AAITTAMV.c()I")
	public int method5() {
		int var1 = 0;
		for (EDVKOEOK var2 = field1.field495; var2 != field1; var2 = var2.field495) {
			var1++;
		}

		return var1;
	}
}
