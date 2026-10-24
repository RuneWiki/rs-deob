package deob;

@ObfuscatedName("ZJNNOVLJ")
public abstract class ZJNNOVLJ extends ESJLSSWI {

	@ObfuscatedName("ZJNNOVLJ.s")
	public int field1453 = 1;

	@ObfuscatedName("ZJNNOVLJ.y")
	public int field1459 = -1;

	@ObfuscatedName("ZJNNOVLJ.z")
	public int[] field1460 = new int[4];

	@ObfuscatedName("ZJNNOVLJ.A")
	public int[] field1461 = new int[4];

	@ObfuscatedName("ZJNNOVLJ.B")
	public int[] field1462 = new int[4];

	@ObfuscatedName("ZJNNOVLJ.C")
	public int field1463 = 32;

	@ObfuscatedName("ZJNNOVLJ.D")
	public int field1464 = -1;

	@ObfuscatedName("ZJNNOVLJ.E")
	public int field1465 = -1;

	@ObfuscatedName("ZJNNOVLJ.I")
	public int field1469 = -1000;

	@ObfuscatedName("ZJNNOVLJ.L")
	public boolean field1472 = false;

	@ObfuscatedName("ZJNNOVLJ.N")
	public int field1474 = 100;

	@ObfuscatedName("ZJNNOVLJ.O")
	public int[] field1475 = new int[10];

	@ObfuscatedName("ZJNNOVLJ.P")
	public int[] field1476 = new int[10];

	@ObfuscatedName("ZJNNOVLJ.Q")
	public int field1477 = -1;

	@ObfuscatedName("ZJNNOVLJ.R")
	public int field1478 = -1;

	@ObfuscatedName("ZJNNOVLJ.S")
	public int field1479 = -1;

	@ObfuscatedName("ZJNNOVLJ.T")
	public int field1480 = -1;

	@ObfuscatedName("ZJNNOVLJ.W")
	public int field1483 = 200;

	@ObfuscatedName("ZJNNOVLJ.X")
	public int field1484 = -1;

	@ObfuscatedName("ZJNNOVLJ.ab")
	public int field1487 = -1;

	@ObfuscatedName("ZJNNOVLJ.bb")
	public boolean[] field1488 = new boolean[10];

	@ObfuscatedName("ZJNNOVLJ.cb")
	public int field1489 = -1;

	@ObfuscatedName("ZJNNOVLJ.jb")
	public int field1496 = -1;

	@ObfuscatedName("ZJNNOVLJ.l")
	public int field1446;

	@ObfuscatedName("ZJNNOVLJ.m")
	public int field1447;

	@ObfuscatedName("ZJNNOVLJ.n")
	public int field1448;

	@ObfuscatedName("ZJNNOVLJ.o")
	public int field1449;

	@ObfuscatedName("ZJNNOVLJ.p")
	public int field1450;

	@ObfuscatedName("ZJNNOVLJ.q")
	public int field1451;

	@ObfuscatedName("ZJNNOVLJ.r")
	public int field1452;

	@ObfuscatedName("ZJNNOVLJ.t")
	public int field1454;

	@ObfuscatedName("ZJNNOVLJ.u")
	public int field1455;

	@ObfuscatedName("ZJNNOVLJ.v")
	public int field1456;

	@ObfuscatedName("ZJNNOVLJ.w")
	public int field1457;

	@ObfuscatedName("ZJNNOVLJ.x")
	public int field1458;

	@ObfuscatedName("ZJNNOVLJ.F")
	public int field1466;

	@ObfuscatedName("ZJNNOVLJ.H")
	public int field1468;

	@ObfuscatedName("ZJNNOVLJ.J")
	public int field1470;

	@ObfuscatedName("ZJNNOVLJ.K")
	public int field1471;

	@ObfuscatedName("ZJNNOVLJ.M")
	public int field1473;

	@ObfuscatedName("ZJNNOVLJ.U")
	public int field1481;

	@ObfuscatedName("ZJNNOVLJ.V")
	public int field1482;

	@ObfuscatedName("ZJNNOVLJ.Y")
	public int field1485;

	@ObfuscatedName("ZJNNOVLJ.Z")
	public int field1486;

	@ObfuscatedName("ZJNNOVLJ.db")
	public int field1490;

	@ObfuscatedName("ZJNNOVLJ.eb")
	public int field1491;

	@ObfuscatedName("ZJNNOVLJ.fb")
	public int field1492;

	@ObfuscatedName("ZJNNOVLJ.gb")
	public int field1493;

	@ObfuscatedName("ZJNNOVLJ.hb")
	public int field1494;

	@ObfuscatedName("ZJNNOVLJ.ib")
	public int field1495;

	@ObfuscatedName("ZJNNOVLJ.kb")
	public int field1497;

	@ObfuscatedName("ZJNNOVLJ.lb")
	public int field1498;

	@ObfuscatedName("ZJNNOVLJ.mb")
	public int field1499;

	@ObfuscatedName("ZJNNOVLJ.nb")
	public int field1500;

	@ObfuscatedName("ZJNNOVLJ.G")
	public String field1467;

	@ObfuscatedName("ZJNNOVLJ.a(IIII)V")
	public final void method597(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 4; var4++) {
			if (field1462[var4] <= arg0) {
				field1460[var4] = arg1;
				field1461[var4] = arg2;
				field1462[var4] = arg0 + 70;
				return;
			}
		}
	}

	@ObfuscatedName("ZJNNOVLJ.a(I)V")
	public final void method598() {
		field1466 = 0;
		field1468 = 0;
	}

	@ObfuscatedName("ZJNNOVLJ.a(B)Z")
	public boolean method228() {
		return false;
	}

	@ObfuscatedName("ZJNNOVLJ.a(ZII)V")
	public final void method599(boolean arg0, int arg1) {
		int var3 = field1475[0];
		int var4 = field1476[0];
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

		if (field1496 != -1 && LZZHVUJR.field832[field1496].field845 == 1) {
			field1496 = -1;
		}

		if (field1466 < 9) {
			field1466++;
		}

		for (int var5 = field1466; var5 > 0; var5--) {
			field1475[var5] = field1475[var5 - 1];
			field1476[var5] = field1476[var5 - 1];
			field1488[var5] = field1488[var5 - 1];
		}

		field1475[0] = var3;
		field1476[0] = var4;
		field1488[0] = arg0;
	}

	@ObfuscatedName("ZJNNOVLJ.a(ZIII)V")
	public final void method600(boolean arg0, int arg1, int arg2) {
		if (field1496 != -1 && LZZHVUJR.field832[field1496].field845 == 1) {
			field1496 = -1;
		}

		if (!arg0) {
			int var4 = arg2 - field1475[0];
			int var5 = arg1 - field1476[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (field1466 < 9) {
					field1466++;
				}

				for (int var6 = field1466; var6 > 0; var6--) {
					field1475[var6] = field1475[var6 - 1];
					field1476[var6] = field1476[var6 - 1];
					field1488[var6] = field1488[var6 - 1];
				}

				field1475[0] = arg2;
				field1476[0] = arg1;
				field1488[0] = false;
				return;
			}
		}

		field1466 = 0;
		field1468 = 0;
		field1454 = 0;
		field1475[0] = arg2;
		field1476[0] = arg1;
		field1455 = field1475[0] * 128 + field1453 * 64;
		field1456 = field1476[0] * 128 + field1453 * 64;
	}
}
