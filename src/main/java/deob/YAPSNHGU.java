package deob;

@ObfuscatedName("YAPSNHGU")
public final class YAPSNHGU extends FBOVVAQK {

	@ObfuscatedName("YAPSNHGU.H")
	public int field1478;

	@ObfuscatedName("YAPSNHGU.I")
	public int field1479;

	@ObfuscatedName("YAPSNHGU.C")
	public int[] field1473;

	@ObfuscatedName("YAPSNHGU.F")
	public int field1476;

	@ObfuscatedName("YAPSNHGU.G")
	public int field1477;

	@ObfuscatedName("YAPSNHGU.D")
	public int field1474;

	@ObfuscatedName("YAPSNHGU.E")
	public int field1475;

	@ObfuscatedName("YAPSNHGU.B")
	public byte[] field1472;

	public YAPSNHGU(HRXSNEYZ arg0, String arg1, int arg2) {
		JHKSAGUC var4 = new JHKSAGUC(arg0.method289(arg1 + ".dat", null));
		JHKSAGUC var5 = new JHKSAGUC(arg0.method289("index.dat", null));
		var5.field752 = var4.method308();
		field1478 = var5.method308();
		field1479 = var5.method308();
		int var6 = var5.method306();
		field1473 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			field1473[var7 + 1] = var5.method310();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field752 += 2;
			var4.field752 += var5.method308() * var5.method308();
			var5.field752++;
		}

		field1476 = var5.method306();
		field1477 = var5.method306();
		field1474 = var5.method308();
		field1475 = var5.method308();
		int var9 = var5.method306();
		int var10 = field1475 * field1474;
		field1472 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				field1472[var11] = var4.method307();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < field1474; var12++) {
				for (int var13 = 0; var13 < field1475; var13++) {
					field1472[field1474 * var13 + var12] = var4.method307();
				}
			}
		}
	}

	@ObfuscatedName("YAPSNHGU.c(Z)V")
	public void method582() {
		field1478 /= 2;
		field1479 /= 2;
		byte[] var1 = new byte[field1479 * field1478];
		int var2 = 0;
		for (int var3 = 0; var3 < field1475; var3++) {
			for (int var4 = 0; var4 < field1474; var4++) {
				var1[(field1476 + var4 >> 1) + (field1477 + var3 >> 1) * field1478] = field1472[var2++];
			}
		}

		field1472 = var1;
		field1474 = field1478;
		field1475 = field1479;
		field1476 = 0;
		field1477 = 0;
	}

	@ObfuscatedName("YAPSNHGU.a(I)V")
	public void method583() {
		if (field1478 != field1474 || field1479 != field1475) {
			byte[] var1 = new byte[field1479 * field1478];
			int var2 = 0;
			for (int var3 = 0; var3 < field1475; var3++) {
				for (int var4 = 0; var4 < field1474; var4++) {
					var1[(field1477 + var3) * field1478 + field1476 + var4] = field1472[var2++];
				}
			}

			field1472 = var1;
			field1474 = field1478;
			field1475 = field1479;
			field1476 = 0;
			field1477 = 0;
		}
	}

	@ObfuscatedName("YAPSNHGU.d(Z)V")
	public void method584() {
		byte[] var1 = new byte[field1475 * field1474];
		int var2 = 0;
		for (int var3 = 0; var3 < field1475; var3++) {
			for (int var4 = field1474 - 1; var4 >= 0; var4--) {
				var1[var2++] = field1472[field1474 * var3 + var4];
			}
		}

		field1472 = var1;
		field1476 = field1478 - field1474 - field1476;
	}

	@ObfuscatedName("YAPSNHGU.b(I)V")
	public void method585() {
		byte[] var1 = new byte[field1475 * field1474];
		int var2 = 0;
		for (int var3 = field1475 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < field1474; var4++) {
				var1[var2++] = field1472[field1474 * var3 + var4];
			}
		}

		field1472 = var1;
		field1477 = field1479 - field1475 - field1477;
	}

	@ObfuscatedName("YAPSNHGU.a(IIII)V")
	public void method586(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field1473.length; var4++) {
			int var5 = field1473[var4] >> 16 & 0xFF;
			var5 += arg1;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = field1473[var4] >> 8 & 0xFF;
			var6 += arg0;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = field1473[var4] & 0xFF;
			var7 += arg2;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			field1473[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("YAPSNHGU.a(IIB)V")
	public void method587(int arg0, int arg1) {
		arg1 += field1476;
		arg0 += field1477;
		int var3 = FBOVVAQK.field592 * arg0 + arg1;
		int var4 = 0;
		int var5 = field1475;
		int var6 = field1474;
		int var7 = FBOVVAQK.field592 - var6;
		int var8 = 0;

		if (arg0 < FBOVVAQK.field594) {
			int var9 = FBOVVAQK.field594 - arg0;
			var5 -= var9;
			arg0 = FBOVVAQK.field594;
			var4 += var6 * var9;
			var3 += FBOVVAQK.field592 * var9;
		}

		if (arg0 + var5 > FBOVVAQK.field595) {
			var5 -= arg0 + var5 - FBOVVAQK.field595;
		}

		if (arg1 < FBOVVAQK.field596) {
			int var10 = FBOVVAQK.field596 - arg1;
			var6 -= var10;
			arg1 = FBOVVAQK.field596;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > FBOVVAQK.field597) {
			int var11 = arg1 + var6 - FBOVVAQK.field597;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method588(field1472, var8, var4, field1473, var3, FBOVVAQK.field591, var7, var5, var6);
		}
	}

	@ObfuscatedName("YAPSNHGU.a([BIIZ[II[IIII)V")
	public void method588(byte[] arg0, int arg1, int arg2, int[] arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8) {
		int var10 = -(arg8 >> 2);
		arg8 = -(arg8 & 0x3);
		for (int var11 = -arg7; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg0[arg2++];
				if (var13 == 0) {
					arg4++;
				} else {
					arg5[arg4++] = arg3[var13 & 0xFF];
				}

				byte var14 = arg0[arg2++];
				if (var14 == 0) {
					arg4++;
				} else {
					arg5[arg4++] = arg3[var14 & 0xFF];
				}

				byte var15 = arg0[arg2++];
				if (var15 == 0) {
					arg4++;
				} else {
					arg5[arg4++] = arg3[var15 & 0xFF];
				}

				byte var16 = arg0[arg2++];
				if (var16 == 0) {
					arg4++;
				} else {
					arg5[arg4++] = arg3[var16 & 0xFF];
				}
			}

			for (int var17 = arg8; var17 < 0; var17++) {
				byte var18 = arg0[arg2++];
				if (var18 == 0) {
					arg4++;
				} else {
					arg5[arg4++] = arg3[var18 & 0xFF];
				}
			}

			arg4 += arg6;
			arg2 += arg1;
		}
	}
}
