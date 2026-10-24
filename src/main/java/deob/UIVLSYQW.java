package deob;

@ObfuscatedName("UIVLSYQW")
public class UIVLSYQW {

	@ObfuscatedName("UIVLSYQW.g")
	public int field1155 = -1;

	@ObfuscatedName("UIVLSYQW.i")
	public int[] field1157 = new int[6];

	@ObfuscatedName("UIVLSYQW.j")
	public int[] field1158 = new int[6];

	@ObfuscatedName("UIVLSYQW.k")
	public int field1159 = 128;

	@ObfuscatedName("UIVLSYQW.l")
	public int field1160 = 128;

	@ObfuscatedName("UIVLSYQW.p")
	public static CZWVRQJW field1164 = new CZWVRQJW(30);

	@ObfuscatedName("UIVLSYQW.c")
	public static int field1151;

	@ObfuscatedName("UIVLSYQW.e")
	public int field1153;

	@ObfuscatedName("UIVLSYQW.f")
	public int field1154;

	@ObfuscatedName("UIVLSYQW.m")
	public int field1161;

	@ObfuscatedName("UIVLSYQW.n")
	public int field1162;

	@ObfuscatedName("UIVLSYQW.o")
	public int field1163;

	@ObfuscatedName("UIVLSYQW.h")
	public XKEHWKFH field1156;

	@ObfuscatedName("UIVLSYQW.d")
	public static UIVLSYQW[] field1152;

	@ObfuscatedName("UIVLSYQW.a(ILSPZBTZXL;)V")
	public static void method537(SPZBTZXL arg0) {
		LDILQFVA var1 = new LDILQFVA(arg0.method515("spotanim.dat", null));
		field1151 = var1.method404();
		if (field1152 == null) {
			field1152 = new UIVLSYQW[field1151];
		}

		for (int var2 = 0; var2 < field1151; var2++) {
			if (field1152[var2] == null) {
				field1152[var2] = new UIVLSYQW();
			}

			field1152[var2].field1153 = var2;
			field1152[var2].method538(var1);
		}
	}

	@ObfuscatedName("UIVLSYQW.a(LLDILQFVA;I)V")
	public void method538(LDILQFVA arg0) {
		while (true) {
			int var2 = arg0.method402();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1154 = arg0.method404();
			} else if (var2 == 2) {
				field1155 = arg0.method404();
				if (XKEHWKFH.field1362 != null) {
					field1156 = XKEHWKFH.field1362[field1155];
				}
			} else if (var2 == 4) {
				field1159 = arg0.method404();
			} else if (var2 == 5) {
				field1160 = arg0.method404();
			} else if (var2 == 6) {
				field1161 = arg0.method404();
			} else if (var2 == 7) {
				field1162 = arg0.method402();
			} else if (var2 == 8) {
				field1163 = arg0.method402();
			} else if (var2 >= 40 && var2 < 50) {
				field1157[var2 - 40] = arg0.method404();
			} else if (var2 >= 50 && var2 < 60) {
				field1158[var2 - 50] = arg0.method404();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("UIVLSYQW.a()LHEQROJXW;")
	public HEQROJXW method539() {
		HEQROJXW var1 = (HEQROJXW) field1164.method152(field1153);
		if (var1 != null) {
			return var1;
		}

		HEQROJXW var2 = HEQROJXW.method322(field1154);
		if (var2 == null) {
			return null;
		}

		for (int var3 = 0; var3 < 6; var3++) {
			if (field1157[0] != 0) {
				var2.method336(field1157[var3], field1158[var3]);
			}
		}

		field1164.method153(var2, field1153);
		return var2;
	}
}
