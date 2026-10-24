package deob;

@ObfuscatedName("SHTECHVG")
public class SHTECHVG {

	@ObfuscatedName("SHTECHVG.j")
	public DWRVLVYL[] field1230 = new DWRVLVYL[10];

	@ObfuscatedName("SHTECHVG.f")
	public static SHTECHVG[] field1226 = new SHTECHVG[5000];

	@ObfuscatedName("SHTECHVG.g")
	public static int[] field1227 = new int[5000];

	@ObfuscatedName("SHTECHVG.k")
	public int field1231;

	@ObfuscatedName("SHTECHVG.l")
	public int field1232;

	@ObfuscatedName("SHTECHVG.i")
	public static TKPFKOXP field1229;

	@ObfuscatedName("SHTECHVG.h")
	public static byte[] field1228;

	@ObfuscatedName("SHTECHVG.a(BLTKPFKOXP;)V")
	public static final void method476(TKPFKOXP arg0) {
		field1228 = new byte[441000];
		field1229 = new TKPFKOXP(field1228);
		DWRVLVYL.method188();

		while (true) {
			int var1 = arg0.method531();
			if (var1 == 0xFFFF) {
				return;
			}

			field1226[var1] = new SHTECHVG();
			field1226[var1].method478(arg0);
			field1227[var1] = field1226[var1].method479();
		}
	}

	@ObfuscatedName("SHTECHVG.a(IIZ)LTKPFKOXP;")
	public static final TKPFKOXP method477(int arg0, int arg1) {
		if (field1226[arg1] != null) {
			SHTECHVG var2 = field1226[arg1];
			return var2.method480(arg0);
		}

		return null;
	}

	@ObfuscatedName("SHTECHVG.a(LTKPFKOXP;B)V")
	public final void method478(TKPFKOXP arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method529();
			if (var3 != 0) {
				arg0.field1382--;
				field1230[var2] = new DWRVLVYL();
				field1230[var2].method191(arg0);
			}
		}

		field1231 = arg0.method531();
		field1232 = arg0.method531();
	}

	@ObfuscatedName("SHTECHVG.a(I)I")
	public final int method479() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (field1230[var2] != null && field1230[var2].field646 / 20 < var1) {
				var1 = field1230[var2].field646 / 20;
			}
		}

		if (field1231 < field1232 && field1231 / 20 < var1) {
			var1 = field1231 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; var3++) {
				if (field1230[var3] != null) {
					field1230[var3].field646 -= var1 * 20;
				}
			}

			if (field1231 < field1232) {
				field1231 -= var1 * 20;
				field1232 -= var1 * 20;
			}

			return var1;
		}

		return 0;
	}

	@ObfuscatedName("SHTECHVG.a(IZ)LTKPFKOXP;")
	public final TKPFKOXP method480(int arg0) {
		int var2 = method481(arg0);
		field1229.field1382 = 0;
		field1229.method523(0x52494646);
		field1229.method524(var2 + 36);
		field1229.method523(0x57415645);
		field1229.method523(0x666D7420);
		field1229.method524(16);
		field1229.method521(1);
		field1229.method521(1);
		field1229.method524(22050);
		field1229.method524(22050);
		field1229.method521(1);
		field1229.method521(8);
		field1229.method523(0x64617461);
		field1229.method524(var2);
		field1229.field1382 += var2;
		return field1229;
	}

	@ObfuscatedName("SHTECHVG.b(I)I")
	public final int method481(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (field1230[var3] != null && field1230[var3].field646 + field1230[var3].field645 > var2) {
				var2 = field1230[var3].field646 + field1230[var3].field645;
			}
		}

		if (var2 == 0) {
			return 0;
		}

		int var4 = var2 * 22050 / 1000;
		int var5 = field1231 * 22050 / 1000;
		int var6 = field1232 * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}

		int var7 = (arg0 - 1) * (var6 - var5) + var4;
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			field1228[var8] = -128;
		}

		for (int var9 = 0; var9 < 10; var9++) {
			if (field1230[var9] != null) {
				int var10 = field1230[var9].field645 * 22050 / 1000;
				int var11 = field1230[var9].field646 * 22050 / 1000;
				int[] var12 = field1230[var9].method189(var10, field1230[var9].field645);
				for (int var13 = 0; var13 < var10; var13++) {
					field1228[var11 + var13 + 44] += (byte) (var12[var13] >> 8);
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
				field1228[var14 + var15] = field1228[var15];
			}

			for (int var16 = 1; var16 < arg0; var16++) {
				int var17 = (var6 - var5) * var16;
				for (int var18 = var5; var18 < var6; var18++) {
					field1228[var17 + var18] = field1228[var18];
				}
			}

			var7 -= 44;
		}

		return var7;
	}
}
