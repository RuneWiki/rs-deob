package deob;

@ObfuscatedName("TMMXBYBU")
public class TMMXBYBU {

	@ObfuscatedName("TMMXBYBU.d")
	public int field1076 = -1;

	@ObfuscatedName("TMMXBYBU.f")
	public int[] field1078 = new int[6];

	@ObfuscatedName("TMMXBYBU.g")
	public int[] field1079 = new int[6];

	@ObfuscatedName("TMMXBYBU.h")
	public int[] field1080 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("TMMXBYBU.i")
	public boolean field1081 = false;

	@ObfuscatedName("TMMXBYBU.b")
	public static int field1074;

	@ObfuscatedName("TMMXBYBU.e")
	public int[] field1077;

	@ObfuscatedName("TMMXBYBU.c")
	public static TMMXBYBU[] field1075;

	@ObfuscatedName("TMMXBYBU.a(LRSPRYUFS;I)V")
	public static void method450(RSPRYUFS arg0) {
		NQUAUMDT var1 = new NQUAUMDT(arg0.method427("idk.dat", null));
		field1074 = var1.method341();
		if (field1075 == null) {
			field1075 = new TMMXBYBU[field1074];
		}

		for (int var2 = 0; var2 < field1074; var2++) {
			if (field1075[var2] == null) {
				field1075[var2] = new TMMXBYBU();
			}

			field1075[var2].method451(var1);
		}
	}

	@ObfuscatedName("TMMXBYBU.a(BLNQUAUMDT;)V")
	public void method451(NQUAUMDT arg0) {
		while (true) {
			int var2 = arg0.method339();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1076 = arg0.method339();
			} else if (var2 == 2) {
				int var3 = arg0.method339();
				field1077 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1077[var4] = arg0.method341();
				}
			} else if (var2 == 3) {
				field1081 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field1078[var2 - 40] = arg0.method341();
			} else if (var2 >= 50 && var2 < 60) {
				field1079[var2 - 50] = arg0.method341();
			} else if (var2 >= 60 && var2 < 70) {
				field1080[var2 - 60] = arg0.method341();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("TMMXBYBU.a(B)Z")
	public boolean method452() {
		if (field1077 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field1077.length; var2++) {
			if (!JUQSYEMB.method213(field1077[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("TMMXBYBU.a(Z)LJUQSYEMB;")
	public JUQSYEMB method453() {
		if (field1077 == null) {
			return null;
		}

		JUQSYEMB[] var1 = new JUQSYEMB[field1077.length];
		for (int var2 = 0; var2 < field1077.length; var2++) {
			var1[var2] = JUQSYEMB.method212(field1077[var2]);
		}

		JUQSYEMB var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new JUQSYEMB(var1.length, var1);
		}

		for (int var4 = 0; var4 < 6 && field1078[var4] != 0; var4++) {
			var3.method226(field1078[var4], field1079[var4]);
		}

		return var3;
	}

	@ObfuscatedName("TMMXBYBU.a(I)Z")
	public boolean method454() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (field1080[var2] != -1 && !JUQSYEMB.method213(field1080[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("TMMXBYBU.b(B)LJUQSYEMB;")
	public JUQSYEMB method455() {
		JUQSYEMB[] var1 = new JUQSYEMB[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field1080[var3] != -1) {
				var1[var2++] = JUQSYEMB.method212(field1080[var3]);
			}
		}

		JUQSYEMB var4 = new JUQSYEMB(var2, var1);
		for (int var5 = 0; var5 < 6 && field1078[var5] != 0; var5++) {
			var4.method226(field1078[var5], field1079[var5]);
		}

		return var4;
	}
}
