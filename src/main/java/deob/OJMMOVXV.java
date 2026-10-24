package deob;

@ObfuscatedName("OJMMOVXV")
public final class OJMMOVXV extends PGTLMTYR {

	@ObfuscatedName("OJMMOVXV.F")
	public int field915;

	@ObfuscatedName("OJMMOVXV.G")
	public int field916;

	@ObfuscatedName("OJMMOVXV.A")
	public int[] field910;

	@ObfuscatedName("OJMMOVXV.D")
	public int field913;

	@ObfuscatedName("OJMMOVXV.E")
	public int field914;

	@ObfuscatedName("OJMMOVXV.B")
	public int field911;

	@ObfuscatedName("OJMMOVXV.C")
	public int field912;

	@ObfuscatedName("OJMMOVXV.z")
	public byte[] field909;

	public OJMMOVXV(FXNTEMPE arg0, String arg1, int arg2) {
		RSWRPCHR var4 = new RSWRPCHR(arg0.method212(arg1 + ".dat", null));
		RSWRPCHR var5 = new RSWRPCHR(arg0.method212("index.dat", null));
		var5.field1038 = var4.method390();
		field915 = var5.method390();
		field916 = var5.method390();
		int var6 = var5.method388();
		field910 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			field910[var7 + 1] = var5.method392();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field1038 += 2;
			var4.field1038 += var5.method390() * var5.method390();
			var5.field1038++;
		}

		field913 = var5.method388();
		field914 = var5.method388();
		field911 = var5.method390();
		field912 = var5.method390();
		int var9 = var5.method388();
		int var10 = field912 * field911;
		field909 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				field909[var11] = var4.method389();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < field911; var12++) {
				for (int var13 = 0; var13 < field912; var13++) {
					field909[field911 * var13 + var12] = var4.method389();
				}
			}
		}
	}

	@ObfuscatedName("OJMMOVXV.a(Z)V")
	public void method315() {
		field915 /= 2;
		field916 /= 2;
		byte[] var1 = new byte[field916 * field915];
		int var2 = 0;
		for (int var3 = 0; var3 < field912; var3++) {
			for (int var4 = 0; var4 < field911; var4++) {
				var1[(field913 + var4 >> 1) + (field914 + var3 >> 1) * field915] = field909[var2++];
			}
		}

		field909 = var1;
		field911 = field915;
		field912 = field916;
		field913 = 0;
		field914 = 0;
	}

	@ObfuscatedName("OJMMOVXV.b(Z)V")
	public void method316() {
		if (field915 != field911 || field916 != field912) {
			byte[] var1 = new byte[field916 * field915];
			int var2 = 0;
			for (int var3 = 0; var3 < field912; var3++) {
				for (int var4 = 0; var4 < field911; var4++) {
					var1[(field914 + var3) * field915 + field913 + var4] = field909[var2++];
				}
			}

			field909 = var1;
			field911 = field915;
			field912 = field916;
			field913 = 0;
			field914 = 0;
		}
	}

	@ObfuscatedName("OJMMOVXV.c(Z)V")
	public void method317() {
		byte[] var1 = new byte[field912 * field911];
		int var2 = 0;
		for (int var3 = 0; var3 < field912; var3++) {
			for (int var4 = field911 - 1; var4 >= 0; var4--) {
				var1[var2++] = field909[field911 * var3 + var4];
			}
		}

		field909 = var1;
		field913 = field915 - field911 - field913;
	}

	@ObfuscatedName("OJMMOVXV.b(I)V")
	public void method318() {
		byte[] var1 = new byte[field912 * field911];
		int var2 = 0;
		for (int var3 = field912 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < field911; var4++) {
				var1[var2++] = field909[field911 * var3 + var4];
			}
		}

		field909 = var1;
		field914 = field916 - field912 - field914;
	}

	@ObfuscatedName("OJMMOVXV.a(IIIZ)V")
	public void method319(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field910.length; var4++) {
			int var5 = field910[var4] >> 16 & 0xFF;
			var5 += arg2;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = field910[var4] >> 8 & 0xFF;
			var6 += arg1;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = field910[var4] & 0xFF;
			var7 += arg0;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			field910[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("OJMMOVXV.a(BII)V")
	public void method320(int arg0, int arg1) {
		arg0 += field913;
		arg1 += field914;
		int var3 = PGTLMTYR.field951 * arg1 + arg0;
		int var4 = 0;
		int var5 = field912;
		int var6 = field911;
		int var7 = PGTLMTYR.field951 - var6;
		int var8 = 0;

		if (arg1 < PGTLMTYR.field953) {
			int var9 = PGTLMTYR.field953 - arg1;
			var5 -= var9;
			arg1 = PGTLMTYR.field953;
			var4 += var6 * var9;
			var3 += PGTLMTYR.field951 * var9;
		}

		if (arg1 + var5 > PGTLMTYR.field954) {
			var5 -= arg1 + var5 - PGTLMTYR.field954;
		}

		if (arg0 < PGTLMTYR.field955) {
			int var10 = PGTLMTYR.field955 - arg0;
			var6 -= var10;
			arg0 = PGTLMTYR.field955;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > PGTLMTYR.field956) {
			int var11 = arg0 + var6 - PGTLMTYR.field956;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method321(var5, var6, PGTLMTYR.field950, field910, var3, field909, var8, var7, var4);
		}
	}

	@ObfuscatedName("OJMMOVXV.a(II[I[III[BIII)V")
	public void method321(int arg0, int arg1, int[] arg2, int[] arg3, int arg4, byte[] arg5, int arg6, int arg7, int arg8) {
		int var10 = -(arg1 >> 2);
		arg1 = -(arg1 & 0x3);
		for (int var11 = -arg0; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg5[arg8++];
				if (var13 == 0) {
					arg4++;
				} else {
					arg2[arg4++] = arg3[var13 & 0xFF];
				}

				byte var14 = arg5[arg8++];
				if (var14 == 0) {
					arg4++;
				} else {
					arg2[arg4++] = arg3[var14 & 0xFF];
				}

				byte var15 = arg5[arg8++];
				if (var15 == 0) {
					arg4++;
				} else {
					arg2[arg4++] = arg3[var15 & 0xFF];
				}

				byte var16 = arg5[arg8++];
				if (var16 == 0) {
					arg4++;
				} else {
					arg2[arg4++] = arg3[var16 & 0xFF];
				}
			}

			for (int var17 = arg1; var17 < 0; var17++) {
				byte var18 = arg5[arg8++];
				if (var18 == 0) {
					arg4++;
				} else {
					arg2[arg4++] = arg3[var18 & 0xFF];
				}
			}

			arg4 += arg7;
			arg8 += arg6;
		}
	}
}
