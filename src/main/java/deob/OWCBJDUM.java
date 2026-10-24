package deob;

@ObfuscatedName("OWCBJDUM")
public class OWCBJDUM {

	@ObfuscatedName("OWCBJDUM.i")
	public LQCMEXCE[] field1139 = new LQCMEXCE[10];

	@ObfuscatedName("OWCBJDUM.e")
	public static OWCBJDUM[] field1135 = new OWCBJDUM[5000];

	@ObfuscatedName("OWCBJDUM.f")
	public static int[] field1136 = new int[5000];

	@ObfuscatedName("OWCBJDUM.j")
	public int field1140;

	@ObfuscatedName("OWCBJDUM.k")
	public int field1141;

	@ObfuscatedName("OWCBJDUM.h")
	public static XGRGMPUQ field1138;

	@ObfuscatedName("OWCBJDUM.g")
	public static byte[] field1137;

	@ObfuscatedName("OWCBJDUM.a(ZLXGRGMPUQ;)V")
	public static final void method328(XGRGMPUQ arg0) {
		field1137 = new byte[441000];
		field1138 = new XGRGMPUQ(field1137);
		LQCMEXCE.method310();

		while (true) {
			int var1 = arg0.method467();
			if (var1 == 0xFFFF) {
				return;
			}

			field1135[var1] = new OWCBJDUM();
			field1135[var1].method330(arg0);
			field1136[var1] = field1135[var1].method331();
		}
	}

	@ObfuscatedName("OWCBJDUM.a(III)LXGRGMPUQ;")
	public static final XGRGMPUQ method329(int arg0, int arg1) {
		if (field1135[arg1] != null) {
			OWCBJDUM var2 = field1135[arg1];
			return var2.method332(arg0);
		}

		return null;
	}

	@ObfuscatedName("OWCBJDUM.b(ZLXGRGMPUQ;)V")
	public final void method330(XGRGMPUQ arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method465();
			if (var3 != 0) {
				arg0.field1432--;
				field1139[var2] = new LQCMEXCE();
				field1139[var2].method313(arg0);
			}
		}

		field1140 = arg0.method467();
		field1141 = arg0.method467();
	}

	@ObfuscatedName("OWCBJDUM.a(I)I")
	public final int method331() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (field1139[var2] != null && field1139[var2].field989 / 20 < var1) {
				var1 = field1139[var2].field989 / 20;
			}
		}

		if (field1140 < field1141 && field1140 / 20 < var1) {
			var1 = field1140 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; var3++) {
				if (field1139[var3] != null) {
					field1139[var3].field989 -= var1 * 20;
				}
			}

			if (field1140 < field1141) {
				field1140 -= var1 * 20;
				field1141 -= var1 * 20;
			}

			return var1;
		}

		return 0;
	}

	@ObfuscatedName("OWCBJDUM.a(II)LXGRGMPUQ;")
	public final XGRGMPUQ method332(int arg0) {
		int var2 = method333(arg0);
		field1138.field1432 = 0;
		field1138.method459(0x52494646);
		field1138.method460(var2 + 36);
		field1138.method459(0x57415645);
		field1138.method459(0x666D7420);
		field1138.method460(16);
		field1138.method457(1);
		field1138.method457(1);
		field1138.method460(22050);
		field1138.method460(22050);
		field1138.method457(1);
		field1138.method457(8);
		field1138.method459(0x64617461);
		field1138.method460(var2);
		field1138.field1432 += var2;
		return field1138;
	}

	@ObfuscatedName("OWCBJDUM.b(I)I")
	public final int method333(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (field1139[var3] != null && field1139[var3].field989 + field1139[var3].field988 > var2) {
				var2 = field1139[var3].field989 + field1139[var3].field988;
			}
		}

		if (var2 == 0) {
			return 0;
		}

		int var4 = var2 * 22050 / 1000;
		int var5 = field1140 * 22050 / 1000;
		int var6 = field1141 * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}

		int var7 = (arg0 - 1) * (var6 - var5) + var4;
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			field1137[var8] = -128;
		}

		for (int var9 = 0; var9 < 10; var9++) {
			if (field1139[var9] != null) {
				int var10 = field1139[var9].field988 * 22050 / 1000;
				int var11 = field1139[var9].field989 * 22050 / 1000;
				int[] var12 = field1139[var9].method311(var10, field1139[var9].field988);
				for (int var13 = 0; var13 < var10; var13++) {
					field1137[var11 + var13 + 44] += (byte) (var12[var13] >> 8);
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
				field1137[var14 + var15] = field1137[var15];
			}

			for (int var16 = 1; var16 < arg0; var16++) {
				int var17 = (var6 - var5) * var16;
				for (int var18 = var5; var18 < var6; var18++) {
					field1137[var17 + var18] = field1137[var18];
				}
			}

			var7 -= 44;
		}

		return var7;
	}
}
