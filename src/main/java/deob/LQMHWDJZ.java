package deob;

@ObfuscatedName("LQMHWDJZ")
public final class LQMHWDJZ extends FGVBONDH {

	@ObfuscatedName("LQMHWDJZ.q")
	public boolean field937 = false;

	@ObfuscatedName("LQMHWDJZ.p")
	public UIVLSYQW field936;

	@ObfuscatedName("LQMHWDJZ.m")
	public int field933;

	@ObfuscatedName("LQMHWDJZ.t")
	public int field940;

	@ObfuscatedName("LQMHWDJZ.u")
	public int field941;

	@ObfuscatedName("LQMHWDJZ.v")
	public int field942;

	@ObfuscatedName("LQMHWDJZ.r")
	public int field938;

	@ObfuscatedName("LQMHWDJZ.s")
	public int field939;

	@ObfuscatedName("LQMHWDJZ.L")
	public int field954;

	@ObfuscatedName("LQMHWDJZ.M")
	public int field955;

	@ObfuscatedName("LQMHWDJZ.N")
	public int field956;

	@ObfuscatedName("LQMHWDJZ.w")
	public int field943;

	@ObfuscatedName("LQMHWDJZ.x")
	public double field944;

	@ObfuscatedName("LQMHWDJZ.y")
	public double field945;

	@ObfuscatedName("LQMHWDJZ.z")
	public double field946;

	@ObfuscatedName("LQMHWDJZ.A")
	public double field947;

	@ObfuscatedName("LQMHWDJZ.B")
	public double field948;

	@ObfuscatedName("LQMHWDJZ.C")
	public double field949;

	@ObfuscatedName("LQMHWDJZ.D")
	public double field950;

	@ObfuscatedName("LQMHWDJZ.F")
	public double field951;

	@ObfuscatedName("LQMHWDJZ.n")
	public int field934;

	@ObfuscatedName("LQMHWDJZ.o")
	public int field935;

	@ObfuscatedName("LQMHWDJZ.J")
	public int field952;

	@ObfuscatedName("LQMHWDJZ.K")
	public int field953;

	@ObfuscatedName("LQMHWDJZ.a(IIIIB)V")
	public final void method458(int arg0, int arg1, int arg2, int arg3) {
		if (!field937) {
			double var5 = (double) (arg2 - field940);
			double var7 = (double) (arg0 - field941);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field948 = field955 * var5 / var9 + field940;
			field949 = field955 * var7 / var9 + field941;
			field950 = field942;
		}

		double var11 = (double) (field939 + 1 - arg3);
		field944 = (arg2 - field948) / var11;
		field945 = (arg0 - field949) / var11;
		field946 = Math.sqrt(field945 * field945 + field944 * field944);
		if (!field937) {
			field947 = -field946 * Math.tan(field954 * 0.02454369D);
		}

		field951 = (arg1 - field950 - field947 * var11) * 2.0D / (var11 * var11);
	}

	@ObfuscatedName("LQMHWDJZ.a(ZI)V")
	public final void method459(int arg0) {
		field937 = true;
		field948 += arg0 * field944;
		field949 += arg0 * field945;
		field950 += field951 * 0.5D * arg0 * arg0 + arg0 * field947;
		field947 += arg0 * field951;
		field952 = (int) (Math.atan2(field944, field945) * 325.949D) + 1024 & 0x7FF;
		field953 = (int) (Math.atan2(field947, field946) * 325.949D) & 0x7FF;

		if (field936.field1156 != null) {
			field935 += arg0;
			while (field935 > field936.field1156.method566(field934)) {
				field935 -= field936.field1156.method566(field934) + 1;
				field934++;
				if (field934 >= field936.field1156.field1363) {
					field934 = 0;
				}
			}
		}
	}

	public LQMHWDJZ(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field936 = UIVLSYQW.field1152[arg0];
		field933 = arg1;
		field940 = arg7;
		field941 = arg8;
		field942 = arg2;
		field938 = arg5;
		field939 = arg6;
		field954 = arg10;
		field955 = arg9;
		field956 = arg3;
		field943 = arg4;
		field937 = false;
	}

	@ObfuscatedName("LQMHWDJZ.a(I)LHEQROJXW;")
	public final HEQROJXW method1() {
		HEQROJXW var1 = field936.method539();
		if (var1 == null) {
			return null;
		}

		int var2 = -1;
		if (field936.field1156 != null) {
			var2 = field936.field1156.field1364[field934];
		}

		HEQROJXW var3 = new HEQROJXW(false, true, UEUSJYYO.method536(var2), var1);
		if (var2 != -1) {
			var3.method329();
			var3.method330(var2);
			var3.field749 = null;
			var3.field748 = null;
		}

		if (field936.field1159 != 128 || field936.field1160 != 128) {
			var3.method338(field936.field1160, field936.field1159, field936.field1159);
		}

		var3.method334(field953);
		var3.method339(field936.field1162 + 64, field936.field1163 + 850, -30, -50, -30, true);
		return var3;
	}
}
