package deob;

@ObfuscatedName("CMELCUKG")
public final class CMELCUKG extends ANTOHTCU {

	@ObfuscatedName("CMELCUKG.K")
	public int field579;

	@ObfuscatedName("CMELCUKG.L")
	public int field580;

	@ObfuscatedName("CMELCUKG.F")
	public int[] field574;

	@ObfuscatedName("CMELCUKG.I")
	public int field577;

	@ObfuscatedName("CMELCUKG.J")
	public int field578;

	@ObfuscatedName("CMELCUKG.G")
	public int field575;

	@ObfuscatedName("CMELCUKG.H")
	public int field576;

	@ObfuscatedName("CMELCUKG.E")
	public byte[] field573;

	public CMELCUKG(MAARFNGV arg0, String arg1, int arg2) {
		EMWAMCXW var4 = new EMWAMCXW(arg0.method332(arg1 + ".dat", null));
		EMWAMCXW var5 = new EMWAMCXW(arg0.method332("index.dat", null));
		var5.field617 = var4.method219();
		field579 = var5.method219();
		field580 = var5.method219();
		int var6 = var5.method217();
		field574 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			field574[var7 + 1] = var5.method221();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field617 += 2;
			var4.field617 += var5.method219() * var5.method219();
			var5.field617++;
		}

		field577 = var5.method217();
		field578 = var5.method217();
		field575 = var5.method219();
		field576 = var5.method219();
		int var9 = var5.method217();
		int var10 = field576 * field575;
		field573 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				field573[var11] = var4.method218();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < field575; var12++) {
				for (int var13 = 0; var13 < field576; var13++) {
					field573[field575 * var13 + var12] = var4.method218();
				}
			}
		}
	}

	@ObfuscatedName("CMELCUKG.b(I)V")
	public void method193() {
		field579 /= 2;
		field580 /= 2;
		byte[] var1 = new byte[field580 * field579];
		int var2 = 0;
		for (int var3 = 0; var3 < field576; var3++) {
			for (int var4 = 0; var4 < field575; var4++) {
				var1[(field577 + var4 >> 1) + (field578 + var3 >> 1) * field579] = field573[var2++];
			}
		}

		field573 = var1;
		field575 = field579;
		field576 = field580;
		field577 = 0;
		field578 = 0;
	}

	@ObfuscatedName("CMELCUKG.c(I)V")
	public void method194() {
		if (field579 != field575 || field580 != field576) {
			byte[] var1 = new byte[field580 * field579];
			int var2 = 0;
			for (int var3 = 0; var3 < field576; var3++) {
				for (int var4 = 0; var4 < field575; var4++) {
					var1[(field578 + var3) * field579 + field577 + var4] = field573[var2++];
				}
			}

			field573 = var1;
			field575 = field579;
			field576 = field580;
			field577 = 0;
			field578 = 0;
		}
	}

	@ObfuscatedName("CMELCUKG.b(Z)V")
	public void method195() {
		byte[] var1 = new byte[field576 * field575];
		int var2 = 0;
		for (int var3 = 0; var3 < field576; var3++) {
			for (int var4 = field575 - 1; var4 >= 0; var4--) {
				var1[var2++] = field573[field575 * var3 + var4];
			}
		}

		field573 = var1;
		field577 = field579 - field575 - field577;
	}

	@ObfuscatedName("CMELCUKG.a(B)V")
	public void method196() {
		byte[] var1 = new byte[field576 * field575];
		int var2 = 0;
		for (int var3 = field576 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < field575; var4++) {
				var1[var2++] = field573[field575 * var3 + var4];
			}
		}

		field573 = var1;
		field578 = field580 - field576 - field578;
	}

	@ObfuscatedName("CMELCUKG.a(IIZI)V")
	public void method197(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field574.length; var4++) {
			int var5 = field574[var4] >> 16 & 0xFF;
			var5 += arg0;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = field574[var4] >> 8 & 0xFF;
			var6 += arg2;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = field574[var4] & 0xFF;
			var7 += arg1;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			field574[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("CMELCUKG.a(III)V")
	public void method198(int arg0, int arg1) {
		arg0 += field577;
		arg1 += field578;
		int var3 = ANTOHTCU.field49 * arg1 + arg0;
		int var4 = 0;
		int var5 = field576;
		int var6 = field575;
		int var7 = ANTOHTCU.field49 - var6;
		int var8 = 0;

		if (arg1 < ANTOHTCU.field51) {
			int var9 = ANTOHTCU.field51 - arg1;
			var5 -= var9;
			arg1 = ANTOHTCU.field51;
			var4 += var6 * var9;
			var3 += ANTOHTCU.field49 * var9;
		}

		if (arg1 + var5 > ANTOHTCU.field52) {
			var5 -= arg1 + var5 - ANTOHTCU.field52;
		}

		if (arg0 < ANTOHTCU.field53) {
			int var10 = ANTOHTCU.field53 - arg0;
			var6 -= var10;
			arg0 = ANTOHTCU.field53;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > ANTOHTCU.field54) {
			int var11 = arg0 + var6 - ANTOHTCU.field54;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method199(var7, var5, var6, var8, field573, var3, ANTOHTCU.field48, var4, field574);
		}
	}

	@ObfuscatedName("CMELCUKG.a(IIIII[BI[II[I)V")
	public void method199(int arg0, int arg1, int arg2, int arg3, byte[] arg4, int arg5, int[] arg6, int arg7, int[] arg8) {
		int var10 = -(arg2 >> 2);
		arg2 = -(arg2 & 0x3);
		for (int var11 = -arg1; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg4[arg7++];
				if (var13 == 0) {
					arg5++;
				} else {
					arg6[arg5++] = arg8[var13 & 0xFF];
				}

				byte var14 = arg4[arg7++];
				if (var14 == 0) {
					arg5++;
				} else {
					arg6[arg5++] = arg8[var14 & 0xFF];
				}

				byte var15 = arg4[arg7++];
				if (var15 == 0) {
					arg5++;
				} else {
					arg6[arg5++] = arg8[var15 & 0xFF];
				}

				byte var16 = arg4[arg7++];
				if (var16 == 0) {
					arg5++;
				} else {
					arg6[arg5++] = arg8[var16 & 0xFF];
				}
			}

			for (int var17 = arg2; var17 < 0; var17++) {
				byte var18 = arg4[arg7++];
				if (var18 == 0) {
					arg5++;
				} else {
					arg6[arg5++] = arg8[var18 & 0xFF];
				}
			}

			arg5 += arg0;
			arg7 += arg3;
		}
	}
}
