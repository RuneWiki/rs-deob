package deob;

@ObfuscatedName("WINORGIB")
public class WINORGIB {

	@ObfuscatedName("WINORGIB.e")
	public int field1419 = -1;

	@ObfuscatedName("WINORGIB.g")
	public int[] field1421 = new int[6];

	@ObfuscatedName("WINORGIB.h")
	public int[] field1422 = new int[6];

	@ObfuscatedName("WINORGIB.i")
	public int[] field1423 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("WINORGIB.j")
	public boolean field1424 = false;

	@ObfuscatedName("WINORGIB.c")
	public static int field1417;

	@ObfuscatedName("WINORGIB.f")
	public int[] field1420;

	@ObfuscatedName("WINORGIB.d")
	public static WINORGIB[] field1418;

	@ObfuscatedName("WINORGIB.a(LAWEEREDT;I)V")
	public static void method525(AWEEREDT arg0) {
		IUVBENCV var1 = new IUVBENCV(arg0.method14("idk.dat", null));
		field1417 = var1.method247();
		if (field1418 == null) {
			field1418 = new WINORGIB[field1417];
		}

		for (int var2 = 0; var2 < field1417; var2++) {
			if (field1418[var2] == null) {
				field1418[var2] = new WINORGIB();
			}

			field1418[var2].method526(var1);
		}
	}

	@ObfuscatedName("WINORGIB.a(LIUVBENCV;B)V")
	public void method526(IUVBENCV arg0) {
		while (true) {
			int var2 = arg0.method245();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1419 = arg0.method245();
			} else if (var2 == 2) {
				int var3 = arg0.method245();
				field1420 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1420[var4] = arg0.method247();
				}
			} else if (var2 == 3) {
				field1424 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field1421[var2 - 40] = arg0.method247();
			} else if (var2 >= 50 && var2 < 60) {
				field1422[var2 - 50] = arg0.method247();
			} else if (var2 >= 60 && var2 < 70) {
				field1423[var2 - 60] = arg0.method247();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("WINORGIB.a(I)Z")
	public boolean method527() {
		if (field1420 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field1420.length; var2++) {
			if (!JJMVUSJJ.method301(field1420[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("WINORGIB.a(B)LJJMVUSJJ;")
	public JJMVUSJJ method528() {
		if (field1420 == null) {
			return null;
		}

		JJMVUSJJ[] var1 = new JJMVUSJJ[field1420.length];
		for (int var2 = 0; var2 < field1420.length; var2++) {
			var1[var2] = JJMVUSJJ.method300(field1420[var2]);
		}

		JJMVUSJJ var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new JJMVUSJJ(var1, var1.length);
		}

		for (int var4 = 0; var4 < 6 && field1421[var4] != 0; var4++) {
			var3.method314(field1421[var4], field1422[var4]);
		}

		return var3;
	}

	@ObfuscatedName("WINORGIB.b(I)Z")
	public boolean method529() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (field1423[var2] != -1 && !JJMVUSJJ.method301(field1423[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("WINORGIB.b(B)LJJMVUSJJ;")
	public JJMVUSJJ method530() {
		JJMVUSJJ[] var1 = new JJMVUSJJ[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field1423[var3] != -1) {
				var1[var2++] = JJMVUSJJ.method300(field1423[var3]);
			}
		}

		JJMVUSJJ var4 = new JJMVUSJJ(var1, var2);
		for (int var5 = 0; var5 < 6 && field1421[var5] != 0; var5++) {
			var4.method314(field1421[var5], field1422[var5]);
		}

		return var4;
	}
}
