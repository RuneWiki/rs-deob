package deob;

@ObfuscatedName("VYCKCNXO")
public class VYCKCNXO {

	@ObfuscatedName("VYCKCNXO.g")
	public int field1344 = -1;

	@ObfuscatedName("VYCKCNXO.i")
	public boolean field1346 = false;

	@ObfuscatedName("VYCKCNXO.j")
	public int field1347 = 5;

	@ObfuscatedName("VYCKCNXO.k")
	public int field1348 = -1;

	@ObfuscatedName("VYCKCNXO.l")
	public int field1349 = -1;

	@ObfuscatedName("VYCKCNXO.m")
	public int field1350 = 99;

	@ObfuscatedName("VYCKCNXO.n")
	public int field1351 = -1;

	@ObfuscatedName("VYCKCNXO.o")
	public int field1352 = -1;

	@ObfuscatedName("VYCKCNXO.p")
	public int field1353 = 2;

	@ObfuscatedName("VYCKCNXO.a")
	public static int field1338;

	@ObfuscatedName("VYCKCNXO.c")
	public int field1340;

	@ObfuscatedName("VYCKCNXO.q")
	public int field1354;

	@ObfuscatedName("VYCKCNXO.d")
	public int[] field1341;

	@ObfuscatedName("VYCKCNXO.e")
	public int[] field1342;

	@ObfuscatedName("VYCKCNXO.f")
	public int[] field1343;

	@ObfuscatedName("VYCKCNXO.h")
	public int[] field1345;

	@ObfuscatedName("VYCKCNXO.b")
	public static VYCKCNXO[] field1339;

	@ObfuscatedName("VYCKCNXO.a(LDTIATKJO;I)V")
	public static void method524(DTIATKJO arg0) {
		GHHPHSRU var1 = new GHHPHSRU(arg0.method168("seq.dat", null));
		field1338 = var1.method204();
		if (field1339 == null) {
			field1339 = new VYCKCNXO[field1338];
		}

		for (int var2 = 0; var2 < field1338; var2++) {
			if (field1339[var2] == null) {
				field1339[var2] = new VYCKCNXO();
			}

			field1339[var2].method526(var1);
		}
	}

	@ObfuscatedName("VYCKCNXO.a(II)I")
	public int method525(int arg0) {
		int var2 = field1343[arg0];
		if (var2 == 0) {
			XZZTWOGF var3 = XZZTWOGF.method581(field1341[arg0]);
			if (var3 != null) {
				var2 = field1343[arg0] = var3.field1442;
			}
		}

		if (var2 == 0) {
			var2 = 1;
		}

		return var2;
	}

	@ObfuscatedName("VYCKCNXO.a(LGHHPHSRU;I)V")
	public void method526(GHHPHSRU arg0) {
		while (true) {
			int var2 = arg0.method202();
			if (var2 == 0) {
				if (field1340 == 0) {
					field1340 = 1;
					field1341 = new int[1];
					field1341[0] = -1;
					field1342 = new int[1];
					field1342[0] = -1;
					field1343 = new int[1];
					field1343[0] = -1;
				}

				if (field1351 == -1) {
					if (field1345 == null) {
						field1351 = 0;
					} else {
						field1351 = 2;
					}
				}

				if (field1352 == -1) {
					if (field1345 != null) {
						field1352 = 2;
						return;
					}

					field1352 = 0;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field1340 = arg0.method202();
				field1341 = new int[field1340];
				field1342 = new int[field1340];
				field1343 = new int[field1340];
				for (int var3 = 0; var3 < field1340; var3++) {
					field1341[var3] = arg0.method204();
					field1342[var3] = arg0.method204();
					if (field1342[var3] == 0xFFFF) {
						field1342[var3] = -1;
					}

					field1343[var3] = arg0.method204();
				}
			} else if (var2 == 2) {
				field1344 = arg0.method204();
			} else if (var2 == 3) {
				int var4 = arg0.method202();
				field1345 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field1345[var5] = arg0.method202();
				}

				field1345[var4] = 9999999;
			} else if (var2 == 4) {
				field1346 = true;
			} else if (var2 == 5) {
				field1347 = arg0.method202();
			} else if (var2 == 6) {
				field1348 = arg0.method204();
			} else if (var2 == 7) {
				field1349 = arg0.method204();
			} else if (var2 == 8) {
				field1350 = arg0.method202();
			} else if (var2 == 9) {
				field1351 = arg0.method202();
			} else if (var2 == 10) {
				field1352 = arg0.method202();
			} else if (var2 == 11) {
				field1353 = arg0.method202();
			} else if (var2 == 12) {
				field1354 = arg0.method207();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
