package deob;

@ObfuscatedName("FDCAWVRL")
public final class FDCAWVRL extends OKWPDMPE {

	@ObfuscatedName("FDCAWVRL.L")
	public int field593;

	@ObfuscatedName("FDCAWVRL.M")
	public int field594;

	@ObfuscatedName("FDCAWVRL.G")
	public int[] field588;

	@ObfuscatedName("FDCAWVRL.J")
	public int field591;

	@ObfuscatedName("FDCAWVRL.K")
	public int field592;

	@ObfuscatedName("FDCAWVRL.H")
	public int field589;

	@ObfuscatedName("FDCAWVRL.I")
	public int field590;

	@ObfuscatedName("FDCAWVRL.F")
	public byte[] field587;

	public FDCAWVRL(VSUYIIVA arg0, String arg1, int arg2) {
		CFARFRSG var4 = new CFARFRSG(arg0.method570(arg1 + ".dat", null));
		CFARFRSG var5 = new CFARFRSG(arg0.method570("index.dat", null));
		var5.field44 = var4.method32();
		field593 = var5.method32();
		field594 = var5.method32();
		int var6 = var5.method30();
		field588 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			field588[var7 + 1] = var5.method34();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field44 += 2;
			var4.field44 += var5.method32() * var5.method32();
			var5.field44++;
		}

		field591 = var5.method30();
		field592 = var5.method30();
		field589 = var5.method32();
		field590 = var5.method32();
		int var9 = var5.method30();
		int var10 = field590 * field589;
		field587 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				field587[var11] = var4.method31();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < field589; var12++) {
				for (int var13 = 0; var13 < field590; var13++) {
					field587[field589 * var13 + var12] = var4.method31();
				}
			}
		}
	}

	@ObfuscatedName("FDCAWVRL.a(Z)V")
	public void method270() {
		field593 /= 2;
		field594 /= 2;
		byte[] var1 = new byte[field594 * field593];
		int var2 = 0;
		for (int var3 = 0; var3 < field590; var3++) {
			for (int var4 = 0; var4 < field589; var4++) {
				var1[(field591 + var4 >> 1) + (field592 + var3 >> 1) * field593] = field587[var2++];
			}
		}

		field587 = var1;
		field589 = field593;
		field590 = field594;
		field591 = 0;
		field592 = 0;
	}

	@ObfuscatedName("FDCAWVRL.b(I)V")
	public void method271() {
		if (field593 != field589 || field594 != field590) {
			byte[] var1 = new byte[field594 * field593];
			int var2 = 0;
			for (int var3 = 0; var3 < field590; var3++) {
				for (int var4 = 0; var4 < field589; var4++) {
					var1[(field592 + var3) * field593 + field591 + var4] = field587[var2++];
				}
			}

			field587 = var1;
			field589 = field593;
			field590 = field594;
			field591 = 0;
			field592 = 0;
		}
	}

	@ObfuscatedName("FDCAWVRL.c(I)V")
	public void method272() {
		byte[] var1 = new byte[field590 * field589];
		int var2 = 0;
		for (int var3 = 0; var3 < field590; var3++) {
			for (int var4 = field589 - 1; var4 >= 0; var4--) {
				var1[var2++] = field587[field589 * var3 + var4];
			}
		}

		field587 = var1;
		field591 = field593 - field589 - field591;
	}

	@ObfuscatedName("FDCAWVRL.d(I)V")
	public void method273() {
		byte[] var1 = new byte[field590 * field589];
		int var2 = 0;
		for (int var3 = field590 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < field589; var4++) {
				var1[var2++] = field587[field589 * var3 + var4];
			}
		}

		field587 = var1;
		field592 = field594 - field590 - field592;
	}

	@ObfuscatedName("FDCAWVRL.a(IIBI)V")
	public void method274(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field588.length; var4++) {
			int var5 = field588[var4] >> 16 & 0xFF;
			var5 += arg1;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = field588[var4] >> 8 & 0xFF;
			var6 += arg2;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = field588[var4] & 0xFF;
			var7 += arg0;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			field588[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("FDCAWVRL.a(III)V")
	public void method275(int arg0, int arg1) {
		arg0 += field591;
		arg1 += field592;
		int var3 = OKWPDMPE.field980 * arg1 + arg0;
		int var4 = 0;
		int var5 = field590;
		int var6 = field589;
		int var7 = OKWPDMPE.field980 - var6;
		int var8 = 0;

		if (arg1 < OKWPDMPE.field982) {
			int var9 = OKWPDMPE.field982 - arg1;
			var5 -= var9;
			arg1 = OKWPDMPE.field982;
			var4 += var6 * var9;
			var3 += OKWPDMPE.field980 * var9;
		}

		if (arg1 + var5 > OKWPDMPE.field983) {
			var5 -= arg1 + var5 - OKWPDMPE.field983;
		}

		if (arg0 < OKWPDMPE.field984) {
			int var10 = OKWPDMPE.field984 - arg0;
			var6 -= var10;
			arg0 = OKWPDMPE.field984;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > OKWPDMPE.field985) {
			int var11 = arg0 + var6 - OKWPDMPE.field985;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method276(var6, var4, field587, OKWPDMPE.field979, var8, var7, var3, field588, var5);
		}
	}

	@ObfuscatedName("FDCAWVRL.a(II[B[IIIII[II)V")
	public void method276(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8) {
		int var10 = -(arg0 >> 2);
		arg0 = -(arg0 & 0x3);
		for (int var11 = -arg8; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg2[arg1++];
				if (var13 == 0) {
					arg6++;
				} else {
					arg3[arg6++] = arg7[var13 & 0xFF];
				}

				byte var14 = arg2[arg1++];
				if (var14 == 0) {
					arg6++;
				} else {
					arg3[arg6++] = arg7[var14 & 0xFF];
				}

				byte var15 = arg2[arg1++];
				if (var15 == 0) {
					arg6++;
				} else {
					arg3[arg6++] = arg7[var15 & 0xFF];
				}

				byte var16 = arg2[arg1++];
				if (var16 == 0) {
					arg6++;
				} else {
					arg3[arg6++] = arg7[var16 & 0xFF];
				}
			}

			for (int var17 = arg0; var17 < 0; var17++) {
				byte var18 = arg2[arg1++];
				if (var18 == 0) {
					arg6++;
				} else {
					arg3[arg6++] = arg7[var18 & 0xFF];
				}
			}

			arg6 += arg5;
			arg1 += arg4;
		}
	}
}
