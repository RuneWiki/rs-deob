package deob;

@ObfuscatedName("DGZJCXBC")
public class DGZJCXBC extends SMAWMDZY {

	@ObfuscatedName("DGZJCXBC.l")
	public int field508 = -1000;

	@ObfuscatedName("DGZJCXBC.q")
	public boolean field513 = false;

	@ObfuscatedName("DGZJCXBC.u")
	public boolean[] field517 = new boolean[10];

	@ObfuscatedName("DGZJCXBC.v")
	public int field518 = -1;

	@ObfuscatedName("DGZJCXBC.x")
	public int field519 = -1;

	@ObfuscatedName("DGZJCXBC.y")
	public int field520 = -1;

	@ObfuscatedName("DGZJCXBC.z")
	public int field521 = -1;

	@ObfuscatedName("DGZJCXBC.A")
	public int field522 = -1;

	@ObfuscatedName("DGZJCXBC.D")
	public int[] field525 = new int[4];

	@ObfuscatedName("DGZJCXBC.E")
	public int[] field526 = new int[4];

	@ObfuscatedName("DGZJCXBC.F")
	public int[] field527 = new int[4];

	@ObfuscatedName("DGZJCXBC.G")
	public int field528 = 100;

	@ObfuscatedName("DGZJCXBC.I")
	public int field530 = 200;

	@ObfuscatedName("DGZJCXBC.J")
	public int field531 = -1;

	@ObfuscatedName("DGZJCXBC.L")
	public int field532 = -1;

	@ObfuscatedName("DGZJCXBC.Q")
	public int field537 = -1;

	@ObfuscatedName("DGZJCXBC.T")
	public int field540 = 1;

	@ObfuscatedName("DGZJCXBC.U")
	public int field541 = -1;

	@ObfuscatedName("DGZJCXBC.V")
	public int field542 = -1;

	@ObfuscatedName("DGZJCXBC.X")
	public int[] field544 = new int[10];

	@ObfuscatedName("DGZJCXBC.Y")
	public int[] field545 = new int[10];

	@ObfuscatedName("DGZJCXBC.kb")
	public int field557 = -1;

	@ObfuscatedName("DGZJCXBC.pb")
	public int field562 = 32;

	@ObfuscatedName("DGZJCXBC.m")
	public int field509;

	@ObfuscatedName("DGZJCXBC.n")
	public int field510;

	@ObfuscatedName("DGZJCXBC.p")
	public int field512;

	@ObfuscatedName("DGZJCXBC.r")
	public int field514;

	@ObfuscatedName("DGZJCXBC.s")
	public int field515;

	@ObfuscatedName("DGZJCXBC.t")
	public int field516;

	@ObfuscatedName("DGZJCXBC.B")
	public int field523;

	@ObfuscatedName("DGZJCXBC.C")
	public int field524;

	@ObfuscatedName("DGZJCXBC.H")
	public int field529;

	@ObfuscatedName("DGZJCXBC.M")
	public int field533;

	@ObfuscatedName("DGZJCXBC.N")
	public int field534;

	@ObfuscatedName("DGZJCXBC.O")
	public int field535;

	@ObfuscatedName("DGZJCXBC.P")
	public int field536;

	@ObfuscatedName("DGZJCXBC.R")
	public int field538;

	@ObfuscatedName("DGZJCXBC.S")
	public int field539;

	@ObfuscatedName("DGZJCXBC.W")
	public int field543;

	@ObfuscatedName("DGZJCXBC.Z")
	public int field546;

	@ObfuscatedName("DGZJCXBC.ab")
	public int field547;

	@ObfuscatedName("DGZJCXBC.bb")
	public int field548;

	@ObfuscatedName("DGZJCXBC.cb")
	public int field549;

	@ObfuscatedName("DGZJCXBC.db")
	public int field550;

	@ObfuscatedName("DGZJCXBC.eb")
	public int field551;

	@ObfuscatedName("DGZJCXBC.fb")
	public int field552;

	@ObfuscatedName("DGZJCXBC.gb")
	public int field553;

	@ObfuscatedName("DGZJCXBC.hb")
	public int field554;

	@ObfuscatedName("DGZJCXBC.ib")
	public int field555;

	@ObfuscatedName("DGZJCXBC.jb")
	public int field556;

	@ObfuscatedName("DGZJCXBC.lb")
	public int field558;

	@ObfuscatedName("DGZJCXBC.mb")
	public int field559;

	@ObfuscatedName("DGZJCXBC.nb")
	public int field560;

	@ObfuscatedName("DGZJCXBC.ob")
	public int field561;

	@ObfuscatedName("DGZJCXBC.o")
	public String field511;

	@ObfuscatedName("DGZJCXBC.a(IIZ)V")
	public final void method180(int arg0, boolean arg1) {
		int var3 = field544[0];
		int var4 = field545[0];
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

		if (field532 != -1 && HZCWGKOF.field712[field532].field725 == 1) {
			field532 = -1;
		}

		if (field543 < 9) {
			field543++;
		}

		for (int var5 = field543; var5 > 0; var5--) {
			field544[var5] = field544[var5 - 1];
			field545[var5] = field545[var5 - 1];
			field517[var5] = field517[var5 - 1];
		}

		field544[0] = var3;
		field545[0] = var4;
		field517[0] = arg1;
	}

	@ObfuscatedName("DGZJCXBC.b(Z)Z")
	public boolean method1() {
		return false;
	}

	@ObfuscatedName("DGZJCXBC.a(IIIB)V")
	public final void method181(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 4; var4++) {
			if (field527[var4] <= arg1) {
				field525[var4] = arg2;
				field526[var4] = arg0;
				field527[var4] = arg1 + 70;
				return;
			}
		}
	}

	@ObfuscatedName("DGZJCXBC.a(I)V")
	public final void method182() {
		field543 = 0;
		field512 = 0;
	}

	@ObfuscatedName("DGZJCXBC.a(IIIZ)V")
	public final void method183(int arg0, int arg1, boolean arg2) {
		if (field532 != -1 && HZCWGKOF.field712[field532].field725 == 1) {
			field532 = -1;
		}

		if (!arg2) {
			int var4 = arg1 - field544[0];
			int var5 = arg0 - field545[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (field543 < 9) {
					field543++;
				}

				for (int var6 = field543; var6 > 0; var6--) {
					field544[var6] = field544[var6 - 1];
					field545[var6] = field545[var6 - 1];
					field517[var6] = field517[var6 - 1];
				}

				field544[0] = arg1;
				field545[0] = arg0;
				field517[0] = false;
				return;
			}
		}

		field543 = 0;
		field512 = 0;
		field556 = 0;
		field544[0] = arg1;
		field545[0] = arg0;
		field514 = field544[0] * 128 + field540 * 64;
		field515 = field545[0] * 128 + field540 * 64;
	}
}
