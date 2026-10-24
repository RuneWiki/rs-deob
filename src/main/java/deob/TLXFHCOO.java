package deob;

@ObfuscatedName("TLXFHCOO")
public class TLXFHCOO {

	@ObfuscatedName("TLXFHCOO.i")
	public int field1247 = -1;

	@ObfuscatedName("TLXFHCOO.k")
	public boolean field1249 = false;

	@ObfuscatedName("TLXFHCOO.l")
	public int field1250 = 5;

	@ObfuscatedName("TLXFHCOO.m")
	public int field1251 = -1;

	@ObfuscatedName("TLXFHCOO.n")
	public int field1252 = -1;

	@ObfuscatedName("TLXFHCOO.o")
	public int field1253 = 99;

	@ObfuscatedName("TLXFHCOO.p")
	public int field1254 = -1;

	@ObfuscatedName("TLXFHCOO.q")
	public int field1255 = -1;

	@ObfuscatedName("TLXFHCOO.r")
	public int field1256 = 2;

	@ObfuscatedName("TLXFHCOO.c")
	public static int field1241;

	@ObfuscatedName("TLXFHCOO.e")
	public int field1243;

	@ObfuscatedName("TLXFHCOO.s")
	public int field1257;

	@ObfuscatedName("TLXFHCOO.f")
	public int[] field1244;

	@ObfuscatedName("TLXFHCOO.g")
	public int[] field1245;

	@ObfuscatedName("TLXFHCOO.h")
	public int[] field1246;

	@ObfuscatedName("TLXFHCOO.j")
	public int[] field1248;

	@ObfuscatedName("TLXFHCOO.d")
	public static TLXFHCOO[] field1242;

	@ObfuscatedName("TLXFHCOO.a(LFIGUVTWB;Z)V")
	public static void method492(FIGUVTWB arg0) {
		MUKVLYLC var1 = new MUKVLYLC(arg0.method209("seq.dat", null));
		field1241 = var1.method294();
		if (field1242 == null) {
			field1242 = new TLXFHCOO[field1241];
		}

		for (int var2 = 0; var2 < field1241; var2++) {
			if (field1242[var2] == null) {
				field1242[var2] = new TLXFHCOO();
			}

			field1242[var2].method494(var1);
		}
	}

	@ObfuscatedName("TLXFHCOO.a(IB)I")
	public int method493(int arg0) {
		int var2 = field1246[arg0];
		if (var2 == 0) {
			TDFMBTLA var3 = TDFMBTLA.method490(field1244[arg0]);
			if (var3 != null) {
				var2 = field1246[arg0] = var3.field1233;
			}
		}

		if (var2 == 0) {
			var2 = 1;
		}

		return var2;
	}

	@ObfuscatedName("TLXFHCOO.a(LMUKVLYLC;Z)V")
	public void method494(MUKVLYLC arg0) {
		while (true) {
			int var2 = arg0.method292();
			if (var2 == 0) {
				if (field1243 == 0) {
					field1243 = 1;
					field1244 = new int[1];
					field1244[0] = -1;
					field1245 = new int[1];
					field1245[0] = -1;
					field1246 = new int[1];
					field1246[0] = -1;
				}

				if (field1254 == -1) {
					if (field1248 == null) {
						field1254 = 0;
					} else {
						field1254 = 2;
					}
				}

				if (field1255 == -1) {
					if (field1248 != null) {
						field1255 = 2;
						return;
					}

					field1255 = 0;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field1243 = arg0.method292();
				field1244 = new int[field1243];
				field1245 = new int[field1243];
				field1246 = new int[field1243];
				for (int var3 = 0; var3 < field1243; var3++) {
					field1244[var3] = arg0.method294();
					field1245[var3] = arg0.method294();
					if (field1245[var3] == 0xFFFF) {
						field1245[var3] = -1;
					}

					field1246[var3] = arg0.method294();
				}
			} else if (var2 == 2) {
				field1247 = arg0.method294();
			} else if (var2 == 3) {
				int var4 = arg0.method292();
				field1248 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field1248[var5] = arg0.method292();
				}

				field1248[var4] = 9999999;
			} else if (var2 == 4) {
				field1249 = true;
			} else if (var2 == 5) {
				field1250 = arg0.method292();
			} else if (var2 == 6) {
				field1251 = arg0.method294();
			} else if (var2 == 7) {
				field1252 = arg0.method294();
			} else if (var2 == 8) {
				field1253 = arg0.method292();
			} else if (var2 == 9) {
				field1254 = arg0.method292();
			} else if (var2 == 10) {
				field1255 = arg0.method292();
			} else if (var2 == 11) {
				field1256 = arg0.method292();
			} else if (var2 == 12) {
				field1257 = arg0.method297();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
