package deob;

@ObfuscatedName("UKYMLOIC")
public class UKYMLOIC extends FRPXDCME {

	@ObfuscatedName("UKYMLOIC.m")
	public boolean field1302 = false;

	@ObfuscatedName("UKYMLOIC.n")
	public int field1303 = -1;

	@ObfuscatedName("UKYMLOIC.o")
	public int field1304 = -1;

	@ObfuscatedName("UKYMLOIC.p")
	public int field1305 = 32;

	@ObfuscatedName("UKYMLOIC.s")
	public int field1308 = -1000;

	@ObfuscatedName("UKYMLOIC.y")
	public int field1314 = -1;

	@ObfuscatedName("UKYMLOIC.D")
	public int field1319 = 1;

	@ObfuscatedName("UKYMLOIC.E")
	public int field1320 = -1;

	@ObfuscatedName("UKYMLOIC.J")
	public int[] field1325 = new int[4];

	@ObfuscatedName("UKYMLOIC.K")
	public int[] field1326 = new int[4];

	@ObfuscatedName("UKYMLOIC.L")
	public int[] field1327 = new int[4];

	@ObfuscatedName("UKYMLOIC.O")
	public int field1330 = -1;

	@ObfuscatedName("UKYMLOIC.S")
	public int field1333 = -1;

	@ObfuscatedName("UKYMLOIC.T")
	public boolean[] field1334 = new boolean[10];

	@ObfuscatedName("UKYMLOIC.U")
	public int field1335 = 100;

	@ObfuscatedName("UKYMLOIC.db")
	public int[] field1344 = new int[10];

	@ObfuscatedName("UKYMLOIC.eb")
	public int[] field1345 = new int[10];

	@ObfuscatedName("UKYMLOIC.fb")
	public int field1346 = 200;

	@ObfuscatedName("UKYMLOIC.jb")
	public int field1350 = -1;

	@ObfuscatedName("UKYMLOIC.mb")
	public int field1353 = -1;

	@ObfuscatedName("UKYMLOIC.nb")
	public int field1354 = -1;

	@ObfuscatedName("UKYMLOIC.ob")
	public int field1355 = -1;

	@ObfuscatedName("UKYMLOIC.pb")
	public int field1356 = -1;

	@ObfuscatedName("UKYMLOIC.q")
	public int field1306;

	@ObfuscatedName("UKYMLOIC.t")
	public int field1309;

	@ObfuscatedName("UKYMLOIC.u")
	public int field1310;

	@ObfuscatedName("UKYMLOIC.v")
	public int field1311;

	@ObfuscatedName("UKYMLOIC.w")
	public int field1312;

	@ObfuscatedName("UKYMLOIC.x")
	public int field1313;

	@ObfuscatedName("UKYMLOIC.z")
	public int field1315;

	@ObfuscatedName("UKYMLOIC.A")
	public int field1316;

	@ObfuscatedName("UKYMLOIC.B")
	public int field1317;

	@ObfuscatedName("UKYMLOIC.C")
	public int field1318;

	@ObfuscatedName("UKYMLOIC.F")
	public int field1321;

	@ObfuscatedName("UKYMLOIC.G")
	public int field1322;

	@ObfuscatedName("UKYMLOIC.H")
	public int field1323;

	@ObfuscatedName("UKYMLOIC.I")
	public int field1324;

	@ObfuscatedName("UKYMLOIC.M")
	public int field1328;

	@ObfuscatedName("UKYMLOIC.N")
	public int field1329;

	@ObfuscatedName("UKYMLOIC.P")
	public int field1331;

	@ObfuscatedName("UKYMLOIC.Q")
	public int field1332;

	@ObfuscatedName("UKYMLOIC.V")
	public int field1336;

	@ObfuscatedName("UKYMLOIC.W")
	public int field1337;

	@ObfuscatedName("UKYMLOIC.X")
	public int field1338;

	@ObfuscatedName("UKYMLOIC.Y")
	public int field1339;

	@ObfuscatedName("UKYMLOIC.Z")
	public int field1340;

	@ObfuscatedName("UKYMLOIC.ab")
	public int field1341;

	@ObfuscatedName("UKYMLOIC.bb")
	public int field1342;

	@ObfuscatedName("UKYMLOIC.cb")
	public int field1343;

	@ObfuscatedName("UKYMLOIC.gb")
	public int field1347;

	@ObfuscatedName("UKYMLOIC.hb")
	public int field1348;

	@ObfuscatedName("UKYMLOIC.ib")
	public int field1349;

	@ObfuscatedName("UKYMLOIC.kb")
	public int field1351;

	@ObfuscatedName("UKYMLOIC.lb")
	public int field1352;

	@ObfuscatedName("UKYMLOIC.r")
	public String field1307;

	@ObfuscatedName("UKYMLOIC.a(IIII)V")
	public final void method558(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 4; var4++) {
			if (field1327[var4] <= arg2) {
				field1325[var4] = arg0;
				field1326[var4] = arg1;
				field1327[var4] = arg2 + 70;
				return;
			}
		}
	}

	@ObfuscatedName("UKYMLOIC.a(IIIZ)V")
	public final void method559(int arg0, int arg1, boolean arg2) {
		if (field1320 != -1 && KIRTNGZJ.field1015[field1320].field1028 == 1) {
			field1320 = -1;
		}

		if (!arg2) {
			int var4 = arg1 - field1344[0];
			int var5 = arg0 - field1345[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (field1336 < 9) {
					field1336++;
				}

				for (int var6 = field1336; var6 > 0; var6--) {
					field1344[var6] = field1344[var6 - 1];
					field1345[var6] = field1345[var6 - 1];
					field1334[var6] = field1334[var6 - 1];
				}

				field1344[0] = arg1;
				field1345[0] = arg0;
				field1334[0] = false;
				return;
			}
		}

		field1336 = 0;
		field1313 = 0;
		field1311 = 0;
		field1344[0] = arg1;
		field1345[0] = arg0;
		field1347 = field1344[0] * 128 + field1319 * 64;
		field1348 = field1345[0] * 128 + field1319 * 64;
	}

	@ObfuscatedName("UKYMLOIC.b(I)Z")
	public boolean method368() {
		return false;
	}

	@ObfuscatedName("UKYMLOIC.c(I)V")
	public final void method560() {
		field1336 = 0;
		field1313 = 0;
	}

	@ObfuscatedName("UKYMLOIC.a(ZBI)V")
	public final void method561(boolean arg0, int arg1) {
		int var3 = field1344[0];
		int var4 = field1345[0];
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

		if (field1320 != -1 && KIRTNGZJ.field1015[field1320].field1028 == 1) {
			field1320 = -1;
		}

		if (field1336 < 9) {
			field1336++;
		}

		for (int var5 = field1336; var5 > 0; var5--) {
			field1344[var5] = field1344[var5 - 1];
			field1345[var5] = field1345[var5 - 1];
			field1334[var5] = field1334[var5 - 1];
		}

		field1344[0] = var3;
		field1345[0] = var4;
		field1334[0] = arg0;
	}
}
