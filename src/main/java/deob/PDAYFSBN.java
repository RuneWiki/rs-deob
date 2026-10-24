package deob;

@ObfuscatedName("PDAYFSBN")
public final class PDAYFSBN extends SRUOAWPS {

	@ObfuscatedName("PDAYFSBN.sb")
	public YIBRLAQY field969;

	@ObfuscatedName("PDAYFSBN.a(I)LPSGMMDJS;")
	public final PSGMMDJS method196() {
		if (field969 == null) {
			return null;
		}

		PSGMMDJS var1 = method317();
		if (var1 == null) {
			return null;
		}

		field1265 = var1.field1322;

		if (field1281 != -1 && field1282 != -1) {
			HTWOTIWO var2 = HTWOTIWO.field778[field1281];
			PSGMMDJS var3 = var2.method251();
			if (var3 != null) {
				int var4 = var2.field782.field588[field1282];
				PSGMMDJS var5 = new PSGMMDJS(var3, AOFTXYIM.method5(var4), true, false);
				var5.method423(-field1285, 0, 0);
				var5.method417();
				var5.method418(var4);
				var5.field1028 = null;
				var5.field1027 = null;

				if (var2.field785 != 128 || var2.field786 != 128) {
					var5.method426(var2.field786, var2.field785, var2.field785);
				}

				var5.method427(var2.field788 + 64, var2.field789 + 850, -30, -50, -30, true);
				PSGMMDJS[] var6 = new PSGMMDJS[] { var1, var5 };
				var1 = new PSGMMDJS(2, var6, true);
			}
		}

		if (field969.field1475 == 1) {
			var1.field1029 = true;
		}

		return var1;
	}

	@ObfuscatedName("PDAYFSBN.a(B)Z")
	public final boolean method316() {
		if (field969 == null) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("PDAYFSBN.b(I)LPSGMMDJS;")
	public final PSGMMDJS method317() {
		if (field1245 < 0 || field1248 != 0) {
			int var3 = -1;
			if (field1273 >= 0) {
				var3 = DWUJPTWU.field586[field1273].field588[field1274];
			}

			return field969.method581(var3, -1, null);
		}

		int var1 = DWUJPTWU.field586[field1245].field588[field1246];
		int var2 = -1;
		if (field1273 >= 0 && field1273 != field1239) {
			var2 = DWUJPTWU.field586[field1273].field588[field1274];
		}

		return field969.method581(var1, var2, DWUJPTWU.field586[field1245].field592);
	}
}
