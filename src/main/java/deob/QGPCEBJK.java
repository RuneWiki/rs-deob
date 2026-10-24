package deob;

@ObfuscatedName("QGPCEBJK")
public final class QGPCEBJK extends XHDBBLMT {

	@ObfuscatedName("QGPCEBJK.x")
	public boolean field1121 = false;

	@ObfuscatedName("QGPCEBJK.H")
	public TGIKVGNH field1131;

	@ObfuscatedName("QGPCEBJK.t")
	public int field1119;

	@ObfuscatedName("QGPCEBJK.m")
	public int field1112;

	@ObfuscatedName("QGPCEBJK.n")
	public int field1113;

	@ObfuscatedName("QGPCEBJK.o")
	public int field1114;

	@ObfuscatedName("QGPCEBJK.I")
	public int field1132;

	@ObfuscatedName("QGPCEBJK.J")
	public int field1133;

	@ObfuscatedName("QGPCEBJK.y")
	public int field1122;

	@ObfuscatedName("QGPCEBJK.z")
	public int field1123;

	@ObfuscatedName("QGPCEBJK.A")
	public int field1124;

	@ObfuscatedName("QGPCEBJK.p")
	public int field1115;

	@ObfuscatedName("QGPCEBJK.q")
	public double field1116;

	@ObfuscatedName("QGPCEBJK.r")
	public double field1117;

	@ObfuscatedName("QGPCEBJK.s")
	public double field1118;

	@ObfuscatedName("QGPCEBJK.u")
	public double field1120;

	@ObfuscatedName("QGPCEBJK.B")
	public double field1125;

	@ObfuscatedName("QGPCEBJK.C")
	public double field1126;

	@ObfuscatedName("QGPCEBJK.D")
	public double field1127;

	@ObfuscatedName("QGPCEBJK.E")
	public double field1128;

	@ObfuscatedName("QGPCEBJK.k")
	public int field1110;

	@ObfuscatedName("QGPCEBJK.l")
	public int field1111;

	@ObfuscatedName("QGPCEBJK.F")
	public int field1129;

	@ObfuscatedName("QGPCEBJK.G")
	public int field1130;

	@ObfuscatedName("QGPCEBJK.a(I)LKBEXSZSN;")
	public final KBEXSZSN method28() {
		KBEXSZSN var1 = field1131.method461();
		if (var1 == null) {
			return null;
		}

		int var2 = -1;
		if (field1131.field1198 != null) {
			var2 = field1131.field1198.field1037[field1110];
		}

		KBEXSZSN var3 = new KBEXSZSN(false, IBCKUTPD.method309(var2), var1, true);
		if (var2 != -1) {
			var3.method346();
			var3.method347(var2);
			var3.field904 = null;
			var3.field903 = null;
		}

		if (field1131.field1201 != 128 || field1131.field1202 != 128) {
			var3.method355(field1131.field1201, field1131.field1202, field1131.field1201);
		}

		var3.method351(field1130);
		var3.method356(field1131.field1204 + 64, field1131.field1205 + 850, -30, -50, -30, true);
		return var3;
	}

	@ObfuscatedName("QGPCEBJK.a(IIZII)V")
	public final void method437(int arg0, int arg1, int arg2, int arg3) {
		if (!field1121) {
			double var5 = (double) (arg2 - field1112);
			double var7 = (double) (arg0 - field1113);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field1116 = field1123 * var5 / var9 + field1112;
			field1117 = field1123 * var7 / var9 + field1113;
			field1118 = field1114;
		}

		double var11 = (double) (field1133 + 1 - arg1);
		field1125 = (arg2 - field1116) / var11;
		field1126 = (arg0 - field1117) / var11;
		field1127 = Math.sqrt(field1126 * field1126 + field1125 * field1125);
		if (!field1121) {
			field1128 = -field1127 * Math.tan(field1122 * 0.02454369D);
		}

		field1120 = (arg3 - field1118 - field1128 * var11) * 2.0D / (var11 * var11);
	}

	public QGPCEBJK(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field1131 = TGIKVGNH.field1194[arg10];
		field1119 = arg5;
		field1112 = arg6;
		field1113 = arg9;
		field1114 = arg8;
		field1132 = arg7;
		field1133 = arg1;
		field1122 = arg2;
		field1123 = arg4;
		field1124 = arg3;
		field1115 = arg0;
		field1121 = false;
	}

	@ObfuscatedName("QGPCEBJK.a(II)V")
	public final void method438(int arg0) {
		field1121 = true;
		field1116 += arg0 * field1125;
		field1117 += arg0 * field1126;
		field1118 += field1120 * 0.5D * arg0 * arg0 + arg0 * field1128;
		field1128 += arg0 * field1120;
		field1129 = (int) (Math.atan2(field1125, field1126) * 325.949D) + 1024 & 0x7FF;
		field1130 = (int) (Math.atan2(field1128, field1127) * 325.949D) & 0x7FF;

		if (field1131.field1198 != null) {
			field1111 += arg0;
			while (field1111 > field1131.field1198.method413(field1110)) {
				field1111 -= field1131.field1198.method413(field1110) + 1;
				field1110++;
				if (field1110 >= field1131.field1198.field1036) {
					field1110 = 0;
				}
			}
		}
	}
}
