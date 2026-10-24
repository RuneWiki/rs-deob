package deob;

@ObfuscatedName("NGIGHQOG")
public class NGIGHQOG {

	@ObfuscatedName("NGIGHQOG.g")
	public int field989 = -1;

	@ObfuscatedName("NGIGHQOG.i")
	public int[] field991 = new int[6];

	@ObfuscatedName("NGIGHQOG.j")
	public int[] field992 = new int[6];

	@ObfuscatedName("NGIGHQOG.k")
	public int field993 = 128;

	@ObfuscatedName("NGIGHQOG.l")
	public int field994 = 128;

	@ObfuscatedName("NGIGHQOG.p")
	public static RPWOWYDL field998 = new RPWOWYDL(30);

	@ObfuscatedName("NGIGHQOG.c")
	public static int field985;

	@ObfuscatedName("NGIGHQOG.e")
	public int field987;

	@ObfuscatedName("NGIGHQOG.f")
	public int field988;

	@ObfuscatedName("NGIGHQOG.m")
	public int field995;

	@ObfuscatedName("NGIGHQOG.n")
	public int field996;

	@ObfuscatedName("NGIGHQOG.o")
	public int field997;

	@ObfuscatedName("NGIGHQOG.h")
	public ZGXCNUJM field990;

	@ObfuscatedName("NGIGHQOG.d")
	public static NGIGHQOG[] field986;

	@ObfuscatedName("NGIGHQOG.a(LFNOQZAYQ;I)V")
	public static void method349(FNOQZAYQ arg0) {
		DNRIFKTO var1 = new DNRIFKTO(arg0.method246("spotanim.dat", null));
		field985 = var1.method191();
		if (field986 == null) {
			field986 = new NGIGHQOG[field985];
		}

		for (int var2 = 0; var2 < field985; var2++) {
			if (field986[var2] == null) {
				field986[var2] = new NGIGHQOG();
			}

			field986[var2].field987 = var2;
			field986[var2].method350(var1);
		}
	}

	@ObfuscatedName("NGIGHQOG.a(LDNRIFKTO;I)V")
	public void method350(DNRIFKTO arg0) {
		while (true) {
			int var2 = arg0.method189();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field988 = arg0.method191();
			} else if (var2 == 2) {
				field989 = arg0.method191();
				if (ZGXCNUJM.field1481 != null) {
					field990 = ZGXCNUJM.field1481[field989];
				}
			} else if (var2 == 4) {
				field993 = arg0.method191();
			} else if (var2 == 5) {
				field994 = arg0.method191();
			} else if (var2 == 6) {
				field995 = arg0.method191();
			} else if (var2 == 7) {
				field996 = arg0.method189();
			} else if (var2 == 8) {
				field997 = arg0.method189();
			} else if (var2 >= 40 && var2 < 50) {
				field991[var2 - 40] = arg0.method191();
			} else if (var2 >= 50 && var2 < 60) {
				field992[var2 - 50] = arg0.method191();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("NGIGHQOG.a()LSNMMQNPZ;")
	public SNMMQNPZ method351() {
		SNMMQNPZ var1 = (SNMMQNPZ) field998.method401(field987);
		if (var1 != null) {
			return var1;
		}

		SNMMQNPZ var2 = SNMMQNPZ.method418(field988);
		if (var2 == null) {
			return null;
		}

		for (int var3 = 0; var3 < 6; var3++) {
			if (field991[0] != 0) {
				var2.method432(field991[var3], field992[var3]);
			}
		}

		field998.method402(field987, var2);
		return var2;
	}
}
