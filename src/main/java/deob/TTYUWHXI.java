package deob;

@ObfuscatedName("TTYUWHXI")
public abstract class TTYUWHXI extends MQTIFFLX {

	@ObfuscatedName("TTYUWHXI.l")
	public int field1196 = -1;

	@ObfuscatedName("TTYUWHXI.z")
	public int field1210 = -1;

	@ObfuscatedName("TTYUWHXI.H")
	public int field1217 = -1000;

	@ObfuscatedName("TTYUWHXI.K")
	public int field1220 = -1;

	@ObfuscatedName("TTYUWHXI.L")
	public int field1221 = -1;

	@ObfuscatedName("TTYUWHXI.M")
	public int field1222 = 100;

	@ObfuscatedName("TTYUWHXI.N")
	public int field1223 = -1;

	@ObfuscatedName("TTYUWHXI.O")
	public int field1224 = -1;

	@ObfuscatedName("TTYUWHXI.P")
	public int field1225 = -1;

	@ObfuscatedName("TTYUWHXI.Q")
	public int field1226 = -1;

	@ObfuscatedName("TTYUWHXI.R")
	public int field1227 = -1;

	@ObfuscatedName("TTYUWHXI.S")
	public int[] field1228 = new int[10];

	@ObfuscatedName("TTYUWHXI.T")
	public int[] field1229 = new int[10];

	@ObfuscatedName("TTYUWHXI.U")
	public int field1230 = 1;

	@ObfuscatedName("TTYUWHXI.V")
	public int field1231 = 32;

	@ObfuscatedName("TTYUWHXI.Y")
	public boolean field1234 = false;

	@ObfuscatedName("TTYUWHXI.cb")
	public int field1238 = -1;

	@ObfuscatedName("TTYUWHXI.fb")
	public boolean[] field1241 = new boolean[10];

	@ObfuscatedName("TTYUWHXI.gb")
	public int field1242 = -1;

	@ObfuscatedName("TTYUWHXI.kb")
	public int field1246 = 200;

	@ObfuscatedName("TTYUWHXI.mb")
	public int[] field1248 = new int[4];

	@ObfuscatedName("TTYUWHXI.nb")
	public int[] field1249 = new int[4];

	@ObfuscatedName("TTYUWHXI.ob")
	public int[] field1250 = new int[4];

	@ObfuscatedName("TTYUWHXI.m")
	public int field1197;

	@ObfuscatedName("TTYUWHXI.n")
	public int field1198;

	@ObfuscatedName("TTYUWHXI.o")
	public int field1199;

	@ObfuscatedName("TTYUWHXI.p")
	public int field1200;

	@ObfuscatedName("TTYUWHXI.q")
	public int field1201;

	@ObfuscatedName("TTYUWHXI.r")
	public int field1202;

	@ObfuscatedName("TTYUWHXI.s")
	public int field1203;

	@ObfuscatedName("TTYUWHXI.t")
	public int field1204;

	@ObfuscatedName("TTYUWHXI.u")
	public int field1205;

	@ObfuscatedName("TTYUWHXI.v")
	public int field1206;

	@ObfuscatedName("TTYUWHXI.w")
	public int field1207;

	@ObfuscatedName("TTYUWHXI.x")
	public int field1208;

	@ObfuscatedName("TTYUWHXI.y")
	public int field1209;

	@ObfuscatedName("TTYUWHXI.A")
	public int field1211;

	@ObfuscatedName("TTYUWHXI.B")
	public int field1212;

	@ObfuscatedName("TTYUWHXI.C")
	public int field1213;

	@ObfuscatedName("TTYUWHXI.D")
	public int field1214;

	@ObfuscatedName("TTYUWHXI.E")
	public int field1215;

	@ObfuscatedName("TTYUWHXI.G")
	public int field1216;

	@ObfuscatedName("TTYUWHXI.I")
	public int field1218;

	@ObfuscatedName("TTYUWHXI.J")
	public int field1219;

	@ObfuscatedName("TTYUWHXI.X")
	public int field1233;

	@ObfuscatedName("TTYUWHXI.Z")
	public int field1235;

	@ObfuscatedName("TTYUWHXI.ab")
	public int field1236;

	@ObfuscatedName("TTYUWHXI.bb")
	public int field1237;

	@ObfuscatedName("TTYUWHXI.db")
	public int field1239;

	@ObfuscatedName("TTYUWHXI.eb")
	public int field1240;

	@ObfuscatedName("TTYUWHXI.hb")
	public int field1243;

	@ObfuscatedName("TTYUWHXI.ib")
	public int field1244;

	@ObfuscatedName("TTYUWHXI.jb")
	public int field1245;

	@ObfuscatedName("TTYUWHXI.lb")
	public int field1247;

	@ObfuscatedName("TTYUWHXI.W")
	public String field1232;

	@ObfuscatedName("TTYUWHXI.b(Z)Z")
	public boolean method287() {
		return false;
	}

	@ObfuscatedName("TTYUWHXI.a(IZI)V")
	public final void method439(boolean arg0, int arg1) {
		int var3 = field1228[0];
		int var4 = field1229[0];
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

		if (field1196 != -1 && RIUJHZLL.field1112[field1196].field1125 == 1) {
			field1196 = -1;
		}

		if (field1201 < 9) {
			field1201++;
		}

		for (int var5 = field1201; var5 > 0; var5--) {
			field1228[var5] = field1228[var5 - 1];
			field1229[var5] = field1229[var5 - 1];
			field1241[var5] = field1241[var5 - 1];
		}

		field1228[0] = var3;
		field1229[0] = var4;
		field1241[0] = arg0;
	}

	@ObfuscatedName("TTYUWHXI.a(B)V")
	public final void method440() {
		field1201 = 0;
		field1233 = 0;
	}

	@ObfuscatedName("TTYUWHXI.a(IZIZ)V")
	public final void method441(int arg0, boolean arg1, int arg2) {
		if (field1196 != -1 && RIUJHZLL.field1112[field1196].field1125 == 1) {
			field1196 = -1;
		}

		if (!arg1) {
			int var4 = arg2 - field1228[0];
			int var5 = arg0 - field1229[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (field1201 < 9) {
					field1201++;
				}

				for (int var6 = field1201; var6 > 0; var6--) {
					field1228[var6] = field1228[var6 - 1];
					field1229[var6] = field1229[var6 - 1];
					field1241[var6] = field1241[var6 - 1];
				}

				field1228[0] = arg2;
				field1229[0] = arg0;
				field1241[0] = false;
				return;
			}
		}

		field1201 = 0;
		field1233 = 0;
		field1209 = 0;
		field1228[0] = arg2;
		field1229[0] = arg0;
		field1235 = field1228[0] * 128 + field1230 * 64;
		field1236 = field1229[0] * 128 + field1230 * 64;
	}

	@ObfuscatedName("TTYUWHXI.a(ZIII)V")
	public final void method442(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 4; var4++) {
			if (field1250[var4] <= arg1) {
				field1248[var4] = arg2;
				field1249[var4] = arg0;
				field1250[var4] = arg1 + 70;
				return;
			}
		}
	}
}
