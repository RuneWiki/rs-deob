package deob;

@ObfuscatedName("JSAXNSIH")
public final class JSAXNSIH {

	@ObfuscatedName("JSAXNSIH.c")
	public VHAERWBS field1044 = new VHAERWBS();

	@ObfuscatedName("JSAXNSIH.d")
	public VHAERWBS field1045;

	public JSAXNSIH() {
		field1044.field1432 = field1044;
		field1044.field1433 = field1044;
	}

	@ObfuscatedName("JSAXNSIH.a(LVHAERWBS;)V")
	public void method399(VHAERWBS arg0) {
		if (arg0.field1433 != null) {
			arg0.method579();
		}

		arg0.field1433 = field1044.field1433;
		arg0.field1432 = field1044;
		arg0.field1433.field1432 = arg0;
		arg0.field1432.field1433 = arg0;
	}

	@ObfuscatedName("JSAXNSIH.a(ILVHAERWBS;)V")
	public void method400(VHAERWBS arg0) {
		if (arg0.field1433 != null) {
			arg0.method579();
		}

		arg0.field1433 = field1044;
		arg0.field1432 = field1044.field1432;
		arg0.field1433.field1432 = arg0;
		arg0.field1432.field1433 = arg0;
	}

	@ObfuscatedName("JSAXNSIH.a()LVHAERWBS;")
	public VHAERWBS method401() {
		VHAERWBS var1 = field1044.field1432;
		if (field1044 == var1) {
			return null;
		} else {
			var1.method579();
			return var1;
		}
	}

	@ObfuscatedName("JSAXNSIH.b()LVHAERWBS;")
	public VHAERWBS method402() {
		VHAERWBS var1 = field1044.field1432;
		if (field1044 == var1) {
			field1045 = null;
			return null;
		} else {
			field1045 = var1.field1432;
			return var1;
		}
	}

	@ObfuscatedName("JSAXNSIH.a(B)LVHAERWBS;")
	public VHAERWBS method403() {
		VHAERWBS var1 = field1044.field1433;
		if (field1044 == var1) {
			field1045 = null;
			return null;
		} else {
			field1045 = var1.field1433;
			return var1;
		}
	}

	@ObfuscatedName("JSAXNSIH.b(B)LVHAERWBS;")
	public VHAERWBS method404() {
		VHAERWBS var1 = field1045;
		if (field1044 == var1) {
			field1045 = null;
			return null;
		} else {
			field1045 = var1.field1432;
			return var1;
		}
	}

	@ObfuscatedName("JSAXNSIH.c(B)LVHAERWBS;")
	public VHAERWBS method405() {
		VHAERWBS var1 = field1045;
		if (field1044 == var1) {
			field1045 = null;
			return null;
		} else {
			field1045 = var1.field1433;
			return var1;
		}
	}

	@ObfuscatedName("JSAXNSIH.c()V")
	public void method406() {
		if (field1044.field1432 != field1044) {
			while (true) {
				VHAERWBS var1 = field1044.field1432;
				if (field1044 == var1) {
					return;
				}

				var1.method579();
			}
		}
	}
}
