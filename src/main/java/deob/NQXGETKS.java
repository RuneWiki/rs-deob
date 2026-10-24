package deob;

@ObfuscatedName("NQXGETKS")
public abstract class NQXGETKS extends TDBSBQNI {

	@ObfuscatedName("NQXGETKS.l")
	public int field969 = -1;

	@ObfuscatedName("NQXGETKS.r")
	public int[] field975 = new int[10];

	@ObfuscatedName("NQXGETKS.s")
	public int[] field976 = new int[10];

	@ObfuscatedName("NQXGETKS.x")
	public int field981 = -1;

	@ObfuscatedName("NQXGETKS.y")
	public int field982 = -1;

	@ObfuscatedName("NQXGETKS.z")
	public int field983 = -1;

	@ObfuscatedName("NQXGETKS.A")
	public int field984 = -1;

	@ObfuscatedName("NQXGETKS.B")
	public int[] field985 = new int[4];

	@ObfuscatedName("NQXGETKS.C")
	public int[] field986 = new int[4];

	@ObfuscatedName("NQXGETKS.D")
	public int[] field987 = new int[4];

	@ObfuscatedName("NQXGETKS.E")
	public boolean[] field988 = new boolean[10];

	@ObfuscatedName("NQXGETKS.F")
	public int field989 = -1;

	@ObfuscatedName("NQXGETKS.G")
	public int field990 = -1;

	@ObfuscatedName("NQXGETKS.I")
	public int field992 = 1;

	@ObfuscatedName("NQXGETKS.J")
	public int field993 = 100;

	@ObfuscatedName("NQXGETKS.K")
	public int field994 = 200;

	@ObfuscatedName("NQXGETKS.Q")
	public int field999 = -1;

	@ObfuscatedName("NQXGETKS.S")
	public int field1001 = 32;

	@ObfuscatedName("NQXGETKS.T")
	public int field1002 = -1;

	@ObfuscatedName("NQXGETKS.W")
	public boolean field1005 = false;

	@ObfuscatedName("NQXGETKS.Y")
	public int field1007 = -1;

	@ObfuscatedName("NQXGETKS.gb")
	public int field1015 = -1;

	@ObfuscatedName("NQXGETKS.lb")
	public int field1020 = -1000;

	@ObfuscatedName("NQXGETKS.R")
	public int field1000;

	@ObfuscatedName("NQXGETKS.U")
	public int field1003;

	@ObfuscatedName("NQXGETKS.V")
	public int field1004;

	@ObfuscatedName("NQXGETKS.Z")
	public int field1008;

	@ObfuscatedName("NQXGETKS.ab")
	public int field1009;

	@ObfuscatedName("NQXGETKS.bb")
	public int field1010;

	@ObfuscatedName("NQXGETKS.cb")
	public int field1011;

	@ObfuscatedName("NQXGETKS.db")
	public int field1012;

	@ObfuscatedName("NQXGETKS.eb")
	public int field1013;

	@ObfuscatedName("NQXGETKS.fb")
	public int field1014;

	@ObfuscatedName("NQXGETKS.hb")
	public int field1016;

	@ObfuscatedName("NQXGETKS.ib")
	public int field1017;

	@ObfuscatedName("NQXGETKS.jb")
	public int field1018;

	@ObfuscatedName("NQXGETKS.kb")
	public int field1019;

	@ObfuscatedName("NQXGETKS.mb")
	public int field1021;

	@ObfuscatedName("NQXGETKS.nb")
	public int field1022;

	@ObfuscatedName("NQXGETKS.k")
	public int field968;

	@ObfuscatedName("NQXGETKS.m")
	public int field970;

	@ObfuscatedName("NQXGETKS.n")
	public int field971;

	@ObfuscatedName("NQXGETKS.o")
	public int field972;

	@ObfuscatedName("NQXGETKS.p")
	public int field973;

	@ObfuscatedName("NQXGETKS.q")
	public int field974;

	@ObfuscatedName("NQXGETKS.t")
	public int field977;

	@ObfuscatedName("NQXGETKS.u")
	public int field978;

	@ObfuscatedName("NQXGETKS.v")
	public int field979;

	@ObfuscatedName("NQXGETKS.w")
	public int field980;

	@ObfuscatedName("NQXGETKS.H")
	public int field991;

	@ObfuscatedName("NQXGETKS.L")
	public int field995;

	@ObfuscatedName("NQXGETKS.M")
	public int field996;

	@ObfuscatedName("NQXGETKS.O")
	public int field997;

	@ObfuscatedName("NQXGETKS.P")
	public int field998;

	@ObfuscatedName("NQXGETKS.X")
	public String field1006;

	@ObfuscatedName("NQXGETKS.b(B)V")
	public final void method427() {
		field998 = 0;
		field980 = 0;
	}

	@ObfuscatedName("NQXGETKS.a(IZZ)V")
	public final void method428(int arg0, boolean arg1) {
		int var3 = field975[0];
		int var4 = field976[0];
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

		if (field1015 != -1 && EHYLCNJX.field744[field1015].field757 == 1) {
			field1015 = -1;
		}

		if (field998 < 9) {
			field998++;
		}

		for (int var5 = field998; var5 > 0; var5--) {
			field975[var5] = field975[var5 - 1];
			field976[var5] = field976[var5 - 1];
			field988[var5] = field988[var5 - 1];
		}

		field975[0] = var3;
		field976[0] = var4;
		field988[0] = arg1;
	}

	@ObfuscatedName("NQXGETKS.a(I)Z")
	public boolean method429() {
		return false;
	}

	@ObfuscatedName("NQXGETKS.a(IIBZ)V")
	public final void method430(int arg0, int arg1, boolean arg2) {
		if (field1015 != -1 && EHYLCNJX.field744[field1015].field757 == 1) {
			field1015 = -1;
		}

		if (!arg2) {
			int var4 = arg0 - field975[0];
			int var5 = arg1 - field976[0];
			if (var4 >= -8 && var4 <= 8 && var5 >= -8 && var5 <= 8) {
				if (field998 < 9) {
					field998++;
				}

				for (int var6 = field998; var6 > 0; var6--) {
					field975[var6] = field975[var6 - 1];
					field976[var6] = field976[var6 - 1];
					field988[var6] = field988[var6 - 1];
				}

				field975[0] = arg0;
				field976[0] = arg1;
				field988[0] = false;
				return;
			}
		}

		field998 = 0;
		field980 = 0;
		field1000 = 0;
		field975[0] = arg0;
		field976[0] = arg1;
		field977 = field975[0] * 128 + field992 * 64;
		field978 = field976[0] * 128 + field992 * 64;
	}

	@ObfuscatedName("NQXGETKS.a(IIZI)V")
	public final void method431(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < 4; var4++) {
			if (field987[var4] <= arg1) {
				field985[var4] = arg0;
				field986[var4] = arg2;
				field987[var4] = arg1 + 70;
				return;
			}
		}
	}
}
