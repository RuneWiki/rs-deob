package deob;

@ObfuscatedName("YFDAHBXI")
public final class YFDAHBXI extends RWIDPYKY {

	@ObfuscatedName("YFDAHBXI.L")
	public boolean field1472 = false;

	@ObfuscatedName("YFDAHBXI.B")
	public PHXJLMVH field1463;

	@ObfuscatedName("YFDAHBXI.I")
	public int field1469;

	@ObfuscatedName("YFDAHBXI.u")
	public int field1456;

	@ObfuscatedName("YFDAHBXI.v")
	public int field1457;

	@ObfuscatedName("YFDAHBXI.w")
	public int field1458;

	@ObfuscatedName("YFDAHBXI.F")
	public int field1467;

	@ObfuscatedName("YFDAHBXI.G")
	public int field1468;

	@ObfuscatedName("YFDAHBXI.y")
	public int field1460;

	@ObfuscatedName("YFDAHBXI.z")
	public int field1461;

	@ObfuscatedName("YFDAHBXI.A")
	public int field1462;

	@ObfuscatedName("YFDAHBXI.x")
	public int field1459;

	@ObfuscatedName("YFDAHBXI.o")
	public double field1450;

	@ObfuscatedName("YFDAHBXI.p")
	public double field1451;

	@ObfuscatedName("YFDAHBXI.q")
	public double field1452;

	@ObfuscatedName("YFDAHBXI.r")
	public double field1453;

	@ObfuscatedName("YFDAHBXI.C")
	public double field1464;

	@ObfuscatedName("YFDAHBXI.D")
	public double field1465;

	@ObfuscatedName("YFDAHBXI.E")
	public double field1466;

	@ObfuscatedName("YFDAHBXI.M")
	public double field1473;

	@ObfuscatedName("YFDAHBXI.s")
	public int field1454;

	@ObfuscatedName("YFDAHBXI.t")
	public int field1455;

	@ObfuscatedName("YFDAHBXI.J")
	public int field1470;

	@ObfuscatedName("YFDAHBXI.K")
	public int field1471;

	public YFDAHBXI(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field1463 = PHXJLMVH.field975[arg8];
		field1469 = arg9;
		field1456 = arg6;
		field1457 = arg1;
		field1458 = arg2;
		field1467 = arg10;
		field1468 = arg7;
		field1460 = arg4;
		field1461 = arg0;
		field1462 = arg5;
		field1459 = arg3;
		field1472 = false;
	}

	@ObfuscatedName("YFDAHBXI.a(II)V")
	public final void method573(int arg0) {
		field1472 = true;
		field1464 += arg0 * field1450;
		field1465 += arg0 * field1451;
		field1466 += field1473 * 0.5D * arg0 * arg0 + arg0 * field1453;
		field1453 += arg0 * field1473;
		field1454 = (int) (Math.atan2(field1450, field1451) * 325.949D) + 1024 & 0x7FF;
		field1455 = (int) (Math.atan2(field1453, field1452) * 325.949D) & 0x7FF;

		if (field1463.field979 != null) {
			field1471 += arg0;
			while (field1471 > field1463.field979.method256(field1470)) {
				field1471 -= field1463.field979.method256(field1470) + 1;
				field1470++;
				if (field1470 >= field1463.field979.field829) {
					field1470 = 0;
				}
			}
		}
	}

	@ObfuscatedName("YFDAHBXI.a(I)LJUQSYEMB;")
	public final JUQSYEMB method167() {
		JUQSYEMB var1 = field1463.method414();
		if (var1 == null) {
			return null;
		}

		int var2 = -1;
		if (field1463.field979 != null) {
			var2 = field1463.field979.field830[field1470];
		}

		JUQSYEMB var3 = new JUQSYEMB(false, true, var1, YYYUATIU.method579(var2));
		if (var2 != -1) {
			var3.method219();
			var3.method220(var2);
			var3.field712 = null;
			var3.field711 = null;
		}

		if (field1463.field982 != 128 || field1463.field983 != 128) {
			var3.method228(field1463.field982, field1463.field983, field1463.field982);
		}

		var3.method224(field1455);
		var3.method229(field1463.field985 + 64, field1463.field986 + 850, -30, -50, -30, true);
		return var3;
	}

	@ObfuscatedName("YFDAHBXI.a(BIIII)V")
	public final void method574(int arg0, int arg1, int arg2, int arg3) {
		if (!field1472) {
			double var5 = (double) (arg2 - field1456);
			double var7 = (double) (arg3 - field1457);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field1464 = field1461 * var5 / var9 + field1456;
			field1465 = field1461 * var7 / var9 + field1457;
			field1466 = field1458;
		}

		double var11 = (double) (field1468 + 1 - arg1);
		field1450 = (arg2 - field1464) / var11;
		field1451 = (arg3 - field1465) / var11;
		field1452 = Math.sqrt(field1451 * field1451 + field1450 * field1450);
		if (!field1472) {
			field1453 = -field1452 * Math.tan(field1460 * 0.02454369D);
		}

		field1473 = (arg0 - field1466 - field1453 * var11) * 2.0D / (var11 * var11);
	}
}
