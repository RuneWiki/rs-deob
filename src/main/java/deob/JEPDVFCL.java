package deob;

@ObfuscatedName("JEPDVFCL")
public class JEPDVFCL {

	@ObfuscatedName("JEPDVFCL.g")
	public int field796 = -1;

	@ObfuscatedName("JEPDVFCL.i")
	public int[] field798 = new int[6];

	@ObfuscatedName("JEPDVFCL.j")
	public int[] field799 = new int[6];

	@ObfuscatedName("JEPDVFCL.k")
	public int field800 = 128;

	@ObfuscatedName("JEPDVFCL.l")
	public int field801 = 128;

	@ObfuscatedName("JEPDVFCL.p")
	public static HARAZQMH field805 = new HARAZQMH(30);

	@ObfuscatedName("JEPDVFCL.c")
	public static int field792;

	@ObfuscatedName("JEPDVFCL.e")
	public int field794;

	@ObfuscatedName("JEPDVFCL.f")
	public int field795;

	@ObfuscatedName("JEPDVFCL.m")
	public int field802;

	@ObfuscatedName("JEPDVFCL.n")
	public int field803;

	@ObfuscatedName("JEPDVFCL.o")
	public int field804;

	@ObfuscatedName("JEPDVFCL.h")
	public XRDQTWLL field797;

	@ObfuscatedName("JEPDVFCL.d")
	public static JEPDVFCL[] field793;

	@ObfuscatedName("JEPDVFCL.a(ILUUIGNTAD;)V")
	public static void method330(UUIGNTAD arg0) {
		CMGGUSPR var1 = new CMGGUSPR(arg0.method545("spotanim.dat", null));
		field792 = var1.method196();
		if (field793 == null) {
			field793 = new JEPDVFCL[field792];
		}

		for (int var2 = 0; var2 < field792; var2++) {
			if (field793[var2] == null) {
				field793[var2] = new JEPDVFCL();
			}

			field793[var2].field794 = var2;
			field793[var2].method331(var1);
		}
	}

	@ObfuscatedName("JEPDVFCL.a(LCMGGUSPR;I)V")
	public void method331(CMGGUSPR arg0) {
		while (true) {
			int var2 = arg0.method194();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field795 = arg0.method196();
			} else if (var2 == 2) {
				field796 = arg0.method196();
				if (XRDQTWLL.field1418 != null) {
					field797 = XRDQTWLL.field1418[field796];
				}
			} else if (var2 == 4) {
				field800 = arg0.method196();
			} else if (var2 == 5) {
				field801 = arg0.method196();
			} else if (var2 == 6) {
				field802 = arg0.method196();
			} else if (var2 == 7) {
				field803 = arg0.method194();
			} else if (var2 == 8) {
				field804 = arg0.method194();
			} else if (var2 >= 40 && var2 < 50) {
				field798[var2 - 40] = arg0.method196();
			} else if (var2 >= 50 && var2 < 60) {
				field799[var2 - 50] = arg0.method196();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("JEPDVFCL.a()LGCSAWSJV;")
	public GCSAWSJV method332() {
		GCSAWSJV var1 = (GCSAWSJV) field805.method299(field794);
		if (var1 != null) {
			return var1;
		}

		GCSAWSJV var2 = GCSAWSJV.method260(field795);
		if (var2 == null) {
			return null;
		}

		for (int var3 = 0; var3 < 6; var3++) {
			if (field798[0] != 0) {
				var2.method274(field798[var3], field799[var3]);
			}
		}

		field805.method300(field794, var2);
		return var2;
	}
}
