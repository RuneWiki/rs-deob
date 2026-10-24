package deob;

@ObfuscatedName("NVHCJIOR")
public final class NVHCJIOR extends OZYWPVDM {

	@ObfuscatedName("NVHCJIOR.xb")
	public XDDMQHDR field1051;

	@ObfuscatedName("NVHCJIOR.c(I)LNGYJLUVS;")
	public final NGYJLUVS method354() {
		if (field1211 < 0 || field1214 != 0) {
			int var3 = -1;
			if (field1220 >= 0) {
				var3 = KAIFCIAJ.field742[field1220].field744[field1221];
			}

			return field1051.method584(-1, var3, null);
		}

		int var1 = KAIFCIAJ.field742[field1211].field744[field1212];
		int var2 = -1;
		if (field1220 >= 0 && field1234 != field1220) {
			var2 = KAIFCIAJ.field742[field1220].field744[field1221];
		}

		return field1051.method584(var2, var1, KAIFCIAJ.field742[field1211].field748);
	}

	@ObfuscatedName("NVHCJIOR.a(I)LNGYJLUVS;")
	public final NGYJLUVS method206() {
		if (field1051 == null) {
			return null;
		}

		NGYJLUVS var1 = method354();
		if (var1 == null) {
			return null;
		}

		field1202 = var1.field845;

		if (field1193 != -1 && field1194 != -1) {
			FOXTQZWB var2 = FOXTQZWB.field603[field1193];
			NGYJLUVS var3 = var2.method210();
			if (var3 != null) {
				int var4 = var2.field607.field744[field1194];
				NGYJLUVS var5 = new NGYJLUVS(PHDJZMLE.method428(var4), true, var3, false);
				var5.method304(0, -field1197, 0);
				var5.method298();
				var5.method299(var4);
				var5.field891 = null;
				var5.field890 = null;

				if (var2.field610 != 128 || var2.field611 != 128) {
					var5.method307(var2.field610, var2.field610, var2.field611);
				}

				var5.method308(var2.field613 + 64, var2.field614 + 850, -30, -50, -30, true);
				NGYJLUVS[] var6 = new NGYJLUVS[] { var1, var5 };
				var1 = new NGYJLUVS(2, true, var6);
			}
		}

		if (field1051.field1497 == 1) {
			var1.field892 = true;
		}

		return var1;
	}

	@ObfuscatedName("NVHCJIOR.a(Z)Z")
	public final boolean method229() {
		if (field1051 == null) {
			return false;
		}

		return true;
	}
}
