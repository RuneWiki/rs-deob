package deob;

import java.util.Random;

@ObfuscatedName("ep")
public class class117 {

	@ObfuscatedName("ep.aw")
	public static int[] field1523;

	@ObfuscatedName("ep.at")
	public static int[] field1524 = new int[32768];

	@ObfuscatedName("ep.ac")
	public static int[] field1525;

	@ObfuscatedName("ep.ap")
	public static int[] field1526 = new int[5];

	@ObfuscatedName("ep.aq")
	public static int[] field1538 = new int[5];

	@ObfuscatedName("ep.ao")
	public static int[] field1528 = new int[5];

	@ObfuscatedName("ep.as")
	public static int[] field1529 = new int[5];

	@ObfuscatedName("ep.al")
	public static int[] field1530 = new int[5];

	@ObfuscatedName("ep.au")
	public int field1541 = 500;

	@ObfuscatedName("ep.ai")
	public int field1532 = 0;

	@ObfuscatedName("ep.aa")
	public class99 field1533;

	@ObfuscatedName("ep.am")
	public class99 field1534;

	@ObfuscatedName("ep.an")
	public class99 field1535;

	@ObfuscatedName("ep.ar")
	public class99 field1522;

	@ObfuscatedName("ep.ae")
	public class99 field1537;

	@ObfuscatedName("ep.ay")
	public class99 field1542;

	@ObfuscatedName("ep.ad")
	public class99 field1536;

	@ObfuscatedName("ep.ag")
	public class99 field1540;

	@ObfuscatedName("ep.av")
	public int[] field1544 = new int[] { 0, 0, 0, 0, 0 };

	@ObfuscatedName("ep.ah")
	public int[] field1531 = new int[] { 0, 0, 0, 0, 0 };

	@ObfuscatedName("ep.ab")
	public int[] field1543 = new int[] { 0, 0, 0, 0, 0 };

	@ObfuscatedName("ep.ax")
	public int field1545 = 0;

	@ObfuscatedName("ep.ak")
	public int field1539 = 100;

	@ObfuscatedName("ep.aj")
	public class114 field1527;

	@ObfuscatedName("ep.az")
	public class99 field1547;

	static {
		Random var0 = new Random(0L);
		for (int var1 = 0; var1 < 32768; var1++) {
			field1524[var1] = (var0.nextInt() & 0x2) - 1;
		}
		field1525 = new int[32768];
		for (int var2 = 0; var2 < 32768; var2++) {
			field1525[var2] = (int) (Math.sin((double) var2 / 5215.1903D) * 16384.0D);
		}
		field1523 = new int[220500];
	}

	@ObfuscatedName("ep.af(III)[I")
	public final int[] method3337(int arg0, int arg1, int arg2) {
		class481.method9003(field1523, 0, arg0);
		if (arg1 < 10) {
			return field1523;
		}
		double var4 = (double) arg0 / ((double) arg1 + 0.0D);
		this.field1533.method3017();
		this.field1534.method3017();
		int var6 = 0;
		int var7 = 0;
		int var8 = 0;
		if (this.field1535 != null) {
			this.field1535.method3017();
			this.field1522.method3017();
			var6 = (int) ((double) (this.field1535.field1366 - this.field1535.field1367) * 32.768D / var4);
			var7 = (int) ((double) this.field1535.field1367 * 32.768D / var4);
		}
		int var9 = 0;
		int var10 = 0;
		int var11 = 0;
		if (this.field1537 != null) {
			this.field1537.method3017();
			this.field1542.method3017();
			var9 = (int) ((double) (this.field1537.field1366 - this.field1537.field1367) * 32.768D / var4);
			var10 = (int) ((double) this.field1537.field1367 * 32.768D / var4);
		}
		for (int var12 = 0; var12 < 5; var12++) {
			if (this.field1544[var12] != 0) {
				field1526[var12] = 0;
				field1538[var12] = (int) ((double) this.field1543[var12] * var4);
				field1528[var12] = (this.field1544[var12] << 14) / 100;
				field1529[var12] = (int) ((double) (this.field1533.field1366 - this.field1533.field1367) * 32.768D * Math.pow(1.0057929410678534D, (double) this.field1531[var12]) / var4);
				field1530[var12] = (int) ((double) this.field1533.field1367 * 32.768D / var4);
			}
		}
		for (int var13 = 0; var13 < arg0; var13++) {
			int var14 = this.field1533.method3018(arg0);
			int var15 = this.field1534.method3018(arg0);
			if (this.field1535 != null) {
				int var16 = this.field1535.method3018(arg0);
				int var17 = this.field1522.method3018(arg0);
				var14 += this.method3336(var8, var17, this.field1535.field1361) >> 1;
				var8 += (var6 * var16 >> 16) + var7;
			}
			if (this.field1537 != null) {
				int var18 = this.field1537.method3018(arg0);
				int var19 = this.field1542.method3018(arg0);
				var15 = var15 * ((this.method3336(var11, var19, this.field1537.field1361) >> 1) + 32768) >> 15;
				var11 += (var9 * var18 >> 16) + var10;
			}
			for (int var20 = 0; var20 < 5; var20++) {
				if (this.field1544[var20] != 0) {
					int var21 = field1538[var20] + var13;
					if (var21 < arg0) {
						field1523[var21] += this.method3336(field1526[var20], field1528[var20] * var15 >> 15, this.field1533.field1361);
						field1526[var20] += (field1529[var20] * var14 >> 16) + field1530[var20];
					}
				}
			}
		}
		if (this.field1536 != null) {
			this.field1536.method3017();
			this.field1540.method3017();
			int var22 = 0;
			boolean var23 = false;
			boolean var24 = true;
			for (int var25 = 0; var25 < arg0; var25++) {
				int var26 = this.field1536.method3018(arg0);
				int var27 = this.field1540.method3018(arg0);
				int var28;
				if (var24) {
					var28 = ((this.field1536.field1366 - this.field1536.field1367) * var26 >> 8) + this.field1536.field1367;
				} else {
					var28 = ((this.field1536.field1366 - this.field1536.field1367) * var27 >> 8) + this.field1536.field1367;
				}
				var22 += 256;
				if (var22 >= var28) {
					var22 = 0;
					var24 = !var24;
				}
				if (var24) {
					field1523[var25] = 0;
				}
			}
		}
		if (this.field1545 > 0 && this.field1539 > 0) {
			int var29 = (int) ((double) this.field1545 * var4);
			for (int var30 = var29; var30 < arg0; var30++) {
				field1523[var30] += field1523[var30 - var29] * this.field1539 / 100;
			}
		}
		if (this.field1527.field1499[0] > 0 || this.field1527.field1499[1] > 0) {
			this.field1547.method3017();
			int var31 = this.field1547.method3018(arg0 + 1);
			int var32 = this.field1527.method3296(0, (float) var31 / 65536.0F, arg2);
			int var33 = this.field1527.method3296(1, (float) var31 / 65536.0F, arg2);
			if (arg0 >= var32 + var33) {
				int var34 = 0;
				int var35 = var33;
				if (var33 > arg0 - var32) {
					var35 = arg0 - var32;
				}
				while (var34 < var35) {
					int var36 = (int) ((long) field1523[var32 + var34] * (long) Statics.field1495 >> 16);
					for (int var37 = 0; var37 < var32; var37++) {
						var36 += (int) ((long) field1523[var32 + var34 - 1 - var37] * (long) class114.field1496[0][var37] >> 16);
					}
					for (int var38 = 0; var38 < var34; var38++) {
						var36 -= (int) ((long) field1523[var34 - 1 - var38] * (long) class114.field1496[1][var38] >> 16);
					}
					field1523[var34] = var36;
					var31 = this.field1547.method3018(arg0 + 1);
					var34++;
				}
				boolean var39 = true;
				int var40 = 128;
				while (true) {
					if (var40 > arg0 - var32) {
						var40 = arg0 - var32;
					}
					while (var34 < var40) {
						int var41 = (int) ((long) field1523[var32 + var34] * (long) Statics.field1495 >> 16);
						for (int var42 = 0; var42 < var32; var42++) {
							var41 += (int) ((long) field1523[var32 + var34 - 1 - var42] * (long) class114.field1496[0][var42] >> 16);
						}
						for (int var43 = 0; var43 < var33; var43++) {
							var41 -= (int) ((long) field1523[var34 - 1 - var43] * (long) class114.field1496[1][var43] >> 16);
						}
						field1523[var34] = var41;
						var31 = this.field1547.method3018(arg0 + 1);
						var34++;
					}
					if (var34 >= arg0 - var32) {
						while (var34 < arg0) {
							int var44 = 0;
							for (int var45 = var32 + var34 - arg0; var45 < var32; var45++) {
								var44 += (int) ((long) field1523[var32 + var34 - 1 - var45] * (long) class114.field1496[0][var45] >> 16);
							}
							for (int var46 = 0; var46 < var33; var46++) {
								var44 -= (int) ((long) field1523[var34 - 1 - var46] * (long) class114.field1496[1][var46] >> 16);
							}
							field1523[var34] = var44;
							this.field1547.method3018(arg0 + 1);
							var34++;
						}
						break;
					}
					var32 = this.field1527.method3296(0, (float) var31 / 65536.0F, arg2);
					var33 = this.field1527.method3296(1, (float) var31 / 65536.0F, arg2);
					var40 += 128;
				}
			}
		}
		for (int var48 = 0; var48 < arg0; var48++) {
			if (field1523[var48] < -32768) {
				field1523[var48] = -32768;
			}
			if (field1523[var48] > 32767) {
				field1523[var48] = 32767;
			}
		}
		return field1523;
	}

	@ObfuscatedName("ep.aw(III)I")
	public final int method3336(int arg0, int arg1, int arg2) {
		if (arg2 == 1) {
			return (arg0 & 0x7FFF) < 16384 ? arg1 : -arg1;
		} else if (arg2 == 2) {
			return field1525[arg0 & 0x7FFF] * arg1 >> 14;
		} else if (arg2 == 3) {
			return ((arg0 & 0x7FFF) * arg1 >> 14) - arg1;
		} else if (arg2 == 4) {
			return field1524[arg0 / 2607 & 0x7FFF] * arg1;
		} else {
			return 0;
		}
	}

	@ObfuscatedName("ep.at(Lwb;)V")
	public final void method3339(class591 arg0) {
		this.field1533 = new class99();
		this.field1533.method3015(arg0);
		this.field1534 = new class99();
		this.field1534.method3015(arg0);
		int var2 = arg0.method10339();
		if (var2 != 0) {
			arg0.field5920--;
			this.field1535 = new class99();
			this.field1535.method3015(arg0);
			this.field1522 = new class99();
			this.field1522.method3015(arg0);
		}
		int var3 = arg0.method10339();
		if (var3 != 0) {
			arg0.field5920--;
			this.field1537 = new class99();
			this.field1537.method3015(arg0);
			this.field1542 = new class99();
			this.field1542.method3015(arg0);
		}
		int var4 = arg0.method10339();
		if (var4 != 0) {
			arg0.field5920--;
			this.field1536 = new class99();
			this.field1536.method3015(arg0);
			this.field1540 = new class99();
			this.field1540.method3015(arg0);
		}
		for (int var5 = 0; var5 < 10; var5++) {
			int var6 = arg0.method10355();
			if (var6 == 0) {
				break;
			}
			this.field1544[var5] = var6;
			this.field1531[var5] = arg0.method10354();
			this.field1543[var5] = arg0.method10355();
		}
		this.field1545 = arg0.method10355();
		this.field1539 = arg0.method10355();
		this.field1541 = arg0.method10341();
		this.field1532 = arg0.method10341();
		this.field1527 = new class114();
		this.field1547 = new class99();
		this.field1527.method3301(arg0, this.field1547);
	}
}
