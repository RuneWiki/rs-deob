package deob;

@ObfuscatedName("VKAZQVPD")
public class VKAZQVPD {

	@ObfuscatedName("VKAZQVPD.g")
	public OBDRPXUY[] field1397 = new OBDRPXUY[10];

	@ObfuscatedName("VKAZQVPD.c")
	public static VKAZQVPD[] field1393 = new VKAZQVPD[5000];

	@ObfuscatedName("VKAZQVPD.d")
	public static int[] field1394 = new int[5000];

	@ObfuscatedName("VKAZQVPD.h")
	public int field1398;

	@ObfuscatedName("VKAZQVPD.i")
	public int field1399;

	@ObfuscatedName("VKAZQVPD.f")
	public static WBEWPIXO field1396;

	@ObfuscatedName("VKAZQVPD.e")
	public static byte[] field1395;

	@ObfuscatedName("VKAZQVPD.a(LWBEWPIXO;I)V")
	public static final void method497(WBEWPIXO arg0) {
		field1395 = new byte[441000];
		field1396 = new WBEWPIXO(field1395);
		OBDRPXUY.method347();

		while (true) {
			int var1 = arg0.method517();
			if (var1 == 0xFFFF) {
				return;
			}

			field1393[var1] = new VKAZQVPD();
			field1393[var1].method499(arg0);
			field1394[var1] = field1393[var1].method500();
		}
	}

	@ObfuscatedName("VKAZQVPD.a(III)LWBEWPIXO;")
	public static final WBEWPIXO method498(int arg0, int arg1) {
		if (field1393[arg1] != null) {
			VKAZQVPD var2 = field1393[arg1];
			return var2.method501(arg0);
		}

		return null;
	}

	@ObfuscatedName("VKAZQVPD.b(LWBEWPIXO;I)V")
	public final void method499(WBEWPIXO arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method515();
			if (var3 != 0) {
				arg0.field1401--;
				field1397[var2] = new OBDRPXUY();
				field1397[var2].method350(arg0);
			}
		}

		field1398 = arg0.method517();
		field1399 = arg0.method517();
	}

	@ObfuscatedName("VKAZQVPD.a(I)I")
	public final int method500() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (field1397[var2] != null && field1397[var2].field1124 / 20 < var1) {
				var1 = field1397[var2].field1124 / 20;
			}
		}

		if (field1398 < field1399 && field1398 / 20 < var1) {
			var1 = field1398 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; var3++) {
				if (field1397[var3] != null) {
					field1397[var3].field1124 -= var1 * 20;
				}
			}

			if (field1398 < field1399) {
				field1398 -= var1 * 20;
				field1399 -= var1 * 20;
			}

			return var1;
		}

		return 0;
	}

	@ObfuscatedName("VKAZQVPD.a(IZ)LWBEWPIXO;")
	public final WBEWPIXO method501(int arg0) {
		int var2 = method502(arg0);
		field1396.field1401 = 0;
		field1396.method509(0x52494646);
		field1396.method510(var2 + 36);
		field1396.method509(0x57415645);
		field1396.method509(0x666D7420);
		field1396.method510(16);
		field1396.method507(1);
		field1396.method507(1);
		field1396.method510(22050);
		field1396.method510(22050);
		field1396.method507(1);
		field1396.method507(8);
		field1396.method509(0x64617461);
		field1396.method510(var2);
		field1396.field1401 += var2;
		return field1396;
	}

	@ObfuscatedName("VKAZQVPD.b(I)I")
	public final int method502(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (field1397[var3] != null && field1397[var3].field1124 + field1397[var3].field1123 > var2) {
				var2 = field1397[var3].field1124 + field1397[var3].field1123;
			}
		}

		if (var2 == 0) {
			return 0;
		}

		int var4 = var2 * 22050 / 1000;
		int var5 = field1398 * 22050 / 1000;
		int var6 = field1399 * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}

		int var7 = (arg0 - 1) * (var6 - var5) + var4;
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			field1395[var8] = -128;
		}

		for (int var9 = 0; var9 < 10; var9++) {
			if (field1397[var9] != null) {
				int var10 = field1397[var9].field1123 * 22050 / 1000;
				int var11 = field1397[var9].field1124 * 22050 / 1000;
				int[] var12 = field1397[var9].method348(var10, field1397[var9].field1123);
				for (int var13 = 0; var13 < var10; var13++) {
					int var14 = (var12[var13] >> 8) + (field1395[var11 + var13 + 44] & 0xFF);
					if ((var14 & 0xFFFFFF00) != 0) {
						var14 = ~(var14 >> 31);
					}

					field1395[var11 + var13 + 44] = (byte) var14;
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
				field1395[var15 + var16] = field1395[var16];
			}

			for (int var17 = 1; var17 < arg0; var17++) {
				int var18 = (var6 - var5) * var17;
				for (int var19 = var5; var19 < var6; var19++) {
					field1395[var18 + var19] = field1395[var19];
				}
			}

			var7 -= 44;
		}

		return var7;
	}
}
