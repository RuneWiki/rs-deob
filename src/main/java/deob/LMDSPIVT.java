package deob;

@ObfuscatedName("LMDSPIVT")
public class LMDSPIVT {

	@ObfuscatedName("LMDSPIVT.i")
	public int field872 = -1;

	@ObfuscatedName("LMDSPIVT.k")
	public boolean field874 = false;

	@ObfuscatedName("LMDSPIVT.l")
	public int field875 = 5;

	@ObfuscatedName("LMDSPIVT.m")
	public int field876 = -1;

	@ObfuscatedName("LMDSPIVT.n")
	public int field877 = -1;

	@ObfuscatedName("LMDSPIVT.o")
	public int field878 = 99;

	@ObfuscatedName("LMDSPIVT.p")
	public int field879 = -1;

	@ObfuscatedName("LMDSPIVT.q")
	public int field880 = -1;

	@ObfuscatedName("LMDSPIVT.r")
	public int field881 = 2;

	@ObfuscatedName("LMDSPIVT.c")
	public static int field866;

	@ObfuscatedName("LMDSPIVT.e")
	public int field868;

	@ObfuscatedName("LMDSPIVT.s")
	public int field882;

	@ObfuscatedName("LMDSPIVT.f")
	public int[] field869;

	@ObfuscatedName("LMDSPIVT.g")
	public int[] field870;

	@ObfuscatedName("LMDSPIVT.h")
	public int[] field871;

	@ObfuscatedName("LMDSPIVT.j")
	public int[] field873;

	@ObfuscatedName("LMDSPIVT.d")
	public static LMDSPIVT[] field867;

	@ObfuscatedName("LMDSPIVT.a(BLSXKKBWPU;)V")
	public static void method279(SXKKBWPU arg0) {
		TQYMAXSO var1 = new TQYMAXSO(arg0.method442("seq.dat", null));
		field866 = var1.method470();
		if (field867 == null) {
			field867 = new LMDSPIVT[field866];
		}

		for (int var2 = 0; var2 < field866; var2++) {
			if (field867[var2] == null) {
				field867[var2] = new LMDSPIVT();
			}

			field867[var2].method281(var1);
		}
	}

	@ObfuscatedName("LMDSPIVT.a(II)I")
	public int method280(int arg0) {
		int var2 = field871[arg0];
		if (var2 == 0) {
			SGSYCWFB var3 = SGSYCWFB.method422(field869[arg0]);
			if (var3 != null) {
				var2 = field871[arg0] = var3.field1199;
			}
		}

		if (var2 == 0) {
			var2 = 1;
		}

		return var2;
	}

	@ObfuscatedName("LMDSPIVT.a(ILTQYMAXSO;)V")
	public void method281(TQYMAXSO arg0) {
		while (true) {
			int var2 = arg0.method468();
			if (var2 == 0) {
				if (field868 == 0) {
					field868 = 1;
					field869 = new int[1];
					field869[0] = -1;
					field870 = new int[1];
					field870[0] = -1;
					field871 = new int[1];
					field871[0] = -1;
				}

				if (field879 == -1) {
					if (field873 == null) {
						field879 = 0;
					} else {
						field879 = 2;
					}
				}

				if (field880 == -1) {
					if (field873 != null) {
						field880 = 2;
						return;
					}

					field880 = 0;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field868 = arg0.method468();
				field869 = new int[field868];
				field870 = new int[field868];
				field871 = new int[field868];
				for (int var3 = 0; var3 < field868; var3++) {
					field869[var3] = arg0.method470();
					field870[var3] = arg0.method470();
					if (field870[var3] == 0xFFFF) {
						field870[var3] = -1;
					}

					field871[var3] = arg0.method470();
				}
			} else if (var2 == 2) {
				field872 = arg0.method470();
			} else if (var2 == 3) {
				int var4 = arg0.method468();
				field873 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field873[var5] = arg0.method468();
				}

				field873[var4] = 9999999;
			} else if (var2 == 4) {
				field874 = true;
			} else if (var2 == 5) {
				field875 = arg0.method468();
			} else if (var2 == 6) {
				field876 = arg0.method470();
			} else if (var2 == 7) {
				field877 = arg0.method470();
			} else if (var2 == 8) {
				field878 = arg0.method468();
			} else if (var2 == 9) {
				field879 = arg0.method468();
			} else if (var2 == 10) {
				field880 = arg0.method468();
			} else if (var2 == 11) {
				field881 = arg0.method468();
			} else if (var2 == 12) {
				field882 = arg0.method473();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
