package deob;

@ObfuscatedName("DEITBGVL")
public final class DEITBGVL extends HQRNTLRZ {

	@ObfuscatedName("DEITBGVL.K")
	public int field547;

	@ObfuscatedName("DEITBGVL.L")
	public int field548;

	@ObfuscatedName("DEITBGVL.F")
	public int[] field542;

	@ObfuscatedName("DEITBGVL.I")
	public int field545;

	@ObfuscatedName("DEITBGVL.J")
	public int field546;

	@ObfuscatedName("DEITBGVL.G")
	public int field543;

	@ObfuscatedName("DEITBGVL.H")
	public int field544;

	@ObfuscatedName("DEITBGVL.E")
	public byte[] field541;

	public DEITBGVL(QKFGLETG arg0, String arg1, int arg2) {
		XJCNBMKS var4 = new XJCNBMKS(arg0.method402(arg1 + ".dat", null));
		XJCNBMKS var5 = new XJCNBMKS(arg0.method402("index.dat", null));
		var5.field1403 = var4.method536();
		field547 = var5.method536();
		field548 = var5.method536();
		int var6 = var5.method534();
		field542 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			field542[var7 + 1] = var5.method538();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field1403 += 2;
			var4.field1403 += var5.method536() * var5.method536();
			var5.field1403++;
		}

		field545 = var5.method534();
		field546 = var5.method534();
		field543 = var5.method536();
		field544 = var5.method536();
		int var9 = var5.method534();
		int var10 = field544 * field543;
		field541 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				field541[var11] = var4.method535();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < field543; var12++) {
				for (int var13 = 0; var13 < field544; var13++) {
					field541[field543 * var13 + var12] = var4.method535();
				}
			}
		}
	}

	@ObfuscatedName("DEITBGVL.c(I)V")
	public void method161() {
		field547 /= 2;
		field548 /= 2;
		byte[] var1 = new byte[field548 * field547];
		int var2 = 0;
		for (int var3 = 0; var3 < field544; var3++) {
			for (int var4 = 0; var4 < field543; var4++) {
				var1[(field545 + var4 >> 1) + (field546 + var3 >> 1) * field547] = field541[var2++];
			}
		}

		field541 = var1;
		field543 = field547;
		field544 = field548;
		field545 = 0;
		field546 = 0;
	}

	@ObfuscatedName("DEITBGVL.a(B)V")
	public void method162() {
		if (field547 != field543 || field548 != field544) {
			byte[] var1 = new byte[field548 * field547];
			int var2 = 0;
			for (int var3 = 0; var3 < field544; var3++) {
				for (int var4 = 0; var4 < field543; var4++) {
					var1[(field546 + var3) * field547 + field545 + var4] = field541[var2++];
				}
			}

			field541 = var1;
			field543 = field547;
			field544 = field548;
			field545 = 0;
			field546 = 0;
		}
	}

	@ObfuscatedName("DEITBGVL.d(I)V")
	public void method163() {
		byte[] var1 = new byte[field544 * field543];
		int var2 = 0;
		for (int var3 = 0; var3 < field544; var3++) {
			for (int var4 = field543 - 1; var4 >= 0; var4--) {
				var1[var2++] = field541[field543 * var3 + var4];
			}
		}

		field541 = var1;
		field545 = field547 - field543 - field545;
	}

	@ObfuscatedName("DEITBGVL.e(I)V")
	public void method164() {
		byte[] var1 = new byte[field544 * field543];
		int var2 = 0;
		for (int var3 = field544 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < field543; var4++) {
				var1[var2++] = field541[field543 * var3 + var4];
			}
		}

		field541 = var1;
		field546 = field548 - field544 - field546;
	}

	@ObfuscatedName("DEITBGVL.a(IBII)V")
	public void method165(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field542.length; var4++) {
			int var5 = field542[var4] >> 16 & 0xFF;
			var5 += arg1;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = field542[var4] >> 8 & 0xFF;
			var6 += arg2;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = field542[var4] & 0xFF;
			var7 += arg0;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			field542[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("DEITBGVL.a(IIB)V")
	public void method166(int arg0, int arg1) {
		arg1 += field545;
		arg0 += field546;
		int var3 = HQRNTLRZ.field737 * arg0 + arg1;
		int var4 = 0;
		int var5 = field544;
		int var6 = field543;
		int var7 = HQRNTLRZ.field737 - var6;
		int var8 = 0;

		if (arg0 < HQRNTLRZ.field739) {
			int var9 = HQRNTLRZ.field739 - arg0;
			var5 -= var9;
			arg0 = HQRNTLRZ.field739;
			var4 += var6 * var9;
			var3 += HQRNTLRZ.field737 * var9;
		}

		if (arg0 + var5 > HQRNTLRZ.field740) {
			var5 -= arg0 + var5 - HQRNTLRZ.field740;
		}

		if (arg1 < HQRNTLRZ.field741) {
			int var10 = HQRNTLRZ.field741 - arg1;
			var6 -= var10;
			arg1 = HQRNTLRZ.field741;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > HQRNTLRZ.field742) {
			int var11 = arg1 + var6 - HQRNTLRZ.field742;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method167(HQRNTLRZ.field736, var8, var6, field542, var4, var3, var5, var7, field541);
		}
	}

	@ObfuscatedName("DEITBGVL.a(I[III[IIIII[B)V")
	public void method167(int[] arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
		int var10 = -(arg2 >> 2);
		arg2 = -(arg2 & 0x3);
		for (int var11 = -arg6; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg8[arg4++];
				if (var13 == 0) {
					arg5++;
				} else {
					arg0[arg5++] = arg3[var13 & 0xFF];
				}

				byte var14 = arg8[arg4++];
				if (var14 == 0) {
					arg5++;
				} else {
					arg0[arg5++] = arg3[var14 & 0xFF];
				}

				byte var15 = arg8[arg4++];
				if (var15 == 0) {
					arg5++;
				} else {
					arg0[arg5++] = arg3[var15 & 0xFF];
				}

				byte var16 = arg8[arg4++];
				if (var16 == 0) {
					arg5++;
				} else {
					arg0[arg5++] = arg3[var16 & 0xFF];
				}
			}

			for (int var17 = arg2; var17 < 0; var17++) {
				byte var18 = arg8[arg4++];
				if (var18 == 0) {
					arg5++;
				} else {
					arg0[arg5++] = arg3[var18 & 0xFF];
				}
			}

			arg5 += arg7;
			arg4 += arg1;
		}
	}
}
