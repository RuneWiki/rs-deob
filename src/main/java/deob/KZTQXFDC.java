package deob;

@ObfuscatedName("KZTQXFDC")
public final class KZTQXFDC extends JNJDBENA {

	@ObfuscatedName("KZTQXFDC.I")
	public int field854;

	@ObfuscatedName("KZTQXFDC.J")
	public int field855;

	@ObfuscatedName("KZTQXFDC.D")
	public int[] field849;

	@ObfuscatedName("KZTQXFDC.G")
	public int field852;

	@ObfuscatedName("KZTQXFDC.H")
	public int field853;

	@ObfuscatedName("KZTQXFDC.E")
	public int field850;

	@ObfuscatedName("KZTQXFDC.F")
	public int field851;

	@ObfuscatedName("KZTQXFDC.C")
	public byte[] field848;

	public KZTQXFDC(DTIATKJO arg0, String arg1, int arg2) {
		GHHPHSRU var4 = new GHHPHSRU(arg0.method168(arg1 + ".dat", null));
		GHHPHSRU var5 = new GHHPHSRU(arg0.method168("index.dat", null));
		var5.field667 = var4.method204();
		field854 = var5.method204();
		field855 = var5.method204();
		int var6 = var5.method202();
		field849 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			field849[var7 + 1] = var5.method206();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field667 += 2;
			var4.field667 += var5.method204() * var5.method204();
			var5.field667++;
		}

		field852 = var5.method202();
		field853 = var5.method202();
		field850 = var5.method204();
		field851 = var5.method204();
		int var9 = var5.method202();
		int var10 = field851 * field850;
		field848 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				field848[var11] = var4.method203();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < field850; var12++) {
				for (int var13 = 0; var13 < field851; var13++) {
					field848[field850 * var13 + var12] = var4.method203();
				}
			}
		}
	}

	@ObfuscatedName("KZTQXFDC.c(I)V")
	public void method295() {
		field854 /= 2;
		field855 /= 2;
		byte[] var1 = new byte[field855 * field854];
		int var2 = 0;
		for (int var3 = 0; var3 < field851; var3++) {
			for (int var4 = 0; var4 < field850; var4++) {
				var1[(field852 + var4 >> 1) + (field853 + var3 >> 1) * field854] = field848[var2++];
			}
		}

		field848 = var1;
		field850 = field854;
		field851 = field855;
		field852 = 0;
		field853 = 0;
	}

	@ObfuscatedName("KZTQXFDC.d(I)V")
	public void method296() {
		if (field854 != field850 || field855 != field851) {
			byte[] var1 = new byte[field855 * field854];
			int var2 = 0;
			for (int var3 = 0; var3 < field851; var3++) {
				for (int var4 = 0; var4 < field850; var4++) {
					var1[(field853 + var3) * field854 + field852 + var4] = field848[var2++];
				}
			}

			field848 = var1;
			field850 = field854;
			field851 = field855;
			field852 = 0;
			field853 = 0;
		}
	}

	@ObfuscatedName("KZTQXFDC.e(I)V")
	public void method297() {
		byte[] var1 = new byte[field851 * field850];
		int var2 = 0;
		for (int var3 = 0; var3 < field851; var3++) {
			for (int var4 = field850 - 1; var4 >= 0; var4--) {
				var1[var2++] = field848[field850 * var3 + var4];
			}
		}

		field848 = var1;
		field852 = field854 - field850 - field852;
	}

	@ObfuscatedName("KZTQXFDC.a(Z)V")
	public void method298() {
		byte[] var1 = new byte[field851 * field850];
		int var2 = 0;
		for (int var3 = field851 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < field850; var4++) {
				var1[var2++] = field848[field850 * var3 + var4];
			}
		}

		field848 = var1;
		field853 = field855 - field851 - field853;
	}

	@ObfuscatedName("KZTQXFDC.a(IIII)V")
	public void method299(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field849.length; var4++) {
			int var5 = field849[var4] >> 16 & 0xFF;
			var5 += arg1;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = field849[var4] >> 8 & 0xFF;
			var6 += arg2;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = field849[var4] & 0xFF;
			var7 += arg0;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			field849[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("KZTQXFDC.a(IZI)V")
	public void method300(int arg0, int arg1) {
		arg1 += field852;
		arg0 += field853;
		int var3 = JNJDBENA.field810 * arg0 + arg1;
		int var4 = 0;
		int var5 = field851;
		int var6 = field850;
		int var7 = JNJDBENA.field810 - var6;
		int var8 = 0;

		if (arg0 < JNJDBENA.field812) {
			int var9 = JNJDBENA.field812 - arg0;
			var5 -= var9;
			arg0 = JNJDBENA.field812;
			var4 += var6 * var9;
			var3 += JNJDBENA.field810 * var9;
		}

		if (arg0 + var5 > JNJDBENA.field813) {
			var5 -= arg0 + var5 - JNJDBENA.field813;
		}

		if (arg1 < JNJDBENA.field814) {
			int var10 = JNJDBENA.field814 - arg1;
			var6 -= var10;
			arg1 = JNJDBENA.field814;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > JNJDBENA.field815) {
			int var11 = arg1 + var6 - JNJDBENA.field815;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method301(var8, var5, field848, field849, var7, JNJDBENA.field809, var4, var3, var6);
		}
	}

	@ObfuscatedName("KZTQXFDC.a(II[B[II[IIIII)V")
	public void method301(int arg0, int arg1, byte[] arg2, int[] arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8) {
		int var10 = -(arg8 >> 2);
		arg8 = -(arg8 & 0x3);
		for (int var11 = -arg1; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg2[arg6++];
				if (var13 == 0) {
					arg7++;
				} else {
					arg5[arg7++] = arg3[var13 & 0xFF];
				}

				byte var14 = arg2[arg6++];
				if (var14 == 0) {
					arg7++;
				} else {
					arg5[arg7++] = arg3[var14 & 0xFF];
				}

				byte var15 = arg2[arg6++];
				if (var15 == 0) {
					arg7++;
				} else {
					arg5[arg7++] = arg3[var15 & 0xFF];
				}

				byte var16 = arg2[arg6++];
				if (var16 == 0) {
					arg7++;
				} else {
					arg5[arg7++] = arg3[var16 & 0xFF];
				}
			}

			for (int var17 = arg8; var17 < 0; var17++) {
				byte var18 = arg2[arg6++];
				if (var18 == 0) {
					arg7++;
				} else {
					arg5[arg7++] = arg3[var18 & 0xFF];
				}
			}

			arg7 += arg4;
			arg6 += arg0;
		}
	}
}
