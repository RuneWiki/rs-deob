package deob;

@ObfuscatedName("XHDQQNIR")
public final class XHDQQNIR extends TTGPXKMD {

	@ObfuscatedName("XHDQQNIR.K")
	public int field1453;

	@ObfuscatedName("XHDQQNIR.L")
	public int field1454;

	@ObfuscatedName("XHDQQNIR.F")
	public int[] field1448;

	@ObfuscatedName("XHDQQNIR.I")
	public int field1451;

	@ObfuscatedName("XHDQQNIR.J")
	public int field1452;

	@ObfuscatedName("XHDQQNIR.G")
	public int field1449;

	@ObfuscatedName("XHDQQNIR.H")
	public int field1450;

	@ObfuscatedName("XHDQQNIR.E")
	public byte[] field1447;

	public XHDQQNIR(RVLWVPJQ arg0, String arg1, int arg2) {
		UAWAYCTK var4 = new UAWAYCTK(arg0.method424(arg1 + ".dat", null));
		UAWAYCTK var5 = new UAWAYCTK(arg0.method424("index.dat", null));
		var5.field1252 = var4.method457();
		field1453 = var5.method457();
		field1454 = var5.method457();
		int var6 = var5.method455();
		field1448 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			field1448[var7 + 1] = var5.method459();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field1252 += 2;
			var4.field1252 += var5.method457() * var5.method457();
			var5.field1252++;
		}

		field1451 = var5.method455();
		field1452 = var5.method455();
		field1449 = var5.method457();
		field1450 = var5.method457();
		int var9 = var5.method455();
		int var10 = field1450 * field1449;
		field1447 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				field1447[var11] = var4.method456();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < field1449; var12++) {
				for (int var13 = 0; var13 < field1450; var13++) {
					field1447[field1449 * var13 + var12] = var4.method456();
				}
			}
		}
	}

	@ObfuscatedName("XHDQQNIR.c(I)V")
	public void method550() {
		field1453 /= 2;
		field1454 /= 2;
		byte[] var1 = new byte[field1454 * field1453];
		int var2 = 0;
		for (int var3 = 0; var3 < field1450; var3++) {
			for (int var4 = 0; var4 < field1449; var4++) {
				var1[(field1451 + var4 >> 1) + (field1452 + var3 >> 1) * field1453] = field1447[var2++];
			}
		}

		field1447 = var1;
		field1449 = field1453;
		field1450 = field1454;
		field1451 = 0;
		field1452 = 0;
	}

	@ObfuscatedName("XHDQQNIR.d(I)V")
	public void method551() {
		if (field1453 != field1449 || field1454 != field1450) {
			byte[] var1 = new byte[field1454 * field1453];
			int var2 = 0;
			for (int var3 = 0; var3 < field1450; var3++) {
				for (int var4 = 0; var4 < field1449; var4++) {
					var1[(field1452 + var3) * field1453 + field1451 + var4] = field1447[var2++];
				}
			}

			field1447 = var1;
			field1449 = field1453;
			field1450 = field1454;
			field1451 = 0;
			field1452 = 0;
		}
	}

	@ObfuscatedName("XHDQQNIR.e(I)V")
	public void method552() {
		byte[] var1 = new byte[field1450 * field1449];
		int var2 = 0;
		for (int var3 = 0; var3 < field1450; var3++) {
			for (int var4 = field1449 - 1; var4 >= 0; var4--) {
				var1[var2++] = field1447[field1449 * var3 + var4];
			}
		}

		field1447 = var1;
		field1451 = field1453 - field1449 - field1451;
	}

	@ObfuscatedName("XHDQQNIR.a(B)V")
	public void method553() {
		byte[] var1 = new byte[field1450 * field1449];
		int var2 = 0;
		for (int var3 = field1450 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < field1449; var4++) {
				var1[var2++] = field1447[field1449 * var3 + var4];
			}
		}

		field1447 = var1;
		field1452 = field1454 - field1450 - field1452;
	}

	@ObfuscatedName("XHDQQNIR.a(IBII)V")
	public void method554(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field1448.length; var4++) {
			int var5 = field1448[var4] >> 16 & 0xFF;
			var5 += arg2;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = field1448[var4] >> 8 & 0xFF;
			var6 += arg0;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = field1448[var4] & 0xFF;
			var7 += arg1;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			field1448[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("XHDQQNIR.a(III)V")
	public void method555(int arg0, int arg1) {
		arg0 += field1451;
		arg1 += field1452;
		int var3 = TTGPXKMD.field1187 * arg1 + arg0;
		int var4 = 0;
		int var5 = field1450;
		int var6 = field1449;
		int var7 = TTGPXKMD.field1187 - var6;
		int var8 = 0;

		if (arg1 < TTGPXKMD.field1189) {
			int var9 = TTGPXKMD.field1189 - arg1;
			var5 -= var9;
			arg1 = TTGPXKMD.field1189;
			var4 += var6 * var9;
			var3 += TTGPXKMD.field1187 * var9;
		}

		if (arg1 + var5 > TTGPXKMD.field1190) {
			var5 -= arg1 + var5 - TTGPXKMD.field1190;
		}

		if (arg0 < TTGPXKMD.field1191) {
			int var10 = TTGPXKMD.field1191 - arg0;
			var6 -= var10;
			arg0 = TTGPXKMD.field1191;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > TTGPXKMD.field1192) {
			int var11 = arg0 + var6 - TTGPXKMD.field1192;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method556(var4, TTGPXKMD.field1186, var7, var8, field1447, var5, var6, var3, field1448);
		}
	}

	@ObfuscatedName("XHDQQNIR.a(BI[III[BIII[I)V")
	public void method556(int arg0, int[] arg1, int arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, int[] arg8) {
		int var10 = -(arg6 >> 2);
		arg6 = -(arg6 & 0x3);
		for (int var11 = -arg5; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg4[arg0++];
				if (var13 == 0) {
					arg7++;
				} else {
					arg1[arg7++] = arg8[var13 & 0xFF];
				}

				byte var14 = arg4[arg0++];
				if (var14 == 0) {
					arg7++;
				} else {
					arg1[arg7++] = arg8[var14 & 0xFF];
				}

				byte var15 = arg4[arg0++];
				if (var15 == 0) {
					arg7++;
				} else {
					arg1[arg7++] = arg8[var15 & 0xFF];
				}

				byte var16 = arg4[arg0++];
				if (var16 == 0) {
					arg7++;
				} else {
					arg1[arg7++] = arg8[var16 & 0xFF];
				}
			}

			for (int var17 = arg6; var17 < 0; var17++) {
				byte var18 = arg4[arg0++];
				if (var18 == 0) {
					arg7++;
				} else {
					arg1[arg7++] = arg8[var18 & 0xFF];
				}
			}

			arg7 += arg2;
			arg0 += arg3;
		}
	}
}
