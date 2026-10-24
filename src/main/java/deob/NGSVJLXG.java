package deob;

@ObfuscatedName("NGSVJLXG")
public class NGSVJLXG {

	@ObfuscatedName("NGSVJLXG.h")
	public DZFLZLPS[] field949 = new DZFLZLPS[10];

	@ObfuscatedName("NGSVJLXG.d")
	public static NGSVJLXG[] field945 = new NGSVJLXG[5000];

	@ObfuscatedName("NGSVJLXG.e")
	public static int[] field946 = new int[5000];

	@ObfuscatedName("NGSVJLXG.i")
	public int field950;

	@ObfuscatedName("NGSVJLXG.j")
	public int field951;

	@ObfuscatedName("NGSVJLXG.g")
	public static PKHWFJLM field948;

	@ObfuscatedName("NGSVJLXG.f")
	public static byte[] field947;

	@ObfuscatedName("NGSVJLXG.a(ILPKHWFJLM;)V")
	public static final void method306(PKHWFJLM arg0) {
		field947 = new byte[441000];
		field948 = new PKHWFJLM(field947);
		DZFLZLPS.method217();

		while (true) {
			int var1 = arg0.method332();
			if (var1 == 0xFFFF) {
				return;
			}

			field945[var1] = new NGSVJLXG();
			field945[var1].method308(arg0);
			field946[var1] = field945[var1].method309();
		}
	}

	@ObfuscatedName("NGSVJLXG.a(IZI)LPKHWFJLM;")
	public static final PKHWFJLM method307(int arg0, int arg1) {
		if (field945[arg1] != null) {
			NGSVJLXG var2 = field945[arg1];
			return var2.method310(arg0);
		}

		return null;
	}

	@ObfuscatedName("NGSVJLXG.a(LPKHWFJLM;Z)V")
	public final void method308(PKHWFJLM arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method330();
			if (var3 != 0) {
				arg0.field971--;
				field949[var2] = new DZFLZLPS();
				field949[var2].method220(arg0);
			}
		}

		field950 = arg0.method332();
		field951 = arg0.method332();
	}

	@ObfuscatedName("NGSVJLXG.a(I)I")
	public final int method309() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (field949[var2] != null && field949[var2].field618 / 20 < var1) {
				var1 = field949[var2].field618 / 20;
			}
		}

		if (field950 < field951 && field950 / 20 < var1) {
			var1 = field950 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; var3++) {
				if (field949[var3] != null) {
					field949[var3].field618 -= var1 * 20;
				}
			}

			if (field950 < field951) {
				field950 -= var1 * 20;
				field951 -= var1 * 20;
			}

			return var1;
		}

		return 0;
	}

	@ObfuscatedName("NGSVJLXG.a(II)LPKHWFJLM;")
	public final PKHWFJLM method310(int arg0) {
		int var2 = method311(arg0);
		field948.field971 = 0;
		field948.method324(0x52494646);
		field948.method325(var2 + 36);
		field948.method324(0x57415645);
		field948.method324(0x666D7420);
		field948.method325(16);
		field948.method322(1);
		field948.method322(1);
		field948.method325(22050);
		field948.method325(22050);
		field948.method322(1);
		field948.method322(8);
		field948.method324(0x64617461);
		field948.method325(var2);
		field948.field971 += var2;
		return field948;
	}

	@ObfuscatedName("NGSVJLXG.b(I)I")
	public final int method311(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (field949[var3] != null && field949[var3].field618 + field949[var3].field617 > var2) {
				var2 = field949[var3].field618 + field949[var3].field617;
			}
		}

		if (var2 == 0) {
			return 0;
		}

		int var4 = var2 * 22050 / 1000;
		int var5 = field950 * 22050 / 1000;
		int var6 = field951 * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}

		int var7 = (arg0 - 1) * (var6 - var5) + var4;
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			field947[var8] = -128;
		}

		for (int var9 = 0; var9 < 10; var9++) {
			if (field949[var9] != null) {
				int var10 = field949[var9].field617 * 22050 / 1000;
				int var11 = field949[var9].field618 * 22050 / 1000;
				int[] var12 = field949[var9].method218(var10, field949[var9].field617);
				for (int var13 = 0; var13 < var10; var13++) {
					field947[var11 + var13 + 44] += (byte) (var12[var13] >> 8);
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
				field947[var14 + var15] = field947[var15];
			}

			for (int var16 = 1; var16 < arg0; var16++) {
				int var17 = (var6 - var5) * var16;
				for (int var18 = var5; var18 < var6; var18++) {
					field947[var17 + var18] = field947[var18];
				}
			}

			var7 -= 44;
		}

		return var7;
	}
}
