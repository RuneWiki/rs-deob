package deob;

@ObfuscatedName("RPRWOACX")
public class RPRWOACX {

	@ObfuscatedName("RPRWOACX.d")
	public int field1173 = -1;

	@ObfuscatedName("RPRWOACX.f")
	public int[] field1175 = new int[6];

	@ObfuscatedName("RPRWOACX.g")
	public int[] field1176 = new int[6];

	@ObfuscatedName("RPRWOACX.h")
	public int[] field1177 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("RPRWOACX.i")
	public boolean field1178 = false;

	@ObfuscatedName("RPRWOACX.b")
	public static int field1171;

	@ObfuscatedName("RPRWOACX.e")
	public int[] field1174;

	@ObfuscatedName("RPRWOACX.c")
	public static RPRWOACX[] field1172;

	@ObfuscatedName("RPRWOACX.a(ILINOFEYKQ;)V")
	public static void method431(INOFEYKQ arg0) {
		NHEPCMLW var1 = new NHEPCMLW(arg0.method277("idk.dat", null));
		field1171 = var1.method351();
		if (field1172 == null) {
			field1172 = new RPRWOACX[field1171];
		}

		for (int var2 = 0; var2 < field1171; var2++) {
			if (field1172[var2] == null) {
				field1172[var2] = new RPRWOACX();
			}

			field1172[var2].method432(var1);
		}
	}

	@ObfuscatedName("RPRWOACX.a(ZLNHEPCMLW;)V")
	public void method432(NHEPCMLW arg0) {
		while (true) {
			int var2 = arg0.method349();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1173 = arg0.method349();
			} else if (var2 == 2) {
				int var3 = arg0.method349();
				field1174 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field1174[var4] = arg0.method351();
				}
			} else if (var2 == 3) {
				field1178 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field1175[var2 - 40] = arg0.method351();
			} else if (var2 >= 50 && var2 < 60) {
				field1176[var2 - 50] = arg0.method351();
			} else if (var2 >= 60 && var2 < 70) {
				field1177[var2 - 60] = arg0.method351();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("RPRWOACX.a(I)Z")
	public boolean method433() {
		if (field1174 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field1174.length; var2++) {
			if (!CSGBDGDY.method161(field1174[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("RPRWOACX.b(I)LCSGBDGDY;")
	public CSGBDGDY method434() {
		if (field1174 == null) {
			return null;
		}

		CSGBDGDY[] var1 = new CSGBDGDY[field1174.length];
		for (int var2 = 0; var2 < field1174.length; var2++) {
			var1[var2] = CSGBDGDY.method160(field1174[var2]);
		}

		CSGBDGDY var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new CSGBDGDY(var1.length, var1);
		}

		for (int var4 = 0; var4 < 6 && field1175[var4] != 0; var4++) {
			var3.method174(field1175[var4], field1176[var4]);
		}

		return var3;
	}

	@ObfuscatedName("RPRWOACX.c(I)Z")
	public boolean method435() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (field1177[var2] != -1 && !CSGBDGDY.method161(field1177[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("RPRWOACX.a(Z)LCSGBDGDY;")
	public CSGBDGDY method436() {
		CSGBDGDY[] var1 = new CSGBDGDY[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field1177[var3] != -1) {
				var1[var2++] = CSGBDGDY.method160(field1177[var3]);
			}
		}

		CSGBDGDY var4 = new CSGBDGDY(var2, var1);
		for (int var5 = 0; var5 < 6 && field1175[var5] != 0; var5++) {
			var4.method174(field1175[var5], field1176[var5]);
		}

		return var4;
	}
}
