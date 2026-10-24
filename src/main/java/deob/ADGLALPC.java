package deob;

@ObfuscatedName("ADGLALPC")
public final class ADGLALPC extends VNAWUDPP {

	@ObfuscatedName("ADGLALPC.sb")
	public OMIIKHIV field1;

	@ObfuscatedName("ADGLALPC.a(I)LLFTMDGKK;")
	public final LFTMDGKK method1() {
		if (field1 == null) {
			return null;
		}

		LFTMDGKK var1 = method3();
		if (var1 == null) {
			return null;
		}

		field1341 = var1.field494;

		if (field1306 != -1 && field1307 != -1) {
			BRGDZOWQ var2 = BRGDZOWQ.field8[field1306];
			LFTMDGKK var3 = var2.method11();
			if (var3 != null) {
				int var4 = var2.field12.field684[field1307];
				LFTMDGKK var5 = new LFTMDGKK(CANZHIOT.method17(var4), true, var3, false);
				var5.method354(-field1310, 0, 0);
				var5.method348();
				var5.method349(var4);
				var5.field852 = null;
				var5.field851 = null;

				if (var2.field15 != 128 || var2.field16 != 128) {
					var5.method357(var2.field16, var2.field15, var2.field15);
				}

				var5.method358(var2.field18 + 64, var2.field19 + 850, -30, -50, -30, true);
				LFTMDGKK[] var6 = new LFTMDGKK[] { var1, var5 };
				var1 = new LFTMDGKK(true, var6, 2);
			}
		}

		if (field1.field1004 == 1) {
			var1.field853 = true;
		}

		return var1;
	}

	@ObfuscatedName("ADGLALPC.b(Z)Z")
	public final boolean method2() {
		if (field1 == null) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("ADGLALPC.c(Z)LLFTMDGKK;")
	public final LFTMDGKK method3() {
		if (field1349 < 0 || field1352 != 0) {
			int var3 = -1;
			if (field1356 >= 0) {
				var3 = IUTBNGPH.field682[field1356].field684[field1357];
			}

			return field1.method445(null, -1, var3);
		}

		int var1 = IUTBNGPH.field682[field1349].field684[field1350];
		int var2 = -1;
		if (field1356 >= 0 && field1356 != field1344) {
			var2 = IUTBNGPH.field682[field1356].field684[field1357];
		}

		return field1.method445(IUTBNGPH.field682[field1349].field688, var2, var1);
	}
}
