package deob;

@ObfuscatedName("TOFRUGLM")
public final class TOFRUGLM extends FSZDVUBI {

	@ObfuscatedName("TOFRUGLM.tb")
	public YSYPMZMO field1283;

	@ObfuscatedName("TOFRUGLM.a(I)Z")
	public final boolean method307() {
		if (field1283 == null) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("TOFRUGLM.a(B)LRMLAXPMV;")
	public final RMLAXPMV method344() {
		if (field1283 == null) {
			return null;
		}

		RMLAXPMV var1 = method513();
		if (var1 == null) {
			return null;
		}

		field599 = var1.field1060;

		if (field614 != -1 && field615 != -1) {
			MHWTJCHJ var2 = MHWTJCHJ.field839[field614];
			RMLAXPMV var3 = var2.method367();
			if (var3 != null) {
				int var4 = var2.field843.field759[field615];
				RMLAXPMV var5 = new RMLAXPMV(var3, XMRZESBN.method586(var4), true, false);
				var5.method479(0, 0, -field618);
				var5.method473();
				var5.method474(var4);
				var5.field1170 = null;
				var5.field1169 = null;

				if (var2.field846 != 128 || var2.field847 != 128) {
					var5.method482(var2.field847, var2.field846, var2.field846);
				}

				var5.method483(var2.field849 + 64, var2.field850 + 850, -30, -50, -30, true);
				RMLAXPMV[] var6 = new RMLAXPMV[] { var1, var5 };
				var1 = new RMLAXPMV(2, true, var6);
			}
		}

		if (field1283.field1457 == 1) {
			var1.field1171 = true;
		}

		return var1;
	}

	@ObfuscatedName("TOFRUGLM.b(I)LRMLAXPMV;")
	public final RMLAXPMV method513() {
		if (field585 < 0 || field588 != 0) {
			int var3 = -1;
			if (field609 >= 0) {
				var3 = JZQVOFSF.field757[field609].field759[field610];
			}

			return field1283.method593(null, var3, -1);
		}

		int var1 = JZQVOFSF.field757[field585].field759[field586];
		int var2 = -1;
		if (field609 >= 0 && field609 != field583) {
			var2 = JZQVOFSF.field757[field609].field759[field610];
		}

		return field1283.method593(JZQVOFSF.field757[field585].field763, var1, var2);
	}
}
