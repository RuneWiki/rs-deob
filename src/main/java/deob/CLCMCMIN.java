package deob;

@ObfuscatedName("CLCMCMIN")
public final class CLCMCMIN {

	@ObfuscatedName("CLCMCMIN.d")
	public XNCSKJMM field56 = new XNCSKJMM();

	@ObfuscatedName("CLCMCMIN.e")
	public XNCSKJMM field57;

	public CLCMCMIN() {
		field56.field1430 = field56;
		field56.field1431 = field56;
	}

	@ObfuscatedName("CLCMCMIN.a(LXNCSKJMM;)V")
	public void method68(XNCSKJMM arg0) {
		if (arg0.field1431 != null) {
			arg0.method582();
		}

		arg0.field1431 = field56.field1431;
		arg0.field1430 = field56;
		arg0.field1431.field1430 = arg0;
		arg0.field1430.field1431 = arg0;
	}

	@ObfuscatedName("CLCMCMIN.a(ILXNCSKJMM;)V")
	public void method69(XNCSKJMM arg0) {
		if (arg0.field1431 != null) {
			arg0.method582();
		}

		arg0.field1431 = field56;
		arg0.field1430 = field56.field1430;
		arg0.field1431.field1430 = arg0;
		arg0.field1430.field1431 = arg0;
	}

	@ObfuscatedName("CLCMCMIN.a()LXNCSKJMM;")
	public XNCSKJMM method70() {
		XNCSKJMM var1 = field56.field1430;
		if (field56 == var1) {
			return null;
		} else {
			var1.method582();
			return var1;
		}
	}

	@ObfuscatedName("CLCMCMIN.b()LXNCSKJMM;")
	public XNCSKJMM method71() {
		XNCSKJMM var1 = field56.field1430;
		if (field56 == var1) {
			field57 = null;
			return null;
		} else {
			field57 = var1.field1430;
			return var1;
		}
	}

	@ObfuscatedName("CLCMCMIN.a(B)LXNCSKJMM;")
	public XNCSKJMM method72() {
		XNCSKJMM var1 = field56.field1431;
		if (field56 == var1) {
			field57 = null;
			return null;
		} else {
			field57 = var1.field1431;
			return var1;
		}
	}

	@ObfuscatedName("CLCMCMIN.a(I)LXNCSKJMM;")
	public XNCSKJMM method73() {
		XNCSKJMM var1 = field57;
		if (field56 == var1) {
			field57 = null;
			return null;
		} else {
			field57 = var1.field1430;
			return var1;
		}
	}

	@ObfuscatedName("CLCMCMIN.b(I)LXNCSKJMM;")
	public XNCSKJMM method74() {
		XNCSKJMM var1 = field57;
		if (field56 == var1) {
			field57 = null;
			return null;
		} else {
			field57 = var1.field1431;
			return var1;
		}
	}

	@ObfuscatedName("CLCMCMIN.c()V")
	public void method75() {
		if (field56.field1430 != field56) {
			while (true) {
				XNCSKJMM var1 = field56.field1430;
				if (field56 == var1) {
					return;
				}

				var1.method582();
			}
		}
	}
}
