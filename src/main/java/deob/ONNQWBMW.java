package deob;

@ObfuscatedName("ONNQWBMW")
public class ONNQWBMW {

	@ObfuscatedName("ONNQWBMW.i")
	public boolean field926 = false;

	@ObfuscatedName("ONNQWBMW.j")
	public boolean field927 = true;

	@ObfuscatedName("ONNQWBMW.l")
	public boolean field929 = false;

	@ObfuscatedName("ONNQWBMW.o")
	public boolean field932 = false;

	@ObfuscatedName("ONNQWBMW.p")
	public int field933 = -1;

	@ObfuscatedName("ONNQWBMW.b")
	public static int field919;

	@ObfuscatedName("ONNQWBMW.d")
	public static int field921;

	@ObfuscatedName("ONNQWBMW.g")
	public int field924;

	@ObfuscatedName("ONNQWBMW.h")
	public int field925;

	@ObfuscatedName("ONNQWBMW.k")
	public int field928;

	@ObfuscatedName("ONNQWBMW.m")
	public int field930;

	@ObfuscatedName("ONNQWBMW.n")
	public int field931;

	@ObfuscatedName("ONNQWBMW.f")
	public String field923;

	@ObfuscatedName("ONNQWBMW.e")
	public static int[] field922;

	@ObfuscatedName("ONNQWBMW.c")
	public static ONNQWBMW[] field920;

	@ObfuscatedName("ONNQWBMW.a(LFIGUVTWB;Z)V")
	public static void method398(FIGUVTWB arg0) {
		MUKVLYLC var1 = new MUKVLYLC(arg0.method209("varp.dat", null));
		field921 = 0;
		field919 = var1.method294();
		if (field920 == null) {
			field920 = new ONNQWBMW[field919];
		}

		if (field922 == null) {
			field922 = new int[field919];
		}

		for (int var2 = 0; var2 < field919; var2++) {
			if (field920[var2] == null) {
				field920[var2] = new ONNQWBMW();
			}

			field920[var2].method399(var1, var2);
		}

		if (var1.field811.length != var1.field812) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("ONNQWBMW.a(ILMUKVLYLC;I)V")
	public void method399(MUKVLYLC arg0, int arg1) {
		while (true) {
			int var3 = arg0.method292();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field924 = arg0.method292();
			} else if (var3 == 2) {
				field925 = arg0.method292();
			} else if (var3 == 3) {
				field926 = true;
				field922[field921++] = arg1;
			} else if (var3 == 4) {
				field927 = false;
			} else if (var3 == 5) {
				field928 = arg0.method294();
			} else if (var3 == 6) {
				field929 = true;
			} else if (var3 == 7) {
				field930 = arg0.method297();
			} else if (var3 == 8) {
				field931 = 1;
				field932 = true;
			} else if (var3 == 10) {
				field923 = arg0.method299();
			} else if (var3 == 11) {
				field932 = true;
			} else if (var3 == 12) {
				field933 = arg0.method297();
			} else if (var3 == 13) {
				field931 = 2;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
