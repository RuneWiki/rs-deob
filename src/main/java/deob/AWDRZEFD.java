package deob;

@ObfuscatedName("AWDRZEFD")
public class AWDRZEFD {

	@ObfuscatedName("AWDRZEFD.h")
	public KMJDCQND[] field72 = new KMJDCQND[10];

	@ObfuscatedName("AWDRZEFD.d")
	public static AWDRZEFD[] field68 = new AWDRZEFD[5000];

	@ObfuscatedName("AWDRZEFD.e")
	public static int[] field69 = new int[5000];

	@ObfuscatedName("AWDRZEFD.i")
	public int field73;

	@ObfuscatedName("AWDRZEFD.j")
	public int field74;

	@ObfuscatedName("AWDRZEFD.g")
	public static KHOMSBHW field71;

	@ObfuscatedName("AWDRZEFD.f")
	public static byte[] field70;

	@ObfuscatedName("AWDRZEFD.a(ILKHOMSBHW;)V")
	public static final void method8(KHOMSBHW arg0) {
		field70 = new byte[441000];
		field71 = new KHOMSBHW(field70);
		KMJDCQND.method390();

		while (true) {
			int var1 = arg0.method351();
			if (var1 == 0xFFFF) {
				return;
			}

			field68[var1] = new AWDRZEFD();
			field68[var1].method10(arg0);
			field69[var1] = field68[var1].method11();
		}
	}

	@ObfuscatedName("AWDRZEFD.a(III)LKHOMSBHW;")
	public static final KHOMSBHW method9(int arg0, int arg1) {
		if (field68[arg0] != null) {
			AWDRZEFD var2 = field68[arg0];
			return var2.method12(arg1);
		}

		return null;
	}

	@ObfuscatedName("AWDRZEFD.a(LKHOMSBHW;I)V")
	public final void method10(KHOMSBHW arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method349();
			if (var3 != 0) {
				arg0.field934--;
				field72[var2] = new KMJDCQND();
				field72[var2].method393(arg0);
			}
		}

		field73 = arg0.method351();
		field74 = arg0.method351();
	}

	@ObfuscatedName("AWDRZEFD.a(I)I")
	public final int method11() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (field72[var2] != null && field72[var2].field962 / 20 < var1) {
				var1 = field72[var2].field962 / 20;
			}
		}

		if (field73 < field74 && field73 / 20 < var1) {
			var1 = field73 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; var3++) {
				if (field72[var3] != null) {
					field72[var3].field962 -= var1 * 20;
				}
			}

			if (field73 < field74) {
				field73 -= var1 * 20;
				field74 -= var1 * 20;
			}

			return var1;
		}

		return 0;
	}

	@ObfuscatedName("AWDRZEFD.a(II)LKHOMSBHW;")
	public final KHOMSBHW method12(int arg0) {
		int var2 = method13(arg0);
		field71.field934 = 0;
		field71.method343(0x52494646);
		field71.method344(var2 + 36);
		field71.method343(0x57415645);
		field71.method343(0x666D7420);
		field71.method344(16);
		field71.method341(1);
		field71.method341(1);
		field71.method344(22050);
		field71.method344(22050);
		field71.method341(1);
		field71.method341(8);
		field71.method343(0x64617461);
		field71.method344(var2);
		field71.field934 += var2;
		return field71;
	}

	@ObfuscatedName("AWDRZEFD.b(I)I")
	public final int method13(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (field72[var3] != null && field72[var3].field962 + field72[var3].field961 > var2) {
				var2 = field72[var3].field962 + field72[var3].field961;
			}
		}

		if (var2 == 0) {
			return 0;
		}

		int var4 = var2 * 22050 / 1000;
		int var5 = field73 * 22050 / 1000;
		int var6 = field74 * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}

		int var7 = (arg0 - 1) * (var6 - var5) + var4;
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			field70[var8] = -128;
		}

		for (int var9 = 0; var9 < 10; var9++) {
			if (field72[var9] != null) {
				int var10 = field72[var9].field961 * 22050 / 1000;
				int var11 = field72[var9].field962 * 22050 / 1000;
				int[] var12 = field72[var9].method391(var10, field72[var9].field961);
				for (int var13 = 0; var13 < var10; var13++) {
					field70[var11 + var13 + 44] += (byte) (var12[var13] >> 8);
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
				field70[var14 + var15] = field70[var15];
			}

			for (int var16 = 1; var16 < arg0; var16++) {
				int var17 = (var6 - var5) * var16;
				for (int var18 = var5; var18 < var6; var18++) {
					field70[var17 + var18] = field70[var18];
				}
			}

			var7 -= 44;
		}

		return var7;
	}
}
