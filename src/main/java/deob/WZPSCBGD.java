package deob;

@ObfuscatedName("WZPSCBGD")
public final class WZPSCBGD extends DVAULXJA {

	@ObfuscatedName("WZPSCBGD.L")
	public boolean field1315 = false;

	@ObfuscatedName("WZPSCBGD.F")
	public SDNQJNMP field1309;

	@ObfuscatedName("WZPSCBGD.o")
	public int field1293;

	@ObfuscatedName("WZPSCBGD.u")
	public int field1299;

	@ObfuscatedName("WZPSCBGD.v")
	public int field1300;

	@ObfuscatedName("WZPSCBGD.w")
	public int field1301;

	@ObfuscatedName("WZPSCBGD.p")
	public int field1294;

	@ObfuscatedName("WZPSCBGD.q")
	public int field1295;

	@ObfuscatedName("WZPSCBGD.r")
	public int field1296;

	@ObfuscatedName("WZPSCBGD.s")
	public int field1297;

	@ObfuscatedName("WZPSCBGD.t")
	public int field1298;

	@ObfuscatedName("WZPSCBGD.x")
	public int field1302;

	@ObfuscatedName("WZPSCBGD.n")
	public double field1292;

	@ObfuscatedName("WZPSCBGD.B")
	public double field1305;

	@ObfuscatedName("WZPSCBGD.C")
	public double field1306;

	@ObfuscatedName("WZPSCBGD.D")
	public double field1307;

	@ObfuscatedName("WZPSCBGD.E")
	public double field1308;

	@ObfuscatedName("WZPSCBGD.I")
	public double field1312;

	@ObfuscatedName("WZPSCBGD.J")
	public double field1313;

	@ObfuscatedName("WZPSCBGD.K")
	public double field1314;

	@ObfuscatedName("WZPSCBGD.y")
	public int field1303;

	@ObfuscatedName("WZPSCBGD.z")
	public int field1304;

	@ObfuscatedName("WZPSCBGD.G")
	public int field1310;

	@ObfuscatedName("WZPSCBGD.H")
	public int field1311;

	@ObfuscatedName("WZPSCBGD.a(II)V")
	public final void method475(int arg0) {
		field1315 = true;
		field1312 += arg0 * field1305;
		field1313 += arg0 * field1306;
		field1314 += field1292 * 0.5D * arg0 * arg0 + arg0 * field1308;
		field1308 += arg0 * field1292;
		field1303 = (int) (Math.atan2(field1305, field1306) * 325.949D) + 1024 & 0x7FF;
		field1304 = (int) (Math.atan2(field1308, field1307) * 325.949D) & 0x7FF;

		if (field1309.field1131 != null) {
			field1311 += arg0;
			while (field1311 > field1309.field1131.method459(field1310)) {
				field1311 -= field1309.field1131.method459(field1310) + 1;
				field1310++;
				if (field1310 >= field1309.field1131.field1274) {
					field1310 = 0;
				}
			}
		}
	}

	public WZPSCBGD(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field1309 = SDNQJNMP.field1127[arg5];
		field1293 = arg6;
		field1299 = arg7;
		field1300 = arg1;
		field1301 = arg10;
		field1294 = arg0;
		field1295 = arg4;
		field1296 = arg2;
		field1297 = arg9;
		field1298 = arg8;
		field1302 = arg3;
		field1315 = false;
	}

	@ObfuscatedName("WZPSCBGD.a(I)LIEHKDFMR;")
	public final IEHKDFMR method24() {
		IEHKDFMR var1 = field1309.method396();
		if (var1 == null) {
			return null;
		}

		int var2 = -1;
		if (field1309.field1131 != null) {
			var2 = field1309.field1131.field1275[field1310];
		}

		IEHKDFMR var3 = new IEHKDFMR(false, NXEWQQJO.method337(var2), var1, true);
		if (var2 != -1) {
			var3.method274();
			var3.method275(var2);
			var3.field694 = null;
			var3.field693 = null;
		}

		if (field1309.field1134 != 128 || field1309.field1135 != 128) {
			var3.method283(field1309.field1134, field1309.field1135, field1309.field1134);
		}

		var3.method279(field1304);
		var3.method284(field1309.field1137 + 64, field1309.field1138 + 850, -30, -50, -30, true);
		return var3;
	}

	@ObfuscatedName("WZPSCBGD.a(IIIII)V")
	public final void method476(int arg0, int arg1, int arg2, int arg3) {
		if (!field1315) {
			double var5 = (double) (arg1 - field1299);
			double var7 = (double) (arg0 - field1300);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field1312 = field1297 * var5 / var9 + field1299;
			field1313 = field1297 * var7 / var9 + field1300;
			field1314 = field1301;
		}

		double var11 = (double) (field1295 + 1 - arg2);
		field1305 = (arg1 - field1312) / var11;
		field1306 = (arg0 - field1313) / var11;
		field1307 = Math.sqrt(field1306 * field1306 + field1305 * field1305);
		if (!field1315) {
			field1308 = -field1307 * Math.tan(field1296 * 0.02454369D);
		}

		field1292 = (arg3 - field1314 - field1308 * var11) * 2.0D / (var11 * var11);
	}
}
