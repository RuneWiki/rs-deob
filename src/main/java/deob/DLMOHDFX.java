package deob;

@ObfuscatedName("DLMOHDFX")
public final class DLMOHDFX extends DSYLCNKR {

	@ObfuscatedName("DLMOHDFX.tb")
	public KFUEEJVZ field599;

	@ObfuscatedName("DLMOHDFX.a(I)LVYUQHOMO;")
	public final VYUQHOMO method13() {
		if (field599 == null) {
			return null;
		}

		VYUQHOMO var1 = method191();
		if (var1 == null) {
			return null;
		}

		field661 = var1.field827;

		if (field640 != -1 && field641 != -1) {
			BKJQHSVH var2 = BKJQHSVH.field53[field640];
			VYUQHOMO var3 = var2.method16();
			if (var3 != null) {
				int var4 = var2.field57.field1046[field641];
				VYUQHOMO var5 = new VYUQHOMO(true, APJPJMYV.method11(var4), var3, false);
				var5.method420(0, -field644, 0);
				var5.method414();
				var5.method415(var4);
				var5.field1323 = null;
				var5.field1322 = null;

				if (var2.field60 != 128 || var2.field61 != 128) {
					var5.method423(var2.field60, var2.field61, var2.field60);
				}

				var5.method424(var2.field63 + 64, var2.field64 + 850, -30, -50, -30, true);
				VYUQHOMO[] var6 = new VYUQHOMO[] { var1, var5 };
				var1 = new VYUQHOMO(true, 2, var6);
			}
		}

		if (field599.field865 == 1) {
			var1.field1324 = true;
		}

		return var1;
	}

	@ObfuscatedName("DLMOHDFX.b(Z)LVYUQHOMO;")
	public final VYUQHOMO method191() {
		if (field611 < 0 || field614 != 0) {
			int var3 = -1;
			if (field646 >= 0) {
				var3 = MJVHTYCA.field1044[field646].field1046[field647];
			}

			return field599.method264(var3, null, -1);
		}

		int var1 = MJVHTYCA.field1044[field611].field1046[field612];
		int var2 = -1;
		if (field646 >= 0 && field659 != field646) {
			var2 = MJVHTYCA.field1044[field646].field1046[field647];
		}

		return field599.method264(var1, MJVHTYCA.field1044[field611].field1050, var2);
	}

	@ObfuscatedName("DLMOHDFX.b(I)Z")
	public final boolean method192() {
		if (field599 == null) {
			return false;
		}

		return true;
	}
}
