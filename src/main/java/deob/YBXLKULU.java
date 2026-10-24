package deob;

@ObfuscatedName("YBXLKULU")
public final class YBXLKULU extends IWSGBTLV {

	@ObfuscatedName("YBXLKULU.o")
	public boolean field1467 = false;

	@ObfuscatedName("YBXLKULU.v")
	public XWNROHZR field1473;

	@ObfuscatedName("YBXLKULU.u")
	public int field1472;

	@ObfuscatedName("YBXLKULU.H")
	public int field1485;

	@ObfuscatedName("YBXLKULU.I")
	public int field1486;

	@ObfuscatedName("YBXLKULU.J")
	public int field1487;

	@ObfuscatedName("YBXLKULU.F")
	public int field1483;

	@ObfuscatedName("YBXLKULU.G")
	public int field1484;

	@ObfuscatedName("YBXLKULU.y")
	public int field1476;

	@ObfuscatedName("YBXLKULU.z")
	public int field1477;

	@ObfuscatedName("YBXLKULU.A")
	public int field1478;

	@ObfuscatedName("YBXLKULU.K")
	public int field1488;

	@ObfuscatedName("YBXLKULU.p")
	public double field1468;

	@ObfuscatedName("YBXLKULU.q")
	public double field1469;

	@ObfuscatedName("YBXLKULU.r")
	public double field1470;

	@ObfuscatedName("YBXLKULU.s")
	public double field1471;

	@ObfuscatedName("YBXLKULU.B")
	public double field1479;

	@ObfuscatedName("YBXLKULU.C")
	public double field1480;

	@ObfuscatedName("YBXLKULU.D")
	public double field1481;

	@ObfuscatedName("YBXLKULU.E")
	public double field1482;

	@ObfuscatedName("YBXLKULU.w")
	public int field1474;

	@ObfuscatedName("YBXLKULU.x")
	public int field1475;

	@ObfuscatedName("YBXLKULU.L")
	public int field1489;

	@ObfuscatedName("YBXLKULU.M")
	public int field1490;

	@ObfuscatedName("YBXLKULU.a(I)LCADBNSXE;")
	public final CADBNSXE method40() {
		CADBNSXE var1 = field1473.method589();
		if (var1 == null) {
			return null;
		}

		int var2 = -1;
		if (field1473.field1443 != null) {
			var2 = field1473.field1443.field1359[field1489];
		}

		CADBNSXE var3 = new CADBNSXE(false, DFGNFGZH.method215(var2), var1, true);
		if (var2 != -1) {
			var3.method18();
			var3.method19(var2);
			var3.field48 = null;
			var3.field47 = null;
		}

		if (field1473.field1446 != 128 || field1473.field1447 != 128) {
			var3.method27(field1473.field1446, field1473.field1447, field1473.field1446);
		}

		var3.method23(field1475);
		var3.method28(field1473.field1449 + 64, field1473.field1450 + 850, -30, -50, -30, true);
		return var3;
	}

	@ObfuscatedName("YBXLKULU.a(BI)V")
	public final void method590(int arg0) {
		field1467 = true;
		field1468 += arg0 * field1479;
		field1469 += arg0 * field1480;
		field1470 += field1471 * 0.5D * arg0 * arg0 + arg0 * field1482;
		field1482 += arg0 * field1471;
		field1474 = (int) (Math.atan2(field1479, field1480) * 325.949D) + 1024 & 0x7FF;
		field1475 = (int) (Math.atan2(field1482, field1481) * 325.949D) & 0x7FF;

		if (field1473.field1443 != null) {
			field1490 += arg0;
			while (field1490 > field1473.field1443.method562(field1489)) {
				field1490 -= field1473.field1443.method562(field1489) + 1;
				field1489++;
				if (field1489 >= field1473.field1443.field1358) {
					field1489 = 0;
				}
			}
		}
	}

	@ObfuscatedName("YBXLKULU.a(ZIIII)V")
	public final void method591(int arg0, int arg1, int arg2, int arg3) {
		if (!field1467) {
			double var5 = (double) (arg3 - field1485);
			double var7 = (double) (arg0 - field1486);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field1468 = field1477 * var5 / var9 + field1485;
			field1469 = field1477 * var7 / var9 + field1486;
			field1470 = field1487;
		}

		double var11 = (double) (field1484 + 1 - arg1);
		field1479 = (arg3 - field1468) / var11;
		field1480 = (arg0 - field1469) / var11;
		field1481 = Math.sqrt(field1480 * field1480 + field1479 * field1479);
		if (!field1467) {
			field1482 = -field1481 * Math.tan(field1476 * 0.02454369D);
		}

		field1471 = (arg2 - field1470 - field1482 * var11) * 2.0D / (var11 * var11);
	}

	public YBXLKULU(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field1473 = XWNROHZR.field1439[arg0];
		field1472 = arg7;
		field1485 = arg6;
		field1486 = arg4;
		field1487 = arg10;
		field1483 = arg1;
		field1484 = arg2;
		field1476 = arg5;
		field1477 = arg8;
		field1478 = arg3;
		field1488 = arg9;
		field1467 = false;
	}
}
