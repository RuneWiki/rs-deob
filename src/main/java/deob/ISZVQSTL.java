package deob;

@ObfuscatedName("ISZVQSTL")
public class ISZVQSTL {

	@ObfuscatedName("ISZVQSTL.i")
	public boolean field849 = false;

	@ObfuscatedName("ISZVQSTL.j")
	public boolean field850 = true;

	@ObfuscatedName("ISZVQSTL.l")
	public boolean field852 = false;

	@ObfuscatedName("ISZVQSTL.o")
	public boolean field855 = false;

	@ObfuscatedName("ISZVQSTL.p")
	public int field856 = -1;

	@ObfuscatedName("ISZVQSTL.q")
	public boolean field857 = true;

	@ObfuscatedName("ISZVQSTL.b")
	public static int field842;

	@ObfuscatedName("ISZVQSTL.d")
	public static int field844;

	@ObfuscatedName("ISZVQSTL.g")
	public int field847;

	@ObfuscatedName("ISZVQSTL.h")
	public int field848;

	@ObfuscatedName("ISZVQSTL.k")
	public int field851;

	@ObfuscatedName("ISZVQSTL.m")
	public int field853;

	@ObfuscatedName("ISZVQSTL.n")
	public int field854;

	@ObfuscatedName("ISZVQSTL.f")
	public String field846;

	@ObfuscatedName("ISZVQSTL.e")
	public static int[] field845;

	@ObfuscatedName("ISZVQSTL.c")
	public static ISZVQSTL[] field843;

	@ObfuscatedName("ISZVQSTL.a(ILBBMKAXRK;)V")
	public static void method332(BBMKAXRK arg0) {
		EILHLJCE var1 = new EILHLJCE(arg0.method30("varp.dat", null));
		field844 = 0;
		field842 = var1.method226();
		if (field843 == null) {
			field843 = new ISZVQSTL[field842];
		}

		if (field845 == null) {
			field845 = new int[field842];
		}

		for (int var2 = 0; var2 < field842; var2++) {
			if (field843[var2] == null) {
				field843[var2] = new ISZVQSTL();
			}

			field843[var2].method333(var2, var1);
		}

		if (var1.field683.length != var1.field684) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("ISZVQSTL.a(ILEILHLJCE;I)V")
	public void method333(int arg0, EILHLJCE arg1) {
		while (true) {
			int var3 = arg1.method224();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field847 = arg1.method224();
			} else if (var3 == 2) {
				field848 = arg1.method224();
			} else if (var3 == 3) {
				field849 = true;
				field845[field844++] = arg0;
			} else if (var3 == 4) {
				field850 = false;
			} else if (var3 == 5) {
				field851 = arg1.method226();
			} else if (var3 == 6) {
				field852 = true;
			} else if (var3 == 7) {
				field853 = arg1.method229();
			} else if (var3 == 8) {
				field854 = 1;
				field855 = true;
			} else if (var3 == 10) {
				field846 = arg1.method231();
			} else if (var3 == 11) {
				field855 = true;
			} else if (var3 == 12) {
				field856 = arg1.method229();
			} else if (var3 == 13) {
				field854 = 2;
				field855 = true;
			} else if (var3 == 14) {
				field857 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
