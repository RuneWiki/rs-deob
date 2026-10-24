package deob;

@ObfuscatedName("VSVAEWAC")
public class VSVAEWAC {

	@ObfuscatedName("VSVAEWAC.h")
	public GJBKSAZL[] field1370 = new GJBKSAZL[10];

	@ObfuscatedName("VSVAEWAC.d")
	public static VSVAEWAC[] field1366 = new VSVAEWAC[5000];

	@ObfuscatedName("VSVAEWAC.e")
	public static int[] field1367 = new int[5000];

	@ObfuscatedName("VSVAEWAC.i")
	public int field1371;

	@ObfuscatedName("VSVAEWAC.j")
	public int field1372;

	@ObfuscatedName("VSVAEWAC.g")
	public static CFARFRSG field1369;

	@ObfuscatedName("VSVAEWAC.f")
	public static byte[] field1368;

	@ObfuscatedName("VSVAEWAC.a(LCFARFRSG;I)V")
	public static final void method571(CFARFRSG arg0) {
		field1368 = new byte[441000];
		field1369 = new CFARFRSG(field1368);
		GJBKSAZL.method296();

		while (true) {
			int var1 = arg0.method32();
			if (var1 == 0xFFFF) {
				return;
			}

			field1366[var1] = new VSVAEWAC();
			field1366[var1].method573(arg0);
			field1367[var1] = field1366[var1].method574();
		}
	}

	@ObfuscatedName("VSVAEWAC.a(III)LCFARFRSG;")
	public static final CFARFRSG method572(int arg0, int arg1) {
		if (field1366[arg0] != null) {
			VSVAEWAC var2 = field1366[arg0];
			return var2.method575(arg1);
		}

		return null;
	}

	@ObfuscatedName("VSVAEWAC.b(LCFARFRSG;I)V")
	public final void method573(CFARFRSG arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method30();
			if (var3 != 0) {
				arg0.field44--;
				field1370[var2] = new GJBKSAZL();
				field1370[var2].method299(arg0);
			}
		}

		field1371 = arg0.method32();
		field1372 = arg0.method32();
	}

	@ObfuscatedName("VSVAEWAC.a(Z)I")
	public final int method574() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (field1370[var2] != null && field1370[var2].field651 / 20 < var1) {
				var1 = field1370[var2].field651 / 20;
			}
		}

		if (field1371 < field1372 && field1371 / 20 < var1) {
			var1 = field1371 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; var3++) {
				if (field1370[var3] != null) {
					field1370[var3].field651 -= var1 * 20;
				}
			}

			if (field1371 < field1372) {
				field1371 -= var1 * 20;
				field1372 -= var1 * 20;
			}

			return var1;
		}

		return 0;
	}

	@ObfuscatedName("VSVAEWAC.a(II)LCFARFRSG;")
	public final CFARFRSG method575(int arg0) {
		int var2 = method576(arg0);
		field1369.field44 = 0;
		field1369.method24(0x52494646);
		field1369.method25(var2 + 36);
		field1369.method24(0x57415645);
		field1369.method24(0x666D7420);
		field1369.method25(16);
		field1369.method22(1);
		field1369.method22(1);
		field1369.method25(22050);
		field1369.method25(22050);
		field1369.method22(1);
		field1369.method22(8);
		field1369.method24(0x64617461);
		field1369.method25(var2);
		field1369.field44 += var2;
		return field1369;
	}

	@ObfuscatedName("VSVAEWAC.a(I)I")
	public final int method576(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (field1370[var3] != null && field1370[var3].field651 + field1370[var3].field650 > var2) {
				var2 = field1370[var3].field651 + field1370[var3].field650;
			}
		}

		if (var2 == 0) {
			return 0;
		}

		int var4 = var2 * 22050 / 1000;
		int var5 = field1371 * 22050 / 1000;
		int var6 = field1372 * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}

		int var7 = (arg0 - 1) * (var6 - var5) + var4;
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			field1368[var8] = -128;
		}

		for (int var9 = 0; var9 < 10; var9++) {
			if (field1370[var9] != null) {
				int var10 = field1370[var9].field650 * 22050 / 1000;
				int var11 = field1370[var9].field651 * 22050 / 1000;
				int[] var12 = field1370[var9].method297(var10, field1370[var9].field650);
				for (int var13 = 0; var13 < var10; var13++) {
					field1368[var11 + var13 + 44] += (byte) (var12[var13] >> 8);
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
				field1368[var14 + var15] = field1368[var15];
			}

			for (int var16 = 1; var16 < arg0; var16++) {
				int var17 = (var6 - var5) * var16;
				for (int var18 = var5; var18 < var6; var18++) {
					field1368[var17 + var18] = field1368[var18];
				}
			}

			var7 -= 44;
		}

		return var7;
	}
}
