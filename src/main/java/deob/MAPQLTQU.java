package deob;

@ObfuscatedName("MAPQLTQU")
public class MAPQLTQU {

	@ObfuscatedName("MAPQLTQU.j")
	public UHNEGZAI[] field924 = new UHNEGZAI[10];

	@ObfuscatedName("MAPQLTQU.f")
	public static MAPQLTQU[] field920 = new MAPQLTQU[5000];

	@ObfuscatedName("MAPQLTQU.g")
	public static int[] field921 = new int[5000];

	@ObfuscatedName("MAPQLTQU.k")
	public int field925;

	@ObfuscatedName("MAPQLTQU.l")
	public int field926;

	@ObfuscatedName("MAPQLTQU.i")
	public static DNRIFKTO field923;

	@ObfuscatedName("MAPQLTQU.h")
	public static byte[] field922;

	@ObfuscatedName("MAPQLTQU.a(LDNRIFKTO;I)V")
	public static final void method320(DNRIFKTO arg0) {
		field922 = new byte[441000];
		field923 = new DNRIFKTO(field922);
		UHNEGZAI.method458();

		while (true) {
			int var1 = arg0.method191();
			if (var1 == 0xFFFF) {
				return;
			}

			field920[var1] = new MAPQLTQU();
			field920[var1].method322(arg0);
			field921[var1] = field920[var1].method323();
		}
	}

	@ObfuscatedName("MAPQLTQU.a(BII)LDNRIFKTO;")
	public static final DNRIFKTO method321(int arg0, int arg1) {
		if (field920[arg0] != null) {
			MAPQLTQU var2 = field920[arg0];
			return var2.method324(arg1);
		}

		return null;
	}

	@ObfuscatedName("MAPQLTQU.b(LDNRIFKTO;I)V")
	public final void method322(DNRIFKTO arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method189();
			if (var3 != 0) {
				arg0.field563--;
				field924[var2] = new UHNEGZAI();
				field924[var2].method461(arg0);
			}
		}

		field925 = arg0.method191();
		field926 = arg0.method191();
	}

	@ObfuscatedName("MAPQLTQU.a(I)I")
	public final int method323() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (field924[var2] != null && field924[var2].field1289 / 20 < var1) {
				var1 = field924[var2].field1289 / 20;
			}
		}

		if (field925 < field926 && field925 / 20 < var1) {
			var1 = field925 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; var3++) {
				if (field924[var3] != null) {
					field924[var3].field1289 -= var1 * 20;
				}
			}

			if (field925 < field926) {
				field925 -= var1 * 20;
				field926 -= var1 * 20;
			}

			return var1;
		}

		return 0;
	}

	@ObfuscatedName("MAPQLTQU.a(II)LDNRIFKTO;")
	public final DNRIFKTO method324(int arg0) {
		int var2 = method325(arg0);
		field923.field563 = 0;
		field923.method183(0x52494646);
		field923.method184(var2 + 36);
		field923.method183(0x57415645);
		field923.method183(0x666D7420);
		field923.method184(16);
		field923.method181(1);
		field923.method181(1);
		field923.method184(22050);
		field923.method184(22050);
		field923.method181(1);
		field923.method181(8);
		field923.method183(0x64617461);
		field923.method184(var2);
		field923.field563 += var2;
		return field923;
	}

	@ObfuscatedName("MAPQLTQU.b(I)I")
	public final int method325(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (field924[var3] != null && field924[var3].field1289 + field924[var3].field1288 > var2) {
				var2 = field924[var3].field1289 + field924[var3].field1288;
			}
		}

		if (var2 == 0) {
			return 0;
		}

		int var4 = var2 * 22050 / 1000;
		int var5 = field925 * 22050 / 1000;
		int var6 = field926 * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}

		int var7 = (arg0 - 1) * (var6 - var5) + var4;
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			field922[var8] = -128;
		}

		for (int var9 = 0; var9 < 10; var9++) {
			if (field924[var9] != null) {
				int var10 = field924[var9].field1288 * 22050 / 1000;
				int var11 = field924[var9].field1289 * 22050 / 1000;
				int[] var12 = field924[var9].method459(var10, field924[var9].field1288);
				for (int var13 = 0; var13 < var10; var13++) {
					field922[var11 + var13 + 44] += (byte) (var12[var13] >> 8);
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
				field922[var14 + var15] = field922[var15];
			}

			for (int var16 = 1; var16 < arg0; var16++) {
				int var17 = (var6 - var5) * var16;
				for (int var18 = var5; var18 < var6; var18++) {
					field922[var17 + var18] = field922[var18];
				}
			}

			var7 -= 44;
		}

		return var7;
	}
}
