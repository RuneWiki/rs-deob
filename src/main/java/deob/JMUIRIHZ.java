package deob;

@ObfuscatedName("JMUIRIHZ")
public final class JMUIRIHZ extends NXRPKSXU {

	@ObfuscatedName("JMUIRIHZ.vb")
	public VWKJSKWX field853;

	@ObfuscatedName("JMUIRIHZ.a(Z)Z")
	public final boolean method38() {
		if (field853 == null) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("JMUIRIHZ.b(Z)LCADBNSXE;")
	public final CADBNSXE method260() {
		if (field1044 < 0 || field1047 != 0) {
			int var3 = -1;
			if (field1017 >= 0) {
				var3 = UVDKTGZK.field1357[field1017].field1359[field1018];
			}

			return field853.method572(-1, var3, null);
		}

		int var1 = UVDKTGZK.field1357[field1044].field1359[field1045];
		int var2 = -1;
		if (field1017 >= 0 && field1017 != field1011) {
			var2 = UVDKTGZK.field1357[field1017].field1359[field1018];
		}

		return field853.method572(var2, var1, UVDKTGZK.field1357[field1044].field1363);
	}

	@ObfuscatedName("JMUIRIHZ.a(I)LCADBNSXE;")
	public final CADBNSXE method40() {
		if (field853 == null) {
			return null;
		}

		CADBNSXE var1 = method260();
		if (var1 == null) {
			return null;
		}

		field1049 = var1.field852;

		if (field996 != -1 && field997 != -1) {
			XWNROHZR var2 = XWNROHZR.field1439[field996];
			CADBNSXE var3 = var2.method589();
			if (var3 != null) {
				int var4 = var2.field1443.field1359[field997];
				CADBNSXE var5 = new CADBNSXE(false, DFGNFGZH.method215(var4), var3, true);
				var5.method24(-field1000, 0, 0);
				var5.method18();
				var5.method19(var4);
				var5.field48 = null;
				var5.field47 = null;

				if (var2.field1446 != 128 || var2.field1447 != 128) {
					var5.method27(var2.field1446, var2.field1447, var2.field1446);
				}

				var5.method28(var2.field1449 + 64, var2.field1450 + 850, -30, -50, -30, true);
				CADBNSXE[] var6 = new CADBNSXE[] { var1, var5 };
				var1 = new CADBNSXE(true, var6, 2);
			}
		}

		if (field853.field1409 == 1) {
			var1.field49 = true;
		}

		return var1;
	}
}
