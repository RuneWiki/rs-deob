package deob;

@ObfuscatedName("FCRLGSQA")
public final class FCRLGSQA extends IFHRXNFO {

	@ObfuscatedName("FCRLGSQA.I")
	public int field702;

	@ObfuscatedName("FCRLGSQA.J")
	public int field703;

	@ObfuscatedName("FCRLGSQA.D")
	public int[] field697;

	@ObfuscatedName("FCRLGSQA.G")
	public int field700;

	@ObfuscatedName("FCRLGSQA.H")
	public int field701;

	@ObfuscatedName("FCRLGSQA.E")
	public int field698;

	@ObfuscatedName("FCRLGSQA.F")
	public int field699;

	@ObfuscatedName("FCRLGSQA.C")
	public byte[] field696;

	public FCRLGSQA(BBMKAXRK arg0, String arg1, int arg2) {
		EILHLJCE var4 = new EILHLJCE(arg0.method30(arg1 + ".dat", null));
		EILHLJCE var5 = new EILHLJCE(arg0.method30("index.dat", null));
		var5.field684 = var4.method226();
		field702 = var5.method226();
		field703 = var5.method226();
		int var6 = var5.method224();
		field697 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			field697[var7 + 1] = var5.method228();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field684 += 2;
			var4.field684 += var5.method226() * var5.method226();
			var5.field684++;
		}

		field700 = var5.method224();
		field701 = var5.method224();
		field698 = var5.method226();
		field699 = var5.method226();
		int var9 = var5.method224();
		int var10 = field699 * field698;
		field696 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				field696[var11] = var4.method225();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < field698; var12++) {
				for (int var13 = 0; var13 < field699; var13++) {
					field696[field698 * var13 + var12] = var4.method225();
				}
			}
		}
	}

	@ObfuscatedName("FCRLGSQA.a(Z)V")
	public void method265() {
		field702 /= 2;
		field703 /= 2;
		byte[] var1 = new byte[field703 * field702];
		int var2 = 0;
		for (int var3 = 0; var3 < field699; var3++) {
			for (int var4 = 0; var4 < field698; var4++) {
				var1[(field700 + var4 >> 1) + (field701 + var3 >> 1) * field702] = field696[var2++];
			}
		}

		field696 = var1;
		field698 = field702;
		field699 = field703;
		field700 = 0;
		field701 = 0;
	}

	@ObfuscatedName("FCRLGSQA.b(B)V")
	public void method266() {
		if (field702 != field698 || field703 != field699) {
			byte[] var1 = new byte[field703 * field702];
			int var2 = 0;
			for (int var3 = 0; var3 < field699; var3++) {
				for (int var4 = 0; var4 < field698; var4++) {
					var1[(field701 + var3) * field702 + field700 + var4] = field696[var2++];
				}
			}

			field696 = var1;
			field698 = field702;
			field699 = field703;
			field700 = 0;
			field701 = 0;
		}
	}

	@ObfuscatedName("FCRLGSQA.b(I)V")
	public void method267() {
		byte[] var1 = new byte[field699 * field698];
		int var2 = 0;
		for (int var3 = 0; var3 < field699; var3++) {
			for (int var4 = field698 - 1; var4 >= 0; var4--) {
				var1[var2++] = field696[field698 * var3 + var4];
			}
		}

		field696 = var1;
		field700 = field702 - field698 - field700;
	}

	@ObfuscatedName("FCRLGSQA.c(I)V")
	public void method268() {
		byte[] var1 = new byte[field699 * field698];
		int var2 = 0;
		for (int var3 = field699 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < field698; var4++) {
				var1[var2++] = field696[field698 * var3 + var4];
			}
		}

		field696 = var1;
		field701 = field703 - field699 - field701;
	}

	@ObfuscatedName("FCRLGSQA.a(IIII)V")
	public void method269(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field697.length; var4++) {
			int var5 = field697[var4] >> 16 & 0xFF;
			var5 += arg1;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = field697[var4] >> 8 & 0xFF;
			var6 += arg2;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = field697[var4] & 0xFF;
			var7 += arg0;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			field697[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("FCRLGSQA.a(III)V")
	public void method270(int arg0, int arg1) {
		arg0 += field700;
		arg1 += field701;
		int var3 = IFHRXNFO.field760 * arg1 + arg0;
		int var4 = 0;
		int var5 = field699;
		int var6 = field698;
		int var7 = IFHRXNFO.field760 - var6;
		int var8 = 0;

		if (arg1 < IFHRXNFO.field762) {
			int var9 = IFHRXNFO.field762 - arg1;
			var5 -= var9;
			arg1 = IFHRXNFO.field762;
			var4 += var6 * var9;
			var3 += IFHRXNFO.field760 * var9;
		}

		if (arg1 + var5 > IFHRXNFO.field763) {
			var5 -= arg1 + var5 - IFHRXNFO.field763;
		}

		if (arg0 < IFHRXNFO.field764) {
			int var10 = IFHRXNFO.field764 - arg0;
			var6 -= var10;
			arg0 = IFHRXNFO.field764;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > IFHRXNFO.field765) {
			int var11 = arg0 + var6 - IFHRXNFO.field765;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method271(IFHRXNFO.field759, var3, var5, field696, var4, var7, var6, field697, var8);
		}
	}

	@ObfuscatedName("FCRLGSQA.a(I[III[BIII[II)V")
	public void method271(int[] arg0, int arg1, int arg2, byte[] arg3, int arg4, int arg5, int arg6, int[] arg7, int arg8) {
		int var10 = -(arg6 >> 2);
		arg6 = -(arg6 & 0x3);
		for (int var11 = -arg2; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg3[arg4++];
				if (var13 == 0) {
					arg1++;
				} else {
					arg0[arg1++] = arg7[var13 & 0xFF];
				}

				byte var14 = arg3[arg4++];
				if (var14 == 0) {
					arg1++;
				} else {
					arg0[arg1++] = arg7[var14 & 0xFF];
				}

				byte var15 = arg3[arg4++];
				if (var15 == 0) {
					arg1++;
				} else {
					arg0[arg1++] = arg7[var15 & 0xFF];
				}

				byte var16 = arg3[arg4++];
				if (var16 == 0) {
					arg1++;
				} else {
					arg0[arg1++] = arg7[var16 & 0xFF];
				}
			}

			for (int var17 = arg6; var17 < 0; var17++) {
				byte var18 = arg3[arg4++];
				if (var18 == 0) {
					arg1++;
				} else {
					arg0[arg1++] = arg7[var18 & 0xFF];
				}
			}

			arg1 += arg5;
			arg4 += arg8;
		}
	}
}
