package deob;

@ObfuscatedName("SFAIBATY")
public final class SFAIBATY extends CXMSQZVC {

	@ObfuscatedName("SFAIBATY.L")
	public int field1220;

	@ObfuscatedName("SFAIBATY.M")
	public int field1221;

	@ObfuscatedName("SFAIBATY.G")
	public int[] field1215;

	@ObfuscatedName("SFAIBATY.J")
	public int field1218;

	@ObfuscatedName("SFAIBATY.K")
	public int field1219;

	@ObfuscatedName("SFAIBATY.H")
	public int field1216;

	@ObfuscatedName("SFAIBATY.I")
	public int field1217;

	@ObfuscatedName("SFAIBATY.F")
	public byte[] field1214;

	public SFAIBATY(TXPLZUUI arg0, String arg1, int arg2) {
		PKHWFJLM var4 = new PKHWFJLM(arg0.method506(arg1 + ".dat", null));
		PKHWFJLM var5 = new PKHWFJLM(arg0.method506("index.dat", null));
		var5.field971 = var4.method332();
		field1220 = var5.method332();
		field1221 = var5.method332();
		int var6 = var5.method330();
		field1215 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			field1215[var7 + 1] = var5.method334();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field971 += 2;
			var4.field971 += var5.method332() * var5.method332();
			var5.field971++;
		}

		field1218 = var5.method330();
		field1219 = var5.method330();
		field1216 = var5.method332();
		field1217 = var5.method332();
		int var9 = var5.method330();
		int var10 = field1217 * field1216;
		field1214 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				field1214[var11] = var4.method331();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < field1216; var12++) {
				for (int var13 = 0; var13 < field1217; var13++) {
					field1214[field1216 * var13 + var12] = var4.method331();
				}
			}
		}
	}

	@ObfuscatedName("SFAIBATY.c(I)V")
	public void method468() {
		field1220 /= 2;
		field1221 /= 2;
		byte[] var1 = new byte[field1221 * field1220];
		int var2 = 0;
		for (int var3 = 0; var3 < field1217; var3++) {
			for (int var4 = 0; var4 < field1216; var4++) {
				var1[(field1218 + var4 >> 1) + (field1219 + var3 >> 1) * field1220] = field1214[var2++];
			}
		}

		field1214 = var1;
		field1216 = field1220;
		field1217 = field1221;
		field1218 = 0;
		field1219 = 0;
	}

	@ObfuscatedName("SFAIBATY.a(Z)V")
	public void method469() {
		if (field1220 != field1216 || field1221 != field1217) {
			byte[] var1 = new byte[field1221 * field1220];
			int var2 = 0;
			for (int var3 = 0; var3 < field1217; var3++) {
				for (int var4 = 0; var4 < field1216; var4++) {
					var1[(field1219 + var3) * field1220 + field1218 + var4] = field1214[var2++];
				}
			}

			field1214 = var1;
			field1216 = field1220;
			field1217 = field1221;
			field1218 = 0;
			field1219 = 0;
		}
	}

	@ObfuscatedName("SFAIBATY.d(I)V")
	public void method470() {
		byte[] var1 = new byte[field1217 * field1216];
		int var2 = 0;
		for (int var3 = 0; var3 < field1217; var3++) {
			for (int var4 = field1216 - 1; var4 >= 0; var4--) {
				var1[var2++] = field1214[field1216 * var3 + var4];
			}
		}

		field1214 = var1;
		field1218 = field1220 - field1216 - field1218;
	}

	@ObfuscatedName("SFAIBATY.b(Z)V")
	public void method471() {
		byte[] var1 = new byte[field1217 * field1216];
		int var2 = 0;
		for (int var3 = field1217 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < field1216; var4++) {
				var1[var2++] = field1214[field1216 * var3 + var4];
			}
		}

		field1214 = var1;
		field1219 = field1221 - field1217 - field1219;
	}

	@ObfuscatedName("SFAIBATY.a(ZIII)V")
	public void method472(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field1215.length; var4++) {
			int var5 = field1215[var4] >> 16 & 0xFF;
			var5 += arg0;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = field1215[var4] >> 8 & 0xFF;
			var6 += arg1;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = field1215[var4] & 0xFF;
			var7 += arg2;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			field1215[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("SFAIBATY.a(III)V")
	public void method473(int arg0, int arg1) {
		arg0 += field1218;
		arg1 += field1219;
		int var3 = CXMSQZVC.field568 * arg1 + arg0;
		int var4 = 0;
		int var5 = field1217;
		int var6 = field1216;
		int var7 = CXMSQZVC.field568 - var6;
		int var8 = 0;

		if (arg1 < CXMSQZVC.field570) {
			int var9 = CXMSQZVC.field570 - arg1;
			var5 -= var9;
			arg1 = CXMSQZVC.field570;
			var4 += var6 * var9;
			var3 += CXMSQZVC.field568 * var9;
		}

		if (arg1 + var5 > CXMSQZVC.field571) {
			var5 -= arg1 + var5 - CXMSQZVC.field571;
		}

		if (arg0 < CXMSQZVC.field572) {
			int var10 = CXMSQZVC.field572 - arg0;
			var6 -= var10;
			arg0 = CXMSQZVC.field572;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > CXMSQZVC.field573) {
			int var11 = arg0 + var6 - CXMSQZVC.field573;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method474(CXMSQZVC.field567, field1215, field1214, var7, var3, var6, var8, var4, var5);
		}
	}

	@ObfuscatedName("SFAIBATY.a([I[I[BBIIIIII)V")
	public void method474(int[] arg0, int[] arg1, byte[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
		int var10 = -(arg5 >> 2);
		arg5 = -(arg5 & 0x3);
		for (int var11 = -arg8; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg2[arg7++];
				if (var13 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg1[var13 & 0xFF];
				}

				byte var14 = arg2[arg7++];
				if (var14 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg1[var14 & 0xFF];
				}

				byte var15 = arg2[arg7++];
				if (var15 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg1[var15 & 0xFF];
				}

				byte var16 = arg2[arg7++];
				if (var16 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg1[var16 & 0xFF];
				}
			}

			for (int var17 = arg5; var17 < 0; var17++) {
				byte var18 = arg2[arg7++];
				if (var18 == 0) {
					arg4++;
				} else {
					arg0[arg4++] = arg1[var18 & 0xFF];
				}
			}

			arg4 += arg3;
			arg7 += arg6;
		}
	}
}
