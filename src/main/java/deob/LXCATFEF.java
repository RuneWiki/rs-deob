package deob;

@ObfuscatedName("LXCATFEF")
public final class LXCATFEF {

	@ObfuscatedName("LXCATFEF.c")
	public KGLULAMW field1069 = new KGLULAMW();

	@ObfuscatedName("LXCATFEF.d")
	public KGLULAMW field1070;

	public LXCATFEF() {
		field1069.field999 = field1069;
		field1069.field1000 = field1069;
	}

	@ObfuscatedName("LXCATFEF.a(LKGLULAMW;)V")
	public void method408(KGLULAMW arg0) {
		if (arg0.field1000 != null) {
			arg0.method373();
		}

		arg0.field1000 = field1069.field1000;
		arg0.field999 = field1069;
		arg0.field1000.field999 = arg0;
		arg0.field999.field1000 = arg0;
	}

	@ObfuscatedName("LXCATFEF.a()LKGLULAMW;")
	public KGLULAMW method409() {
		KGLULAMW var1 = field1069.field999;
		if (field1069 == var1) {
			return null;
		} else {
			var1.method373();
			return var1;
		}
	}

	@ObfuscatedName("LXCATFEF.b()LKGLULAMW;")
	public KGLULAMW method410() {
		KGLULAMW var1 = field1069.field999;
		if (field1069 == var1) {
			field1070 = null;
			return null;
		} else {
			field1070 = var1.field999;
			return var1;
		}
	}

	@ObfuscatedName("LXCATFEF.a(I)LKGLULAMW;")
	public KGLULAMW method411() {
		KGLULAMW var1 = field1070;
		if (field1069 == var1) {
			field1070 = null;
			return null;
		} else {
			field1070 = var1.field999;
			return var1;
		}
	}

	@ObfuscatedName("LXCATFEF.c()I")
	public int method412() {
		int var1 = 0;
		for (KGLULAMW var2 = field1069.field999; var2 != field1069; var2 = var2.field999) {
			var1++;
		}

		return var1;
	}
}
