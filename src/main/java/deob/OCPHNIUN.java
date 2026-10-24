package deob;

@ObfuscatedName("OCPHNIUN")
public final class OCPHNIUN extends BAXODNVH {

	@ObfuscatedName("OCPHNIUN.H")
	public int field988;

	@ObfuscatedName("OCPHNIUN.I")
	public int field989;

	@ObfuscatedName("OCPHNIUN.C")
	public int[] field983;

	@ObfuscatedName("OCPHNIUN.F")
	public int field986;

	@ObfuscatedName("OCPHNIUN.G")
	public int field987;

	@ObfuscatedName("OCPHNIUN.D")
	public int field984;

	@ObfuscatedName("OCPHNIUN.E")
	public int field985;

	@ObfuscatedName("OCPHNIUN.B")
	public byte[] field982;

	public OCPHNIUN(UUIGNTAD arg0, String arg1, int arg2) {
		CMGGUSPR var4 = new CMGGUSPR(arg0.method545(arg1 + ".dat", null));
		CMGGUSPR var5 = new CMGGUSPR(arg0.method545("index.dat", null));
		var5.field540 = var4.method196();
		field988 = var5.method196();
		field989 = var5.method196();
		int var6 = var5.method194();
		field983 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			field983[var7 + 1] = var5.method198();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field540 += 2;
			var4.field540 += var5.method196() * var5.method196();
			var5.field540++;
		}

		field986 = var5.method194();
		field987 = var5.method194();
		field984 = var5.method196();
		field985 = var5.method196();
		int var9 = var5.method194();
		int var10 = field985 * field984;
		field982 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				field982[var11] = var4.method195();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < field984; var12++) {
				for (int var13 = 0; var13 < field985; var13++) {
					field982[field984 * var13 + var12] = var4.method195();
				}
			}
		}
	}

	@ObfuscatedName("OCPHNIUN.c(I)V")
	public void method419() {
		field988 /= 2;
		field989 /= 2;
		byte[] var1 = new byte[field989 * field988];
		int var2 = 0;
		for (int var3 = 0; var3 < field985; var3++) {
			for (int var4 = 0; var4 < field984; var4++) {
				var1[(field986 + var4 >> 1) + (field987 + var3 >> 1) * field988] = field982[var2++];
			}
		}

		field982 = var1;
		field984 = field988;
		field985 = field989;
		field986 = 0;
		field987 = 0;
	}

	@ObfuscatedName("OCPHNIUN.d(I)V")
	public void method420() {
		if (field988 != field984 || field989 != field985) {
			byte[] var1 = new byte[field989 * field988];
			int var2 = 0;
			for (int var3 = 0; var3 < field985; var3++) {
				for (int var4 = 0; var4 < field984; var4++) {
					var1[(field987 + var3) * field988 + field986 + var4] = field982[var2++];
				}
			}

			field982 = var1;
			field984 = field988;
			field985 = field989;
			field986 = 0;
			field987 = 0;
		}
	}

	@ObfuscatedName("OCPHNIUN.e(I)V")
	public void method421() {
		byte[] var1 = new byte[field985 * field984];
		int var2 = 0;
		for (int var3 = 0; var3 < field985; var3++) {
			for (int var4 = field984 - 1; var4 >= 0; var4--) {
				var1[var2++] = field982[field984 * var3 + var4];
			}
		}

		field982 = var1;
		field986 = field988 - field984 - field986;
	}

	@ObfuscatedName("OCPHNIUN.a(B)V")
	public void method422() {
		byte[] var1 = new byte[field985 * field984];
		int var2 = 0;
		for (int var3 = field985 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < field984; var4++) {
				var1[var2++] = field982[field984 * var3 + var4];
			}
		}

		field982 = var1;
		field987 = field989 - field985 - field987;
	}

	@ObfuscatedName("OCPHNIUN.a(IZII)V")
	public void method423(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field983.length; var4++) {
			int var5 = field983[var4] >> 16 & 0xFF;
			var5 += arg1;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = field983[var4] >> 8 & 0xFF;
			var6 += arg0;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = field983[var4] & 0xFF;
			var7 += arg2;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			field983[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("OCPHNIUN.a(IBI)V")
	public void method424(int arg0, int arg1) {
		arg0 += field986;
		arg1 += field987;
		int var3 = BAXODNVH.field32 * arg1 + arg0;
		int var4 = 0;
		int var5 = field985;
		int var6 = field984;
		int var7 = BAXODNVH.field32 - var6;
		int var8 = 0;

		if (arg1 < BAXODNVH.field34) {
			int var9 = BAXODNVH.field34 - arg1;
			var5 -= var9;
			arg1 = BAXODNVH.field34;
			var4 += var6 * var9;
			var3 += BAXODNVH.field32 * var9;
		}

		if (arg1 + var5 > BAXODNVH.field35) {
			var5 -= arg1 + var5 - BAXODNVH.field35;
		}

		if (arg0 < BAXODNVH.field36) {
			int var10 = BAXODNVH.field36 - arg0;
			var6 -= var10;
			arg0 = BAXODNVH.field36;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > BAXODNVH.field37) {
			int var11 = arg0 + var6 - BAXODNVH.field37;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method425(var4, field983, var6, var8, var3, BAXODNVH.field31, var7, var5, field982);
		}
	}

	@ObfuscatedName("OCPHNIUN.a(IB[IIII[III[B)V")
	public void method425(int arg0, int[] arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, byte[] arg8) {
		int var10 = -(arg2 >> 2);
		arg2 = -(arg2 & 0x3);
		for (int var11 = -arg7; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg8[arg0++];
				if (var13 == 0) {
					arg4++;
				} else {
					arg5[arg4++] = arg1[var13 & 0xFF];
				}

				byte var14 = arg8[arg0++];
				if (var14 == 0) {
					arg4++;
				} else {
					arg5[arg4++] = arg1[var14 & 0xFF];
				}

				byte var15 = arg8[arg0++];
				if (var15 == 0) {
					arg4++;
				} else {
					arg5[arg4++] = arg1[var15 & 0xFF];
				}

				byte var16 = arg8[arg0++];
				if (var16 == 0) {
					arg4++;
				} else {
					arg5[arg4++] = arg1[var16 & 0xFF];
				}
			}

			for (int var17 = arg2; var17 < 0; var17++) {
				byte var18 = arg8[arg0++];
				if (var18 == 0) {
					arg4++;
				} else {
					arg5[arg4++] = arg1[var18 & 0xFF];
				}
			}

			arg4 += arg6;
			arg0 += arg3;
		}
	}
}
