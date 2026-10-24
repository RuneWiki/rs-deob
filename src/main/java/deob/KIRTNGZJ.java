package deob;

@ObfuscatedName("KIRTNGZJ")
public class KIRTNGZJ {

	@ObfuscatedName("KIRTNGZJ.i")
	public int field1020 = -1;

	@ObfuscatedName("KIRTNGZJ.k")
	public boolean field1022 = false;

	@ObfuscatedName("KIRTNGZJ.l")
	public int field1023 = 5;

	@ObfuscatedName("KIRTNGZJ.m")
	public int field1024 = -1;

	@ObfuscatedName("KIRTNGZJ.n")
	public int field1025 = -1;

	@ObfuscatedName("KIRTNGZJ.o")
	public int field1026 = 99;

	@ObfuscatedName("KIRTNGZJ.p")
	public int field1027 = -1;

	@ObfuscatedName("KIRTNGZJ.q")
	public int field1028 = -1;

	@ObfuscatedName("KIRTNGZJ.r")
	public int field1029 = 2;

	@ObfuscatedName("KIRTNGZJ.c")
	public static int field1014;

	@ObfuscatedName("KIRTNGZJ.e")
	public int field1016;

	@ObfuscatedName("KIRTNGZJ.s")
	public int field1030;

	@ObfuscatedName("KIRTNGZJ.f")
	public int[] field1017;

	@ObfuscatedName("KIRTNGZJ.g")
	public int[] field1018;

	@ObfuscatedName("KIRTNGZJ.h")
	public int[] field1019;

	@ObfuscatedName("KIRTNGZJ.j")
	public int[] field1021;

	@ObfuscatedName("KIRTNGZJ.d")
	public static KIRTNGZJ[] field1015;

	@ObfuscatedName("KIRTNGZJ.a(ZLEAXVDNXA;)V")
	public static void method444(EAXVDNXA arg0) {
		CKBTFRZM var1 = new CKBTFRZM(arg0.method255("seq.dat", null));
		field1014 = var1.method46();
		if (field1015 == null) {
			field1015 = new KIRTNGZJ[field1014];
		}

		for (int var2 = 0; var2 < field1014; var2++) {
			if (field1015[var2] == null) {
				field1015[var2] = new KIRTNGZJ();
			}

			field1015[var2].method446(var1);
		}
	}

	@ObfuscatedName("KIRTNGZJ.a(II)I")
	public int method445(int arg0) {
		int var2 = field1019[arg0];
		if (var2 == 0) {
			ERVJQNCY var3 = ERVJQNCY.method281(field1017[arg0]);
			if (var3 != null) {
				var2 = field1019[arg0] = var3.field658;
			}
		}

		if (var2 == 0) {
			var2 = 1;
		}

		return var2;
	}

	@ObfuscatedName("KIRTNGZJ.a(BLCKBTFRZM;)V")
	public void method446(CKBTFRZM arg0) {
		while (true) {
			int var2 = arg0.method44();
			if (var2 == 0) {
				if (field1016 == 0) {
					field1016 = 1;
					field1017 = new int[1];
					field1017[0] = -1;
					field1018 = new int[1];
					field1018[0] = -1;
					field1019 = new int[1];
					field1019[0] = -1;
				}

				if (field1027 == -1) {
					if (field1021 == null) {
						field1027 = 0;
					} else {
						field1027 = 2;
					}
				}

				if (field1028 == -1) {
					if (field1021 != null) {
						field1028 = 2;
						return;
					}

					field1028 = 0;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field1016 = arg0.method44();
				field1017 = new int[field1016];
				field1018 = new int[field1016];
				field1019 = new int[field1016];
				for (int var3 = 0; var3 < field1016; var3++) {
					field1017[var3] = arg0.method46();
					field1018[var3] = arg0.method46();
					if (field1018[var3] == 0xFFFF) {
						field1018[var3] = -1;
					}

					field1019[var3] = arg0.method46();
				}
			} else if (var2 == 2) {
				field1020 = arg0.method46();
			} else if (var2 == 3) {
				int var4 = arg0.method44();
				field1021 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field1021[var5] = arg0.method44();
				}

				field1021[var4] = 9999999;
			} else if (var2 == 4) {
				field1022 = true;
			} else if (var2 == 5) {
				field1023 = arg0.method44();
			} else if (var2 == 6) {
				field1024 = arg0.method46();
			} else if (var2 == 7) {
				field1025 = arg0.method46();
			} else if (var2 == 8) {
				field1026 = arg0.method44();
			} else if (var2 == 9) {
				field1027 = arg0.method44();
			} else if (var2 == 10) {
				field1028 = arg0.method44();
			} else if (var2 == 11) {
				field1029 = arg0.method44();
			} else if (var2 == 12) {
				field1030 = arg0.method49();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
