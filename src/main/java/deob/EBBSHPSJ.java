package deob;

@ObfuscatedName("EBBSHPSJ")
public class EBBSHPSJ {

	@ObfuscatedName("EBBSHPSJ.e")
	public int field612 = -1;

	@ObfuscatedName("EBBSHPSJ.g")
	public int[] field614 = new int[6];

	@ObfuscatedName("EBBSHPSJ.h")
	public int[] field615 = new int[6];

	@ObfuscatedName("EBBSHPSJ.i")
	public int field616 = 128;

	@ObfuscatedName("EBBSHPSJ.j")
	public int field617 = 128;

	@ObfuscatedName("EBBSHPSJ.n")
	public static QASTZCLF field621 = new QASTZCLF(30);

	@ObfuscatedName("EBBSHPSJ.a")
	public static int field608;

	@ObfuscatedName("EBBSHPSJ.c")
	public int field610;

	@ObfuscatedName("EBBSHPSJ.d")
	public int field611;

	@ObfuscatedName("EBBSHPSJ.k")
	public int field618;

	@ObfuscatedName("EBBSHPSJ.l")
	public int field619;

	@ObfuscatedName("EBBSHPSJ.m")
	public int field620;

	@ObfuscatedName("EBBSHPSJ.f")
	public XTKQUJNF field613;

	@ObfuscatedName("EBBSHPSJ.b")
	public static EBBSHPSJ[] field609;

	@ObfuscatedName("EBBSHPSJ.a(LAWEEREDT;I)V")
	public static void method208(AWEEREDT arg0) {
		IUVBENCV var1 = new IUVBENCV(arg0.method14("spotanim.dat", null));
		field608 = var1.method247();
		if (field609 == null) {
			field609 = new EBBSHPSJ[field608];
		}

		for (int var2 = 0; var2 < field608; var2++) {
			if (field609[var2] == null) {
				field609[var2] = new EBBSHPSJ();
			}

			field609[var2].field610 = var2;
			field609[var2].method209(var1);
		}
	}

	@ObfuscatedName("EBBSHPSJ.a(LIUVBENCV;B)V")
	public void method209(IUVBENCV arg0) {
		while (true) {
			int var2 = arg0.method245();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field611 = arg0.method247();
			} else if (var2 == 2) {
				field612 = arg0.method247();
				if (XTKQUJNF.field1432 != null) {
					field613 = XTKQUJNF.field1432[field612];
				}
			} else if (var2 == 4) {
				field616 = arg0.method247();
			} else if (var2 == 5) {
				field617 = arg0.method247();
			} else if (var2 == 6) {
				field618 = arg0.method247();
			} else if (var2 == 7) {
				field619 = arg0.method245();
			} else if (var2 == 8) {
				field620 = arg0.method245();
			} else if (var2 >= 40 && var2 < 50) {
				field614[var2 - 40] = arg0.method247();
			} else if (var2 >= 50 && var2 < 60) {
				field615[var2 - 50] = arg0.method247();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("EBBSHPSJ.a()LJJMVUSJJ;")
	public JJMVUSJJ method210() {
		JJMVUSJJ var1 = (JJMVUSJJ) field621.method438(field610);
		if (var1 != null) {
			return var1;
		}

		JJMVUSJJ var2 = JJMVUSJJ.method300(field611);
		if (var2 == null) {
			return null;
		}

		for (int var3 = 0; var3 < 6; var3++) {
			if (field614[0] != 0) {
				var2.method314(field614[var3], field615[var3]);
			}
		}

		field621.method439(var2, field610);
		return var2;
	}
}
