package deob;

@ObfuscatedName("TIUPWCPE")
public final class TIUPWCPE extends MQTIFFLX {

	@ObfuscatedName("TIUPWCPE.v")
	public boolean field1167 = false;

	@ObfuscatedName("TIUPWCPE.F")
	public PMDEXOWJ field1177;

	@ObfuscatedName("TIUPWCPE.w")
	public int field1168;

	@ObfuscatedName("TIUPWCPE.z")
	public int field1171;

	@ObfuscatedName("TIUPWCPE.A")
	public int field1172;

	@ObfuscatedName("TIUPWCPE.B")
	public int field1173;

	@ObfuscatedName("TIUPWCPE.D")
	public int field1175;

	@ObfuscatedName("TIUPWCPE.E")
	public int field1176;

	@ObfuscatedName("TIUPWCPE.s")
	public int field1164;

	@ObfuscatedName("TIUPWCPE.t")
	public int field1165;

	@ObfuscatedName("TIUPWCPE.u")
	public int field1166;

	@ObfuscatedName("TIUPWCPE.C")
	public int field1174;

	@ObfuscatedName("TIUPWCPE.o")
	public double field1161;

	@ObfuscatedName("TIUPWCPE.p")
	public double field1162;

	@ObfuscatedName("TIUPWCPE.q")
	public double field1163;

	@ObfuscatedName("TIUPWCPE.G")
	public double field1178;

	@ObfuscatedName("TIUPWCPE.H")
	public double field1179;

	@ObfuscatedName("TIUPWCPE.I")
	public double field1180;

	@ObfuscatedName("TIUPWCPE.J")
	public double field1181;

	@ObfuscatedName("TIUPWCPE.K")
	public double field1182;

	@ObfuscatedName("TIUPWCPE.l")
	public int field1159;

	@ObfuscatedName("TIUPWCPE.m")
	public int field1160;

	@ObfuscatedName("TIUPWCPE.x")
	public int field1169;

	@ObfuscatedName("TIUPWCPE.y")
	public int field1170;

	@ObfuscatedName("TIUPWCPE.a(IIIII)V")
	public final void method425(int arg0, int arg1, int arg2, int arg3) {
		if (!field1167) {
			double var5 = (double) (arg1 - field1171);
			double var7 = (double) (arg2 - field1172);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field1161 = field1165 * var5 / var9 + field1171;
			field1162 = field1165 * var7 / var9 + field1172;
			field1163 = field1173;
		}

		double var11 = (double) (field1176 + 1 - arg3);
		field1179 = (arg1 - field1161) / var11;
		field1180 = (arg2 - field1162) / var11;
		field1181 = Math.sqrt(field1180 * field1180 + field1179 * field1179);
		if (!field1167) {
			field1182 = -field1181 * Math.tan(field1164 * 0.02454369D);
		}

		field1178 = (arg0 - field1163 - field1182 * var11) * 2.0D / (var11 * var11);
	}

	@ObfuscatedName("TIUPWCPE.a(Z)LWEVRTBOZ;")
	public final WEVRTBOZ method225() {
		WEVRTBOZ var1 = field1177.method404();
		if (var1 == null) {
			return null;
		}

		int var2 = -1;
		if (field1177.field1090 != null) {
			var2 = field1177.field1090.field1114[field1169];
		}

		WEVRTBOZ var3 = new WEVRTBOZ(var1, HJEXDJAH.method218(var2), false, true);
		if (var2 != -1) {
			var3.method532();
			var3.method533(var2);
			var3.field1395 = null;
			var3.field1394 = null;
		}

		if (field1177.field1093 != 128 || field1177.field1094 != 128) {
			var3.method541(field1177.field1093, field1177.field1093, field1177.field1094);
		}

		var3.method537(field1160);
		var3.method542(field1177.field1096 + 64, field1177.field1097 + 850, -30, -50, -30, true);
		return var3;
	}

	public TIUPWCPE(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field1177 = PMDEXOWJ.field1086[arg6];
		field1168 = arg4;
		field1171 = arg3;
		field1172 = arg1;
		field1173 = arg9;
		field1175 = arg0;
		field1176 = arg10;
		field1164 = arg7;
		field1165 = arg8;
		field1166 = arg2;
		field1174 = arg5;
		field1167 = false;
	}

	@ObfuscatedName("TIUPWCPE.a(II)V")
	public final void method426(int arg0) {
		field1167 = true;
		field1161 += arg0 * field1179;
		field1162 += arg0 * field1180;
		field1163 += field1178 * 0.5D * arg0 * arg0 + arg0 * field1182;
		field1182 += arg0 * field1178;
		field1159 = (int) (Math.atan2(field1179, field1180) * 325.949D) + 1024 & 0x7FF;
		field1160 = (int) (Math.atan2(field1182, field1181) * 325.949D) & 0x7FF;

		if (field1177.field1090 != null) {
			field1170 += arg0;
			while (field1170 > field1177.field1090.method414(field1169)) {
				field1170 -= field1177.field1090.method414(field1169) + 1;
				field1169++;
				if (field1169 >= field1177.field1090.field1113) {
					field1169 = 0;
				}
			}
		}
	}
}
