package deob;

@ObfuscatedName("MJVHTYCA")
public class MJVHTYCA {

	@ObfuscatedName("MJVHTYCA.j")
	public int field1049 = -1;

	@ObfuscatedName("MJVHTYCA.l")
	public boolean field1051 = false;

	@ObfuscatedName("MJVHTYCA.m")
	public int field1052 = 5;

	@ObfuscatedName("MJVHTYCA.n")
	public int field1053 = -1;

	@ObfuscatedName("MJVHTYCA.o")
	public int field1054 = -1;

	@ObfuscatedName("MJVHTYCA.p")
	public int field1055 = 99;

	@ObfuscatedName("MJVHTYCA.q")
	public int field1056 = -1;

	@ObfuscatedName("MJVHTYCA.r")
	public int field1057 = -1;

	@ObfuscatedName("MJVHTYCA.s")
	public int field1058 = 2;

	@ObfuscatedName("MJVHTYCA.d")
	public static int field1043;

	@ObfuscatedName("MJVHTYCA.f")
	public int field1045;

	@ObfuscatedName("MJVHTYCA.t")
	public int field1059;

	@ObfuscatedName("MJVHTYCA.g")
	public int[] field1046;

	@ObfuscatedName("MJVHTYCA.h")
	public int[] field1047;

	@ObfuscatedName("MJVHTYCA.i")
	public int[] field1048;

	@ObfuscatedName("MJVHTYCA.k")
	public int[] field1050;

	@ObfuscatedName("MJVHTYCA.e")
	public static MJVHTYCA[] field1044;

	@ObfuscatedName("MJVHTYCA.a(ZLMJLXHQTQ;)V")
	public static void method318(MJLXHQTQ arg0) {
		XGRGMPUQ var1 = new XGRGMPUQ(arg0.method317("seq.dat", null));
		field1043 = var1.method467();
		if (field1044 == null) {
			field1044 = new MJVHTYCA[field1043];
		}

		for (int var2 = 0; var2 < field1043; var2++) {
			if (field1044[var2] == null) {
				field1044[var2] = new MJVHTYCA();
			}

			field1044[var2].method320(var1);
		}
	}

	@ObfuscatedName("MJVHTYCA.a(IB)I")
	public int method319(int arg0) {
		int var2 = field1048[arg0];
		if (var2 == 0) {
			APJPJMYV var3 = APJPJMYV.method10(field1046[arg0]);
			if (var3 != null) {
				var2 = field1048[arg0] = var3.field12;
			}
		}

		if (var2 == 0) {
			var2 = 1;
		}

		return var2;
	}

	@ObfuscatedName("MJVHTYCA.a(ZLXGRGMPUQ;)V")
	public void method320(XGRGMPUQ arg0) {
		while (true) {
			int var2 = arg0.method465();
			if (var2 == 0) {
				if (field1045 == 0) {
					field1045 = 1;
					field1046 = new int[1];
					field1046[0] = -1;
					field1047 = new int[1];
					field1047[0] = -1;
					field1048 = new int[1];
					field1048[0] = -1;
				}

				if (field1056 == -1) {
					if (field1050 == null) {
						field1056 = 0;
					} else {
						field1056 = 2;
					}
				}

				if (field1057 == -1) {
					if (field1050 != null) {
						field1057 = 2;
						return;
					}

					field1057 = 0;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field1045 = arg0.method465();
				field1046 = new int[field1045];
				field1047 = new int[field1045];
				field1048 = new int[field1045];
				for (int var3 = 0; var3 < field1045; var3++) {
					field1046[var3] = arg0.method467();
					field1047[var3] = arg0.method467();
					if (field1047[var3] == 0xFFFF) {
						field1047[var3] = -1;
					}

					field1048[var3] = arg0.method467();
				}
			} else if (var2 == 2) {
				field1049 = arg0.method467();
			} else if (var2 == 3) {
				int var4 = arg0.method465();
				field1050 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field1050[var5] = arg0.method465();
				}

				field1050[var4] = 9999999;
			} else if (var2 == 4) {
				field1051 = true;
			} else if (var2 == 5) {
				field1052 = arg0.method465();
			} else if (var2 == 6) {
				field1053 = arg0.method467();
			} else if (var2 == 7) {
				field1054 = arg0.method467();
			} else if (var2 == 8) {
				field1055 = arg0.method465();
			} else if (var2 == 9) {
				field1056 = arg0.method465();
			} else if (var2 == 10) {
				field1057 = arg0.method465();
			} else if (var2 == 11) {
				field1058 = arg0.method465();
			} else if (var2 == 12) {
				field1059 = arg0.method470();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
