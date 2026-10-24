package deob;

@ObfuscatedName("WAPMJSJO")
public final class WAPMJSJO {

	@ObfuscatedName("WAPMJSJO.f")
	public LTTSKENL field1364 = new LTTSKENL();

	@ObfuscatedName("WAPMJSJO.g")
	public LTTSKENL field1365;

	public WAPMJSJO() {
		field1364.field829 = field1364;
		field1364.field830 = field1364;
	}

	@ObfuscatedName("WAPMJSJO.a(LLTTSKENL;)V")
	public void method482(LTTSKENL arg0) {
		if (arg0.field830 != null) {
			arg0.method327();
		}

		arg0.field830 = field1364.field830;
		arg0.field829 = field1364;
		arg0.field830.field829 = arg0;
		arg0.field829.field830 = arg0;
	}

	@ObfuscatedName("WAPMJSJO.a(LLTTSKENL;Z)V")
	public void method483(LTTSKENL arg0) {
		if (arg0.field830 != null) {
			arg0.method327();
		}

		arg0.field830 = field1364;
		arg0.field829 = field1364.field829;
		arg0.field830.field829 = arg0;
		arg0.field829.field830 = arg0;
	}

	@ObfuscatedName("WAPMJSJO.a()LLTTSKENL;")
	public LTTSKENL method484() {
		LTTSKENL var1 = field1364.field829;
		if (field1364 == var1) {
			return null;
		} else {
			var1.method327();
			return var1;
		}
	}

	@ObfuscatedName("WAPMJSJO.b()LLTTSKENL;")
	public LTTSKENL method485() {
		LTTSKENL var1 = field1364.field829;
		if (field1364 == var1) {
			field1365 = null;
			return null;
		} else {
			field1365 = var1.field829;
			return var1;
		}
	}

	@ObfuscatedName("WAPMJSJO.a(I)LLTTSKENL;")
	public LTTSKENL method486() {
		LTTSKENL var1 = field1364.field830;
		if (field1364 == var1) {
			field1365 = null;
			return null;
		} else {
			field1365 = var1.field830;
			return var1;
		}
	}

	@ObfuscatedName("WAPMJSJO.b(I)LLTTSKENL;")
	public LTTSKENL method487() {
		LTTSKENL var1 = field1365;
		if (field1364 == var1) {
			field1365 = null;
			return null;
		} else {
			field1365 = var1.field829;
			return var1;
		}
	}

	@ObfuscatedName("WAPMJSJO.c(I)LLTTSKENL;")
	public LTTSKENL method488() {
		LTTSKENL var1 = field1365;
		if (field1364 == var1) {
			field1365 = null;
			return null;
		} else {
			field1365 = var1.field830;
			return var1;
		}
	}

	@ObfuscatedName("WAPMJSJO.c()V")
	public void method489() {
		if (field1364.field829 != field1364) {
			while (true) {
				LTTSKENL var1 = field1364.field829;
				if (field1364 == var1) {
					return;
				}

				var1.method327();
			}
		}
	}
}
