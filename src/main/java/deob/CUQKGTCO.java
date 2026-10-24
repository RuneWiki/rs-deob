package deob;

@ObfuscatedName("CUQKGTCO")
public class CUQKGTCO {

	@ObfuscatedName("CUQKGTCO.f")
	public AQBPXQWT[] field491 = new AQBPXQWT[10];

	@ObfuscatedName("CUQKGTCO.b")
	public static CUQKGTCO[] field487 = new CUQKGTCO[5000];

	@ObfuscatedName("CUQKGTCO.c")
	public static int[] field488 = new int[5000];

	@ObfuscatedName("CUQKGTCO.g")
	public int field492;

	@ObfuscatedName("CUQKGTCO.h")
	public int field493;

	@ObfuscatedName("CUQKGTCO.e")
	public static XQPFGONL field490;

	@ObfuscatedName("CUQKGTCO.d")
	public static byte[] field489;

	@ObfuscatedName("CUQKGTCO.a(ZLXQPFGONL;)V")
	public static final void method174(XQPFGONL arg0) {
		field489 = new byte[441000];
		field490 = new XQPFGONL(field489);
		AQBPXQWT.method4();

		while (true) {
			int var1 = arg0.method480();
			if (var1 == 0xFFFF) {
				return;
			}

			field487[var1] = new CUQKGTCO();
			field487[var1].method176(arg0);
			field488[var1] = field487[var1].method177();
		}
	}

	@ObfuscatedName("CUQKGTCO.a(III)LXQPFGONL;")
	public static final XQPFGONL method175(int arg0, int arg1) {
		if (field487[arg0] != null) {
			CUQKGTCO var2 = field487[arg0];
			return var2.method178(arg1);
		}

		return null;
	}

	@ObfuscatedName("CUQKGTCO.a(LXQPFGONL;I)V")
	public final void method176(XQPFGONL arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method478();
			if (var3 != 0) {
				arg0.field1335--;
				field491[var2] = new AQBPXQWT();
				field491[var2].method7(arg0);
			}
		}

		field492 = arg0.method480();
		field493 = arg0.method480();
	}

	@ObfuscatedName("CUQKGTCO.a(I)I")
	public final int method177() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (field491[var2] != null && field491[var2].field18 / 20 < var1) {
				var1 = field491[var2].field18 / 20;
			}
		}

		if (field492 < field493 && field492 / 20 < var1) {
			var1 = field492 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; var3++) {
				if (field491[var3] != null) {
					field491[var3].field18 -= var1 * 20;
				}
			}

			if (field492 < field493) {
				field492 -= var1 * 20;
				field493 -= var1 * 20;
			}

			return var1;
		}

		return 0;
	}

	@ObfuscatedName("CUQKGTCO.a(IZ)LXQPFGONL;")
	public final XQPFGONL method178(int arg0) {
		int var2 = method179(arg0);
		field490.field1335 = 0;
		field490.method472(0x52494646);
		field490.method473(var2 + 36);
		field490.method472(0x57415645);
		field490.method472(0x666D7420);
		field490.method473(16);
		field490.method470(1);
		field490.method470(1);
		field490.method473(22050);
		field490.method473(22050);
		field490.method470(1);
		field490.method470(8);
		field490.method472(0x64617461);
		field490.method473(var2);
		field490.field1335 += var2;
		return field490;
	}

	@ObfuscatedName("CUQKGTCO.b(I)I")
	public final int method179(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (field491[var3] != null && field491[var3].field18 + field491[var3].field17 > var2) {
				var2 = field491[var3].field18 + field491[var3].field17;
			}
		}

		if (var2 == 0) {
			return 0;
		}

		int var4 = var2 * 22050 / 1000;
		int var5 = field492 * 22050 / 1000;
		int var6 = field493 * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}

		int var7 = (arg0 - 1) * (var6 - var5) + var4;
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			field489[var8] = -128;
		}

		for (int var9 = 0; var9 < 10; var9++) {
			if (field491[var9] != null) {
				int var10 = field491[var9].field17 * 22050 / 1000;
				int var11 = field491[var9].field18 * 22050 / 1000;
				int[] var12 = field491[var9].method5(var10, field491[var9].field17);
				for (int var13 = 0; var13 < var10; var13++) {
					field489[var11 + var13 + 44] += (byte) (var12[var13] >> 8);
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
				field489[var14 + var15] = field489[var15];
			}

			for (int var16 = 1; var16 < arg0; var16++) {
				int var17 = (var6 - var5) * var16;
				for (int var18 = var5; var18 < var6; var18++) {
					field489[var17 + var18] = field489[var18];
				}
			}

			var7 -= 44;
		}

		return var7;
	}
}
