package deob;

@ObfuscatedName("ZLSEKGJR")
public final class ZLSEKGJR extends XETERYIW {

	@ObfuscatedName("ZLSEKGJR.sb")
	public GALAVQEJ field1475;

	@ObfuscatedName("ZLSEKGJR.a(I)Z")
	public final boolean method250() {
		if (field1475 == null) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("ZLSEKGJR.c(I)LCSGBDGDY;")
	public final CSGBDGDY method585() {
		if (field1391 < 0 || field1394 != 0) {
			int var3 = -1;
			if (field1356 >= 0) {
				var3 = PNPNYEVW.field1058[field1356].field1060[field1357];
			}

			return field1475.method205(var3, null, -1);
		}

		int var1 = PNPNYEVW.field1058[field1391].field1060[field1392];
		int var2 = -1;
		if (field1356 >= 0 && field1403 != field1356) {
			var2 = PNPNYEVW.field1058[field1356].field1060[field1357];
		}

		return field1475.method205(var1, PNPNYEVW.field1058[field1391].field1064, var2);
	}

	@ObfuscatedName("ZLSEKGJR.a(Z)LCSGBDGDY;")
	public final CSGBDGDY method187() {
		if (field1475 == null) {
			return null;
		}

		CSGBDGDY var1 = method585();
		if (var1 == null) {
			return null;
		}

		field1409 = var1.field1474;

		if (field1359 != -1 && field1360 != -1) {
			FXNZCBPL var2 = FXNZCBPL.field620[field1359];
			CSGBDGDY var3 = var2.method202();
			if (var3 != null) {
				int var4 = var2.field624.field1060[field1360];
				CSGBDGDY var5 = new CSGBDGDY(true, KDJQGGIG.method285(var4), var3, false);
				var5.method173(-field1363, 0, 0);
				var5.method167();
				var5.method168(var4);
				var5.field535 = null;
				var5.field534 = null;

				if (var2.field627 != 128 || var2.field628 != 128) {
					var5.method176(var2.field627, var2.field628, var2.field627);
				}

				var5.method177(var2.field630 + 64, var2.field631 + 850, -30, -50, -30, true);
				CSGBDGDY[] var6 = new CSGBDGDY[] { var1, var5 };
				var1 = new CSGBDGDY(2, var6, true);
			}
		}

		if (field1475.field656 == 1) {
			var1.field536 = true;
		}

		return var1;
	}
}
