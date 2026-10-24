package deob;

@ObfuscatedName("EGCNSKZO")
public abstract class EGCNSKZO extends WWTUXVKR {

	@ObfuscatedName("EGCNSKZO.v")
	public int field615 = -1;

	@ObfuscatedName("EGCNSKZO.z")
	public int field619 = 1;

	@ObfuscatedName("EGCNSKZO.A")
	public int field620 = 32;

	@ObfuscatedName("EGCNSKZO.C")
	public int field622 = -1;

	@ObfuscatedName("EGCNSKZO.H")
	public boolean field627 = false;

	@ObfuscatedName("EGCNSKZO.N")
	public boolean[] field633 = new boolean[10];

	@ObfuscatedName("EGCNSKZO.O")
	public int field634 = -1;

	@ObfuscatedName("EGCNSKZO.P")
	public int field635 = 100;

	@ObfuscatedName("EGCNSKZO.Q")
	public int field636 = -1;

	@ObfuscatedName("EGCNSKZO.R")
	public int field637 = -1;

	@ObfuscatedName("EGCNSKZO.S")
	public int field638 = -1;

	@ObfuscatedName("EGCNSKZO.T")
	public int field639 = -1;

	@ObfuscatedName("EGCNSKZO.U")
	public int field640 = 200;

	@ObfuscatedName("EGCNSKZO.X")
	public int[] field642 = new int[4];

	@ObfuscatedName("EGCNSKZO.Y")
	public int[] field643 = new int[4];

	@ObfuscatedName("EGCNSKZO.Z")
	public int[] field644 = new int[4];

	@ObfuscatedName("EGCNSKZO.ab")
	public int field645 = -1;

	@ObfuscatedName("EGCNSKZO.gb")
	public int field651 = -1;

	@ObfuscatedName("EGCNSKZO.ib")
	public int field653 = -1000;

	@ObfuscatedName("EGCNSKZO.lb")
	public int field656 = -1;

	@ObfuscatedName("EGCNSKZO.mb")
	public int field657 = -1;

	@ObfuscatedName("EGCNSKZO.nb")
	public int[] field658 = new int[10];

	@ObfuscatedName("EGCNSKZO.ob")
	public int[] field659 = new int[10];

	@ObfuscatedName("EGCNSKZO.m")
	public int field606;

	@ObfuscatedName("EGCNSKZO.n")
	public int field607;

	@ObfuscatedName("EGCNSKZO.o")
	public int field608;

	@ObfuscatedName("EGCNSKZO.p")
	public int field609;

	@ObfuscatedName("EGCNSKZO.q")
	public int field610;

	@ObfuscatedName("EGCNSKZO.r")
	public int field611;

	@ObfuscatedName("EGCNSKZO.s")
	public int field612;

	@ObfuscatedName("EGCNSKZO.t")
	public int field613;

	@ObfuscatedName("EGCNSKZO.u")
	public int field614;

	@ObfuscatedName("EGCNSKZO.w")
	public int field616;

	@ObfuscatedName("EGCNSKZO.x")
	public int field617;

	@ObfuscatedName("EGCNSKZO.y")
	public int field618;

	@ObfuscatedName("EGCNSKZO.B")
	public int field621;

	@ObfuscatedName("EGCNSKZO.D")
	public int field623;

	@ObfuscatedName("EGCNSKZO.E")
	public int field624;

	@ObfuscatedName("EGCNSKZO.F")
	public int field625;

	@ObfuscatedName("EGCNSKZO.G")
	public int field626;

	@ObfuscatedName("EGCNSKZO.I")
	public int field628;

	@ObfuscatedName("EGCNSKZO.J")
	public int field629;

	@ObfuscatedName("EGCNSKZO.K")
	public int field630;

	@ObfuscatedName("EGCNSKZO.L")
	public int field631;

	@ObfuscatedName("EGCNSKZO.M")
	public int field632;

	@ObfuscatedName("EGCNSKZO.V")
	public int field641;

	@ObfuscatedName("EGCNSKZO.bb")
	public int field646;

	@ObfuscatedName("EGCNSKZO.cb")
	public int field647;

	@ObfuscatedName("EGCNSKZO.db")
	public int field648;

	@ObfuscatedName("EGCNSKZO.eb")
	public int field649;

	@ObfuscatedName("EGCNSKZO.fb")
	public int field650;

	@ObfuscatedName("EGCNSKZO.jb")
	public int field654;

	@ObfuscatedName("EGCNSKZO.kb")
	public int field655;

	@ObfuscatedName("EGCNSKZO.pb")
	public int field660;

	@ObfuscatedName("EGCNSKZO.hb")
	public String field652;

	@ObfuscatedName("EGCNSKZO.b(Z)V")
	public final void method261() {
		field621 = 0;
		field641 = 0;
	}

	@ObfuscatedName("EGCNSKZO.a(ZIZI)V")
	public final void method262(boolean arg0, int arg1, int arg2) {
		if (field645 != -1 && KIZBPSHZ.field888[field645].field901 == 1) {
			field645 = -1;
		}

		if (!arg0) {
			int var4 = arg1 - field658[0];
			int var5 = arg2 - field659[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (field621 < 9) {
					field621++;
				}

				for (int var6 = field621; var6 > 0; var6--) {
					field658[var6] = field658[var6 - 1];
					field659[var6] = field659[var6 - 1];
					field633[var6] = field633[var6 - 1];
				}

				field658[0] = arg1;
				field659[0] = arg2;
				field633[0] = false;
				return;
			}
		}

		field621 = 0;
		field641 = 0;
		field631 = 0;
		field658[0] = arg1;
		field659[0] = arg2;
		field628 = field658[0] * 128 + field619 * 64;
		field629 = field659[0] * 128 + field619 * 64;
	}

	@ObfuscatedName("EGCNSKZO.a(B)Z")
	public boolean method263() {
		return false;
	}

	@ObfuscatedName("EGCNSKZO.a(IZI)V")
	public final void method264(int arg0, boolean arg1) {
		int var3 = field658[0];
		int var4 = field659[0];
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

		if (field645 != -1 && KIZBPSHZ.field888[field645].field901 == 1) {
			field645 = -1;
		}

		if (field621 < 9) {
			field621++;
		}

		for (int var5 = field621; var5 > 0; var5--) {
			field658[var5] = field658[var5 - 1];
			field659[var5] = field659[var5 - 1];
			field633[var5] = field633[var5 - 1];
		}

		field658[0] = var3;
		field659[0] = var4;
		field633[0] = arg1;
	}

	@ObfuscatedName("EGCNSKZO.a(IIII)V")
	public final void method265(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 4; var4++) {
			if (field644[var4] <= arg0) {
				field642[var4] = arg2;
				field643[var4] = arg1;
				field644[var4] = arg0 + 70;
				return;
			}
		}
	}
}
