package deob;

@ObfuscatedName("YRQDGGKN")
public final class YRQDGGKN extends SMAWMDZY {

	@ObfuscatedName("YRQDGGKN.q")
	public boolean field1386 = false;

	@ObfuscatedName("YRQDGGKN.A")
	public FPSNPMMW field1394;

	@ObfuscatedName("YRQDGGKN.I")
	public int field1402;

	@ObfuscatedName("YRQDGGKN.E")
	public int field1398;

	@ObfuscatedName("YRQDGGKN.F")
	public int field1399;

	@ObfuscatedName("YRQDGGKN.G")
	public int field1400;

	@ObfuscatedName("YRQDGGKN.s")
	public int field1387;

	@ObfuscatedName("YRQDGGKN.t")
	public int field1388;

	@ObfuscatedName("YRQDGGKN.J")
	public int field1403;

	@ObfuscatedName("YRQDGGKN.K")
	public int field1404;

	@ObfuscatedName("YRQDGGKN.L")
	public int field1405;

	@ObfuscatedName("YRQDGGKN.H")
	public int field1401;

	@ObfuscatedName("YRQDGGKN.m")
	public double field1382;

	@ObfuscatedName("YRQDGGKN.n")
	public double field1383;

	@ObfuscatedName("YRQDGGKN.o")
	public double field1384;

	@ObfuscatedName("YRQDGGKN.p")
	public double field1385;

	@ObfuscatedName("YRQDGGKN.x")
	public double field1391;

	@ObfuscatedName("YRQDGGKN.y")
	public double field1392;

	@ObfuscatedName("YRQDGGKN.z")
	public double field1393;

	@ObfuscatedName("YRQDGGKN.B")
	public double field1395;

	@ObfuscatedName("YRQDGGKN.u")
	public int field1389;

	@ObfuscatedName("YRQDGGKN.v")
	public int field1390;

	@ObfuscatedName("YRQDGGKN.C")
	public int field1396;

	@ObfuscatedName("YRQDGGKN.D")
	public int field1397;

	@ObfuscatedName("YRQDGGKN.a(IIZII)V")
	public final void method535(int arg0, int arg1, int arg2, int arg3) {
		if (!field1386) {
			double var5 = (double) (arg1 - field1398);
			double var7 = (double) (arg0 - field1399);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field1391 = field1404 * var5 / var9 + field1398;
			field1392 = field1404 * var7 / var9 + field1399;
			field1393 = field1400;
		}

		double var11 = (double) (field1388 + 1 - arg3);
		field1382 = (arg1 - field1391) / var11;
		field1383 = (arg0 - field1392) / var11;
		field1384 = Math.sqrt(field1383 * field1383 + field1382 * field1382);
		if (!field1386) {
			field1385 = -field1384 * Math.tan(field1403 * 0.02454369D);
		}

		field1395 = (arg2 - field1393 - field1385 * var11) * 2.0D / (var11 * var11);
	}

	public YRQDGGKN(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field1394 = FPSNPMMW.field641[arg3];
		field1402 = arg6;
		field1398 = arg8;
		field1399 = arg7;
		field1400 = arg4;
		field1387 = arg10;
		field1388 = arg5;
		field1403 = arg0;
		field1404 = arg2;
		field1405 = arg9;
		field1401 = arg1;
		field1386 = false;
	}

	@ObfuscatedName("YRQDGGKN.a(II)V")
	public final void method536(int arg0) {
		field1386 = true;
		field1391 += arg0 * field1382;
		field1392 += arg0 * field1383;
		field1393 += field1395 * 0.5D * arg0 * arg0 + arg0 * field1385;
		field1385 += arg0 * field1395;
		field1396 = (int) (Math.atan2(field1382, field1383) * 325.949D) + 1024 & 0x7FF;
		field1397 = (int) (Math.atan2(field1385, field1384) * 325.949D) & 0x7FF;

		if (field1394.field645 != null) {
			field1390 += arg0;
			while (field1390 > field1394.field645.method227(field1389)) {
				field1390 -= field1394.field645.method227(field1389) + 1;
				field1389++;
				if (field1389 >= field1394.field645.field713) {
					field1389 = 0;
				}
			}
		}
	}

	@ObfuscatedName("YRQDGGKN.a(Z)LITSMSHJO;")
	public final ITSMSHJO method2() {
		ITSMSHJO var1 = field1394.method206();
		if (var1 == null) {
			return null;
		}

		int var2 = -1;
		if (field1394.field645 != null) {
			var2 = field1394.field645.field714[field1389];
		}

		ITSMSHJO var3 = new ITSMSHJO(var1, SCIASJXX.method401(var2), false, true);
		if (var2 != -1) {
			var3.method245();
			var3.method246(var2);
			var3.field785 = null;
			var3.field784 = null;
		}

		if (field1394.field648 != 128 || field1394.field649 != 128) {
			var3.method254(field1394.field648, field1394.field648, field1394.field649);
		}

		var3.method250(field1397);
		var3.method255(field1394.field651 + 64, field1394.field652 + 850, -30, -50, -30, true);
		return var3;
	}
}
