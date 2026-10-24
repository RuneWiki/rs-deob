package deob;

@ObfuscatedName("KAIFCIAJ")
public class KAIFCIAJ {

	@ObfuscatedName("KAIFCIAJ.i")
	public int field747 = -1;

	@ObfuscatedName("KAIFCIAJ.k")
	public boolean field749 = false;

	@ObfuscatedName("KAIFCIAJ.l")
	public int field750 = 5;

	@ObfuscatedName("KAIFCIAJ.m")
	public int field751 = -1;

	@ObfuscatedName("KAIFCIAJ.n")
	public int field752 = -1;

	@ObfuscatedName("KAIFCIAJ.o")
	public int field753 = 99;

	@ObfuscatedName("KAIFCIAJ.p")
	public int field754 = -1;

	@ObfuscatedName("KAIFCIAJ.q")
	public int field755 = -1;

	@ObfuscatedName("KAIFCIAJ.r")
	public int field756 = 2;

	@ObfuscatedName("KAIFCIAJ.c")
	public static int field741;

	@ObfuscatedName("KAIFCIAJ.e")
	public int field743;

	@ObfuscatedName("KAIFCIAJ.s")
	public int field757;

	@ObfuscatedName("KAIFCIAJ.f")
	public int[] field744;

	@ObfuscatedName("KAIFCIAJ.g")
	public int[] field745;

	@ObfuscatedName("KAIFCIAJ.h")
	public int[] field746;

	@ObfuscatedName("KAIFCIAJ.j")
	public int[] field748;

	@ObfuscatedName("KAIFCIAJ.d")
	public static KAIFCIAJ[] field742;

	@ObfuscatedName("KAIFCIAJ.a(BLESUFCMYV;)V")
	public static void method239(ESUFCMYV arg0) {
		RGCGKKUR var1 = new RGCGKKUR(arg0.method205("seq.dat", null));
		field741 = var1.method457();
		if (field742 == null) {
			field742 = new KAIFCIAJ[field741];
		}

		for (int var2 = 0; var2 < field741; var2++) {
			if (field742[var2] == null) {
				field742[var2] = new KAIFCIAJ();
			}

			field742[var2].method241(var1);
		}
	}

	@ObfuscatedName("KAIFCIAJ.a(BI)I")
	public int method240(int arg0) {
		int var2 = field746[arg0];
		if (var2 == 0) {
			PHDJZMLE var3 = PHDJZMLE.method427(field744[arg0]);
			if (var3 != null) {
				var2 = field746[arg0] = var3.field1247;
			}
		}

		if (var2 == 0) {
			var2 = 1;
		}

		return var2;
	}

	@ObfuscatedName("KAIFCIAJ.a(ILRGCGKKUR;)V")
	public void method241(RGCGKKUR arg0) {
		while (true) {
			int var2 = arg0.method455();
			if (var2 == 0) {
				if (field743 == 0) {
					field743 = 1;
					field744 = new int[1];
					field744[0] = -1;
					field745 = new int[1];
					field745[0] = -1;
					field746 = new int[1];
					field746[0] = -1;
				}

				if (field754 == -1) {
					if (field748 == null) {
						field754 = 0;
					} else {
						field754 = 2;
					}
				}

				if (field755 == -1) {
					if (field748 != null) {
						field755 = 2;
						return;
					}

					field755 = 0;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field743 = arg0.method455();
				field744 = new int[field743];
				field745 = new int[field743];
				field746 = new int[field743];
				for (int var3 = 0; var3 < field743; var3++) {
					field744[var3] = arg0.method457();
					field745[var3] = arg0.method457();
					if (field745[var3] == 0xFFFF) {
						field745[var3] = -1;
					}

					field746[var3] = arg0.method457();
				}
			} else if (var2 == 2) {
				field747 = arg0.method457();
			} else if (var2 == 3) {
				int var4 = arg0.method455();
				field748 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field748[var5] = arg0.method455();
				}

				field748[var4] = 9999999;
			} else if (var2 == 4) {
				field749 = true;
			} else if (var2 == 5) {
				field750 = arg0.method455();
			} else if (var2 == 6) {
				field751 = arg0.method457();
			} else if (var2 == 7) {
				field752 = arg0.method457();
			} else if (var2 == 8) {
				field753 = arg0.method455();
			} else if (var2 == 9) {
				field754 = arg0.method455();
			} else if (var2 == 10) {
				field755 = arg0.method455();
			} else if (var2 == 11) {
				field756 = arg0.method455();
			} else if (var2 == 12) {
				field757 = arg0.method460();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
