package deob;

@ObfuscatedName("DLNPJUEQ")
public final class DLNPJUEQ extends BTOCNVPA {

	@ObfuscatedName("DLNPJUEQ.sb")
	public HEKJNUPL field561;

	@ObfuscatedName("DLNPJUEQ.a(B)LSNMMQNPZ;")
	public final SNMMQNPZ method175() {
		if (field561 == null) {
			return null;
		}

		SNMMQNPZ var1 = method176();
		if (var1 == null) {
			return null;
		}

		field78 = var1.field1400;

		if (field55 != -1 && field56 != -1) {
			NGIGHQOG var2 = NGIGHQOG.field986[field55];
			SNMMQNPZ var3 = var2.method351();
			if (var3 != null) {
				int var4 = var2.field990.field1483[field56];
				SNMMQNPZ var5 = new SNMMQNPZ(var3, false, true, NLIOLBXV.method356(var4));
				var5.method431(0, -field59, 0);
				var5.method425();
				var5.method426(var4);
				var5.field1185 = null;
				var5.field1184 = null;

				if (var2.field993 != 128 || var2.field994 != 128) {
					var5.method434(var2.field993, var2.field993, var2.field994);
				}

				var5.method435(var2.field996 + 64, var2.field997 + 850, -30, -50, -30, true);
				SNMMQNPZ[] var6 = new SNMMQNPZ[] { var1, var5 };
				var1 = new SNMMQNPZ(true, 2, var6);
			}
		}

		if (field561.field652 == 1) {
			var1.field1186 = true;
		}

		return var1;
	}

	@ObfuscatedName("DLNPJUEQ.a(Z)Z")
	public final boolean method20() {
		if (field561 == null) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("DLNPJUEQ.c(B)LSNMMQNPZ;")
	public final SNMMQNPZ method176() {
		if (field84 < 0 || field87 != 0) {
			int var3 = -1;
			if (field45 >= 0) {
				var3 = ZGXCNUJM.field1481[field45].field1483[field46];
			}

			return field561.method268(var3, null, -1);
		}

		int var1 = ZGXCNUJM.field1481[field84].field1483[field85];
		int var2 = -1;
		if (field45 >= 0 && field62 != field45) {
			var2 = ZGXCNUJM.field1481[field45].field1483[field46];
		}

		return field561.method268(var1, ZGXCNUJM.field1481[field84].field1487, var2);
	}
}
