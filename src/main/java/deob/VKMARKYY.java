package deob;

@ObfuscatedName("VKMARKYY")
public class VKMARKYY {

	@ObfuscatedName("VKMARKYY.j")
	public boolean field1360 = false;

	@ObfuscatedName("VKMARKYY.k")
	public int field1361 = -1;

	@ObfuscatedName("VKMARKYY.m")
	public boolean field1363 = true;

	@ObfuscatedName("VKMARKYY.d")
	public static int field1354;

	@ObfuscatedName("VKMARKYY.g")
	public int field1357;

	@ObfuscatedName("VKMARKYY.h")
	public int field1358;

	@ObfuscatedName("VKMARKYY.i")
	public int field1359;

	@ObfuscatedName("VKMARKYY.l")
	public int field1362;

	@ObfuscatedName("VKMARKYY.f")
	public String field1356;

	@ObfuscatedName("VKMARKYY.e")
	public static VKMARKYY[] field1355;

	@ObfuscatedName("VKMARKYY.a(BLRPFMUSNN;)V")
	public static void method480(RPFMUSNN arg0) {
		WNCFPLWV var1 = new WNCFPLWV(arg0.method414("varbit.dat", null));
		field1354 = var1.method504();
		if (field1355 == null) {
			field1355 = new VKMARKYY[field1354];
		}

		for (int var2 = 0; var2 < field1354; var2++) {
			if (field1355[var2] == null) {
				field1355[var2] = new VKMARKYY();
			}

			field1355[var2].method481(var2, var1);

			if (field1355[var2].field1360) {
				SLGAFVQN.field1219[field1355[var2].field1357].field1231 = true;
			}
		}

		if (var1.field1374.length != var1.field1375) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("VKMARKYY.a(ILWNCFPLWV;Z)V")
	public void method481(int arg0, WNCFPLWV arg1) {
		while (true) {
			int var3 = arg1.method502();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field1357 = arg1.method504();
				field1358 = arg1.method502();
				field1359 = arg1.method502();
			} else if (var3 == 10) {
				field1356 = arg1.method509();
			} else if (var3 == 2) {
				field1360 = true;
			} else if (var3 == 3) {
				field1361 = arg1.method507();
			} else if (var3 == 4) {
				field1362 = arg1.method507();
			} else if (var3 == 5) {
				field1363 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
