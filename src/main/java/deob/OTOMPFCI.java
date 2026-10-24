package deob;

@ObfuscatedName("OTOMPFCI")
public final class OTOMPFCI extends BBWFUJHQ {

	@ObfuscatedName("OTOMPFCI.ub")
	public WHKCNEXD field894;

	@ObfuscatedName("OTOMPFCI.a(Z)LYABPKWWG;")
	public final YABPKWWG method16() {
		if (field894 == null) {
			return null;
		}

		YABPKWWG var1 = method378();
		if (var1 == null) {
			return null;
		}

		field47 = var1.field28;

		if (field70 != -1 && field71 != -1) {
			CIVOPMKV var2 = CIVOPMKV.field114[field70];
			YABPKWWG var3 = var2.method32();
			if (var3 != null) {
				int var4 = var2.field118.field1463[field71];
				YABPKWWG var5 = new YABPKWWG(var3, HQHBJEDA.method219(var4), true, false);
				var5.method561(0, 0, -field74);
				var5.method555();
				var5.method556(var4);
				var5.field1415 = null;
				var5.field1414 = null;

				if (var2.field121 != 128 || var2.field122 != 128) {
					var5.method564(var2.field122, var2.field121, var2.field121);
				}

				var5.method565(var2.field124 + 64, var2.field125 + 850, -30, -50, -30, true);
				YABPKWWG[] var6 = new YABPKWWG[] { var1, var5 };
				var1 = new YABPKWWG(2, var6, true);
			}
		}

		if (field894.field1343 == 1) {
			var1.field1416 = true;
		}

		return var1;
	}

	@ObfuscatedName("OTOMPFCI.b(I)Z")
	public final boolean method21() {
		if (field894 == null) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("OTOMPFCI.c(I)LYABPKWWG;")
	public final YABPKWWG method378() {
		if (field31 < 0 || field34 != 0) {
			int var3 = -1;
			if (field57 >= 0) {
				var3 = ZKWMIVTX.field1461[field57].field1463[field58];
			}

			return field894.method520(null, var3, -1);
		}

		int var1 = ZKWMIVTX.field1461[field31].field1463[field32];
		int var2 = -1;
		if (field57 >= 0 && field78 != field57) {
			var2 = ZKWMIVTX.field1461[field57].field1463[field58];
		}

		return field894.method520(ZKWMIVTX.field1461[field31].field1467, var1, var2);
	}
}
