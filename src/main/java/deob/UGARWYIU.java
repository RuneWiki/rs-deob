package deob;

@ObfuscatedName("UGARWYIU")
public final class UGARWYIU extends RODHPQMW {

	@ObfuscatedName("UGARWYIU.pb")
	public BJGOYLYN field1261;

	@ObfuscatedName("UGARWYIU.b(B)Z")
	public final boolean method408() {
		if (field1261 == null) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("UGARWYIU.c(B)LUNLYQRUD;")
	public final UNLYQRUD method437() {
		if (field1162 < 0 || field1165 != 0) {
			int var3 = -1;
			if (field1199 >= 0) {
				var3 = PVVHTYPN.field1006[field1199].field1008[field1200];
			}

			return field1261.method2(-1, null, var3);
		}

		int var1 = PVVHTYPN.field1006[field1162].field1008[field1163];
		int var2 = -1;
		if (field1199 >= 0 && field1199 != field1149) {
			var2 = PVVHTYPN.field1006[field1199].field1008[field1200];
		}

		return field1261.method2(var2, PVVHTYPN.field1006[field1162].field1012, var1);
	}

	@ObfuscatedName("UGARWYIU.a(B)LUNLYQRUD;")
	public final UNLYQRUD method10() {
		if (field1261 == null) {
			return null;
		}

		UNLYQRUD var1 = method437();
		if (var1 == null) {
			return null;
		}

		field1151 = var1.field53;

		if (field1170 != -1 && field1171 != -1) {
			TYXORIIC var2 = TYXORIIC.field1248[field1170];
			UNLYQRUD var3 = var2.method436();
			if (var3 != null) {
				int var4 = var2.field1252.field1008[field1171];
				UNLYQRUD var5 = new UNLYQRUD(true, var3, false, DHMWVSMI.method178(var4));
				var5.method455(-field1174, 0, 0);
				var5.method449();
				var5.method450(var4);
				var5.field1299 = null;
				var5.field1298 = null;

				if (var2.field1255 != 128 || var2.field1256 != 128) {
					var5.method458(var2.field1255, var2.field1256, var2.field1255);
				}

				var5.method459(var2.field1258 + 64, var2.field1259 + 850, -30, -50, -30, true);
				UNLYQRUD[] var6 = new UNLYQRUD[] { var1, var5 };
				var1 = new UNLYQRUD(2, var6, true);
			}
		}

		if (field1261.field28 == 1) {
			var1.field1300 = true;
		}

		return var1;
	}
}
