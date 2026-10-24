package deob;

@ObfuscatedName("TGYZPJQJ")
public class TGYZPJQJ {

	@ObfuscatedName("TGYZPJQJ.h")
	public int field1124 = -1;

	@ObfuscatedName("TGYZPJQJ.j")
	public int[] field1126 = new int[6];

	@ObfuscatedName("TGYZPJQJ.k")
	public int[] field1127 = new int[6];

	@ObfuscatedName("TGYZPJQJ.l")
	public int field1128 = 128;

	@ObfuscatedName("TGYZPJQJ.m")
	public int field1129 = 128;

	@ObfuscatedName("TGYZPJQJ.q")
	public static ACKKZISC field1133 = new ACKKZISC(30);

	@ObfuscatedName("TGYZPJQJ.d")
	public static int field1120;

	@ObfuscatedName("TGYZPJQJ.f")
	public int field1122;

	@ObfuscatedName("TGYZPJQJ.g")
	public int field1123;

	@ObfuscatedName("TGYZPJQJ.n")
	public int field1130;

	@ObfuscatedName("TGYZPJQJ.o")
	public int field1131;

	@ObfuscatedName("TGYZPJQJ.p")
	public int field1132;

	@ObfuscatedName("TGYZPJQJ.i")
	public LZZHVUJR field1125;

	@ObfuscatedName("TGYZPJQJ.e")
	public static TGYZPJQJ[] field1121;

	@ObfuscatedName("TGYZPJQJ.a(ZLFXNTEMPE;)V")
	public static void method442(FXNTEMPE arg0) {
		RSWRPCHR var1 = new RSWRPCHR(arg0.method212("spotanim.dat", null));
		field1120 = var1.method390();
		if (field1121 == null) {
			field1121 = new TGYZPJQJ[field1120];
		}

		for (int var2 = 0; var2 < field1120; var2++) {
			if (field1121[var2] == null) {
				field1121[var2] = new TGYZPJQJ();
			}

			field1121[var2].field1122 = var2;
			field1121[var2].method443(var1);
		}
	}

	@ObfuscatedName("TGYZPJQJ.a(LRSWRPCHR;B)V")
	public void method443(RSWRPCHR arg0) {
		while (true) {
			int var2 = arg0.method388();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1123 = arg0.method390();
			} else if (var2 == 2) {
				field1124 = arg0.method390();
				if (LZZHVUJR.field832 != null) {
					field1125 = LZZHVUJR.field832[field1124];
				}
			} else if (var2 == 4) {
				field1128 = arg0.method390();
			} else if (var2 == 5) {
				field1129 = arg0.method390();
			} else if (var2 == 6) {
				field1130 = arg0.method390();
			} else if (var2 == 7) {
				field1131 = arg0.method388();
			} else if (var2 == 8) {
				field1132 = arg0.method388();
			} else if (var2 >= 40 && var2 < 50) {
				field1126[var2 - 40] = arg0.method390();
			} else if (var2 >= 50 && var2 < 60) {
				field1127[var2 - 50] = arg0.method390();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("TGYZPJQJ.a()LWRJMHIDY;")
	public WRJMHIDY method444() {
		WRJMHIDY var1 = (WRJMHIDY) field1133.method1(field1122);
		if (var1 != null) {
			return var1;
		}

		WRJMHIDY var2 = WRJMHIDY.method466(field1123);
		if (var2 == null) {
			return null;
		}

		for (int var3 = 0; var3 < 6; var3++) {
			if (field1126[0] != 0) {
				var2.method480(field1126[var3], field1127[var3]);
			}
		}

		field1133.method2(field1122, var2);
		return var2;
	}
}
