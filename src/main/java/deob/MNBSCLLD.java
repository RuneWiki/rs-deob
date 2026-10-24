package deob;

@ObfuscatedName("MNBSCLLD")
public class MNBSCLLD {

	@ObfuscatedName("MNBSCLLD.h")
	public SURDYBBQ[] field1161 = new SURDYBBQ[10];

	@ObfuscatedName("MNBSCLLD.d")
	public static MNBSCLLD[] field1157 = new MNBSCLLD[5000];

	@ObfuscatedName("MNBSCLLD.e")
	public static int[] field1158 = new int[5000];

	@ObfuscatedName("MNBSCLLD.i")
	public int field1162;

	@ObfuscatedName("MNBSCLLD.j")
	public int field1163;

	@ObfuscatedName("MNBSCLLD.g")
	public static LZWRHABP field1160;

	@ObfuscatedName("MNBSCLLD.f")
	public static byte[] field1159;

	@ObfuscatedName("MNBSCLLD.a(ILLZWRHABP;)V")
	public static final void method502(LZWRHABP arg0) {
		field1159 = new byte[441000];
		field1160 = new LZWRHABP(field1159);
		SURDYBBQ.method567();

		while (true) {
			int var1 = arg0.method465();
			if (var1 == 0xFFFF) {
				return;
			}

			field1157[var1] = new MNBSCLLD();
			field1157[var1].method504(arg0);
			field1158[var1] = field1157[var1].method505();
		}
	}

	@ObfuscatedName("MNBSCLLD.a(III)LLZWRHABP;")
	public static final LZWRHABP method503(int arg0, int arg1) {
		if (field1157[arg0] != null) {
			MNBSCLLD var2 = field1157[arg0];
			return var2.method506(arg1);
		}

		return null;
	}

	@ObfuscatedName("MNBSCLLD.a(ZLLZWRHABP;)V")
	public final void method504(LZWRHABP arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method463();
			if (var3 != 0) {
				arg0.field1139--;
				field1161[var2] = new SURDYBBQ();
				field1161[var2].method570(arg0);
			}
		}

		field1162 = arg0.method465();
		field1163 = arg0.method465();
	}

	@ObfuscatedName("MNBSCLLD.a(B)I")
	public final int method505() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (field1161[var2] != null && field1161[var2].field1356 / 20 < var1) {
				var1 = field1161[var2].field1356 / 20;
			}
		}

		if (field1162 < field1163 && field1162 / 20 < var1) {
			var1 = field1162 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; var3++) {
				if (field1161[var3] != null) {
					field1161[var3].field1356 -= var1 * 20;
				}
			}

			if (field1162 < field1163) {
				field1162 -= var1 * 20;
				field1163 -= var1 * 20;
			}

			return var1;
		}

		return 0;
	}

	@ObfuscatedName("MNBSCLLD.a(II)LLZWRHABP;")
	public final LZWRHABP method506(int arg0) {
		int var2 = method507(arg0);
		field1160.field1139 = 0;
		field1160.method457(0x52494646);
		field1160.method458(var2 + 36);
		field1160.method457(0x57415645);
		field1160.method457(0x666D7420);
		field1160.method458(16);
		field1160.method455(1);
		field1160.method455(1);
		field1160.method458(22050);
		field1160.method458(22050);
		field1160.method455(1);
		field1160.method455(8);
		field1160.method457(0x64617461);
		field1160.method458(var2);
		field1160.field1139 += var2;
		return field1160;
	}

	@ObfuscatedName("MNBSCLLD.a(I)I")
	public final int method507(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (field1161[var3] != null && field1161[var3].field1356 + field1161[var3].field1355 > var2) {
				var2 = field1161[var3].field1356 + field1161[var3].field1355;
			}
		}

		if (var2 == 0) {
			return 0;
		}

		int var4 = var2 * 22050 / 1000;
		int var5 = field1162 * 22050 / 1000;
		int var6 = field1163 * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}

		int var7 = (arg0 - 1) * (var6 - var5) + var4;
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			field1159[var8] = -128;
		}

		for (int var9 = 0; var9 < 10; var9++) {
			if (field1161[var9] != null) {
				int var10 = field1161[var9].field1355 * 22050 / 1000;
				int var11 = field1161[var9].field1356 * 22050 / 1000;
				int[] var12 = field1161[var9].method568(var10, field1161[var9].field1355);
				for (int var13 = 0; var13 < var10; var13++) {
					field1159[var11 + var13 + 44] += (byte) (var12[var13] >> 8);
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
				field1159[var14 + var15] = field1159[var15];
			}

			for (int var16 = 1; var16 < arg0; var16++) {
				int var17 = (var6 - var5) * var16;
				for (int var18 = var5; var18 < var6; var18++) {
					field1159[var17 + var18] = field1159[var18];
				}
			}

			var7 -= 44;
		}

		return var7;
	}
}
