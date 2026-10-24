package deob;

@ObfuscatedName("VVKZWHMC")
public final class VVKZWHMC extends GLSQHJVO {

	@ObfuscatedName("VVKZWHMC.w")
	public boolean field1368 = false;

	@ObfuscatedName("VVKZWHMC.y")
	public OPHZBIVR field1369;

	@ObfuscatedName("VVKZWHMC.o")
	public int field1360;

	@ObfuscatedName("VVKZWHMC.k")
	public int field1356;

	@ObfuscatedName("VVKZWHMC.l")
	public int field1357;

	@ObfuscatedName("VVKZWHMC.m")
	public int field1358;

	@ObfuscatedName("VVKZWHMC.u")
	public int field1366;

	@ObfuscatedName("VVKZWHMC.v")
	public int field1367;

	@ObfuscatedName("VVKZWHMC.p")
	public int field1361;

	@ObfuscatedName("VVKZWHMC.q")
	public int field1362;

	@ObfuscatedName("VVKZWHMC.r")
	public int field1363;

	@ObfuscatedName("VVKZWHMC.n")
	public int field1359;

	@ObfuscatedName("VVKZWHMC.z")
	public double field1370;

	@ObfuscatedName("VVKZWHMC.D")
	public double field1373;

	@ObfuscatedName("VVKZWHMC.E")
	public double field1374;

	@ObfuscatedName("VVKZWHMC.F")
	public double field1375;

	@ObfuscatedName("VVKZWHMC.G")
	public double field1376;

	@ObfuscatedName("VVKZWHMC.H")
	public double field1377;

	@ObfuscatedName("VVKZWHMC.I")
	public double field1378;

	@ObfuscatedName("VVKZWHMC.J")
	public double field1379;

	@ObfuscatedName("VVKZWHMC.s")
	public int field1364;

	@ObfuscatedName("VVKZWHMC.t")
	public int field1365;

	@ObfuscatedName("VVKZWHMC.B")
	public int field1371;

	@ObfuscatedName("VVKZWHMC.C")
	public int field1372;

	public VVKZWHMC(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field1369 = OPHZBIVR.field1106[arg10];
		field1360 = arg0;
		field1356 = arg3;
		field1357 = arg7;
		field1358 = arg2;
		field1366 = arg8;
		field1367 = arg1;
		field1361 = arg5;
		field1362 = arg4;
		field1363 = arg9;
		field1359 = arg6;
		field1368 = false;
	}

	@ObfuscatedName("VVKZWHMC.a(IIIII)V")
	public final void method538(int arg0, int arg1, int arg2, int arg3) {
		if (!field1368) {
			double var5 = (double) (arg1 - field1356);
			double var7 = (double) (arg0 - field1357);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field1377 = field1362 * var5 / var9 + field1356;
			field1378 = field1362 * var7 / var9 + field1357;
			field1379 = field1358;
		}

		double var11 = (double) (field1367 + 1 - arg2);
		field1373 = (arg1 - field1377) / var11;
		field1374 = (arg0 - field1378) / var11;
		field1375 = Math.sqrt(field1374 * field1374 + field1373 * field1373);
		if (!field1368) {
			field1376 = -field1375 * Math.tan(field1361 * 0.02454369D);
		}

		field1370 = (arg3 - field1379 - field1376 * var11) * 2.0D / (var11 * var11);
	}

	@ObfuscatedName("VVKZWHMC.a(II)V")
	public final void method539(int arg0) {
		field1368 = true;
		field1377 += arg0 * field1373;
		field1378 += arg0 * field1374;
		field1379 += field1370 * 0.5D * arg0 * arg0 + arg0 * field1376;
		field1376 += arg0 * field1370;
		field1371 = (int) (Math.atan2(field1373, field1374) * 325.949D) + 1024 & 0x7FF;
		field1372 = (int) (Math.atan2(field1376, field1375) * 325.949D) & 0x7FF;

		if (field1369.field1110 != null) {
			field1365 += arg0;
			while (field1365 > field1369.field1110.method451(field1364)) {
				field1365 -= field1369.field1110.method451(field1364) + 1;
				field1364++;
				if (field1364 >= field1369.field1110.field1166) {
					field1364 = 0;
				}
			}
		}
	}

	@ObfuscatedName("VVKZWHMC.a(I)LIRLTEWJP;")
	public final IRLTEWJP method168() {
		IRLTEWJP var1 = field1369.method435();
		if (var1 == null) {
			return null;
		}

		int var2 = -1;
		if (field1369.field1110 != null) {
			var2 = field1369.field1110.field1167[field1364];
		}

		IRLTEWJP var3 = new IRLTEWJP(var1, false, FIYHSKKC.method211(var2), true);
		if (var2 != -1) {
			var3.method288();
			var3.method289(var2);
			var3.field910 = null;
			var3.field909 = null;
		}

		if (field1369.field1113 != 128 || field1369.field1114 != 128) {
			var3.method297(field1369.field1113, field1369.field1114, field1369.field1113);
		}

		var3.method293(field1372);
		var3.method298(field1369.field1116 + 64, field1369.field1117 + 850, -30, -50, -30, true);
		return var3;
	}
}
