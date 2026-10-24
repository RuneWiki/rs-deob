package deob;

@ObfuscatedName("UOUXSBLI")
public abstract class UOUXSBLI extends ANJAEDVY {

	@ObfuscatedName("UOUXSBLI.n")
	public int field1377 = -1;

	@ObfuscatedName("UOUXSBLI.o")
	public int field1378 = -1;

	@ObfuscatedName("UOUXSBLI.p")
	public int field1379 = -1;

	@ObfuscatedName("UOUXSBLI.q")
	public int field1380 = -1;

	@ObfuscatedName("UOUXSBLI.s")
	public int field1382 = 200;

	@ObfuscatedName("UOUXSBLI.w")
	public int[] field1385 = new int[4];

	@ObfuscatedName("UOUXSBLI.x")
	public int[] field1386 = new int[4];

	@ObfuscatedName("UOUXSBLI.y")
	public int[] field1387 = new int[4];

	@ObfuscatedName("UOUXSBLI.z")
	public int field1388 = -1;

	@ObfuscatedName("UOUXSBLI.E")
	public int field1393 = 100;

	@ObfuscatedName("UOUXSBLI.F")
	public int field1394 = -1;

	@ObfuscatedName("UOUXSBLI.J")
	public int[] field1398 = new int[10];

	@ObfuscatedName("UOUXSBLI.K")
	public int[] field1399 = new int[10];

	@ObfuscatedName("UOUXSBLI.M")
	public int field1401 = -1;

	@ObfuscatedName("UOUXSBLI.N")
	public boolean[] field1402 = new boolean[10];

	@ObfuscatedName("UOUXSBLI.O")
	public int field1403 = -1;

	@ObfuscatedName("UOUXSBLI.P")
	public int field1404 = -1;

	@ObfuscatedName("UOUXSBLI.Q")
	public int field1405 = -1000;

	@ObfuscatedName("UOUXSBLI.W")
	public int field1411 = -1;

	@ObfuscatedName("UOUXSBLI.ab")
	public boolean field1414 = false;

	@ObfuscatedName("UOUXSBLI.bb")
	public int field1415 = -1;

	@ObfuscatedName("UOUXSBLI.ib")
	public int field1422 = 32;

	@ObfuscatedName("UOUXSBLI.jb")
	public int field1423 = 1;

	@ObfuscatedName("UOUXSBLI.m")
	public int field1376;

	@ObfuscatedName("UOUXSBLI.r")
	public int field1381;

	@ObfuscatedName("UOUXSBLI.v")
	public int field1384;

	@ObfuscatedName("UOUXSBLI.A")
	public int field1389;

	@ObfuscatedName("UOUXSBLI.B")
	public int field1390;

	@ObfuscatedName("UOUXSBLI.C")
	public int field1391;

	@ObfuscatedName("UOUXSBLI.D")
	public int field1392;

	@ObfuscatedName("UOUXSBLI.G")
	public int field1395;

	@ObfuscatedName("UOUXSBLI.H")
	public int field1396;

	@ObfuscatedName("UOUXSBLI.I")
	public int field1397;

	@ObfuscatedName("UOUXSBLI.L")
	public int field1400;

	@ObfuscatedName("UOUXSBLI.R")
	public int field1406;

	@ObfuscatedName("UOUXSBLI.S")
	public int field1407;

	@ObfuscatedName("UOUXSBLI.T")
	public int field1408;

	@ObfuscatedName("UOUXSBLI.U")
	public int field1409;

	@ObfuscatedName("UOUXSBLI.V")
	public int field1410;

	@ObfuscatedName("UOUXSBLI.X")
	public int field1412;

	@ObfuscatedName("UOUXSBLI.Y")
	public int field1413;

	@ObfuscatedName("UOUXSBLI.cb")
	public int field1416;

	@ObfuscatedName("UOUXSBLI.db")
	public int field1417;

	@ObfuscatedName("UOUXSBLI.eb")
	public int field1418;

	@ObfuscatedName("UOUXSBLI.fb")
	public int field1419;

	@ObfuscatedName("UOUXSBLI.gb")
	public int field1420;

	@ObfuscatedName("UOUXSBLI.hb")
	public int field1421;

	@ObfuscatedName("UOUXSBLI.kb")
	public int field1424;

	@ObfuscatedName("UOUXSBLI.lb")
	public int field1425;

	@ObfuscatedName("UOUXSBLI.mb")
	public int field1426;

	@ObfuscatedName("UOUXSBLI.nb")
	public int field1427;

	@ObfuscatedName("UOUXSBLI.ob")
	public int field1428;

	@ObfuscatedName("UOUXSBLI.pb")
	public int field1429;

	@ObfuscatedName("UOUXSBLI.qb")
	public int field1430;

	@ObfuscatedName("UOUXSBLI.u")
	public String field1383;

	@ObfuscatedName("UOUXSBLI.a(IBZI)V")
	public final void method575(int arg0, boolean arg1, int arg2) {
		if (field1388 != -1 && WOTIAWQC.field1470[field1388].field1483 == 1) {
			field1388 = -1;
		}

		if (!arg1) {
			int var4 = arg2 - field1398[0];
			int var5 = arg0 - field1399[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (field1400 < 9) {
					field1400++;
				}

				for (int var6 = field1400; var6 > 0; var6--) {
					field1398[var6] = field1398[var6 - 1];
					field1399[var6] = field1399[var6 - 1];
					field1402[var6] = field1402[var6 - 1];
				}

				field1398[0] = arg2;
				field1399[0] = arg0;
				field1402[0] = false;
				return;
			}
		}

		field1400 = 0;
		field1376 = 0;
		field1420 = 0;
		field1398[0] = arg2;
		field1399[0] = arg0;
		field1395 = field1398[0] * 128 + field1423 * 64;
		field1396 = field1399[0] * 128 + field1423 * 64;
	}

	@ObfuscatedName("UOUXSBLI.b(B)Z")
	public boolean method397() {
		return false;
	}

	@ObfuscatedName("UOUXSBLI.a(ZII)V")
	public final void method576(boolean arg0, int arg1) {
		int var3 = field1398[0];
		int var4 = field1399[0];
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

		if (field1388 != -1 && WOTIAWQC.field1470[field1388].field1483 == 1) {
			field1388 = -1;
		}

		if (field1400 < 9) {
			field1400++;
		}

		for (int var5 = field1400; var5 > 0; var5--) {
			field1398[var5] = field1398[var5 - 1];
			field1399[var5] = field1399[var5 - 1];
			field1402[var5] = field1402[var5 - 1];
		}

		field1398[0] = var3;
		field1399[0] = var4;
		field1402[0] = arg0;
	}

	@ObfuscatedName("UOUXSBLI.a(IIII)V")
	public final void method577(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 4; var4++) {
			if (field1387[var4] <= arg1) {
				field1385[var4] = arg0;
				field1386[var4] = arg2;
				field1387[var4] = arg1 + 70;
				return;
			}
		}
	}

	@ObfuscatedName("UOUXSBLI.a(I)V")
	public final void method578() {
		field1400 = 0;
		field1376 = 0;
	}
}
