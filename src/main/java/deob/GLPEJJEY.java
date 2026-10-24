package deob;

@ObfuscatedName("GLPEJJEY")
public final class GLPEJJEY extends OMVHXJFV {

	@ObfuscatedName("GLPEJJEY.K")
	public int field792;

	@ObfuscatedName("GLPEJJEY.L")
	public int field793;

	@ObfuscatedName("GLPEJJEY.F")
	public int[] field787;

	@ObfuscatedName("GLPEJJEY.I")
	public int field790;

	@ObfuscatedName("GLPEJJEY.J")
	public int field791;

	@ObfuscatedName("GLPEJJEY.G")
	public int field788;

	@ObfuscatedName("GLPEJJEY.H")
	public int field789;

	@ObfuscatedName("GLPEJJEY.E")
	public byte[] field786;

	public GLPEJJEY(SYUGXMZF arg0, String arg1, int arg2) {
		KHOMSBHW var4 = new KHOMSBHW(arg0.method551(arg1 + ".dat", null));
		KHOMSBHW var5 = new KHOMSBHW(arg0.method551("index.dat", null));
		var5.field934 = var4.method351();
		field792 = var5.method351();
		field793 = var5.method351();
		int var6 = var5.method349();
		field787 = new int[var6];
		for (int var7 = 0; var7 < var6 - 1; var7++) {
			field787[var7 + 1] = var5.method353();
		}

		for (int var8 = 0; var8 < arg2; var8++) {
			var5.field934 += 2;
			var4.field934 += var5.method351() * var5.method351();
			var5.field934++;
		}

		field790 = var5.method349();
		field791 = var5.method349();
		field788 = var5.method351();
		field789 = var5.method351();
		int var9 = var5.method349();
		int var10 = field789 * field788;
		field786 = new byte[var10];
		if (var9 == 0) {
			for (int var11 = 0; var11 < var10; var11++) {
				field786[var11] = var4.method350();
			}
		} else if (var9 == 1) {
			for (int var12 = 0; var12 < field788; var12++) {
				for (int var13 = 0; var13 < field789; var13++) {
					field786[field788 * var13 + var12] = var4.method350();
				}
			}
		}
	}

	@ObfuscatedName("GLPEJJEY.a(B)V")
	public void method314() {
		field792 /= 2;
		field793 /= 2;
		byte[] var1 = new byte[field793 * field792];
		int var2 = 0;
		for (int var3 = 0; var3 < field789; var3++) {
			for (int var4 = 0; var4 < field788; var4++) {
				var1[(field790 + var4 >> 1) + (field791 + var3 >> 1) * field792] = field786[var2++];
			}
		}

		field786 = var1;
		field788 = field792;
		field789 = field793;
		field790 = 0;
		field791 = 0;
	}

	@ObfuscatedName("GLPEJJEY.c(I)V")
	public void method315() {
		if (field792 != field788 || field793 != field789) {
			byte[] var1 = new byte[field793 * field792];
			int var2 = 0;
			for (int var3 = 0; var3 < field789; var3++) {
				for (int var4 = 0; var4 < field788; var4++) {
					var1[(field791 + var3) * field792 + field790 + var4] = field786[var2++];
				}
			}

			field786 = var1;
			field788 = field792;
			field789 = field793;
			field790 = 0;
			field791 = 0;
		}
	}

	@ObfuscatedName("GLPEJJEY.a(Z)V")
	public void method316() {
		byte[] var1 = new byte[field789 * field788];
		int var2 = 0;
		for (int var3 = 0; var3 < field789; var3++) {
			for (int var4 = field788 - 1; var4 >= 0; var4--) {
				var1[var2++] = field786[field788 * var3 + var4];
			}
		}

		field786 = var1;
		field790 = field792 - field788 - field790;
	}

	@ObfuscatedName("GLPEJJEY.d(I)V")
	public void method317() {
		byte[] var1 = new byte[field789 * field788];
		int var2 = 0;
		for (int var3 = field789 - 1; var3 >= 0; var3--) {
			for (int var4 = 0; var4 < field788; var4++) {
				var1[var2++] = field786[field788 * var3 + var4];
			}
		}

		field786 = var1;
		field791 = field793 - field789 - field791;
	}

	@ObfuscatedName("GLPEJJEY.a(IIBI)V")
	public void method318(int arg0, int arg1, int arg2) {
		for (int var4 = 0; var4 < field787.length; var4++) {
			int var5 = field787[var4] >> 16 & 0xFF;
			var5 += arg1;
			if (var5 < 0) {
				var5 = 0;
			} else if (var5 > 255) {
				var5 = 255;
			}

			int var6 = field787[var4] >> 8 & 0xFF;
			var6 += arg0;
			if (var6 < 0) {
				var6 = 0;
			} else if (var6 > 255) {
				var6 = 255;
			}

			int var7 = field787[var4] & 0xFF;
			var7 += arg2;
			if (var7 < 0) {
				var7 = 0;
			} else if (var7 > 255) {
				var7 = 255;
			}

			field787[var4] = (var5 << 16) + (var6 << 8) + var7;
		}
	}

	@ObfuscatedName("GLPEJJEY.a(IIB)V")
	public void method319(int arg0, int arg1) {
		arg1 += field790;
		arg0 += field791;
		int var3 = OMVHXJFV.field1050 * arg0 + arg1;
		int var4 = 0;
		int var5 = field789;
		int var6 = field788;
		int var7 = OMVHXJFV.field1050 - var6;
		int var8 = 0;

		if (arg0 < OMVHXJFV.field1052) {
			int var9 = OMVHXJFV.field1052 - arg0;
			var5 -= var9;
			arg0 = OMVHXJFV.field1052;
			var4 += var6 * var9;
			var3 += OMVHXJFV.field1050 * var9;
		}

		if (arg0 + var5 > OMVHXJFV.field1053) {
			var5 -= arg0 + var5 - OMVHXJFV.field1053;
		}

		if (arg1 < OMVHXJFV.field1054) {
			int var10 = OMVHXJFV.field1054 - arg1;
			var6 -= var10;
			arg1 = OMVHXJFV.field1054;
			var4 += var10;
			var3 += var10;
			var8 += var10;
			var7 += var10;
		}

		if (arg1 + var6 > OMVHXJFV.field1055) {
			int var11 = arg1 + var6 - OMVHXJFV.field1055;
			var6 -= var11;
			var8 += var11;
			var7 += var11;
		}

		if (var6 > 0 && var5 > 0) {
			method320(var4, OMVHXJFV.field1049, field787, var8, var5, var6, field786, var7, var3);
		}
	}

	@ObfuscatedName("GLPEJJEY.a(I[I[IIII[BIIZ)V")
	public void method320(int arg0, int[] arg1, int[] arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
		int var10 = -(arg5 >> 2);
		arg5 = -(arg5 & 0x3);
		for (int var11 = -arg4; var11 < 0; var11++) {
			for (int var12 = var10; var12 < 0; var12++) {
				byte var13 = arg6[arg0++];
				if (var13 == 0) {
					arg8++;
				} else {
					arg1[arg8++] = arg2[var13 & 0xFF];
				}

				byte var14 = arg6[arg0++];
				if (var14 == 0) {
					arg8++;
				} else {
					arg1[arg8++] = arg2[var14 & 0xFF];
				}

				byte var15 = arg6[arg0++];
				if (var15 == 0) {
					arg8++;
				} else {
					arg1[arg8++] = arg2[var15 & 0xFF];
				}

				byte var16 = arg6[arg0++];
				if (var16 == 0) {
					arg8++;
				} else {
					arg1[arg8++] = arg2[var16 & 0xFF];
				}
			}

			for (int var17 = arg5; var17 < 0; var17++) {
				byte var18 = arg6[arg0++];
				if (var18 == 0) {
					arg8++;
				} else {
					arg1[arg8++] = arg2[var18 & 0xFF];
				}
			}

			arg8 += arg7;
			arg0 += arg3;
		}
	}
}
