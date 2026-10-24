package deob;

@ObfuscatedName("SOQRIJPC")
public final class SOQRIJPC extends XBYIDFVN {

	@ObfuscatedName("SOQRIJPC.E")
	public boolean field1370 = false;

	@ObfuscatedName("SOQRIJPC.A")
	public MBSSGBHW field1366;

	@ObfuscatedName("SOQRIJPC.u")
	public int field1361;

	@ObfuscatedName("SOQRIJPC.H")
	public int field1372;

	@ObfuscatedName("SOQRIJPC.I")
	public int field1373;

	@ObfuscatedName("SOQRIJPC.J")
	public int field1374;

	@ObfuscatedName("SOQRIJPC.x")
	public int field1364;

	@ObfuscatedName("SOQRIJPC.y")
	public int field1365;

	@ObfuscatedName("SOQRIJPC.B")
	public int field1367;

	@ObfuscatedName("SOQRIJPC.C")
	public int field1368;

	@ObfuscatedName("SOQRIJPC.D")
	public int field1369;

	@ObfuscatedName("SOQRIJPC.K")
	public int field1375;

	@ObfuscatedName("SOQRIJPC.n")
	public double field1354;

	@ObfuscatedName("SOQRIJPC.o")
	public double field1355;

	@ObfuscatedName("SOQRIJPC.p")
	public double field1356;

	@ObfuscatedName("SOQRIJPC.q")
	public double field1357;

	@ObfuscatedName("SOQRIJPC.r")
	public double field1358;

	@ObfuscatedName("SOQRIJPC.s")
	public double field1359;

	@ObfuscatedName("SOQRIJPC.t")
	public double field1360;

	@ObfuscatedName("SOQRIJPC.G")
	public double field1371;

	@ObfuscatedName("SOQRIJPC.l")
	public int field1352;

	@ObfuscatedName("SOQRIJPC.m")
	public int field1353;

	@ObfuscatedName("SOQRIJPC.v")
	public int field1362;

	@ObfuscatedName("SOQRIJPC.w")
	public int field1363;

	@ObfuscatedName("SOQRIJPC.a(IZ)V")
	public final void method541(int arg0) {
		field1370 = true;
		field1358 += arg0 * field1354;
		field1359 += arg0 * field1355;
		field1360 += field1371 * 0.5D * arg0 * arg0 + arg0 * field1357;
		field1357 += arg0 * field1371;
		field1352 = (int) (Math.atan2(field1354, field1355) * 325.949D) + 1024 & 0x7FF;
		field1353 = (int) (Math.atan2(field1357, field1356) * 325.949D) & 0x7FF;

		if (field1366.field931 != null) {
			field1363 += arg0;
			while (field1363 > field1366.field931.method308(field1362)) {
				field1363 -= field1366.field931.method308(field1362) + 1;
				field1362++;
				if (field1362 >= field1366.field931.field842) {
					field1362 = 0;
				}
			}
		}
	}

	@ObfuscatedName("SOQRIJPC.a(B)LPDVZPZLT;")
	public final PDVZPZLT method3() {
		PDVZPZLT var1 = field1366.method343();
		if (var1 == null) {
			return null;
		}

		int var2 = -1;
		if (field1366.field931 != null) {
			var2 = field1366.field931.field843[field1362];
		}

		PDVZPZLT var3 = new PDVZPZLT(var1, true, YPRWORMV.method602(var2), false);
		if (var2 != -1) {
			var3.method421();
			var3.method422(var2);
			var3.field1166 = null;
			var3.field1165 = null;
		}

		if (field1366.field934 != 128 || field1366.field935 != 128) {
			var3.method430(field1366.field934, field1366.field935, field1366.field934);
		}

		var3.method426(field1353);
		var3.method431(field1366.field937 + 64, field1366.field938 + 850, -30, -50, -30, true);
		return var3;
	}

	public SOQRIJPC(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field1366 = MBSSGBHW.field927[arg2];
		field1361 = arg1;
		field1372 = arg10;
		field1373 = arg8;
		field1374 = arg4;
		field1364 = arg9;
		field1365 = arg3;
		field1367 = arg6;
		field1368 = arg7;
		field1369 = arg5;
		field1375 = arg0;
		field1370 = false;
	}

	@ObfuscatedName("SOQRIJPC.a(IIZII)V")
	public final void method542(int arg0, int arg1, int arg2, int arg3) {
		if (!field1370) {
			double var5 = (double) (arg0 - field1372);
			double var7 = (double) (arg3 - field1373);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field1358 = field1368 * var5 / var9 + field1372;
			field1359 = field1368 * var7 / var9 + field1373;
			field1360 = field1374;
		}

		double var11 = (double) (field1365 + 1 - arg1);
		field1354 = (arg0 - field1358) / var11;
		field1355 = (arg3 - field1359) / var11;
		field1356 = Math.sqrt(field1355 * field1355 + field1354 * field1354);
		if (!field1370) {
			field1357 = -field1356 * Math.tan(field1367 * 0.02454369D);
		}

		field1371 = (arg2 - field1360 - field1357 * var11) * 2.0D / (var11 * var11);
	}
}
