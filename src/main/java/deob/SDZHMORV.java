package deob;

@ObfuscatedName("SDZHMORV")
public final class SDZHMORV extends ESLZGWKZ {

	@ObfuscatedName("SDZHMORV.G")
	public boolean field1247 = false;

	@ObfuscatedName("SDZHMORV.H")
	public YTBPTACV field1248;

	@ObfuscatedName("SDZHMORV.q")
	public int field1232;

	@ObfuscatedName("SDZHMORV.s")
	public int field1234;

	@ObfuscatedName("SDZHMORV.t")
	public int field1235;

	@ObfuscatedName("SDZHMORV.u")
	public int field1236;

	@ObfuscatedName("SDZHMORV.w")
	public int field1238;

	@ObfuscatedName("SDZHMORV.x")
	public int field1239;

	@ObfuscatedName("SDZHMORV.l")
	public int field1227;

	@ObfuscatedName("SDZHMORV.m")
	public int field1228;

	@ObfuscatedName("SDZHMORV.n")
	public int field1229;

	@ObfuscatedName("SDZHMORV.v")
	public int field1237;

	@ObfuscatedName("SDZHMORV.r")
	public double field1233;

	@ObfuscatedName("SDZHMORV.y")
	public double field1240;

	@ObfuscatedName("SDZHMORV.z")
	public double field1241;

	@ObfuscatedName("SDZHMORV.A")
	public double field1242;

	@ObfuscatedName("SDZHMORV.B")
	public double field1243;

	@ObfuscatedName("SDZHMORV.C")
	public double field1244;

	@ObfuscatedName("SDZHMORV.D")
	public double field1245;

	@ObfuscatedName("SDZHMORV.E")
	public double field1246;

	@ObfuscatedName("SDZHMORV.o")
	public int field1230;

	@ObfuscatedName("SDZHMORV.p")
	public int field1231;

	@ObfuscatedName("SDZHMORV.I")
	public int field1249;

	@ObfuscatedName("SDZHMORV.J")
	public int field1250;

	public SDZHMORV(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field1248 = YTBPTACV.field1460[arg10];
		field1232 = arg7;
		field1234 = arg4;
		field1235 = arg2;
		field1236 = arg3;
		field1238 = arg6;
		field1239 = arg1;
		field1227 = arg0;
		field1228 = arg5;
		field1229 = arg8;
		field1237 = arg9;
		field1247 = false;
	}

	@ObfuscatedName("SDZHMORV.a(IIIII)V")
	public final void method479(int arg0, int arg1, int arg2, int arg3) {
		if (!field1247) {
			double var5 = (double) (arg0 - field1234);
			double var7 = (double) (arg1 - field1235);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field1244 = field1228 * var5 / var9 + field1234;
			field1245 = field1228 * var7 / var9 + field1235;
			field1246 = field1236;
		}

		double var11 = (double) (field1239 + 1 - arg2);
		field1240 = (arg0 - field1244) / var11;
		field1241 = (arg1 - field1245) / var11;
		field1242 = Math.sqrt(field1241 * field1241 + field1240 * field1240);
		if (!field1247) {
			field1243 = -field1242 * Math.tan(field1227 * 0.02454369D);
		}

		field1233 = (arg3 - field1246 - field1243 * var11) * 2.0D / (var11 * var11);
	}

	@ObfuscatedName("SDZHMORV.a(ZI)V")
	public final void method480(int arg0) {
		field1247 = true;
		field1244 += arg0 * field1240;
		field1245 += arg0 * field1241;
		field1246 += field1233 * 0.5D * arg0 * arg0 + arg0 * field1243;
		field1243 += arg0 * field1233;
		field1249 = (int) (Math.atan2(field1240, field1241) * 325.949D) + 1024 & 0x7FF;
		field1250 = (int) (Math.atan2(field1243, field1242) * 325.949D) & 0x7FF;

		if (field1248.field1464 != null) {
			field1231 += arg0;
			while (field1231 > field1248.field1464.method275(field1230)) {
				field1231 -= field1248.field1464.method275(field1230) + 1;
				field1230++;
				if (field1230 >= field1248.field1464.field841) {
					field1230 = 0;
				}
			}
		}
	}

	@ObfuscatedName("SDZHMORV.a(B)LDHUPIIUL;")
	public final DHUPIIUL method159() {
		DHUPIIUL var1 = field1248.method582();
		if (var1 == null) {
			return null;
		}

		int var2 = -1;
		if (field1248.field1464 != null) {
			var2 = field1248.field1464.field842[field1230];
		}

		DHUPIIUL var3 = new DHUPIIUL(var1, false, BWSGQYNU.method16(var2), true);
		if (var2 != -1) {
			var3.method198();
			var3.method199(var2);
			var3.field576 = null;
			var3.field575 = null;
		}

		if (field1248.field1467 != 128 || field1248.field1468 != 128) {
			var3.method207(field1248.field1467, field1248.field1468, field1248.field1467);
		}

		var3.method203(field1250);
		var3.method208(field1248.field1470 + 64, field1248.field1471 + 850, -30, -50, -30, true);
		return var3;
	}
}
