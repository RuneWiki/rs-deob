package deob;

@ObfuscatedName("MRCVLIXG")
public final class MRCVLIXG extends BDJXDJBP {

	@ObfuscatedName("MRCVLIXG.J")
	public int field985;

	@ObfuscatedName("MRCVLIXG.K")
	public int field986;

	@ObfuscatedName("MRCVLIXG.E")
	public int[] field980;

	@ObfuscatedName("MRCVLIXG.H")
	public int field983;

	@ObfuscatedName("MRCVLIXG.I")
	public int field984;

	@ObfuscatedName("MRCVLIXG.F")
	public int field981;

	@ObfuscatedName("MRCVLIXG.G")
	public int field982;

	@ObfuscatedName("MRCVLIXG.D")
	public byte[] field979;

	public MRCVLIXG(HBJEXSJX arg0, String arg1, int arg2) {
		EYMNCFMK var4 = new EYMNCFMK(arg0.method348(arg1 + ".dat", null));
		EYMNCFMK var5 = new EYMNCFMK(arg0.method348("index.dat", null));
		var5.field679 = var4.method241();
		field985 = var5.method241();
		field986 = var5.method241();
		int var6 = var5.method239();
		field980 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			field980[var7 + 1] = var5.method243();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field679 += 2;
			var4.field679 += var5.method241() * var5.method241();
			var5.field679++;
		}

		field983 = var5.method239();
		field984 = var5.method239();
		field981 = var5.method241();
		field982 = var5.method241();
		int var9 = var5.method239();
		int var10 = field982 * field981;
		field979 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				field979[var11] = var4.method240();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < field981; var12++) {
				for (int var13 = 0; var13 < field982; var13++) {
					field979[field981 * var13 + var12] = var4.method240();
				}
			}
		}
	}

	@ObfuscatedName("MRCVLIXG.c(I)V")
	public void method396() {
		field985 /= 2;
		field986 /= 2;
		byte[] var1 = new byte[field986 * field985];
		int var2 = 0;
		for (int var3 = 0; var3 < field982; var3++) {
			for (int var4 = 0; var4 < field981; var4++) {
				var1[(field983 + var4 >> 1) + (field984 + var3 >> 1) * field985] = field979[var2++];
			}
		}

		field979 = var1;
		field981 = field985;
		field982 = field986;
		field983 = 0;
		field984 = 0;
	}

	@ObfuscatedName("MRCVLIXG.a(Z)V")
	public void method397() {
		if (field985 != field981 || field986 != field982) {
			byte[] var1 = new byte[field986 * field985];
			int var2 = 0;
			for (int var3 = 0; var3 < field982; var3++) {
				for (int var4 = 0; var4 < field981; var4++) {
					var1[(field984 + var3) * field985 + field983 + var4] = field979[var2++];
				}
			}

			field979 = var1;
			field981 = field985;
			field982 = field986;
			field983 = 0;
			field984 = 0;
		}
	}

	@ObfuscatedName("MRCVLIXG.a(B)V")
	public void method398() {
		byte[] var1 = new byte[field982 * field981];
		int var2 = 0;
		for (int var3 = 0; var3 < field982; var3++) {
			for (int var4 = field981 - 1; var4 >= 0; var4--) {
				var1[var2++] = field979[field981 * var3 + var4];
			}
		}

		field979 = var1;
		field983 = field985 - field981 - field983;
	}

	@ObfuscatedName("MRCVLIXG.d(I)V")
	public void method399() {
		byte[] var1 = new byte[field982 * field981];
		int var2 = 0;
		for (int var3 = field982 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < field981; var4++) {
				var1[var2++] = field979[field981 * var3 + var4];
			}
		}

		field979 = var1;
		field984 = field986 - field982 - field984;
	}

	@ObfuscatedName("MRCVLIXG.a(IIIB)V")
	public void method400(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field980.length; var4++) {
			int var5 = field980[var4] >> 16 & 0xFF;
			var5 += arg2;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = field980[var4] >> 8 & 0xFF;
			var6 += arg0;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = field980[var4] & 0xFF;
			var7 += arg1;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			field980[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("MRCVLIXG.a(III)V")
	public void method401(int arg0, int arg1) {
		arg0 += field983;
		arg1 += field984;
		int var3 = BDJXDJBP.field47 * arg1 + arg0;
		int var4 = 0;
		int var5 = field982;
		int var6 = field981;
		int var7 = BDJXDJBP.field47 - var6;
		int var8 = 0;

		if (arg1 < BDJXDJBP.field49) {
			int var9 = BDJXDJBP.field49 - arg1;
			var5 -= var9;
			arg1 = BDJXDJBP.field49;
			var4 += var6 * var9;
			var3 += BDJXDJBP.field47 * var9;
		}

		if (arg1 + var5 > BDJXDJBP.field50) {
			var5 -= arg1 + var5 - BDJXDJBP.field50;
		}

		if (arg0 < BDJXDJBP.field51) {
			int var10 = BDJXDJBP.field51 - arg0;
			var6 -= var10;
			arg0 = BDJXDJBP.field51;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > BDJXDJBP.field52) {
			int var11 = arg0 + var6 - BDJXDJBP.field52;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method402(BDJXDJBP.field46, var6, var5, var3, var4, var8, field979, var7, field980);
		}
	}

	@ObfuscatedName("MRCVLIXG.a([IIIIII[BII[I)V")
	public void method402(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int[] arg8) {
		int var10 = -(arg1 >> 2);
		arg1 = -(arg1 & 0x3);
		for (int var11 = -arg2; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg6[arg4++];
				if (var13 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = arg8[var13 & 0xFF];
				}

				byte var14 = arg6[arg4++];
				if (var14 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = arg8[var14 & 0xFF];
				}

				byte var15 = arg6[arg4++];
				if (var15 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = arg8[var15 & 0xFF];
				}

				byte var16 = arg6[arg4++];
				if (var16 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = arg8[var16 & 0xFF];
				}
			}

			for (int var17 = arg1; var17 < 0; var17++) {
				byte var18 = arg6[arg4++];
				if (var18 == 0) {
					arg3++;
				} else {
					arg0[arg3++] = arg8[var18 & 0xFF];
				}
			}

			arg3 += arg7;
			arg4 += arg5;
		}
	}
}
