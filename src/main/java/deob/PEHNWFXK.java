package deob;

@ObfuscatedName("PEHNWFXK")
public final class PEHNWFXK extends NNWGJIGN {

	@ObfuscatedName("PEHNWFXK.sb")
	public PIPBZEOV field1056;

	@ObfuscatedName("PEHNWFXK.a(I)Z")
	public final boolean method325() {
		if (field1056 == null) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("PEHNWFXK.b(I)LIYSWJGDE;")
	public final IYSWJGDE method392() {
		if (field1009 < 0 || field1012 != 0) {
			int var3 = -1;
			if (field988 >= 0) {
				var3 = KMWMLVIH.field825[field988].field827[field989];
			}

			return field1056.method401(null, var3, -1);
		}

		int var1 = KMWMLVIH.field825[field1009].field827[field1010];
		int var2 = -1;
		if (field988 >= 0 && field988 != field967) {
			var2 = KMWMLVIH.field825[field988].field827[field989];
		}

		return field1056.method401(KMWMLVIH.field825[field1009].field831, var1, var2);
	}

	@ObfuscatedName("PEHNWFXK.a(Z)LIYSWJGDE;")
	public final IYSWJGDE method2() {
		if (field1056 == null) {
			return null;
		}

		IYSWJGDE var1 = method392();
		if (var1 == null) {
			return null;
		}

		field965 = var1.field793;

		if (field995 != -1 && field996 != -1) {
			RTDMFIDA var2 = RTDMFIDA.field1201[field995];
			IYSWJGDE var3 = var2.method448();
			if (var3 != null) {
				int var4 = var2.field1205.field827[field996];
				IYSWJGDE var5 = new IYSWJGDE(PLSPTEPI.method406(var4), var3, true, false);
				var5.method286(-field999, 0, 0);
				var5.method280();
				var5.method281(var4);
				var5.field751 = null;
				var5.field750 = null;

				if (var2.field1208 != 128 || var2.field1209 != 128) {
					var5.method289(var2.field1208, var2.field1208, var2.field1209);
				}

				var5.method290(var2.field1211 + 64, var2.field1212 + 850, -30, -50, -30, true);
				IYSWJGDE[] var6 = new IYSWJGDE[] { var1, var5 };
				var1 = new IYSWJGDE(var6, 2, true);
			}
		}

		if (field1056.field1095 == 1) {
			var1.field752 = true;
		}

		return var1;
	}
}
