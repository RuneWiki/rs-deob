package deob;

@ObfuscatedName("XETERYIW")
public abstract class XETERYIW extends ZJNSWWFY {

	@ObfuscatedName("XETERYIW.l")
	public int field1355 = -1;

	@ObfuscatedName("XETERYIW.m")
	public int field1356 = -1;

	@ObfuscatedName("XETERYIW.p")
	public int field1359 = -1;

	@ObfuscatedName("XETERYIW.u")
	public int field1364 = 100;

	@ObfuscatedName("XETERYIW.v")
	public int[] field1365 = new int[10];

	@ObfuscatedName("XETERYIW.w")
	public int[] field1366 = new int[10];

	@ObfuscatedName("XETERYIW.z")
	public boolean[] field1369 = new boolean[10];

	@ObfuscatedName("XETERYIW.H")
	public int field1375 = 1;

	@ObfuscatedName("XETERYIW.Q")
	public boolean field1384 = false;

	@ObfuscatedName("XETERYIW.S")
	public int field1386 = -1;

	@ObfuscatedName("XETERYIW.U")
	public int field1388 = -1000;

	@ObfuscatedName("XETERYIW.X")
	public int field1391 = -1;

	@ObfuscatedName("XETERYIW.cb")
	public int[] field1396 = new int[4];

	@ObfuscatedName("XETERYIW.db")
	public int[] field1397 = new int[4];

	@ObfuscatedName("XETERYIW.eb")
	public int[] field1398 = new int[4];

	@ObfuscatedName("XETERYIW.fb")
	public int field1399 = -1;

	@ObfuscatedName("XETERYIW.gb")
	public int field1400 = -1;

	@ObfuscatedName("XETERYIW.hb")
	public int field1401 = -1;

	@ObfuscatedName("XETERYIW.ib")
	public int field1402 = -1;

	@ObfuscatedName("XETERYIW.jb")
	public int field1403 = -1;

	@ObfuscatedName("XETERYIW.kb")
	public int field1404 = -1;

	@ObfuscatedName("XETERYIW.pb")
	public int field1408 = 32;

	@ObfuscatedName("XETERYIW.qb")
	public int field1409 = 200;

	@ObfuscatedName("XETERYIW.n")
	public int field1357;

	@ObfuscatedName("XETERYIW.o")
	public int field1358;

	@ObfuscatedName("XETERYIW.q")
	public int field1360;

	@ObfuscatedName("XETERYIW.r")
	public int field1361;

	@ObfuscatedName("XETERYIW.s")
	public int field1362;

	@ObfuscatedName("XETERYIW.t")
	public int field1363;

	@ObfuscatedName("XETERYIW.x")
	public int field1367;

	@ObfuscatedName("XETERYIW.y")
	public int field1368;

	@ObfuscatedName("XETERYIW.A")
	public int field1370;

	@ObfuscatedName("XETERYIW.E")
	public int field1372;

	@ObfuscatedName("XETERYIW.F")
	public int field1373;

	@ObfuscatedName("XETERYIW.G")
	public int field1374;

	@ObfuscatedName("XETERYIW.I")
	public int field1376;

	@ObfuscatedName("XETERYIW.J")
	public int field1377;

	@ObfuscatedName("XETERYIW.K")
	public int field1378;

	@ObfuscatedName("XETERYIW.L")
	public int field1379;

	@ObfuscatedName("XETERYIW.M")
	public int field1380;

	@ObfuscatedName("XETERYIW.N")
	public int field1381;

	@ObfuscatedName("XETERYIW.O")
	public int field1382;

	@ObfuscatedName("XETERYIW.P")
	public int field1383;

	@ObfuscatedName("XETERYIW.R")
	public int field1385;

	@ObfuscatedName("XETERYIW.T")
	public int field1387;

	@ObfuscatedName("XETERYIW.V")
	public int field1389;

	@ObfuscatedName("XETERYIW.W")
	public int field1390;

	@ObfuscatedName("XETERYIW.Y")
	public int field1392;

	@ObfuscatedName("XETERYIW.Z")
	public int field1393;

	@ObfuscatedName("XETERYIW.ab")
	public int field1394;

	@ObfuscatedName("XETERYIW.bb")
	public int field1395;

	@ObfuscatedName("XETERYIW.lb")
	public int field1405;

	@ObfuscatedName("XETERYIW.mb")
	public int field1406;

	@ObfuscatedName("XETERYIW.nb")
	public int field1407;

	@ObfuscatedName("XETERYIW.B")
	public String field1371;

	@ObfuscatedName("XETERYIW.a(I)Z")
	public boolean method250() {
		return false;
	}

	@ObfuscatedName("XETERYIW.a(IIII)V")
	public final void method546(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 4; var4++) {
			if (field1398[var4] <= arg1) {
				field1396[var4] = arg0;
				field1397[var4] = arg2;
				field1398[var4] = arg1 + 70;
				return;
			}
		}
	}

	@ObfuscatedName("XETERYIW.a(BIIZ)V")
	public final void method547(int arg0, int arg1, boolean arg2) {
		if (field1391 != -1 && PNPNYEVW.field1058[field1391].field1071 == 1) {
			field1391 = -1;
		}

		if (!arg2) {
			int var4 = arg0 - field1365[0];
			int var5 = arg1 - field1366[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (field1383 < 9) {
					field1383++;
				}

				for (int var6 = field1383; var6 > 0; var6--) {
					field1365[var6] = field1365[var6 - 1];
					field1366[var6] = field1366[var6 - 1];
					field1369[var6] = field1369[var6 - 1];
				}

				field1365[0] = arg0;
				field1366[0] = arg1;
				field1369[0] = false;
				return;
			}
		}

		field1383 = 0;
		field1368 = 0;
		field1370 = 0;
		field1365[0] = arg0;
		field1366[0] = arg1;
		field1405 = field1365[0] * 128 + field1375 * 64;
		field1406 = field1366[0] * 128 + field1375 * 64;
	}

	@ObfuscatedName("XETERYIW.a(IZI)V")
	public final void method548(boolean arg0, int arg1) {
		int var3 = field1365[0];
		int var4 = field1366[0];
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

		if (field1391 != -1 && PNPNYEVW.field1058[field1391].field1071 == 1) {
			field1391 = -1;
		}

		if (field1383 < 9) {
			field1383++;
		}

		for (int var5 = field1383; var5 > 0; var5--) {
			field1365[var5] = field1365[var5 - 1];
			field1366[var5] = field1366[var5 - 1];
			field1369[var5] = field1369[var5 - 1];
		}

		field1365[0] = var3;
		field1366[0] = var4;
		field1369[0] = arg0;
	}

	@ObfuscatedName("XETERYIW.b(I)V")
	public final void method549() {
		field1383 = 0;
		field1368 = 0;
	}
}
