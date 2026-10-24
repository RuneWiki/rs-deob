package deob;

@ObfuscatedName("ITVAFKCK")
public final class ITVAFKCK extends CBERHIHM {

	@ObfuscatedName("ITVAFKCK.G")
	public int field611;

	@ObfuscatedName("ITVAFKCK.H")
	public int field612;

	@ObfuscatedName("ITVAFKCK.B")
	public int[] field606;

	@ObfuscatedName("ITVAFKCK.E")
	public int field609;

	@ObfuscatedName("ITVAFKCK.F")
	public int field610;

	@ObfuscatedName("ITVAFKCK.C")
	public int field607;

	@ObfuscatedName("ITVAFKCK.D")
	public int field608;

	@ObfuscatedName("ITVAFKCK.A")
	public byte[] field605;

	public ITVAFKCK(AKPFVPPG arg0, String arg1, int arg2) {
		FTMSICIZ var4 = new FTMSICIZ(arg0.method7(arg1 + ".dat", null));
		FTMSICIZ var5 = new FTMSICIZ(arg0.method7("index.dat", null));
		var5.field535 = var4.method215();
		field611 = var5.method215();
		field612 = var5.method215();
		int var6 = var5.method213();
		field606 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			field606[var7 + 1] = var5.method217();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field535 += 2;
			var4.field535 += var5.method215() * var5.method215();
			var5.field535++;
		}

		field609 = var5.method213();
		field610 = var5.method213();
		field607 = var5.method215();
		field608 = var5.method215();
		int var9 = var5.method213();
		int var10 = field608 * field607;
		field605 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				field605[var11] = var4.method214();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < field607; var12++) {
				for (int var13 = 0; var13 < field608; var13++) {
					field605[field607 * var13 + var12] = var4.method214();
				}
			}
		}
	}

	@ObfuscatedName("ITVAFKCK.b(B)V")
	public void method299() {
		field611 /= 2;
		field612 /= 2;
		byte[] var1 = new byte[field612 * field611];
		int var2 = 0;
		for (int var3 = 0; var3 < field608; var3++) {
			for (int var4 = 0; var4 < field607; var4++) {
				var1[(field609 + var4 >> 1) + (field610 + var3 >> 1) * field611] = field605[var2++];
			}
		}

		field605 = var1;
		field607 = field611;
		field608 = field612;
		field609 = 0;
		field610 = 0;
	}

	@ObfuscatedName("ITVAFKCK.a(I)V")
	public void method300() {
		if (field611 != field607 || field612 != field608) {
			byte[] var1 = new byte[field612 * field611];
			int var2 = 0;
			for (int var3 = 0; var3 < field608; var3++) {
				for (int var4 = 0; var4 < field607; var4++) {
					var1[(field610 + var3) * field611 + field609 + var4] = field605[var2++];
				}
			}

			field605 = var1;
			field607 = field611;
			field608 = field612;
			field609 = 0;
			field610 = 0;
		}
	}

	@ObfuscatedName("ITVAFKCK.b(I)V")
	public void method301() {
		byte[] var1 = new byte[field608 * field607];
		int var2 = 0;
		for (int var3 = 0; var3 < field608; var3++) {
			for (int var4 = field607 - 1; var4 >= 0; var4--) {
				var1[var2++] = field605[field607 * var3 + var4];
			}
		}

		field605 = var1;
		field609 = field611 - field607 - field609;
	}

	@ObfuscatedName("ITVAFKCK.c(I)V")
	public void method302() {
		byte[] var1 = new byte[field608 * field607];
		int var2 = 0;
		for (int var3 = field608 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < field607; var4++) {
				var1[var2++] = field605[field607 * var3 + var4];
			}
		}

		field605 = var1;
		field610 = field612 - field608 - field610;
	}

	@ObfuscatedName("ITVAFKCK.a(ZIII)V")
	public void method303(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field606.length; var4++) {
			int var5 = field606[var4] >> 16 & 0xFF;
			var5 += arg2;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = field606[var4] >> 8 & 0xFF;
			var6 += arg0;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = field606[var4] & 0xFF;
			var7 += arg1;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			field606[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("ITVAFKCK.a(III)V")
	public void method304(int arg0, int arg1) {
		arg0 += field609;
		arg1 += field610;
		int var3 = CBERHIHM.field25 * arg1 + arg0;
		int var4 = 0;
		int var5 = field608;
		int var6 = field607;
		int var7 = CBERHIHM.field25 - var6;
		int var8 = 0;

		if (arg1 < CBERHIHM.field27) {
			int var9 = CBERHIHM.field27 - arg1;
			var5 -= var9;
			arg1 = CBERHIHM.field27;
			var4 += var6 * var9;
			var3 += CBERHIHM.field25 * var9;
		}

		if (arg1 + var5 > CBERHIHM.field28) {
			var5 -= arg1 + var5 - CBERHIHM.field28;
		}

		if (arg0 < CBERHIHM.field29) {
			int var10 = CBERHIHM.field29 - arg0;
			var6 -= var10;
			arg0 = CBERHIHM.field29;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > CBERHIHM.field30) {
			int var11 = arg0 + var6 - CBERHIHM.field30;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method305(var8, var6, var4, var7, var5, var3, field605, CBERHIHM.field24, field606);
		}
	}

	@ObfuscatedName("ITVAFKCK.a(IIIIIII[B[I[I)V")
	public void method305(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7, int[] arg8) {
		int var10 = -(arg1 >> 2);
		arg1 = -(arg1 & 0x3);
		for (int var11 = -arg4; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg6[arg2++];
				if (var13 == 0) {
					arg5++;
				} else {
					arg7[arg5++] = arg8[var13 & 0xFF];
				}

				byte var14 = arg6[arg2++];
				if (var14 == 0) {
					arg5++;
				} else {
					arg7[arg5++] = arg8[var14 & 0xFF];
				}

				byte var15 = arg6[arg2++];
				if (var15 == 0) {
					arg5++;
				} else {
					arg7[arg5++] = arg8[var15 & 0xFF];
				}

				byte var16 = arg6[arg2++];
				if (var16 == 0) {
					arg5++;
				} else {
					arg7[arg5++] = arg8[var16 & 0xFF];
				}
			}

			for (int var17 = arg1; var17 < 0; var17++) {
				byte var18 = arg6[arg2++];
				if (var18 == 0) {
					arg5++;
				} else {
					arg7[arg5++] = arg8[var18 & 0xFF];
				}
			}

			arg5 += arg3;
			arg2 += arg0;
		}
	}
}
