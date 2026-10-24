package deob;

@ObfuscatedName("LOEGFAGM")
public class LOEGFAGM {

	@ObfuscatedName("LOEGFAGM.i")
	public VCSQFXER[] field909 = new VCSQFXER[10];

	@ObfuscatedName("LOEGFAGM.e")
	public static LOEGFAGM[] field905 = new LOEGFAGM[5000];

	@ObfuscatedName("LOEGFAGM.f")
	public static int[] field906 = new int[5000];

	@ObfuscatedName("LOEGFAGM.j")
	public int field910;

	@ObfuscatedName("LOEGFAGM.k")
	public int field911;

	@ObfuscatedName("LOEGFAGM.h")
	public static BFQIDHPO field908;

	@ObfuscatedName("LOEGFAGM.g")
	public static byte[] field907;

	@ObfuscatedName("LOEGFAGM.a(ZLBFQIDHPO;)V")
	public static final void method338(BFQIDHPO arg0) {
		field907 = new byte[441000];
		field908 = new BFQIDHPO(field907);
		VCSQFXER.method521();

		while (true) {
			int var1 = arg0.method56();
			if (var1 == 0xFFFF) {
				return;
			}

			field905[var1] = new LOEGFAGM();
			field905[var1].method340(arg0);
			field906[var1] = field905[var1].method341();
		}
	}

	@ObfuscatedName("LOEGFAGM.a(III)LBFQIDHPO;")
	public static final BFQIDHPO method339(int arg0, int arg1) {
		if (field905[arg1] != null) {
			LOEGFAGM var2 = field905[arg1];
			return var2.method342(arg0);
		}

		return null;
	}

	@ObfuscatedName("LOEGFAGM.a(BLBFQIDHPO;)V")
	public final void method340(BFQIDHPO arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method54();
			if (var3 != 0) {
				arg0.field10--;
				field909[var2] = new VCSQFXER();
				field909[var2].method524(arg0);
			}
		}

		field910 = arg0.method56();
		field911 = arg0.method56();
	}

	@ObfuscatedName("LOEGFAGM.a(Z)I")
	public final int method341() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (field909[var2] != null && field909[var2].field1298 / 20 < var1) {
				var1 = field909[var2].field1298 / 20;
			}
		}

		if (field910 < field911 && field910 / 20 < var1) {
			var1 = field910 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; var3++) {
				if (field909[var3] != null) {
					field909[var3].field1298 -= var1 * 20;
				}
			}

			if (field910 < field911) {
				field910 -= var1 * 20;
				field911 -= var1 * 20;
			}

			return var1;
		}

		return 0;
	}

	@ObfuscatedName("LOEGFAGM.a(ZI)LBFQIDHPO;")
	public final BFQIDHPO method342(int arg0) {
		int var2 = method343(arg0);
		field908.field10 = 0;
		field908.method48(0x52494646);
		field908.method49(var2 + 36);
		field908.method48(0x57415645);
		field908.method48(0x666D7420);
		field908.method49(16);
		field908.method46(1);
		field908.method46(1);
		field908.method49(22050);
		field908.method49(22050);
		field908.method46(1);
		field908.method46(8);
		field908.method48(0x64617461);
		field908.method49(var2);
		field908.field10 += var2;
		return field908;
	}

	@ObfuscatedName("LOEGFAGM.a(I)I")
	public final int method343(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (field909[var3] != null && field909[var3].field1298 + field909[var3].field1297 > var2) {
				var2 = field909[var3].field1298 + field909[var3].field1297;
			}
		}

		if (var2 == 0) {
			return 0;
		}

		int var4 = var2 * 22050 / 1000;
		int var5 = field910 * 22050 / 1000;
		int var6 = field911 * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}

		int var7 = (arg0 - 1) * (var6 - var5) + var4;
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			field907[var8] = -128;
		}

		for (int var9 = 0; var9 < 10; var9++) {
			if (field909[var9] != null) {
				int var10 = field909[var9].field1297 * 22050 / 1000;
				int var11 = field909[var9].field1298 * 22050 / 1000;
				int[] var12 = field909[var9].method522(var10, field909[var9].field1297);
				for (int var13 = 0; var13 < var10; var13++) {
					int var14 = (var12[var13] >> 8) + (field907[var11 + var13 + 44] & 0xFF);
					if ((var14 & 0xFFFFFF00) != 0) {
						var14 = ~(var14 >> 31);
					}

					field907[var11 + var13 + 44] = (byte) var14;
				}
			}
		}

		if (arg0 > 1) {
			var5 += 44;
			var6 += 44;
			var4 += 44;
			var7 += 44;
			int var15 = var7 - var4;
			for (int var16 = var4 - 1; var16 >= var6; var16--) {
				field907[var15 + var16] = field907[var16];
			}

			for (int var17 = 1; var17 < arg0; var17++) {
				int var18 = (var6 - var5) * var17;
				for (int var19 = var5; var19 < var6; var19++) {
					field907[var18 + var19] = field907[var19];
				}
			}

			var7 -= 44;
		}

		return var7;
	}
}
