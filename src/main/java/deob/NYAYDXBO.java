package deob;

@ObfuscatedName("NYAYDXBO")
public class NYAYDXBO {

	@ObfuscatedName("NYAYDXBO.h")
	public boolean field990 = false;

	@ObfuscatedName("NYAYDXBO.i")
	public boolean field991 = true;

	@ObfuscatedName("NYAYDXBO.k")
	public boolean field993 = false;

	@ObfuscatedName("NYAYDXBO.n")
	public boolean field996 = false;

	@ObfuscatedName("NYAYDXBO.o")
	public int field997 = -1;

	@ObfuscatedName("NYAYDXBO.a")
	public static int field983;

	@ObfuscatedName("NYAYDXBO.c")
	public static int field985;

	@ObfuscatedName("NYAYDXBO.f")
	public int field988;

	@ObfuscatedName("NYAYDXBO.g")
	public int field989;

	@ObfuscatedName("NYAYDXBO.j")
	public int field992;

	@ObfuscatedName("NYAYDXBO.l")
	public int field994;

	@ObfuscatedName("NYAYDXBO.m")
	public int field995;

	@ObfuscatedName("NYAYDXBO.e")
	public String field987;

	@ObfuscatedName("NYAYDXBO.d")
	public static int[] field986;

	@ObfuscatedName("NYAYDXBO.b")
	public static NYAYDXBO[] field984;

	@ObfuscatedName("NYAYDXBO.a(ILQKFGLETG;)V")
	public static void method369(QKFGLETG arg0) {
		XJCNBMKS var1 = new XJCNBMKS(arg0.method402("varp.dat", null));
		field985 = 0;
		field983 = var1.method536();
		if (field984 == null) {
			field984 = new NYAYDXBO[field983];
		}

		if (field986 == null) {
			field986 = new int[field983];
		}

		for (int var2 = 0; var2 < field983; var2++) {
			if (field984[var2] == null) {
				field984[var2] = new NYAYDXBO();
			}

			field984[var2].method370(var1, var2);
		}

		if (var1.field1402.length != var1.field1403) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("NYAYDXBO.a(LXJCNBMKS;II)V")
	public void method370(XJCNBMKS arg0, int arg1) {
		while (true) {
			int var3 = arg0.method534();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field988 = arg0.method534();
			} else if (var3 == 2) {
				field989 = arg0.method534();
			} else if (var3 == 3) {
				field990 = true;
				field986[field985++] = arg1;
			} else if (var3 == 4) {
				field991 = false;
			} else if (var3 == 5) {
				field992 = arg0.method536();
			} else if (var3 == 6) {
				field993 = true;
			} else if (var3 == 7) {
				field994 = arg0.method539();
			} else if (var3 == 8) {
				field995 = 1;
				field996 = true;
			} else if (var3 == 10) {
				field987 = arg0.method541();
			} else if (var3 == 11) {
				field996 = true;
			} else if (var3 == 12) {
				field997 = arg0.method539();
			} else if (var3 == 13) {
				field995 = 2;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
