package deob;

@ObfuscatedName("WUVIEXOA")
public final class WUVIEXOA {

	@ObfuscatedName("WUVIEXOA.c")
	public OGKECTLC field1464 = new OGKECTLC();

	@ObfuscatedName("WUVIEXOA.d")
	public OGKECTLC field1465;

	public WUVIEXOA() {
		field1464.field1077 = field1464;
		field1464.field1078 = field1464;
	}

	@ObfuscatedName("WUVIEXOA.a(LOGKECTLC;)V")
	public void method582(OGKECTLC arg0) {
		if (arg0.field1078 != null) {
			arg0.method450();
		}

		arg0.field1078 = field1464.field1078;
		arg0.field1077 = field1464;
		arg0.field1078.field1077 = arg0;
		arg0.field1077.field1078 = arg0;
	}

	@ObfuscatedName("WUVIEXOA.a(BLOGKECTLC;)V")
	public void method583(OGKECTLC arg0) {
		if (arg0.field1078 != null) {
			arg0.method450();
		}

		arg0.field1078 = field1464;
		arg0.field1077 = field1464.field1077;
		arg0.field1078.field1077 = arg0;
		arg0.field1077.field1078 = arg0;
	}

	@ObfuscatedName("WUVIEXOA.a()LOGKECTLC;")
	public OGKECTLC method584() {
		OGKECTLC var1 = field1464.field1077;
		if (field1464 == var1) {
			return null;
		} else {
			var1.method450();
			return var1;
		}
	}

	@ObfuscatedName("WUVIEXOA.b()LOGKECTLC;")
	public OGKECTLC method585() {
		OGKECTLC var1 = field1464.field1077;
		if (field1464 == var1) {
			field1465 = null;
			return null;
		} else {
			field1465 = var1.field1077;
			return var1;
		}
	}

	@ObfuscatedName("WUVIEXOA.a(B)LOGKECTLC;")
	public OGKECTLC method586() {
		OGKECTLC var1 = field1464.field1078;
		if (field1464 == var1) {
			field1465 = null;
			return null;
		} else {
			field1465 = var1.field1078;
			return var1;
		}
	}

	@ObfuscatedName("WUVIEXOA.a(I)LOGKECTLC;")
	public OGKECTLC method587() {
		OGKECTLC var1 = field1465;
		if (field1464 == var1) {
			field1465 = null;
			return null;
		} else {
			field1465 = var1.field1077;
			return var1;
		}
	}

	@ObfuscatedName("WUVIEXOA.b(I)LOGKECTLC;")
	public OGKECTLC method588() {
		OGKECTLC var1 = field1465;
		if (field1464 == var1) {
			field1465 = null;
			return null;
		} else {
			field1465 = var1.field1078;
			return var1;
		}
	}

	@ObfuscatedName("WUVIEXOA.c()V")
	public void method589() {
		if (field1464.field1077 != field1464) {
			while (true) {
				OGKECTLC var1 = field1464.field1077;
				if (field1464 == var1) {
					return;
				}

				var1.method450();
			}
		}
	}
}
