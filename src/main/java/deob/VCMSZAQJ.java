package deob;

@ObfuscatedName("VCMSZAQJ")
public final class VCMSZAQJ extends HTDIJKWW {

	@ObfuscatedName("VCMSZAQJ.K")
	public boolean field1310 = false;

	@ObfuscatedName("VCMSZAQJ.m")
	public QUXKFXEA field1288;

	@ObfuscatedName("VCMSZAQJ.L")
	public int field1311;

	@ObfuscatedName("VCMSZAQJ.G")
	public int field1306;

	@ObfuscatedName("VCMSZAQJ.H")
	public int field1307;

	@ObfuscatedName("VCMSZAQJ.I")
	public int field1308;

	@ObfuscatedName("VCMSZAQJ.E")
	public int field1304;

	@ObfuscatedName("VCMSZAQJ.F")
	public int field1305;

	@ObfuscatedName("VCMSZAQJ.y")
	public int field1298;

	@ObfuscatedName("VCMSZAQJ.z")
	public int field1299;

	@ObfuscatedName("VCMSZAQJ.A")
	public int field1300;

	@ObfuscatedName("VCMSZAQJ.J")
	public int field1309;

	@ObfuscatedName("VCMSZAQJ.n")
	public double field1289;

	@ObfuscatedName("VCMSZAQJ.o")
	public double field1290;

	@ObfuscatedName("VCMSZAQJ.p")
	public double field1291;

	@ObfuscatedName("VCMSZAQJ.q")
	public double field1292;

	@ObfuscatedName("VCMSZAQJ.v")
	public double field1295;

	@ObfuscatedName("VCMSZAQJ.w")
	public double field1296;

	@ObfuscatedName("VCMSZAQJ.x")
	public double field1297;

	@ObfuscatedName("VCMSZAQJ.B")
	public double field1301;

	@ObfuscatedName("VCMSZAQJ.s")
	public int field1293;

	@ObfuscatedName("VCMSZAQJ.t")
	public int field1294;

	@ObfuscatedName("VCMSZAQJ.C")
	public int field1302;

	@ObfuscatedName("VCMSZAQJ.D")
	public int field1303;

	@ObfuscatedName("VCMSZAQJ.a(I)LKDWDYCIL;")
	public final KDWDYCIL method185() {
		KDWDYCIL var1 = field1288.method413();
		if (var1 == null) {
			return null;
		}

		int var2 = -1;
		if (field1288.field1152 != null) {
			var2 = field1288.field1152.field869[field1293];
		}

		KDWDYCIL var3 = new KDWDYCIL(false, var1, SGSYCWFB.method423(var2), true);
		if (var2 != -1) {
			var3.method253();
			var3.method254(var2);
			var3.field797 = null;
			var3.field796 = null;
		}

		if (field1288.field1155 != 128 || field1288.field1156 != 128) {
			var3.method262(field1288.field1155, field1288.field1155, field1288.field1156);
		}

		var3.method258(field1303);
		var3.method263(field1288.field1158 + 64, field1288.field1159 + 850, -30, -50, -30, true);
		return var3;
	}

	@ObfuscatedName("VCMSZAQJ.a(IIIII)V")
	public final void method532(int arg0, int arg1, int arg2, int arg3) {
		if (!field1310) {
			double var5 = (double) (arg1 - field1306);
			double var7 = (double) (arg3 - field1307);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field1295 = field1299 * var5 / var9 + field1306;
			field1296 = field1299 * var7 / var9 + field1307;
			field1297 = field1308;
		}

		double var11 = (double) (field1305 + 1 - arg2);
		field1289 = (arg1 - field1295) / var11;
		field1290 = (arg3 - field1296) / var11;
		field1291 = Math.sqrt(field1290 * field1290 + field1289 * field1289);
		if (!field1310) {
			field1292 = -field1291 * Math.tan(field1298 * 0.02454369D);
		}

		field1301 = (arg0 - field1297 - field1292 * var11) * 2.0D / (var11 * var11);
	}

	@ObfuscatedName("VCMSZAQJ.a(IZ)V")
	public final void method533(int arg0) {
		field1310 = true;
		field1295 += arg0 * field1289;
		field1296 += arg0 * field1290;
		field1297 += field1301 * 0.5D * arg0 * arg0 + arg0 * field1292;
		field1292 += arg0 * field1301;
		field1302 = (int) (Math.atan2(field1289, field1290) * 325.949D) + 1024 & 0x7FF;
		field1303 = (int) (Math.atan2(field1292, field1291) * 325.949D) & 0x7FF;

		if (field1288.field1152 != null) {
			field1294 += arg0;
			while (field1294 > field1288.field1152.method280(field1293)) {
				field1294 -= field1288.field1152.method280(field1293) + 1;
				field1293++;
				if (field1293 >= field1288.field1152.field868) {
					field1293 = 0;
				}
			}
		}
	}

	public VCMSZAQJ(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field1288 = QUXKFXEA.field1148[arg8];
		field1311 = arg5;
		field1306 = arg10;
		field1307 = arg3;
		field1308 = arg4;
		field1304 = arg0;
		field1305 = arg9;
		field1298 = arg1;
		field1299 = arg7;
		field1300 = arg2;
		field1309 = arg6;
		field1310 = false;
	}
}
