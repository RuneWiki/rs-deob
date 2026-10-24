package deob;

@ObfuscatedName("VJJXMLOH")
public final class VJJXMLOH extends FRPXDCME {

	@ObfuscatedName("VJJXMLOH.J")
	public boolean field1448 = false;

	@ObfuscatedName("VJJXMLOH.x")
	public UYLUCQNM field1436;

	@ObfuscatedName("VJJXMLOH.I")
	public int field1447;

	@ObfuscatedName("VJJXMLOH.m")
	public int field1425;

	@ObfuscatedName("VJJXMLOH.n")
	public int field1426;

	@ObfuscatedName("VJJXMLOH.o")
	public int field1427;

	@ObfuscatedName("VJJXMLOH.s")
	public int field1431;

	@ObfuscatedName("VJJXMLOH.t")
	public int field1432;

	@ObfuscatedName("VJJXMLOH.u")
	public int field1433;

	@ObfuscatedName("VJJXMLOH.v")
	public int field1434;

	@ObfuscatedName("VJJXMLOH.w")
	public int field1435;

	@ObfuscatedName("VJJXMLOH.p")
	public int field1428;

	@ObfuscatedName("VJJXMLOH.y")
	public double field1437;

	@ObfuscatedName("VJJXMLOH.z")
	public double field1438;

	@ObfuscatedName("VJJXMLOH.A")
	public double field1439;

	@ObfuscatedName("VJJXMLOH.B")
	public double field1440;

	@ObfuscatedName("VJJXMLOH.C")
	public double field1441;

	@ObfuscatedName("VJJXMLOH.D")
	public double field1442;

	@ObfuscatedName("VJJXMLOH.E")
	public double field1443;

	@ObfuscatedName("VJJXMLOH.F")
	public double field1444;

	@ObfuscatedName("VJJXMLOH.q")
	public int field1429;

	@ObfuscatedName("VJJXMLOH.r")
	public int field1430;

	@ObfuscatedName("VJJXMLOH.G")
	public int field1445;

	@ObfuscatedName("VJJXMLOH.H")
	public int field1446;

	@ObfuscatedName("VJJXMLOH.a(IIIII)V")
	public final void method576(int arg0, int arg1, int arg2, int arg3) {
		if (!field1448) {
			double var5 = (double) (arg1 - field1425);
			double var7 = (double) (arg2 - field1426);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field1442 = field1434 * var5 / var9 + field1425;
			field1443 = field1434 * var7 / var9 + field1426;
			field1444 = field1427;
		}

		double var11 = (double) (field1432 + 1 - arg3);
		field1437 = (arg1 - field1442) / var11;
		field1438 = (arg2 - field1443) / var11;
		field1439 = Math.sqrt(field1438 * field1438 + field1437 * field1437);
		if (!field1448) {
			field1440 = -field1439 * Math.tan(field1433 * 0.02454369D);
		}

		field1441 = (arg0 - field1444 - field1440 * var11) * 2.0D / (var11 * var11);
	}

	@ObfuscatedName("VJJXMLOH.a(I)LGFYXEFQY;")
	public final GFYXEFQY method294() {
		GFYXEFQY var1 = field1436.method564();
		if (var1 == null) {
			return null;
		}

		int var2 = -1;
		if (field1436.field1368 != null) {
			var2 = field1436.field1368.field1017[field1429];
		}

		GFYXEFQY var3 = new GFYXEFQY(ERVJQNCY.method282(var2), var1, true, false);
		if (var2 != -1) {
			var3.method348();
			var3.method349(var2);
			var3.field785 = null;
			var3.field784 = null;
		}

		if (field1436.field1371 != 128 || field1436.field1372 != 128) {
			var3.method357(field1436.field1371, field1436.field1371, field1436.field1372);
		}

		var3.method353(field1446);
		var3.method358(field1436.field1374 + 64, field1436.field1375 + 850, -30, -50, -30, true);
		return var3;
	}

	public VJJXMLOH(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field1436 = UYLUCQNM.field1364[arg5];
		field1447 = arg10;
		field1425 = arg1;
		field1426 = arg7;
		field1427 = arg2;
		field1431 = arg9;
		field1432 = arg3;
		field1433 = arg6;
		field1434 = arg8;
		field1435 = arg0;
		field1428 = arg4;
		field1448 = false;
	}

	@ObfuscatedName("VJJXMLOH.a(IB)V")
	public final void method577(int arg0) {
		field1448 = true;
		field1442 += arg0 * field1437;
		field1443 += arg0 * field1438;
		field1444 += field1441 * 0.5D * arg0 * arg0 + arg0 * field1440;
		field1440 += arg0 * field1441;
		field1445 = (int) (Math.atan2(field1437, field1438) * 325.949D) + 1024 & 0x7FF;
		field1446 = (int) (Math.atan2(field1440, field1439) * 325.949D) & 0x7FF;

		if (field1436.field1368 != null) {
			field1430 += arg0;
			while (field1430 > field1436.field1368.method445(field1429)) {
				field1430 -= field1436.field1368.method445(field1429) + 1;
				field1429++;
				if (field1429 >= field1436.field1368.field1016) {
					field1429 = 0;
				}
			}
		}
	}
}
