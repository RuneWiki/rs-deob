package deob;

@ObfuscatedName("BUIWQSXJ")
public class BUIWQSXJ {

	@ObfuscatedName("BUIWQSXJ.h")
	public int field33 = -1;

	@ObfuscatedName("BUIWQSXJ.j")
	public int[] field35 = new int[6];

	@ObfuscatedName("BUIWQSXJ.k")
	public int[] field36 = new int[6];

	@ObfuscatedName("BUIWQSXJ.l")
	public int field37 = 128;

	@ObfuscatedName("BUIWQSXJ.m")
	public int field38 = 128;

	@ObfuscatedName("BUIWQSXJ.q")
	public static ZYLCKQCD field42 = new ZYLCKQCD(30);

	@ObfuscatedName("BUIWQSXJ.d")
	public static int field29;

	@ObfuscatedName("BUIWQSXJ.f")
	public int field31;

	@ObfuscatedName("BUIWQSXJ.g")
	public int field32;

	@ObfuscatedName("BUIWQSXJ.n")
	public int field39;

	@ObfuscatedName("BUIWQSXJ.o")
	public int field40;

	@ObfuscatedName("BUIWQSXJ.p")
	public int field41;

	@ObfuscatedName("BUIWQSXJ.i")
	public KIZBPSHZ field34;

	@ObfuscatedName("BUIWQSXJ.e")
	public static BUIWQSXJ[] field30;

	@ObfuscatedName("BUIWQSXJ.a(ILQDHHNYHL;)V")
	public static void method60(QDHHNYHL arg0) {
		PGNBHFUF var1 = new PGNBHFUF(arg0.method488("spotanim.dat", null));
		field29 = var1.method422();
		if (field30 == null) {
			field30 = new BUIWQSXJ[field29];
		}

		for (int var2 = 0; var2 < field29; var2++) {
			if (field30[var2] == null) {
				field30[var2] = new BUIWQSXJ();
			}

			field30[var2].field31 = var2;
			field30[var2].method61(var1);
		}
	}

	@ObfuscatedName("BUIWQSXJ.a(LPGNBHFUF;I)V")
	public void method61(PGNBHFUF arg0) {
		while (true) {
			int var2 = arg0.method420();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field32 = arg0.method422();
			} else if (var2 == 2) {
				field33 = arg0.method422();
				if (KIZBPSHZ.field888 != null) {
					field34 = KIZBPSHZ.field888[field33];
				}
			} else if (var2 == 4) {
				field37 = arg0.method422();
			} else if (var2 == 5) {
				field38 = arg0.method422();
			} else if (var2 == 6) {
				field39 = arg0.method422();
			} else if (var2 == 7) {
				field40 = arg0.method420();
			} else if (var2 == 8) {
				field41 = arg0.method420();
			} else if (var2 >= 40 && var2 < 50) {
				field35[var2 - 40] = arg0.method422();
			} else if (var2 >= 50 && var2 < 60) {
				field36[var2 - 50] = arg0.method422();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("BUIWQSXJ.a()LPOJFANDE;")
	public POJFANDE method62() {
		POJFANDE var1 = (POJFANDE) field42.method599(field31);
		if (var1 != null) {
			return var1;
		}

		POJFANDE var2 = POJFANDE.method460(field32);
		if (var2 == null) {
			return null;
		}

		for (int var3 = 0; var3 < 6; var3++) {
			if (field35[0] != 0) {
				var2.method474(field35[var3], field36[var3]);
			}
		}

		field42.method600(var2, field31);
		return var2;
	}
}
