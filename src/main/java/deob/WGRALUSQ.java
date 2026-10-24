package deob;

@ObfuscatedName("WGRALUSQ")
public final class WGRALUSQ extends WNEQSCWL {

	@ObfuscatedName("WGRALUSQ.N")
	public int field1450;

	@ObfuscatedName("WGRALUSQ.O")
	public int field1451;

	@ObfuscatedName("WGRALUSQ.I")
	public int[] field1445;

	@ObfuscatedName("WGRALUSQ.L")
	public int field1448;

	@ObfuscatedName("WGRALUSQ.M")
	public int field1449;

	@ObfuscatedName("WGRALUSQ.J")
	public int field1446;

	@ObfuscatedName("WGRALUSQ.K")
	public int field1447;

	@ObfuscatedName("WGRALUSQ.H")
	public byte[] field1444;

	public WGRALUSQ(ESUFCMYV arg0, String arg1, int arg2) {
		RGCGKKUR var4 = new RGCGKKUR(arg0.method205(arg1 + ".dat", null));
		RGCGKKUR var5 = new RGCGKKUR(arg0.method205("index.dat", null));
		var5.field1350 = var4.method457();
		field1450 = var5.method457();
		field1451 = var5.method457();
		int var6 = var5.method455();
		field1445 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			field1445[var7 + 1] = var5.method459();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field1350 += 2;
			var4.field1350 += var5.method457() * var5.method457();
			var5.field1350++;
		}

		field1448 = var5.method455();
		field1449 = var5.method455();
		field1446 = var5.method457();
		field1447 = var5.method457();
		int var9 = var5.method455();
		int var10 = field1447 * field1446;
		field1444 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				field1444[var11] = var4.method456();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < field1446; var12++) {
				for (int var13 = 0; var13 < field1447; var13++) {
					field1444[field1446 * var13 + var12] = var4.method456();
				}
			}
		}
	}

	@ObfuscatedName("WGRALUSQ.b(B)V")
	public void method561() {
		field1450 /= 2;
		field1451 /= 2;
		byte[] var1 = new byte[field1451 * field1450];
		int var2 = 0;
		for (int var3 = 0; var3 < field1447; var3++) {
			for (int var4 = 0; var4 < field1446; var4++) {
				var1[(field1448 + var4 >> 1) + (field1449 + var3 >> 1) * field1450] = field1444[var2++];
			}
		}

		field1444 = var1;
		field1446 = field1450;
		field1447 = field1451;
		field1448 = 0;
		field1449 = 0;
	}

	@ObfuscatedName("WGRALUSQ.a(I)V")
	public void method562() {
		if (field1450 != field1446 || field1451 != field1447) {
			byte[] var1 = new byte[field1451 * field1450];
			int var2 = 0;
			for (int var3 = 0; var3 < field1447; var3++) {
				for (int var4 = 0; var4 < field1446; var4++) {
					var1[(field1449 + var3) * field1450 + field1448 + var4] = field1444[var2++];
				}
			}

			field1444 = var1;
			field1446 = field1450;
			field1447 = field1451;
			field1448 = 0;
			field1449 = 0;
		}
	}

	@ObfuscatedName("WGRALUSQ.b(I)V")
	public void method563() {
		byte[] var1 = new byte[field1447 * field1446];
		int var2 = 0;
		for (int var3 = 0; var3 < field1447; var3++) {
			for (int var4 = field1446 - 1; var4 >= 0; var4--) {
				var1[var2++] = field1444[field1446 * var3 + var4];
			}
		}

		field1444 = var1;
		field1448 = field1450 - field1446 - field1448;
	}

	@ObfuscatedName("WGRALUSQ.c(I)V")
	public void method564() {
		byte[] var1 = new byte[field1447 * field1446];
		int var2 = 0;
		for (int var3 = field1447 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < field1446; var4++) {
				var1[var2++] = field1444[field1446 * var3 + var4];
			}
		}

		field1444 = var1;
		field1449 = field1451 - field1447 - field1449;
	}

	@ObfuscatedName("WGRALUSQ.a(IIII)V")
	public void method565(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field1445.length; var4++) {
			int var5 = field1445[var4] >> 16 & 0xFF;
			var5 += arg2;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = field1445[var4] >> 8 & 0xFF;
			var6 += arg0;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = field1445[var4] & 0xFF;
			var7 += arg1;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			field1445[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("WGRALUSQ.a(III)V")
	public void method566(int arg0, int arg1) {
		arg0 += field1448;
		arg1 += field1449;
		int var3 = WNEQSCWL.field1453 * arg1 + arg0;
		int var4 = 0;
		int var5 = field1447;
		int var6 = field1446;
		int var7 = WNEQSCWL.field1453 - var6;
		int var8 = 0;

		if (arg1 < WNEQSCWL.field1455) {
			int var9 = WNEQSCWL.field1455 - arg1;
			var5 -= var9;
			arg1 = WNEQSCWL.field1455;
			var4 += var6 * var9;
			var3 += WNEQSCWL.field1453 * var9;
		}

		if (arg1 + var5 > WNEQSCWL.field1456) {
			var5 -= arg1 + var5 - WNEQSCWL.field1456;
		}

		if (arg0 < WNEQSCWL.field1457) {
			int var10 = WNEQSCWL.field1457 - arg0;
			var6 -= var10;
			arg0 = WNEQSCWL.field1457;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > WNEQSCWL.field1458) {
			int var11 = arg0 + var6 - WNEQSCWL.field1458;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method567(var6, var4, WNEQSCWL.field1452, field1445, var7, field1444, var3, var8, var5);
		}
	}

	@ObfuscatedName("WGRALUSQ.a(II[I[II[BIIZI)V")
	public void method567(int arg0, int arg1, int[] arg2, int[] arg3, int arg4, byte[] arg5, int arg6, int arg7, int arg8) {
		int var10 = -(arg0 >> 2);
		arg0 = -(arg0 & 0x3);
		for (int var11 = -arg8; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg5[arg1++];
				if (var13 == 0) {
					arg6++;
				} else {
					arg2[arg6++] = arg3[var13 & 0xFF];
				}

				byte var14 = arg5[arg1++];
				if (var14 == 0) {
					arg6++;
				} else {
					arg2[arg6++] = arg3[var14 & 0xFF];
				}

				byte var15 = arg5[arg1++];
				if (var15 == 0) {
					arg6++;
				} else {
					arg2[arg6++] = arg3[var15 & 0xFF];
				}

				byte var16 = arg5[arg1++];
				if (var16 == 0) {
					arg6++;
				} else {
					arg2[arg6++] = arg3[var16 & 0xFF];
				}
			}

			for (int var17 = arg0; var17 < 0; var17++) {
				byte var18 = arg5[arg1++];
				if (var18 == 0) {
					arg6++;
				} else {
					arg2[arg6++] = arg3[var18 & 0xFF];
				}
			}

			arg6 += arg4;
			arg1 += arg7;
		}
	}
}
