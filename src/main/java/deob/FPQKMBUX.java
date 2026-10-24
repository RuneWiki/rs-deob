package deob;

@ObfuscatedName("FPQKMBUX")
public class FPQKMBUX {

	@ObfuscatedName("FPQKMBUX.i")
	public LLJZJXBB[] field626 = new LLJZJXBB[10];

	@ObfuscatedName("FPQKMBUX.e")
	public static FPQKMBUX[] field622 = new FPQKMBUX[5000];

	@ObfuscatedName("FPQKMBUX.f")
	public static int[] field623 = new int[5000];

	@ObfuscatedName("FPQKMBUX.j")
	public int field627;

	@ObfuscatedName("FPQKMBUX.k")
	public int field628;

	@ObfuscatedName("FPQKMBUX.h")
	public static EGCCHUZS field625;

	@ObfuscatedName("FPQKMBUX.g")
	public static byte[] field624;

	@ObfuscatedName("FPQKMBUX.a(ILEGCCHUZS;)V")
	public static final void method307(EGCCHUZS arg0) {
		field624 = new byte[441000];
		field625 = new EGCCHUZS(field624);
		LLJZJXBB.method465();

		while (true) {
			int var1 = arg0.method263();
			if (var1 == 0xFFFF) {
				return;
			}

			field622[var1] = new FPQKMBUX();
			field622[var1].method309(arg0);
			field623[var1] = field622[var1].method310();
		}
	}

	@ObfuscatedName("FPQKMBUX.a(III)LEGCCHUZS;")
	public static final EGCCHUZS method308(int arg0, int arg1) {
		if (field622[arg0] != null) {
			FPQKMBUX var2 = field622[arg0];
			return var2.method311(arg1);
		}

		return null;
	}

	@ObfuscatedName("FPQKMBUX.a(LEGCCHUZS;Z)V")
	public final void method309(EGCCHUZS arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method261();
			if (var3 != 0) {
				arg0.field589--;
				field626[var2] = new LLJZJXBB();
				field626[var2].method468(arg0);
			}
		}

		field627 = arg0.method263();
		field628 = arg0.method263();
	}

	@ObfuscatedName("FPQKMBUX.a(I)I")
	public final int method310() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (field626[var2] != null && field626[var2].field972 / 20 < var1) {
				var1 = field626[var2].field972 / 20;
			}
		}

		if (field627 < field628 && field627 / 20 < var1) {
			var1 = field627 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; var3++) {
				if (field626[var3] != null) {
					field626[var3].field972 -= var1 * 20;
				}
			}

			if (field627 < field628) {
				field627 -= var1 * 20;
				field628 -= var1 * 20;
			}

			return var1;
		}

		return 0;
	}

	@ObfuscatedName("FPQKMBUX.a(II)LEGCCHUZS;")
	public final EGCCHUZS method311(int arg0) {
		int var2 = method312(arg0);
		field625.field589 = 0;
		field625.method255(0x52494646);
		field625.method256(var2 + 36);
		field625.method255(0x57415645);
		field625.method255(0x666D7420);
		field625.method256(16);
		field625.method253(1);
		field625.method253(1);
		field625.method256(22050);
		field625.method256(22050);
		field625.method253(1);
		field625.method253(8);
		field625.method255(0x64617461);
		field625.method256(var2);
		field625.field589 += var2;
		return field625;
	}

	@ObfuscatedName("FPQKMBUX.b(I)I")
	public final int method312(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (field626[var3] != null && field626[var3].field972 + field626[var3].field971 > var2) {
				var2 = field626[var3].field972 + field626[var3].field971;
			}
		}

		if (var2 == 0) {
			return 0;
		}

		int var4 = var2 * 22050 / 1000;
		int var5 = field627 * 22050 / 1000;
		int var6 = field628 * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}

		int var7 = (arg0 - 1) * (var6 - var5) + var4;
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			field624[var8] = -128;
		}

		for (int var9 = 0; var9 < 10; var9++) {
			if (field626[var9] != null) {
				int var10 = field626[var9].field971 * 22050 / 1000;
				int var11 = field626[var9].field972 * 22050 / 1000;
				int[] var12 = field626[var9].method466(var10, field626[var9].field971);
				for (int var13 = 0; var13 < var10; var13++) {
					field624[var11 + var13 + 44] += (byte) (var12[var13] >> 8);
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
				field624[var14 + var15] = field624[var15];
			}

			for (int var16 = 1; var16 < arg0; var16++) {
				int var17 = (var6 - var5) * var16;
				for (int var18 = var5; var18 < var6; var18++) {
					field624[var17 + var18] = field624[var18];
				}
			}

			var7 -= 44;
		}

		return var7;
	}
}
