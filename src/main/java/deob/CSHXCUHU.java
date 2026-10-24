package deob;

@ObfuscatedName("CSHXCUHU")
public class CSHXCUHU {

	@ObfuscatedName("CSHXCUHU.e")
	public int field555 = -1;

	@ObfuscatedName("CSHXCUHU.g")
	public int[] field557 = new int[6];

	@ObfuscatedName("CSHXCUHU.h")
	public int[] field558 = new int[6];

	@ObfuscatedName("CSHXCUHU.i")
	public int[] field559 = new int[] { -1, -1, -1, -1, -1 };

	@ObfuscatedName("CSHXCUHU.j")
	public boolean field560 = false;

	@ObfuscatedName("CSHXCUHU.c")
	public static int field553;

	@ObfuscatedName("CSHXCUHU.f")
	public int[] field556;

	@ObfuscatedName("CSHXCUHU.d")
	public static CSHXCUHU[] field554;

	@ObfuscatedName("CSHXCUHU.a(LFNOQZAYQ;I)V")
	public static void method169(FNOQZAYQ arg0) {
		DNRIFKTO var1 = new DNRIFKTO(arg0.method246("idk.dat", null));
		field553 = var1.method191();
		if (field554 == null) {
			field554 = new CSHXCUHU[field553];
		}

		for (int var2 = 0; var2 < field553; var2++) {
			if (field554[var2] == null) {
				field554[var2] = new CSHXCUHU();
			}

			field554[var2].method170(var1);
		}
	}

	@ObfuscatedName("CSHXCUHU.a(LDNRIFKTO;I)V")
	public void method170(DNRIFKTO arg0) {
		while (true) {
			int var2 = arg0.method189();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field555 = arg0.method189();
			} else if (var2 == 2) {
				int var3 = arg0.method189();
				field556 = new int[var3];
				for (int var4 = 0; var4 < var3; var4++) {
					field556[var4] = arg0.method191();
				}
			} else if (var2 == 3) {
				field560 = true;
			} else if (var2 >= 40 && var2 < 50) {
				field557[var2 - 40] = arg0.method191();
			} else if (var2 >= 50 && var2 < 60) {
				field558[var2 - 50] = arg0.method191();
			} else if (var2 >= 60 && var2 < 70) {
				field559[var2 - 60] = arg0.method191();
			} else {
				System.out.println("Error unrecognised config code: " + var2);
			}
		}
	}

	@ObfuscatedName("CSHXCUHU.a(I)Z")
	public boolean method171() {
		if (field556 == null) {
			return true;
		}

		boolean var1 = true;
		for (int var2 = 0; var2 < field556.length; var2++) {
			if (!SNMMQNPZ.method419(field556[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("CSHXCUHU.b(I)LSNMMQNPZ;")
	public SNMMQNPZ method172() {
		if (field556 == null) {
			return null;
		}

		SNMMQNPZ[] var1 = new SNMMQNPZ[field556.length];
		for (int var2 = 0; var2 < field556.length; var2++) {
			var1[var2] = SNMMQNPZ.method418(field556[var2]);
		}

		SNMMQNPZ var3;
		if (var1.length == 1) {
			var3 = var1[0];
		} else {
			var3 = new SNMMQNPZ(var1.length, var1);
		}

		for (int var4 = 0; var4 < 6 && field557[var4] != 0; var4++) {
			var3.method432(field557[var4], field558[var4]);
		}

		return var3;
	}

	@ObfuscatedName("CSHXCUHU.c(I)Z")
	public boolean method173() {
		boolean var1 = true;
		for (int var2 = 0; var2 < 5; var2++) {
			if (field559[var2] != -1 && !SNMMQNPZ.method419(field559[var2])) {
				var1 = false;
			}
		}

		return var1;
	}

	@ObfuscatedName("CSHXCUHU.a(Z)LSNMMQNPZ;")
	public SNMMQNPZ method174() {
		SNMMQNPZ[] var1 = new SNMMQNPZ[5];
		int var2 = 0;
		for (int var3 = 0; var3 < 5; var3++) {
			if (field559[var3] != -1) {
				var1[var2++] = SNMMQNPZ.method418(field559[var3]);
			}
		}

		SNMMQNPZ var4 = new SNMMQNPZ(var2, var1);
		for (int var5 = 0; var5 < 6 && field557[var5] != 0; var5++) {
			var4.method432(field557[var5], field558[var5]);
		}

		return var4;
	}
}
