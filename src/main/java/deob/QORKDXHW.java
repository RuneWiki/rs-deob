package deob;

@ObfuscatedName("QORKDXHW")
public class QORKDXHW {

	@ObfuscatedName("QORKDXHW.h")
	public boolean field1183 = false;

	@ObfuscatedName("QORKDXHW.i")
	public boolean field1184 = true;

	@ObfuscatedName("QORKDXHW.k")
	public boolean field1186 = false;

	@ObfuscatedName("QORKDXHW.n")
	public boolean field1189 = false;

	@ObfuscatedName("QORKDXHW.o")
	public int field1190 = -1;

	@ObfuscatedName("QORKDXHW.p")
	public boolean field1191 = true;

	@ObfuscatedName("QORKDXHW.a")
	public static int field1176;

	@ObfuscatedName("QORKDXHW.c")
	public static int field1178;

	@ObfuscatedName("QORKDXHW.f")
	public int field1181;

	@ObfuscatedName("QORKDXHW.g")
	public int field1182;

	@ObfuscatedName("QORKDXHW.j")
	public int field1185;

	@ObfuscatedName("QORKDXHW.l")
	public int field1187;

	@ObfuscatedName("QORKDXHW.m")
	public int field1188;

	@ObfuscatedName("QORKDXHW.e")
	public String field1180;

	@ObfuscatedName("QORKDXHW.d")
	public static int[] field1179;

	@ObfuscatedName("QORKDXHW.b")
	public static QORKDXHW[] field1177;

	@ObfuscatedName("QORKDXHW.a(LDTIATKJO;I)V")
	public static void method467(DTIATKJO arg0) {
		GHHPHSRU var1 = new GHHPHSRU(arg0.method168("varp.dat", null));
		field1178 = 0;
		field1176 = var1.method204();
		if (field1177 == null) {
			field1177 = new QORKDXHW[field1176];
		}

		if (field1179 == null) {
			field1179 = new int[field1176];
		}

		for (int var2 = 0; var2 < field1176; var2++) {
			if (field1177[var2] == null) {
				field1177[var2] = new QORKDXHW();
			}

			field1177[var2].method468(var2, var1);
		}

		if (var1.field666.length != var1.field667) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("QORKDXHW.a(IILGHHPHSRU;)V")
	public void method468(int arg0, GHHPHSRU arg1) {
		while (true) {
			int var3 = arg1.method202();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field1181 = arg1.method202();
			} else if (var3 == 2) {
				field1182 = arg1.method202();
			} else if (var3 == 3) {
				field1183 = true;
				field1179[field1178++] = arg0;
			} else if (var3 == 4) {
				field1184 = false;
			} else if (var3 == 5) {
				field1185 = arg1.method204();
			} else if (var3 == 6) {
				field1186 = true;
			} else if (var3 == 7) {
				field1187 = arg1.method207();
			} else if (var3 == 8) {
				field1188 = 1;
				field1189 = true;
			} else if (var3 == 10) {
				field1180 = arg1.method209();
			} else if (var3 == 11) {
				field1189 = true;
			} else if (var3 == 12) {
				field1190 = arg1.method207();
			} else if (var3 == 13) {
				field1188 = 2;
				field1189 = true;
			} else if (var3 == 14) {
				field1191 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
