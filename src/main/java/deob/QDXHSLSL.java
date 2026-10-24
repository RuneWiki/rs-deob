package deob;

@ObfuscatedName("QDXHSLSL")
public final class QDXHSLSL extends WAJZGBEE {

	@ObfuscatedName("QDXHSLSL.ub")
	public LPTCUHOU field972;

	@ObfuscatedName("QDXHSLSL.a(I)LVHYCWIPJ;")
	public final VHYCWIPJ method217() {
		if (field972 == null) {
			return null;
		}

		VHYCWIPJ var1 = method409();
		if (var1 == null) {
			return null;
		}

		field1269 = var1.field962;

		if (field1277 != -1 && field1278 != -1) {
			XHDTVZNY var2 = XHDTVZNY.field1398[field1277];
			VHYCWIPJ var3 = var2.method579();
			if (var3 != null) {
				int var4 = var2.field1402.field1325[field1278];
				VHYCWIPJ var5 = new VHYCWIPJ(TTZHVWEG.method489(var4), true, false, var3);
				var5.method513(0, 0, -field1281);
				var5.method507();
				var5.method508(var4);
				var5.field1210 = null;
				var5.field1209 = null;

				if (var2.field1405 != 128 || var2.field1406 != 128) {
					var5.method516(var2.field1405, var2.field1405, var2.field1406);
				}

				var5.method517(var2.field1408 + 64, var2.field1409 + 850, -30, -50, -30, true);
				VHYCWIPJ[] var6 = new VHYCWIPJ[] { var1, var5 };
				var1 = new VHYCWIPJ(2, true, var6);
			}
		}

		if (field972.field886 == 1) {
			var1.field1211 = true;
		}

		return var1;
	}

	@ObfuscatedName("QDXHSLSL.a(B)Z")
	public final boolean method404() {
		if (field972 == null) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("QDXHSLSL.b(I)LVHYCWIPJ;")
	public final VHYCWIPJ method409() {
		if (field1310 < 0 || field1313 != 0) {
			int var3 = -1;
			if (field1319 >= 0) {
				var3 = WLHKAARP.field1323[field1319].field1325[field1320];
			}

			return field972.method382(null, -1, var3);
		}

		int var1 = WLHKAARP.field1323[field1310].field1325[field1311];
		int var2 = -1;
		if (field1319 >= 0 && field1319 != field1271) {
			var2 = WLHKAARP.field1323[field1319].field1325[field1320];
		}

		return field972.method382(WLHKAARP.field1323[field1310].field1329, var2, var1);
	}
}
