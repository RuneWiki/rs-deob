package deob;

@ObfuscatedName("QNSFNRFM")
public final class QNSFNRFM extends ANJAEDVY {

	@ObfuscatedName("QNSFNRFM.G")
	public boolean field1289 = false;

	@ObfuscatedName("QNSFNRFM.H")
	public IMWZJOXU field1290;

	@ObfuscatedName("QNSFNRFM.p")
	public int field1274;

	@ObfuscatedName("QNSFNRFM.x")
	public int field1281;

	@ObfuscatedName("QNSFNRFM.y")
	public int field1282;

	@ObfuscatedName("QNSFNRFM.z")
	public int field1283;

	@ObfuscatedName("QNSFNRFM.B")
	public int field1285;

	@ObfuscatedName("QNSFNRFM.C")
	public int field1286;

	@ObfuscatedName("QNSFNRFM.m")
	public int field1271;

	@ObfuscatedName("QNSFNRFM.n")
	public int field1272;

	@ObfuscatedName("QNSFNRFM.o")
	public int field1273;

	@ObfuscatedName("QNSFNRFM.A")
	public int field1284;

	@ObfuscatedName("QNSFNRFM.q")
	public double field1275;

	@ObfuscatedName("QNSFNRFM.u")
	public double field1278;

	@ObfuscatedName("QNSFNRFM.v")
	public double field1279;

	@ObfuscatedName("QNSFNRFM.w")
	public double field1280;

	@ObfuscatedName("QNSFNRFM.J")
	public double field1291;

	@ObfuscatedName("QNSFNRFM.K")
	public double field1292;

	@ObfuscatedName("QNSFNRFM.L")
	public double field1293;

	@ObfuscatedName("QNSFNRFM.M")
	public double field1294;

	@ObfuscatedName("QNSFNRFM.s")
	public int field1276;

	@ObfuscatedName("QNSFNRFM.t")
	public int field1277;

	@ObfuscatedName("QNSFNRFM.D")
	public int field1287;

	@ObfuscatedName("QNSFNRFM.E")
	public int field1288;

	public QNSFNRFM(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field1290 = IMWZJOXU.field992[arg6];
		field1274 = arg0;
		field1281 = arg7;
		field1282 = arg1;
		field1283 = arg2;
		field1285 = arg10;
		field1286 = arg3;
		field1271 = arg8;
		field1272 = arg5;
		field1273 = arg4;
		field1284 = arg9;
		field1289 = false;
	}

	@ObfuscatedName("QNSFNRFM.a(B)LLSSDQDBV;")
	public final LSSDQDBV method6() {
		LSSDQDBV var1 = field1290.method378();
		if (var1 == null) {
			return null;
		}

		int var2 = -1;
		if (field1290.field996 != null) {
			var2 = field1290.field996.field1472[field1276];
		}

		LSSDQDBV var3 = new LSSDQDBV(false, var1, YGZNOIUP.method599(var2), true);
		if (var2 != -1) {
			var3.method430();
			var3.method431(var2);
			var3.field1096 = null;
			var3.field1095 = null;
		}

		if (field1290.field999 != 128 || field1290.field1000 != 128) {
			var3.method439(field1290.field1000, field1290.field999, field1290.field999);
		}

		var3.method435(field1288);
		var3.method440(field1290.field1002 + 64, field1290.field1003 + 850, -30, -50, -30, true);
		return var3;
	}

	@ObfuscatedName("QNSFNRFM.a(IZ)V")
	public final void method537(int arg0) {
		field1289 = true;
		field1278 += arg0 * field1291;
		field1279 += arg0 * field1292;
		field1280 += field1275 * 0.5D * arg0 * arg0 + arg0 * field1294;
		field1294 += arg0 * field1275;
		field1287 = (int) (Math.atan2(field1291, field1292) * 325.949D) + 1024 & 0x7FF;
		field1288 = (int) (Math.atan2(field1294, field1293) * 325.949D) & 0x7FF;

		if (field1290.field996 != null) {
			field1277 += arg0;
			while (field1277 > field1290.field996.method581(field1276)) {
				field1277 -= field1290.field996.method581(field1276) + 1;
				field1276++;
				if (field1276 >= field1290.field996.field1471) {
					field1276 = 0;
				}
			}
		}
	}

	@ObfuscatedName("QNSFNRFM.a(IIIIZ)V")
	public final void method538(int arg0, int arg1, int arg2, int arg3) {
		if (!field1289) {
			double var5 = (double) (arg3 - field1281);
			double var7 = (double) (arg2 - field1282);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field1278 = field1272 * var5 / var9 + field1281;
			field1279 = field1272 * var7 / var9 + field1282;
			field1280 = field1283;
		}

		double var11 = (double) (field1286 + 1 - arg0);
		field1291 = (arg3 - field1278) / var11;
		field1292 = (arg2 - field1279) / var11;
		field1293 = Math.sqrt(field1292 * field1292 + field1291 * field1291);
		if (!field1289) {
			field1294 = -field1293 * Math.tan(field1271 * 0.02454369D);
		}

		field1275 = (arg1 - field1280 - field1294 * var11) * 2.0D / (var11 * var11);
	}
}
