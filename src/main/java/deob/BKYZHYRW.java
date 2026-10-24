package deob;

@ObfuscatedName("BKYZHYRW")
public final class BKYZHYRW extends RSDCQVXF {

	@ObfuscatedName("BKYZHYRW.K")
	public int field33;

	@ObfuscatedName("BKYZHYRW.L")
	public int field34;

	@ObfuscatedName("BKYZHYRW.F")
	public int[] field28;

	@ObfuscatedName("BKYZHYRW.I")
	public int field31;

	@ObfuscatedName("BKYZHYRW.J")
	public int field32;

	@ObfuscatedName("BKYZHYRW.G")
	public int field29;

	@ObfuscatedName("BKYZHYRW.H")
	public int field30;

	@ObfuscatedName("BKYZHYRW.E")
	public byte[] field27;

	public BKYZHYRW(DYBMLHQM arg0, String arg1, int arg2) {
		INLHDAGO var4 = new INLHDAGO(arg0.method248(arg1 + ".dat", null));
		INLHDAGO var5 = new INLHDAGO(arg0.method248("index.dat", null));
		var5.field969 = var4.method310();
		field33 = var5.method310();
		field34 = var5.method310();
		int var6 = var5.method308();
		field28 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			field28[var7 + 1] = var5.method312();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field969 += 2;
			var4.field969 += var5.method310() * var5.method310();
			var5.field969++;
		}

		field31 = var5.method308();
		field32 = var5.method308();
		field29 = var5.method310();
		field30 = var5.method310();
		int var9 = var5.method308();
		int var10 = field30 * field29;
		field27 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				field27[var11] = var4.method309();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < field29; var12++) {
				for (int var13 = 0; var13 < field30; var13++) {
					field27[field29 * var13 + var12] = var4.method309();
				}
			}
		}
	}

	@ObfuscatedName("BKYZHYRW.c(Z)V")
	public void method5() {
		field33 /= 2;
		field34 /= 2;
		byte[] var1 = new byte[field34 * field33];
		int var2 = 0;
		for (int var3 = 0; var3 < field30; var3++) {
			for (int var4 = 0; var4 < field29; var4++) {
				var1[(field31 + var4 >> 1) + (field32 + var3 >> 1) * field33] = field27[var2++];
			}
		}

		field27 = var1;
		field29 = field33;
		field30 = field34;
		field31 = 0;
		field32 = 0;
	}

	@ObfuscatedName("BKYZHYRW.a(I)V")
	public void method6() {
		if (field33 != field29 || field34 != field30) {
			byte[] var1 = new byte[field34 * field33];
			int var2 = 0;
			for (int var3 = 0; var3 < field30; var3++) {
				for (int var4 = 0; var4 < field29; var4++) {
					var1[(field32 + var3) * field33 + field31 + var4] = field27[var2++];
				}
			}

			field27 = var1;
			field29 = field33;
			field30 = field34;
			field31 = 0;
			field32 = 0;
		}
	}

	@ObfuscatedName("BKYZHYRW.b(I)V")
	public void method7() {
		byte[] var1 = new byte[field30 * field29];
		int var2 = 0;
		for (int var3 = 0; var3 < field30; var3++) {
			for (int var4 = field29 - 1; var4 >= 0; var4--) {
				var1[var2++] = field27[field29 * var3 + var4];
			}
		}

		field27 = var1;
		field31 = field33 - field29 - field31;
	}

	@ObfuscatedName("BKYZHYRW.a(B)V")
	public void method8() {
		byte[] var1 = new byte[field30 * field29];
		int var2 = 0;
		for (int var3 = field30 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < field29; var4++) {
				var1[var2++] = field27[field29 * var3 + var4];
			}
		}

		field27 = var1;
		field32 = field34 - field30 - field32;
	}

	@ObfuscatedName("BKYZHYRW.a(IIII)V")
	public void method9(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field28.length; var4++) {
			int var5 = field28[var4] >> 16 & 0xFF;
			var5 += arg2;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = field28[var4] >> 8 & 0xFF;
			var6 += arg0;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = field28[var4] & 0xFF;
			var7 += arg1;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			field28[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("BKYZHYRW.a(IZI)V")
	public void method10(int arg0, int arg1) {
		arg1 += field31;
		arg0 += field32;
		int var3 = RSDCQVXF.field1193 * arg0 + arg1;
		int var4 = 0;
		int var5 = field30;
		int var6 = field29;
		int var7 = RSDCQVXF.field1193 - var6;
		int var8 = 0;

		if (arg0 < RSDCQVXF.field1195) {
			int var9 = RSDCQVXF.field1195 - arg0;
			var5 -= var9;
			arg0 = RSDCQVXF.field1195;
			var4 += var6 * var9;
			var3 += RSDCQVXF.field1193 * var9;
		}

		if (arg0 + var5 > RSDCQVXF.field1196) {
			var5 -= arg0 + var5 - RSDCQVXF.field1196;
		}

		if (arg1 < RSDCQVXF.field1197) {
			int var10 = RSDCQVXF.field1197 - arg1;
			var6 -= var10;
			arg1 = RSDCQVXF.field1197;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > RSDCQVXF.field1198) {
			int var11 = arg1 + var6 - RSDCQVXF.field1198;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method11(field28, var5, var3, var7, var8, var4, var6, RSDCQVXF.field1192, field27);
		}
	}

	@ObfuscatedName("BKYZHYRW.a([IIIIIIII[I[B)V")
	public void method11(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7, byte[] arg8) {
		int var10 = -(arg6 >> 2);
		arg6 = -(arg6 & 0x3);
		for (int var11 = -arg1; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg8[arg5++];
				if (var13 == 0) {
					arg2++;
				} else {
					arg7[arg2++] = arg0[var13 & 0xFF];
				}

				byte var14 = arg8[arg5++];
				if (var14 == 0) {
					arg2++;
				} else {
					arg7[arg2++] = arg0[var14 & 0xFF];
				}

				byte var15 = arg8[arg5++];
				if (var15 == 0) {
					arg2++;
				} else {
					arg7[arg2++] = arg0[var15 & 0xFF];
				}

				byte var16 = arg8[arg5++];
				if (var16 == 0) {
					arg2++;
				} else {
					arg7[arg2++] = arg0[var16 & 0xFF];
				}
			}

			for (int var17 = arg6; var17 < 0; var17++) {
				byte var18 = arg8[arg5++];
				if (var18 == 0) {
					arg2++;
				} else {
					arg7[arg2++] = arg0[var18 & 0xFF];
				}
			}

			arg2 += arg3;
			arg5 += arg4;
		}
	}
}
