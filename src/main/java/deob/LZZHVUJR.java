package deob;

@ObfuscatedName("LZZHVUJR")
public class LZZHVUJR {

	@ObfuscatedName("LZZHVUJR.h")
	public int field837 = -1;

	@ObfuscatedName("LZZHVUJR.j")
	public boolean field839 = false;

	@ObfuscatedName("LZZHVUJR.k")
	public int field840 = 5;

	@ObfuscatedName("LZZHVUJR.l")
	public int field841 = -1;

	@ObfuscatedName("LZZHVUJR.m")
	public int field842 = -1;

	@ObfuscatedName("LZZHVUJR.n")
	public int field843 = 99;

	@ObfuscatedName("LZZHVUJR.o")
	public int field844 = -1;

	@ObfuscatedName("LZZHVUJR.p")
	public int field845 = -1;

	@ObfuscatedName("LZZHVUJR.q")
	public int field846 = 2;

	@ObfuscatedName("LZZHVUJR.b")
	public static int field831;

	@ObfuscatedName("LZZHVUJR.d")
	public int field833;

	@ObfuscatedName("LZZHVUJR.r")
	public int field847;

	@ObfuscatedName("LZZHVUJR.e")
	public int[] field834;

	@ObfuscatedName("LZZHVUJR.f")
	public int[] field835;

	@ObfuscatedName("LZZHVUJR.g")
	public int[] field836;

	@ObfuscatedName("LZZHVUJR.i")
	public int[] field838;

	@ObfuscatedName("LZZHVUJR.c")
	public static LZZHVUJR[] field832;

	@ObfuscatedName("LZZHVUJR.a(ZLFXNTEMPE;)V")
	public static void method300(FXNTEMPE arg0) {
		RSWRPCHR var1 = new RSWRPCHR(arg0.method212("seq.dat", null));
		field831 = var1.method390();
		if (field832 == null) {
			field832 = new LZZHVUJR[field831];
		}

		for (int var2 = 0; var2 < field831; var2++) {
			if (field832[var2] == null) {
				field832[var2] = new LZZHVUJR();
			}

			field832[var2].method302(var1);
		}
	}

	@ObfuscatedName("LZZHVUJR.a(II)I")
	public int method301(int arg0) {
		int var2 = field836[arg0];
		if (var2 == 0) {
			OZAHMTPS var3 = OZAHMTPS.method337(field834[arg0]);
			if (var3 != null) {
				var2 = field836[arg0] = var3.field942;
			}
		}

		if (var2 == 0) {
			var2 = 1;
		}

		return var2;
	}

	@ObfuscatedName("LZZHVUJR.a(LRSWRPCHR;B)V")
	public void method302(RSWRPCHR arg0) {
		while (true) {
			int var2 = arg0.method388();
			if (var2 == 0) {
				if (field833 == 0) {
					field833 = 1;
					field834 = new int[1];
					field834[0] = -1;
					field835 = new int[1];
					field835[0] = -1;
					field836 = new int[1];
					field836[0] = -1;
				}

				if (field844 == -1) {
					if (field838 == null) {
						field844 = 0;
					} else {
						field844 = 2;
					}
				}

				if (field845 == -1) {
					if (field838 != null) {
						field845 = 2;
						return;
					}

					field845 = 0;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field833 = arg0.method388();
				field834 = new int[field833];
				field835 = new int[field833];
				field836 = new int[field833];
				for (int var3 = 0; var3 < field833; var3++) {
					field834[var3] = arg0.method390();
					field835[var3] = arg0.method390();
					if (field835[var3] == 0xFFFF) {
						field835[var3] = -1;
					}

					field836[var3] = arg0.method390();
				}
			} else if (var2 == 2) {
				field837 = arg0.method390();
			} else if (var2 == 3) {
				int var4 = arg0.method388();
				field838 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field838[var5] = arg0.method388();
				}

				field838[var4] = 9999999;
			} else if (var2 == 4) {
				field839 = true;
			} else if (var2 == 5) {
				field840 = arg0.method388();
			} else if (var2 == 6) {
				field841 = arg0.method390();
			} else if (var2 == 7) {
				field842 = arg0.method390();
			} else if (var2 == 8) {
				field843 = arg0.method388();
			} else if (var2 == 9) {
				field844 = arg0.method388();
			} else if (var2 == 10) {
				field845 = arg0.method388();
			} else if (var2 == 11) {
				field846 = arg0.method388();
			} else if (var2 == 12) {
				field847 = arg0.method393();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
