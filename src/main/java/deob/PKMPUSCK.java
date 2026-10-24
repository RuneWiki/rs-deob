package deob;

@ObfuscatedName("PKMPUSCK")
public class PKMPUSCK {

	@ObfuscatedName("PKMPUSCK.i")
	public UFAEFFVJ[] field1115 = new UFAEFFVJ[10];

	@ObfuscatedName("PKMPUSCK.e")
	public static PKMPUSCK[] field1111 = new PKMPUSCK[5000];

	@ObfuscatedName("PKMPUSCK.f")
	public static int[] field1112 = new int[5000];

	@ObfuscatedName("PKMPUSCK.j")
	public int field1116;

	@ObfuscatedName("PKMPUSCK.k")
	public int field1117;

	@ObfuscatedName("PKMPUSCK.h")
	public static CKBTFRZM field1114;

	@ObfuscatedName("PKMPUSCK.g")
	public static byte[] field1113;

	@ObfuscatedName("PKMPUSCK.a(ZLCKBTFRZM;)V")
	public static final void method482(CKBTFRZM arg0) {
		field1113 = new byte[441000];
		field1114 = new CKBTFRZM(field1113);
		UFAEFFVJ.method502();

		while (true) {
			int var1 = arg0.method46();
			if (var1 == 0xFFFF) {
				return;
			}

			field1111[var1] = new PKMPUSCK();
			field1111[var1].method484(arg0);
			field1112[var1] = field1111[var1].method485();
		}
	}

	@ObfuscatedName("PKMPUSCK.a(IZI)LCKBTFRZM;")
	public static final CKBTFRZM method483(int arg0, int arg1) {
		if (field1111[arg1] != null) {
			PKMPUSCK var2 = field1111[arg1];
			return var2.method486(arg0);
		}

		return null;
	}

	@ObfuscatedName("PKMPUSCK.a(BLCKBTFRZM;)V")
	public final void method484(CKBTFRZM arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method44();
			if (var3 != 0) {
				arg0.field92--;
				field1115[var2] = new UFAEFFVJ();
				field1115[var2].method505(arg0);
			}
		}

		field1116 = arg0.method46();
		field1117 = arg0.method46();
	}

	@ObfuscatedName("PKMPUSCK.a(B)I")
	public final int method485() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (field1115[var2] != null && field1115[var2].field1213 / 20 < var1) {
				var1 = field1115[var2].field1213 / 20;
			}
		}

		if (field1116 < field1117 && field1116 / 20 < var1) {
			var1 = field1116 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; var3++) {
				if (field1115[var3] != null) {
					field1115[var3].field1213 -= var1 * 20;
				}
			}

			if (field1116 < field1117) {
				field1116 -= var1 * 20;
				field1117 -= var1 * 20;
			}

			return var1;
		}

		return 0;
	}

	@ObfuscatedName("PKMPUSCK.a(BI)LCKBTFRZM;")
	public final CKBTFRZM method486(int arg0) {
		int var2 = method487(arg0);
		field1114.field92 = 0;
		field1114.method38(0x52494646);
		field1114.method39(var2 + 36);
		field1114.method38(0x57415645);
		field1114.method38(0x666D7420);
		field1114.method39(16);
		field1114.method36(1);
		field1114.method36(1);
		field1114.method39(22050);
		field1114.method39(22050);
		field1114.method36(1);
		field1114.method36(8);
		field1114.method38(0x64617461);
		field1114.method39(var2);
		field1114.field92 += var2;
		return field1114;
	}

	@ObfuscatedName("PKMPUSCK.a(I)I")
	public final int method487(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (field1115[var3] != null && field1115[var3].field1213 + field1115[var3].field1212 > var2) {
				var2 = field1115[var3].field1213 + field1115[var3].field1212;
			}
		}

		if (var2 == 0) {
			return 0;
		}

		int var4 = var2 * 22050 / 1000;
		int var5 = field1116 * 22050 / 1000;
		int var6 = field1117 * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}

		int var7 = (arg0 - 1) * (var6 - var5) + var4;
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			field1113[var8] = -128;
		}

		for (int var9 = 0; var9 < 10; var9++) {
			if (field1115[var9] != null) {
				int var10 = field1115[var9].field1212 * 22050 / 1000;
				int var11 = field1115[var9].field1213 * 22050 / 1000;
				int[] var12 = field1115[var9].method503(var10, field1115[var9].field1212);
				for (int var13 = 0; var13 < var10; var13++) {
					field1113[var11 + var13 + 44] += (byte) (var12[var13] >> 8);
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
				field1113[var14 + var15] = field1113[var15];
			}

			for (int var16 = 1; var16 < arg0; var16++) {
				int var17 = (var6 - var5) * var16;
				for (int var18 = var5; var18 < var6; var18++) {
					field1113[var17 + var18] = field1113[var18];
				}
			}

			var7 -= 44;
		}

		return var7;
	}
}
