package deob;

@ObfuscatedName("ODMBIHRM")
public class ODMBIHRM {

	@ObfuscatedName("ODMBIHRM.h")
	public int field1040 = -1;

	@ObfuscatedName("ODMBIHRM.j")
	public boolean field1042 = false;

	@ObfuscatedName("ODMBIHRM.k")
	public int field1043 = 5;

	@ObfuscatedName("ODMBIHRM.l")
	public int field1044 = -1;

	@ObfuscatedName("ODMBIHRM.m")
	public int field1045 = -1;

	@ObfuscatedName("ODMBIHRM.n")
	public int field1046 = 99;

	@ObfuscatedName("ODMBIHRM.o")
	public int field1047 = -1;

	@ObfuscatedName("ODMBIHRM.p")
	public int field1048 = -1;

	@ObfuscatedName("ODMBIHRM.q")
	public int field1049 = 2;

	@ObfuscatedName("ODMBIHRM.b")
	public static int field1034;

	@ObfuscatedName("ODMBIHRM.d")
	public int field1036;

	@ObfuscatedName("ODMBIHRM.r")
	public int field1050;

	@ObfuscatedName("ODMBIHRM.e")
	public int[] field1037;

	@ObfuscatedName("ODMBIHRM.f")
	public int[] field1038;

	@ObfuscatedName("ODMBIHRM.g")
	public int[] field1039;

	@ObfuscatedName("ODMBIHRM.i")
	public int[] field1041;

	@ObfuscatedName("ODMBIHRM.c")
	public static ODMBIHRM[] field1035;

	@ObfuscatedName("ODMBIHRM.a(ILBBMKAXRK;)V")
	public static void method412(BBMKAXRK arg0) {
		EILHLJCE var1 = new EILHLJCE(arg0.method30("seq.dat", null));
		field1034 = var1.method226();
		if (field1035 == null) {
			field1035 = new ODMBIHRM[field1034];
		}

		for (int var2 = 0; var2 < field1034; var2++) {
			if (field1035[var2] == null) {
				field1035[var2] = new ODMBIHRM();
			}

			field1035[var2].method414(var1);
		}
	}

	@ObfuscatedName("ODMBIHRM.a(IZ)I")
	public int method413(int arg0) {
		int var2 = field1039[arg0];
		if (var2 == 0) {
			IBCKUTPD var3 = IBCKUTPD.method308(field1037[arg0]);
			if (var3 != null) {
				var2 = field1039[arg0] = var3.field751;
			}
		}

		if (var2 == 0) {
			var2 = 1;
		}

		return var2;
	}

	@ObfuscatedName("ODMBIHRM.a(LEILHLJCE;B)V")
	public void method414(EILHLJCE arg0) {
		while (true) {
			int var2 = arg0.method224();
			if (var2 == 0) {
				if (field1036 == 0) {
					field1036 = 1;
					field1037 = new int[1];
					field1037[0] = -1;
					field1038 = new int[1];
					field1038[0] = -1;
					field1039 = new int[1];
					field1039[0] = -1;
				}

				if (field1047 == -1) {
					if (field1041 == null) {
						field1047 = 0;
					} else {
						field1047 = 2;
					}
				}

				if (field1048 == -1) {
					if (field1041 != null) {
						field1048 = 2;
						return;
					}

					field1048 = 0;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field1036 = arg0.method224();
				field1037 = new int[field1036];
				field1038 = new int[field1036];
				field1039 = new int[field1036];
				for (int var3 = 0; var3 < field1036; var3++) {
					field1037[var3] = arg0.method226();
					field1038[var3] = arg0.method226();
					if (field1038[var3] == 0xFFFF) {
						field1038[var3] = -1;
					}

					field1039[var3] = arg0.method226();
				}
			} else if (var2 == 2) {
				field1040 = arg0.method226();
			} else if (var2 == 3) {
				int var4 = arg0.method224();
				field1041 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field1041[var5] = arg0.method224();
				}

				field1041[var4] = 9999999;
			} else if (var2 == 4) {
				field1042 = true;
			} else if (var2 == 5) {
				field1043 = arg0.method224();
			} else if (var2 == 6) {
				field1044 = arg0.method226();
			} else if (var2 == 7) {
				field1045 = arg0.method226();
			} else if (var2 == 8) {
				field1046 = arg0.method224();
			} else if (var2 == 9) {
				field1047 = arg0.method224();
			} else if (var2 == 10) {
				field1048 = arg0.method224();
			} else if (var2 == 11) {
				field1049 = arg0.method224();
			} else if (var2 == 12) {
				field1050 = arg0.method229();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
