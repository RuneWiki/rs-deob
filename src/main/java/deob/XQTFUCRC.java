package deob;

@ObfuscatedName("XQTFUCRC")
public final class XQTFUCRC extends GHXFOOXU {

	@ObfuscatedName("XQTFUCRC.H")
	public boolean field1452 = false;

	@ObfuscatedName("XQTFUCRC.x")
	public OKJTNJLE field1442;

	@ObfuscatedName("XQTFUCRC.G")
	public int field1451;

	@ObfuscatedName("XQTFUCRC.t")
	public int field1438;

	@ObfuscatedName("XQTFUCRC.u")
	public int field1439;

	@ObfuscatedName("XQTFUCRC.v")
	public int field1440;

	@ObfuscatedName("XQTFUCRC.J")
	public int field1453;

	@ObfuscatedName("XQTFUCRC.K")
	public int field1454;

	@ObfuscatedName("XQTFUCRC.C")
	public int field1447;

	@ObfuscatedName("XQTFUCRC.D")
	public int field1448;

	@ObfuscatedName("XQTFUCRC.E")
	public int field1449;

	@ObfuscatedName("XQTFUCRC.w")
	public int field1441;

	@ObfuscatedName("XQTFUCRC.o")
	public double field1433;

	@ObfuscatedName("XQTFUCRC.p")
	public double field1434;

	@ObfuscatedName("XQTFUCRC.q")
	public double field1435;

	@ObfuscatedName("XQTFUCRC.y")
	public double field1443;

	@ObfuscatedName("XQTFUCRC.z")
	public double field1444;

	@ObfuscatedName("XQTFUCRC.A")
	public double field1445;

	@ObfuscatedName("XQTFUCRC.B")
	public double field1446;

	@ObfuscatedName("XQTFUCRC.F")
	public double field1450;

	@ObfuscatedName("XQTFUCRC.m")
	public int field1431;

	@ObfuscatedName("XQTFUCRC.n")
	public int field1432;

	@ObfuscatedName("XQTFUCRC.r")
	public int field1436;

	@ObfuscatedName("XQTFUCRC.s")
	public int field1437;

	public XQTFUCRC(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field1442 = OKJTNJLE.field1046[arg0];
		field1451 = arg1;
		field1438 = arg2;
		field1439 = arg4;
		field1440 = arg8;
		field1453 = arg10;
		field1454 = arg9;
		field1447 = arg5;
		field1448 = arg7;
		field1449 = arg3;
		field1441 = arg6;
		field1452 = false;
	}

	@ObfuscatedName("XQTFUCRC.a(IB)V")
	public final void method565(int arg0) {
		field1452 = true;
		field1433 += arg0 * field1443;
		field1434 += arg0 * field1444;
		field1435 += field1450 * 0.5D * arg0 * arg0 + arg0 * field1446;
		field1446 += arg0 * field1450;
		field1436 = (int) (Math.atan2(field1443, field1444) * 325.949D) + 1024 & 0x7FF;
		field1437 = (int) (Math.atan2(field1446, field1445) * 325.949D) & 0x7FF;

		if (field1442.field1050 != null) {
			field1432 += arg0;
			while (field1432 > field1442.field1050.method12(field1431)) {
				field1432 -= field1442.field1050.method12(field1431);
				field1431++;
				if (field1431 >= field1442.field1050.field76) {
					field1431 = 0;
				}
			}
		}
	}

	@ObfuscatedName("XQTFUCRC.a(IIIII)V")
	public final void method566(int arg0, int arg1, int arg2, int arg3) {
		if (!field1452) {
			double var5 = (double) (arg3 - field1438);
			double var7 = (double) (arg1 - field1439);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field1433 = field1448 * var5 / var9 + field1438;
			field1434 = field1448 * var7 / var9 + field1439;
			field1435 = field1440;
		}

		double var11 = (double) (field1454 + 1 - arg0);
		field1443 = (arg3 - field1433) / var11;
		field1444 = (arg1 - field1434) / var11;
		field1445 = Math.sqrt(field1444 * field1444 + field1443 * field1443);
		if (!field1452) {
			field1446 = -field1445 * Math.tan(field1447 * 0.02454369D);
		}

		field1450 = (arg2 - field1435 - field1446 * var11) * 2.0D / (var11 * var11);
	}

	@ObfuscatedName("XQTFUCRC.a(B)LFLXAIVEA;")
	public final FLXAIVEA method190() {
		FLXAIVEA var1 = field1442.method305();
		if (var1 == null) {
			return null;
		}

		int var2 = -1;
		if (field1442.field1050 != null) {
			var2 = field1442.field1050.field77[field1431];
		}

		FLXAIVEA var3 = new FLXAIVEA(var1, NFWEZFJY.method302(var2), true, false);
		if (var2 != -1) {
			var3.method225();
			var3.method226(var2);
			var3.field716 = null;
			var3.field715 = null;
		}

		if (field1442.field1053 != 128 || field1442.field1054 != 128) {
			var3.method234(field1442.field1053, field1442.field1053, field1442.field1054);
		}

		var3.method230(field1437);
		var3.method235(field1442.field1056 + 64, field1442.field1057 + 850, -30, -50, -30, true);
		return var3;
	}
}
