package deob;

@ObfuscatedName("ADSZDTIC")
public class ADSZDTIC {

	@ObfuscatedName("ADSZDTIC.j")
	public GCVPDIUI[] field12 = new GCVPDIUI[10];

	@ObfuscatedName("ADSZDTIC.f")
	public static ADSZDTIC[] field8 = new ADSZDTIC[5000];

	@ObfuscatedName("ADSZDTIC.g")
	public static int[] field9 = new int[5000];

	@ObfuscatedName("ADSZDTIC.k")
	public int field13;

	@ObfuscatedName("ADSZDTIC.l")
	public int field14;

	@ObfuscatedName("ADSZDTIC.i")
	public static CMGGUSPR field11;

	@ObfuscatedName("ADSZDTIC.h")
	public static byte[] field10;

	@ObfuscatedName("ADSZDTIC.a(ILCMGGUSPR;)V")
	public static final void method9(CMGGUSPR arg0) {
		field10 = new byte[441000];
		field11 = new CMGGUSPR(field10);
		GCVPDIUI.method286();

		while (true) {
			int var1 = arg0.method196();
			if (var1 == 0xFFFF) {
				return;
			}

			field8[var1] = new ADSZDTIC();
			field8[var1].method11(arg0);
			field9[var1] = field8[var1].method12();
		}
	}

	@ObfuscatedName("ADSZDTIC.a(III)LCMGGUSPR;")
	public static final CMGGUSPR method10(int arg0, int arg1) {
		if (field8[arg0] != null) {
			ADSZDTIC var2 = field8[arg0];
			return var2.method13(arg1);
		}

		return null;
	}

	@ObfuscatedName("ADSZDTIC.a(LCMGGUSPR;I)V")
	public final void method11(CMGGUSPR arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method194();
			if (var3 != 0) {
				arg0.field540--;
				field12[var2] = new GCVPDIUI();
				field12[var2].method289(arg0);
			}
		}

		field13 = arg0.method196();
		field14 = arg0.method196();
	}

	@ObfuscatedName("ADSZDTIC.a(I)I")
	public final int method12() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (field12[var2] != null && field12[var2].field675 / 20 < var1) {
				var1 = field12[var2].field675 / 20;
			}
		}

		if (field13 < field14 && field13 / 20 < var1) {
			var1 = field13 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; var3++) {
				if (field12[var3] != null) {
					field12[var3].field675 -= var1 * 20;
				}
			}

			if (field13 < field14) {
				field13 -= var1 * 20;
				field14 -= var1 * 20;
			}

			return var1;
		}

		return 0;
	}

	@ObfuscatedName("ADSZDTIC.a(II)LCMGGUSPR;")
	public final CMGGUSPR method13(int arg0) {
		int var2 = method14(arg0);
		field11.field540 = 0;
		field11.method188(0x52494646);
		field11.method189(var2 + 36);
		field11.method188(0x57415645);
		field11.method188(0x666D7420);
		field11.method189(16);
		field11.method186(1);
		field11.method186(1);
		field11.method189(22050);
		field11.method189(22050);
		field11.method186(1);
		field11.method186(8);
		field11.method188(0x64617461);
		field11.method189(var2);
		field11.field540 += var2;
		return field11;
	}

	@ObfuscatedName("ADSZDTIC.b(I)I")
	public final int method14(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (field12[var3] != null && field12[var3].field675 + field12[var3].field674 > var2) {
				var2 = field12[var3].field675 + field12[var3].field674;
			}
		}

		if (var2 == 0) {
			return 0;
		}

		int var4 = var2 * 22050 / 1000;
		int var5 = field13 * 22050 / 1000;
		int var6 = field14 * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}

		int var7 = (arg0 - 1) * (var6 - var5) + var4;
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			field10[var8] = -128;
		}

		for (int var9 = 0; var9 < 10; var9++) {
			if (field12[var9] != null) {
				int var10 = field12[var9].field674 * 22050 / 1000;
				int var11 = field12[var9].field675 * 22050 / 1000;
				int[] var12 = field12[var9].method287(var10, field12[var9].field674);
				for (int var13 = 0; var13 < var10; var13++) {
					field10[var11 + var13 + 44] += (byte) (var12[var13] >> 8);
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
				field10[var14 + var15] = field10[var15];
			}

			for (int var16 = 1; var16 < arg0; var16++) {
				int var17 = (var6 - var5) * var16;
				for (int var18 = var5; var18 < var6; var18++) {
					field10[var17 + var18] = field10[var18];
				}
			}

			var7 -= 44;
		}

		return var7;
	}
}
