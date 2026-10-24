package deob;

@ObfuscatedName("YOWFBYTG")
public class YOWFBYTG extends YDNCHMHU {

	@ObfuscatedName("YOWFBYTG.l")
	public boolean field1337 = false;

	@ObfuscatedName("YOWFBYTG.m")
	public int field1338 = -1000;

	@ObfuscatedName("YOWFBYTG.v")
	public int[] field1346 = new int[4];

	@ObfuscatedName("YOWFBYTG.w")
	public int[] field1347 = new int[4];

	@ObfuscatedName("YOWFBYTG.x")
	public int[] field1348 = new int[4];

	@ObfuscatedName("YOWFBYTG.y")
	public int field1349 = 1;

	@ObfuscatedName("YOWFBYTG.H")
	public int field1358 = -1;

	@ObfuscatedName("YOWFBYTG.I")
	public int field1359 = 200;

	@ObfuscatedName("YOWFBYTG.J")
	public int[] field1360 = new int[10];

	@ObfuscatedName("YOWFBYTG.K")
	public int[] field1361 = new int[10];

	@ObfuscatedName("YOWFBYTG.L")
	public int field1362 = 32;

	@ObfuscatedName("YOWFBYTG.P")
	public int field1366 = -1;

	@ObfuscatedName("YOWFBYTG.Q")
	public int field1367 = -1;

	@ObfuscatedName("YOWFBYTG.R")
	public int field1368 = -1;

	@ObfuscatedName("YOWFBYTG.S")
	public int field1369 = -1;

	@ObfuscatedName("YOWFBYTG.W")
	public int field1373 = -1;

	@ObfuscatedName("YOWFBYTG.Z")
	public int field1376 = -1;

	@ObfuscatedName("YOWFBYTG.eb")
	public int field1381 = -1;

	@ObfuscatedName("YOWFBYTG.jb")
	public int field1386 = 100;

	@ObfuscatedName("YOWFBYTG.kb")
	public int field1387 = -1;

	@ObfuscatedName("YOWFBYTG.lb")
	public int field1388 = -1;

	@ObfuscatedName("YOWFBYTG.nb")
	public boolean[] field1390 = new boolean[10];

	@ObfuscatedName("YOWFBYTG.ob")
	public int field1391 = -1;

	@ObfuscatedName("YOWFBYTG.n")
	public int field1339;

	@ObfuscatedName("YOWFBYTG.o")
	public int field1340;

	@ObfuscatedName("YOWFBYTG.q")
	public int field1341;

	@ObfuscatedName("YOWFBYTG.r")
	public int field1342;

	@ObfuscatedName("YOWFBYTG.s")
	public int field1343;

	@ObfuscatedName("YOWFBYTG.t")
	public int field1344;

	@ObfuscatedName("YOWFBYTG.z")
	public int field1350;

	@ObfuscatedName("YOWFBYTG.A")
	public int field1351;

	@ObfuscatedName("YOWFBYTG.B")
	public int field1352;

	@ObfuscatedName("YOWFBYTG.C")
	public int field1353;

	@ObfuscatedName("YOWFBYTG.D")
	public int field1354;

	@ObfuscatedName("YOWFBYTG.E")
	public int field1355;

	@ObfuscatedName("YOWFBYTG.F")
	public int field1356;

	@ObfuscatedName("YOWFBYTG.G")
	public int field1357;

	@ObfuscatedName("YOWFBYTG.M")
	public int field1363;

	@ObfuscatedName("YOWFBYTG.N")
	public int field1364;

	@ObfuscatedName("YOWFBYTG.O")
	public int field1365;

	@ObfuscatedName("YOWFBYTG.T")
	public int field1370;

	@ObfuscatedName("YOWFBYTG.U")
	public int field1371;

	@ObfuscatedName("YOWFBYTG.V")
	public int field1372;

	@ObfuscatedName("YOWFBYTG.X")
	public int field1374;

	@ObfuscatedName("YOWFBYTG.Y")
	public int field1375;

	@ObfuscatedName("YOWFBYTG.ab")
	public int field1377;

	@ObfuscatedName("YOWFBYTG.bb")
	public int field1378;

	@ObfuscatedName("YOWFBYTG.cb")
	public int field1379;

	@ObfuscatedName("YOWFBYTG.db")
	public int field1380;

	@ObfuscatedName("YOWFBYTG.fb")
	public int field1382;

	@ObfuscatedName("YOWFBYTG.gb")
	public int field1383;

	@ObfuscatedName("YOWFBYTG.hb")
	public int field1384;

	@ObfuscatedName("YOWFBYTG.ib")
	public int field1385;

	@ObfuscatedName("YOWFBYTG.mb")
	public int field1389;

	@ObfuscatedName("YOWFBYTG.u")
	public String field1345;

	@ObfuscatedName("YOWFBYTG.a(IIIZ)V")
	public final void method533(int arg0, int arg1, boolean arg2) {
		if (field1376 != -1 && CGWBYVFN.field150[field1376].field163 == 1) {
			field1376 = -1;
		}

		if (!arg2) {
			int var4 = arg1 - field1360[0];
			int var5 = arg0 - field1361[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (field1364 < 9) {
					field1364++;
				}

				for (int var6 = field1364; var6 > 0; var6--) {
					field1360[var6] = field1360[var6 - 1];
					field1361[var6] = field1361[var6 - 1];
					field1390[var6] = field1390[var6 - 1];
				}

				field1360[0] = arg1;
				field1361[0] = arg0;
				field1390[0] = false;
				return;
			}
		}

		field1364 = 0;
		field1341 = 0;
		field1389 = 0;
		field1360[0] = arg1;
		field1361[0] = arg0;
		field1370 = field1360[0] * 128 + field1349 * 64;
		field1371 = field1361[0] * 128 + field1349 * 64;
	}

	@ObfuscatedName("YOWFBYTG.a(IIII)V")
	public final void method534(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 4; var4++) {
			if (field1348[var4] <= arg0) {
				field1346[var4] = arg1;
				field1347[var4] = arg2;
				field1348[var4] = arg0 + 70;
				return;
			}
		}
	}

	@ObfuscatedName("YOWFBYTG.b(Z)V")
	public final void method535() {
		field1364 = 0;
		field1341 = 0;
	}

	@ObfuscatedName("YOWFBYTG.a(I)Z")
	public boolean method1() {
		return false;
	}

	@ObfuscatedName("YOWFBYTG.a(IZZ)V")
	public final void method536(int arg0, boolean arg1) {
		int var3 = field1360[0];
		int var4 = field1361[0];
		if (arg0 == 0) {
			var3--;
			var4++;
		}

		if (arg0 == 1) {
			var4++;
		}

		if (arg0 == 2) {
			var3++;
			var4++;
		}

		if (arg0 == 3) {
			var3--;
		}

		if (arg0 == 4) {
			var3++;
		}

		if (arg0 == 5) {
			var3--;
			var4--;
		}

		if (arg0 == 6) {
			var4--;
		}

		if (arg0 == 7) {
			var3++;
			var4--;
		}

		if (field1376 != -1 && CGWBYVFN.field150[field1376].field163 == 1) {
			field1376 = -1;
		}

		if (field1364 < 9) {
			field1364++;
		}

		for (int var5 = field1364; var5 > 0; var5--) {
			field1360[var5] = field1360[var5 - 1];
			field1361[var5] = field1361[var5 - 1];
			field1390[var5] = field1390[var5 - 1];
		}

		field1360[0] = var3;
		field1361[0] = var4;
		field1390[0] = arg1;
	}
}
