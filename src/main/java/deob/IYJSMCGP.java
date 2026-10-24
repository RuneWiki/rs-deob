package deob;

@ObfuscatedName("IYJSMCGP")
public class IYJSMCGP {

	@ObfuscatedName("IYJSMCGP.i")
	public boolean field873 = false;

	@ObfuscatedName("IYJSMCGP.j")
	public boolean field874 = true;

	@ObfuscatedName("IYJSMCGP.l")
	public boolean field876 = false;

	@ObfuscatedName("IYJSMCGP.o")
	public boolean field879 = false;

	@ObfuscatedName("IYJSMCGP.p")
	public int field880 = -1;

	@ObfuscatedName("IYJSMCGP.b")
	public static int field866;

	@ObfuscatedName("IYJSMCGP.d")
	public static int field868;

	@ObfuscatedName("IYJSMCGP.g")
	public int field871;

	@ObfuscatedName("IYJSMCGP.h")
	public int field872;

	@ObfuscatedName("IYJSMCGP.k")
	public int field875;

	@ObfuscatedName("IYJSMCGP.m")
	public int field877;

	@ObfuscatedName("IYJSMCGP.n")
	public int field878;

	@ObfuscatedName("IYJSMCGP.f")
	public String field870;

	@ObfuscatedName("IYJSMCGP.e")
	public static int[] field869;

	@ObfuscatedName("IYJSMCGP.c")
	public static IYJSMCGP[] field867;

	@ObfuscatedName("IYJSMCGP.a(ILSYUGXMZF;)V")
	public static void method324(SYUGXMZF arg0) {
		KHOMSBHW var1 = new KHOMSBHW(arg0.method551("varp.dat", null));
		field868 = 0;
		field866 = var1.method351();
		if (field867 == null) {
			field867 = new IYJSMCGP[field866];
		}

		if (field869 == null) {
			field869 = new int[field866];
		}

		for (int var2 = 0; var2 < field866; var2++) {
			if (field867[var2] == null) {
				field867[var2] = new IYJSMCGP();
			}

			field867[var2].method325(var2, var1);
		}

		if (var1.field933.length != var1.field934) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("IYJSMCGP.a(ILKHOMSBHW;B)V")
	public void method325(int arg0, KHOMSBHW arg1) {
		while (true) {
			int var3 = arg1.method349();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field871 = arg1.method349();
			} else if (var3 == 2) {
				field872 = arg1.method349();
			} else if (var3 == 3) {
				field873 = true;
				field869[field868++] = arg0;
			} else if (var3 == 4) {
				field874 = false;
			} else if (var3 == 5) {
				field875 = arg1.method351();
			} else if (var3 == 6) {
				field876 = true;
			} else if (var3 == 7) {
				field877 = arg1.method354();
			} else if (var3 == 8) {
				field878 = 1;
				field879 = true;
			} else if (var3 == 10) {
				field870 = arg1.method356();
			} else if (var3 == 11) {
				field879 = true;
			} else if (var3 == 12) {
				field880 = arg1.method354();
			} else if (var3 == 13) {
				field878 = 2;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
