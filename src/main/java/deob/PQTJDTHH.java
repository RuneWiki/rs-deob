package deob;

@ObfuscatedName("PQTJDTHH")
public class PQTJDTHH {

	@ObfuscatedName("PQTJDTHH.g")
	public int field956 = -1;

	@ObfuscatedName("PQTJDTHH.i")
	public boolean field958 = false;

	@ObfuscatedName("PQTJDTHH.j")
	public int field959 = 5;

	@ObfuscatedName("PQTJDTHH.k")
	public int field960 = -1;

	@ObfuscatedName("PQTJDTHH.l")
	public int field961 = -1;

	@ObfuscatedName("PQTJDTHH.m")
	public int field962 = 99;

	@ObfuscatedName("PQTJDTHH.n")
	public int field963 = -1;

	@ObfuscatedName("PQTJDTHH.o")
	public int field964 = -1;

	@ObfuscatedName("PQTJDTHH.p")
	public int field965 = 2;

	@ObfuscatedName("PQTJDTHH.a")
	public static int field950;

	@ObfuscatedName("PQTJDTHH.c")
	public int field952;

	@ObfuscatedName("PQTJDTHH.q")
	public int field966;

	@ObfuscatedName("PQTJDTHH.d")
	public int[] field953;

	@ObfuscatedName("PQTJDTHH.e")
	public int[] field954;

	@ObfuscatedName("PQTJDTHH.f")
	public int[] field955;

	@ObfuscatedName("PQTJDTHH.h")
	public int[] field957;

	@ObfuscatedName("PQTJDTHH.b")
	public static PQTJDTHH[] field951;

	@ObfuscatedName("PQTJDTHH.a(ZLAKPFVPPG;)V")
	public static void method404(AKPFVPPG arg0) {
		FTMSICIZ var1 = new FTMSICIZ(arg0.method7("seq.dat", null));
		field950 = var1.method215();
		if (field951 == null) {
			field951 = new PQTJDTHH[field950];
		}

		for (int var2 = 0; var2 < field950; var2++) {
			if (field951[var2] == null) {
				field951[var2] = new PQTJDTHH();
			}

			field951[var2].method406(var1);
		}
	}

	@ObfuscatedName("PQTJDTHH.a(II)I")
	public int method405(int arg0) {
		int var2 = field955[arg0];
		if (var2 == 0) {
			SCWTQUFK var3 = SCWTQUFK.method454(field953[arg0]);
			if (var3 != null) {
				var2 = field955[arg0] = var3.field1217;
			}
		}

		if (var2 == 0) {
			var2 = 1;
		}

		return var2;
	}

	@ObfuscatedName("PQTJDTHH.a(LFTMSICIZ;I)V")
	public void method406(FTMSICIZ arg0) {
		while (true) {
			int var2 = arg0.method213();
			if (var2 == 0) {
				if (field952 == 0) {
					field952 = 1;
					field953 = new int[1];
					field953[0] = -1;
					field954 = new int[1];
					field954[0] = -1;
					field955 = new int[1];
					field955[0] = -1;
				}

				if (field963 == -1) {
					if (field957 == null) {
						field963 = 0;
					} else {
						field963 = 2;
					}
				}

				if (field964 == -1) {
					if (field957 != null) {
						field964 = 2;
						return;
					}

					field964 = 0;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field952 = arg0.method213();
				field953 = new int[field952];
				field954 = new int[field952];
				field955 = new int[field952];
				for (int var3 = 0; var3 < field952; var3++) {
					field953[var3] = arg0.method215();
					field954[var3] = arg0.method215();
					if (field954[var3] == 0xFFFF) {
						field954[var3] = -1;
					}

					field955[var3] = arg0.method215();
				}
			} else if (var2 == 2) {
				field956 = arg0.method215();
			} else if (var2 == 3) {
				int var4 = arg0.method213();
				field957 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field957[var5] = arg0.method213();
				}

				field957[var4] = 9999999;
			} else if (var2 == 4) {
				field958 = true;
			} else if (var2 == 5) {
				field959 = arg0.method213();
			} else if (var2 == 6) {
				field960 = arg0.method215();
			} else if (var2 == 7) {
				field961 = arg0.method215();
			} else if (var2 == 8) {
				field962 = arg0.method213();
			} else if (var2 == 9) {
				field963 = arg0.method213();
			} else if (var2 == 10) {
				field964 = arg0.method213();
			} else if (var2 == 11) {
				field965 = arg0.method213();
			} else if (var2 == 12) {
				field966 = arg0.method218();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
