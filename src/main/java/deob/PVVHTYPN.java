package deob;

@ObfuscatedName("PVVHTYPN")
public class PVVHTYPN {

	@ObfuscatedName("PVVHTYPN.h")
	public int field1011 = -1;

	@ObfuscatedName("PVVHTYPN.j")
	public boolean field1013 = false;

	@ObfuscatedName("PVVHTYPN.k")
	public int field1014 = 5;

	@ObfuscatedName("PVVHTYPN.l")
	public int field1015 = -1;

	@ObfuscatedName("PVVHTYPN.m")
	public int field1016 = -1;

	@ObfuscatedName("PVVHTYPN.n")
	public int field1017 = 99;

	@ObfuscatedName("PVVHTYPN.o")
	public int field1018 = -1;

	@ObfuscatedName("PVVHTYPN.p")
	public int field1019 = -1;

	@ObfuscatedName("PVVHTYPN.q")
	public int field1020 = 2;

	@ObfuscatedName("PVVHTYPN.b")
	public static int field1005;

	@ObfuscatedName("PVVHTYPN.d")
	public int field1007;

	@ObfuscatedName("PVVHTYPN.r")
	public int field1021;

	@ObfuscatedName("PVVHTYPN.e")
	public int[] field1008;

	@ObfuscatedName("PVVHTYPN.f")
	public int[] field1009;

	@ObfuscatedName("PVVHTYPN.g")
	public int[] field1010;

	@ObfuscatedName("PVVHTYPN.i")
	public int[] field1012;

	@ObfuscatedName("PVVHTYPN.c")
	public static PVVHTYPN[] field1006;

	@ObfuscatedName("PVVHTYPN.a(BLRPFMUSNN;)V")
	public static void method389(RPFMUSNN arg0) {
		WNCFPLWV var1 = new WNCFPLWV(arg0.method414("seq.dat", null));
		field1005 = var1.method504();
		if (field1006 == null) {
			field1006 = new PVVHTYPN[field1005];
		}

		for (int var2 = 0; var2 < field1005; var2++) {
			if (field1006[var2] == null) {
				field1006[var2] = new PVVHTYPN();
			}

			field1006[var2].method391(var1);
		}
	}

	@ObfuscatedName("PVVHTYPN.a(IB)I")
	public int method390(int arg0) {
		int var2 = field1010[arg0];
		if (var2 == 0) {
			DHMWVSMI var3 = DHMWVSMI.method177(field1008[arg0]);
			if (var3 != null) {
				var2 = field1010[arg0] = var3.field522;
			}
		}

		if (var2 == 0) {
			var2 = 1;
		}

		return var2;
	}

	@ObfuscatedName("PVVHTYPN.a(ILWNCFPLWV;)V")
	public void method391(WNCFPLWV arg0) {
		while (true) {
			int var2 = arg0.method502();
			if (var2 == 0) {
				if (field1007 == 0) {
					field1007 = 1;
					field1008 = new int[1];
					field1008[0] = -1;
					field1009 = new int[1];
					field1009[0] = -1;
					field1010 = new int[1];
					field1010[0] = -1;
				}

				if (field1018 == -1) {
					if (field1012 == null) {
						field1018 = 0;
					} else {
						field1018 = 2;
					}
				}

				if (field1019 == -1) {
					if (field1012 != null) {
						field1019 = 2;
						return;
					}

					field1019 = 0;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field1007 = arg0.method502();
				field1008 = new int[field1007];
				field1009 = new int[field1007];
				field1010 = new int[field1007];
				for (int var3 = 0; var3 < field1007; var3++) {
					field1008[var3] = arg0.method504();
					field1009[var3] = arg0.method504();
					if (field1009[var3] == 0xFFFF) {
						field1009[var3] = -1;
					}

					field1010[var3] = arg0.method504();
				}
			} else if (var2 == 2) {
				field1011 = arg0.method504();
			} else if (var2 == 3) {
				int var4 = arg0.method502();
				field1012 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field1012[var5] = arg0.method502();
				}

				field1012[var4] = 9999999;
			} else if (var2 == 4) {
				field1013 = true;
			} else if (var2 == 5) {
				field1014 = arg0.method502();
			} else if (var2 == 6) {
				field1015 = arg0.method504();
			} else if (var2 == 7) {
				field1016 = arg0.method504();
			} else if (var2 == 8) {
				field1017 = arg0.method502();
			} else if (var2 == 9) {
				field1018 = arg0.method502();
			} else if (var2 == 10) {
				field1019 = arg0.method502();
			} else if (var2 == 11) {
				field1020 = arg0.method502();
			} else if (var2 == 12) {
				field1021 = arg0.method507();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
