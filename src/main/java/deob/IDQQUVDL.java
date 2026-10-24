package deob;

@ObfuscatedName("IDQQUVDL")
public class IDQQUVDL {

	@ObfuscatedName("IDQQUVDL.f")
	public int field741 = -1;

	@ObfuscatedName("IDQQUVDL.h")
	public int[] field743 = new int[6];

	@ObfuscatedName("IDQQUVDL.i")
	public int[] field744 = new int[6];

	@ObfuscatedName("IDQQUVDL.j")
	public int field745 = 128;

	@ObfuscatedName("IDQQUVDL.k")
	public int field746 = 128;

	@ObfuscatedName("IDQQUVDL.o")
	public static GOHJFVWE field750 = new GOHJFVWE(30);

	@ObfuscatedName("IDQQUVDL.b")
	public static int field737;

	@ObfuscatedName("IDQQUVDL.d")
	public int field739;

	@ObfuscatedName("IDQQUVDL.e")
	public int field740;

	@ObfuscatedName("IDQQUVDL.l")
	public int field747;

	@ObfuscatedName("IDQQUVDL.m")
	public int field748;

	@ObfuscatedName("IDQQUVDL.n")
	public int field749;

	@ObfuscatedName("IDQQUVDL.g")
	public CGWBYVFN field742;

	@ObfuscatedName("IDQQUVDL.c")
	public static IDQQUVDL[] field738;

	@ObfuscatedName("IDQQUVDL.a(LOTSGNSQM;Z)V")
	public static void method231(OTSGNSQM arg0) {
		YOXDZEVD var1 = new YOXDZEVD(arg0.method376("spotanim.dat", null));
		field737 = var1.method551();
		if (field738 == null) {
			field738 = new IDQQUVDL[field737];
		}

		for (int var2 = 0; var2 < field737; var2++) {
			if (field738[var2] == null) {
				field738[var2] = new IDQQUVDL();
			}

			field738[var2].field739 = var2;
			field738[var2].method232(var1);
		}
	}

	@ObfuscatedName("IDQQUVDL.a(BLYOXDZEVD;)V")
	public void method232(YOXDZEVD arg0) {
		while (true) {
			int var2 = arg0.method549();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field740 = arg0.method551();
			} else if (var2 == 2) {
				field741 = arg0.method551();
				if (CGWBYVFN.field150 != null) {
					field742 = CGWBYVFN.field150[field741];
				}
			} else if (var2 == 4) {
				field745 = arg0.method551();
			} else if (var2 == 5) {
				field746 = arg0.method551();
			} else if (var2 == 6) {
				field747 = arg0.method551();
			} else if (var2 == 7) {
				field748 = arg0.method549();
			} else if (var2 == 8) {
				field749 = arg0.method549();
			} else if (var2 >= 40 && var2 < 50) {
				field743[var2 - 40] = arg0.method551();
			} else if (var2 >= 50 && var2 < 60) {
				field744[var2 - 50] = arg0.method551();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("IDQQUVDL.a()LOIBEFFXI;")
	public OIBEFFXI method233() {
		OIBEFFXI var1 = (OIBEFFXI) field750.method227(field739);
		if (var1 != null) {
			return var1;
		}

		OIBEFFXI var2 = OIBEFFXI.method346(field740);
		if (var2 == null) {
			return null;
		}

		for (int var3 = 0; var3 < 6; var3++) {
			if (field743[0] != 0) {
				var2.method360(field743[var3], field744[var3]);
			}
		}

		field750.method228(var2, field739);
		return var2;
	}
}
