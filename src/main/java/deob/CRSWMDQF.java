package deob;

@ObfuscatedName("CRSWMDQF")
public class CRSWMDQF {

	@ObfuscatedName("CRSWMDQF.g")
	public int field546 = -1;

	@ObfuscatedName("CRSWMDQF.i")
	public int[] field548 = new int[6];

	@ObfuscatedName("CRSWMDQF.j")
	public int[] field549 = new int[6];

	@ObfuscatedName("CRSWMDQF.k")
	public int field550 = 128;

	@ObfuscatedName("CRSWMDQF.l")
	public int field551 = 128;

	@ObfuscatedName("CRSWMDQF.p")
	public static RYXFUVWJ field555 = new RYXFUVWJ(30);

	@ObfuscatedName("CRSWMDQF.c")
	public static int field542;

	@ObfuscatedName("CRSWMDQF.e")
	public int field544;

	@ObfuscatedName("CRSWMDQF.f")
	public int field545;

	@ObfuscatedName("CRSWMDQF.m")
	public int field552;

	@ObfuscatedName("CRSWMDQF.n")
	public int field553;

	@ObfuscatedName("CRSWMDQF.o")
	public int field554;

	@ObfuscatedName("CRSWMDQF.h")
	public SPUHKLMC field547;

	@ObfuscatedName("CRSWMDQF.d")
	public static CRSWMDQF[] field543;

	@ObfuscatedName("CRSWMDQF.a(ZLVSQMPWOM;)V")
	public static void method297(VSQMPWOM arg0) {
		BFQIDHPO var1 = new BFQIDHPO(arg0.method526("spotanim.dat", null));
		field542 = var1.method56();
		if (field543 == null) {
			field543 = new CRSWMDQF[field542];
		}

		for (int var2 = 0; var2 < field542; var2++) {
			if (field543[var2] == null) {
				field543[var2] = new CRSWMDQF();
			}

			field543[var2].field544 = var2;
			field543[var2].method298(var1);
		}
	}

	@ObfuscatedName("CRSWMDQF.a(BLBFQIDHPO;)V")
	public void method298(BFQIDHPO arg0) {
		while (true) {
			int var2 = arg0.method54();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field545 = arg0.method56();
			} else if (var2 == 2) {
				field546 = arg0.method56();
				if (SPUHKLMC.field1176 != null) {
					field547 = SPUHKLMC.field1176[field546];
				}
			} else if (var2 == 4) {
				field550 = arg0.method56();
			} else if (var2 == 5) {
				field551 = arg0.method56();
			} else if (var2 == 6) {
				field552 = arg0.method56();
			} else if (var2 == 7) {
				field553 = arg0.method54();
			} else if (var2 == 8) {
				field554 = arg0.method54();
			} else if (var2 >= 40 && var2 < 50) {
				field548[var2 - 40] = arg0.method56();
			} else if (var2 >= 50 && var2 < 60) {
				field549[var2 - 50] = arg0.method56();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("CRSWMDQF.a()LXBVYIDUH;")
	public XBVYIDUH method299() {
		XBVYIDUH var1 = (XBVYIDUH) field555.method495(field544);
		if (var1 != null) {
			return var1;
		}

		XBVYIDUH var2 = XBVYIDUH.method541(field545);
		if (var2 == null) {
			return null;
		}

		for (int var3 = 0; var3 < 6; var3++) {
			if (field548[0] != 0) {
				var2.method555(field548[var3], field549[var3]);
			}
		}

		field555.method496(var2, field544);
		return var2;
	}
}
