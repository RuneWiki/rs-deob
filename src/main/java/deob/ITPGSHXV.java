package deob;

@ObfuscatedName("ITPGSHXV")
public class ITPGSHXV extends LDWABQSV {

	@ObfuscatedName("ITPGSHXV.n")
	public int[] field695 = new int[4];

	@ObfuscatedName("ITPGSHXV.o")
	public int[] field696 = new int[4];

	@ObfuscatedName("ITPGSHXV.p")
	public int[] field697 = new int[4];

	@ObfuscatedName("ITPGSHXV.s")
	public int field700 = -1;

	@ObfuscatedName("ITPGSHXV.C")
	public int field709 = 200;

	@ObfuscatedName("ITPGSHXV.D")
	public int field710 = 100;

	@ObfuscatedName("ITPGSHXV.E")
	public int field711 = -1;

	@ObfuscatedName("ITPGSHXV.F")
	public int field712 = -1;

	@ObfuscatedName("ITPGSHXV.J")
	public boolean[] field716 = new boolean[10];

	@ObfuscatedName("ITPGSHXV.K")
	public boolean field717 = false;

	@ObfuscatedName("ITPGSHXV.L")
	public int field718 = -1000;

	@ObfuscatedName("ITPGSHXV.O")
	public int field721 = -1;

	@ObfuscatedName("ITPGSHXV.T")
	public int field726 = -1;

	@ObfuscatedName("ITPGSHXV.U")
	public int field727 = -1;

	@ObfuscatedName("ITPGSHXV.db")
	public int field736 = -1;

	@ObfuscatedName("ITPGSHXV.ib")
	public int field741 = -1;

	@ObfuscatedName("ITPGSHXV.jb")
	public int field742 = -1;

	@ObfuscatedName("ITPGSHXV.kb")
	public int field743 = -1;

	@ObfuscatedName("ITPGSHXV.lb")
	public int field744 = -1;

	@ObfuscatedName("ITPGSHXV.mb")
	public int field745 = 32;

	@ObfuscatedName("ITPGSHXV.nb")
	public int[] field746 = new int[10];

	@ObfuscatedName("ITPGSHXV.ob")
	public int[] field747 = new int[10];

	@ObfuscatedName("ITPGSHXV.qb")
	public int field749 = 1;

	@ObfuscatedName("ITPGSHXV.r")
	public int field699;

	@ObfuscatedName("ITPGSHXV.t")
	public int field701;

	@ObfuscatedName("ITPGSHXV.u")
	public int field702;

	@ObfuscatedName("ITPGSHXV.v")
	public int field703;

	@ObfuscatedName("ITPGSHXV.w")
	public int field704;

	@ObfuscatedName("ITPGSHXV.y")
	public int field705;

	@ObfuscatedName("ITPGSHXV.z")
	public int field706;

	@ObfuscatedName("ITPGSHXV.A")
	public int field707;

	@ObfuscatedName("ITPGSHXV.B")
	public int field708;

	@ObfuscatedName("ITPGSHXV.G")
	public int field713;

	@ObfuscatedName("ITPGSHXV.H")
	public int field714;

	@ObfuscatedName("ITPGSHXV.I")
	public int field715;

	@ObfuscatedName("ITPGSHXV.M")
	public int field719;

	@ObfuscatedName("ITPGSHXV.N")
	public int field720;

	@ObfuscatedName("ITPGSHXV.P")
	public int field722;

	@ObfuscatedName("ITPGSHXV.Q")
	public int field723;

	@ObfuscatedName("ITPGSHXV.R")
	public int field724;

	@ObfuscatedName("ITPGSHXV.S")
	public int field725;

	@ObfuscatedName("ITPGSHXV.V")
	public int field728;

	@ObfuscatedName("ITPGSHXV.W")
	public int field729;

	@ObfuscatedName("ITPGSHXV.X")
	public int field730;

	@ObfuscatedName("ITPGSHXV.Y")
	public int field731;

	@ObfuscatedName("ITPGSHXV.Z")
	public int field732;

	@ObfuscatedName("ITPGSHXV.ab")
	public int field733;

	@ObfuscatedName("ITPGSHXV.bb")
	public int field734;

	@ObfuscatedName("ITPGSHXV.cb")
	public int field735;

	@ObfuscatedName("ITPGSHXV.eb")
	public int field737;

	@ObfuscatedName("ITPGSHXV.fb")
	public int field738;

	@ObfuscatedName("ITPGSHXV.gb")
	public int field739;

	@ObfuscatedName("ITPGSHXV.hb")
	public int field740;

	@ObfuscatedName("ITPGSHXV.pb")
	public int field748;

	@ObfuscatedName("ITPGSHXV.q")
	public String field698;

	@ObfuscatedName("ITPGSHXV.b(I)Z")
	public boolean method241() {
		return false;
	}

	@ObfuscatedName("ITPGSHXV.a(IZZI)V")
	public final void method245(int arg0, boolean arg1, int arg2) {
		if (field700 != -1 && TLXFHCOO.field1242[field700].field1255 == 1) {
			field700 = -1;
		}

		if (!arg1) {
			int var4 = arg2 - field746[0];
			int var5 = arg0 - field747[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (field715 < 9) {
					field715++;
				}

				for (int var6 = field715; var6 > 0; var6--) {
					field746[var6] = field746[var6 - 1];
					field747[var6] = field747[var6 - 1];
					field716[var6] = field716[var6 - 1];
				}

				field746[0] = arg2;
				field747[0] = arg0;
				field716[0] = false;
				return;
			}
		}

		field715 = 0;
		field748 = 0;
		field723 = 0;
		field746[0] = arg2;
		field747[0] = arg0;
		field706 = field746[0] * 128 + field749 * 64;
		field707 = field747[0] * 128 + field749 * 64;
	}

	@ObfuscatedName("ITPGSHXV.a(B)V")
	public final void method246() {
		field715 = 0;
		field748 = 0;
	}

	@ObfuscatedName("ITPGSHXV.a(IZI)V")
	public final void method247(int arg0, boolean arg1) {
		int var3 = field746[0];
		int var4 = field747[0];
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

		if (field700 != -1 && TLXFHCOO.field1242[field700].field1255 == 1) {
			field700 = -1;
		}

		if (field715 < 9) {
			field715++;
		}

		for (int var5 = field715; var5 > 0; var5--) {
			field746[var5] = field746[var5 - 1];
			field747[var5] = field747[var5 - 1];
			field716[var5] = field716[var5 - 1];
		}

		field746[0] = var3;
		field747[0] = var4;
		field716[0] = arg1;
	}

	@ObfuscatedName("ITPGSHXV.a(IIII)V")
	public final void method248(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 4; var4++) {
			if (field697[var4] <= arg1) {
				field695[var4] = arg0;
				field696[var4] = arg2;
				field697[var4] = arg1 + 70;
				return;
			}
		}
	}
}
