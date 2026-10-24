package deob;

@ObfuscatedName("SCWHDOGN")
public final class SCWHDOGN extends ZHYAQRMA {

	@ObfuscatedName("SCWHDOGN.r")
	public boolean field1236 = false;

	@ObfuscatedName("SCWHDOGN.A")
	public BYUDODIR field1245;

	@ObfuscatedName("SCWHDOGN.q")
	public int field1235;

	@ObfuscatedName("SCWHDOGN.u")
	public int field1239;

	@ObfuscatedName("SCWHDOGN.v")
	public int field1240;

	@ObfuscatedName("SCWHDOGN.w")
	public int field1241;

	@ObfuscatedName("SCWHDOGN.y")
	public int field1243;

	@ObfuscatedName("SCWHDOGN.z")
	public int field1244;

	@ObfuscatedName("SCWHDOGN.K")
	public int field1252;

	@ObfuscatedName("SCWHDOGN.L")
	public int field1253;

	@ObfuscatedName("SCWHDOGN.M")
	public int field1254;

	@ObfuscatedName("SCWHDOGN.x")
	public int field1242;

	@ObfuscatedName("SCWHDOGN.l")
	public double field1231;

	@ObfuscatedName("SCWHDOGN.m")
	public double field1232;

	@ObfuscatedName("SCWHDOGN.n")
	public double field1233;

	@ObfuscatedName("SCWHDOGN.o")
	public double field1234;

	@ObfuscatedName("SCWHDOGN.D")
	public double field1248;

	@ObfuscatedName("SCWHDOGN.E")
	public double field1249;

	@ObfuscatedName("SCWHDOGN.F")
	public double field1250;

	@ObfuscatedName("SCWHDOGN.I")
	public double field1251;

	@ObfuscatedName("SCWHDOGN.s")
	public int field1237;

	@ObfuscatedName("SCWHDOGN.t")
	public int field1238;

	@ObfuscatedName("SCWHDOGN.B")
	public int field1246;

	@ObfuscatedName("SCWHDOGN.C")
	public int field1247;

	public SCWHDOGN(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field1245 = BYUDODIR.field34[arg3];
		field1235 = arg0;
		field1239 = arg4;
		field1240 = arg9;
		field1241 = arg8;
		field1243 = arg6;
		field1244 = arg2;
		field1252 = arg10;
		field1253 = arg7;
		field1254 = arg1;
		field1242 = arg5;
		field1236 = false;
	}

	@ObfuscatedName("SCWHDOGN.a(BI)V")
	public final void method470(int arg0) {
		field1236 = true;
		field1248 += arg0 * field1231;
		field1249 += arg0 * field1232;
		field1250 += field1251 * 0.5D * arg0 * arg0 + arg0 * field1234;
		field1234 += arg0 * field1251;
		field1246 = (int) (Math.atan2(field1231, field1232) * 325.949D) + 1024 & 0x7FF;
		field1247 = (int) (Math.atan2(field1234, field1233) * 325.949D) & 0x7FF;

		if (field1245.field38 != null) {
			field1238 += arg0;
			while (field1238 > field1245.field38.method525(field1237)) {
				field1238 -= field1245.field38.method525(field1237) + 1;
				field1237++;
				if (field1237 >= field1245.field38.field1340) {
					field1237 = 0;
				}
			}
		}
	}

	@ObfuscatedName("SCWHDOGN.a(Z)LOQIGXOFQ;")
	public final OQIGXOFQ method171() {
		OQIGXOFQ var1 = field1245.method18();
		if (var1 == null) {
			return null;
		}

		int var2 = -1;
		if (field1245.field38 != null) {
			var2 = field1245.field38.field1341[field1237];
		}

		OQIGXOFQ var3 = new OQIGXOFQ(XZZTWOGF.method582(var2), var1, false, true);
		if (var2 != -1) {
			var3.method398();
			var3.method399(var2);
			var3.field1066 = null;
			var3.field1065 = null;
		}

		if (field1245.field41 != 128 || field1245.field42 != 128) {
			var3.method407(field1245.field42, field1245.field41, field1245.field41);
		}

		var3.method403(field1247);
		var3.method408(field1245.field44 + 64, field1245.field45 + 850, -30, -50, -30, true);
		return var3;
	}

	@ObfuscatedName("SCWHDOGN.a(IIIII)V")
	public final void method471(int arg0, int arg1, int arg2, int arg3) {
		if (!field1236) {
			double var5 = (double) (arg3 - field1239);
			double var7 = (double) (arg2 - field1240);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field1248 = field1253 * var5 / var9 + field1239;
			field1249 = field1253 * var7 / var9 + field1240;
			field1250 = field1241;
		}

		double var11 = (double) (field1244 + 1 - arg1);
		field1231 = (arg3 - field1248) / var11;
		field1232 = (arg2 - field1249) / var11;
		field1233 = Math.sqrt(field1232 * field1232 + field1231 * field1231);
		if (!field1236) {
			field1234 = -field1233 * Math.tan(field1252 * 0.02454369D);
		}

		field1251 = (arg0 - field1250 - field1234 * var11) * 2.0D / (var11 * var11);
	}
}
