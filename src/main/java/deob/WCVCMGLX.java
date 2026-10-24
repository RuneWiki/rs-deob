package deob;

@ObfuscatedName("WCVCMGLX")
public final class WCVCMGLX {

	@ObfuscatedName("WCVCMGLX.f")
	public ABHGPSRU field1324 = new ABHGPSRU();

	@ObfuscatedName("WCVCMGLX.g")
	public ABHGPSRU field1325;

	public WCVCMGLX() {
		field1324.field2 = field1324;
		field1324.field3 = field1324;
	}

	@ObfuscatedName("WCVCMGLX.a(LABHGPSRU;)V")
	public void method564(ABHGPSRU arg0) {
		if (arg0.field3 != null) {
			arg0.method1();
		}

		arg0.field3 = field1324.field3;
		arg0.field2 = field1324;
		arg0.field3.field2 = arg0;
		arg0.field2.field3 = arg0;
	}

	@ObfuscatedName("WCVCMGLX.a(LABHGPSRU;I)V")
	public void method565(ABHGPSRU arg0) {
		if (arg0.field3 != null) {
			arg0.method1();
		}

		arg0.field3 = field1324;
		arg0.field2 = field1324.field2;
		arg0.field3.field2 = arg0;
		arg0.field2.field3 = arg0;
	}

	@ObfuscatedName("WCVCMGLX.a()LABHGPSRU;")
	public ABHGPSRU method566() {
		ABHGPSRU var1 = field1324.field2;
		if (field1324 == var1) {
			return null;
		} else {
			var1.method1();
			return var1;
		}
	}

	@ObfuscatedName("WCVCMGLX.b()LABHGPSRU;")
	public ABHGPSRU method567() {
		ABHGPSRU var1 = field1324.field2;
		if (field1324 == var1) {
			field1325 = null;
			return null;
		} else {
			field1325 = var1.field2;
			return var1;
		}
	}

	@ObfuscatedName("WCVCMGLX.a(B)LABHGPSRU;")
	public ABHGPSRU method568() {
		ABHGPSRU var1 = field1324.field3;
		if (field1324 == var1) {
			field1325 = null;
			return null;
		} else {
			field1325 = var1.field3;
			return var1;
		}
	}

	@ObfuscatedName("WCVCMGLX.a(Z)LABHGPSRU;")
	public ABHGPSRU method569() {
		ABHGPSRU var1 = field1325;
		if (field1324 == var1) {
			field1325 = null;
			return null;
		} else {
			field1325 = var1.field2;
			return var1;
		}
	}

	@ObfuscatedName("WCVCMGLX.a(I)LABHGPSRU;")
	public ABHGPSRU method570() {
		ABHGPSRU var1 = field1325;
		if (field1324 == var1) {
			field1325 = null;
			return null;
		} else {
			field1325 = var1.field3;
			return var1;
		}
	}

	@ObfuscatedName("WCVCMGLX.c()V")
	public void method571() {
		if (field1324.field2 != field1324) {
			while (true) {
				ABHGPSRU var1 = field1324.field2;
				if (field1324 == var1) {
					return;
				}

				var1.method1();
			}
		}
	}
}
