package deob;

@ObfuscatedName("JZFUUSFN")
public class JZFUUSFN {

	@ObfuscatedName("JZFUUSFN.h")
	public int field846 = -1;

	@ObfuscatedName("JZFUUSFN.j")
	public boolean field848 = false;

	@ObfuscatedName("JZFUUSFN.k")
	public int field849 = 5;

	@ObfuscatedName("JZFUUSFN.l")
	public int field850 = -1;

	@ObfuscatedName("JZFUUSFN.m")
	public int field851 = -1;

	@ObfuscatedName("JZFUUSFN.n")
	public int field852 = 99;

	@ObfuscatedName("JZFUUSFN.o")
	public int field853 = -1;

	@ObfuscatedName("JZFUUSFN.p")
	public int field854 = -1;

	@ObfuscatedName("JZFUUSFN.q")
	public int field855 = 2;

	@ObfuscatedName("JZFUUSFN.b")
	public static int field840;

	@ObfuscatedName("JZFUUSFN.d")
	public int field842;

	@ObfuscatedName("JZFUUSFN.r")
	public int field856;

	@ObfuscatedName("JZFUUSFN.e")
	public int[] field843;

	@ObfuscatedName("JZFUUSFN.f")
	public int[] field844;

	@ObfuscatedName("JZFUUSFN.g")
	public int[] field845;

	@ObfuscatedName("JZFUUSFN.i")
	public int[] field847;

	@ObfuscatedName("JZFUUSFN.c")
	public static JZFUUSFN[] field841;

	@ObfuscatedName("JZFUUSFN.a(BLIEMHZJLX;)V")
	public static void method307(IEMHZJLX arg0) {
		MVHXDWGI var1 = new MVHXDWGI(arg0.method242("seq.dat", null));
		field840 = var1.method359();
		if (field841 == null) {
			field841 = new JZFUUSFN[field840];
		}

		for (int var2 = 0; var2 < field840; var2++) {
			if (field841[var2] == null) {
				field841[var2] = new JZFUUSFN();
			}

			field841[var2].method309(var1);
		}
	}

	@ObfuscatedName("JZFUUSFN.a(II)I")
	public int method308(int arg0) {
		int var2 = field845[arg0];
		if (var2 == 0) {
			YPRWORMV var3 = YPRWORMV.method601(field843[arg0]);
			if (var3 != null) {
				var2 = field845[arg0] = var3.field1504;
			}
		}

		if (var2 == 0) {
			var2 = 1;
		}

		return var2;
	}

	@ObfuscatedName("JZFUUSFN.a(ILMVHXDWGI;)V")
	public void method309(MVHXDWGI arg0) {
		while (true) {
			int var2 = arg0.method357();
			if (var2 == 0) {
				if (field842 == 0) {
					field842 = 1;
					field843 = new int[1];
					field843[0] = -1;
					field844 = new int[1];
					field844[0] = -1;
					field845 = new int[1];
					field845[0] = -1;
				}

				if (field853 == -1) {
					if (field847 == null) {
						field853 = 0;
					} else {
						field853 = 2;
					}
				}

				if (field854 == -1) {
					if (field847 != null) {
						field854 = 2;
						return;
					}

					field854 = 0;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field842 = arg0.method357();
				field843 = new int[field842];
				field844 = new int[field842];
				field845 = new int[field842];
				for (int var3 = 0; var3 < field842; var3++) {
					field843[var3] = arg0.method359();
					field844[var3] = arg0.method359();
					if (field844[var3] == 0xFFFF) {
						field844[var3] = -1;
					}

					field845[var3] = arg0.method359();
				}
			} else if (var2 == 2) {
				field846 = arg0.method359();
			} else if (var2 == 3) {
				int var4 = arg0.method357();
				field847 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field847[var5] = arg0.method357();
				}

				field847[var4] = 9999999;
			} else if (var2 == 4) {
				field848 = true;
			} else if (var2 == 5) {
				field849 = arg0.method357();
			} else if (var2 == 6) {
				field850 = arg0.method359();
			} else if (var2 == 7) {
				field851 = arg0.method359();
			} else if (var2 == 8) {
				field852 = arg0.method357();
			} else if (var2 == 9) {
				field853 = arg0.method357();
			} else if (var2 == 10) {
				field854 = arg0.method357();
			} else if (var2 == 11) {
				field855 = arg0.method357();
			} else if (var2 == 12) {
				field856 = arg0.method362();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
