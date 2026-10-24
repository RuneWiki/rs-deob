package deob;

@ObfuscatedName("GSULPWKR")
public abstract class GSULPWKR extends ZHYAQRMA {

	@ObfuscatedName("GSULPWKR.l")
	public boolean field727 = false;

	@ObfuscatedName("GSULPWKR.m")
	public int field728 = 100;

	@ObfuscatedName("GSULPWKR.n")
	public int field729 = -1;

	@ObfuscatedName("GSULPWKR.q")
	public int[] field732 = new int[10];

	@ObfuscatedName("GSULPWKR.r")
	public int[] field733 = new int[10];

	@ObfuscatedName("GSULPWKR.t")
	public int field735 = -1;

	@ObfuscatedName("GSULPWKR.u")
	public int field736 = -1;

	@ObfuscatedName("GSULPWKR.L")
	public int field753 = 1;

	@ObfuscatedName("GSULPWKR.M")
	public int field754 = 200;

	@ObfuscatedName("GSULPWKR.O")
	public int field756 = -1;

	@ObfuscatedName("GSULPWKR.W")
	public int field764 = 32;

	@ObfuscatedName("GSULPWKR.X")
	public int field765 = -1;

	@ObfuscatedName("GSULPWKR.Y")
	public int field766 = -1;

	@ObfuscatedName("GSULPWKR.Z")
	public int[] field767 = new int[4];

	@ObfuscatedName("GSULPWKR.ab")
	public int[] field768 = new int[4];

	@ObfuscatedName("GSULPWKR.bb")
	public int[] field769 = new int[4];

	@ObfuscatedName("GSULPWKR.db")
	public int field770 = -1;

	@ObfuscatedName("GSULPWKR.gb")
	public int field773 = -1000;

	@ObfuscatedName("GSULPWKR.kb")
	public int field776 = -1;

	@ObfuscatedName("GSULPWKR.lb")
	public int field777 = -1;

	@ObfuscatedName("GSULPWKR.mb")
	public int field778 = -1;

	@ObfuscatedName("GSULPWKR.nb")
	public int field779 = -1;

	@ObfuscatedName("GSULPWKR.pb")
	public boolean[] field781 = new boolean[10];

	@ObfuscatedName("GSULPWKR.o")
	public int field730;

	@ObfuscatedName("GSULPWKR.p")
	public int field731;

	@ObfuscatedName("GSULPWKR.v")
	public int field737;

	@ObfuscatedName("GSULPWKR.w")
	public int field738;

	@ObfuscatedName("GSULPWKR.x")
	public int field739;

	@ObfuscatedName("GSULPWKR.y")
	public int field740;

	@ObfuscatedName("GSULPWKR.z")
	public int field741;

	@ObfuscatedName("GSULPWKR.A")
	public int field742;

	@ObfuscatedName("GSULPWKR.B")
	public int field743;

	@ObfuscatedName("GSULPWKR.C")
	public int field744;

	@ObfuscatedName("GSULPWKR.D")
	public int field745;

	@ObfuscatedName("GSULPWKR.E")
	public int field746;

	@ObfuscatedName("GSULPWKR.F")
	public int field747;

	@ObfuscatedName("GSULPWKR.G")
	public int field748;

	@ObfuscatedName("GSULPWKR.H")
	public int field749;

	@ObfuscatedName("GSULPWKR.I")
	public int field750;

	@ObfuscatedName("GSULPWKR.J")
	public int field751;

	@ObfuscatedName("GSULPWKR.K")
	public int field752;

	@ObfuscatedName("GSULPWKR.N")
	public int field755;

	@ObfuscatedName("GSULPWKR.P")
	public int field757;

	@ObfuscatedName("GSULPWKR.Q")
	public int field758;

	@ObfuscatedName("GSULPWKR.R")
	public int field759;

	@ObfuscatedName("GSULPWKR.S")
	public int field760;

	@ObfuscatedName("GSULPWKR.T")
	public int field761;

	@ObfuscatedName("GSULPWKR.U")
	public int field762;

	@ObfuscatedName("GSULPWKR.V")
	public int field763;

	@ObfuscatedName("GSULPWKR.eb")
	public int field771;

	@ObfuscatedName("GSULPWKR.fb")
	public int field772;

	@ObfuscatedName("GSULPWKR.hb")
	public int field774;

	@ObfuscatedName("GSULPWKR.ib")
	public int field775;

	@ObfuscatedName("GSULPWKR.ob")
	public int field780;

	@ObfuscatedName("GSULPWKR.s")
	public String field734;

	@ObfuscatedName("GSULPWKR.a(ZIZ)V")
	public final void method241(boolean arg0, int arg1) {
		int var3 = field732[0];
		int var4 = field733[0];
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

		if (field736 != -1 && VYCKCNXO.field1339[field736].field1352 == 1) {
			field736 = -1;
		}

		if (field762 < 9) {
			field762++;
		}

		for (int var5 = field762; var5 > 0; var5--) {
			field732[var5] = field732[var5 - 1];
			field733[var5] = field733[var5 - 1];
			field781[var5] = field781[var5 - 1];
		}

		field732[0] = var3;
		field733[0] = var4;
		field781[0] = arg0;
	}

	@ObfuscatedName("GSULPWKR.a(IIBZ)V")
	public final void method242(int arg0, int arg1, boolean arg2) {
		if (field736 != -1 && VYCKCNXO.field1339[field736].field1352 == 1) {
			field736 = -1;
		}

		if (!arg2) {
			int var4 = arg0 - field732[0];
			int var5 = arg1 - field733[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (field762 < 9) {
					field762++;
				}

				for (int var6 = field762; var6 > 0; var6--) {
					field732[var6] = field732[var6 - 1];
					field733[var6] = field733[var6 - 1];
					field781[var6] = field781[var6 - 1];
				}

				field732[0] = arg0;
				field733[0] = arg1;
				field781[0] = false;
				return;
			}
		}

		field762 = 0;
		field763 = 0;
		field755 = 0;
		field732[0] = arg0;
		field733[0] = arg1;
		field741 = field732[0] * 128 + field753 * 64;
		field742 = field733[0] * 128 + field753 * 64;
	}

	@ObfuscatedName("GSULPWKR.a(IZII)V")
	public final void method243(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 4; var4++) {
			if (field769[var4] <= arg2) {
				field767[var4] = arg1;
				field768[var4] = arg0;
				field769[var4] = arg2 + 70;
				return;
			}
		}
	}

	@ObfuscatedName("GSULPWKR.a(I)V")
	public final void method244() {
		field762 = 0;
		field763 = 0;
	}

	@ObfuscatedName("GSULPWKR.b(I)Z")
	public boolean method169() {
		return false;
	}
}
