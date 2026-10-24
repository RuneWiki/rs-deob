package deob;

@ObfuscatedName("ACKJULTZ")
public final class ACKJULTZ extends JXGMYPJH {

	@ObfuscatedName("ACKJULTZ.qb")
	public LQFHJGYA field1;

	@ObfuscatedName("ACKJULTZ.c(B)Z")
	public final boolean method1() {
		if (field1 == null) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("ACKJULTZ.a(Z)LPDVZPZLT;")
	public final PDVZPZLT method2() {
		if (field823 < 0 || field826 != 0) {
			int var3 = -1;
			if (field836 >= 0) {
				var3 = JZFUUSFN.field841[field836].field843[field837];
			}

			return field1.method317(null, var3, -1);
		}

		int var1 = JZFUUSFN.field841[field823].field843[field824];
		int var2 = -1;
		if (field836 >= 0 && field836 != field832) {
			var2 = JZFUUSFN.field841[field836].field843[field837];
		}

		return field1.method317(JZFUUSFN.field841[field823].field847, var1, var2);
	}

	@ObfuscatedName("ACKJULTZ.a(B)LPDVZPZLT;")
	public final PDVZPZLT method3() {
		if (field1 == null) {
			return null;
		}

		PDVZPZLT var1 = method2();
		if (var1 == null) {
			return null;
		}

		field785 = var1.field1483;

		if (field790 != -1 && field791 != -1) {
			MBSSGBHW var2 = MBSSGBHW.field927[field790];
			PDVZPZLT var3 = var2.method343();
			if (var3 != null) {
				int var4 = var2.field931.field843[field791];
				PDVZPZLT var5 = new PDVZPZLT(var3, true, YPRWORMV.method602(var4), false);
				var5.method427(0, -field794, 0);
				var5.method421();
				var5.method422(var4);
				var5.field1166 = null;
				var5.field1165 = null;

				if (var2.field934 != 128 || var2.field935 != 128) {
					var5.method430(var2.field934, var2.field935, var2.field934);
				}

				var5.method431(var2.field937 + 64, var2.field938 + 850, -30, -50, -30, true);
				PDVZPZLT[] var6 = new PDVZPZLT[] { var1, var5 };
				var1 = new PDVZPZLT(var6, true, 2);
			}
		}

		if (field1.field888 == 1) {
			var1.field1167 = true;
		}

		return var1;
	}
}
