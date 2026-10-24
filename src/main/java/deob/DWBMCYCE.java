package deob;

@ObfuscatedName("DWBMCYCE")
public final class DWBMCYCE extends XEGGEBDS {

	@ObfuscatedName("DWBMCYCE.vb")
	public APPQAEOL field536;

	@ObfuscatedName("DWBMCYCE.c(I)LJUQSYEMB;")
	public final JUQSYEMB method165() {
		if (field1345 < 0 || field1348 != 0) {
			int var3 = -1;
			if (field1323 >= 0) {
				var3 = KYGPROVJ.field828[field1323].field830[field1324];
			}

			return field536.method7(-1, null, var3);
		}

		int var1 = KYGPROVJ.field828[field1345].field830[field1346];
		int var2 = -1;
		if (field1323 >= 0 && field1360 != field1323) {
			var2 = KYGPROVJ.field828[field1323].field830[field1324];
		}

		return field536.method7(var2, KYGPROVJ.field828[field1345].field834, var1);
	}

	@ObfuscatedName("DWBMCYCE.b(I)Z")
	public final boolean method166() {
		if (field536 == null) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("DWBMCYCE.a(I)LJUQSYEMB;")
	public final JUQSYEMB method167() {
		if (field536 == null) {
			return null;
		}

		JUQSYEMB var1 = method165();
		if (var1 == null) {
			return null;
		}

		field1338 = var1.field1049;

		if (field1328 != -1 && field1329 != -1) {
			PHXJLMVH var2 = PHXJLMVH.field975[field1328];
			JUQSYEMB var3 = var2.method414();
			if (var3 != null) {
				int var4 = var2.field979.field830[field1329];
				JUQSYEMB var5 = new JUQSYEMB(false, true, var3, YYYUATIU.method579(var4));
				var5.method225(0, 0, -field1332);
				var5.method219();
				var5.method220(var4);
				var5.field712 = null;
				var5.field711 = null;

				if (var2.field982 != 128 || var2.field983 != 128) {
					var5.method228(var2.field982, var2.field983, var2.field982);
				}

				var5.method229(var2.field985 + 64, var2.field986 + 850, -30, -50, -30, true);
				JUQSYEMB[] var6 = new JUQSYEMB[] { var1, var5 };
				var1 = new JUQSYEMB(true, var6, 2);
			}
		}

		if (field536.field8 == 1) {
			var1.field713 = true;
		}

		return var1;
	}
}
