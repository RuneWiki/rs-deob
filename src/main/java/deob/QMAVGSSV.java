package deob;

@ObfuscatedName("QMAVGSSV")
public class QMAVGSSV {

	@ObfuscatedName("QMAVGSSV.g")
	public boolean field1239 = false;

	@ObfuscatedName("QMAVGSSV.h")
	public int field1240 = -1;

	@ObfuscatedName("QMAVGSSV.j")
	public boolean field1242 = true;

	@ObfuscatedName("QMAVGSSV.a")
	public static int field1233;

	@ObfuscatedName("QMAVGSSV.d")
	public int field1236;

	@ObfuscatedName("QMAVGSSV.e")
	public int field1237;

	@ObfuscatedName("QMAVGSSV.f")
	public int field1238;

	@ObfuscatedName("QMAVGSSV.i")
	public int field1241;

	@ObfuscatedName("QMAVGSSV.c")
	public String field1235;

	@ObfuscatedName("QMAVGSSV.b")
	public static QMAVGSSV[] field1234;

	@ObfuscatedName("QMAVGSSV.a(BLIEMHZJLX;)V")
	public static void method486(IEMHZJLX arg0) {
		MVHXDWGI var1 = new MVHXDWGI(arg0.method242("varbit.dat", null));
		field1233 = var1.method359();
		if (field1234 == null) {
			field1234 = new QMAVGSSV[field1233];
		}

		for (int var2 = 0; var2 < field1233; var2++) {
			if (field1234[var2] == null) {
				field1234[var2] = new QMAVGSSV();
			}

			field1234[var2].method487(var2, var1);

			if (field1234[var2].field1239) {
				RIRWXSOT.field1266[field1234[var2].field1236].field1278 = true;
			}
		}

		if (var1.field1013.length != var1.field1014) {
			System.out.println("varbit load mismatch");
		}
	}

	@ObfuscatedName("QMAVGSSV.a(ILMVHXDWGI;B)V")
	public void method487(int arg0, MVHXDWGI arg1) {
		while (true) {
			int var3 = arg1.method357();
			if (var3 == 0) {
				return;
			}

			if (var3 == 1) {
				field1236 = arg1.method359();
				field1237 = arg1.method357();
				field1238 = arg1.method357();
			} else if (var3 == 10) {
				field1235 = arg1.method364();
			} else if (var3 == 2) {
				field1239 = true;
			} else if (var3 == 3) {
				field1240 = arg1.method362();
			} else if (var3 == 4) {
				field1241 = arg1.method362();
			} else if (var3 == 5) {
				field1242 = false;
			} else {
				System.out.println("Error unrecognised config code: " + var3);
			}
		}
	}
}
