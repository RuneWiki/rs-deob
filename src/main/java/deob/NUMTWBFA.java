package deob;

@ObfuscatedName("NUMTWBFA")
public class NUMTWBFA {

	@ObfuscatedName("NUMTWBFA.l")
	public UXJRWLQU[] field1027 = new UXJRWLQU[10];

	@ObfuscatedName("NUMTWBFA.h")
	public static NUMTWBFA[] field1023 = new NUMTWBFA[5000];

	@ObfuscatedName("NUMTWBFA.i")
	public static int[] field1024 = new int[5000];

	@ObfuscatedName("NUMTWBFA.m")
	public int field1028;

	@ObfuscatedName("NUMTWBFA.n")
	public int field1029;

	@ObfuscatedName("NUMTWBFA.k")
	public static LBBVYYXO field1026;

	@ObfuscatedName("NUMTWBFA.j")
	public static byte[] field1025;

	@ObfuscatedName("NUMTWBFA.a(LLBBVYYXO;I)V")
	public static final void method432(LBBVYYXO arg0) {
		field1025 = new byte[441000];
		field1026 = new LBBVYYXO(field1025);
		UXJRWLQU.method532();

		while (true) {
			int var1 = arg0.method371();
			if (var1 == 0xFFFF) {
				return;
			}

			field1023[var1] = new NUMTWBFA();
			field1023[var1].method434(arg0);
			field1024[var1] = field1023[var1].method435();
		}
	}

	@ObfuscatedName("NUMTWBFA.a(III)LLBBVYYXO;")
	public static final LBBVYYXO method433(int arg0, int arg1) {
		if (field1023[arg1] != null) {
			NUMTWBFA var2 = field1023[arg1];
			return var2.method436(arg0);
		}

		return null;
	}

	@ObfuscatedName("NUMTWBFA.a(LLBBVYYXO;B)V")
	public final void method434(LBBVYYXO arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method369();
			if (var3 != 0) {
				arg0.field882--;
				field1027[var2] = new UXJRWLQU();
				field1027[var2].method535(arg0);
			}
		}

		field1028 = arg0.method371();
		field1029 = arg0.method371();
	}

	@ObfuscatedName("NUMTWBFA.a(Z)I")
	public final int method435() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (field1027[var2] != null && field1027[var2].field1276 / 20 < var1) {
				var1 = field1027[var2].field1276 / 20;
			}
		}

		if (field1028 < field1029 && field1028 / 20 < var1) {
			var1 = field1028 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; var3++) {
				if (field1027[var3] != null) {
					field1027[var3].field1276 -= var1 * 20;
				}
			}

			if (field1028 < field1029) {
				field1028 -= var1 * 20;
				field1029 -= var1 * 20;
			}

			return var1;
		}

		return 0;
	}

	@ObfuscatedName("NUMTWBFA.a(IZ)LLBBVYYXO;")
	public final LBBVYYXO method436(int arg0) {
		int var2 = method437(arg0);
		field1026.field882 = 0;
		field1026.method363(0x52494646);
		field1026.method364(var2 + 36);
		field1026.method363(0x57415645);
		field1026.method363(0x666D7420);
		field1026.method364(16);
		field1026.method361(1);
		field1026.method361(1);
		field1026.method364(22050);
		field1026.method364(22050);
		field1026.method361(1);
		field1026.method361(8);
		field1026.method363(0x64617461);
		field1026.method364(var2);
		field1026.field882 += var2;
		return field1026;
	}

	@ObfuscatedName("NUMTWBFA.a(I)I")
	public final int method437(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (field1027[var3] != null && field1027[var3].field1276 + field1027[var3].field1275 > var2) {
				var2 = field1027[var3].field1276 + field1027[var3].field1275;
			}
		}

		if (var2 == 0) {
			return 0;
		}

		int var4 = var2 * 22050 / 1000;
		int var5 = field1028 * 22050 / 1000;
		int var6 = field1029 * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}

		int var7 = (arg0 - 1) * (var6 - var5) + var4;
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			field1025[var8] = -128;
		}

		for (int var9 = 0; var9 < 10; var9++) {
			if (field1027[var9] != null) {
				int var10 = field1027[var9].field1275 * 22050 / 1000;
				int var11 = field1027[var9].field1276 * 22050 / 1000;
				int[] var12 = field1027[var9].method533(var10, field1027[var9].field1275);
				for (int var13 = 0; var13 < var10; var13++) {
					field1025[var11 + var13 + 44] += (byte) (var12[var13] >> 8);
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
				field1025[var14 + var15] = field1025[var15];
			}

			for (int var16 = 1; var16 < arg0; var16++) {
				int var17 = (var6 - var5) * var16;
				for (int var18 = var5; var18 < var6; var18++) {
					field1025[var17 + var18] = field1025[var18];
				}
			}

			var7 -= 44;
		}

		return var7;
	}
}
