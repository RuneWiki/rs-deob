package deob;

@ObfuscatedName("OXJUGPEO")
public final class OXJUGPEO extends BXTJETAB {

	@ObfuscatedName("OXJUGPEO.s")
	public boolean field1116 = false;

	@ObfuscatedName("OXJUGPEO.n")
	public VCTVXSNH field1112;

	@ObfuscatedName("OXJUGPEO.C")
	public int field1125;

	@ObfuscatedName("OXJUGPEO.u")
	public int field1117;

	@ObfuscatedName("OXJUGPEO.v")
	public int field1118;

	@ObfuscatedName("OXJUGPEO.w")
	public int field1119;

	@ObfuscatedName("OXJUGPEO.J")
	public int field1132;

	@ObfuscatedName("OXJUGPEO.K")
	public int field1133;

	@ObfuscatedName("OXJUGPEO.z")
	public int field1122;

	@ObfuscatedName("OXJUGPEO.A")
	public int field1123;

	@ObfuscatedName("OXJUGPEO.B")
	public int field1124;

	@ObfuscatedName("OXJUGPEO.x")
	public int field1120;

	@ObfuscatedName("OXJUGPEO.o")
	public double field1113;

	@ObfuscatedName("OXJUGPEO.p")
	public double field1114;

	@ObfuscatedName("OXJUGPEO.q")
	public double field1115;

	@ObfuscatedName("OXJUGPEO.y")
	public double field1121;

	@ObfuscatedName("OXJUGPEO.D")
	public double field1126;

	@ObfuscatedName("OXJUGPEO.E")
	public double field1127;

	@ObfuscatedName("OXJUGPEO.F")
	public double field1128;

	@ObfuscatedName("OXJUGPEO.G")
	public double field1129;

	@ObfuscatedName("OXJUGPEO.l")
	public int field1110;

	@ObfuscatedName("OXJUGPEO.m")
	public int field1111;

	@ObfuscatedName("OXJUGPEO.H")
	public int field1130;

	@ObfuscatedName("OXJUGPEO.I")
	public int field1131;

	public OXJUGPEO(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field1112 = VCTVXSNH.field1348[arg8];
		field1125 = arg1;
		field1117 = arg5;
		field1118 = arg2;
		field1119 = arg6;
		field1132 = arg0;
		field1133 = arg9;
		field1122 = arg7;
		field1123 = arg3;
		field1124 = arg4;
		field1120 = arg10;
		field1116 = false;
	}

	@ObfuscatedName("OXJUGPEO.a(I)LIGXVZOHI;")
	public final IGXVZOHI method25() {
		IGXVZOHI var1 = field1112.method555();
		if (var1 == null) {
			return null;
		}

		int var2 = -1;
		if (field1112.field1352 != null) {
			var2 = field1112.field1352.field55[field1110];
		}

		IGXVZOHI var3 = new IGXVZOHI(true, var1, false, ICYGYVTE.method349(var2));
		if (var2 != -1) {
			var3.method361();
			var3.method362(var2);
			var3.field810 = null;
			var3.field809 = null;
		}

		if (field1112.field1355 != 128 || field1112.field1356 != 128) {
			var3.method370(field1112.field1355, field1112.field1356, field1112.field1355);
		}

		var3.method366(field1131);
		var3.method371(field1112.field1358 + 64, field1112.field1359 + 850, -30, -50, -30, true);
		return var3;
	}

	@ObfuscatedName("OXJUGPEO.a(IIIII)V")
	public final void method500(int arg0, int arg1, int arg2, int arg3) {
		if (!field1116) {
			double var5 = (double) (arg1 - field1117);
			double var7 = (double) (arg2 - field1118);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field1113 = field1123 * var5 / var9 + field1117;
			field1114 = field1123 * var7 / var9 + field1118;
			field1115 = field1119;
		}

		double var11 = (double) (field1133 + 1 - arg0);
		field1126 = (arg1 - field1113) / var11;
		field1127 = (arg2 - field1114) / var11;
		field1128 = Math.sqrt(field1127 * field1127 + field1126 * field1126);
		if (!field1116) {
			field1129 = -field1128 * Math.tan(field1122 * 0.02454369D);
		}

		field1121 = (arg3 - field1115 - field1129 * var11) * 2.0D / (var11 * var11);
	}

	@ObfuscatedName("OXJUGPEO.a(IB)V")
	public final void method501(int arg0) {
		field1116 = true;
		field1113 += arg0 * field1126;
		field1114 += arg0 * field1127;
		field1115 += field1121 * 0.5D * arg0 * arg0 + arg0 * field1129;
		field1129 += arg0 * field1121;
		field1130 = (int) (Math.atan2(field1126, field1127) * 325.949D) + 1024 & 0x7FF;
		field1131 = (int) (Math.atan2(field1129, field1128) * 325.949D) & 0x7FF;

		if (field1112.field1352 != null) {
			field1111 += arg0;
			while (field1111 > field1112.field1352.method27(field1110)) {
				field1111 -= field1112.field1352.method27(field1110) + 1;
				field1110++;
				if (field1110 >= field1112.field1352.field54) {
					field1110 = 0;
				}
			}
		}
	}
}
