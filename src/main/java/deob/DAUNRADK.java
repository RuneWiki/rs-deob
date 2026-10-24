package deob;

@ObfuscatedName("DAUNRADK")
public final class DAUNRADK extends FGVBONDH {

	@ObfuscatedName("DAUNRADK.s")
	public boolean field471 = false;

	@ObfuscatedName("DAUNRADK.m")
	public UIVLSYQW field465;

	@ObfuscatedName("DAUNRADK.o")
	public int field467;

	@ObfuscatedName("DAUNRADK.p")
	public int field468;

	@ObfuscatedName("DAUNRADK.q")
	public int field469;

	@ObfuscatedName("DAUNRADK.r")
	public int field470;

	@ObfuscatedName("DAUNRADK.n")
	public int field466;

	@ObfuscatedName("DAUNRADK.t")
	public int field472;

	@ObfuscatedName("DAUNRADK.u")
	public int field473;

	public DAUNRADK(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field465 = UIVLSYQW.field1152[arg1];
		field467 = arg6;
		field468 = arg5;
		field469 = arg4;
		field470 = arg2;
		field466 = arg0 + arg3;
		field471 = false;
	}

	@ObfuscatedName("DAUNRADK.a(I)LHEQROJXW;")
	public final HEQROJXW method1() {
		HEQROJXW var1 = field465.method539();
		if (var1 == null) {
			return null;
		}

		int var2 = field465.field1156.field1364[field472];
		HEQROJXW var3 = new HEQROJXW(false, true, UEUSJYYO.method536(var2), var1);
		if (!field471) {
			var3.method329();
			var3.method330(var2);
			var3.field749 = null;
			var3.field748 = null;
		}

		if (field465.field1159 != 128 || field465.field1160 != 128) {
			var3.method338(field465.field1160, field465.field1159, field465.field1159);
		}

		if (field465.field1161 != 0) {
			if (field465.field1161 == 90) {
				var3.method333();
			}

			if (field465.field1161 == 180) {
				var3.method333();
				var3.method333();
			}

			if (field465.field1161 == 270) {
				var3.method333();
				var3.method333();
				var3.method333();
			}
		}

		var3.method339(field465.field1162 + 64, field465.field1163 + 850, -30, -50, -30, true);
		return var3;
	}

	@ObfuscatedName("DAUNRADK.a(II)V")
	public final void method155(int arg0) {
		field473 += arg0;
		while (field473 > field465.field1156.method566(field472)) {
			field473 -= field465.field1156.method566(field472) + 1;
			field472++;
			if (field472 >= field465.field1156.field1363 && (field472 < 0 || field472 >= field465.field1156.field1363)) {
				field472 = 0;
				field471 = true;
			}
		}
	}
}
