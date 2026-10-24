package deob;

@ObfuscatedName("YPWLUGYN")
public final class YPWLUGYN extends KVJNUKIT {

	@ObfuscatedName("YPWLUGYN.K")
	public int field1380;

	@ObfuscatedName("YPWLUGYN.L")
	public int field1381;

	@ObfuscatedName("YPWLUGYN.F")
	public int[] field1375;

	@ObfuscatedName("YPWLUGYN.I")
	public int field1378;

	@ObfuscatedName("YPWLUGYN.J")
	public int field1379;

	@ObfuscatedName("YPWLUGYN.G")
	public int field1376;

	@ObfuscatedName("YPWLUGYN.H")
	public int field1377;

	@ObfuscatedName("YPWLUGYN.E")
	public byte[] field1374;

	public YPWLUGYN(XMRRKSSB arg0, String arg1, int arg2) {
		XQPFGONL var4 = new XQPFGONL(arg0.method465(arg1 + ".dat", null));
		XQPFGONL var5 = new XQPFGONL(arg0.method465("index.dat", null));
		var5.field1335 = var4.method480();
		field1380 = var5.method480();
		field1381 = var5.method480();
		int var6 = var5.method478();
		field1375 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			field1375[var7 + 1] = var5.method482();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field1335 += 2;
			var4.field1335 += var5.method480() * var5.method480();
			var5.field1335++;
		}

		field1378 = var5.method478();
		field1379 = var5.method478();
		field1376 = var5.method480();
		field1377 = var5.method480();
		int var9 = var5.method478();
		int var10 = field1377 * field1376;
		field1374 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				field1374[var11] = var4.method479();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < field1376; var12++) {
				for (int var13 = 0; var13 < field1377; var13++) {
					field1374[field1376 * var13 + var12] = var4.method479();
				}
			}
		}
	}

	@ObfuscatedName("YPWLUGYN.a(I)V")
	public void method528() {
		field1380 /= 2;
		field1381 /= 2;
		byte[] var1 = new byte[field1381 * field1380];
		int var2 = 0;
		for (int var3 = 0; var3 < field1377; var3++) {
			for (int var4 = 0; var4 < field1376; var4++) {
				var1[(field1378 + var4 >> 1) + (field1379 + var3 >> 1) * field1380] = field1374[var2++];
			}
		}

		field1374 = var1;
		field1376 = field1380;
		field1377 = field1381;
		field1378 = 0;
		field1379 = 0;
	}

	@ObfuscatedName("YPWLUGYN.b(Z)V")
	public void method529() {
		if (field1380 != field1376 || field1381 != field1377) {
			byte[] var1 = new byte[field1381 * field1380];
			int var2 = 0;
			for (int var3 = 0; var3 < field1377; var3++) {
				for (int var4 = 0; var4 < field1376; var4++) {
					var1[(field1379 + var3) * field1380 + field1378 + var4] = field1374[var2++];
				}
			}

			field1374 = var1;
			field1376 = field1380;
			field1377 = field1381;
			field1378 = 0;
			field1379 = 0;
		}
	}

	@ObfuscatedName("YPWLUGYN.b(I)V")
	public void method530() {
		byte[] var1 = new byte[field1377 * field1376];
		int var2 = 0;
		for (int var3 = 0; var3 < field1377; var3++) {
			for (int var4 = field1376 - 1; var4 >= 0; var4--) {
				var1[var2++] = field1374[field1376 * var3 + var4];
			}
		}

		field1374 = var1;
		field1378 = field1380 - field1376 - field1378;
	}

	@ObfuscatedName("YPWLUGYN.c(I)V")
	public void method531() {
		byte[] var1 = new byte[field1377 * field1376];
		int var2 = 0;
		for (int var3 = field1377 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < field1376; var4++) {
				var1[var2++] = field1374[field1376 * var3 + var4];
			}
		}

		field1374 = var1;
		field1379 = field1381 - field1377 - field1379;
	}

	@ObfuscatedName("YPWLUGYN.a(IIII)V")
	public void method532(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field1375.length; var4++) {
			int var5 = field1375[var4] >> 16 & 0xFF;
			var5 += arg0;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = field1375[var4] >> 8 & 0xFF;
			var6 += arg2;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = field1375[var4] & 0xFF;
			var7 += arg1;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			field1375[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("YPWLUGYN.a(III)V")
	public void method533(int arg0, int arg1) {
		arg1 += field1378;
		arg0 += field1379;
		int var3 = KVJNUKIT.field952 * arg0 + arg1;
		int var4 = 0;
		int var5 = field1377;
		int var6 = field1376;
		int var7 = KVJNUKIT.field952 - var6;
		int var8 = 0;

		if (arg0 < KVJNUKIT.field954) {
			int var9 = KVJNUKIT.field954 - arg0;
			var5 -= var9;
			arg0 = KVJNUKIT.field954;
			var4 += var6 * var9;
			var3 += KVJNUKIT.field952 * var9;
		}

		if (arg0 + var5 > KVJNUKIT.field955) {
			var5 -= arg0 + var5 - KVJNUKIT.field955;
		}

		if (arg1 < KVJNUKIT.field956) {
			int var10 = KVJNUKIT.field956 - arg1;
			var6 -= var10;
			arg1 = KVJNUKIT.field956;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > KVJNUKIT.field957) {
			int var11 = arg1 + var6 - KVJNUKIT.field957;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method534(var8, field1375, field1374, var4, var6, KVJNUKIT.field951, var5, var7, var3);
		}
	}

	@ObfuscatedName("YPWLUGYN.a(I[I[BBII[IIII)V")
	public void method534(int arg0, int[] arg1, byte[] arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8) {
		int var10 = -(arg4 >> 2);
		arg4 = -(arg4 & 0x3);
		for (int var11 = -arg6; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg2[arg3++];
				if (var13 == 0) {
					arg8++;
				} else {
					arg5[arg8++] = arg1[var13 & 0xFF];
				}

				byte var14 = arg2[arg3++];
				if (var14 == 0) {
					arg8++;
				} else {
					arg5[arg8++] = arg1[var14 & 0xFF];
				}

				byte var15 = arg2[arg3++];
				if (var15 == 0) {
					arg8++;
				} else {
					arg5[arg8++] = arg1[var15 & 0xFF];
				}

				byte var16 = arg2[arg3++];
				if (var16 == 0) {
					arg8++;
				} else {
					arg5[arg8++] = arg1[var16 & 0xFF];
				}
			}

			for (int var17 = arg4; var17 < 0; var17++) {
				byte var18 = arg2[arg3++];
				if (var18 == 0) {
					arg8++;
				} else {
					arg5[arg8++] = arg1[var18 & 0xFF];
				}
			}

			arg8 += arg7;
			arg3 += arg0;
		}
	}
}
