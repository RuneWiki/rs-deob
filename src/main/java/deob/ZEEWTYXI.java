package deob;

@ObfuscatedName("ZEEWTYXI")
public final class ZEEWTYXI {

	@ObfuscatedName("ZEEWTYXI.f")
	public ZMCAQRHG field1482 = new ZMCAQRHG();

	@ObfuscatedName("ZEEWTYXI.g")
	public ZMCAQRHG field1483;

	public ZEEWTYXI() {
		field1482.field1508 = field1482;
		field1482.field1509 = field1482;
	}

	@ObfuscatedName("ZEEWTYXI.a(LZMCAQRHG;)V")
	public void method577(ZMCAQRHG arg0) {
		if (arg0.field1509 != null) {
			arg0.method602();
		}

		arg0.field1509 = field1482.field1509;
		arg0.field1508 = field1482;
		arg0.field1509.field1508 = arg0;
		arg0.field1508.field1509 = arg0;
	}

	@ObfuscatedName("ZEEWTYXI.a(LZMCAQRHG;I)V")
	public void method578(ZMCAQRHG arg0) {
		if (arg0.field1509 != null) {
			arg0.method602();
		}

		arg0.field1509 = field1482;
		arg0.field1508 = field1482.field1508;
		arg0.field1509.field1508 = arg0;
		arg0.field1508.field1509 = arg0;
	}

	@ObfuscatedName("ZEEWTYXI.a()LZMCAQRHG;")
	public ZMCAQRHG method579() {
		ZMCAQRHG var1 = field1482.field1508;
		if (field1482 == var1) {
			return null;
		} else {
			var1.method602();
			return var1;
		}
	}

	@ObfuscatedName("ZEEWTYXI.b()LZMCAQRHG;")
	public ZMCAQRHG method580() {
		ZMCAQRHG var1 = field1482.field1508;
		if (field1482 == var1) {
			field1483 = null;
			return null;
		} else {
			field1483 = var1.field1508;
			return var1;
		}
	}

	@ObfuscatedName("ZEEWTYXI.a(Z)LZMCAQRHG;")
	public ZMCAQRHG method581() {
		ZMCAQRHG var1 = field1482.field1509;
		if (field1482 == var1) {
			field1483 = null;
			return null;
		} else {
			field1483 = var1.field1509;
			return var1;
		}
	}

	@ObfuscatedName("ZEEWTYXI.a(B)LZMCAQRHG;")
	public ZMCAQRHG method582() {
		ZMCAQRHG var1 = field1483;
		if (field1482 == var1) {
			field1483 = null;
			return null;
		} else {
			field1483 = var1.field1508;
			return var1;
		}
	}

	@ObfuscatedName("ZEEWTYXI.a(I)LZMCAQRHG;")
	public ZMCAQRHG method583() {
		ZMCAQRHG var1 = field1483;
		if (field1482 == var1) {
			field1483 = null;
			return null;
		} else {
			field1483 = var1.field1509;
			return var1;
		}
	}

	@ObfuscatedName("ZEEWTYXI.c()V")
	public void method584() {
		if (field1482.field1508 != field1482) {
			while (true) {
				ZMCAQRHG var1 = field1482.field1508;
				if (field1482 == var1) {
					return;
				}

				var1.method602();
			}
		}
	}
}
