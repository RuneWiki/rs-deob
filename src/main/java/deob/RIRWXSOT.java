package deob;

@ObfuscatedName("RIRWXSOT")
public class RIRWXSOT {

	@ObfuscatedName("RIRWXSOT.h")
	public boolean field1272 = false;

	@ObfuscatedName("RIRWXSOT.i")
	public boolean field1273 = true;

	@ObfuscatedName("RIRWXSOT.k")
	public boolean field1275 = false;

	@ObfuscatedName("RIRWXSOT.n")
	public boolean field1278 = false;

	@ObfuscatedName("RIRWXSOT.o")
	public int field1279 = -1;

	@ObfuscatedName("RIRWXSOT.p")
	public boolean field1280 = true;

	@ObfuscatedName("RIRWXSOT.a")
	public static int field1265;

	@ObfuscatedName("RIRWXSOT.c")
	public static int field1267;

	@ObfuscatedName("RIRWXSOT.f")
	public int field1270;

	@ObfuscatedName("RIRWXSOT.g")
	public int field1271;

	@ObfuscatedName("RIRWXSOT.j")
	public int field1274;

	@ObfuscatedName("RIRWXSOT.l")
	public int field1276;

	@ObfuscatedName("RIRWXSOT.m")
	public int field1277;

	@ObfuscatedName("RIRWXSOT.e")
	public String field1269;

	@ObfuscatedName("RIRWXSOT.d")
	public static int[] field1268;

	@ObfuscatedName("RIRWXSOT.b")
	public static RIRWXSOT[] field1266;

	@ObfuscatedName("RIRWXSOT.a(BLIEMHZJLX;)V")
	public static void method493(IEMHZJLX arg0) {
		MVHXDWGI var1 = new MVHXDWGI(arg0.method242("varp.dat", null));
		field1267 = 0;
		field1265 = var1.method359();
		if (field1266 == null) {
			field1266 = new RIRWXSOT[field1265];
		}

		if (field1268 == null) {
			field1268 = new int[field1265];
		}

		for (int var2 = 0; var2 < field1265; var2++) {
			if (field1266[var2] == null) {
				field1266[var2] = new RIRWXSOT();
			}

			field1266[var2].method494(var2, var1);
		}

		if (var1.field1013.length != var1.field1014) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("RIRWXSOT.a(ILMVHXDWGI;B)V")
	public void method494(int arg0, MVHXDWGI arg1) {
		while (true) {
			int var3 = arg1.method357();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field1270 = arg1.method357();
			} else if (var3 == 2) {
				field1271 = arg1.method357();
			} else if (var3 == 3) {
				field1272 = true;
				field1268[field1267++] = arg0;
			} else if (var3 == 4) {
				field1273 = false;
			} else if (var3 == 5) {
				field1274 = arg1.method359();
			} else if (var3 == 6) {
				field1275 = true;
			} else if (var3 == 7) {
				field1276 = arg1.method362();
			} else if (var3 == 8) {
				field1277 = 1;
				field1278 = true;
			} else if (var3 == 10) {
				field1269 = arg1.method364();
			} else if (var3 == 11) {
				field1278 = true;
			} else if (var3 == 12) {
				field1279 = arg1.method362();
			} else if (var3 == 13) {
				field1277 = 2;
				field1278 = true;
			} else if (var3 == 14) {
				field1280 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
