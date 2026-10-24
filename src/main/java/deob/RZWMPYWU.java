package deob;

@ObfuscatedName("RZWMPYWU")
public final class RZWMPYWU extends NQLGXPRA {

	@ObfuscatedName("RZWMPYWU.E")
	public int field1185;

	@ObfuscatedName("RZWMPYWU.F")
	public int field1186;

	@ObfuscatedName("RZWMPYWU.z")
	public int[] field1180;

	@ObfuscatedName("RZWMPYWU.C")
	public int field1183;

	@ObfuscatedName("RZWMPYWU.D")
	public int field1184;

	@ObfuscatedName("RZWMPYWU.A")
	public int field1181;

	@ObfuscatedName("RZWMPYWU.B")
	public int field1182;

	@ObfuscatedName("RZWMPYWU.y")
	public byte[] field1179;

	public RZWMPYWU(INOFEYKQ arg0, String arg1, int arg2) {
		NHEPCMLW var4 = new NHEPCMLW(arg0.method277(arg1 + ".dat", null));
		NHEPCMLW var5 = new NHEPCMLW(arg0.method277("index.dat", null));
		var5.field965 = var4.method351();
		field1185 = var5.method351();
		field1186 = var5.method351();
		int var6 = var5.method349();
		field1180 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			field1180[var7 + 1] = var5.method353();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field965 += 2;
			var4.field965 += var5.method351() * var5.method351();
			var5.field965++;
		}

		field1183 = var5.method349();
		field1184 = var5.method349();
		field1181 = var5.method351();
		field1182 = var5.method351();
		int var9 = var5.method349();
		int var10 = field1182 * field1181;
		field1179 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				field1179[var11] = var4.method350();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < field1181; var12++) {
				for (int var13 = 0; var13 < field1182; var13++) {
					field1179[field1181 * var13 + var12] = var4.method350();
				}
			}
		}
	}

	@ObfuscatedName("RZWMPYWU.a(B)V")
	public void method437() {
		field1185 /= 2;
		field1186 /= 2;
		byte[] var1 = new byte[field1186 * field1185];
		int var2 = 0;
		for (int var3 = 0; var3 < field1182; var3++) {
			for (int var4 = 0; var4 < field1181; var4++) {
				var1[(field1183 + var4 >> 1) + (field1184 + var3 >> 1) * field1185] = field1179[var2++];
			}
		}

		field1179 = var1;
		field1181 = field1185;
		field1182 = field1186;
		field1183 = 0;
		field1184 = 0;
	}

	@ObfuscatedName("RZWMPYWU.c(I)V")
	public void method438() {
		if (field1185 != field1181 || field1186 != field1182) {
			byte[] var1 = new byte[field1186 * field1185];
			int var2 = 0;
			for (int var3 = 0; var3 < field1182; var3++) {
				for (int var4 = 0; var4 < field1181; var4++) {
					var1[(field1184 + var3) * field1185 + field1183 + var4] = field1179[var2++];
				}
			}

			field1179 = var1;
			field1181 = field1185;
			field1182 = field1186;
			field1183 = 0;
			field1184 = 0;
		}
	}

	@ObfuscatedName("RZWMPYWU.d(I)V")
	public void method439() {
		byte[] var1 = new byte[field1182 * field1181];
		int var2 = 0;
		for (int var3 = 0; var3 < field1182; var3++) {
			for (int var4 = field1181 - 1; var4 >= 0; var4--) {
				var1[var2++] = field1179[field1181 * var3 + var4];
			}
		}

		field1179 = var1;
		field1183 = field1185 - field1181 - field1183;
	}

	@ObfuscatedName("RZWMPYWU.e(I)V")
	public void method440() {
		byte[] var1 = new byte[field1182 * field1181];
		int var2 = 0;
		for (int var3 = field1182 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < field1181; var4++) {
				var1[var2++] = field1179[field1181 * var3 + var4];
			}
		}

		field1179 = var1;
		field1184 = field1186 - field1182 - field1184;
	}

	@ObfuscatedName("RZWMPYWU.a(IIIB)V")
	public void method441(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field1180.length; var4++) {
			int var5 = field1180[var4] >> 16 & 0xFF;
			var5 += arg0;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = field1180[var4] >> 8 & 0xFF;
			var6 += arg2;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = field1180[var4] & 0xFF;
			var7 += arg1;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			field1180[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("RZWMPYWU.a(IIB)V")
	public void method442(int arg0, int arg1) {
		arg0 += field1183;
		arg1 += field1184;
		int var3 = NQLGXPRA.field978 * arg1 + arg0;
		int var4 = 0;
		int var5 = field1182;
		int var6 = field1181;
		int var7 = NQLGXPRA.field978 - var6;
		int var8 = 0;

		if (arg1 < NQLGXPRA.field980) {
			int var9 = NQLGXPRA.field980 - arg1;
			var5 -= var9;
			arg1 = NQLGXPRA.field980;
			var4 += var6 * var9;
			var3 += NQLGXPRA.field978 * var9;
		}

		if (arg1 + var5 > NQLGXPRA.field981) {
			var5 -= arg1 + var5 - NQLGXPRA.field981;
		}

		if (arg0 < NQLGXPRA.field982) {
			int var10 = NQLGXPRA.field982 - arg0;
			var6 -= var10;
			arg0 = NQLGXPRA.field982;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > NQLGXPRA.field983) {
			int var11 = arg0 + var6 - NQLGXPRA.field983;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method443(var7, var5, var4, var6, field1179, var8, field1180, NQLGXPRA.field977, var3);
		}
	}

	@ObfuscatedName("RZWMPYWU.a(IIII[BI[II[II)V")
	public void method443(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int[] arg6, int[] arg7, int arg8) {
		int var10 = -(arg3 >> 2);
		arg3 = -(arg3 & 0x3);
		for (int var11 = -arg1; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg4[arg2++];
				if (var13 == 0) {
					arg8++;
				} else {
					arg7[arg8++] = arg6[var13 & 0xFF];
				}

				byte var14 = arg4[arg2++];
				if (var14 == 0) {
					arg8++;
				} else {
					arg7[arg8++] = arg6[var14 & 0xFF];
				}

				byte var15 = arg4[arg2++];
				if (var15 == 0) {
					arg8++;
				} else {
					arg7[arg8++] = arg6[var15 & 0xFF];
				}

				byte var16 = arg4[arg2++];
				if (var16 == 0) {
					arg8++;
				} else {
					arg7[arg8++] = arg6[var16 & 0xFF];
				}
			}

			for (int var17 = arg3; var17 < 0; var17++) {
				byte var18 = arg4[arg2++];
				if (var18 == 0) {
					arg8++;
				} else {
					arg7[arg8++] = arg6[var18 & 0xFF];
				}
			}

			arg8 += arg0;
			arg2 += arg5;
		}
	}
}
