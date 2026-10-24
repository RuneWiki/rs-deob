package deob;

@ObfuscatedName("ZXDQRRNS")
public final class ZXDQRRNS extends DEVPLWNC {

	@ObfuscatedName("ZXDQRRNS.G")
	public int field1514;

	@ObfuscatedName("ZXDQRRNS.H")
	public int field1515;

	@ObfuscatedName("ZXDQRRNS.B")
	public int[] field1509;

	@ObfuscatedName("ZXDQRRNS.E")
	public int field1512;

	@ObfuscatedName("ZXDQRRNS.F")
	public int field1513;

	@ObfuscatedName("ZXDQRRNS.C")
	public int field1510;

	@ObfuscatedName("ZXDQRRNS.D")
	public int field1511;

	@ObfuscatedName("ZXDQRRNS.A")
	public byte[] field1508;

	public ZXDQRRNS(WEMOPWVJ arg0, String arg1, int arg2) {
		SVWJKJVI var4 = new SVWJKJVI(arg0.method559(arg1 + ".dat", null));
		SVWJKJVI var5 = new SVWJKJVI(arg0.method559("index.dat", null));
		var5.field1263 = var4.method463();
		field1514 = var5.method463();
		field1515 = var5.method463();
		int var6 = var5.method461();
		field1509 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			field1509[var7 + 1] = var5.method465();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field1263 += 2;
			var4.field1263 += var5.method463() * var5.method463();
			var5.field1263++;
		}

		field1512 = var5.method461();
		field1513 = var5.method461();
		field1510 = var5.method463();
		field1511 = var5.method463();
		int var9 = var5.method461();
		int var10 = field1511 * field1510;
		field1508 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				field1508[var11] = var4.method462();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < field1510; var12++) {
				for (int var13 = 0; var13 < field1511; var13++) {
					field1508[field1510 * var13 + var12] = var4.method462();
				}
			}
		}
	}

	@ObfuscatedName("ZXDQRRNS.c(I)V")
	public void method594() {
		field1514 /= 2;
		field1515 /= 2;
		byte[] var1 = new byte[field1515 * field1514];
		int var2 = 0;
		for (int var3 = 0; var3 < field1511; var3++) {
			for (int var4 = 0; var4 < field1510; var4++) {
				var1[(field1512 + var4 >> 1) + (field1513 + var3 >> 1) * field1514] = field1508[var2++];
			}
		}

		field1508 = var1;
		field1510 = field1514;
		field1511 = field1515;
		field1512 = 0;
		field1513 = 0;
	}

	@ObfuscatedName("ZXDQRRNS.d(I)V")
	public void method595() {
		if (field1514 != field1510 || field1515 != field1511) {
			byte[] var1 = new byte[field1515 * field1514];
			int var2 = 0;
			for (int var3 = 0; var3 < field1511; var3++) {
				for (int var4 = 0; var4 < field1510; var4++) {
					var1[(field1513 + var3) * field1514 + field1512 + var4] = field1508[var2++];
				}
			}

			field1508 = var1;
			field1510 = field1514;
			field1511 = field1515;
			field1512 = 0;
			field1513 = 0;
		}
	}

	@ObfuscatedName("ZXDQRRNS.e(I)V")
	public void method596() {
		byte[] var1 = new byte[field1511 * field1510];
		int var2 = 0;
		for (int var3 = 0; var3 < field1511; var3++) {
			for (int var4 = field1510 - 1; var4 >= 0; var4--) {
				var1[var2++] = field1508[field1510 * var3 + var4];
			}
		}

		field1508 = var1;
		field1512 = field1514 - field1510 - field1512;
	}

	@ObfuscatedName("ZXDQRRNS.f(I)V")
	public void method597() {
		byte[] var1 = new byte[field1511 * field1510];
		int var2 = 0;
		for (int var3 = field1511 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < field1510; var4++) {
				var1[var2++] = field1508[field1510 * var3 + var4];
			}
		}

		field1508 = var1;
		field1513 = field1515 - field1511 - field1513;
	}

	@ObfuscatedName("ZXDQRRNS.a(IIII)V")
	public void method598(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field1509.length; var4++) {
			int var5 = field1509[var4] >> 16 & 0xFF;
			var5 += arg2;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = field1509[var4] >> 8 & 0xFF;
			var6 += arg1;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = field1509[var4] & 0xFF;
			var7 += arg0;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			field1509[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("ZXDQRRNS.a(IIB)V")
	public void method599(int arg0, int arg1) {
		arg1 += field1512;
		arg0 += field1513;
		int var3 = DEVPLWNC.field525 * arg0 + arg1;
		int var4 = 0;
		int var5 = field1511;
		int var6 = field1510;
		int var7 = DEVPLWNC.field525 - var6;
		int var8 = 0;

		if (arg0 < DEVPLWNC.field527) {
			int var9 = DEVPLWNC.field527 - arg0;
			var5 -= var9;
			arg0 = DEVPLWNC.field527;
			var4 += var6 * var9;
			var3 += DEVPLWNC.field525 * var9;
		}

		if (arg0 + var5 > DEVPLWNC.field528) {
			var5 -= arg0 + var5 - DEVPLWNC.field528;
		}

		if (arg1 < DEVPLWNC.field529) {
			int var10 = DEVPLWNC.field529 - arg1;
			var6 -= var10;
			arg1 = DEVPLWNC.field529;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > DEVPLWNC.field530) {
			int var11 = arg1 + var6 - DEVPLWNC.field530;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method600(var6, field1508, var4, var7, field1509, var8, var3, var5, DEVPLWNC.field524);
		}
	}

	@ObfuscatedName("ZXDQRRNS.a(IZ[BII[IIII[I)V")
	public void method600(int arg0, byte[] arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6, int arg7, int[] arg8) {
		int var10 = -(arg0 >> 2);
		arg0 = -(arg0 & 0x3);
		for (int var11 = -arg7; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg1[arg2++];
				if (var13 == 0) {
					arg6++;
				} else {
					arg8[arg6++] = arg4[var13 & 0xFF];
				}

				byte var14 = arg1[arg2++];
				if (var14 == 0) {
					arg6++;
				} else {
					arg8[arg6++] = arg4[var14 & 0xFF];
				}

				byte var15 = arg1[arg2++];
				if (var15 == 0) {
					arg6++;
				} else {
					arg8[arg6++] = arg4[var15 & 0xFF];
				}

				byte var16 = arg1[arg2++];
				if (var16 == 0) {
					arg6++;
				} else {
					arg8[arg6++] = arg4[var16 & 0xFF];
				}
			}

			for (int var17 = arg0; var17 < 0; var17++) {
				byte var18 = arg1[arg2++];
				if (var18 == 0) {
					arg6++;
				} else {
					arg8[arg6++] = arg4[var18 & 0xFF];
				}
			}

			arg6 += arg3;
			arg2 += arg5;
		}
	}
}
