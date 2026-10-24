package deob;

@ObfuscatedName("VYSYBHPS")
public class VYSYBHPS {

	@ObfuscatedName("VYSYBHPS.h")
	public UFBSEXDM[] field1359 = new UFBSEXDM[10];

	@ObfuscatedName("VYSYBHPS.d")
	public static VYSYBHPS[] field1355 = new VYSYBHPS[5000];

	@ObfuscatedName("VYSYBHPS.e")
	public static int[] field1356 = new int[5000];

	@ObfuscatedName("VYSYBHPS.i")
	public int field1360;

	@ObfuscatedName("VYSYBHPS.j")
	public int field1361;

	@ObfuscatedName("VYSYBHPS.g")
	public static GHHPHSRU field1358;

	@ObfuscatedName("VYSYBHPS.f")
	public static byte[] field1357;

	@ObfuscatedName("VYSYBHPS.a(LGHHPHSRU;I)V")
	public static final void method527(GHHPHSRU arg0) {
		field1357 = new byte[441000];
		field1358 = new GHHPHSRU(field1357);
		UFBSEXDM.method495();

		while (true) {
			int var1 = arg0.method204();
			if (var1 == 0xFFFF) {
				return;
			}

			field1355[var1] = new VYSYBHPS();
			field1355[var1].method529(arg0);
			field1356[var1] = field1355[var1].method530();
		}
	}

	@ObfuscatedName("VYSYBHPS.a(III)LGHHPHSRU;")
	public static final GHHPHSRU method528(int arg0, int arg1) {
		if (field1355[arg1] != null) {
			VYSYBHPS var2 = field1355[arg1];
			return var2.method531(arg0);
		}

		return null;
	}

	@ObfuscatedName("VYSYBHPS.b(LGHHPHSRU;I)V")
	public final void method529(GHHPHSRU arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method202();
			if (var3 != 0) {
				arg0.field667--;
				field1359[var2] = new UFBSEXDM();
				field1359[var2].method498(arg0);
			}
		}

		field1360 = arg0.method204();
		field1361 = arg0.method204();
	}

	@ObfuscatedName("VYSYBHPS.a(I)I")
	public final int method530() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (field1359[var2] != null && field1359[var2].field1300 / 20 < var1) {
				var1 = field1359[var2].field1300 / 20;
			}
		}

		if (field1360 < field1361 && field1360 / 20 < var1) {
			var1 = field1360 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; var3++) {
				if (field1359[var3] != null) {
					field1359[var3].field1300 -= var1 * 20;
				}
			}

			if (field1360 < field1361) {
				field1360 -= var1 * 20;
				field1361 -= var1 * 20;
			}

			return var1;
		}

		return 0;
	}

	@ObfuscatedName("VYSYBHPS.a(IZ)LGHHPHSRU;")
	public final GHHPHSRU method531(int arg0) {
		int var2 = method532(arg0);
		field1358.field667 = 0;
		field1358.method196(0x52494646);
		field1358.method197(var2 + 36);
		field1358.method196(0x57415645);
		field1358.method196(0x666D7420);
		field1358.method197(16);
		field1358.method194(1);
		field1358.method194(1);
		field1358.method197(22050);
		field1358.method197(22050);
		field1358.method194(1);
		field1358.method194(8);
		field1358.method196(0x64617461);
		field1358.method197(var2);
		field1358.field667 += var2;
		return field1358;
	}

	@ObfuscatedName("VYSYBHPS.b(I)I")
	public final int method532(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (field1359[var3] != null && field1359[var3].field1300 + field1359[var3].field1299 > var2) {
				var2 = field1359[var3].field1300 + field1359[var3].field1299;
			}
		}

		if (var2 == 0) {
			return 0;
		}

		int var4 = var2 * 22050 / 1000;
		int var5 = field1360 * 22050 / 1000;
		int var6 = field1361 * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}

		int var7 = (arg0 - 1) * (var6 - var5) + var4;
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			field1357[var8] = -128;
		}

		for (int var9 = 0; var9 < 10; var9++) {
			if (field1359[var9] != null) {
				int var10 = field1359[var9].field1299 * 22050 / 1000;
				int var11 = field1359[var9].field1300 * 22050 / 1000;
				int[] var12 = field1359[var9].method496(var10, field1359[var9].field1299);
				for (int var13 = 0; var13 < var10; var13++) {
					field1357[var11 + var13 + 44] += (byte) (var12[var13] >> 8);
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
				field1357[var14 + var15] = field1357[var15];
			}

			for (int var16 = 1; var16 < arg0; var16++) {
				int var17 = (var6 - var5) * var16;
				for (int var18 = var5; var18 < var6; var18++) {
					field1357[var17 + var18] = field1357[var18];
				}
			}

			var7 -= 44;
		}

		return var7;
	}
}
