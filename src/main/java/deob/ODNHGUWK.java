package deob;

@ObfuscatedName("ODNHGUWK")
public final class ODNHGUWK extends TDBSBQNI {

	@ObfuscatedName("ODNHGUWK.n")
	public boolean field1033 = false;

	@ObfuscatedName("ODNHGUWK.A")
	public BZLQCUPI field1045;

	@ObfuscatedName("ODNHGUWK.B")
	public int field1046;

	@ObfuscatedName("ODNHGUWK.s")
	public int field1038;

	@ObfuscatedName("ODNHGUWK.t")
	public int field1039;

	@ObfuscatedName("ODNHGUWK.u")
	public int field1040;

	@ObfuscatedName("ODNHGUWK.C")
	public int field1047;

	@ObfuscatedName("ODNHGUWK.D")
	public int field1048;

	@ObfuscatedName("ODNHGUWK.E")
	public int field1049;

	@ObfuscatedName("ODNHGUWK.F")
	public int field1050;

	@ObfuscatedName("ODNHGUWK.G")
	public int field1051;

	@ObfuscatedName("ODNHGUWK.v")
	public int field1041;

	@ObfuscatedName("ODNHGUWK.k")
	public double field1030;

	@ObfuscatedName("ODNHGUWK.l")
	public double field1031;

	@ObfuscatedName("ODNHGUWK.m")
	public double field1032;

	@ObfuscatedName("ODNHGUWK.o")
	public double field1034;

	@ObfuscatedName("ODNHGUWK.p")
	public double field1035;

	@ObfuscatedName("ODNHGUWK.q")
	public double field1036;

	@ObfuscatedName("ODNHGUWK.r")
	public double field1037;

	@ObfuscatedName("ODNHGUWK.w")
	public double field1042;

	@ObfuscatedName("ODNHGUWK.x")
	public int field1043;

	@ObfuscatedName("ODNHGUWK.y")
	public int field1044;

	@ObfuscatedName("ODNHGUWK.H")
	public int field1052;

	@ObfuscatedName("ODNHGUWK.I")
	public int field1053;

	@ObfuscatedName("ODNHGUWK.a(IIIZI)V")
	public final void method438(int arg0, int arg1, int arg2, int arg3) {
		if (!field1033) {
			double var5 = (double) (arg1 - field1038);
			double var7 = (double) (arg0 - field1039);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field1030 = field1050 * var5 / var9 + field1038;
			field1031 = field1050 * var7 / var9 + field1039;
			field1032 = field1040;
		}

		double var11 = (double) (field1048 + 1 - arg3);
		field1034 = (arg1 - field1030) / var11;
		field1035 = (arg0 - field1031) / var11;
		field1036 = Math.sqrt(field1035 * field1035 + field1034 * field1034);
		if (!field1033) {
			field1037 = -field1036 * Math.tan(field1049 * 0.02454369D);
		}

		field1042 = (arg2 - field1032 - field1037 * var11) * 2.0D / (var11 * var11);
	}

	public ODNHGUWK(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field1045 = BZLQCUPI.field41[arg3];
		field1046 = arg0;
		field1038 = arg1;
		field1039 = arg6;
		field1040 = arg5;
		field1047 = arg4;
		field1048 = arg7;
		field1049 = arg8;
		field1050 = arg10;
		field1051 = arg9;
		field1041 = arg2;
		field1033 = false;
	}

	@ObfuscatedName("ODNHGUWK.a(II)V")
	public final void method439(int arg0) {
		field1033 = true;
		field1030 += arg0 * field1034;
		field1031 += arg0 * field1035;
		field1032 += field1042 * 0.5D * arg0 * arg0 + arg0 * field1037;
		field1037 += arg0 * field1042;
		field1043 = (int) (Math.atan2(field1034, field1035) * 325.949D) + 1024 & 0x7FF;
		field1044 = (int) (Math.atan2(field1037, field1036) * 325.949D) & 0x7FF;

		if (field1045.field45 != null) {
			field1053 += arg0;
			while (field1053 > field1045.field45.method252(field1052)) {
				field1053 -= field1045.field45.method252(field1052) + 1;
				field1052++;
				if (field1052 >= field1045.field45.field745) {
					field1052 = 0;
				}
			}
		}
	}

	@ObfuscatedName("ODNHGUWK.a(B)LCYPZUKMB;")
	public final CYPZUKMB method2() {
		CYPZUKMB var1 = field1045.method9();
		if (var1 == null) {
			return null;
		}

		int var2 = -1;
		if (field1045.field45 != null) {
			var2 = field1045.field45.field746[field1052];
		}

		CYPZUKMB var3 = new CYPZUKMB(QGRLAQIF.method469(var2), var1, false, true);
		if (var2 != -1) {
			var3.method203();
			var3.method204(var2);
			var3.field574 = null;
			var3.field573 = null;
		}

		if (field1045.field48 != 128 || field1045.field49 != 128) {
			var3.method212(field1045.field48, field1045.field49, field1045.field48);
		}

		var3.method208(field1044);
		var3.method213(field1045.field51 + 64, field1045.field52 + 850, -30, -50, -30, true);
		return var3;
	}
}
