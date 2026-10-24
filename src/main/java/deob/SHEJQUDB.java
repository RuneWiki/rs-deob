package deob;

@ObfuscatedName("SHEJQUDB")
public class SHEJQUDB {

	@ObfuscatedName("SHEJQUDB.h")
	public KWOZHDOE[] field1228 = new KWOZHDOE[10];

	@ObfuscatedName("SHEJQUDB.d")
	public static SHEJQUDB[] field1224 = new SHEJQUDB[5000];

	@ObfuscatedName("SHEJQUDB.e")
	public static int[] field1225 = new int[5000];

	@ObfuscatedName("SHEJQUDB.i")
	public int field1229;

	@ObfuscatedName("SHEJQUDB.j")
	public int field1230;

	@ObfuscatedName("SHEJQUDB.g")
	public static PGNBHFUF field1227;

	@ObfuscatedName("SHEJQUDB.f")
	public static byte[] field1226;

	@ObfuscatedName("SHEJQUDB.a(ILPGNBHFUF;)V")
	public static final void method496(PGNBHFUF arg0) {
		field1226 = new byte[441000];
		field1227 = new PGNBHFUF(field1226);
		KWOZHDOE.method373();

		while (true) {
			int var1 = arg0.method422();
			if (var1 == 0xFFFF) {
				return;
			}

			field1224[var1] = new SHEJQUDB();
			field1224[var1].method498(arg0);
			field1225[var1] = field1224[var1].method499();
		}
	}

	@ObfuscatedName("SHEJQUDB.a(III)LPGNBHFUF;")
	public static final PGNBHFUF method497(int arg0, int arg1) {
		if (field1224[arg0] != null) {
			SHEJQUDB var2 = field1224[arg0];
			return var2.method500(arg1);
		}

		return null;
	}

	@ObfuscatedName("SHEJQUDB.a(LPGNBHFUF;I)V")
	public final void method498(PGNBHFUF arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method420();
			if (var3 != 0) {
				arg0.field1082--;
				field1228[var2] = new KWOZHDOE();
				field1228[var2].method376(arg0);
			}
		}

		field1229 = arg0.method422();
		field1230 = arg0.method422();
	}

	@ObfuscatedName("SHEJQUDB.a(I)I")
	public final int method499() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (field1228[var2] != null && field1228[var2].field928 / 20 < var1) {
				var1 = field1228[var2].field928 / 20;
			}
		}

		if (field1229 < field1230 && field1229 / 20 < var1) {
			var1 = field1229 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; var3++) {
				if (field1228[var3] != null) {
					field1228[var3].field928 -= var1 * 20;
				}
			}

			if (field1229 < field1230) {
				field1229 -= var1 * 20;
				field1230 -= var1 * 20;
			}

			return var1;
		}

		return 0;
	}

	@ObfuscatedName("SHEJQUDB.a(IZ)LPGNBHFUF;")
	public final PGNBHFUF method500(int arg0) {
		int var2 = method501(arg0);
		field1227.field1082 = 0;
		field1227.method414(0x52494646);
		field1227.method415(var2 + 36);
		field1227.method414(0x57415645);
		field1227.method414(0x666D7420);
		field1227.method415(16);
		field1227.method412(1);
		field1227.method412(1);
		field1227.method415(22050);
		field1227.method415(22050);
		field1227.method412(1);
		field1227.method412(8);
		field1227.method414(0x64617461);
		field1227.method415(var2);
		field1227.field1082 += var2;
		return field1227;
	}

	@ObfuscatedName("SHEJQUDB.b(I)I")
	public final int method501(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (field1228[var3] != null && field1228[var3].field928 + field1228[var3].field927 > var2) {
				var2 = field1228[var3].field928 + field1228[var3].field927;
			}
		}

		if (var2 == 0) {
			return 0;
		}

		int var4 = var2 * 22050 / 1000;
		int var5 = field1229 * 22050 / 1000;
		int var6 = field1230 * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}

		int var7 = (arg0 - 1) * (var6 - var5) + var4;
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			field1226[var8] = -128;
		}

		for (int var9 = 0; var9 < 10; var9++) {
			if (field1228[var9] != null) {
				int var10 = field1228[var9].field927 * 22050 / 1000;
				int var11 = field1228[var9].field928 * 22050 / 1000;
				int[] var12 = field1228[var9].method374(var10, field1228[var9].field927);
				for (int var13 = 0; var13 < var10; var13++) {
					field1226[var11 + var13 + 44] += (byte) (var12[var13] >> 8);
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
				field1226[var14 + var15] = field1226[var15];
			}

			for (int var16 = 1; var16 < arg0; var16++) {
				int var17 = (var6 - var5) * var16;
				for (int var18 = var5; var18 < var6; var18++) {
					field1226[var17 + var18] = field1226[var18];
				}
			}

			var7 -= 44;
		}

		return var7;
	}
}
