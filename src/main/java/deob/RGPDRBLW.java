package deob;

@ObfuscatedName("RGPDRBLW")
public final class RGPDRBLW extends QLYZESGB {

	@ObfuscatedName("RGPDRBLW.y")
	public boolean field1119 = false;

	@ObfuscatedName("RGPDRBLW.N")
	public MHWTJCHJ field1132;

	@ObfuscatedName("RGPDRBLW.E")
	public int field1123;

	@ObfuscatedName("RGPDRBLW.F")
	public int field1124;

	@ObfuscatedName("RGPDRBLW.G")
	public int field1125;

	@ObfuscatedName("RGPDRBLW.H")
	public int field1126;

	@ObfuscatedName("RGPDRBLW.p")
	public int field1111;

	@ObfuscatedName("RGPDRBLW.q")
	public int field1112;

	@ObfuscatedName("RGPDRBLW.B")
	public int field1120;

	@ObfuscatedName("RGPDRBLW.C")
	public int field1121;

	@ObfuscatedName("RGPDRBLW.D")
	public int field1122;

	@ObfuscatedName("RGPDRBLW.I")
	public int field1127;

	@ObfuscatedName("RGPDRBLW.u")
	public double field1115;

	@ObfuscatedName("RGPDRBLW.v")
	public double field1116;

	@ObfuscatedName("RGPDRBLW.w")
	public double field1117;

	@ObfuscatedName("RGPDRBLW.x")
	public double field1118;

	@ObfuscatedName("RGPDRBLW.J")
	public double field1128;

	@ObfuscatedName("RGPDRBLW.K")
	public double field1129;

	@ObfuscatedName("RGPDRBLW.L")
	public double field1130;

	@ObfuscatedName("RGPDRBLW.M")
	public double field1131;

	@ObfuscatedName("RGPDRBLW.n")
	public int field1109;

	@ObfuscatedName("RGPDRBLW.o")
	public int field1110;

	@ObfuscatedName("RGPDRBLW.r")
	public int field1113;

	@ObfuscatedName("RGPDRBLW.s")
	public int field1114;

	@ObfuscatedName("RGPDRBLW.a(B)LRMLAXPMV;")
	public final RMLAXPMV method344() {
		RMLAXPMV var1 = field1132.method367();
		if (var1 == null) {
			return null;
		}

		int var2 = -1;
		if (field1132.field843 != null) {
			var2 = field1132.field843.field759[field1113];
		}

		RMLAXPMV var3 = new RMLAXPMV(var1, XMRZESBN.method586(var2), true, false);
		if (var2 != -1) {
			var3.method473();
			var3.method474(var2);
			var3.field1170 = null;
			var3.field1169 = null;
		}

		if (field1132.field846 != 128 || field1132.field847 != 128) {
			var3.method482(field1132.field847, field1132.field846, field1132.field846);
		}

		var3.method478(field1110);
		var3.method483(field1132.field849 + 64, field1132.field850 + 850, -30, -50, -30, true);
		return var3;
	}

	public RGPDRBLW(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field1132 = MHWTJCHJ.field839[arg1];
		field1123 = arg4;
		field1124 = arg5;
		field1125 = arg10;
		field1126 = arg7;
		field1111 = arg0;
		field1112 = arg8;
		field1120 = arg2;
		field1121 = arg3;
		field1122 = arg9;
		field1127 = arg6;
		field1119 = false;
	}

	@ObfuscatedName("RGPDRBLW.a(IIIIB)V")
	public final void method460(int arg0, int arg1, int arg2, int arg3) {
		if (!field1119) {
			double var5 = (double) (arg1 - field1124);
			double var7 = (double) (arg2 - field1125);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field1129 = field1121 * var5 / var9 + field1124;
			field1130 = field1121 * var7 / var9 + field1125;
			field1131 = field1126;
		}

		double var11 = (double) (field1112 + 1 - arg3);
		field1115 = (arg1 - field1129) / var11;
		field1116 = (arg2 - field1130) / var11;
		field1117 = Math.sqrt(field1116 * field1116 + field1115 * field1115);
		if (!field1119) {
			field1118 = -field1117 * Math.tan(field1120 * 0.02454369D);
		}

		field1128 = (arg0 - field1131 - field1118 * var11) * 2.0D / (var11 * var11);
	}

	@ObfuscatedName("RGPDRBLW.a(IB)V")
	public final void method461(int arg0) {
		field1119 = true;
		field1129 += arg0 * field1115;
		field1130 += arg0 * field1116;
		field1131 += field1128 * 0.5D * arg0 * arg0 + arg0 * field1118;
		field1118 += arg0 * field1128;
		field1109 = (int) (Math.atan2(field1115, field1116) * 325.949D) + 1024 & 0x7FF;
		field1110 = (int) (Math.atan2(field1118, field1117) * 325.949D) & 0x7FF;

		if (field1132.field843 != null) {
			field1114 += arg0;
			while (field1114 > field1132.field843.method342(field1113)) {
				field1114 -= field1132.field843.method342(field1113);
				field1113++;
				if (field1113 >= field1132.field843.field758) {
					field1113 = 0;
				}
			}
		}
	}
}
