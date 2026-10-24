package deob;

@ObfuscatedName("PNBDNSXO")
public final class PNBDNSXO extends ITPGSHXV {

	@ObfuscatedName("PNBDNSXO.tb")
	public BYABUZFP field1003;

	@ObfuscatedName("PNBDNSXO.a(I)LNJPATAFL;")
	public final NJPATAFL method206() {
		if (field1003 == null) {
			return null;
		}

		NJPATAFL var1 = method412();
		if (var1 == null) {
			return null;
		}

		field709 = var1.field771;

		if (field736 != -1 && field737 != -1) {
			SNGXEJOJ var2 = SNGXEJOJ.field1217[field736];
			NJPATAFL var3 = var2.method478();
			if (var3 != null) {
				int var4 = var2.field1221.field1244[field737];
				NJPATAFL var5 = new NJPATAFL(TDFMBTLA.method491(var4), false, true, var3);
				var5.method347(0, 0, -field740);
				var5.method341();
				var5.method342(var4);
				var5.field874 = null;
				var5.field873 = null;

				if (var2.field1224 != 128 || var2.field1225 != 128) {
					var5.method350(var2.field1224, var2.field1224, var2.field1225);
				}

				var5.method351(var2.field1227 + 64, var2.field1228 + 850, -30, -50, -30, true);
				NJPATAFL[] var6 = new NJPATAFL[] { var1, var5 };
				var1 = new NJPATAFL(2, var6, true);
			}
		}

		if (field1003.field41 == 1) {
			var1.field875 = true;
		}

		return var1;
	}

	@ObfuscatedName("PNBDNSXO.b(I)Z")
	public final boolean method241() {
		if (field1003 == null) {
			return false;
		}

		return true;
	}

	@ObfuscatedName("PNBDNSXO.c(I)LNJPATAFL;")
	public final NJPATAFL method412() {
		if (field700 < 0 || field703 != 0) {
			int var3 = -1;
			if (field712 >= 0) {
				var3 = TLXFHCOO.field1242[field712].field1244[field713];
			}

			return field1003.method28(null, -1, var3);
		}

		int var1 = TLXFHCOO.field1242[field700].field1244[field701];
		int var2 = -1;
		if (field712 >= 0 && field726 != field712) {
			var2 = TLXFHCOO.field1242[field712].field1244[field713];
		}

		return field1003.method28(TLXFHCOO.field1242[field700].field1248, var2, var1);
	}
}
