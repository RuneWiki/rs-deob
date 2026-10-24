package deob;

@ObfuscatedName("ZJEEQISS")
public final class ZJEEQISS extends ZJNSWWFY {

	@ObfuscatedName("ZJEEQISS.l")
	public boolean field1464 = false;

	@ObfuscatedName("ZJEEQISS.q")
	public FXNZCBPL field1469;

	@ObfuscatedName("ZJEEQISS.m")
	public int field1465;

	@ObfuscatedName("ZJEEQISS.n")
	public int field1466;

	@ObfuscatedName("ZJEEQISS.o")
	public int field1467;

	@ObfuscatedName("ZJEEQISS.p")
	public int field1468;

	@ObfuscatedName("ZJEEQISS.v")
	public int field1472;

	@ObfuscatedName("ZJEEQISS.r")
	public int field1470;

	@ObfuscatedName("ZJEEQISS.s")
	public int field1471;

	@ObfuscatedName("ZJEEQISS.a(Z)LCSGBDGDY;")
	public final CSGBDGDY method187() {
		CSGBDGDY var1 = field1469.method202();
		if (var1 == null) {
			return null;
		}

		int var2 = field1469.field624.field1060[field1470];
		CSGBDGDY var3 = new CSGBDGDY(true, KDJQGGIG.method285(var2), var1, false);
		if (!field1464) {
			var3.method167();
			var3.method168(var2);
			var3.field535 = null;
			var3.field534 = null;
		}

		if (field1469.field627 != 128 || field1469.field628 != 128) {
			var3.method176(field1469.field627, field1469.field628, field1469.field627);
		}

		if (field1469.field629 != 0) {
			if (field1469.field629 == 90) {
				var3.method171();
			}

			if (field1469.field629 == 180) {
				var3.method171();
				var3.method171();
			}

			if (field1469.field629 == 270) {
				var3.method171();
				var3.method171();
				var3.method171();
			}
		}

		var3.method177(field1469.field630 + 64, field1469.field631 + 850, -30, -50, -30, true);
		return var3;
	}

	@ObfuscatedName("ZJEEQISS.a(II)V")
	public final void method584(int arg0) {
		field1471 += arg0;
		while (field1471 > field1469.field624.method427(field1470)) {
			field1471 -= field1469.field624.method427(field1470) + 1;
			field1470++;
			if (field1470 >= field1469.field624.field1059 && (field1470 < 0 || field1470 >= field1469.field624.field1059)) {
				field1470 = 0;
				field1464 = true;
			}
		}
	}

	public ZJEEQISS(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field1469 = FXNZCBPL.field620[arg3];
		field1465 = arg0;
		field1466 = arg1;
		field1467 = arg6;
		field1468 = arg4;
		field1472 = arg2 + arg5;
		field1464 = false;
	}
}
