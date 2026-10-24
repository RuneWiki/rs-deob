package deob;

@ObfuscatedName("QRYQWAHS")
public class QRYQWAHS {

	@ObfuscatedName("QRYQWAHS.g")
	public int field1033 = -1;

	@ObfuscatedName("QRYQWAHS.i")
	public int[] field1035 = new int[6];

	@ObfuscatedName("QRYQWAHS.j")
	public int[] field1036 = new int[6];

	@ObfuscatedName("QRYQWAHS.k")
	public int[] field1037 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("QRYQWAHS.l")
	public boolean field1038 = false;

	@ObfuscatedName("QRYQWAHS.e")
	public static int field1031;

	@ObfuscatedName("QRYQWAHS.h")
	public int[] field1034;

	@ObfuscatedName("QRYQWAHS.f")
	public static QRYQWAHS[] field1032;

	@ObfuscatedName("QRYQWAHS.a(ILMAARFNGV;)V")
	public static void method373(MAARFNGV arg0) {
		EMWAMCXW var1 = new EMWAMCXW(arg0.method332("idk.dat", null));
		field1031 = var1.method219();
		if (field1032 == null) {
			field1032 = new QRYQWAHS[field1031];
		}

		for (int var2 = 0; var2 < field1031; var2++) {
			if (field1032[var2] == null) {
				field1032[var2] = new QRYQWAHS();
			}

			field1032[var2].method374(var1);
		}
	}

	@ObfuscatedName("QRYQWAHS.a(ILEMWAMCXW;)V")
	public void method374(EMWAMCXW arg0) {
		while (true) {
			int var2 = arg0.method217();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1033 = arg0.method217();
			} else if (var2 == 2) {
				int var3 = arg0.method217();
				field1034 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1034[var4] = arg0.method219();
				}
			} else if (var2 == 3) {
				field1038 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field1035[var2 - 40] = arg0.method219();
			} else if (var2 >= 50 && var2 < 60) {
				field1036[var2 - 50] = arg0.method219();
			} else if (var2 >= 60 && var2 < 70) {
				field1037[var2 - 60] = arg0.method219();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("QRYQWAHS.a(I)Z")
	public boolean method375() {
		if (field1034 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field1034.length; var2++) {
			if (!IEHKDFMR.method268(field1034[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("QRYQWAHS.b(I)LIEHKDFMR;")
	public IEHKDFMR method376() {
		if (field1034 == null) {
			return null;
		}

		IEHKDFMR[] var1 = new IEHKDFMR[field1034.length];
		for (int var2 = 0; var2 < field1034.length; var2++) {
			var1[var2] = IEHKDFMR.method267(field1034[var2]);
		}

		IEHKDFMR var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new IEHKDFMR(var1, var1.length);
		}

		for (int var4 = 0; var4 < 6 && field1035[var4] != 0; var4++) {
			var3.method281(field1035[var4], field1036[var4]);
		}

		return var3;
	}

	@ObfuscatedName("QRYQWAHS.c(I)Z")
	public boolean method377() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (field1037[var2] != -1 && !IEHKDFMR.method268(field1037[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("QRYQWAHS.d(I)LIEHKDFMR;")
	public IEHKDFMR method378() {
		IEHKDFMR[] var1 = new IEHKDFMR[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field1037[var3] != -1) {
				var1[var2++] = IEHKDFMR.method267(field1037[var3]);
			}
		}

		IEHKDFMR var4 = new IEHKDFMR(var1, var2);
		for (int var5 = 0; var5 < 6 && field1035[var5] != 0; var5++) {
			var4.method281(field1035[var5], field1036[var5]);
		}

		return var4;
	}
}
