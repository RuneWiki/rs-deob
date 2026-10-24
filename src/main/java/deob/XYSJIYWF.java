package deob;

@ObfuscatedName("XYSJIYWF")
public class XYSJIYWF {

	@ObfuscatedName("XYSJIYWF.f")
	public int field1480 = -1;

	@ObfuscatedName("XYSJIYWF.h")
	public int[] field1482 = new int[6];

	@ObfuscatedName("XYSJIYWF.i")
	public int[] field1483 = new int[6];

	@ObfuscatedName("XYSJIYWF.j")
	public int field1484 = 128;

	@ObfuscatedName("XYSJIYWF.k")
	public int field1485 = 128;

	@ObfuscatedName("XYSJIYWF.o")
	public static UNPPHFRC field1489 = new UNPPHFRC(30);

	@ObfuscatedName("XYSJIYWF.b")
	public static int field1476;

	@ObfuscatedName("XYSJIYWF.d")
	public int field1478;

	@ObfuscatedName("XYSJIYWF.e")
	public int field1479;

	@ObfuscatedName("XYSJIYWF.l")
	public int field1486;

	@ObfuscatedName("XYSJIYWF.m")
	public int field1487;

	@ObfuscatedName("XYSJIYWF.n")
	public int field1488;

	@ObfuscatedName("XYSJIYWF.g")
	public DVIZXFSW field1481;

	@ObfuscatedName("XYSJIYWF.c")
	public static XYSJIYWF[] field1477;

	@ObfuscatedName("XYSJIYWF.a(LHBJEXSJX;Z)V")
	public static void method580(HBJEXSJX arg0) {
		EYMNCFMK var1 = new EYMNCFMK(arg0.method348("spotanim.dat", null));
		field1476 = var1.method241();
		if (field1477 == null) {
			field1477 = new XYSJIYWF[field1476];
		}

		for (int var2 = 0; var2 < field1476; var2++) {
			if (field1477[var2] == null) {
				field1477[var2] = new XYSJIYWF();
			}

			field1477[var2].field1478 = var2;
			field1477[var2].method581(var1);
		}
	}

	@ObfuscatedName("XYSJIYWF.a(BLEYMNCFMK;)V")
	public void method581(EYMNCFMK arg0) {
		while (true) {
			int var2 = arg0.method239();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1479 = arg0.method241();
			} else if (var2 == 2) {
				field1480 = arg0.method241();
				if (DVIZXFSW.field636 != null) {
					field1481 = DVIZXFSW.field636[field1480];
				}
			} else if (var2 == 4) {
				field1484 = arg0.method241();
			} else if (var2 == 5) {
				field1485 = arg0.method241();
			} else if (var2 == 6) {
				field1486 = arg0.method241();
			} else if (var2 == 7) {
				field1487 = arg0.method239();
			} else if (var2 == 8) {
				field1488 = arg0.method239();
			} else if (var2 >= 40 && var2 < 50) {
				field1482[var2 - 40] = arg0.method241();
			} else if (var2 >= 50 && var2 < 60) {
				field1483[var2 - 50] = arg0.method241();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("XYSJIYWF.a()LOJGAHFXC;")
	public OJGAHFXC method582() {
		OJGAHFXC var1 = (OJGAHFXC) field1489.method531(field1478);
		if (var1 != null) {
			return var1;
		}

		OJGAHFXC var2 = OJGAHFXC.method413(field1479);
		if (var2 == null) {
			return null;
		}

		for (int var3 = 0; var3 < 6; var3++) {
			if (field1482[0] != 0) {
				var2.method427(field1482[var3], field1483[var3]);
			}
		}

		field1489.method532(field1478, var2);
		return var2;
	}
}
