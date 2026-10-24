package deob;

@ObfuscatedName("QPFVLDSR")
public final class QPFVLDSR extends CYZGZTKE {

	@ObfuscatedName("QPFVLDSR.v")
	public boolean field1193 = false;

	@ObfuscatedName("QPFVLDSR.G")
	public BRGDZOWQ field1203;

	@ObfuscatedName("QPFVLDSR.H")
	public int field1204;

	@ObfuscatedName("QPFVLDSR.I")
	public int field1205;

	@ObfuscatedName("QPFVLDSR.J")
	public int field1206;

	@ObfuscatedName("QPFVLDSR.K")
	public int field1207;

	@ObfuscatedName("QPFVLDSR.t")
	public int field1191;

	@ObfuscatedName("QPFVLDSR.u")
	public int field1192;

	@ObfuscatedName("QPFVLDSR.n")
	public int field1185;

	@ObfuscatedName("QPFVLDSR.o")
	public int field1186;

	@ObfuscatedName("QPFVLDSR.p")
	public int field1187;

	@ObfuscatedName("QPFVLDSR.L")
	public int field1208;

	@ObfuscatedName("QPFVLDSR.s")
	public double field1190;

	@ObfuscatedName("QPFVLDSR.x")
	public double field1194;

	@ObfuscatedName("QPFVLDSR.y")
	public double field1195;

	@ObfuscatedName("QPFVLDSR.z")
	public double field1196;

	@ObfuscatedName("QPFVLDSR.A")
	public double field1197;

	@ObfuscatedName("QPFVLDSR.B")
	public double field1198;

	@ObfuscatedName("QPFVLDSR.C")
	public double field1199;

	@ObfuscatedName("QPFVLDSR.D")
	public double field1200;

	@ObfuscatedName("QPFVLDSR.q")
	public int field1188;

	@ObfuscatedName("QPFVLDSR.r")
	public int field1189;

	@ObfuscatedName("QPFVLDSR.E")
	public int field1201;

	@ObfuscatedName("QPFVLDSR.F")
	public int field1202;

	public QPFVLDSR(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field1203 = BRGDZOWQ.field8[arg0];
		field1204 = arg7;
		field1205 = arg1;
		field1206 = arg3;
		field1207 = arg2;
		field1191 = arg10;
		field1192 = arg8;
		field1185 = arg6;
		field1186 = arg9;
		field1187 = arg4;
		field1208 = arg5;
		field1193 = false;
	}

	@ObfuscatedName("QPFVLDSR.a(I)LLFTMDGKK;")
	public final LFTMDGKK method1() {
		LFTMDGKK var1 = field1203.method11();
		if (var1 == null) {
			return null;
		}

		int var2 = -1;
		if (field1203.field12 != null) {
			var2 = field1203.field12.field684[field1201];
		}

		LFTMDGKK var3 = new LFTMDGKK(CANZHIOT.method17(var2), true, var1, false);
		if (var2 != -1) {
			var3.method348();
			var3.method349(var2);
			var3.field852 = null;
			var3.field851 = null;
		}

		if (field1203.field15 != 128 || field1203.field16 != 128) {
			var3.method357(field1203.field16, field1203.field15, field1203.field15);
		}

		var3.method353(field1189);
		var3.method358(field1203.field18 + 64, field1203.field19 + 850, -30, -50, -30, true);
		return var3;
	}

	@ObfuscatedName("QPFVLDSR.a(ZI)V")
	public final void method489(int arg0) {
		field1193 = true;
		field1194 += arg0 * field1197;
		field1195 += arg0 * field1198;
		field1196 += field1190 * 0.5D * arg0 * arg0 + arg0 * field1200;
		field1200 += arg0 * field1190;
		field1188 = (int) (Math.atan2(field1197, field1198) * 325.949D) + 1024 & 0x7FF;
		field1189 = (int) (Math.atan2(field1200, field1199) * 325.949D) & 0x7FF;

		if (field1203.field12 != null) {
			field1202 += arg0;
			while (field1202 > field1203.field12.method322(field1201)) {
				field1202 -= field1203.field12.method322(field1201) + 1;
				field1201++;
				if (field1201 >= field1203.field12.field683) {
					field1201 = 0;
				}
			}
		}
	}

	@ObfuscatedName("QPFVLDSR.a(IIIBI)V")
	public final void method490(int arg0, int arg1, int arg2, int arg3) {
		if (!field1193) {
			double var5 = (double) (arg1 - field1205);
			double var7 = (double) (arg0 - field1206);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field1194 = field1186 * var5 / var9 + field1205;
			field1195 = field1186 * var7 / var9 + field1206;
			field1196 = field1207;
		}

		double var11 = (double) (field1192 + 1 - arg2);
		field1197 = (arg1 - field1194) / var11;
		field1198 = (arg0 - field1195) / var11;
		field1199 = Math.sqrt(field1198 * field1198 + field1197 * field1197);
		if (!field1193) {
			field1200 = -field1199 * Math.tan(field1185 * 0.02454369D);
		}

		field1190 = (arg3 - field1196 - field1200 * var11) * 2.0D / (var11 * var11);
	}
}
