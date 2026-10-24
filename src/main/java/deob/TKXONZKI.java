package deob;

@ObfuscatedName("TKXONZKI")
public final class TKXONZKI extends UKYMLOIC {

	@ObfuscatedName("TKXONZKI.ub")
	public BXXPAJNW field1188;

	@ObfuscatedName("TKXONZKI.a(I)LGFYXEFQY;")
	public final GFYXEFQY method294() {
		if (field1188 == null) {
			return null;
		}

		GFYXEFQY var1 = method501();
		if (var1 == null) {
			return null;
		}

		field1346 = var1.field739;

		if (field1314 != -1 && field1315 != -1) {
			UYLUCQNM var2 = UYLUCQNM.field1364[field1314];
			GFYXEFQY var3 = var2.method564();
			if (var3 != null) {
				int var4 = var2.field1368.field1017[field1315];
				GFYXEFQY var5 = new GFYXEFQY(ERVJQNCY.method282(var4), var3, true, false);
				var5.method354(0, -field1318, 0);
				var5.method348();
				var5.method349(var4);
				var5.field785 = null;
				var5.field784 = null;

				if (var2.field1371 != 128 || var2.field1372 != 128) {
					var5.method357(var2.field1371, var2.field1371, var2.field1372);
				}

				var5.method358(var2.field1374 + 64, var2.field1375 + 850, -30, -50, -30, true);
				GFYXEFQY[] var6 = new GFYXEFQY[] { var1, var5 };
				var1 = new GFYXEFQY(true, 2, var6);
			}
		}

		if (field1188.field77 == 1) {
			var1.field786 = true;
		}

		return var1;
	}

	@ObfuscatedName("TKXONZKI.b(I)Z")
	public final boolean method368() {
		if (field1188 == null) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("TKXONZKI.d(I)LGFYXEFQY;")
	public final GFYXEFQY method501() {
		if (field1320 < 0 || field1323 != 0) {
			int var3 = -1;
			if (field1350 >= 0) {
				var3 = KIRTNGZJ.field1015[field1350].field1017[field1351];
			}

			return field1188.method26(var3, -1, null);
		}

		int var1 = KIRTNGZJ.field1015[field1320].field1017[field1321];
		int var2 = -1;
		if (field1350 >= 0 && field1350 != field1303) {
			var2 = KIRTNGZJ.field1015[field1350].field1017[field1351];
		}

		return field1188.method26(var1, var2, KIRTNGZJ.field1015[field1320].field1021);
	}
}
