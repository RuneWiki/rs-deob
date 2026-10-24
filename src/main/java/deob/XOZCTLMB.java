package deob;

@ObfuscatedName("XOZCTLMB")
public abstract class XOZCTLMB extends GHXFOOXU {

	@ObfuscatedName("XOZCTLMB.m")
	public int field1376 = -1000;

	@ObfuscatedName("XOZCTLMB.w")
	public int field1386 = 1;

	@ObfuscatedName("XOZCTLMB.y")
	public int field1388 = -1;

	@ObfuscatedName("XOZCTLMB.z")
	public int field1389 = -1;

	@ObfuscatedName("XOZCTLMB.A")
	public int field1390 = -1;

	@ObfuscatedName("XOZCTLMB.B")
	public int field1391 = -1;

	@ObfuscatedName("XOZCTLMB.C")
	public boolean field1392 = false;

	@ObfuscatedName("XOZCTLMB.D")
	public int[] field1393 = new int[4];

	@ObfuscatedName("XOZCTLMB.E")
	public int[] field1394 = new int[4];

	@ObfuscatedName("XOZCTLMB.F")
	public int[] field1395 = new int[4];

	@ObfuscatedName("XOZCTLMB.J")
	public int field1399 = 32;

	@ObfuscatedName("XOZCTLMB.K")
	public int field1400 = -1;

	@ObfuscatedName("XOZCTLMB.O")
	public int[] field1404 = new int[10];

	@ObfuscatedName("XOZCTLMB.P")
	public int[] field1405 = new int[10];

	@ObfuscatedName("XOZCTLMB.Q")
	public int field1406 = -1;

	@ObfuscatedName("XOZCTLMB.R")
	public int field1407 = -1;

	@ObfuscatedName("XOZCTLMB.Y")
	public int field1414 = -1;

	@ObfuscatedName("XOZCTLMB.Z")
	public int field1415 = -1;

	@ObfuscatedName("XOZCTLMB.ab")
	public boolean[] field1416 = new boolean[10];

	@ObfuscatedName("XOZCTLMB.bb")
	public int field1417 = 100;

	@ObfuscatedName("XOZCTLMB.fb")
	public int field1421 = 200;

	@ObfuscatedName("XOZCTLMB.kb")
	public int field1424 = -1;

	@ObfuscatedName("XOZCTLMB.qb")
	public int field1430 = -1;

	@ObfuscatedName("XOZCTLMB.n")
	public int field1377;

	@ObfuscatedName("XOZCTLMB.o")
	public int field1378;

	@ObfuscatedName("XOZCTLMB.p")
	public int field1379;

	@ObfuscatedName("XOZCTLMB.q")
	public int field1380;

	@ObfuscatedName("XOZCTLMB.r")
	public int field1381;

	@ObfuscatedName("XOZCTLMB.s")
	public int field1382;

	@ObfuscatedName("XOZCTLMB.t")
	public int field1383;

	@ObfuscatedName("XOZCTLMB.u")
	public int field1384;

	@ObfuscatedName("XOZCTLMB.v")
	public int field1385;

	@ObfuscatedName("XOZCTLMB.x")
	public int field1387;

	@ObfuscatedName("XOZCTLMB.G")
	public int field1396;

	@ObfuscatedName("XOZCTLMB.H")
	public int field1397;

	@ObfuscatedName("XOZCTLMB.I")
	public int field1398;

	@ObfuscatedName("XOZCTLMB.L")
	public int field1401;

	@ObfuscatedName("XOZCTLMB.M")
	public int field1402;

	@ObfuscatedName("XOZCTLMB.N")
	public int field1403;

	@ObfuscatedName("XOZCTLMB.S")
	public int field1408;

	@ObfuscatedName("XOZCTLMB.T")
	public int field1409;

	@ObfuscatedName("XOZCTLMB.U")
	public int field1410;

	@ObfuscatedName("XOZCTLMB.V")
	public int field1411;

	@ObfuscatedName("XOZCTLMB.W")
	public int field1412;

	@ObfuscatedName("XOZCTLMB.X")
	public int field1413;

	@ObfuscatedName("XOZCTLMB.cb")
	public int field1418;

	@ObfuscatedName("XOZCTLMB.db")
	public int field1419;

	@ObfuscatedName("XOZCTLMB.eb")
	public int field1420;

	@ObfuscatedName("XOZCTLMB.hb")
	public int field1422;

	@ObfuscatedName("XOZCTLMB.jb")
	public int field1423;

	@ObfuscatedName("XOZCTLMB.lb")
	public int field1425;

	@ObfuscatedName("XOZCTLMB.mb")
	public int field1426;

	@ObfuscatedName("XOZCTLMB.nb")
	public int field1427;

	@ObfuscatedName("XOZCTLMB.ob")
	public int field1428;

	@ObfuscatedName("XOZCTLMB.pb")
	public String field1429;

	@ObfuscatedName("XOZCTLMB.a(IIZI)V")
	public final void method561(int arg0, boolean arg1, int arg2) {
		if (field1424 != -1 && BKDXLPEF.field75[field1424].field88 == 1) {
			field1424 = -1;
		}

		if (!arg1) {
			int var4 = arg2 - field1404[0];
			int var5 = arg0 - field1405[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (field1412 < 9) {
					field1412++;
				}

				for (int var6 = field1412; var6 > 0; var6--) {
					field1404[var6] = field1404[var6 - 1];
					field1405[var6] = field1405[var6 - 1];
					field1416[var6] = field1416[var6 - 1];
				}

				field1404[0] = arg2;
				field1405[0] = arg0;
				field1416[0] = false;
				return;
			}
		}

		field1412 = 0;
		field1422 = 0;
		field1403 = 0;
		field1404[0] = arg2;
		field1405[0] = arg0;
		field1396 = field1404[0] * 128 + field1386 * 64;
		field1397 = field1405[0] * 128 + field1386 * 64;
	}

	@ObfuscatedName("XOZCTLMB.a(I)V")
	public final void method562() {
		field1412 = 0;
		field1422 = 0;
	}

	@ObfuscatedName("XOZCTLMB.a(BZI)V")
	public final void method563(boolean arg0, int arg1) {
		int var3 = field1404[0];
		int var4 = field1405[0];
		if (arg1 == 0) {
			var3--;
			var4++;
		}

		if (arg1 == 1) {
			var4++;
		}

		if (arg1 == 2) {
			var3++;
			var4++;
		}

		if (arg1 == 3) {
			var3--;
		}

		if (arg1 == 4) {
			var3++;
		}

		if (arg1 == 5) {
			var3--;
			var4--;
		}

		if (arg1 == 6) {
			var4--;
		}

		if (arg1 == 7) {
			var3++;
			var4--;
		}

		if (field1424 != -1 && BKDXLPEF.field75[field1424].field88 == 1) {
			field1424 = -1;
		}

		if (field1412 < 9) {
			field1412++;
		}

		for (int var5 = field1412; var5 > 0; var5--) {
			field1404[var5] = field1404[var5 - 1];
			field1405[var5] = field1405[var5 - 1];
			field1416[var5] = field1416[var5 - 1];
		}

		field1404[0] = var3;
		field1405[0] = var4;
		field1416[0] = arg0;
	}

	@ObfuscatedName("XOZCTLMB.a(IIII)V")
	public final void method564(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 4; var4++) {
			if (field1395[var4] <= arg0) {
				field1393[var4] = arg1;
				field1394[var4] = arg2;
				field1395[var4] = arg0 + 70;
				return;
			}
		}
	}

	@ObfuscatedName("XOZCTLMB.b(I)Z")
	public boolean method442() {
		return false;
	}
}
