package deob;

@ObfuscatedName("MHWTJCHJ")
public class MHWTJCHJ {

	@ObfuscatedName("MHWTJCHJ.g")
	public int field842 = -1;

	@ObfuscatedName("MHWTJCHJ.i")
	public int[] field844 = new int[6];

	@ObfuscatedName("MHWTJCHJ.j")
	public int[] field845 = new int[6];

	@ObfuscatedName("MHWTJCHJ.k")
	public int field846 = 128;

	@ObfuscatedName("MHWTJCHJ.l")
	public int field847 = 128;

	@ObfuscatedName("MHWTJCHJ.p")
	public static BMKJVFXV field851 = new BMKJVFXV(30);

	@ObfuscatedName("MHWTJCHJ.c")
	public static int field838;

	@ObfuscatedName("MHWTJCHJ.e")
	public int field840;

	@ObfuscatedName("MHWTJCHJ.f")
	public int field841;

	@ObfuscatedName("MHWTJCHJ.m")
	public int field848;

	@ObfuscatedName("MHWTJCHJ.n")
	public int field849;

	@ObfuscatedName("MHWTJCHJ.o")
	public int field850;

	@ObfuscatedName("MHWTJCHJ.h")
	public JZQVOFSF field843;

	@ObfuscatedName("MHWTJCHJ.d")
	public static MHWTJCHJ[] field839;

	@ObfuscatedName("MHWTJCHJ.a(LSMIVAFST;I)V")
	public static void method365(SMIVAFST arg0) {
		BSNPYLEV var1 = new BSNPYLEV(arg0.method512("spotanim.dat", null));
		field838 = var1.method49();
		if (field839 == null) {
			field839 = new MHWTJCHJ[field838];
		}

		for (int var2 = 0; var2 < field838; var2++) {
			if (field839[var2] == null) {
				field839[var2] = new MHWTJCHJ();
			}

			field839[var2].field840 = var2;
			field839[var2].method366(var1);
		}
	}

	@ObfuscatedName("MHWTJCHJ.a(ILBSNPYLEV;)V")
	public void method366(BSNPYLEV arg0) {
		while (true) {
			int var2 = arg0.method47();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field841 = arg0.method49();
			} else if (var2 == 2) {
				field842 = arg0.method49();
				if (JZQVOFSF.field757 != null) {
					field843 = JZQVOFSF.field757[field842];
				}
			} else if (var2 == 4) {
				field846 = arg0.method49();
			} else if (var2 == 5) {
				field847 = arg0.method49();
			} else if (var2 == 6) {
				field848 = arg0.method49();
			} else if (var2 == 7) {
				field849 = arg0.method47();
			} else if (var2 == 8) {
				field850 = arg0.method47();
			} else if (var2 >= 40 && var2 < 50) {
				field844[var2 - 40] = arg0.method49();
			} else if (var2 >= 50 && var2 < 60) {
				field845[var2 - 50] = arg0.method49();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("MHWTJCHJ.a()LRMLAXPMV;")
	public RMLAXPMV method367() {
		RMLAXPMV var1 = (RMLAXPMV) field851.method32(field840);
		if (var1 != null) {
			return var1;
		}

		RMLAXPMV var2 = RMLAXPMV.method466(field841);
		if (var2 == null) {
			return null;
		}

		for (int var3 = 0; var3 < 6; var3++) {
			if (field844[0] != 0) {
				var2.method480(field844[var3], field845[var3]);
			}
		}

		field851.method33(field840, var2);
		return var2;
	}
}
