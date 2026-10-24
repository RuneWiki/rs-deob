package deob;

@ObfuscatedName("SBPCMLRM")
public final class SBPCMLRM extends NQXGETKS {

	@ObfuscatedName("SBPCMLRM.pb")
	public YGGALXYD field1214;

	@ObfuscatedName("SBPCMLRM.a(Z)LCYPZUKMB;")
	public final CYPZUKMB method522() {
		if (field1015 < 0 || field1018 != 0) {
			int var3 = -1;
			if (field1002 >= 0) {
				var3 = EHYLCNJX.field744[field1002].field746[field1003];
			}

			return field1214.method569(-1, var3, null);
		}

		int var1 = EHYLCNJX.field744[field1015].field746[field1016];
		int var2 = -1;
		if (field1002 >= 0 && field989 != field1002) {
			var2 = EHYLCNJX.field744[field1002].field746[field1003];
		}

		return field1214.method569(var2, var1, EHYLCNJX.field744[field1015].field750);
	}

	@ObfuscatedName("SBPCMLRM.a(B)LCYPZUKMB;")
	public final CYPZUKMB method2() {
		if (field1214 == null) {
			return null;
		}

		CYPZUKMB var1 = method522();
		if (var1 == null) {
			return null;
		}

		field994 = var1.field1247;

		if (field969 != -1 && field970 != -1) {
			BZLQCUPI var2 = BZLQCUPI.field41[field969];
			CYPZUKMB var3 = var2.method9();
			if (var3 != null) {
				int var4 = var2.field45.field746[field970];
				CYPZUKMB var5 = new CYPZUKMB(QGRLAQIF.method469(var4), var3, false, true);
				var5.method209(0, -field973, 0);
				var5.method203();
				var5.method204(var4);
				var5.field574 = null;
				var5.field573 = null;

				if (var2.field48 != 128 || var2.field49 != 128) {
					var5.method212(var2.field48, var2.field49, var2.field48);
				}

				var5.method213(var2.field51 + 64, var2.field52 + 850, -30, -50, -30, true);
				CYPZUKMB[] var6 = new CYPZUKMB[] { var1, var5 };
				var1 = new CYPZUKMB(true, 2, var6);
			}
		}

		if (field1214.field1392 == 1) {
			var1.field575 = true;
		}

		return var1;
	}

	@ObfuscatedName("SBPCMLRM.a(I)Z")
	public final boolean method429() {
		if (field1214 == null) {
			return false;
		}

		return true;
	}
}
