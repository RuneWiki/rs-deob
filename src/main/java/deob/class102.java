package deob;

@ObfuscatedName("dj")
public class class102 {

	@ObfuscatedName("dj.af")
	public int field1380;

	@ObfuscatedName("dj.aw")
	public int field1386;

	@ObfuscatedName("dj.at")
	public int field1382;

	@ObfuscatedName("dj.ac")
	public int field1383;

	@ObfuscatedName("dj.ap")
	public int field1381;

	@ObfuscatedName("dj.aq")
	public int field1385;

	@ObfuscatedName("dj.ao")
	public int[] field1384;

	public class102(class116 arg0) {
		this.field1380 = arg0.method3332(16);
		this.field1386 = arg0.method3332(24);
		this.field1382 = arg0.method3332(24);
		this.field1383 = arg0.method3332(24) + 1;
		this.field1381 = arg0.method3332(6) + 1;
		this.field1385 = arg0.method3332(8);
		int[] var2 = new int[this.field1381];
		for (int var3 = 0; var3 < this.field1381; var3++) {
			int var4 = 0;
			int var5 = arg0.method3332(3);
			boolean var6 = arg0.method3330() != 0;
			if (var6) {
				var4 = arg0.method3332(5);
			}
			var2[var3] = var4 << 3 | var5;
		}
		this.field1384 = new int[this.field1381 * 8];
		for (int var7 = 0; var7 < this.field1381 * 8; var7++) {
			this.field1384[var7] = (var2[var7 >> 3] & 0x1 << (var7 & 0x7)) == 0 ? -1 : arg0.method3332(8);
		}
	}

	@ObfuscatedName("dj.af([FIZLed;[Leb;)V")
	public void method3060(float[] arg0, int arg1, boolean arg2, class116 arg3, class108[] arg4) {
		for (int var6 = 0; var6 < arg1; var6++) {
			arg0[var6] = 0.0F;
		}
		if (arg2) {
			return;
		}
		int var7 = arg4[this.field1385].field1419;
		int var8 = this.field1382 - this.field1386;
		int var9 = var8 / this.field1383;
		int[] var10 = new int[var9];
		for (int var11 = 0; var11 < 8; var11++) {
			int var12 = 0;
			while (var12 < var9) {
				if (var11 == 0) {
					int var13 = arg4[this.field1385].method3224(arg3);
					for (int var14 = var7 - 1; var14 >= 0; var14--) {
						if (var12 + var14 < var9) {
							var10[var12 + var14] = var13 % this.field1381;
						}
						var13 /= this.field1381;
					}
				}
				for (int var15 = 0; var15 < var7; var15++) {
					int var16 = var10[var12];
					int var17 = this.field1384[var16 * 8 + var11];
					if (var17 >= 0) {
						int var18 = this.field1383 * var12 + this.field1386;
						class108 var19 = arg4[var17];
						if (this.field1380 == 0) {
							int var20 = this.field1383 / var19.field1419;
							for (int var21 = 0; var21 < var20; var21++) {
								float[] var22 = var19.method3228(arg3);
								for (int var23 = 0; var23 < var19.field1419; var23++) {
									arg0[var20 * var23 + var18 + var21] += var22[var23];
								}
							}
						} else {
							int var24 = 0;
							while (var24 < this.field1383) {
								float[] var25 = var19.method3228(arg3);
								for (int var26 = 0; var26 < var19.field1419; var26++) {
									arg0[var18 + var24] += var25[var26];
									var24++;
								}
							}
						}
					}
					var12++;
					if (var12 >= var9) {
						break;
					}
				}
			}
		}
	}
}
