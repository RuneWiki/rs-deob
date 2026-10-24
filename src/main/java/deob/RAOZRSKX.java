package deob;

@ObfuscatedName("RAOZRSKX")
public final class RAOZRSKX extends CCFLBOBS {

	@ObfuscatedName("RAOZRSKX.G")
	public int field1051;

	@ObfuscatedName("RAOZRSKX.H")
	public int field1052;

	@ObfuscatedName("RAOZRSKX.B")
	public int[] field1046;

	@ObfuscatedName("RAOZRSKX.E")
	public int field1049;

	@ObfuscatedName("RAOZRSKX.F")
	public int field1050;

	@ObfuscatedName("RAOZRSKX.C")
	public int field1047;

	@ObfuscatedName("RAOZRSKX.D")
	public int field1048;

	@ObfuscatedName("RAOZRSKX.A")
	public byte[] field1045;

	public RAOZRSKX(VSQMPWOM arg0, String arg1, int arg2) {
		BFQIDHPO var4 = new BFQIDHPO(arg0.method526(arg1 + ".dat", null));
		BFQIDHPO var5 = new BFQIDHPO(arg0.method526("index.dat", null));
		var5.field10 = var4.method56();
		field1051 = var5.method56();
		field1052 = var5.method56();
		int var6 = var5.method54();
		field1046 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			field1046[var7 + 1] = var5.method58();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field10 += 2;
			var4.field10 += var5.method56() * var5.method56();
			var5.field10++;
		}

		field1049 = var5.method54();
		field1050 = var5.method54();
		field1047 = var5.method56();
		field1048 = var5.method56();
		int var9 = var5.method54();
		int var10 = field1048 * field1047;
		field1045 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				field1045[var11] = var4.method55();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < field1047; var12++) {
				for (int var13 = 0; var13 < field1048; var13++) {
					field1045[field1047 * var13 + var12] = var4.method55();
				}
			}
		}
	}

	@ObfuscatedName("RAOZRSKX.b(I)V")
	public void method441() {
		field1051 /= 2;
		field1052 /= 2;
		byte[] var1 = new byte[field1052 * field1051];
		int var2 = 0;
		for (int var3 = 0; var3 < field1048; var3++) {
			for (int var4 = 0; var4 < field1047; var4++) {
				var1[(field1049 + var4 >> 1) + (field1050 + var3 >> 1) * field1051] = field1045[var2++];
			}
		}

		field1045 = var1;
		field1047 = field1051;
		field1048 = field1052;
		field1049 = 0;
		field1050 = 0;
	}

	@ObfuscatedName("RAOZRSKX.a(B)V")
	public void method442() {
		if (field1051 != field1047 || field1052 != field1048) {
			byte[] var1 = new byte[field1052 * field1051];
			int var2 = 0;
			for (int var3 = 0; var3 < field1048; var3++) {
				for (int var4 = 0; var4 < field1047; var4++) {
					var1[(field1050 + var3) * field1051 + field1049 + var4] = field1045[var2++];
				}
			}

			field1045 = var1;
			field1047 = field1051;
			field1048 = field1052;
			field1049 = 0;
			field1050 = 0;
		}
	}

	@ObfuscatedName("RAOZRSKX.c(I)V")
	public void method443() {
		byte[] var1 = new byte[field1048 * field1047];
		int var2 = 0;
		for (int var3 = 0; var3 < field1048; var3++) {
			for (int var4 = field1047 - 1; var4 >= 0; var4--) {
				var1[var2++] = field1045[field1047 * var3 + var4];
			}
		}

		field1045 = var1;
		field1049 = field1051 - field1047 - field1049;
	}

	@ObfuscatedName("RAOZRSKX.b(B)V")
	public void method444() {
		byte[] var1 = new byte[field1048 * field1047];
		int var2 = 0;
		for (int var3 = field1048 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < field1047; var4++) {
				var1[var2++] = field1045[field1047 * var3 + var4];
			}
		}

		field1045 = var1;
		field1050 = field1052 - field1048 - field1050;
	}

	@ObfuscatedName("RAOZRSKX.a(IIII)V")
	public void method445(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field1046.length; var4++) {
			int var5 = field1046[var4] >> 16 & 0xFF;
			var5 += arg0;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = field1046[var4] >> 8 & 0xFF;
			var6 += arg1;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = field1046[var4] & 0xFF;
			var7 += arg2;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			field1046[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("RAOZRSKX.a(IBI)V")
	public void method446(int arg0, int arg1) {
		arg1 += field1049;
		arg0 += field1050;
		int var3 = CCFLBOBS.field91 * arg0 + arg1;
		int var4 = 0;
		int var5 = field1048;
		int var6 = field1047;
		int var7 = CCFLBOBS.field91 - var6;
		int var8 = 0;

		if (arg0 < CCFLBOBS.field93) {
			int var9 = CCFLBOBS.field93 - arg0;
			var5 -= var9;
			arg0 = CCFLBOBS.field93;
			var4 += var6 * var9;
			var3 += CCFLBOBS.field91 * var9;
		}

		if (arg0 + var5 > CCFLBOBS.field94) {
			var5 -= arg0 + var5 - CCFLBOBS.field94;
		}

		if (arg1 < CCFLBOBS.field95) {
			int var10 = CCFLBOBS.field95 - arg1;
			var6 -= var10;
			arg1 = CCFLBOBS.field95;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > CCFLBOBS.field96) {
			int var11 = arg1 + var6 - CCFLBOBS.field96;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method447(var5, CCFLBOBS.field90, var6, field1045, field1046, var8, var7, var3, var4);
		}
	}

	@ObfuscatedName("RAOZRSKX.a(I[II[B[IIIIII)V")
	public void method447(int arg0, int[] arg1, int arg2, byte[] arg3, int[] arg4, int arg5, int arg6, int arg7, int arg8) {
		int var10 = -(arg2 >> 2);
		arg2 = -(arg2 & 0x3);
		for (int var11 = -arg0; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg3[arg8++];
				if (var13 == 0) {
					arg7++;
				} else {
					arg1[arg7++] = arg4[var13 & 0xFF];
				}

				byte var14 = arg3[arg8++];
				if (var14 == 0) {
					arg7++;
				} else {
					arg1[arg7++] = arg4[var14 & 0xFF];
				}

				byte var15 = arg3[arg8++];
				if (var15 == 0) {
					arg7++;
				} else {
					arg1[arg7++] = arg4[var15 & 0xFF];
				}

				byte var16 = arg3[arg8++];
				if (var16 == 0) {
					arg7++;
				} else {
					arg1[arg7++] = arg4[var16 & 0xFF];
				}
			}

			for (int var17 = arg2; var17 < 0; var17++) {
				byte var18 = arg3[arg8++];
				if (var18 == 0) {
					arg7++;
				} else {
					arg1[arg7++] = arg4[var18 & 0xFF];
				}
			}

			arg7 += arg6;
			arg8 += arg5;
		}
	}
}
