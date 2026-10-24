package deob;

@ObfuscatedName("FJJCITCO")
public final class FJJCITCO extends UKUMCXZT {

	@ObfuscatedName("FJJCITCO.qb")
	public UGDYQAXI field650;

	@ObfuscatedName("FJJCITCO.a(B)LGEUHTGZJ;")
	public final GEUHTGZJ method221() {
		if (field650 == null) {
			return null;
		}

		GEUHTGZJ var1 = method264();
		if (var1 == null) {
			return null;
		}

		field1353 = var1.field570;

		if (field1370 != -1 && field1371 != -1) {
			IDBAHLFM var2 = IDBAHLFM.field805[field1370];
			GEUHTGZJ var3 = var2.method323();
			if (var3 != null) {
				int var4 = var2.field809.field606[field1371];
				GEUHTGZJ var5 = new GEUHTGZJ(QWCFKPFT.method504(var4), var3, false, true);
				var5.method298(0, -field1374, 0);
				var5.method292();
				var5.method293(var4);
				var5.field746 = null;
				var5.field745 = null;

				if (var2.field812 != 128 || var2.field813 != 128) {
					var5.method301(var2.field813, var2.field812, var2.field812);
				}

				var5.method302(var2.field815 + 64, var2.field816 + 850, -30, -50, -30, true);
				GEUHTGZJ[] var6 = new GEUHTGZJ[] { var1, var5 };
				var1 = new GEUHTGZJ(var6, 2, true);
			}
		}

		if (field650.field1299 == 1) {
			var1.field747 = true;
		}

		return var1;
	}

	@ObfuscatedName("FJJCITCO.b(I)Z")
	public final boolean method263() {
		if (field650 == null) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("FJJCITCO.c(I)LGEUHTGZJ;")
	public final GEUHTGZJ method264() {
		if (field1339 < 0 || field1342 != 0) {
			int var3 = -1;
			if (field1354 >= 0) {
				var3 = EJHGNUGE.field604[field1354].field606[field1355];
			}

			return field650.method575(-1, var3, null);
		}

		int var1 = EJHGNUGE.field604[field1339].field606[field1340];
		int var2 = -1;
		if (field1354 >= 0 && field1354 != field1332) {
			var2 = EJHGNUGE.field604[field1354].field606[field1355];
		}

		return field650.method575(var2, var1, EJHGNUGE.field604[field1339].field610);
	}
}
