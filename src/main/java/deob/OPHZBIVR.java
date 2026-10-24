package deob;

@ObfuscatedName("OPHZBIVR")
public class OPHZBIVR {

	@ObfuscatedName("OPHZBIVR.e")
	public int field1109 = -1;

	@ObfuscatedName("OPHZBIVR.g")
	public int[] field1111 = new int[6];

	@ObfuscatedName("OPHZBIVR.h")
	public int[] field1112 = new int[6];

	@ObfuscatedName("OPHZBIVR.i")
	public int field1113 = 128;

	@ObfuscatedName("OPHZBIVR.j")
	public int field1114 = 128;

	@ObfuscatedName("OPHZBIVR.n")
	public static NVDACYAH field1118 = new NVDACYAH(30);

	@ObfuscatedName("OPHZBIVR.a")
	public static int field1105;

	@ObfuscatedName("OPHZBIVR.c")
	public int field1107;

	@ObfuscatedName("OPHZBIVR.d")
	public int field1108;

	@ObfuscatedName("OPHZBIVR.k")
	public int field1115;

	@ObfuscatedName("OPHZBIVR.l")
	public int field1116;

	@ObfuscatedName("OPHZBIVR.m")
	public int field1117;

	@ObfuscatedName("OPHZBIVR.f")
	public QBINVEVU field1110;

	@ObfuscatedName("OPHZBIVR.b")
	public static OPHZBIVR[] field1106;

	@ObfuscatedName("OPHZBIVR.a(LNXFIIFAD;I)V")
	public static void method433(NXFIIFAD arg0) {
		MNKDCXXG var1 = new MNKDCXXG(arg0.method431("spotanim.dat", null));
		field1105 = var1.method388();
		if (field1106 == null) {
			field1106 = new OPHZBIVR[field1105];
		}

		for (int var2 = 0; var2 < field1105; var2++) {
			if (field1106[var2] == null) {
				field1106[var2] = new OPHZBIVR();
			}

			field1106[var2].field1107 = var2;
			field1106[var2].method434(var1);
		}
	}

	@ObfuscatedName("OPHZBIVR.a(LMNKDCXXG;I)V")
	public void method434(MNKDCXXG arg0) {
		while (true) {
			int var2 = arg0.method386();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1108 = arg0.method388();
			} else if (var2 == 2) {
				field1109 = arg0.method388();
				if (QBINVEVU.field1165 != null) {
					field1110 = QBINVEVU.field1165[field1109];
				}
			} else if (var2 == 4) {
				field1113 = arg0.method388();
			} else if (var2 == 5) {
				field1114 = arg0.method388();
			} else if (var2 == 6) {
				field1115 = arg0.method388();
			} else if (var2 == 7) {
				field1116 = arg0.method386();
			} else if (var2 == 8) {
				field1117 = arg0.method386();
			} else if (var2 >= 40 && var2 < 50) {
				field1111[var2 - 40] = arg0.method388();
			} else if (var2 >= 50 && var2 < 60) {
				field1112[var2 - 50] = arg0.method388();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("OPHZBIVR.a()LIRLTEWJP;")
	public IRLTEWJP method435() {
		IRLTEWJP var1 = (IRLTEWJP) field1118.method427(field1107);
		if (var1 != null) {
			return var1;
		}

		IRLTEWJP var2 = IRLTEWJP.method281(field1108);
		if (var2 == null) {
			return null;
		}

		for (int var3 = 0; var3 < 6; var3++) {
			if (field1111[0] != 0) {
				var2.method295(field1111[var3], field1112[var3]);
			}
		}

		field1118.method428(field1107, var2);
		return var2;
	}
}
