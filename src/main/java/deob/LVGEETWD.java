package deob;

@ObfuscatedName("LVGEETWD")
public final class LVGEETWD {

	@ObfuscatedName("LVGEETWD.d")
	public ZAQWNGNJ field971 = new ZAQWNGNJ();

	@ObfuscatedName("LVGEETWD.e")
	public ZAQWNGNJ field972;

	public LVGEETWD() {
		field971.field1409 = field971;
		field971.field1410 = field971;
	}

	@ObfuscatedName("LVGEETWD.a(LZAQWNGNJ;)V")
	public void method357(ZAQWNGNJ arg0) {
		if (arg0.field1410 != null) {
			arg0.method537();
		}

		arg0.field1410 = field971.field1410;
		arg0.field1409 = field971;
		arg0.field1410.field1409 = arg0;
		arg0.field1409.field1410 = arg0;
	}

	@ObfuscatedName("LVGEETWD.a()LZAQWNGNJ;")
	public ZAQWNGNJ method358() {
		ZAQWNGNJ var1 = field971.field1409;
		if (field971 == var1) {
			return null;
		} else {
			var1.method537();
			return var1;
		}
	}

	@ObfuscatedName("LVGEETWD.b()LZAQWNGNJ;")
	public ZAQWNGNJ method359() {
		ZAQWNGNJ var1 = field971.field1409;
		if (field971 == var1) {
			field972 = null;
			return null;
		} else {
			field972 = var1.field1409;
			return var1;
		}
	}

	@ObfuscatedName("LVGEETWD.a(I)LZAQWNGNJ;")
	public ZAQWNGNJ method360() {
		ZAQWNGNJ var1 = field972;
		if (field971 == var1) {
			field972 = null;
			return null;
		} else {
			field972 = var1.field1409;
			return var1;
		}
	}

	@ObfuscatedName("LVGEETWD.c()I")
	public int method361() {
		int var1 = 0;
		for (ZAQWNGNJ var2 = field971.field1409; var2 != field971; var2 = var2.field1409) {
			var1++;
		}

		return var1;
	}
}
