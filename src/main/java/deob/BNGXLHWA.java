package deob;

@ObfuscatedName("BNGXLHWA")
public final class BNGXLHWA extends FVBHOYJF {

	@ObfuscatedName("BNGXLHWA.E")
	public int field73;

	@ObfuscatedName("BNGXLHWA.F")
	public int field74;

	@ObfuscatedName("BNGXLHWA.z")
	public int[] field68;

	@ObfuscatedName("BNGXLHWA.C")
	public int field71;

	@ObfuscatedName("BNGXLHWA.D")
	public int field72;

	@ObfuscatedName("BNGXLHWA.A")
	public int field69;

	@ObfuscatedName("BNGXLHWA.B")
	public int field70;

	@ObfuscatedName("BNGXLHWA.y")
	public byte[] field67;

	public BNGXLHWA(IEMHZJLX arg0, String arg1, int arg2) {
		MVHXDWGI var4 = new MVHXDWGI(arg0.method242(arg1 + ".dat", null));
		MVHXDWGI var5 = new MVHXDWGI(arg0.method242("index.dat", null));
		var5.field1014 = var4.method359();
		field73 = var5.method359();
		field74 = var5.method359();
		int var6 = var5.method357();
		field68 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			field68[var7 + 1] = var5.method361();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field1014 += 2;
			var4.field1014 += var5.method359() * var5.method359();
			var5.field1014++;
		}

		field71 = var5.method357();
		field72 = var5.method357();
		field69 = var5.method359();
		field70 = var5.method359();
		int var9 = var5.method357();
		int var10 = field70 * field69;
		field67 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				field67[var11] = var4.method358();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < field69; var12++) {
				for (int var13 = 0; var13 < field70; var13++) {
					field67[field69 * var13 + var12] = var4.method358();
				}
			}
		}
	}

	@ObfuscatedName("BNGXLHWA.b(I)V")
	public void method33() {
		field73 /= 2;
		field74 /= 2;
		byte[] var1 = new byte[field74 * field73];
		int var2 = 0;
		for (int var3 = 0; var3 < field70; var3++) {
			for (int var4 = 0; var4 < field69; var4++) {
				var1[(field71 + var4 >> 1) + (field72 + var3 >> 1) * field73] = field67[var2++];
			}
		}

		field67 = var1;
		field69 = field73;
		field70 = field74;
		field71 = 0;
		field72 = 0;
	}

	@ObfuscatedName("BNGXLHWA.c(I)V")
	public void method34() {
		if (field73 != field69 || field74 != field70) {
			byte[] var1 = new byte[field74 * field73];
			int var2 = 0;
			for (int var3 = 0; var3 < field70; var3++) {
				for (int var4 = 0; var4 < field69; var4++) {
					var1[(field72 + var3) * field73 + field71 + var4] = field67[var2++];
				}
			}

			field67 = var1;
			field69 = field73;
			field70 = field74;
			field71 = 0;
			field72 = 0;
		}
	}

	@ObfuscatedName("BNGXLHWA.b(B)V")
	public void method35() {
		byte[] var1 = new byte[field70 * field69];
		int var2 = 0;
		for (int var3 = 0; var3 < field70; var3++) {
			for (int var4 = field69 - 1; var4 >= 0; var4--) {
				var1[var2++] = field67[field69 * var3 + var4];
			}
		}

		field67 = var1;
		field71 = field73 - field69 - field71;
	}

	@ObfuscatedName("BNGXLHWA.a(Z)V")
	public void method36() {
		byte[] var1 = new byte[field70 * field69];
		int var2 = 0;
		for (int var3 = field70 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < field69; var4++) {
				var1[var2++] = field67[field69 * var3 + var4];
			}
		}

		field67 = var1;
		field72 = field74 - field70 - field72;
	}

	@ObfuscatedName("BNGXLHWA.a(BIII)V")
	public void method37(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field68.length; var4++) {
			int var5 = field68[var4] >> 16 & 0xFF;
			var5 += arg1;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = field68[var4] >> 8 & 0xFF;
			var6 += arg0;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = field68[var4] & 0xFF;
			var7 += arg2;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			field68[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("BNGXLHWA.a(III)V")
	public void method38(int arg0, int arg1) {
		arg0 += field71;
		arg1 += field72;
		int var3 = FVBHOYJF.field640 * arg1 + arg0;
		int var4 = 0;
		int var5 = field70;
		int var6 = field69;
		int var7 = FVBHOYJF.field640 - var6;
		int var8 = 0;

		if (arg1 < FVBHOYJF.field642) {
			int var9 = FVBHOYJF.field642 - arg1;
			var5 -= var9;
			arg1 = FVBHOYJF.field642;
			var4 += var6 * var9;
			var3 += FVBHOYJF.field640 * var9;
		}

		if (arg1 + var5 > FVBHOYJF.field643) {
			var5 -= arg1 + var5 - FVBHOYJF.field643;
		}

		if (arg0 < FVBHOYJF.field644) {
			int var10 = FVBHOYJF.field644 - arg0;
			var6 -= var10;
			arg0 = FVBHOYJF.field644;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > FVBHOYJF.field645) {
			int var11 = arg0 + var6 - FVBHOYJF.field645;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method39(var5, FVBHOYJF.field639, field68, var6, var3, var4, field67, var8, var7);
		}
	}

	@ObfuscatedName("BNGXLHWA.a(I[I[IIIII[BII)V")
	public void method39(int arg0, int[] arg1, int[] arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
		int var10 = -(arg3 >> 2);
		arg3 = -(arg3 & 0x3);
		for (int var11 = -arg0; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg6[arg5++];
				if (var13 == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2[var13 & 0xFF];
				}

				byte var14 = arg6[arg5++];
				if (var14 == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2[var14 & 0xFF];
				}

				byte var15 = arg6[arg5++];
				if (var15 == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2[var15 & 0xFF];
				}

				byte var16 = arg6[arg5++];
				if (var16 == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2[var16 & 0xFF];
				}
			}

			for (int var17 = arg3; var17 < 0; var17++) {
				byte var18 = arg6[arg5++];
				if (var18 == 0) {
					arg4++;
				} else {
					arg1[arg4++] = arg2[var18 & 0xFF];
				}
			}

			arg4 += arg8;
			arg5 += arg7;
		}
	}
}
