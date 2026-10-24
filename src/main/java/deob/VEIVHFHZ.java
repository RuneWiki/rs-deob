package deob;

@ObfuscatedName("VEIVHFHZ")
public final class VEIVHFHZ extends NBXZFIDS {

	@ObfuscatedName("VEIVHFHZ.I")
	public int field1349;

	@ObfuscatedName("VEIVHFHZ.J")
	public int field1350;

	@ObfuscatedName("VEIVHFHZ.D")
	public int[] field1344;

	@ObfuscatedName("VEIVHFHZ.G")
	public int field1347;

	@ObfuscatedName("VEIVHFHZ.H")
	public int field1348;

	@ObfuscatedName("VEIVHFHZ.E")
	public int field1345;

	@ObfuscatedName("VEIVHFHZ.F")
	public int field1346;

	@ObfuscatedName("VEIVHFHZ.C")
	public byte[] field1343;

	public VEIVHFHZ(XOJZVVDK arg0, String arg1, int arg2) {
		PQBRPYKE var4 = new PQBRPYKE(arg0.method560(arg1 + ".dat", null));
		PQBRPYKE var5 = new PQBRPYKE(arg0.method560("index.dat", null));
		var5.field1091 = var4.method342();
		field1349 = var5.method342();
		field1350 = var5.method342();
		int var6 = var5.method340();
		field1344 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			field1344[var7 + 1] = var5.method344();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field1091 += 2;
			var4.field1091 += var5.method342() * var5.method342();
			var5.field1091++;
		}

		field1347 = var5.method340();
		field1348 = var5.method340();
		field1345 = var5.method342();
		field1346 = var5.method342();
		int var9 = var5.method340();
		int var10 = field1346 * field1345;
		field1343 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				field1343[var11] = var4.method341();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < field1345; var12++) {
				for (int var13 = 0; var13 < field1346; var13++) {
					field1343[field1345 * var13 + var12] = var4.method341();
				}
			}
		}
	}

	@ObfuscatedName("VEIVHFHZ.a(B)V")
	public void method522() {
		field1349 /= 2;
		field1350 /= 2;
		byte[] var1 = new byte[field1350 * field1349];
		int var2 = 0;
		for (int var3 = 0; var3 < field1346; var3++) {
			for (int var4 = 0; var4 < field1345; var4++) {
				var1[(field1347 + var4 >> 1) + (field1348 + var3 >> 1) * field1349] = field1343[var2++];
			}
		}

		field1343 = var1;
		field1345 = field1349;
		field1346 = field1350;
		field1347 = 0;
		field1348 = 0;
	}

	@ObfuscatedName("VEIVHFHZ.b(I)V")
	public void method523() {
		if (field1349 != field1345 || field1350 != field1346) {
			byte[] var1 = new byte[field1350 * field1349];
			int var2 = 0;
			for (int var3 = 0; var3 < field1346; var3++) {
				for (int var4 = 0; var4 < field1345; var4++) {
					var1[(field1348 + var3) * field1349 + field1347 + var4] = field1343[var2++];
				}
			}

			field1343 = var1;
			field1345 = field1349;
			field1346 = field1350;
			field1347 = 0;
			field1348 = 0;
		}
	}

	@ObfuscatedName("VEIVHFHZ.b(B)V")
	public void method524() {
		byte[] var1 = new byte[field1346 * field1345];
		int var2 = 0;
		for (int var3 = 0; var3 < field1346; var3++) {
			for (int var4 = field1345 - 1; var4 >= 0; var4--) {
				var1[var2++] = field1343[field1345 * var3 + var4];
			}
		}

		field1343 = var1;
		field1347 = field1349 - field1345 - field1347;
	}

	@ObfuscatedName("VEIVHFHZ.c(I)V")
	public void method525() {
		byte[] var1 = new byte[field1346 * field1345];
		int var2 = 0;
		for (int var3 = field1346 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < field1345; var4++) {
				var1[var2++] = field1343[field1345 * var3 + var4];
			}
		}

		field1343 = var1;
		field1348 = field1350 - field1346 - field1348;
	}

	@ObfuscatedName("VEIVHFHZ.a(ZIII)V")
	public void method526(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field1344.length; var4++) {
			int var5 = field1344[var4] >> 16 & 0xFF;
			var5 += arg1;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = field1344[var4] >> 8 & 0xFF;
			var6 += arg0;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = field1344[var4] & 0xFF;
			var7 += arg2;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			field1344[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("VEIVHFHZ.a(III)V")
	public void method527(int arg0, int arg1) {
		arg1 += field1347;
		arg0 += field1348;
		int var3 = NBXZFIDS.field1027 * arg0 + arg1;
		int var4 = 0;
		int var5 = field1346;
		int var6 = field1345;
		int var7 = NBXZFIDS.field1027 - var6;
		int var8 = 0;

		if (arg0 < NBXZFIDS.field1029) {
			int var9 = NBXZFIDS.field1029 - arg0;
			var5 -= var9;
			arg0 = NBXZFIDS.field1029;
			var4 += var6 * var9;
			var3 += NBXZFIDS.field1027 * var9;
		}

		if (arg0 + var5 > NBXZFIDS.field1030) {
			var5 -= arg0 + var5 - NBXZFIDS.field1030;
		}

		if (arg1 < NBXZFIDS.field1031) {
			int var10 = NBXZFIDS.field1031 - arg1;
			var6 -= var10;
			arg1 = NBXZFIDS.field1031;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > NBXZFIDS.field1032) {
			int var11 = arg1 + var6 - NBXZFIDS.field1032;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method528(var6, field1343, var3, var7, NBXZFIDS.field1026, field1344, var4, var5, var8);
		}
	}

	@ObfuscatedName("VEIVHFHZ.a(I[BII[I[IIIBI)V")
	public void method528(int arg0, byte[] arg1, int arg2, int arg3, int[] arg4, int[] arg5, int arg6, int arg7, int arg8) {
		int var10 = -(arg0 >> 2);
		arg0 = -(arg0 & 0x3);
		for (int var11 = -arg7; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg1[arg6++];
				if (var13 == 0) {
					arg2++;
				} else {
					arg4[arg2++] = arg5[var13 & 0xFF];
				}

				byte var14 = arg1[arg6++];
				if (var14 == 0) {
					arg2++;
				} else {
					arg4[arg2++] = arg5[var14 & 0xFF];
				}

				byte var15 = arg1[arg6++];
				if (var15 == 0) {
					arg2++;
				} else {
					arg4[arg2++] = arg5[var15 & 0xFF];
				}

				byte var16 = arg1[arg6++];
				if (var16 == 0) {
					arg2++;
				} else {
					arg4[arg2++] = arg5[var16 & 0xFF];
				}
			}

			for (int var17 = arg0; var17 < 0; var17++) {
				byte var18 = arg1[arg6++];
				if (var18 == 0) {
					arg2++;
				} else {
					arg4[arg2++] = arg5[var18 & 0xFF];
				}
			}

			arg2 += arg3;
			arg6 += arg8;
		}
	}
}
