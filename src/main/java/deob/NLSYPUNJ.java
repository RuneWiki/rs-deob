package deob;

@ObfuscatedName("NLSYPUNJ")
public final class NLSYPUNJ extends SMAWMDZY {

	@ObfuscatedName("NLSYPUNJ.p")
	public boolean field999 = false;

	@ObfuscatedName("NLSYPUNJ.r")
	public FPSNPMMW field1001;

	@ObfuscatedName("NLSYPUNJ.l")
	public int field995;

	@ObfuscatedName("NLSYPUNJ.m")
	public int field996;

	@ObfuscatedName("NLSYPUNJ.n")
	public int field997;

	@ObfuscatedName("NLSYPUNJ.o")
	public int field998;

	@ObfuscatedName("NLSYPUNJ.q")
	public int field1000;

	@ObfuscatedName("NLSYPUNJ.t")
	public int field1002;

	@ObfuscatedName("NLSYPUNJ.u")
	public int field1003;

	@ObfuscatedName("NLSYPUNJ.a(Z)LITSMSHJO;")
	public final ITSMSHJO method2() {
		ITSMSHJO var1 = field1001.method206();
		if (var1 == null) {
			return null;
		}

		int var2 = field1001.field645.field714[field1002];
		ITSMSHJO var3 = new ITSMSHJO(var1, SCIASJXX.method401(var2), false, true);
		if (!field999) {
			var3.method245();
			var3.method246(var2);
			var3.field785 = null;
			var3.field784 = null;
		}

		if (field1001.field648 != 128 || field1001.field649 != 128) {
			var3.method254(field1001.field648, field1001.field648, field1001.field649);
		}

		if (field1001.field650 != 0) {
			if (field1001.field650 == 90) {
				var3.method249();
			}

			if (field1001.field650 == 180) {
				var3.method249();
				var3.method249();
			}

			if (field1001.field650 == 270) {
				var3.method249();
				var3.method249();
				var3.method249();
			}
		}

		var3.method255(field1001.field651 + 64, field1001.field652 + 850, -30, -50, -30, true);
		return var3;
	}

	public NLSYPUNJ(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field1001 = FPSNPMMW.field641[arg1];
		field995 = arg3;
		field996 = arg2;
		field997 = arg0;
		field998 = arg6;
		field1000 = arg4 + arg5;
		field999 = false;
	}

	@ObfuscatedName("NLSYPUNJ.a(II)V")
	public final void method368(int arg0) {
		field1003 += arg0;
		while (field1003 > field1001.field645.method227(field1002)) {
			field1003 -= field1001.field645.method227(field1002) + 1;
			field1002++;
			if (field1002 >= field1001.field645.field713 && (field1002 < 0 || field1002 >= field1001.field645.field713)) {
				field1002 = 0;
				field999 = true;
			}
		}
	}
}
