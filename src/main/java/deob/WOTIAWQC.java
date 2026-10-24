package deob;

@ObfuscatedName("WOTIAWQC")
public class WOTIAWQC {

	@ObfuscatedName("WOTIAWQC.h")
	public int field1475 = -1;

	@ObfuscatedName("WOTIAWQC.j")
	public boolean field1477 = false;

	@ObfuscatedName("WOTIAWQC.k")
	public int field1478 = 5;

	@ObfuscatedName("WOTIAWQC.l")
	public int field1479 = -1;

	@ObfuscatedName("WOTIAWQC.m")
	public int field1480 = -1;

	@ObfuscatedName("WOTIAWQC.n")
	public int field1481 = 99;

	@ObfuscatedName("WOTIAWQC.o")
	public int field1482 = -1;

	@ObfuscatedName("WOTIAWQC.p")
	public int field1483 = -1;

	@ObfuscatedName("WOTIAWQC.q")
	public int field1484 = 2;

	@ObfuscatedName("WOTIAWQC.b")
	public static int field1469;

	@ObfuscatedName("WOTIAWQC.d")
	public int field1471;

	@ObfuscatedName("WOTIAWQC.r")
	public int field1485;

	@ObfuscatedName("WOTIAWQC.e")
	public int[] field1472;

	@ObfuscatedName("WOTIAWQC.f")
	public int[] field1473;

	@ObfuscatedName("WOTIAWQC.g")
	public int[] field1474;

	@ObfuscatedName("WOTIAWQC.i")
	public int[] field1476;

	@ObfuscatedName("WOTIAWQC.c")
	public static WOTIAWQC[] field1470;

	@ObfuscatedName("WOTIAWQC.a(ILSRZUEVOD;)V")
	public static void method580(SRZUEVOD arg0) {
		LZWRHABP var1 = new LZWRHABP(arg0.method566("seq.dat", null));
		field1469 = var1.method465();
		if (field1470 == null) {
			field1470 = new WOTIAWQC[field1469];
		}

		for (int var2 = 0; var2 < field1469; var2++) {
			if (field1470[var2] == null) {
				field1470[var2] = new WOTIAWQC();
			}

			field1470[var2].method582(var1);
		}
	}

	@ObfuscatedName("WOTIAWQC.a(II)I")
	public int method581(int arg0) {
		int var2 = field1474[arg0];
		if (var2 == 0) {
			YGZNOIUP var3 = YGZNOIUP.method598(field1472[arg0]);
			if (var3 != null) {
				var2 = field1474[arg0] = var3.field1504;
			}
		}

		if (var2 == 0) {
			var2 = 1;
		}

		return var2;
	}

	@ObfuscatedName("WOTIAWQC.a(ZLLZWRHABP;)V")
	public void method582(LZWRHABP arg0) {
		while (true) {
			int var2 = arg0.method463();
			if (var2 == 0) {
				if (field1471 == 0) {
					field1471 = 1;
					field1472 = new int[1];
					field1472[0] = -1;
					field1473 = new int[1];
					field1473[0] = -1;
					field1474 = new int[1];
					field1474[0] = -1;
				}

				if (field1482 == -1) {
					if (field1476 == null) {
						field1482 = 0;
					} else {
						field1482 = 2;
					}
				}

				if (field1483 == -1) {
					if (field1476 != null) {
						field1483 = 2;
						return;
					}

					field1483 = 0;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field1471 = arg0.method463();
				field1472 = new int[field1471];
				field1473 = new int[field1471];
				field1474 = new int[field1471];
				for (int var3 = 0; var3 < field1471; var3++) {
					field1472[var3] = arg0.method465();
					field1473[var3] = arg0.method465();
					if (field1473[var3] == 0xFFFF) {
						field1473[var3] = -1;
					}

					field1474[var3] = arg0.method465();
				}
			} else if (var2 == 2) {
				field1475 = arg0.method465();
			} else if (var2 == 3) {
				int var4 = arg0.method463();
				field1476 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field1476[var5] = arg0.method463();
				}

				field1476[var4] = 9999999;
			} else if (var2 == 4) {
				field1477 = true;
			} else if (var2 == 5) {
				field1478 = arg0.method463();
			} else if (var2 == 6) {
				field1479 = arg0.method465();
			} else if (var2 == 7) {
				field1480 = arg0.method465();
			} else if (var2 == 8) {
				field1481 = arg0.method463();
			} else if (var2 == 9) {
				field1482 = arg0.method463();
			} else if (var2 == 10) {
				field1483 = arg0.method463();
			} else if (var2 == 11) {
				field1484 = arg0.method463();
			} else if (var2 == 12) {
				field1485 = arg0.method468();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
