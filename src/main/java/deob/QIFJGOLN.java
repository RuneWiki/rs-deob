package deob;

@ObfuscatedName("QIFJGOLN")
public final class QIFJGOLN extends YPQKGFZW {

	@ObfuscatedName("QIFJGOLN.t")
	public boolean field1036 = false;

	@ObfuscatedName("QIFJGOLN.u")
	public JXKRPXFX field1037;

	@ObfuscatedName("QIFJGOLN.D")
	public int field1046;

	@ObfuscatedName("QIFJGOLN.x")
	public int field1040;

	@ObfuscatedName("QIFJGOLN.y")
	public int field1041;

	@ObfuscatedName("QIFJGOLN.z")
	public int field1042;

	@ObfuscatedName("QIFJGOLN.B")
	public int field1044;

	@ObfuscatedName("QIFJGOLN.C")
	public int field1045;

	@ObfuscatedName("QIFJGOLN.p")
	public int field1032;

	@ObfuscatedName("QIFJGOLN.q")
	public int field1033;

	@ObfuscatedName("QIFJGOLN.r")
	public int field1034;

	@ObfuscatedName("QIFJGOLN.A")
	public int field1043;

	@ObfuscatedName("QIFJGOLN.l")
	public double field1028;

	@ObfuscatedName("QIFJGOLN.m")
	public double field1029;

	@ObfuscatedName("QIFJGOLN.n")
	public double field1030;

	@ObfuscatedName("QIFJGOLN.o")
	public double field1031;

	@ObfuscatedName("QIFJGOLN.s")
	public double field1035;

	@ObfuscatedName("QIFJGOLN.G")
	public double field1049;

	@ObfuscatedName("QIFJGOLN.H")
	public double field1050;

	@ObfuscatedName("QIFJGOLN.I")
	public double field1051;

	@ObfuscatedName("QIFJGOLN.v")
	public int field1038;

	@ObfuscatedName("QIFJGOLN.w")
	public int field1039;

	@ObfuscatedName("QIFJGOLN.E")
	public int field1047;

	@ObfuscatedName("QIFJGOLN.F")
	public int field1048;

	@ObfuscatedName("QIFJGOLN.a(IIIBI)V")
	public final void method427(int arg0, int arg1, int arg2, int arg3) {
		if (!field1036) {
			double var5 = (double) (arg2 - field1040);
			double var7 = (double) (arg3 - field1041);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field1049 = field1033 * var5 / var9 + field1040;
			field1050 = field1033 * var7 / var9 + field1041;
			field1051 = field1042;
		}

		double var11 = (double) (field1045 + 1 - arg1);
		field1028 = (arg2 - field1049) / var11;
		field1029 = (arg3 - field1050) / var11;
		field1030 = Math.sqrt(field1029 * field1029 + field1028 * field1028);
		if (!field1036) {
			field1031 = -field1030 * Math.tan(field1032 * 0.02454369D);
		}

		field1035 = (arg0 - field1051 - field1031 * var11) * 2.0D / (var11 * var11);
	}

	@ObfuscatedName("QIFJGOLN.a(II)V")
	public final void method428(int arg0) {
		field1036 = true;
		field1049 += arg0 * field1028;
		field1050 += arg0 * field1029;
		field1051 += field1035 * 0.5D * arg0 * arg0 + arg0 * field1031;
		field1031 += arg0 * field1035;
		field1038 = (int) (Math.atan2(field1028, field1029) * 325.949D) + 1024 & 0x7FF;
		field1039 = (int) (Math.atan2(field1031, field1030) * 325.949D) & 0x7FF;

		if (field1037.field636 != null) {
			field1048 += arg0;
			while (field1048 > field1037.field636.method405(field1047)) {
				field1048 -= field1037.field636.method405(field1047);
				field1047++;
				if (field1047 >= field1037.field636.field952) {
					field1047 = 0;
				}
			}
		}
	}

	public QIFJGOLN(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field1037 = JXKRPXFX.field632[arg6];
		field1046 = arg10;
		field1040 = arg2;
		field1041 = arg3;
		field1042 = arg0;
		field1044 = arg1;
		field1045 = arg8;
		field1032 = arg4;
		field1033 = arg5;
		field1034 = arg7;
		field1043 = arg9;
		field1036 = false;
	}

	@ObfuscatedName("QIFJGOLN.a(B)LKUGNQTGL;")
	public final KUGNQTGL method40() {
		KUGNQTGL var1 = field1037.method308();
		if (var1 == null) {
			return null;
		}

		int var2 = -1;
		if (field1037.field636 != null) {
			var2 = field1037.field636.field953[field1047];
		}

		KUGNQTGL var3 = new KUGNQTGL(var1, false, true, SCWTQUFK.method455(var2));
		if (var2 != -1) {
			var3.method337();
			var3.method338(var2);
			var3.field702 = null;
			var3.field701 = null;
		}

		if (field1037.field639 != 128 || field1037.field640 != 128) {
			var3.method346(field1037.field639, field1037.field639, field1037.field640);
		}

		var3.method342(field1039);
		var3.method347(field1037.field642 + 64, field1037.field643 + 850, -30, -50, -30, true);
		return var3;
	}
}
