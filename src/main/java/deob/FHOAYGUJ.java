package deob;

@ObfuscatedName("FHOAYGUJ")
public abstract class FHOAYGUJ extends GLSQHJVO {

	@ObfuscatedName("FHOAYGUJ.m")
	public int field577 = -1;

	@ObfuscatedName("FHOAYGUJ.w")
	public int field587 = 1;

	@ObfuscatedName("FHOAYGUJ.y")
	public int field589 = 200;

	@ObfuscatedName("FHOAYGUJ.z")
	public int[] field590 = new int[10];

	@ObfuscatedName("FHOAYGUJ.A")
	public int[] field591 = new int[10];

	@ObfuscatedName("FHOAYGUJ.B")
	public int field592 = -1;

	@ObfuscatedName("FHOAYGUJ.C")
	public int field593 = -1;

	@ObfuscatedName("FHOAYGUJ.D")
	public int field594 = -1;

	@ObfuscatedName("FHOAYGUJ.E")
	public int field595 = -1;

	@ObfuscatedName("FHOAYGUJ.F")
	public int field596 = -1;

	@ObfuscatedName("FHOAYGUJ.G")
	public int field597 = -1;

	@ObfuscatedName("FHOAYGUJ.H")
	public int[] field598 = new int[4];

	@ObfuscatedName("FHOAYGUJ.I")
	public int[] field599 = new int[4];

	@ObfuscatedName("FHOAYGUJ.J")
	public int[] field600 = new int[4];

	@ObfuscatedName("FHOAYGUJ.L")
	public int field602 = -1;

	@ObfuscatedName("FHOAYGUJ.Q")
	public boolean field607 = false;

	@ObfuscatedName("FHOAYGUJ.U")
	public int field611 = 32;

	@ObfuscatedName("FHOAYGUJ.V")
	public int field612 = -1000;

	@ObfuscatedName("FHOAYGUJ.cb")
	public int field619 = -1;

	@ObfuscatedName("FHOAYGUJ.ib")
	public int field625 = -1;

	@ObfuscatedName("FHOAYGUJ.jb")
	public int field626 = -1;

	@ObfuscatedName("FHOAYGUJ.kb")
	public boolean[] field627 = new boolean[10];

	@ObfuscatedName("FHOAYGUJ.mb")
	public int field629 = 100;

	@ObfuscatedName("FHOAYGUJ.k")
	public int field575;

	@ObfuscatedName("FHOAYGUJ.l")
	public int field576;

	@ObfuscatedName("FHOAYGUJ.n")
	public int field578;

	@ObfuscatedName("FHOAYGUJ.o")
	public int field579;

	@ObfuscatedName("FHOAYGUJ.p")
	public int field580;

	@ObfuscatedName("FHOAYGUJ.q")
	public int field581;

	@ObfuscatedName("FHOAYGUJ.r")
	public int field582;

	@ObfuscatedName("FHOAYGUJ.s")
	public int field583;

	@ObfuscatedName("FHOAYGUJ.t")
	public int field584;

	@ObfuscatedName("FHOAYGUJ.u")
	public int field585;

	@ObfuscatedName("FHOAYGUJ.v")
	public int field586;

	@ObfuscatedName("FHOAYGUJ.x")
	public int field588;

	@ObfuscatedName("FHOAYGUJ.K")
	public int field601;

	@ObfuscatedName("FHOAYGUJ.M")
	public int field603;

	@ObfuscatedName("FHOAYGUJ.N")
	public int field604;

	@ObfuscatedName("FHOAYGUJ.O")
	public int field605;

	@ObfuscatedName("FHOAYGUJ.P")
	public int field606;

	@ObfuscatedName("FHOAYGUJ.R")
	public int field608;

	@ObfuscatedName("FHOAYGUJ.S")
	public int field609;

	@ObfuscatedName("FHOAYGUJ.T")
	public int field610;

	@ObfuscatedName("FHOAYGUJ.W")
	public int field613;

	@ObfuscatedName("FHOAYGUJ.X")
	public int field614;

	@ObfuscatedName("FHOAYGUJ.Y")
	public int field615;

	@ObfuscatedName("FHOAYGUJ.Z")
	public int field616;

	@ObfuscatedName("FHOAYGUJ.ab")
	public int field617;

	@ObfuscatedName("FHOAYGUJ.bb")
	public int field618;

	@ObfuscatedName("FHOAYGUJ.db")
	public int field620;

	@ObfuscatedName("FHOAYGUJ.eb")
	public int field621;

	@ObfuscatedName("FHOAYGUJ.fb")
	public int field622;

	@ObfuscatedName("FHOAYGUJ.gb")
	public int field623;

	@ObfuscatedName("FHOAYGUJ.hb")
	public int field624;

	@ObfuscatedName("FHOAYGUJ.lb")
	public String field628;

	@ObfuscatedName("FHOAYGUJ.a(B)V")
	public final void method203() {
		field624 = 0;
		field601 = 0;
	}

	@ObfuscatedName("FHOAYGUJ.a(IZIZ)V")
	public final void method204(int arg0, boolean arg1, int arg2) {
		if (field602 != -1 && QBINVEVU.field1165[field602].field1178 == 1) {
			field602 = -1;
		}

		if (!arg1) {
			int var4 = arg2 - field590[0];
			int var5 = arg0 - field591[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (field624 < 9) {
					field624++;
				}

				for (int var6 = field624; var6 > 0; var6--) {
					field590[var6] = field590[var6 - 1];
					field591[var6] = field591[var6 - 1];
					field627[var6] = field627[var6 - 1];
				}

				field590[0] = arg2;
				field591[0] = arg0;
				field627[0] = false;
				return;
			}
		}

		field624 = 0;
		field601 = 0;
		field575 = 0;
		field590[0] = arg2;
		field591[0] = arg0;
		field615 = field590[0] * 128 + field587 * 64;
		field616 = field591[0] * 128 + field587 * 64;
	}

	@ObfuscatedName("FHOAYGUJ.a(IIII)V")
	public final void method205(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 4; var4++) {
			if (field600[var4] <= arg0) {
				field598[var4] = arg2;
				field599[var4] = arg1;
				field600[var4] = arg0 + 70;
				return;
			}
		}
	}

	@ObfuscatedName("FHOAYGUJ.b(I)Z")
	public boolean method166() {
		return false;
	}

	@ObfuscatedName("FHOAYGUJ.a(BIZ)V")
	public final void method206(int arg0, boolean arg1) {
		int var3 = field590[0];
		int var4 = field591[0];
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

		if (field602 != -1 && QBINVEVU.field1165[field602].field1178 == 1) {
			field602 = -1;
		}

		if (field624 < 9) {
			field624++;
		}

		for (int var5 = field624; var5 > 0; var5--) {
			field590[var5] = field590[var5 - 1];
			field591[var5] = field591[var5 - 1];
			field627[var5] = field627[var5 - 1];
		}

		field590[0] = var3;
		field591[0] = var4;
		field627[0] = arg1;
	}
}
