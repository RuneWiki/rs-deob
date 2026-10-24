package deob;

@ObfuscatedName("FSZDVUBI")
public abstract class FSZDVUBI extends QLYZESGB {

	@ObfuscatedName("FSZDVUBI.n")
	public int field569 = 1;

	@ObfuscatedName("FSZDVUBI.o")
	public int field570 = -1;

	@ObfuscatedName("FSZDVUBI.p")
	public int field571 = -1;

	@ObfuscatedName("FSZDVUBI.q")
	public int field572 = -1;

	@ObfuscatedName("FSZDVUBI.r")
	public int field573 = -1;

	@ObfuscatedName("FSZDVUBI.A")
	public boolean field582 = false;

	@ObfuscatedName("FSZDVUBI.B")
	public int field583 = -1;

	@ObfuscatedName("FSZDVUBI.C")
	public int field584 = -1;

	@ObfuscatedName("FSZDVUBI.D")
	public int field585 = -1;

	@ObfuscatedName("FSZDVUBI.I")
	public int[] field590 = new int[10];

	@ObfuscatedName("FSZDVUBI.J")
	public int[] field591 = new int[10];

	@ObfuscatedName("FSZDVUBI.O")
	public int field596 = 100;

	@ObfuscatedName("FSZDVUBI.R")
	public int field599 = 200;

	@ObfuscatedName("FSZDVUBI.X")
	public int field604 = -1;

	@ObfuscatedName("FSZDVUBI.Y")
	public boolean[] field605 = new boolean[10];

	@ObfuscatedName("FSZDVUBI.Z")
	public int[] field606 = new int[4];

	@ObfuscatedName("FSZDVUBI.ab")
	public int[] field607 = new int[4];

	@ObfuscatedName("FSZDVUBI.bb")
	public int[] field608 = new int[4];

	@ObfuscatedName("FSZDVUBI.cb")
	public int field609 = -1;

	@ObfuscatedName("FSZDVUBI.fb")
	public int field612 = 32;

	@ObfuscatedName("FSZDVUBI.gb")
	public int field613 = -1;

	@ObfuscatedName("FSZDVUBI.hb")
	public int field614 = -1;

	@ObfuscatedName("FSZDVUBI.mb")
	public int field619 = -1000;

	@ObfuscatedName("FSZDVUBI.s")
	public int field574;

	@ObfuscatedName("FSZDVUBI.t")
	public int field575;

	@ObfuscatedName("FSZDVUBI.u")
	public int field576;

	@ObfuscatedName("FSZDVUBI.v")
	public int field577;

	@ObfuscatedName("FSZDVUBI.w")
	public int field578;

	@ObfuscatedName("FSZDVUBI.x")
	public int field579;

	@ObfuscatedName("FSZDVUBI.y")
	public int field580;

	@ObfuscatedName("FSZDVUBI.z")
	public int field581;

	@ObfuscatedName("FSZDVUBI.E")
	public int field586;

	@ObfuscatedName("FSZDVUBI.F")
	public int field587;

	@ObfuscatedName("FSZDVUBI.G")
	public int field588;

	@ObfuscatedName("FSZDVUBI.H")
	public int field589;

	@ObfuscatedName("FSZDVUBI.K")
	public int field592;

	@ObfuscatedName("FSZDVUBI.L")
	public int field593;

	@ObfuscatedName("FSZDVUBI.M")
	public int field594;

	@ObfuscatedName("FSZDVUBI.N")
	public int field595;

	@ObfuscatedName("FSZDVUBI.P")
	public int field597;

	@ObfuscatedName("FSZDVUBI.Q")
	public int field598;

	@ObfuscatedName("FSZDVUBI.S")
	public int field600;

	@ObfuscatedName("FSZDVUBI.T")
	public int field601;

	@ObfuscatedName("FSZDVUBI.U")
	public int field602;

	@ObfuscatedName("FSZDVUBI.W")
	public int field603;

	@ObfuscatedName("FSZDVUBI.db")
	public int field610;

	@ObfuscatedName("FSZDVUBI.eb")
	public int field611;

	@ObfuscatedName("FSZDVUBI.ib")
	public int field615;

	@ObfuscatedName("FSZDVUBI.jb")
	public int field616;

	@ObfuscatedName("FSZDVUBI.kb")
	public int field617;

	@ObfuscatedName("FSZDVUBI.lb")
	public int field618;

	@ObfuscatedName("FSZDVUBI.nb")
	public int field620;

	@ObfuscatedName("FSZDVUBI.ob")
	public int field621;

	@ObfuscatedName("FSZDVUBI.qb")
	public int field623;

	@ObfuscatedName("FSZDVUBI.pb")
	public String field622;

	@ObfuscatedName("FSZDVUBI.a(IZI)V")
	public final void method305(boolean arg0, int arg1) {
		int var3 = field590[0];
		int var4 = field591[0];
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

		if (field585 != -1 && JZQVOFSF.field757[field585].field770 == 1) {
			field585 = -1;
		}

		if (field592 < 9) {
			field592++;
		}

		for (int var5 = field592; var5 > 0; var5--) {
			field590[var5] = field590[var5 - 1];
			field591[var5] = field591[var5 - 1];
			field605[var5] = field605[var5 - 1];
		}

		field590[0] = var3;
		field591[0] = var4;
		field605[0] = arg0;
	}

	@ObfuscatedName("FSZDVUBI.b(B)V")
	public final void method306() {
		field592 = 0;
		field597 = 0;
	}

	@ObfuscatedName("FSZDVUBI.a(I)Z")
	public boolean method307() {
		return false;
	}

	@ObfuscatedName("FSZDVUBI.a(IIZI)V")
	public final void method308(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 4; var4++) {
			if (field608[var4] <= arg2) {
				field606[var4] = arg1;
				field607[var4] = arg0;
				field608[var4] = arg2 + 70;
				return;
			}
		}
	}

	@ObfuscatedName("FSZDVUBI.a(IIIZ)V")
	public final void method309(int arg0, int arg1, boolean arg2) {
		if (field585 != -1 && JZQVOFSF.field757[field585].field770 == 1) {
			field585 = -1;
		}

		if (!arg2) {
			int var4 = arg0 - field590[0];
			int var5 = arg1 - field591[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (field592 < 9) {
					field592++;
				}

				for (int var6 = field592; var6 > 0; var6--) {
					field590[var6] = field590[var6 - 1];
					field591[var6] = field591[var6 - 1];
					field605[var6] = field605[var6 - 1];
				}

				field590[0] = arg0;
				field591[0] = arg1;
				field605[0] = false;
				return;
			}
		}

		field592 = 0;
		field597 = 0;
		field581 = 0;
		field590[0] = arg0;
		field591[0] = arg1;
		field593 = field590[0] * 128 + field569 * 64;
		field594 = field591[0] * 128 + field569 * 64;
	}
}
