package deob;

@ObfuscatedName("EJAYDEWE")
public class EJAYDEWE {

	@ObfuscatedName("EJAYDEWE.h")
	public SNQOEFQG[] field576 = new SNQOEFQG[10];

	@ObfuscatedName("EJAYDEWE.d")
	public static EJAYDEWE[] field572 = new EJAYDEWE[5000];

	@ObfuscatedName("EJAYDEWE.e")
	public static int[] field573 = new int[5000];

	@ObfuscatedName("EJAYDEWE.i")
	public int field577;

	@ObfuscatedName("EJAYDEWE.j")
	public int field578;

	@ObfuscatedName("EJAYDEWE.g")
	public static IMUIZRAF field575;

	@ObfuscatedName("EJAYDEWE.f")
	public static byte[] field574;

	@ObfuscatedName("EJAYDEWE.a(LIMUIZRAF;Z)V")
	public static final void method203(IMUIZRAF arg0) {
		field574 = new byte[441000];
		field575 = new IMUIZRAF(field574);
		SNQOEFQG.method458();

		while (true) {
			int var1 = arg0.method240();
			if (var1 == 0xFFFF) {
				return;
			}

			field572[var1] = new EJAYDEWE();
			field572[var1].method205(arg0);
			field573[var1] = field572[var1].method206();
		}
	}

	@ObfuscatedName("EJAYDEWE.a(BII)LIMUIZRAF;")
	public static final IMUIZRAF method204(int arg0, int arg1) {
		if (field572[arg0] != null) {
			EJAYDEWE var2 = field572[arg0];
			return var2.method207(arg1);
		}

		return null;
	}

	@ObfuscatedName("EJAYDEWE.a(ILIMUIZRAF;)V")
	public final void method205(IMUIZRAF arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method238();
			if (var3 != 0) {
				arg0.field714--;
				field576[var2] = new SNQOEFQG();
				field576[var2].method461(arg0);
			}
		}

		field577 = arg0.method240();
		field578 = arg0.method240();
	}

	@ObfuscatedName("EJAYDEWE.a(Z)I")
	public final int method206() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (field576[var2] != null && field576[var2].field1149 / 20 < var1) {
				var1 = field576[var2].field1149 / 20;
			}
		}

		if (field577 < field578 && field577 / 20 < var1) {
			var1 = field577 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; var3++) {
				if (field576[var3] != null) {
					field576[var3].field1149 -= var1 * 20;
				}
			}

			if (field577 < field578) {
				field577 -= var1 * 20;
				field578 -= var1 * 20;
			}

			return var1;
		}

		return 0;
	}

	@ObfuscatedName("EJAYDEWE.a(II)LIMUIZRAF;")
	public final IMUIZRAF method207(int arg0) {
		int var2 = method208(arg0);
		field575.field714 = 0;
		field575.method232(0x52494646);
		field575.method233(var2 + 36);
		field575.method232(0x57415645);
		field575.method232(0x666D7420);
		field575.method233(16);
		field575.method230(1);
		field575.method230(1);
		field575.method233(22050);
		field575.method233(22050);
		field575.method230(1);
		field575.method230(8);
		field575.method232(0x64617461);
		field575.method233(var2);
		field575.field714 += var2;
		return field575;
	}

	@ObfuscatedName("EJAYDEWE.a(I)I")
	public final int method208(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (field576[var3] != null && field576[var3].field1149 + field576[var3].field1148 > var2) {
				var2 = field576[var3].field1149 + field576[var3].field1148;
			}
		}

		if (var2 == 0) {
			return 0;
		}

		int var4 = var2 * 22050 / 1000;
		int var5 = field577 * 22050 / 1000;
		int var6 = field578 * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}

		int var7 = (arg0 - 1) * (var6 - var5) + var4;
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			field574[var8] = -128;
		}

		for (int var9 = 0; var9 < 10; var9++) {
			if (field576[var9] != null) {
				int var10 = field576[var9].field1148 * 22050 / 1000;
				int var11 = field576[var9].field1149 * 22050 / 1000;
				int[] var12 = field576[var9].method459(var10, field576[var9].field1148);
				for (int var13 = 0; var13 < var10; var13++) {
					field574[var11 + var13 + 44] += (byte) (var12[var13] >> 8);
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
				field574[var14 + var15] = field574[var15];
			}

			for (int var16 = 1; var16 < arg0; var16++) {
				int var17 = (var6 - var5) * var16;
				for (int var18 = var5; var18 < var6; var18++) {
					field574[var17 + var18] = field574[var18];
				}
			}

			var7 -= 44;
		}

		return var7;
	}
}
