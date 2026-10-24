package deob;

@ObfuscatedName("SECEMLXT")
public class SECEMLXT {

	@ObfuscatedName("SECEMLXT.e")
	public int field1212 = -1;

	@ObfuscatedName("SECEMLXT.g")
	public int[] field1214 = new int[6];

	@ObfuscatedName("SECEMLXT.h")
	public int[] field1215 = new int[6];

	@ObfuscatedName("SECEMLXT.i")
	public int[] field1216 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("SECEMLXT.j")
	public boolean field1217 = false;

	@ObfuscatedName("SECEMLXT.c")
	public static int field1210;

	@ObfuscatedName("SECEMLXT.f")
	public int[] field1213;

	@ObfuscatedName("SECEMLXT.d")
	public static SECEMLXT[] field1211;

	@ObfuscatedName("SECEMLXT.a(BLRPFMUSNN;)V")
	public static void method415(RPFMUSNN arg0) {
		WNCFPLWV var1 = new WNCFPLWV(arg0.method414("idk.dat", null));
		field1210 = var1.method504();
		if (field1211 == null) {
			field1211 = new SECEMLXT[field1210];
		}

		for (int var2 = 0; var2 < field1210; var2++) {
			if (field1211[var2] == null) {
				field1211[var2] = new SECEMLXT();
			}

			field1211[var2].method416(var1);
		}
	}

	@ObfuscatedName("SECEMLXT.a(ILWNCFPLWV;)V")
	public void method416(WNCFPLWV arg0) {
		while (true) {
			int var2 = arg0.method502();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1212 = arg0.method502();
			} else if (var2 == 2) {
				int var3 = arg0.method502();
				field1213 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1213[var4] = arg0.method504();
				}
			} else if (var2 == 3) {
				field1217 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field1214[var2 - 40] = arg0.method504();
			} else if (var2 >= 50 && var2 < 60) {
				field1215[var2 - 50] = arg0.method504();
			} else if (var2 >= 60 && var2 < 70) {
				field1216[var2 - 60] = arg0.method504();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("SECEMLXT.a(Z)Z")
	public boolean method417() {
		if (field1213 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field1213.length; var2++) {
			if (!UNLYQRUD.method443(field1213[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("SECEMLXT.a(I)LUNLYQRUD;")
	public UNLYQRUD method418() {
		if (field1213 == null) {
			return null;
		}

		UNLYQRUD[] var1 = new UNLYQRUD[field1213.length];
		for (int var2 = 0; var2 < field1213.length; var2++) {
			var1[var2] = UNLYQRUD.method442(field1213[var2]);
		}

		UNLYQRUD var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new UNLYQRUD(var1.length, var1);
		}

		for (int var4 = 0; var4 < 6 && field1214[var4] != 0; var4++) {
			var3.method456(field1214[var4], field1215[var4]);
		}

		return var3;
	}

	@ObfuscatedName("SECEMLXT.b(Z)Z")
	public boolean method419() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (field1216[var2] != -1 && !UNLYQRUD.method443(field1216[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("SECEMLXT.b(I)LUNLYQRUD;")
	public UNLYQRUD method420() {
		UNLYQRUD[] var1 = new UNLYQRUD[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field1216[var3] != -1) {
				var1[var2++] = UNLYQRUD.method442(field1216[var3]);
			}
		}

		UNLYQRUD var4 = new UNLYQRUD(var2, var1);
		for (int var5 = 0; var5 < 6 && field1214[var5] != 0; var5++) {
			var4.method456(field1214[var5], field1215[var5]);
		}

		return var4;
	}
}
