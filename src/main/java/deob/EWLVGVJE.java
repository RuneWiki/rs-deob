package deob;

@ObfuscatedName("EWLVGVJE")
public final class EWLVGVJE extends PJUTMHMD {

	@ObfuscatedName("EWLVGVJE.m")
	public boolean field669 = false;

	@ObfuscatedName("EWLVGVJE.v")
	public XHDTVZNY field677;

	@ObfuscatedName("EWLVGVJE.p")
	public int field671;

	@ObfuscatedName("EWLVGVJE.q")
	public int field672;

	@ObfuscatedName("EWLVGVJE.r")
	public int field673;

	@ObfuscatedName("EWLVGVJE.s")
	public int field674;

	@ObfuscatedName("EWLVGVJE.n")
	public int field670;

	@ObfuscatedName("EWLVGVJE.t")
	public int field675;

	@ObfuscatedName("EWLVGVJE.u")
	public int field676;

	@ObfuscatedName("EWLVGVJE.a(I)LVHYCWIPJ;")
	public final VHYCWIPJ method217() {
		VHYCWIPJ var1 = field677.method579();
		if (var1 == null) {
			return null;
		}

		int var2 = field677.field1402.field1325[field675];
		VHYCWIPJ var3 = new VHYCWIPJ(TTZHVWEG.method489(var2), true, false, var1);
		if (!field669) {
			var3.method507();
			var3.method508(var2);
			var3.field1210 = null;
			var3.field1209 = null;
		}

		if (field677.field1405 != 128 || field677.field1406 != 128) {
			var3.method516(field677.field1405, field677.field1405, field677.field1406);
		}

		if (field677.field1407 != 0) {
			if (field677.field1407 == 90) {
				var3.method511();
			}

			if (field677.field1407 == 180) {
				var3.method511();
				var3.method511();
			}

			if (field677.field1407 == 270) {
				var3.method511();
				var3.method511();
				var3.method511();
			}
		}

		var3.method517(field677.field1408 + 64, field677.field1409 + 850, -30, -50, -30, true);
		return var3;
	}

	public EWLVGVJE(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field677 = XHDTVZNY.field1398[arg0];
		field671 = arg2;
		field672 = arg6;
		field673 = arg3;
		field674 = arg1;
		field670 = arg4 + arg5;
		field669 = false;
	}

	@ObfuscatedName("EWLVGVJE.a(II)V")
	public final void method218(int arg0) {
		field676 += arg0;
		while (field676 > field677.field1402.method549(field675)) {
			field676 -= field677.field1402.method549(field675) + 1;
			field675++;
			if (field675 >= field677.field1402.field1324 && (field675 < 0 || field675 >= field677.field1402.field1324)) {
				field675 = 0;
				field669 = true;
			}
		}
	}
}
