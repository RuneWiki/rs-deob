package deob;

@ObfuscatedName("JKNLPRIU")
public final class JKNLPRIU extends TTYUWHXI {

	@ObfuscatedName("JKNLPRIU.rb")
	public JKAPIYZO field750;

	@ObfuscatedName("JKNLPRIU.b(B)LWEVRTBOZ;")
	public final WEVRTBOZ method286() {
		if (field1196 < 0 || field1199 != 0) {
			int var3 = -1;
			if (field1238 >= 0) {
				var3 = RIUJHZLL.field1112[field1238].field1114[field1239];
			}

			return field750.method278(var3, null, -1);
		}

		int var1 = RIUJHZLL.field1112[field1196].field1114[field1197];
		int var2 = -1;
		if (field1238 >= 0 && field1238 != field1220) {
			var2 = RIUJHZLL.field1112[field1238].field1114[field1239];
		}

		return field750.method278(var1, RIUJHZLL.field1112[field1196].field1118, var2);
	}

	@ObfuscatedName("JKNLPRIU.a(Z)LWEVRTBOZ;")
	public final WEVRTBOZ method225() {
		if (field750 == null) {
			return null;
		}

		WEVRTBOZ var1 = method286();
		if (var1 == null) {
			return null;
		}

		field1246 = var1.field945;

		if (field1210 != -1 && field1211 != -1) {
			PMDEXOWJ var2 = PMDEXOWJ.field1086[field1210];
			WEVRTBOZ var3 = var2.method404();
			if (var3 != null) {
				int var4 = var2.field1090.field1114[field1211];
				WEVRTBOZ var5 = new WEVRTBOZ(var3, HJEXDJAH.method218(var4), false, true);
				var5.method538(-field1214, 0, 0);
				var5.method532();
				var5.method533(var4);
				var5.field1395 = null;
				var5.field1394 = null;

				if (var2.field1093 != 128 || var2.field1094 != 128) {
					var5.method541(var2.field1093, var2.field1093, var2.field1094);
				}

				var5.method542(var2.field1096 + 64, var2.field1097 + 850, -30, -50, -30, true);
				WEVRTBOZ[] var6 = new WEVRTBOZ[] { var1, var5 };
				var1 = new WEVRTBOZ(var6, true, 2);
			}
		}

		if (field750.field736 == 1) {
			var1.field1396 = true;
		}

		return var1;
	}

	@ObfuscatedName("JKNLPRIU.b(Z)Z")
	public final boolean method287() {
		if (field750 == null) {
			return false;
		}

		return true;
	}
}
