package deob;

@ObfuscatedName("UGUHDANY")
public class UGUHDANY {

	@ObfuscatedName("UGUHDANY.f")
	public int field1287 = -1;

	@ObfuscatedName("UGUHDANY.h")
	public int[] field1289 = new int[6];

	@ObfuscatedName("UGUHDANY.i")
	public int[] field1290 = new int[6];

	@ObfuscatedName("UGUHDANY.j")
	public int[] field1291 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("UGUHDANY.k")
	public boolean field1292 = false;

	@ObfuscatedName("UGUHDANY.d")
	public static int field1285;

	@ObfuscatedName("UGUHDANY.g")
	public int[] field1288;

	@ObfuscatedName("UGUHDANY.e")
	public static UGUHDANY[] field1286;

	@ObfuscatedName("UGUHDANY.a(LWEMOPWVJ;I)V")
	public static void method496(WEMOPWVJ arg0) {
		SVWJKJVI var1 = new SVWJKJVI(arg0.method559("idk.dat", null));
		field1285 = var1.method463();
		if (field1286 == null) {
			field1286 = new UGUHDANY[field1285];
		}

		for (int var2 = 0; var2 < field1285; var2++) {
			if (field1286[var2] == null) {
				field1286[var2] = new UGUHDANY();
			}

			field1286[var2].method497(var1);
		}
	}

	@ObfuscatedName("UGUHDANY.a(ILSVWJKJVI;)V")
	public void method497(SVWJKJVI arg0) {
		while (true) {
			int var2 = arg0.method461();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1287 = arg0.method461();
			} else if (var2 == 2) {
				int var3 = arg0.method461();
				field1288 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1288[var4] = arg0.method463();
				}
			} else if (var2 == 3) {
				field1292 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field1289[var2 - 40] = arg0.method463();
			} else if (var2 >= 50 && var2 < 60) {
				field1290[var2 - 50] = arg0.method463();
			} else if (var2 >= 60 && var2 < 70) {
				field1291[var2 - 60] = arg0.method463();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("UGUHDANY.a(I)Z")
	public boolean method498() {
		if (field1288 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field1288.length; var2++) {
			if (!IYSWJGDE.method274(field1288[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("UGUHDANY.b(I)LIYSWJGDE;")
	public IYSWJGDE method499() {
		if (field1288 == null) {
			return null;
		}

		IYSWJGDE[] var1 = new IYSWJGDE[field1288.length];
		for (int var2 = 0; var2 < field1288.length; var2++) {
			var1[var2] = IYSWJGDE.method273(field1288[var2]);
		}

		IYSWJGDE var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new IYSWJGDE(var1.length, var1);
		}

		for (int var4 = 0; var4 < 6 && field1289[var4] != 0; var4++) {
			var3.method287(field1289[var4], field1290[var4]);
		}

		return var3;
	}

	@ObfuscatedName("UGUHDANY.c(I)Z")
	public boolean method500() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (field1291[var2] != -1 && !IYSWJGDE.method274(field1291[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("UGUHDANY.d(I)LIYSWJGDE;")
	public IYSWJGDE method501() {
		IYSWJGDE[] var1 = new IYSWJGDE[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field1291[var3] != -1) {
				var1[var2++] = IYSWJGDE.method273(field1291[var3]);
			}
		}

		IYSWJGDE var4 = new IYSWJGDE(var2, var1);
		for (int var5 = 0; var5 < 6 && field1289[var5] != 0; var5++) {
			var4.method287(field1289[var5], field1290[var5]);
		}

		return var4;
	}
}
