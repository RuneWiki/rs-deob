package deob;

@ObfuscatedName("HCCLTVPO")
public abstract class HCCLTVPO extends KCWTSCHR {

	@ObfuscatedName("HCCLTVPO.l")
	public int field734 = -1;

	@ObfuscatedName("HCCLTVPO.m")
	public int field735 = -1;

	@ObfuscatedName("HCCLTVPO.n")
	public int field736 = -1;

	@ObfuscatedName("HCCLTVPO.o")
	public int field737 = -1;

	@ObfuscatedName("HCCLTVPO.p")
	public int field738 = -1;

	@ObfuscatedName("HCCLTVPO.q")
	public int field739 = -1;

	@ObfuscatedName("HCCLTVPO.s")
	public int field741 = -1;

	@ObfuscatedName("HCCLTVPO.x")
	public int field746 = 1;

	@ObfuscatedName("HCCLTVPO.y")
	public int field747 = -1;

	@ObfuscatedName("HCCLTVPO.A")
	public int[] field749 = new int[4];

	@ObfuscatedName("HCCLTVPO.B")
	public int[] field750 = new int[4];

	@ObfuscatedName("HCCLTVPO.C")
	public int[] field751 = new int[4];

	@ObfuscatedName("HCCLTVPO.D")
	public int field752 = -1;

	@ObfuscatedName("HCCLTVPO.L")
	public int field760 = -1;

	@ObfuscatedName("HCCLTVPO.S")
	public int field766 = 32;

	@ObfuscatedName("HCCLTVPO.cb")
	public int[] field776 = new int[10];

	@ObfuscatedName("HCCLTVPO.db")
	public int[] field777 = new int[10];

	@ObfuscatedName("HCCLTVPO.eb")
	public int field778 = -1;

	@ObfuscatedName("HCCLTVPO.fb")
	public int field779 = 100;

	@ObfuscatedName("HCCLTVPO.gb")
	public int field780 = -1000;

	@ObfuscatedName("HCCLTVPO.jb")
	public boolean[] field783 = new boolean[10];

	@ObfuscatedName("HCCLTVPO.ob")
	public boolean field787 = false;

	@ObfuscatedName("HCCLTVPO.pb")
	public int field788 = 200;

	@ObfuscatedName("HCCLTVPO.r")
	public int field740;

	@ObfuscatedName("HCCLTVPO.t")
	public int field742;

	@ObfuscatedName("HCCLTVPO.u")
	public int field743;

	@ObfuscatedName("HCCLTVPO.v")
	public int field744;

	@ObfuscatedName("HCCLTVPO.w")
	public int field745;

	@ObfuscatedName("HCCLTVPO.z")
	public int field748;

	@ObfuscatedName("HCCLTVPO.E")
	public int field753;

	@ObfuscatedName("HCCLTVPO.F")
	public int field754;

	@ObfuscatedName("HCCLTVPO.G")
	public int field755;

	@ObfuscatedName("HCCLTVPO.H")
	public int field756;

	@ObfuscatedName("HCCLTVPO.I")
	public int field757;

	@ObfuscatedName("HCCLTVPO.J")
	public int field758;

	@ObfuscatedName("HCCLTVPO.K")
	public int field759;

	@ObfuscatedName("HCCLTVPO.M")
	public int field761;

	@ObfuscatedName("HCCLTVPO.N")
	public int field762;

	@ObfuscatedName("HCCLTVPO.O")
	public int field763;

	@ObfuscatedName("HCCLTVPO.P")
	public int field764;

	@ObfuscatedName("HCCLTVPO.Q")
	public int field765;

	@ObfuscatedName("HCCLTVPO.T")
	public int field767;

	@ObfuscatedName("HCCLTVPO.U")
	public int field768;

	@ObfuscatedName("HCCLTVPO.V")
	public int field769;

	@ObfuscatedName("HCCLTVPO.W")
	public int field770;

	@ObfuscatedName("HCCLTVPO.X")
	public int field771;

	@ObfuscatedName("HCCLTVPO.Y")
	public int field772;

	@ObfuscatedName("HCCLTVPO.Z")
	public int field773;

	@ObfuscatedName("HCCLTVPO.ab")
	public int field774;

	@ObfuscatedName("HCCLTVPO.bb")
	public int field775;

	@ObfuscatedName("HCCLTVPO.hb")
	public int field781;

	@ObfuscatedName("HCCLTVPO.ib")
	public int field782;

	@ObfuscatedName("HCCLTVPO.kb")
	public int field784;

	@ObfuscatedName("HCCLTVPO.lb")
	public int field785;

	@ObfuscatedName("HCCLTVPO.nb")
	public String field786;

	@ObfuscatedName("HCCLTVPO.a(Z)V")
	public final void method315() {
		field775 = 0;
		field740 = 0;
	}

	@ObfuscatedName("HCCLTVPO.a(IZBI)V")
	public final void method316(int arg0, boolean arg1, int arg2) {
		if (field741 != -1 && SPUHKLMC.field1176[field741].field1189 == 1) {
			field741 = -1;
		}

		if (!arg1) {
			int var4 = arg2 - field776[0];
			int var5 = arg0 - field777[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (field775 < 9) {
					field775++;
				}

				for (int var6 = field775; var6 > 0; var6--) {
					field776[var6] = field776[var6 - 1];
					field777[var6] = field777[var6 - 1];
					field783[var6] = field783[var6 - 1];
				}

				field776[0] = arg2;
				field777[0] = arg0;
				field783[0] = false;
				return;
			}
		}

		field775 = 0;
		field740 = 0;
		field765 = 0;
		field776[0] = arg2;
		field777[0] = arg0;
		field756 = field776[0] * 128 + field746 * 64;
		field757 = field777[0] * 128 + field746 * 64;
	}

	@ObfuscatedName("HCCLTVPO.a(IBZ)V")
	public final void method317(int arg0, boolean arg1) {
		int var3 = field776[0];
		int var4 = field777[0];
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

		if (field741 != -1 && SPUHKLMC.field1176[field741].field1189 == 1) {
			field741 = -1;
		}

		if (field775 < 9) {
			field775++;
		}

		for (int var5 = field775; var5 > 0; var5--) {
			field776[var5] = field776[var5 - 1];
			field777[var5] = field777[var5 - 1];
			field783[var5] = field783[var5 - 1];
		}

		field776[0] = var3;
		field777[0] = var4;
		field783[0] = arg1;
	}

	@ObfuscatedName("HCCLTVPO.a(IBII)V")
	public final void method318(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 4; var4++) {
			if (field751[var4] <= arg0) {
				field749[var4] = arg2;
				field750[var4] = arg1;
				field751[var4] = arg0 + 70;
				return;
			}
		}
	}

	@ObfuscatedName("HCCLTVPO.a(I)Z")
	public boolean method41() {
		return false;
	}
}
