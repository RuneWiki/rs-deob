package deob;

@ObfuscatedName("ek")
public class class114 {

	@ObfuscatedName("ek.ap")
	public static float[][] field1494 = new float[2][8];

	@ObfuscatedName("ek.aq")
	public static int[][] field1496 = new int[2][8];

	@ObfuscatedName("ek.al")
	public int[] field1499 = new int[2];

	@ObfuscatedName("ek.au")
	public int[][][] field1500 = new int[2][2][4];

	@ObfuscatedName("ek.ai")
	public int[][][] field1501 = new int[2][2][4];

	@ObfuscatedName("ek.aa")
	public int[] field1491 = new int[2];

	@ObfuscatedName("ek.af(FI)F")
	public static float method3297(float arg0, int arg1) {
		float var2 = (float) Math.pow(2.0D, (double) arg0) * 32.703197F;
		return var2 * 3.1415927F / (float) (arg1 / 2);
	}

	@ObfuscatedName("ek.aw(IIF)F")
	public float method3298(int arg0, int arg1, float arg2) {
		float var4 = (float) (this.field1501[arg0][1][arg1] - this.field1501[arg0][0][arg1]) * arg2 + (float) this.field1501[arg0][0][arg1];
		float var5 = var4 * 0.0015258789F;
		return 1.0F - (float) Math.pow(10.0D, (double) (-var5 / 20.0F));
	}

	@ObfuscatedName("ek.at(IIFI)F")
	public float method3299(int arg0, int arg1, float arg2, int arg3) {
		float var5 = (float) (this.field1500[arg0][1][arg1] - this.field1500[arg0][0][arg1]) * arg2 + (float) this.field1500[arg0][0][arg1];
		float var6 = var5 * 1.2207031E-4F;
		return method3297(var6, arg3);
	}

	@ObfuscatedName("ek.ac(IFI)I")
	public int method3296(int arg0, float arg1, int arg2) {
		if (arg0 == 0) {
			float var4 = (float) (this.field1491[1] - this.field1491[0]) * arg1 + (float) this.field1491[0];
			float var5 = var4 * 0.0030517578F;
			Statics.field1497 = (float) Math.pow(0.1D, (double) (var5 / 20.0F));
			Statics.field1495 = (int) (Statics.field1497 * 65536.0F);
		}
		if (this.field1499[arg0] == 0) {
			return 0;
		}
		float var6 = this.method3298(arg0, 0, arg1);
		field1494[arg0][0] = var6 * -2.0F * (float) Math.cos((double) this.method3299(arg0, 0, arg1, arg2));
		field1494[arg0][1] = var6 * var6;
		for (int var7 = 1; var7 < this.field1499[arg0]; var7++) {
			float var8 = this.method3298(arg0, var7, arg1);
			float var9 = var8 * -2.0F * (float) Math.cos((double) this.method3299(arg0, var7, arg1, arg2));
			float var10 = var8 * var8;
			field1494[arg0][var7 * 2 + 1] = field1494[arg0][var7 * 2 - 1] * var10;
			field1494[arg0][var7 * 2] = field1494[arg0][var7 * 2 - 1] * var9 + field1494[arg0][var7 * 2 - 2] * var10;
			for (int var11 = var7 * 2 - 1; var11 >= 2; var11--) {
				field1494[arg0][var11] += field1494[arg0][var11 - 1] * var9 + field1494[arg0][var11 - 2] * var10;
			}
			field1494[arg0][1] += field1494[arg0][0] * var9 + var10;
			field1494[arg0][0] += var9;
		}
		if (arg0 == 0) {
			for (int var12 = 0; var12 < this.field1499[0] * 2; var12++) {
				field1494[0][var12] *= Statics.field1497;
			}
		}
		for (int var13 = 0; var13 < this.field1499[arg0] * 2; var13++) {
			field1496[arg0][var13] = (int) (field1494[arg0][var13] * 65536.0F);
		}
		return this.field1499[arg0] * 2;
	}

	@ObfuscatedName("ek.ap(Lwb;Ldf;)V")
	public final void method3301(class591 arg0, class99 arg1) {
		int var3 = arg0.method10339();
		this.field1499[0] = var3 >> 4;
		this.field1499[1] = var3 & 0xF;
		if (var3 == 0) {
			int[] var9 = this.field1491;
			this.field1491[1] = 0;
			var9[0] = 0;
			return;
		}
		this.field1491[0] = arg0.method10341();
		this.field1491[1] = arg0.method10341();
		int var4 = arg0.method10339();
		for (int var5 = 0; var5 < 2; var5++) {
			for (int var6 = 0; var6 < this.field1499[var5]; var6++) {
				this.field1500[var5][0][var6] = arg0.method10341();
				this.field1501[var5][0][var6] = arg0.method10341();
			}
		}
		for (int var7 = 0; var7 < 2; var7++) {
			for (int var8 = 0; var8 < this.field1499[var7]; var8++) {
				if ((var4 & 0x1 << var7 * 4 << var8) == 0) {
					this.field1500[var7][1][var8] = this.field1500[var7][0][var8];
					this.field1501[var7][1][var8] = this.field1501[var7][0][var8];
				} else {
					this.field1500[var7][1][var8] = arg0.method10341();
					this.field1501[var7][1][var8] = arg0.method10341();
				}
			}
		}
		if (var4 != 0 || this.field1491[1] != this.field1491[0]) {
			arg1.method3016(arg0);
		}
	}
}
