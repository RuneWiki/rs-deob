package deob;

@ObfuscatedName("BZLQCUPI")
public class BZLQCUPI {

	@ObfuscatedName("BZLQCUPI.e")
	public int field44 = -1;

	@ObfuscatedName("BZLQCUPI.g")
	public int[] field46 = new int[6];

	@ObfuscatedName("BZLQCUPI.h")
	public int[] field47 = new int[6];

	@ObfuscatedName("BZLQCUPI.i")
	public int field48 = 128;

	@ObfuscatedName("BZLQCUPI.j")
	public int field49 = 128;

	@ObfuscatedName("BZLQCUPI.n")
	public static THJKANXW field53 = new THJKANXW(30);

	@ObfuscatedName("BZLQCUPI.a")
	public static int field40;

	@ObfuscatedName("BZLQCUPI.c")
	public int field42;

	@ObfuscatedName("BZLQCUPI.d")
	public int field43;

	@ObfuscatedName("BZLQCUPI.k")
	public int field50;

	@ObfuscatedName("BZLQCUPI.l")
	public int field51;

	@ObfuscatedName("BZLQCUPI.m")
	public int field52;

	@ObfuscatedName("BZLQCUPI.f")
	public EHYLCNJX field45;

	@ObfuscatedName("BZLQCUPI.b")
	public static BZLQCUPI[] field41;

	@ObfuscatedName("BZLQCUPI.a(LFUZJMGZB;I)V")
	public static void method7(FUZJMGZB arg0) {
		LBBVYYXO var1 = new LBBVYYXO(arg0.method277("spotanim.dat", null));
		field40 = var1.method371();
		if (field41 == null) {
			field41 = new BZLQCUPI[field40];
		}

		for (int var2 = 0; var2 < field40; var2++) {
			if (field41[var2] == null) {
				field41[var2] = new BZLQCUPI();
			}

			field41[var2].field42 = var2;
			field41[var2].method8(var1);
		}
	}

	@ObfuscatedName("BZLQCUPI.a(LLBBVYYXO;B)V")
	public void method8(LBBVYYXO arg0) {
		while (true) {
			int var2 = arg0.method369();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field43 = arg0.method371();
			} else if (var2 == 2) {
				field44 = arg0.method371();
				if (EHYLCNJX.field744 != null) {
					field45 = EHYLCNJX.field744[field44];
				}
			} else if (var2 == 4) {
				field48 = arg0.method371();
			} else if (var2 == 5) {
				field49 = arg0.method371();
			} else if (var2 == 6) {
				field50 = arg0.method371();
			} else if (var2 == 7) {
				field51 = arg0.method369();
			} else if (var2 == 8) {
				field52 = arg0.method369();
			} else if (var2 >= 40 && var2 < 50) {
				field46[var2 - 40] = arg0.method371();
			} else if (var2 >= 50 && var2 < 60) {
				field47[var2 - 50] = arg0.method371();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("BZLQCUPI.a()LCYPZUKMB;")
	public CYPZUKMB method9() {
		CYPZUKMB var1 = (CYPZUKMB) field53.method529(field42);
		if (var1 != null) {
			return var1;
		}

		CYPZUKMB var2 = CYPZUKMB.method196(field43);
		if (var2 == null) {
			return null;
		}

		for (int var3 = 0; var3 < 6; var3++) {
			if (field46[0] != 0) {
				var2.method210(field46[var3], field47[var3]);
			}
		}

		field53.method530(field42, var2);
		return var2;
	}
}
