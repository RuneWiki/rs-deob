package deob;

@ObfuscatedName("BRGDZOWQ")
public class BRGDZOWQ {

	@ObfuscatedName("BRGDZOWQ.g")
	public int field11 = -1;

	@ObfuscatedName("BRGDZOWQ.i")
	public int[] field13 = new int[6];

	@ObfuscatedName("BRGDZOWQ.j")
	public int[] field14 = new int[6];

	@ObfuscatedName("BRGDZOWQ.k")
	public int field15 = 128;

	@ObfuscatedName("BRGDZOWQ.l")
	public int field16 = 128;

	@ObfuscatedName("BRGDZOWQ.p")
	public static LSQNLJTA field20 = new LSQNLJTA(30);

	@ObfuscatedName("BRGDZOWQ.f")
	public int field10;

	@ObfuscatedName("BRGDZOWQ.m")
	public int field17;

	@ObfuscatedName("BRGDZOWQ.n")
	public int field18;

	@ObfuscatedName("BRGDZOWQ.o")
	public int field19;

	@ObfuscatedName("BRGDZOWQ.c")
	public static int field7;

	@ObfuscatedName("BRGDZOWQ.e")
	public int field9;

	@ObfuscatedName("BRGDZOWQ.h")
	public IUTBNGPH field12;

	@ObfuscatedName("BRGDZOWQ.d")
	public static BRGDZOWQ[] field8;

	@ObfuscatedName("BRGDZOWQ.a(LVSUYIIVA;I)V")
	public static void method9(VSUYIIVA arg0) {
		CFARFRSG var1 = new CFARFRSG(arg0.method570("spotanim.dat", null));
		field7 = var1.method32();
		if (field8 == null) {
			field8 = new BRGDZOWQ[field7];
		}

		for (int var2 = 0; var2 < field7; var2++) {
			if (field8[var2] == null) {
				field8[var2] = new BRGDZOWQ();
			}

			field8[var2].field9 = var2;
			field8[var2].method10(var1);
		}
	}

	@ObfuscatedName("BRGDZOWQ.a(LCFARFRSG;I)V")
	public void method10(CFARFRSG arg0) {
		while (true) {
			int var2 = arg0.method30();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field10 = arg0.method32();
			} else if (var2 == 2) {
				field11 = arg0.method32();
				if (IUTBNGPH.field682 != null) {
					field12 = IUTBNGPH.field682[field11];
				}
			} else if (var2 == 4) {
				field15 = arg0.method32();
			} else if (var2 == 5) {
				field16 = arg0.method32();
			} else if (var2 == 6) {
				field17 = arg0.method32();
			} else if (var2 == 7) {
				field18 = arg0.method30();
			} else if (var2 == 8) {
				field19 = arg0.method30();
			} else if (var2 >= 40 && var2 < 50) {
				field13[var2 - 40] = arg0.method32();
			} else if (var2 >= 50 && var2 < 60) {
				field14[var2 - 50] = arg0.method32();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("BRGDZOWQ.a()LLFTMDGKK;")
	public LFTMDGKK method11() {
		LFTMDGKK var1 = (LFTMDGKK) field20.method369(field9);
		if (var1 != null) {
			return var1;
		}

		LFTMDGKK var2 = LFTMDGKK.method341(field10);
		if (var2 == null) {
			return null;
		}

		for (int var3 = 0; var3 < 6; var3++) {
			if (field13[0] != 0) {
				var2.method355(field13[var3], field14[var3]);
			}
		}

		field20.method370(var2, field9);
		return var2;
	}
}
