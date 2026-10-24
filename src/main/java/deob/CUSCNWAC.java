package deob;

@ObfuscatedName("CUSCNWAC")
public abstract class CUSCNWAC extends UCNHLGIK {

	@ObfuscatedName("CUSCNWAC.m")
	public int[] field575 = new int[4];

	@ObfuscatedName("CUSCNWAC.n")
	public int[] field576 = new int[4];

	@ObfuscatedName("CUSCNWAC.o")
	public int[] field577 = new int[4];

	@ObfuscatedName("CUSCNWAC.p")
	public int field578 = -1;

	@ObfuscatedName("CUSCNWAC.z")
	public int[] field588 = new int[10];

	@ObfuscatedName("CUSCNWAC.A")
	public int[] field589 = new int[10];

	@ObfuscatedName("CUSCNWAC.B")
	public int field590 = -1;

	@ObfuscatedName("CUSCNWAC.C")
	public int field591 = -1;

	@ObfuscatedName("CUSCNWAC.D")
	public int field592 = -1;

	@ObfuscatedName("CUSCNWAC.E")
	public int field593 = -1;

	@ObfuscatedName("CUSCNWAC.F")
	public int field594 = -1000;

	@ObfuscatedName("CUSCNWAC.R")
	public int field606 = 1;

	@ObfuscatedName("CUSCNWAC.S")
	public boolean field607 = false;

	@ObfuscatedName("CUSCNWAC.V")
	public int field609 = -1;

	@ObfuscatedName("CUSCNWAC.bb")
	public boolean[] field614 = new boolean[10];

	@ObfuscatedName("CUSCNWAC.cb")
	public int field615 = -1;

	@ObfuscatedName("CUSCNWAC.fb")
	public int field618 = -1;

	@ObfuscatedName("CUSCNWAC.gb")
	public int field619 = 32;

	@ObfuscatedName("CUSCNWAC.hb")
	public int field620 = -1;

	@ObfuscatedName("CUSCNWAC.ib")
	public int field621 = -1;

	@ObfuscatedName("CUSCNWAC.kb")
	public int field623 = -1;

	@ObfuscatedName("CUSCNWAC.pb")
	public int field628 = 200;

	@ObfuscatedName("CUSCNWAC.rb")
	public int field629 = 100;

	@ObfuscatedName("CUSCNWAC.q")
	public int field579;

	@ObfuscatedName("CUSCNWAC.r")
	public int field580;

	@ObfuscatedName("CUSCNWAC.s")
	public int field581;

	@ObfuscatedName("CUSCNWAC.t")
	public int field582;

	@ObfuscatedName("CUSCNWAC.u")
	public int field583;

	@ObfuscatedName("CUSCNWAC.v")
	public int field584;

	@ObfuscatedName("CUSCNWAC.w")
	public int field585;

	@ObfuscatedName("CUSCNWAC.x")
	public int field586;

	@ObfuscatedName("CUSCNWAC.y")
	public int field587;

	@ObfuscatedName("CUSCNWAC.G")
	public int field595;

	@ObfuscatedName("CUSCNWAC.H")
	public int field596;

	@ObfuscatedName("CUSCNWAC.I")
	public int field597;

	@ObfuscatedName("CUSCNWAC.J")
	public int field598;

	@ObfuscatedName("CUSCNWAC.K")
	public int field599;

	@ObfuscatedName("CUSCNWAC.L")
	public int field600;

	@ObfuscatedName("CUSCNWAC.M")
	public int field601;

	@ObfuscatedName("CUSCNWAC.N")
	public int field602;

	@ObfuscatedName("CUSCNWAC.O")
	public int field603;

	@ObfuscatedName("CUSCNWAC.P")
	public int field604;

	@ObfuscatedName("CUSCNWAC.Q")
	public int field605;

	@ObfuscatedName("CUSCNWAC.T")
	public int field608;

	@ObfuscatedName("CUSCNWAC.W")
	public int field610;

	@ObfuscatedName("CUSCNWAC.X")
	public int field611;

	@ObfuscatedName("CUSCNWAC.Y")
	public int field612;

	@ObfuscatedName("CUSCNWAC.Z")
	public int field613;

	@ObfuscatedName("CUSCNWAC.db")
	public int field616;

	@ObfuscatedName("CUSCNWAC.eb")
	public int field617;

	@ObfuscatedName("CUSCNWAC.lb")
	public int field624;

	@ObfuscatedName("CUSCNWAC.mb")
	public int field625;

	@ObfuscatedName("CUSCNWAC.nb")
	public int field626;

	@ObfuscatedName("CUSCNWAC.ob")
	public int field627;

	@ObfuscatedName("CUSCNWAC.jb")
	public String field622;

	@ObfuscatedName("CUSCNWAC.a(B)V")
	public final void method193() {
		field583 = 0;
		field617 = 0;
	}

	@ObfuscatedName("CUSCNWAC.a(IIII)V")
	public final void method194(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 4; var4++) {
			if (field577[var4] <= arg0) {
				field575[var4] = arg2;
				field576[var4] = arg1;
				field577[var4] = arg0 + 70;
				return;
			}
		}
	}

	@ObfuscatedName("CUSCNWAC.b(I)Z")
	public boolean method40() {
		return false;
	}

	@ObfuscatedName("CUSCNWAC.a(ZIZI)V")
	public final void method195(boolean arg0, int arg1, int arg2) {
		if (field609 != -1 && DVIZXFSW.field636[field609].field649 == 1) {
			field609 = -1;
		}

		if (!arg0) {
			int var4 = arg2 - field588[0];
			int var5 = arg1 - field589[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (field583 < 9) {
					field583++;
				}

				for (int var6 = field583; var6 > 0; var6--) {
					field588[var6] = field588[var6 - 1];
					field589[var6] = field589[var6 - 1];
					field614[var6] = field614[var6 - 1];
				}

				field588[0] = arg2;
				field589[0] = arg1;
				field614[0] = false;
				return;
			}
		}

		field583 = 0;
		field617 = 0;
		field605 = 0;
		field588[0] = arg2;
		field589[0] = arg1;
		field584 = field588[0] * 128 + field606 * 64;
		field585 = field589[0] * 128 + field606 * 64;
	}

	@ObfuscatedName("CUSCNWAC.a(ZZI)V")
	public final void method196(boolean arg0, int arg1) {
		int var3 = field588[0];
		int var4 = field589[0];
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

		if (field609 != -1 && DVIZXFSW.field636[field609].field649 == 1) {
			field609 = -1;
		}

		if (field583 < 9) {
			field583++;
		}

		for (int var5 = field583; var5 > 0; var5--) {
			field588[var5] = field588[var5 - 1];
			field589[var5] = field589[var5 - 1];
			field614[var5] = field614[var5 - 1];
		}

		field588[0] = var3;
		field589[0] = var4;
		field614[0] = arg0;
	}
}
