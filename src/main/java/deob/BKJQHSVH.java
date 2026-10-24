package deob;

@ObfuscatedName("BKJQHSVH")
public class BKJQHSVH {

	@ObfuscatedName("BKJQHSVH.g")
	public int field56 = -1;

	@ObfuscatedName("BKJQHSVH.i")
	public int[] field58 = new int[6];

	@ObfuscatedName("BKJQHSVH.j")
	public int[] field59 = new int[6];

	@ObfuscatedName("BKJQHSVH.k")
	public int field60 = 128;

	@ObfuscatedName("BKJQHSVH.l")
	public int field61 = 128;

	@ObfuscatedName("BKJQHSVH.p")
	public static DMOAMUBS field65 = new DMOAMUBS(30);

	@ObfuscatedName("BKJQHSVH.c")
	public static int field52;

	@ObfuscatedName("BKJQHSVH.e")
	public int field54;

	@ObfuscatedName("BKJQHSVH.f")
	public int field55;

	@ObfuscatedName("BKJQHSVH.m")
	public int field62;

	@ObfuscatedName("BKJQHSVH.n")
	public int field63;

	@ObfuscatedName("BKJQHSVH.o")
	public int field64;

	@ObfuscatedName("BKJQHSVH.h")
	public MJVHTYCA field57;

	@ObfuscatedName("BKJQHSVH.d")
	public static BKJQHSVH[] field53;

	@ObfuscatedName("BKJQHSVH.a(ZLMJLXHQTQ;)V")
	public static void method14(MJLXHQTQ arg0) {
		XGRGMPUQ var1 = new XGRGMPUQ(arg0.method317("spotanim.dat", null));
		field52 = var1.method467();
		if (field53 == null) {
			field53 = new BKJQHSVH[field52];
		}

		for (int var2 = 0; var2 < field52; var2++) {
			if (field53[var2] == null) {
				field53[var2] = new BKJQHSVH();
			}

			field53[var2].field54 = var2;
			field53[var2].method15(var1);
		}
	}

	@ObfuscatedName("BKJQHSVH.a(ZLXGRGMPUQ;)V")
	public void method15(XGRGMPUQ arg0) {
		while (true) {
			int var2 = arg0.method465();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field55 = arg0.method467();
			} else if (var2 == 2) {
				field56 = arg0.method467();
				if (MJVHTYCA.field1044 != null) {
					field57 = MJVHTYCA.field1044[field56];
				}
			} else if (var2 == 4) {
				field60 = arg0.method467();
			} else if (var2 == 5) {
				field61 = arg0.method467();
			} else if (var2 == 6) {
				field62 = arg0.method467();
			} else if (var2 == 7) {
				field63 = arg0.method465();
			} else if (var2 == 8) {
				field64 = arg0.method465();
			} else if (var2 >= 40 && var2 < 50) {
				field58[var2 - 40] = arg0.method467();
			} else if (var2 >= 50 && var2 < 60) {
				field59[var2 - 50] = arg0.method467();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("BKJQHSVH.a()LVYUQHOMO;")
	public VYUQHOMO method16() {
		VYUQHOMO var1 = (VYUQHOMO) field65.method193(field54);
		if (var1 != null) {
			return var1;
		}

		VYUQHOMO var2 = VYUQHOMO.method407(field55);
		if (var2 == null) {
			return null;
		}

		for (int var3 = 0; var3 < 6; var3++) {
			if (field58[0] != 0) {
				var2.method421(field58[var3], field59[var3]);
			}
		}

		field65.method194(field54, var2);
		return var2;
	}
}
