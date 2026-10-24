package deob;

@ObfuscatedName("SFVBUBEZ")
public final class SFVBUBEZ extends TIJYBGAE {

	@ObfuscatedName("SFVBUBEZ.I")
	public int field1280;

	@ObfuscatedName("SFVBUBEZ.J")
	public int field1281;

	@ObfuscatedName("SFVBUBEZ.D")
	public int[] field1275;

	@ObfuscatedName("SFVBUBEZ.G")
	public int field1278;

	@ObfuscatedName("SFVBUBEZ.H")
	public int field1279;

	@ObfuscatedName("SFVBUBEZ.E")
	public int field1276;

	@ObfuscatedName("SFVBUBEZ.F")
	public int field1277;

	@ObfuscatedName("SFVBUBEZ.C")
	public byte[] field1274;

	public SFVBUBEZ(AWEEREDT arg0, String arg1, int arg2) {
		IUVBENCV var4 = new IUVBENCV(arg0.method14(arg1 + ".dat", null));
		IUVBENCV var5 = new IUVBENCV(arg0.method14("index.dat", null));
		var5.field733 = var4.method247();
		field1280 = var5.method247();
		field1281 = var5.method247();
		int var6 = var5.method245();
		field1275 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			field1275[var7 + 1] = var5.method249();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field733 += 2;
			var4.field733 += var5.method247() * var5.method247();
			var5.field733++;
		}

		field1278 = var5.method245();
		field1279 = var5.method245();
		field1276 = var5.method247();
		field1277 = var5.method247();
		int var9 = var5.method245();
		int var10 = field1277 * field1276;
		field1274 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				field1274[var11] = var4.method246();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < field1276; var12++) {
				for (int var13 = 0; var13 < field1277; var13++) {
					field1274[field1276 * var13 + var12] = var4.method246();
				}
			}
		}
	}

	@ObfuscatedName("SFVBUBEZ.a(Z)V")
	public void method458() {
		field1280 /= 2;
		field1281 /= 2;
		byte[] var1 = new byte[field1281 * field1280];
		int var2 = 0;
		for (int var3 = 0; var3 < field1277; var3++) {
			for (int var4 = 0; var4 < field1276; var4++) {
				var1[(field1278 + var4 >> 1) + (field1279 + var3 >> 1) * field1280] = field1274[var2++];
			}
		}

		field1274 = var1;
		field1276 = field1280;
		field1277 = field1281;
		field1278 = 0;
		field1279 = 0;
	}

	@ObfuscatedName("SFVBUBEZ.a(B)V")
	public void method459() {
		if (field1280 != field1276 || field1281 != field1277) {
			byte[] var1 = new byte[field1281 * field1280];
			int var2 = 0;
			for (int var3 = 0; var3 < field1277; var3++) {
				for (int var4 = 0; var4 < field1276; var4++) {
					var1[(field1279 + var3) * field1280 + field1278 + var4] = field1274[var2++];
				}
			}

			field1274 = var1;
			field1276 = field1280;
			field1277 = field1281;
			field1278 = 0;
			field1279 = 0;
		}
	}

	@ObfuscatedName("SFVBUBEZ.b(Z)V")
	public void method460() {
		byte[] var1 = new byte[field1277 * field1276];
		int var2 = 0;
		for (int var3 = 0; var3 < field1277; var3++) {
			for (int var4 = field1276 - 1; var4 >= 0; var4--) {
				var1[var2++] = field1274[field1276 * var3 + var4];
			}
		}

		field1274 = var1;
		field1278 = field1280 - field1276 - field1278;
	}

	@ObfuscatedName("SFVBUBEZ.c(Z)V")
	public void method461() {
		byte[] var1 = new byte[field1277 * field1276];
		int var2 = 0;
		for (int var3 = field1277 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < field1276; var4++) {
				var1[var2++] = field1274[field1276 * var3 + var4];
			}
		}

		field1274 = var1;
		field1279 = field1281 - field1277 - field1279;
	}

	@ObfuscatedName("SFVBUBEZ.a(IIII)V")
	public void method462(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field1275.length; var4++) {
			int var5 = field1275[var4] >> 16 & 0xFF;
			var5 += arg0;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = field1275[var4] >> 8 & 0xFF;
			var6 += arg1;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = field1275[var4] & 0xFF;
			var7 += arg2;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			field1275[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("SFVBUBEZ.a(III)V")
	public void method463(int arg0, int arg1) {
		arg1 += field1278;
		arg0 += field1279;
		int var3 = TIJYBGAE.field1345 * arg0 + arg1;
		int var4 = 0;
		int var5 = field1277;
		int var6 = field1276;
		int var7 = TIJYBGAE.field1345 - var6;
		int var8 = 0;

		if (arg0 < TIJYBGAE.field1347) {
			int var9 = TIJYBGAE.field1347 - arg0;
			var5 -= var9;
			arg0 = TIJYBGAE.field1347;
			var4 += var6 * var9;
			var3 += TIJYBGAE.field1345 * var9;
		}

		if (arg0 + var5 > TIJYBGAE.field1348) {
			var5 -= arg0 + var5 - TIJYBGAE.field1348;
		}

		if (arg1 < TIJYBGAE.field1349) {
			int var10 = TIJYBGAE.field1349 - arg1;
			var6 -= var10;
			arg1 = TIJYBGAE.field1349;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > TIJYBGAE.field1350) {
			int var11 = arg1 + var6 - TIJYBGAE.field1350;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method464(field1274, var7, var5, var3, field1275, var8, TIJYBGAE.field1344, var6, var4);
		}
	}

	@ObfuscatedName("SFVBUBEZ.a([BIII[II[IIII)V")
	public void method464(byte[] arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int[] arg6, int arg7, int arg8) {
		int var10 = -(arg7 >> 2);
		arg7 = -(arg7 & 0x3);
		for (int var11 = -arg2; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg0[arg8++];
				if (var13 == 0) {
					arg3++;
				} else {
					arg6[arg3++] = arg4[var13 & 0xFF];
				}

				byte var14 = arg0[arg8++];
				if (var14 == 0) {
					arg3++;
				} else {
					arg6[arg3++] = arg4[var14 & 0xFF];
				}

				byte var15 = arg0[arg8++];
				if (var15 == 0) {
					arg3++;
				} else {
					arg6[arg3++] = arg4[var15 & 0xFF];
				}

				byte var16 = arg0[arg8++];
				if (var16 == 0) {
					arg3++;
				} else {
					arg6[arg3++] = arg4[var16 & 0xFF];
				}
			}

			for (int var17 = arg7; var17 < 0; var17++) {
				byte var18 = arg0[arg8++];
				if (var18 == 0) {
					arg3++;
				} else {
					arg6[arg3++] = arg4[var18 & 0xFF];
				}
			}

			arg3 += arg1;
			arg8 += arg5;
		}
	}
}
