package deob;

@ObfuscatedName("TKCVVLIT")
public final class TKCVVLIT extends GEFFBGXP {

	@ObfuscatedName("TKCVVLIT.I")
	public int field1389;

	@ObfuscatedName("TKCVVLIT.J")
	public int field1390;

	@ObfuscatedName("TKCVVLIT.D")
	public int[] field1384;

	@ObfuscatedName("TKCVVLIT.G")
	public int field1387;

	@ObfuscatedName("TKCVVLIT.H")
	public int field1388;

	@ObfuscatedName("TKCVVLIT.E")
	public int field1385;

	@ObfuscatedName("TKCVVLIT.F")
	public int field1386;

	@ObfuscatedName("TKCVVLIT.C")
	public byte[] field1383;

	public TKCVVLIT(MNPBQFWE arg0, String arg1, int arg2) {
		BJPWOXRJ var4 = new BJPWOXRJ(arg0.method429(arg1 + ".dat", null));
		BJPWOXRJ var5 = new BJPWOXRJ(arg0.method429("index.dat", null));
		var5.field5 = var4.method17();
		field1389 = var5.method17();
		field1390 = var5.method17();
		int var6 = var5.method15();
		field1384 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			field1384[var7 + 1] = var5.method19();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field5 += 2;
			var4.field5 += var5.method17() * var5.method17();
			var5.field5++;
		}

		field1387 = var5.method15();
		field1388 = var5.method15();
		field1385 = var5.method17();
		field1386 = var5.method17();
		int var9 = var5.method15();
		int var10 = field1386 * field1385;
		field1383 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				field1383[var11] = var4.method16();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < field1385; var12++) {
				for (int var13 = 0; var13 < field1386; var13++) {
					field1383[field1385 * var13 + var12] = var4.method16();
				}
			}
		}
	}

	@ObfuscatedName("TKCVVLIT.a(I)V")
	public void method513() {
		field1389 /= 2;
		field1390 /= 2;
		byte[] var1 = new byte[field1390 * field1389];
		int var2 = 0;
		for (int var3 = 0; var3 < field1386; var3++) {
			for (int var4 = 0; var4 < field1385; var4++) {
				var1[(field1387 + var4 >> 1) + (field1388 + var3 >> 1) * field1389] = field1383[var2++];
			}
		}

		field1383 = var1;
		field1385 = field1389;
		field1386 = field1390;
		field1387 = 0;
		field1388 = 0;
	}

	@ObfuscatedName("TKCVVLIT.b(I)V")
	public void method514() {
		if (field1389 != field1385 || field1390 != field1386) {
			byte[] var1 = new byte[field1390 * field1389];
			int var2 = 0;
			for (int var3 = 0; var3 < field1386; var3++) {
				for (int var4 = 0; var4 < field1385; var4++) {
					var1[(field1388 + var3) * field1389 + field1387 + var4] = field1383[var2++];
				}
			}

			field1383 = var1;
			field1385 = field1389;
			field1386 = field1390;
			field1387 = 0;
			field1388 = 0;
		}
	}

	@ObfuscatedName("TKCVVLIT.c(I)V")
	public void method515() {
		byte[] var1 = new byte[field1386 * field1385];
		int var2 = 0;
		for (int var3 = 0; var3 < field1386; var3++) {
			for (int var4 = field1385 - 1; var4 >= 0; var4--) {
				var1[var2++] = field1383[field1385 * var3 + var4];
			}
		}

		field1383 = var1;
		field1387 = field1389 - field1385 - field1387;
	}

	@ObfuscatedName("TKCVVLIT.d(I)V")
	public void method516() {
		byte[] var1 = new byte[field1386 * field1385];
		int var2 = 0;
		for (int var3 = field1386 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < field1385; var4++) {
				var1[var2++] = field1383[field1385 * var3 + var4];
			}
		}

		field1383 = var1;
		field1388 = field1390 - field1386 - field1388;
	}

	@ObfuscatedName("TKCVVLIT.a(IIII)V")
	public void method517(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field1384.length; var4++) {
			int var5 = field1384[var4] >> 16 & 0xFF;
			var5 += arg0;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = field1384[var4] >> 8 & 0xFF;
			var6 += arg2;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = field1384[var4] & 0xFF;
			var7 += arg1;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			field1384[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("TKCVVLIT.a(IIZ)V")
	public void method518(int arg0, int arg1) {
		arg0 += field1387;
		arg1 += field1388;
		int var3 = GEFFBGXP.field623 * arg1 + arg0;
		int var4 = 0;
		int var5 = field1386;
		int var6 = field1385;
		int var7 = GEFFBGXP.field623 - var6;
		int var8 = 0;

		if (arg1 < GEFFBGXP.field625) {
			int var9 = GEFFBGXP.field625 - arg1;
			var5 -= var9;
			arg1 = GEFFBGXP.field625;
			var4 += var6 * var9;
			var3 += GEFFBGXP.field623 * var9;
		}

		if (arg1 + var5 > GEFFBGXP.field626) {
			var5 -= arg1 + var5 - GEFFBGXP.field626;
		}

		if (arg0 < GEFFBGXP.field627) {
			int var10 = GEFFBGXP.field627 - arg0;
			var6 -= var10;
			arg0 = GEFFBGXP.field627;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > GEFFBGXP.field628) {
			int var11 = arg0 + var6 - GEFFBGXP.field628;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method519(field1383, var7, var8, var4, var5, field1384, GEFFBGXP.field622, var6, var3);
		}
	}

	@ObfuscatedName("TKCVVLIT.a([BIIIII[I[III)V")
	public void method519(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6, int arg7, int arg8) {
		int var10 = -(arg7 >> 2);
		arg7 = -(arg7 & 0x3);
		for (int var11 = -arg4; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg0[arg3++];
				if (var13 == 0) {
					arg8++;
				} else {
					arg6[arg8++] = arg5[var13 & 0xFF];
				}

				byte var14 = arg0[arg3++];
				if (var14 == 0) {
					arg8++;
				} else {
					arg6[arg8++] = arg5[var14 & 0xFF];
				}

				byte var15 = arg0[arg3++];
				if (var15 == 0) {
					arg8++;
				} else {
					arg6[arg8++] = arg5[var15 & 0xFF];
				}

				byte var16 = arg0[arg3++];
				if (var16 == 0) {
					arg8++;
				} else {
					arg6[arg8++] = arg5[var16 & 0xFF];
				}
			}

			for (int var17 = arg7; var17 < 0; var17++) {
				byte var18 = arg0[arg3++];
				if (var18 == 0) {
					arg8++;
				} else {
					arg6[arg8++] = arg5[var18 & 0xFF];
				}
			}

			arg8 += arg1;
			arg3 += arg2;
		}
	}
}
