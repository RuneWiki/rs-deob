package deob;

@ObfuscatedName("FSNLAIJY")
public final class FSNLAIJY extends YHEHTOVP {

	@ObfuscatedName("FSNLAIJY.sb")
	public NHTDEVDA field631;

	@ObfuscatedName("FSNLAIJY.d(I)LFUTAQMCE;")
	public final FUTAQMCE method244() {
		if (field1450 < 0 || field1453 != 0) {
			int var3 = -1;
			if (field1444 >= 0) {
				var3 = GMRGYXFL.field720[field1444].field722[field1445];
			}

			return field631.method367(null, -1, var3);
		}

		int var1 = GMRGYXFL.field720[field1450].field722[field1451];
		int var2 = -1;
		if (field1444 >= 0 && field1444 != field1431) {
			var2 = GMRGYXFL.field720[field1444].field722[field1445];
		}

		return field631.method367(GMRGYXFL.field720[field1450].field726, var2, var1);
	}

	@ObfuscatedName("FSNLAIJY.a(I)LFUTAQMCE;")
	public final FUTAQMCE method2() {
		if (field631 == null) {
			return null;
		}

		FUTAQMCE var1 = method244();
		if (var1 == null) {
			return null;
		}

		field1459 = var1.field976;

		if (field1426 != -1 && field1427 != -1) {
			VSBOWDVL var2 = VSBOWDVL.field1380[field1426];
			FUTAQMCE var3 = var2.method519();
			if (var3 != null) {
				int var4 = var2.field1384.field722[field1427];
				FUTAQMCE var5 = new FUTAQMCE(var3, false, true, RYVJCVCB.method428(var4));
				var5.method263(0, -field1430, 0);
				var5.method257();
				var5.method258(var4);
				var5.field670 = null;
				var5.field669 = null;

				if (var2.field1387 != 128 || var2.field1388 != 128) {
					var5.method266(var2.field1387, var2.field1388, var2.field1387);
				}

				var5.method267(var2.field1390 + 64, var2.field1391 + 850, -30, -50, -30, true);
				FUTAQMCE[] var6 = new FUTAQMCE[] { var1, var5 };
				var1 = new FUTAQMCE(2, var6, true);
			}
		}

		if (field631.field953 == 1) {
			var1.field671 = true;
		}

		return var1;
	}

	@ObfuscatedName("FSNLAIJY.b(I)Z")
	public final boolean method245() {
		if (field631 == null) {
			return false;
		}

		return true;
	}
}
