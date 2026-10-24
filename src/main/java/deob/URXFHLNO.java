package deob;

@ObfuscatedName("URXFHLNO")
public class URXFHLNO {

	@ObfuscatedName("URXFHLNO.g")
	public PJPXFVTH[] field1341 = new PJPXFVTH[10];

	@ObfuscatedName("URXFHLNO.c")
	public static URXFHLNO[] field1337 = new URXFHLNO[5000];

	@ObfuscatedName("URXFHLNO.d")
	public static int[] field1338 = new int[5000];

	@ObfuscatedName("URXFHLNO.h")
	public int field1342;

	@ObfuscatedName("URXFHLNO.i")
	public int field1343;

	@ObfuscatedName("URXFHLNO.f")
	public static WNCFPLWV field1340;

	@ObfuscatedName("URXFHLNO.e")
	public static byte[] field1339;

	@ObfuscatedName("URXFHLNO.a(BLWNCFPLWV;)V")
	public static final void method468(WNCFPLWV arg0) {
		field1339 = new byte[441000];
		field1340 = new WNCFPLWV(field1339);
		PJPXFVTH.method385();

		while (true) {
			int var1 = arg0.method504();
			if (var1 == 0xFFFF) {
				return;
			}

			field1337[var1] = new URXFHLNO();
			field1337[var1].method470(arg0);
			field1338[var1] = field1337[var1].method471();
		}
	}

	@ObfuscatedName("URXFHLNO.a(III)LWNCFPLWV;")
	public static final WNCFPLWV method469(int arg0, int arg1) {
		if (field1337[arg0] != null) {
			URXFHLNO var2 = field1337[arg0];
			return var2.method472(arg1);
		}

		return null;
	}

	@ObfuscatedName("URXFHLNO.a(ILWNCFPLWV;)V")
	public final void method470(WNCFPLWV arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method502();
			if (var3 != 0) {
				arg0.field1375--;
				field1341[var2] = new PJPXFVTH();
				field1341[var2].method388(arg0);
			}
		}

		field1342 = arg0.method504();
		field1343 = arg0.method504();
	}

	@ObfuscatedName("URXFHLNO.a(I)I")
	public final int method471() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (field1341[var2] != null && field1341[var2].field996 / 20 < var1) {
				var1 = field1341[var2].field996 / 20;
			}
		}

		if (field1342 < field1343 && field1342 / 20 < var1) {
			var1 = field1342 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; var3++) {
				if (field1341[var3] != null) {
					field1341[var3].field996 -= var1 * 20;
				}
			}

			if (field1342 < field1343) {
				field1342 -= var1 * 20;
				field1343 -= var1 * 20;
			}

			return var1;
		}

		return 0;
	}

	@ObfuscatedName("URXFHLNO.a(ZI)LWNCFPLWV;")
	public final WNCFPLWV method472(int arg0) {
		int var2 = method473(arg0);
		field1340.field1375 = 0;
		field1340.method496(0x52494646);
		field1340.method497(var2 + 36);
		field1340.method496(0x57415645);
		field1340.method496(0x666D7420);
		field1340.method497(16);
		field1340.method494(1);
		field1340.method494(1);
		field1340.method497(22050);
		field1340.method497(22050);
		field1340.method494(1);
		field1340.method494(8);
		field1340.method496(0x64617461);
		field1340.method497(var2);
		field1340.field1375 += var2;
		return field1340;
	}

	@ObfuscatedName("URXFHLNO.b(I)I")
	public final int method473(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (field1341[var3] != null && field1341[var3].field996 + field1341[var3].field995 > var2) {
				var2 = field1341[var3].field996 + field1341[var3].field995;
			}
		}

		if (var2 == 0) {
			return 0;
		}

		int var4 = var2 * 22050 / 1000;
		int var5 = field1342 * 22050 / 1000;
		int var6 = field1343 * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}

		int var7 = (arg0 - 1) * (var6 - var5) + var4;
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			field1339[var8] = -128;
		}

		for (int var9 = 0; var9 < 10; var9++) {
			if (field1341[var9] != null) {
				int var10 = field1341[var9].field995 * 22050 / 1000;
				int var11 = field1341[var9].field996 * 22050 / 1000;
				int[] var12 = field1341[var9].method386(var10, field1341[var9].field995);
				for (int var13 = 0; var13 < var10; var13++) {
					int var14 = (var12[var13] >> 8) + (field1339[var11 + var13 + 44] & 0xFF);
					if ((var14 & 0xFFFFFF00) != 0) {
						var14 = ~(var14 >> 31);
					}

					field1339[var11 + var13 + 44] = (byte) var14;
				}
			}
		}

		if (arg0 > 1) {
			var5 += 44;
			var6 += 44;
			var4 += 44;
			var7 += 44;
			int var15 = var7 - var4;
			for (int var16 = var4 - 1; var16 >= var6; var16--) {
				field1339[var15 + var16] = field1339[var16];
			}

			for (int var17 = 1; var17 < arg0; var17++) {
				int var18 = (var6 - var5) * var17;
				for (int var19 = var5; var19 < var6; var19++) {
					field1339[var18 + var19] = field1339[var19];
				}
			}

			var7 -= 44;
		}

		return var7;
	}
}
