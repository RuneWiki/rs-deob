package deob;

@ObfuscatedName("YHEHTOVP")
public class YHEHTOVP extends NSRXNXHB {

	@ObfuscatedName("YHEHTOVP.m")
	public int field1422 = -1000;

	@ObfuscatedName("YHEHTOVP.p")
	public int field1425 = -1;

	@ObfuscatedName("YHEHTOVP.q")
	public int field1426 = -1;

	@ObfuscatedName("YHEHTOVP.v")
	public int field1431 = -1;

	@ObfuscatedName("YHEHTOVP.w")
	public int field1432 = -1;

	@ObfuscatedName("YHEHTOVP.H")
	public int field1443 = 100;

	@ObfuscatedName("YHEHTOVP.J")
	public int field1444 = -1;

	@ObfuscatedName("YHEHTOVP.N")
	public int[] field1448 = new int[10];

	@ObfuscatedName("YHEHTOVP.O")
	public int[] field1449 = new int[10];

	@ObfuscatedName("YHEHTOVP.P")
	public int field1450 = -1;

	@ObfuscatedName("YHEHTOVP.U")
	public boolean field1455 = false;

	@ObfuscatedName("YHEHTOVP.W")
	public int field1457 = 32;

	@ObfuscatedName("YHEHTOVP.Y")
	public int field1459 = 200;

	@ObfuscatedName("YHEHTOVP.Z")
	public int field1460 = -1;

	@ObfuscatedName("YHEHTOVP.db")
	public int field1464 = 1;

	@ObfuscatedName("YHEHTOVP.eb")
	public int field1465 = -1;

	@ObfuscatedName("YHEHTOVP.fb")
	public int field1466 = -1;

	@ObfuscatedName("YHEHTOVP.gb")
	public int field1467 = -1;

	@ObfuscatedName("YHEHTOVP.hb")
	public int field1468 = -1;

	@ObfuscatedName("YHEHTOVP.ib")
	public int[] field1469 = new int[4];

	@ObfuscatedName("YHEHTOVP.jb")
	public int[] field1470 = new int[4];

	@ObfuscatedName("YHEHTOVP.kb")
	public int[] field1471 = new int[4];

	@ObfuscatedName("YHEHTOVP.qb")
	public boolean[] field1476 = new boolean[10];

	@ObfuscatedName("YHEHTOVP.n")
	public int field1423;

	@ObfuscatedName("YHEHTOVP.o")
	public int field1424;

	@ObfuscatedName("YHEHTOVP.r")
	public int field1427;

	@ObfuscatedName("YHEHTOVP.s")
	public int field1428;

	@ObfuscatedName("YHEHTOVP.t")
	public int field1429;

	@ObfuscatedName("YHEHTOVP.u")
	public int field1430;

	@ObfuscatedName("YHEHTOVP.x")
	public int field1433;

	@ObfuscatedName("YHEHTOVP.y")
	public int field1434;

	@ObfuscatedName("YHEHTOVP.z")
	public int field1435;

	@ObfuscatedName("YHEHTOVP.A")
	public int field1436;

	@ObfuscatedName("YHEHTOVP.B")
	public int field1437;

	@ObfuscatedName("YHEHTOVP.C")
	public int field1438;

	@ObfuscatedName("YHEHTOVP.D")
	public int field1439;

	@ObfuscatedName("YHEHTOVP.E")
	public int field1440;

	@ObfuscatedName("YHEHTOVP.F")
	public int field1441;

	@ObfuscatedName("YHEHTOVP.G")
	public int field1442;

	@ObfuscatedName("YHEHTOVP.K")
	public int field1445;

	@ObfuscatedName("YHEHTOVP.L")
	public int field1446;

	@ObfuscatedName("YHEHTOVP.M")
	public int field1447;

	@ObfuscatedName("YHEHTOVP.Q")
	public int field1451;

	@ObfuscatedName("YHEHTOVP.R")
	public int field1452;

	@ObfuscatedName("YHEHTOVP.S")
	public int field1453;

	@ObfuscatedName("YHEHTOVP.T")
	public int field1454;

	@ObfuscatedName("YHEHTOVP.V")
	public int field1456;

	@ObfuscatedName("YHEHTOVP.X")
	public int field1458;

	@ObfuscatedName("YHEHTOVP.bb")
	public int field1462;

	@ObfuscatedName("YHEHTOVP.cb")
	public int field1463;

	@ObfuscatedName("YHEHTOVP.mb")
	public int field1472;

	@ObfuscatedName("YHEHTOVP.nb")
	public int field1473;

	@ObfuscatedName("YHEHTOVP.ob")
	public int field1474;

	@ObfuscatedName("YHEHTOVP.pb")
	public int field1475;

	@ObfuscatedName("YHEHTOVP.ab")
	public String field1461;

	@ObfuscatedName("YHEHTOVP.a(BZI)V")
	public final void method584(boolean arg0, int arg1) {
		int var3 = field1448[0];
		int var4 = field1449[0];
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

		if (field1450 != -1 && GMRGYXFL.field720[field1450].field733 == 1) {
			field1450 = -1;
		}

		if (field1456 < 9) {
			field1456++;
		}

		for (int var5 = field1456; var5 > 0; var5--) {
			field1448[var5] = field1448[var5 - 1];
			field1449[var5] = field1449[var5 - 1];
			field1476[var5] = field1476[var5 - 1];
		}

		field1448[0] = var3;
		field1449[0] = var4;
		field1476[0] = arg0;
	}

	@ObfuscatedName("YHEHTOVP.a(IIIZ)V")
	public final void method585(int arg0, int arg1, boolean arg2) {
		if (field1450 != -1 && GMRGYXFL.field720[field1450].field733 == 1) {
			field1450 = -1;
		}

		if (!arg2) {
			int var4 = arg0 - field1448[0];
			int var5 = arg1 - field1449[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (field1456 < 9) {
					field1456++;
				}

				for (int var6 = field1456; var6 > 0; var6--) {
					field1448[var6] = field1448[var6 - 1];
					field1449[var6] = field1449[var6 - 1];
					field1476[var6] = field1476[var6 - 1];
				}

				field1448[0] = arg0;
				field1449[0] = arg1;
				field1476[0] = false;
				return;
			}
		}

		field1456 = 0;
		field1475 = 0;
		field1458 = 0;
		field1448[0] = arg0;
		field1449[0] = arg1;
		field1472 = field1448[0] * 128 + field1464 * 64;
		field1473 = field1449[0] * 128 + field1464 * 64;
	}

	@ObfuscatedName("YHEHTOVP.b(I)Z")
	public boolean method245() {
		return false;
	}

	@ObfuscatedName("YHEHTOVP.a(IIZI)V")
	public final void method586(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 4; var4++) {
			if (field1471[var4] <= arg0) {
				field1469[var4] = arg2;
				field1470[var4] = arg1;
				field1471[var4] = arg0 + 70;
				return;
			}
		}
	}

	@ObfuscatedName("YHEHTOVP.c(I)V")
	public final void method587() {
		field1456 = 0;
		field1475 = 0;
	}
}
