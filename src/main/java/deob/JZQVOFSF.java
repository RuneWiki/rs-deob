package deob;

@ObfuscatedName("JZQVOFSF")
public class JZQVOFSF {

	@ObfuscatedName("JZQVOFSF.h")
	public int field762 = -1;

	@ObfuscatedName("JZQVOFSF.j")
	public boolean field764 = false;

	@ObfuscatedName("JZQVOFSF.k")
	public int field765 = 5;

	@ObfuscatedName("JZQVOFSF.l")
	public int field766 = -1;

	@ObfuscatedName("JZQVOFSF.m")
	public int field767 = -1;

	@ObfuscatedName("JZQVOFSF.n")
	public int field768 = 99;

	@ObfuscatedName("JZQVOFSF.o")
	public int field769 = -1;

	@ObfuscatedName("JZQVOFSF.p")
	public int field770 = -1;

	@ObfuscatedName("JZQVOFSF.q")
	public int field771 = 2;

	@ObfuscatedName("JZQVOFSF.b")
	public static int field756;

	@ObfuscatedName("JZQVOFSF.d")
	public int field758;

	@ObfuscatedName("JZQVOFSF.r")
	public int field772;

	@ObfuscatedName("JZQVOFSF.e")
	public int[] field759;

	@ObfuscatedName("JZQVOFSF.f")
	public int[] field760;

	@ObfuscatedName("JZQVOFSF.g")
	public int[] field761;

	@ObfuscatedName("JZQVOFSF.i")
	public int[] field763;

	@ObfuscatedName("JZQVOFSF.c")
	public static JZQVOFSF[] field757;

	@ObfuscatedName("JZQVOFSF.a(LSMIVAFST;I)V")
	public static void method341(SMIVAFST arg0) {
		BSNPYLEV var1 = new BSNPYLEV(arg0.method512("seq.dat", null));
		field756 = var1.method49();
		if (field757 == null) {
			field757 = new JZQVOFSF[field756];
		}

		for (int var2 = 0; var2 < field756; var2++) {
			if (field757[var2] == null) {
				field757[var2] = new JZQVOFSF();
			}

			field757[var2].method343(var1);
		}
	}

	@ObfuscatedName("JZQVOFSF.a(II)I")
	public int method342(int arg0) {
		int var2 = field761[arg0];
		if (var2 == 0) {
			XMRZESBN var3 = XMRZESBN.method585(field759[arg0]);
			if (var3 != null) {
				var2 = field761[arg0] = var3.field1430;
			}
		}

		if (var2 == 0) {
			var2 = 1;
		}

		return var2;
	}

	@ObfuscatedName("JZQVOFSF.a(ILBSNPYLEV;)V")
	public void method343(BSNPYLEV arg0) {
		while (true) {
			int var2 = arg0.method47();
			if (var2 == 0) {
				if (field758 == 0) {
					field758 = 1;
					field759 = new int[1];
					field759[0] = -1;
					field760 = new int[1];
					field760[0] = -1;
					field761 = new int[1];
					field761[0] = -1;
				}

				if (field769 == -1) {
					if (field763 == null) {
						field769 = 0;
					} else {
						field769 = 2;
					}
				}

				if (field770 == -1) {
					if (field763 != null) {
						field770 = 2;
						return;
					}

					field770 = 0;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field758 = arg0.method47();
				field759 = new int[field758];
				field760 = new int[field758];
				field761 = new int[field758];
				for (int var3 = 0; var3 < field758; var3++) {
					field759[var3] = arg0.method49();
					field760[var3] = arg0.method49();
					if (field760[var3] == 0xFFFF) {
						field760[var3] = -1;
					}

					field761[var3] = arg0.method49();
				}
			} else if (var2 == 2) {
				field762 = arg0.method49();
			} else if (var2 == 3) {
				int var4 = arg0.method47();
				field763 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field763[var5] = arg0.method47();
				}

				field763[var4] = 9999999;
			} else if (var2 == 4) {
				field764 = true;
			} else if (var2 == 5) {
				field765 = arg0.method47();
			} else if (var2 == 6) {
				field766 = arg0.method49();
			} else if (var2 == 7) {
				field767 = arg0.method49();
			} else if (var2 == 8) {
				field768 = arg0.method47();
			} else if (var2 == 9) {
				field769 = arg0.method47();
			} else if (var2 == 10) {
				field770 = arg0.method47();
			} else if (var2 == 11) {
				field771 = arg0.method47();
			} else if (var2 == 12) {
				field772 = arg0.method52();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
