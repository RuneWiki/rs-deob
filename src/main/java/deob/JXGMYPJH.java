package deob;

@ObfuscatedName("JXGMYPJH")
public abstract class JXGMYPJH extends XBYIDFVN {

	@ObfuscatedName("JXGMYPJH.l")
	public int field785 = 200;

	@ObfuscatedName("JXGMYPJH.r")
	public int field790 = -1;

	@ObfuscatedName("JXGMYPJH.E")
	public boolean field803 = false;

	@ObfuscatedName("JXGMYPJH.G")
	public int field805 = -1;

	@ObfuscatedName("JXGMYPJH.H")
	public int field806 = -1;

	@ObfuscatedName("JXGMYPJH.I")
	public int field807 = -1;

	@ObfuscatedName("JXGMYPJH.J")
	public int field808 = -1;

	@ObfuscatedName("JXGMYPJH.K")
	public int[] field809 = new int[4];

	@ObfuscatedName("JXGMYPJH.L")
	public int[] field810 = new int[4];

	@ObfuscatedName("JXGMYPJH.M")
	public int[] field811 = new int[4];

	@ObfuscatedName("JXGMYPJH.N")
	public int field812 = 1;

	@ObfuscatedName("JXGMYPJH.Q")
	public int field815 = -1;

	@ObfuscatedName("JXGMYPJH.T")
	public int field818 = -1;

	@ObfuscatedName("JXGMYPJH.U")
	public boolean[] field819 = new boolean[10];

	@ObfuscatedName("JXGMYPJH.V")
	public int field820 = -1000;

	@ObfuscatedName("JXGMYPJH.Y")
	public int field823 = -1;

	@ObfuscatedName("JXGMYPJH.gb")
	public int field831 = 32;

	@ObfuscatedName("JXGMYPJH.hb")
	public int field832 = -1;

	@ObfuscatedName("JXGMYPJH.ib")
	public int field833 = -1;

	@ObfuscatedName("JXGMYPJH.jb")
	public int[] field834 = new int[10];

	@ObfuscatedName("JXGMYPJH.kb")
	public int[] field835 = new int[10];

	@ObfuscatedName("JXGMYPJH.lb")
	public int field836 = -1;

	@ObfuscatedName("JXGMYPJH.ob")
	public int field839 = 100;

	@ObfuscatedName("JXGMYPJH.m")
	public int field786;

	@ObfuscatedName("JXGMYPJH.n")
	public int field787;

	@ObfuscatedName("JXGMYPJH.o")
	public int field788;

	@ObfuscatedName("JXGMYPJH.p")
	public int field789;

	@ObfuscatedName("JXGMYPJH.s")
	public int field791;

	@ObfuscatedName("JXGMYPJH.t")
	public int field792;

	@ObfuscatedName("JXGMYPJH.u")
	public int field793;

	@ObfuscatedName("JXGMYPJH.v")
	public int field794;

	@ObfuscatedName("JXGMYPJH.w")
	public int field795;

	@ObfuscatedName("JXGMYPJH.x")
	public int field796;

	@ObfuscatedName("JXGMYPJH.y")
	public int field797;

	@ObfuscatedName("JXGMYPJH.z")
	public int field798;

	@ObfuscatedName("JXGMYPJH.A")
	public int field799;

	@ObfuscatedName("JXGMYPJH.B")
	public int field800;

	@ObfuscatedName("JXGMYPJH.C")
	public int field801;

	@ObfuscatedName("JXGMYPJH.D")
	public int field802;

	@ObfuscatedName("JXGMYPJH.O")
	public int field813;

	@ObfuscatedName("JXGMYPJH.P")
	public int field814;

	@ObfuscatedName("JXGMYPJH.R")
	public int field816;

	@ObfuscatedName("JXGMYPJH.S")
	public int field817;

	@ObfuscatedName("JXGMYPJH.W")
	public int field821;

	@ObfuscatedName("JXGMYPJH.X")
	public int field822;

	@ObfuscatedName("JXGMYPJH.Z")
	public int field824;

	@ObfuscatedName("JXGMYPJH.ab")
	public int field825;

	@ObfuscatedName("JXGMYPJH.bb")
	public int field826;

	@ObfuscatedName("JXGMYPJH.cb")
	public int field827;

	@ObfuscatedName("JXGMYPJH.db")
	public int field828;

	@ObfuscatedName("JXGMYPJH.eb")
	public int field829;

	@ObfuscatedName("JXGMYPJH.fb")
	public int field830;

	@ObfuscatedName("JXGMYPJH.mb")
	public int field837;

	@ObfuscatedName("JXGMYPJH.nb")
	public int field838;

	@ObfuscatedName("JXGMYPJH.F")
	public String field804;

	@ObfuscatedName("JXGMYPJH.a(IZB)V")
	public final void method303(int arg0, boolean arg1) {
		int var3 = field834[0];
		int var4 = field835[0];
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

		if (field823 != -1 && JZFUUSFN.field841[field823].field854 == 1) {
			field823 = -1;
		}

		if (field816 < 9) {
			field816++;
		}

		for (int var5 = field816; var5 > 0; var5--) {
			field834[var5] = field834[var5 - 1];
			field835[var5] = field835[var5 - 1];
			field819[var5] = field819[var5 - 1];
		}

		field834[0] = var3;
		field835[0] = var4;
		field819[0] = arg1;
	}

	@ObfuscatedName("JXGMYPJH.b(B)V")
	public final void method304() {
		field816 = 0;
		field814 = 0;
	}

	@ObfuscatedName("JXGMYPJH.a(IIII)V")
	public final void method305(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 4; var4++) {
			if (field811[var4] <= arg1) {
				field809[var4] = arg0;
				field810[var4] = arg2;
				field811[var4] = arg1 + 70;
				return;
			}
		}
	}

	@ObfuscatedName("JXGMYPJH.c(B)Z")
	public boolean method1() {
		return false;
	}

	@ObfuscatedName("JXGMYPJH.a(IZII)V")
	public final void method306(int arg0, boolean arg1, int arg2) {
		if (field823 != -1 && JZFUUSFN.field841[field823].field854 == 1) {
			field823 = -1;
		}

		if (!arg1) {
			int var4 = arg2 - field834[0];
			int var5 = arg0 - field835[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (field816 < 9) {
					field816++;
				}

				for (int var6 = field816; var6 > 0; var6--) {
					field834[var6] = field834[var6 - 1];
					field835[var6] = field835[var6 - 1];
					field819[var6] = field819[var6 - 1];
				}

				field834[0] = arg2;
				field835[0] = arg0;
				field819[0] = false;
				return;
			}
		}

		field816 = 0;
		field814 = 0;
		field802 = 0;
		field834[0] = arg2;
		field835[0] = arg0;
		field828 = field834[0] * 128 + field812 * 64;
		field829 = field835[0] * 128 + field812 * 64;
	}
}
