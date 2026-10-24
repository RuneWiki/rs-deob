package deob;

@ObfuscatedName("ZHNLOFBM")
public final class ZHNLOFBM extends AQPBLKMD {

	@ObfuscatedName("ZHNLOFBM.rb")
	public YXSRFNQD field1510;

	@ObfuscatedName("ZHNLOFBM.a(I)LOGORHYVW;")
	public final OGORHYVW method5() {
		if (field1510 == null) {
			return null;
		}

		OGORHYVW var1 = method600();
		if (var1 == null) {
			return null;
		}

		field51 = var1.field628;

		if (field16 != -1 && field17 != -1) {
			HTOEUNMD var2 = HTOEUNMD.field772[field16];
			OGORHYVW var3 = var2.method245();
			if (var3 != null) {
				int var4 = var2.field776.field1004[field17];
				OGORHYVW var5 = new OGORHYVW(true, var3, OYJABRDD.method467(var4), false);
				var5.method446(-field20, 0, 0);
				var5.method440();
				var5.method441(var4);
				var5.field1140 = null;
				var5.field1139 = null;

				if (var2.field779 != 128 || var2.field780 != 128) {
					var5.method449(var2.field779, var2.field779, var2.field780);
				}

				var5.method450(var2.field782 + 64, var2.field783 + 850, -30, -50, -30, true);
				OGORHYVW[] var6 = new OGORHYVW[] { var1, var5 };
				var1 = new OGORHYVW(2, true, var6);
			}
		}

		if (field1510.field1492 == 1) {
			var1.field1141 = true;
		}

		return var1;
	}

	@ObfuscatedName("ZHNLOFBM.c(I)Z")
	public final boolean method8() {
		if (field1510 == null) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("ZHNLOFBM.a(B)LOGORHYVW;")
	public final OGORHYVW method600() {
		if (field42 < 0 || field45 != 0) {
			int var3 = -1;
			if (field48 >= 0) {
				var3 = KSVXFIAD.field1002[field48].field1004[field49];
			}

			return field1510.method595(null, -1, var3);
		}

		int var1 = KSVXFIAD.field1002[field42].field1004[field43];
		int var2 = -1;
		if (field48 >= 0 && field60 != field48) {
			var2 = KSVXFIAD.field1002[field48].field1004[field49];
		}

		return field1510.method595(KSVXFIAD.field1002[field42].field1008, var2, var1);
	}
}
