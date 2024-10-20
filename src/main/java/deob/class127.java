package deob;

@ObfuscatedName("dq")
public class class127 extends class135 {

    @ObfuscatedName("dq.n")
    public static class127 field1674 = new class127();

    @ObfuscatedName("dq.h")
    public static byte[] field1648 = new byte[1];

    @ObfuscatedName("dq.l")
    public static class127 field1649 = new class127();

    @ObfuscatedName("dq.g")
    public static byte[] field1654 = new byte[1];

    @ObfuscatedName("dq.b")
    public int field1697 = 0;

    @ObfuscatedName("dq.a")
    public int[] field1652;

    @ObfuscatedName("dq.c")
    public int[] field1716;

    @ObfuscatedName("dq.z")
    public int[] field1688;

    @ObfuscatedName("dq.j")
    public int field1655 = 0;

    @ObfuscatedName("dq.d")
    public int[] field1656;

    @ObfuscatedName("dq.t")
    public int[] field1657;

    @ObfuscatedName("dq.f")
    public int[] field1658;

    @ObfuscatedName("dq.i")
    public int[] field1659;

    @ObfuscatedName("dq.m")
    public int[] field1660;

    @ObfuscatedName("dq.v")
    public int[] field1672;

    @ObfuscatedName("dq.r")
    public byte[] field1662;

    @ObfuscatedName("dq.x")
    public byte[] field1671;

    @ObfuscatedName("dq.y")
    public byte[] field1705;

    @ObfuscatedName("dq.p")
    public short[] field1665;

    @ObfuscatedName("dq.k")
    public byte field1666 = 0;

    @ObfuscatedName("dq.o")
    public int field1684 = 0;

    @ObfuscatedName("dq.s")
    public int[] field1709;

    @ObfuscatedName("dq.u")
    public int[] field1669;

    @ObfuscatedName("dq.e")
    public int[] field1670;

    @ObfuscatedName("dq.w")
    public int[][] field1693;

    @ObfuscatedName("dq.q")
    public int[][] field1650;

    @ObfuscatedName("dq.aa")
    public boolean field1673 = false;

    @ObfuscatedName("dq.ai")
    public int field1651;

    @ObfuscatedName("dq.ag")
    public int field1675;

    @ObfuscatedName("dq.at")
    public int field1676;

    @ObfuscatedName("dq.ad")
    public int field1713;

    @ObfuscatedName("dq.as")
    public int field1678;

    @ObfuscatedName("dq.ac")
    public int field1679;

    @ObfuscatedName("dq.an")
    public int field1680;

    @ObfuscatedName("dq.ak")
    public int field1681;

    @ObfuscatedName("dq.ah")
    public int field1682 = -1;

    @ObfuscatedName("dq.al")
    public int field1683 = -1;

    @ObfuscatedName("dq.am")
    public int field1685 = -1;

    @ObfuscatedName("dq.aq")
    public static boolean[] field1686 = new boolean[4700];

    @ObfuscatedName("dq.aw")
    public static boolean[] field1687 = new boolean[4700];

    @ObfuscatedName("dq.ab")
    public static int[] field1661 = new int[4700];

    @ObfuscatedName("dq.ae")
    public static int[] field1689 = new int[4700];

    @ObfuscatedName("dq.au")
    public static int[] field1714 = new int[4700];

    @ObfuscatedName("dq.ay")
    public static int[] field1677 = new int[4700];

    @ObfuscatedName("dq.az")
    public static int[] field1692 = new int[4700];

    @ObfuscatedName("dq.aj")
    public static int[] field1691 = new int[4700];

    @ObfuscatedName("dq.ax")
    public static int[] field1668 = new int[1600];

    @ObfuscatedName("dq.ap")
    public static int[][] field1696 = new int[1600][512];

    @ObfuscatedName("dq.av")
    public static int[] field1690 = new int[12];

    @ObfuscatedName("dq.af")
    public static int[][] field1698 = new int[12][2000];

    @ObfuscatedName("dq.bf")
    public static int[] field1699 = new int[2000];

    @ObfuscatedName("dq.bi")
    public static int[] field1700 = new int[2000];

    @ObfuscatedName("dq.bx")
    public static int[] field1703 = new int[12];

    @ObfuscatedName("dq.bu")
    public static int[] field1702 = new int[10];

    @ObfuscatedName("dq.bq")
    public static int[] field1653 = new int[10];

    @ObfuscatedName("dq.be")
    public static int[] field1667 = new int[10];

    @ObfuscatedName("dq.bc")
    public static boolean field1708 = true;

    @ObfuscatedName("dq.bk")
    public static int[] field1711 = class130.field1768;

    @ObfuscatedName("dq.bt")
    public static int[] field1712 = class130.field1769;

    @ObfuscatedName("dq.bs")
    public static int[] field1695 = class130.field1761;

    @ObfuscatedName("dq.ba")
    public static int[] field1701 = class130.field1746;

    public class127() {
    }

    public class127(class127[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        this.field1697 = 0;
        this.field1655 = 0;
        this.field1684 = 0;
        this.field1666 = -1;
        for (int var7 = 0; var7 < arg1; var7++) {
            class127 var8 = arg0[var7];
            if (var8 != null) {
                this.field1697 += var8.field1697;
                this.field1655 += var8.field1655;
                this.field1684 += var8.field1684;
                if (var8.field1662 == null) {
                    if (this.field1666 == -1) {
                        this.field1666 = var8.field1666;
                    }
                    if (this.field1666 != var8.field1666) {
                        var3 = true;
                    }
                } else {
                    var3 = true;
                }
                var4 |= var8.field1671 != null;
                var5 |= var8.field1665 != null;
                var6 |= var8.field1705 != null;
            }
        }
        this.field1652 = new int[this.field1697];
        this.field1716 = new int[this.field1697];
        this.field1688 = new int[this.field1697];
        this.field1656 = new int[this.field1655];
        this.field1657 = new int[this.field1655];
        this.field1658 = new int[this.field1655];
        this.field1659 = new int[this.field1655];
        this.field1660 = new int[this.field1655];
        this.field1672 = new int[this.field1655];
        if (var3) {
            this.field1662 = new byte[this.field1655];
        }
        if (var4) {
            this.field1671 = new byte[this.field1655];
        }
        if (var5) {
            this.field1665 = new short[this.field1655];
        }
        if (var6) {
            this.field1705 = new byte[this.field1655];
        }
        if (this.field1684 > 0) {
            this.field1709 = new int[this.field1684];
            this.field1669 = new int[this.field1684];
            this.field1670 = new int[this.field1684];
        }
        this.field1697 = 0;
        this.field1655 = 0;
        this.field1684 = 0;
        for (int var9 = 0; var9 < arg1; var9++) {
            class127 var10 = arg0[var9];
            if (var10 != null) {
                for (int var11 = 0; var11 < var10.field1655; var11++) {
                    this.field1656[this.field1655] = var10.field1656[var11] + this.field1697;
                    this.field1657[this.field1655] = var10.field1657[var11] + this.field1697;
                    this.field1658[this.field1655] = var10.field1658[var11] + this.field1697;
                    this.field1659[this.field1655] = var10.field1659[var11];
                    this.field1660[this.field1655] = var10.field1660[var11];
                    this.field1672[this.field1655] = var10.field1672[var11];
                    if (var3) {
                        if (var10.field1662 == null) {
                            this.field1662[this.field1655] = var10.field1666;
                        } else {
                            this.field1662[this.field1655] = var10.field1662[var11];
                        }
                    }
                    if (var4 && var10.field1671 != null) {
                        this.field1671[this.field1655] = var10.field1671[var11];
                    }
                    if (var5) {
                        if (var10.field1665 == null) {
                            this.field1665[this.field1655] = -1;
                        } else {
                            this.field1665[this.field1655] = var10.field1665[var11];
                        }
                    }
                    if (var6) {
                        if (var10.field1705 == null || var10.field1705[var11] == -1) {
                            this.field1705[this.field1655] = -1;
                        } else {
                            this.field1705[this.field1655] = (byte) (var10.field1705[var11] + this.field1684);
                        }
                    }
                    this.field1655++;
                }
                for (int var12 = 0; var12 < var10.field1684; var12++) {
                    this.field1709[this.field1684] = var10.field1709[var12] + this.field1697;
                    this.field1669[this.field1684] = var10.field1669[var12] + this.field1697;
                    this.field1670[this.field1684] = var10.field1670[var12] + this.field1697;
                    this.field1684++;
                }
                for (int var13 = 0; var13 < var10.field1697; var13++) {
                    this.field1652[this.field1697] = var10.field1652[var13];
                    this.field1716[this.field1697] = var10.field1716[var13];
                    this.field1688[this.field1697] = var10.field1688[var13];
                    this.field1697++;
                }
            }
        }
    }

    @ObfuscatedName("dq.n([[IIIIZI)Ldq;")
    public class127 method2671(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method2676();
        int var7 = arg1 - this.field1676;
        int var8 = this.field1676 + arg1;
        int var9 = arg3 - this.field1676;
        int var10 = this.field1676 + arg3;
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
        class127 var15;
        if (arg4) {
            var15 = new class127();
            var15.field1697 = this.field1697;
            var15.field1655 = this.field1655;
            var15.field1684 = this.field1684;
            var15.field1652 = this.field1652;
            var15.field1688 = this.field1688;
            var15.field1656 = this.field1656;
            var15.field1657 = this.field1657;
            var15.field1658 = this.field1658;
            var15.field1659 = this.field1659;
            var15.field1660 = this.field1660;
            var15.field1672 = this.field1672;
            var15.field1662 = this.field1662;
            var15.field1671 = this.field1671;
            var15.field1705 = this.field1705;
            var15.field1665 = this.field1665;
            var15.field1666 = this.field1666;
            var15.field1709 = this.field1709;
            var15.field1669 = this.field1669;
            var15.field1670 = this.field1670;
            var15.field1693 = this.field1693;
            var15.field1650 = this.field1650;
            var15.field1673 = this.field1673;
            var15.field1716 = new int[var15.field1697];
        } else {
            var15 = this;
        }
        if (arg5 == 0) {
            for (int var16 = 0; var16 < var15.field1697; var16++) {
                int var17 = this.field1652[var16] + arg1;
                int var18 = this.field1688[var16] + arg3;
                int var19 = var17 & 0x7F;
                int var20 = var18 & 0x7F;
                int var21 = var17 >> 7;
                int var22 = var18 >> 7;
                int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                var15.field1716[var16] = this.field1716[var16] + var25 - arg2;
            }
        } else {
            for (int var26 = 0; var26 < var15.field1697; var26++) {
                int var27 = (-this.field1716[var26] << 16) / this.field1860;
                if (var27 < arg5) {
                    int var28 = this.field1652[var26] + arg1;
                    int var29 = this.field1688[var26] + arg3;
                    int var30 = var28 & 0x7F;
                    int var31 = var29 & 0x7F;
                    int var32 = var28 >> 7;
                    int var33 = var29 >> 7;
                    int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                    int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                    int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                    var15.field1716[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field1716[var26];
                }
            }
        }
        var15.method2679();
        return var15;
    }

    @ObfuscatedName("dq.h(Z)Ldq;")
    public class127 method2672(boolean arg0) {
        if (!arg0 && field1648.length < this.field1655) {
            field1648 = new byte[this.field1655 + 100];
        }
        return this.method2674(arg0, field1674, field1648);
    }

    @ObfuscatedName("dq.l(Z)Ldq;")
    public class127 method2673(boolean arg0) {
        if (!arg0 && field1654.length < this.field1655) {
            field1654 = new byte[this.field1655 + 100];
        }
        return this.method2674(arg0, field1649, field1654);
    }

    @ObfuscatedName("dq.g(ZLdq;[B)Ldq;")
    public class127 method2674(boolean arg0, class127 arg1, byte[] arg2) {
        arg1.field1697 = this.field1697;
        arg1.field1655 = this.field1655;
        arg1.field1684 = this.field1684;
        if (arg1.field1652 == null || arg1.field1652.length < this.field1697) {
            arg1.field1652 = new int[this.field1697 + 100];
            arg1.field1716 = new int[this.field1697 + 100];
            arg1.field1688 = new int[this.field1697 + 100];
        }
        for (int var4 = 0; var4 < this.field1697; var4++) {
            arg1.field1652[var4] = this.field1652[var4];
            arg1.field1716[var4] = this.field1716[var4];
            arg1.field1688[var4] = this.field1688[var4];
        }
        if (arg0) {
            arg1.field1671 = this.field1671;
        } else {
            arg1.field1671 = arg2;
            if (this.field1671 == null) {
                for (int var5 = 0; var5 < this.field1655; var5++) {
                    arg1.field1671[var5] = 0;
                }
            } else {
                for (int var6 = 0; var6 < this.field1655; var6++) {
                    arg1.field1671[var6] = this.field1671[var6];
                }
            }
        }
        arg1.field1656 = this.field1656;
        arg1.field1657 = this.field1657;
        arg1.field1658 = this.field1658;
        arg1.field1659 = this.field1659;
        arg1.field1660 = this.field1660;
        arg1.field1672 = this.field1672;
        arg1.field1662 = this.field1662;
        arg1.field1705 = this.field1705;
        arg1.field1665 = this.field1665;
        arg1.field1666 = this.field1666;
        arg1.field1709 = this.field1709;
        arg1.field1669 = this.field1669;
        arg1.field1670 = this.field1670;
        arg1.field1693 = this.field1693;
        arg1.field1650 = this.field1650;
        arg1.field1673 = this.field1673;
        arg1.method2679();
        return arg1;
    }

    @ObfuscatedName("dq.b(I)V")
    public void method2727(int arg0) {
        if (this.field1682 != -1) {
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
        for (int var10 = 0; var10 < this.field1697; var10++) {
            int var11 = class130.method2802(this.field1652[var10], this.field1688[var10], var8, var9);
            int var12 = this.field1716[var10];
            int var13 = class130.method2803(this.field1652[var10], this.field1688[var10], var8, var9);
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
        this.field1679 = (var2 + var5) / 2;
        this.field1680 = (var3 + var6) / 2;
        this.field1681 = (var4 + var7) / 2;
        this.field1682 = (var5 - var2 + 1) / 2;
        this.field1683 = (var6 - var3 + 1) / 2;
        this.field1685 = (var7 - var4 + 1) / 2;
        if (this.field1682 < 32) {
            this.field1682 = 32;
        }
        if (this.field1685 < 32) {
            this.field1685 = 32;
        }
        if (this.field1673) {
            this.field1682 += 8;
            this.field1685 += 8;
        }
    }

    @ObfuscatedName("dq.a()V")
    public void method2676() {
        if (this.field1651 == 1) {
            return;
        }
        this.field1651 = 1;
        this.field1860 = 0;
        this.field1675 = 0;
        this.field1676 = 0;
        for (int var1 = 0; var1 < this.field1697; var1++) {
            int var2 = this.field1652[var1];
            int var3 = this.field1716[var1];
            int var4 = this.field1688[var1];
            if (-var3 > this.field1860) {
                this.field1860 = -var3;
            }
            if (var3 > this.field1675) {
                this.field1675 = var3;
            }
            int var5 = var2 * var2 + var4 * var4;
            if (var5 > this.field1676) {
                this.field1676 = var5;
            }
        }
        this.field1676 = (int) (Math.sqrt((double) this.field1676) + 0.99D);
        this.field1678 = (int) (Math.sqrt((double) (this.field1860 * this.field1860 + this.field1676 * this.field1676)) + 0.99D);
        this.field1713 = this.field1678 + (int) (Math.sqrt((double) (this.field1676 * this.field1676 + this.field1675 * this.field1675)) + 0.99D);
    }

    @ObfuscatedName("dq.c()V")
    public void method2711() {
        if (this.field1651 == 2) {
            return;
        }
        this.field1651 = 2;
        this.field1676 = 0;
        for (int var1 = 0; var1 < this.field1697; var1++) {
            int var2 = this.field1652[var1];
            int var3 = this.field1716[var1];
            int var4 = this.field1688[var1];
            int var5 = var3 * var3 + var2 * var2 + var4 * var4;
            if (var5 > this.field1676) {
                this.field1676 = var5;
            }
        }
        this.field1676 = (int) (Math.sqrt((double) this.field1676) + 0.99D);
        this.field1678 = this.field1676;
        this.field1713 = this.field1676 + this.field1676;
    }

    @ObfuscatedName("dq.z()I")
    public int method2678() {
        this.method2676();
        return this.field1676;
    }

    @ObfuscatedName("dq.d()V")
    public void method2679() {
        this.field1651 = 0;
        this.field1682 = -1;
    }

    @ObfuscatedName("dq.i(Lea;I)V")
    public void method2680(class138 arg0, int arg1) {
        if (this.field1693 == null || arg1 == -1) {
            return;
        }
        class125 var3 = arg0.field1879[arg1];
        class132 var4 = var3.field1616;
        Statics.field1647 = 0;
        Statics.field1706 = 0;
        Statics.field1707 = 0;
        for (int var5 = 0; var5 < var3.field1614; var5++) {
            int var6 = var3.field1618[var5];
            this.method2682(var4.field1780[var6], var4.field1783[var6], var3.field1620[var5], var3.field1617[var5], var3.field1613[var5]);
        }
        this.method2679();
    }

    @ObfuscatedName("dq.m(Lea;ILea;I[I)V")
    public void method2681(class138 arg0, int arg1, class138 arg2, int arg3, int[] arg4) {
        if (arg1 == -1) {
            return;
        }
        if (arg4 == null || arg3 == -1) {
            this.method2680(arg0, arg1);
            return;
        }
        class125 var6 = arg0.field1879[arg1];
        class125 var7 = arg2.field1879[arg3];
        class132 var8 = var6.field1616;
        Statics.field1647 = 0;
        Statics.field1706 = 0;
        Statics.field1707 = 0;
        byte var9 = 0;
        int var17 = var9 + 1;
        int var10 = arg4[var9];
        for (int var11 = 0; var11 < var6.field1614; var11++) {
            int var12 = var6.field1618[var11];
            while (var12 > var10) {
                var10 = arg4[var17++];
            }
            if (var10 != var12 || var8.field1780[var12] == 0) {
                this.method2682(var8.field1780[var12], var8.field1783[var12], var6.field1620[var11], var6.field1617[var11], var6.field1613[var11]);
            }
        }
        Statics.field1647 = 0;
        Statics.field1706 = 0;
        Statics.field1707 = 0;
        byte var13 = 0;
        int var18 = var13 + 1;
        int var14 = arg4[var13];
        for (int var15 = 0; var15 < var7.field1614; var15++) {
            int var16 = var7.field1618[var15];
            while (var16 > var14) {
                var14 = arg4[var18++];
            }
            if (var14 == var16 || var8.field1780[var16] == 0) {
                this.method2682(var8.field1780[var16], var8.field1783[var16], var7.field1620[var15], var7.field1617[var15], var7.field1613[var15]);
            }
        }
        this.method2679();
    }

    @ObfuscatedName("dq.v(I[IIII)V")
    public void method2682(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        int var6 = arg1.length;
        if (arg0 == 0) {
            int var7 = 0;
            Statics.field1647 = 0;
            Statics.field1706 = 0;
            Statics.field1707 = 0;
            for (int var8 = 0; var8 < var6; var8++) {
                int var9 = arg1[var8];
                if (var9 < this.field1693.length) {
                    int[] var10 = this.field1693[var9];
                    for (int var11 = 0; var11 < var10.length; var11++) {
                        int var12 = var10[var11];
                        Statics.field1647 += this.field1652[var12];
                        Statics.field1706 += this.field1716[var12];
                        Statics.field1707 += this.field1688[var12];
                        var7++;
                    }
                }
            }
            if (var7 > 0) {
                Statics.field1647 = Statics.field1647 / var7 + arg2;
                Statics.field1706 = Statics.field1706 / var7 + arg3;
                Statics.field1707 = Statics.field1707 / var7 + arg4;
            } else {
                Statics.field1647 = arg2;
                Statics.field1706 = arg3;
                Statics.field1707 = arg4;
            }
        } else if (arg0 == 1) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var14 = arg1[var13];
                if (var14 < this.field1693.length) {
                    int[] var15 = this.field1693[var14];
                    for (int var16 = 0; var16 < var15.length; var16++) {
                        int var17 = var15[var16];
                        this.field1652[var17] += arg2;
                        this.field1716[var17] += arg3;
                        this.field1688[var17] += arg4;
                    }
                }
            }
        } else if (arg0 == 2) {
            for (int var18 = 0; var18 < var6; var18++) {
                int var19 = arg1[var18];
                if (var19 < this.field1693.length) {
                    int[] var20 = this.field1693[var19];
                    for (int var21 = 0; var21 < var20.length; var21++) {
                        int var22 = var20[var21];
                        this.field1652[var22] -= Statics.field1647;
                        this.field1716[var22] -= Statics.field1706;
                        this.field1688[var22] -= Statics.field1707;
                        int var23 = (arg2 & 0xFF) * 8;
                        int var24 = (arg3 & 0xFF) * 8;
                        int var25 = (arg4 & 0xFF) * 8;
                        if (var25 != 0) {
                            int var26 = field1711[var25];
                            int var27 = field1712[var25];
                            int var28 = this.field1716[var22] * var26 + this.field1652[var22] * var27 >> 16;
                            this.field1716[var22] = this.field1716[var22] * var27 - this.field1652[var22] * var26 >> 16;
                            this.field1652[var22] = var28;
                        }
                        if (var23 != 0) {
                            int var29 = field1711[var23];
                            int var30 = field1712[var23];
                            int var31 = this.field1716[var22] * var30 - this.field1688[var22] * var29 >> 16;
                            this.field1688[var22] = this.field1716[var22] * var29 + this.field1688[var22] * var30 >> 16;
                            this.field1716[var22] = var31;
                        }
                        if (var24 != 0) {
                            int var32 = field1711[var24];
                            int var33 = field1712[var24];
                            int var34 = this.field1688[var22] * var32 + this.field1652[var22] * var33 >> 16;
                            this.field1688[var22] = this.field1688[var22] * var33 - this.field1652[var22] * var32 >> 16;
                            this.field1652[var22] = var34;
                        }
                        this.field1652[var22] += Statics.field1647;
                        this.field1716[var22] += Statics.field1706;
                        this.field1688[var22] += Statics.field1707;
                    }
                }
            }
        } else if (arg0 == 3) {
            for (int var35 = 0; var35 < var6; var35++) {
                int var36 = arg1[var35];
                if (var36 < this.field1693.length) {
                    int[] var37 = this.field1693[var36];
                    for (int var38 = 0; var38 < var37.length; var38++) {
                        int var39 = var37[var38];
                        this.field1652[var39] -= Statics.field1647;
                        this.field1716[var39] -= Statics.field1706;
                        this.field1688[var39] -= Statics.field1707;
                        this.field1652[var39] = this.field1652[var39] * arg2 / 128;
                        this.field1716[var39] = this.field1716[var39] * arg3 / 128;
                        this.field1688[var39] = this.field1688[var39] * arg4 / 128;
                        this.field1652[var39] += Statics.field1647;
                        this.field1716[var39] += Statics.field1706;
                        this.field1688[var39] += Statics.field1707;
                    }
                }
            }
        } else if (arg0 == 5 && this.field1650 != null && this.field1671 != null) {
            for (int var40 = 0; var40 < var6; var40++) {
                int var41 = arg1[var40];
                if (var41 < this.field1650.length) {
                    int[] var42 = this.field1650[var41];
                    for (int var43 = 0; var43 < var42.length; var43++) {
                        int var44 = var42[var43];
                        int var45 = (this.field1671[var44] & 0xFF) + arg2 * 8;
                        if (var45 < 0) {
                            var45 = 0;
                        } else if (var45 > 255) {
                            var45 = 255;
                        }
                        this.field1671[var44] = (byte) var45;
                    }
                }
            }
        }
    }

    @ObfuscatedName("dq.r()V")
    public void method2683() {
        for (int var1 = 0; var1 < this.field1697; var1++) {
            int var2 = this.field1652[var1];
            this.field1652[var1] = this.field1688[var1];
            this.field1688[var1] = -var2;
        }
        this.method2679();
    }

    @ObfuscatedName("dq.x()V")
    public void method2738() {
        for (int var1 = 0; var1 < this.field1697; var1++) {
            this.field1652[var1] = -this.field1652[var1];
            this.field1688[var1] = -this.field1688[var1];
        }
        this.method2679();
    }

    @ObfuscatedName("dq.y()V")
    public void method2685() {
        for (int var1 = 0; var1 < this.field1697; var1++) {
            int var2 = this.field1688[var1];
            this.field1688[var1] = this.field1652[var1];
            this.field1652[var1] = -var2;
        }
        this.method2679();
    }

    @ObfuscatedName("dq.p(I)V")
    public void method2675(int arg0) {
        int var2 = field1711[arg0];
        int var3 = field1712[arg0];
        for (int var4 = 0; var4 < this.field1697; var4++) {
            int var5 = this.field1716[var4] * var3 - this.field1688[var4] * var2 >> 16;
            this.field1688[var4] = this.field1716[var4] * var2 + this.field1688[var4] * var3 >> 16;
            this.field1716[var4] = var5;
        }
        this.method2679();
    }

    @ObfuscatedName("dq.k(III)V")
    public void method2701(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1697; var4++) {
            this.field1652[var4] += arg0;
            this.field1716[var4] += arg1;
            this.field1688[var4] += arg2;
        }
        this.method2679();
    }

    @ObfuscatedName("dq.o(III)V")
    public void method2722(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field1697; var4++) {
            this.field1652[var4] = this.field1652[var4] * arg0 / 128;
            this.field1716[var4] = this.field1716[var4] * arg1 / 128;
            this.field1688[var4] = this.field1688[var4] * arg2 / 128;
        }
        this.method2679();
    }

    @ObfuscatedName("dq.s(IIIIIII)V")
    public final void method2734(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1668[0] = -1;
        if (this.field1651 != 2 && this.field1651 != 1) {
            this.method2711();
        }
        int var8 = Statics.field1755;
        int var9 = Statics.field1756;
        int var10 = field1711[arg0];
        int var11 = field1712[arg0];
        int var12 = field1711[arg1];
        int var13 = field1712[arg1];
        int var14 = field1711[arg2];
        int var15 = field1712[arg2];
        int var16 = field1711[arg3];
        int var17 = field1712[arg3];
        int var18 = arg5 * var16 + arg6 * var17 >> 16;
        for (int var19 = 0; var19 < this.field1697; var19++) {
            int var20 = this.field1652[var19];
            int var21 = this.field1716[var19];
            int var22 = this.field1688[var19];
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
            field1714[var19] = var30 - var18;
            field1661[var19] = class130.field1750 * var26 / var30 + var8;
            field1689[var19] = class130.field1750 * var29 / var30 + var9;
            if (this.field1684 > 0) {
                field1677[var19] = var26;
                field1692[var19] = var29;
                field1691[var19] = var30;
            }
        }
        try {
            this.method2688(false, false, false, 0L);
        } catch (Exception var33) {
        }
    }

    @ObfuscatedName("dq.u(IIIIIIII)V")
    public final void method2690(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1668[0] = -1;
        if (this.field1651 != 2 && this.field1651 != 1) {
            this.method2711();
        }
        int var9 = Statics.field1755;
        int var10 = Statics.field1756;
        int var11 = field1711[arg0];
        int var12 = field1712[arg0];
        int var13 = field1711[arg1];
        int var14 = field1712[arg1];
        int var15 = field1711[arg2];
        int var16 = field1712[arg2];
        int var17 = field1711[arg3];
        int var18 = field1712[arg3];
        int var19 = arg5 * var17 + arg6 * var18 >> 16;
        for (int var20 = 0; var20 < this.field1697; var20++) {
            int var21 = this.field1652[var20];
            int var22 = this.field1716[var20];
            int var23 = this.field1688[var20];
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
            field1714[var20] = var31 - var19;
            field1661[var20] = class130.field1750 * var27 / arg7 + var9;
            field1689[var20] = class130.field1750 * var30 / arg7 + var10;
            if (this.field1684 > 0) {
                field1677[var20] = var27;
                field1692[var20] = var30;
                field1691[var20] = var31;
            }
        }
        try {
            this.method2688(false, false, false, 0L);
        } catch (Exception var34) {
        }
    }

    @ObfuscatedName("dq.ca(IIIIIIIIJ)V")
    public void method2691(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field1668[0] = -1;
        if (this.field1651 != 1) {
            this.method2676();
        }
        this.method2727(arg0);
        int var11 = arg4 * arg7 - arg3 * arg5 >> 16;
        int var12 = arg1 * arg6 + arg2 * var11 >> 16;
        int var13 = this.field1676 * arg2 >> 16;
        int var14 = var12 + var13;
        if (var14 <= 50 || var12 >= 3500) {
            return;
        }
        int var15 = arg3 * arg7 + arg4 * arg5 >> 16;
        int var16 = (var15 - this.field1676) * class130.field1750;
        if (var16 / var14 >= Statics.field1760) {
            return;
        }
        int var17 = (this.field1676 + var15) * class130.field1750;
        if (var17 / var14 <= Statics.field1745) {
            return;
        }
        int var18 = arg2 * arg6 - arg1 * var11 >> 16;
        int var19 = this.field1676 * arg1 >> 16;
        int var20 = (var18 + var19) * class130.field1750;
        if (var20 / var14 <= Statics.field1759) {
            return;
        }
        int var21 = (this.field1860 * arg2 >> 16) + var19;
        int var22 = (var18 - var21) * class130.field1750;
        if (var22 / var14 >= Statics.field1762) {
            return;
        }
        int var23 = (this.field1860 * arg1 >> 16) + var13;
        boolean var24 = false;
        boolean var25 = false;
        if (var12 - var23 <= 50) {
            var25 = true;
        }
        boolean var26 = var25 || this.field1684 > 0;
        int var27 = class128.field1723;
        int var29 = class128.field1719;
        boolean var31 = class128.method84();
        boolean var32 = arg8 != 0L && !class128.method107(arg8);
        boolean var34 = false;
        if (var32 && var31) {
            boolean var35 = false;
            if (field1708) {
                var35 = class128.method283(this, arg5, arg6, arg7);
            } else {
                int var36 = var12 - var13;
                if (var36 <= 50) {
                    var36 = 50;
                }
                int var37;
                int var38;
                if (var15 > 0) {
                    var37 = var16 / var14;
                    var38 = var17 / var36;
                } else {
                    var38 = var17 / var14;
                    var37 = var16 / var36;
                }
                int var39;
                int var40;
                if (var18 > 0) {
                    var39 = var22 / var14;
                    var40 = var20 / var36;
                } else {
                    var40 = var20 / var14;
                    var39 = var22 / var36;
                }
                int var41 = var27 - Statics.field1755;
                int var42 = var29 - Statics.field1756;
                if (var41 > var37 && var41 < var38 && var42 > var39 && var42 < var40) {
                    var35 = true;
                }
            }
            if (var35) {
                if (this.field1673) {
                    class128.method2781(arg8);
                } else {
                    var34 = true;
                }
            }
        }
        int var43 = Statics.field1755;
        int var44 = Statics.field1756;
        int var45 = 0;
        int var46 = 0;
        if (arg0 != 0) {
            var45 = field1711[arg0];
            var46 = field1712[arg0];
        }
        for (int var47 = 0; var47 < this.field1697; var47++) {
            int var48 = this.field1652[var47];
            int var49 = this.field1716[var47];
            int var50 = this.field1688[var47];
            if (arg0 != 0) {
                int var51 = var45 * var50 + var46 * var48 >> 16;
                var50 = var46 * var50 - var45 * var48 >> 16;
                var48 = var51;
            }
            int var52 = arg5 + var48;
            int var53 = arg6 + var49;
            int var54 = arg7 + var50;
            int var55 = arg3 * var54 + arg4 * var52 >> 16;
            int var56 = arg4 * var54 - arg3 * var52 >> 16;
            int var58 = arg2 * var53 - arg1 * var56 >> 16;
            int var59 = arg1 * var53 + arg2 * var56 >> 16;
            field1714[var47] = var59 - var12;
            if (var59 >= 50) {
                field1661[var47] = class130.field1750 * var55 / var59 + var43;
                field1689[var47] = class130.field1750 * var58 / var59 + var44;
            } else {
                field1661[var47] = -5000;
                var24 = true;
            }
            if (var26) {
                field1677[var47] = var55;
                field1692[var47] = var58;
                field1691[var47] = var59;
            }
        }
        try {
            this.method2688(var24, var34, this.field1673, arg8);
        } catch (Exception var62) {
        }
    }

    @ObfuscatedName("dq.aa(ZZZJ)V")
    public final void method2688(boolean arg0, boolean arg1, boolean arg2, long arg3) {
        if (this.field1713 >= 1600) {
            return;
        }
        for (int var6 = 0; var6 < this.field1713; var6++) {
            field1668[var6] = 0;
        }
        int var7 = arg2 ? 20 : 5;
        for (int var8 = 0; var8 < this.field1655; var8++) {
            if (this.field1672[var8] != -2) {
                int var9 = this.field1656[var8];
                int var10 = this.field1657[var8];
                int var11 = this.field1658[var8];
                int var12 = field1661[var9];
                int var13 = field1661[var10];
                int var14 = field1661[var11];
                if (arg0 && (var12 == -5000 || var13 == -5000 || var14 == -5000)) {
                    int var15 = field1677[var9];
                    int var16 = field1677[var10];
                    int var17 = field1677[var11];
                    int var18 = field1692[var9];
                    int var19 = field1692[var10];
                    int var20 = field1692[var11];
                    int var21 = field1691[var9];
                    int var22 = field1691[var10];
                    int var23 = field1691[var11];
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
                        int var33 = (field1714[var9] + field1714[var10] + field1714[var11]) / 3 + this.field1678;
                        field1696[var33][field1668[var33]++] = var8;
                    }
                } else {
                    if (arg1 && class128.method559(field1689[var9], field1689[var10], field1689[var11], var12, var13, var14, var7)) {
                        class128.method2781(arg3);
                        arg1 = false;
                    }
                    if ((field1689[var11] - field1689[var10]) * (var12 - var13) - (field1689[var9] - field1689[var10]) * (var14 - var13) > 0) {
                        field1687[var8] = false;
                        if (var12 >= 0 && var13 >= 0 && var14 >= 0 && var12 <= Statics.field1757 && var13 <= Statics.field1757 && var14 <= Statics.field1757) {
                            field1686[var8] = false;
                        } else {
                            field1686[var8] = true;
                        }
                        int var34 = (field1714[var9] + field1714[var10] + field1714[var11]) / 3 + this.field1678;
                        field1696[var34][field1668[var34]++] = var8;
                    }
                }
            }
        }
        if (this.field1662 == null) {
            for (int var35 = this.field1713 - 1; var35 >= 0; var35--) {
                int var36 = field1668[var35];
                if (var36 > 0) {
                    int[] var37 = field1696[var35];
                    for (int var38 = 0; var38 < var36; var38++) {
                        this.method2686(var37[var38]);
                    }
                }
            }
            return;
        }
        for (int var39 = 0; var39 < 12; var39++) {
            field1690[var39] = 0;
            field1703[var39] = 0;
        }
        for (int var40 = this.field1713 - 1; var40 >= 0; var40--) {
            int var41 = field1668[var40];
            if (var41 > 0) {
                int[] var42 = field1696[var40];
                for (int var43 = 0; var43 < var41; var43++) {
                    int var44 = var42[var43];
                    byte var45 = this.field1662[var44];
                    int var46 = field1690[var45]++;
                    field1698[var45][var46] = var44;
                    if (var45 < 10) {
                        field1703[var45] += var40;
                    } else if (var45 == 10) {
                        field1699[var46] = var40;
                    } else {
                        field1700[var46] = var40;
                    }
                }
            }
        }
        int var47 = 0;
        if (field1690[1] > 0 || field1690[2] > 0) {
            var47 = (field1703[1] + field1703[2]) / (field1690[1] + field1690[2]);
        }
        int var48 = 0;
        if (field1690[3] > 0 || field1690[4] > 0) {
            var48 = (field1703[3] + field1703[4]) / (field1690[3] + field1690[4]);
        }
        int var49 = 0;
        if (field1690[6] > 0 || field1690[8] > 0) {
            var49 = (field1703[6] + field1703[8]) / (field1690[6] + field1690[8]);
        }
        int var50 = 0;
        int var51 = field1690[10];
        int[] var52 = field1698[10];
        int[] var53 = field1699;
        if (var50 == var51) {
            var50 = 0;
            var51 = field1690[11];
            var52 = field1698[11];
            var53 = field1700;
        }
        int var54;
        if (var50 < var51) {
            var54 = var53[var50];
        } else {
            var54 = -1000;
        }
        for (int var55 = 0; var55 < 10; var55++) {
            while (var55 == 0 && var54 > var47) {
                this.method2686(var52[var50++]);
                if (var50 == var51 && field1698[11] != var52) {
                    var50 = 0;
                    var51 = field1690[11];
                    var52 = field1698[11];
                    var53 = field1700;
                }
                if (var50 < var51) {
                    var54 = var53[var50];
                } else {
                    var54 = -1000;
                }
            }
            while (var55 == 3 && var54 > var48) {
                this.method2686(var52[var50++]);
                if (var50 == var51 && field1698[11] != var52) {
                    var50 = 0;
                    var51 = field1690[11];
                    var52 = field1698[11];
                    var53 = field1700;
                }
                if (var50 < var51) {
                    var54 = var53[var50];
                } else {
                    var54 = -1000;
                }
            }
            while (var55 == 5 && var54 > var49) {
                this.method2686(var52[var50++]);
                if (var50 == var51 && field1698[11] != var52) {
                    var50 = 0;
                    var51 = field1690[11];
                    var52 = field1698[11];
                    var53 = field1700;
                }
                if (var50 < var51) {
                    var54 = var53[var50];
                } else {
                    var54 = -1000;
                }
            }
            int var56 = field1690[var55];
            int[] var57 = field1698[var55];
            for (int var58 = 0; var58 < var56; var58++) {
                this.method2686(var57[var58]);
            }
        }
        while (var54 != -1000) {
            this.method2686(var52[var50++]);
            if (var50 == var51 && field1698[11] != var52) {
                var50 = 0;
                var52 = field1698[11];
                var51 = field1690[11];
                var53 = field1700;
            }
            if (var50 < var51) {
                var54 = var53[var50];
            } else {
                var54 = -1000;
            }
        }
    }

    @ObfuscatedName("dq.ai(I)V")
    public final void method2686(int arg0) {
        if (field1687[arg0]) {
            this.method2726(arg0);
            return;
        }
        int var2 = this.field1656[arg0];
        int var3 = this.field1657[arg0];
        int var4 = this.field1658[arg0];
        class130.field1764 = field1686[arg0];
        if (this.field1671 == null) {
            class130.field1747 = 0;
        } else {
            class130.field1747 = this.field1671[arg0] & 0xFF;
        }
        if (this.field1665 != null && this.field1665[arg0] != -1) {
            int var6;
            int var7;
            int var8;
            if (this.field1705 == null || this.field1705[arg0] == -1) {
                var6 = var2;
                var7 = var3;
                var8 = var4;
            } else {
                int var5 = this.field1705[arg0] & 0xFF;
                var6 = this.field1709[var5];
                var7 = this.field1669[var5];
                var8 = this.field1670[var5];
            }
            if (this.field1672[arg0] == -1) {
                class130.method2845(field1689[var2], field1689[var3], field1689[var4], field1661[var2], field1661[var3], field1661[var4], this.field1659[arg0], this.field1659[arg0], this.field1659[arg0], field1677[var6], field1677[var7], field1677[var8], field1692[var6], field1692[var7], field1692[var8], field1691[var6], field1691[var7], field1691[var8], this.field1665[arg0]);
            } else {
                class130.method2845(field1689[var2], field1689[var3], field1689[var4], field1661[var2], field1661[var3], field1661[var4], this.field1659[arg0], this.field1660[arg0], this.field1672[arg0], field1677[var6], field1677[var7], field1677[var8], field1692[var6], field1692[var7], field1692[var8], field1691[var6], field1691[var7], field1691[var8], this.field1665[arg0]);
            }
        } else if (this.field1672[arg0] == -1) {
            class130.method2795(field1689[var2], field1689[var3], field1689[var4], field1661[var2], field1661[var3], field1661[var4], field1695[this.field1659[arg0]]);
        } else {
            class130.method2815(field1689[var2], field1689[var3], field1689[var4], field1661[var2], field1661[var3], field1661[var4], this.field1659[arg0], this.field1660[arg0], this.field1672[arg0]);
        }
    }

    @ObfuscatedName("dq.ag(I)V")
    public final void method2726(int arg0) {
        int var2 = Statics.field1755;
        int var3 = Statics.field1756;
        int var4 = 0;
        int var5 = this.field1656[arg0];
        int var6 = this.field1657[arg0];
        int var7 = this.field1658[arg0];
        int var8 = field1691[var5];
        int var9 = field1691[var6];
        int var10 = field1691[var7];
        if (this.field1671 == null) {
            class130.field1747 = 0;
        } else {
            class130.field1747 = this.field1671[arg0] & 0xFF;
        }
        if (var8 >= 50) {
            field1702[var4] = field1661[var5];
            field1653[var4] = field1689[var5];
            field1667[var4++] = this.field1659[arg0];
        } else {
            int var11 = field1677[var5];
            int var12 = field1692[var5];
            int var13 = this.field1659[arg0];
            if (var10 >= 50) {
                int var14 = (50 - var8) * field1701[var10 - var8];
                field1702[var4] = (((field1677[var7] - var11) * var14 >> 16) + var11) * class130.field1750 / 50 + var2;
                field1653[var4] = (((field1692[var7] - var12) * var14 >> 16) + var12) * class130.field1750 / 50 + var3;
                field1667[var4++] = ((this.field1672[arg0] - var13) * var14 >> 16) + var13;
            }
            if (var9 >= 50) {
                int var15 = (50 - var8) * field1701[var9 - var8];
                field1702[var4] = (((field1677[var6] - var11) * var15 >> 16) + var11) * class130.field1750 / 50 + var2;
                field1653[var4] = (((field1692[var6] - var12) * var15 >> 16) + var12) * class130.field1750 / 50 + var3;
                field1667[var4++] = ((this.field1660[arg0] - var13) * var15 >> 16) + var13;
            }
        }
        if (var9 >= 50) {
            field1702[var4] = field1661[var6];
            field1653[var4] = field1689[var6];
            field1667[var4++] = this.field1660[arg0];
        } else {
            int var16 = field1677[var6];
            int var17 = field1692[var6];
            int var18 = this.field1660[arg0];
            if (var8 >= 50) {
                int var19 = (50 - var9) * field1701[var8 - var9];
                field1702[var4] = (((field1677[var5] - var16) * var19 >> 16) + var16) * class130.field1750 / 50 + var2;
                field1653[var4] = (((field1692[var5] - var17) * var19 >> 16) + var17) * class130.field1750 / 50 + var3;
                field1667[var4++] = ((this.field1659[arg0] - var18) * var19 >> 16) + var18;
            }
            if (var10 >= 50) {
                int var20 = (50 - var9) * field1701[var10 - var9];
                field1702[var4] = (((field1677[var7] - var16) * var20 >> 16) + var16) * class130.field1750 / 50 + var2;
                field1653[var4] = (((field1692[var7] - var17) * var20 >> 16) + var17) * class130.field1750 / 50 + var3;
                field1667[var4++] = ((this.field1672[arg0] - var18) * var20 >> 16) + var18;
            }
        }
        if (var10 >= 50) {
            field1702[var4] = field1661[var7];
            field1653[var4] = field1689[var7];
            field1667[var4++] = this.field1672[arg0];
        } else {
            int var21 = field1677[var7];
            int var22 = field1692[var7];
            int var23 = this.field1672[arg0];
            if (var9 >= 50) {
                int var24 = (50 - var10) * field1701[var9 - var10];
                field1702[var4] = (((field1677[var6] - var21) * var24 >> 16) + var21) * class130.field1750 / 50 + var2;
                field1653[var4] = (((field1692[var6] - var22) * var24 >> 16) + var22) * class130.field1750 / 50 + var3;
                field1667[var4++] = ((this.field1660[arg0] - var23) * var24 >> 16) + var23;
            }
            if (var8 >= 50) {
                int var25 = (50 - var10) * field1701[var8 - var10];
                field1702[var4] = (((field1677[var5] - var21) * var25 >> 16) + var21) * class130.field1750 / 50 + var2;
                field1653[var4] = (((field1692[var5] - var22) * var25 >> 16) + var22) * class130.field1750 / 50 + var3;
                field1667[var4++] = ((this.field1659[arg0] - var23) * var25 >> 16) + var23;
            }
        }
        int var26 = field1702[0];
        int var27 = field1702[1];
        int var28 = field1702[2];
        int var29 = field1653[0];
        int var30 = field1653[1];
        int var31 = field1653[2];
        class130.field1764 = false;
        if (var4 == 3) {
            if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1757 || var27 > Statics.field1757 || var28 > Statics.field1757) {
                class130.field1764 = true;
            }
            if (this.field1665 != null && this.field1665[arg0] != -1) {
                int var33;
                int var34;
                int var35;
                if (this.field1705 == null || this.field1705[arg0] == -1) {
                    var33 = var5;
                    var34 = var6;
                    var35 = var7;
                } else {
                    int var32 = this.field1705[arg0] & 0xFF;
                    var33 = this.field1709[var32];
                    var34 = this.field1669[var32];
                    var35 = this.field1670[var32];
                }
                if (this.field1672[arg0] == -1) {
                    class130.method2845(var29, var30, var31, var26, var27, var28, this.field1659[arg0], this.field1659[arg0], this.field1659[arg0], field1677[var33], field1677[var34], field1677[var35], field1692[var33], field1692[var34], field1692[var35], field1691[var33], field1691[var34], field1691[var35], this.field1665[arg0]);
                } else {
                    class130.method2845(var29, var30, var31, var26, var27, var28, field1667[0], field1667[1], field1667[2], field1677[var33], field1677[var34], field1677[var35], field1692[var33], field1692[var34], field1692[var35], field1691[var33], field1691[var34], field1691[var35], this.field1665[arg0]);
                }
            } else if (this.field1672[arg0] == -1) {
                class130.method2795(var29, var30, var31, var26, var27, var28, field1695[this.field1659[arg0]]);
            } else {
                class130.method2815(var29, var30, var31, var26, var27, var28, field1667[0], field1667[1], field1667[2]);
            }
        }
        if (var4 != 4) {
            return;
        }
        if (var26 < 0 || var27 < 0 || var28 < 0 || var26 > Statics.field1757 || var27 > Statics.field1757 || var28 > Statics.field1757 || field1702[3] < 0 || field1702[3] > Statics.field1757) {
            class130.field1764 = true;
        }
        if (this.field1665 != null && this.field1665[arg0] != -1) {
            int var37;
            int var38;
            int var39;
            if (this.field1705 == null || this.field1705[arg0] == -1) {
                var37 = var5;
                var38 = var6;
                var39 = var7;
            } else {
                int var36 = this.field1705[arg0] & 0xFF;
                var37 = this.field1709[var36];
                var38 = this.field1669[var36];
                var39 = this.field1670[var36];
            }
            short var40 = this.field1665[arg0];
            if (this.field1672[arg0] == -1) {
                class130.method2845(var29, var30, var31, var26, var27, var28, this.field1659[arg0], this.field1659[arg0], this.field1659[arg0], field1677[var37], field1677[var38], field1677[var39], field1692[var37], field1692[var38], field1692[var39], field1691[var37], field1691[var38], field1691[var39], var40);
                class130.method2845(var29, var31, field1653[3], var26, var28, field1702[3], this.field1659[arg0], this.field1659[arg0], this.field1659[arg0], field1677[var37], field1677[var38], field1677[var39], field1692[var37], field1692[var38], field1692[var39], field1691[var37], field1691[var38], field1691[var39], var40);
            } else {
                class130.method2845(var29, var30, var31, var26, var27, var28, field1667[0], field1667[1], field1667[2], field1677[var37], field1677[var38], field1677[var39], field1692[var37], field1692[var38], field1692[var39], field1691[var37], field1691[var38], field1691[var39], var40);
                class130.method2845(var29, var31, field1653[3], var26, var28, field1702[3], field1667[0], field1667[2], field1667[3], field1677[var37], field1677[var38], field1677[var39], field1692[var37], field1692[var38], field1692[var39], field1691[var37], field1691[var38], field1691[var39], var40);
            }
        } else if (this.field1672[arg0] == -1) {
            int var41 = field1695[this.field1659[arg0]];
            class130.method2795(var29, var30, var31, var26, var27, var28, var41);
            class130.method2795(var29, var31, field1653[3], var26, var28, field1702[3], var41);
        } else {
            class130.method2815(var29, var30, var31, var26, var27, var28, field1667[0], field1667[1], field1667[2]);
            class130.method2815(var29, var31, field1653[3], var26, var28, field1702[3], field1667[0], field1667[2], field1667[3]);
        }
    }
}
