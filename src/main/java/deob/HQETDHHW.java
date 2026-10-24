package deob;

@ObfuscatedName("HQETDHHW")
public final class HQETDHHW extends JJCVVTJN {

	@ObfuscatedName("HQETDHHW.H")
	public int field654;

	@ObfuscatedName("HQETDHHW.I")
	public int field655;

	@ObfuscatedName("HQETDHHW.C")
	public int[] field649;

	@ObfuscatedName("HQETDHHW.F")
	public int field652;

	@ObfuscatedName("HQETDHHW.G")
	public int field653;

	@ObfuscatedName("HQETDHHW.D")
	public int field650;

	@ObfuscatedName("HQETDHHW.E")
	public int field651;

	@ObfuscatedName("HQETDHHW.B")
	public byte[] field648;

	public HQETDHHW(CXFTMSCH arg0, String arg1, int arg2) {
		MQZHAILV var4 = new MQZHAILV(arg0.method176(arg1 + ".dat", null));
		MQZHAILV var5 = new MQZHAILV(arg0.method176("index.dat", null));
		var5.field797 = var4.method327();
		field654 = var5.method327();
		field655 = var5.method327();
		int var6 = var5.method325();
		field649 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			field649[var7 + 1] = var5.method329();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field797 += 2;
			var4.field797 += var5.method327() * var5.method327();
			var5.field797++;
		}

		field652 = var5.method325();
		field653 = var5.method325();
		field650 = var5.method327();
		field651 = var5.method327();
		int var9 = var5.method325();
		int var10 = field651 * field650;
		field648 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				field648[var11] = var4.method326();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < field650; var12++) {
				for (int var13 = 0; var13 < field651; var13++) {
					field648[field650 * var13 + var12] = var4.method326();
				}
			}
		}
	}

	@ObfuscatedName("HQETDHHW.b(I)V")
	public void method241() {
		field654 /= 2;
		field655 /= 2;
		byte[] var1 = new byte[field655 * field654];
		int var2 = 0;
		for (int var3 = 0; var3 < field651; var3++) {
			for (int var4 = 0; var4 < field650; var4++) {
				var1[(field652 + var4 >> 1) + (field653 + var3 >> 1) * field654] = field648[var2++];
			}
		}

		field648 = var1;
		field650 = field654;
		field651 = field655;
		field652 = 0;
		field653 = 0;
	}

	@ObfuscatedName("HQETDHHW.c(I)V")
	public void method242() {
		if (field654 != field650 || field655 != field651) {
			byte[] var1 = new byte[field655 * field654];
			int var2 = 0;
			for (int var3 = 0; var3 < field651; var3++) {
				for (int var4 = 0; var4 < field650; var4++) {
					var1[(field653 + var3) * field654 + field652 + var4] = field648[var2++];
				}
			}

			field648 = var1;
			field650 = field654;
			field651 = field655;
			field652 = 0;
			field653 = 0;
		}
	}

	@ObfuscatedName("HQETDHHW.d(I)V")
	public void method243() {
		byte[] var1 = new byte[field651 * field650];
		int var2 = 0;
		for (int var3 = 0; var3 < field651; var3++) {
			for (int var4 = field650 - 1; var4 >= 0; var4--) {
				var1[var2++] = field648[field650 * var3 + var4];
			}
		}

		field648 = var1;
		field652 = field654 - field650 - field652;
	}

	@ObfuscatedName("HQETDHHW.b(B)V")
	public void method244() {
		byte[] var1 = new byte[field651 * field650];
		int var2 = 0;
		for (int var3 = field651 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < field650; var4++) {
				var1[var2++] = field648[field650 * var3 + var4];
			}
		}

		field648 = var1;
		field653 = field655 - field651 - field653;
	}

	@ObfuscatedName("HQETDHHW.a(IIIB)V")
	public void method245(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field649.length; var4++) {
			int var5 = field649[var4] >> 16 & 0xFF;
			var5 += arg1;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = field649[var4] >> 8 & 0xFF;
			var6 += arg2;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = field649[var4] & 0xFF;
			var7 += arg0;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			field649[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("HQETDHHW.a(III)V")
	public void method246(int arg0, int arg1) {
		arg0 += field652;
		arg1 += field653;
		int var3 = JJCVVTJN.field676 * arg1 + arg0;
		int var4 = 0;
		int var5 = field651;
		int var6 = field650;
		int var7 = JJCVVTJN.field676 - var6;
		int var8 = 0;

		if (arg1 < JJCVVTJN.field678) {
			int var9 = JJCVVTJN.field678 - arg1;
			var5 -= var9;
			arg1 = JJCVVTJN.field678;
			var4 += var6 * var9;
			var3 += JJCVVTJN.field676 * var9;
		}

		if (arg1 + var5 > JJCVVTJN.field679) {
			var5 -= arg1 + var5 - JJCVVTJN.field679;
		}

		if (arg0 < JJCVVTJN.field680) {
			int var10 = JJCVVTJN.field680 - arg0;
			var6 -= var10;
			arg0 = JJCVVTJN.field680;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > JJCVVTJN.field681) {
			int var11 = arg0 + var6 - JJCVVTJN.field681;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method247(field649, var5, var6, JJCVVTJN.field675, var8, var7, var3, var4, field648);
		}
	}

	@ObfuscatedName("HQETDHHW.a([III[IIIIIZ[B)V")
	public void method247(int[] arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
		int var10 = -(arg2 >> 2);
		arg2 = -(arg2 & 0x3);
		for (int var11 = -arg1; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg8[arg7++];
				if (var13 == 0) {
					arg6++;
				} else {
					arg3[arg6++] = arg0[var13 & 0xFF];
				}

				byte var14 = arg8[arg7++];
				if (var14 == 0) {
					arg6++;
				} else {
					arg3[arg6++] = arg0[var14 & 0xFF];
				}

				byte var15 = arg8[arg7++];
				if (var15 == 0) {
					arg6++;
				} else {
					arg3[arg6++] = arg0[var15 & 0xFF];
				}

				byte var16 = arg8[arg7++];
				if (var16 == 0) {
					arg6++;
				} else {
					arg3[arg6++] = arg0[var16 & 0xFF];
				}
			}

			for (int var17 = arg2; var17 < 0; var17++) {
				byte var18 = arg8[arg7++];
				if (var18 == 0) {
					arg6++;
				} else {
					arg3[arg6++] = arg0[var18 & 0xFF];
				}
			}

			arg6 += arg5;
			arg7 += arg4;
		}
	}
}
