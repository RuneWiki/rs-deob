package deob;

@ObfuscatedName("RLTBSHTA")
public final class RLTBSHTA extends OKXNBSEJ {

	@ObfuscatedName("RLTBSHTA.vb")
	public ZLQCXMFK field1112;

	@ObfuscatedName("RLTBSHTA.a(Z)Z")
	public final boolean method342() {
		if (field1112 == null) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("RLTBSHTA.c(I)LIEHKDFMR;")
	public final IEHKDFMR method389() {
		if (field942 < 0 || field945 != 0) {
			int var3 = -1;
			if (field955 >= 0) {
				var3 = VYXELYSX.field1273[field955].field1275[field956];
			}

			return field1112.method512(-1, null, var3);
		}

		int var1 = VYXELYSX.field1273[field942].field1275[field943];
		int var2 = -1;
		if (field955 >= 0 && field955 != field919) {
			var2 = VYXELYSX.field1273[field955].field1275[field956];
		}

		return field1112.method512(var2, VYXELYSX.field1273[field942].field1279, var1);
	}

	@ObfuscatedName("RLTBSHTA.a(I)LIEHKDFMR;")
	public final IEHKDFMR method24() {
		if (field1112 == null) {
			return null;
		}

		IEHKDFMR var1 = method389();
		if (var1 == null) {
			return null;
		}

		field912 = var1.field605;

		if (field921 != -1 && field922 != -1) {
			SDNQJNMP var2 = SDNQJNMP.field1127[field921];
			IEHKDFMR var3 = var2.method396();
			if (var3 != null) {
				int var4 = var2.field1131.field1275[field922];
				IEHKDFMR var5 = new IEHKDFMR(false, NXEWQQJO.method337(var4), var3, true);
				var5.method280(0, 0, -field925);
				var5.method274();
				var5.method275(var4);
				var5.field694 = null;
				var5.field693 = null;

				if (var2.field1134 != 128 || var2.field1135 != 128) {
					var5.method283(var2.field1134, var2.field1135, var2.field1134);
				}

				var5.method284(var2.field1137 + 64, var2.field1138 + 850, -30, -50, -30, true);
				IEHKDFMR[] var6 = new IEHKDFMR[] { var1, var5 };
				var1 = new IEHKDFMR(true, 2, var6);
			}
		}

		if (field1112.field1429 == 1) {
			var1.field695 = true;
		}

		return var1;
	}
}
