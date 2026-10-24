package deob;

@ObfuscatedName("SFNSVANZ")
public class SFNSVANZ {

	@ObfuscatedName("SFNSVANZ.i")
	public boolean field1138 = false;

	@ObfuscatedName("SFNSVANZ.j")
	public boolean field1139 = true;

	@ObfuscatedName("SFNSVANZ.l")
	public boolean field1141 = false;

	@ObfuscatedName("SFNSVANZ.o")
	public boolean field1144 = false;

	@ObfuscatedName("SFNSVANZ.p")
	public int field1145 = -1;

	@ObfuscatedName("SFNSVANZ.q")
	public boolean field1146 = true;

	@ObfuscatedName("SFNSVANZ.b")
	public static int field1131;

	@ObfuscatedName("SFNSVANZ.d")
	public static int field1133;

	@ObfuscatedName("SFNSVANZ.g")
	public int field1136;

	@ObfuscatedName("SFNSVANZ.h")
	public int field1137;

	@ObfuscatedName("SFNSVANZ.k")
	public int field1140;

	@ObfuscatedName("SFNSVANZ.m")
	public int field1142;

	@ObfuscatedName("SFNSVANZ.n")
	public int field1143;

	@ObfuscatedName("SFNSVANZ.f")
	public String field1135;

	@ObfuscatedName("SFNSVANZ.e")
	public static int[] field1134;

	@ObfuscatedName("SFNSVANZ.c")
	public static SFNSVANZ[] field1132;

	@ObfuscatedName("SFNSVANZ.a(LFNOQZAYQ;I)V")
	public static void method412(FNOQZAYQ arg0) {
		DNRIFKTO var1 = new DNRIFKTO(arg0.method246("varp.dat", null));
		field1133 = 0;
		field1131 = var1.method191();
		if (field1132 == null) {
			field1132 = new SFNSVANZ[field1131];
		}

		if (field1134 == null) {
			field1134 = new int[field1131];
		}

		for (int var2 = 0; var2 < field1131; var2++) {
			if (field1132[var2] == null) {
				field1132[var2] = new SFNSVANZ();
			}

			field1132[var2].method413(var1, var2);
		}

		if (var1.field562.length != var1.field563) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("SFNSVANZ.a(LDNRIFKTO;IB)V")
	public void method413(DNRIFKTO arg0, int arg1) {
		while (true) {
			int var3 = arg0.method189();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field1136 = arg0.method189();
			} else if (var3 == 2) {
				field1137 = arg0.method189();
			} else if (var3 == 3) {
				field1138 = true;
				field1134[field1133++] = arg1;
			} else if (var3 == 4) {
				field1139 = false;
			} else if (var3 == 5) {
				field1140 = arg0.method191();
			} else if (var3 == 6) {
				field1141 = true;
			} else if (var3 == 7) {
				field1142 = arg0.method194();
			} else if (var3 == 8) {
				field1143 = 1;
				field1144 = true;
			} else if (var3 == 10) {
				field1135 = arg0.method196();
			} else if (var3 == 11) {
				field1144 = true;
			} else if (var3 == 12) {
				field1145 = arg0.method194();
			} else if (var3 == 13) {
				field1143 = 2;
				field1144 = true;
			} else if (var3 == 14) {
				field1146 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
