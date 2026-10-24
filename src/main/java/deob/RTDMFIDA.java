package deob;

@ObfuscatedName("RTDMFIDA")
public class RTDMFIDA {

	@ObfuscatedName("RTDMFIDA.f")
	public int field1204 = -1;

	@ObfuscatedName("RTDMFIDA.h")
	public int[] field1206 = new int[6];

	@ObfuscatedName("RTDMFIDA.i")
	public int[] field1207 = new int[6];

	@ObfuscatedName("RTDMFIDA.j")
	public int field1208 = 128;

	@ObfuscatedName("RTDMFIDA.k")
	public int field1209 = 128;

	@ObfuscatedName("RTDMFIDA.o")
	public static EQSIBNHW field1213 = new EQSIBNHW(30);

	@ObfuscatedName("RTDMFIDA.b")
	public static int field1200;

	@ObfuscatedName("RTDMFIDA.d")
	public int field1202;

	@ObfuscatedName("RTDMFIDA.e")
	public int field1203;

	@ObfuscatedName("RTDMFIDA.l")
	public int field1210;

	@ObfuscatedName("RTDMFIDA.m")
	public int field1211;

	@ObfuscatedName("RTDMFIDA.n")
	public int field1212;

	@ObfuscatedName("RTDMFIDA.g")
	public KMWMLVIH field1205;

	@ObfuscatedName("RTDMFIDA.c")
	public static RTDMFIDA[] field1201;

	@ObfuscatedName("RTDMFIDA.a(LWEMOPWVJ;I)V")
	public static void method446(WEMOPWVJ arg0) {
		SVWJKJVI var1 = new SVWJKJVI(arg0.method559("spotanim.dat", null));
		field1200 = var1.method463();
		if (field1201 == null) {
			field1201 = new RTDMFIDA[field1200];
		}

		for (int var2 = 0; var2 < field1200; var2++) {
			if (field1201[var2] == null) {
				field1201[var2] = new RTDMFIDA();
			}

			field1201[var2].field1202 = var2;
			field1201[var2].method447(var1);
		}
	}

	@ObfuscatedName("RTDMFIDA.a(ILSVWJKJVI;)V")
	public void method447(SVWJKJVI arg0) {
		while (true) {
			int var2 = arg0.method461();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1203 = arg0.method463();
			} else if (var2 == 2) {
				field1204 = arg0.method463();
				if (KMWMLVIH.field825 != null) {
					field1205 = KMWMLVIH.field825[field1204];
				}
			} else if (var2 == 4) {
				field1208 = arg0.method463();
			} else if (var2 == 5) {
				field1209 = arg0.method463();
			} else if (var2 == 6) {
				field1210 = arg0.method463();
			} else if (var2 == 7) {
				field1211 = arg0.method461();
			} else if (var2 == 8) {
				field1212 = arg0.method461();
			} else if (var2 >= 40 && var2 < 50) {
				field1206[var2 - 40] = arg0.method463();
			} else if (var2 >= 50 && var2 < 60) {
				field1207[var2 - 50] = arg0.method463();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("RTDMFIDA.a()LIYSWJGDE;")
	public IYSWJGDE method448() {
		IYSWJGDE var1 = (IYSWJGDE) field1213.method175(field1202);
		if (var1 != null) {
			return var1;
		}

		IYSWJGDE var2 = IYSWJGDE.method273(field1203);
		if (var2 == null) {
			return null;
		}

		for (int var3 = 0; var3 < 6; var3++) {
			if (field1206[0] != 0) {
				var2.method287(field1206[var3], field1207[var3]);
			}
		}

		field1213.method176(field1202, var2);
		return var2;
	}
}
