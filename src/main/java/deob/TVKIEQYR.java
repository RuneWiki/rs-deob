package deob;

@ObfuscatedName("TVKIEQYR")
public final class TVKIEQYR extends ZGJLFNLC {

	@ObfuscatedName("TVKIEQYR.rb")
	public ZNUYRYPY field1135;

	@ObfuscatedName("TVKIEQYR.a(I)LHEQROJXW;")
	public final HEQROJXW method1() {
		if (field1135 == null) {
			return null;
		}

		HEQROJXW var1 = method528();
		if (var1 == null) {
			return null;
		}

		field1404 = var1.field627;

		if (field1409 != -1 && field1410 != -1) {
			UIVLSYQW var2 = UIVLSYQW.field1152[field1409];
			HEQROJXW var3 = var2.method539();
			if (var3 != null) {
				int var4 = var2.field1156.field1364[field1410];
				HEQROJXW var5 = new HEQROJXW(false, true, UEUSJYYO.method536(var4), var3);
				var5.method335(-field1413, 0, 0);
				var5.method329();
				var5.method330(var4);
				var5.field749 = null;
				var5.field748 = null;

				if (var2.field1159 != 128 || var2.field1160 != 128) {
					var5.method338(var2.field1160, var2.field1159, var2.field1159);
				}

				var5.method339(var2.field1162 + 64, var2.field1163 + 850, -30, -50, -30, true);
				HEQROJXW[] var6 = new HEQROJXW[] { var1, var5 };
				var1 = new HEQROJXW(true, 2, var6);
			}
		}

		if (field1135.field1455 == 1) {
			var1.field750 = true;
		}

		return var1;
	}

	@ObfuscatedName("TVKIEQYR.a(Z)Z")
	public final boolean method3() {
		if (field1135 == null) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("TVKIEQYR.a(B)LHEQROJXW;")
	public final HEQROJXW method528() {
		if (field1436 < 0 || field1439 != 0) {
			int var3 = -1;
			if (field1395 >= 0) {
				var3 = XKEHWKFH.field1362[field1395].field1364[field1396];
			}

			return field1135.method586(null, -1, var3);
		}

		int var1 = XKEHWKFH.field1362[field1436].field1364[field1437];
		int var2 = -1;
		if (field1395 >= 0 && field1402 != field1395) {
			var2 = XKEHWKFH.field1362[field1395].field1364[field1396];
		}

		return field1135.method586(XKEHWKFH.field1362[field1436].field1368, var2, var1);
	}
}
