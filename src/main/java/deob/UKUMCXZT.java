package deob;

@ObfuscatedName("UKUMCXZT")
public class UKUMCXZT extends DPCHFTTD {

	@ObfuscatedName("UKUMCXZT.m")
	public int field1325 = -1;

	@ObfuscatedName("UKUMCXZT.r")
	public boolean[] field1330 = new boolean[10];

	@ObfuscatedName("UKUMCXZT.t")
	public int field1332 = -1;

	@ObfuscatedName("UKUMCXZT.u")
	public int field1333 = -1;

	@ObfuscatedName("UKUMCXZT.w")
	public int field1335 = 100;

	@ObfuscatedName("UKUMCXZT.x")
	public int field1336 = -1000;

	@ObfuscatedName("UKUMCXZT.A")
	public int field1339 = -1;

	@ObfuscatedName("UKUMCXZT.G")
	public int field1345 = 32;

	@ObfuscatedName("UKUMCXZT.I")
	public int field1347 = -1;

	@ObfuscatedName("UKUMCXZT.J")
	public int field1348 = -1;

	@ObfuscatedName("UKUMCXZT.K")
	public int field1349 = -1;

	@ObfuscatedName("UKUMCXZT.L")
	public int field1350 = -1;

	@ObfuscatedName("UKUMCXZT.N")
	public int field1352 = 1;

	@ObfuscatedName("UKUMCXZT.O")
	public int field1353 = 200;

	@ObfuscatedName("UKUMCXZT.P")
	public int field1354 = -1;

	@ObfuscatedName("UKUMCXZT.S")
	public boolean field1357 = false;

	@ObfuscatedName("UKUMCXZT.db")
	public int[] field1367 = new int[10];

	@ObfuscatedName("UKUMCXZT.eb")
	public int[] field1368 = new int[10];

	@ObfuscatedName("UKUMCXZT.fb")
	public int field1369 = -1;

	@ObfuscatedName("UKUMCXZT.gb")
	public int field1370 = -1;

	@ObfuscatedName("UKUMCXZT.mb")
	public int[] field1376 = new int[4];

	@ObfuscatedName("UKUMCXZT.nb")
	public int[] field1377 = new int[4];

	@ObfuscatedName("UKUMCXZT.ob")
	public int[] field1378 = new int[4];

	@ObfuscatedName("UKUMCXZT.n")
	public int field1326;

	@ObfuscatedName("UKUMCXZT.o")
	public int field1327;

	@ObfuscatedName("UKUMCXZT.p")
	public int field1328;

	@ObfuscatedName("UKUMCXZT.q")
	public int field1329;

	@ObfuscatedName("UKUMCXZT.v")
	public int field1334;

	@ObfuscatedName("UKUMCXZT.y")
	public int field1337;

	@ObfuscatedName("UKUMCXZT.z")
	public int field1338;

	@ObfuscatedName("UKUMCXZT.B")
	public int field1340;

	@ObfuscatedName("UKUMCXZT.C")
	public int field1341;

	@ObfuscatedName("UKUMCXZT.D")
	public int field1342;

	@ObfuscatedName("UKUMCXZT.E")
	public int field1343;

	@ObfuscatedName("UKUMCXZT.F")
	public int field1344;

	@ObfuscatedName("UKUMCXZT.H")
	public int field1346;

	@ObfuscatedName("UKUMCXZT.M")
	public int field1351;

	@ObfuscatedName("UKUMCXZT.Q")
	public int field1355;

	@ObfuscatedName("UKUMCXZT.R")
	public int field1356;

	@ObfuscatedName("UKUMCXZT.U")
	public int field1358;

	@ObfuscatedName("UKUMCXZT.V")
	public int field1359;

	@ObfuscatedName("UKUMCXZT.W")
	public int field1360;

	@ObfuscatedName("UKUMCXZT.X")
	public int field1361;

	@ObfuscatedName("UKUMCXZT.Y")
	public int field1362;

	@ObfuscatedName("UKUMCXZT.Z")
	public int field1363;

	@ObfuscatedName("UKUMCXZT.ab")
	public int field1364;

	@ObfuscatedName("UKUMCXZT.bb")
	public int field1365;

	@ObfuscatedName("UKUMCXZT.cb")
	public int field1366;

	@ObfuscatedName("UKUMCXZT.hb")
	public int field1371;

	@ObfuscatedName("UKUMCXZT.ib")
	public int field1372;

	@ObfuscatedName("UKUMCXZT.jb")
	public int field1373;

	@ObfuscatedName("UKUMCXZT.kb")
	public int field1374;

	@ObfuscatedName("UKUMCXZT.lb")
	public int field1375;

	@ObfuscatedName("UKUMCXZT.pb")
	public int field1379;

	@ObfuscatedName("UKUMCXZT.s")
	public String field1331;

	@ObfuscatedName("UKUMCXZT.a(IZI)V")
	public final void method576(int arg0, boolean arg1) {
		int var3 = field1367[0];
		int var4 = field1368[0];
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

		if (field1339 != -1 && EJHGNUGE.field604[field1339].field617 == 1) {
			field1339 = -1;
		}

		if (field1346 < 9) {
			field1346++;
		}

		for (int var5 = field1346; var5 > 0; var5--) {
			field1367[var5] = field1367[var5 - 1];
			field1368[var5] = field1368[var5 - 1];
			field1330[var5] = field1330[var5 - 1];
		}

		field1367[0] = var3;
		field1368[0] = var4;
		field1330[0] = arg1;
	}

	@ObfuscatedName("UKUMCXZT.a(IZZI)V")
	public final void method577(int arg0, boolean arg1, int arg2) {
		if (field1339 != -1 && EJHGNUGE.field604[field1339].field617 == 1) {
			field1339 = -1;
		}

		if (!arg1) {
			int var4 = arg0 - field1367[0];
			int var5 = arg2 - field1368[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (field1346 < 9) {
					field1346++;
				}

				for (int var6 = field1346; var6 > 0; var6--) {
					field1367[var6] = field1367[var6 - 1];
					field1368[var6] = field1368[var6 - 1];
					field1330[var6] = field1330[var6 - 1];
				}

				field1367[0] = arg0;
				field1368[0] = arg2;
				field1330[0] = false;
				return;
			}
		}

		field1346 = 0;
		field1379 = 0;
		field1334 = 0;
		field1367[0] = arg0;
		field1368[0] = arg2;
		field1326 = field1367[0] * 128 + field1352 * 64;
		field1327 = field1368[0] * 128 + field1352 * 64;
	}

	@ObfuscatedName("UKUMCXZT.a(I)V")
	public final void method578() {
		field1346 = 0;
		field1379 = 0;
	}

	@ObfuscatedName("UKUMCXZT.a(IIBI)V")
	public final void method579(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 4; var4++) {
			if (field1378[var4] <= arg0) {
				field1376[var4] = arg2;
				field1377[var4] = arg1;
				field1378[var4] = arg0 + 70;
				return;
			}
		}
	}

	@ObfuscatedName("UKUMCXZT.b(I)Z")
	public boolean method263() {
		return false;
	}
}
