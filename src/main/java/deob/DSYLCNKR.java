package deob;

@ObfuscatedName("DSYLCNKR")
public abstract class DSYLCNKR extends JEESRQGR {

	@ObfuscatedName("DSYLCNKR.m")
	public boolean[] field608 = new boolean[10];

	@ObfuscatedName("DSYLCNKR.o")
	public int field610 = 100;

	@ObfuscatedName("DSYLCNKR.p")
	public int field611 = -1;

	@ObfuscatedName("DSYLCNKR.u")
	public int field616 = -1000;

	@ObfuscatedName("DSYLCNKR.x")
	public int field619 = 1;

	@ObfuscatedName("DSYLCNKR.z")
	public int[] field620 = new int[4];

	@ObfuscatedName("DSYLCNKR.A")
	public int[] field621 = new int[4];

	@ObfuscatedName("DSYLCNKR.B")
	public int[] field622 = new int[4];

	@ObfuscatedName("DSYLCNKR.C")
	public int field623 = -1;

	@ObfuscatedName("DSYLCNKR.D")
	public int field624 = -1;

	@ObfuscatedName("DSYLCNKR.E")
	public int field625 = -1;

	@ObfuscatedName("DSYLCNKR.F")
	public int field626 = -1;

	@ObfuscatedName("DSYLCNKR.N")
	public boolean field634 = false;

	@ObfuscatedName("DSYLCNKR.O")
	public int[] field635 = new int[10];

	@ObfuscatedName("DSYLCNKR.P")
	public int[] field636 = new int[10];

	@ObfuscatedName("DSYLCNKR.Q")
	public int field637 = -1;

	@ObfuscatedName("DSYLCNKR.U")
	public int field640 = -1;

	@ObfuscatedName("DSYLCNKR.ab")
	public int field646 = -1;

	@ObfuscatedName("DSYLCNKR.eb")
	public int field650 = 32;

	@ObfuscatedName("DSYLCNKR.mb")
	public int field658 = -1;

	@ObfuscatedName("DSYLCNKR.nb")
	public int field659 = -1;

	@ObfuscatedName("DSYLCNKR.ob")
	public int field660 = -1;

	@ObfuscatedName("DSYLCNKR.qb")
	public int field661 = 200;

	@ObfuscatedName("DSYLCNKR.l")
	public int field607;

	@ObfuscatedName("DSYLCNKR.q")
	public int field612;

	@ObfuscatedName("DSYLCNKR.r")
	public int field613;

	@ObfuscatedName("DSYLCNKR.s")
	public int field614;

	@ObfuscatedName("DSYLCNKR.t")
	public int field615;

	@ObfuscatedName("DSYLCNKR.v")
	public int field617;

	@ObfuscatedName("DSYLCNKR.w")
	public int field618;

	@ObfuscatedName("DSYLCNKR.G")
	public int field627;

	@ObfuscatedName("DSYLCNKR.H")
	public int field628;

	@ObfuscatedName("DSYLCNKR.I")
	public int field629;

	@ObfuscatedName("DSYLCNKR.J")
	public int field630;

	@ObfuscatedName("DSYLCNKR.K")
	public int field631;

	@ObfuscatedName("DSYLCNKR.L")
	public int field632;

	@ObfuscatedName("DSYLCNKR.M")
	public int field633;

	@ObfuscatedName("DSYLCNKR.R")
	public int field638;

	@ObfuscatedName("DSYLCNKR.T")
	public int field639;

	@ObfuscatedName("DSYLCNKR.V")
	public int field641;

	@ObfuscatedName("DSYLCNKR.W")
	public int field642;

	@ObfuscatedName("DSYLCNKR.X")
	public int field643;

	@ObfuscatedName("DSYLCNKR.Y")
	public int field644;

	@ObfuscatedName("DSYLCNKR.Z")
	public int field645;

	@ObfuscatedName("DSYLCNKR.bb")
	public int field647;

	@ObfuscatedName("DSYLCNKR.cb")
	public int field648;

	@ObfuscatedName("DSYLCNKR.db")
	public int field649;

	@ObfuscatedName("DSYLCNKR.fb")
	public int field651;

	@ObfuscatedName("DSYLCNKR.gb")
	public int field652;

	@ObfuscatedName("DSYLCNKR.hb")
	public int field653;

	@ObfuscatedName("DSYLCNKR.ib")
	public int field654;

	@ObfuscatedName("DSYLCNKR.jb")
	public int field655;

	@ObfuscatedName("DSYLCNKR.kb")
	public int field656;

	@ObfuscatedName("DSYLCNKR.lb")
	public int field657;

	@ObfuscatedName("DSYLCNKR.n")
	public String field609;

	@ObfuscatedName("DSYLCNKR.a(Z)V")
	public final void method196() {
		field651 = 0;
		field638 = 0;
	}

	@ObfuscatedName("DSYLCNKR.b(I)Z")
	public boolean method192() {
		return false;
	}

	@ObfuscatedName("DSYLCNKR.a(IZI)V")
	public final void method197(int arg0, boolean arg1) {
		int var3 = field635[0];
		int var4 = field636[0];
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

		if (field611 != -1 && MJVHTYCA.field1044[field611].field1057 == 1) {
			field611 = -1;
		}

		if (field651 < 9) {
			field651++;
		}

		for (int var5 = field651; var5 > 0; var5--) {
			field635[var5] = field635[var5 - 1];
			field636[var5] = field636[var5 - 1];
			field608[var5] = field608[var5 - 1];
		}

		field635[0] = var3;
		field636[0] = var4;
		field608[0] = arg1;
	}

	@ObfuscatedName("DSYLCNKR.a(IIII)V")
	public final void method198(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 4; var4++) {
			if (field622[var4] <= arg1) {
				field620[var4] = arg2;
				field621[var4] = arg0;
				field622[var4] = arg1 + 70;
				return;
			}
		}
	}

	@ObfuscatedName("DSYLCNKR.a(ZZII)V")
	public final void method199(boolean arg0, int arg1, int arg2) {
		if (field611 != -1 && MJVHTYCA.field1044[field611].field1057 == 1) {
			field611 = -1;
		}

		if (!arg0) {
			int var4 = arg2 - field635[0];
			int var5 = arg1 - field636[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (field651 < 9) {
					field651++;
				}

				for (int var6 = field651; var6 > 0; var6--) {
					field635[var6] = field635[var6 - 1];
					field636[var6] = field636[var6 - 1];
					field608[var6] = field608[var6 - 1];
				}

				field635[0] = arg2;
				field636[0] = arg1;
				field608[0] = false;
				return;
			}
		}

		field651 = 0;
		field638 = 0;
		field649 = 0;
		field635[0] = arg2;
		field636[0] = arg1;
		field654 = field635[0] * 128 + field619 * 64;
		field655 = field636[0] * 128 + field619 * 64;
	}
}
