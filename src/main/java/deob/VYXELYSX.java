package deob;

@ObfuscatedName("VYXELYSX")
public class VYXELYSX {

	@ObfuscatedName("VYXELYSX.h")
	public int field1278 = -1;

	@ObfuscatedName("VYXELYSX.j")
	public boolean field1280 = false;

	@ObfuscatedName("VYXELYSX.k")
	public int field1281 = 5;

	@ObfuscatedName("VYXELYSX.l")
	public int field1282 = -1;

	@ObfuscatedName("VYXELYSX.m")
	public int field1283 = -1;

	@ObfuscatedName("VYXELYSX.n")
	public int field1284 = 99;

	@ObfuscatedName("VYXELYSX.o")
	public int field1285 = -1;

	@ObfuscatedName("VYXELYSX.p")
	public int field1286 = -1;

	@ObfuscatedName("VYXELYSX.q")
	public int field1287 = 2;

	@ObfuscatedName("VYXELYSX.b")
	public static int field1272;

	@ObfuscatedName("VYXELYSX.d")
	public int field1274;

	@ObfuscatedName("VYXELYSX.r")
	public int field1288;

	@ObfuscatedName("VYXELYSX.e")
	public int[] field1275;

	@ObfuscatedName("VYXELYSX.f")
	public int[] field1276;

	@ObfuscatedName("VYXELYSX.g")
	public int[] field1277;

	@ObfuscatedName("VYXELYSX.i")
	public int[] field1279;

	@ObfuscatedName("VYXELYSX.c")
	public static VYXELYSX[] field1273;

	@ObfuscatedName("VYXELYSX.a(ILMAARFNGV;)V")
	public static void method458(MAARFNGV arg0) {
		EMWAMCXW var1 = new EMWAMCXW(arg0.method332("seq.dat", null));
		field1272 = var1.method219();
		if (field1273 == null) {
			field1273 = new VYXELYSX[field1272];
		}

		for (int var2 = 0; var2 < field1272; var2++) {
			if (field1273[var2] == null) {
				field1273[var2] = new VYXELYSX();
			}

			field1273[var2].method460(var1);
		}
	}

	@ObfuscatedName("VYXELYSX.a(IZ)I")
	public int method459(int arg0) {
		int var2 = field1277[arg0];
		if (var2 == 0) {
			NXEWQQJO var3 = NXEWQQJO.method336(field1275[arg0]);
			if (var3 != null) {
				var2 = field1277[arg0] = var3.field896;
			}
		}

		if (var2 == 0) {
			var2 = 1;
		}

		return var2;
	}

	@ObfuscatedName("VYXELYSX.a(ILEMWAMCXW;)V")
	public void method460(EMWAMCXW arg0) {
		while (true) {
			int var2 = arg0.method217();
			if (var2 == 0) {
				if (field1274 == 0) {
					field1274 = 1;
					field1275 = new int[1];
					field1275[0] = -1;
					field1276 = new int[1];
					field1276[0] = -1;
					field1277 = new int[1];
					field1277[0] = -1;
				}

				if (field1285 == -1) {
					if (field1279 == null) {
						field1285 = 0;
					} else {
						field1285 = 2;
					}
				}

				if (field1286 == -1) {
					if (field1279 != null) {
						field1286 = 2;
						return;
					}

					field1286 = 0;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field1274 = arg0.method217();
				field1275 = new int[field1274];
				field1276 = new int[field1274];
				field1277 = new int[field1274];
				for (int var3 = 0; var3 < field1274; var3++) {
					field1275[var3] = arg0.method219();
					field1276[var3] = arg0.method219();
					if (field1276[var3] == 0xFFFF) {
						field1276[var3] = -1;
					}

					field1277[var3] = arg0.method219();
				}
			} else if (var2 == 2) {
				field1278 = arg0.method219();
			} else if (var2 == 3) {
				int var4 = arg0.method217();
				field1279 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field1279[var5] = arg0.method217();
				}

				field1279[var4] = 9999999;
			} else if (var2 == 4) {
				field1280 = true;
			} else if (var2 == 5) {
				field1281 = arg0.method217();
			} else if (var2 == 6) {
				field1282 = arg0.method219();
			} else if (var2 == 7) {
				field1283 = arg0.method219();
			} else if (var2 == 8) {
				field1284 = arg0.method217();
			} else if (var2 == 9) {
				field1285 = arg0.method217();
			} else if (var2 == 10) {
				field1286 = arg0.method217();
			} else if (var2 == 11) {
				field1287 = arg0.method217();
			} else if (var2 == 12) {
				field1288 = arg0.method222();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
