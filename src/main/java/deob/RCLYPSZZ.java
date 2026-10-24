package deob;

@ObfuscatedName("RCLYPSZZ")
public class RCLYPSZZ {

	@ObfuscatedName("RCLYPSZZ.i")
	public boolean field1326 = false;

	@ObfuscatedName("RCLYPSZZ.j")
	public int field1327 = -1;

	@ObfuscatedName("RCLYPSZZ.l")
	public boolean field1329 = true;

	@ObfuscatedName("RCLYPSZZ.c")
	public static int field1320;

	@ObfuscatedName("RCLYPSZZ.f")
	public int field1323;

	@ObfuscatedName("RCLYPSZZ.g")
	public int field1324;

	@ObfuscatedName("RCLYPSZZ.h")
	public int field1325;

	@ObfuscatedName("RCLYPSZZ.k")
	public int field1328;

	@ObfuscatedName("RCLYPSZZ.e")
	public String field1322;

	@ObfuscatedName("RCLYPSZZ.d")
	public static RCLYPSZZ[] field1321;

	@ObfuscatedName("RCLYPSZZ.a(ILSRZUEVOD;)V")
	public static void method560(SRZUEVOD arg0) {
		LZWRHABP var1 = new LZWRHABP(arg0.method566("varbit.dat", null));
		field1320 = var1.method465();
		if (field1321 == null) {
			field1321 = new RCLYPSZZ[field1320];
		}

		for (int var2 = 0; var2 < field1320; var2++) {
			if (field1321[var2] == null) {
				field1321[var2] = new RCLYPSZZ();
			}

			field1321[var2].method561(var1, var2);

			if (field1321[var2].field1326) {
				CUNNWCIM.field623[field1321[var2].field1323].field635 = true;
			}
		}

		if (var1.field1138.length != var1.field1139) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("RCLYPSZZ.a(LLZWRHABP;II)V")
	public void method561(LZWRHABP arg0, int arg1) {
		while (true) {
			int var3 = arg0.method463();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field1323 = arg0.method465();
				field1324 = arg0.method463();
				field1325 = arg0.method463();
			} else if (var3 == 10) {
				field1322 = arg0.method470();
			} else if (var3 == 2) {
				field1326 = true;
			} else if (var3 == 3) {
				field1327 = arg0.method468();
			} else if (var3 == 4) {
				field1328 = arg0.method468();
			} else if (var3 == 5) {
				field1329 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
