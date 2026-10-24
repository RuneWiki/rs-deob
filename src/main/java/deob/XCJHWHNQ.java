package deob;

@ObfuscatedName("XCJHWHNQ")
public final class XCJHWHNQ extends YDNCHMHU {

	@ObfuscatedName("XCJHWHNQ.K")
	public boolean field1316 = false;

	@ObfuscatedName("XCJHWHNQ.F")
	public IDQQUVDL field1311;

	@ObfuscatedName("XCJHWHNQ.q")
	public int field1297;

	@ObfuscatedName("XCJHWHNQ.m")
	public int field1293;

	@ObfuscatedName("XCJHWHNQ.n")
	public int field1294;

	@ObfuscatedName("XCJHWHNQ.o")
	public int field1295;

	@ObfuscatedName("XCJHWHNQ.x")
	public int field1303;

	@ObfuscatedName("XCJHWHNQ.y")
	public int field1304;

	@ObfuscatedName("XCJHWHNQ.z")
	public int field1305;

	@ObfuscatedName("XCJHWHNQ.A")
	public int field1306;

	@ObfuscatedName("XCJHWHNQ.B")
	public int field1307;

	@ObfuscatedName("XCJHWHNQ.p")
	public int field1296;

	@ObfuscatedName("XCJHWHNQ.s")
	public double field1298;

	@ObfuscatedName("XCJHWHNQ.C")
	public double field1308;

	@ObfuscatedName("XCJHWHNQ.D")
	public double field1309;

	@ObfuscatedName("XCJHWHNQ.E")
	public double field1310;

	@ObfuscatedName("XCJHWHNQ.G")
	public double field1312;

	@ObfuscatedName("XCJHWHNQ.H")
	public double field1313;

	@ObfuscatedName("XCJHWHNQ.I")
	public double field1314;

	@ObfuscatedName("XCJHWHNQ.J")
	public double field1315;

	@ObfuscatedName("XCJHWHNQ.t")
	public int field1299;

	@ObfuscatedName("XCJHWHNQ.u")
	public int field1300;

	@ObfuscatedName("XCJHWHNQ.v")
	public int field1301;

	@ObfuscatedName("XCJHWHNQ.w")
	public int field1302;

	public XCJHWHNQ(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field1311 = IDQQUVDL.field738[arg3];
		field1297 = arg1;
		field1293 = arg2;
		field1294 = arg7;
		field1295 = arg10;
		field1303 = arg8;
		field1304 = arg0;
		field1305 = arg6;
		field1306 = arg5;
		field1307 = arg4;
		field1296 = arg9;
		field1316 = false;
	}

	@ObfuscatedName("XCJHWHNQ.a(Z)LOIBEFFXI;")
	public final OIBEFFXI method2() {
		OIBEFFXI var1 = field1311.method233();
		if (var1 == null) {
			return null;
		}

		int var2 = -1;
		if (field1311.field742 != null) {
			var2 = field1311.field742.field152[field1299];
		}

		OIBEFFXI var3 = new OIBEFFXI(false, true, var1, UXVWESOT.method455(var2));
		if (var2 != -1) {
			var3.method353();
			var3.method354(var2);
			var3.field985 = null;
			var3.field984 = null;
		}

		if (field1311.field745 != 128 || field1311.field746 != 128) {
			var3.method362(field1311.field746, field1311.field745, field1311.field745);
		}

		var3.method358(field1302);
		var3.method363(field1311.field748 + 64, field1311.field749 + 850, -30, -50, -30, true);
		return var3;
	}

	@ObfuscatedName("XCJHWHNQ.a(IIIBI)V")
	public final void method514(int arg0, int arg1, int arg2, int arg3) {
		if (!field1316) {
			double var5 = (double) (arg3 - field1293);
			double var7 = (double) (arg0 - field1294);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field1308 = field1306 * var5 / var9 + field1293;
			field1309 = field1306 * var7 / var9 + field1294;
			field1310 = field1295;
		}

		double var11 = (double) (field1304 + 1 - arg1);
		field1312 = (arg3 - field1308) / var11;
		field1313 = (arg0 - field1309) / var11;
		field1314 = Math.sqrt(field1313 * field1313 + field1312 * field1312);
		if (!field1316) {
			field1315 = -field1314 * Math.tan(field1305 * 0.02454369D);
		}

		field1298 = (arg2 - field1310 - field1315 * var11) * 2.0D / (var11 * var11);
	}

	@ObfuscatedName("XCJHWHNQ.a(IB)V")
	public final void method515(int arg0) {
		field1316 = true;
		field1308 += arg0 * field1312;
		field1309 += arg0 * field1313;
		field1310 += field1298 * 0.5D * arg0 * arg0 + arg0 * field1315;
		field1315 += arg0 * field1298;
		field1301 = (int) (Math.atan2(field1312, field1313) * 325.949D) + 1024 & 0x7FF;
		field1302 = (int) (Math.atan2(field1315, field1314) * 325.949D) & 0x7FF;

		if (field1311.field742 != null) {
			field1300 += arg0;
			while (field1300 > field1311.field742.method23(field1299)) {
				field1300 -= field1311.field742.method23(field1299) + 1;
				field1299++;
				if (field1299 >= field1311.field742.field151) {
					field1299 = 0;
				}
			}
		}
	}
}
