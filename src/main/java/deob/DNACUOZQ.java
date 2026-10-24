package deob;

@ObfuscatedName("DNACUOZQ")
public final class DNACUOZQ extends IIPNJDNO {

	@ObfuscatedName("DNACUOZQ.I")
	public int field522;

	@ObfuscatedName("DNACUOZQ.J")
	public int field523;

	@ObfuscatedName("DNACUOZQ.D")
	public int[] field517;

	@ObfuscatedName("DNACUOZQ.G")
	public int field520;

	@ObfuscatedName("DNACUOZQ.H")
	public int field521;

	@ObfuscatedName("DNACUOZQ.E")
	public int field518;

	@ObfuscatedName("DNACUOZQ.F")
	public int field519;

	@ObfuscatedName("DNACUOZQ.C")
	public byte[] field516;

	public DNACUOZQ(CVNWKEAW arg0, String arg1, int arg2) {
		XOUQUKZW var4 = new XOUQUKZW(arg0.method180(arg1 + ".dat", null));
		XOUQUKZW var5 = new XOUQUKZW(arg0.method180("index.dat", null));
		var5.field1367 = var4.method523();
		field522 = var5.method523();
		field523 = var5.method523();
		int var6 = var5.method521();
		field517 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			field517[var7 + 1] = var5.method525();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field1367 += 2;
			var4.field1367 += var5.method523() * var5.method523();
			var5.field1367++;
		}

		field520 = var5.method521();
		field521 = var5.method521();
		field518 = var5.method523();
		field519 = var5.method523();
		int var9 = var5.method521();
		int var10 = field519 * field518;
		field516 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				field516[var11] = var4.method522();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < field518; var12++) {
				for (int var13 = 0; var13 < field519; var13++) {
					field516[field518 * var13 + var12] = var4.method522();
				}
			}
		}
	}

	@ObfuscatedName("DNACUOZQ.c(I)V")
	public void method181() {
		field522 /= 2;
		field523 /= 2;
		byte[] var1 = new byte[field523 * field522];
		int var2 = 0;
		for (int var3 = 0; var3 < field519; var3++) {
			for (int var4 = 0; var4 < field518; var4++) {
				var1[(field520 + var4 >> 1) + (field521 + var3 >> 1) * field522] = field516[var2++];
			}
		}

		field516 = var1;
		field518 = field522;
		field519 = field523;
		field520 = 0;
		field521 = 0;
	}

	@ObfuscatedName("DNACUOZQ.a(Z)V")
	public void method182() {
		if (field522 != field518 || field523 != field519) {
			byte[] var1 = new byte[field523 * field522];
			int var2 = 0;
			for (int var3 = 0; var3 < field519; var3++) {
				for (int var4 = 0; var4 < field518; var4++) {
					var1[(field521 + var3) * field522 + field520 + var4] = field516[var2++];
				}
			}

			field516 = var1;
			field518 = field522;
			field519 = field523;
			field520 = 0;
			field521 = 0;
		}
	}

	@ObfuscatedName("DNACUOZQ.b(Z)V")
	public void method183() {
		byte[] var1 = new byte[field519 * field518];
		int var2 = 0;
		for (int var3 = 0; var3 < field519; var3++) {
			for (int var4 = field518 - 1; var4 >= 0; var4--) {
				var1[var2++] = field516[field518 * var3 + var4];
			}
		}

		field516 = var1;
		field520 = field522 - field518 - field520;
	}

	@ObfuscatedName("DNACUOZQ.c(Z)V")
	public void method184() {
		byte[] var1 = new byte[field519 * field518];
		int var2 = 0;
		for (int var3 = field519 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < field518; var4++) {
				var1[var2++] = field516[field518 * var3 + var4];
			}
		}

		field516 = var1;
		field521 = field523 - field519 - field521;
	}

	@ObfuscatedName("DNACUOZQ.a(ZIII)V")
	public void method185(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field517.length; var4++) {
			int var5 = field517[var4] >> 16 & 0xFF;
			var5 += arg1;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = field517[var4] >> 8 & 0xFF;
			var6 += arg0;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = field517[var4] & 0xFF;
			var7 += arg2;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			field517[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("DNACUOZQ.a(III)V")
	public void method186(int arg0, int arg1) {
		arg1 += field520;
		arg0 += field521;
		int var3 = IIPNJDNO.field812 * arg0 + arg1;
		int var4 = 0;
		int var5 = field519;
		int var6 = field518;
		int var7 = IIPNJDNO.field812 - var6;
		int var8 = 0;

		if (arg0 < IIPNJDNO.field814) {
			int var9 = IIPNJDNO.field814 - arg0;
			var5 -= var9;
			arg0 = IIPNJDNO.field814;
			var4 += var6 * var9;
			var3 += IIPNJDNO.field812 * var9;
		}

		if (arg0 + var5 > IIPNJDNO.field815) {
			var5 -= arg0 + var5 - IIPNJDNO.field815;
		}

		if (arg1 < IIPNJDNO.field816) {
			int var10 = IIPNJDNO.field816 - arg1;
			var6 -= var10;
			arg1 = IIPNJDNO.field816;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > IIPNJDNO.field817) {
			int var11 = arg1 + var6 - IIPNJDNO.field817;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method187(var3, var4, var7, var5, var6, field517, IIPNJDNO.field811, var8, field516);
		}
	}

	@ObfuscatedName("DNACUOZQ.a(IIIZII[I[II[B)V")
	public void method187(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int[] arg6, int arg7, byte[] arg8) {
		int var10 = -(arg4 >> 2);
		arg4 = -(arg4 & 0x3);
		for (int var11 = -arg3; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg8[arg1++];
				if (var13 == 0) {
					arg0++;
				} else {
					arg6[arg0++] = arg5[var13 & 0xFF];
				}

				byte var14 = arg8[arg1++];
				if (var14 == 0) {
					arg0++;
				} else {
					arg6[arg0++] = arg5[var14 & 0xFF];
				}

				byte var15 = arg8[arg1++];
				if (var15 == 0) {
					arg0++;
				} else {
					arg6[arg0++] = arg5[var15 & 0xFF];
				}

				byte var16 = arg8[arg1++];
				if (var16 == 0) {
					arg0++;
				} else {
					arg6[arg0++] = arg5[var16 & 0xFF];
				}
			}

			for (int var17 = arg4; var17 < 0; var17++) {
				byte var18 = arg8[arg1++];
				if (var18 == 0) {
					arg0++;
				} else {
					arg6[arg0++] = arg5[var18 & 0xFF];
				}
			}

			arg0 += arg2;
			arg1 += arg7;
		}
	}
}
