package deob;

@ObfuscatedName("ITIWVLHR")
public final class ITIWVLHR extends ZJNNOVLJ {

	@ObfuscatedName("ITIWVLHR.qb")
	public EKQCVRVG field770;

	@ObfuscatedName("ITIWVLHR.a(B)Z")
	public final boolean method228() {
		if (field770 == null) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("ITIWVLHR.a(Z)LWRJMHIDY;")
	public final WRJMHIDY method174() {
		if (field770 == null) {
			return null;
		}

		WRJMHIDY var1 = method229();
		if (var1 == null) {
			return null;
		}

		field1483 = var1.field635;

		if (field1489 != -1 && field1490 != -1) {
			TGYZPJQJ var2 = TGYZPJQJ.field1121[field1489];
			WRJMHIDY var3 = var2.method444();
			if (var3 != null) {
				int var4 = var2.field1125.field834[field1490];
				WRJMHIDY var5 = new WRJMHIDY(var3, true, false, OZAHMTPS.method338(var4));
				var5.method479(0, 0, -field1493);
				var5.method473();
				var5.method474(var4);
				var5.field1261 = null;
				var5.field1260 = null;

				if (var2.field1128 != 128 || var2.field1129 != 128) {
					var5.method482(var2.field1128, var2.field1128, var2.field1129);
				}

				var5.method483(var2.field1131 + 64, var2.field1132 + 850, -30, -50, -30, true);
				WRJMHIDY[] var6 = new WRJMHIDY[] { var1, var5 };
				var1 = new WRJMHIDY(true, 2, var6);
			}
		}

		if (field770.field608 == 1) {
			var1.field1262 = true;
		}

		return var1;
	}

	@ObfuscatedName("ITIWVLHR.b(Z)LWRJMHIDY;")
	public final WRJMHIDY method229() {
		if (field1496 < 0 || field1499 != 0) {
			int var3 = -1;
			if (field1484 >= 0) {
				var3 = LZZHVUJR.field832[field1484].field834[field1485];
			}

			return field770.method198(var3, -1, null);
		}

		int var1 = LZZHVUJR.field832[field1496].field834[field1497];
		int var2 = -1;
		if (field1484 >= 0 && field1484 != field1464) {
			var2 = LZZHVUJR.field832[field1484].field834[field1485];
		}

		return field770.method198(var1, var2, LZZHVUJR.field832[field1496].field838);
	}
}
