package deob;

@ObfuscatedName("KSCKZMBT")
public final class KSCKZMBT extends GLSQHJVO {

	@ObfuscatedName("KSCKZMBT.q")
	public boolean field970 = false;

	@ObfuscatedName("KSCKZMBT.u")
	public OPHZBIVR field973;

	@ObfuscatedName("KSCKZMBT.l")
	public int field965;

	@ObfuscatedName("KSCKZMBT.m")
	public int field966;

	@ObfuscatedName("KSCKZMBT.n")
	public int field967;

	@ObfuscatedName("KSCKZMBT.o")
	public int field968;

	@ObfuscatedName("KSCKZMBT.p")
	public int field969;

	@ObfuscatedName("KSCKZMBT.r")
	public int field971;

	@ObfuscatedName("KSCKZMBT.s")
	public int field972;

	public KSCKZMBT(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field973 = OPHZBIVR.field1106[arg0];
		field965 = arg5;
		field966 = arg2;
		field967 = arg1;
		field968 = arg3;
		field969 = arg4 + arg6;
		field970 = false;
	}

	@ObfuscatedName("KSCKZMBT.a(I)LIRLTEWJP;")
	public final IRLTEWJP method168() {
		IRLTEWJP var1 = field973.method435();
		if (var1 == null) {
			return null;
		}

		int var2 = field973.field1110.field1167[field971];
		IRLTEWJP var3 = new IRLTEWJP(var1, false, FIYHSKKC.method211(var2), true);
		if (!field970) {
			var3.method288();
			var3.method289(var2);
			var3.field910 = null;
			var3.field909 = null;
		}

		if (field973.field1113 != 128 || field973.field1114 != 128) {
			var3.method297(field973.field1113, field973.field1114, field973.field1113);
		}

		if (field973.field1115 != 0) {
			if (field973.field1115 == 90) {
				var3.method292();
			}

			if (field973.field1115 == 180) {
				var3.method292();
				var3.method292();
			}

			if (field973.field1115 == 270) {
				var3.method292();
				var3.method292();
				var3.method292();
			}
		}

		var3.method298(field973.field1116 + 64, field973.field1117 + 850, -30, -50, -30, true);
		return var3;
	}

	@ObfuscatedName("KSCKZMBT.a(IB)V")
	public final void method317(int arg0) {
		field972 += arg0;
		while (field972 > field973.field1110.method451(field971)) {
			field972 -= field973.field1110.method451(field971) + 1;
			field971++;
			if (field971 >= field973.field1110.field1166 && (field971 < 0 || field971 >= field973.field1110.field1166)) {
				field971 = 0;
				field970 = true;
			}
		}
	}
}
