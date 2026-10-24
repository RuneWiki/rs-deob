package deob;

@ObfuscatedName("AGTHLVTI")
public final class AGTHLVTI extends DSAVPBJG {

	@ObfuscatedName("AGTHLVTI.K")
	public int field25;

	@ObfuscatedName("AGTHLVTI.L")
	public int field26;

	@ObfuscatedName("AGTHLVTI.F")
	public int[] field20;

	@ObfuscatedName("AGTHLVTI.I")
	public int field23;

	@ObfuscatedName("AGTHLVTI.J")
	public int field24;

	@ObfuscatedName("AGTHLVTI.G")
	public int field21;

	@ObfuscatedName("AGTHLVTI.H")
	public int field22;

	@ObfuscatedName("AGTHLVTI.E")
	public byte[] field19;

	public AGTHLVTI(BYZSQZUF arg0, String arg1, int arg2) {
		IMUIZRAF var4 = new IMUIZRAF(arg0.method29(arg1 + ".dat", null));
		IMUIZRAF var5 = new IMUIZRAF(arg0.method29("index.dat", null));
		var5.field714 = var4.method240();
		field25 = var5.method240();
		field26 = var5.method240();
		int var6 = var5.method238();
		field20 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			field20[var7 + 1] = var5.method242();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field714 += 2;
			var4.field714 += var5.method240() * var5.method240();
			var5.field714++;
		}

		field23 = var5.method238();
		field24 = var5.method238();
		field21 = var5.method240();
		field22 = var5.method240();
		int var9 = var5.method238();
		int var10 = field22 * field21;
		field19 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				field19[var11] = var4.method239();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < field21; var12++) {
				for (int var13 = 0; var13 < field22; var13++) {
					field19[field21 * var13 + var12] = var4.method239();
				}
			}
		}
	}

	@ObfuscatedName("AGTHLVTI.b(I)V")
	public void method8() {
		field25 /= 2;
		field26 /= 2;
		byte[] var1 = new byte[field26 * field25];
		int var2 = 0;
		for (int var3 = 0; var3 < field22; var3++) {
			for (int var4 = 0; var4 < field21; var4++) {
				var1[(field23 + var4 >> 1) + (field24 + var3 >> 1) * field25] = field19[var2++];
			}
		}

		field19 = var1;
		field21 = field25;
		field22 = field26;
		field23 = 0;
		field24 = 0;
	}

	@ObfuscatedName("AGTHLVTI.c(I)V")
	public void method9() {
		if (field25 != field21 || field26 != field22) {
			byte[] var1 = new byte[field26 * field25];
			int var2 = 0;
			for (int var3 = 0; var3 < field22; var3++) {
				for (int var4 = 0; var4 < field21; var4++) {
					var1[(field24 + var3) * field25 + field23 + var4] = field19[var2++];
				}
			}

			field19 = var1;
			field21 = field25;
			field22 = field26;
			field23 = 0;
			field24 = 0;
		}
	}

	@ObfuscatedName("AGTHLVTI.b(B)V")
	public void method10() {
		byte[] var1 = new byte[field22 * field21];
		int var2 = 0;
		for (int var3 = 0; var3 < field22; var3++) {
			for (int var4 = field21 - 1; var4 >= 0; var4--) {
				var1[var2++] = field19[field21 * var3 + var4];
			}
		}

		field19 = var1;
		field23 = field25 - field21 - field23;
	}

	@ObfuscatedName("AGTHLVTI.d(I)V")
	public void method11() {
		byte[] var1 = new byte[field22 * field21];
		int var2 = 0;
		for (int var3 = field22 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < field21; var4++) {
				var1[var2++] = field19[field21 * var3 + var4];
			}
		}

		field19 = var1;
		field24 = field26 - field22 - field24;
	}

	@ObfuscatedName("AGTHLVTI.a(IIII)V")
	public void method12(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field20.length; var4++) {
			int var5 = field20[var4] >> 16 & 0xFF;
			var5 += arg0;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = field20[var4] >> 8 & 0xFF;
			var6 += arg2;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = field20[var4] & 0xFF;
			var7 += arg1;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			field20[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("AGTHLVTI.a(III)V")
	public void method13(int arg0, int arg1) {
		arg0 += field23;
		arg1 += field24;
		int var3 = DSAVPBJG.field563 * arg1 + arg0;
		int var4 = 0;
		int var5 = field22;
		int var6 = field21;
		int var7 = DSAVPBJG.field563 - var6;
		int var8 = 0;

		if (arg1 < DSAVPBJG.field565) {
			int var9 = DSAVPBJG.field565 - arg1;
			var5 -= var9;
			arg1 = DSAVPBJG.field565;
			var4 += var6 * var9;
			var3 += DSAVPBJG.field563 * var9;
		}

		if (arg1 + var5 > DSAVPBJG.field566) {
			var5 -= arg1 + var5 - DSAVPBJG.field566;
		}

		if (arg0 < DSAVPBJG.field567) {
			int var10 = DSAVPBJG.field567 - arg0;
			var6 -= var10;
			arg0 = DSAVPBJG.field567;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > DSAVPBJG.field568) {
			int var11 = arg0 + var6 - DSAVPBJG.field568;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method14(field20, var6, field19, var7, var4, var8, var3, DSAVPBJG.field562, var5);
		}
	}

	@ObfuscatedName("AGTHLVTI.a([II[BIIIII[II)V")
	public void method14(int[] arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8) {
		int var10 = -(arg1 >> 2);
		arg1 = -(arg1 & 0x3);
		for (int var11 = -arg8; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg2[arg4++];
				if (var13 == 0) {
					arg6++;
				} else {
					arg7[arg6++] = arg0[var13 & 0xFF];
				}

				byte var14 = arg2[arg4++];
				if (var14 == 0) {
					arg6++;
				} else {
					arg7[arg6++] = arg0[var14 & 0xFF];
				}

				byte var15 = arg2[arg4++];
				if (var15 == 0) {
					arg6++;
				} else {
					arg7[arg6++] = arg0[var15 & 0xFF];
				}

				byte var16 = arg2[arg4++];
				if (var16 == 0) {
					arg6++;
				} else {
					arg7[arg6++] = arg0[var16 & 0xFF];
				}
			}

			for (int var17 = arg1; var17 < 0; var17++) {
				byte var18 = arg2[arg4++];
				if (var18 == 0) {
					arg6++;
				} else {
					arg7[arg6++] = arg0[var18 & 0xFF];
				}
			}

			arg6 += arg3;
			arg4 += arg5;
		}
	}
}
