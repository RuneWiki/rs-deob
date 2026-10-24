package deob;

@ObfuscatedName("EHYLCNJX")
public class EHYLCNJX {

	@ObfuscatedName("EHYLCNJX.g")
	public int field749 = -1;

	@ObfuscatedName("EHYLCNJX.i")
	public boolean field751 = false;

	@ObfuscatedName("EHYLCNJX.j")
	public int field752 = 5;

	@ObfuscatedName("EHYLCNJX.k")
	public int field753 = -1;

	@ObfuscatedName("EHYLCNJX.l")
	public int field754 = -1;

	@ObfuscatedName("EHYLCNJX.m")
	public int field755 = 99;

	@ObfuscatedName("EHYLCNJX.n")
	public int field756 = -1;

	@ObfuscatedName("EHYLCNJX.o")
	public int field757 = -1;

	@ObfuscatedName("EHYLCNJX.p")
	public int field758 = 2;

	@ObfuscatedName("EHYLCNJX.a")
	public static int field743;

	@ObfuscatedName("EHYLCNJX.c")
	public int field745;

	@ObfuscatedName("EHYLCNJX.q")
	public int field759;

	@ObfuscatedName("EHYLCNJX.d")
	public int[] field746;

	@ObfuscatedName("EHYLCNJX.e")
	public int[] field747;

	@ObfuscatedName("EHYLCNJX.f")
	public int[] field748;

	@ObfuscatedName("EHYLCNJX.h")
	public int[] field750;

	@ObfuscatedName("EHYLCNJX.b")
	public static EHYLCNJX[] field744;

	@ObfuscatedName("EHYLCNJX.a(LFUZJMGZB;I)V")
	public static void method251(FUZJMGZB arg0) {
		LBBVYYXO var1 = new LBBVYYXO(arg0.method277("seq.dat", null));
		field743 = var1.method371();
		if (field744 == null) {
			field744 = new EHYLCNJX[field743];
		}

		for (int var2 = 0; var2 < field743; var2++) {
			if (field744[var2] == null) {
				field744[var2] = new EHYLCNJX();
			}

			field744[var2].method253(var1);
		}
	}

	@ObfuscatedName("EHYLCNJX.a(II)I")
	public int method252(int arg0) {
		int var2 = field748[arg0];
		if (var2 == 0) {
			QGRLAQIF var3 = QGRLAQIF.method468(field746[arg0]);
			if (var3 != null) {
				var2 = field748[arg0] = var3.field1140;
			}
		}

		if (var2 == 0) {
			var2 = 1;
		}

		return var2;
	}

	@ObfuscatedName("EHYLCNJX.a(LLBBVYYXO;B)V")
	public void method253(LBBVYYXO arg0) {
		while (true) {
			int var2 = arg0.method369();
			if (var2 == 0) {
				if (field745 == 0) {
					field745 = 1;
					field746 = new int[1];
					field746[0] = -1;
					field747 = new int[1];
					field747[0] = -1;
					field748 = new int[1];
					field748[0] = -1;
				}

				if (field756 == -1) {
					if (field750 == null) {
						field756 = 0;
					} else {
						field756 = 2;
					}
				}

				if (field757 == -1) {
					if (field750 != null) {
						field757 = 2;
						return;
					}

					field757 = 0;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field745 = arg0.method369();
				field746 = new int[field745];
				field747 = new int[field745];
				field748 = new int[field745];
				for (int var3 = 0; var3 < field745; var3++) {
					field746[var3] = arg0.method371();
					field747[var3] = arg0.method371();
					if (field747[var3] == 0xFFFF) {
						field747[var3] = -1;
					}

					field748[var3] = arg0.method371();
				}
			} else if (var2 == 2) {
				field749 = arg0.method371();
			} else if (var2 == 3) {
				int var4 = arg0.method369();
				field750 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field750[var5] = arg0.method369();
				}

				field750[var4] = 9999999;
			} else if (var2 == 4) {
				field751 = true;
			} else if (var2 == 5) {
				field752 = arg0.method369();
			} else if (var2 == 6) {
				field753 = arg0.method371();
			} else if (var2 == 7) {
				field754 = arg0.method371();
			} else if (var2 == 8) {
				field755 = arg0.method369();
			} else if (var2 == 9) {
				field756 = arg0.method369();
			} else if (var2 == 10) {
				field757 = arg0.method369();
			} else if (var2 == 11) {
				field758 = arg0.method369();
			} else if (var2 == 12) {
				field759 = arg0.method374();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
