package deob;

@ObfuscatedName("SNGXEJOJ")
public class SNGXEJOJ {

	@ObfuscatedName("SNGXEJOJ.h")
	public int field1220 = -1;

	@ObfuscatedName("SNGXEJOJ.j")
	public int[] field1222 = new int[6];

	@ObfuscatedName("SNGXEJOJ.k")
	public int[] field1223 = new int[6];

	@ObfuscatedName("SNGXEJOJ.l")
	public int field1224 = 128;

	@ObfuscatedName("SNGXEJOJ.m")
	public int field1225 = 128;

	@ObfuscatedName("SNGXEJOJ.q")
	public static RUNMBJUO field1229 = new RUNMBJUO(30);

	@ObfuscatedName("SNGXEJOJ.d")
	public static int field1216;

	@ObfuscatedName("SNGXEJOJ.f")
	public int field1218;

	@ObfuscatedName("SNGXEJOJ.g")
	public int field1219;

	@ObfuscatedName("SNGXEJOJ.n")
	public int field1226;

	@ObfuscatedName("SNGXEJOJ.o")
	public int field1227;

	@ObfuscatedName("SNGXEJOJ.p")
	public int field1228;

	@ObfuscatedName("SNGXEJOJ.i")
	public TLXFHCOO field1221;

	@ObfuscatedName("SNGXEJOJ.e")
	public static SNGXEJOJ[] field1217;

	@ObfuscatedName("SNGXEJOJ.a(LFIGUVTWB;Z)V")
	public static void method476(FIGUVTWB arg0) {
		MUKVLYLC var1 = new MUKVLYLC(arg0.method209("spotanim.dat", null));
		field1216 = var1.method294();
		if (field1217 == null) {
			field1217 = new SNGXEJOJ[field1216];
		}

		for (int var2 = 0; var2 < field1216; var2++) {
			if (field1217[var2] == null) {
				field1217[var2] = new SNGXEJOJ();
			}

			field1217[var2].field1218 = var2;
			field1217[var2].method477(var1);
		}
	}

	@ObfuscatedName("SNGXEJOJ.a(LMUKVLYLC;Z)V")
	public void method477(MUKVLYLC arg0) {
		while (true) {
			int var2 = arg0.method292();
			if (var2 == 0) {
				return;
			}

			if (var2 == 1) {
				field1219 = arg0.method294();
			} else if (var2 == 2) {
				field1220 = arg0.method294();
				if (TLXFHCOO.field1242 != null) {
					field1221 = TLXFHCOO.field1242[field1220];
				}
			} else if (var2 == 4) {
				field1224 = arg0.method294();
			} else if (var2 == 5) {
				field1225 = arg0.method294();
			} else if (var2 == 6) {
				field1226 = arg0.method294();
			} else if (var2 == 7) {
				field1227 = arg0.method292();
			} else if (var2 == 8) {
				field1228 = arg0.method292();
			} else if (var2 >= 40 && var2 < 50) {
				field1222[var2 - 40] = arg0.method294();
			} else if (var2 >= 50 && var2 < 60) {
				field1223[var2 - 50] = arg0.method294();
			} else {
				System.out.println("Error unrecognised spotanim config code: " + var2);
			}
		}
	}

	@ObfuscatedName("SNGXEJOJ.a()LNJPATAFL;")
	public NJPATAFL method478() {
		NJPATAFL var1 = (NJPATAFL) field1229.method450(field1218);
		if (var1 != null) {
			return var1;
		}

		NJPATAFL var2 = NJPATAFL.method334(field1219);
		if (var2 == null) {
			return null;
		}

		for (int var3 = 0; var3 < 6; var3++) {
			if (field1222[0] != 0) {
				var2.method348(field1222[var3], field1223[var3]);
			}
		}

		field1229.method451(field1218, var2);
		return var2;
	}
}
