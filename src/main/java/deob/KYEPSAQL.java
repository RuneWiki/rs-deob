package deob;

@ObfuscatedName("KYEPSAQL")
public final class KYEPSAQL extends TYMHEFTS {

	@ObfuscatedName("KYEPSAQL.M")
	public int field781;

	@ObfuscatedName("KYEPSAQL.N")
	public int field782;

	@ObfuscatedName("KYEPSAQL.H")
	public int[] field776;

	@ObfuscatedName("KYEPSAQL.K")
	public int field779;

	@ObfuscatedName("KYEPSAQL.L")
	public int field780;

	@ObfuscatedName("KYEPSAQL.I")
	public int field777;

	@ObfuscatedName("KYEPSAQL.J")
	public int field778;

	@ObfuscatedName("KYEPSAQL.G")
	public byte[] field775;

	public KYEPSAQL(SMIVAFST arg0, String arg1, int arg2) {
		BSNPYLEV var4 = new BSNPYLEV(arg0.method512(arg1 + ".dat", null));
		BSNPYLEV var5 = new BSNPYLEV(arg0.method512("index.dat", null));
		var5.field55 = var4.method49();
		field781 = var5.method49();
		field782 = var5.method49();
		int var6 = var5.method47();
		field776 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			field776[var7 + 1] = var5.method51();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field55 += 2;
			var4.field55 += var5.method49() * var5.method49();
			var5.field55++;
		}

		field779 = var5.method47();
		field780 = var5.method47();
		field777 = var5.method49();
		field778 = var5.method49();
		int var9 = var5.method47();
		int var10 = field778 * field777;
		field775 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				field775[var11] = var4.method48();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < field777; var12++) {
				for (int var13 = 0; var13 < field778; var13++) {
					field775[field777 * var13 + var12] = var4.method48();
				}
			}
		}
	}

	@ObfuscatedName("KYEPSAQL.a(Z)V")
	public void method345() {
		field781 /= 2;
		field782 /= 2;
		byte[] var1 = new byte[field782 * field781];
		int var2 = 0;
		for (int var3 = 0; var3 < field778; var3++) {
			for (int var4 = 0; var4 < field777; var4++) {
				var1[(field779 + var4 >> 1) + (field780 + var3 >> 1) * field781] = field775[var2++];
			}
		}

		field775 = var1;
		field777 = field781;
		field778 = field782;
		field779 = 0;
		field780 = 0;
	}

	@ObfuscatedName("KYEPSAQL.b(I)V")
	public void method346() {
		if (field781 != field777 || field782 != field778) {
			byte[] var1 = new byte[field782 * field781];
			int var2 = 0;
			for (int var3 = 0; var3 < field778; var3++) {
				for (int var4 = 0; var4 < field777; var4++) {
					var1[(field780 + var3) * field781 + field779 + var4] = field775[var2++];
				}
			}

			field775 = var1;
			field777 = field781;
			field778 = field782;
			field779 = 0;
			field780 = 0;
		}
	}

	@ObfuscatedName("KYEPSAQL.b(Z)V")
	public void method347() {
		byte[] var1 = new byte[field778 * field777];
		int var2 = 0;
		for (int var3 = 0; var3 < field778; var3++) {
			for (int var4 = field777 - 1; var4 >= 0; var4--) {
				var1[var2++] = field775[field777 * var3 + var4];
			}
		}

		field775 = var1;
		field779 = field781 - field777 - field779;
	}

	@ObfuscatedName("KYEPSAQL.c(I)V")
	public void method348() {
		byte[] var1 = new byte[field778 * field777];
		int var2 = 0;
		for (int var3 = field778 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < field777; var4++) {
				var1[var2++] = field775[field777 * var3 + var4];
			}
		}

		field775 = var1;
		field780 = field782 - field778 - field780;
	}

	@ObfuscatedName("KYEPSAQL.a(IIIZ)V")
	public void method349(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field776.length; var4++) {
			int var5 = field776[var4] >> 16 & 0xFF;
			var5 += arg0;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = field776[var4] >> 8 & 0xFF;
			var6 += arg2;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = field776[var4] & 0xFF;
			var7 += arg1;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			field776[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("KYEPSAQL.a(IBI)V")
	public void method350(int arg0, int arg1) {
		arg1 += field779;
		arg0 += field780;
		int var3 = TYMHEFTS.field1310 * arg0 + arg1;
		int var4 = 0;
		int var5 = field778;
		int var6 = field777;
		int var7 = TYMHEFTS.field1310 - var6;
		int var8 = 0;

		if (arg0 < TYMHEFTS.field1312) {
			int var9 = TYMHEFTS.field1312 - arg0;
			var5 -= var9;
			arg0 = TYMHEFTS.field1312;
			var4 += var6 * var9;
			var3 += TYMHEFTS.field1310 * var9;
		}

		if (arg0 + var5 > TYMHEFTS.field1313) {
			var5 -= arg0 + var5 - TYMHEFTS.field1313;
		}

		if (arg1 < TYMHEFTS.field1314) {
			int var10 = TYMHEFTS.field1314 - arg1;
			var6 -= var10;
			arg1 = TYMHEFTS.field1314;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > TYMHEFTS.field1315) {
			int var11 = arg1 + var6 - TYMHEFTS.field1315;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method351(var4, field776, var6, var5, var7, var8, field775, TYMHEFTS.field1309, var3);
		}
	}

	@ObfuscatedName("KYEPSAQL.a(ZI[IIIII[B[II)V")
	public void method351(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int[] arg7, int arg8) {
		int var10 = -(arg2 >> 2);
		arg2 = -(arg2 & 0x3);
		for (int var11 = -arg3; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg6[arg0++];
				if (var13 == 0) {
					arg8++;
				} else {
					arg7[arg8++] = arg1[var13 & 0xFF];
				}

				byte var14 = arg6[arg0++];
				if (var14 == 0) {
					arg8++;
				} else {
					arg7[arg8++] = arg1[var14 & 0xFF];
				}

				byte var15 = arg6[arg0++];
				if (var15 == 0) {
					arg8++;
				} else {
					arg7[arg8++] = arg1[var15 & 0xFF];
				}

				byte var16 = arg6[arg0++];
				if (var16 == 0) {
					arg8++;
				} else {
					arg7[arg8++] = arg1[var16 & 0xFF];
				}
			}

			for (int var17 = arg2; var17 < 0; var17++) {
				byte var18 = arg6[arg0++];
				if (var18 == 0) {
					arg8++;
				} else {
					arg7[arg8++] = arg1[var18 & 0xFF];
				}
			}

			arg8 += arg4;
			arg0 += arg5;
		}
	}
}
