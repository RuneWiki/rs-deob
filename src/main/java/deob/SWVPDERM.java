package deob;

@ObfuscatedName("SWVPDERM")
public final class SWVPDERM {

	@ObfuscatedName("SWVPDERM.d")
	public OEHUIBBM field1230 = new OEHUIBBM();

	@ObfuscatedName("SWVPDERM.e")
	public OEHUIBBM field1231;

	public SWVPDERM() {
		field1230.field917 = field1230;
		field1230.field918 = field1230;
	}

	@ObfuscatedName("SWVPDERM.a(LOEHUIBBM;)V")
	public void method479(OEHUIBBM arg0) {
		if (arg0.field918 != null) {
			arg0.method397();
		}

		arg0.field918 = field1230.field918;
		arg0.field917 = field1230;
		arg0.field918.field917 = arg0;
		arg0.field917.field918 = arg0;
	}

	@ObfuscatedName("SWVPDERM.a(BLOEHUIBBM;)V")
	public void method480(OEHUIBBM arg0) {
		if (arg0.field918 != null) {
			arg0.method397();
		}

		arg0.field918 = field1230;
		arg0.field917 = field1230.field917;
		arg0.field918.field917 = arg0;
		arg0.field917.field918 = arg0;
	}

	@ObfuscatedName("SWVPDERM.a()LOEHUIBBM;")
	public OEHUIBBM method481() {
		OEHUIBBM var1 = field1230.field917;
		if (field1230 == var1) {
			return null;
		} else {
			var1.method397();
			return var1;
		}
	}

	@ObfuscatedName("SWVPDERM.b()LOEHUIBBM;")
	public OEHUIBBM method482() {
		OEHUIBBM var1 = field1230.field917;
		if (field1230 == var1) {
			field1231 = null;
			return null;
		} else {
			field1231 = var1.field917;
			return var1;
		}
	}

	@ObfuscatedName("SWVPDERM.a(B)LOEHUIBBM;")
	public OEHUIBBM method483() {
		OEHUIBBM var1 = field1230.field918;
		if (field1230 == var1) {
			field1231 = null;
			return null;
		} else {
			field1231 = var1.field918;
			return var1;
		}
	}

	@ObfuscatedName("SWVPDERM.a(I)LOEHUIBBM;")
	public OEHUIBBM method484() {
		OEHUIBBM var1 = field1231;
		if (field1230 == var1) {
			field1231 = null;
			return null;
		} else {
			field1231 = var1.field917;
			return var1;
		}
	}

	@ObfuscatedName("SWVPDERM.b(I)LOEHUIBBM;")
	public OEHUIBBM method485() {
		OEHUIBBM var1 = field1231;
		if (field1230 == var1) {
			field1231 = null;
			return null;
		} else {
			field1231 = var1.field918;
			return var1;
		}
	}

	@ObfuscatedName("SWVPDERM.c()V")
	public void method486() {
		if (field1230.field917 != field1230) {
			while (true) {
				OEHUIBBM var1 = field1230.field917;
				if (field1230 == var1) {
					return;
				}

				var1.method397();
			}
		}
	}
}
