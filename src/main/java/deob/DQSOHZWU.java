package deob;

@ObfuscatedName("DQSOHZWU")
public class DQSOHZWU {

	@ObfuscatedName("DQSOHZWU.g")
	public int field550 = -1;

	@ObfuscatedName("DQSOHZWU.i")
	public int[] field552 = new int[6];

	@ObfuscatedName("DQSOHZWU.j")
	public int[] field553 = new int[6];

	@ObfuscatedName("DQSOHZWU.k")
	public int[] field554 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("DQSOHZWU.l")
	public boolean field555 = false;

	@ObfuscatedName("DQSOHZWU.e")
	public static int field548;

	@ObfuscatedName("DQSOHZWU.h")
	public int[] field551;

	@ObfuscatedName("DQSOHZWU.f")
	public static DQSOHZWU[] field549;

	@ObfuscatedName("DQSOHZWU.a(ILHRXSNEYZ;)V")
	public static void method213(HRXSNEYZ arg0) {
		JHKSAGUC var1 = new JHKSAGUC(arg0.method289("idk.dat", null));
		field548 = var1.method308();
		if (field549 == null) {
			field549 = new DQSOHZWU[field548];
		}

		for (int var2 = 0; var2 < field548; var2++) {
			if (field549[var2] == null) {
				field549[var2] = new DQSOHZWU();
			}

			field549[var2].method214(var1);
		}
	}

	@ObfuscatedName("DQSOHZWU.a(LJHKSAGUC;I)V")
	public void method214(JHKSAGUC arg0) {
		while (true) {
			int var2 = arg0.method306();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field550 = arg0.method306();
			} else if (var2 == 2) {
				int var3 = arg0.method306();
				field551 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field551[var4] = arg0.method308();
				}
			} else if (var2 == 3) {
				field555 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field552[var2 - 40] = arg0.method308();
			} else if (var2 >= 50 && var2 < 60) {
				field553[var2 - 50] = arg0.method308();
			} else if (var2 >= 60 && var2 < 70) {
				field554[var2 - 60] = arg0.method308();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("DQSOHZWU.a(Z)Z")
	public boolean method215() {
		if (field551 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field551.length; var2++) {
			if (!RTQSBWRH.method455(field551[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("DQSOHZWU.a(I)LRTQSBWRH;")
	public RTQSBWRH method216() {
		if (field551 == null) {
			return null;
		}

		RTQSBWRH[] var1 = new RTQSBWRH[field551.length];
		for (int var2 = 0; var2 < field551.length; var2++) {
			var1[var2] = RTQSBWRH.method454(field551[var2]);
		}

		RTQSBWRH var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new RTQSBWRH(var1.length, var1);
		}

		for (int var4 = 0; var4 < 6 && field552[var4] != 0; var4++) {
			var3.method468(field552[var4], field553[var4]);
		}

		return var3;
	}

	@ObfuscatedName("DQSOHZWU.b(I)Z")
	public boolean method217() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (field554[var2] != -1 && !RTQSBWRH.method455(field554[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("DQSOHZWU.b(Z)LRTQSBWRH;")
	public RTQSBWRH method218() {
		RTQSBWRH[] var1 = new RTQSBWRH[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field554[var3] != -1) {
				var1[var2++] = RTQSBWRH.method454(field554[var3]);
			}
		}

		RTQSBWRH var4 = new RTQSBWRH(var2, var1);
		for (int var5 = 0; var5 < 6 && field552[var5] != 0; var5++) {
			var4.method468(field552[var5], field553[var5]);
		}

		return var4;
	}
}
