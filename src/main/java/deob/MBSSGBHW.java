package deob;

@ObfuscatedName("MBSSGBHW")
public class MBSSGBHW {

	@ObfuscatedName("MBSSGBHW.f")
	public int field930 = -1;

	@ObfuscatedName("MBSSGBHW.h")
	public int[] field932 = new int[6];

	@ObfuscatedName("MBSSGBHW.i")
	public int[] field933 = new int[6];

	@ObfuscatedName("MBSSGBHW.j")
	public int field934 = 128;

	@ObfuscatedName("MBSSGBHW.k")
	public int field935 = 128;

	@ObfuscatedName("MBSSGBHW.o")
	public static WUMSOEQS field939 = new WUMSOEQS(30);

	@ObfuscatedName("MBSSGBHW.b")
	public static int field926;

	@ObfuscatedName("MBSSGBHW.d")
	public int field928;

	@ObfuscatedName("MBSSGBHW.e")
	public int field929;

	@ObfuscatedName("MBSSGBHW.l")
	public int field936;

	@ObfuscatedName("MBSSGBHW.m")
	public int field937;

	@ObfuscatedName("MBSSGBHW.n")
	public int field938;

	@ObfuscatedName("MBSSGBHW.g")
	public JZFUUSFN field931;

	@ObfuscatedName("MBSSGBHW.c")
	public static MBSSGBHW[] field927;

	@ObfuscatedName("MBSSGBHW.a(BLIEMHZJLX;)V")
	public static void method341(IEMHZJLX arg0) {
		MVHXDWGI var1 = new MVHXDWGI(arg0.method242("spotanim.dat", null));
		field926 = var1.method359();
		if (field927 == null) {
			field927 = new MBSSGBHW[field926];
		}

		for (int var2 = 0; var2 < field926; var2++) {
			if (field927[var2] == null) {
				field927[var2] = new MBSSGBHW();
			}

			field927[var2].field928 = var2;
			field927[var2].method342(var1);
		}
	}

	@ObfuscatedName("MBSSGBHW.a(ILMVHXDWGI;)V")
	public void method342(MVHXDWGI arg0) {
		while (true) {
			int var2 = arg0.method357();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field929 = arg0.method359();
			} else if (var2 == 2) {
				field930 = arg0.method359();
				if (JZFUUSFN.field841 != null) {
					field931 = JZFUUSFN.field841[field930];
				}
			} else if (var2 == 4) {
				field934 = arg0.method359();
			} else if (var2 == 5) {
				field935 = arg0.method359();
			} else if (var2 == 6) {
				field936 = arg0.method359();
			} else if (var2 == 7) {
				field937 = arg0.method357();
			} else if (var2 == 8) {
				field938 = arg0.method357();
			} else if (var2 >= 40 && var2 < 50) {
				field932[var2 - 40] = arg0.method359();
			} else if (var2 >= 50 && var2 < 60) {
				field933[var2 - 50] = arg0.method359();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("MBSSGBHW.a()LPDVZPZLT;")
	public PDVZPZLT method343() {
		PDVZPZLT var1 = (PDVZPZLT) field939.method586(field928);
		if (var1 != null) {
			return var1;
		}

		PDVZPZLT var2 = PDVZPZLT.method414(field929);
		if (var2 == null) {
			return null;
		}

		for (int var3 = 0; var3 < 6; var3++) {
			if (field932[0] != 0) {
				var2.method428(field932[var3], field933[var3]);
			}
		}

		field939.method587(field928, var2);
		return var2;
	}
}
