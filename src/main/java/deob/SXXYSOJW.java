package deob;

@ObfuscatedName("SXXYSOJW")
public class SXXYSOJW {

	@ObfuscatedName("SXXYSOJW.i")
	public boolean field1165 = false;

	@ObfuscatedName("SXXYSOJW.j")
	public boolean field1166 = true;

	@ObfuscatedName("SXXYSOJW.l")
	public boolean field1168 = false;

	@ObfuscatedName("SXXYSOJW.o")
	public boolean field1171 = false;

	@ObfuscatedName("SXXYSOJW.p")
	public int field1172 = -1;

	@ObfuscatedName("SXXYSOJW.q")
	public boolean field1173 = true;

	@ObfuscatedName("SXXYSOJW.b")
	public static int field1158;

	@ObfuscatedName("SXXYSOJW.d")
	public static int field1160;

	@ObfuscatedName("SXXYSOJW.g")
	public int field1163;

	@ObfuscatedName("SXXYSOJW.h")
	public int field1164;

	@ObfuscatedName("SXXYSOJW.k")
	public int field1167;

	@ObfuscatedName("SXXYSOJW.m")
	public int field1169;

	@ObfuscatedName("SXXYSOJW.n")
	public int field1170;

	@ObfuscatedName("SXXYSOJW.f")
	public String field1162;

	@ObfuscatedName("SXXYSOJW.e")
	public static int[] field1161;

	@ObfuscatedName("SXXYSOJW.c")
	public static SXXYSOJW[] field1159;

	@ObfuscatedName("SXXYSOJW.a(LBYZSQZUF;Z)V")
	public static void method462(BYZSQZUF arg0) {
		IMUIZRAF var1 = new IMUIZRAF(arg0.method29("varp.dat", null));
		field1160 = 0;
		field1158 = var1.method240();
		if (field1159 == null) {
			field1159 = new SXXYSOJW[field1158];
		}

		if (field1161 == null) {
			field1161 = new int[field1158];
		}

		for (int var2 = 0; var2 < field1158; var2++) {
			if (field1159[var2] == null) {
				field1159[var2] = new SXXYSOJW();
			}

			field1159[var2].method463(var1, var2);
		}

		if (var1.field713.length != var1.field714) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("SXXYSOJW.a(LIMUIZRAF;II)V")
	public void method463(IMUIZRAF arg0, int arg1) {
		while (true) {
			int var3 = arg0.method238();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field1163 = arg0.method238();
			} else if (var3 == 2) {
				field1164 = arg0.method238();
			} else if (var3 == 3) {
				field1165 = true;
				field1161[field1160++] = arg1;
			} else if (var3 == 4) {
				field1166 = false;
			} else if (var3 == 5) {
				field1167 = arg0.method240();
			} else if (var3 == 6) {
				field1168 = true;
			} else if (var3 == 7) {
				field1169 = arg0.method243();
			} else if (var3 == 8) {
				field1170 = 1;
				field1171 = true;
			} else if (var3 == 10) {
				field1162 = arg0.method245();
			} else if (var3 == 11) {
				field1171 = true;
			} else if (var3 == 12) {
				field1172 = arg0.method243();
			} else if (var3 == 13) {
				field1170 = 2;
			} else if (var3 == 14) {
				field1173 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
