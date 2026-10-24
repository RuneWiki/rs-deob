package deob;

@ObfuscatedName("PJCTWSQI")
public class PJCTWSQI {

	@ObfuscatedName("PJCTWSQI.e")
	public int field1077 = -1;

	@ObfuscatedName("PJCTWSQI.g")
	public int[] field1079 = new int[6];

	@ObfuscatedName("PJCTWSQI.h")
	public int[] field1080 = new int[6];

	@ObfuscatedName("PJCTWSQI.i")
	public int[] field1081 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("PJCTWSQI.j")
	public boolean field1082 = false;

	@ObfuscatedName("PJCTWSQI.c")
	public static int field1075;

	@ObfuscatedName("PJCTWSQI.f")
	public int[] field1078;

	@ObfuscatedName("PJCTWSQI.d")
	public static PJCTWSQI[] field1076;

	@ObfuscatedName("PJCTWSQI.a(ILSYUGXMZF;)V")
	public static void method468(SYUGXMZF arg0) {
		KHOMSBHW var1 = new KHOMSBHW(arg0.method551("idk.dat", null));
		field1075 = var1.method351();
		if (field1076 == null) {
			field1076 = new PJCTWSQI[field1075];
		}

		for (int var2 = 0; var2 < field1075; var2++) {
			if (field1076[var2] == null) {
				field1076[var2] = new PJCTWSQI();
			}

			field1076[var2].method469(var1);
		}
	}

	@ObfuscatedName("PJCTWSQI.a(LKHOMSBHW;I)V")
	public void method469(KHOMSBHW arg0) {
		while (true) {
			int var2 = arg0.method349();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1077 = arg0.method349();
			} else if (var2 == 2) {
				int var3 = arg0.method349();
				field1078 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1078[var4] = arg0.method351();
				}
			} else if (var2 == 3) {
				field1082 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field1079[var2 - 40] = arg0.method351();
			} else if (var2 >= 50 && var2 < 60) {
				field1080[var2 - 50] = arg0.method351();
			} else if (var2 >= 60 && var2 < 70) {
				field1081[var2 - 60] = arg0.method351();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("PJCTWSQI.a(I)Z")
	public boolean method470() {
		if (field1078 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field1078.length; var2++) {
			if (!GEUHTGZJ.method286(field1078[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("PJCTWSQI.a(B)LGEUHTGZJ;")
	public GEUHTGZJ method471() {
		if (field1078 == null) {
			return null;
		}

		GEUHTGZJ[] var1 = new GEUHTGZJ[field1078.length];
		for (int var2 = 0; var2 < field1078.length; var2++) {
			var1[var2] = GEUHTGZJ.method285(field1078[var2]);
		}

		GEUHTGZJ var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new GEUHTGZJ(var1, var1.length);
		}

		for (int var4 = 0; var4 < 6 && field1079[var4] != 0; var4++) {
			var3.method299(field1079[var4], field1080[var4]);
		}

		return var3;
	}

	@ObfuscatedName("PJCTWSQI.a(Z)Z")
	public boolean method472() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (field1081[var2] != -1 && !GEUHTGZJ.method286(field1081[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("PJCTWSQI.b(Z)LGEUHTGZJ;")
	public GEUHTGZJ method473() {
		GEUHTGZJ[] var1 = new GEUHTGZJ[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field1081[var3] != -1) {
				var1[var2++] = GEUHTGZJ.method285(field1081[var3]);
			}
		}

		GEUHTGZJ var4 = new GEUHTGZJ(var1, var2);
		for (int var5 = 0; var5 < 6 && field1079[var5] != 0; var5++) {
			var4.method299(field1079[var5], field1080[var5]);
		}

		return var4;
	}
}
