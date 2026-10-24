package deob;

@ObfuscatedName("QBINVEVU")
public class QBINVEVU {

	@ObfuscatedName("QBINVEVU.i")
	public int field1170 = -1;

	@ObfuscatedName("QBINVEVU.k")
	public boolean field1172 = false;

	@ObfuscatedName("QBINVEVU.l")
	public int field1173 = 5;

	@ObfuscatedName("QBINVEVU.m")
	public int field1174 = -1;

	@ObfuscatedName("QBINVEVU.n")
	public int field1175 = -1;

	@ObfuscatedName("QBINVEVU.o")
	public int field1176 = 99;

	@ObfuscatedName("QBINVEVU.p")
	public int field1177 = -1;

	@ObfuscatedName("QBINVEVU.q")
	public int field1178 = -1;

	@ObfuscatedName("QBINVEVU.r")
	public int field1179 = 2;

	@ObfuscatedName("QBINVEVU.c")
	public static int field1164;

	@ObfuscatedName("QBINVEVU.e")
	public int field1166;

	@ObfuscatedName("QBINVEVU.s")
	public int field1180;

	@ObfuscatedName("QBINVEVU.f")
	public int[] field1167;

	@ObfuscatedName("QBINVEVU.g")
	public int[] field1168;

	@ObfuscatedName("QBINVEVU.h")
	public int[] field1169;

	@ObfuscatedName("QBINVEVU.j")
	public int[] field1171;

	@ObfuscatedName("QBINVEVU.d")
	public static QBINVEVU[] field1165;

	@ObfuscatedName("QBINVEVU.a(LNXFIIFAD;I)V")
	public static void method450(NXFIIFAD arg0) {
		MNKDCXXG var1 = new MNKDCXXG(arg0.method431("seq.dat", null));
		field1164 = var1.method388();
		if (field1165 == null) {
			field1165 = new QBINVEVU[field1164];
		}

		for (int var2 = 0; var2 < field1164; var2++) {
			if (field1165[var2] == null) {
				field1165[var2] = new QBINVEVU();
			}

			field1165[var2].method452(var1);
		}
	}

	@ObfuscatedName("QBINVEVU.a(II)I")
	public int method451(int arg0) {
		int var2 = field1169[arg0];
		if (var2 == 0) {
			FIYHSKKC var3 = FIYHSKKC.method210(field1167[arg0]);
			if (var3 != null) {
				var2 = field1169[arg0] = var3.field631;
			}
		}

		if (var2 == 0) {
			var2 = 1;
		}

		return var2;
	}

	@ObfuscatedName("QBINVEVU.a(LMNKDCXXG;I)V")
	public void method452(MNKDCXXG arg0) {
		while (true) {
			int var2 = arg0.method386();
			if (var2 == 0) {
				if (field1166 == 0) {
					field1166 = 1;
					field1167 = new int[1];
					field1167[0] = -1;
					field1168 = new int[1];
					field1168[0] = -1;
					field1169 = new int[1];
					field1169[0] = -1;
				}

				if (field1177 == -1) {
					if (field1171 == null) {
						field1177 = 0;
					} else {
						field1177 = 2;
					}
				}

				if (field1178 == -1) {
					if (field1171 != null) {
						field1178 = 2;
						return;
					}

					field1178 = 0;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field1166 = arg0.method386();
				field1167 = new int[field1166];
				field1168 = new int[field1166];
				field1169 = new int[field1166];
				for (int var3 = 0; var3 < field1166; var3++) {
					field1167[var3] = arg0.method388();
					field1168[var3] = arg0.method388();
					if (field1168[var3] == 0xFFFF) {
						field1168[var3] = -1;
					}

					field1169[var3] = arg0.method388();
				}
			} else if (var2 == 2) {
				field1170 = arg0.method388();
			} else if (var2 == 3) {
				int var4 = arg0.method386();
				field1171 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field1171[var5] = arg0.method386();
				}

				field1171[var4] = 9999999;
			} else if (var2 == 4) {
				field1172 = true;
			} else if (var2 == 5) {
				field1173 = arg0.method386();
			} else if (var2 == 6) {
				field1174 = arg0.method388();
			} else if (var2 == 7) {
				field1175 = arg0.method388();
			} else if (var2 == 8) {
				field1176 = arg0.method386();
			} else if (var2 == 9) {
				field1177 = arg0.method386();
			} else if (var2 == 10) {
				field1178 = arg0.method386();
			} else if (var2 == 11) {
				field1179 = arg0.method386();
			} else if (var2 == 12) {
				field1180 = arg0.method391();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
