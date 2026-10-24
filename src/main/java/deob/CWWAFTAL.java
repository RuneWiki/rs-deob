package deob;

@ObfuscatedName("CWWAFTAL")
public class CWWAFTAL {

	@ObfuscatedName("CWWAFTAL.h")
	public int field492 = -1;

	@ObfuscatedName("CWWAFTAL.j")
	public int[] field494 = new int[6];

	@ObfuscatedName("CWWAFTAL.k")
	public int[] field495 = new int[6];

	@ObfuscatedName("CWWAFTAL.l")
	public int[] field496 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("CWWAFTAL.m")
	public boolean field497 = false;

	@ObfuscatedName("CWWAFTAL.f")
	public static int field490;

	@ObfuscatedName("CWWAFTAL.i")
	public int[] field493;

	@ObfuscatedName("CWWAFTAL.g")
	public static CWWAFTAL[] field491;

	@ObfuscatedName("CWWAFTAL.a(LFIGUVTWB;Z)V")
	public static void method173(FIGUVTWB arg0) {
		MUKVLYLC var1 = new MUKVLYLC(arg0.method209("idk.dat", null));
		field490 = var1.method294();
		if (field491 == null) {
			field491 = new CWWAFTAL[field490];
		}

		for (int var2 = 0; var2 < field490; var2++) {
			if (field491[var2] == null) {
				field491[var2] = new CWWAFTAL();
			}

			field491[var2].method174(var1);
		}
	}

	@ObfuscatedName("CWWAFTAL.a(LMUKVLYLC;Z)V")
	public void method174(MUKVLYLC arg0) {
		while (true) {
			int var2 = arg0.method292();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field492 = arg0.method292();
			} else if (var2 == 2) {
				int var3 = arg0.method292();
				field493 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field493[var4] = arg0.method294();
				}
			} else if (var2 == 3) {
				field497 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field494[var2 - 40] = arg0.method294();
			} else if (var2 >= 50 && var2 < 60) {
				field495[var2 - 50] = arg0.method294();
			} else if (var2 >= 60 && var2 < 70) {
				field496[var2 - 60] = arg0.method294();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("CWWAFTAL.a(Z)Z")
	public boolean method175() {
		if (field493 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field493.length; var2++) {
			if (!NJPATAFL.method335(field493[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("CWWAFTAL.b(Z)LNJPATAFL;")
	public NJPATAFL method176() {
		if (field493 == null) {
			return null;
		}

		NJPATAFL[] var1 = new NJPATAFL[field493.length];
		for (int var2 = 0; var2 < field493.length; var2++) {
			var1[var2] = NJPATAFL.method334(field493[var2]);
		}

		NJPATAFL var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new NJPATAFL(var1, var1.length);
		}

		for (int var4 = 0; var4 < 6 && field494[var4] != 0; var4++) {
			var3.method348(field494[var4], field495[var4]);
		}

		return var3;
	}

	@ObfuscatedName("CWWAFTAL.a(I)Z")
	public boolean method177() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (field496[var2] != -1 && !NJPATAFL.method335(field496[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("CWWAFTAL.a(B)LNJPATAFL;")
	public NJPATAFL method178() {
		NJPATAFL[] var1 = new NJPATAFL[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field496[var3] != -1) {
				var1[var2++] = NJPATAFL.method334(field496[var3]);
			}
		}

		NJPATAFL var4 = new NJPATAFL(var1, var2);
		for (int var5 = 0; var5 < 6 && field494[var5] != 0; var5++) {
			var4.method348(field494[var5], field495[var5]);
		}

		return var4;
	}
}
