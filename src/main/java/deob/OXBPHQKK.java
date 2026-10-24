package deob;

@ObfuscatedName("OXBPHQKK")
public class OXBPHQKK {

	@ObfuscatedName("OXBPHQKK.h")
	public int field1157 = -1;

	@ObfuscatedName("OXBPHQKK.j")
	public boolean field1159 = false;

	@ObfuscatedName("OXBPHQKK.k")
	public int field1160 = 5;

	@ObfuscatedName("OXBPHQKK.l")
	public int field1161 = -1;

	@ObfuscatedName("OXBPHQKK.m")
	public int field1162 = -1;

	@ObfuscatedName("OXBPHQKK.n")
	public int field1163 = 99;

	@ObfuscatedName("OXBPHQKK.o")
	public int field1164 = -1;

	@ObfuscatedName("OXBPHQKK.p")
	public int field1165 = -1;

	@ObfuscatedName("OXBPHQKK.b")
	public static int field1151;

	@ObfuscatedName("OXBPHQKK.d")
	public int field1153;

	@ObfuscatedName("OXBPHQKK.q")
	public int field1166;

	@ObfuscatedName("OXBPHQKK.r")
	public int field1167;

	@ObfuscatedName("OXBPHQKK.e")
	public int[] field1154;

	@ObfuscatedName("OXBPHQKK.f")
	public int[] field1155;

	@ObfuscatedName("OXBPHQKK.g")
	public int[] field1156;

	@ObfuscatedName("OXBPHQKK.i")
	public int[] field1158;

	@ObfuscatedName("OXBPHQKK.c")
	public static OXBPHQKK[] field1152;

	@ObfuscatedName("OXBPHQKK.a(LMNPBQFWE;B)V")
	public static void method456(MNPBQFWE arg0) {
		BJPWOXRJ var1 = new BJPWOXRJ(arg0.method429("seq.dat", null));
		field1151 = var1.method17();
		if (field1152 == null) {
			field1152 = new OXBPHQKK[field1151];
		}

		for (int var2 = 0; var2 < field1151; var2++) {
			if (field1152[var2] == null) {
				field1152[var2] = new OXBPHQKK();
			}

			field1152[var2].method458(var1);
		}
	}

	@ObfuscatedName("OXBPHQKK.a(IZ)I")
	public int method457(int arg0) {
		int var2 = field1156[arg0];
		if (var2 == 0) {
			UIZESDZR var3 = UIZESDZR.method523(field1154[arg0]);
			if (var3 != null) {
				var2 = field1156[arg0] = var3.field1399;
			}
		}

		if (var2 == 0) {
			var2 = 1;
		}

		return var2;
	}

	@ObfuscatedName("OXBPHQKK.a(ILBJPWOXRJ;)V")
	public void method458(BJPWOXRJ arg0) {
		while (true) {
			int var2 = arg0.method15();
			if (var2 == 0) {
				if (field1153 == 0) {
					field1153 = 1;
					field1154 = new int[1];
					field1154[0] = -1;
					field1155 = new int[1];
					field1155[0] = -1;
					field1156 = new int[1];
					field1156[0] = -1;
				}

				if (field1164 == -1) {
					if (field1158 == null) {
						field1164 = 0;
					} else {
						field1164 = 2;
					}
				}

				if (field1165 == -1) {
					if (field1158 != null) {
						field1165 = 2;
						return;
					}

					field1165 = 0;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field1153 = arg0.method15();
				field1154 = new int[field1153];
				field1155 = new int[field1153];
				field1156 = new int[field1153];
				for (int var3 = 0; var3 < field1153; var3++) {
					field1154[var3] = arg0.method17();
					field1155[var3] = arg0.method17();
					if (field1155[var3] == 0xFFFF) {
						field1155[var3] = -1;
					}

					field1156[var3] = arg0.method17();
				}
			} else if (var2 == 2) {
				field1157 = arg0.method17();
			} else if (var2 == 3) {
				int var4 = arg0.method15();
				field1158 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field1158[var5] = arg0.method15();
				}

				field1158[var4] = 9999999;
			} else if (var2 == 4) {
				field1159 = true;
			} else if (var2 == 5) {
				field1160 = arg0.method15();
			} else if (var2 == 6) {
				field1161 = arg0.method17();
			} else if (var2 == 7) {
				field1162 = arg0.method17();
			} else if (var2 == 8) {
				field1163 = arg0.method15();
			} else if (var2 == 9) {
				field1164 = arg0.method15();
			} else if (var2 == 10) {
				field1165 = arg0.method15();
			} else if (var2 == 11) {
				field1166 = arg0.method15();
			} else if (var2 == 12) {
				field1167 = arg0.method20();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
