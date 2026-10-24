package deob;

@ObfuscatedName("JQOEJEDB")
public final class JQOEJEDB {

	@ObfuscatedName("JQOEJEDB.e")
	public AIZKCREI field881 = new AIZKCREI();

	@ObfuscatedName("JQOEJEDB.f")
	public AIZKCREI field882;

	public JQOEJEDB() {
		field881.field2 = field881;
		field881.field3 = field881;
	}

	@ObfuscatedName("JQOEJEDB.a(LAIZKCREI;)V")
	public void method326(AIZKCREI arg0) {
		if (arg0.field3 != null) {
			arg0.method1();
		}

		arg0.field3 = field881.field3;
		arg0.field2 = field881;
		arg0.field3.field2 = arg0;
		arg0.field2.field3 = arg0;
	}

	@ObfuscatedName("JQOEJEDB.a(ILAIZKCREI;)V")
	public void method327(AIZKCREI arg0) {
		if (arg0.field3 != null) {
			arg0.method1();
		}

		arg0.field3 = field881;
		arg0.field2 = field881.field2;
		arg0.field3.field2 = arg0;
		arg0.field2.field3 = arg0;
	}

	@ObfuscatedName("JQOEJEDB.a()LAIZKCREI;")
	public AIZKCREI method328() {
		AIZKCREI var1 = field881.field2;
		if (field881 == var1) {
			return null;
		} else {
			var1.method1();
			return var1;
		}
	}

	@ObfuscatedName("JQOEJEDB.b()LAIZKCREI;")
	public AIZKCREI method329() {
		AIZKCREI var1 = field881.field2;
		if (field881 == var1) {
			field882 = null;
			return null;
		} else {
			field882 = var1.field2;
			return var1;
		}
	}

	@ObfuscatedName("JQOEJEDB.a(I)LAIZKCREI;")
	public AIZKCREI method330() {
		AIZKCREI var1 = field881.field3;
		if (field881 == var1) {
			field882 = null;
			return null;
		} else {
			field882 = var1.field3;
			return var1;
		}
	}

	@ObfuscatedName("JQOEJEDB.b(I)LAIZKCREI;")
	public AIZKCREI method331() {
		AIZKCREI var1 = field882;
		if (field881 == var1) {
			field882 = null;
			return null;
		} else {
			field882 = var1.field2;
			return var1;
		}
	}

	@ObfuscatedName("JQOEJEDB.a(Z)LAIZKCREI;")
	public AIZKCREI method332() {
		AIZKCREI var1 = field882;
		if (field881 == var1) {
			field882 = null;
			return null;
		} else {
			field882 = var1.field3;
			return var1;
		}
	}

	@ObfuscatedName("JQOEJEDB.c()V")
	public void method333() {
		if (field881.field2 != field881) {
			while (true) {
				AIZKCREI var1 = field881.field2;
				if (field881 == var1) {
					return;
				}

				var1.method1();
			}
		}
	}
}
