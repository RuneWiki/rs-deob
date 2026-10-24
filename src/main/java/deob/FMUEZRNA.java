package deob;

@ObfuscatedName("FMUEZRNA")
public class FMUEZRNA {

	@ObfuscatedName("FMUEZRNA.h")
	public XPILULJC[] field753 = new XPILULJC[10];

	@ObfuscatedName("FMUEZRNA.d")
	public static FMUEZRNA[] field749 = new FMUEZRNA[5000];

	@ObfuscatedName("FMUEZRNA.e")
	public static int[] field750 = new int[5000];

	@ObfuscatedName("FMUEZRNA.i")
	public int field754;

	@ObfuscatedName("FMUEZRNA.j")
	public int field755;

	@ObfuscatedName("FMUEZRNA.g")
	public static INLHDAGO field752;

	@ObfuscatedName("FMUEZRNA.f")
	public static byte[] field751;

	@ObfuscatedName("FMUEZRNA.a(LINLHDAGO;Z)V")
	public static final void method263(INLHDAGO arg0) {
		field751 = new byte[441000];
		field752 = new INLHDAGO(field751);
		XPILULJC.method522();

		while (true) {
			int var1 = arg0.method310();
			if (var1 == 0xFFFF) {
				return;
			}

			field749[var1] = new FMUEZRNA();
			field749[var1].method265(arg0);
			field750[var1] = field749[var1].method266();
		}
	}

	@ObfuscatedName("FMUEZRNA.a(III)LINLHDAGO;")
	public static final INLHDAGO method264(int arg0, int arg1) {
		if (field749[arg1] != null) {
			FMUEZRNA var2 = field749[arg1];
			return var2.method267(arg0);
		}

		return null;
	}

	@ObfuscatedName("FMUEZRNA.a(ILINLHDAGO;)V")
	public final void method265(INLHDAGO arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method308();
			if (var3 != 0) {
				arg0.field969--;
				field753[var2] = new XPILULJC();
				field753[var2].method525(arg0);
			}
		}

		field754 = arg0.method310();
		field755 = arg0.method310();
	}

	@ObfuscatedName("FMUEZRNA.a(Z)I")
	public final int method266() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (field753[var2] != null && field753[var2].field1383 / 20 < var1) {
				var1 = field753[var2].field1383 / 20;
			}
		}

		if (field754 < field755 && field754 / 20 < var1) {
			var1 = field754 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; var3++) {
				if (field753[var3] != null) {
					field753[var3].field1383 -= var1 * 20;
				}
			}

			if (field754 < field755) {
				field754 -= var1 * 20;
				field755 -= var1 * 20;
			}

			return var1;
		}

		return 0;
	}

	@ObfuscatedName("FMUEZRNA.a(IZ)LINLHDAGO;")
	public final INLHDAGO method267(int arg0) {
		int var2 = method268(arg0);
		field752.field969 = 0;
		field752.method302(0x52494646);
		field752.method303(var2 + 36);
		field752.method302(0x57415645);
		field752.method302(0x666D7420);
		field752.method303(16);
		field752.method300(1);
		field752.method300(1);
		field752.method303(22050);
		field752.method303(22050);
		field752.method300(1);
		field752.method300(8);
		field752.method302(0x64617461);
		field752.method303(var2);
		field752.field969 += var2;
		return field752;
	}

	@ObfuscatedName("FMUEZRNA.a(I)I")
	public final int method268(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (field753[var3] != null && field753[var3].field1383 + field753[var3].field1382 > var2) {
				var2 = field753[var3].field1383 + field753[var3].field1382;
			}
		}

		if (var2 == 0) {
			return 0;
		}

		int var4 = var2 * 22050 / 1000;
		int var5 = field754 * 22050 / 1000;
		int var6 = field755 * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}

		int var7 = (arg0 - 1) * (var6 - var5) + var4;
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			field751[var8] = -128;
		}

		for (int var9 = 0; var9 < 10; var9++) {
			if (field753[var9] != null) {
				int var10 = field753[var9].field1382 * 22050 / 1000;
				int var11 = field753[var9].field1383 * 22050 / 1000;
				int[] var12 = field753[var9].method523(var10, field753[var9].field1382);
				for (int var13 = 0; var13 < var10; var13++) {
					field751[var11 + var13 + 44] += (byte) (var12[var13] >> 8);
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
				field751[var14 + var15] = field751[var15];
			}

			for (int var16 = 1; var16 < arg0; var16++) {
				int var17 = (var6 - var5) * var16;
				for (int var18 = var5; var18 < var6; var18++) {
					field751[var17 + var18] = field751[var18];
				}
			}

			var7 -= 44;
		}

		return var7;
	}
}
