package deob;

@ObfuscatedName("AHIOLHWV")
public final class AHIOLHWV extends DGZJCXBC {

	@ObfuscatedName("AHIOLHWV.ub")
	public FWGUGZKU field1;

	@ObfuscatedName("AHIOLHWV.b(Z)Z")
	public final boolean method1() {
		if (field1 == null) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("AHIOLHWV.a(Z)LITSMSHJO;")
	public final ITSMSHJO method2() {
		if (field1 == null) {
			return null;
		}

		ITSMSHJO var1 = method3();
		if (var1 == null) {
			return null;
		}

		field530 = var1.field1174;

		if (field557 != -1 && field558 != -1) {
			FPSNPMMW var2 = FPSNPMMW.field641[field557];
			ITSMSHJO var3 = var2.method206();
			if (var3 != null) {
				int var4 = var2.field645.field714[field558];
				ITSMSHJO var5 = new ITSMSHJO(var3, SCIASJXX.method401(var4), false, true);
				var5.method251(0, 0, -field561);
				var5.method245();
				var5.method246(var4);
				var5.field785 = null;
				var5.field784 = null;

				if (var2.field648 != 128 || var2.field649 != 128) {
					var5.method254(var2.field648, var2.field648, var2.field649);
				}

				var5.method255(var2.field651 + 64, var2.field652 + 850, -30, -50, -30, true);
				ITSMSHJO[] var6 = new ITSMSHJO[] { var1, var5 };
				var1 = new ITSMSHJO(true, var6, 2);
			}
		}

		if (field1.field681 == 1) {
			var1.field786 = true;
		}

		return var1;
	}

	@ObfuscatedName("AHIOLHWV.b(I)LITSMSHJO;")
	public final ITSMSHJO method3() {
		if (field532 < 0 || field535 != 0) {
			int var3 = -1;
			if (field537 >= 0) {
				var3 = HZCWGKOF.field712[field537].field714[field538];
			}

			return field1.method212(var3, null, -1);
		}

		int var1 = HZCWGKOF.field712[field532].field714[field533];
		int var2 = -1;
		if (field537 >= 0 && field541 != field537) {
			var2 = HZCWGKOF.field712[field537].field714[field538];
		}

		return field1.method212(var1, HZCWGKOF.field712[field532].field718, var2);
	}
}
