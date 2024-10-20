package deob;

@ObfuscatedName("dx")
public class class122 extends class130 {

    @ObfuscatedName("dx.c")
    public static class122 field1658 = new class122();

    @ObfuscatedName("dx.q")
    public static byte[] field1710 = new byte[1];

    @ObfuscatedName("dx.m")
    public static class122 field1649 = new class122();

    @ObfuscatedName("dx.j")
    public static byte[] field1714 = new byte[1];

    @ObfuscatedName("dx.g")
    public int field1698 = 0;

    @ObfuscatedName("dx.i")
    public int[] field1652;

    @ObfuscatedName("dx.h")
    public int[] field1653;

    @ObfuscatedName("dx.l")
    public int[] field1654;

    @ObfuscatedName("dx.d")
    public int field1655 = 0;

    @ObfuscatedName("dx.o")
    public int[] field1656;

    @ObfuscatedName("dx.s")
    public int[] field1657;

    @ObfuscatedName("dx.k")
    public int[] field1650;

    @ObfuscatedName("dx.v")
    public int[] field1696;

    @ObfuscatedName("dx.p")
    public int[] field1660;

    @ObfuscatedName("dx.n")
    public int[] field1661;

    @ObfuscatedName("dx.t")
    public byte[] field1662;

    @ObfuscatedName("dx.r")
    public byte[] field1663;

    @ObfuscatedName("dx.x")
    public byte[] field1664;

    @ObfuscatedName("dx.b")
    public short[] field1677;

    @ObfuscatedName("dx.w")
    public byte field1700 = 0;

    @ObfuscatedName("dx.e")
    public int field1667 = 0;

    @ObfuscatedName("dx.a")
    public int[] field1668;

    @ObfuscatedName("dx.z")
    public int[] field1669;

    @ObfuscatedName("dx.y")
    public int[] field1670;

    @ObfuscatedName("dx.u")
    public int[][] field1671;

    @ObfuscatedName("dx.f")
    public int[][] field1672;

    @ObfuscatedName("dx.at")
    public boolean field1673 = false;

    @ObfuscatedName("dx.ay")
    public int field1675;

    @ObfuscatedName("dx.ak")
    public int field1709;

    @ObfuscatedName("dx.az")
    public int field1648;

    @ObfuscatedName("dx.aj")
    public int field1666;

    @ObfuscatedName("dx.af")
    public int field1659;

    @ObfuscatedName("dx.ah")
    public int field1676;

    @ObfuscatedName("dx.ab")
    public int field1680;

    @ObfuscatedName("dx.aa")
    public int field1678;

    @ObfuscatedName("dx.ac")
    public int field1716 = -1;

    @ObfuscatedName("dx.ad")
    public int field1679 = -1;

    @ObfuscatedName("dx.aq")
    public int field1684 = -1;

    @ObfuscatedName("dx.an")
    public static boolean[] field1686 = new boolean[4700];

    @ObfuscatedName("dx.ag")
    public static boolean[] field1687 = new boolean[4700];

    @ObfuscatedName("dx.ap")
    public static int[] field1688 = new int[4700];

    @ObfuscatedName("dx.aw")
    public static int[] field1689 = new int[4700];

    @ObfuscatedName("dx.al")
    public static int[] field1690 = new int[4700];

    @ObfuscatedName("dx.ar")
    public static int[] field1691 = new int[4700];

    @ObfuscatedName("dx.au")
    public static int[] field1692 = new int[4700];

    @ObfuscatedName("dx.av")
    public static int[] field1693 = new int[4700];

    @ObfuscatedName("dx.ao")
    public static int[] field1695 = new int[1600];

    @ObfuscatedName("dx.ai")
    public static int[][] field1681 = new int[1600][512];

    @ObfuscatedName("dx.ae")
    public static int[] field1697 = new int[12];

    @ObfuscatedName("dx.as")
    public static int[][] field1682 = new int[12][2000];

    @ObfuscatedName("dx.bw")
    public static int[] field1665 = new int[2000];

    @ObfuscatedName("dx.bg")
    public static int[] field1683 = new int[2000];

    @ObfuscatedName("dx.bu")
    public static int[] field1701 = new int[12];

    @ObfuscatedName("dx.bs")
    public static int[] field1702 = new int[10];

    @ObfuscatedName("dx.ba")
    public static int[] field1713 = new int[10];

    @ObfuscatedName("dx.bt")
    public static int[] field1704 = new int[10];

    @ObfuscatedName("dx.bb")
    public static boolean field1708 = true;

    @ObfuscatedName("dx.bj")
    public static int[] field1711 = class125.field1766;

    @ObfuscatedName("dx.bn")
    public static int[] field1712 = class125.field1741;

    @ObfuscatedName("dx.bl")
    public static int[] field1703 = class125.field1762;

    @ObfuscatedName("dx.bi")
    public static int[] field1674 = class125.field1754;

    public class122() {
    }

    public class122(class122[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1698 = 0;
        this.field1655 = 0;
        this.field1667 = 0;
        this.field1700 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class122 var8 = arg0[var7];
            if (var8 != null) {
                this.field1698 += var8.field1698;
                this.field1655 += var8.field1655;
                this.field1667 += var8.field1667;
                if (var8.field1662 == null) {
                    if (this.field1700 == -1) {
                        this.field1700 = var8.field1700;
                    }
                    if (this.field1700 != var8.field1700) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1663 != null;
                var5 |= var8.field1677 != null;
                var6 |= var8.field1664 != null;
            }
        }
        this.field1652 = new int[this.field1698];
        this.field1653 = new int[this.field1698];
        this.field1654 = new int[this.field1698];
        this.field1656 = new int[this.field1655];
        this.field1657 = new int[this.field1655];
        this.field1650 = new int[this.field1655];
        this.field1696 = new int[this.field1655];
        this.field1660 = new int[this.field1655];
        this.field1661 = new int[this.field1655];
        if (var3) {
            this.field1662 = new byte[this.field1655];
        }
        if (var4) {
            this.field1663 = new byte[this.field1655];
        }
        if (var5) {
            this.field1677 = new short[this.field1655];
        }
        if (var6) {
            this.field1664 = new byte[this.field1655];
        }
        if (this.field1667 > 0) {
            this.field1668 = new int[this.field1667];
            this.field1669 = new int[this.field1667];
            this.field1670 = new int[this.field1667];
        }
        this.field1698 = 0;
        this.field1655 = 0;
        this.field1667 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class122 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1655; var11++) {
                    this.field1656[this.field1655] = var10.field1656[var11] + this.field1698;
                    this.field1657[this.field1655] = var10.field1657[var11] + this.field1698;
                    this.field1650[this.field1655] = var10.field1650[var11] + this.field1698;
                    this.field1696[this.field1655] = var10.field1696[var11];
                    this.field1660[this.field1655] = var10.field1660[var11];
                    this.field1661[this.field1655] = var10.field1661[var11];
                    if (var3) {
                        if (var10.field1662 == null) {
                            this.field1662[this.field1655] = var10.field1700;
                        } else {
                            this.field1662[this.field1655] = var10.field1662[var11];
                        }
                    }
                    if (var4 && var10.field1663 != null) {
                        this.field1663[this.field1655] = var10.field1663[var11];
                    }
                    if (var5) {
                        if (var10.field1677 == null) {
                            this.field1677[this.field1655] = -1;
                        } else {
                            this.field1677[this.field1655] = var10.field1677[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1664 == null || var10.field1664[var11] == -1) {
                            this.field1664[this.field1655] = -1;
                        } else {
                            this.field1664[this.field1655] = (byte) (var10.field1664[var11] + this.field1667);
                        }
                    }
                    this.field1655++;
                }
                for (int var12 = 0; var12 < var10.field1667; var12++) {
                    this.field1668[this.field1667] = var10.field1668[var12] + this.field1698;
                    this.field1669[this.field1667] = var10.field1669[var12] + this.field1698;
                    this.field1670[this.field1667] = var10.field1670[var12] + this.field1698;
                    this.field1667++;
                }
                for (int var13 = 0; var13 < var10.field1698; var13++) {
                    this.field1652[this.field1698] = var10.field1652[var13];
                    this.field1653[this.field1698] = var10.field1653[var13];
                    this.field1654[this.field1698] = var10.field1654[var13];
                    this.field1698++;
                }
            }
        }
    }

    @ObfuscatedName("dx.c([[IIIIZI)Ldx;")
    public class122 method2486(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2496();
        int var7 = arg1 - this.field1648;
        int var8 = this.field1648 + arg1;
        int var9 = arg3 - this.field1648;
        int var10 = this.field1648 + arg3;
        if (var7 < 0 || var8 + 128 >> 7 >= arg0.length || var9 < 0 || var10 + 128 >> 7 >= arg0[0].length) {
            return this;
        }
        int var11 = var7 >> 7;
        int var12 = var8 + 127 >> 7;
        int var13 = var9 >> 7;
        int var14 = var10 + 127 >> 7;
        if (arg0[var11][var13] == arg2 && arg0[var12][var13] == arg2 && arg0[var11][var14] == arg2 && arg0[var12][var14] == arg2) {
            return this;
        }
        class122 var15;
        if (arg4) {
            var15 = new class122();
            var15.field1698 = this.field1698;
            var15.field1655 = this.field1655;
            var15.field1667 = this.field1667;
            var15.field1652 = this.field1652;
            var15.field1654 = this.field1654;
            var15.field1656 = this.field1656;
            var15.field1657 = this.field1657;
            var15.field1650 = this.field1650;
            var15.field1696 = this.field1696;
            var15.field1660 = this.field1660;
            var15.field1661 = this.field1661;
            var15.field1662 = this.field1662;
            var15.field1663 = this.field1663;
            var15.field1664 = this.field1664;
            var15.field1677 = this.field1677;
            var15.field1700 = this.field1700;
            var15.field1668 = this.field1668;
            var15.field1669 = this.field1669;
            var15.field1670 = this.field1670;
            var15.field1671 = this.field1671;
            var15.field1672 = this.field1672;
            var15.field1673 = this.field1673;
            var15.field1653 = new int[var15.field1698];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1698; var16++) {
                int var17 = this.field1652[var16] + arg1;
                int var18 = this.field1654[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1653[var16] = this.field1653[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1698; var26++) {
                int var27 = (-this.field1653[var26] << 16) / this.field1849;
                if (var27 < arg5) {
                    int var28 = this.field1652[var26] + arg1;
                    int var29 = this.field1654[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1653[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1653[var26];
                }
            }
        }
        var15.method2418();
        return var15;
    }

    @ObfuscatedName("dx.q(Z)Ldx;")
    public class122 method2416(boolean arg0) {
        if (!arg0 && field1710.length < this.field1655) {
            field1710 = new byte[this.field1655 + 100];
        }
        return this.method2432(arg0, field1658, field1710);
    }

    @ObfuscatedName("dx.m(Z)Ldx;")
    public class122 method2417(boolean arg0) {
        if (!arg0 && field1714.length < this.field1655) {
            field1714 = new byte[this.field1655 + 100];
        }
        return this.method2432(arg0, field1649, field1714);
    }

    @ObfuscatedName("dx.j(ZLdx;[B)Ldx;")
    public class122 method2432(boolean arg0, class122 arg1, byte[] arg2) {
        arg1.field1698 = this.field1698;
        arg1.field1655 = this.field1655;
        arg1.field1667 = this.field1667;
        if (arg1.field1652 == null || arg1.field1652.length < this.field1698) {
            arg1.field1652 = new int[this.field1698 + 100];
            arg1.field1653 = new int[this.field1698 + 100];
            arg1.field1654 = new int[this.field1698 + 100];
        }
        for (int var4 = 0; var4 < this.field1698; var4++) {
            arg1.field1652[var4] = this.field1652[var4];
            arg1.field1653[var4] = this.field1653[var4];
            arg1.field1654[var4] = this.field1654[var4];
        }
        if (arg0) {
            arg1.field1663 = this.field1663;
        } else {
            arg1.field1663 = arg2;
            if (this.field1663 == null) {
                for (int var5 = 0; var5 < this.field1655; var5++) {
                    arg1.field1663[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1655; var6++) {
                    arg1.field1663[var6] = this.field1663[var6];
                }
            }
        }
        arg1.field1656 = this.field1656;
        arg1.field1657 = this.field1657;
        arg1.field1650 = this.field1650;
        arg1.field1696 = this.field1696;
        arg1.field1660 = this.field1660;
        arg1.field1661 = this.field1661;
        arg1.field1662 = this.field1662;
        arg1.field1664 = this.field1664;
        arg1.field1677 = this.field1677;
        arg1.field1700 = this.field1700;
        arg1.field1668 = this.field1668;
        arg1.field1669 = this.field1669;
        arg1.field1670 = this.field1670;
        arg1.field1671 = this.field1671;
        arg1.field1672 = this.field1672;
        arg1.field1673 = this.field1673;
        arg1.method2418();
        return arg1;
    }

    @ObfuscatedName("dx.g(I)V")
    public void method2444(int arg0) {
        if (this.field1716 != -1) {
            return;
        }
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = field1712[arg0];
        int var9 = field1711[arg0];
        for (int var10 = 0; var10 < this.field1698; var10++) {
            int var11 = class125.method2571(this.field1652[var10], this.field1654[var10], var8, var9);
            int var12 = this.field1653[var10];
            int var13 = class125.method2619(this.field1652[var10], this.field1654[var10], var8, var9);
            if (var11 < var2) {
                var2 = var11;
            }
            if (var11 > var5) {
                var5 = var11;
            }
            if (var12 < var3) {
                var3 = var12;
            }
            if (var12 > var6) {
                var6 = var12;
            }
            if (var13 < var4) {
                var4 = var13;
            }
            if (var13 > var7) {
                var7 = var13;
            }
        }
        this.field1676 = (var2 + var5) / 2;
        this.field1680 = (var3 + var6) / 2;
        this.field1678 = (var4 + var7) / 2;
        this.field1716 = (var5 - var2 + 1) / 2;
        this.field1679 = (var6 - var3 + 1) / 2;
        this.field1684 = (var7 - var4 + 1) / 2;
        if (this.field1716 < 32) {
            this.field1716 = 32;
        }
        if (this.field1684 < 32) {
            this.field1684 = 32;
        }
        if (this.field1673) {
            this.field1716 += 8;
            this.field1684 += 8;
        }
    }

    @ObfuscatedName("dx.i()V")
    public void method2496() {
        if (this.field1675 == 1) {
            return;
        }
        this.field1675 = 1;
        this.field1849 = 0;
        this.field1709 = 0;
        this.field1648 = 0;
        for (int var1 = 0; var1 < this.field1698; var1++) {
            int var2 = this.field1652[var1];
            int var3 = this.field1653[var1];
            int var4 = this.field1654[var1];
            if (-var3 > this.field1849) {
                this.field1849 = -var3;
            }
            if (var3 > this.field1709) {
                this.field1709 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1648) {
                this.field1648 = var5;
            }
        }
        this.field1648 = (int) (Math.sqrt((double) this.field1648) + 0.99D);
        this.field1659 = (int) (Math.sqrt((double) (this.field1849 * this.field1849 + this.field1648 * this.field1648)) + 0.99D);
        this.field1666 = this.field1659 + (int) (Math.sqrt((double) (this.field1709 * this.field1709 + this.field1648 * this.field1648)) + 0.99D);
    }

    @ObfuscatedName("dx.h()V")
    public void method2497() {
        if (this.field1675 == 2) {
            return;
        }
        this.field1675 = 2;
        this.field1648 = 0;
        for (int var1 = 0; var1 < this.field1698; var1++) {
            int var2 = this.field1652[var1];
            int var3 = this.field1653[var1];
            int var4 = this.field1654[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1648) {
                this.field1648 = var5;
            }
        }
        this.field1648 = (int) (Math.sqrt((double) this.field1648) + 0.99D);
        this.field1659 = this.field1648;
        this.field1666 = this.field1648 + this.field1648;
    }

    @ObfuscatedName("dx.l()I")
    public int method2422() {
        this.method2496();
        return this.field1648;
    }

    @ObfuscatedName("dx.k()V")
    public void method2418() {
        this.field1675 = 0;
        this.field1716 = -1;
    }

    @ObfuscatedName("dx.v(Lep;I)V")
    public void method2424(class133 arg0, int arg1) {
        if (this.field1671 == null || arg1 == -1) {
            return;
        }
        class120 var3 = arg0.field1866[arg1];
        class127 var4 = var3.field1611;
        Statics.field1705 = 0;
        Statics.field1706 = 0;
        Statics.field1707 = 0;
        for (int var5 = 0; var5 < var3.field1616; var5++) {
            int var6 = var3.field1613[var5];
            this.method2426(var4.field1781[var6], var4.field1778[var6], var3.field1618[var5], var3.field1619[var5], var3.field1615[var5]);
        }
        this.method2418();
    }

    @ObfuscatedName("dx.p(Lep;ILep;I[I)V")
    public void method2453(class133 arg0, int arg1, class133 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2424(arg0, arg1);
            return;
        }
        class120 var6 = arg0.field1866[arg1];
        class120 var7 = arg2.field1866[arg3];
        class127 var8 = var6.field1611;
        Statics.field1705 = 0;
        Statics.field1706 = 0;
        Statics.field1707 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1616; var11++) {
            int var12 = var6.field1613[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1781[var12] == 0) {
                this.method2426(var8.field1781[var12], var8.field1778[var12], var6.field1618[var11], var6.field1619[var11], var6.field1615[var11]);
            }
        }
        Statics.field1705 = 0;
        Statics.field1706 = 0;
        Statics.field1707 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1616; var15++) {
            int var16 = var7.field1613[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1781[var16] == 0) {
                this.method2426(var8.field1781[var16], var8.field1778[var16], var7.field1618[var15], var7.field1619[var15], var7.field1615[var15]);
            }
        }
        this.method2418();
    }

    @ObfuscatedName("dx.n(I[IIII)V")
    public void method2426(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1705 = 0;
            Statics.field1706 = 0;
            Statics.field1707 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1671.length) {
                    int[] var10 = this.field1671[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1705 += this.field1652[var12];
                        Statics.field1706 += this.field1653[var12];
                        Statics.field1707 += this.field1654[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1705 = Statics.field1705 / var7 + arg2;
                Statics.field1706 = Statics.field1706 / var7 + arg3;
                Statics.field1707 = Statics.field1707 / var7 + arg4;
            } else {
                Statics.field1705 = arg2;
                Statics.field1706 = arg3;
                Statics.field1707 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1671.length) {
                    int[] var15 = this.field1671[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1652[var17] += arg2;
                        this.field1653[var17] += arg3;
                        this.field1654[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1671.length) {
                    int[] var20 = this.field1671[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1652[var22] -= Statics.field1705;
                        this.field1653[var22] -= Statics.field1706;
                        this.field1654[var22] -= Statics.field1707;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1711[var25];
                            int var27 = field1712[var25];
                            int var28 = this.field1653[var22] * var26 + this.field1652[var22] * var27 >> 16;
                            this.field1653[var22] = this.field1653[var22] * var27 - this.field1652[var22] * var26 >> 16;
                            this.field1652[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1711[var23];
                            int var30 = field1712[var23];
                            int var31 = this.field1653[var22] * var30 - this.field1654[var22] * var29 >> 16;
                            this.field1654[var22] = this.field1654[var22] * var30 + this.field1653[var22] * var29 >> 16;
                            this.field1653[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1711[var24];
                            int var33 = field1712[var24];
                            int var34 = this.field1654[var22] * var32 + this.field1652[var22] * var33 >> 16;
                            this.field1654[var22] = this.field1654[var22] * var33 - this.field1652[var22] * var32 >> 16;
                            this.field1652[var22] = var34;
                        }
                        this.field1652[var22] += Statics.field1705;
                        this.field1653[var22] += Statics.field1706;
                        this.field1654[var22] += Statics.field1707;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1671.length) {
                    int[] var37 = this.field1671[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1652[var39] -= Statics.field1705;
                        this.field1653[var39] -= Statics.field1706;
                        this.field1654[var39] -= Statics.field1707;
                        this.field1652[var39] = this.field1652[var39] * arg2 / 128;
                        this.field1653[var39] = this.field1653[var39] * arg3 / 128;
                        this.field1654[var39] = this.field1654[var39] * arg4 / 128;
                        this.field1652[var39] += Statics.field1705;
                        this.field1653[var39] += Statics.field1706;
                        this.field1654[var39] += Statics.field1707;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1672 != null && this.field1663 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1672.length) {
                    int[] var42 = this.field1672[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1663[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1663[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("dx.t()V")
    public void method2427() {
        for (int var1 = 0; var1 < this.field1698; var1++) {
            int var2 = this.field1652[var1];
            this.field1652[var1] = this.field1654[var1];
            this.field1654[var1] = -var2;
        }
        this.method2418();
    }

    @ObfuscatedName("dx.r()V")
    public void method2428() {
        for (int var1 = 0; var1 < this.field1698; var1++) {
            this.field1652[var1] = -this.field1652[var1];
            this.field1654[var1] = -this.field1654[var1];
        }
        this.method2418();
    }

    @ObfuscatedName("dx.x()V")
    public void method2473() {
        for (int var1 = 0; var1 < this.field1698; var1++) {
            int var2 = this.field1654[var1];
            this.field1654[var1] = this.field1652[var1];
            this.field1652[var1] = -var2;
        }
        this.method2418();
    }

    @ObfuscatedName("dx.b(I)V")
    public void method2430(int arg0) {
        int var2 = field1711[arg0];
        int var3 = field1712[arg0];
        for (int var4 = 0; var4 < this.field1698; var4++) {
            int var5 = this.field1653[var4] * var3 - this.field1654[var4] * var2 >> 16;
            this.field1654[var4] = this.field1654[var4] * var3 + this.field1653[var4] * var2 >> 16;
            this.field1653[var4] = var5;
        }
        this.method2418();
    }

    @ObfuscatedName("dx.w(III)V")
    public void method2431(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1698; var4++) {
            this.field1652[var4] += arg0;
            this.field1653[var4] += arg1;
            this.field1654[var4] += arg2;
        }
        this.method2418();
    }

    @ObfuscatedName("dx.a(III)V")
    public void method2483(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1698; var4++) {
            this.field1652[var4] = this.field1652[var4] * arg0 / 128;
            this.field1653[var4] = this.field1653[var4] * arg1 / 128;
            this.field1654[var4] = this.field1654[var4] * arg2 / 128;
        }
        this.method2418();
    }

    @ObfuscatedName("dx.z(IIIIIII)V")
    public final void method2484(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1695[0] = -1;
        if (this.field1675 != 2 && this.field1675 != 1) {
            this.method2497();
        }
        int var8 = Statics.field1753;
        int var9 = Statics.field1760;
        int var10 = field1711[arg0];
        int var11 = field1712[arg0];
        int var12 = field1711[arg1];
        int var13 = field1712[arg1];
        int var14 = field1711[arg2];
        int var15 = field1712[arg2];
        int var16 = field1711[arg3];
        int var17 = field1712[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1698; var19++) {
            int var20 = this.field1652[var19];
            int var21 = this.field1653[var19];
            int var22 = this.field1654[var19];
            if (arg2 != 0) {
                int var23 = var14 * var21 + var15 * var20 >> 16;
                var21 = var15 * var21 - var14 * var20 >> 16;
                var20 = var23;
            }
            if (arg0 != 0) {
                int var24 = var11 * var21 - var10 * var22 >> 16;
                var22 = var10 * var21 + var11 * var22 >> 16;
                var21 = var24;
            }
            if (arg1 != 0) {
                int var25 = var12 * var22 + var13 * var20 >> 16;
                var22 = var13 * var22 - var12 * var20 >> 16;
                var20 = var25;
            }
            int var26 = arg4 + var20;
            int var27 = arg5 + var21;
            int var28 = arg6 + var22;
            int var29 = var17 * var27 - var16 * var28 >> 16;
            int var30 = var16 * var27 + var17 * var28 >> 16;
            field1690[var19] = var30 - var18;
            field1688[var19] = class125.field1756 * var26 / var30 + var8;
            field1689[var19] = class125.field1756 * var29 / var30 + var9;
            if (this.field1667 > 0) {
                field1691[var19] = var26;
                field1692[var19] = var29;
                field1693[var19] = var30;
            }
        }
        try {
            this.method2435(false, false, false, 0L);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("dx.y(IIIIIIII)V")
    public final void method2503(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1695[0] = -1;
        if (this.field1675 != 2 && this.field1675 != 1) {
            this.method2497();
        }
        int var9 = Statics.field1753;
        int var10 = Statics.field1760;
        int var11 = field1711[arg0];
        int var12 = field1712[arg0];
        int var13 = field1711[arg1];
        int var14 = field1712[arg1];
        int var15 = field1711[arg2];
        int var16 = field1712[arg2];
        int var17 = field1711[arg3];
        int var18 = field1712[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1698; var20++) {
            int var21 = this.field1652[var20];
            int var22 = this.field1653[var20];
            int var23 = this.field1654[var20];
            if (arg2 != 0) {
                int var24 = var15 * var22 + var16 * var21 >> 16;
                var22 = var16 * var22 - var15 * var21 >> 16;
                var21 = var24;
            }
            if (arg0 != 0) {
                int var25 = var12 * var22 - var11 * var23 >> 16;
                var23 = var11 * var22 + var12 * var23 >> 16;
                var22 = var25;
            }
            if (arg1 != 0) {
                int var26 = var13 * var23 + var14 * var21 >> 16;
                var23 = var14 * var23 - var13 * var21 >> 16;
                var21 = var26;
            }
            int var27 = arg4 + var21;
            int var28 = arg5 + var22;
            int var29 = arg6 + var23;
            int var30 = var18 * var28 - var17 * var29 >> 16;
            int var31 = var17 * var28 + var18 * var29 >> 16;
            field1690[var20] = var31 - var19;
            field1688[var20] = class125.field1756 * var27 / arg7 + var9;
            field1689[var20] = class125.field1756 * var30 / arg7 + var10;
            if (this.field1667 > 0) {
                field1691[var20] = var27;
                field1692[var20] = var30;
                field1693[var20] = var31;
            }
        }
        try {
            this.method2435(false, false, false, 0L);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("dx.cd(IIIIIIIIJ)V")
    public void method2478(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field1695[0] = -1;
        if (this.field1675 != 1) {
            this.method2496();
        }
        this.method2444(arg0);
        int var11 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var12 = arg1 * arg6 + arg2 * var11 >> 16;
        int var13 = this.field1648 * arg2 >> 16;
        int var14 = var12 + var13;
        if (var14 <= 50 || var12 >= 3500) {
            return;
        }
        int var15 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var16 = (var15 - this.field1648) * class125.field1756;
        if (var16 / var14 >= Statics.field1758) {
            return;
        }
        int var17 = (this.field1648 + var15) * class125.field1756;
        if (var17 / var14 <= Statics.field1757) {
            return;
        }
        int var18 = arg2 * arg6 - arg1 * var11 >> 16;
        int var19 = this.field1648 * arg1 >> 16;
        int var20 = (var18 + var19) * class125.field1756;
        if (var20 / var14 <= Statics.field1759) {
            return;
        }
        int var21 = (this.field1849 * arg2 >> 16) + var19;
        int var22 = (var18 - var21) * class125.field1756;
        if (var22 / var14 >= Statics.field1752) {
            return;
        }
        int var23 = (this.field1849 * arg1 >> 16) + var13;
        boolean var24 = false;
        boolean var25 = false;
        if (var12 - var23 <= 50) {
            var25 = true;
        }
        boolean var26 = var25 || this.field1667 > 0;
        int var27 = class123.method1747();
        int var28 = class123.field1725;
        boolean var30 = class123.field1724;
        boolean var32 = class123.method1666(arg8);
        boolean var33 = false;
        if (var32 && var30) {
            boolean var34 = false;
            if (field1708) {
                boolean var36 = class123.field1724;
                boolean var37;
                if (var36) {
                    class123.method919();
                    int var38 = this.field1676 + arg5;
                    int var39 = this.field1680 + arg6;
                    int var40 = this.field1678 + arg7;
                    int var41 = this.field1716;
                    int var42 = this.field1679;
                    int var43 = this.field1684;
                    int var44 = Statics.field1862 - var38;
                    int var45 = Statics.field2318 - var39;
                    int var46 = Statics.field529 - var40;
                    if (Math.abs(var44) > Statics.field1723 + var41) {
                        var37 = false;
                    } else if (Math.abs(var45) > Statics.field602 + var42) {
                        var37 = false;
                    } else if (Math.abs(var46) > Statics.field39 + var43) {
                        var37 = false;
                    } else if (Math.abs(Statics.field639 * var46 - Statics.field1847 * var45) > Statics.field602 * var43 + Statics.field39 * var42) {
                        var37 = false;
                    } else if (Math.abs(Statics.field1847 * var44 - Statics.field1721 * var46) > Statics.field39 * var41 + Statics.field1723 * var43) {
                        var37 = false;
                    } else if (Math.abs(Statics.field1721 * var45 - Statics.field639 * var44) > Statics.field602 * var41 + Statics.field1723 * var42) {
                        var37 = false;
                    } else {
                        var37 = true;
                    }
                } else {
                    var37 = false;
                }
                var34 = var37;
            } else {
                int var47 = var12 - var13;
                if (var47 <= 50) {
                    var47 = 50;
                }
                int var48;
                int var49;
                if (var15 > 0) {
                    var48 = var16 / var14;
                    var49 = var17 / var47;
                } else {
                    var49 = var17 / var14;
                    var48 = var16 / var47;
                }
                int var50;
                int var51;
                if (var18 > 0) {
                    var50 = var22 / var14;
                    var51 = var20 / var47;
                } else {
                    var51 = var20 / var14;
                    var50 = var22 / var47;
                }
                int var52 = var27 - Statics.field1753;
                int var53 = var28 - Statics.field1760;
                if (var52 > var48 && var52 < var49 && var53 > var50 && var53 < var51) {
                    var34 = true;
                }
            }
            if (var34) {
                if (this.field1673) {
                    class123.method3171(arg8);
                } else {
                    var33 = true;
                }
            }
        }
        int var54 = Statics.field1753;
        int var55 = Statics.field1760;
        int var56 = 0;
        int var57 = 0;
        if (arg0 != 0) {
            var56 = field1711[arg0];
            var57 = field1712[arg0];
        }
        for (int var58 = 0; var58 < this.field1698; var58++) {
            int var59 = this.field1652[var58];
            int var60 = this.field1653[var58];
            int var61 = this.field1654[var58];
            if (arg0 != 0) {
                int var62 = var56 * var61 + var57 * var59 >> 16;
                var61 = var57 * var61 - var56 * var59 >> 16;
                var59 = var62;
            }
            int var63 = arg5 + var59;
            int var64 = arg6 + var60;
            int var65 = arg7 + var61;
            int var66 = arg3 * var65 + arg4 * var63 >> 16;
            int var67 = arg4 * var65 - arg3 * var63 >> 16;
            int var69 = arg2 * var64 - arg1 * var67 >> 16;
            int var70 = arg1 * var64 + arg2 * var67 >> 16;
            field1690[var58] = var70 - var12;
            if (var70 >= 50) {
                field1688[var58] = class125.field1756 * var66 / var70 + var54;
                field1689[var58] = class125.field1756 * var69 / var70 + var55;
            } else {
                field1688[var58] = -5000;
                var24 = true;
            }
            if (var26) {
                field1691[var58] = var66;
                field1692[var58] = var69;
                field1693[var58] = var70;
            }
        }
        try {
            this.method2435(var24, var33, this.field1673, arg8);
        } catch (Exception var73) {
        }
    }

    @ObfuscatedName("dx.u(ZZZJ)V")
    public final void method2435(boolean arg0, boolean arg1, boolean arg2, long arg3) {
        if (this.field1666 >= 1600) {
            return;
        }
        for (int var6 = 0; var6 < this.field1666; var6++) {
            field1695[var6] = 0;
        }
        int var7 = arg2 ? 20 : 5;
        for (int var8 = 0; var8 < this.field1655; var8++) {
            if (this.field1661[var8] != -2) {
                int var9 = this.field1656[var8];
                int var10 = this.field1657[var8];
                int var11 = this.field1650[var8];
                int var12 = field1688[var9];
                int var13 = field1688[var10];
                int var14 = field1688[var11];
                if (arg0 && (var12 == -5000 || var13 == -5000 || var14 == -5000)) {
                    int var15 = field1691[var9];
                    int var16 = field1691[var10];
                    int var17 = field1691[var11];
                    int var18 = field1692[var9];
                    int var19 = field1692[var10];
                    int var20 = field1692[var11];
                    int var21 = field1693[var9];
                    int var22 = field1693[var10];
                    int var23 = field1693[var11];
                    int var24 = var15 - var16;
                    int var25 = var17 - var16;
                    int var26 = var18 - var19;
                    int var27 = var20 - var19;
                    int var28 = var21 - var22;
                    int var29 = var23 - var22;
                    int var30 = var26 * var29 - var27 * var28;
                    int var31 = var25 * var28 - var24 * var29;
                    int var32 = var24 * var27 - var25 * var26;
                    if (var22 * var32 + var16 * var30 + var19 * var31 > 0) {
                        field1687[var8] = true;
                        int var33 = (field1690[var9] + field1690[var10] + field1690[var11]) / 3 + this.field1659;
                        field1681[var33][field1695[var33]++] = var8;
                    }
                } else {
                    if (arg1 && class123.method5124(field1689[var9], field1689[var10], field1689[var11], var12, var13, var14, var7)) {
                        class123.method3171(arg3);
                        arg1 = false;
                    }
                    if ((field1689[var11] - field1689[var10]) * (var12 - var13) - (field1689[var9] - field1689[var10]) * (var14 - var13) > 0) {
                        field1687[var8] = false;
                        if (var12 >= 0 && var13 >= 0 && var14 >= 0 && var12 <= Statics.field1755 && var13 <= Statics.field1755 && var14 <= Statics.field1755) {
                            field1686[var8] = false;
                        } else {
                            field1686[var8] = true;
                        }
                        int var34 = (field1690[var9] + field1690[var10] + field1690[var11]) / 3 + this.field1659;
                        field1681[var34][field1695[var34]++] = var8;
                    }
                }
            }
        }
        if (this.field1662 == null) {
            for (int var35 = this.field1666 - 1; var35 >= 0; var35--) {
                int var36 = field1695[var35];
                if (var36 > 0) {
                    int[] var37 = field1681[var35];
                    for (int var38 = 0; var38 < var36; var38++) {
                        this.method2436(var37[var38]);
                    }
                }
            }
            return;
        }
        for (int var39 = 0; var39 < 12; var39++) {
            field1697[var39] = 0;
            field1701[var39] = 0;
        }
        for (int var40 = this.field1666 - 1; var40 >= 0; var40--) {
            int var41 = field1695[var40];
            if (var41 > 0) {
                int[] var42 = field1681[var40];
                for (int var43 = 0; var43 < var41; var43++) {
                    int var44 = var42[var43];
                    byte var45 = this.field1662[var44];
                    int var46 = field1697[var45]++;
                    field1682[var45][var46] = var44;
                    if (var45 < 10) {
                        field1701[var45] += var40;
                    } else if (var45 == 10) {
                        field1665[var46] = var40;
                    } else {
                        field1683[var46] = var40;
                    }
                }
            }
        }
        int var47 = 0;
        if (field1697[1] > 0 || field1697[2] > 0) {
            var47 = (field1701[1] + field1701[2]) / (field1697[1] + field1697[2]);
        }
        int var48 = 0;
        if (field1697[3] > 0 || field1697[4] > 0) {
            var48 = (field1701[3] + field1701[4]) / (field1697[3] + field1697[4]);
        }
        int var49 = 0;
        if (field1697[6] > 0 || field1697[8] > 0) {
            var49 = (field1701[6] + field1701[8]) / (field1697[6] + field1697[8]);
        }
        int var50 = 0;
        int var51 = field1697[10];
        int[] var52 = field1682[10];
        int[] var53 = field1665;
        if (var50 == var51) {
            var50 = 0;
            var51 = field1697[11];
            var52 = field1682[11];
            var53 = field1683;
        }
        int var54;
        if (var50 < var51) {
            var54 = var53[var50];
        } else {
            var54 = -1000;
        }
        for (int var55 = 0; var55 < 10; var55++) {
            while (var55 == 0 && var54 > var47) {
                this.method2436(var52[var50++]);
                if (var50 == var51 && field1682[11] != var52) {
                    var50 = 0;
                    var51 = field1697[11];
                    var52 = field1682[11];
                    var53 = field1683;
                }
                if (var50 < var51) {
                    var54 = var53[var50];
                } else {
                    var54 = -1000;
                }
            }
            while (var55 == 3 && var54 > var48) {
                this.method2436(var52[var50++]);
                if (var50 == var51 && field1682[11] != var52) {
                    var50 = 0;
                    var51 = field1697[11];
                    var52 = field1682[11];
                    var53 = field1683;
                }
                if (var50 < var51) {
                    var54 = var53[var50];
                } else {
                    var54 = -1000;
                }
            }
            while (var55 == 5 && var54 > var49) {
                this.method2436(var52[var50++]);
                if (var50 == var51 && field1682[11] != var52) {
                    var50 = 0;
                    var51 = field1697[11];
                    var52 = field1682[11];
                    var53 = field1683;
                }
                if (var50 < var51) {
                    var54 = var53[var50];
                } else {
                    var54 = -1000;
                }
            }
            int var56 = field1697[var55];
            int[] var57 = field1682[var55];
            for (int var58 = 0; var58 < var56; var58++) {
                this.method2436(var57[var58]);
            }
        }
        while (var54 != -1000) {
            this.method2436(var52[var50++]);
            if (var50 == var51 && field1682[11] != var52) {
                var50 = 0;
                var52 = field1682[11];
                var51 = field1697[11];
                var53 = field1683;
            }
            if (var50 < var51) {
                var54 = var53[var50];
            } else {
                var54 = -1000;
            }
        }
    }

    @ObfuscatedName("dx.f(I)V")
    public final void method2436(int arg0) {
        if (field1687[arg0]) {
            this.method2437(arg0);
            return;
        }
        int var2 = this.field1656[arg0];
        int var3 = this.field1657[arg0];
        int var4 = this.field1650[arg0];
        class125.field1765 = field1686[arg0];
        if (this.field1663 == null) {
            class125.field1745 = 0;
        } else {
            class125.field1745 = this.field1663[arg0] & 0xFF;
        }
        if (this.field1677 != null && this.field1677[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1664 == null || this.field1664[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1664[arg0] & 0xFF;
                var6 = this.field1668[var5];
                var7 = this.field1669[var5];
                var8 = this.field1670[var5];
            }
            if (this.field1661[arg0] == -1) {
                class125.method2566(field1689[var2], field1689[var3], field1689[var4], field1688[var2], field1688[var3], field1688[var4], this.field1696[arg0], this.field1696[arg0], this.field1696[arg0], field1691[var6], field1691[var7], field1691[var8], field1692[var6], field1692[var7], field1692[var8], field1693[var6], field1693[var7], field1693[var8], this.field1677[arg0]);
            } else {
                class125.method2566(field1689[var2], field1689[var3], field1689[var4], field1688[var2], field1688[var3], field1688[var4], this.field1696[arg0], this.field1660[arg0], this.field1661[arg0], field1691[var6], field1691[var7], field1691[var8], field1692[var6], field1692[var7], field1692[var8], field1693[var6], field1693[var7], field1693[var8], this.field1677[arg0]);
            }
        } else if (this.field1661[arg0] == -1) {
            class125.method2572(field1689[var2], field1689[var3], field1689[var4], field1688[var2], field1688[var3], field1688[var4], field1703[this.field1696[arg0]]);
        } else {
            class125.method2562(field1689[var2], field1689[var3], field1689[var4], field1688[var2], field1688[var3], field1688[var4], this.field1696[arg0], this.field1660[arg0], this.field1661[arg0]);
        }
    }

    @ObfuscatedName("dx.at(I)V")
    public final void method2437(int arg0) {
        int var2 = Statics.field1753;
        int var3 = Statics.field1760;
        int var4 = 0;
        int var5 = this.field1656[arg0];
        int var6 = this.field1657[arg0];
        int var7 = this.field1650[arg0];
        int var8 = field1693[var5];
        int var9 = field1693[var6];
        int var10 = field1693[var7];
        if (this.field1663 == null) {
            class125.field1745 = 0;
        } else {
            class125.field1745 = this.field1663[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1702[var4] = field1688[var5];
            field1713[var4] = field1689[var5];
            field1704[var4++] = this.field1696[arg0];
        } else {
            int var11 = field1691[var5];
            int var12 = field1692[var5];
            int var13 = this.field1696[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1674[var10 - var8];
                field1702[var4] = (((field1691[var7] - var11) * var14 >> 16) + var11) * class125.field1756 / 50 + var2;
                field1713[var4] = (((field1692[var7] - var12) * var14 >> 16) + var12) * class125.field1756 / 50 + var3;
                field1704[var4++] = ((this.field1661[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1674[var9 - var8];
                field1702[var4] = (((field1691[var6] - var11) * var15 >> 16) + var11) * class125.field1756 / 50 + var2;
                field1713[var4] = (((field1692[var6] - var12) * var15 >> 16) + var12) * class125.field1756 / 50 + var3;
                field1704[var4++] = ((this.field1660[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1702[var4] = field1688[var6];
            field1713[var4] = field1689[var6];
            field1704[var4++] = this.field1660[arg0];
        } else {
            int var16 = field1691[var6];
            int var17 = field1692[var6];
            int var18 = this.field1660[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1674[var8 - var9];
                field1702[var4] = (((field1691[var5] - var16) * var19 >> 16) + var16) * class125.field1756 / 50 + var2;
                field1713[var4] = (((field1692[var5] - var17) * var19 >> 16) + var17) * class125.field1756 / 50 + var3;
                field1704[var4++] = ((this.field1696[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1674[var10 - var9];
                field1702[var4] = (((field1691[var7] - var16) * var20 >> 16) + var16) * class125.field1756 / 50 + var2;
                field1713[var4] = (((field1692[var7] - var17) * var20 >> 16) + var17) * class125.field1756 / 50 + var3;
                field1704[var4++] = ((this.field1661[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1702[var4] = field1688[var7];
            field1713[var4] = field1689[var7];
            field1704[var4++] = this.field1661[arg0];
        } else {
            int var21 = field1691[var7];
            int var22 = field1692[var7];
            int var23 = this.field1661[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1674[var9 - var10];
                field1702[var4] = (((field1691[var6] - var21) * var24 >> 16) + var21) * class125.field1756 / 50 + var2;
                field1713[var4] = (((field1692[var6] - var22) * var24 >> 16) + var22) * class125.field1756 / 50 + var3;
                field1704[var4++] = ((this.field1660[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1674[var8 - var10];
                field1702[var4] = (((field1691[var5] - var21) * var25 >> 16) + var21) * class125.field1756 / 50 + var2;
                field1713[var4] = (((field1692[var5] - var22) * var25 >> 16) + var22) * class125.field1756 / 50 + var3;
                field1704[var4++] = ((this.field1696[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1702[0];
        int var27 = field1702[1];
        int var28 = field1702[2];
        int var29 = field1713[0];
        int var30 = field1713[1];
        int var31 = field1713[2];
        class125.field1765 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1755 || var27 > Statics.field1755 || var28 > Statics.field1755) {
                class125.field1765 = true;
            }
            if (this.field1677 != null && this.field1677[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1664 == null || this.field1664[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1664[arg0] & 0xFF;
                    var33 = this.field1668[var32];
                    var34 = this.field1669[var32];
                    var35 = this.field1670[var32];
                }
                if (this.field1661[arg0] == -1) {
                    class125.method2566(var29, var30, var31, var26, var27, var28, this.field1696[arg0], this.field1696[arg0], this.field1696[arg0], field1691[var33], field1691[var34], field1691[var35], field1692[var33], field1692[var34], field1692[var35], field1693[var33], field1693[var34], field1693[var35], this.field1677[arg0]);
                } else {
                    class125.method2566(var29, var30, var31, var26, var27, var28, field1704[0], field1704[1], field1704[2], field1691[var33], field1691[var34], field1691[var35], field1692[var33], field1692[var34], field1692[var35], field1693[var33], field1693[var34], field1693[var35], this.field1677[arg0]);
                }
            } else if (this.field1661[arg0] == -1) {
                class125.method2572(var29, var30, var31, var26, var27, var28, field1703[this.field1696[arg0]]);
            } else {
                class125.method2562(var29, var30, var31, var26, var27, var28, field1704[0], field1704[1], field1704[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1755 || var27 > Statics.field1755 || var28 > Statics.field1755 || field1702[3] < 0 || field1702[3] > Statics.field1755) {
            class125.field1765 = true;
        }
        if (this.field1677 != null && this.field1677[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1664 == null || this.field1664[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1664[arg0] & 0xFF;
                var37 = this.field1668[var36];
                var38 = this.field1669[var36];
                var39 = this.field1670[var36];
            }
            short var40 = this.field1677[arg0];
            if (this.field1661[arg0] == -1) {
                class125.method2566(var29, var30, var31, var26, var27, var28, this.field1696[arg0], this.field1696[arg0], this.field1696[arg0], field1691[var37], field1691[var38], field1691[var39], field1692[var37], field1692[var38], field1692[var39], field1693[var37], field1693[var38], field1693[var39], var40);
                class125.method2566(var29, var31, field1713[3], var26, var28, field1702[3], this.field1696[arg0], this.field1696[arg0], this.field1696[arg0], field1691[var37], field1691[var38], field1691[var39], field1692[var37], field1692[var38], field1692[var39], field1693[var37], field1693[var38], field1693[var39], var40);
            } else {
                class125.method2566(var29, var30, var31, var26, var27, var28, field1704[0], field1704[1], field1704[2], field1691[var37], field1691[var38], field1691[var39], field1692[var37], field1692[var38], field1692[var39], field1693[var37], field1693[var38], field1693[var39], var40);
                class125.method2566(var29, var31, field1713[3], var26, var28, field1702[3], field1704[0], field1704[2], field1704[3], field1691[var37], field1691[var38], field1691[var39], field1692[var37], field1692[var38], field1692[var39], field1693[var37], field1693[var38], field1693[var39], var40);
            }
        } else if (this.field1661[arg0] == -1) {
            int var41 = field1703[this.field1696[arg0]];
            class125.method2572(var29, var30, var31, var26, var27, var28, var41);
            class125.method2572(var29, var31, field1713[3], var26, var28, field1702[3], var41);
        } else {
            class125.method2562(var29, var30, var31, var26, var27, var28, field1704[0], field1704[1], field1704[2]);
            class125.method2562(var29, var31, field1713[3], var26, var28, field1702[3], field1704[0], field1704[2], field1704[3]);
        }
    }
}
