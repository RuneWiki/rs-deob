package deob;

@ObfuscatedName("KPZIZBER")
public final class KPZIZBER extends DBHOKPMQ {

	@ObfuscatedName("KPZIZBER.sb")
	public NIJEYEOX field906;

	@ObfuscatedName("KPZIZBER.a(B)LJJMVUSJJ;")
	public final JJMVUSJJ method214() {
		if (field906 == null) {
			return null;
		}

		JJMVUSJJ var1 = method331();
		if (var1 == null) {
			return null;
		}

		field541 = var1.field1343;

		if (field529 != -1 && field530 != -1) {
			EBBSHPSJ var2 = EBBSHPSJ.field609[field529];
			JJMVUSJJ var3 = var2.method210();
			if (var3 != null) {
				int var4 = var2.field613.field1434[field530];
				JJMVUSJJ var5 = new JJMVUSJJ(true, OJYMITMR.method382(var4), false, var3);
				var5.method313(0, -field533, 0);
				var5.method307();
				var5.method308(var4);
				var5.field834 = null;
				var5.field833 = null;

				if (var2.field616 != 128 || var2.field617 != 128) {
					var5.method316(var2.field617, var2.field616, var2.field616);
				}

				var5.method317(var2.field619 + 64, var2.field620 + 850, -30, -50, -30, true);
				JJMVUSJJ[] var6 = new JJMVUSJJ[] { var1, var5 };
				var1 = new JJMVUSJJ(var6, 2, true);
			}
		}

		if (field906.field1075 == 1) {
			var1.field835 = true;
		}

		return var1;
	}

	@ObfuscatedName("KPZIZBER.b(I)LJJMVUSJJ;")
	public final JJMVUSJJ method331() {
		if (field543 < 0 || field546 != 0) {
			int var3 = -1;
			if (field562 >= 0) {
				var3 = XTKQUJNF.field1432[field562].field1434[field563];
			}

			return field906.method368(var3, -1, null);
		}

		int var1 = XTKQUJNF.field1432[field543].field1434[field544];
		int var2 = -1;
		if (field562 >= 0 && field562 != field535) {
			var2 = XTKQUJNF.field1432[field562].field1434[field563];
		}

		return field906.method368(var1, var2, XTKQUJNF.field1432[field543].field1438);
	}

	@ObfuscatedName("KPZIZBER.a(I)Z")
	public final boolean method203() {
		if (field906 == null) {
			return false;
		}

		return true;
	}
}
