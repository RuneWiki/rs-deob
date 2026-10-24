package deob;

@ObfuscatedName("CMGLYFCQ")
public final class CMGLYFCQ extends YOWFBYTG {

	@ObfuscatedName("CMGLYFCQ.rb")
	public FKIKYVJJ field591;

	@ObfuscatedName("CMGLYFCQ.b(I)LOIBEFFXI;")
	public final OIBEFFXI method167() {
		if (field1376 < 0 || field1379 != 0) {
			int var3 = -1;
			if (field1373 >= 0) {
				var3 = CGWBYVFN.field150[field1373].field152[field1374];
			}

			return field591.method208(null, var3, -1);
		}

		int var1 = CGWBYVFN.field150[field1376].field152[field1377];
		int var2 = -1;
		if (field1373 >= 0 && field1387 != field1373) {
			var2 = CGWBYVFN.field150[field1373].field152[field1374];
		}

		return field591.method208(CGWBYVFN.field150[field1376].field156, var1, var2);
	}

	@ObfuscatedName("CMGLYFCQ.a(Z)LOIBEFFXI;")
	public final OIBEFFXI method2() {
		if (field591 == null) {
			return null;
		}

		OIBEFFXI var1 = method167();
		if (var1 == null) {
			return null;
		}

		field1359 = var1.field1333;

		if (field1381 != -1 && field1382 != -1) {
			IDQQUVDL var2 = IDQQUVDL.field738[field1381];
			OIBEFFXI var3 = var2.method233();
			if (var3 != null) {
				int var4 = var2.field742.field152[field1382];
				OIBEFFXI var5 = new OIBEFFXI(false, true, var3, UXVWESOT.method455(var4));
				var5.method359(0, 0, -field1385);
				var5.method353();
				var5.method354(var4);
				var5.field985 = null;
				var5.field984 = null;

				if (var2.field745 != 128 || var2.field746 != 128) {
					var5.method362(var2.field746, var2.field745, var2.field745);
				}

				var5.method363(var2.field748 + 64, var2.field749 + 850, -30, -50, -30, true);
				OIBEFFXI[] var6 = new OIBEFFXI[] { var1, var5 };
				var1 = new OIBEFFXI(2, var6, true);
			}
		}

		if (field591.field671 == 1) {
			var1.field986 = true;
		}

		return var1;
	}

	@ObfuscatedName("CMGLYFCQ.a(I)Z")
	public final boolean method1() {
		if (field591 == null) {
			return false;
		}

		return true;
	}
}
