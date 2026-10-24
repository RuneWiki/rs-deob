package deob;

@ObfuscatedName("WLHKAARP")
public class WLHKAARP {

	@ObfuscatedName("WLHKAARP.h")
	public int field1328 = -1;

	@ObfuscatedName("WLHKAARP.j")
	public boolean field1330 = false;

	@ObfuscatedName("WLHKAARP.k")
	public int field1331 = 5;

	@ObfuscatedName("WLHKAARP.l")
	public int field1332 = -1;

	@ObfuscatedName("WLHKAARP.m")
	public int field1333 = -1;

	@ObfuscatedName("WLHKAARP.n")
	public int field1334 = 99;

	@ObfuscatedName("WLHKAARP.o")
	public int field1335 = -1;

	@ObfuscatedName("WLHKAARP.p")
	public int field1336 = -1;

	@ObfuscatedName("WLHKAARP.q")
	public int field1337 = 2;

	@ObfuscatedName("WLHKAARP.b")
	public static int field1322;

	@ObfuscatedName("WLHKAARP.d")
	public int field1324;

	@ObfuscatedName("WLHKAARP.r")
	public int field1338;

	@ObfuscatedName("WLHKAARP.e")
	public int[] field1325;

	@ObfuscatedName("WLHKAARP.f")
	public int[] field1326;

	@ObfuscatedName("WLHKAARP.g")
	public int[] field1327;

	@ObfuscatedName("WLHKAARP.i")
	public int[] field1329;

	@ObfuscatedName("WLHKAARP.c")
	public static WLHKAARP[] field1323;

	@ObfuscatedName("WLHKAARP.a(ZLXRWUKRPO;)V")
	public static void method548(XRWUKRPO arg0) {
		GLMIQHJI var1 = new GLMIQHJI(arg0.method581("seq.dat", null));
		field1322 = var1.method246();
		if (field1323 == null) {
			field1323 = new WLHKAARP[field1322];
		}

		for (int var2 = 0; var2 < field1322; var2++) {
			if (field1323[var2] == null) {
				field1323[var2] = new WLHKAARP();
			}

			field1323[var2].method550(var1);
		}
	}

	@ObfuscatedName("WLHKAARP.a(II)I")
	public int method549(int arg0) {
		int var2 = field1327[arg0];
		if (var2 == 0) {
			TTZHVWEG var3 = TTZHVWEG.method488(field1325[arg0]);
			if (var3 != null) {
				var2 = field1327[arg0] = var3.field1100;
			}
		}

		if (var2 == 0) {
			var2 = 1;
		}

		return var2;
	}

	@ObfuscatedName("WLHKAARP.a(BLGLMIQHJI;)V")
	public void method550(GLMIQHJI arg0) {
		while (true) {
			int var2 = arg0.method244();
			if (var2 == 0) {
				if (field1324 == 0) {
					field1324 = 1;
					field1325 = new int[1];
					field1325[0] = -1;
					field1326 = new int[1];
					field1326[0] = -1;
					field1327 = new int[1];
					field1327[0] = -1;
				}

				if (field1335 == -1) {
					if (field1329 == null) {
						field1335 = 0;
					} else {
						field1335 = 2;
					}
				}

				if (field1336 == -1) {
					if (field1329 != null) {
						field1336 = 2;
						return;
					}

					field1336 = 0;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field1324 = arg0.method244();
				field1325 = new int[field1324];
				field1326 = new int[field1324];
				field1327 = new int[field1324];
				for (int var3 = 0; var3 < field1324; var3++) {
					field1325[var3] = arg0.method246();
					field1326[var3] = arg0.method246();
					if (field1326[var3] == 0xFFFF) {
						field1326[var3] = -1;
					}

					field1327[var3] = arg0.method246();
				}
			} else if (var2 == 2) {
				field1328 = arg0.method246();
			} else if (var2 == 3) {
				int var4 = arg0.method244();
				field1329 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field1329[var5] = arg0.method244();
				}

				field1329[var4] = 9999999;
			} else if (var2 == 4) {
				field1330 = true;
			} else if (var2 == 5) {
				field1331 = arg0.method244();
			} else if (var2 == 6) {
				field1332 = arg0.method246();
			} else if (var2 == 7) {
				field1333 = arg0.method246();
			} else if (var2 == 8) {
				field1334 = arg0.method244();
			} else if (var2 == 9) {
				field1335 = arg0.method244();
			} else if (var2 == 10) {
				field1336 = arg0.method244();
			} else if (var2 == 11) {
				field1337 = arg0.method244();
			} else if (var2 == 12) {
				field1338 = arg0.method249();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
