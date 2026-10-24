package deob;

@ObfuscatedName("LTINEQTV")
public class LTINEQTV {

	@ObfuscatedName("LTINEQTV.g")
	public JRZPSMWR[] field860 = new JRZPSMWR[10];

	@ObfuscatedName("LTINEQTV.c")
	public static LTINEQTV[] field856 = new LTINEQTV[5000];

	@ObfuscatedName("LTINEQTV.d")
	public static int[] field857 = new int[5000];

	@ObfuscatedName("LTINEQTV.h")
	public int field861;

	@ObfuscatedName("LTINEQTV.i")
	public int field862;

	@ObfuscatedName("LTINEQTV.f")
	public static EMWAMCXW field859;

	@ObfuscatedName("LTINEQTV.e")
	public static byte[] field858;

	@ObfuscatedName("LTINEQTV.a(ILEMWAMCXW;)V")
	public static final void method325(EMWAMCXW arg0) {
		field858 = new byte[441000];
		field859 = new EMWAMCXW(field858);
		JRZPSMWR.method300();

		while (true) {
			int var1 = arg0.method219();
			if (var1 == 0xFFFF) {
				return;
			}

			field856[var1] = new LTINEQTV();
			field856[var1].method327(arg0);
			field857[var1] = field856[var1].method328();
		}
	}

	@ObfuscatedName("LTINEQTV.a(IIB)LEMWAMCXW;")
	public static final EMWAMCXW method326(int arg0, int arg1) {
		if (field856[arg0] != null) {
			LTINEQTV var2 = field856[arg0];
			return var2.method329(arg1);
		}

		return null;
	}

	@ObfuscatedName("LTINEQTV.b(ILEMWAMCXW;)V")
	public final void method327(EMWAMCXW arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method217();
			if (var3 != 0) {
				arg0.field617--;
				field860[var2] = new JRZPSMWR();
				field860[var2].method303(arg0);
			}
		}

		field861 = arg0.method219();
		field862 = arg0.method219();
	}

	@ObfuscatedName("LTINEQTV.a(I)I")
	public final int method328() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (field860[var2] != null && field860[var2].field804 / 20 < var1) {
				var1 = field860[var2].field804 / 20;
			}
		}

		if (field861 < field862 && field861 / 20 < var1) {
			var1 = field861 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; var3++) {
				if (field860[var3] != null) {
					field860[var3].field804 -= var1 * 20;
				}
			}

			if (field861 < field862) {
				field861 -= var1 * 20;
				field862 -= var1 * 20;
			}

			return var1;
		}

		return 0;
	}

	@ObfuscatedName("LTINEQTV.a(ZI)LEMWAMCXW;")
	public final EMWAMCXW method329(int arg0) {
		int var2 = method330(arg0);
		field859.field617 = 0;
		field859.method211(0x52494646);
		field859.method212(var2 + 36);
		field859.method211(0x57415645);
		field859.method211(0x666D7420);
		field859.method212(16);
		field859.method209(1);
		field859.method209(1);
		field859.method212(22050);
		field859.method212(22050);
		field859.method209(1);
		field859.method209(8);
		field859.method211(0x64617461);
		field859.method212(var2);
		field859.field617 += var2;
		return field859;
	}

	@ObfuscatedName("LTINEQTV.b(I)I")
	public final int method330(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (field860[var3] != null && field860[var3].field804 + field860[var3].field803 > var2) {
				var2 = field860[var3].field804 + field860[var3].field803;
			}
		}

		if (var2 == 0) {
			return 0;
		}

		int var4 = var2 * 22050 / 1000;
		int var5 = field861 * 22050 / 1000;
		int var6 = field862 * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}

		int var7 = (arg0 - 1) * (var6 - var5) + var4;
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			field858[var8] = -128;
		}

		for (int var9 = 0; var9 < 10; var9++) {
			if (field860[var9] != null) {
				int var10 = field860[var9].field803 * 22050 / 1000;
				int var11 = field860[var9].field804 * 22050 / 1000;
				int[] var12 = field860[var9].method301(var10, field860[var9].field803);
				for (int var13 = 0; var13 < var10; var13++) {
					field858[var11 + var13 + 44] += (byte) (var12[var13] >> 8);
				}
			}
		}

		if (arg0 > 1) {
			var5 += 44;
			var6 += 44;
			var4 += 44;
			var7 += 44;
			int var14 = var7 - var4;
			for (int var15 = var4 - 1; var15 >= var6; var15--) {
				field858[var14 + var15] = field858[var15];
			}

			for (int var16 = 1; var16 < arg0; var16++) {
				int var17 = (var6 - var5) * var16;
				for (int var18 = var5; var18 < var6; var18++) {
					field858[var17 + var18] = field858[var18];
				}
			}

			var7 -= 44;
		}

		return var7;
	}
}
