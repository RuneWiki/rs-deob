package deob;

@ObfuscatedName("CGWBYVFN")
public class CGWBYVFN {

	@ObfuscatedName("CGWBYVFN.j")
	public int field155 = -1;

	@ObfuscatedName("CGWBYVFN.l")
	public boolean field157 = false;

	@ObfuscatedName("CGWBYVFN.m")
	public int field158 = 5;

	@ObfuscatedName("CGWBYVFN.n")
	public int field159 = -1;

	@ObfuscatedName("CGWBYVFN.o")
	public int field160 = -1;

	@ObfuscatedName("CGWBYVFN.p")
	public int field161 = 99;

	@ObfuscatedName("CGWBYVFN.q")
	public int field162 = -1;

	@ObfuscatedName("CGWBYVFN.r")
	public int field163 = -1;

	@ObfuscatedName("CGWBYVFN.s")
	public int field164 = 2;

	@ObfuscatedName("CGWBYVFN.d")
	public static int field149;

	@ObfuscatedName("CGWBYVFN.f")
	public int field151;

	@ObfuscatedName("CGWBYVFN.t")
	public int field165;

	@ObfuscatedName("CGWBYVFN.g")
	public int[] field152;

	@ObfuscatedName("CGWBYVFN.h")
	public int[] field153;

	@ObfuscatedName("CGWBYVFN.i")
	public int[] field154;

	@ObfuscatedName("CGWBYVFN.k")
	public int[] field156;

	@ObfuscatedName("CGWBYVFN.e")
	public static CGWBYVFN[] field150;

	@ObfuscatedName("CGWBYVFN.a(LOTSGNSQM;Z)V")
	public static void method22(OTSGNSQM arg0) {
		YOXDZEVD var1 = new YOXDZEVD(arg0.method376("seq.dat", null));
		field149 = var1.method551();
		if (field150 == null) {
			field150 = new CGWBYVFN[field149];
		}

		for (int var2 = 0; var2 < field149; var2++) {
			if (field150[var2] == null) {
				field150[var2] = new CGWBYVFN();
			}

			field150[var2].method24(var1);
		}
	}

	@ObfuscatedName("CGWBYVFN.a(BI)I")
	public int method23(int arg0) {
		int var2 = field154[arg0];
		if (var2 == 0) {
			UXVWESOT var3 = UXVWESOT.method454(field152[arg0]);
			if (var3 != null) {
				var2 = field154[arg0] = var3.field1191;
			}
		}

		if (var2 == 0) {
			var2 = 1;
		}

		return var2;
	}

	@ObfuscatedName("CGWBYVFN.a(BLYOXDZEVD;)V")
	public void method24(YOXDZEVD arg0) {
		while (true) {
			int var2 = arg0.method549();
			if (var2 == 0) {
				if (field151 == 0) {
					field151 = 1;
					field152 = new int[1];
					field152[0] = -1;
					field153 = new int[1];
					field153[0] = -1;
					field154 = new int[1];
					field154[0] = -1;
				}

				if (field162 == -1) {
					if (field156 == null) {
						field162 = 0;
					} else {
						field162 = 2;
					}
				}

				if (field163 == -1) {
					if (field156 != null) {
						field163 = 2;
						return;
					}

					field163 = 0;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field151 = arg0.method549();
				field152 = new int[field151];
				field153 = new int[field151];
				field154 = new int[field151];
				for (int var3 = 0; var3 < field151; var3++) {
					field152[var3] = arg0.method551();
					field153[var3] = arg0.method551();
					if (field153[var3] == 0xFFFF) {
						field153[var3] = -1;
					}

					field154[var3] = arg0.method551();
				}
			} else if (var2 == 2) {
				field155 = arg0.method551();
			} else if (var2 == 3) {
				int var4 = arg0.method549();
				field156 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field156[var5] = arg0.method549();
				}

				field156[var4] = 9999999;
			} else if (var2 == 4) {
				field157 = true;
			} else if (var2 == 5) {
				field158 = arg0.method549();
			} else if (var2 == 6) {
				field159 = arg0.method551();
			} else if (var2 == 7) {
				field160 = arg0.method551();
			} else if (var2 == 8) {
				field161 = arg0.method549();
			} else if (var2 == 9) {
				field162 = arg0.method549();
			} else if (var2 == 10) {
				field163 = arg0.method549();
			} else if (var2 == 11) {
				field164 = arg0.method549();
			} else if (var2 == 12) {
				field165 = arg0.method554();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
