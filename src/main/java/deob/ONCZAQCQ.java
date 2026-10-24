package deob;

@ObfuscatedName("ONCZAQCQ")
public final class ONCZAQCQ extends APSQOGBV {

	@ObfuscatedName("ONCZAQCQ.ub")
	public NPWLDXJE field1059;

	@ObfuscatedName("ONCZAQCQ.a(I)LKBEXSZSN;")
	public final KBEXSZSN method28() {
		if (field1059 == null) {
			return null;
		}

		KBEXSZSN var1 = method415();
		if (var1 == null) {
			return null;
		}

		field33 = var1.field1299;

		if (field24 != -1 && field25 != -1) {
			TGIKVGNH var2 = TGIKVGNH.field1194[field24];
			KBEXSZSN var3 = var2.method461();
			if (var3 != null) {
				int var4 = var2.field1198.field1037[field25];
				KBEXSZSN var5 = new KBEXSZSN(false, IBCKUTPD.method309(var4), var3, true);
				var5.method352(-field28, 0, 0);
				var5.method346();
				var5.method347(var4);
				var5.field904 = null;
				var5.field903 = null;

				if (var2.field1201 != 128 || var2.field1202 != 128) {
					var5.method355(var2.field1201, var2.field1202, var2.field1201);
				}

				var5.method356(var2.field1204 + 64, var2.field1205 + 850, -30, -50, -30, true);
				KBEXSZSN[] var6 = new KBEXSZSN[] { var1, var5 };
				var1 = new KBEXSZSN(var6, 2, true);
			}
		}

		if (field1059.field987 == 1) {
			var1.field905 = true;
		}

		return var1;
	}

	@ObfuscatedName("ONCZAQCQ.b(B)LKBEXSZSN;")
	public final KBEXSZSN method415() {
		if (field44 < 0 || field47 != 0) {
			int var3 = -1;
			if (field40 >= 0) {
				var3 = ODMBIHRM.field1035[field40].field1037[field41];
			}

			return field1059.method388(var3, -1, null);
		}

		int var1 = ODMBIHRM.field1035[field44].field1037[field45];
		int var2 = -1;
		if (field40 >= 0 && field65 != field40) {
			var2 = ODMBIHRM.field1035[field40].field1037[field41];
		}

		return field1059.method388(var1, var2, ODMBIHRM.field1035[field44].field1041);
	}

	@ObfuscatedName("ONCZAQCQ.a(Z)Z")
	public final boolean method10() {
		if (field1059 == null) {
			return false;
		}

		return true;
	}
}
