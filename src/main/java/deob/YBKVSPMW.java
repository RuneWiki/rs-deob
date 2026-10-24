package deob;

@ObfuscatedName("YBKVSPMW")
public class YBKVSPMW {

	@ObfuscatedName("YBKVSPMW.j")
	public boolean field1366 = false;

	@ObfuscatedName("YBKVSPMW.k")
	public boolean field1367 = true;

	@ObfuscatedName("YBKVSPMW.m")
	public boolean field1369 = false;

	@ObfuscatedName("YBKVSPMW.p")
	public boolean field1372 = false;

	@ObfuscatedName("YBKVSPMW.q")
	public int field1373 = -1;

	@ObfuscatedName("YBKVSPMW.c")
	public static int field1359;

	@ObfuscatedName("YBKVSPMW.e")
	public static int field1361;

	@ObfuscatedName("YBKVSPMW.h")
	public int field1364;

	@ObfuscatedName("YBKVSPMW.i")
	public int field1365;

	@ObfuscatedName("YBKVSPMW.l")
	public int field1368;

	@ObfuscatedName("YBKVSPMW.n")
	public int field1370;

	@ObfuscatedName("YBKVSPMW.o")
	public int field1371;

	@ObfuscatedName("YBKVSPMW.g")
	public String field1363;

	@ObfuscatedName("YBKVSPMW.f")
	public static int[] field1362;

	@ObfuscatedName("YBKVSPMW.d")
	public static YBKVSPMW[] field1360;

	@ObfuscatedName("YBKVSPMW.a(ZLXMRRKSSB;)V")
	public static void method526(XMRRKSSB arg0) {
		XQPFGONL var1 = new XQPFGONL(arg0.method465("varp.dat", null));
		field1361 = 0;
		field1359 = var1.method480();
		if (field1360 == null) {
			field1360 = new YBKVSPMW[field1359];
		}

		if (field1362 == null) {
			field1362 = new int[field1359];
		}

		for (int var2 = 0; var2 < field1359; var2++) {
			if (field1360[var2] == null) {
				field1360[var2] = new YBKVSPMW();
			}

			field1360[var2].method527(var1, var2);
		}

		if (var1.field1334.length != var1.field1335) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("YBKVSPMW.a(ZLXQPFGONL;I)V")
	public void method527(XQPFGONL arg0, int arg1) {
		while (true) {
			int var3 = arg0.method478();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field1364 = arg0.method478();
			} else if (var3 == 2) {
				field1365 = arg0.method478();
			} else if (var3 == 3) {
				field1366 = true;
				field1362[field1361++] = arg1;
			} else if (var3 == 4) {
				field1367 = false;
			} else if (var3 == 5) {
				field1368 = arg0.method480();
			} else if (var3 == 6) {
				field1369 = true;
			} else if (var3 == 7) {
				field1370 = arg0.method483();
			} else if (var3 == 8) {
				field1371 = 1;
				field1372 = true;
			} else if (var3 == 10) {
				field1363 = arg0.method485();
			} else if (var3 == 11) {
				field1372 = true;
			} else if (var3 == 12) {
				field1373 = arg0.method483();
			} else if (var3 == 13) {
				field1371 = 2;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
