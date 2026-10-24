package deob;

@ObfuscatedName("PHXJLMVH")
public class PHXJLMVH {

	@ObfuscatedName("PHXJLMVH.f")
	public int field978 = -1;

	@ObfuscatedName("PHXJLMVH.h")
	public int[] field980 = new int[6];

	@ObfuscatedName("PHXJLMVH.i")
	public int[] field981 = new int[6];

	@ObfuscatedName("PHXJLMVH.j")
	public int field982 = 128;

	@ObfuscatedName("PHXJLMVH.k")
	public int field983 = 128;

	@ObfuscatedName("PHXJLMVH.o")
	public static ULDYKUPK field987 = new ULDYKUPK(30);

	@ObfuscatedName("PHXJLMVH.b")
	public static int field974;

	@ObfuscatedName("PHXJLMVH.d")
	public int field976;

	@ObfuscatedName("PHXJLMVH.e")
	public int field977;

	@ObfuscatedName("PHXJLMVH.l")
	public int field984;

	@ObfuscatedName("PHXJLMVH.m")
	public int field985;

	@ObfuscatedName("PHXJLMVH.n")
	public int field986;

	@ObfuscatedName("PHXJLMVH.g")
	public KYGPROVJ field979;

	@ObfuscatedName("PHXJLMVH.c")
	public static PHXJLMVH[] field975;

	@ObfuscatedName("PHXJLMVH.a(LRSPRYUFS;I)V")
	public static void method412(RSPRYUFS arg0) {
		NQUAUMDT var1 = new NQUAUMDT(arg0.method427("spotanim.dat", null));
		field974 = var1.method341();
		if (field975 == null) {
			field975 = new PHXJLMVH[field974];
		}

		for (int var2 = 0; var2 < field974; var2++) {
			if (field975[var2] == null) {
				field975[var2] = new PHXJLMVH();
			}

			field975[var2].field976 = var2;
			field975[var2].method413(var1);
		}
	}

	@ObfuscatedName("PHXJLMVH.a(BLNQUAUMDT;)V")
	public void method413(NQUAUMDT arg0) {
		while (true) {
			int var2 = arg0.method339();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field977 = arg0.method341();
			} else if (var2 == 2) {
				field978 = arg0.method341();
				if (KYGPROVJ.field828 != null) {
					field979 = KYGPROVJ.field828[field978];
				}
			} else if (var2 == 4) {
				field982 = arg0.method341();
			} else if (var2 == 5) {
				field983 = arg0.method341();
			} else if (var2 == 6) {
				field984 = arg0.method341();
			} else if (var2 == 7) {
				field985 = arg0.method339();
			} else if (var2 == 8) {
				field986 = arg0.method339();
			} else if (var2 >= 40 && var2 < 50) {
				field980[var2 - 40] = arg0.method341();
			} else if (var2 >= 50 && var2 < 60) {
				field981[var2 - 50] = arg0.method341();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("PHXJLMVH.a()LJUQSYEMB;")
	public JUQSYEMB method414() {
		JUQSYEMB var1 = (JUQSYEMB) field987.method509(field976);
		if (var1 != null) {
			return var1;
		}

		JUQSYEMB var2 = JUQSYEMB.method212(field977);
		if (var2 == null) {
			return null;
		}

		for (int var3 = 0; var3 < 6; var3++) {
			if (field980[0] != 0) {
				var2.method226(field980[var3], field981[var3]);
			}
		}

		field987.method510(field976, var2);
		return var2;
	}
}
