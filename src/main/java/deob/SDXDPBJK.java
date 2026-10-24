package deob;

@ObfuscatedName("SDXDPBJK")
public abstract class SDXDPBJK extends ACEAAIDL {

	@ObfuscatedName("SDXDPBJK.o")
	public int field1073 = -1;

	@ObfuscatedName("SDXDPBJK.p")
	public int field1074 = -1;

	@ObfuscatedName("SDXDPBJK.q")
	public int field1075 = -1;

	@ObfuscatedName("SDXDPBJK.r")
	public int field1076 = -1;

	@ObfuscatedName("SDXDPBJK.s")
	public int field1077 = 100;

	@ObfuscatedName("SDXDPBJK.t")
	public int field1078 = -1;

	@ObfuscatedName("SDXDPBJK.G")
	public int field1091 = -1;

	@ObfuscatedName("SDXDPBJK.H")
	public int field1092 = -1;

	@ObfuscatedName("SDXDPBJK.I")
	public int[] field1093 = new int[4];

	@ObfuscatedName("SDXDPBJK.J")
	public int[] field1094 = new int[4];

	@ObfuscatedName("SDXDPBJK.K")
	public int[] field1095 = new int[4];

	@ObfuscatedName("SDXDPBJK.L")
	public boolean[] field1096 = new boolean[10];

	@ObfuscatedName("SDXDPBJK.M")
	public int[] field1097 = new int[10];

	@ObfuscatedName("SDXDPBJK.N")
	public int[] field1098 = new int[10];

	@ObfuscatedName("SDXDPBJK.P")
	public int field1100 = -1;

	@ObfuscatedName("SDXDPBJK.R")
	public int field1102 = -1;

	@ObfuscatedName("SDXDPBJK.U")
	public int field1105 = -1;

	@ObfuscatedName("SDXDPBJK.cb")
	public int field1113 = 1;

	@ObfuscatedName("SDXDPBJK.gb")
	public int field1117 = 200;

	@ObfuscatedName("SDXDPBJK.hb")
	public int field1118 = -1000;

	@ObfuscatedName("SDXDPBJK.kb")
	public int field1121 = 32;

	@ObfuscatedName("SDXDPBJK.nb")
	public boolean field1124 = false;

	@ObfuscatedName("SDXDPBJK.ob")
	public int field1125 = -1;

	@ObfuscatedName("SDXDPBJK.n")
	public int field1072;

	@ObfuscatedName("SDXDPBJK.u")
	public int field1079;

	@ObfuscatedName("SDXDPBJK.v")
	public int field1080;

	@ObfuscatedName("SDXDPBJK.w")
	public int field1081;

	@ObfuscatedName("SDXDPBJK.x")
	public int field1082;

	@ObfuscatedName("SDXDPBJK.y")
	public int field1083;

	@ObfuscatedName("SDXDPBJK.z")
	public int field1084;

	@ObfuscatedName("SDXDPBJK.A")
	public int field1085;

	@ObfuscatedName("SDXDPBJK.B")
	public int field1086;

	@ObfuscatedName("SDXDPBJK.C")
	public int field1087;

	@ObfuscatedName("SDXDPBJK.D")
	public int field1088;

	@ObfuscatedName("SDXDPBJK.E")
	public int field1089;

	@ObfuscatedName("SDXDPBJK.F")
	public int field1090;

	@ObfuscatedName("SDXDPBJK.O")
	public int field1099;

	@ObfuscatedName("SDXDPBJK.Q")
	public int field1101;

	@ObfuscatedName("SDXDPBJK.S")
	public int field1103;

	@ObfuscatedName("SDXDPBJK.T")
	public int field1104;

	@ObfuscatedName("SDXDPBJK.V")
	public int field1106;

	@ObfuscatedName("SDXDPBJK.W")
	public int field1107;

	@ObfuscatedName("SDXDPBJK.X")
	public int field1108;

	@ObfuscatedName("SDXDPBJK.Y")
	public int field1109;

	@ObfuscatedName("SDXDPBJK.Z")
	public int field1110;

	@ObfuscatedName("SDXDPBJK.ab")
	public int field1111;

	@ObfuscatedName("SDXDPBJK.bb")
	public int field1112;

	@ObfuscatedName("SDXDPBJK.db")
	public int field1114;

	@ObfuscatedName("SDXDPBJK.eb")
	public int field1115;

	@ObfuscatedName("SDXDPBJK.ib")
	public int field1119;

	@ObfuscatedName("SDXDPBJK.jb")
	public int field1120;

	@ObfuscatedName("SDXDPBJK.lb")
	public int field1122;

	@ObfuscatedName("SDXDPBJK.mb")
	public int field1123;

	@ObfuscatedName("SDXDPBJK.pb")
	public int field1126;

	@ObfuscatedName("SDXDPBJK.fb")
	public String field1116;

	@ObfuscatedName("SDXDPBJK.a(IZI)V")
	public final void method440(int arg0, boolean arg1) {
		int var3 = field1097[0];
		int var4 = field1098[0];
		if (arg0 == 0) {
			var3--;
			var4++;
		}

		if (arg0 == 1) {
			var4++;
		}

		if (arg0 == 2) {
			var3++;
			var4++;
		}

		if (arg0 == 3) {
			var3--;
		}

		if (arg0 == 4) {
			var3++;
		}

		if (arg0 == 5) {
			var3--;
			var4--;
		}

		if (arg0 == 6) {
			var4--;
		}

		if (arg0 == 7) {
			var3++;
			var4--;
		}

		if (field1105 != -1 && XRDQTWLL.field1418[field1105].field1431 == 1) {
			field1105 = -1;
		}

		if (field1114 < 9) {
			field1114++;
		}

		for (int var5 = field1114; var5 > 0; var5--) {
			field1097[var5] = field1097[var5 - 1];
			field1098[var5] = field1098[var5 - 1];
			field1096[var5] = field1096[var5 - 1];
		}

		field1097[0] = var3;
		field1098[0] = var4;
		field1096[0] = arg1;
	}

	@ObfuscatedName("SDXDPBJK.a(IBII)V")
	public final void method441(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 4; var4++) {
			if (field1095[var4] <= arg0) {
				field1093[var4] = arg2;
				field1094[var4] = arg1;
				field1095[var4] = arg0 + 70;
				return;
			}
		}
	}

	@ObfuscatedName("SDXDPBJK.a(B)Z")
	public boolean method302() {
		return false;
	}

	@ObfuscatedName("SDXDPBJK.a(ZZII)V")
	public final void method442(boolean arg0, int arg1, int arg2) {
		if (field1105 != -1 && XRDQTWLL.field1418[field1105].field1431 == 1) {
			field1105 = -1;
		}

		if (!arg0) {
			int var4 = arg1 - field1097[0];
			int var5 = arg2 - field1098[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (field1114 < 9) {
					field1114++;
				}

				for (int var6 = field1114; var6 > 0; var6--) {
					field1097[var6] = field1097[var6 - 1];
					field1098[var6] = field1098[var6 - 1];
					field1096[var6] = field1096[var6 - 1];
				}

				field1097[0] = arg1;
				field1098[0] = arg2;
				field1096[0] = false;
				return;
			}
		}

		field1114 = 0;
		field1126 = 0;
		field1099 = 0;
		field1097[0] = arg1;
		field1098[0] = arg2;
		field1110 = field1097[0] * 128 + field1113 * 64;
		field1111 = field1098[0] * 128 + field1113 * 64;
	}

	@ObfuscatedName("SDXDPBJK.a(I)V")
	public final void method443() {
		field1114 = 0;
		field1126 = 0;
	}
}
