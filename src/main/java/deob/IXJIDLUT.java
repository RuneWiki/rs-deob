package deob;

@ObfuscatedName("IXJIDLUT")
public class IXJIDLUT {

	@ObfuscatedName("IXJIDLUT.k")
	public JUIUBOIF[] field750 = new JUIUBOIF[10];

	@ObfuscatedName("IXJIDLUT.g")
	public static IXJIDLUT[] field746 = new IXJIDLUT[5000];

	@ObfuscatedName("IXJIDLUT.h")
	public static int[] field747 = new int[5000];

	@ObfuscatedName("IXJIDLUT.l")
	public int field751;

	@ObfuscatedName("IXJIDLUT.m")
	public int field752;

	@ObfuscatedName("IXJIDLUT.j")
	public static XJCNBMKS field749;

	@ObfuscatedName("IXJIDLUT.i")
	public static byte[] field748;

	@ObfuscatedName("IXJIDLUT.a(ILXJCNBMKS;)V")
	public static final void method291(XJCNBMKS arg0) {
		field748 = new byte[441000];
		field749 = new XJCNBMKS(field748);
		JUIUBOIF.method301();

		while (true) {
			int var1 = arg0.method536();
			if (var1 == 0xFFFF) {
				return;
			}

			field746[var1] = new IXJIDLUT();
			field746[var1].method293(arg0);
			field747[var1] = field746[var1].method294();
		}
	}

	@ObfuscatedName("IXJIDLUT.a(III)LXJCNBMKS;")
	public static final XJCNBMKS method292(int arg0, int arg1) {
		if (field746[arg0] != null) {
			IXJIDLUT var2 = field746[arg0];
			return var2.method295(arg1);
		}

		return null;
	}

	@ObfuscatedName("IXJIDLUT.a(BLXJCNBMKS;)V")
	public final void method293(XJCNBMKS arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method534();
			if (var3 != 0) {
				arg0.field1403--;
				field750[var2] = new JUIUBOIF();
				field750[var2].method304(arg0);
			}
		}

		field751 = arg0.method536();
		field752 = arg0.method536();
	}

	@ObfuscatedName("IXJIDLUT.a(I)I")
	public final int method294() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (field750[var2] != null && field750[var2].field791 / 20 < var1) {
				var1 = field750[var2].field791 / 20;
			}
		}

		if (field751 < field752 && field751 / 20 < var1) {
			var1 = field751 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; var3++) {
				if (field750[var3] != null) {
					field750[var3].field791 -= var1 * 20;
				}
			}

			if (field751 < field752) {
				field751 -= var1 * 20;
				field752 -= var1 * 20;
			}

			return var1;
		}

		return 0;
	}

	@ObfuscatedName("IXJIDLUT.a(II)LXJCNBMKS;")
	public final XJCNBMKS method295(int arg0) {
		int var2 = method296(arg0);
		field749.field1403 = 0;
		field749.method528(0x52494646);
		field749.method529(var2 + 36);
		field749.method528(0x57415645);
		field749.method528(0x666D7420);
		field749.method529(16);
		field749.method526(1);
		field749.method526(1);
		field749.method529(22050);
		field749.method529(22050);
		field749.method526(1);
		field749.method526(8);
		field749.method528(0x64617461);
		field749.method529(var2);
		field749.field1403 += var2;
		return field749;
	}

	@ObfuscatedName("IXJIDLUT.b(I)I")
	public final int method296(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (field750[var3] != null && field750[var3].field791 + field750[var3].field790 > var2) {
				var2 = field750[var3].field791 + field750[var3].field790;
			}
		}

		if (var2 == 0) {
			return 0;
		}

		int var4 = var2 * 22050 / 1000;
		int var5 = field751 * 22050 / 1000;
		int var6 = field752 * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}

		int var7 = (arg0 - 1) * (var6 - var5) + var4;
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			field748[var8] = -128;
		}

		for (int var9 = 0; var9 < 10; var9++) {
			if (field750[var9] != null) {
				int var10 = field750[var9].field790 * 22050 / 1000;
				int var11 = field750[var9].field791 * 22050 / 1000;
				int[] var12 = field750[var9].method302(var10, field750[var9].field790);
				for (int var13 = 0; var13 < var10; var13++) {
					field748[var11 + var13 + 44] += (byte) (var12[var13] >> 8);
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
				field748[var14 + var15] = field748[var15];
			}

			for (int var16 = 1; var16 < arg0; var16++) {
				int var17 = (var6 - var5) * var16;
				for (int var18 = var5; var18 < var6; var18++) {
					field748[var17 + var18] = field748[var18];
				}
			}

			var7 -= 44;
		}

		return var7;
	}
}
