package deob;

@ObfuscatedName("RVDLUGTG")
public final class RVDLUGTG extends DPCHFTTD {

	@ObfuscatedName("RVDLUGTG.z")
	public boolean field1196 = false;

	@ObfuscatedName("RVDLUGTG.F")
	public IDBAHLFM field1202;

	@ObfuscatedName("RVDLUGTG.A")
	public int field1197;

	@ObfuscatedName("RVDLUGTG.s")
	public int field1190;

	@ObfuscatedName("RVDLUGTG.t")
	public int field1191;

	@ObfuscatedName("RVDLUGTG.u")
	public int field1192;

	@ObfuscatedName("RVDLUGTG.D")
	public int field1200;

	@ObfuscatedName("RVDLUGTG.E")
	public int field1201;

	@ObfuscatedName("RVDLUGTG.l")
	public int field1183;

	@ObfuscatedName("RVDLUGTG.m")
	public int field1184;

	@ObfuscatedName("RVDLUGTG.n")
	public int field1185;

	@ObfuscatedName("RVDLUGTG.v")
	public int field1193;

	@ObfuscatedName("RVDLUGTG.o")
	public double field1186;

	@ObfuscatedName("RVDLUGTG.p")
	public double field1187;

	@ObfuscatedName("RVDLUGTG.q")
	public double field1188;

	@ObfuscatedName("RVDLUGTG.r")
	public double field1189;

	@ObfuscatedName("RVDLUGTG.G")
	public double field1203;

	@ObfuscatedName("RVDLUGTG.H")
	public double field1204;

	@ObfuscatedName("RVDLUGTG.I")
	public double field1205;

	@ObfuscatedName("RVDLUGTG.J")
	public double field1206;

	@ObfuscatedName("RVDLUGTG.w")
	public int field1194;

	@ObfuscatedName("RVDLUGTG.x")
	public int field1195;

	@ObfuscatedName("RVDLUGTG.B")
	public int field1198;

	@ObfuscatedName("RVDLUGTG.C")
	public int field1199;

	public RVDLUGTG(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field1202 = IDBAHLFM.field805[arg6];
		field1197 = arg7;
		field1190 = arg9;
		field1191 = arg0;
		field1192 = arg1;
		field1200 = arg5;
		field1201 = arg4;
		field1183 = arg10;
		field1184 = arg2;
		field1185 = arg3;
		field1193 = arg8;
		field1196 = false;
	}

	@ObfuscatedName("RVDLUGTG.a(IZIII)V")
	public final void method516(int arg0, int arg1, int arg2, int arg3) {
		if (!field1196) {
			double var5 = (double) (arg2 - field1190);
			double var7 = (double) (arg0 - field1191);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field1186 = field1184 * var5 / var9 + field1190;
			field1187 = field1184 * var7 / var9 + field1191;
			field1188 = field1192;
		}

		double var11 = (double) (field1201 + 1 - arg1);
		field1203 = (arg2 - field1186) / var11;
		field1204 = (arg0 - field1187) / var11;
		field1205 = Math.sqrt(field1204 * field1204 + field1203 * field1203);
		if (!field1196) {
			field1206 = -field1205 * Math.tan(field1183 * 0.02454369D);
		}

		field1189 = (arg3 - field1188 - field1206 * var11) * 2.0D / (var11 * var11);
	}

	@ObfuscatedName("RVDLUGTG.a(ZI)V")
	public final void method517(int arg0) {
		field1196 = true;
		field1186 += arg0 * field1203;
		field1187 += arg0 * field1204;
		field1188 += field1189 * 0.5D * arg0 * arg0 + arg0 * field1206;
		field1206 += arg0 * field1189;
		field1198 = (int) (Math.atan2(field1203, field1204) * 325.949D) + 1024 & 0x7FF;
		field1199 = (int) (Math.atan2(field1206, field1205) * 325.949D) & 0x7FF;

		if (field1202.field809 != null) {
			field1195 += arg0;
			while (field1195 > field1202.field809.method241(field1194)) {
				field1195 -= field1202.field809.method241(field1194) + 1;
				field1194++;
				if (field1194 >= field1202.field809.field605) {
					field1194 = 0;
				}
			}
		}
	}

	@ObfuscatedName("RVDLUGTG.a(B)LGEUHTGZJ;")
	public final GEUHTGZJ method221() {
		GEUHTGZJ var1 = field1202.method323();
		if (var1 == null) {
			return null;
		}

		int var2 = -1;
		if (field1202.field809 != null) {
			var2 = field1202.field809.field606[field1194];
		}

		GEUHTGZJ var3 = new GEUHTGZJ(QWCFKPFT.method504(var2), var1, false, true);
		if (var2 != -1) {
			var3.method292();
			var3.method293(var2);
			var3.field746 = null;
			var3.field745 = null;
		}

		if (field1202.field812 != 128 || field1202.field813 != 128) {
			var3.method301(field1202.field813, field1202.field812, field1202.field812);
		}

		var3.method297(field1199);
		var3.method302(field1202.field815 + 64, field1202.field816 + 850, -30, -50, -30, true);
		return var3;
	}
}
