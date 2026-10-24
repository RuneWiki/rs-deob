package deob;

@ObfuscatedName("LDXKRJQR")
public final class LDXKRJQR extends KCWTSCHR {

	@ObfuscatedName("LDXKRJQR.I")
	public boolean field903 = false;

	@ObfuscatedName("LDXKRJQR.B")
	public CRSWMDQF field896;

	@ObfuscatedName("LDXKRJQR.E")
	public int field899;

	@ObfuscatedName("LDXKRJQR.p")
	public int field885;

	@ObfuscatedName("LDXKRJQR.q")
	public int field886;

	@ObfuscatedName("LDXKRJQR.r")
	public int field887;

	@ObfuscatedName("LDXKRJQR.n")
	public int field883;

	@ObfuscatedName("LDXKRJQR.o")
	public int field884;

	@ObfuscatedName("LDXKRJQR.y")
	public int field893;

	@ObfuscatedName("LDXKRJQR.z")
	public int field894;

	@ObfuscatedName("LDXKRJQR.A")
	public int field895;

	@ObfuscatedName("LDXKRJQR.s")
	public int field888;

	@ObfuscatedName("LDXKRJQR.t")
	public double field889;

	@ObfuscatedName("LDXKRJQR.u")
	public double field890;

	@ObfuscatedName("LDXKRJQR.v")
	public double field891;

	@ObfuscatedName("LDXKRJQR.w")
	public double field892;

	@ObfuscatedName("LDXKRJQR.F")
	public double field900;

	@ObfuscatedName("LDXKRJQR.G")
	public double field901;

	@ObfuscatedName("LDXKRJQR.H")
	public double field902;

	@ObfuscatedName("LDXKRJQR.J")
	public double field904;

	@ObfuscatedName("LDXKRJQR.l")
	public int field881;

	@ObfuscatedName("LDXKRJQR.m")
	public int field882;

	@ObfuscatedName("LDXKRJQR.C")
	public int field897;

	@ObfuscatedName("LDXKRJQR.D")
	public int field898;

	public LDXKRJQR(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field896 = CRSWMDQF.field543[arg8];
		field899 = arg0;
		field885 = arg9;
		field886 = arg7;
		field887 = arg6;
		field883 = arg10;
		field884 = arg1;
		field893 = arg5;
		field894 = arg2;
		field895 = arg3;
		field888 = arg4;
		field903 = false;
	}

	@ObfuscatedName("LDXKRJQR.a(II)V")
	public final void method336(int arg0) {
		field903 = true;
		field900 += arg0 * field889;
		field901 += arg0 * field890;
		field902 += field904 * 0.5D * arg0 * arg0 + arg0 * field892;
		field892 += arg0 * field904;
		field897 = (int) (Math.atan2(field889, field890) * 325.949D) + 1024 & 0x7FF;
		field898 = (int) (Math.atan2(field892, field891) * 325.949D) & 0x7FF;

		if (field896.field547 != null) {
			field882 += arg0;
			while (field882 > field896.field547.method507(field881)) {
				field882 -= field896.field547.method507(field881) + 1;
				field881++;
				if (field881 >= field896.field547.field1177) {
					field881 = 0;
				}
			}
		}
	}

	@ObfuscatedName("LDXKRJQR.a(IIIBI)V")
	public final void method337(int arg0, int arg1, int arg2, int arg3) {
		if (!field903) {
			double var5 = (double) (arg1 - field885);
			double var7 = (double) (arg2 - field886);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field900 = field894 * var5 / var9 + field885;
			field901 = field894 * var7 / var9 + field886;
			field902 = field887;
		}

		double var11 = (double) (field884 + 1 - arg0);
		field889 = (arg1 - field900) / var11;
		field890 = (arg2 - field901) / var11;
		field891 = Math.sqrt(field890 * field890 + field889 * field889);
		if (!field903) {
			field892 = -field891 * Math.tan(field893 * 0.02454369D);
		}

		field904 = (arg3 - field902 - field892 * var11) * 2.0D / (var11 * var11);
	}

	@ObfuscatedName("LDXKRJQR.a(B)LXBVYIDUH;")
	public final XBVYIDUH method39() {
		XBVYIDUH var1 = field896.method299();
		if (var1 == null) {
			return null;
		}

		int var2 = -1;
		if (field896.field547 != null) {
			var2 = field896.field547.field1178[field881];
		}

		XBVYIDUH var3 = new XBVYIDUH(BKYAWERN.method115(var2), true, false, var1);
		if (var2 != -1) {
			var3.method548();
			var3.method549(var2);
			var3.field1384 = null;
			var3.field1383 = null;
		}

		if (field896.field550 != 128 || field896.field551 != 128) {
			var3.method557(field896.field551, field896.field550, field896.field550);
		}

		var3.method553(field898);
		var3.method558(field896.field553 + 64, field896.field554 + 850, -30, -50, -30, true);
		return var3;
	}
}
