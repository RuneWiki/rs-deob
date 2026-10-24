package deob;

@ObfuscatedName("MDGCJDZI")
public class MDGCJDZI {

	@ObfuscatedName("MDGCJDZI.i")
	public FMKSNCAT[] field874 = new FMKSNCAT[10];

	@ObfuscatedName("MDGCJDZI.e")
	public static MDGCJDZI[] field870 = new MDGCJDZI[5000];

	@ObfuscatedName("MDGCJDZI.f")
	public static int[] field871 = new int[5000];

	@ObfuscatedName("MDGCJDZI.j")
	public int field875;

	@ObfuscatedName("MDGCJDZI.k")
	public int field876;

	@ObfuscatedName("MDGCJDZI.h")
	public static NQUAUMDT field873;

	@ObfuscatedName("MDGCJDZI.g")
	public static byte[] field872;

	@ObfuscatedName("MDGCJDZI.a(LNQUAUMDT;I)V")
	public static final void method258(NQUAUMDT arg0) {
		field872 = new byte[441000];
		field873 = new NQUAUMDT(field872);
		FMKSNCAT.method193();

		while (true) {
			int var1 = arg0.method341();
			if (var1 == 0xFFFF) {
				return;
			}

			field870[var1] = new MDGCJDZI();
			field870[var1].method260(arg0);
			field871[var1] = field870[var1].method261();
		}
	}

	@ObfuscatedName("MDGCJDZI.a(IIZ)LNQUAUMDT;")
	public static final NQUAUMDT method259(int arg0, int arg1) {
		if (field870[arg0] != null) {
			MDGCJDZI var2 = field870[arg0];
			return var2.method262(arg1);
		}

		return null;
	}

	@ObfuscatedName("MDGCJDZI.a(BLNQUAUMDT;)V")
	public final void method260(NQUAUMDT arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method339();
			if (var3 != 0) {
				arg0.field929--;
				field874[var2] = new FMKSNCAT();
				field874[var2].method196(arg0);
			}
		}

		field875 = arg0.method341();
		field876 = arg0.method341();
	}

	@ObfuscatedName("MDGCJDZI.a(I)I")
	public final int method261() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (field874[var2] != null && field874[var2].field613 / 20 < var1) {
				var1 = field874[var2].field613 / 20;
			}
		}

		if (field875 < field876 && field875 / 20 < var1) {
			var1 = field875 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; var3++) {
				if (field874[var3] != null) {
					field874[var3].field613 -= var1 * 20;
				}
			}

			if (field875 < field876) {
				field875 -= var1 * 20;
				field876 -= var1 * 20;
			}

			return var1;
		}

		return 0;
	}

	@ObfuscatedName("MDGCJDZI.a(BI)LNQUAUMDT;")
	public final NQUAUMDT method262(int arg0) {
		int var2 = method263(arg0);
		field873.field929 = 0;
		field873.method333(0x52494646);
		field873.method334(var2 + 36);
		field873.method333(0x57415645);
		field873.method333(0x666D7420);
		field873.method334(16);
		field873.method331(1);
		field873.method331(1);
		field873.method334(22050);
		field873.method334(22050);
		field873.method331(1);
		field873.method331(8);
		field873.method333(0x64617461);
		field873.method334(var2);
		field873.field929 += var2;
		return field873;
	}

	@ObfuscatedName("MDGCJDZI.b(I)I")
	public final int method263(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (field874[var3] != null && field874[var3].field613 + field874[var3].field612 > var2) {
				var2 = field874[var3].field613 + field874[var3].field612;
			}
		}

		if (var2 == 0) {
			return 0;
		}

		int var4 = var2 * 22050 / 1000;
		int var5 = field875 * 22050 / 1000;
		int var6 = field876 * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}

		int var7 = (arg0 - 1) * (var6 - var5) + var4;
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			field872[var8] = -128;
		}

		for (int var9 = 0; var9 < 10; var9++) {
			if (field874[var9] != null) {
				int var10 = field874[var9].field612 * 22050 / 1000;
				int var11 = field874[var9].field613 * 22050 / 1000;
				int[] var12 = field874[var9].method194(var10, field874[var9].field612);
				for (int var13 = 0; var13 < var10; var13++) {
					field872[var11 + var13 + 44] += (byte) (var12[var13] >> 8);
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
				field872[var14 + var15] = field872[var15];
			}

			for (int var16 = 1; var16 < arg0; var16++) {
				int var17 = (var6 - var5) * var16;
				for (int var18 = var5; var18 < var6; var18++) {
					field872[var17 + var18] = field872[var18];
				}
			}

			var7 -= 44;
		}

		return var7;
	}
}
