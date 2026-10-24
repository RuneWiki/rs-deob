package deob;

@ObfuscatedName("CFPLMOQH")
public class CFPLMOQH {

	@ObfuscatedName("CFPLMOQH.g")
	public int field92 = -1;

	@ObfuscatedName("CFPLMOQH.i")
	public int[] field94 = new int[6];

	@ObfuscatedName("CFPLMOQH.j")
	public int[] field95 = new int[6];

	@ObfuscatedName("CFPLMOQH.k")
	public int[] field96 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("CFPLMOQH.l")
	public boolean field97 = false;

	@ObfuscatedName("CFPLMOQH.e")
	public static int field90;

	@ObfuscatedName("CFPLMOQH.h")
	public int[] field93;

	@ObfuscatedName("CFPLMOQH.f")
	public static CFPLMOQH[] field91;

	@ObfuscatedName("CFPLMOQH.a(ILUUIGNTAD;)V")
	public static void method29(UUIGNTAD arg0) {
		CMGGUSPR var1 = new CMGGUSPR(arg0.method545("idk.dat", null));
		field90 = var1.method196();
		if (field91 == null) {
			field91 = new CFPLMOQH[field90];
		}

		for (int var2 = 0; var2 < field90; var2++) {
			if (field91[var2] == null) {
				field91[var2] = new CFPLMOQH();
			}

			field91[var2].method30(var1);
		}
	}

	@ObfuscatedName("CFPLMOQH.a(LCMGGUSPR;I)V")
	public void method30(CMGGUSPR arg0) {
		while (true) {
			int var2 = arg0.method194();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field92 = arg0.method194();
			} else if (var2 == 2) {
				int var3 = arg0.method194();
				field93 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field93[var4] = arg0.method196();
				}
			} else if (var2 == 3) {
				field97 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field94[var2 - 40] = arg0.method196();
			} else if (var2 >= 50 && var2 < 60) {
				field95[var2 - 50] = arg0.method196();
			} else if (var2 >= 60 && var2 < 70) {
				field96[var2 - 60] = arg0.method196();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("CFPLMOQH.a(Z)Z")
	public boolean method31() {
		if (field93 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field93.length; var2++) {
			if (!GCSAWSJV.method261(field93[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("CFPLMOQH.b(Z)LGCSAWSJV;")
	public GCSAWSJV method32() {
		if (field93 == null) {
			return null;
		}

		GCSAWSJV[] var1 = new GCSAWSJV[field93.length];
		for (int var2 = 0; var2 < field93.length; var2++) {
			var1[var2] = GCSAWSJV.method260(field93[var2]);
		}

		GCSAWSJV var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new GCSAWSJV(var1, var1.length);
		}

		for (int var4 = 0; var4 < 6 && field94[var4] != 0; var4++) {
			var3.method274(field94[var4], field95[var4]);
		}

		return var3;
	}

	@ObfuscatedName("CFPLMOQH.a(B)Z")
	public boolean method33() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (field96[var2] != -1 && !GCSAWSJV.method261(field96[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("CFPLMOQH.a(I)LGCSAWSJV;")
	public GCSAWSJV method34() {
		GCSAWSJV[] var1 = new GCSAWSJV[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field96[var3] != -1) {
				var1[var2++] = GCSAWSJV.method260(field96[var3]);
			}
		}

		GCSAWSJV var4 = new GCSAWSJV(var1, var2);
		for (int var5 = 0; var5 < 6 && field94[var5] != 0; var5++) {
			var4.method274(field94[var5], field95[var5]);
		}

		return var4;
	}
}
