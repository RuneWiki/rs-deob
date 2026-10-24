package deob;

@ObfuscatedName("DZSIRBWX")
public final class DZSIRBWX extends KNERFXXY {

	@ObfuscatedName("DZSIRBWX.I")
	public int field630;

	@ObfuscatedName("DZSIRBWX.J")
	public int field631;

	@ObfuscatedName("DZSIRBWX.D")
	public int[] field625;

	@ObfuscatedName("DZSIRBWX.G")
	public int field628;

	@ObfuscatedName("DZSIRBWX.H")
	public int field629;

	@ObfuscatedName("DZSIRBWX.E")
	public int field626;

	@ObfuscatedName("DZSIRBWX.F")
	public int field627;

	@ObfuscatedName("DZSIRBWX.C")
	public byte[] field624;

	public DZSIRBWX(OTSGNSQM arg0, String arg1, int arg2) {
		YOXDZEVD var4 = new YOXDZEVD(arg0.method376(arg1 + ".dat", null));
		YOXDZEVD var5 = new YOXDZEVD(arg0.method376("index.dat", null));
		var5.field1393 = var4.method551();
		field630 = var5.method551();
		field631 = var5.method551();
		int var6 = var5.method549();
		field625 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			field625[var7 + 1] = var5.method553();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field1393 += 2;
			var4.field1393 += var5.method551() * var5.method551();
			var5.field1393++;
		}

		field628 = var5.method549();
		field629 = var5.method549();
		field626 = var5.method551();
		field627 = var5.method551();
		int var9 = var5.method549();
		int var10 = field627 * field626;
		field624 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				field624[var11] = var4.method550();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < field626; var12++) {
				for (int var13 = 0; var13 < field627; var13++) {
					field624[field626 * var13 + var12] = var4.method550();
				}
			}
		}
	}

	@ObfuscatedName("DZSIRBWX.a(B)V")
	public void method187() {
		field630 /= 2;
		field631 /= 2;
		byte[] var1 = new byte[field631 * field630];
		int var2 = 0;
		for (int var3 = 0; var3 < field627; var3++) {
			for (int var4 = 0; var4 < field626; var4++) {
				var1[(field628 + var4 >> 1) + (field629 + var3 >> 1) * field630] = field624[var2++];
			}
		}

		field624 = var1;
		field626 = field630;
		field627 = field631;
		field628 = 0;
		field629 = 0;
	}

	@ObfuscatedName("DZSIRBWX.b(B)V")
	public void method188() {
		if (field630 != field626 || field631 != field627) {
			byte[] var1 = new byte[field631 * field630];
			int var2 = 0;
			for (int var3 = 0; var3 < field627; var3++) {
				for (int var4 = 0; var4 < field626; var4++) {
					var1[(field629 + var3) * field630 + field628 + var4] = field624[var2++];
				}
			}

			field624 = var1;
			field626 = field630;
			field627 = field631;
			field628 = 0;
			field629 = 0;
		}
	}

	@ObfuscatedName("DZSIRBWX.b(I)V")
	public void method189() {
		byte[] var1 = new byte[field627 * field626];
		int var2 = 0;
		for (int var3 = 0; var3 < field627; var3++) {
			for (int var4 = field626 - 1; var4 >= 0; var4--) {
				var1[var2++] = field624[field626 * var3 + var4];
			}
		}

		field624 = var1;
		field628 = field630 - field626 - field628;
	}

	@ObfuscatedName("DZSIRBWX.b(Z)V")
	public void method190() {
		byte[] var1 = new byte[field627 * field626];
		int var2 = 0;
		for (int var3 = field627 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < field626; var4++) {
				var1[var2++] = field624[field626 * var3 + var4];
			}
		}

		field624 = var1;
		field629 = field631 - field627 - field629;
	}

	@ObfuscatedName("DZSIRBWX.a(IIII)V")
	public void method191(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field625.length; var4++) {
			int var5 = field625[var4] >> 16 & 0xFF;
			var5 += arg1;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = field625[var4] >> 8 & 0xFF;
			var6 += arg2;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = field625[var4] & 0xFF;
			var7 += arg0;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			field625[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("DZSIRBWX.a(III)V")
	public void method192(int arg0, int arg1) {
		arg1 += field628;
		arg0 += field629;
		int var3 = KNERFXXY.field825 * arg0 + arg1;
		int var4 = 0;
		int var5 = field627;
		int var6 = field626;
		int var7 = KNERFXXY.field825 - var6;
		int var8 = 0;

		if (arg0 < KNERFXXY.field827) {
			int var9 = KNERFXXY.field827 - arg0;
			var5 -= var9;
			arg0 = KNERFXXY.field827;
			var4 += var6 * var9;
			var3 += KNERFXXY.field825 * var9;
		}

		if (arg0 + var5 > KNERFXXY.field828) {
			var5 -= arg0 + var5 - KNERFXXY.field828;
		}

		if (arg1 < KNERFXXY.field829) {
			int var10 = KNERFXXY.field829 - arg1;
			var6 -= var10;
			arg1 = KNERFXXY.field829;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > KNERFXXY.field830) {
			int var11 = arg1 + var6 - KNERFXXY.field830;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method193(var6, var8, KNERFXXY.field824, field624, var5, var3, var4, field625, var7);
		}
	}

	@ObfuscatedName("DZSIRBWX.a(II[I[BIIII[II)V")
	public void method193(int arg0, int arg1, int[] arg2, byte[] arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8) {
		int var10 = -(arg0 >> 2);
		arg0 = -(arg0 & 0x3);
		for (int var11 = -arg4; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg3[arg6++];
				if (var13 == 0) {
					arg5++;
				} else {
					arg2[arg5++] = arg7[var13 & 0xFF];
				}

				byte var14 = arg3[arg6++];
				if (var14 == 0) {
					arg5++;
				} else {
					arg2[arg5++] = arg7[var14 & 0xFF];
				}

				byte var15 = arg3[arg6++];
				if (var15 == 0) {
					arg5++;
				} else {
					arg2[arg5++] = arg7[var15 & 0xFF];
				}

				byte var16 = arg3[arg6++];
				if (var16 == 0) {
					arg5++;
				} else {
					arg2[arg5++] = arg7[var16 & 0xFF];
				}
			}

			for (int var17 = arg0; var17 < 0; var17++) {
				byte var18 = arg3[arg6++];
				if (var18 == 0) {
					arg5++;
				} else {
					arg2[arg5++] = arg7[var18 & 0xFF];
				}
			}

			arg5 += arg8;
			arg6 += arg1;
		}
	}
}
