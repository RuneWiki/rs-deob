package deob;

@ObfuscatedName("eb")
public class class108 {

	@ObfuscatedName("eb.af")
	public int field1419;

	@ObfuscatedName("eb.aw")
	public int field1421;

	@ObfuscatedName("eb.at")
	public int[] field1424;

	@ObfuscatedName("eb.ac")
	public int[] field1422;

	@ObfuscatedName("eb.ap")
	public float[][] field1423;

	@ObfuscatedName("eb.aq")
	public int[] field1420;

	public class108(class116 arg0) {
		arg0.method3332(24);
		this.field1419 = arg0.method3332(16);
		this.field1421 = arg0.method3332(24);
		this.field1424 = new int[this.field1421];
		boolean var2 = arg0.method3330() != 0;
		if (var2) {
			int var3 = 0;
			int var4 = arg0.method3332(5) + 1;
			while (var3 < this.field1421) {
				int var5 = arg0.method3332(class337.method9416(this.field1421 - var3));
				for (int var6 = 0; var6 < var5; var6++) {
					this.field1424[var3++] = var4;
				}
				var4++;
			}
		} else {
			boolean var7 = arg0.method3330() != 0;
			for (int var8 = 0; var8 < this.field1421; var8++) {
				if (var7 && arg0.method3330() == 0) {
					this.field1424[var8] = 0;
				} else {
					this.field1424[var8] = arg0.method3332(5) + 1;
				}
			}
		}
		this.method3223();
		int var9 = arg0.method3332(4);
		if (var9 > 0) {
			float var10 = class111.method3266(arg0.method3332(32));
			float var11 = class111.method3266(arg0.method3332(32));
			int var12 = arg0.method3332(4) + 1;
			boolean var13 = arg0.method3330() != 0;
			int var14;
			if (var9 == 1) {
				var14 = method3222(this.field1421, this.field1419);
			} else {
				var14 = this.field1421 * this.field1419;
			}
			this.field1422 = new int[var14];
			for (int var15 = 0; var15 < var14; var15++) {
				this.field1422[var15] = arg0.method3332(var12);
			}
			this.field1423 = new float[this.field1421][this.field1419];
			if (var9 == 1) {
				for (int var16 = 0; var16 < this.field1421; var16++) {
					float var17 = 0.0F;
					int var18 = 1;
					for (int var19 = 0; var19 < this.field1419; var19++) {
						int var20 = var16 / var18 % var14;
						float var21 = (float) this.field1422[var20] * var11 + var10 + var17;
						this.field1423[var16][var19] = var21;
						if (var13) {
							var17 = var21;
						}
						var18 = var14 * var18;
					}
				}
			} else {
				for (int var22 = 0; var22 < this.field1421; var22++) {
					float var23 = 0.0F;
					int var24 = this.field1419 * var22;
					for (int var25 = 0; var25 < this.field1419; var25++) {
						float var26 = (float) this.field1422[var24] * var11 + var10 + var23;
						this.field1423[var22][var25] = var26;
						if (var13) {
							var23 = var26;
						}
						var24++;
					}
				}
			}
		}
	}

	@ObfuscatedName("eb.af(II)I")
	public static int method3222(int arg0, int arg1) {
		int var2;
		for (var2 = (int) Math.pow((double) arg0, 1.0D / (double) arg1) + 1; class337.method3606(var2, arg1) > arg0; var2--) {
		}
		return var2;
	}

	@ObfuscatedName("eb.aw()V")
	public void method3223() {
		int[] var1 = new int[this.field1421];
		int[] var2 = new int[33];
		for (int var3 = 0; var3 < this.field1421; var3++) {
			int var4 = this.field1424[var3];
			if (var4 != 0) {
				int var5 = 0x1 << 32 - var4;
				int var6 = var2[var4];
				var1[var3] = var6;
				int var7;
				if ((var6 & var5) == 0) {
					var7 = var6 | var5;
					for (int var8 = var4 - 1; var8 >= 1; var8--) {
						int var9 = var2[var8];
						if (var6 != var9) {
							break;
						}
						int var10 = 0x1 << 32 - var8;
						if ((var9 & var10) != 0) {
							var2[var8] = var2[var8 - 1];
							break;
						}
						var2[var8] = var9 | var10;
					}
				} else {
					var7 = var2[var4 - 1];
				}
				var2[var4] = var7;
				for (int var11 = var4 + 1; var11 <= 32; var11++) {
					int var12 = var2[var11];
					if (var6 == var12) {
						var2[var11] = var7;
					}
				}
			}
		}
		this.field1420 = new int[8];
		int var13 = 0;
		for (int var14 = 0; var14 < this.field1421; var14++) {
			int var15 = this.field1424[var14];
			if (var15 != 0) {
				int var16 = var1[var14];
				int var17 = 0;
				for (int var18 = 0; var18 < var15; var18++) {
					int var19 = Integer.MIN_VALUE >>> var18;
					if ((var16 & var19) == 0) {
						var17++;
					} else {
						if (this.field1420[var17] == 0) {
							this.field1420[var17] = var13;
						}
						var17 = this.field1420[var17];
					}
					if (var17 >= this.field1420.length) {
						int[] var20 = new int[this.field1420.length * 2];
						for (int var21 = 0; var21 < this.field1420.length; var21++) {
							var20[var21] = this.field1420[var21];
						}
						this.field1420 = var20;
					}
					int var22 = var19 >>> 1;
				}
				this.field1420[var17] = ~var14;
				if (var17 >= var13) {
					var13 = var17 + 1;
				}
			}
		}
	}

	@ObfuscatedName("eb.at(Led;)I")
	public int method3224(class116 arg0) {
		int var2;
		for (var2 = 0; this.field1420[var2] >= 0; var2 = arg0.method3330() == 0 ? var2 + 1 : this.field1420[var2]) {
		}
		return ~this.field1420[var2];
	}

	@ObfuscatedName("eb.ac(Led;)[F")
	public float[] method3228(class116 arg0) {
		return this.field1423[this.method3224(arg0)];
	}
}
