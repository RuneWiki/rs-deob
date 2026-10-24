package deob;

@ObfuscatedName("ZQSBFHWZ")
public final class ZQSBFHWZ extends GBJWVQAY {

	@ObfuscatedName("ZQSBFHWZ.G")
	public int field1480;

	@ObfuscatedName("ZQSBFHWZ.H")
	public int field1481;

	@ObfuscatedName("ZQSBFHWZ.B")
	public int[] field1475;

	@ObfuscatedName("ZQSBFHWZ.E")
	public int field1478;

	@ObfuscatedName("ZQSBFHWZ.F")
	public int field1479;

	@ObfuscatedName("ZQSBFHWZ.C")
	public int field1476;

	@ObfuscatedName("ZQSBFHWZ.D")
	public int field1477;

	@ObfuscatedName("ZQSBFHWZ.A")
	public byte[] field1474;

	public ZQSBFHWZ(FUZJMGZB arg0, String arg1, int arg2) {
		LBBVYYXO var4 = new LBBVYYXO(arg0.method277(arg1 + ".dat", null));
		LBBVYYXO var5 = new LBBVYYXO(arg0.method277("index.dat", null));
		var5.field882 = var4.method371();
		field1480 = var5.method371();
		field1481 = var5.method371();
		int var6 = var5.method369();
		field1475 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			field1475[var7 + 1] = var5.method373();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field882 += 2;
			var4.field882 += var5.method371() * var5.method371();
			var5.field882++;
		}

		field1478 = var5.method369();
		field1479 = var5.method369();
		field1476 = var5.method371();
		field1477 = var5.method371();
		int var9 = var5.method369();
		int var10 = field1477 * field1476;
		field1474 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				field1474[var11] = var4.method370();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < field1476; var12++) {
				for (int var13 = 0; var13 < field1477; var13++) {
					field1474[field1476 * var13 + var12] = var4.method370();
				}
			}
		}
	}

	@ObfuscatedName("ZQSBFHWZ.b(I)V")
	public void method581() {
		field1480 /= 2;
		field1481 /= 2;
		byte[] var1 = new byte[field1481 * field1480];
		int var2 = 0;
		for (int var3 = 0; var3 < field1477; var3++) {
			for (int var4 = 0; var4 < field1476; var4++) {
				var1[(field1478 + var4 >> 1) + (field1479 + var3 >> 1) * field1480] = field1474[var2++];
			}
		}

		field1474 = var1;
		field1476 = field1480;
		field1477 = field1481;
		field1478 = 0;
		field1479 = 0;
	}

	@ObfuscatedName("ZQSBFHWZ.b(Z)V")
	public void method582() {
		if (field1480 != field1476 || field1481 != field1477) {
			byte[] var1 = new byte[field1481 * field1480];
			int var2 = 0;
			for (int var3 = 0; var3 < field1477; var3++) {
				for (int var4 = 0; var4 < field1476; var4++) {
					var1[(field1479 + var3) * field1480 + field1478 + var4] = field1474[var2++];
				}
			}

			field1474 = var1;
			field1476 = field1480;
			field1477 = field1481;
			field1478 = 0;
			field1479 = 0;
		}
	}

	@ObfuscatedName("ZQSBFHWZ.a(B)V")
	public void method583() {
		byte[] var1 = new byte[field1477 * field1476];
		int var2 = 0;
		for (int var3 = 0; var3 < field1477; var3++) {
			for (int var4 = field1476 - 1; var4 >= 0; var4--) {
				var1[var2++] = field1474[field1476 * var3 + var4];
			}
		}

		field1474 = var1;
		field1478 = field1480 - field1476 - field1478;
	}

	@ObfuscatedName("ZQSBFHWZ.c(I)V")
	public void method584() {
		byte[] var1 = new byte[field1477 * field1476];
		int var2 = 0;
		for (int var3 = field1477 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < field1476; var4++) {
				var1[var2++] = field1474[field1476 * var3 + var4];
			}
		}

		field1474 = var1;
		field1479 = field1481 - field1477 - field1479;
	}

	@ObfuscatedName("ZQSBFHWZ.a(IBII)V")
	public void method585(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field1475.length; var4++) {
			int var5 = field1475[var4] >> 16 & 0xFF;
			var5 += arg1;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = field1475[var4] >> 8 & 0xFF;
			var6 += arg0;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = field1475[var4] & 0xFF;
			var7 += arg2;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			field1475[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("ZQSBFHWZ.a(III)V")
	public void method586(int arg0, int arg1) {
		arg0 += field1478;
		arg1 += field1479;
		int var3 = GBJWVQAY.field821 * arg1 + arg0;
		int var4 = 0;
		int var5 = field1477;
		int var6 = field1476;
		int var7 = GBJWVQAY.field821 - var6;
		int var8 = 0;

		if (arg1 < GBJWVQAY.field823) {
			int var9 = GBJWVQAY.field823 - arg1;
			var5 -= var9;
			arg1 = GBJWVQAY.field823;
			var4 += var6 * var9;
			var3 += GBJWVQAY.field821 * var9;
		}

		if (arg1 + var5 > GBJWVQAY.field824) {
			var5 -= arg1 + var5 - GBJWVQAY.field824;
		}

		if (arg0 < GBJWVQAY.field825) {
			int var10 = GBJWVQAY.field825 - arg0;
			var6 -= var10;
			arg0 = GBJWVQAY.field825;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > GBJWVQAY.field826) {
			int var11 = arg0 + var6 - GBJWVQAY.field826;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method587(var3, var4, GBJWVQAY.field820, field1474, var7, field1475, var8, var6, var5);
		}
	}

	@ObfuscatedName("ZQSBFHWZ.a(II[I[BI[IIZII)V")
	public void method587(int arg0, int arg1, int[] arg2, byte[] arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8) {
		int var10 = -(arg7 >> 2);
		arg7 = -(arg7 & 0x3);
		for (int var11 = -arg8; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg3[arg1++];
				if (var13 == 0) {
					arg0++;
				} else {
					arg2[arg0++] = arg5[var13 & 0xFF];
				}

				byte var14 = arg3[arg1++];
				if (var14 == 0) {
					arg0++;
				} else {
					arg2[arg0++] = arg5[var14 & 0xFF];
				}

				byte var15 = arg3[arg1++];
				if (var15 == 0) {
					arg0++;
				} else {
					arg2[arg0++] = arg5[var15 & 0xFF];
				}

				byte var16 = arg3[arg1++];
				if (var16 == 0) {
					arg0++;
				} else {
					arg2[arg0++] = arg5[var16 & 0xFF];
				}
			}

			for (int var17 = arg7; var17 < 0; var17++) {
				byte var18 = arg3[arg1++];
				if (var18 == 0) {
					arg0++;
				} else {
					arg2[arg0++] = arg5[var18 & 0xFF];
				}
			}

			arg0 += arg4;
			arg1 += arg6;
		}
	}
}
