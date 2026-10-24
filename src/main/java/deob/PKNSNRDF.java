package deob;

@ObfuscatedName("PKNSNRDF")
public final class PKNSNRDF extends RWIDPYKY {

	@ObfuscatedName("PKNSNRDF.s")
	public boolean field992 = false;

	@ObfuscatedName("PKNSNRDF.n")
	public PHXJLMVH field988;

	@ObfuscatedName("PKNSNRDF.u")
	public int field993;

	@ObfuscatedName("PKNSNRDF.v")
	public int field994;

	@ObfuscatedName("PKNSNRDF.w")
	public int field995;

	@ObfuscatedName("PKNSNRDF.x")
	public int field996;

	@ObfuscatedName("PKNSNRDF.o")
	public int field989;

	@ObfuscatedName("PKNSNRDF.q")
	public int field990;

	@ObfuscatedName("PKNSNRDF.r")
	public int field991;

	public PKNSNRDF(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
		field988 = PHXJLMVH.field975[arg2];
		field993 = arg0;
		field994 = arg5;
		field995 = arg1;
		field996 = arg6;
		field989 = arg3 + arg4;
		field992 = false;
	}

	@ObfuscatedName("PKNSNRDF.a(I)LJUQSYEMB;")
	public final JUQSYEMB method167() {
		JUQSYEMB var1 = field988.method414();
		if (var1 == null) {
			return null;
		}

		int var2 = field988.field979.field830[field990];
		JUQSYEMB var3 = new JUQSYEMB(false, true, var1, YYYUATIU.method579(var2));
		if (!field992) {
			var3.method219();
			var3.method220(var2);
			var3.field712 = null;
			var3.field711 = null;
		}

		if (field988.field982 != 128 || field988.field983 != 128) {
			var3.method228(field988.field982, field988.field983, field988.field982);
		}

		if (field988.field984 != 0) {
			if (field988.field984 == 90) {
				var3.method223();
			}

			if (field988.field984 == 180) {
				var3.method223();
				var3.method223();
			}

			if (field988.field984 == 270) {
				var3.method223();
				var3.method223();
				var3.method223();
			}
		}

		var3.method229(field988.field985 + 64, field988.field986 + 850, -30, -50, -30, true);
		return var3;
	}

	@ObfuscatedName("PKNSNRDF.a(II)V")
	public final void method415(int arg0) {
		field991 += arg0;
		while (field991 > field988.field979.method256(field990)) {
			field991 -= field988.field979.method256(field990) + 1;
			field990++;
			if (field990 >= field988.field979.field829 && (field990 < 0 || field990 >= field988.field979.field829)) {
				field990 = 0;
				field992 = true;
			}
		}
	}
}
