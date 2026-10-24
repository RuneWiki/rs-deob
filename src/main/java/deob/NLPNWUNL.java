package deob;

@ObfuscatedName("NLPNWUNL")
public final class NLPNWUNL extends QQAAMZPI {

	@ObfuscatedName("NLPNWUNL.vb")
	public RBTWCHLG field908;

	@ObfuscatedName("NLPNWUNL.c(I)LRTQSBWRH;")
	public final RTQSBWRH method385() {
		if (field1035 < 0 || field1038 != 0) {
			int var3 = -1;
			if (field1013 >= 0) {
				var3 = LCRVYGCP.field795[field1013].field797[field1014];
			}

			return field908.method443(null, -1, var3);
		}

		int var1 = LCRVYGCP.field795[field1035].field797[field1036];
		int var2 = -1;
		if (field1013 >= 0 && field1013 != field1009) {
			var2 = LCRVYGCP.field795[field1013].field797[field1014];
		}

		return field908.method443(LCRVYGCP.field795[field1035].field801, var2, var1);
	}

	@ObfuscatedName("NLPNWUNL.a(Z)Z")
	public final boolean method244() {
		if (field908 == null) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("NLPNWUNL.a(I)LRTQSBWRH;")
	public final RTQSBWRH method199() {
		if (field908 == null) {
			return null;
		}

		RTQSBWRH var1 = method385();
		if (var1 == null) {
			return null;
		}

		field1024 = var1.field602;

		if (field991 != -1 && field992 != -1) {
			UAVNMKVJ var2 = UAVNMKVJ.field1333[field991];
			RTQSBWRH var3 = var2.method502();
			if (var3 != null) {
				int var4 = var2.field1337.field797[field992];
				RTQSBWRH var5 = new RTQSBWRH(true, EMBMBPSC.method229(var4), var3, false);
				var5.method467(-field995, 0, 0);
				var5.method461();
				var5.method462(var4);
				var5.field1127 = null;
				var5.field1126 = null;

				if (var2.field1340 != 128 || var2.field1341 != 128) {
					var5.method470(var2.field1341, var2.field1340, var2.field1340);
				}

				var5.method471(var2.field1343 + 64, var2.field1344 + 850, -30, -50, -30, true);
				RTQSBWRH[] var6 = new RTQSBWRH[] { var1, var5 };
				var1 = new RTQSBWRH(var6, true, 2);
			}
		}

		if (field908.field1053 == 1) {
			var1.field1128 = true;
		}

		return var1;
	}
}
