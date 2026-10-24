package deob;

@ObfuscatedName("PUBJBHOK")
public final class PUBJBHOK {

	@ObfuscatedName("PUBJBHOK.c")
	public TSSAWEFF field855 = new TSSAWEFF();

	@ObfuscatedName("PUBJBHOK.d")
	public TSSAWEFF field856;

	public PUBJBHOK() {
		field855.field1137 = field855;
		field855.field1138 = field855;
	}

	@ObfuscatedName("PUBJBHOK.a(LTSSAWEFF;)V")
	public void method373(TSSAWEFF arg0) {
		if (arg0.field1138 != null) {
			arg0.method492();
		}

		arg0.field1138 = field855.field1138;
		arg0.field1137 = field855;
		arg0.field1138.field1137 = arg0;
		arg0.field1137.field1138 = arg0;
	}

	@ObfuscatedName("PUBJBHOK.a(ILTSSAWEFF;)V")
	public void method374(TSSAWEFF arg0) {
		if (arg0.field1138 != null) {
			arg0.method492();
		}

		arg0.field1138 = field855;
		arg0.field1137 = field855.field1137;
		arg0.field1138.field1137 = arg0;
		arg0.field1137.field1138 = arg0;
	}

	@ObfuscatedName("PUBJBHOK.a()LTSSAWEFF;")
	public TSSAWEFF method375() {
		TSSAWEFF var1 = field855.field1137;
		if (field855 == var1) {
			return null;
		} else {
			var1.method492();
			return var1;
		}
	}

	@ObfuscatedName("PUBJBHOK.b()LTSSAWEFF;")
	public TSSAWEFF method376() {
		TSSAWEFF var1 = field855.field1137;
		if (field855 == var1) {
			field856 = null;
			return null;
		} else {
			field856 = var1.field1137;
			return var1;
		}
	}

	@ObfuscatedName("PUBJBHOK.a(B)LTSSAWEFF;")
	public TSSAWEFF method377() {
		TSSAWEFF var1 = field855.field1138;
		if (field855 == var1) {
			field856 = null;
			return null;
		} else {
			field856 = var1.field1138;
			return var1;
		}
	}

	@ObfuscatedName("PUBJBHOK.a(I)LTSSAWEFF;")
	public TSSAWEFF method378() {
		TSSAWEFF var1 = field856;
		if (field855 == var1) {
			field856 = null;
			return null;
		} else {
			field856 = var1.field1137;
			return var1;
		}
	}

	@ObfuscatedName("PUBJBHOK.b(I)LTSSAWEFF;")
	public TSSAWEFF method379() {
		TSSAWEFF var1 = field856;
		if (field855 == var1) {
			field856 = null;
			return null;
		} else {
			field856 = var1.field1138;
			return var1;
		}
	}

	@ObfuscatedName("PUBJBHOK.c()V")
	public void method380() {
		if (field855.field1137 != field855) {
			while (true) {
				TSSAWEFF var1 = field855.field1137;
				if (field855 == var1) {
					return;
				}

				var1.method492();
			}
		}
	}
}
