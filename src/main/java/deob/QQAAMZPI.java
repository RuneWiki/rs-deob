package deob;

@ObfuscatedName("QQAAMZPI")
public class QQAAMZPI extends FKSXNQOK {

	@ObfuscatedName("QQAAMZPI.l")
	public int field991 = -1;

	@ObfuscatedName("QQAAMZPI.A")
	public int field1006 = 1;

	@ObfuscatedName("QQAAMZPI.B")
	public int[] field1007 = new int[10];

	@ObfuscatedName("QQAAMZPI.C")
	public int[] field1008 = new int[10];

	@ObfuscatedName("QQAAMZPI.D")
	public int field1009 = -1;

	@ObfuscatedName("QQAAMZPI.E")
	public int field1010 = -1;

	@ObfuscatedName("QQAAMZPI.I")
	public int field1013 = -1;

	@ObfuscatedName("QQAAMZPI.T")
	public int field1023 = 100;

	@ObfuscatedName("QQAAMZPI.V")
	public int field1024 = 200;

	@ObfuscatedName("QQAAMZPI.X")
	public boolean[] field1026 = new boolean[10];

	@ObfuscatedName("QQAAMZPI.Y")
	public int field1027 = -1;

	@ObfuscatedName("QQAAMZPI.Z")
	public int field1028 = -1;

	@ObfuscatedName("QQAAMZPI.ab")
	public int field1029 = -1000;

	@ObfuscatedName("QQAAMZPI.db")
	public int[] field1032 = new int[4];

	@ObfuscatedName("QQAAMZPI.eb")
	public int[] field1033 = new int[4];

	@ObfuscatedName("QQAAMZPI.fb")
	public int[] field1034 = new int[4];

	@ObfuscatedName("QQAAMZPI.gb")
	public int field1035 = -1;

	@ObfuscatedName("QQAAMZPI.lb")
	public boolean field1040 = false;

	@ObfuscatedName("QQAAMZPI.mb")
	public int field1041 = -1;

	@ObfuscatedName("QQAAMZPI.nb")
	public int field1042 = -1;

	@ObfuscatedName("QQAAMZPI.ob")
	public int field1043 = -1;

	@ObfuscatedName("QQAAMZPI.pb")
	public int field1044 = -1;

	@ObfuscatedName("QQAAMZPI.qb")
	public int field1045 = 32;

	@ObfuscatedName("QQAAMZPI.u")
	public int field1000;

	@ObfuscatedName("QQAAMZPI.v")
	public int field1001;

	@ObfuscatedName("QQAAMZPI.w")
	public int field1002;

	@ObfuscatedName("QQAAMZPI.x")
	public int field1003;

	@ObfuscatedName("QQAAMZPI.y")
	public int field1004;

	@ObfuscatedName("QQAAMZPI.z")
	public int field1005;

	@ObfuscatedName("QQAAMZPI.G")
	public int field1011;

	@ObfuscatedName("QQAAMZPI.H")
	public int field1012;

	@ObfuscatedName("QQAAMZPI.J")
	public int field1014;

	@ObfuscatedName("QQAAMZPI.K")
	public int field1015;

	@ObfuscatedName("QQAAMZPI.L")
	public int field1016;

	@ObfuscatedName("QQAAMZPI.N")
	public int field1017;

	@ObfuscatedName("QQAAMZPI.O")
	public int field1018;

	@ObfuscatedName("QQAAMZPI.P")
	public int field1019;

	@ObfuscatedName("QQAAMZPI.Q")
	public int field1020;

	@ObfuscatedName("QQAAMZPI.R")
	public int field1021;

	@ObfuscatedName("QQAAMZPI.S")
	public int field1022;

	@ObfuscatedName("QQAAMZPI.W")
	public int field1025;

	@ObfuscatedName("QQAAMZPI.bb")
	public int field1030;

	@ObfuscatedName("QQAAMZPI.cb")
	public int field1031;

	@ObfuscatedName("QQAAMZPI.hb")
	public int field1036;

	@ObfuscatedName("QQAAMZPI.ib")
	public int field1037;

	@ObfuscatedName("QQAAMZPI.jb")
	public int field1038;

	@ObfuscatedName("QQAAMZPI.kb")
	public int field1039;

	@ObfuscatedName("QQAAMZPI.m")
	public int field992;

	@ObfuscatedName("QQAAMZPI.n")
	public int field993;

	@ObfuscatedName("QQAAMZPI.o")
	public int field994;

	@ObfuscatedName("QQAAMZPI.p")
	public int field995;

	@ObfuscatedName("QQAAMZPI.r")
	public int field997;

	@ObfuscatedName("QQAAMZPI.s")
	public int field998;

	@ObfuscatedName("QQAAMZPI.t")
	public int field999;

	@ObfuscatedName("QQAAMZPI.q")
	public String field996;

	@ObfuscatedName("QQAAMZPI.a(Z)Z")
	public boolean method244() {
		return false;
	}

	@ObfuscatedName("QQAAMZPI.a(BIZ)V")
	public final void method439(int arg0, boolean arg1) {
		int var3 = field1007[0];
		int var4 = field1008[0];
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

		if (field1035 != -1 && LCRVYGCP.field795[field1035].field808 == 1) {
			field1035 = -1;
		}

		if (field1005 < 9) {
			field1005++;
		}

		for (int var5 = field1005; var5 > 0; var5--) {
			field1007[var5] = field1007[var5 - 1];
			field1008[var5] = field1008[var5 - 1];
			field1026[var5] = field1026[var5 - 1];
		}

		field1007[0] = var3;
		field1008[0] = var4;
		field1026[0] = arg1;
	}

	@ObfuscatedName("QQAAMZPI.a(IZII)V")
	public final void method440(int arg0, boolean arg1, int arg2) {
		if (field1035 != -1 && LCRVYGCP.field795[field1035].field808 == 1) {
			field1035 = -1;
		}

		if (!arg1) {
			int var4 = arg2 - field1007[0];
			int var5 = arg0 - field1008[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (field1005 < 9) {
					field1005++;
				}

				for (int var6 = field1005; var6 > 0; var6--) {
					field1007[var6] = field1007[var6 - 1];
					field1008[var6] = field1008[var6 - 1];
					field1026[var6] = field1026[var6 - 1];
				}

				field1007[0] = arg2;
				field1008[0] = arg0;
				field1026[0] = false;
				return;
			}
		}

		field1005 = 0;
		field1016 = 0;
		field1018 = 0;
		field1007[0] = arg2;
		field1008[0] = arg0;
		field1019 = field1007[0] * 128 + field1006 * 64;
		field1020 = field1008[0] * 128 + field1006 * 64;
	}

	@ObfuscatedName("QQAAMZPI.b(I)V")
	public final void method441() {
		field1005 = 0;
		field1016 = 0;
	}

	@ObfuscatedName("QQAAMZPI.a(IIII)V")
	public final void method442(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 4; var4++) {
			if (field1034[var4] <= arg2) {
				field1032[var4] = arg0;
				field1033[var4] = arg1;
				field1034[var4] = arg2 + 70;
				return;
			}
		}
	}
}
