package deob;

@ObfuscatedName("IEVJZYTE")
public class IEVJZYTE {

	@ObfuscatedName("IEVJZYTE.e")
	public int field793 = -1;

	@ObfuscatedName("IEVJZYTE.g")
	public int[] field795 = new int[6];

	@ObfuscatedName("IEVJZYTE.h")
	public int[] field796 = new int[6];

	@ObfuscatedName("IEVJZYTE.i")
	public int[] field797 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("IEVJZYTE.j")
	public boolean field798 = false;

	@ObfuscatedName("IEVJZYTE.c")
	public static int field791;

	@ObfuscatedName("IEVJZYTE.f")
	public int[] field794;

	@ObfuscatedName("IEVJZYTE.d")
	public static IEVJZYTE[] field792;

	@ObfuscatedName("IEVJZYTE.a(ILQDHHNYHL;)V")
	public static void method301(QDHHNYHL arg0) {
		PGNBHFUF var1 = new PGNBHFUF(arg0.method488("idk.dat", null));
		field791 = var1.method422();
		if (field792 == null) {
			field792 = new IEVJZYTE[field791];
		}

		for (int var2 = 0; var2 < field791; var2++) {
			if (field792[var2] == null) {
				field792[var2] = new IEVJZYTE();
			}

			field792[var2].method302(var1);
		}
	}

	@ObfuscatedName("IEVJZYTE.a(LPGNBHFUF;I)V")
	public void method302(PGNBHFUF arg0) {
		while (true) {
			int var2 = arg0.method420();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field793 = arg0.method420();
			} else if (var2 == 2) {
				int var3 = arg0.method420();
				field794 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field794[var4] = arg0.method422();
				}
			} else if (var2 == 3) {
				field798 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field795[var2 - 40] = arg0.method422();
			} else if (var2 >= 50 && var2 < 60) {
				field796[var2 - 50] = arg0.method422();
			} else if (var2 >= 60 && var2 < 70) {
				field797[var2 - 60] = arg0.method422();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("IEVJZYTE.a(I)Z")
	public boolean method303() {
		if (field794 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field794.length; var2++) {
			if (!POJFANDE.method461(field794[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("IEVJZYTE.a(Z)LPOJFANDE;")
	public POJFANDE method304() {
		if (field794 == null) {
			return null;
		}

		POJFANDE[] var1 = new POJFANDE[field794.length];
		for (int var2 = 0; var2 < field794.length; var2++) {
			var1[var2] = POJFANDE.method460(field794[var2]);
		}

		POJFANDE var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new POJFANDE(var1.length, var1);
		}

		for (int var4 = 0; var4 < 6 && field795[var4] != 0; var4++) {
			var3.method474(field795[var4], field796[var4]);
		}

		return var3;
	}

	@ObfuscatedName("IEVJZYTE.b(I)Z")
	public boolean method305() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (field797[var2] != -1 && !POJFANDE.method461(field797[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("IEVJZYTE.a(B)LPOJFANDE;")
	public POJFANDE method306() {
		POJFANDE[] var1 = new POJFANDE[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field797[var3] != -1) {
				var1[var2++] = POJFANDE.method460(field797[var3]);
			}
		}

		POJFANDE var4 = new POJFANDE(var2, var1);
		for (int var5 = 0; var5 < 6 && field795[var5] != 0; var5++) {
			var4.method474(field795[var5], field796[var5]);
		}

		return var4;
	}
}
