package deob;

@ObfuscatedName("MYEMYBYY")
public class MYEMYBYY {

	@ObfuscatedName("MYEMYBYY.g")
	public UJYLHBCS[] field991 = new UJYLHBCS[10];

	@ObfuscatedName("MYEMYBYY.c")
	public static MYEMYBYY[] field987 = new MYEMYBYY[5000];

	@ObfuscatedName("MYEMYBYY.d")
	public static int[] field988 = new int[5000];

	@ObfuscatedName("MYEMYBYY.h")
	public int field992;

	@ObfuscatedName("MYEMYBYY.i")
	public int field993;

	@ObfuscatedName("MYEMYBYY.f")
	public static EYMNCFMK field990;

	@ObfuscatedName("MYEMYBYY.e")
	public static byte[] field989;

	@ObfuscatedName("MYEMYBYY.a(LEYMNCFMK;Z)V")
	public static final void method403(EYMNCFMK arg0) {
		field989 = new byte[441000];
		field990 = new EYMNCFMK(field989);
		UJYLHBCS.method527();

		while (true) {
			int var1 = arg0.method241();
			if (var1 == 0xFFFF) {
				return;
			}

			field987[var1] = new MYEMYBYY();
			field987[var1].method405(arg0);
			field988[var1] = field987[var1].method406();
		}
	}

	@ObfuscatedName("MYEMYBYY.a(IZI)LEYMNCFMK;")
	public static final EYMNCFMK method404(int arg0, int arg1) {
		if (field987[arg0] != null) {
			MYEMYBYY var2 = field987[arg0];
			return var2.method407(arg1);
		}

		return null;
	}

	@ObfuscatedName("MYEMYBYY.a(BLEYMNCFMK;)V")
	public final void method405(EYMNCFMK arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method239();
			if (var3 != 0) {
				arg0.field679--;
				field991[var2] = new UJYLHBCS();
				field991[var2].method530(arg0);
			}
		}

		field992 = arg0.method241();
		field993 = arg0.method241();
	}

	@ObfuscatedName("MYEMYBYY.a(Z)I")
	public final int method406() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (field991[var2] != null && field991[var2].field1282 / 20 < var1) {
				var1 = field991[var2].field1282 / 20;
			}
		}

		if (field992 < field993 && field992 / 20 < var1) {
			var1 = field992 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; var3++) {
				if (field991[var3] != null) {
					field991[var3].field1282 -= var1 * 20;
				}
			}

			if (field992 < field993) {
				field992 -= var1 * 20;
				field993 -= var1 * 20;
			}

			return var1;
		}

		return 0;
	}

	@ObfuscatedName("MYEMYBYY.a(II)LEYMNCFMK;")
	public final EYMNCFMK method407(int arg0) {
		int var2 = method408(arg0);
		field990.field679 = 0;
		field990.method233(0x52494646);
		field990.method234(var2 + 36);
		field990.method233(0x57415645);
		field990.method233(0x666D7420);
		field990.method234(16);
		field990.method231(1);
		field990.method231(1);
		field990.method234(22050);
		field990.method234(22050);
		field990.method231(1);
		field990.method231(8);
		field990.method233(0x64617461);
		field990.method234(var2);
		field990.field679 += var2;
		return field990;
	}

	@ObfuscatedName("MYEMYBYY.a(I)I")
	public final int method408(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (field991[var3] != null && field991[var3].field1282 + field991[var3].field1281 > var2) {
				var2 = field991[var3].field1282 + field991[var3].field1281;
			}
		}

		if (var2 == 0) {
			return 0;
		}

		int var4 = var2 * 22050 / 1000;
		int var5 = field992 * 22050 / 1000;
		int var6 = field993 * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}

		int var7 = (arg0 - 1) * (var6 - var5) + var4;
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			field989[var8] = -128;
		}

		for (int var9 = 0; var9 < 10; var9++) {
			if (field991[var9] != null) {
				int var10 = field991[var9].field1281 * 22050 / 1000;
				int var11 = field991[var9].field1282 * 22050 / 1000;
				int[] var12 = field991[var9].method528(var10, field991[var9].field1281);
				for (int var13 = 0; var13 < var10; var13++) {
					int var14 = (var12[var13] >> 8) + (field989[var11 + var13 + 44] & 0xFF);
					if ((var14 & 0xFFFFFF00) != 0) {
						var14 = ~(var14 >> 31);
					}

					field989[var11 + var13 + 44] = (byte) var14;
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
				field989[var15 + var16] = field989[var16];
			}

			for (int var17 = 1; var17 < arg0; var17++) {
				int var18 = (var6 - var5) * var17;
				for (int var19 = var5; var19 < var6; var19++) {
					field989[var18 + var19] = field989[var19];
				}
			}

			var7 -= 44;
		}

		return var7;
	}
}
