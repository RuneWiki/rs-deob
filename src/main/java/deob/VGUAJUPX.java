package deob;

@ObfuscatedName("VGUAJUPX")
public final class VGUAJUPX extends AVUWZCYT {

	@ObfuscatedName("VGUAJUPX.E")
	public boolean field1206 = false;

	@ObfuscatedName("VGUAJUPX.p")
	public OQOGSGFM field1192;

	@ObfuscatedName("VGUAJUPX.u")
	public int field1197;

	@ObfuscatedName("VGUAJUPX.q")
	public int field1193;

	@ObfuscatedName("VGUAJUPX.r")
	public int field1194;

	@ObfuscatedName("VGUAJUPX.s")
	public int field1195;

	@ObfuscatedName("VGUAJUPX.z")
	public int field1201;

	@ObfuscatedName("VGUAJUPX.A")
	public int field1202;

	@ObfuscatedName("VGUAJUPX.B")
	public int field1203;

	@ObfuscatedName("VGUAJUPX.C")
	public int field1204;

	@ObfuscatedName("VGUAJUPX.D")
	public int field1205;

	@ObfuscatedName("VGUAJUPX.t")
	public int field1196;

	@ObfuscatedName("VGUAJUPX.k")
	public double field1187;

	@ObfuscatedName("VGUAJUPX.l")
	public double field1188;

	@ObfuscatedName("VGUAJUPX.m")
	public double field1189;

	@ObfuscatedName("VGUAJUPX.y")
	public double field1200;

	@ObfuscatedName("VGUAJUPX.F")
	public double field1207;

	@ObfuscatedName("VGUAJUPX.G")
	public double field1208;

	@ObfuscatedName("VGUAJUPX.H")
	public double field1209;

	@ObfuscatedName("VGUAJUPX.I")
	public double field1210;

	@ObfuscatedName("VGUAJUPX.n")
	public int field1190;

	@ObfuscatedName("VGUAJUPX.o")
	public int field1191;

	@ObfuscatedName("VGUAJUPX.v")
	public int field1198;

	@ObfuscatedName("VGUAJUPX.w")
	public int field1199;

	@ObfuscatedName("VGUAJUPX.a(IIIII)V")
	public final void method507(int arg0, int arg1, int arg2, int arg3) {
		if (!field1206) {
			double var5 = (double) (arg2 - field1193);
			double var7 = (double) (arg0 - field1194);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field1187 = field1204 * var5 / var9 + field1193;
			field1188 = field1204 * var7 / var9 + field1194;
			field1189 = field1195;
		}

		double var11 = (double) (field1202 + 1 - arg3);
		field1207 = (arg2 - field1187) / var11;
		field1208 = (arg0 - field1188) / var11;
		field1209 = Math.sqrt(field1208 * field1208 + field1207 * field1207);
		if (!field1206) {
			field1210 = -field1209 * Math.tan(field1203 * 0.02454369D);
		}

		field1200 = (arg1 - field1189 - field1210 * var11) * 2.0D / (var11 * var11);
	}

	public VGUAJUPX(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field1192 = OQOGSGFM.field817[arg4];
		field1197 = arg1;
		field1193 = arg7;
		field1194 = arg10;
		field1195 = arg9;
		field1201 = arg8;
		field1202 = arg3;
		field1203 = arg6;
		field1204 = arg5;
		field1205 = arg0;
		field1196 = arg2;
		field1206 = false;
	}

	@ObfuscatedName("VGUAJUPX.a(II)V")
	public final void method508(int arg0) {
		field1206 = true;
		field1187 += arg0 * field1207;
		field1188 += arg0 * field1208;
		field1189 += field1200 * 0.5D * arg0 * arg0 + arg0 * field1210;
		field1210 += arg0 * field1200;
		field1190 = (int) (Math.atan2(field1207, field1208) * 325.949D) + 1024 & 0x7FF;
		field1191 = (int) (Math.atan2(field1210, field1209) * 325.949D) & 0x7FF;

		if (field1192.field821 != null) {
			field1199 += arg0;
			while (field1199 > field1192.field821.method251(field1198)) {
				field1199 -= field1192.field821.method251(field1198) + 1;
				field1198++;
				if (field1198 >= field1192.field821.field660) {
					field1198 = 0;
				}
			}
		}
	}

	@ObfuscatedName("VGUAJUPX.a(Z)LYYHPBDED;")
	public final YYHPBDED method2() {
		YYHPBDED var1 = field1192.method366();
		if (var1 == null) {
			return null;
		}

		int var2 = -1;
		if (field1192.field821 != null) {
			var2 = field1192.field821.field661[field1198];
		}

		YYHPBDED var3 = new YYHPBDED(false, var1, true, VPISXBMB.method513(var2));
		if (var2 != -1) {
			var3.method558();
			var3.method559(var2);
			var3.field1377 = null;
			var3.field1376 = null;
		}

		if (field1192.field824 != 128 || field1192.field825 != 128) {
			var3.method567(field1192.field825, field1192.field824, field1192.field824);
		}

		var3.method563(field1191);
		var3.method568(field1192.field827 + 64, field1192.field828 + 850, -30, -50, -30, true);
		return var3;
	}
}
