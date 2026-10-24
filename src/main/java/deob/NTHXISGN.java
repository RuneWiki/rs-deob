package deob;

@ObfuscatedName("NTHXISGN")
public class NTHXISGN {

	@ObfuscatedName("NTHXISGN.d")
	public int field1097 = -1;

	@ObfuscatedName("NTHXISGN.f")
	public int[] field1099 = new int[6];

	@ObfuscatedName("NTHXISGN.g")
	public int[] field1100 = new int[6];

	@ObfuscatedName("NTHXISGN.h")
	public int[] field1101 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("NTHXISGN.i")
	public boolean field1102 = false;

	@ObfuscatedName("NTHXISGN.b")
	public static int field1095;

	@ObfuscatedName("NTHXISGN.e")
	public int[] field1098;

	@ObfuscatedName("NTHXISGN.c")
	public static NTHXISGN[] field1096;

	@ObfuscatedName("NTHXISGN.a(BLJUPFHAZZ;)V")
	public static void method423(JUPFHAZZ arg0) {
		TKPFKOXP var1 = new TKPFKOXP(arg0.method372("idk.dat", null));
		field1095 = var1.method531();
		if (field1096 == null) {
			field1096 = new NTHXISGN[field1095];
		}

		for (int var2 = 0; var2 < field1095; var2++) {
			if (field1096[var2] == null) {
				field1096[var2] = new NTHXISGN();
			}

			field1096[var2].method424(var1);
		}
	}

	@ObfuscatedName("NTHXISGN.a(LTKPFKOXP;B)V")
	public void method424(TKPFKOXP arg0) {
		while (true) {
			int var2 = arg0.method529();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1097 = arg0.method529();
			} else if (var2 == 2) {
				int var3 = arg0.method529();
				field1098 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1098[var4] = arg0.method531();
				}
			} else if (var2 == 3) {
				field1102 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field1099[var2 - 40] = arg0.method531();
			} else if (var2 >= 50 && var2 < 60) {
				field1100[var2 - 50] = arg0.method531();
			} else if (var2 >= 60 && var2 < 70) {
				field1101[var2 - 60] = arg0.method531();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("NTHXISGN.a(B)Z")
	public boolean method425() {
		if (field1098 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field1098.length; var2++) {
			if (!OGORHYVW.method434(field1098[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("NTHXISGN.a(I)LOGORHYVW;")
	public OGORHYVW method426() {
		if (field1098 == null) {
			return null;
		}

		OGORHYVW[] var1 = new OGORHYVW[field1098.length];
		for (int var2 = 0; var2 < field1098.length; var2++) {
			var1[var2] = OGORHYVW.method433(field1098[var2]);
		}

		OGORHYVW var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new OGORHYVW(var1.length, var1);
		}

		for (int var4 = 0; var4 < 6 && field1099[var4] != 0; var4++) {
			var3.method447(field1099[var4], field1100[var4]);
		}

		return var3;
	}

	@ObfuscatedName("NTHXISGN.b(B)Z")
	public boolean method427() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (field1101[var2] != -1 && !OGORHYVW.method434(field1101[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("NTHXISGN.a(Z)LOGORHYVW;")
	public OGORHYVW method428() {
		OGORHYVW[] var1 = new OGORHYVW[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field1101[var3] != -1) {
				var1[var2++] = OGORHYVW.method433(field1101[var3]);
			}
		}

		OGORHYVW var4 = new OGORHYVW(var2, var1);
		for (int var5 = 0; var5 < 6 && field1099[var5] != 0; var5++) {
			var4.method447(field1099[var5], field1100[var5]);
		}

		return var4;
	}
}
