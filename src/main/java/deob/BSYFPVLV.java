package deob;

@ObfuscatedName("BSYFPVLV")
public class BSYFPVLV {

	@ObfuscatedName("BSYFPVLV.h")
	public RLHOXRLU[] field8 = new RLHOXRLU[10];

	@ObfuscatedName("BSYFPVLV.d")
	public static BSYFPVLV[] field4 = new BSYFPVLV[5000];

	@ObfuscatedName("BSYFPVLV.e")
	public static int[] field5 = new int[5000];

	@ObfuscatedName("BSYFPVLV.j")
	public int field10;

	@ObfuscatedName("BSYFPVLV.i")
	public int field9;

	@ObfuscatedName("BSYFPVLV.g")
	public static MLYYHULT field7;

	@ObfuscatedName("BSYFPVLV.f")
	public static byte[] field6;

	@ObfuscatedName("BSYFPVLV.a(LMLYYHULT;B)V")
	public static final void method1(MLYYHULT arg0) {
		field6 = new byte[441000];
		field7 = new MLYYHULT(field6);
		RLHOXRLU.method441();

		while (true) {
			int var1 = arg0.method298();
			if (var1 == 0xFFFF) {
				return;
			}

			field4[var1] = new BSYFPVLV();
			field4[var1].method3(arg0);
			field5[var1] = field4[var1].method4();
		}
	}

	@ObfuscatedName("BSYFPVLV.a(BII)LMLYYHULT;")
	public static final MLYYHULT method2(int arg0, int arg1) {
		if (field4[arg1] != null) {
			BSYFPVLV var2 = field4[arg1];
			return var2.method5(arg0);
		}

		return null;
	}

	@ObfuscatedName("BSYFPVLV.b(LMLYYHULT;B)V")
	public final void method3(MLYYHULT arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method296();
			if (var3 != 0) {
				arg0.field963--;
				field8[var2] = new RLHOXRLU();
				field8[var2].method444(arg0);
			}
		}

		field9 = arg0.method298();
		field10 = arg0.method298();
	}

	@ObfuscatedName("BSYFPVLV.a(I)I")
	public final int method4() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (field8[var2] != null && field8[var2].field1195 / 20 < var1) {
				var1 = field8[var2].field1195 / 20;
			}
		}

		if (field9 < field10 && field9 / 20 < var1) {
			var1 = field9 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; var3++) {
				if (field8[var3] != null) {
					field8[var3].field1195 -= var1 * 20;
				}
			}

			if (field9 < field10) {
				field9 -= var1 * 20;
				field10 -= var1 * 20;
			}

			return var1;
		}

		return 0;
	}

	@ObfuscatedName("BSYFPVLV.a(II)LMLYYHULT;")
	public final MLYYHULT method5(int arg0) {
		int var2 = method6(arg0);
		field7.field963 = 0;
		field7.method290(0x52494646);
		field7.method291(var2 + 36);
		field7.method290(0x57415645);
		field7.method290(0x666D7420);
		field7.method291(16);
		field7.method288(1);
		field7.method288(1);
		field7.method291(22050);
		field7.method291(22050);
		field7.method288(1);
		field7.method288(8);
		field7.method290(0x64617461);
		field7.method291(var2);
		field7.field963 += var2;
		return field7;
	}

	@ObfuscatedName("BSYFPVLV.b(I)I")
	public final int method6(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (field8[var3] != null && field8[var3].field1195 + field8[var3].field1194 > var2) {
				var2 = field8[var3].field1195 + field8[var3].field1194;
			}
		}

		if (var2 == 0) {
			return 0;
		}

		int var4 = var2 * 22050 / 1000;
		int var5 = field9 * 22050 / 1000;
		int var6 = field10 * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}

		int var7 = (arg0 - 1) * (var6 - var5) + var4;
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			field6[var8] = -128;
		}

		for (int var9 = 0; var9 < 10; var9++) {
			if (field8[var9] != null) {
				int var10 = field8[var9].field1194 * 22050 / 1000;
				int var11 = field8[var9].field1195 * 22050 / 1000;
				int[] var12 = field8[var9].method442(var10, field8[var9].field1194);
				for (int var13 = 0; var13 < var10; var13++) {
					field6[var11 + var13 + 44] += (byte) (var12[var13] >> 8);
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
				field6[var14 + var15] = field6[var15];
			}

			for (int var16 = 1; var16 < arg0; var16++) {
				int var17 = (var6 - var5) * var16;
				for (int var18 = var5; var18 < var6; var18++) {
					field6[var17 + var18] = field6[var18];
				}
			}

			var7 -= 44;
		}

		return var7;
	}
}
