package deob;

@ObfuscatedName("NUUJCJXB")
public class NUUJCJXB extends BBIXHJOC {

	@ObfuscatedName("NUUJCJXB.y")
	public int field1099 = -1;

	@ObfuscatedName("NUUJCJXB.D")
	public int field1104 = -1;

	@ObfuscatedName("NUUJCJXB.E")
	public int field1105 = 1;

	@ObfuscatedName("NUUJCJXB.G")
	public int[] field1107 = new int[4];

	@ObfuscatedName("NUUJCJXB.H")
	public int[] field1108 = new int[4];

	@ObfuscatedName("NUUJCJXB.I")
	public int[] field1109 = new int[4];

	@ObfuscatedName("NUUJCJXB.J")
	public int field1110 = 200;

	@ObfuscatedName("NUUJCJXB.N")
	public int field1114 = -1000;

	@ObfuscatedName("NUUJCJXB.R")
	public int field1117 = 32;

	@ObfuscatedName("NUUJCJXB.S")
	public int[] field1118 = new int[10];

	@ObfuscatedName("NUUJCJXB.T")
	public int[] field1119 = new int[10];

	@ObfuscatedName("NUUJCJXB.W")
	public int field1122 = -1;

	@ObfuscatedName("NUUJCJXB.Y")
	public boolean field1123 = false;

	@ObfuscatedName("NUUJCJXB.Z")
	public int field1124 = -1;

	@ObfuscatedName("NUUJCJXB.cb")
	public boolean[] field1127 = new boolean[10];

	@ObfuscatedName("NUUJCJXB.db")
	public int field1128 = -1;

	@ObfuscatedName("NUUJCJXB.eb")
	public int field1129 = -1;

	@ObfuscatedName("NUUJCJXB.fb")
	public int field1130 = -1;

	@ObfuscatedName("NUUJCJXB.gb")
	public int field1131 = -1;

	@ObfuscatedName("NUUJCJXB.hb")
	public int field1132 = -1;

	@ObfuscatedName("NUUJCJXB.nb")
	public int field1138 = 100;

	@ObfuscatedName("NUUJCJXB.pb")
	public int field1140 = -1;

	@ObfuscatedName("NUUJCJXB.qb")
	public int field1141 = -1;

	@ObfuscatedName("NUUJCJXB.m")
	public int field1088;

	@ObfuscatedName("NUUJCJXB.o")
	public int field1089;

	@ObfuscatedName("NUUJCJXB.p")
	public int field1090;

	@ObfuscatedName("NUUJCJXB.q")
	public int field1091;

	@ObfuscatedName("NUUJCJXB.r")
	public int field1092;

	@ObfuscatedName("NUUJCJXB.s")
	public int field1093;

	@ObfuscatedName("NUUJCJXB.t")
	public int field1094;

	@ObfuscatedName("NUUJCJXB.u")
	public int field1095;

	@ObfuscatedName("NUUJCJXB.v")
	public int field1096;

	@ObfuscatedName("NUUJCJXB.w")
	public int field1097;

	@ObfuscatedName("NUUJCJXB.z")
	public int field1100;

	@ObfuscatedName("NUUJCJXB.A")
	public int field1101;

	@ObfuscatedName("NUUJCJXB.B")
	public int field1102;

	@ObfuscatedName("NUUJCJXB.C")
	public int field1103;

	@ObfuscatedName("NUUJCJXB.F")
	public int field1106;

	@ObfuscatedName("NUUJCJXB.K")
	public int field1111;

	@ObfuscatedName("NUUJCJXB.L")
	public int field1112;

	@ObfuscatedName("NUUJCJXB.M")
	public int field1113;

	@ObfuscatedName("NUUJCJXB.O")
	public int field1115;

	@ObfuscatedName("NUUJCJXB.P")
	public int field1116;

	@ObfuscatedName("NUUJCJXB.U")
	public int field1120;

	@ObfuscatedName("NUUJCJXB.V")
	public int field1121;

	@ObfuscatedName("NUUJCJXB.ab")
	public int field1125;

	@ObfuscatedName("NUUJCJXB.bb")
	public int field1126;

	@ObfuscatedName("NUUJCJXB.ib")
	public int field1133;

	@ObfuscatedName("NUUJCJXB.jb")
	public int field1134;

	@ObfuscatedName("NUUJCJXB.kb")
	public int field1135;

	@ObfuscatedName("NUUJCJXB.lb")
	public int field1136;

	@ObfuscatedName("NUUJCJXB.mb")
	public int field1137;

	@ObfuscatedName("NUUJCJXB.ob")
	public int field1139;

	@ObfuscatedName("NUUJCJXB.rb")
	public int field1142;

	@ObfuscatedName("NUUJCJXB.x")
	public String field1098;

	@ObfuscatedName("NUUJCJXB.a(Z)Z")
	public boolean method297() {
		return false;
	}

	@ObfuscatedName("NUUJCJXB.a(IIII)V")
	public final void method447(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 4; var4++) {
			if (field1109[var4] <= arg1) {
				field1107[var4] = arg2;
				field1108[var4] = arg0;
				field1109[var4] = arg1 + 70;
				return;
			}
		}
	}

	@ObfuscatedName("NUUJCJXB.b(Z)V")
	public final void method448() {
		field1139 = 0;
		field1142 = 0;
	}

	@ObfuscatedName("NUUJCJXB.a(ZII)V")
	public final void method449(boolean arg0, int arg1) {
		int var3 = field1118[0];
		int var4 = field1119[0];
		if (arg1 == 0) {
			var3--;
			var4++;
		}

		if (arg1 == 1) {
			var4++;
		}

		if (arg1 == 2) {
			var3++;
			var4++;
		}

		if (arg1 == 3) {
			var3--;
		}

		if (arg1 == 4) {
			var3++;
		}

		if (arg1 == 5) {
			var3--;
			var4--;
		}

		if (arg1 == 6) {
			var4--;
		}

		if (arg1 == 7) {
			var3++;
			var4--;
		}

		if (field1132 != -1 && OXBPHQKK.field1152[field1132].field1165 == 1) {
			field1132 = -1;
		}

		if (field1139 < 9) {
			field1139++;
		}

		for (int var5 = field1139; var5 > 0; var5--) {
			field1118[var5] = field1118[var5 - 1];
			field1119[var5] = field1119[var5 - 1];
			field1127[var5] = field1127[var5 - 1];
		}

		field1118[0] = var3;
		field1119[0] = var4;
		field1127[0] = arg0;
	}

	@ObfuscatedName("NUUJCJXB.a(IZZI)V")
	public final void method450(int arg0, boolean arg1, int arg2) {
		if (field1132 != -1 && OXBPHQKK.field1152[field1132].field1165 == 1) {
			field1132 = -1;
		}

		if (!arg1) {
			int var4 = arg2 - field1118[0];
			int var5 = arg0 - field1119[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (field1139 < 9) {
					field1139++;
				}

				for (int var6 = field1139; var6 > 0; var6--) {
					field1118[var6] = field1118[var6 - 1];
					field1119[var6] = field1119[var6 - 1];
					field1127[var6] = field1127[var6 - 1];
				}

				field1118[0] = arg2;
				field1119[0] = arg0;
				field1127[0] = false;
				return;
			}
		}

		field1139 = 0;
		field1142 = 0;
		field1137 = 0;
		field1118[0] = arg2;
		field1119[0] = arg0;
		field1111 = field1118[0] * 128 + field1105 * 64;
		field1112 = field1119[0] * 128 + field1105 * 64;
	}
}
