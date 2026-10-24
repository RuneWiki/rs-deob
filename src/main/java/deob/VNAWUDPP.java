package deob;

@ObfuscatedName("VNAWUDPP")
public abstract class VNAWUDPP extends CYZGZTKE {

	@ObfuscatedName("VNAWUDPP.o")
	public int field1305 = 32;

	@ObfuscatedName("VNAWUDPP.p")
	public int field1306 = -1;

	@ObfuscatedName("VNAWUDPP.x")
	public int[] field1314 = new int[10];

	@ObfuscatedName("VNAWUDPP.y")
	public int[] field1315 = new int[10];

	@ObfuscatedName("VNAWUDPP.A")
	public int field1317 = -1;

	@ObfuscatedName("VNAWUDPP.B")
	public int field1318 = -1;

	@ObfuscatedName("VNAWUDPP.C")
	public int field1319 = -1;

	@ObfuscatedName("VNAWUDPP.D")
	public int field1320 = -1;

	@ObfuscatedName("VNAWUDPP.E")
	public int field1321 = -1;

	@ObfuscatedName("VNAWUDPP.O")
	public int[] field1330 = new int[4];

	@ObfuscatedName("VNAWUDPP.P")
	public int[] field1331 = new int[4];

	@ObfuscatedName("VNAWUDPP.Q")
	public int[] field1332 = new int[4];

	@ObfuscatedName("VNAWUDPP.U")
	public int field1336 = 100;

	@ObfuscatedName("VNAWUDPP.V")
	public boolean field1337 = false;

	@ObfuscatedName("VNAWUDPP.Y")
	public boolean[] field1340 = new boolean[10];

	@ObfuscatedName("VNAWUDPP.Z")
	public int field1341 = 200;

	@ObfuscatedName("VNAWUDPP.bb")
	public int field1343 = 1;

	@ObfuscatedName("VNAWUDPP.cb")
	public int field1344 = -1;

	@ObfuscatedName("VNAWUDPP.db")
	public int field1345 = -1;

	@ObfuscatedName("VNAWUDPP.eb")
	public int field1346 = -1000;

	@ObfuscatedName("VNAWUDPP.hb")
	public int field1349 = -1;

	@ObfuscatedName("VNAWUDPP.mb")
	public int field1354 = -1;

	@ObfuscatedName("VNAWUDPP.ob")
	public int field1356 = -1;

	@ObfuscatedName("VNAWUDPP.n")
	public int field1304;

	@ObfuscatedName("VNAWUDPP.q")
	public int field1307;

	@ObfuscatedName("VNAWUDPP.r")
	public int field1308;

	@ObfuscatedName("VNAWUDPP.s")
	public int field1309;

	@ObfuscatedName("VNAWUDPP.t")
	public int field1310;

	@ObfuscatedName("VNAWUDPP.u")
	public int field1311;

	@ObfuscatedName("VNAWUDPP.v")
	public int field1312;

	@ObfuscatedName("VNAWUDPP.w")
	public int field1313;

	@ObfuscatedName("VNAWUDPP.z")
	public int field1316;

	@ObfuscatedName("VNAWUDPP.F")
	public int field1322;

	@ObfuscatedName("VNAWUDPP.G")
	public int field1323;

	@ObfuscatedName("VNAWUDPP.H")
	public int field1324;

	@ObfuscatedName("VNAWUDPP.I")
	public int field1325;

	@ObfuscatedName("VNAWUDPP.J")
	public int field1326;

	@ObfuscatedName("VNAWUDPP.K")
	public int field1327;

	@ObfuscatedName("VNAWUDPP.L")
	public int field1328;

	@ObfuscatedName("VNAWUDPP.M")
	public int field1329;

	@ObfuscatedName("VNAWUDPP.R")
	public int field1333;

	@ObfuscatedName("VNAWUDPP.S")
	public int field1334;

	@ObfuscatedName("VNAWUDPP.T")
	public int field1335;

	@ObfuscatedName("VNAWUDPP.W")
	public int field1338;

	@ObfuscatedName("VNAWUDPP.X")
	public int field1339;

	@ObfuscatedName("VNAWUDPP.fb")
	public int field1347;

	@ObfuscatedName("VNAWUDPP.gb")
	public int field1348;

	@ObfuscatedName("VNAWUDPP.ib")
	public int field1350;

	@ObfuscatedName("VNAWUDPP.jb")
	public int field1351;

	@ObfuscatedName("VNAWUDPP.kb")
	public int field1352;

	@ObfuscatedName("VNAWUDPP.lb")
	public int field1353;

	@ObfuscatedName("VNAWUDPP.nb")
	public int field1355;

	@ObfuscatedName("VNAWUDPP.pb")
	public int field1357;

	@ObfuscatedName("VNAWUDPP.qb")
	public int field1358;

	@ObfuscatedName("VNAWUDPP.ab")
	public String field1342;

	@ObfuscatedName("VNAWUDPP.a(ZIII)V")
	public final void method565(boolean arg0, int arg1, int arg2) {
		if (field1349 != -1 && IUTBNGPH.field682[field1349].field695 == 1) {
			field1349 = -1;
		}

		if (!arg0) {
			int var4 = arg2 - field1314[0];
			int var5 = arg1 - field1315[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (field1329 < 9) {
					field1329++;
				}

				for (int var6 = field1329; var6 > 0; var6--) {
					field1314[var6] = field1314[var6 - 1];
					field1315[var6] = field1315[var6 - 1];
					field1340[var6] = field1340[var6 - 1];
				}

				field1314[0] = arg2;
				field1315[0] = arg1;
				field1340[0] = false;
				return;
			}
		}

		field1329 = 0;
		field1338 = 0;
		field1355 = 0;
		field1314[0] = arg2;
		field1315[0] = arg1;
		field1333 = field1314[0] * 128 + field1343 * 64;
		field1334 = field1315[0] * 128 + field1343 * 64;
	}

	@ObfuscatedName("VNAWUDPP.a(IBZ)V")
	public final void method566(int arg0, boolean arg1) {
		int var3 = field1314[0];
		int var4 = field1315[0];
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

		if (field1349 != -1 && IUTBNGPH.field682[field1349].field695 == 1) {
			field1349 = -1;
		}

		if (field1329 < 9) {
			field1329++;
		}

		for (int var5 = field1329; var5 > 0; var5--) {
			field1314[var5] = field1314[var5 - 1];
			field1315[var5] = field1315[var5 - 1];
			field1340[var5] = field1340[var5 - 1];
		}

		field1314[0] = var3;
		field1315[0] = var4;
		field1340[0] = arg1;
	}

	@ObfuscatedName("VNAWUDPP.a(Z)V")
	public final void method567() {
		field1329 = 0;
		field1338 = 0;
	}

	@ObfuscatedName("VNAWUDPP.b(Z)Z")
	public boolean method2() {
		return false;
	}

	@ObfuscatedName("VNAWUDPP.a(IIII)V")
	public final void method568(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 4; var4++) {
			if (field1332[var4] <= arg2) {
				field1330[var4] = arg0;
				field1331[var4] = arg1;
				field1332[var4] = arg2 + 70;
				return;
			}
		}
	}
}
