package deob;

@ObfuscatedName("URASIGRB")
public final class URASIGRB {

	@ObfuscatedName("URASIGRB.f")
	public OKDOXVFL field1300 = new OKDOXVFL();

	@ObfuscatedName("URASIGRB.g")
	public OKDOXVFL field1301;

	public URASIGRB() {
		field1300.field1029 = field1300;
		field1300.field1030 = field1300;
	}

	@ObfuscatedName("URASIGRB.a(LOKDOXVFL;)V")
	public void method500(OKDOXVFL arg0) {
		if (arg0.field1030 != null) {
			arg0.method398();
		}

		arg0.field1030 = field1300.field1030;
		arg0.field1029 = field1300;
		arg0.field1030.field1029 = arg0;
		arg0.field1029.field1030 = arg0;
	}

	@ObfuscatedName("URASIGRB.a(ILOKDOXVFL;)V")
	public void method501(OKDOXVFL arg0) {
		if (arg0.field1030 != null) {
			arg0.method398();
		}

		arg0.field1030 = field1300;
		arg0.field1029 = field1300.field1029;
		arg0.field1030.field1029 = arg0;
		arg0.field1029.field1030 = arg0;
	}

	@ObfuscatedName("URASIGRB.a()LOKDOXVFL;")
	public OKDOXVFL method502() {
		OKDOXVFL var1 = field1300.field1029;
		if (field1300 == var1) {
			return null;
		} else {
			var1.method398();
			return var1;
		}
	}

	@ObfuscatedName("URASIGRB.b()LOKDOXVFL;")
	public OKDOXVFL method503() {
		OKDOXVFL var1 = field1300.field1029;
		if (field1300 == var1) {
			field1301 = null;
			return null;
		} else {
			field1301 = var1.field1029;
			return var1;
		}
	}

	@ObfuscatedName("URASIGRB.a(B)LOKDOXVFL;")
	public OKDOXVFL method504() {
		OKDOXVFL var1 = field1300.field1030;
		if (field1300 == var1) {
			field1301 = null;
			return null;
		} else {
			field1301 = var1.field1030;
			return var1;
		}
	}

	@ObfuscatedName("URASIGRB.a(Z)LOKDOXVFL;")
	public OKDOXVFL method505() {
		OKDOXVFL var1 = field1301;
		if (field1300 == var1) {
			field1301 = null;
			return null;
		} else {
			field1301 = var1.field1029;
			return var1;
		}
	}

	@ObfuscatedName("URASIGRB.b(Z)LOKDOXVFL;")
	public OKDOXVFL method506() {
		OKDOXVFL var1 = field1301;
		if (field1300 == var1) {
			field1301 = null;
			return null;
		} else {
			field1301 = var1.field1030;
			return var1;
		}
	}

	@ObfuscatedName("URASIGRB.c()V")
	public void method507() {
		if (field1300.field1029 != field1300) {
			while (true) {
				OKDOXVFL var1 = field1300.field1029;
				if (field1300 == var1) {
					return;
				}

				var1.method398();
			}
		}
	}
}
