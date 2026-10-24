package deob;

@ObfuscatedName("XEGGEBDS")
public abstract class XEGGEBDS extends RWIDPYKY {

	@ObfuscatedName("XEGGEBDS.s")
	public int field1320 = -1000;

	@ObfuscatedName("XEGGEBDS.v")
	public int field1323 = -1;

	@ObfuscatedName("XEGGEBDS.y")
	public int field1326 = 32;

	@ObfuscatedName("XEGGEBDS.z")
	public int field1327 = 1;

	@ObfuscatedName("XEGGEBDS.A")
	public int field1328 = -1;

	@ObfuscatedName("XEGGEBDS.F")
	public int field1333 = -1;

	@ObfuscatedName("XEGGEBDS.G")
	public int field1334 = -1;

	@ObfuscatedName("XEGGEBDS.H")
	public int field1335 = -1;

	@ObfuscatedName("XEGGEBDS.I")
	public int field1336 = -1;

	@ObfuscatedName("XEGGEBDS.K")
	public int field1338 = 200;

	@ObfuscatedName("XEGGEBDS.N")
	public boolean[] field1341 = new boolean[10];

	@ObfuscatedName("XEGGEBDS.S")
	public int field1345 = -1;

	@ObfuscatedName("XEGGEBDS.X")
	public int field1350 = 100;

	@ObfuscatedName("XEGGEBDS.Y")
	public int[] field1351 = new int[10];

	@ObfuscatedName("XEGGEBDS.Z")
	public int[] field1352 = new int[10];

	@ObfuscatedName("XEGGEBDS.bb")
	public int field1354 = -1;

	@ObfuscatedName("XEGGEBDS.cb")
	public int[] field1355 = new int[4];

	@ObfuscatedName("XEGGEBDS.db")
	public int[] field1356 = new int[4];

	@ObfuscatedName("XEGGEBDS.eb")
	public int[] field1357 = new int[4];

	@ObfuscatedName("XEGGEBDS.gb")
	public int field1359 = -1;

	@ObfuscatedName("XEGGEBDS.ib")
	public int field1360 = -1;

	@ObfuscatedName("XEGGEBDS.jb")
	public int field1361 = -1;

	@ObfuscatedName("XEGGEBDS.tb")
	public boolean field1370 = false;

	@ObfuscatedName("XEGGEBDS.o")
	public int field1316;

	@ObfuscatedName("XEGGEBDS.p")
	public int field1317;

	@ObfuscatedName("XEGGEBDS.q")
	public int field1318;

	@ObfuscatedName("XEGGEBDS.t")
	public int field1321;

	@ObfuscatedName("XEGGEBDS.u")
	public int field1322;

	@ObfuscatedName("XEGGEBDS.w")
	public int field1324;

	@ObfuscatedName("XEGGEBDS.x")
	public int field1325;

	@ObfuscatedName("XEGGEBDS.B")
	public int field1329;

	@ObfuscatedName("XEGGEBDS.C")
	public int field1330;

	@ObfuscatedName("XEGGEBDS.D")
	public int field1331;

	@ObfuscatedName("XEGGEBDS.E")
	public int field1332;

	@ObfuscatedName("XEGGEBDS.J")
	public int field1337;

	@ObfuscatedName("XEGGEBDS.L")
	public int field1339;

	@ObfuscatedName("XEGGEBDS.M")
	public int field1340;

	@ObfuscatedName("XEGGEBDS.O")
	public int field1342;

	@ObfuscatedName("XEGGEBDS.P")
	public int field1343;

	@ObfuscatedName("XEGGEBDS.Q")
	public int field1344;

	@ObfuscatedName("XEGGEBDS.T")
	public int field1346;

	@ObfuscatedName("XEGGEBDS.U")
	public int field1347;

	@ObfuscatedName("XEGGEBDS.V")
	public int field1348;

	@ObfuscatedName("XEGGEBDS.W")
	public int field1349;

	@ObfuscatedName("XEGGEBDS.ab")
	public int field1353;

	@ObfuscatedName("XEGGEBDS.fb")
	public int field1358;

	@ObfuscatedName("XEGGEBDS.kb")
	public int field1362;

	@ObfuscatedName("XEGGEBDS.mb")
	public int field1363;

	@ObfuscatedName("XEGGEBDS.nb")
	public int field1364;

	@ObfuscatedName("XEGGEBDS.ob")
	public int field1365;

	@ObfuscatedName("XEGGEBDS.pb")
	public int field1366;

	@ObfuscatedName("XEGGEBDS.qb")
	public int field1367;

	@ObfuscatedName("XEGGEBDS.rb")
	public int field1368;

	@ObfuscatedName("XEGGEBDS.sb")
	public int field1369;

	@ObfuscatedName("XEGGEBDS.r")
	public String field1319;

	@ObfuscatedName("XEGGEBDS.a(ZBI)V")
	public final void method554(boolean arg0, int arg1) {
		int var3 = field1351[0];
		int var4 = field1352[0];
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

		if (field1345 != -1 && KYGPROVJ.field828[field1345].field841 == 1) {
			field1345 = -1;
		}

		if (field1318 < 9) {
			field1318++;
		}

		for (int var5 = field1318; var5 > 0; var5--) {
			field1351[var5] = field1351[var5 - 1];
			field1352[var5] = field1352[var5 - 1];
			field1341[var5] = field1341[var5 - 1];
		}

		field1351[0] = var3;
		field1352[0] = var4;
		field1341[0] = arg0;
	}

	@ObfuscatedName("XEGGEBDS.a(IZII)V")
	public final void method555(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 4; var4++) {
			if (field1357[var4] <= arg0) {
				field1355[var4] = arg2;
				field1356[var4] = arg1;
				field1357[var4] = arg0 + 70;
				return;
			}
		}
	}

	@ObfuscatedName("XEGGEBDS.a(IIIZ)V")
	public final void method556(int arg0, int arg1, boolean arg2) {
		if (field1345 != -1 && KYGPROVJ.field828[field1345].field841 == 1) {
			field1345 = -1;
		}

		if (!arg2) {
			int var4 = arg1 - field1351[0];
			int var5 = arg0 - field1352[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (field1318 < 9) {
					field1318++;
				}

				for (int var6 = field1318; var6 > 0; var6--) {
					field1351[var6] = field1351[var6 - 1];
					field1352[var6] = field1352[var6 - 1];
					field1341[var6] = field1341[var6 - 1];
				}

				field1351[0] = arg1;
				field1352[0] = arg0;
				field1341[0] = false;
				return;
			}
		}

		field1318 = 0;
		field1353 = 0;
		field1358 = 0;
		field1351[0] = arg1;
		field1352[0] = arg0;
		field1342 = field1351[0] * 128 + field1327 * 64;
		field1343 = field1352[0] * 128 + field1327 * 64;
	}

	@ObfuscatedName("XEGGEBDS.a(B)V")
	public final void method557() {
		field1318 = 0;
		field1353 = 0;
	}

	@ObfuscatedName("XEGGEBDS.b(I)Z")
	public boolean method166() {
		return false;
	}
}
