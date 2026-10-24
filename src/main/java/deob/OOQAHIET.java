package deob;

@ObfuscatedName("OOQAHIET")
public class OOQAHIET {

	@ObfuscatedName("OOQAHIET.h")
	public ILFXQDER[] field938 = new ILFXQDER[10];

	@ObfuscatedName("OOQAHIET.d")
	public static OOQAHIET[] field934 = new OOQAHIET[5000];

	@ObfuscatedName("OOQAHIET.e")
	public static int[] field935 = new int[5000];

	@ObfuscatedName("OOQAHIET.i")
	public int field939;

	@ObfuscatedName("OOQAHIET.j")
	public int field940;

	@ObfuscatedName("OOQAHIET.g")
	public static RSWRPCHR field937;

	@ObfuscatedName("OOQAHIET.f")
	public static byte[] field936;

	@ObfuscatedName("OOQAHIET.a(ZLRSWRPCHR;)V")
	public static final void method328(RSWRPCHR arg0) {
		field936 = new byte[441000];
		field937 = new RSWRPCHR(field936);
		ILFXQDER.method224();

		while (true) {
			int var1 = arg0.method390();
			if (var1 == 0xFFFF) {
				return;
			}

			field934[var1] = new OOQAHIET();
			field934[var1].method330(arg0);
			field935[var1] = field934[var1].method331();
		}
	}

	@ObfuscatedName("OOQAHIET.a(III)LRSWRPCHR;")
	public static final RSWRPCHR method329(int arg0, int arg1) {
		if (field934[arg1] != null) {
			OOQAHIET var2 = field934[arg1];
			return var2.method332(arg0);
		}

		return null;
	}

	@ObfuscatedName("OOQAHIET.a(LRSWRPCHR;B)V")
	public final void method330(RSWRPCHR arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method388();
			if (var3 != 0) {
				arg0.field1038--;
				field938[var2] = new ILFXQDER();
				field938[var2].method227(arg0);
			}
		}

		field939 = arg0.method390();
		field940 = arg0.method390();
	}

	@ObfuscatedName("OOQAHIET.a(B)I")
	public final int method331() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (field938[var2] != null && field938[var2].field761 / 20 < var1) {
				var1 = field938[var2].field761 / 20;
			}
		}

		if (field939 < field940 && field939 / 20 < var1) {
			var1 = field939 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; var3++) {
				if (field938[var3] != null) {
					field938[var3].field761 -= var1 * 20;
				}
			}

			if (field939 < field940) {
				field939 -= var1 * 20;
				field940 -= var1 * 20;
			}

			return var1;
		}

		return 0;
	}

	@ObfuscatedName("OOQAHIET.a(IB)LRSWRPCHR;")
	public final RSWRPCHR method332(int arg0) {
		int var2 = method333(arg0);
		field937.field1038 = 0;
		field937.method382(0x52494646);
		field937.method383(var2 + 36);
		field937.method382(0x57415645);
		field937.method382(0x666D7420);
		field937.method383(16);
		field937.method380(1);
		field937.method380(1);
		field937.method383(22050);
		field937.method383(22050);
		field937.method380(1);
		field937.method380(8);
		field937.method382(0x64617461);
		field937.method383(var2);
		field937.field1038 += var2;
		return field937;
	}

	@ObfuscatedName("OOQAHIET.a(I)I")
	public final int method333(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (field938[var3] != null && field938[var3].field761 + field938[var3].field760 > var2) {
				var2 = field938[var3].field761 + field938[var3].field760;
			}
		}

		if (var2 == 0) {
			return 0;
		}

		int var4 = var2 * 22050 / 1000;
		int var5 = field939 * 22050 / 1000;
		int var6 = field940 * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}

		int var7 = (arg0 - 1) * (var6 - var5) + var4;
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			field936[var8] = -128;
		}

		for (int var9 = 0; var9 < 10; var9++) {
			if (field938[var9] != null) {
				int var10 = field938[var9].field760 * 22050 / 1000;
				int var11 = field938[var9].field761 * 22050 / 1000;
				int[] var12 = field938[var9].method225(var10, field938[var9].field760);
				for (int var13 = 0; var13 < var10; var13++) {
					field936[var11 + var13 + 44] += (byte) (var12[var13] >> 8);
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
				field936[var14 + var15] = field936[var15];
			}

			for (int var16 = 1; var16 < arg0; var16++) {
				int var17 = (var6 - var5) * var16;
				for (int var18 = var5; var18 < var6; var18++) {
					field936[var17 + var18] = field936[var18];
				}
			}

			var7 -= 44;
		}

		return var7;
	}
}
