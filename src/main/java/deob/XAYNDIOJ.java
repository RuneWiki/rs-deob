package deob;

@ObfuscatedName("XAYNDIOJ")
public class XAYNDIOJ {

	@ObfuscatedName("XAYNDIOJ.d")
	public int field1287 = -1;

	@ObfuscatedName("XAYNDIOJ.f")
	public int[] field1289 = new int[6];

	@ObfuscatedName("XAYNDIOJ.g")
	public int[] field1290 = new int[6];

	@ObfuscatedName("XAYNDIOJ.h")
	public int[] field1291 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("XAYNDIOJ.i")
	public boolean field1292 = false;

	@ObfuscatedName("XAYNDIOJ.b")
	public static int field1285;

	@ObfuscatedName("XAYNDIOJ.e")
	public int[] field1288;

	@ObfuscatedName("XAYNDIOJ.c")
	public static XAYNDIOJ[] field1286;

	@ObfuscatedName("XAYNDIOJ.a(LOTSGNSQM;Z)V")
	public static void method508(OTSGNSQM arg0) {
		YOXDZEVD var1 = new YOXDZEVD(arg0.method376("idk.dat", null));
		field1285 = var1.method551();
		if (field1286 == null) {
			field1286 = new XAYNDIOJ[field1285];
		}

		for (int var2 = 0; var2 < field1285; var2++) {
			if (field1286[var2] == null) {
				field1286[var2] = new XAYNDIOJ();
			}

			field1286[var2].method509(var1);
		}
	}

	@ObfuscatedName("XAYNDIOJ.a(BLYOXDZEVD;)V")
	public void method509(YOXDZEVD arg0) {
		while (true) {
			int var2 = arg0.method549();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1287 = arg0.method549();
			} else if (var2 == 2) {
				int var3 = arg0.method549();
				field1288 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1288[var4] = arg0.method551();
				}
			} else if (var2 == 3) {
				field1292 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field1289[var2 - 40] = arg0.method551();
			} else if (var2 >= 50 && var2 < 60) {
				field1290[var2 - 50] = arg0.method551();
			} else if (var2 >= 60 && var2 < 70) {
				field1291[var2 - 60] = arg0.method551();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("XAYNDIOJ.a(I)Z")
	public boolean method510() {
		if (field1288 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field1288.length; var2++) {
			if (!OIBEFFXI.method347(field1288[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("XAYNDIOJ.a(Z)LOIBEFFXI;")
	public OIBEFFXI method511() {
		if (field1288 == null) {
			return null;
		}

		OIBEFFXI[] var1 = new OIBEFFXI[field1288.length];
		for (int var2 = 0; var2 < field1288.length; var2++) {
			var1[var2] = OIBEFFXI.method346(field1288[var2]);
		}

		OIBEFFXI var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new OIBEFFXI(var1, var1.length);
		}

		for (int var4 = 0; var4 < 6 && field1289[var4] != 0; var4++) {
			var3.method360(field1289[var4], field1290[var4]);
		}

		return var3;
	}

	@ObfuscatedName("XAYNDIOJ.b(I)Z")
	public boolean method512() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (field1291[var2] != -1 && !OIBEFFXI.method347(field1291[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("XAYNDIOJ.c(I)LOIBEFFXI;")
	public OIBEFFXI method513() {
		OIBEFFXI[] var1 = new OIBEFFXI[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field1291[var3] != -1) {
				var1[var2++] = OIBEFFXI.method346(field1291[var3]);
			}
		}

		OIBEFFXI var4 = new OIBEFFXI(var1, var2);
		for (int var5 = 0; var5 < 6 && field1289[var5] != 0; var5++) {
			var4.method360(field1289[var5], field1290[var5]);
		}

		return var4;
	}
}
