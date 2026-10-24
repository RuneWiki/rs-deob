package deob;

@ObfuscatedName("QJLULATA")
public class QJLULATA {

	@ObfuscatedName("QJLULATA.h")
	public KEVJJMXF[] field1263 = new KEVJJMXF[10];

	@ObfuscatedName("QJLULATA.d")
	public static QJLULATA[] field1259 = new QJLULATA[5000];

	@ObfuscatedName("QJLULATA.e")
	public static int[] field1260 = new int[5000];

	@ObfuscatedName("QJLULATA.i")
	public int field1264;

	@ObfuscatedName("QJLULATA.j")
	public int field1265;

	@ObfuscatedName("QJLULATA.g")
	public static IUVBENCV field1262;

	@ObfuscatedName("QJLULATA.f")
	public static byte[] field1261;

	@ObfuscatedName("QJLULATA.a(LIUVBENCV;I)V")
	public static final void method446(IUVBENCV arg0) {
		field1261 = new byte[441000];
		field1262 = new IUVBENCV(field1261);
		KEVJJMXF.method327();

		while (true) {
			int var1 = arg0.method247();
			if (var1 == 0xFFFF) {
				return;
			}

			field1259[var1] = new QJLULATA();
			field1259[var1].method448(arg0);
			field1260[var1] = field1259[var1].method449();
		}
	}

	@ObfuscatedName("QJLULATA.a(III)LIUVBENCV;")
	public static final IUVBENCV method447(int arg0, int arg1) {
		if (field1259[arg1] != null) {
			QJLULATA var2 = field1259[arg1];
			return var2.method450(arg0);
		}

		return null;
	}

	@ObfuscatedName("QJLULATA.a(LIUVBENCV;B)V")
	public final void method448(IUVBENCV arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method245();
			if (var3 != 0) {
				arg0.field733--;
				field1263[var2] = new KEVJJMXF();
				field1263[var2].method330(arg0);
			}
		}

		field1264 = arg0.method247();
		field1265 = arg0.method247();
	}

	@ObfuscatedName("QJLULATA.a(I)I")
	public final int method449() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (field1263[var2] != null && field1263[var2].field897 / 20 < var1) {
				var1 = field1263[var2].field897 / 20;
			}
		}

		if (field1264 < field1265 && field1264 / 20 < var1) {
			var1 = field1264 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; var3++) {
				if (field1263[var3] != null) {
					field1263[var3].field897 -= var1 * 20;
				}
			}

			if (field1264 < field1265) {
				field1264 -= var1 * 20;
				field1265 -= var1 * 20;
			}

			return var1;
		}

		return 0;
	}

	@ObfuscatedName("QJLULATA.a(IB)LIUVBENCV;")
	public final IUVBENCV method450(int arg0) {
		int var2 = method451(arg0);
		field1262.field733 = 0;
		field1262.method239(0x52494646);
		field1262.method240(var2 + 36);
		field1262.method239(0x57415645);
		field1262.method239(0x666D7420);
		field1262.method240(16);
		field1262.method237(1);
		field1262.method237(1);
		field1262.method240(22050);
		field1262.method240(22050);
		field1262.method237(1);
		field1262.method237(8);
		field1262.method239(0x64617461);
		field1262.method240(var2);
		field1262.field733 += var2;
		return field1262;
	}

	@ObfuscatedName("QJLULATA.b(I)I")
	public final int method451(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (field1263[var3] != null && field1263[var3].field897 + field1263[var3].field896 > var2) {
				var2 = field1263[var3].field897 + field1263[var3].field896;
			}
		}

		if (var2 == 0) {
			return 0;
		}

		int var4 = var2 * 22050 / 1000;
		int var5 = field1264 * 22050 / 1000;
		int var6 = field1265 * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}

		int var7 = (arg0 - 1) * (var6 - var5) + var4;
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			field1261[var8] = -128;
		}

		for (int var9 = 0; var9 < 10; var9++) {
			if (field1263[var9] != null) {
				int var10 = field1263[var9].field896 * 22050 / 1000;
				int var11 = field1263[var9].field897 * 22050 / 1000;
				int[] var12 = field1263[var9].method328(var10, field1263[var9].field896);
				for (int var13 = 0; var13 < var10; var13++) {
					int var14 = (var12[var13] >> 8) + (field1261[var11 + var13 + 44] & 0xFF);
					if ((var14 & 0xFFFFFF00) != 0) {
						var14 = ~(var14 >> 31);
					}

					field1261[var11 + var13 + 44] = (byte) var14;
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
				field1261[var15 + var16] = field1261[var16];
			}

			for (int var17 = 1; var17 < arg0; var17++) {
				int var18 = (var6 - var5) * var17;
				for (int var19 = var5; var19 < var6; var19++) {
					field1261[var18 + var19] = field1261[var19];
				}
			}

			var7 -= 44;
		}

		return var7;
	}
}
