package deob;

@ObfuscatedName("TGIKVGNH")
public class TGIKVGNH {

	@ObfuscatedName("TGIKVGNH.g")
	public int field1197 = -1;

	@ObfuscatedName("TGIKVGNH.i")
	public int[] field1199 = new int[6];

	@ObfuscatedName("TGIKVGNH.j")
	public int[] field1200 = new int[6];

	@ObfuscatedName("TGIKVGNH.k")
	public int field1201 = 128;

	@ObfuscatedName("TGIKVGNH.l")
	public int field1202 = 128;

	@ObfuscatedName("TGIKVGNH.p")
	public static DSMCVRKW field1206 = new DSMCVRKW(30);

	@ObfuscatedName("TGIKVGNH.c")
	public static int field1193;

	@ObfuscatedName("TGIKVGNH.e")
	public int field1195;

	@ObfuscatedName("TGIKVGNH.f")
	public int field1196;

	@ObfuscatedName("TGIKVGNH.m")
	public int field1203;

	@ObfuscatedName("TGIKVGNH.n")
	public int field1204;

	@ObfuscatedName("TGIKVGNH.o")
	public int field1205;

	@ObfuscatedName("TGIKVGNH.h")
	public ODMBIHRM field1198;

	@ObfuscatedName("TGIKVGNH.d")
	public static TGIKVGNH[] field1194;

	@ObfuscatedName("TGIKVGNH.a(ILBBMKAXRK;)V")
	public static void method459(BBMKAXRK arg0) {
		EILHLJCE var1 = new EILHLJCE(arg0.method30("spotanim.dat", null));
		field1193 = var1.method226();
		if (field1194 == null) {
			field1194 = new TGIKVGNH[field1193];
		}

		for (int var2 = 0; var2 < field1193; var2++) {
			if (field1194[var2] == null) {
				field1194[var2] = new TGIKVGNH();
			}

			field1194[var2].field1195 = var2;
			field1194[var2].method460(var1);
		}
	}

	@ObfuscatedName("TGIKVGNH.a(LEILHLJCE;B)V")
	public void method460(EILHLJCE arg0) {
		while (true) {
			int var2 = arg0.method224();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1196 = arg0.method226();
			} else if (var2 == 2) {
				field1197 = arg0.method226();
				if (ODMBIHRM.field1035 != null) {
					field1198 = ODMBIHRM.field1035[field1197];
				}
			} else if (var2 == 4) {
				field1201 = arg0.method226();
			} else if (var2 == 5) {
				field1202 = arg0.method226();
			} else if (var2 == 6) {
				field1203 = arg0.method226();
			} else if (var2 == 7) {
				field1204 = arg0.method224();
			} else if (var2 == 8) {
				field1205 = arg0.method224();
			} else if (var2 >= 40 && var2 < 50) {
				field1199[var2 - 40] = arg0.method226();
			} else if (var2 >= 50 && var2 < 60) {
				field1200[var2 - 50] = arg0.method226();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("TGIKVGNH.a()LKBEXSZSN;")
	public KBEXSZSN method461() {
		KBEXSZSN var1 = (KBEXSZSN) field1206.method197(field1195);
		if (var1 != null) {
			return var1;
		}

		KBEXSZSN var2 = KBEXSZSN.method339(field1196);
		if (var2 == null) {
			return null;
		}

		for (int var3 = 0; var3 < 6; var3++) {
			if (field1199[0] != 0) {
				var2.method353(field1199[var3], field1200[var3]);
			}
		}

		field1206.method198(field1195, var2);
		return var2;
	}
}
