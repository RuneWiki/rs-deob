package deob;

@ObfuscatedName("TBRIOEDI")
public class TBRIOEDI {

	@ObfuscatedName("TBRIOEDI.n")
	public YXUDALYQ[] field1287 = new YXUDALYQ[10];

	@ObfuscatedName("TBRIOEDI.j")
	public static TBRIOEDI[] field1283 = new TBRIOEDI[5000];

	@ObfuscatedName("TBRIOEDI.k")
	public static int[] field1284 = new int[5000];

	@ObfuscatedName("TBRIOEDI.o")
	public int field1288;

	@ObfuscatedName("TBRIOEDI.p")
	public int field1289;

	@ObfuscatedName("TBRIOEDI.m")
	public static FTMSICIZ field1286;

	@ObfuscatedName("TBRIOEDI.l")
	public static byte[] field1285;

	@ObfuscatedName("TBRIOEDI.a(ZLFTMSICIZ;)V")
	public static final void method462(FTMSICIZ arg0) {
		field1285 = new byte[441000];
		field1286 = new FTMSICIZ(field1285);
		YXUDALYQ.method572();

		while (true) {
			int var1 = arg0.method215();
			if (var1 == 0xFFFF) {
				return;
			}

			field1283[var1] = new TBRIOEDI();
			field1283[var1].method464(arg0);
			field1284[var1] = field1283[var1].method465();
		}
	}

	@ObfuscatedName("TBRIOEDI.a(ZII)LFTMSICIZ;")
	public static final FTMSICIZ method463(int arg0, int arg1) {
		if (field1283[arg0] != null) {
			TBRIOEDI var2 = field1283[arg0];
			return var2.method466(arg1);
		}

		return null;
	}

	@ObfuscatedName("TBRIOEDI.a(LFTMSICIZ;I)V")
	public final void method464(FTMSICIZ arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method213();
			if (var3 != 0) {
				arg0.field535--;
				field1287[var2] = new YXUDALYQ();
				field1287[var2].method575(arg0);
			}
		}

		field1288 = arg0.method215();
		field1289 = arg0.method215();
	}

	@ObfuscatedName("TBRIOEDI.a(I)I")
	public final int method465() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (field1287[var2] != null && field1287[var2].field1467 / 20 < var1) {
				var1 = field1287[var2].field1467 / 20;
			}
		}

		if (field1288 < field1289 && field1288 / 20 < var1) {
			var1 = field1288 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; var3++) {
				if (field1287[var3] != null) {
					field1287[var3].field1467 -= var1 * 20;
				}
			}

			if (field1288 < field1289) {
				field1288 -= var1 * 20;
				field1289 -= var1 * 20;
			}

			return var1;
		}

		return 0;
	}

	@ObfuscatedName("TBRIOEDI.a(II)LFTMSICIZ;")
	public final FTMSICIZ method466(int arg0) {
		int var2 = method467(arg0);
		field1286.field535 = 0;
		field1286.method207(0x52494646);
		field1286.method208(var2 + 36);
		field1286.method207(0x57415645);
		field1286.method207(0x666D7420);
		field1286.method208(16);
		field1286.method205(1);
		field1286.method205(1);
		field1286.method208(22050);
		field1286.method208(22050);
		field1286.method205(1);
		field1286.method205(8);
		field1286.method207(0x64617461);
		field1286.method208(var2);
		field1286.field535 += var2;
		return field1286;
	}

	@ObfuscatedName("TBRIOEDI.b(I)I")
	public final int method467(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (field1287[var3] != null && field1287[var3].field1467 + field1287[var3].field1466 > var2) {
				var2 = field1287[var3].field1467 + field1287[var3].field1466;
			}
		}

		if (var2 == 0) {
			return 0;
		}

		int var4 = var2 * 22050 / 1000;
		int var5 = field1288 * 22050 / 1000;
		int var6 = field1289 * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}

		int var7 = (arg0 - 1) * (var6 - var5) + var4;
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			field1285[var8] = -128;
		}

		for (int var9 = 0; var9 < 10; var9++) {
			if (field1287[var9] != null) {
				int var10 = field1287[var9].field1466 * 22050 / 1000;
				int var11 = field1287[var9].field1467 * 22050 / 1000;
				int[] var12 = field1287[var9].method573(var10, field1287[var9].field1466);
				for (int var13 = 0; var13 < var10; var13++) {
					int var14 = (var12[var13] >> 8) + (field1285[var11 + var13 + 44] & 0xFF);
					if ((var14 & 0xFFFFFF00) != 0) {
						var14 = ~(var14 >> 31);
					}

					field1285[var11 + var13 + 44] = (byte) var14;
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
				field1285[var15 + var16] = field1285[var16];
			}

			for (int var17 = 1; var17 < arg0; var17++) {
				int var18 = (var6 - var5) * var17;
				for (int var19 = var5; var19 < var6; var19++) {
					field1285[var18 + var19] = field1285[var19];
				}
			}

			var7 -= 44;
		}

		return var7;
	}
}
