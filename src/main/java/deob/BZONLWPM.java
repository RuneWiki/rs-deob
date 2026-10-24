package deob;

@ObfuscatedName("BZONLWPM")
public class BZONLWPM {

	@ObfuscatedName("BZONLWPM.h")
	public int field58 = -1;

	@ObfuscatedName("BZONLWPM.j")
	public boolean field60 = false;

	@ObfuscatedName("BZONLWPM.k")
	public int field61 = 5;

	@ObfuscatedName("BZONLWPM.l")
	public int field62 = -1;

	@ObfuscatedName("BZONLWPM.m")
	public int field63 = -1;

	@ObfuscatedName("BZONLWPM.n")
	public int field64 = 99;

	@ObfuscatedName("BZONLWPM.o")
	public int field65 = -1;

	@ObfuscatedName("BZONLWPM.p")
	public int field66 = -1;

	@ObfuscatedName("BZONLWPM.q")
	public int field67 = 2;

	@ObfuscatedName("BZONLWPM.b")
	public static int field52;

	@ObfuscatedName("BZONLWPM.d")
	public int field54;

	@ObfuscatedName("BZONLWPM.r")
	public int field68;

	@ObfuscatedName("BZONLWPM.e")
	public int[] field55;

	@ObfuscatedName("BZONLWPM.f")
	public int[] field56;

	@ObfuscatedName("BZONLWPM.g")
	public int[] field57;

	@ObfuscatedName("BZONLWPM.i")
	public int[] field59;

	@ObfuscatedName("BZONLWPM.c")
	public static BZONLWPM[] field53;

	@ObfuscatedName("BZONLWPM.a(ILTKEGJSFV;)V")
	public static void method26(TKEGJSFV arg0) {
		EGCCHUZS var1 = new EGCCHUZS(arg0.method542("seq.dat", null));
		field52 = var1.method263();
		if (field53 == null) {
			field53 = new BZONLWPM[field52];
		}

		for (int var2 = 0; var2 < field52; var2++) {
			if (field53[var2] == null) {
				field53[var2] = new BZONLWPM();
			}

			field53[var2].method28(var1);
		}
	}

	@ObfuscatedName("BZONLWPM.a(IB)I")
	public int method27(int arg0) {
		int var2 = field57[arg0];
		if (var2 == 0) {
			ICYGYVTE var3 = ICYGYVTE.method348(field55[arg0]);
			if (var3 != null) {
				var2 = field57[arg0] = var3.field764;
			}
		}

		if (var2 == 0) {
			var2 = 1;
		}

		return var2;
	}

	@ObfuscatedName("BZONLWPM.a(LEGCCHUZS;Z)V")
	public void method28(EGCCHUZS arg0) {
		while (true) {
			int var2 = arg0.method261();
			if (var2 == 0) {
				if (field54 == 0) {
					field54 = 1;
					field55 = new int[1];
					field55[0] = -1;
					field56 = new int[1];
					field56[0] = -1;
					field57 = new int[1];
					field57[0] = -1;
				}

				if (field65 == -1) {
					if (field59 == null) {
						field65 = 0;
					} else {
						field65 = 2;
					}
				}

				if (field66 == -1) {
					if (field59 != null) {
						field66 = 2;
						return;
					}

					field66 = 0;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field54 = arg0.method261();
				field55 = new int[field54];
				field56 = new int[field54];
				field57 = new int[field54];
				for (int var3 = 0; var3 < field54; var3++) {
					field55[var3] = arg0.method263();
					field56[var3] = arg0.method263();
					if (field56[var3] == 0xFFFF) {
						field56[var3] = -1;
					}

					field57[var3] = arg0.method263();
				}
			} else if (var2 == 2) {
				field58 = arg0.method263();
			} else if (var2 == 3) {
				int var4 = arg0.method261();
				field59 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field59[var5] = arg0.method261();
				}

				field59[var4] = 9999999;
			} else if (var2 == 4) {
				field60 = true;
			} else if (var2 == 5) {
				field61 = arg0.method261();
			} else if (var2 == 6) {
				field62 = arg0.method263();
			} else if (var2 == 7) {
				field63 = arg0.method263();
			} else if (var2 == 8) {
				field64 = arg0.method261();
			} else if (var2 == 9) {
				field65 = arg0.method261();
			} else if (var2 == 10) {
				field66 = arg0.method261();
			} else if (var2 == 11) {
				field67 = arg0.method261();
			} else if (var2 == 12) {
				field68 = arg0.method266();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
