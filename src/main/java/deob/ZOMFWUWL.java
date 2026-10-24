package deob;

@ObfuscatedName("ZOMFWUWL")
public abstract class ZOMFWUWL extends BXTJETAB {

	@ObfuscatedName("ZOMFWUWL.m")
	public int field1452 = -1;

	@ObfuscatedName("ZOMFWUWL.r")
	public boolean field1457 = false;

	@ObfuscatedName("ZOMFWUWL.s")
	public boolean[] field1458 = new boolean[10];

	@ObfuscatedName("ZOMFWUWL.u")
	public int field1460 = -1;

	@ObfuscatedName("ZOMFWUWL.v")
	public int field1461 = -1;

	@ObfuscatedName("ZOMFWUWL.w")
	public int field1462 = -1;

	@ObfuscatedName("ZOMFWUWL.x")
	public int field1463 = -1;

	@ObfuscatedName("ZOMFWUWL.y")
	public int[] field1464 = new int[10];

	@ObfuscatedName("ZOMFWUWL.z")
	public int[] field1465 = new int[10];

	@ObfuscatedName("ZOMFWUWL.A")
	public int field1466 = -1000;

	@ObfuscatedName("ZOMFWUWL.G")
	public int field1471 = 100;

	@ObfuscatedName("ZOMFWUWL.H")
	public int field1472 = 200;

	@ObfuscatedName("ZOMFWUWL.I")
	public int field1473 = 32;

	@ObfuscatedName("ZOMFWUWL.J")
	public int field1474 = 1;

	@ObfuscatedName("ZOMFWUWL.K")
	public int field1475 = -1;

	@ObfuscatedName("ZOMFWUWL.L")
	public int field1476 = -1;

	@ObfuscatedName("ZOMFWUWL.X")
	public int[] field1488 = new int[4];

	@ObfuscatedName("ZOMFWUWL.Y")
	public int[] field1489 = new int[4];

	@ObfuscatedName("ZOMFWUWL.Z")
	public int[] field1490 = new int[4];

	@ObfuscatedName("ZOMFWUWL.ab")
	public int field1491 = -1;

	@ObfuscatedName("ZOMFWUWL.cb")
	public int field1492 = -1;

	@ObfuscatedName("ZOMFWUWL.hb")
	public int field1497 = -1;

	@ObfuscatedName("ZOMFWUWL.nb")
	public int field1501 = -1;

	@ObfuscatedName("ZOMFWUWL.l")
	public int field1451;

	@ObfuscatedName("ZOMFWUWL.n")
	public int field1453;

	@ObfuscatedName("ZOMFWUWL.o")
	public int field1454;

	@ObfuscatedName("ZOMFWUWL.p")
	public int field1455;

	@ObfuscatedName("ZOMFWUWL.q")
	public int field1456;

	@ObfuscatedName("ZOMFWUWL.t")
	public int field1459;

	@ObfuscatedName("ZOMFWUWL.B")
	public int field1467;

	@ObfuscatedName("ZOMFWUWL.C")
	public int field1468;

	@ObfuscatedName("ZOMFWUWL.F")
	public int field1470;

	@ObfuscatedName("ZOMFWUWL.M")
	public int field1477;

	@ObfuscatedName("ZOMFWUWL.N")
	public int field1478;

	@ObfuscatedName("ZOMFWUWL.O")
	public int field1479;

	@ObfuscatedName("ZOMFWUWL.P")
	public int field1480;

	@ObfuscatedName("ZOMFWUWL.Q")
	public int field1481;

	@ObfuscatedName("ZOMFWUWL.R")
	public int field1482;

	@ObfuscatedName("ZOMFWUWL.S")
	public int field1483;

	@ObfuscatedName("ZOMFWUWL.T")
	public int field1484;

	@ObfuscatedName("ZOMFWUWL.U")
	public int field1485;

	@ObfuscatedName("ZOMFWUWL.V")
	public int field1486;

	@ObfuscatedName("ZOMFWUWL.W")
	public int field1487;

	@ObfuscatedName("ZOMFWUWL.db")
	public int field1493;

	@ObfuscatedName("ZOMFWUWL.eb")
	public int field1494;

	@ObfuscatedName("ZOMFWUWL.fb")
	public int field1495;

	@ObfuscatedName("ZOMFWUWL.gb")
	public int field1496;

	@ObfuscatedName("ZOMFWUWL.ib")
	public int field1498;

	@ObfuscatedName("ZOMFWUWL.jb")
	public int field1499;

	@ObfuscatedName("ZOMFWUWL.mb")
	public int field1500;

	@ObfuscatedName("ZOMFWUWL.ob")
	public int field1502;

	@ObfuscatedName("ZOMFWUWL.pb")
	public int field1503;

	@ObfuscatedName("ZOMFWUWL.qb")
	public int field1504;

	@ObfuscatedName("ZOMFWUWL.rb")
	public int field1505;

	@ObfuscatedName("ZOMFWUWL.E")
	public String field1469;

	@ObfuscatedName("ZOMFWUWL.a(Z)Z")
	public boolean method29() {
		return false;
	}

	@ObfuscatedName("ZOMFWUWL.a(ZIII)V")
	public final void method591(boolean arg0, int arg1, int arg2) {
		if (field1452 != -1 && BZONLWPM.field53[field1452].field66 == 1) {
			field1452 = -1;
		}

		if (!arg0) {
			int var4 = arg2 - field1464[0];
			int var5 = arg1 - field1465[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (field1459 < 9) {
					field1459++;
				}

				for (int var6 = field1459; var6 > 0; var6--) {
					field1464[var6] = field1464[var6 - 1];
					field1465[var6] = field1465[var6 - 1];
					field1458[var6] = field1458[var6 - 1];
				}

				field1464[0] = arg2;
				field1465[0] = arg1;
				field1458[0] = false;
				return;
			}
		}

		field1459 = 0;
		field1451 = 0;
		field1470 = 0;
		field1464[0] = arg2;
		field1465[0] = arg1;
		field1478 = field1464[0] * 128 + field1474 * 64;
		field1479 = field1465[0] * 128 + field1474 * 64;
	}

	@ObfuscatedName("ZOMFWUWL.b(I)V")
	public final void method592() {
		field1459 = 0;
		field1451 = 0;
	}

	@ObfuscatedName("ZOMFWUWL.a(IIII)V")
	public final void method593(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 4; var4++) {
			if (field1490[var4] <= arg0) {
				field1488[var4] = arg2;
				field1489[var4] = arg1;
				field1490[var4] = arg0 + 70;
				return;
			}
		}
	}

	@ObfuscatedName("ZOMFWUWL.a(IZI)V")
	public final void method594(boolean arg0, int arg1) {
		int var3 = field1464[0];
		int var4 = field1465[0];
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

		if (field1452 != -1 && BZONLWPM.field53[field1452].field66 == 1) {
			field1452 = -1;
		}

		if (field1459 < 9) {
			field1459++;
		}

		for (int var5 = field1459; var5 > 0; var5--) {
			field1464[var5] = field1464[var5 - 1];
			field1465[var5] = field1465[var5 - 1];
			field1458[var5] = field1458[var5 - 1];
		}

		field1464[0] = var3;
		field1465[0] = var4;
		field1458[0] = arg0;
	}
}
