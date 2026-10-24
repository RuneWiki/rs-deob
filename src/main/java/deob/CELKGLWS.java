package deob;

@ObfuscatedName("CELKGLWS")
public abstract class CELKGLWS extends DKQKXOQO {

	@ObfuscatedName("CELKGLWS.m")
	public int[] field143 = new int[10];

	@ObfuscatedName("CELKGLWS.n")
	public int[] field144 = new int[10];

	@ObfuscatedName("CELKGLWS.o")
	public int field145 = -1;

	@ObfuscatedName("CELKGLWS.r")
	public int field148 = -1;

	@ObfuscatedName("CELKGLWS.s")
	public int field149 = -1;

	@ObfuscatedName("CELKGLWS.t")
	public int field150 = -1;

	@ObfuscatedName("CELKGLWS.u")
	public int field151 = -1;

	@ObfuscatedName("CELKGLWS.v")
	public boolean[] field152 = new boolean[10];

	@ObfuscatedName("CELKGLWS.z")
	public int field156 = 1;

	@ObfuscatedName("CELKGLWS.I")
	public int field165 = -1;

	@ObfuscatedName("CELKGLWS.N")
	public int[] field170 = new int[4];

	@ObfuscatedName("CELKGLWS.O")
	public int[] field171 = new int[4];

	@ObfuscatedName("CELKGLWS.P")
	public int[] field172 = new int[4];

	@ObfuscatedName("CELKGLWS.S")
	public int field174 = 100;

	@ObfuscatedName("CELKGLWS.X")
	public int field178 = -1000;

	@ObfuscatedName("CELKGLWS.ab")
	public int field181 = 32;

	@ObfuscatedName("CELKGLWS.bb")
	public boolean field182 = false;

	@ObfuscatedName("CELKGLWS.cb")
	public int field183 = -1;

	@ObfuscatedName("CELKGLWS.ib")
	public int field189 = -1;

	@ObfuscatedName("CELKGLWS.jb")
	public int field190 = 200;

	@ObfuscatedName("CELKGLWS.pb")
	public int field195 = -1;

	@ObfuscatedName("CELKGLWS.qb")
	public int field196 = -1;

	@ObfuscatedName("CELKGLWS.rb")
	public int field197 = -1;

	@ObfuscatedName("CELKGLWS.p")
	public int field146;

	@ObfuscatedName("CELKGLWS.q")
	public int field147;

	@ObfuscatedName("CELKGLWS.w")
	public int field153;

	@ObfuscatedName("CELKGLWS.x")
	public int field154;

	@ObfuscatedName("CELKGLWS.y")
	public int field155;

	@ObfuscatedName("CELKGLWS.A")
	public int field157;

	@ObfuscatedName("CELKGLWS.B")
	public int field158;

	@ObfuscatedName("CELKGLWS.C")
	public int field159;

	@ObfuscatedName("CELKGLWS.D")
	public int field160;

	@ObfuscatedName("CELKGLWS.E")
	public int field161;

	@ObfuscatedName("CELKGLWS.F")
	public int field162;

	@ObfuscatedName("CELKGLWS.G")
	public int field163;

	@ObfuscatedName("CELKGLWS.H")
	public int field164;

	@ObfuscatedName("CELKGLWS.J")
	public int field166;

	@ObfuscatedName("CELKGLWS.K")
	public int field167;

	@ObfuscatedName("CELKGLWS.L")
	public int field168;

	@ObfuscatedName("CELKGLWS.M")
	public int field169;

	@ObfuscatedName("CELKGLWS.Q")
	public int field173;

	@ObfuscatedName("CELKGLWS.U")
	public int field175;

	@ObfuscatedName("CELKGLWS.V")
	public int field176;

	@ObfuscatedName("CELKGLWS.W")
	public int field177;

	@ObfuscatedName("CELKGLWS.Y")
	public int field179;

	@ObfuscatedName("CELKGLWS.Z")
	public int field180;

	@ObfuscatedName("CELKGLWS.db")
	public int field184;

	@ObfuscatedName("CELKGLWS.eb")
	public int field185;

	@ObfuscatedName("CELKGLWS.fb")
	public int field186;

	@ObfuscatedName("CELKGLWS.gb")
	public int field187;

	@ObfuscatedName("CELKGLWS.lb")
	public int field191;

	@ObfuscatedName("CELKGLWS.mb")
	public int field192;

	@ObfuscatedName("CELKGLWS.nb")
	public int field193;

	@ObfuscatedName("CELKGLWS.ob")
	public int field194;

	@ObfuscatedName("CELKGLWS.hb")
	public String field188;

	@ObfuscatedName("CELKGLWS.b(I)Z")
	public boolean method42() {
		return false;
	}

	@ObfuscatedName("CELKGLWS.a(ZZII)V")
	public final void method43(boolean arg0, int arg1, int arg2) {
		if (field183 != -1 && XETSOHUA.field1474[field183].field1487 == 1) {
			field183 = -1;
		}

		if (!arg0) {
			int var4 = arg2 - field143[0];
			int var5 = arg1 - field144[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (field173 < 9) {
					field173++;
				}

				for (int var6 = field173; var6 > 0; var6--) {
					field143[var6] = field143[var6 - 1];
					field144[var6] = field144[var6 - 1];
					field152[var6] = field152[var6 - 1];
				}

				field143[0] = arg2;
				field144[0] = arg1;
				field152[0] = false;
				return;
			}
		}

		field173 = 0;
		field176 = 0;
		field155 = 0;
		field143[0] = arg2;
		field144[0] = arg1;
		field191 = field143[0] * 128 + field156 * 64;
		field192 = field144[0] * 128 + field156 * 64;
	}

	@ObfuscatedName("CELKGLWS.a(Z)V")
	public final void method44() {
		field173 = 0;
		field176 = 0;
	}

	@ObfuscatedName("CELKGLWS.a(ZZI)V")
	public final void method45(boolean arg0, int arg1) {
		int var3 = field143[0];
		int var4 = field144[0];
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

		if (field183 != -1 && XETSOHUA.field1474[field183].field1487 == 1) {
			field183 = -1;
		}

		if (field173 < 9) {
			field173++;
		}

		for (int var5 = field173; var5 > 0; var5--) {
			field143[var5] = field143[var5 - 1];
			field144[var5] = field144[var5 - 1];
			field152[var5] = field152[var5 - 1];
		}

		field143[0] = var3;
		field144[0] = var4;
		field152[0] = arg0;
	}

	@ObfuscatedName("CELKGLWS.a(BIII)V")
	public final void method46(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 4; var4++) {
			if (field172[var4] <= arg2) {
				field170[var4] = arg0;
				field171[var4] = arg1;
				field172[var4] = arg2 + 70;
				return;
			}
		}
	}
}
