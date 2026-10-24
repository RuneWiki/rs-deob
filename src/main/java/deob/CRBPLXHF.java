package deob;

@ObfuscatedName("CRBPLXHF")
public final class CRBPLXHF extends FWNRUNYO {

	@ObfuscatedName("CRBPLXHF.sb")
	public DOBKXCMM field473;

	@ObfuscatedName("CRBPLXHF.a(B)LDHUPIIUL;")
	public final DHUPIIUL method159() {
		if (field473 == null) {
			return null;
		}

		DHUPIIUL var1 = method160();
		if (var1 == null) {
			return null;
		}

		field806 = var1.field700;

		if (field800 != -1 && field801 != -1) {
			YTBPTACV var2 = YTBPTACV.field1460[field800];
			DHUPIIUL var3 = var2.method582();
			if (var3 != null) {
				int var4 = var2.field1464.field842[field801];
				DHUPIIUL var5 = new DHUPIIUL(var3, false, BWSGQYNU.method16(var4), true);
				var5.method204(0, 0, -field804);
				var5.method198();
				var5.method199(var4);
				var5.field576 = null;
				var5.field575 = null;

				if (var2.field1467 != 128 || var2.field1468 != 128) {
					var5.method207(var2.field1467, var2.field1468, var2.field1467);
				}

				var5.method208(var2.field1470 + 64, var2.field1471 + 850, -30, -50, -30, true);
				DHUPIIUL[] var6 = new DHUPIIUL[] { var1, var5 };
				var1 = new DHUPIIUL(true, 2, var6);
			}
		}

		if (field473.field680 == 1) {
			var1.field577 = true;
		}

		return var1;
	}

	@ObfuscatedName("CRBPLXHF.a(I)LDHUPIIUL;")
	public final DHUPIIUL method160() {
		if (field794 < 0 || field797 != 0) {
			int var3 = -1;
			if (field774 >= 0) {
				var3 = HARRRJHW.field840[field774].field842[field775];
			}

			return field473.method237(-1, null, var3);
		}

		int var1 = HARRRJHW.field840[field794].field842[field795];
		int var2 = -1;
		if (field774 >= 0 && field774 != field756) {
			var2 = HARRRJHW.field840[field774].field842[field775];
		}

		return field473.method237(var2, HARRRJHW.field840[field794].field846, var1);
	}

	@ObfuscatedName("CRBPLXHF.b(B)Z")
	public final boolean method161() {
		if (field473 == null) {
			return false;
		}

		return true;
	}
}
