package deob;

@ObfuscatedName("TEBIXSCV")
public final class TEBIXSCV extends OVZHBYZU {

	@ObfuscatedName("TEBIXSCV.pb")
	public ZDMOUFDZ field1257;

	@ObfuscatedName("TEBIXSCV.a(B)LCCYECDYX;")
	public final CCYECDYX method181() {
		if (field1257 == null) {
			return null;
		}

		CCYECDYX var1 = method438();
		if (var1 == null) {
			return null;
		}

		field1049 = var1.field1289;

		if (field1037 != -1 && field1038 != -1) {
			ZSSCYSIO var2 = ZSSCYSIO.field1476[field1037];
			CCYECDYX var3 = var2.method590();
			if (var3 != null) {
				int var4 = var2.field1480.field788[field1038];
				CCYECDYX var5 = new CCYECDYX(RKTGZGSS.method383(var4), var3, false, true);
				var5.method24(0, 0, -field1041);
				var5.method18();
				var5.method19(var4);
				var5.field59 = null;
				var5.field58 = null;

				if (var2.field1483 != 128 || var2.field1484 != 128) {
					var5.method27(var2.field1483, var2.field1484, var2.field1483);
				}

				var5.method28(var2.field1486 + 64, var2.field1487 + 850, -30, -50, -30, true);
				CCYECDYX[] var6 = new CCYECDYX[] { var1, var5 };
				var1 = new CCYECDYX(true, var6, 2);
			}
		}

		if (field1257.field1443 == 1) {
			var1.field60 = true;
		}

		return var1;
	}

	@ObfuscatedName("TEBIXSCV.c(Z)LCCYECDYX;")
	public final CCYECDYX method438() {
		if (field1081 < 0 || field1084 != 0) {
			int var3 = -1;
			if (field1034 >= 0) {
				var3 = ISUBRNPG.field786[field1034].field788[field1035];
			}

			return field1257.method530(-1, var3, null);
		}

		int var1 = ISUBRNPG.field786[field1081].field788[field1082];
		int var2 = -1;
		if (field1034 >= 0 && field1047 != field1034) {
			var2 = ISUBRNPG.field786[field1034].field788[field1035];
		}

		return field1257.method530(var2, var1, ISUBRNPG.field786[field1081].field792);
	}

	@ObfuscatedName("TEBIXSCV.a(Z)Z")
	public final boolean method369() {
		if (field1257 == null) {
			return false;
		}

		return true;
	}
}
