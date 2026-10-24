package deob;

@ObfuscatedName("NZKYYWQJ")
public final class NZKYYWQJ extends DKQKXOQO {

	@ObfuscatedName("NZKYYWQJ.L")
	public boolean field1107 = false;

	@ObfuscatedName("NZKYYWQJ.n")
	public XBHNZKGU field1084;

	@ObfuscatedName("NZKYYWQJ.F")
	public int field1102;

	@ObfuscatedName("NZKYYWQJ.H")
	public int field1103;

	@ObfuscatedName("NZKYYWQJ.I")
	public int field1104;

	@ObfuscatedName("NZKYYWQJ.J")
	public int field1105;

	@ObfuscatedName("NZKYYWQJ.x")
	public int field1094;

	@ObfuscatedName("NZKYYWQJ.y")
	public int field1095;

	@ObfuscatedName("NZKYYWQJ.u")
	public int field1091;

	@ObfuscatedName("NZKYYWQJ.v")
	public int field1092;

	@ObfuscatedName("NZKYYWQJ.w")
	public int field1093;

	@ObfuscatedName("NZKYYWQJ.K")
	public int field1106;

	@ObfuscatedName("NZKYYWQJ.q")
	public double field1087;

	@ObfuscatedName("NZKYYWQJ.r")
	public double field1088;

	@ObfuscatedName("NZKYYWQJ.s")
	public double field1089;

	@ObfuscatedName("NZKYYWQJ.t")
	public double field1090;

	@ObfuscatedName("NZKYYWQJ.z")
	public double field1096;

	@ObfuscatedName("NZKYYWQJ.A")
	public double field1097;

	@ObfuscatedName("NZKYYWQJ.B")
	public double field1098;

	@ObfuscatedName("NZKYYWQJ.C")
	public double field1099;

	@ObfuscatedName("NZKYYWQJ.o")
	public int field1085;

	@ObfuscatedName("NZKYYWQJ.p")
	public int field1086;

	@ObfuscatedName("NZKYYWQJ.D")
	public int field1100;

	@ObfuscatedName("NZKYYWQJ.E")
	public int field1101;

	@ObfuscatedName("NZKYYWQJ.a(I)LFCIDIKVY;")
	public final FCIDIKVY method187() {
		FCIDIKVY var1 = field1084.method563();
		if (var1 == null) {
			return null;
		}

		int var2 = -1;
		if (field1084.field1439 != null) {
			var2 = field1084.field1439.field1476[field1100];
		}

		FCIDIKVY var3 = new FCIDIKVY(false, FGGKJQKK.method235(var2), var1, true);
		if (var2 != -1) {
			var3.method206();
			var3.method207(var2);
			var3.field716 = null;
			var3.field715 = null;
		}

		if (field1084.field1442 != 128 || field1084.field1443 != 128) {
			var3.method215(field1084.field1442, field1084.field1442, field1084.field1443);
		}

		var3.method211(field1086);
		var3.method216(field1084.field1445 + 64, field1084.field1446 + 850, -30, -50, -30, true);
		return var3;
	}

	@ObfuscatedName("NZKYYWQJ.a(IIIZI)V")
	public final void method345(int arg0, int arg1, int arg2, int arg3) {
		if (!field1107) {
			double var5 = (double) (arg3 - field1103);
			double var7 = (double) (arg2 - field1104);
			double var9 = Math.sqrt(var5 * var5 + var7 * var7);
			field1087 = field1092 * var5 / var9 + field1103;
			field1088 = field1092 * var7 / var9 + field1104;
			field1089 = field1105;
		}

		double var11 = (double) (field1095 + 1 - arg0);
		field1096 = (arg3 - field1087) / var11;
		field1097 = (arg2 - field1088) / var11;
		field1098 = Math.sqrt(field1097 * field1097 + field1096 * field1096);
		if (!field1107) {
			field1099 = -field1098 * Math.tan(field1091 * 0.02454369D);
		}

		field1090 = (arg1 - field1089 - field1099 * var11) * 2.0D / (var11 * var11);
	}

	@ObfuscatedName("NZKYYWQJ.a(IZ)V")
	public final void method346(int arg0) {
		field1107 = true;
		field1087 += arg0 * field1096;
		field1088 += arg0 * field1097;
		field1089 += field1090 * 0.5D * arg0 * arg0 + arg0 * field1099;
		field1099 += arg0 * field1090;
		field1085 = (int) (Math.atan2(field1096, field1097) * 325.949D) + 1024 & 0x7FF;
		field1086 = (int) (Math.atan2(field1099, field1098) * 325.949D) & 0x7FF;

		if (field1084.field1439 != null) {
			field1101 += arg0;
			while (field1101 > field1084.field1439.method567(field1100)) {
				field1101 -= field1084.field1439.method567(field1100) + 1;
				field1100++;
				if (field1100 >= field1084.field1439.field1475) {
					field1100 = 0;
				}
			}
		}
	}

	public NZKYYWQJ(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
		field1084 = XBHNZKGU.field1435[arg3];
		field1102 = arg2;
		field1103 = arg8;
		field1104 = arg5;
		field1105 = arg7;
		field1094 = arg9;
		field1095 = arg1;
		field1091 = arg0;
		field1092 = arg10;
		field1093 = arg4;
		field1106 = arg6;
		field1107 = false;
	}
}
