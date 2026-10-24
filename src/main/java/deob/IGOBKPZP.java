package deob;

@ObfuscatedName("IGOBKPZP")
public final class IGOBKPZP extends SDXDPBJK {

	@ObfuscatedName("IGOBKPZP.sb")
	public TQRZOVPP field758;

	@ObfuscatedName("IGOBKPZP.a(Z)LGCSAWSJV;")
	public final GCSAWSJV method8() {
		if (field758 == null) {
			return null;
		}

		GCSAWSJV var1 = method303();
		if (var1 == null) {
			return null;
		}

		field1117 = var1.field7;

		if (field1078 != -1 && field1079 != -1) {
			JEPDVFCL var2 = JEPDVFCL.field793[field1078];
			GCSAWSJV var3 = var2.method332();
			if (var3 != null) {
				int var4 = var2.field797.field1420[field1079];
				GCSAWSJV var5 = new GCSAWSJV(var3, true, RLONYBCF.method436(var4), false);
				var5.method273(-field1082, 0, 0);
				var5.method267();
				var5.method268(var4);
				var5.field624 = null;
				var5.field623 = null;

				if (var2.field800 != 128 || var2.field801 != 128) {
					var5.method276(var2.field800, var2.field800, var2.field801);
				}

				var5.method277(var2.field803 + 64, var2.field804 + 850, -30, -50, -30, true);
				GCSAWSJV[] var6 = new GCSAWSJV[] { var1, var5 };
				var1 = new GCSAWSJV(true, var6, 2);
			}
		}

		if (field758.field1254 == 1) {
			var1.field625 = true;
		}

		return var1;
	}

	@ObfuscatedName("IGOBKPZP.a(B)Z")
	public final boolean method302() {
		if (field758 == null) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("IGOBKPZP.b(B)LGCSAWSJV;")
	public final GCSAWSJV method303() {
		if (field1105 < 0 || field1108 != 0) {
			int var3 = -1;
			if (field1102 >= 0) {
				var3 = XRDQTWLL.field1418[field1102].field1420[field1103];
			}

			return field758.method520(-1, null, var3);
		}

		int var1 = XRDQTWLL.field1418[field1105].field1420[field1106];
		int var2 = -1;
		if (field1102 >= 0 && field1102 != field1091) {
			var2 = XRDQTWLL.field1418[field1102].field1420[field1103];
		}

		return field758.method520(var2, XRDQTWLL.field1418[field1105].field1424, var1);
	}
}
