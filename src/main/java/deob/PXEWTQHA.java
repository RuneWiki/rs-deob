package deob;

@ObfuscatedName("PXEWTQHA")
public final class PXEWTQHA extends ZJNSWWFY {

	@ObfuscatedName("PXEWTQHA.I")
	public boolean field1119 = false;

	@ObfuscatedName("PXEWTQHA.F")
	public FXNZCBPL field1117;

	@ObfuscatedName("PXEWTQHA.A")
	public int field1112;

	@ObfuscatedName("PXEWTQHA.w")
	public int field1108;

	@ObfuscatedName("PXEWTQHA.x")
	public int field1109;

	@ObfuscatedName("PXEWTQHA.y")
	public int field1110;

	@ObfuscatedName("PXEWTQHA.u")
	public int field1106;

	@ObfuscatedName("PXEWTQHA.v")
	public int field1107;

	@ObfuscatedName("PXEWTQHA.m")
	public int field1099;

	@ObfuscatedName("PXEWTQHA.n")
	public int field1100;

	@ObfuscatedName("PXEWTQHA.o")
	public int field1101;

	@ObfuscatedName("PXEWTQHA.z")
	public int field1111;

	@ObfuscatedName("PXEWTQHA.p")
	public double field1102;

	@ObfuscatedName("PXEWTQHA.q")
	public double field1103;

	@ObfuscatedName("PXEWTQHA.r")
	public double field1104;

	@ObfuscatedName("PXEWTQHA.s")
	public double field1105;

	@ObfuscatedName("PXEWTQHA.G")
	public double field1118;

	@ObfuscatedName("PXEWTQHA.K")
	public double field1120;

	@ObfuscatedName("PXEWTQHA.L")
	public double field1121;

	@ObfuscatedName("PXEWTQHA.M")
	public double field1122;

	@ObfuscatedName("PXEWTQHA.B")
	public int field1113;

	@ObfuscatedName("PXEWTQHA.C")
	public int field1114;

	@ObfuscatedName("PXEWTQHA.D")
	public int field1115;

	@ObfuscatedName("PXEWTQHA.E")
	public int field1116;

	@ObfuscatedName("PXEWTQHA.a(Z)LCSGBDGDY;")
	public final CSGBDGDY method187() {
		CSGBDGDY var1 = field1117.method202();
		if (var1 == null) {
			return null;
		}

		int var2 = -1;
		if (field1117.field624 != null) {
			var2 = field1117.field624.field1060[field1115];
		}

		CSGBDGDY var3 = new CSGBDGDY(true, KDJQGGIG.method285(var2), var1, false);
		if (var2 != -1) {
			var3.method167();
			var3.method168(var2);
			var3.field535 = null;
			var3.field534 = null;
		}

		if (field1117.field627 != 128 || field1117.field628 != 128) {
			var3.method176(field1117.field627, field1117.field628, field1117.field627);
		}

		var3.method172(field1114);
		var3.method177(field1117.field630 + 64, field1117.field631 + 850, -30, -50, -30, true);
		return var3;
	}

	@ObfuscatedName("PXEWTQHA.a(IBIII)V")
	public final void method429(int arg0, int arg1, int arg2, int arg3) {
		if (!field1119) {
			double var5 = (double) (arg1 - field1108);
			double var7 = (double) (arg2 - field1109);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field1120 = field1100 * var5 / var9 + field1108;
			field1121 = field1100 * var7 / var9 + field1109;
			field1122 = field1110;
		}

		double var11 = (double) (field1107 + 1 - arg3);
		field1102 = (arg1 - field1120) / var11;
		field1103 = (arg2 - field1121) / var11;
		field1104 = Math.sqrt(field1103 * field1103 + field1102 * field1102);
		if (!field1119) {
			field1105 = -field1104 * Math.tan(field1099 * 0.02454369D);
		}

		field1118 = (arg0 - field1122 - field1105 * var11) * 2.0D / (var11 * var11);
	}

	@ObfuscatedName("PXEWTQHA.a(II)V")
	public final void method430(int arg0) {
		field1119 = true;
		field1120 += arg0 * field1102;
		field1121 += arg0 * field1103;
		field1122 += field1118 * 0.5D * arg0 * arg0 + arg0 * field1105;
		field1105 += arg0 * field1118;
		field1113 = (int) (Math.atan2(field1102, field1103) * 325.949D) + 1024 & 0x7FF;
		field1114 = (int) (Math.atan2(field1105, field1104) * 325.949D) & 0x7FF;

		if (field1117.field624 != null) {
			field1116 += arg0;
			while (field1116 > field1117.field624.method427(field1115)) {
				field1116 -= field1117.field624.method427(field1115) + 1;
				field1115++;
				if (field1115 >= field1117.field624.field1059) {
					field1115 = 0;
				}
			}
		}
	}

	public PXEWTQHA(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field1117 = FXNZCBPL.field620[arg7];
		field1112 = arg5;
		field1108 = arg1;
		field1109 = arg0;
		field1110 = arg6;
		field1106 = arg3;
		field1107 = arg2;
		field1099 = arg10;
		field1100 = arg8;
		field1101 = arg4;
		field1111 = arg9;
		field1119 = false;
	}
}
