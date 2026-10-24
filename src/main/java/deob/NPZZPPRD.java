package deob;

@ObfuscatedName("NPZZPPRD")
public final class NPZZPPRD extends IBBQNXJX {

	@ObfuscatedName("NPZZPPRD.J")
	public int field1093;

	@ObfuscatedName("NPZZPPRD.K")
	public int field1094;

	@ObfuscatedName("NPZZPPRD.E")
	public int[] field1088;

	@ObfuscatedName("NPZZPPRD.H")
	public int field1091;

	@ObfuscatedName("NPZZPPRD.I")
	public int field1092;

	@ObfuscatedName("NPZZPPRD.F")
	public int field1089;

	@ObfuscatedName("NPZZPPRD.G")
	public int field1090;

	@ObfuscatedName("NPZZPPRD.D")
	public byte[] field1087;

	public NPZZPPRD(JUPFHAZZ arg0, String arg1, int arg2) {
		TKPFKOXP var4 = new TKPFKOXP(arg0.method372(arg1 + ".dat", null));
		TKPFKOXP var5 = new TKPFKOXP(arg0.method372("index.dat", null));
		var5.field1382 = var4.method531();
		field1093 = var5.method531();
		field1094 = var5.method531();
		int var6 = var5.method529();
		field1088 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			field1088[var7 + 1] = var5.method533();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field1382 += 2;
			var4.field1382 += var5.method531() * var5.method531();
			var5.field1382++;
		}

		field1091 = var5.method529();
		field1092 = var5.method529();
		field1089 = var5.method531();
		field1090 = var5.method531();
		int var9 = var5.method529();
		int var10 = field1090 * field1089;
		field1087 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				field1087[var11] = var4.method530();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < field1089; var12++) {
				for (int var13 = 0; var13 < field1090; var13++) {
					field1087[field1089 * var13 + var12] = var4.method530();
				}
			}
		}
	}

	@ObfuscatedName("NPZZPPRD.a(B)V")
	public void method416() {
		field1093 /= 2;
		field1094 /= 2;
		byte[] var1 = new byte[field1094 * field1093];
		int var2 = 0;
		for (int var3 = 0; var3 < field1090; var3++) {
			for (int var4 = 0; var4 < field1089; var4++) {
				var1[(field1091 + var4 >> 1) + (field1092 + var3 >> 1) * field1093] = field1087[var2++];
			}
		}

		field1087 = var1;
		field1089 = field1093;
		field1090 = field1094;
		field1091 = 0;
		field1092 = 0;
	}

	@ObfuscatedName("NPZZPPRD.c(I)V")
	public void method417() {
		if (field1093 != field1089 || field1094 != field1090) {
			byte[] var1 = new byte[field1094 * field1093];
			int var2 = 0;
			for (int var3 = 0; var3 < field1090; var3++) {
				for (int var4 = 0; var4 < field1089; var4++) {
					var1[(field1092 + var3) * field1093 + field1091 + var4] = field1087[var2++];
				}
			}

			field1087 = var1;
			field1089 = field1093;
			field1090 = field1094;
			field1091 = 0;
			field1092 = 0;
		}
	}

	@ObfuscatedName("NPZZPPRD.d(I)V")
	public void method418() {
		byte[] var1 = new byte[field1090 * field1089];
		int var2 = 0;
		for (int var3 = 0; var3 < field1090; var3++) {
			for (int var4 = field1089 - 1; var4 >= 0; var4--) {
				var1[var2++] = field1087[field1089 * var3 + var4];
			}
		}

		field1087 = var1;
		field1091 = field1093 - field1089 - field1091;
	}

	@ObfuscatedName("NPZZPPRD.e(I)V")
	public void method419() {
		byte[] var1 = new byte[field1090 * field1089];
		int var2 = 0;
		for (int var3 = field1090 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < field1089; var4++) {
				var1[var2++] = field1087[field1089 * var3 + var4];
			}
		}

		field1087 = var1;
		field1092 = field1094 - field1090 - field1092;
	}

	@ObfuscatedName("NPZZPPRD.a(IIII)V")
	public void method420(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field1088.length; var4++) {
			int var5 = field1088[var4] >> 16 & 0xFF;
			var5 += arg2;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = field1088[var4] >> 8 & 0xFF;
			var6 += arg1;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = field1088[var4] & 0xFF;
			var7 += arg0;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			field1088[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("NPZZPPRD.a(III)V")
	public void method421(int arg0, int arg1) {
		arg1 += field1091;
		arg0 += field1092;
		int var3 = IBBQNXJX.field816 * arg0 + arg1;
		int var4 = 0;
		int var5 = field1090;
		int var6 = field1089;
		int var7 = IBBQNXJX.field816 - var6;
		int var8 = 0;

		if (arg0 < IBBQNXJX.field818) {
			int var9 = IBBQNXJX.field818 - arg0;
			var5 -= var9;
			arg0 = IBBQNXJX.field818;
			var4 += var6 * var9;
			var3 += IBBQNXJX.field816 * var9;
		}

		if (arg0 + var5 > IBBQNXJX.field819) {
			var5 -= arg0 + var5 - IBBQNXJX.field819;
		}

		if (arg1 < IBBQNXJX.field820) {
			int var10 = IBBQNXJX.field820 - arg1;
			var6 -= var10;
			arg1 = IBBQNXJX.field820;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > IBBQNXJX.field821) {
			int var11 = arg1 + var6 - IBBQNXJX.field821;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method422(var6, var8, field1087, IBBQNXJX.field815, var4, var5, var7, var3, field1088);
		}
	}

	@ObfuscatedName("NPZZPPRD.a(II[B[IIIIII[I)V")
	public void method422(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int[] arg8) {
		int var10 = -(arg0 >> 2);
		arg0 = -(arg0 & 0x3);
		for (int var11 = -arg5; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg2[arg4++];
				if (var13 == 0) {
					arg7++;
				} else {
					arg3[arg7++] = arg8[var13 & 0xFF];
				}

				byte var14 = arg2[arg4++];
				if (var14 == 0) {
					arg7++;
				} else {
					arg3[arg7++] = arg8[var14 & 0xFF];
				}

				byte var15 = arg2[arg4++];
				if (var15 == 0) {
					arg7++;
				} else {
					arg3[arg7++] = arg8[var15 & 0xFF];
				}

				byte var16 = arg2[arg4++];
				if (var16 == 0) {
					arg7++;
				} else {
					arg3[arg7++] = arg8[var16 & 0xFF];
				}
			}

			for (int var17 = arg0; var17 < 0; var17++) {
				byte var18 = arg2[arg4++];
				if (var18 == 0) {
					arg7++;
				} else {
					arg3[arg7++] = arg8[var18 & 0xFF];
				}
			}

			arg7 += arg6;
			arg4 += arg1;
		}
	}
}
