package deob;

@ObfuscatedName("DGXCFOYI")
public final class DGXCFOYI extends JOVUNXBE {

	@ObfuscatedName("DGXCFOYI.O")
	public int field535;

	@ObfuscatedName("DGXCFOYI.P")
	public int field536;

	@ObfuscatedName("DGXCFOYI.J")
	public int[] field530;

	@ObfuscatedName("DGXCFOYI.M")
	public int field533;

	@ObfuscatedName("DGXCFOYI.N")
	public int field534;

	@ObfuscatedName("DGXCFOYI.K")
	public int field531;

	@ObfuscatedName("DGXCFOYI.L")
	public int field532;

	@ObfuscatedName("DGXCFOYI.I")
	public byte[] field529;

	public DGXCFOYI(TKEGJSFV arg0, String arg1, int arg2) {
		EGCCHUZS var4 = new EGCCHUZS(arg0.method542(arg1 + ".dat", null));
		EGCCHUZS var5 = new EGCCHUZS(arg0.method542("index.dat", null));
		var5.field589 = var4.method263();
		field535 = var5.method263();
		field536 = var5.method263();
		int var6 = var5.method261();
		field530 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			field530[var7 + 1] = var5.method265();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field589 += 2;
			var4.field589 += var5.method263() * var5.method263();
			var5.field589++;
		}

		field533 = var5.method261();
		field534 = var5.method261();
		field531 = var5.method263();
		field532 = var5.method263();
		int var9 = var5.method261();
		int var10 = field532 * field531;
		field529 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				field529[var11] = var4.method262();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < field531; var12++) {
				for (int var13 = 0; var13 < field532; var13++) {
					field529[field531 * var13 + var12] = var4.method262();
				}
			}
		}
	}

	@ObfuscatedName("DGXCFOYI.a(I)V")
	public void method178() {
		field535 /= 2;
		field536 /= 2;
		byte[] var1 = new byte[field536 * field535];
		int var2 = 0;
		for (int var3 = 0; var3 < field532; var3++) {
			for (int var4 = 0; var4 < field531; var4++) {
				var1[(field533 + var4 >> 1) + (field534 + var3 >> 1) * field535] = field529[var2++];
			}
		}

		field529 = var1;
		field531 = field535;
		field532 = field536;
		field533 = 0;
		field534 = 0;
	}

	@ObfuscatedName("DGXCFOYI.b(I)V")
	public void method179() {
		if (field535 != field531 || field536 != field532) {
			byte[] var1 = new byte[field536 * field535];
			int var2 = 0;
			for (int var3 = 0; var3 < field532; var3++) {
				for (int var4 = 0; var4 < field531; var4++) {
					var1[(field534 + var3) * field535 + field533 + var4] = field529[var2++];
				}
			}

			field529 = var1;
			field531 = field535;
			field532 = field536;
			field533 = 0;
			field534 = 0;
		}
	}

	@ObfuscatedName("DGXCFOYI.c(I)V")
	public void method180() {
		byte[] var1 = new byte[field532 * field531];
		int var2 = 0;
		for (int var3 = 0; var3 < field532; var3++) {
			for (int var4 = field531 - 1; var4 >= 0; var4--) {
				var1[var2++] = field529[field531 * var3 + var4];
			}
		}

		field529 = var1;
		field533 = field535 - field531 - field533;
	}

	@ObfuscatedName("DGXCFOYI.d(I)V")
	public void method181() {
		byte[] var1 = new byte[field532 * field531];
		int var2 = 0;
		for (int var3 = field532 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < field531; var4++) {
				var1[var2++] = field529[field531 * var3 + var4];
			}
		}

		field529 = var1;
		field534 = field536 - field532 - field534;
	}

	@ObfuscatedName("DGXCFOYI.a(IIBI)V")
	public void method182(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field530.length; var4++) {
			int var5 = field530[var4] >> 16 & 0xFF;
			var5 += arg1;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = field530[var4] >> 8 & 0xFF;
			var6 += arg0;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = field530[var4] & 0xFF;
			var7 += arg2;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			field530[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("DGXCFOYI.a(III)V")
	public void method183(int arg0, int arg1) {
		arg1 += field533;
		arg0 += field534;
		int var3 = JOVUNXBE.field851 * arg0 + arg1;
		int var4 = 0;
		int var5 = field532;
		int var6 = field531;
		int var7 = JOVUNXBE.field851 - var6;
		int var8 = 0;

		if (arg0 < JOVUNXBE.field853) {
			int var9 = JOVUNXBE.field853 - arg0;
			var5 -= var9;
			arg0 = JOVUNXBE.field853;
			var4 += var6 * var9;
			var3 += JOVUNXBE.field851 * var9;
		}

		if (arg0 + var5 > JOVUNXBE.field854) {
			var5 -= arg0 + var5 - JOVUNXBE.field854;
		}

		if (arg1 < JOVUNXBE.field855) {
			int var10 = JOVUNXBE.field855 - arg1;
			var6 -= var10;
			arg1 = JOVUNXBE.field855;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > JOVUNXBE.field856) {
			int var11 = arg1 + var6 - JOVUNXBE.field856;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method184(var4, var3, field530, var8, var5, JOVUNXBE.field850, var6, var7, field529);
		}
	}

	@ObfuscatedName("DGXCFOYI.a(II[III[IBII[B)V")
	public void method184(int arg0, int arg1, int[] arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, byte[] arg8) {
		int var10 = -(arg6 >> 2);
		arg6 = -(arg6 & 0x3);
		for (int var11 = -arg4; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg8[arg0++];
				if (var13 == 0) {
					arg1++;
				} else {
					arg5[arg1++] = arg2[var13 & 0xFF];
				}

				byte var14 = arg8[arg0++];
				if (var14 == 0) {
					arg1++;
				} else {
					arg5[arg1++] = arg2[var14 & 0xFF];
				}

				byte var15 = arg8[arg0++];
				if (var15 == 0) {
					arg1++;
				} else {
					arg5[arg1++] = arg2[var15 & 0xFF];
				}

				byte var16 = arg8[arg0++];
				if (var16 == 0) {
					arg1++;
				} else {
					arg5[arg1++] = arg2[var16 & 0xFF];
				}
			}

			for (int var17 = arg6; var17 < 0; var17++) {
				byte var18 = arg8[arg0++];
				if (var18 == 0) {
					arg1++;
				} else {
					arg5[arg1++] = arg2[var18 & 0xFF];
				}
			}

			arg1 += arg7;
			arg0 += arg3;
		}
	}
}
