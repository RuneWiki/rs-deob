package deob;

@ObfuscatedName("TCHKSJJL")
public final class TCHKSJJL extends ACEAAIDL {

	@ObfuscatedName("TCHKSJJL.w")
	public boolean field1205 = false;

	@ObfuscatedName("TCHKSJJL.C")
	public JEPDVFCL field1211;

	@ObfuscatedName("TCHKSJJL.p")
	public int field1198;

	@ObfuscatedName("TCHKSJJL.E")
	public int field1212;

	@ObfuscatedName("TCHKSJJL.F")
	public int field1213;

	@ObfuscatedName("TCHKSJJL.G")
	public int field1214;

	@ObfuscatedName("TCHKSJJL.K")
	public int field1217;

	@ObfuscatedName("TCHKSJJL.L")
	public int field1218;

	@ObfuscatedName("TCHKSJJL.m")
	public int field1195;

	@ObfuscatedName("TCHKSJJL.n")
	public int field1196;

	@ObfuscatedName("TCHKSJJL.o")
	public int field1197;

	@ObfuscatedName("TCHKSJJL.H")
	public int field1215;

	@ObfuscatedName("TCHKSJJL.s")
	public double field1201;

	@ObfuscatedName("TCHKSJJL.t")
	public double field1202;

	@ObfuscatedName("TCHKSJJL.u")
	public double field1203;

	@ObfuscatedName("TCHKSJJL.v")
	public double field1204;

	@ObfuscatedName("TCHKSJJL.x")
	public double field1206;

	@ObfuscatedName("TCHKSJJL.y")
	public double field1207;

	@ObfuscatedName("TCHKSJJL.z")
	public double field1208;

	@ObfuscatedName("TCHKSJJL.J")
	public double field1216;

	@ObfuscatedName("TCHKSJJL.q")
	public int field1199;

	@ObfuscatedName("TCHKSJJL.r")
	public int field1200;

	@ObfuscatedName("TCHKSJJL.A")
	public int field1209;

	@ObfuscatedName("TCHKSJJL.B")
	public int field1210;

	public TCHKSJJL(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field1211 = JEPDVFCL.field793[arg3];
		field1198 = arg1;
		field1212 = arg6;
		field1213 = arg4;
		field1214 = arg0;
		field1217 = arg10;
		field1218 = arg2;
		field1195 = arg7;
		field1196 = arg5;
		field1197 = arg9;
		field1215 = arg8;
		field1205 = false;
	}

	@ObfuscatedName("TCHKSJJL.a(IIIII)V")
	public final void method499(int arg0, int arg1, int arg2, int arg3) {
		if (!field1205) {
			double var5 = (double) (arg0 - field1212);
			double var7 = (double) (arg1 - field1213);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field1206 = field1196 * var5 / var9 + field1212;
			field1207 = field1196 * var7 / var9 + field1213;
			field1208 = field1214;
		}

		double var11 = (double) (field1218 + 1 - arg3);
		field1201 = (arg0 - field1206) / var11;
		field1202 = (arg1 - field1207) / var11;
		field1203 = Math.sqrt(field1202 * field1202 + field1201 * field1201);
		if (!field1205) {
			field1204 = -field1203 * Math.tan(field1195 * 0.02454369D);
		}

		field1216 = (arg2 - field1208 - field1204 * var11) * 2.0D / (var11 * var11);
	}

	@ObfuscatedName("TCHKSJJL.a(IB)V")
	public final void method500(int arg0) {
		field1205 = true;
		field1206 += arg0 * field1201;
		field1207 += arg0 * field1202;
		field1208 += field1216 * 0.5D * arg0 * arg0 + arg0 * field1204;
		field1204 += arg0 * field1216;
		field1209 = (int) (Math.atan2(field1201, field1202) * 325.949D) + 1024 & 0x7FF;
		field1210 = (int) (Math.atan2(field1204, field1203) * 325.949D) & 0x7FF;

		if (field1211.field797 != null) {
			field1200 += arg0;
			while (field1200 > field1211.field797.method583(field1199)) {
				field1200 -= field1211.field797.method583(field1199) + 1;
				field1199++;
				if (field1199 >= field1211.field797.field1419) {
					field1199 = 0;
				}
			}
		}
	}

	@ObfuscatedName("TCHKSJJL.a(Z)LGCSAWSJV;")
	public final GCSAWSJV method8() {
		GCSAWSJV var1 = field1211.method332();
		if (var1 == null) {
			return null;
		}

		int var2 = -1;
		if (field1211.field797 != null) {
			var2 = field1211.field797.field1420[field1199];
		}

		GCSAWSJV var3 = new GCSAWSJV(var1, true, RLONYBCF.method436(var2), false);
		if (var2 != -1) {
			var3.method267();
			var3.method268(var2);
			var3.field624 = null;
			var3.field623 = null;
		}

		if (field1211.field800 != 128 || field1211.field801 != 128) {
			var3.method276(field1211.field800, field1211.field800, field1211.field801);
		}

		var3.method272(field1210);
		var3.method277(field1211.field803 + 64, field1211.field804 + 850, -30, -50, -30, true);
		return var3;
	}
}
