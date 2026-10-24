package deob;

@ObfuscatedName("CQXSYOPM")
public class CQXSYOPM {

	@ObfuscatedName("CQXSYOPM.h")
	public XDUWEFUG[] field537 = new XDUWEFUG[10];

	@ObfuscatedName("CQXSYOPM.d")
	public static CQXSYOPM[] field533 = new CQXSYOPM[5000];

	@ObfuscatedName("CQXSYOPM.e")
	public static int[] field534 = new int[5000];

	@ObfuscatedName("CQXSYOPM.i")
	public int field538;

	@ObfuscatedName("CQXSYOPM.j")
	public int field539;

	@ObfuscatedName("CQXSYOPM.g")
	public static MNKDCXXG field536;

	@ObfuscatedName("CQXSYOPM.f")
	public static byte[] field535;

	@ObfuscatedName("CQXSYOPM.a(LMNKDCXXG;I)V")
	public static final void method171(MNKDCXXG arg0) {
		field535 = new byte[441000];
		field536 = new MNKDCXXG(field535);
		XDUWEFUG.method552();

		while (true) {
			int var1 = arg0.method388();
			if (var1 == 0xFFFF) {
				return;
			}

			field533[var1] = new CQXSYOPM();
			field533[var1].method173(arg0);
			field534[var1] = field533[var1].method174();
		}
	}

	@ObfuscatedName("CQXSYOPM.a(IIB)LMNKDCXXG;")
	public static final MNKDCXXG method172(int arg0, int arg1) {
		if (field533[arg0] != null) {
			CQXSYOPM var2 = field533[arg0];
			return var2.method175(arg1);
		}

		return null;
	}

	@ObfuscatedName("CQXSYOPM.b(LMNKDCXXG;I)V")
	public final void method173(MNKDCXXG arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method386();
			if (var3 != 0) {
				arg0.field1055--;
				field537[var2] = new XDUWEFUG();
				field537[var2].method555(arg0);
			}
		}

		field538 = arg0.method388();
		field539 = arg0.method388();
	}

	@ObfuscatedName("CQXSYOPM.a(I)I")
	public final int method174() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (field537[var2] != null && field537[var2].field1403 / 20 < var1) {
				var1 = field537[var2].field1403 / 20;
			}
		}

		if (field538 < field539 && field538 / 20 < var1) {
			var1 = field538 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; var3++) {
				if (field537[var3] != null) {
					field537[var3].field1403 -= var1 * 20;
				}
			}

			if (field538 < field539) {
				field538 -= var1 * 20;
				field539 -= var1 * 20;
			}

			return var1;
		}

		return 0;
	}

	@ObfuscatedName("CQXSYOPM.a(II)LMNKDCXXG;")
	public final MNKDCXXG method175(int arg0) {
		int var2 = method176(arg0);
		field536.field1055 = 0;
		field536.method380(0x52494646);
		field536.method381(var2 + 36);
		field536.method380(0x57415645);
		field536.method380(0x666D7420);
		field536.method381(16);
		field536.method378(1);
		field536.method378(1);
		field536.method381(22050);
		field536.method381(22050);
		field536.method378(1);
		field536.method378(8);
		field536.method380(0x64617461);
		field536.method381(var2);
		field536.field1055 += var2;
		return field536;
	}

	@ObfuscatedName("CQXSYOPM.b(I)I")
	public final int method176(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (field537[var3] != null && field537[var3].field1403 + field537[var3].field1402 > var2) {
				var2 = field537[var3].field1403 + field537[var3].field1402;
			}
		}

		if (var2 == 0) {
			return 0;
		}

		int var4 = var2 * 22050 / 1000;
		int var5 = field538 * 22050 / 1000;
		int var6 = field539 * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}

		int var7 = (arg0 - 1) * (var6 - var5) + var4;
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			field535[var8] = -128;
		}

		for (int var9 = 0; var9 < 10; var9++) {
			if (field537[var9] != null) {
				int var10 = field537[var9].field1402 * 22050 / 1000;
				int var11 = field537[var9].field1403 * 22050 / 1000;
				int[] var12 = field537[var9].method553(var10, field537[var9].field1402);
				for (int var13 = 0; var13 < var10; var13++) {
					int var14 = (var12[var13] >> 8) + (field535[var11 + var13 + 44] & 0xFF);
					if ((var14 & 0xFFFFFF00) != 0) {
						var14 = ~(var14 >> 31);
					}

					field535[var11 + var13 + 44] = (byte) var14;
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
				field535[var15 + var16] = field535[var16];
			}

			for (int var17 = 1; var17 < arg0; var17++) {
				int var18 = (var6 - var5) * var17;
				for (int var19 = var5; var19 < var6; var19++) {
					field535[var18 + var19] = field535[var19];
				}
			}

			var7 -= 44;
		}

		return var7;
	}
}
