package deob;

@ObfuscatedName("KWBPZBYX")
public final class KWBPZBYX extends YYTDUXDR {

	@ObfuscatedName("KWBPZBYX.K")
	public int field910;

	@ObfuscatedName("KWBPZBYX.L")
	public int field911;

	@ObfuscatedName("KWBPZBYX.F")
	public int[] field905;

	@ObfuscatedName("KWBPZBYX.I")
	public int field908;

	@ObfuscatedName("KWBPZBYX.J")
	public int field909;

	@ObfuscatedName("KWBPZBYX.G")
	public int field906;

	@ObfuscatedName("KWBPZBYX.H")
	public int field907;

	@ObfuscatedName("KWBPZBYX.E")
	public byte[] field904;

	public KWBPZBYX(QDHHNYHL arg0, String arg1, int arg2) {
		PGNBHFUF var4 = new PGNBHFUF(arg0.method488(arg1 + ".dat", null));
		PGNBHFUF var5 = new PGNBHFUF(arg0.method488("index.dat", null));
		var5.field1082 = var4.method422();
		field910 = var5.method422();
		field911 = var5.method422();
		int var6 = var5.method420();
		field905 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			field905[var7 + 1] = var5.method424();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field1082 += 2;
			var4.field1082 += var5.method422() * var5.method422();
			var5.field1082++;
		}

		field908 = var5.method420();
		field909 = var5.method420();
		field906 = var5.method422();
		field907 = var5.method422();
		int var9 = var5.method420();
		int var10 = field907 * field906;
		field904 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				field904[var11] = var4.method421();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < field906; var12++) {
				for (int var13 = 0; var13 < field907; var13++) {
					field904[field906 * var13 + var12] = var4.method421();
				}
			}
		}
	}

	@ObfuscatedName("KWBPZBYX.a(B)V")
	public void method366() {
		field910 /= 2;
		field911 /= 2;
		byte[] var1 = new byte[field911 * field910];
		int var2 = 0;
		for (int var3 = 0; var3 < field907; var3++) {
			for (int var4 = 0; var4 < field906; var4++) {
				var1[(field908 + var4 >> 1) + (field909 + var3 >> 1) * field910] = field904[var2++];
			}
		}

		field904 = var1;
		field906 = field910;
		field907 = field911;
		field908 = 0;
		field909 = 0;
	}

	@ObfuscatedName("KWBPZBYX.b(I)V")
	public void method367() {
		if (field910 != field906 || field911 != field907) {
			byte[] var1 = new byte[field911 * field910];
			int var2 = 0;
			for (int var3 = 0; var3 < field907; var3++) {
				for (int var4 = 0; var4 < field906; var4++) {
					var1[(field909 + var3) * field910 + field908 + var4] = field904[var2++];
				}
			}

			field904 = var1;
			field906 = field910;
			field907 = field911;
			field908 = 0;
			field909 = 0;
		}
	}

	@ObfuscatedName("KWBPZBYX.c(I)V")
	public void method368() {
		byte[] var1 = new byte[field907 * field906];
		int var2 = 0;
		for (int var3 = 0; var3 < field907; var3++) {
			for (int var4 = field906 - 1; var4 >= 0; var4--) {
				var1[var2++] = field904[field906 * var3 + var4];
			}
		}

		field904 = var1;
		field908 = field910 - field906 - field908;
	}

	@ObfuscatedName("KWBPZBYX.d(I)V")
	public void method369() {
		byte[] var1 = new byte[field907 * field906];
		int var2 = 0;
		for (int var3 = field907 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < field906; var4++) {
				var1[var2++] = field904[field906 * var3 + var4];
			}
		}

		field904 = var1;
		field909 = field911 - field907 - field909;
	}

	@ObfuscatedName("KWBPZBYX.a(IIIB)V")
	public void method370(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field905.length; var4++) {
			int var5 = field905[var4] >> 16 & 0xFF;
			var5 += arg0;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = field905[var4] >> 8 & 0xFF;
			var6 += arg2;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = field905[var4] & 0xFF;
			var7 += arg1;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			field905[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("KWBPZBYX.a(IIZ)V")
	public void method371(int arg0, int arg1) {
		arg0 += field908;
		arg1 += field909;
		int var3 = YYTDUXDR.field1436 * arg1 + arg0;
		int var4 = 0;
		int var5 = field907;
		int var6 = field906;
		int var7 = YYTDUXDR.field1436 - var6;
		int var8 = 0;

		if (arg1 < YYTDUXDR.field1438) {
			int var9 = YYTDUXDR.field1438 - arg1;
			var5 -= var9;
			arg1 = YYTDUXDR.field1438;
			var4 += var6 * var9;
			var3 += YYTDUXDR.field1436 * var9;
		}

		if (arg1 + var5 > YYTDUXDR.field1439) {
			var5 -= arg1 + var5 - YYTDUXDR.field1439;
		}

		if (arg0 < YYTDUXDR.field1440) {
			int var10 = YYTDUXDR.field1440 - arg0;
			var6 -= var10;
			arg0 = YYTDUXDR.field1440;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > YYTDUXDR.field1441) {
			int var11 = arg0 + var6 - YYTDUXDR.field1441;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method372(var8, var4, field904, var6, var5, var7, YYTDUXDR.field1435, field905, var3);
		}
	}

	@ObfuscatedName("KWBPZBYX.a(II[BIIIB[I[II)V")
	public void method372(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, int[] arg6, int[] arg7, int arg8) {
		int var10 = -(arg3 >> 2);
		arg3 = -(arg3 & 0x3);
		for (int var11 = -arg4; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg2[arg1++];
				if (var13 == 0) {
					arg8++;
				} else {
					arg6[arg8++] = arg7[var13 & 0xFF];
				}

				byte var14 = arg2[arg1++];
				if (var14 == 0) {
					arg8++;
				} else {
					arg6[arg8++] = arg7[var14 & 0xFF];
				}

				byte var15 = arg2[arg1++];
				if (var15 == 0) {
					arg8++;
				} else {
					arg6[arg8++] = arg7[var15 & 0xFF];
				}

				byte var16 = arg2[arg1++];
				if (var16 == 0) {
					arg8++;
				} else {
					arg6[arg8++] = arg7[var16 & 0xFF];
				}
			}

			for (int var17 = arg3; var17 < 0; var17++) {
				byte var18 = arg2[arg1++];
				if (var18 == 0) {
					arg8++;
				} else {
					arg6[arg8++] = arg7[var18 & 0xFF];
				}
			}

			arg8 += arg5;
			arg1 += arg0;
		}
	}
}
