package deob;

@ObfuscatedName("VCTXURSE")
public final class VCTXURSE extends MVOWZCMY {

	@ObfuscatedName("VCTXURSE.J")
	public int field1318;

	@ObfuscatedName("VCTXURSE.K")
	public int field1319;

	@ObfuscatedName("VCTXURSE.E")
	public int[] field1313;

	@ObfuscatedName("VCTXURSE.H")
	public int field1316;

	@ObfuscatedName("VCTXURSE.I")
	public int field1317;

	@ObfuscatedName("VCTXURSE.F")
	public int field1314;

	@ObfuscatedName("VCTXURSE.G")
	public int field1315;

	@ObfuscatedName("VCTXURSE.D")
	public byte[] field1312;

	public VCTXURSE(SXKKBWPU arg0, String arg1, int arg2) {
		TQYMAXSO var4 = new TQYMAXSO(arg0.method442(arg1 + ".dat", null));
		TQYMAXSO var5 = new TQYMAXSO(arg0.method442("index.dat", null));
		var5.field1263 = var4.method470();
		field1318 = var5.method470();
		field1319 = var5.method470();
		int var6 = var5.method468();
		field1313 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			field1313[var7 + 1] = var5.method472();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field1263 += 2;
			var4.field1263 += var5.method470() * var5.method470();
			var5.field1263++;
		}

		field1316 = var5.method468();
		field1317 = var5.method468();
		field1314 = var5.method470();
		field1315 = var5.method470();
		int var9 = var5.method468();
		int var10 = field1315 * field1314;
		field1312 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				field1312[var11] = var4.method469();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < field1314; var12++) {
				for (int var13 = 0; var13 < field1315; var13++) {
					field1312[field1314 * var13 + var12] = var4.method469();
				}
			}
		}
	}

	@ObfuscatedName("VCTXURSE.a(Z)V")
	public void method534() {
		field1318 /= 2;
		field1319 /= 2;
		byte[] var1 = new byte[field1319 * field1318];
		int var2 = 0;
		for (int var3 = 0; var3 < field1315; var3++) {
			for (int var4 = 0; var4 < field1314; var4++) {
				var1[(field1316 + var4 >> 1) + (field1317 + var3 >> 1) * field1318] = field1312[var2++];
			}
		}

		field1312 = var1;
		field1314 = field1318;
		field1315 = field1319;
		field1316 = 0;
		field1317 = 0;
	}

	@ObfuscatedName("VCTXURSE.c(I)V")
	public void method535() {
		if (field1318 != field1314 || field1319 != field1315) {
			byte[] var1 = new byte[field1319 * field1318];
			int var2 = 0;
			for (int var3 = 0; var3 < field1315; var3++) {
				for (int var4 = 0; var4 < field1314; var4++) {
					var1[(field1317 + var3) * field1318 + field1316 + var4] = field1312[var2++];
				}
			}

			field1312 = var1;
			field1314 = field1318;
			field1315 = field1319;
			field1316 = 0;
			field1317 = 0;
		}
	}

	@ObfuscatedName("VCTXURSE.d(I)V")
	public void method536() {
		byte[] var1 = new byte[field1315 * field1314];
		int var2 = 0;
		for (int var3 = 0; var3 < field1315; var3++) {
			for (int var4 = field1314 - 1; var4 >= 0; var4--) {
				var1[var2++] = field1312[field1314 * var3 + var4];
			}
		}

		field1312 = var1;
		field1316 = field1318 - field1314 - field1316;
	}

	@ObfuscatedName("VCTXURSE.e(I)V")
	public void method537() {
		byte[] var1 = new byte[field1315 * field1314];
		int var2 = 0;
		for (int var3 = field1315 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < field1314; var4++) {
				var1[var2++] = field1312[field1314 * var3 + var4];
			}
		}

		field1312 = var1;
		field1317 = field1319 - field1315 - field1317;
	}

	@ObfuscatedName("VCTXURSE.a(IIII)V")
	public void method538(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field1313.length; var4++) {
			int var5 = field1313[var4] >> 16 & 0xFF;
			var5 += arg2;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = field1313[var4] >> 8 & 0xFF;
			var6 += arg0;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = field1313[var4] & 0xFF;
			var7 += arg1;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			field1313[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("VCTXURSE.a(III)V")
	public void method539(int arg0, int arg1) {
		arg0 += field1316;
		arg1 += field1317;
		int var3 = MVOWZCMY.field978 * arg1 + arg0;
		int var4 = 0;
		int var5 = field1315;
		int var6 = field1314;
		int var7 = MVOWZCMY.field978 - var6;
		int var8 = 0;

		if (arg1 < MVOWZCMY.field980) {
			int var9 = MVOWZCMY.field980 - arg1;
			var5 -= var9;
			arg1 = MVOWZCMY.field980;
			var4 += var6 * var9;
			var3 += MVOWZCMY.field978 * var9;
		}

		if (arg1 + var5 > MVOWZCMY.field981) {
			var5 -= arg1 + var5 - MVOWZCMY.field981;
		}

		if (arg0 < MVOWZCMY.field982) {
			int var10 = MVOWZCMY.field982 - arg0;
			var6 -= var10;
			arg0 = MVOWZCMY.field982;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg0 + var6 > MVOWZCMY.field983) {
			int var11 = arg0 + var6 - MVOWZCMY.field983;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method540(var3, var6, MVOWZCMY.field977, field1313, field1312, var8, var7, var5, var4);
		}
	}

	@ObfuscatedName("VCTXURSE.a(III[I[I[BIIII)V")
	public void method540(int arg0, int arg1, int[] arg2, int[] arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8) {
		int var10 = -(arg1 >> 2);
		arg1 = -(arg1 & 0x3);
		for (int var11 = -arg7; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg4[arg8++];
				if (var13 == 0) {
					arg0++;
				} else {
					arg2[arg0++] = arg3[var13 & 0xFF];
				}

				byte var14 = arg4[arg8++];
				if (var14 == 0) {
					arg0++;
				} else {
					arg2[arg0++] = arg3[var14 & 0xFF];
				}

				byte var15 = arg4[arg8++];
				if (var15 == 0) {
					arg0++;
				} else {
					arg2[arg0++] = arg3[var15 & 0xFF];
				}

				byte var16 = arg4[arg8++];
				if (var16 == 0) {
					arg0++;
				} else {
					arg2[arg0++] = arg3[var16 & 0xFF];
				}
			}

			for (int var17 = arg1; var17 < 0; var17++) {
				byte var18 = arg4[arg8++];
				if (var18 == 0) {
					arg0++;
				} else {
					arg2[arg0++] = arg3[var18 & 0xFF];
				}
			}

			arg0 += arg6;
			arg8 += arg5;
		}
	}
}
