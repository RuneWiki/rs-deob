package deob;

@ObfuscatedName("GQDAZHGX")
public class GQDAZHGX {

	@ObfuscatedName("GQDAZHGX.i")
	public boolean field720 = false;

	@ObfuscatedName("GQDAZHGX.j")
	public boolean field721 = true;

	@ObfuscatedName("GQDAZHGX.l")
	public boolean field723 = false;

	@ObfuscatedName("GQDAZHGX.o")
	public boolean field726 = false;

	@ObfuscatedName("GQDAZHGX.p")
	public int field727 = -1;

	@ObfuscatedName("GQDAZHGX.q")
	public boolean field728 = true;

	@ObfuscatedName("GQDAZHGX.b")
	public static int field713;

	@ObfuscatedName("GQDAZHGX.d")
	public static int field715;

	@ObfuscatedName("GQDAZHGX.g")
	public int field718;

	@ObfuscatedName("GQDAZHGX.h")
	public int field719;

	@ObfuscatedName("GQDAZHGX.k")
	public int field722;

	@ObfuscatedName("GQDAZHGX.m")
	public int field724;

	@ObfuscatedName("GQDAZHGX.n")
	public int field725;

	@ObfuscatedName("GQDAZHGX.f")
	public String field717;

	@ObfuscatedName("GQDAZHGX.e")
	public static int[] field716;

	@ObfuscatedName("GQDAZHGX.c")
	public static GQDAZHGX[] field714;

	@ObfuscatedName("GQDAZHGX.a(LNXFIIFAD;I)V")
	public static void method213(NXFIIFAD arg0) {
		MNKDCXXG var1 = new MNKDCXXG(arg0.method431("varp.dat", null));
		field715 = 0;
		field713 = var1.method388();
		if (field714 == null) {
			field714 = new GQDAZHGX[field713];
		}

		if (field716 == null) {
			field716 = new int[field713];
		}

		for (int var2 = 0; var2 < field713; var2++) {
			if (field714[var2] == null) {
				field714[var2] = new GQDAZHGX();
			}

			field714[var2].method214(var1, var2);
		}

		if (var1.field1054.length != var1.field1055) {
			System.out.println("varptype load mismatch");
		}
	}

	@ObfuscatedName("GQDAZHGX.a(LMNKDCXXG;ZI)V")
	public void method214(MNKDCXXG arg0, int arg1) {
		while (true) {
			int var3 = arg0.method386();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field718 = arg0.method386();
			} else if (var3 == 2) {
				field719 = arg0.method386();
			} else if (var3 == 3) {
				field720 = true;
				field716[field715++] = arg1;
			} else if (var3 == 4) {
				field721 = false;
			} else if (var3 == 5) {
				field722 = arg0.method388();
			} else if (var3 == 6) {
				field723 = true;
			} else if (var3 == 7) {
				field724 = arg0.method391();
			} else if (var3 == 8) {
				field725 = 1;
				field726 = true;
			} else if (var3 == 10) {
				field717 = arg0.method393();
			} else if (var3 == 11) {
				field726 = true;
			} else if (var3 == 12) {
				field727 = arg0.method391();
			} else if (var3 == 13) {
				field725 = 2;
				field726 = true;
			} else if (var3 == 14) {
				field728 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
