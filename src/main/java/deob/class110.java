package deob;

@ObfuscatedName("ew")
public class class110 {

	@ObfuscatedName("ew.af")
	public class116 field1442;

	@ObfuscatedName("ew.aw")
	public class108[] field1440;

	@ObfuscatedName("ew.at")
	public int field1432;

	@ObfuscatedName("ew.ac")
	public int field1430;

	@ObfuscatedName("ew.ap")
	public class97[] field1450;

	@ObfuscatedName("ew.aq")
	public class102[] field1434;

	@ObfuscatedName("ew.ao")
	public class106[] field1437;

	@ObfuscatedName("ew.as")
	public boolean[] field1436;

	@ObfuscatedName("ew.al")
	public int[] field1429;

	@ObfuscatedName("ew.au")
	public float[] field1438;

	@ObfuscatedName("ew.ai")
	public float[] field1439;

	@ObfuscatedName("ew.aa")
	public float[] field1431;

	@ObfuscatedName("ew.am")
	public float[] field1441;

	@ObfuscatedName("ew.an")
	public float[] field1454;

	@ObfuscatedName("ew.ar")
	public float[] field1443;

	@ObfuscatedName("ew.ae")
	public int[] field1444;

	@ObfuscatedName("ew.ay")
	public int[] field1445;

	@ObfuscatedName("ew.ad")
	public byte[][] field1446;

	@ObfuscatedName("ew.ag")
	public int field1447;

	@ObfuscatedName("ew.av")
	public int field1448;

	@ObfuscatedName("ew.ah")
	public int field1449;

	@ObfuscatedName("ew.ab")
	public int field1455;

	@ObfuscatedName("ew.ax")
	public boolean field1451;

	@ObfuscatedName("ew.ak")
	public float[] field1452;

	@ObfuscatedName("ew.aj")
	public int field1433;

	@ObfuscatedName("ew.az")
	public int field1435;

	@ObfuscatedName("ew.bt")
	public boolean field1453;

	@ObfuscatedName("ew.bs")
	public float[] field1456;

	public class110(class116 arg0) {
		this.field1442 = arg0;
	}

	@ObfuscatedName("ew.af(Lwb;I)V")
	public void method3260(class591 arg0) {
		this.field1447 = arg0.method10345();
		this.field1448 = arg0.method10345();
		this.field1449 = arg0.method10345();
		this.field1455 = arg0.method10345();
		if (this.field1455 < 0) {
			this.field1455 = ~this.field1455;
			this.field1451 = true;
		}
		int var2 = arg0.method10345();
		this.field1446 = new byte[var2][];
		for (int var3 = 0; var3 < var2; var3++) {
			int var4 = 0;
			int var5;
			do {
				var5 = arg0.method10339();
				var4 += var5;
			} while (var5 >= 255);
			byte[] var6 = new byte[var4];
			arg0.method10407(var6, 0, var4);
			this.field1446[var3] = var6;
		}
	}

	@ObfuscatedName("ew.aw(I)Ldv;")
	public class96 method3259() {
		this.field1433 = 0;
		this.field1452 = new float[this.field1430];
		short[] var1 = new short[this.field1448];
		int var2 = 0;
		for (int var3 = 0; var3 < this.field1446.length; var3++) {
			float[] var4 = this.method3258(var3);
			if (var4 != null) {
				int var5 = var4.length;
				if (var5 > this.field1448 - var2) {
					var5 = this.field1448 - var2;
				}
				for (int var6 = 0; var6 < var5; var6++) {
					var1[var2++] = (short) class337.method9399(-32768, 32767, (int) (var4[var6] * 32768.0F));
				}
			}
		}
		this.field1452 = null;
		return new class96(this.field1447, var1, this.field1449, this.field1455, this.field1451, false);
	}

	@ObfuscatedName("ew.at(II)[F")
	public float[] method3258(int arg0) {
		class116 var2 = new class116();
		var2.method3327(this.field1446[arg0], 0);
		this.field1456 = new float[this.field1430];
		var2.method3330();
		int var3 = var2.method3332(class337.method9416(this.field1429.length - 1));
		boolean var4 = this.field1436[var3];
		int var5 = var4 ? this.field1430 : this.field1432;
		boolean var6 = false;
		boolean var7 = false;
		if (var4) {
			var6 = var2.method3330() != 0;
			var7 = var2.method3330() != 0;
		}
		int var8 = var5 >> 1;
		int var9;
		int var10;
		int var11;
		if (var4 && !var6) {
			var9 = (var5 >> 2) - (this.field1432 >> 2);
			var10 = (this.field1432 >> 2) + (var5 >> 2);
			var11 = this.field1432 >> 1;
		} else {
			var9 = 0;
			var10 = var8;
			var11 = var5 >> 1;
		}
		int var12;
		int var13;
		int var14;
		if (var4 && !var7) {
			var12 = var5 - (var5 >> 2) - (this.field1432 >> 2);
			var13 = (this.field1432 >> 2) + (var5 - (var5 >> 2));
			var14 = this.field1432 >> 1;
		} else {
			var12 = var8;
			var13 = var5;
			var14 = var5 >> 1;
		}
		class106 var15 = this.field1437[this.field1429[var3]];
		int var16 = var15.field1416;
		int var17 = var15.field1417[var16];
		class115 var18 = this.field1450[var17].method2974(var2, this.field1440);
		boolean var19 = !var18.method3318();
		for (int var20 = 0; var20 < var15.field1418; var20++) {
			class102 var21 = this.field1434[var15.field1415[var20]];
			float[] var22 = this.field1456;
			var21.method3060(var22, var5 >> 1, var19, var2, this.field1440);
		}
		if (var18.method3318()) {
			int var23 = var15.field1416;
			int var10000 = var15.field1417[var23];
			var18.method3316(this.field1456, var5 >> 1);
		}
		if (var18.method3318()) {
			int var26 = var5 >> 1;
			int var27 = var5 >> 2;
			int var28 = var5 >> 3;
			float[] var29 = this.field1456;
			for (int var30 = 0; var30 < var26; var30++) {
				var29[var30] *= 0.5F;
			}
			for (int var31 = var26; var31 < var5; var31++) {
				var29[var31] = -var29[var5 - var31 - 1];
			}
			float[] var32 = var4 ? this.field1441 : this.field1438;
			float[] var33 = var4 ? this.field1454 : this.field1439;
			float[] var34 = var4 ? this.field1443 : this.field1431;
			int[] var35 = var4 ? this.field1445 : this.field1444;
			for (int var36 = 0; var36 < var27; var36++) {
				float var37 = var29[var36 * 4] - var29[var5 - var36 * 4 - 1];
				float var38 = var29[var36 * 4 + 2] - var29[var5 - var36 * 4 - 3];
				float var39 = var32[var36 * 2];
				float var40 = var32[var36 * 2 + 1];
				var29[var5 - var36 * 4 - 1] = var37 * var39 - var38 * var40;
				var29[var5 - var36 * 4 - 3] = var37 * var40 + var38 * var39;
			}
			for (int var41 = 0; var41 < var28; var41++) {
				float var42 = var29[var41 * 4 + var26 + 3];
				float var43 = var29[var41 * 4 + var26 + 1];
				float var44 = var29[var41 * 4 + 3];
				float var45 = var29[var41 * 4 + 1];
				var29[var41 * 4 + var26 + 3] = var42 + var44;
				var29[var41 * 4 + var26 + 1] = var43 + var45;
				float var46 = var32[var26 - 4 - var41 * 4];
				float var47 = var32[var26 - 3 - var41 * 4];
				var29[var41 * 4 + 3] = (var42 - var44) * var46 - (var43 - var45) * var47;
				var29[var41 * 4 + 1] = (var42 - var44) * var47 + (var43 - var45) * var46;
			}
			int var48 = class337.method9416(var5 - 1);
			for (int var49 = 0; var49 < var48 - 3; var49++) {
				int var50 = var5 >> var49 + 2;
				int var51 = 0x8 << var49;
				for (int var52 = 0; var52 < 0x2 << var49; var52++) {
					int var53 = var5 - var50 * 2 * var52;
					int var54 = var5 - (var52 * 2 + 1) * var50;
					for (int var55 = 0; var55 < var5 >> var49 + 4; var55++) {
						int var56 = var55 * 4;
						float var57 = var29[var53 - 1 - var56];
						float var58 = var29[var53 - 3 - var56];
						float var59 = var29[var54 - 1 - var56];
						float var60 = var29[var54 - 3 - var56];
						var29[var53 - 1 - var56] = var57 + var59;
						var29[var53 - 3 - var56] = var58 + var60;
						float var61 = var32[var51 * var55];
						float var62 = var32[var51 * var55 + 1];
						var29[var54 - 1 - var56] = (var57 - var59) * var61 - (var58 - var60) * var62;
						var29[var54 - 3 - var56] = (var57 - var59) * var62 + (var58 - var60) * var61;
					}
				}
			}
			for (int var63 = 1; var63 < var28 - 1; var63++) {
				int var64 = var35[var63];
				if (var63 < var64) {
					int var65 = var63 * 8;
					int var66 = var64 * 8;
					float var67 = var29[var65 + 1];
					var29[var65 + 1] = var29[var66 + 1];
					var29[var66 + 1] = var67;
					float var68 = var29[var65 + 3];
					var29[var65 + 3] = var29[var66 + 3];
					var29[var66 + 3] = var68;
					float var69 = var29[var65 + 5];
					var29[var65 + 5] = var29[var66 + 5];
					var29[var66 + 5] = var69;
					float var70 = var29[var65 + 7];
					var29[var65 + 7] = var29[var66 + 7];
					var29[var66 + 7] = var70;
				}
			}
			for (int var71 = 0; var71 < var26; var71++) {
				var29[var71] = var29[var71 * 2 + 1];
			}
			for (int var72 = 0; var72 < var28; var72++) {
				var29[var5 - 1 - var72 * 2] = var29[var72 * 4];
				var29[var5 - 2 - var72 * 2] = var29[var72 * 4 + 1];
				var29[var5 - var27 - 1 - var72 * 2] = var29[var72 * 4 + 2];
				var29[var5 - var27 - 2 - var72 * 2] = var29[var72 * 4 + 3];
			}
			for (int var73 = 0; var73 < var28; var73++) {
				float var74 = var34[var73 * 2];
				float var75 = var34[var73 * 2 + 1];
				float var76 = var29[var73 * 2 + var26];
				float var77 = var29[var73 * 2 + var26 + 1];
				float var78 = var29[var5 - 2 - var73 * 2];
				float var79 = var29[var5 - 1 - var73 * 2];
				float var80 = (var76 - var78) * var75 + (var77 + var79) * var74;
				var29[var73 * 2 + var26] = (var76 + var78 + var80) * 0.5F;
				var29[var5 - 2 - var73 * 2] = (var76 + var78 - var80) * 0.5F;
				float var81 = (var77 + var79) * var75 - (var76 - var78) * var74;
				var29[var73 * 2 + var26 + 1] = (var77 - var79 + var81) * 0.5F;
				var29[var5 - 1 - var73 * 2] = (-var77 + var79 + var81) * 0.5F;
			}
			for (int var82 = 0; var82 < var27; var82++) {
				var29[var82] = var33[var82 * 2] * var29[var82 * 2 + var26] + var33[var82 * 2 + 1] * var29[var82 * 2 + 1 + var26];
				var29[var26 - 1 - var82] = var29[var82 * 2 + var26] * var33[var82 * 2 + 1] - var33[var82 * 2] * var29[var82 * 2 + 1 + var26];
			}
			for (int var83 = 0; var83 < var27; var83++) {
				var29[var5 - var27 + var83] = -var29[var83];
			}
			for (int var84 = 0; var84 < var27; var84++) {
				var29[var84] = var29[var27 + var84];
			}
			for (int var85 = 0; var85 < var27; var85++) {
				var29[var27 + var85] = -var29[var27 - var85 - 1];
			}
			for (int var86 = 0; var86 < var27; var86++) {
				var29[var26 + var86] = var29[var5 - var86 - 1];
			}
			for (int var87 = var9; var87 < var10; var87++) {
				float var88 = (float) Math.sin(((double) (var87 - var9) + 0.5D) / (double) var11 * 0.5D * 3.141592653589793D);
				this.field1456[var87] *= (float) Math.sin((double) var88 * 1.5707963267948966D * (double) var88);
			}
			for (int var89 = var12; var89 < var13; var89++) {
				float var90 = (float) Math.sin(((double) (var89 - var12) + 0.5D) / (double) var14 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
				this.field1456[var89] *= (float) Math.sin((double) var90 * 1.5707963267948966D * (double) var90);
			}
		} else {
			for (int var25 = var5 >> 1; var25 < var5; var25++) {
				this.field1456[var25] = 0.0F;
			}
		}
		float[] var91 = null;
		if (this.field1433 > 0) {
			int var92 = this.field1433 + var5 >> 2;
			var91 = new float[var92];
			if (!this.field1453) {
				for (int var93 = 0; var93 < this.field1435; var93++) {
					int var94 = (this.field1433 >> 1) + var93;
					var91[var93] += this.field1452[var94];
				}
			}
			if (var18.method3318()) {
				for (int var95 = var9; var95 < var5 >> 1; var95++) {
					int var96 = var91.length - (var5 >> 1) + var95;
					var91[var96] += this.field1456[var95];
				}
			}
		}
		float[] var97 = this.field1452;
		this.field1452 = this.field1456;
		this.field1456 = var97;
		this.field1433 = var5;
		this.field1435 = var13 - (var5 >> 1);
		this.field1453 = !var18.method3318();
		return var91;
	}

	@ObfuscatedName("ew.ac([BIB)V")
	public void method3262(byte[] arg0, int arg1) {
		class116 var3 = this.field1442;
		var3.method3327(arg0, arg1);
		this.field1432 = 0x1 << var3.method3332(4);
		this.field1430 = 0x1 << var3.method3332(4);
		for (int var4 = 0; var4 < 2; var4++) {
			int var5 = var4 == 0 ? this.field1432 : this.field1430;
			int var6 = var5 >> 1;
			int var7 = var5 >> 2;
			int var8 = var5 >> 3;
			float[] var9 = new float[var6];
			for (int var10 = 0; var10 < var7; var10++) {
				var9[var10 * 2] = (float) Math.cos((double) (var10 * 4) * 3.141592653589793D / (double) var5);
				var9[var10 * 2 + 1] = -((float) Math.sin((double) (var10 * 4) * 3.141592653589793D / (double) var5));
			}
			float[] var11 = new float[var6];
			for (int var12 = 0; var12 < var7; var12++) {
				var11[var12 * 2] = (float) Math.cos((double) (var12 * 2 + 1) * 3.141592653589793D / (double) (var5 * 2));
				var11[var12 * 2 + 1] = (float) Math.sin((double) (var12 * 2 + 1) * 3.141592653589793D / (double) (var5 * 2));
			}
			float[] var13 = new float[var7];
			for (int var14 = 0; var14 < var8; var14++) {
				var13[var14 * 2] = (float) Math.cos((double) (var14 * 4 + 2) * 3.141592653589793D / (double) var5);
				var13[var14 * 2 + 1] = -((float) Math.sin((double) (var14 * 4 + 2) * 3.141592653589793D / (double) var5));
			}
			int[] var15 = new int[var8];
			int var16 = class337.method9416(var8 - 1);
			for (int var17 = 0; var17 < var8; var17++) {
				int var20 = var17;
				int var21 = var16;
				int var22 = 0;
				while (var21 > 0) {
					var22 = var22 << 1 | var20 & 0x1;
					var20 >>>= 0x1;
					var21--;
				}
				var15[var17] = var22;
			}
			if (var4 == 0) {
				this.field1438 = var9;
				this.field1439 = var11;
				this.field1431 = var13;
				this.field1444 = var15;
			} else {
				this.field1441 = var9;
				this.field1454 = var11;
				this.field1443 = var13;
				this.field1445 = var15;
			}
		}
		int var24 = var3.method3332(8) + 1;
		this.field1440 = new class108[var24];
		for (int var25 = 0; var25 < var24; var25++) {
			this.field1440[var25] = new class108(var3);
		}
		int var26 = var3.method3332(6) + 1;
		for (int var27 = 0; var27 < var26; var27++) {
			var3.method3332(16);
		}
		int var28 = var3.method3332(6) + 1;
		this.field1450 = new class97[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			this.field1450[var29] = new class97(var3);
		}
		int var30 = var3.method3332(6) + 1;
		this.field1434 = new class102[var30];
		for (int var31 = 0; var31 < var30; var31++) {
			this.field1434[var31] = new class102(var3);
		}
		int var32 = var3.method3332(6) + 1;
		this.field1437 = new class106[var32];
		for (int var33 = 0; var33 < var32; var33++) {
			this.field1437[var33] = new class106(var3);
		}
		int var34 = var3.method3332(6) + 1;
		this.field1436 = new boolean[var34];
		this.field1429 = new int[var34];
		for (int var35 = 0; var35 < var34; var35++) {
			this.field1436[var35] = var3.method3330() != 0;
			var3.method3332(16);
			var3.method3332(16);
			this.field1429[var35] = var3.method3332(8);
		}
	}
}
