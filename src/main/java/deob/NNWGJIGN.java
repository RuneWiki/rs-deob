package deob;

@ObfuscatedName("NNWGJIGN")
public abstract class NNWGJIGN extends JNFESWRD {

	@ObfuscatedName("NNWGJIGN.l")
	public int field965 = 200;

	@ObfuscatedName("NNWGJIGN.m")
	public boolean[] field966 = new boolean[10];

	@ObfuscatedName("NNWGJIGN.n")
	public int field967 = -1;

	@ObfuscatedName("NNWGJIGN.o")
	public int field968 = -1;

	@ObfuscatedName("NNWGJIGN.D")
	public int field982 = -1000;

	@ObfuscatedName("NNWGJIGN.I")
	public boolean field987 = false;

	@ObfuscatedName("NNWGJIGN.J")
	public int field988 = -1;

	@ObfuscatedName("NNWGJIGN.M")
	public int field991 = 1;

	@ObfuscatedName("NNWGJIGN.O")
	public int field992 = 32;

	@ObfuscatedName("NNWGJIGN.Q")
	public int field994 = -1;

	@ObfuscatedName("NNWGJIGN.R")
	public int field995 = -1;

	@ObfuscatedName("NNWGJIGN.Y")
	public int[] field1001 = new int[4];

	@ObfuscatedName("NNWGJIGN.Z")
	public int[] field1002 = new int[4];

	@ObfuscatedName("NNWGJIGN.ab")
	public int[] field1003 = new int[4];

	@ObfuscatedName("NNWGJIGN.bb")
	public int field1004 = 100;

	@ObfuscatedName("NNWGJIGN.cb")
	public int field1005 = -1;

	@ObfuscatedName("NNWGJIGN.db")
	public int field1006 = -1;

	@ObfuscatedName("NNWGJIGN.eb")
	public int field1007 = -1;

	@ObfuscatedName("NNWGJIGN.fb")
	public int field1008 = -1;

	@ObfuscatedName("NNWGJIGN.gb")
	public int field1009 = -1;

	@ObfuscatedName("NNWGJIGN.nb")
	public int field1016 = -1;

	@ObfuscatedName("NNWGJIGN.ob")
	public int[] field1017 = new int[10];

	@ObfuscatedName("NNWGJIGN.pb")
	public int[] field1018 = new int[10];

	@ObfuscatedName("NNWGJIGN.X")
	public int field1000;

	@ObfuscatedName("NNWGJIGN.hb")
	public int field1010;

	@ObfuscatedName("NNWGJIGN.ib")
	public int field1011;

	@ObfuscatedName("NNWGJIGN.jb")
	public int field1012;

	@ObfuscatedName("NNWGJIGN.kb")
	public int field1013;

	@ObfuscatedName("NNWGJIGN.lb")
	public int field1014;

	@ObfuscatedName("NNWGJIGN.mb")
	public int field1015;

	@ObfuscatedName("NNWGJIGN.k")
	public int field964;

	@ObfuscatedName("NNWGJIGN.p")
	public int field969;

	@ObfuscatedName("NNWGJIGN.q")
	public int field970;

	@ObfuscatedName("NNWGJIGN.s")
	public int field971;

	@ObfuscatedName("NNWGJIGN.t")
	public int field972;

	@ObfuscatedName("NNWGJIGN.u")
	public int field973;

	@ObfuscatedName("NNWGJIGN.v")
	public int field974;

	@ObfuscatedName("NNWGJIGN.w")
	public int field975;

	@ObfuscatedName("NNWGJIGN.x")
	public int field976;

	@ObfuscatedName("NNWGJIGN.y")
	public int field977;

	@ObfuscatedName("NNWGJIGN.z")
	public int field978;

	@ObfuscatedName("NNWGJIGN.A")
	public int field979;

	@ObfuscatedName("NNWGJIGN.B")
	public int field980;

	@ObfuscatedName("NNWGJIGN.C")
	public int field981;

	@ObfuscatedName("NNWGJIGN.E")
	public int field983;

	@ObfuscatedName("NNWGJIGN.F")
	public int field984;

	@ObfuscatedName("NNWGJIGN.G")
	public int field985;

	@ObfuscatedName("NNWGJIGN.K")
	public int field989;

	@ObfuscatedName("NNWGJIGN.L")
	public int field990;

	@ObfuscatedName("NNWGJIGN.P")
	public int field993;

	@ObfuscatedName("NNWGJIGN.S")
	public int field996;

	@ObfuscatedName("NNWGJIGN.T")
	public int field997;

	@ObfuscatedName("NNWGJIGN.U")
	public int field998;

	@ObfuscatedName("NNWGJIGN.V")
	public int field999;

	@ObfuscatedName("NNWGJIGN.H")
	public String field986;

	@ObfuscatedName("NNWGJIGN.a(I)Z")
	public boolean method325() {
		return false;
	}

	@ObfuscatedName("NNWGJIGN.a(IIBI)V")
	public final void method342(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 4; var4++) {
			if (field1003[var4] <= arg1) {
				field1001[var4] = arg2;
				field1002[var4] = arg0;
				field1003[var4] = arg1 + 70;
				return;
			}
		}
	}

	@ObfuscatedName("NNWGJIGN.a(IIZ)V")
	public final void method343(int arg0, boolean arg1) {
		int var3 = field1017[0];
		int var4 = field1018[0];
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

		if (field1009 != -1 && KMWMLVIH.field825[field1009].field838 == 1) {
			field1009 = -1;
		}

		if (field993 < 9) {
			field993++;
		}

		for (int var5 = field993; var5 > 0; var5--) {
			field1017[var5] = field1017[var5 - 1];
			field1018[var5] = field1018[var5 - 1];
			field966[var5] = field966[var5 - 1];
		}

		field1017[0] = var3;
		field1018[0] = var4;
		field966[0] = arg1;
	}

	@ObfuscatedName("NNWGJIGN.a(IZZI)V")
	public final void method344(int arg0, boolean arg1, int arg2) {
		if (field1009 != -1 && KMWMLVIH.field825[field1009].field838 == 1) {
			field1009 = -1;
		}

		if (!arg1) {
			int var4 = arg2 - field1017[0];
			int var5 = arg0 - field1018[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (field993 < 9) {
					field993++;
				}

				for (int var6 = field993; var6 > 0; var6--) {
					field1017[var6] = field1017[var6 - 1];
					field1018[var6] = field1018[var6 - 1];
					field966[var6] = field966[var6 - 1];
				}

				field1017[0] = arg2;
				field1018[0] = arg0;
				field966[0] = false;
				return;
			}
		}

		field993 = 0;
		field1014 = 0;
		field1015 = 0;
		field1017[0] = arg2;
		field1018[0] = arg0;
		field972 = field1017[0] * 128 + field991 * 64;
		field973 = field1018[0] * 128 + field991 * 64;
	}

	@ObfuscatedName("NNWGJIGN.b(Z)V")
	public final void method345() {
		field993 = 0;
		field1014 = 0;
	}
}
