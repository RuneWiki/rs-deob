package deob;

@ObfuscatedName("TBFTCCSF")
public final class TBFTCCSF extends XOZCTLMB {

	@ObfuscatedName("TBFTCCSF.tb")
	public JRELGTVY field1187;

	@ObfuscatedName("TBFTCCSF.a(B)LFLXAIVEA;")
	public final FLXAIVEA method190() {
		if (field1187 == null) {
			return null;
		}

		FLXAIVEA var1 = method441();
		if (var1 == null) {
			return null;
		}

		field1421 = var1.field770;

		if (field1407 != -1 && field1408 != -1) {
			OKJTNJLE var2 = OKJTNJLE.field1046[field1407];
			FLXAIVEA var3 = var2.method305();
			if (var3 != null) {
				int var4 = var2.field1050.field77[field1408];
				FLXAIVEA var5 = new FLXAIVEA(var3, NFWEZFJY.method302(var4), true, false);
				var5.method231(0, -field1411, 0);
				var5.method225();
				var5.method226(var4);
				var5.field716 = null;
				var5.field715 = null;

				if (var2.field1053 != 128 || var2.field1054 != 128) {
					var5.method234(var2.field1053, var2.field1053, var2.field1054);
				}

				var5.method235(var2.field1056 + 64, var2.field1057 + 850, -30, -50, -30, true);
				FLXAIVEA[] var6 = new FLXAIVEA[] { var1, var5 };
				var1 = new FLXAIVEA(2, true, var6);
			}
		}

		if (field1187.field948 == 1) {
			var1.field717 = true;
		}

		return var1;
	}

	@ObfuscatedName("TBFTCCSF.c(I)LFLXAIVEA;")
	public final FLXAIVEA method441() {
		if (field1424 < 0 || field1427 != 0) {
			int var3 = -1;
			if (field1400 >= 0) {
				var3 = BKDXLPEF.field75[field1400].field77[field1401];
			}

			return field1187.method270(null, -1, var3);
		}

		int var1 = BKDXLPEF.field75[field1424].field77[field1425];
		int var2 = -1;
		if (field1400 >= 0 && field1414 != field1400) {
			var2 = BKDXLPEF.field75[field1400].field77[field1401];
		}

		return field1187.method270(BKDXLPEF.field75[field1424].field81, var2, var1);
	}

	@ObfuscatedName("TBFTCCSF.b(I)Z")
	public final boolean method442() {
		if (field1187 == null) {
			return false;
		}

		return true;
	}
}
