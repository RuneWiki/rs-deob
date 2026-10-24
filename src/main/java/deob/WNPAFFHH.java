package deob;

@ObfuscatedName("WNPAFFHH")
public final class WNPAFFHH extends BSABUCFC {

	@ObfuscatedName("WNPAFFHH.B")
	public boolean field1403 = false;

	@ObfuscatedName("WNPAFFHH.t")
	public TYXORIIC field1396;

	@ObfuscatedName("WNPAFFHH.o")
	public int field1391;

	@ObfuscatedName("WNPAFFHH.k")
	public int field1387;

	@ObfuscatedName("WNPAFFHH.l")
	public int field1388;

	@ObfuscatedName("WNPAFFHH.m")
	public int field1389;

	@ObfuscatedName("WNPAFFHH.H")
	public int field1409;

	@ObfuscatedName("WNPAFFHH.I")
	public int field1410;

	@ObfuscatedName("WNPAFFHH.E")
	public int field1406;

	@ObfuscatedName("WNPAFFHH.F")
	public int field1407;

	@ObfuscatedName("WNPAFFHH.G")
	public int field1408;

	@ObfuscatedName("WNPAFFHH.n")
	public int field1390;

	@ObfuscatedName("WNPAFFHH.p")
	public double field1392;

	@ObfuscatedName("WNPAFFHH.q")
	public double field1393;

	@ObfuscatedName("WNPAFFHH.r")
	public double field1394;

	@ObfuscatedName("WNPAFFHH.s")
	public double field1395;

	@ObfuscatedName("WNPAFFHH.u")
	public double field1397;

	@ObfuscatedName("WNPAFFHH.v")
	public double field1398;

	@ObfuscatedName("WNPAFFHH.w")
	public double field1399;

	@ObfuscatedName("WNPAFFHH.y")
	public double field1400;

	@ObfuscatedName("WNPAFFHH.z")
	public int field1401;

	@ObfuscatedName("WNPAFFHH.A")
	public int field1402;

	@ObfuscatedName("WNPAFFHH.C")
	public int field1404;

	@ObfuscatedName("WNPAFFHH.D")
	public int field1405;

	@ObfuscatedName("WNPAFFHH.a(II)V")
	public final void method540(int arg0) {
		field1403 = true;
		field1397 += arg0 * field1392;
		field1398 += arg0 * field1393;
		field1399 += field1400 * 0.5D * arg0 * arg0 + arg0 * field1395;
		field1395 += arg0 * field1400;
		field1401 = (int) (Math.atan2(field1392, field1393) * 325.949D) + 1024 & 0x7FF;
		field1402 = (int) (Math.atan2(field1395, field1394) * 325.949D) & 0x7FF;

		if (field1396.field1252 != null) {
			field1405 += arg0;
			while (field1405 > field1396.field1252.method390(field1404)) {
				field1405 -= field1396.field1252.method390(field1404);
				field1404++;
				if (field1404 >= field1396.field1252.field1007) {
					field1404 = 0;
				}
			}
		}
	}

	@ObfuscatedName("WNPAFFHH.a(IIIBI)V")
	public final void method541(int arg0, int arg1, int arg2, int arg3) {
		if (!field1403) {
			double var5 = (double) (arg1 - field1387);
			double var7 = (double) (arg0 - field1388);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field1397 = field1407 * var5 / var9 + field1387;
			field1398 = field1407 * var7 / var9 + field1388;
			field1399 = field1389;
		}

		double var11 = (double) (field1410 + 1 - arg3);
		field1392 = (arg1 - field1397) / var11;
		field1393 = (arg0 - field1398) / var11;
		field1394 = Math.sqrt(field1393 * field1393 + field1392 * field1392);
		if (!field1403) {
			field1395 = -field1394 * Math.tan(field1406 * 0.02454369D);
		}

		field1400 = (arg2 - field1399 - field1395 * var11) * 2.0D / (var11 * var11);
	}

	public WNPAFFHH(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field1396 = TYXORIIC.field1248[arg9];
		field1391 = arg0;
		field1387 = arg4;
		field1388 = arg2;
		field1389 = arg5;
		field1409 = arg7;
		field1410 = arg8;
		field1406 = arg6;
		field1407 = arg3;
		field1408 = arg10;
		field1390 = arg1;
		field1403 = false;
	}

	@ObfuscatedName("WNPAFFHH.a(B)LUNLYQRUD;")
	public final UNLYQRUD method10() {
		UNLYQRUD var1 = field1396.method436();
		if (var1 == null) {
			return null;
		}

		int var2 = -1;
		if (field1396.field1252 != null) {
			var2 = field1396.field1252.field1008[field1404];
		}

		UNLYQRUD var3 = new UNLYQRUD(true, var1, false, DHMWVSMI.method178(var2));
		if (var2 != -1) {
			var3.method449();
			var3.method450(var2);
			var3.field1299 = null;
			var3.field1298 = null;
		}

		if (field1396.field1255 != 128 || field1396.field1256 != 128) {
			var3.method458(field1396.field1255, field1396.field1256, field1396.field1255);
		}

		var3.method454(field1402);
		var3.method459(field1396.field1258 + 64, field1396.field1259 + 850, -30, -50, -30, true);
		return var3;
	}
}
