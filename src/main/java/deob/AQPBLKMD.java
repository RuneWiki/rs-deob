package deob;

@ObfuscatedName("AQPBLKMD")
public abstract class AQPBLKMD extends CRKDFBCP {

	@ObfuscatedName("AQPBLKMD.l")
	public int field16 = -1;

	@ObfuscatedName("AQPBLKMD.q")
	public int field21 = -1;

	@ObfuscatedName("AQPBLKMD.r")
	public int field22 = -1;

	@ObfuscatedName("AQPBLKMD.s")
	public int field23 = -1;

	@ObfuscatedName("AQPBLKMD.t")
	public int field24 = -1;

	@ObfuscatedName("AQPBLKMD.y")
	public int field29 = 32;

	@ObfuscatedName("AQPBLKMD.A")
	public int field30 = -1;

	@ObfuscatedName("AQPBLKMD.B")
	public int field31 = -1000;

	@ObfuscatedName("AQPBLKMD.E")
	public boolean field34 = false;

	@ObfuscatedName("AQPBLKMD.F")
	public boolean[] field35 = new boolean[10];

	@ObfuscatedName("AQPBLKMD.G")
	public int field36 = 1;

	@ObfuscatedName("AQPBLKMD.K")
	public int field40 = 100;

	@ObfuscatedName("AQPBLKMD.M")
	public int field42 = -1;

	@ObfuscatedName("AQPBLKMD.S")
	public int field48 = -1;

	@ObfuscatedName("AQPBLKMD.V")
	public int field51 = 200;

	@ObfuscatedName("AQPBLKMD.Y")
	public int[] field54 = new int[4];

	@ObfuscatedName("AQPBLKMD.Z")
	public int[] field55 = new int[4];

	@ObfuscatedName("AQPBLKMD.ab")
	public int[] field56 = new int[4];

	@ObfuscatedName("AQPBLKMD.bb")
	public int[] field57 = new int[10];

	@ObfuscatedName("AQPBLKMD.cb")
	public int[] field58 = new int[10];

	@ObfuscatedName("AQPBLKMD.db")
	public int field59 = -1;

	@ObfuscatedName("AQPBLKMD.eb")
	public int field60 = -1;

	@ObfuscatedName("AQPBLKMD.fb")
	public int field61 = -1;

	@ObfuscatedName("AQPBLKMD.m")
	public int field17;

	@ObfuscatedName("AQPBLKMD.n")
	public int field18;

	@ObfuscatedName("AQPBLKMD.o")
	public int field19;

	@ObfuscatedName("AQPBLKMD.p")
	public int field20;

	@ObfuscatedName("AQPBLKMD.u")
	public int field25;

	@ObfuscatedName("AQPBLKMD.v")
	public int field26;

	@ObfuscatedName("AQPBLKMD.w")
	public int field27;

	@ObfuscatedName("AQPBLKMD.x")
	public int field28;

	@ObfuscatedName("AQPBLKMD.C")
	public int field32;

	@ObfuscatedName("AQPBLKMD.D")
	public int field33;

	@ObfuscatedName("AQPBLKMD.H")
	public int field37;

	@ObfuscatedName("AQPBLKMD.J")
	public int field39;

	@ObfuscatedName("AQPBLKMD.L")
	public int field41;

	@ObfuscatedName("AQPBLKMD.N")
	public int field43;

	@ObfuscatedName("AQPBLKMD.O")
	public int field44;

	@ObfuscatedName("AQPBLKMD.P")
	public int field45;

	@ObfuscatedName("AQPBLKMD.Q")
	public int field46;

	@ObfuscatedName("AQPBLKMD.R")
	public int field47;

	@ObfuscatedName("AQPBLKMD.T")
	public int field49;

	@ObfuscatedName("AQPBLKMD.U")
	public int field50;

	@ObfuscatedName("AQPBLKMD.W")
	public int field52;

	@ObfuscatedName("AQPBLKMD.X")
	public int field53;

	@ObfuscatedName("AQPBLKMD.gb")
	public int field62;

	@ObfuscatedName("AQPBLKMD.hb")
	public int field63;

	@ObfuscatedName("AQPBLKMD.ib")
	public int field64;

	@ObfuscatedName("AQPBLKMD.jb")
	public int field65;

	@ObfuscatedName("AQPBLKMD.kb")
	public int field66;

	@ObfuscatedName("AQPBLKMD.lb")
	public int field67;

	@ObfuscatedName("AQPBLKMD.mb")
	public int field68;

	@ObfuscatedName("AQPBLKMD.nb")
	public int field69;

	@ObfuscatedName("AQPBLKMD.ob")
	public int field70;

	@ObfuscatedName("AQPBLKMD.I")
	public String field38;

	@ObfuscatedName("AQPBLKMD.b(I)V")
	public final void method6() {
		field39 = 0;
		field47 = 0;
	}

	@ObfuscatedName("AQPBLKMD.a(IZIZ)V")
	public final void method7(int arg0, boolean arg1, int arg2) {
		if (field42 != -1 && KSVXFIAD.field1002[field42].field1015 == 1) {
			field42 = -1;
		}

		if (!arg1) {
			int var4 = arg0 - field57[0];
			int var5 = arg2 - field58[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (field39 < 9) {
					field39++;
				}

				for (int var6 = field39; var6 > 0; var6--) {
					field57[var6] = field57[var6 - 1];
					field58[var6] = field58[var6 - 1];
					field35[var6] = field35[var6 - 1];
				}

				field57[0] = arg0;
				field58[0] = arg2;
				field35[0] = false;
				return;
			}
		}

		field39 = 0;
		field47 = 0;
		field69 = 0;
		field57[0] = arg0;
		field58[0] = arg2;
		field26 = field57[0] * 128 + field36 * 64;
		field27 = field58[0] * 128 + field36 * 64;
	}

	@ObfuscatedName("AQPBLKMD.c(I)Z")
	public boolean method8() {
		return false;
	}

	@ObfuscatedName("AQPBLKMD.a(IZZ)V")
	public final void method9(int arg0, boolean arg1) {
		int var3 = field57[0];
		int var4 = field58[0];
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

		if (field42 != -1 && KSVXFIAD.field1002[field42].field1015 == 1) {
			field42 = -1;
		}

		if (field39 < 9) {
			field39++;
		}

		for (int var5 = field39; var5 > 0; var5--) {
			field57[var5] = field57[var5 - 1];
			field58[var5] = field58[var5 - 1];
			field35[var5] = field35[var5 - 1];
		}

		field57[0] = var3;
		field58[0] = var4;
		field35[0] = arg1;
	}

	@ObfuscatedName("AQPBLKMD.a(IIZI)V")
	public final void method10(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 4; var4++) {
			if (field56[var4] <= arg1) {
				field54[var4] = arg0;
				field55[var4] = arg2;
				field56[var4] = arg1 + 70;
				return;
			}
		}
	}
}
