package deob;

@ObfuscatedName("QMQRUGDN")
public class QMQRUGDN extends XPEMEMUL {

	@ObfuscatedName("QMQRUGDN.m")
	public int field1151 = -1;

	@ObfuscatedName("QMQRUGDN.s")
	public int field1156 = 200;

	@ObfuscatedName("QMQRUGDN.x")
	public boolean[] field1161 = new boolean[10];

	@ObfuscatedName("QMQRUGDN.z")
	public int field1163 = -1;

	@ObfuscatedName("QMQRUGDN.C")
	public int field1166 = -1;

	@ObfuscatedName("QMQRUGDN.D")
	public int field1167 = -1;

	@ObfuscatedName("QMQRUGDN.I")
	public boolean field1172 = false;

	@ObfuscatedName("QMQRUGDN.J")
	public int field1173 = 100;

	@ObfuscatedName("QMQRUGDN.K")
	public int field1174 = -1;

	@ObfuscatedName("QMQRUGDN.L")
	public int field1175 = -1000;

	@ObfuscatedName("QMQRUGDN.U")
	public int field1183 = -1;

	@ObfuscatedName("QMQRUGDN.V")
	public int field1184 = -1;

	@ObfuscatedName("QMQRUGDN.db")
	public int[] field1192 = new int[10];

	@ObfuscatedName("QMQRUGDN.eb")
	public int[] field1193 = new int[10];

	@ObfuscatedName("QMQRUGDN.fb")
	public int field1194 = -1;

	@ObfuscatedName("QMQRUGDN.gb")
	public int field1195 = -1;

	@ObfuscatedName("QMQRUGDN.hb")
	public int field1196 = -1;

	@ObfuscatedName("QMQRUGDN.ib")
	public int field1197 = -1;

	@ObfuscatedName("QMQRUGDN.jb")
	public int field1198 = 1;

	@ObfuscatedName("QMQRUGDN.mb")
	public int field1201 = 32;

	@ObfuscatedName("QMQRUGDN.nb")
	public int[] field1202 = new int[4];

	@ObfuscatedName("QMQRUGDN.ob")
	public int[] field1203 = new int[4];

	@ObfuscatedName("QMQRUGDN.pb")
	public int[] field1204 = new int[4];

	@ObfuscatedName("QMQRUGDN.l")
	public int field1150;

	@ObfuscatedName("QMQRUGDN.n")
	public int field1152;

	@ObfuscatedName("QMQRUGDN.o")
	public int field1153;

	@ObfuscatedName("QMQRUGDN.p")
	public int field1154;

	@ObfuscatedName("QMQRUGDN.q")
	public int field1155;

	@ObfuscatedName("QMQRUGDN.t")
	public int field1157;

	@ObfuscatedName("QMQRUGDN.u")
	public int field1158;

	@ObfuscatedName("QMQRUGDN.v")
	public int field1159;

	@ObfuscatedName("QMQRUGDN.w")
	public int field1160;

	@ObfuscatedName("QMQRUGDN.y")
	public int field1162;

	@ObfuscatedName("QMQRUGDN.A")
	public int field1164;

	@ObfuscatedName("QMQRUGDN.B")
	public int field1165;

	@ObfuscatedName("QMQRUGDN.E")
	public int field1168;

	@ObfuscatedName("QMQRUGDN.F")
	public int field1169;

	@ObfuscatedName("QMQRUGDN.G")
	public int field1170;

	@ObfuscatedName("QMQRUGDN.H")
	public int field1171;

	@ObfuscatedName("QMQRUGDN.M")
	public int field1176;

	@ObfuscatedName("QMQRUGDN.N")
	public int field1177;

	@ObfuscatedName("QMQRUGDN.O")
	public int field1178;

	@ObfuscatedName("QMQRUGDN.P")
	public int field1179;

	@ObfuscatedName("QMQRUGDN.Q")
	public int field1180;

	@ObfuscatedName("QMQRUGDN.S")
	public int field1182;

	@ObfuscatedName("QMQRUGDN.W")
	public int field1185;

	@ObfuscatedName("QMQRUGDN.X")
	public int field1186;

	@ObfuscatedName("QMQRUGDN.Y")
	public int field1187;

	@ObfuscatedName("QMQRUGDN.Z")
	public int field1188;

	@ObfuscatedName("QMQRUGDN.ab")
	public int field1189;

	@ObfuscatedName("QMQRUGDN.bb")
	public int field1190;

	@ObfuscatedName("QMQRUGDN.cb")
	public int field1191;

	@ObfuscatedName("QMQRUGDN.kb")
	public int field1199;

	@ObfuscatedName("QMQRUGDN.lb")
	public int field1200;

	@ObfuscatedName("QMQRUGDN.R")
	public String field1181;

	@ObfuscatedName("QMQRUGDN.a(IIIZ)V")
	public final void method454(int arg0, int arg1, boolean arg2) {
		if (field1151 != -1 && NMXKUYSC.field998[field1151].field1011 == 1) {
			field1151 = -1;
		}

		if (!arg2) {
			int var4 = arg1 - field1192[0];
			int var5 = arg0 - field1193[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (field1199 < 9) {
					field1199++;
				}

				for (int var6 = field1199; var6 > 0; var6--) {
					field1192[var6] = field1192[var6 - 1];
					field1193[var6] = field1193[var6 - 1];
					field1161[var6] = field1161[var6 - 1];
				}

				field1192[0] = arg1;
				field1193[0] = arg0;
				field1161[0] = false;
				return;
			}
		}

		field1199 = 0;
		field1150 = 0;
		field1182 = 0;
		field1192[0] = arg1;
		field1193[0] = arg0;
		field1157 = field1192[0] * 128 + field1198 * 64;
		field1158 = field1193[0] * 128 + field1198 * 64;
	}

	@ObfuscatedName("QMQRUGDN.a(BIII)V")
	public final void method455(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 4; var4++) {
			if (field1204[var4] <= arg1) {
				field1202[var4] = arg2;
				field1203[var4] = arg0;
				field1204[var4] = arg1 + 70;
				return;
			}
		}
	}

	@ObfuscatedName("QMQRUGDN.b(I)Z")
	public boolean method12() {
		return false;
	}

	@ObfuscatedName("QMQRUGDN.a(B)V")
	public final void method456() {
		field1199 = 0;
		field1150 = 0;
	}

	@ObfuscatedName("QMQRUGDN.a(ZIB)V")
	public final void method457(boolean arg0, int arg1) {
		int var3 = field1192[0];
		int var4 = field1193[0];
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

		if (field1151 != -1 && NMXKUYSC.field998[field1151].field1011 == 1) {
			field1151 = -1;
		}

		if (field1199 < 9) {
			field1199++;
		}

		for (int var5 = field1199; var5 > 0; var5--) {
			field1192[var5] = field1192[var5 - 1];
			field1193[var5] = field1193[var5 - 1];
			field1161[var5] = field1161[var5 - 1];
		}

		field1192[0] = var3;
		field1193[0] = var4;
		field1161[0] = arg0;
	}
}
