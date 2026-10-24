package deob;

@ObfuscatedName("SPUHKLMC")
public class SPUHKLMC {

	@ObfuscatedName("SPUHKLMC.i")
	public int field1181 = -1;

	@ObfuscatedName("SPUHKLMC.k")
	public boolean field1183 = false;

	@ObfuscatedName("SPUHKLMC.l")
	public int field1184 = 5;

	@ObfuscatedName("SPUHKLMC.m")
	public int field1185 = -1;

	@ObfuscatedName("SPUHKLMC.n")
	public int field1186 = -1;

	@ObfuscatedName("SPUHKLMC.o")
	public int field1187 = 99;

	@ObfuscatedName("SPUHKLMC.p")
	public int field1188 = -1;

	@ObfuscatedName("SPUHKLMC.q")
	public int field1189 = -1;

	@ObfuscatedName("SPUHKLMC.r")
	public int field1190 = 2;

	@ObfuscatedName("SPUHKLMC.c")
	public static int field1175;

	@ObfuscatedName("SPUHKLMC.e")
	public int field1177;

	@ObfuscatedName("SPUHKLMC.s")
	public int field1191;

	@ObfuscatedName("SPUHKLMC.f")
	public int[] field1178;

	@ObfuscatedName("SPUHKLMC.g")
	public int[] field1179;

	@ObfuscatedName("SPUHKLMC.h")
	public int[] field1180;

	@ObfuscatedName("SPUHKLMC.j")
	public int[] field1182;

	@ObfuscatedName("SPUHKLMC.d")
	public static SPUHKLMC[] field1176;

	@ObfuscatedName("SPUHKLMC.a(ZLVSQMPWOM;)V")
	public static void method506(VSQMPWOM arg0) {
		BFQIDHPO var1 = new BFQIDHPO(arg0.method526("seq.dat", null));
		field1175 = var1.method56();
		if (field1176 == null) {
			field1176 = new SPUHKLMC[field1175];
		}

		for (int var2 = 0; var2 < field1175; var2++) {
			if (field1176[var2] == null) {
				field1176[var2] = new SPUHKLMC();
			}

			field1176[var2].method508(var1);
		}
	}

	@ObfuscatedName("SPUHKLMC.a(II)I")
	public int method507(int arg0) {
		int var2 = field1180[arg0];
		if (var2 == 0) {
			BKYAWERN var3 = BKYAWERN.method114(field1178[arg0]);
			if (var3 != null) {
				var2 = field1180[arg0] = var3.field43;
			}
		}

		if (var2 == 0) {
			var2 = 1;
		}

		return var2;
	}

	@ObfuscatedName("SPUHKLMC.a(BLBFQIDHPO;)V")
	public void method508(BFQIDHPO arg0) {
		while (true) {
			int var2 = arg0.method54();
			if (var2 == 0) {
				if (field1177 == 0) {
					field1177 = 1;
					field1178 = new int[1];
					field1178[0] = -1;
					field1179 = new int[1];
					field1179[0] = -1;
					field1180 = new int[1];
					field1180[0] = -1;
				}

				if (field1188 == -1) {
					if (field1182 == null) {
						field1188 = 0;
					} else {
						field1188 = 2;
					}
				}

				if (field1189 == -1) {
					if (field1182 != null) {
						field1189 = 2;
						return;
					}

					field1189 = 0;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field1177 = arg0.method54();
				field1178 = new int[field1177];
				field1179 = new int[field1177];
				field1180 = new int[field1177];
				for (int var3 = 0; var3 < field1177; var3++) {
					field1178[var3] = arg0.method56();
					field1179[var3] = arg0.method56();
					if (field1179[var3] == 0xFFFF) {
						field1179[var3] = -1;
					}

					field1180[var3] = arg0.method56();
				}
			} else if (var2 == 2) {
				field1181 = arg0.method56();
			} else if (var2 == 3) {
				int var4 = arg0.method54();
				field1182 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field1182[var5] = arg0.method54();
				}

				field1182[var4] = 9999999;
			} else if (var2 == 4) {
				field1183 = true;
			} else if (var2 == 5) {
				field1184 = arg0.method54();
			} else if (var2 == 6) {
				field1185 = arg0.method56();
			} else if (var2 == 7) {
				field1186 = arg0.method56();
			} else if (var2 == 8) {
				field1187 = arg0.method54();
			} else if (var2 == 9) {
				field1188 = arg0.method54();
			} else if (var2 == 10) {
				field1189 = arg0.method54();
			} else if (var2 == 11) {
				field1190 = arg0.method54();
			} else if (var2 == 12) {
				field1191 = arg0.method59();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
