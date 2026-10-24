package deob;

@ObfuscatedName("UAVNMKVJ")
public class UAVNMKVJ {

	@ObfuscatedName("UAVNMKVJ.f")
	public int field1336 = -1;

	@ObfuscatedName("UAVNMKVJ.h")
	public int[] field1338 = new int[6];

	@ObfuscatedName("UAVNMKVJ.i")
	public int[] field1339 = new int[6];

	@ObfuscatedName("UAVNMKVJ.j")
	public int field1340 = 128;

	@ObfuscatedName("UAVNMKVJ.k")
	public int field1341 = 128;

	@ObfuscatedName("UAVNMKVJ.o")
	public static OOTLZHQB field1345 = new OOTLZHQB(30);

	@ObfuscatedName("UAVNMKVJ.b")
	public static int field1332;

	@ObfuscatedName("UAVNMKVJ.d")
	public int field1334;

	@ObfuscatedName("UAVNMKVJ.e")
	public int field1335;

	@ObfuscatedName("UAVNMKVJ.l")
	public int field1342;

	@ObfuscatedName("UAVNMKVJ.m")
	public int field1343;

	@ObfuscatedName("UAVNMKVJ.n")
	public int field1344;

	@ObfuscatedName("UAVNMKVJ.g")
	public LCRVYGCP field1337;

	@ObfuscatedName("UAVNMKVJ.c")
	public static UAVNMKVJ[] field1333;

	@ObfuscatedName("UAVNMKVJ.a(ILHRXSNEYZ;)V")
	public static void method500(HRXSNEYZ arg0) {
		JHKSAGUC var1 = new JHKSAGUC(arg0.method289("spotanim.dat", null));
		field1332 = var1.method308();
		if (field1333 == null) {
			field1333 = new UAVNMKVJ[field1332];
		}

		for (int var2 = 0; var2 < field1332; var2++) {
			if (field1333[var2] == null) {
				field1333[var2] = new UAVNMKVJ();
			}

			field1333[var2].field1334 = var2;
			field1333[var2].method501(var1);
		}
	}

	@ObfuscatedName("UAVNMKVJ.a(LJHKSAGUC;I)V")
	public void method501(JHKSAGUC arg0) {
		while (true) {
			int var2 = arg0.method306();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1335 = arg0.method308();
			} else if (var2 == 2) {
				field1336 = arg0.method308();
				if (LCRVYGCP.field795 != null) {
					field1337 = LCRVYGCP.field795[field1336];
				}
			} else if (var2 == 4) {
				field1340 = arg0.method308();
			} else if (var2 == 5) {
				field1341 = arg0.method308();
			} else if (var2 == 6) {
				field1342 = arg0.method308();
			} else if (var2 == 7) {
				field1343 = arg0.method306();
			} else if (var2 == 8) {
				field1344 = arg0.method306();
			} else if (var2 >= 40 && var2 < 50) {
				field1338[var2 - 40] = arg0.method308();
			} else if (var2 >= 50 && var2 < 60) {
				field1339[var2 - 50] = arg0.method308();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("UAVNMKVJ.a()LRTQSBWRH;")
	public RTQSBWRH method502() {
		RTQSBWRH var1 = (RTQSBWRH) field1345.method386(field1334);
		if (var1 != null) {
			return var1;
		}

		RTQSBWRH var2 = RTQSBWRH.method454(field1335);
		if (var2 == null) {
			return null;
		}

		for (int var3 = 0; var3 < 6; var3++) {
			if (field1338[0] != 0) {
				var2.method468(field1338[var3], field1339[var3]);
			}
		}

		field1345.method387(field1334, var2);
		return var2;
	}
}
