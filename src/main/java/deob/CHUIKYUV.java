package deob;

@ObfuscatedName("CHUIKYUV")
public final class CHUIKYUV extends ZOMFWUWL {

	@ObfuscatedName("CHUIKYUV.ub")
	public AUWOQLEO field69;

	@ObfuscatedName("CHUIKYUV.a(Z)Z")
	public final boolean method29() {
		if (field69 == null) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("CHUIKYUV.a(B)LIGXVZOHI;")
	public final IGXVZOHI method30() {
		if (field1452 < 0 || field1455 != 0) {
			int var3 = -1;
			if (field1497 >= 0) {
				var3 = BZONLWPM.field53[field1497].field55[field1498];
			}

			return field69.method7(-1, var3, null);
		}

		int var1 = BZONLWPM.field53[field1452].field55[field1453];
		int var2 = -1;
		if (field1497 >= 0 && field1497 != field1475) {
			var2 = BZONLWPM.field53[field1497].field55[field1498];
		}

		return field69.method7(var2, var1, BZONLWPM.field53[field1452].field59);
	}

	@ObfuscatedName("CHUIKYUV.a(I)LIGXVZOHI;")
	public final IGXVZOHI method25() {
		if (field69 == null) {
			return null;
		}

		IGXVZOHI var1 = method30();
		if (var1 == null) {
			return null;
		}

		field1472 = var1.field51;

		if (field1501 != -1 && field1502 != -1) {
			VCTVXSNH var2 = VCTVXSNH.field1348[field1501];
			IGXVZOHI var3 = var2.method555();
			if (var3 != null) {
				int var4 = var2.field1352.field55[field1502];
				IGXVZOHI var5 = new IGXVZOHI(true, var3, false, ICYGYVTE.method349(var4));
				var5.method367(0, 0, -field1505);
				var5.method361();
				var5.method362(var4);
				var5.field810 = null;
				var5.field809 = null;

				if (var2.field1355 != 128 || var2.field1356 != 128) {
					var5.method370(var2.field1355, var2.field1356, var2.field1355);
				}

				var5.method371(var2.field1358 + 64, var2.field1359 + 850, -30, -50, -30, true);
				IGXVZOHI[] var6 = new IGXVZOHI[] { var1, var5 };
				var1 = new IGXVZOHI(2, var6, true);
			}
		}

		if (field69.field16 == 1) {
			var1.field811 = true;
		}

		return var1;
	}
}
