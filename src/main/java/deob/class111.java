package deob;

@ObfuscatedName("eo")
public class class111 extends class545 {

	@ObfuscatedName("eo.af")
	public static class116 field1466 = new class116();

	@ObfuscatedName("eo.au")
	public static boolean field1462 = false;

	@ObfuscatedName("eo.ag")
	public byte[][] field1475;

	@ObfuscatedName("eo.av")
	public int field1476;

	@ObfuscatedName("eo.ah")
	public int field1488;

	@ObfuscatedName("eo.ab")
	public int field1487;

	@ObfuscatedName("eo.ax")
	public int field1479;

	@ObfuscatedName("eo.ak")
	public boolean field1465;

	@ObfuscatedName("eo.aj")
	public float[] field1481;

	@ObfuscatedName("eo.az")
	public int field1477;

	@ObfuscatedName("eo.bt")
	public int field1483;

	@ObfuscatedName("eo.bs")
	public boolean field1484;

	@ObfuscatedName("eo.bu")
	public float[] field1457;

	@ObfuscatedName("eo.bi")
	public short[] field1486;

	@ObfuscatedName("eo.bd")
	public int field1485;

	@ObfuscatedName("eo.ba")
	public int field1482;

	public class111(byte[] arg0) {
		this.method3270(arg0);
	}

	@ObfuscatedName("eo.af(I)F")
	public static float method3266(int arg0) {
		int var1 = arg0 & 0x1FFFFF;
		int var2 = arg0 & Integer.MIN_VALUE;
		int var3 = arg0 >> 21 & 0x3FF;
		if (var2 != 0) {
			var1 = -var1;
		}
		return (float) ((double) var1 * Math.pow(2.0D, (double) (var3 - 788)));
	}

	@ObfuscatedName("eo.aw([B)V")
	public static void method3267(byte[] arg0) {
		class116 var1 = field1466;
		var1.method3327(arg0, 0);
		Statics.field1459 = 0x1 << var1.method3332(4);
		Statics.field1460 = 0x1 << var1.method3332(4);
		for (int var2 = 0; var2 < 2; var2++) {
			int var3 = var2 == 0 ? Statics.field1459 : Statics.field1460;
			int var4 = var3 >> 1;
			int var5 = var3 >> 2;
			int var6 = var3 >> 3;
			float[] var7 = new float[var4];
			for (int var8 = 0; var8 < var5; var8++) {
				var7[var8 * 2] = (float) Math.cos((double) (var8 * 4) * 3.141592653589793D / (double) var3);
				var7[var8 * 2 + 1] = -((float) Math.sin((double) (var8 * 4) * 3.141592653589793D / (double) var3));
			}
			float[] var9 = new float[var4];
			for (int var10 = 0; var10 < var5; var10++) {
				var9[var10 * 2] = (float) Math.cos((double) (var10 * 2 + 1) * 3.141592653589793D / (double) (var3 * 2));
				var9[var10 * 2 + 1] = (float) Math.sin((double) (var10 * 2 + 1) * 3.141592653589793D / (double) (var3 * 2));
			}
			float[] var11 = new float[var5];
			for (int var12 = 0; var12 < var6; var12++) {
				var11[var12 * 2] = (float) Math.cos((double) (var12 * 4 + 2) * 3.141592653589793D / (double) var3);
				var11[var12 * 2 + 1] = -((float) Math.sin((double) (var12 * 4 + 2) * 3.141592653589793D / (double) var3));
			}
			int[] var13 = new int[var6];
			int var14 = class337.method9416(var6 - 1);
			for (int var15 = 0; var15 < var6; var15++) {
				int var18 = var15;
				int var19 = var14;
				int var20 = 0;
				while (var19 > 0) {
					var20 = var20 << 1 | var18 & 0x1;
					var18 >>>= 0x1;
					var19--;
				}
				var13[var15] = var20;
			}
			if (var2 == 0) {
				Statics.field1467 = var7;
				Statics.field1468 = var9;
				Statics.field1469 = var11;
				Statics.field1473 = var13;
			} else {
				Statics.field1470 = var7;
				Statics.field1471 = var9;
				Statics.field1472 = var11;
				Statics.field1474 = var13;
			}
		}
		int var22 = var1.method3332(8) + 1;
		Statics.field1458 = new class108[var22];
		for (int var23 = 0; var23 < var22; var23++) {
			Statics.field1458[var23] = new class108(field1466);
		}
		int var24 = var1.method3332(6) + 1;
		for (int var25 = 0; var25 < var24; var25++) {
			var1.method3332(16);
		}
		int var26 = var1.method3332(6) + 1;
		Statics.field1461 = new class97[var26];
		for (int var27 = 0; var27 < var26; var27++) {
			Statics.field1461[var27] = new class97(field1466);
		}
		int var28 = var1.method3332(6) + 1;
		Statics.field1480 = new class102[var28];
		for (int var29 = 0; var29 < var28; var29++) {
			Statics.field1480[var29] = new class102(field1466);
		}
		int var30 = var1.method3332(6) + 1;
		Statics.field1463 = new class106[var30];
		for (int var31 = 0; var31 < var30; var31++) {
			Statics.field1463[var31] = new class106(field1466);
		}
		int var32 = var1.method3332(6) + 1;
		Statics.field1464 = new boolean[var32];
		Statics.field1478 = new int[var32];
		for (int var33 = 0; var33 < var32; var33++) {
			Statics.field1464[var33] = var1.method3330() != 0;
			var1.method3332(16);
			var1.method3332(16);
			Statics.field1478[var33] = var1.method3332(8);
		}
	}

	@ObfuscatedName("eo.at(Lpx;)Z")
	public static boolean method3268(class413 arg0) {
		if (!field1462) {
			byte[] var1 = arg0.method7692(0, 0);
			if (var1 == null) {
				return false;
			}
			method3267(var1);
			field1462 = true;
		}
		return true;
	}

	@ObfuscatedName("eo.ac(Lpx;II)Leo;")
	public static class111 method3282(class413 arg0, int arg1, int arg2) {
		if (method3268(arg0)) {
			byte[] var3 = arg0.method7692(arg1, arg2);
			return var3 == null ? null : new class111(var3);
		} else {
			arg0.method7694(arg1, arg2);
			return null;
		}
	}

	@ObfuscatedName("eo.ap([B)V")
	public void method3270(byte[] arg0) {
		class591 var2 = new class591(arg0);
		this.field1476 = var2.method10345();
		this.field1488 = var2.method10345();
		this.field1487 = var2.method10345();
		this.field1479 = var2.method10345();
		if (this.field1479 < 0) {
			this.field1479 = ~this.field1479;
			this.field1465 = true;
		}
		int var3 = var2.method10345();
		this.field1475 = new byte[var3][];
		for (int var4 = 0; var4 < var3; var4++) {
			int var5 = 0;
			int var6;
			do {
				var6 = var2.method10339();
				var5 += var6;
			} while (var6 >= 255);
			byte[] var7 = new byte[var5];
			var2.method10407(var7, 0, var5);
			this.field1475[var4] = var7;
		}
	}

	@ObfuscatedName("eo.aq(I)[F")
	public float[] method3275(int arg0) {
		class116 var2 = new class116();
		var2.method3327(this.field1475[arg0], 0);
		this.field1457 = new float[Statics.field1460];
		var2.method3330();
		int var3 = var2.method3332(class337.method9416(Statics.field1478.length - 1));
		boolean var4 = Statics.field1464[var3];
		int var5 = var4 ? Statics.field1460 : Statics.field1459;
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
			var9 = (var5 >> 2) - (Statics.field1459 >> 2);
			var10 = (Statics.field1459 >> 2) + (var5 >> 2);
			var11 = Statics.field1459 >> 1;
		} else {
			var9 = 0;
			var10 = var8;
			var11 = var5 >> 1;
		}
		int var12;
		int var13;
		int var14;
		if (var4 && !var7) {
			var12 = var5 - (var5 >> 2) - (Statics.field1459 >> 2);
			var13 = (Statics.field1459 >> 2) + (var5 - (var5 >> 2));
			var14 = Statics.field1459 >> 1;
		} else {
			var12 = var8;
			var13 = var5;
			var14 = var5 >> 1;
		}
		class106 var15 = Statics.field1463[Statics.field1478[var3]];
		int var16 = var15.field1416;
		int var17 = var15.field1417[var16];
		class115 var18 = Statics.field1461[var17].method2974(var2, Statics.field1458);
		boolean var19 = !var18.method3318();
		for (int var20 = 0; var20 < var15.field1418; var20++) {
			class102 var21 = Statics.field1480[var15.field1415[var20]];
			float[] var22 = this.field1457;
			var21.method3060(var22, var5 >> 1, var19, var2, Statics.field1458);
		}
		if (var18.method3318()) {
			int var23 = var15.field1416;
			int var10000 = var15.field1417[var23];
			var18.method3316(this.field1457, var5 >> 1);
		}
		if (var18.method3318()) {
			int var26 = var5 >> 1;
			int var27 = var5 >> 2;
			int var28 = var5 >> 3;
			float[] var29 = this.field1457;
			for (int var30 = 0; var30 < var26; var30++) {
				var29[var30] *= 0.5F;
			}
			for (int var31 = var26; var31 < var5; var31++) {
				var29[var31] = -var29[var5 - var31 - 1];
			}
			float[] var32 = var4 ? Statics.field1470 : Statics.field1467;
			float[] var33 = var4 ? Statics.field1471 : Statics.field1468;
			float[] var34 = var4 ? Statics.field1472 : Statics.field1469;
			int[] var35 = var4 ? Statics.field1474 : Statics.field1473;
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
				this.field1457[var87] *= (float) Math.sin((double) var88 * 1.5707963267948966D * (double) var88);
			}
			for (int var89 = var12; var89 < var13; var89++) {
				float var90 = (float) Math.sin(((double) (var89 - var12) + 0.5D) / (double) var14 * 0.5D * 3.141592653589793D + 1.5707963267948966D);
				this.field1457[var89] *= (float) Math.sin((double) var90 * 1.5707963267948966D * (double) var90);
			}
		} else {
			for (int var25 = var5 >> 1; var25 < var5; var25++) {
				this.field1457[var25] = 0.0F;
			}
		}
		float[] var91 = null;
		if (this.field1477 > 0) {
			int var92 = this.field1477 + var5 >> 2;
			var91 = new float[var92];
			if (!this.field1484) {
				for (int var93 = 0; var93 < this.field1483; var93++) {
					int var94 = (this.field1477 >> 1) + var93;
					var91[var93] += this.field1481[var94];
				}
			}
			if (var18.method3318()) {
				for (int var95 = var9; var95 < var5 >> 1; var95++) {
					int var96 = var91.length - (var5 >> 1) + var95;
					var91[var96] += this.field1457[var95];
				}
			}
		}
		float[] var97 = this.field1481;
		this.field1481 = this.field1457;
		this.field1457 = var97;
		this.field1477 = var5;
		this.field1483 = var13 - (var5 >> 1);
		this.field1484 = !var18.method3318();
		return var91;
	}

	@ObfuscatedName("eo.ao([I)Ldv;")
	public class96 method3272(int[] arg0) {
		if (arg0 != null && arg0[0] <= 0) {
			return null;
		}
		if (this.field1486 == null) {
			this.field1477 = 0;
			this.field1481 = new float[Statics.field1460];
			this.field1486 = new short[this.field1488];
			this.field1485 = 0;
			this.field1482 = 0;
		}
		while (this.field1482 < this.field1475.length) {
			if (arg0 != null && arg0[0] <= 0) {
				return null;
			}
			float[] var2 = this.method3275(this.field1482);
			if (var2 != null) {
				int var3 = this.field1485;
				int var4 = var2.length;
				if (var4 > this.field1488 - var3) {
					var4 = this.field1488 - var3;
				}
				for (int var5 = 0; var5 < var4; var5++) {
					this.field1486[var3++] = (short) class337.method9399(-32768, 32767, (int) (var2[var5] * 32768.0F));
				}
				if (arg0 != null) {
					arg0[0] -= var3 - this.field1485;
				}
				this.field1485 = var3;
			}
			this.field1482++;
		}
		this.field1481 = null;
		short[] var6 = this.field1486;
		this.field1486 = null;
		return new class96(this.field1476, var6, this.field1487, this.field1479, this.field1465, false);
	}
}
