package deob;

@ObfuscatedName("RGMKWKCG")
public class RGMKWKCG {

	@ObfuscatedName("RGMKWKCG.i")
	public boolean field1213 = false;

	@ObfuscatedName("RGMKWKCG.j")
	public boolean field1214 = true;

	@ObfuscatedName("RGMKWKCG.l")
	public boolean field1216 = false;

	@ObfuscatedName("RGMKWKCG.o")
	public boolean field1219 = false;

	@ObfuscatedName("RGMKWKCG.p")
	public int field1220 = -1;

	@ObfuscatedName("RGMKWKCG.q")
	public boolean field1221 = true;

	@ObfuscatedName("RGMKWKCG.b")
	public static int field1206;

	@ObfuscatedName("RGMKWKCG.d")
	public static int field1208;

	@ObfuscatedName("RGMKWKCG.g")
	public int field1211;

	@ObfuscatedName("RGMKWKCG.h")
	public int field1212;

	@ObfuscatedName("RGMKWKCG.k")
	public int field1215;

	@ObfuscatedName("RGMKWKCG.m")
	public int field1217;

	@ObfuscatedName("RGMKWKCG.n")
	public int field1218;

	@ObfuscatedName("RGMKWKCG.f")
	public String field1210;

	@ObfuscatedName("RGMKWKCG.e")
	public static int[] field1209;

	@ObfuscatedName("RGMKWKCG.c")
	public static RGMKWKCG[] field1207;

	@ObfuscatedName("RGMKWKCG.a(BLJUPFHAZZ;)V")
	public static void method474(JUPFHAZZ arg0) {
		TKPFKOXP var1 = new TKPFKOXP(arg0.method372("varp.dat", null));
		field1208 = 0;
		field1206 = var1.method531();
		if (field1207 == null) {
			field1207 = new RGMKWKCG[field1206];
		}

		if (field1209 == null) {
			field1209 = new int[field1206];
		}

		for (int var2 = 0; var2 < field1206; var2++) {
			if (field1207[var2] == null) {
				field1207[var2] = new RGMKWKCG();
			}

			field1207[var2].method475(var1, var2);
		}

		if (var1.field1381.length != var1.field1382) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("RGMKWKCG.a(LTKPFKOXP;II)V")
	public void method475(TKPFKOXP arg0, int arg1) {
		while (true) {
			int var3 = arg0.method529();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field1211 = arg0.method529();
			} else if (var3 == 2) {
				field1212 = arg0.method529();
			} else if (var3 == 3) {
				field1213 = true;
				field1209[field1208++] = arg1;
			} else if (var3 == 4) {
				field1214 = false;
			} else if (var3 == 5) {
				field1215 = arg0.method531();
			} else if (var3 == 6) {
				field1216 = true;
			} else if (var3 == 7) {
				field1217 = arg0.method534();
			} else if (var3 == 8) {
				field1218 = 1;
				field1219 = true;
			} else if (var3 == 10) {
				field1210 = arg0.method536();
			} else if (var3 == 11) {
				field1219 = true;
			} else if (var3 == 12) {
				field1220 = arg0.method534();
			} else if (var3 == 13) {
				field1218 = 2;
				field1219 = true;
			} else if (var3 == 14) {
				field1221 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
