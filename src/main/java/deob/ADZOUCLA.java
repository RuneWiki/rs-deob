package deob;

@ObfuscatedName("ADZOUCLA")
public final class ADZOUCLA extends TDBSBQNI {

	@ObfuscatedName("ADZOUCLA.p")
	public boolean field22 = false;

	@ObfuscatedName("ADZOUCLA.q")
	public BZLQCUPI field23;

	@ObfuscatedName("ADZOUCLA.l")
	public int field18;

	@ObfuscatedName("ADZOUCLA.m")
	public int field19;

	@ObfuscatedName("ADZOUCLA.n")
	public int field20;

	@ObfuscatedName("ADZOUCLA.o")
	public int field21;

	@ObfuscatedName("ADZOUCLA.t")
	public int field26;

	@ObfuscatedName("ADZOUCLA.r")
	public int field24;

	@ObfuscatedName("ADZOUCLA.s")
	public int field25;

	@ObfuscatedName("ADZOUCLA.a(IB)V")
	public final void method1(int arg0) {
		field25 += arg0;
		while (field25 > field23.field45.method252(field24)) {
			field25 -= field23.field45.method252(field24) + 1;
			field24++;
			if (field24 >= field23.field45.field745 && (field24 < 0 || field24 >= field23.field45.field745)) {
				field24 = 0;
				field22 = true;
			}
		}
	}

	public ADZOUCLA(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field23 = BZLQCUPI.field41[arg5];
		field18 = arg3;
		field19 = arg0;
		field20 = arg2;
		field21 = arg4;
		field26 = arg1 + arg6;
		field22 = false;
	}

	@ObfuscatedName("ADZOUCLA.a(B)LCYPZUKMB;")
	public final CYPZUKMB method2() {
		CYPZUKMB var1 = field23.method9();
		if (var1 == null) {
			return null;
		}

		int var2 = field23.field45.field746[field24];
		CYPZUKMB var3 = new CYPZUKMB(QGRLAQIF.method469(var2), var1, false, true);
		if (!field22) {
			var3.method203();
			var3.method204(var2);
			var3.field574 = null;
			var3.field573 = null;
		}

		if (field23.field48 != 128 || field23.field49 != 128) {
			var3.method212(field23.field48, field23.field49, field23.field48);
		}

		if (field23.field50 != 0) {
			if (field23.field50 == 90) {
				var3.method207();
			}

			if (field23.field50 == 180) {
				var3.method207();
				var3.method207();
			}

			if (field23.field50 == 270) {
				var3.method207();
				var3.method207();
				var3.method207();
			}
		}

		var3.method213(field23.field51 + 64, field23.field52 + 850, -30, -50, -30, true);
		return var3;
	}
}
