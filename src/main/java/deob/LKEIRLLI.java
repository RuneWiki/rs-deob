package deob;

@ObfuscatedName("LKEIRLLI")
public final class LKEIRLLI extends SXFSGYHA {

	@ObfuscatedName("LKEIRLLI.L")
	public int field920;

	@ObfuscatedName("LKEIRLLI.M")
	public int field921;

	@ObfuscatedName("LKEIRLLI.G")
	public int[] field915;

	@ObfuscatedName("LKEIRLLI.J")
	public int field918;

	@ObfuscatedName("LKEIRLLI.K")
	public int field919;

	@ObfuscatedName("LKEIRLLI.H")
	public int field916;

	@ObfuscatedName("LKEIRLLI.I")
	public int field917;

	@ObfuscatedName("LKEIRLLI.F")
	public byte[] field914;

	public LKEIRLLI(SPZBTZXL arg0, String arg1, int arg2) {
		LDILQFVA var4 = new LDILQFVA(arg0.method515(arg1 + ".dat", null));
		LDILQFVA var5 = new LDILQFVA(arg0.method515("index.dat", null));
		var5.field902 = var4.method404();
		field920 = var5.method404();
		field921 = var5.method404();
		int var6 = var5.method402();
		field915 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			field915[var7 + 1] = var5.method406();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field902 += 2;
			var4.field902 += var5.method404() * var5.method404();
			var5.field902++;
		}

		field918 = var5.method402();
		field919 = var5.method402();
		field916 = var5.method404();
		field917 = var5.method404();
		int var9 = var5.method402();
		int var10 = field917 * field916;
		field914 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				field914[var11] = var4.method403();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < field916; var12++) {
				for (int var13 = 0; var13 < field917; var13++) {
					field914[field916 * var13 + var12] = var4.method403();
				}
			}
		}
	}

	@ObfuscatedName("LKEIRLLI.b(I)V")
	public void method441() {
		field920 /= 2;
		field921 /= 2;
		byte[] var1 = new byte[field921 * field920];
		int var2 = 0;
		for (int var3 = 0; var3 < field917; var3++) {
			for (int var4 = 0; var4 < field916; var4++) {
				var1[(field918 + var4 >> 1) + (field919 + var3 >> 1) * field920] = field914[var2++];
			}
		}

		field914 = var1;
		field916 = field920;
		field917 = field921;
		field918 = 0;
		field919 = 0;
	}

	@ObfuscatedName("LKEIRLLI.b(Z)V")
	public void method442() {
		if (field920 != field916 || field921 != field917) {
			byte[] var1 = new byte[field921 * field920];
			int var2 = 0;
			for (int var3 = 0; var3 < field917; var3++) {
				for (int var4 = 0; var4 < field916; var4++) {
					var1[(field919 + var3) * field920 + field918 + var4] = field914[var2++];
				}
			}

			field914 = var1;
			field916 = field920;
			field917 = field921;
			field918 = 0;
			field919 = 0;
		}
	}

	@ObfuscatedName("LKEIRLLI.c(I)V")
	public void method443() {
		byte[] var1 = new byte[field917 * field916];
		int var2 = 0;
		for (int var3 = 0; var3 < field917; var3++) {
			for (int var4 = field916 - 1; var4 >= 0; var4--) {
				var1[var2++] = field914[field916 * var3 + var4];
			}
		}

		field914 = var1;
		field918 = field920 - field916 - field918;
	}

	@ObfuscatedName("LKEIRLLI.c(Z)V")
	public void method444() {
		byte[] var1 = new byte[field917 * field916];
		int var2 = 0;
		for (int var3 = field917 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < field916; var4++) {
				var1[var2++] = field914[field916 * var3 + var4];
			}
		}

		field914 = var1;
		field919 = field921 - field917 - field919;
	}

	@ObfuscatedName("LKEIRLLI.a(IIII)V")
	public void method445(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field915.length; var4++) {
			int var5 = field915[var4] >> 16 & 0xFF;
			var5 += arg1;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = field915[var4] >> 8 & 0xFF;
			var6 += arg0;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = field915[var4] & 0xFF;
			var7 += arg2;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			field915[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("LKEIRLLI.a(III)V")
	public void method446(int arg0, int arg1) {
		arg1 += field918;
		arg0 += field919;
		int var3 = SXFSGYHA.field1126 * arg0 + arg1;
		int var4 = 0;
		int var5 = field917;
		int var6 = field916;
		int var7 = SXFSGYHA.field1126 - var6;
		int var8 = 0;

		if (arg0 < SXFSGYHA.field1128) {
			int var9 = SXFSGYHA.field1128 - arg0;
			var5 -= var9;
			arg0 = SXFSGYHA.field1128;
			var4 += var6 * var9;
			var3 += SXFSGYHA.field1126 * var9;
		}

		if (arg0 + var5 > SXFSGYHA.field1129) {
			var5 -= arg0 + var5 - SXFSGYHA.field1129;
		}

		if (arg1 < SXFSGYHA.field1130) {
			int var10 = SXFSGYHA.field1130 - arg1;
			var6 -= var10;
			arg1 = SXFSGYHA.field1130;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > SXFSGYHA.field1131) {
			int var11 = arg1 + var6 - SXFSGYHA.field1131;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method447(var4, field915, SXFSGYHA.field1125, field914, var8, var3, var7, var6, var5);
		}
	}

	@ObfuscatedName("LKEIRLLI.a(I[I[II[BIIIII)V")
	public void method447(int arg0, int[] arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		int var10 = -(arg7 >> 2);
		arg7 = -(arg7 & 0x3);
		for (int var11 = -arg8; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg3[arg0++];
				if (var13 == 0) {
					arg5++;
				} else {
					arg2[arg5++] = arg1[var13 & 0xFF];
				}

				byte var14 = arg3[arg0++];
				if (var14 == 0) {
					arg5++;
				} else {
					arg2[arg5++] = arg1[var14 & 0xFF];
				}

				byte var15 = arg3[arg0++];
				if (var15 == 0) {
					arg5++;
				} else {
					arg2[arg5++] = arg1[var15 & 0xFF];
				}

				byte var16 = arg3[arg0++];
				if (var16 == 0) {
					arg5++;
				} else {
					arg2[arg5++] = arg1[var16 & 0xFF];
				}
			}

			for (int var17 = arg7; var17 < 0; var17++) {
				byte var18 = arg3[arg0++];
				if (var18 == 0) {
					arg5++;
				} else {
					arg2[arg5++] = arg1[var18 & 0xFF];
				}
			}

			arg5 += arg6;
			arg0 += arg4;
		}
	}
}
