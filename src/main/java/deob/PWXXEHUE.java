package deob;

@ObfuscatedName("PWXXEHUE")
public class PWXXEHUE {

	@ObfuscatedName("PWXXEHUE.h")
	public QCXYCZNF[] field934 = new QCXYCZNF[10];

	@ObfuscatedName("PWXXEHUE.d")
	public static PWXXEHUE[] field930 = new PWXXEHUE[5000];

	@ObfuscatedName("PWXXEHUE.e")
	public static int[] field931 = new int[5000];

	@ObfuscatedName("PWXXEHUE.i")
	public int field935;

	@ObfuscatedName("PWXXEHUE.j")
	public int field936;

	@ObfuscatedName("PWXXEHUE.g")
	public static JHKSAGUC field933;

	@ObfuscatedName("PWXXEHUE.f")
	public static byte[] field932;

	@ObfuscatedName("PWXXEHUE.a(ILJHKSAGUC;)V")
	public static final void method398(JHKSAGUC arg0) {
		field932 = new byte[441000];
		field933 = new JHKSAGUC(field932);
		QCXYCZNF.method413();

		while (true) {
			int var1 = arg0.method308();
			if (var1 == 0xFFFF) {
				return;
			}

			field930[var1] = new PWXXEHUE();
			field930[var1].method400(arg0);
			field931[var1] = field930[var1].method401();
		}
	}

	@ObfuscatedName("PWXXEHUE.a(III)LJHKSAGUC;")
	public static final JHKSAGUC method399(int arg0, int arg1) {
		if (field930[arg0] != null) {
			PWXXEHUE var2 = field930[arg0];
			return var2.method402(arg1);
		}

		return null;
	}

	@ObfuscatedName("PWXXEHUE.a(LJHKSAGUC;I)V")
	public final void method400(JHKSAGUC arg0) {
		for (int var2 = 0; var2 < 10; var2++) {
			int var3 = arg0.method306();
			if (var3 != 0) {
				arg0.field752--;
				field934[var2] = new QCXYCZNF();
				field934[var2].method416(arg0);
			}
		}

		field935 = arg0.method308();
		field936 = arg0.method308();
	}

	@ObfuscatedName("PWXXEHUE.a(B)I")
	public final int method401() {
		int var1 = 9999999;
		for (int var2 = 0; var2 < 10; var2++) {
			if (field934[var2] != null && field934[var2].field963 / 20 < var1) {
				var1 = field934[var2].field963 / 20;
			}
		}

		if (field935 < field936 && field935 / 20 < var1) {
			var1 = field935 / 20;
		}

		if (var1 != 9999999 && var1 != 0) {
			for (int var3 = 0; var3 < 10; var3++) {
				if (field934[var3] != null) {
					field934[var3].field963 -= var1 * 20;
				}
			}

			if (field935 < field936) {
				field935 -= var1 * 20;
				field936 -= var1 * 20;
			}

			return var1;
		}

		return 0;
	}

	@ObfuscatedName("PWXXEHUE.a(II)LJHKSAGUC;")
	public final JHKSAGUC method402(int arg0) {
		int var2 = method403(arg0);
		field933.field752 = 0;
		field933.method300(0x52494646);
		field933.method301(var2 + 36);
		field933.method300(0x57415645);
		field933.method300(0x666D7420);
		field933.method301(16);
		field933.method298(1);
		field933.method298(1);
		field933.method301(22050);
		field933.method301(22050);
		field933.method298(1);
		field933.method298(8);
		field933.method300(0x64617461);
		field933.method301(var2);
		field933.field752 += var2;
		return field933;
	}

	@ObfuscatedName("PWXXEHUE.a(I)I")
	public final int method403(int arg0) {
		int var2 = 0;
		for (int var3 = 0; var3 < 10; var3++) {
			if (field934[var3] != null && field934[var3].field963 + field934[var3].field962 > var2) {
				var2 = field934[var3].field963 + field934[var3].field962;
			}
		}

		if (var2 == 0) {
			return 0;
		}

		int var4 = var2 * 22050 / 1000;
		int var5 = field935 * 22050 / 1000;
		int var6 = field936 * 22050 / 1000;
		if (var5 < 0 || var5 > var4 || var6 < 0 || var6 > var4 || var5 >= var6) {
			arg0 = 0;
		}

		int var7 = (arg0 - 1) * (var6 - var5) + var4;
		for (int var8 = 44; var8 < var7 + 44; var8++) {
			field932[var8] = -128;
		}

		for (int var9 = 0; var9 < 10; var9++) {
			if (field934[var9] != null) {
				int var10 = field934[var9].field962 * 22050 / 1000;
				int var11 = field934[var9].field963 * 22050 / 1000;
				int[] var12 = field934[var9].method414(var10, field934[var9].field962);
				for (int var13 = 0; var13 < var10; var13++) {
					field932[var11 + var13 + 44] += (byte) (var12[var13] >> 8);
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
				field932[var14 + var15] = field932[var15];
			}

			for (int var16 = 1; var16 < arg0; var16++) {
				int var17 = (var6 - var5) * var16;
				for (int var18 = var5; var18 < var6; var18++) {
					field932[var17 + var18] = field932[var18];
				}
			}

			var7 -= 44;
		}

		return var7;
	}
}
