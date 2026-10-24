package deob;

@ObfuscatedName("SXZSKNOI")
public class SXZSKNOI extends AVUWZCYT {

	@ObfuscatedName("SXZSKNOI.l")
	public int field1013 = -1;

	@ObfuscatedName("SXZSKNOI.q")
	public int field1018 = 32;

	@ObfuscatedName("SXZSKNOI.v")
	public int[] field1023 = new int[4];

	@ObfuscatedName("SXZSKNOI.w")
	public int[] field1024 = new int[4];

	@ObfuscatedName("SXZSKNOI.x")
	public int[] field1025 = new int[4];

	@ObfuscatedName("SXZSKNOI.y")
	public int field1026 = -1;

	@ObfuscatedName("SXZSKNOI.I")
	public int field1036 = -1;

	@ObfuscatedName("SXZSKNOI.J")
	public int field1037 = -1;

	@ObfuscatedName("SXZSKNOI.K")
	public int field1038 = -1;

	@ObfuscatedName("SXZSKNOI.L")
	public int field1039 = -1;

	@ObfuscatedName("SXZSKNOI.M")
	public int field1040 = -1;

	@ObfuscatedName("SXZSKNOI.N")
	public int[] field1041 = new int[10];

	@ObfuscatedName("SXZSKNOI.O")
	public int[] field1042 = new int[10];

	@ObfuscatedName("SXZSKNOI.P")
	public boolean field1043 = false;

	@ObfuscatedName("SXZSKNOI.T")
	public int field1047 = -1;

	@ObfuscatedName("SXZSKNOI.Y")
	public int field1052 = -1;

	@ObfuscatedName("SXZSKNOI.Z")
	public int field1053 = -1;

	@ObfuscatedName("SXZSKNOI.bb")
	public int field1055 = 1;

	@ObfuscatedName("SXZSKNOI.eb")
	public boolean[] field1057 = new boolean[10];

	@ObfuscatedName("SXZSKNOI.fb")
	public int field1058 = -1;

	@ObfuscatedName("SXZSKNOI.ib")
	public int field1061 = 100;

	@ObfuscatedName("SXZSKNOI.kb")
	public int field1063 = 200;

	@ObfuscatedName("SXZSKNOI.lb")
	public int field1064 = -1000;

	@ObfuscatedName("SXZSKNOI.k")
	public int field1012;

	@ObfuscatedName("SXZSKNOI.m")
	public int field1014;

	@ObfuscatedName("SXZSKNOI.n")
	public int field1015;

	@ObfuscatedName("SXZSKNOI.o")
	public int field1016;

	@ObfuscatedName("SXZSKNOI.p")
	public int field1017;

	@ObfuscatedName("SXZSKNOI.r")
	public int field1019;

	@ObfuscatedName("SXZSKNOI.s")
	public int field1020;

	@ObfuscatedName("SXZSKNOI.t")
	public int field1021;

	@ObfuscatedName("SXZSKNOI.u")
	public int field1022;

	@ObfuscatedName("SXZSKNOI.z")
	public int field1027;

	@ObfuscatedName("SXZSKNOI.A")
	public int field1028;

	@ObfuscatedName("SXZSKNOI.B")
	public int field1029;

	@ObfuscatedName("SXZSKNOI.C")
	public int field1030;

	@ObfuscatedName("SXZSKNOI.D")
	public int field1031;

	@ObfuscatedName("SXZSKNOI.E")
	public int field1032;

	@ObfuscatedName("SXZSKNOI.F")
	public int field1033;

	@ObfuscatedName("SXZSKNOI.H")
	public int field1035;

	@ObfuscatedName("SXZSKNOI.Q")
	public int field1044;

	@ObfuscatedName("SXZSKNOI.R")
	public int field1045;

	@ObfuscatedName("SXZSKNOI.S")
	public int field1046;

	@ObfuscatedName("SXZSKNOI.U")
	public int field1048;

	@ObfuscatedName("SXZSKNOI.V")
	public int field1049;

	@ObfuscatedName("SXZSKNOI.W")
	public int field1050;

	@ObfuscatedName("SXZSKNOI.X")
	public int field1051;

	@ObfuscatedName("SXZSKNOI.ab")
	public int field1054;

	@ObfuscatedName("SXZSKNOI.db")
	public int field1056;

	@ObfuscatedName("SXZSKNOI.gb")
	public int field1059;

	@ObfuscatedName("SXZSKNOI.hb")
	public int field1060;

	@ObfuscatedName("SXZSKNOI.jb")
	public int field1062;

	@ObfuscatedName("SXZSKNOI.mb")
	public int field1065;

	@ObfuscatedName("SXZSKNOI.nb")
	public int field1066;

	@ObfuscatedName("SXZSKNOI.G")
	public String field1034;

	@ObfuscatedName("SXZSKNOI.a(IIIB)V")
	public final void method477(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 4; var4++) {
			if (field1025[var4] <= arg0) {
				field1023[var4] = arg1;
				field1024[var4] = arg2;
				field1025[var4] = arg0 + 70;
				return;
			}
		}
	}

	@ObfuscatedName("SXZSKNOI.a(B)V")
	public final void method478() {
		field1054 = 0;
		field1044 = 0;
	}

	@ObfuscatedName("SXZSKNOI.a(I)Z")
	public boolean method273() {
		return false;
	}

	@ObfuscatedName("SXZSKNOI.a(IZI)V")
	public final void method479(boolean arg0, int arg1) {
		int var3 = field1041[0];
		int var4 = field1042[0];
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

		if (field1047 != -1 && JFYFSKVR.field659[field1047].field672 == 1) {
			field1047 = -1;
		}

		if (field1054 < 9) {
			field1054++;
		}

		for (int var5 = field1054; var5 > 0; var5--) {
			field1041[var5] = field1041[var5 - 1];
			field1042[var5] = field1042[var5 - 1];
			field1057[var5] = field1057[var5 - 1];
		}

		field1041[0] = var3;
		field1042[0] = var4;
		field1057[0] = arg0;
	}

	@ObfuscatedName("SXZSKNOI.a(IIIZ)V")
	public final void method480(int arg0, int arg1, boolean arg2) {
		if (field1047 != -1 && JFYFSKVR.field659[field1047].field672 == 1) {
			field1047 = -1;
		}

		if (!arg2) {
			int var4 = arg0 - field1041[0];
			int var5 = arg1 - field1042[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (field1054 < 9) {
					field1054++;
				}

				for (int var6 = field1054; var6 > 0; var6--) {
					field1041[var6] = field1041[var6 - 1];
					field1042[var6] = field1042[var6 - 1];
					field1057[var6] = field1057[var6 - 1];
				}

				field1041[0] = arg0;
				field1042[0] = arg1;
				field1057[0] = false;
				return;
			}
		}

		field1054 = 0;
		field1044 = 0;
		field1062 = 0;
		field1041[0] = arg0;
		field1042[0] = arg1;
		field1019 = field1041[0] * 128 + field1055 * 64;
		field1020 = field1042[0] * 128 + field1055 * 64;
	}
}
