package deob;

@ObfuscatedName("NUXLZYAZ")
public final class NUXLZYAZ extends UKUXLUWP {

	@ObfuscatedName("NUXLZYAZ.H")
	public int field994;

	@ObfuscatedName("NUXLZYAZ.I")
	public int field995;

	@ObfuscatedName("NUXLZYAZ.C")
	public int[] field989;

	@ObfuscatedName("NUXLZYAZ.F")
	public int field992;

	@ObfuscatedName("NUXLZYAZ.G")
	public int field993;

	@ObfuscatedName("NUXLZYAZ.D")
	public int field990;

	@ObfuscatedName("NUXLZYAZ.E")
	public int field991;

	@ObfuscatedName("NUXLZYAZ.B")
	public byte[] field988;

	public NUXLZYAZ(GWOEELWB arg0, String arg1, int arg2) {
		MLYYHULT var4 = new MLYYHULT(arg0.method249(arg1 + ".dat", null));
		MLYYHULT var5 = new MLYYHULT(arg0.method249("index.dat", null));
		var5.field963 = var4.method298();
		field994 = var5.method298();
		field995 = var5.method298();
		int var6 = var5.method296();
		field989 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			field989[var7 + 1] = var5.method300();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field963 += 2;
			var4.field963 += var5.method298() * var5.method298();
			var5.field963++;
		}

		field992 = var5.method296();
		field993 = var5.method296();
		field990 = var5.method298();
		field991 = var5.method298();
		int var9 = var5.method296();
		int var10 = field991 * field990;
		field988 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				field988[var11] = var4.method297();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < field990; var12++) {
				for (int var13 = 0; var13 < field991; var13++) {
					field988[field990 * var13 + var12] = var4.method297();
				}
			}
		}
	}

	@ObfuscatedName("NUXLZYAZ.a(Z)V")
	public void method342() {
		field994 /= 2;
		field995 /= 2;
		byte[] var1 = new byte[field995 * field994];
		int var2 = 0;
		for (int var3 = 0; var3 < field991; var3++) {
			for (int var4 = 0; var4 < field990; var4++) {
				var1[(field992 + var4 >> 1) + (field993 + var3 >> 1) * field994] = field988[var2++];
			}
		}

		field988 = var1;
		field990 = field994;
		field991 = field995;
		field992 = 0;
		field993 = 0;
	}

	@ObfuscatedName("NUXLZYAZ.b(I)V")
	public void method343() {
		if (field994 != field990 || field995 != field991) {
			byte[] var1 = new byte[field995 * field994];
			int var2 = 0;
			for (int var3 = 0; var3 < field991; var3++) {
				for (int var4 = 0; var4 < field990; var4++) {
					var1[(field993 + var3) * field994 + field992 + var4] = field988[var2++];
				}
			}

			field988 = var1;
			field990 = field994;
			field991 = field995;
			field992 = 0;
			field993 = 0;
		}
	}

	@ObfuscatedName("NUXLZYAZ.c(I)V")
	public void method344() {
		byte[] var1 = new byte[field991 * field990];
		int var2 = 0;
		for (int var3 = 0; var3 < field991; var3++) {
			for (int var4 = field990 - 1; var4 >= 0; var4--) {
				var1[var2++] = field988[field990 * var3 + var4];
			}
		}

		field988 = var1;
		field992 = field994 - field990 - field992;
	}

	@ObfuscatedName("NUXLZYAZ.d(I)V")
	public void method345() {
		byte[] var1 = new byte[field991 * field990];
		int var2 = 0;
		for (int var3 = field991 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < field990; var4++) {
				var1[var2++] = field988[field990 * var3 + var4];
			}
		}

		field988 = var1;
		field993 = field995 - field991 - field993;
	}

	@ObfuscatedName("NUXLZYAZ.a(IIII)V")
	public void method346(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field989.length; var4++) {
			int var5 = field989[var4] >> 16 & 0xFF;
			var5 += arg2;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = field989[var4] >> 8 & 0xFF;
			var6 += arg1;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = field989[var4] & 0xFF;
			var7 += arg0;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			field989[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("NUXLZYAZ.a(IIB)V")
	public void method347(int arg0, int arg1) {
		arg0 += field992;
		arg1 += field993;
		int var3 = UKUXLUWP.field1346 * arg1 + arg0;
		int var4 = 0;
		int var5 = field991;
		int var6 = field990;
		int var7 = UKUXLUWP.field1346 - var6;
		int var8 = 0;

		if (arg1 < UKUXLUWP.field1348) {
			int var9 = UKUXLUWP.field1348 - arg1;
			var5 -= var9;
			arg1 = UKUXLUWP.field1348;
			var4 += var6 * var9;
			var3 += UKUXLUWP.field1346 * var9;
		}

		if (arg1 + var5 > UKUXLUWP.field1349) {
			var5 -= arg1 + var5 - UKUXLUWP.field1349;
		}

		if (arg0 < UKUXLUWP.field1350) {
			int var10 = UKUXLUWP.field1350 - arg0;
			var6 -= var10;
			arg0 = UKUXLUWP.field1350;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > UKUXLUWP.field1351) {
			int var11 = arg0 + var6 - UKUXLUWP.field1351;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method348(var8, var5, field989, var4, var3, var6, UKUXLUWP.field1345, var7, field988);
		}
	}

	@ObfuscatedName("NUXLZYAZ.a(II[IZIII[II[B)V")
	public void method348(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int[] arg6, int arg7, byte[] arg8) {
		int var10 = -(arg5 >> 2);
		arg5 = -(arg5 & 0x3);
		for (int var11 = -arg1; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg8[arg3++];
				if (var13 == 0) {
					arg4++;
				} else {
					arg6[arg4++] = arg2[var13 & 0xFF];
				}

				byte var14 = arg8[arg3++];
				if (var14 == 0) {
					arg4++;
				} else {
					arg6[arg4++] = arg2[var14 & 0xFF];
				}

				byte var15 = arg8[arg3++];
				if (var15 == 0) {
					arg4++;
				} else {
					arg6[arg4++] = arg2[var15 & 0xFF];
				}

				byte var16 = arg8[arg3++];
				if (var16 == 0) {
					arg4++;
				} else {
					arg6[arg4++] = arg2[var16 & 0xFF];
				}
			}

			for (int var17 = arg5; var17 < 0; var17++) {
				byte var18 = arg8[arg3++];
				if (var18 == 0) {
					arg4++;
				} else {
					arg6[arg4++] = arg2[var18 & 0xFF];
				}
			}

			arg4 += arg7;
			arg3 += arg0;
		}
	}
}
