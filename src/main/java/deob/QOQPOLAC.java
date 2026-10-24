package deob;

@ObfuscatedName("QOQPOLAC")
public final class QOQPOLAC extends NSRXNXHB {

	@ObfuscatedName("QOQPOLAC.M")
	public boolean field1089 = false;

	@ObfuscatedName("QOQPOLAC.z")
	public VSBOWDVL field1078;

	@ObfuscatedName("QOQPOLAC.F")
	public int field1083;

	@ObfuscatedName("QOQPOLAC.t")
	public int field1072;

	@ObfuscatedName("QOQPOLAC.u")
	public int field1073;

	@ObfuscatedName("QOQPOLAC.v")
	public int field1074;

	@ObfuscatedName("QOQPOLAC.q")
	public int field1070;

	@ObfuscatedName("QOQPOLAC.r")
	public int field1071;

	@ObfuscatedName("QOQPOLAC.m")
	public int field1066;

	@ObfuscatedName("QOQPOLAC.n")
	public int field1067;

	@ObfuscatedName("QOQPOLAC.o")
	public int field1068;

	@ObfuscatedName("QOQPOLAC.w")
	public int field1075;

	@ObfuscatedName("QOQPOLAC.p")
	public double field1069;

	@ObfuscatedName("QOQPOLAC.A")
	public double field1079;

	@ObfuscatedName("QOQPOLAC.B")
	public double field1080;

	@ObfuscatedName("QOQPOLAC.C")
	public double field1081;

	@ObfuscatedName("QOQPOLAC.D")
	public double field1082;

	@ObfuscatedName("QOQPOLAC.J")
	public double field1086;

	@ObfuscatedName("QOQPOLAC.K")
	public double field1087;

	@ObfuscatedName("QOQPOLAC.L")
	public double field1088;

	@ObfuscatedName("QOQPOLAC.x")
	public int field1076;

	@ObfuscatedName("QOQPOLAC.y")
	public int field1077;

	@ObfuscatedName("QOQPOLAC.G")
	public int field1084;

	@ObfuscatedName("QOQPOLAC.H")
	public int field1085;

	@ObfuscatedName("QOQPOLAC.a(IIIII)V")
	public final void method403(int arg0, int arg1, int arg2, int arg3) {
		if (!field1089) {
			double var5 = (double) (arg0 - field1072);
			double var7 = (double) (arg1 - field1073);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field1086 = field1067 * var5 / var9 + field1072;
			field1087 = field1067 * var7 / var9 + field1073;
			field1088 = field1074;
		}

		double var11 = (double) (field1071 + 1 - arg3);
		field1079 = (arg0 - field1086) / var11;
		field1080 = (arg1 - field1087) / var11;
		field1081 = Math.sqrt(field1080 * field1080 + field1079 * field1079);
		if (!field1089) {
			field1082 = -field1081 * Math.tan(field1066 * 0.02454369D);
		}

		field1069 = (arg2 - field1088 - field1082 * var11) * 2.0D / (var11 * var11);
	}

	@ObfuscatedName("QOQPOLAC.a(I)LFUTAQMCE;")
	public final FUTAQMCE method2() {
		FUTAQMCE var1 = field1078.method519();
		if (var1 == null) {
			return null;
		}

		int var2 = -1;
		if (field1078.field1384 != null) {
			var2 = field1078.field1384.field722[field1084];
		}

		FUTAQMCE var3 = new FUTAQMCE(var1, false, true, RYVJCVCB.method428(var2));
		if (var2 != -1) {
			var3.method257();
			var3.method258(var2);
			var3.field670 = null;
			var3.field669 = null;
		}

		if (field1078.field1387 != 128 || field1078.field1388 != 128) {
			var3.method266(field1078.field1387, field1078.field1388, field1078.field1387);
		}

		var3.method262(field1077);
		var3.method267(field1078.field1390 + 64, field1078.field1391 + 850, -30, -50, -30, true);
		return var3;
	}

	public QOQPOLAC(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field1078 = VSBOWDVL.field1380[arg3];
		field1083 = arg7;
		field1072 = arg10;
		field1073 = arg9;
		field1074 = arg4;
		field1070 = arg2;
		field1071 = arg6;
		field1066 = arg1;
		field1067 = arg0;
		field1068 = arg5;
		field1075 = arg8;
		field1089 = false;
	}

	@ObfuscatedName("QOQPOLAC.a(IZ)V")
	public final void method404(int arg0) {
		field1089 = true;
		field1086 += arg0 * field1079;
		field1087 += arg0 * field1080;
		field1088 += field1069 * 0.5D * arg0 * arg0 + arg0 * field1082;
		field1082 += arg0 * field1069;
		field1076 = (int) (Math.atan2(field1079, field1080) * 325.949D) + 1024 & 0x7FF;
		field1077 = (int) (Math.atan2(field1082, field1081) * 325.949D) & 0x7FF;

		if (field1078.field1384 != null) {
			field1085 += arg0;
			while (field1085 > field1078.field1384.method277(field1084)) {
				field1085 -= field1078.field1384.method277(field1084) + 1;
				field1084++;
				if (field1084 >= field1078.field1384.field721) {
					field1084 = 0;
				}
			}
		}
	}
}
