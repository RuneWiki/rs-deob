package deob;

@ObfuscatedName("LJAXEEYT")
public final class LJAXEEYT extends GSULPWKR {

	@ObfuscatedName("LJAXEEYT.sb")
	public DDJHHGTJ field856;

	@ObfuscatedName("LJAXEEYT.a(Z)LOQIGXOFQ;")
	public final OQIGXOFQ method171() {
		if (field856 == null) {
			return null;
		}

		OQIGXOFQ var1 = method302();
		if (var1 == null) {
			return null;
		}

		field754 = var1.field1467;

		if (field756 != -1 && field757 != -1) {
			BYUDODIR var2 = BYUDODIR.field34[field756];
			OQIGXOFQ var3 = var2.method18();
			if (var3 != null) {
				int var4 = var2.field38.field1341[field757];
				OQIGXOFQ var5 = new OQIGXOFQ(XZZTWOGF.method582(var4), var3, false, true);
				var5.method404(0, -field760, 0);
				var5.method398();
				var5.method399(var4);
				var5.field1066 = null;
				var5.field1065 = null;

				if (var2.field41 != 128 || var2.field42 != 128) {
					var5.method407(var2.field42, var2.field41, var2.field41);
				}

				var5.method408(var2.field44 + 64, var2.field45 + 850, -30, -50, -30, true);
				OQIGXOFQ[] var6 = new OQIGXOFQ[] { var1, var5 };
				var1 = new OQIGXOFQ(true, var6, 2);
			}
		}

		if (field856.field503 == 1) {
			var1.field1067 = true;
		}

		return var1;
	}

	@ObfuscatedName("LJAXEEYT.b(I)Z")
	public final boolean method169() {
		if (field856 == null) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("LJAXEEYT.a(B)LOQIGXOFQ;")
	public final OQIGXOFQ method302() {
		if (field736 < 0 || field739 != 0) {
			int var3 = -1;
			if (field729 >= 0) {
				var3 = VYCKCNXO.field1339[field729].field1341[field730];
			}

			return field856.method158(null, var3, -1);
		}

		int var1 = VYCKCNXO.field1339[field736].field1341[field737];
		int var2 = -1;
		if (field729 >= 0 && field765 != field729) {
			var2 = VYCKCNXO.field1339[field729].field1341[field730];
		}

		return field856.method158(VYCKCNXO.field1339[field736].field1345, var1, var2);
	}
}
