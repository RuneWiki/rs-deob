package deob;

@ObfuscatedName("YQBVAFEO")
public final class YQBVAFEO extends FHOAYGUJ {

	@ObfuscatedName("YQBVAFEO.qb")
	public PFWIJTDA field1501;

	@ObfuscatedName("YQBVAFEO.b(I)Z")
	public final boolean method166() {
		if (field1501 == null) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("YQBVAFEO.a(I)LIRLTEWJP;")
	public final IRLTEWJP method168() {
		if (field1501 == null) {
			return null;
		}

		IRLTEWJP var1 = method603();
		if (var1 == null) {
			return null;
		}

		field589 = var1.field702;

		if (field619 != -1 && field620 != -1) {
			OPHZBIVR var2 = OPHZBIVR.field1106[field619];
			IRLTEWJP var3 = var2.method435();
			if (var3 != null) {
				int var4 = var2.field1110.field1167[field620];
				IRLTEWJP var5 = new IRLTEWJP(var3, false, FIYHSKKC.method211(var4), true);
				var5.method294(0, 0, -field623);
				var5.method288();
				var5.method289(var4);
				var5.field910 = null;
				var5.field909 = null;

				if (var2.field1113 != 128 || var2.field1114 != 128) {
					var5.method297(var2.field1113, var2.field1114, var2.field1113);
				}

				var5.method298(var2.field1116 + 64, var2.field1117 + 850, -30, -50, -30, true);
				IRLTEWJP[] var6 = new IRLTEWJP[] { var1, var5 };
				var1 = new IRLTEWJP(true, 2, var6);
			}
		}

		if (field1501.field1136 == 1) {
			var1.field911 = true;
		}

		return var1;
	}

	@ObfuscatedName("YQBVAFEO.c(I)LIRLTEWJP;")
	public final IRLTEWJP method603() {
		if (field602 < 0 || field605 != 0) {
			int var3 = -1;
			if (field577 >= 0) {
				var3 = QBINVEVU.field1165[field577].field1167[field578];
			}

			return field1501.method440(null, -1, var3);
		}

		int var1 = QBINVEVU.field1165[field602].field1167[field603];
		int var2 = -1;
		if (field577 >= 0 && field625 != field577) {
			var2 = QBINVEVU.field1165[field577].field1167[field578];
		}

		return field1501.method440(QBINVEVU.field1165[field602].field1171, var2, var1);
	}
}
