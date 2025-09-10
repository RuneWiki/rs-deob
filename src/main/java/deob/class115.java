package deob;

@ObfuscatedName("es")
public class class115 {

	@ObfuscatedName("es.af")
	public class97 field1506;

	@ObfuscatedName("es.aw")
	public boolean field1512;

	@ObfuscatedName("es.at")
	public int[] field1505;

	@ObfuscatedName("es.ac")
	public int[] field1503;

	@ObfuscatedName("es.ap")
	public boolean[] field1507;

	public class115(class97 arg0, boolean arg1, int[] arg2, int[] arg3, boolean[] arg4) {
		this.field1506 = arg0;
		this.field1512 = arg1;
		this.field1505 = arg2;
		this.field1503 = arg3;
		this.field1507 = arg4;
	}

	@ObfuscatedName("es.af([FIB)V")
	public void method3316(float[] arg0, int arg1) {
		int var3 = this.field1506.field1330.length;
		class97 var10000 = this.field1506;
		int var4 = class97.field1331[this.field1506.field1335 - 1];
		boolean[] var5 = this.field1507;
		this.field1507[1] = true;
		var5[0] = true;
		for (int var6 = 2; var6 < var3; var6++) {
			int var7 = this.field1506.method2961(this.field1505, var6);
			int var8 = this.field1506.method2962(this.field1505, var6);
			int var9 = this.field1506.method2972(this.field1505[var7], this.field1503[var7], this.field1505[var8], this.field1503[var8], this.field1505[var6]);
			int var10 = this.field1503[var6];
			int var11 = var4 - var9;
			int var13 = (var11 < var9 ? var11 : var9) << 1;
			if (var10 == 0) {
				this.field1507[var6] = false;
				this.field1503[var6] = var9;
			} else {
				boolean[] var14 = this.field1507;
				this.field1507[var8] = true;
				var14[var7] = true;
				this.field1507[var6] = true;
				if (var10 >= var13) {
					this.field1503[var6] = var11 > var9 ? var10 - var9 + var9 : var9 - var10 + var11 - 1;
				} else {
					this.field1503[var6] = (var10 & 0x1) == 0 ? var10 / 2 + var9 : var9 - (var10 + 1) / 2;
				}
			}
		}
		this.method3320(0, var3 - 1);
		int var16 = 0;
		int var17 = this.field1503[0] * this.field1506.field1335;
		for (int var18 = 1; var18 < var3; var18++) {
			if (this.field1507[var18]) {
				int var19 = this.field1505[var18];
				int var20 = this.field1503[var18] * this.field1506.field1335;
				this.field1506.method2960(var16, var17, var19, var20, arg0, arg1);
				if (var19 >= arg1) {
					return;
				}
				var16 = var19;
				var17 = var20;
			}
		}
		var10000 = this.field1506;
		float var21 = class97.field1329[var17];
		for (int var22 = var16; var22 < arg1; var22++) {
			arg0[var22] *= var21;
		}
	}

	@ObfuscatedName("es.aw(I)Z")
	public boolean method3318() {
		return this.field1512;
	}

	@ObfuscatedName("es.at(III)V")
	public void method3320(int arg0, int arg1) {
		if (arg0 >= arg1) {
			return;
		}
		int var3 = arg0;
		int var4 = this.field1505[arg0];
		int var5 = this.field1503[arg0];
		boolean var6 = this.field1507[arg0];
		for (int var7 = arg0 + 1; var7 <= arg1; var7++) {
			int var8 = this.field1505[var7];
			if (var8 < var4) {
				this.field1505[var3] = var8;
				this.field1503[var3] = this.field1503[var7];
				this.field1507[var3] = this.field1507[var7];
				var3++;
				this.field1505[var7] = this.field1505[var3];
				this.field1503[var7] = this.field1503[var3];
				this.field1507[var7] = this.field1507[var3];
			}
		}
		this.field1505[var3] = var4;
		this.field1503[var3] = var5;
		this.field1507[var3] = var6;
		this.method3320(arg0, var3 - 1);
		this.method3320(var3 + 1, arg1);
	}
}
