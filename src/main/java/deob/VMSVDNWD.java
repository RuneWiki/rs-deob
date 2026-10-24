package deob;

@ObfuscatedName("VMSVDNWD")
public final class VMSVDNWD extends QQSLPTGQ {

	@ObfuscatedName("VMSVDNWD.rb")
	public RDFTXEYV field1304;

	@ObfuscatedName("VMSVDNWD.a(B)LKUGNQTGL;")
	public final KUGNQTGL method40() {
		if (field1304 == null) {
			return null;
		}

		KUGNQTGL var1 = method480();
		if (var1 == null) {
			return null;
		}

		field1122 = var1.field1450;

		if (field1077 != -1 && field1078 != -1) {
			JXKRPXFX var2 = JXKRPXFX.field632[field1077];
			KUGNQTGL var3 = var2.method308();
			if (var3 != null) {
				int var4 = var2.field636.field953[field1078];
				KUGNQTGL var5 = new KUGNQTGL(var3, false, true, SCWTQUFK.method455(var4));
				var5.method343(0, 0, -field1081);
				var5.method337();
				var5.method338(var4);
				var5.field702 = null;
				var5.field701 = null;

				if (var2.field639 != 128 || var2.field640 != 128) {
					var5.method346(var2.field639, var2.field639, var2.field640);
				}

				var5.method347(var2.field642 + 64, var2.field643 + 850, -30, -50, -30, true);
				KUGNQTGL[] var6 = new KUGNQTGL[] { var1, var5 };
				var1 = new KUGNQTGL(var6, true, 2);
			}
		}

		if (field1304.field1186 == 1) {
			var1.field703 = true;
		}

		return var1;
	}

	@ObfuscatedName("VMSVDNWD.a(Z)LKUGNQTGL;")
	public final KUGNQTGL method480() {
		if (field1105 < 0 || field1108 != 0) {
			int var3 = -1;
			if (field1102 >= 0) {
				var3 = PQTJDTHH.field951[field1102].field953[field1103];
			}

			return field1304.method435(var3, -1, null);
		}

		int var1 = PQTJDTHH.field951[field1105].field953[field1106];
		int var2 = -1;
		if (field1102 >= 0 && field1113 != field1102) {
			var2 = PQTJDTHH.field951[field1102].field953[field1103];
		}

		return field1304.method435(var1, var2, PQTJDTHH.field951[field1105].field957);
	}

	@ObfuscatedName("VMSVDNWD.b(I)Z")
	public final boolean method433() {
		if (field1304 == null) {
			return false;
		}

		return true;
	}
}
