package deob;

@ObfuscatedName("APSQOGBV")
public abstract class APSQOGBV extends XHDBBLMT {

	@ObfuscatedName("APSQOGBV.k")
	public int field12 = -1000;

	@ObfuscatedName("APSQOGBV.o")
	public int field16 = -1;

	@ObfuscatedName("APSQOGBV.q")
	public int field18 = -1;

	@ObfuscatedName("APSQOGBV.r")
	public int field19 = -1;

	@ObfuscatedName("APSQOGBV.s")
	public int field20 = -1;

	@ObfuscatedName("APSQOGBV.t")
	public int field21 = -1;

	@ObfuscatedName("APSQOGBV.w")
	public int field23 = 100;

	@ObfuscatedName("APSQOGBV.x")
	public int field24 = -1;

	@ObfuscatedName("APSQOGBV.D")
	public int[] field30 = new int[4];

	@ObfuscatedName("APSQOGBV.E")
	public int[] field31 = new int[4];

	@ObfuscatedName("APSQOGBV.F")
	public int[] field32 = new int[4];

	@ObfuscatedName("APSQOGBV.G")
	public int field33 = 200;

	@ObfuscatedName("APSQOGBV.H")
	public int[] field34 = new int[10];

	@ObfuscatedName("APSQOGBV.I")
	public int[] field35 = new int[10];

	@ObfuscatedName("APSQOGBV.J")
	public boolean field36 = false;

	@ObfuscatedName("APSQOGBV.K")
	public int field37 = 32;

	@ObfuscatedName("APSQOGBV.N")
	public int field40 = -1;

	@ObfuscatedName("APSQOGBV.R")
	public int field44 = -1;

	@ObfuscatedName("APSQOGBV.W")
	public int field49 = -1;

	@ObfuscatedName("APSQOGBV.X")
	public boolean[] field50 = new boolean[10];

	@ObfuscatedName("APSQOGBV.Y")
	public int field51 = 1;

	@ObfuscatedName("APSQOGBV.ob")
	public int field65 = -1;

	@ObfuscatedName("APSQOGBV.pb")
	public int field66 = -1;

	@ObfuscatedName("APSQOGBV.l")
	public int field13;

	@ObfuscatedName("APSQOGBV.m")
	public int field14;

	@ObfuscatedName("APSQOGBV.n")
	public int field15;

	@ObfuscatedName("APSQOGBV.p")
	public int field17;

	@ObfuscatedName("APSQOGBV.u")
	public int field22;

	@ObfuscatedName("APSQOGBV.y")
	public int field25;

	@ObfuscatedName("APSQOGBV.z")
	public int field26;

	@ObfuscatedName("APSQOGBV.A")
	public int field27;

	@ObfuscatedName("APSQOGBV.B")
	public int field28;

	@ObfuscatedName("APSQOGBV.C")
	public int field29;

	@ObfuscatedName("APSQOGBV.L")
	public int field38;

	@ObfuscatedName("APSQOGBV.M")
	public int field39;

	@ObfuscatedName("APSQOGBV.O")
	public int field41;

	@ObfuscatedName("APSQOGBV.P")
	public int field42;

	@ObfuscatedName("APSQOGBV.S")
	public int field45;

	@ObfuscatedName("APSQOGBV.T")
	public int field46;

	@ObfuscatedName("APSQOGBV.U")
	public int field47;

	@ObfuscatedName("APSQOGBV.V")
	public int field48;

	@ObfuscatedName("APSQOGBV.ab")
	public int field52;

	@ObfuscatedName("APSQOGBV.bb")
	public int field53;

	@ObfuscatedName("APSQOGBV.cb")
	public int field54;

	@ObfuscatedName("APSQOGBV.db")
	public int field55;

	@ObfuscatedName("APSQOGBV.eb")
	public int field56;

	@ObfuscatedName("APSQOGBV.fb")
	public int field57;

	@ObfuscatedName("APSQOGBV.gb")
	public int field58;

	@ObfuscatedName("APSQOGBV.hb")
	public int field59;

	@ObfuscatedName("APSQOGBV.jb")
	public int field60;

	@ObfuscatedName("APSQOGBV.kb")
	public int field61;

	@ObfuscatedName("APSQOGBV.lb")
	public int field62;

	@ObfuscatedName("APSQOGBV.mb")
	public int field63;

	@ObfuscatedName("APSQOGBV.nb")
	public int field64;

	@ObfuscatedName("APSQOGBV.Q")
	public String field43;

	@ObfuscatedName("APSQOGBV.a(B)V")
	public final void method7() {
		field15 = 0;
		field60 = 0;
	}

	@ObfuscatedName("APSQOGBV.a(IZZ)V")
	public final void method8(int arg0, boolean arg1) {
		int var3 = field34[0];
		int var4 = field35[0];
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

		if (field44 != -1 && ODMBIHRM.field1035[field44].field1048 == 1) {
			field44 = -1;
		}

		if (field15 < 9) {
			field15++;
		}

		for (int var5 = field15; var5 > 0; var5--) {
			field34[var5] = field34[var5 - 1];
			field35[var5] = field35[var5 - 1];
			field50[var5] = field50[var5 - 1];
		}

		field34[0] = var3;
		field35[0] = var4;
		field50[0] = arg1;
	}

	@ObfuscatedName("APSQOGBV.a(IIII)V")
	public final void method9(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 4; var4++) {
			if (field32[var4] <= arg0) {
				field30[var4] = arg2;
				field31[var4] = arg1;
				field32[var4] = arg0 + 70;
				return;
			}
		}
	}

	@ObfuscatedName("APSQOGBV.a(Z)Z")
	public boolean method10() {
		return false;
	}

	@ObfuscatedName("APSQOGBV.a(ZIIZ)V")
	public final void method11(int arg0, int arg1, boolean arg2) {
		if (field44 != -1 && ODMBIHRM.field1035[field44].field1048 == 1) {
			field44 = -1;
		}

		if (!arg2) {
			int var4 = arg0 - field34[0];
			int var5 = arg1 - field35[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (field15 < 9) {
					field15++;
				}

				for (int var6 = field15; var6 > 0; var6--) {
					field34[var6] = field34[var6 - 1];
					field35[var6] = field35[var6 - 1];
					field50[var6] = field50[var6 - 1];
				}

				field34[0] = arg0;
				field35[0] = arg1;
				field50[0] = false;
				return;
			}
		}

		field15 = 0;
		field60 = 0;
		field17 = 0;
		field34[0] = arg0;
		field35[0] = arg1;
		field62 = field34[0] * 128 + field51 * 64;
		field63 = field35[0] * 128 + field51 * 64;
	}
}
