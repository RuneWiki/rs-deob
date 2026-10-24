package deob;

@ObfuscatedName("SSCICQYX")
public final class SSCICQYX extends ZLDPKUPX {

	@ObfuscatedName("SSCICQYX.J")
	public int field1240;

	@ObfuscatedName("SSCICQYX.K")
	public int field1241;

	@ObfuscatedName("SSCICQYX.E")
	public int[] field1235;

	@ObfuscatedName("SSCICQYX.H")
	public int field1238;

	@ObfuscatedName("SSCICQYX.I")
	public int field1239;

	@ObfuscatedName("SSCICQYX.F")
	public int field1236;

	@ObfuscatedName("SSCICQYX.G")
	public int field1237;

	@ObfuscatedName("SSCICQYX.D")
	public byte[] field1234;

	public SSCICQYX(RPFMUSNN arg0, String arg1, int arg2) {
		WNCFPLWV var4 = new WNCFPLWV(arg0.method414(arg1 + ".dat", null));
		WNCFPLWV var5 = new WNCFPLWV(arg0.method414("index.dat", null));
		var5.field1375 = var4.method504();
		field1240 = var5.method504();
		field1241 = var5.method504();
		int var6 = var5.method502();
		field1235 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			field1235[var7 + 1] = var5.method506();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field1375 += 2;
			var4.field1375 += var5.method504() * var5.method504();
			var5.field1375++;
		}

		field1238 = var5.method502();
		field1239 = var5.method502();
		field1236 = var5.method504();
		field1237 = var5.method504();
		int var9 = var5.method502();
		int var10 = field1237 * field1236;
		field1234 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				field1234[var11] = var4.method503();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < field1236; var12++) {
				for (int var13 = 0; var13 < field1237; var13++) {
					field1234[field1236 * var13 + var12] = var4.method503();
				}
			}
		}
	}

	@ObfuscatedName("SSCICQYX.c(I)V")
	public void method423() {
		field1240 /= 2;
		field1241 /= 2;
		byte[] var1 = new byte[field1241 * field1240];
		int var2 = 0;
		for (int var3 = 0; var3 < field1237; var3++) {
			for (int var4 = 0; var4 < field1236; var4++) {
				var1[(field1238 + var4 >> 1) + (field1239 + var3 >> 1) * field1240] = field1234[var2++];
			}
		}

		field1234 = var1;
		field1236 = field1240;
		field1237 = field1241;
		field1238 = 0;
		field1239 = 0;
	}

	@ObfuscatedName("SSCICQYX.a(Z)V")
	public void method424() {
		if (field1240 != field1236 || field1241 != field1237) {
			byte[] var1 = new byte[field1241 * field1240];
			int var2 = 0;
			for (int var3 = 0; var3 < field1237; var3++) {
				for (int var4 = 0; var4 < field1236; var4++) {
					var1[(field1239 + var3) * field1240 + field1238 + var4] = field1234[var2++];
				}
			}

			field1234 = var1;
			field1236 = field1240;
			field1237 = field1241;
			field1238 = 0;
			field1239 = 0;
		}
	}

	@ObfuscatedName("SSCICQYX.a(B)V")
	public void method425() {
		byte[] var1 = new byte[field1237 * field1236];
		int var2 = 0;
		for (int var3 = 0; var3 < field1237; var3++) {
			for (int var4 = field1236 - 1; var4 >= 0; var4--) {
				var1[var2++] = field1234[field1236 * var3 + var4];
			}
		}

		field1234 = var1;
		field1238 = field1240 - field1236 - field1238;
	}

	@ObfuscatedName("SSCICQYX.b(Z)V")
	public void method426() {
		byte[] var1 = new byte[field1237 * field1236];
		int var2 = 0;
		for (int var3 = field1237 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < field1236; var4++) {
				var1[var2++] = field1234[field1236 * var3 + var4];
			}
		}

		field1234 = var1;
		field1239 = field1241 - field1237 - field1239;
	}

	@ObfuscatedName("SSCICQYX.a(IIII)V")
	public void method427(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field1235.length; var4++) {
			int var5 = field1235[var4] >> 16 & 0xFF;
			var5 += arg2;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = field1235[var4] >> 8 & 0xFF;
			var6 += arg1;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = field1235[var4] & 0xFF;
			var7 += arg0;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			field1235[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("SSCICQYX.a(ZII)V")
	public void method428(int arg0, int arg1) {
		arg0 += field1238;
		arg1 += field1239;
		int var3 = ZLDPKUPX.field1506 * arg1 + arg0;
		int var4 = 0;
		int var5 = field1237;
		int var6 = field1236;
		int var7 = ZLDPKUPX.field1506 - var6;
		int var8 = 0;

		if (arg1 < ZLDPKUPX.field1508) {
			int var9 = ZLDPKUPX.field1508 - arg1;
			var5 -= var9;
			arg1 = ZLDPKUPX.field1508;
			var4 += var6 * var9;
			var3 += ZLDPKUPX.field1506 * var9;
		}

		if (arg1 + var5 > ZLDPKUPX.field1509) {
			var5 -= arg1 + var5 - ZLDPKUPX.field1509;
		}

		if (arg0 < ZLDPKUPX.field1510) {
			int var10 = ZLDPKUPX.field1510 - arg0;
			var6 -= var10;
			arg0 = ZLDPKUPX.field1510;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > ZLDPKUPX.field1511) {
			int var11 = arg0 + var6 - ZLDPKUPX.field1511;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method429(var3, var6, field1234, var8, field1235, var7, var4, ZLDPKUPX.field1505, var5);
		}
	}

	@ObfuscatedName("SSCICQYX.a(II[BI[III[IIB)V")
	public void method429(int arg0, int arg1, byte[] arg2, int arg3, int[] arg4, int arg5, int arg6, int[] arg7, int arg8) {
		int var10 = -(arg1 >> 2);
		arg1 = -(arg1 & 0x3);
		for (int var11 = -arg8; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg2[arg6++];
				if (var13 == 0) {
					arg0++;
				} else {
					arg7[arg0++] = arg4[var13 & 0xFF];
				}

				byte var14 = arg2[arg6++];
				if (var14 == 0) {
					arg0++;
				} else {
					arg7[arg0++] = arg4[var14 & 0xFF];
				}

				byte var15 = arg2[arg6++];
				if (var15 == 0) {
					arg0++;
				} else {
					arg7[arg0++] = arg4[var15 & 0xFF];
				}

				byte var16 = arg2[arg6++];
				if (var16 == 0) {
					arg0++;
				} else {
					arg7[arg0++] = arg4[var16 & 0xFF];
				}
			}

			for (int var17 = arg1; var17 < 0; var17++) {
				byte var18 = arg2[arg6++];
				if (var18 == 0) {
					arg0++;
				} else {
					arg7[arg0++] = arg4[var18 & 0xFF];
				}
			}

			arg0 += arg5;
			arg6 += arg3;
		}
	}
}
