package deob;

@ObfuscatedName("SRUOAWPS")
public abstract class SRUOAWPS extends UPHLHIWQ {

	@ObfuscatedName("SRUOAWPS.l")
	public int[] field1236 = new int[10];

	@ObfuscatedName("SRUOAWPS.m")
	public int[] field1237 = new int[10];

	@ObfuscatedName("SRUOAWPS.o")
	public int field1239 = -1;

	@ObfuscatedName("SRUOAWPS.p")
	public int field1240 = -1;

	@ObfuscatedName("SRUOAWPS.s")
	public int field1242 = -1;

	@ObfuscatedName("SRUOAWPS.u")
	public int field1243 = 1;

	@ObfuscatedName("SRUOAWPS.v")
	public int field1244 = -1;

	@ObfuscatedName("SRUOAWPS.w")
	public int field1245 = -1;

	@ObfuscatedName("SRUOAWPS.C")
	public int field1251 = 100;

	@ObfuscatedName("SRUOAWPS.N")
	public int field1261 = -1000;

	@ObfuscatedName("SRUOAWPS.R")
	public int field1265 = 200;

	@ObfuscatedName("SRUOAWPS.S")
	public int[] field1266 = new int[4];

	@ObfuscatedName("SRUOAWPS.T")
	public int[] field1267 = new int[4];

	@ObfuscatedName("SRUOAWPS.U")
	public int[] field1268 = new int[4];

	@ObfuscatedName("SRUOAWPS.V")
	public int field1269 = 32;

	@ObfuscatedName("SRUOAWPS.Z")
	public int field1273 = -1;

	@ObfuscatedName("SRUOAWPS.db")
	public boolean field1277 = false;

	@ObfuscatedName("SRUOAWPS.hb")
	public int field1281 = -1;

	@ObfuscatedName("SRUOAWPS.mb")
	public boolean[] field1286 = new boolean[10];

	@ObfuscatedName("SRUOAWPS.nb")
	public int field1287 = -1;

	@ObfuscatedName("SRUOAWPS.ob")
	public int field1288 = -1;

	@ObfuscatedName("SRUOAWPS.pb")
	public int field1289 = -1;

	@ObfuscatedName("SRUOAWPS.qb")
	public int field1290 = -1;

	@ObfuscatedName("SRUOAWPS.n")
	public int field1238;

	@ObfuscatedName("SRUOAWPS.q")
	public int field1241;

	@ObfuscatedName("SRUOAWPS.x")
	public int field1246;

	@ObfuscatedName("SRUOAWPS.y")
	public int field1247;

	@ObfuscatedName("SRUOAWPS.z")
	public int field1248;

	@ObfuscatedName("SRUOAWPS.A")
	public int field1249;

	@ObfuscatedName("SRUOAWPS.B")
	public int field1250;

	@ObfuscatedName("SRUOAWPS.E")
	public int field1252;

	@ObfuscatedName("SRUOAWPS.F")
	public int field1253;

	@ObfuscatedName("SRUOAWPS.G")
	public int field1254;

	@ObfuscatedName("SRUOAWPS.H")
	public int field1255;

	@ObfuscatedName("SRUOAWPS.I")
	public int field1256;

	@ObfuscatedName("SRUOAWPS.J")
	public int field1257;

	@ObfuscatedName("SRUOAWPS.K")
	public int field1258;

	@ObfuscatedName("SRUOAWPS.L")
	public int field1259;

	@ObfuscatedName("SRUOAWPS.M")
	public int field1260;

	@ObfuscatedName("SRUOAWPS.O")
	public int field1262;

	@ObfuscatedName("SRUOAWPS.P")
	public int field1263;

	@ObfuscatedName("SRUOAWPS.Q")
	public int field1264;

	@ObfuscatedName("SRUOAWPS.W")
	public int field1270;

	@ObfuscatedName("SRUOAWPS.X")
	public int field1271;

	@ObfuscatedName("SRUOAWPS.Y")
	public int field1272;

	@ObfuscatedName("SRUOAWPS.ab")
	public int field1274;

	@ObfuscatedName("SRUOAWPS.bb")
	public int field1275;

	@ObfuscatedName("SRUOAWPS.eb")
	public int field1278;

	@ObfuscatedName("SRUOAWPS.fb")
	public int field1279;

	@ObfuscatedName("SRUOAWPS.gb")
	public int field1280;

	@ObfuscatedName("SRUOAWPS.ib")
	public int field1282;

	@ObfuscatedName("SRUOAWPS.jb")
	public int field1283;

	@ObfuscatedName("SRUOAWPS.kb")
	public int field1284;

	@ObfuscatedName("SRUOAWPS.lb")
	public int field1285;

	@ObfuscatedName("SRUOAWPS.cb")
	public String field1276;

	@ObfuscatedName("SRUOAWPS.a(B)Z")
	public boolean method316() {
		return false;
	}

	@ObfuscatedName("SRUOAWPS.a(IIBZ)V")
	public final void method476(int arg0, int arg1, boolean arg2) {
		if (field1245 != -1 && DWUJPTWU.field586[field1245].field599 == 1) {
			field1245 = -1;
		}

		if (!arg2) {
			int var4 = arg0 - field1236[0];
			int var5 = arg1 - field1237[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (field1253 < 9) {
					field1253++;
				}

				for (int var6 = field1253; var6 > 0; var6--) {
					field1236[var6] = field1236[var6 - 1];
					field1237[var6] = field1237[var6 - 1];
					field1286[var6] = field1286[var6 - 1];
				}

				field1236[0] = arg0;
				field1237[0] = arg1;
				field1286[0] = false;
				return;
			}
		}

		field1253 = 0;
		field1250 = 0;
		field1241 = 0;
		field1236[0] = arg0;
		field1237[0] = arg1;
		field1270 = field1236[0] * 128 + field1243 * 64;
		field1271 = field1237[0] * 128 + field1243 * 64;
	}

	@ObfuscatedName("SRUOAWPS.a(IIII)V")
	public final void method477(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 4; var4++) {
			if (field1268[var4] <= arg1) {
				field1266[var4] = arg2;
				field1267[var4] = arg0;
				field1268[var4] = arg1 + 70;
				return;
			}
		}
	}

	@ObfuscatedName("SRUOAWPS.a(BZI)V")
	public final void method478(boolean arg0, int arg1) {
		int var3 = field1236[0];
		int var4 = field1237[0];
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

		if (field1245 != -1 && DWUJPTWU.field586[field1245].field599 == 1) {
			field1245 = -1;
		}

		if (field1253 < 9) {
			field1253++;
		}

		for (int var5 = field1253; var5 > 0; var5--) {
			field1236[var5] = field1236[var5 - 1];
			field1237[var5] = field1237[var5 - 1];
			field1286[var5] = field1286[var5 - 1];
		}

		field1236[0] = var3;
		field1237[0] = var4;
		field1286[0] = arg0;
	}

	@ObfuscatedName("SRUOAWPS.b(B)V")
	public final void method479() {
		field1253 = 0;
		field1250 = 0;
	}
}
