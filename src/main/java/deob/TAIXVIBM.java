package deob;

@ObfuscatedName("TAIXVIBM")
public final class TAIXVIBM extends LRYUPGSZ {

	@ObfuscatedName("TAIXVIBM.K")
	public int field1254;

	@ObfuscatedName("TAIXVIBM.L")
	public int field1255;

	@ObfuscatedName("TAIXVIBM.F")
	public int[] field1249;

	@ObfuscatedName("TAIXVIBM.I")
	public int field1252;

	@ObfuscatedName("TAIXVIBM.J")
	public int field1253;

	@ObfuscatedName("TAIXVIBM.G")
	public int field1250;

	@ObfuscatedName("TAIXVIBM.H")
	public int field1251;

	@ObfuscatedName("TAIXVIBM.E")
	public byte[] field1248;

	public TAIXVIBM(LYZBHNJP arg0, String arg1, int arg2) {
		ZOMNSJJM var4 = new ZOMNSJJM(arg0.method290(arg1 + ".dat", null));
		ZOMNSJJM var5 = new ZOMNSJJM(arg0.method290("index.dat", null));
		var5.field1457 = var4.method549();
		field1254 = var5.method549();
		field1255 = var5.method549();
		int var6 = var5.method547();
		field1249 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			field1249[var7 + 1] = var5.method551();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field1457 += 2;
			var4.field1457 += var5.method549() * var5.method549();
			var5.field1457++;
		}

		field1252 = var5.method547();
		field1253 = var5.method547();
		field1250 = var5.method549();
		field1251 = var5.method549();
		int var9 = var5.method547();
		int var10 = field1251 * field1250;
		field1248 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				field1248[var11] = var4.method548();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < field1250; var12++) {
				for (int var13 = 0; var13 < field1251; var13++) {
					field1248[field1250 * var13 + var12] = var4.method548();
				}
			}
		}
	}

	@ObfuscatedName("TAIXVIBM.b(I)V")
	public void method423() {
		field1254 /= 2;
		field1255 /= 2;
		byte[] var1 = new byte[field1255 * field1254];
		int var2 = 0;
		for (int var3 = 0; var3 < field1251; var3++) {
			for (int var4 = 0; var4 < field1250; var4++) {
				var1[(field1252 + var4 >> 1) + (field1253 + var3 >> 1) * field1254] = field1248[var2++];
			}
		}

		field1248 = var1;
		field1250 = field1254;
		field1251 = field1255;
		field1252 = 0;
		field1253 = 0;
	}

	@ObfuscatedName("TAIXVIBM.c(I)V")
	public void method424() {
		if (field1254 != field1250 || field1255 != field1251) {
			byte[] var1 = new byte[field1255 * field1254];
			int var2 = 0;
			for (int var3 = 0; var3 < field1251; var3++) {
				for (int var4 = 0; var4 < field1250; var4++) {
					var1[(field1253 + var3) * field1254 + field1252 + var4] = field1248[var2++];
				}
			}

			field1248 = var1;
			field1250 = field1254;
			field1251 = field1255;
			field1252 = 0;
			field1253 = 0;
		}
	}

	@ObfuscatedName("TAIXVIBM.d(I)V")
	public void method425() {
		byte[] var1 = new byte[field1251 * field1250];
		int var2 = 0;
		for (int var3 = 0; var3 < field1251; var3++) {
			for (int var4 = field1250 - 1; var4 >= 0; var4--) {
				var1[var2++] = field1248[field1250 * var3 + var4];
			}
		}

		field1248 = var1;
		field1252 = field1254 - field1250 - field1252;
	}

	@ObfuscatedName("TAIXVIBM.a(Z)V")
	public void method426() {
		byte[] var1 = new byte[field1251 * field1250];
		int var2 = 0;
		for (int var3 = field1251 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < field1250; var4++) {
				var1[var2++] = field1248[field1250 * var3 + var4];
			}
		}

		field1248 = var1;
		field1253 = field1255 - field1251 - field1253;
	}

	@ObfuscatedName("TAIXVIBM.a(IZII)V")
	public void method427(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field1249.length; var4++) {
			int var5 = field1249[var4] >> 16 & 0xFF;
			var5 += arg0;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = field1249[var4] >> 8 & 0xFF;
			var6 += arg1;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = field1249[var4] & 0xFF;
			var7 += arg2;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			field1249[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("TAIXVIBM.a(III)V")
	public void method428(int arg0, int arg1) {
		arg1 += field1252;
		arg0 += field1253;
		int var3 = LRYUPGSZ.field880 * arg0 + arg1;
		int var4 = 0;
		int var5 = field1251;
		int var6 = field1250;
		int var7 = LRYUPGSZ.field880 - var6;
		int var8 = 0;

		if (arg0 < LRYUPGSZ.field882) {
			int var9 = LRYUPGSZ.field882 - arg0;
			var5 -= var9;
			arg0 = LRYUPGSZ.field882;
			var4 += var6 * var9;
			var3 += LRYUPGSZ.field880 * var9;
		}

		if (arg0 + var5 > LRYUPGSZ.field883) {
			var5 -= arg0 + var5 - LRYUPGSZ.field883;
		}

		if (arg1 < LRYUPGSZ.field884) {
			int var10 = LRYUPGSZ.field884 - arg1;
			var6 -= var10;
			arg1 = LRYUPGSZ.field884;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > LRYUPGSZ.field885) {
			int var11 = arg1 + var6 - LRYUPGSZ.field885;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method429(var3, LRYUPGSZ.field879, var8, field1249, var7, var6, field1248, var4, var5);
		}
	}

	@ObfuscatedName("TAIXVIBM.a(I[IIB[III[BII)V")
	public void method429(int arg0, int[] arg1, int arg2, int[] arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
		int var10 = -(arg5 >> 2);
		arg5 = -(arg5 & 0x3);
		for (int var11 = -arg8; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg6[arg7++];
				if (var13 == 0) {
					arg0++;
				} else {
					arg1[arg0++] = arg3[var13 & 0xFF];
				}

				byte var14 = arg6[arg7++];
				if (var14 == 0) {
					arg0++;
				} else {
					arg1[arg0++] = arg3[var14 & 0xFF];
				}

				byte var15 = arg6[arg7++];
				if (var15 == 0) {
					arg0++;
				} else {
					arg1[arg0++] = arg3[var15 & 0xFF];
				}

				byte var16 = arg6[arg7++];
				if (var16 == 0) {
					arg0++;
				} else {
					arg1[arg0++] = arg3[var16 & 0xFF];
				}
			}

			for (int var17 = arg5; var17 < 0; var17++) {
				byte var18 = arg6[arg7++];
				if (var18 == 0) {
					arg0++;
				} else {
					arg1[arg0++] = arg3[var18 & 0xFF];
				}
			}

			arg0 += arg4;
			arg7 += arg2;
		}
	}
}
