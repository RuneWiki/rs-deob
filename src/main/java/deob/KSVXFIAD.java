package deob;

@ObfuscatedName("KSVXFIAD")
public class KSVXFIAD {

	@ObfuscatedName("KSVXFIAD.i")
	public int field1007 = -1;

	@ObfuscatedName("KSVXFIAD.k")
	public boolean field1009 = false;

	@ObfuscatedName("KSVXFIAD.l")
	public int field1010 = 5;

	@ObfuscatedName("KSVXFIAD.m")
	public int field1011 = -1;

	@ObfuscatedName("KSVXFIAD.n")
	public int field1012 = -1;

	@ObfuscatedName("KSVXFIAD.o")
	public int field1013 = 99;

	@ObfuscatedName("KSVXFIAD.p")
	public int field1014 = -1;

	@ObfuscatedName("KSVXFIAD.q")
	public int field1015 = -1;

	@ObfuscatedName("KSVXFIAD.r")
	public int field1016 = 2;

	@ObfuscatedName("KSVXFIAD.c")
	public static int field1001;

	@ObfuscatedName("KSVXFIAD.e")
	public int field1003;

	@ObfuscatedName("KSVXFIAD.s")
	public int field1017;

	@ObfuscatedName("KSVXFIAD.f")
	public int[] field1004;

	@ObfuscatedName("KSVXFIAD.g")
	public int[] field1005;

	@ObfuscatedName("KSVXFIAD.h")
	public int[] field1006;

	@ObfuscatedName("KSVXFIAD.j")
	public int[] field1008;

	@ObfuscatedName("KSVXFIAD.d")
	public static KSVXFIAD[] field1002;

	@ObfuscatedName("KSVXFIAD.a(BLJUPFHAZZ;)V")
	public static void method374(JUPFHAZZ arg0) {
		TKPFKOXP var1 = new TKPFKOXP(arg0.method372("seq.dat", null));
		field1001 = var1.method531();
		if (field1002 == null) {
			field1002 = new KSVXFIAD[field1001];
		}

		for (int var2 = 0; var2 < field1001; var2++) {
			if (field1002[var2] == null) {
				field1002[var2] = new KSVXFIAD();
			}

			field1002[var2].method376(var1);
		}
	}

	@ObfuscatedName("KSVXFIAD.a(BI)I")
	public int method375(int arg0) {
		int var2 = field1006[arg0];
		if (var2 == 0) {
			OYJABRDD var3 = OYJABRDD.method466(field1004[arg0]);
			if (var3 != null) {
				var2 = field1006[arg0] = var3.field1176;
			}
		}

		if (var2 == 0) {
			var2 = 1;
		}

		return var2;
	}

	@ObfuscatedName("KSVXFIAD.a(LTKPFKOXP;B)V")
	public void method376(TKPFKOXP arg0) {
		while (true) {
			int var2 = arg0.method529();
			if (var2 == 0) {
				if (field1003 == 0) {
					field1003 = 1;
					field1004 = new int[1];
					field1004[0] = -1;
					field1005 = new int[1];
					field1005[0] = -1;
					field1006 = new int[1];
					field1006[0] = -1;
				}

				if (field1014 == -1) {
					if (field1008 == null) {
						field1014 = 0;
					} else {
						field1014 = 2;
					}
				}

				if (field1015 == -1) {
					if (field1008 != null) {
						field1015 = 2;
						return;
					}

					field1015 = 0;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field1003 = arg0.method529();
				field1004 = new int[field1003];
				field1005 = new int[field1003];
				field1006 = new int[field1003];
				for (int var3 = 0; var3 < field1003; var3++) {
					field1004[var3] = arg0.method531();
					field1005[var3] = arg0.method531();
					if (field1005[var3] == 0xFFFF) {
						field1005[var3] = -1;
					}

					field1006[var3] = arg0.method531();
				}
			} else if (var2 == 2) {
				field1007 = arg0.method531();
			} else if (var2 == 3) {
				int var4 = arg0.method529();
				field1008 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field1008[var5] = arg0.method529();
				}

				field1008[var4] = 9999999;
			} else if (var2 == 4) {
				field1009 = true;
			} else if (var2 == 5) {
				field1010 = arg0.method529();
			} else if (var2 == 6) {
				field1011 = arg0.method531();
			} else if (var2 == 7) {
				field1012 = arg0.method531();
			} else if (var2 == 8) {
				field1013 = arg0.method529();
			} else if (var2 == 9) {
				field1014 = arg0.method529();
			} else if (var2 == 10) {
				field1015 = arg0.method529();
			} else if (var2 == 11) {
				field1016 = arg0.method529();
			} else if (var2 == 12) {
				field1017 = arg0.method534();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
