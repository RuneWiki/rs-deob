package deob;

@ObfuscatedName("KIZBPSHZ")
public class KIZBPSHZ {

	@ObfuscatedName("KIZBPSHZ.h")
	public int field893 = -1;

	@ObfuscatedName("KIZBPSHZ.j")
	public boolean field895 = false;

	@ObfuscatedName("KIZBPSHZ.k")
	public int field896 = 5;

	@ObfuscatedName("KIZBPSHZ.l")
	public int field897 = -1;

	@ObfuscatedName("KIZBPSHZ.m")
	public int field898 = -1;

	@ObfuscatedName("KIZBPSHZ.n")
	public int field899 = 99;

	@ObfuscatedName("KIZBPSHZ.o")
	public int field900 = -1;

	@ObfuscatedName("KIZBPSHZ.p")
	public int field901 = -1;

	@ObfuscatedName("KIZBPSHZ.q")
	public int field902 = 2;

	@ObfuscatedName("KIZBPSHZ.b")
	public static int field887;

	@ObfuscatedName("KIZBPSHZ.d")
	public int field889;

	@ObfuscatedName("KIZBPSHZ.r")
	public int field903;

	@ObfuscatedName("KIZBPSHZ.e")
	public int[] field890;

	@ObfuscatedName("KIZBPSHZ.f")
	public int[] field891;

	@ObfuscatedName("KIZBPSHZ.g")
	public int[] field892;

	@ObfuscatedName("KIZBPSHZ.i")
	public int[] field894;

	@ObfuscatedName("KIZBPSHZ.c")
	public static KIZBPSHZ[] field888;

	@ObfuscatedName("KIZBPSHZ.a(ILQDHHNYHL;)V")
	public static void method363(QDHHNYHL arg0) {
		PGNBHFUF var1 = new PGNBHFUF(arg0.method488("seq.dat", null));
		field887 = var1.method422();
		if (field888 == null) {
			field888 = new KIZBPSHZ[field887];
		}

		for (int var2 = 0; var2 < field887; var2++) {
			if (field888[var2] == null) {
				field888[var2] = new KIZBPSHZ();
			}

			field888[var2].method365(var1);
		}
	}

	@ObfuscatedName("KIZBPSHZ.a(II)I")
	public int method364(int arg0) {
		int var2 = field892[arg0];
		if (var2 == 0) {
			HVIFHYEW var3 = HVIFHYEW.method286(field890[arg0]);
			if (var3 != null) {
				var2 = field892[arg0] = var3.field735;
			}
		}

		if (var2 == 0) {
			var2 = 1;
		}

		return var2;
	}

	@ObfuscatedName("KIZBPSHZ.a(LPGNBHFUF;I)V")
	public void method365(PGNBHFUF arg0) {
		while (true) {
			int var2 = arg0.method420();
			if (var2 == 0) {
				if (field889 == 0) {
					field889 = 1;
					field890 = new int[1];
					field890[0] = -1;
					field891 = new int[1];
					field891[0] = -1;
					field892 = new int[1];
					field892[0] = -1;
				}

				if (field900 == -1) {
					if (field894 == null) {
						field900 = 0;
					} else {
						field900 = 2;
					}
				}

				if (field901 == -1) {
					if (field894 != null) {
						field901 = 2;
						return;
					}

					field901 = 0;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field889 = arg0.method420();
				field890 = new int[field889];
				field891 = new int[field889];
				field892 = new int[field889];
				for (int var3 = 0; var3 < field889; var3++) {
					field890[var3] = arg0.method422();
					field891[var3] = arg0.method422();
					if (field891[var3] == 0xFFFF) {
						field891[var3] = -1;
					}

					field892[var3] = arg0.method422();
				}
			} else if (var2 == 2) {
				field893 = arg0.method422();
			} else if (var2 == 3) {
				int var4 = arg0.method420();
				field894 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field894[var5] = arg0.method420();
				}

				field894[var4] = 9999999;
			} else if (var2 == 4) {
				field895 = true;
			} else if (var2 == 5) {
				field896 = arg0.method420();
			} else if (var2 == 6) {
				field897 = arg0.method422();
			} else if (var2 == 7) {
				field898 = arg0.method422();
			} else if (var2 == 8) {
				field899 = arg0.method420();
			} else if (var2 == 9) {
				field900 = arg0.method420();
			} else if (var2 == 10) {
				field901 = arg0.method420();
			} else if (var2 == 11) {
				field902 = arg0.method420();
			} else if (var2 == 12) {
				field903 = arg0.method425();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
