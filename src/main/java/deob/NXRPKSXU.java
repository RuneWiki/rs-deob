package deob;

@ObfuscatedName("NXRPKSXU")
public abstract class NXRPKSXU extends IWSGBTLV {

	@ObfuscatedName("NXRPKSXU.n")
	public int field996 = -1;

	@ObfuscatedName("NXRPKSXU.t")
	public int field1002 = 32;

	@ObfuscatedName("NXRPKSXU.u")
	public int[] field1003 = new int[10];

	@ObfuscatedName("NXRPKSXU.v")
	public int[] field1004 = new int[10];

	@ObfuscatedName("NXRPKSXU.y")
	public int field1007 = 1;

	@ObfuscatedName("NXRPKSXU.z")
	public int field1008 = -1000;

	@ObfuscatedName("NXRPKSXU.C")
	public int field1011 = -1;

	@ObfuscatedName("NXRPKSXU.D")
	public int field1012 = -1;

	@ObfuscatedName("NXRPKSXU.J")
	public int field1017 = -1;

	@ObfuscatedName("NXRPKSXU.N")
	public int field1021 = -1;

	@ObfuscatedName("NXRPKSXU.O")
	public int field1022 = -1;

	@ObfuscatedName("NXRPKSXU.P")
	public int field1023 = -1;

	@ObfuscatedName("NXRPKSXU.Q")
	public int field1024 = -1;

	@ObfuscatedName("NXRPKSXU.R")
	public boolean[] field1025 = new boolean[10];

	@ObfuscatedName("NXRPKSXU.S")
	public int field1026 = -1;

	@ObfuscatedName("NXRPKSXU.db")
	public int field1037 = 100;

	@ObfuscatedName("NXRPKSXU.eb")
	public int[] field1038 = new int[4];

	@ObfuscatedName("NXRPKSXU.fb")
	public int[] field1039 = new int[4];

	@ObfuscatedName("NXRPKSXU.gb")
	public int[] field1040 = new int[4];

	@ObfuscatedName("NXRPKSXU.jb")
	public int field1043 = -1;

	@ObfuscatedName("NXRPKSXU.kb")
	public int field1044 = -1;

	@ObfuscatedName("NXRPKSXU.pb")
	public int field1049 = 200;

	@ObfuscatedName("NXRPKSXU.qb")
	public boolean field1050 = false;

	@ObfuscatedName("NXRPKSXU.r")
	public int field1000;

	@ObfuscatedName("NXRPKSXU.w")
	public int field1005;

	@ObfuscatedName("NXRPKSXU.x")
	public int field1006;

	@ObfuscatedName("NXRPKSXU.A")
	public int field1009;

	@ObfuscatedName("NXRPKSXU.B")
	public int field1010;

	@ObfuscatedName("NXRPKSXU.E")
	public int field1013;

	@ObfuscatedName("NXRPKSXU.G")
	public int field1014;

	@ObfuscatedName("NXRPKSXU.H")
	public int field1015;

	@ObfuscatedName("NXRPKSXU.I")
	public int field1016;

	@ObfuscatedName("NXRPKSXU.K")
	public int field1018;

	@ObfuscatedName("NXRPKSXU.L")
	public int field1019;

	@ObfuscatedName("NXRPKSXU.M")
	public int field1020;

	@ObfuscatedName("NXRPKSXU.T")
	public int field1027;

	@ObfuscatedName("NXRPKSXU.U")
	public int field1028;

	@ObfuscatedName("NXRPKSXU.V")
	public int field1029;

	@ObfuscatedName("NXRPKSXU.W")
	public int field1030;

	@ObfuscatedName("NXRPKSXU.X")
	public int field1031;

	@ObfuscatedName("NXRPKSXU.Y")
	public int field1032;

	@ObfuscatedName("NXRPKSXU.Z")
	public int field1033;

	@ObfuscatedName("NXRPKSXU.ab")
	public int field1034;

	@ObfuscatedName("NXRPKSXU.bb")
	public int field1035;

	@ObfuscatedName("NXRPKSXU.cb")
	public int field1036;

	@ObfuscatedName("NXRPKSXU.hb")
	public int field1041;

	@ObfuscatedName("NXRPKSXU.ib")
	public int field1042;

	@ObfuscatedName("NXRPKSXU.lb")
	public int field1045;

	@ObfuscatedName("NXRPKSXU.mb")
	public int field1046;

	@ObfuscatedName("NXRPKSXU.nb")
	public int field1047;

	@ObfuscatedName("NXRPKSXU.ob")
	public int field1048;

	@ObfuscatedName("NXRPKSXU.o")
	public int field997;

	@ObfuscatedName("NXRPKSXU.p")
	public int field998;

	@ObfuscatedName("NXRPKSXU.q")
	public int field999;

	@ObfuscatedName("NXRPKSXU.s")
	public String field1001;

	@ObfuscatedName("NXRPKSXU.a(IIII)V")
	public final void method349(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 4; var4++) {
			if (field1040[var4] <= arg2) {
				field1038[var4] = arg1;
				field1039[var4] = arg0;
				field1040[var4] = arg2 + 70;
				return;
			}
		}
	}

	@ObfuscatedName("NXRPKSXU.b(I)V")
	public final void method350() {
		field1029 = 0;
		field1006 = 0;
	}

	@ObfuscatedName("NXRPKSXU.a(Z)Z")
	public boolean method38() {
		return false;
	}

	@ObfuscatedName("NXRPKSXU.a(IZI)V")
	public final void method351(int arg0, boolean arg1) {
		int var3 = field1003[0];
		int var4 = field1004[0];
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

		if (field1044 != -1 && UVDKTGZK.field1357[field1044].field1370 == 1) {
			field1044 = -1;
		}

		if (field1029 < 9) {
			field1029++;
		}

		for (int var5 = field1029; var5 > 0; var5--) {
			field1003[var5] = field1003[var5 - 1];
			field1004[var5] = field1004[var5 - 1];
			field1025[var5] = field1025[var5 - 1];
		}

		field1003[0] = var3;
		field1004[0] = var4;
		field1025[0] = arg1;
	}

	@ObfuscatedName("NXRPKSXU.a(IZIZ)V")
	public final void method352(int arg0, int arg1, boolean arg2) {
		if (field1044 != -1 && UVDKTGZK.field1357[field1044].field1370 == 1) {
			field1044 = -1;
		}

		if (!arg2) {
			int var4 = arg0 - field1003[0];
			int var5 = arg1 - field1004[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (field1029 < 9) {
					field1029++;
				}

				for (int var6 = field1029; var6 > 0; var6--) {
					field1003[var6] = field1003[var6 - 1];
					field1004[var6] = field1004[var6 - 1];
					field1025[var6] = field1025[var6 - 1];
				}

				field1003[0] = arg0;
				field1004[0] = arg1;
				field1025[0] = false;
				return;
			}
		}

		field1029 = 0;
		field1006 = 0;
		field1027 = 0;
		field1003[0] = arg0;
		field1004[0] = arg1;
		field1014 = field1003[0] * 128 + field1007 * 64;
		field1015 = field1004[0] * 128 + field1007 * 64;
	}
}
