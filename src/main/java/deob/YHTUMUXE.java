package deob;

@ObfuscatedName("YHTUMUXE")
public final class YHTUMUXE extends XHDBBLMT {

	@ObfuscatedName("YHTUMUXE.o")
	public boolean field1415 = false;

	@ObfuscatedName("YHTUMUXE.r")
	public TGIKVGNH field1418;

	@ObfuscatedName("YHTUMUXE.k")
	public int field1411;

	@ObfuscatedName("YHTUMUXE.l")
	public int field1412;

	@ObfuscatedName("YHTUMUXE.m")
	public int field1413;

	@ObfuscatedName("YHTUMUXE.n")
	public int field1414;

	@ObfuscatedName("YHTUMUXE.v")
	public int field1419;

	@ObfuscatedName("YHTUMUXE.p")
	public int field1416;

	@ObfuscatedName("YHTUMUXE.q")
	public int field1417;

	@ObfuscatedName("YHTUMUXE.a(I)LKBEXSZSN;")
	public final KBEXSZSN method28() {
		KBEXSZSN var1 = field1418.method461();
		if (var1 == null) {
			return null;
		}

		int var2 = field1418.field1198.field1037[field1416];
		KBEXSZSN var3 = new KBEXSZSN(false, IBCKUTPD.method309(var2), var1, true);
		if (!field1415) {
			var3.method346();
			var3.method347(var2);
			var3.field904 = null;
			var3.field903 = null;
		}

		if (field1418.field1201 != 128 || field1418.field1202 != 128) {
			var3.method355(field1418.field1201, field1418.field1202, field1418.field1201);
		}

		if (field1418.field1203 != 0) {
			if (field1418.field1203 == 90) {
				var3.method350();
			}

			if (field1418.field1203 == 180) {
				var3.method350();
				var3.method350();
			}

			if (field1418.field1203 == 270) {
				var3.method350();
				var3.method350();
				var3.method350();
			}
		}

		var3.method356(field1418.field1204 + 64, field1418.field1205 + 850, -30, -50, -30, true);
		return var3;
	}

	@ObfuscatedName("YHTUMUXE.a(II)V")
	public final void method579(int arg0) {
		field1417 += arg0;
		while (field1417 > field1418.field1198.method413(field1416)) {
			field1417 -= field1418.field1198.method413(field1416) + 1;
			field1416++;
			if (field1416 >= field1418.field1198.field1036 && (field1416 < 0 || field1416 >= field1418.field1198.field1036)) {
				field1416 = 0;
				field1415 = true;
			}
		}
	}

	public YHTUMUXE(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field1418 = TGIKVGNH.field1194[arg2];
		field1411 = arg4;
		field1412 = arg6;
		field1413 = arg0;
		field1414 = arg1;
		field1419 = arg3 + arg5;
		field1415 = false;
	}
}
