package deob;

@ObfuscatedName("PNPNYEVW")
public class PNPNYEVW {

	@ObfuscatedName("PNPNYEVW.h")
	public int field1063 = -1;

	@ObfuscatedName("PNPNYEVW.j")
	public boolean field1065 = false;

	@ObfuscatedName("PNPNYEVW.k")
	public int field1066 = 5;

	@ObfuscatedName("PNPNYEVW.l")
	public int field1067 = -1;

	@ObfuscatedName("PNPNYEVW.m")
	public int field1068 = -1;

	@ObfuscatedName("PNPNYEVW.n")
	public int field1069 = 99;

	@ObfuscatedName("PNPNYEVW.o")
	public int field1070 = -1;

	@ObfuscatedName("PNPNYEVW.p")
	public int field1071 = -1;

	@ObfuscatedName("PNPNYEVW.q")
	public int field1072 = 2;

	@ObfuscatedName("PNPNYEVW.b")
	public static int field1057;

	@ObfuscatedName("PNPNYEVW.d")
	public int field1059;

	@ObfuscatedName("PNPNYEVW.r")
	public int field1073;

	@ObfuscatedName("PNPNYEVW.e")
	public int[] field1060;

	@ObfuscatedName("PNPNYEVW.f")
	public int[] field1061;

	@ObfuscatedName("PNPNYEVW.g")
	public int[] field1062;

	@ObfuscatedName("PNPNYEVW.i")
	public int[] field1064;

	@ObfuscatedName("PNPNYEVW.c")
	public static PNPNYEVW[] field1058;

	@ObfuscatedName("PNPNYEVW.a(ILINOFEYKQ;)V")
	public static void method426(INOFEYKQ arg0) {
		NHEPCMLW var1 = new NHEPCMLW(arg0.method277("seq.dat", null));
		field1057 = var1.method351();
		if (field1058 == null) {
			field1058 = new PNPNYEVW[field1057];
		}

		for (int var2 = 0; var2 < field1057; var2++) {
			if (field1058[var2] == null) {
				field1058[var2] = new PNPNYEVW();
			}

			field1058[var2].method428(var1);
		}
	}

	@ObfuscatedName("PNPNYEVW.a(II)I")
	public int method427(int arg0) {
		int var2 = field1062[arg0];
		if (var2 == 0) {
			KDJQGGIG var3 = KDJQGGIG.method284(field1060[arg0]);
			if (var3 != null) {
				var2 = field1062[arg0] = var3.field892;
			}
		}

		if (var2 == 0) {
			var2 = 1;
		}

		return var2;
	}

	@ObfuscatedName("PNPNYEVW.a(ZLNHEPCMLW;)V")
	public void method428(NHEPCMLW arg0) {
		while (true) {
			int var2 = arg0.method349();
			if (var2 == 0) {
				if (field1059 == 0) {
					field1059 = 1;
					field1060 = new int[1];
					field1060[0] = -1;
					field1061 = new int[1];
					field1061[0] = -1;
					field1062 = new int[1];
					field1062[0] = -1;
				}

				if (field1070 == -1) {
					if (field1064 == null) {
						field1070 = 0;
					} else {
						field1070 = 2;
					}
				}

				if (field1071 == -1) {
					if (field1064 != null) {
						field1071 = 2;
						return;
					}

					field1071 = 0;
					return;
				}

				return;
			}

			if (var2 == 1) {
				field1059 = arg0.method349();
				field1060 = new int[field1059];
				field1061 = new int[field1059];
				field1062 = new int[field1059];
				for (int var3 = 0; var3 < field1059; var3++) {
					field1060[var3] = arg0.method351();
					field1061[var3] = arg0.method351();
					if (field1061[var3] == 0xFFFF) {
						field1061[var3] = -1;
					}

					field1062[var3] = arg0.method351();
				}
			} else if (var2 == 2) {
				field1063 = arg0.method351();
			} else if (var2 == 3) {
				int var4 = arg0.method349();
				field1064 = new int[var4 + 1];
				for (int var5 = 0; var5 < var4; var5++) {
					field1064[var5] = arg0.method349();
				}

				field1064[var4] = 9999999;
			} else if (var2 == 4) {
				field1065 = true;
			} else if (var2 == 5) {
				field1066 = arg0.method349();
			} else if (var2 == 6) {
				field1067 = arg0.method351();
			} else if (var2 == 7) {
				field1068 = arg0.method351();
			} else if (var2 == 8) {
				field1069 = arg0.method349();
			} else if (var2 == 9) {
				field1070 = arg0.method349();
			} else if (var2 == 10) {
				field1071 = arg0.method349();
			} else if (var2 == 11) {
				field1072 = arg0.method349();
			} else if (var2 == 12) {
				field1073 = arg0.method354();
			} else {
				System.out.println("Error unrecognised seq config code: " + var2);
			}
		}
	}
}
