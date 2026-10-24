package deob;

@ObfuscatedName("XWKFKQRL")
public final class XWKFKQRL {

	@ObfuscatedName("XWKFKQRL.e")
	public JJFDBATQ field1330 = new JJFDBATQ();

	@ObfuscatedName("XWKFKQRL.f")
	public JJFDBATQ field1331;

	public XWKFKQRL() {
		field1330.field822 = field1330;
		field1330.field823 = field1330;
	}

	@ObfuscatedName("XWKFKQRL.a(LJJFDBATQ;)V")
	public void method520(JJFDBATQ arg0) {
		if (arg0.field823 != null) {
			arg0.method278();
		}

		arg0.field823 = field1330.field823;
		arg0.field822 = field1330;
		arg0.field823.field822 = arg0;
		arg0.field822.field823 = arg0;
	}

	@ObfuscatedName("XWKFKQRL.a()LJJFDBATQ;")
	public JJFDBATQ method521() {
		JJFDBATQ var1 = field1330.field822;
		if (field1330 == var1) {
			return null;
		} else {
			var1.method278();
			return var1;
		}
	}

	@ObfuscatedName("XWKFKQRL.b()LJJFDBATQ;")
	public JJFDBATQ method522() {
		JJFDBATQ var1 = field1330.field822;
		if (field1330 == var1) {
			field1331 = null;
			return null;
		} else {
			field1331 = var1.field822;
			return var1;
		}
	}

	@ObfuscatedName("XWKFKQRL.a(Z)LJJFDBATQ;")
	public JJFDBATQ method523() {
		JJFDBATQ var1 = field1331;
		if (field1330 == var1) {
			field1331 = null;
			return null;
		} else {
			field1331 = var1.field822;
			return var1;
		}
	}

	@ObfuscatedName("XWKFKQRL.c()I")
	public int method524() {
		int var1 = 0;
		for (JJFDBATQ var2 = field1330.field822; var2 != field1330; var2 = var2.field822) {
			var1++;
		}

		return var1;
	}
}
