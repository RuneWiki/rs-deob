package deob;

@ObfuscatedName("GLRCYUHA")
public class GLRCYUHA {

	@ObfuscatedName("GLRCYUHA.e")
	public int field626 = -1;

	@ObfuscatedName("GLRCYUHA.g")
	public int[] field628 = new int[6];

	@ObfuscatedName("GLRCYUHA.h")
	public int[] field629 = new int[6];

	@ObfuscatedName("GLRCYUHA.i")
	public int[] field630 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("GLRCYUHA.j")
	public boolean field631 = false;

	@ObfuscatedName("GLRCYUHA.c")
	public static int field624;

	@ObfuscatedName("GLRCYUHA.f")
	public int[] field627;

	@ObfuscatedName("GLRCYUHA.d")
	public static GLRCYUHA[] field625;

	@ObfuscatedName("GLRCYUHA.a(LSMIVAFST;I)V")
	public static void method310(SMIVAFST arg0) {
		BSNPYLEV var1 = new BSNPYLEV(arg0.method512("idk.dat", null));
		field624 = var1.method49();
		if (field625 == null) {
			field625 = new GLRCYUHA[field624];
		}

		for (int var2 = 0; var2 < field624; var2++) {
			if (field625[var2] == null) {
				field625[var2] = new GLRCYUHA();
			}

			field625[var2].method311(var1);
		}
	}

	@ObfuscatedName("GLRCYUHA.a(ILBSNPYLEV;)V")
	public void method311(BSNPYLEV arg0) {
		while (true) {
			int var2 = arg0.method47();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field626 = arg0.method47();
			} else if (var2 == 2) {
				int var3 = arg0.method47();
				field627 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field627[var4] = arg0.method49();
				}
			} else if (var2 == 3) {
				field631 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field628[var2 - 40] = arg0.method49();
			} else if (var2 >= 50 && var2 < 60) {
				field629[var2 - 50] = arg0.method49();
			} else if (var2 >= 60 && var2 < 70) {
				field630[var2 - 60] = arg0.method49();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("GLRCYUHA.a(I)Z")
	public boolean method312() {
		if (field627 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field627.length; var2++) {
			if (!RMLAXPMV.method467(field627[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("GLRCYUHA.a(Z)LRMLAXPMV;")
	public RMLAXPMV method313() {
		if (field627 == null) {
			return null;
		}

		RMLAXPMV[] var1 = new RMLAXPMV[field627.length];
		for (int var2 = 0; var2 < field627.length; var2++) {
			var1[var2] = RMLAXPMV.method466(field627[var2]);
		}

		RMLAXPMV var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new RMLAXPMV(var1.length, var1);
		}

		for (int var4 = 0; var4 < 6 && field628[var4] != 0; var4++) {
			var3.method480(field628[var4], field629[var4]);
		}

		return var3;
	}

	@ObfuscatedName("GLRCYUHA.b(I)Z")
	public boolean method314() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (field630[var2] != -1 && !RMLAXPMV.method467(field630[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("GLRCYUHA.c(I)LRMLAXPMV;")
	public RMLAXPMV method315() {
		RMLAXPMV[] var1 = new RMLAXPMV[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field630[var3] != -1) {
				var1[var2++] = RMLAXPMV.method466(field630[var3]);
			}
		}

		RMLAXPMV var4 = new RMLAXPMV(var2, var1);
		for (int var5 = 0; var5 < 6 && field628[var5] != 0; var5++) {
			var4.method480(field628[var5], field629[var5]);
		}

		return var4;
	}
}
