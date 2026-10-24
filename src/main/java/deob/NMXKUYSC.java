package deob;

@ObfuscatedName("NMXKUYSC")
public class NMXKUYSC {

	@ObfuscatedName("NMXKUYSC.i")
	public int field1003 = -1;

	@ObfuscatedName("NMXKUYSC.k")
	public boolean field1005 = false;

	@ObfuscatedName("NMXKUYSC.l")
	public int field1006 = 5;

	@ObfuscatedName("NMXKUYSC.m")
	public int field1007 = -1;

	@ObfuscatedName("NMXKUYSC.n")
	public int field1008 = -1;

	@ObfuscatedName("NMXKUYSC.o")
	public int field1009 = 99;

	@ObfuscatedName("NMXKUYSC.p")
	public int field1010 = -1;

	@ObfuscatedName("NMXKUYSC.q")
	public int field1011 = -1;

	@ObfuscatedName("NMXKUYSC.r")
	public int field1012 = 2;

	@ObfuscatedName("NMXKUYSC.s")
	public int field1013;

	@ObfuscatedName("NMXKUYSC.c")
	public static int field997;

	@ObfuscatedName("NMXKUYSC.e")
	public int field999;

	@ObfuscatedName("NMXKUYSC.f")
	public int[] field1000;

	@ObfuscatedName("NMXKUYSC.g")
	public int[] field1001;

	@ObfuscatedName("NMXKUYSC.h")
	public int[] field1002;

	@ObfuscatedName("NMXKUYSC.j")
	public int[] field1004;

	@ObfuscatedName("NMXKUYSC.d")
	public static NMXKUYSC[] field998;

	@ObfuscatedName("NMXKUYSC.a(ILCVNWKEAW;)V")
	public static void method414(CVNWKEAW arg0) {
		XOUQUKZW var1 = new XOUQUKZW(arg0.method180("seq.dat", null));
		field997 = var1.method523();
		if (field998 == null) {
			field998 = new NMXKUYSC[field997];
		}

		for (int var2 = 0; var2 < field997; var2++) {
			if (field998[var2] == null) {
				field998[var2] = new NMXKUYSC();
			}

			field998[var2].method416(var1);
		}
	}

	@ObfuscatedName("NMXKUYSC.a(IB)I")
	public int method415(int arg0) {
		int var2 = field1002[arg0];
		if (var2 == 0) {
			ZNUJPBQV var3 = ZNUJPBQV.method584(field1000[arg0]);
			if (var3 != null) {
				var2 = field1002[arg0] = var3.field1468;
			}
		}

		if (var2 == 0) {
			var2 = 1;
		}

		return var2;
	}

	@ObfuscatedName("NMXKUYSC.a(BLXOUQUKZW;)V")
	public void method416(XOUQUKZW arg0) {
		while (true) {
			int var2 = arg0.method521();
			if (var2 == 0) {
				if (field999 == 0) {
					field999 = 1;
					field1000 = new int[1];
					field1000[0] = -1;
					field1001 = new int[1];
					field1001[0] = -1;
					field1002 = new int[1];
					field1002[0] = -1;
				}

				if (field1010 == -1) {
					if (field1004 == null) {
						field1010 = 0;
					} else {
						field1010 = 2;
					}
				}

				if (field1011 == -1) {
					if (field1004 != null) {
						field1011 = 2;
						return;
					}

					field1011 = 0;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field999 = arg0.method521();
				field1000 = new int[field999];
				field1001 = new int[field999];
				field1002 = new int[field999];
				for (int var3 = 0; var3 < field999; var3++) {
					field1000[var3] = arg0.method523();
					field1001[var3] = arg0.method523();
					if (field1001[var3] == 0xFFFF) {
						field1001[var3] = -1;
					}

					field1002[var3] = arg0.method523();
				}
			} else if (var2 == 2) {
				field1003 = arg0.method523();
			} else if (var2 == 3) {
				int var4 = arg0.method521();
				field1004 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field1004[var5] = arg0.method521();
				}

				field1004[var4] = 9999999;
			} else if (var2 == 4) {
				field1005 = true;
			} else if (var2 == 5) {
				field1006 = arg0.method521();
			} else if (var2 == 6) {
				field1007 = arg0.method523();
			} else if (var2 == 7) {
				field1008 = arg0.method523();
			} else if (var2 == 8) {
				field1009 = arg0.method521();
			} else if (var2 == 9) {
				field1010 = arg0.method521();
			} else if (var2 == 10) {
				field1011 = arg0.method521();
			} else if (var2 == 11) {
				field1012 = arg0.method521();
			} else if (var2 == 12) {
				field1013 = arg0.method526();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
