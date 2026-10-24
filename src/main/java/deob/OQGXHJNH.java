package deob;

@ObfuscatedName("OQGXHJNH")
public final class OQGXHJNH extends SXZSKNOI {

	@ObfuscatedName("OQGXHJNH.qb")
	public COIHKGSL field815;

	@ObfuscatedName("OQGXHJNH.a(Z)LYYHPBDED;")
	public final YYHPBDED method2() {
		if (field815 == null) {
			return null;
		}

		YYHPBDED var1 = method363();
		if (var1 == null) {
			return null;
		}

		field1063 = var1.field2;

		if (field1013 != -1 && field1014 != -1) {
			OQOGSGFM var2 = OQOGSGFM.field817[field1013];
			YYHPBDED var3 = var2.method366();
			if (var3 != null) {
				int var4 = var2.field821.field661[field1014];
				YYHPBDED var5 = new YYHPBDED(false, var3, true, VPISXBMB.method513(var4));
				var5.method564(-field1017, 0, 0);
				var5.method558();
				var5.method559(var4);
				var5.field1377 = null;
				var5.field1376 = null;

				if (var2.field824 != 128 || var2.field825 != 128) {
					var5.method567(var2.field825, var2.field824, var2.field824);
				}

				var5.method568(var2.field827 + 64, var2.field828 + 850, -30, -50, -30, true);
				YYHPBDED[] var6 = new YYHPBDED[] { var1, var5 };
				var1 = new YYHPBDED(var6, true, 2);
			}
		}

		if (field815.field526 == 1) {
			var1.field1378 = true;
		}

		return var1;
	}

	@ObfuscatedName("OQGXHJNH.b(I)LYYHPBDED;")
	public final YYHPBDED method363() {
		if (field1047 < 0 || field1050 != 0) {
			int var3 = -1;
			if (field1058 >= 0) {
				var3 = JFYFSKVR.field659[field1058].field661[field1059];
			}

			return field815.method166(var3, null, -1);
		}

		int var1 = JFYFSKVR.field659[field1047].field661[field1048];
		int var2 = -1;
		if (field1058 >= 0 && field1058 != field1052) {
			var2 = JFYFSKVR.field659[field1058].field661[field1059];
		}

		return field815.method166(var1, JFYFSKVR.field659[field1047].field665, var2);
	}

	@ObfuscatedName("OQGXHJNH.a(I)Z")
	public final boolean method273() {
		if (field815 == null) {
			return false;
		}

		return true;
	}
}
