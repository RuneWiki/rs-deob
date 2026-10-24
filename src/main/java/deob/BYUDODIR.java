package deob;

@ObfuscatedName("BYUDODIR")
public class BYUDODIR {

	@ObfuscatedName("BYUDODIR.e")
	public int field37 = -1;

	@ObfuscatedName("BYUDODIR.g")
	public int[] field39 = new int[6];

	@ObfuscatedName("BYUDODIR.h")
	public int[] field40 = new int[6];

	@ObfuscatedName("BYUDODIR.i")
	public int field41 = 128;

	@ObfuscatedName("BYUDODIR.j")
	public int field42 = 128;

	@ObfuscatedName("BYUDODIR.n")
	public static VNWSQIXW field46 = new VNWSQIXW(30);

	@ObfuscatedName("BYUDODIR.a")
	public static int field33;

	@ObfuscatedName("BYUDODIR.c")
	public int field35;

	@ObfuscatedName("BYUDODIR.d")
	public int field36;

	@ObfuscatedName("BYUDODIR.k")
	public int field43;

	@ObfuscatedName("BYUDODIR.l")
	public int field44;

	@ObfuscatedName("BYUDODIR.m")
	public int field45;

	@ObfuscatedName("BYUDODIR.f")
	public VYCKCNXO field38;

	@ObfuscatedName("BYUDODIR.b")
	public static BYUDODIR[] field34;

	@ObfuscatedName("BYUDODIR.a(LDTIATKJO;I)V")
	public static void method16(DTIATKJO arg0) {
		GHHPHSRU var1 = new GHHPHSRU(arg0.method168("spotanim.dat", null));
		field33 = var1.method204();
		if (field34 == null) {
			field34 = new BYUDODIR[field33];
		}

		for (int var2 = 0; var2 < field33; var2++) {
			if (field34[var2] == null) {
				field34[var2] = new BYUDODIR();
			}

			field34[var2].field35 = var2;
			field34[var2].method17(var1);
		}
	}

	@ObfuscatedName("BYUDODIR.a(LGHHPHSRU;I)V")
	public void method17(GHHPHSRU arg0) {
		while (true) {
			int var2 = arg0.method202();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field36 = arg0.method204();
			} else if (var2 == 2) {
				field37 = arg0.method204();
				if (VYCKCNXO.field1339 != null) {
					field38 = VYCKCNXO.field1339[field37];
				}
			} else if (var2 == 4) {
				field41 = arg0.method204();
			} else if (var2 == 5) {
				field42 = arg0.method204();
			} else if (var2 == 6) {
				field43 = arg0.method204();
			} else if (var2 == 7) {
				field44 = arg0.method202();
			} else if (var2 == 8) {
				field45 = arg0.method202();
			} else if (var2 >= 40 && var2 < 50) {
				field39[var2 - 40] = arg0.method204();
			} else if (var2 >= 50 && var2 < 60) {
				field40[var2 - 50] = arg0.method204();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("BYUDODIR.a()LOQIGXOFQ;")
	public OQIGXOFQ method18() {
		OQIGXOFQ var1 = (OQIGXOFQ) field46.method507(field35);
		if (var1 != null) {
			return var1;
		}

		OQIGXOFQ var2 = OQIGXOFQ.method391(field36);
		if (var2 == null) {
			return null;
		}

		for (int var3 = 0; var3 < 6; var3++) {
			if (field39[0] != 0) {
				var2.method405(field39[var3], field40[var3]);
			}
		}

		field46.method508(field35, var2);
		return var2;
	}
}
