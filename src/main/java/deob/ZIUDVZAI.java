package deob;

@ObfuscatedName("ZIUDVZAI")
public class ZIUDVZAI {

	@ObfuscatedName("ZIUDVZAI.g")
	public boolean field1485 = false;

	@ObfuscatedName("ZIUDVZAI.h")
	public int field1486 = -1;

	@ObfuscatedName("ZIUDVZAI.a")
	public static int field1479;

	@ObfuscatedName("ZIUDVZAI.d")
	public int field1482;

	@ObfuscatedName("ZIUDVZAI.e")
	public int field1483;

	@ObfuscatedName("ZIUDVZAI.f")
	public int field1484;

	@ObfuscatedName("ZIUDVZAI.i")
	public int field1487;

	@ObfuscatedName("ZIUDVZAI.c")
	public String field1481;

	@ObfuscatedName("ZIUDVZAI.b")
	public static ZIUDVZAI[] field1480;

	@ObfuscatedName("ZIUDVZAI.a(ZLXRWUKRPO;)V")
	public static void method589(XRWUKRPO arg0) {
		GLMIQHJI var1 = new GLMIQHJI(arg0.method581("varbit.dat", null));
		field1479 = var1.method246();
		if (field1480 == null) {
			field1480 = new ZIUDVZAI[field1479];
		}

		for (int var2 = 0; var2 < field1479; var2++) {
			if (field1480[var2] == null) {
				field1480[var2] = new ZIUDVZAI();
			}

			field1480[var2].method590(var2, var1);

			if (field1480[var2].field1485) {
				BIGJGRMT.field83[field1480[var2].field1482].field95 = true;
			}
		}

		if (var1.field708.length != var1.field709) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("ZIUDVZAI.a(ZILGLMIQHJI;)V")
	public void method590(int arg0, GLMIQHJI arg1) {
		while (true) {
			int var3 = arg1.method244();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field1482 = arg1.method246();
				field1483 = arg1.method244();
				field1484 = arg1.method244();
			} else if (var3 == 10) {
				field1481 = arg1.method251();
			} else if (var3 == 2) {
				field1485 = true;
			} else if (var3 == 3) {
				field1486 = arg1.method249();
			} else if (var3 == 4) {
				field1487 = arg1.method249();
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
