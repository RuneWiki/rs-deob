package deob;

@ObfuscatedName("OZYWPVDM")
public abstract class OZYWPVDM extends MODNYPGG {

	@ObfuscatedName("OZYWPVDM.n")
	public boolean field1189 = false;

	@ObfuscatedName("OZYWPVDM.o")
	public int field1190 = -1000;

	@ObfuscatedName("OZYWPVDM.s")
	public int field1193 = -1;

	@ObfuscatedName("OZYWPVDM.y")
	public int field1199 = -1;

	@ObfuscatedName("OZYWPVDM.B")
	public int field1202 = 200;

	@ObfuscatedName("OZYWPVDM.D")
	public int field1204 = 1;

	@ObfuscatedName("OZYWPVDM.E")
	public int field1205 = 32;

	@ObfuscatedName("OZYWPVDM.F")
	public int[] field1206 = new int[4];

	@ObfuscatedName("OZYWPVDM.G")
	public int[] field1207 = new int[4];

	@ObfuscatedName("OZYWPVDM.H")
	public int[] field1208 = new int[4];

	@ObfuscatedName("OZYWPVDM.I")
	public boolean[] field1209 = new boolean[10];

	@ObfuscatedName("OZYWPVDM.K")
	public int field1211 = -1;

	@ObfuscatedName("OZYWPVDM.P")
	public int field1216 = -1;

	@ObfuscatedName("OZYWPVDM.T")
	public int field1220 = -1;

	@ObfuscatedName("OZYWPVDM.X")
	public int field1224 = 100;

	@ObfuscatedName("OZYWPVDM.Y")
	public int[] field1225 = new int[10];

	@ObfuscatedName("OZYWPVDM.Z")
	public int[] field1226 = new int[10];

	@ObfuscatedName("OZYWPVDM.jb")
	public int field1234 = -1;

	@ObfuscatedName("OZYWPVDM.kb")
	public int field1235 = -1;

	@ObfuscatedName("OZYWPVDM.nb")
	public int field1237 = -1;

	@ObfuscatedName("OZYWPVDM.ob")
	public int field1238 = -1;

	@ObfuscatedName("OZYWPVDM.pb")
	public int field1239 = -1;

	@ObfuscatedName("OZYWPVDM.qb")
	public int field1240 = -1;

	@ObfuscatedName("OZYWPVDM.p")
	public int field1191;

	@ObfuscatedName("OZYWPVDM.q")
	public int field1192;

	@ObfuscatedName("OZYWPVDM.t")
	public int field1194;

	@ObfuscatedName("OZYWPVDM.u")
	public int field1195;

	@ObfuscatedName("OZYWPVDM.v")
	public int field1196;

	@ObfuscatedName("OZYWPVDM.w")
	public int field1197;

	@ObfuscatedName("OZYWPVDM.x")
	public int field1198;

	@ObfuscatedName("OZYWPVDM.z")
	public int field1200;

	@ObfuscatedName("OZYWPVDM.C")
	public int field1203;

	@ObfuscatedName("OZYWPVDM.J")
	public int field1210;

	@ObfuscatedName("OZYWPVDM.L")
	public int field1212;

	@ObfuscatedName("OZYWPVDM.M")
	public int field1213;

	@ObfuscatedName("OZYWPVDM.N")
	public int field1214;

	@ObfuscatedName("OZYWPVDM.O")
	public int field1215;

	@ObfuscatedName("OZYWPVDM.Q")
	public int field1217;

	@ObfuscatedName("OZYWPVDM.R")
	public int field1218;

	@ObfuscatedName("OZYWPVDM.S")
	public int field1219;

	@ObfuscatedName("OZYWPVDM.U")
	public int field1221;

	@ObfuscatedName("OZYWPVDM.V")
	public int field1222;

	@ObfuscatedName("OZYWPVDM.W")
	public int field1223;

	@ObfuscatedName("OZYWPVDM.ab")
	public int field1227;

	@ObfuscatedName("OZYWPVDM.bb")
	public int field1228;

	@ObfuscatedName("OZYWPVDM.cb")
	public int field1229;

	@ObfuscatedName("OZYWPVDM.db")
	public int field1230;

	@ObfuscatedName("OZYWPVDM.eb")
	public int field1231;

	@ObfuscatedName("OZYWPVDM.fb")
	public int field1232;

	@ObfuscatedName("OZYWPVDM.gb")
	public int field1233;

	@ObfuscatedName("OZYWPVDM.mb")
	public int field1236;

	@ObfuscatedName("OZYWPVDM.rb")
	public int field1241;

	@ObfuscatedName("OZYWPVDM.sb")
	public int field1242;

	@ObfuscatedName("OZYWPVDM.tb")
	public int field1243;

	@ObfuscatedName("OZYWPVDM.A")
	public String field1201;

	@ObfuscatedName("OZYWPVDM.a(IIIZ)V")
	public final void method419(int arg0, int arg1, boolean arg2) {
		if (field1211 != -1 && KAIFCIAJ.field742[field1211].field755 == 1) {
			field1211 = -1;
		}

		if (!arg2) {
			int var4 = arg0 - field1225[0];
			int var5 = arg1 - field1226[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (field1200 < 9) {
					field1200++;
				}

				for (int var6 = field1200; var6 > 0; var6--) {
					field1225[var6] = field1225[var6 - 1];
					field1226[var6] = field1226[var6 - 1];
					field1209[var6] = field1209[var6 - 1];
				}

				field1225[0] = arg0;
				field1226[0] = arg1;
				field1209[0] = false;
				return;
			}
		}

		field1200 = 0;
		field1210 = 0;
		field1198 = 0;
		field1225[0] = arg0;
		field1226[0] = arg1;
		field1217 = field1225[0] * 128 + field1204 * 64;
		field1218 = field1226[0] * 128 + field1204 * 64;
	}

	@ObfuscatedName("OZYWPVDM.a(IZI)V")
	public final void method420(int arg0, boolean arg1) {
		int var3 = field1225[0];
		int var4 = field1226[0];
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

		if (field1211 != -1 && KAIFCIAJ.field742[field1211].field755 == 1) {
			field1211 = -1;
		}

		if (field1200 < 9) {
			field1200++;
		}

		for (int var5 = field1200; var5 > 0; var5--) {
			field1225[var5] = field1225[var5 - 1];
			field1226[var5] = field1226[var5 - 1];
			field1209[var5] = field1209[var5 - 1];
		}

		field1225[0] = var3;
		field1226[0] = var4;
		field1209[0] = arg1;
	}

	@ObfuscatedName("OZYWPVDM.a(Z)Z")
	public boolean method229() {
		return false;
	}

	@ObfuscatedName("OZYWPVDM.a(BIII)V")
	public final void method421(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 4; var4++) {
			if (field1208[var4] <= arg0) {
				field1206[var4] = arg1;
				field1207[var4] = arg2;
				field1208[var4] = arg0 + 70;
				return;
			}
		}
	}

	@ObfuscatedName("OZYWPVDM.b(I)V")
	public final void method422() {
		field1200 = 0;
		field1210 = 0;
	}
}
