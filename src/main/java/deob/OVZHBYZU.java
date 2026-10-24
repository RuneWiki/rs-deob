package deob;

@ObfuscatedName("OVZHBYZU")
public class OVZHBYZU extends VIVVOUFY {

	@ObfuscatedName("OVZHBYZU.l")
	public int field1034 = -1;

	@ObfuscatedName("OVZHBYZU.o")
	public int field1037 = -1;

	@ObfuscatedName("OVZHBYZU.t")
	public int field1042 = -1;

	@ObfuscatedName("OVZHBYZU.u")
	public int field1043 = -1;

	@ObfuscatedName("OVZHBYZU.v")
	public int field1044 = -1;

	@ObfuscatedName("OVZHBYZU.w")
	public int field1045 = -1;

	@ObfuscatedName("OVZHBYZU.y")
	public int field1047 = -1;

	@ObfuscatedName("OVZHBYZU.z")
	public int field1048 = -1;

	@ObfuscatedName("OVZHBYZU.A")
	public int field1049 = 200;

	@ObfuscatedName("OVZHBYZU.C")
	public int field1050 = 1;

	@ObfuscatedName("OVZHBYZU.E")
	public int[] field1052 = new int[4];

	@ObfuscatedName("OVZHBYZU.F")
	public int[] field1053 = new int[4];

	@ObfuscatedName("OVZHBYZU.G")
	public int[] field1054 = new int[4];

	@ObfuscatedName("OVZHBYZU.H")
	public boolean[] field1055 = new boolean[10];

	@ObfuscatedName("OVZHBYZU.J")
	public boolean field1057 = false;

	@ObfuscatedName("OVZHBYZU.K")
	public int field1058 = 32;

	@ObfuscatedName("OVZHBYZU.L")
	public int field1059 = -1;

	@ObfuscatedName("OVZHBYZU.M")
	public int field1060 = -1000;

	@ObfuscatedName("OVZHBYZU.R")
	public int field1065 = 100;

	@ObfuscatedName("OVZHBYZU.hb")
	public int field1081 = -1;

	@ObfuscatedName("OVZHBYZU.mb")
	public int[] field1086 = new int[10];

	@ObfuscatedName("OVZHBYZU.nb")
	public int[] field1087 = new int[10];

	@ObfuscatedName("OVZHBYZU.ob")
	public int field1088 = -1;

	@ObfuscatedName("OVZHBYZU.m")
	public int field1035;

	@ObfuscatedName("OVZHBYZU.n")
	public int field1036;

	@ObfuscatedName("OVZHBYZU.p")
	public int field1038;

	@ObfuscatedName("OVZHBYZU.q")
	public int field1039;

	@ObfuscatedName("OVZHBYZU.r")
	public int field1040;

	@ObfuscatedName("OVZHBYZU.s")
	public int field1041;

	@ObfuscatedName("OVZHBYZU.D")
	public int field1051;

	@ObfuscatedName("OVZHBYZU.I")
	public int field1056;

	@ObfuscatedName("OVZHBYZU.N")
	public int field1061;

	@ObfuscatedName("OVZHBYZU.O")
	public int field1062;

	@ObfuscatedName("OVZHBYZU.P")
	public int field1063;

	@ObfuscatedName("OVZHBYZU.Q")
	public int field1064;

	@ObfuscatedName("OVZHBYZU.S")
	public int field1066;

	@ObfuscatedName("OVZHBYZU.T")
	public int field1067;

	@ObfuscatedName("OVZHBYZU.U")
	public int field1068;

	@ObfuscatedName("OVZHBYZU.V")
	public int field1069;

	@ObfuscatedName("OVZHBYZU.W")
	public int field1070;

	@ObfuscatedName("OVZHBYZU.X")
	public int field1071;

	@ObfuscatedName("OVZHBYZU.Y")
	public int field1072;

	@ObfuscatedName("OVZHBYZU.Z")
	public int field1073;

	@ObfuscatedName("OVZHBYZU.ab")
	public int field1074;

	@ObfuscatedName("OVZHBYZU.bb")
	public int field1075;

	@ObfuscatedName("OVZHBYZU.cb")
	public int field1076;

	@ObfuscatedName("OVZHBYZU.db")
	public int field1077;

	@ObfuscatedName("OVZHBYZU.eb")
	public int field1078;

	@ObfuscatedName("OVZHBYZU.fb")
	public int field1079;

	@ObfuscatedName("OVZHBYZU.gb")
	public int field1080;

	@ObfuscatedName("OVZHBYZU.ib")
	public int field1082;

	@ObfuscatedName("OVZHBYZU.jb")
	public int field1083;

	@ObfuscatedName("OVZHBYZU.kb")
	public int field1084;

	@ObfuscatedName("OVZHBYZU.lb")
	public int field1085;

	@ObfuscatedName("OVZHBYZU.x")
	public String field1046;

	@ObfuscatedName("OVZHBYZU.a(Z)Z")
	public boolean method369() {
		return false;
	}

	@ObfuscatedName("OVZHBYZU.a(IIII)V")
	public final void method370(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 4; var4++) {
			if (field1054[var4] <= arg0) {
				field1052[var4] = arg2;
				field1053[var4] = arg1;
				field1054[var4] = arg0 + 70;
				return;
			}
		}
	}

	@ObfuscatedName("OVZHBYZU.a(IBZ)V")
	public final void method371(int arg0, boolean arg1) {
		int var3 = field1086[0];
		int var4 = field1087[0];
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

		if (field1081 != -1 && ISUBRNPG.field786[field1081].field799 == 1) {
			field1081 = -1;
		}

		if (field1056 < 9) {
			field1056++;
		}

		for (int var5 = field1056; var5 > 0; var5--) {
			field1086[var5] = field1086[var5 - 1];
			field1087[var5] = field1087[var5 - 1];
			field1055[var5] = field1055[var5 - 1];
		}

		field1086[0] = var3;
		field1087[0] = var4;
		field1055[0] = arg1;
	}

	@ObfuscatedName("OVZHBYZU.b(Z)V")
	public final void method372() {
		field1056 = 0;
		field1051 = 0;
	}

	@ObfuscatedName("OVZHBYZU.a(ZIZI)V")
	public final void method373(boolean arg0, int arg1, int arg2) {
		if (field1081 != -1 && ISUBRNPG.field786[field1081].field799 == 1) {
			field1081 = -1;
		}

		if (!arg0) {
			int var4 = arg2 - field1086[0];
			int var5 = arg1 - field1087[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (field1056 < 9) {
					field1056++;
				}

				for (int var6 = field1056; var6 > 0; var6--) {
					field1086[var6] = field1086[var6 - 1];
					field1087[var6] = field1087[var6 - 1];
					field1055[var6] = field1055[var6 - 1];
				}

				field1086[0] = arg2;
				field1087[0] = arg1;
				field1055[0] = false;
				return;
			}
		}

		field1056 = 0;
		field1051 = 0;
		field1066 = 0;
		field1086[0] = arg2;
		field1087[0] = arg1;
		field1069 = field1086[0] * 128 + field1050 * 64;
		field1070 = field1087[0] * 128 + field1050 * 64;
	}
}
