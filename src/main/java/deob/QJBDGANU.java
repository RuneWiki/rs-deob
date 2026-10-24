package deob;

@ObfuscatedName("QJBDGANU")
public final class QJBDGANU extends WWTUXVKR {

	@ObfuscatedName("QJBDGANU.v")
	public boolean field1181 = false;

	@ObfuscatedName("QJBDGANU.t")
	public BUIWQSXJ field1180;

	@ObfuscatedName("QJBDGANU.O")
	public int field1198;

	@ObfuscatedName("QJBDGANU.w")
	public int field1182;

	@ObfuscatedName("QJBDGANU.x")
	public int field1183;

	@ObfuscatedName("QJBDGANU.y")
	public int field1184;

	@ObfuscatedName("QJBDGANU.G")
	public int field1190;

	@ObfuscatedName("QJBDGANU.H")
	public int field1191;

	@ObfuscatedName("QJBDGANU.C")
	public int field1187;

	@ObfuscatedName("QJBDGANU.D")
	public int field1188;

	@ObfuscatedName("QJBDGANU.E")
	public int field1189;

	@ObfuscatedName("QJBDGANU.z")
	public int field1185;

	@ObfuscatedName("QJBDGANU.m")
	public double field1175;

	@ObfuscatedName("QJBDGANU.n")
	public double field1176;

	@ObfuscatedName("QJBDGANU.o")
	public double field1177;

	@ObfuscatedName("QJBDGANU.A")
	public double field1186;

	@ObfuscatedName("QJBDGANU.I")
	public double field1192;

	@ObfuscatedName("QJBDGANU.J")
	public double field1193;

	@ObfuscatedName("QJBDGANU.K")
	public double field1194;

	@ObfuscatedName("QJBDGANU.L")
	public double field1195;

	@ObfuscatedName("QJBDGANU.p")
	public int field1178;

	@ObfuscatedName("QJBDGANU.q")
	public int field1179;

	@ObfuscatedName("QJBDGANU.M")
	public int field1196;

	@ObfuscatedName("QJBDGANU.N")
	public int field1197;

	public QJBDGANU(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field1180 = BUIWQSXJ.field30[arg4];
		field1198 = arg3;
		field1182 = arg5;
		field1183 = arg8;
		field1184 = arg0;
		field1190 = arg2;
		field1191 = arg1;
		field1187 = arg6;
		field1188 = arg7;
		field1189 = arg10;
		field1185 = arg9;
		field1181 = false;
	}

	@ObfuscatedName("QJBDGANU.a(Z)LPOJFANDE;")
	public final POJFANDE method54() {
		POJFANDE var1 = field1180.method62();
		if (var1 == null) {
			return null;
		}

		int var2 = -1;
		if (field1180.field34 != null) {
			var2 = field1180.field34.field890[field1178];
		}

		POJFANDE var3 = new POJFANDE(HVIFHYEW.method287(var2), true, false, var1);
		if (var2 != -1) {
			var3.method467();
			var3.method468(var2);
			var3.field1131 = null;
			var3.field1130 = null;
		}

		if (field1180.field37 != 128 || field1180.field38 != 128) {
			var3.method476(field1180.field38, field1180.field37, field1180.field37);
		}

		var3.method472(field1197);
		var3.method477(field1180.field40 + 64, field1180.field41 + 850, -30, -50, -30, true);
		return var3;
	}

	@ObfuscatedName("QJBDGANU.a(ZI)V")
	public final void method489(int arg0) {
		field1181 = true;
		field1175 += arg0 * field1192;
		field1176 += arg0 * field1193;
		field1177 += field1186 * 0.5D * arg0 * arg0 + arg0 * field1195;
		field1195 += arg0 * field1186;
		field1196 = (int) (Math.atan2(field1192, field1193) * 325.949D) + 1024 & 0x7FF;
		field1197 = (int) (Math.atan2(field1195, field1194) * 325.949D) & 0x7FF;

		if (field1180.field34 != null) {
			field1179 += arg0;
			while (field1179 > field1180.field34.method364(field1178)) {
				field1179 -= field1180.field34.method364(field1178) + 1;
				field1178++;
				if (field1178 >= field1180.field34.field889) {
					field1178 = 0;
				}
			}
		}
	}

	@ObfuscatedName("QJBDGANU.a(IIBII)V")
	public final void method490(int arg0, int arg1, int arg2, int arg3) {
		if (!field1181) {
			double var5 = (double) (arg3 - field1182);
			double var7 = (double) (arg1 - field1183);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field1175 = field1188 * var5 / var9 + field1182;
			field1176 = field1188 * var7 / var9 + field1183;
			field1177 = field1184;
		}

		double var11 = (double) (field1191 + 1 - arg0);
		field1192 = (arg3 - field1175) / var11;
		field1193 = (arg1 - field1176) / var11;
		field1194 = Math.sqrt(field1193 * field1193 + field1192 * field1192);
		if (!field1181) {
			field1195 = -field1194 * Math.tan(field1187 * 0.02454369D);
		}

		field1186 = (arg2 - field1177 - field1195 * var11) * 2.0D / (var11 * var11);
	}
}
