package deob;

@ObfuscatedName("JFHWDRLM")
public abstract class JFHWDRLM extends HTDIJKWW {

	@ObfuscatedName("JFHWDRLM.k")
	public int field683 = 100;

	@ObfuscatedName("JFHWDRLM.l")
	public boolean[] field684 = new boolean[10];

	@ObfuscatedName("JFHWDRLM.p")
	public int field688 = -1;

	@ObfuscatedName("JFHWDRLM.r")
	public int[] field690 = new int[4];

	@ObfuscatedName("JFHWDRLM.s")
	public int[] field691 = new int[4];

	@ObfuscatedName("JFHWDRLM.t")
	public int[] field692 = new int[4];

	@ObfuscatedName("JFHWDRLM.u")
	public int field693 = -1;

	@ObfuscatedName("JFHWDRLM.v")
	public int field694 = -1;

	@ObfuscatedName("JFHWDRLM.w")
	public int field695 = 200;

	@ObfuscatedName("JFHWDRLM.G")
	public int field705 = -1;

	@ObfuscatedName("JFHWDRLM.H")
	public boolean field706 = false;

	@ObfuscatedName("JFHWDRLM.J")
	public int field708 = 32;

	@ObfuscatedName("JFHWDRLM.K")
	public int field709 = -1000;

	@ObfuscatedName("JFHWDRLM.O")
	public int field713 = -1;

	@ObfuscatedName("JFHWDRLM.T")
	public int field717 = -1;

	@ObfuscatedName("JFHWDRLM.Y")
	public int field722 = -1;

	@ObfuscatedName("JFHWDRLM.db")
	public int field727 = -1;

	@ObfuscatedName("JFHWDRLM.eb")
	public int field728 = -1;

	@ObfuscatedName("JFHWDRLM.fb")
	public int field729 = -1;

	@ObfuscatedName("JFHWDRLM.gb")
	public int field730 = -1;

	@ObfuscatedName("JFHWDRLM.hb")
	public int[] field731 = new int[10];

	@ObfuscatedName("JFHWDRLM.ib")
	public int[] field732 = new int[10];

	@ObfuscatedName("JFHWDRLM.nb")
	public int field737 = 1;

	@ObfuscatedName("JFHWDRLM.m")
	public int field685;

	@ObfuscatedName("JFHWDRLM.n")
	public int field686;

	@ObfuscatedName("JFHWDRLM.o")
	public int field687;

	@ObfuscatedName("JFHWDRLM.q")
	public int field689;

	@ObfuscatedName("JFHWDRLM.x")
	public int field696;

	@ObfuscatedName("JFHWDRLM.y")
	public int field697;

	@ObfuscatedName("JFHWDRLM.z")
	public int field698;

	@ObfuscatedName("JFHWDRLM.A")
	public int field699;

	@ObfuscatedName("JFHWDRLM.B")
	public int field700;

	@ObfuscatedName("JFHWDRLM.C")
	public int field701;

	@ObfuscatedName("JFHWDRLM.D")
	public int field702;

	@ObfuscatedName("JFHWDRLM.E")
	public int field703;

	@ObfuscatedName("JFHWDRLM.F")
	public int field704;

	@ObfuscatedName("JFHWDRLM.L")
	public int field710;

	@ObfuscatedName("JFHWDRLM.M")
	public int field711;

	@ObfuscatedName("JFHWDRLM.N")
	public int field712;

	@ObfuscatedName("JFHWDRLM.P")
	public int field714;

	@ObfuscatedName("JFHWDRLM.Q")
	public int field715;

	@ObfuscatedName("JFHWDRLM.S")
	public int field716;

	@ObfuscatedName("JFHWDRLM.U")
	public int field718;

	@ObfuscatedName("JFHWDRLM.V")
	public int field719;

	@ObfuscatedName("JFHWDRLM.W")
	public int field720;

	@ObfuscatedName("JFHWDRLM.X")
	public int field721;

	@ObfuscatedName("JFHWDRLM.Z")
	public int field723;

	@ObfuscatedName("JFHWDRLM.ab")
	public int field724;

	@ObfuscatedName("JFHWDRLM.bb")
	public int field725;

	@ObfuscatedName("JFHWDRLM.cb")
	public int field726;

	@ObfuscatedName("JFHWDRLM.jb")
	public int field733;

	@ObfuscatedName("JFHWDRLM.kb")
	public int field734;

	@ObfuscatedName("JFHWDRLM.lb")
	public int field735;

	@ObfuscatedName("JFHWDRLM.mb")
	public int field736;

	@ObfuscatedName("JFHWDRLM.I")
	public String field707;

	@ObfuscatedName("JFHWDRLM.a(IZI)V")
	public final void method226(boolean arg0, int arg1) {
		int var3 = field731[0];
		int var4 = field732[0];
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

		if (field717 != -1 && LMDSPIVT.field867[field717].field880 == 1) {
			field717 = -1;
		}

		if (field716 < 9) {
			field716++;
		}

		for (int var5 = field716; var5 > 0; var5--) {
			field731[var5] = field731[var5 - 1];
			field732[var5] = field732[var5 - 1];
			field684[var5] = field684[var5 - 1];
		}

		field731[0] = var3;
		field732[0] = var4;
		field684[0] = arg0;
	}

	@ObfuscatedName("JFHWDRLM.a(Z)Z")
	public boolean method188() {
		return false;
	}

	@ObfuscatedName("JFHWDRLM.a(ZIZI)V")
	public final void method227(boolean arg0, int arg1, int arg2) {
		if (field717 != -1 && LMDSPIVT.field867[field717].field880 == 1) {
			field717 = -1;
		}

		if (!arg0) {
			int var4 = arg1 - field731[0];
			int var5 = arg2 - field732[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (field716 < 9) {
					field716++;
				}

				for (int var6 = field716; var6 > 0; var6--) {
					field731[var6] = field731[var6 - 1];
					field732[var6] = field732[var6 - 1];
					field684[var6] = field684[var6 - 1];
				}

				field731[0] = arg1;
				field732[0] = arg2;
				field684[0] = false;
				return;
			}
		}

		field716 = 0;
		field704 = 0;
		field703 = 0;
		field731[0] = arg1;
		field732[0] = arg2;
		field734 = field731[0] * 128 + field737 * 64;
		field735 = field732[0] * 128 + field737 * 64;
	}

	@ObfuscatedName("JFHWDRLM.b(I)V")
	public final void method228() {
		field716 = 0;
		field704 = 0;
	}

	@ObfuscatedName("JFHWDRLM.a(IIII)V")
	public final void method229(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 4; var4++) {
			if (field692[var4] <= arg1) {
				field690[var4] = arg0;
				field691[var4] = arg2;
				field692[var4] = arg1 + 70;
				return;
			}
		}
	}
}
