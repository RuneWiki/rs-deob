package deob;

@ObfuscatedName("JFYFSKVR")
public class JFYFSKVR {

	@ObfuscatedName("JFYFSKVR.k")
	public int field664 = -1;

	@ObfuscatedName("JFYFSKVR.m")
	public boolean field666 = false;

	@ObfuscatedName("JFYFSKVR.n")
	public int field667 = 5;

	@ObfuscatedName("JFYFSKVR.o")
	public int field668 = -1;

	@ObfuscatedName("JFYFSKVR.p")
	public int field669 = -1;

	@ObfuscatedName("JFYFSKVR.q")
	public int field670 = 99;

	@ObfuscatedName("JFYFSKVR.r")
	public int field671 = -1;

	@ObfuscatedName("JFYFSKVR.s")
	public int field672 = -1;

	@ObfuscatedName("JFYFSKVR.t")
	public int field673 = 2;

	@ObfuscatedName("JFYFSKVR.e")
	public static int field658;

	@ObfuscatedName("JFYFSKVR.g")
	public int field660;

	@ObfuscatedName("JFYFSKVR.u")
	public int field674;

	@ObfuscatedName("JFYFSKVR.h")
	public int[] field661;

	@ObfuscatedName("JFYFSKVR.i")
	public int[] field662;

	@ObfuscatedName("JFYFSKVR.j")
	public int[] field663;

	@ObfuscatedName("JFYFSKVR.l")
	public int[] field665;

	@ObfuscatedName("JFYFSKVR.f")
	public static JFYFSKVR[] field659;

	@ObfuscatedName("JFYFSKVR.a(LCXFTMSCH;B)V")
	public static void method250(CXFTMSCH arg0) {
		MQZHAILV var1 = new MQZHAILV(arg0.method176("seq.dat", null));
		field658 = var1.method327();
		if (field659 == null) {
			field659 = new JFYFSKVR[field658];
		}

		for (int var2 = 0; var2 < field658; var2++) {
			if (field659[var2] == null) {
				field659[var2] = new JFYFSKVR();
			}

			field659[var2].method252(var1);
		}
	}

	@ObfuscatedName("JFYFSKVR.a(II)I")
	public int method251(int arg0) {
		int var2 = field663[arg0];
		if (var2 == 0) {
			VPISXBMB var3 = VPISXBMB.method512(field661[arg0]);
			if (var3 != null) {
				var2 = field663[arg0] = var3.field1212;
			}
		}

		if (var2 == 0) {
			var2 = 1;
		}

		return var2;
	}

	@ObfuscatedName("JFYFSKVR.a(LMQZHAILV;I)V")
	public void method252(MQZHAILV arg0) {
		while (true) {
			int var2 = arg0.method325();
			if (var2 == 0) {
				if (field660 == 0) {
					field660 = 1;
					field661 = new int[1];
					field661[0] = -1;
					field662 = new int[1];
					field662[0] = -1;
					field663 = new int[1];
					field663[0] = -1;
				}

				if (field671 == -1) {
					if (field665 == null) {
						field671 = 0;
					} else {
						field671 = 2;
					}
				}

				if (field672 == -1) {
					if (field665 != null) {
						field672 = 2;
						return;
					}

					field672 = 0;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field660 = arg0.method325();
				field661 = new int[field660];
				field662 = new int[field660];
				field663 = new int[field660];
				for (int var3 = 0; var3 < field660; var3++) {
					field661[var3] = arg0.method327();
					field662[var3] = arg0.method327();
					if (field662[var3] == 0xFFFF) {
						field662[var3] = -1;
					}

					field663[var3] = arg0.method327();
				}
			} else if (var2 == 2) {
				field664 = arg0.method327();
			} else if (var2 == 3) {
				int var4 = arg0.method325();
				field665 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field665[var5] = arg0.method325();
				}

				field665[var4] = 9999999;
			} else if (var2 == 4) {
				field666 = true;
			} else if (var2 == 5) {
				field667 = arg0.method325();
			} else if (var2 == 6) {
				field668 = arg0.method327();
			} else if (var2 == 7) {
				field669 = arg0.method327();
			} else if (var2 == 8) {
				field670 = arg0.method325();
			} else if (var2 == 9) {
				field671 = arg0.method325();
			} else if (var2 == 10) {
				field672 = arg0.method325();
			} else if (var2 == 11) {
				field673 = arg0.method325();
			} else if (var2 == 12) {
				field674 = arg0.method330();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
