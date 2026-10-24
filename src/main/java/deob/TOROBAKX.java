package deob;

@ObfuscatedName("TOROBAKX")
public final class TOROBAKX extends ACKHPAZA {

	@ObfuscatedName("TOROBAKX.M")
	public int field1264;

	@ObfuscatedName("TOROBAKX.N")
	public int field1265;

	@ObfuscatedName("TOROBAKX.H")
	public int[] field1259;

	@ObfuscatedName("TOROBAKX.K")
	public int field1262;

	@ObfuscatedName("TOROBAKX.L")
	public int field1263;

	@ObfuscatedName("TOROBAKX.I")
	public int field1260;

	@ObfuscatedName("TOROBAKX.J")
	public int field1261;

	@ObfuscatedName("TOROBAKX.G")
	public byte[] field1258;

	public TOROBAKX(FIGUVTWB arg0, String arg1, int arg2) {
		MUKVLYLC var4 = new MUKVLYLC(arg0.method209(arg1 + ".dat", null));
		MUKVLYLC var5 = new MUKVLYLC(arg0.method209("index.dat", null));
		var5.field812 = var4.method294();
		field1264 = var5.method294();
		field1265 = var5.method294();
		int var6 = var5.method292();
		field1259 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			field1259[var7 + 1] = var5.method296();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field812 += 2;
			var4.field812 += var5.method294() * var5.method294();
			var5.field812++;
		}

		field1262 = var5.method292();
		field1263 = var5.method292();
		field1260 = var5.method294();
		field1261 = var5.method294();
		int var9 = var5.method292();
		int var10 = field1261 * field1260;
		field1258 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				field1258[var11] = var4.method293();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < field1260; var12++) {
				for (int var13 = 0; var13 < field1261; var13++) {
					field1258[field1260 * var13 + var12] = var4.method293();
				}
			}
		}
	}

	@ObfuscatedName("TOROBAKX.b(I)V")
	public void method495() {
		field1264 /= 2;
		field1265 /= 2;
		byte[] var1 = new byte[field1265 * field1264];
		int var2 = 0;
		for (int var3 = 0; var3 < field1261; var3++) {
			for (int var4 = 0; var4 < field1260; var4++) {
				var1[(field1262 + var4 >> 1) + (field1263 + var3 >> 1) * field1264] = field1258[var2++];
			}
		}

		field1258 = var1;
		field1260 = field1264;
		field1261 = field1265;
		field1262 = 0;
		field1263 = 0;
	}

	@ObfuscatedName("TOROBAKX.c(I)V")
	public void method496() {
		if (field1264 != field1260 || field1265 != field1261) {
			byte[] var1 = new byte[field1265 * field1264];
			int var2 = 0;
			for (int var3 = 0; var3 < field1261; var3++) {
				for (int var4 = 0; var4 < field1260; var4++) {
					var1[(field1263 + var3) * field1264 + field1262 + var4] = field1258[var2++];
				}
			}

			field1258 = var1;
			field1260 = field1264;
			field1261 = field1265;
			field1262 = 0;
			field1263 = 0;
		}
	}

	@ObfuscatedName("TOROBAKX.d(I)V")
	public void method497() {
		byte[] var1 = new byte[field1261 * field1260];
		int var2 = 0;
		for (int var3 = 0; var3 < field1261; var3++) {
			for (int var4 = field1260 - 1; var4 >= 0; var4--) {
				var1[var2++] = field1258[field1260 * var3 + var4];
			}
		}

		field1258 = var1;
		field1262 = field1264 - field1260 - field1262;
	}

	@ObfuscatedName("TOROBAKX.e(I)V")
	public void method498() {
		byte[] var1 = new byte[field1261 * field1260];
		int var2 = 0;
		for (int var3 = field1261 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < field1260; var4++) {
				var1[var2++] = field1258[field1260 * var3 + var4];
			}
		}

		field1258 = var1;
		field1263 = field1265 - field1261 - field1263;
	}

	@ObfuscatedName("TOROBAKX.a(IIZI)V")
	public void method499(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field1259.length; var4++) {
			int var5 = field1259[var4] >> 16 & 0xFF;
			var5 += arg0;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = field1259[var4] >> 8 & 0xFF;
			var6 += arg2;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = field1259[var4] & 0xFF;
			var7 += arg1;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			field1259[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("TOROBAKX.a(III)V")
	public void method500(int arg0, int arg1) {
		arg0 += field1262;
		arg1 += field1263;
		int var3 = ACKHPAZA.field2 * arg1 + arg0;
		int var4 = 0;
		int var5 = field1261;
		int var6 = field1260;
		int var7 = ACKHPAZA.field2 - var6;
		int var8 = 0;

		if (arg1 < ACKHPAZA.field4) {
			int var9 = ACKHPAZA.field4 - arg1;
			var5 -= var9;
			arg1 = ACKHPAZA.field4;
			var4 += var6 * var9;
			var3 += ACKHPAZA.field2 * var9;
		}

		if (arg1 + var5 > ACKHPAZA.field5) {
			var5 -= arg1 + var5 - ACKHPAZA.field5;
		}

		if (arg0 < ACKHPAZA.field6) {
			int var10 = ACKHPAZA.field6 - arg0;
			var6 -= var10;
			arg0 = ACKHPAZA.field6;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > ACKHPAZA.field7) {
			int var11 = arg0 + var6 - ACKHPAZA.field7;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method501(var6, var3, var4, var8, field1259, var5, ACKHPAZA.field1, field1258, var7);
		}
	}

	@ObfuscatedName("TOROBAKX.a(IIII[II[I[BBI)V")
	public void method501(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, int[] arg6, byte[] arg7, int arg8) {
		int var10 = -(arg0 >> 2);
		arg0 = -(arg0 & 0x3);
		for (int var11 = -arg5; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg7[arg2++];
				if (var13 == 0) {
					arg1++;
				} else {
					arg6[arg1++] = arg4[var13 & 0xFF];
				}

				byte var14 = arg7[arg2++];
				if (var14 == 0) {
					arg1++;
				} else {
					arg6[arg1++] = arg4[var14 & 0xFF];
				}

				byte var15 = arg7[arg2++];
				if (var15 == 0) {
					arg1++;
				} else {
					arg6[arg1++] = arg4[var15 & 0xFF];
				}

				byte var16 = arg7[arg2++];
				if (var16 == 0) {
					arg1++;
				} else {
					arg6[arg1++] = arg4[var16 & 0xFF];
				}
			}

			for (int var17 = arg0; var17 < 0; var17++) {
				byte var18 = arg7[arg2++];
				if (var18 == 0) {
					arg1++;
				} else {
					arg6[arg1++] = arg4[var18 & 0xFF];
				}
			}

			arg1 += arg8;
			arg2 += arg3;
		}
	}
}
