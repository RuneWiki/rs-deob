package deob;

@ObfuscatedName("ZCVCEQHJ")
public final class ZCVCEQHJ {

	@ObfuscatedName("ZCVCEQHJ.e")
	public AJSSLSFA field1478 = new AJSSLSFA();

	@ObfuscatedName("ZCVCEQHJ.f")
	public AJSSLSFA field1479;

	public ZCVCEQHJ() {
		field1478.field11 = field1478;
		field1478.field12 = field1478;
	}

	@ObfuscatedName("ZCVCEQHJ.a(LAJSSLSFA;)V")
	public void method589(AJSSLSFA arg0) {
		if (arg0.field12 != null) {
			arg0.method1();
		}

		arg0.field12 = field1478.field12;
		arg0.field11 = field1478;
		arg0.field12.field11 = arg0;
		arg0.field11.field12 = arg0;
	}

	@ObfuscatedName("ZCVCEQHJ.a(LAJSSLSFA;I)V")
	public void method590(AJSSLSFA arg0) {
		if (arg0.field12 != null) {
			arg0.method1();
		}

		arg0.field12 = field1478;
		arg0.field11 = field1478.field11;
		arg0.field12.field11 = arg0;
		arg0.field11.field12 = arg0;
	}

	@ObfuscatedName("ZCVCEQHJ.a()LAJSSLSFA;")
	public AJSSLSFA method591() {
		AJSSLSFA var1 = field1478.field11;
		if (field1478 == var1) {
			return null;
		} else {
			var1.method1();
			return var1;
		}
	}

	@ObfuscatedName("ZCVCEQHJ.b()LAJSSLSFA;")
	public AJSSLSFA method592() {
		AJSSLSFA var1 = field1478.field11;
		if (field1478 == var1) {
			field1479 = null;
			return null;
		} else {
			field1479 = var1.field11;
			return var1;
		}
	}

	@ObfuscatedName("ZCVCEQHJ.a(Z)LAJSSLSFA;")
	public AJSSLSFA method593() {
		AJSSLSFA var1 = field1478.field12;
		if (field1478 == var1) {
			field1479 = null;
			return null;
		} else {
			field1479 = var1.field12;
			return var1;
		}
	}

	@ObfuscatedName("ZCVCEQHJ.a(I)LAJSSLSFA;")
	public AJSSLSFA method594() {
		AJSSLSFA var1 = field1479;
		if (field1478 == var1) {
			field1479 = null;
			return null;
		} else {
			field1479 = var1.field11;
			return var1;
		}
	}

	@ObfuscatedName("ZCVCEQHJ.b(Z)LAJSSLSFA;")
	public AJSSLSFA method595() {
		AJSSLSFA var1 = field1479;
		if (field1478 == var1) {
			field1479 = null;
			return null;
		} else {
			field1479 = var1.field12;
			return var1;
		}
	}

	@ObfuscatedName("ZCVCEQHJ.c()V")
	public void method596() {
		if (field1478.field11 != field1478) {
			while (true) {
				AJSSLSFA var1 = field1478.field11;
				if (field1478 == var1) {
					return;
				}

				var1.method1();
			}
		}
	}
}
