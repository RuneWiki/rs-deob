package deob;

@ObfuscatedName("WBROSLMK")
public class WBROSLMK {

	@ObfuscatedName("WBROSLMK.j")
	public boolean field1215 = false;

	@ObfuscatedName("WBROSLMK.k")
	public boolean field1216 = true;

	@ObfuscatedName("WBROSLMK.m")
	public boolean field1218 = false;

	@ObfuscatedName("WBROSLMK.p")
	public boolean field1221 = false;

	@ObfuscatedName("WBROSLMK.q")
	public int field1222 = -1;

	@ObfuscatedName("WBROSLMK.r")
	public boolean field1223 = true;

	@ObfuscatedName("WBROSLMK.c")
	public static int field1208;

	@ObfuscatedName("WBROSLMK.e")
	public static int field1210;

	@ObfuscatedName("WBROSLMK.h")
	public int field1213;

	@ObfuscatedName("WBROSLMK.i")
	public int field1214;

	@ObfuscatedName("WBROSLMK.l")
	public int field1217;

	@ObfuscatedName("WBROSLMK.n")
	public int field1219;

	@ObfuscatedName("WBROSLMK.o")
	public int field1220;

	@ObfuscatedName("WBROSLMK.g")
	public String field1212;

	@ObfuscatedName("WBROSLMK.f")
	public static int[] field1211;

	@ObfuscatedName("WBROSLMK.d")
	public static WBROSLMK[] field1209;

	@ObfuscatedName("WBROSLMK.a(ZLFXNTEMPE;)V")
	public static void method460(FXNTEMPE arg0) {
		RSWRPCHR var1 = new RSWRPCHR(arg0.method212("varp.dat", null));
		field1210 = 0;
		field1208 = var1.method390();
		if (field1209 == null) {
			field1209 = new WBROSLMK[field1208];
		}

		if (field1211 == null) {
			field1211 = new int[field1208];
		}

		for (int var2 = 0; var2 < field1208; var2++) {
			if (field1209[var2] == null) {
				field1209[var2] = new WBROSLMK();
			}

			field1209[var2].method461(var2, var1);
		}

		if (var1.field1037.length != var1.field1038) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("WBROSLMK.a(IILRSWRPCHR;)V")
	public void method461(int arg0, RSWRPCHR arg1) {
		while (true) {
			int var3 = arg1.method388();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field1213 = arg1.method388();
			} else if (var3 == 2) {
				field1214 = arg1.method388();
			} else if (var3 == 3) {
				field1215 = true;
				field1211[field1210++] = arg0;
			} else if (var3 == 4) {
				field1216 = false;
			} else if (var3 == 5) {
				field1217 = arg1.method390();
			} else if (var3 == 6) {
				field1218 = true;
			} else if (var3 == 7) {
				field1219 = arg1.method393();
			} else if (var3 == 8) {
				field1220 = 1;
				field1221 = true;
			} else if (var3 == 10) {
				field1212 = arg1.method395();
			} else if (var3 == 11) {
				field1221 = true;
			} else if (var3 == 12) {
				field1222 = arg1.method393();
			} else if (var3 == 13) {
				field1220 = 2;
				field1221 = true;
			} else if (var3 == 14) {
				field1223 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
