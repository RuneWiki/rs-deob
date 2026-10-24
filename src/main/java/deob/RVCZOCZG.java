package deob;

@ObfuscatedName("RVCZOCZG")
public final class RVCZOCZG extends XPEMEMUL {

	@ObfuscatedName("RVCZOCZG.C")
	public boolean field1238 = false;

	@ObfuscatedName("RVCZOCZG.y")
	public FULHVSIU field1234;

	@ObfuscatedName("RVCZOCZG.x")
	public int field1233;

	@ObfuscatedName("RVCZOCZG.r")
	public int field1227;

	@ObfuscatedName("RVCZOCZG.s")
	public int field1228;

	@ObfuscatedName("RVCZOCZG.t")
	public int field1229;

	@ObfuscatedName("RVCZOCZG.o")
	public int field1225;

	@ObfuscatedName("RVCZOCZG.p")
	public int field1226;

	@ObfuscatedName("RVCZOCZG.l")
	public int field1222;

	@ObfuscatedName("RVCZOCZG.m")
	public int field1223;

	@ObfuscatedName("RVCZOCZG.n")
	public int field1224;

	@ObfuscatedName("RVCZOCZG.u")
	public int field1230;

	@ObfuscatedName("RVCZOCZG.z")
	public double field1235;

	@ObfuscatedName("RVCZOCZG.D")
	public double field1239;

	@ObfuscatedName("RVCZOCZG.E")
	public double field1240;

	@ObfuscatedName("RVCZOCZG.F")
	public double field1241;

	@ObfuscatedName("RVCZOCZG.G")
	public double field1242;

	@ObfuscatedName("RVCZOCZG.H")
	public double field1243;

	@ObfuscatedName("RVCZOCZG.I")
	public double field1244;

	@ObfuscatedName("RVCZOCZG.J")
	public double field1245;

	@ObfuscatedName("RVCZOCZG.v")
	public int field1231;

	@ObfuscatedName("RVCZOCZG.w")
	public int field1232;

	@ObfuscatedName("RVCZOCZG.A")
	public int field1236;

	@ObfuscatedName("RVCZOCZG.B")
	public int field1237;

	@ObfuscatedName("RVCZOCZG.a(IIIII)V")
	public final void method458(int arg0, int arg1, int arg2, int arg3) {
		if (!field1238) {
			double var5 = (double) (arg0 - field1227);
			double var7 = (double) (arg1 - field1228);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field1239 = field1223 * var5 / var9 + field1227;
			field1240 = field1223 * var7 / var9 + field1228;
			field1241 = field1229;
		}

		double var11 = (double) (field1226 + 1 - arg3);
		field1242 = (arg0 - field1239) / var11;
		field1243 = (arg1 - field1240) / var11;
		field1244 = Math.sqrt(field1243 * field1243 + field1242 * field1242);
		if (!field1238) {
			field1245 = -field1244 * Math.tan(field1222 * 0.02454369D);
		}

		field1235 = (arg2 - field1241 - field1245 * var11) * 2.0D / (var11 * var11);
	}

	public RVCZOCZG(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field1234 = FULHVSIU.field604[arg4];
		field1233 = arg1;
		field1227 = arg2;
		field1228 = arg10;
		field1229 = arg3;
		field1225 = arg0;
		field1226 = arg7;
		field1222 = arg6;
		field1223 = arg9;
		field1224 = arg8;
		field1230 = arg5;
		field1238 = false;
	}

	@ObfuscatedName("RVCZOCZG.a(II)V")
	public final void method459(int arg0) {
		field1238 = true;
		field1239 += arg0 * field1242;
		field1240 += arg0 * field1243;
		field1241 += field1235 * 0.5D * arg0 * arg0 + arg0 * field1245;
		field1245 += arg0 * field1235;
		field1236 = (int) (Math.atan2(field1242, field1243) * 325.949D) + 1024 & 0x7FF;
		field1237 = (int) (Math.atan2(field1245, field1244) * 325.949D) & 0x7FF;

		if (field1234.field608 != null) {
			field1232 += arg0;
			while (field1232 > field1234.field608.method415(field1231)) {
				field1232 -= field1234.field608.method415(field1231) + 1;
				field1231++;
				if (field1231 >= field1234.field608.field999) {
					field1231 = 0;
				}
			}
		}
	}

	@ObfuscatedName("RVCZOCZG.a(I)LKPUOCBCE;")
	public final KPUOCBCE method11() {
		KPUOCBCE var1 = field1234.method231();
		if (var1 == null) {
			return null;
		}

		int var2 = -1;
		if (field1234.field608 != null) {
			var2 = field1234.field608.field1000[field1231];
		}

		KPUOCBCE var3 = new KPUOCBCE(ZNUJPBQV.method585(var2), false, var1, true);
		if (var2 != -1) {
			var3.method386();
			var3.method387(var2);
			var3.field889 = null;
			var3.field888 = null;
		}

		if (field1234.field611 != 128 || field1234.field612 != 128) {
			var3.method395(field1234.field611, field1234.field612, field1234.field611);
		}

		var3.method391(field1237);
		var3.method396(field1234.field614 + 64, field1234.field615 + 850, -30, -50, -30, true);
		return var3;
	}
}
