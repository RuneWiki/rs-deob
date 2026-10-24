package deob;

@ObfuscatedName("GBGUDIMT")
public final class GBGUDIMT extends EGCNSKZO {

	@ObfuscatedName("GBGUDIMT.sb")
	public WZSDIPBR field699;

	@ObfuscatedName("GBGUDIMT.a(B)Z")
	public final boolean method263() {
		if (field699 == null) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("GBGUDIMT.c(Z)LPOJFANDE;")
	public final POJFANDE method274() {
		if (field645 < 0 || field648 != 0) {
			int var3 = -1;
			if (field615 >= 0) {
				var3 = KIZBPSHZ.field888[field615].field890[field616];
			}

			return field699.method527(null, var3, -1);
		}

		int var1 = KIZBPSHZ.field888[field645].field890[field646];
		int var2 = -1;
		if (field615 >= 0 && field656 != field615) {
			var2 = KIZBPSHZ.field888[field615].field890[field616];
		}

		return field699.method527(KIZBPSHZ.field888[field645].field894, var1, var2);
	}

	@ObfuscatedName("GBGUDIMT.a(Z)LPOJFANDE;")
	public final POJFANDE method54() {
		if (field699 == null) {
			return null;
		}

		POJFANDE var1 = method274();
		if (var1 == null) {
			return null;
		}

		field640 = var1.field1277;

		if (field622 != -1 && field623 != -1) {
			BUIWQSXJ var2 = BUIWQSXJ.field30[field622];
			POJFANDE var3 = var2.method62();
			if (var3 != null) {
				int var4 = var2.field34.field890[field623];
				POJFANDE var5 = new POJFANDE(HVIFHYEW.method287(var4), true, false, var3);
				var5.method473(-field626, 0, 0);
				var5.method467();
				var5.method468(var4);
				var5.field1131 = null;
				var5.field1130 = null;

				if (var2.field37 != 128 || var2.field38 != 128) {
					var5.method476(var2.field38, var2.field37, var2.field37);
				}

				var5.method477(var2.field40 + 64, var2.field41 + 850, -30, -50, -30, true);
				POJFANDE[] var6 = new POJFANDE[] { var1, var5 };
				var1 = new POJFANDE(true, var6, 2);
			}
		}

		if (field699.field1291 == 1) {
			var1.field1132 = true;
		}

		return var1;
	}
}
