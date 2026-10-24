package deob;

@ObfuscatedName("FWNRUNYO")
public class FWNRUNYO extends ESLZGWKZ {

	@ObfuscatedName("FWNRUNYO.l")
	public int field756 = -1;

	@ObfuscatedName("FWNRUNYO.m")
	public int field757 = -1;

	@ObfuscatedName("FWNRUNYO.n")
	public boolean field758 = false;

	@ObfuscatedName("FWNRUNYO.q")
	public int field761 = 32;

	@ObfuscatedName("FWNRUNYO.r")
	public boolean[] field762 = new boolean[10];

	@ObfuscatedName("FWNRUNYO.s")
	public int field763 = -1;

	@ObfuscatedName("FWNRUNYO.B")
	public int[] field772 = new int[10];

	@ObfuscatedName("FWNRUNYO.C")
	public int[] field773 = new int[10];

	@ObfuscatedName("FWNRUNYO.D")
	public int field774 = -1;

	@ObfuscatedName("FWNRUNYO.H")
	public int field778 = 100;

	@ObfuscatedName("FWNRUNYO.N")
	public int field784 = -1000;

	@ObfuscatedName("FWNRUNYO.Q")
	public int field787 = -1;

	@ObfuscatedName("FWNRUNYO.R")
	public int field788 = -1;

	@ObfuscatedName("FWNRUNYO.S")
	public int field789 = -1;

	@ObfuscatedName("FWNRUNYO.T")
	public int field790 = -1;

	@ObfuscatedName("FWNRUNYO.U")
	public int[] field791 = new int[4];

	@ObfuscatedName("FWNRUNYO.V")
	public int[] field792 = new int[4];

	@ObfuscatedName("FWNRUNYO.W")
	public int[] field793 = new int[4];

	@ObfuscatedName("FWNRUNYO.X")
	public int field794 = -1;

	@ObfuscatedName("FWNRUNYO.eb")
	public int field800 = -1;

	@ObfuscatedName("FWNRUNYO.lb")
	public int field806 = 200;

	@ObfuscatedName("FWNRUNYO.mb")
	public int field807 = -1;

	@ObfuscatedName("FWNRUNYO.nb")
	public int field808 = 1;

	@ObfuscatedName("FWNRUNYO.p")
	public int field760;

	@ObfuscatedName("FWNRUNYO.t")
	public int field764;

	@ObfuscatedName("FWNRUNYO.u")
	public int field765;

	@ObfuscatedName("FWNRUNYO.v")
	public int field766;

	@ObfuscatedName("FWNRUNYO.w")
	public int field767;

	@ObfuscatedName("FWNRUNYO.x")
	public int field768;

	@ObfuscatedName("FWNRUNYO.y")
	public int field769;

	@ObfuscatedName("FWNRUNYO.z")
	public int field770;

	@ObfuscatedName("FWNRUNYO.A")
	public int field771;

	@ObfuscatedName("FWNRUNYO.E")
	public int field775;

	@ObfuscatedName("FWNRUNYO.F")
	public int field776;

	@ObfuscatedName("FWNRUNYO.G")
	public int field777;

	@ObfuscatedName("FWNRUNYO.I")
	public int field779;

	@ObfuscatedName("FWNRUNYO.J")
	public int field780;

	@ObfuscatedName("FWNRUNYO.K")
	public int field781;

	@ObfuscatedName("FWNRUNYO.L")
	public int field782;

	@ObfuscatedName("FWNRUNYO.M")
	public int field783;

	@ObfuscatedName("FWNRUNYO.O")
	public int field785;

	@ObfuscatedName("FWNRUNYO.P")
	public int field786;

	@ObfuscatedName("FWNRUNYO.Y")
	public int field795;

	@ObfuscatedName("FWNRUNYO.Z")
	public int field796;

	@ObfuscatedName("FWNRUNYO.ab")
	public int field797;

	@ObfuscatedName("FWNRUNYO.bb")
	public int field798;

	@ObfuscatedName("FWNRUNYO.cb")
	public int field799;

	@ObfuscatedName("FWNRUNYO.fb")
	public int field801;

	@ObfuscatedName("FWNRUNYO.gb")
	public int field802;

	@ObfuscatedName("FWNRUNYO.hb")
	public int field803;

	@ObfuscatedName("FWNRUNYO.ib")
	public int field804;

	@ObfuscatedName("FWNRUNYO.kb")
	public int field805;

	@ObfuscatedName("FWNRUNYO.ob")
	public int field809;

	@ObfuscatedName("FWNRUNYO.pb")
	public int field810;

	@ObfuscatedName("FWNRUNYO.o")
	public String field759;

	@ObfuscatedName("FWNRUNYO.a(Z)V")
	public final void method269() {
		field777 = 0;
		field764 = 0;
	}

	@ObfuscatedName("FWNRUNYO.b(B)Z")
	public boolean method161() {
		return false;
	}

	@ObfuscatedName("FWNRUNYO.a(IIII)V")
	public final void method270(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 4; var4++) {
			if (field793[var4] <= arg1) {
				field791[var4] = arg0;
				field792[var4] = arg2;
				field793[var4] = arg1 + 70;
				return;
			}
		}
	}

	@ObfuscatedName("FWNRUNYO.a(IIIZ)V")
	public final void method271(int arg0, int arg1, boolean arg2) {
		if (field794 != -1 && HARRRJHW.field840[field794].field853 == 1) {
			field794 = -1;
		}

		if (!arg2) {
			int var4 = arg0 - field772[0];
			int var5 = arg1 - field773[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (field777 < 9) {
					field777++;
				}

				for (int var6 = field777; var6 > 0; var6--) {
					field772[var6] = field772[var6 - 1];
					field773[var6] = field773[var6 - 1];
					field762[var6] = field762[var6 - 1];
				}

				field772[0] = arg0;
				field773[0] = arg1;
				field762[0] = false;
				return;
			}
		}

		field777 = 0;
		field764 = 0;
		field805 = 0;
		field772[0] = arg0;
		field773[0] = arg1;
		field781 = field772[0] * 128 + field808 * 64;
		field782 = field773[0] * 128 + field808 * 64;
	}

	@ObfuscatedName("FWNRUNYO.a(IZI)V")
	public final void method272(boolean arg0, int arg1) {
		int var3 = field772[0];
		int var4 = field773[0];
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

		if (field794 != -1 && HARRRJHW.field840[field794].field853 == 1) {
			field794 = -1;
		}

		if (field777 < 9) {
			field777++;
		}

		for (int var5 = field777; var5 > 0; var5--) {
			field772[var5] = field772[var5 - 1];
			field773[var5] = field773[var5 - 1];
			field762[var5] = field762[var5 - 1];
		}

		field772[0] = var3;
		field773[0] = var4;
		field762[0] = arg0;
	}
}
