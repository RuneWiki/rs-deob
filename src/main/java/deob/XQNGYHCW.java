package deob;

@ObfuscatedName("XQNGYHCW")
public final class XQNGYHCW extends UOUXSBLI {

	@ObfuscatedName("XQNGYHCW.ub")
	public DUHKBPRV field1494;

	@ObfuscatedName("XQNGYHCW.b(I)LLSSDQDBV;")
	public final LSSDQDBV method583() {
		if (field1388 < 0 || field1391 != 0) {
			int var3 = -1;
			if (field1411 >= 0) {
				var3 = WOTIAWQC.field1470[field1411].field1472[field1412];
			}

			return field1494.method240(null, -1, var3);
		}

		int var1 = WOTIAWQC.field1470[field1388].field1472[field1389];
		int var2 = -1;
		if (field1411 >= 0 && field1411 != field1403) {
			var2 = WOTIAWQC.field1470[field1411].field1472[field1412];
		}

		return field1494.method240(WOTIAWQC.field1470[field1388].field1476, var2, var1);
	}

	@ObfuscatedName("XQNGYHCW.a(B)LLSSDQDBV;")
	public final LSSDQDBV method6() {
		if (field1494 == null) {
			return null;
		}

		LSSDQDBV var1 = method583();
		if (var1 == null) {
			return null;
		}

		field1382 = var1.field7;

		if (field1415 != -1 && field1416 != -1) {
			IMWZJOXU var2 = IMWZJOXU.field992[field1415];
			LSSDQDBV var3 = var2.method378();
			if (var3 != null) {
				int var4 = var2.field996.field1472[field1416];
				LSSDQDBV var5 = new LSSDQDBV(false, var3, YGZNOIUP.method599(var4), true);
				var5.method436(0, 0, -field1419);
				var5.method430();
				var5.method431(var4);
				var5.field1096 = null;
				var5.field1095 = null;

				if (var2.field999 != 128 || var2.field1000 != 128) {
					var5.method439(var2.field1000, var2.field999, var2.field999);
				}

				var5.method440(var2.field1002 + 64, var2.field1003 + 850, -30, -50, -30, true);
				LSSDQDBV[] var6 = new LSSDQDBV[] { var1, var5 };
				var1 = new LSSDQDBV(true, 2, var6);
			}
		}

		if (field1494.field652 == 1) {
			var1.field1097 = true;
		}

		return var1;
	}

	@ObfuscatedName("XQNGYHCW.b(B)Z")
	public final boolean method397() {
		if (field1494 == null) {
			return false;
		}

		return true;
	}
}
