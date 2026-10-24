package deob;

@ObfuscatedName("SLGAFVQN")
public class SLGAFVQN {

	@ObfuscatedName("SLGAFVQN.i")
	public boolean field1225 = false;

	@ObfuscatedName("SLGAFVQN.j")
	public boolean field1226 = true;

	@ObfuscatedName("SLGAFVQN.l")
	public boolean field1228 = false;

	@ObfuscatedName("SLGAFVQN.o")
	public boolean field1231 = false;

	@ObfuscatedName("SLGAFVQN.p")
	public int field1232 = -1;

	@ObfuscatedName("SLGAFVQN.q")
	public boolean field1233 = true;

	@ObfuscatedName("SLGAFVQN.b")
	public static int field1218;

	@ObfuscatedName("SLGAFVQN.d")
	public static int field1220;

	@ObfuscatedName("SLGAFVQN.g")
	public int field1223;

	@ObfuscatedName("SLGAFVQN.h")
	public int field1224;

	@ObfuscatedName("SLGAFVQN.k")
	public int field1227;

	@ObfuscatedName("SLGAFVQN.m")
	public int field1229;

	@ObfuscatedName("SLGAFVQN.n")
	public int field1230;

	@ObfuscatedName("SLGAFVQN.f")
	public String field1222;

	@ObfuscatedName("SLGAFVQN.e")
	public static int[] field1221;

	@ObfuscatedName("SLGAFVQN.c")
	public static SLGAFVQN[] field1219;

	@ObfuscatedName("SLGAFVQN.a(BLRPFMUSNN;)V")
	public static void method421(RPFMUSNN arg0) {
		WNCFPLWV var1 = new WNCFPLWV(arg0.method414("varp.dat", null));
		field1220 = 0;
		field1218 = var1.method504();
		if (field1219 == null) {
			field1219 = new SLGAFVQN[field1218];
		}

		if (field1221 == null) {
			field1221 = new int[field1218];
		}

		for (int var2 = 0; var2 < field1218; var2++) {
			if (field1219[var2] == null) {
				field1219[var2] = new SLGAFVQN();
			}

			field1219[var2].method422(var2, var1);
		}

		if (var1.field1374.length != var1.field1375) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("SLGAFVQN.a(ILWNCFPLWV;Z)V")
	public void method422(int arg0, WNCFPLWV arg1) {
		while (true) {
			int var3 = arg1.method502();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field1223 = arg1.method502();
			} else if (var3 == 2) {
				field1224 = arg1.method502();
			} else if (var3 == 3) {
				field1225 = true;
				field1221[field1220++] = arg0;
			} else if (var3 == 4) {
				field1226 = false;
			} else if (var3 == 5) {
				field1227 = arg1.method504();
			} else if (var3 == 6) {
				field1228 = true;
			} else if (var3 == 7) {
				field1229 = arg1.method507();
			} else if (var3 == 8) {
				field1230 = 1;
				field1231 = true;
			} else if (var3 == 10) {
				field1222 = arg1.method509();
			} else if (var3 == 11) {
				field1231 = true;
			} else if (var3 == 12) {
				field1232 = arg1.method507();
			} else if (var3 == 13) {
				field1230 = 2;
				field1231 = true;
			} else if (var3 == 14) {
				field1233 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
