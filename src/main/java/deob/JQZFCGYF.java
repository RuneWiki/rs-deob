package deob;

@ObfuscatedName("JQZFCGYF")
public final class JQZFCGYF extends JJXDTORW {

	@ObfuscatedName("JQZFCGYF.J")
	public int field1012;

	@ObfuscatedName("JQZFCGYF.K")
	public int field1013;

	@ObfuscatedName("JQZFCGYF.E")
	public int[] field1007;

	@ObfuscatedName("JQZFCGYF.H")
	public int field1010;

	@ObfuscatedName("JQZFCGYF.I")
	public int field1011;

	@ObfuscatedName("JQZFCGYF.F")
	public int field1008;

	@ObfuscatedName("JQZFCGYF.G")
	public int field1009;

	@ObfuscatedName("JQZFCGYF.D")
	public byte[] field1006;

	public JQZFCGYF(EAXVDNXA arg0, String arg1, int arg2) {
		CKBTFRZM var4 = new CKBTFRZM(arg0.method255(arg1 + ".dat", null));
		CKBTFRZM var5 = new CKBTFRZM(arg0.method255("index.dat", null));
		var5.field92 = var4.method46();
		field1012 = var5.method46();
		field1013 = var5.method46();
		int var6 = var5.method44();
		field1007 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			field1007[var7 + 1] = var5.method48();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field92 += 2;
			var4.field92 += var5.method46() * var5.method46();
			var5.field92++;
		}

		field1010 = var5.method44();
		field1011 = var5.method44();
		field1008 = var5.method46();
		field1009 = var5.method46();
		int var9 = var5.method44();
		int var10 = field1009 * field1008;
		field1006 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				field1006[var11] = var4.method45();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < field1008; var12++) {
				for (int var13 = 0; var13 < field1009; var13++) {
					field1006[field1008 * var13 + var12] = var4.method45();
				}
			}
		}
	}

	@ObfuscatedName("JQZFCGYF.b(I)V")
	public void method437() {
		field1012 /= 2;
		field1013 /= 2;
		byte[] var1 = new byte[field1013 * field1012];
		int var2 = 0;
		for (int var3 = 0; var3 < field1009; var3++) {
			for (int var4 = 0; var4 < field1008; var4++) {
				var1[(field1010 + var4 >> 1) + (field1011 + var3 >> 1) * field1012] = field1006[var2++];
			}
		}

		field1006 = var1;
		field1008 = field1012;
		field1009 = field1013;
		field1010 = 0;
		field1011 = 0;
	}

	@ObfuscatedName("JQZFCGYF.a(Z)V")
	public void method438() {
		if (field1012 != field1008 || field1013 != field1009) {
			byte[] var1 = new byte[field1013 * field1012];
			int var2 = 0;
			for (int var3 = 0; var3 < field1009; var3++) {
				for (int var4 = 0; var4 < field1008; var4++) {
					var1[(field1011 + var3) * field1012 + field1010 + var4] = field1006[var2++];
				}
			}

			field1006 = var1;
			field1008 = field1012;
			field1009 = field1013;
			field1010 = 0;
			field1011 = 0;
		}
	}

	@ObfuscatedName("JQZFCGYF.b(B)V")
	public void method439() {
		byte[] var1 = new byte[field1009 * field1008];
		int var2 = 0;
		for (int var3 = 0; var3 < field1009; var3++) {
			for (int var4 = field1008 - 1; var4 >= 0; var4--) {
				var1[var2++] = field1006[field1008 * var3 + var4];
			}
		}

		field1006 = var1;
		field1010 = field1012 - field1008 - field1010;
	}

	@ObfuscatedName("JQZFCGYF.b(Z)V")
	public void method440() {
		byte[] var1 = new byte[field1009 * field1008];
		int var2 = 0;
		for (int var3 = field1009 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < field1008; var4++) {
				var1[var2++] = field1006[field1008 * var3 + var4];
			}
		}

		field1006 = var1;
		field1011 = field1013 - field1009 - field1011;
	}

	@ObfuscatedName("JQZFCGYF.a(IIII)V")
	public void method441(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field1007.length; var4++) {
			int var5 = field1007[var4] >> 16 & 0xFF;
			var5 += arg0;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = field1007[var4] >> 8 & 0xFF;
			var6 += arg2;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = field1007[var4] & 0xFF;
			var7 += arg1;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			field1007[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("JQZFCGYF.a(IIZ)V")
	public void method442(int arg0, int arg1) {
		arg1 += field1010;
		arg0 += field1011;
		int var3 = JJXDTORW.field965 * arg0 + arg1;
		int var4 = 0;
		int var5 = field1009;
		int var6 = field1008;
		int var7 = JJXDTORW.field965 - var6;
		int var8 = 0;

		if (arg0 < JJXDTORW.field967) {
			int var9 = JJXDTORW.field967 - arg0;
			var5 -= var9;
			arg0 = JJXDTORW.field967;
			var4 += var6 * var9;
			var3 += JJXDTORW.field965 * var9;
		}

		if (arg0 + var5 > JJXDTORW.field968) {
			var5 -= arg0 + var5 - JJXDTORW.field968;
		}

		if (arg1 < JJXDTORW.field969) {
			int var10 = JJXDTORW.field969 - arg1;
			var6 -= var10;
			arg1 = JJXDTORW.field969;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > JJXDTORW.field970) {
			int var11 = arg1 + var6 - JJXDTORW.field970;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method443(var7, field1006, var3, field1007, var5, var4, JJXDTORW.field964, var8, var6);
		}
	}

	@ObfuscatedName("JQZFCGYF.a(I[BI[IIIZ[III)V")
	public void method443(int arg0, byte[] arg1, int arg2, int[] arg3, int arg4, int arg5, int[] arg6, int arg7, int arg8) {
		int var10 = -(arg8 >> 2);
		arg8 = -(arg8 & 0x3);
		for (int var11 = -arg4; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg1[arg5++];
				if (var13 == 0) {
					arg2++;
				} else {
					arg6[arg2++] = arg3[var13 & 0xFF];
				}

				byte var14 = arg1[arg5++];
				if (var14 == 0) {
					arg2++;
				} else {
					arg6[arg2++] = arg3[var14 & 0xFF];
				}

				byte var15 = arg1[arg5++];
				if (var15 == 0) {
					arg2++;
				} else {
					arg6[arg2++] = arg3[var15 & 0xFF];
				}

				byte var16 = arg1[arg5++];
				if (var16 == 0) {
					arg2++;
				} else {
					arg6[arg2++] = arg3[var16 & 0xFF];
				}
			}

			for (int var17 = arg8; var17 < 0; var17++) {
				byte var18 = arg1[arg5++];
				if (var18 == 0) {
					arg2++;
				} else {
					arg6[arg2++] = arg3[var18 & 0xFF];
				}
			}

			arg2 += arg0;
			arg5 += arg7;
		}
	}
}
