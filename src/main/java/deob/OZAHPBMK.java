package deob;

@ObfuscatedName("OZAHPBMK")
public class OZAHPBMK {

	@ObfuscatedName("OZAHPBMK.i")
	public boolean field1100 = false;

	@ObfuscatedName("OZAHPBMK.j")
	public boolean field1101 = true;

	@ObfuscatedName("OZAHPBMK.l")
	public boolean field1103 = false;

	@ObfuscatedName("OZAHPBMK.o")
	public boolean field1106 = false;

	@ObfuscatedName("OZAHPBMK.p")
	public int field1107 = -1;

	@ObfuscatedName("OZAHPBMK.q")
	public boolean field1108 = true;

	@ObfuscatedName("OZAHPBMK.b")
	public static int field1093;

	@ObfuscatedName("OZAHPBMK.d")
	public static int field1095;

	@ObfuscatedName("OZAHPBMK.g")
	public int field1098;

	@ObfuscatedName("OZAHPBMK.h")
	public int field1099;

	@ObfuscatedName("OZAHPBMK.k")
	public int field1102;

	@ObfuscatedName("OZAHPBMK.m")
	public int field1104;

	@ObfuscatedName("OZAHPBMK.n")
	public int field1105;

	@ObfuscatedName("OZAHPBMK.f")
	public String field1097;

	@ObfuscatedName("OZAHPBMK.e")
	public static int[] field1096;

	@ObfuscatedName("OZAHPBMK.c")
	public static OZAHPBMK[] field1094;

	@ObfuscatedName("OZAHPBMK.a(LVSUYIIVA;I)V")
	public static void method457(VSUYIIVA arg0) {
		CFARFRSG var1 = new CFARFRSG(arg0.method570("varp.dat", null));
		field1095 = 0;
		field1093 = var1.method32();
		if (field1094 == null) {
			field1094 = new OZAHPBMK[field1093];
		}

		if (field1096 == null) {
			field1096 = new int[field1093];
		}

		for (int var2 = 0; var2 < field1093; var2++) {
			if (field1094[var2] == null) {
				field1094[var2] = new OZAHPBMK();
			}

			field1094[var2].method458(var2, var1);
		}

		if (var1.field43.length != var1.field44) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("OZAHPBMK.a(IBLCFARFRSG;)V")
	public void method458(int arg0, CFARFRSG arg1) {
		while (true) {
			int var3 = arg1.method30();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field1098 = arg1.method30();
			} else if (var3 == 2) {
				field1099 = arg1.method30();
			} else if (var3 == 3) {
				field1100 = true;
				field1096[field1095++] = arg0;
			} else if (var3 == 4) {
				field1101 = false;
			} else if (var3 == 5) {
				field1102 = arg1.method32();
			} else if (var3 == 6) {
				field1103 = true;
			} else if (var3 == 7) {
				field1104 = arg1.method35();
			} else if (var3 == 8) {
				field1105 = 1;
				field1106 = true;
			} else if (var3 == 10) {
				field1097 = arg1.method37();
			} else if (var3 == 11) {
				field1106 = true;
			} else if (var3 == 12) {
				field1107 = arg1.method35();
			} else if (var3 == 13) {
				field1105 = 2;
				field1106 = true;
			} else if (var3 == 14) {
				field1108 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
