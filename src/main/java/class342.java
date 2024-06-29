import java.awt.Canvas;
import java.awt.Graphics;
import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class342 extends class405 {

    @OriginalMember(owner = "client!pq", name = "q", descriptor = "Z")
    private boolean field4912 = false;

    @OriginalMember(owner = "client!pq", name = "G", descriptor = "I")
    private int field4928 = 0;

    @OriginalMember(owner = "client!pq", name = "I", descriptor = "I")
    public int field4930 = 0;

    @OriginalMember(owner = "client!pq", name = "E", descriptor = "I")
    public int field4926 = 0;

    @OriginalMember(owner = "client!pq", name = "o", descriptor = "Z")
    private boolean field4910 = false;

    @OriginalMember(owner = "client!pq", name = "v", descriptor = "I")
    public int field4917 = 3500;

    @OriginalMember(owner = "client!pq", name = "R", descriptor = "I")
    public int field4939 = 0;

    @OriginalMember(owner = "client!pq", name = "z", descriptor = "I")
    public int field4921 = 0;

    @OriginalMember(owner = "client!pq", name = "w", descriptor = "I")
    public int field4918 = 75518;

    @OriginalMember(owner = "client!pq", name = "O", descriptor = "Z")
    private boolean field4936 = false;

    @OriginalMember(owner = "client!pq", name = "T", descriptor = "I")
    private int field4941 = 3500;

    @OriginalMember(owner = "client!pq", name = "K", descriptor = "I")
    public int field4932 = 78642;

    @OriginalMember(owner = "client!pq", name = "N", descriptor = "I")
    public int field4935 = 512;

    @OriginalMember(owner = "client!pq", name = "J", descriptor = "I")
    public int field4931 = 45823;

    @OriginalMember(owner = "client!pq", name = "X", descriptor = "I")
    private int field4944 = 0;

    @OriginalMember(owner = "client!pq", name = "S", descriptor = "I")
    public int field4940 = 50;

    @OriginalMember(owner = "client!pq", name = "cb", descriptor = "Z")
    public boolean field4949 = false;

    @OriginalMember(owner = "client!pq", name = "Z", descriptor = "I")
    public int field4946 = 0;

    @OriginalMember(owner = "client!pq", name = "hb", descriptor = "I")
    public int field4954 = 0;

    @OriginalMember(owner = "client!pq", name = "eb", descriptor = "I")
    public int field4951 = 0;

    @OriginalMember(owner = "client!pq", name = "db", descriptor = "I")
    public int field4950 = 512;

    @OriginalMember(owner = "client!pq", name = "P", descriptor = "I")
    private int field4937 = 0;

    @OriginalMember(owner = "client!pq", name = "jb", descriptor = "I")
    public int field4956 = this.field4941 - 255;

    @OriginalMember(owner = "client!pq", name = "W", descriptor = "Lcr;")
    private class189 field4943 = new class189(16);

    @OriginalMember(owner = "client!pq", name = "p", descriptor = "Ljava/awt/Canvas;")
    private Canvas field4911;

    @OriginalMember(owner = "client!pq", name = "Y", descriptor = "Lfh;")
    public class210 field4945;

    @OriginalMember(owner = "client!pq", name = "x", descriptor = "Lwj;")
    private class9 field4919;

    @OriginalMember(owner = "client!pq", name = "Q", descriptor = "[I")
    public int[] field4938;

    @OriginalMember(owner = "client!pq", name = "A", descriptor = "I")
    public int field4922;

    @OriginalMember(owner = "client!pq", name = "ib", descriptor = "I")
    private int field4955;

    @OriginalMember(owner = "client!pq", name = "u", descriptor = "F")
    private float field4916;

    @OriginalMember(owner = "client!pq", name = "B", descriptor = "F")
    private float field4923;

    @OriginalMember(owner = "client!pq", name = "r", descriptor = "I")
    public int field4913;

    @OriginalMember(owner = "client!pq", name = "y", descriptor = "I")
    public int field4920;

    @OriginalMember(owner = "client!pq", name = "C", descriptor = "I")
    public int field4924;

    @OriginalMember(owner = "client!pq", name = "D", descriptor = "I")
    public int field4925;

    @OriginalMember(owner = "client!pq", name = "H", descriptor = "I")
    public int field4929;

    @OriginalMember(owner = "client!pq", name = "L", descriptor = "I")
    private int field4933;

    @OriginalMember(owner = "client!pq", name = "M", descriptor = "I")
    public int field4934;

    @OriginalMember(owner = "client!pq", name = "ab", descriptor = "I")
    public int field4947;

    @OriginalMember(owner = "client!pq", name = "bb", descriptor = "I")
    public int field4948;

    @OriginalMember(owner = "client!pq", name = "fb", descriptor = "I")
    public int field4952;

    @OriginalMember(owner = "client!pq", name = "gb", descriptor = "I")
    public int field4953;

    @OriginalMember(owner = "client!pq", name = "F", descriptor = "Lc;")
    public class158 field4927;

    @OriginalMember(owner = "client!pq", name = "kb", descriptor = "Lu;")
    private class185 field4957;

    @OriginalMember(owner = "client!pq", name = "s", descriptor = "Lcr;")
    private class189 field4914;

    @OriginalMember(owner = "client!pq", name = "V", descriptor = "Z")
    public boolean field4942;

    @OriginalMember(owner = "client!pq", name = "t", descriptor = "[Lue;")
    private class131[] field4915;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "([IIIII)Lcq;")
    public final class67 method1624(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        boolean var6 = false;
        int var7 = arg1;
        for (int var8 = 0; var8 < arg4; ++var8) {
            for (int var9 = 0; var9 < arg3; ++var9) {
                int var10 = arg0[var7++] >>> 24;
                if (var10 != 0 && var10 != 255) {
                    var6 = true;
                    return var6 ? new class383(this, arg0, arg1, arg2, arg3, arg4) : new class95(this, arg0, arg1, arg2, arg3, arg4);
                }
            }
        }
        return var6 ? new class383(this, arg0, arg1, arg2, arg3, arg4) : new class95(this, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!pq", name = "i", descriptor = "(I)[I")
    private final int[] method2226(int arg0) {
        class189 var2 = this.field4914;
        class85 var3;
        synchronized (this.field4914) {
            var3 = (class85) this.field4914.method1137((long) arg0, 2108653711);
            if (var3 == null) {
                if (!this.field4945.method184(arg0, 14556)) {
                    return null;
                }
                class444 var5 = this.field4945.method186(arg0, -9590);
                int var6 = !var5.field6509 && !this.field4910 ? 128 : 64;
                var3 = new class85(arg0, var6, this.field4945.method185(true, -118, var6, var6, 0.7F, arg0), var5.field6501);
                this.field4914.method1144((long) arg0, var3, -3480);
            }
        }
        var3.field1212 = true;
        return var3.method608();
    }

    @OriginalMember(owner = "client!pq", name = "f", descriptor = "()Z")
    public final boolean method1728() {
        return false;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(III)V")
    public final void method1746(int arg0, int arg1, int arg2) {
        this.field4928 = this.field4921;
        this.field4930 = arg0;
        this.field4921 = arg1;
        this.field4954 = arg2;
        this.field4949 = true;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ILud;II)V")
    public final void method1784(int arg0, class2 arg1, int arg2, int arg3) {
        class188 var5 = (class188) arg1;
        int[] var6 = var5.field2523;
        int[] var7 = var5.field2529;
        int var8;
        if (this.field4939 < var6.length + arg3) {
            var8 = this.field4939 - arg3;
        } else {
            var8 = var6.length;
        }
        int var9;
        if (this.field4951 > arg3) {
            var9 = this.field4951 - arg3;
            arg3 = this.field4951;
        } else {
            var9 = 0;
        }
        if (var8 - var9 > 0) {
            int var10 = this.field4922 * arg3;
            for (int var11 = var9; var11 < var8; ++var11) {
                int var12 = var6[var11] + arg2;
                int var13 = var7[var11];
                if (this.field4926 > var12) {
                    var13 -= this.field4926 - var12;
                    var12 = this.field4926;
                }
                if (this.field4946 < var12 + var13) {
                    var13 = this.field4946 - var12;
                }
                int var14 = var10 + var12;
                for (int var15 = -var13; var15 < 0; ++var15) {
                    this.field4938[var14++] = arg0;
                }
                var10 += this.field4922;
            }
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Leo;III)V")
    public final void method2227(class267 arg0, int arg1, int arg2, int arg3) {
        int var5 = arg3 >> 1;
        int var6 = arg0.field3852;
        if (var6 == -1) {
            this.method1741(arg1, arg2, var5, arg0.field3853, 1);
        } else {
            if (this.field4957 == null || (long) var6 != this.field4957.field640) {
                this.field4957 = (class185) this.field4943.method1137((long) var6, 2108653711);
            }
            if (this.field4957 == null) {
                int[] var7 = this.method2226(var6);
                if (var7 == null) {
                    return;
                }
                this.field4957 = new class185();
                this.field4957.field2506 = this.method2230(var6);
                int var8 = this.field4957.field2506 ? 64 : 128;
                this.field4957.field2500 = this.method1624(var7, 0, var8, var8, var8);
                this.field4943.method1144((long) var6, this.field4957, -3480);
            }
            if (this.field4957.field2506) {
                var5 <<= 1;
                arg3 <<= 1;
            }
            this.field4957.field2500.method402(arg1 - var5, arg2 - var5, arg3, arg3, 1, arg0.field3853, 1);
        }
    }

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "(IIIIII)V")
    public final void method1632(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < this.field4926) {
            arg2 -= this.field4926 - arg0;
            arg0 = this.field4926;
        }
        if (arg1 < this.field4951) {
            arg3 -= this.field4951 - arg1;
            arg1 = this.field4951;
        }
        if (arg0 + arg2 > this.field4946) {
            arg2 = this.field4946 - arg0;
        }
        if (arg1 + arg3 > this.field4939) {
            arg3 = this.field4939 - arg1;
        }
        if (arg2 > 0 && arg3 > 0 && arg0 <= this.field4946 && arg1 <= this.field4939) {
            int var7 = this.field4922 - arg2;
            int var8 = this.field4922 * arg1 + arg0;
            int var9 = arg4 >>> 24;
            if (arg5 == 0 || arg5 == 1 && var9 == 255) {
                int var22 = arg2 >> 3;
                int var23 = arg2 & 7;
                int var24 = var8 - 1;
                for (int var25 = -arg3; var25 < 0; ++var25) {
                    if (var22 > 0) {
                        int var26 = var22;
                        do {
                            ++var24;
                            this.field4938[var24] = arg4;
                            ++var24;
                            this.field4938[var24] = arg4;
                            ++var24;
                            this.field4938[var24] = arg4;
                            ++var24;
                            this.field4938[var24] = arg4;
                            ++var24;
                            this.field4938[var24] = arg4;
                            ++var24;
                            this.field4938[var24] = arg4;
                            ++var24;
                            this.field4938[var24] = arg4;
                            ++var24;
                            this.field4938[var24] = arg4;
                            --var26;
                        } while (var26 > 0);
                    }
                    if (var23 > 0) {
                        int var27 = var23;
                        do {
                            ++var24;
                            this.field4938[var24] = arg4;
                            --var27;
                        } while (var27 > 0);
                    }
                    var24 += var7;
                }
            } else if (arg5 == 1) {
                int var10 = (var9 << 24) + ((arg4 & 16711935) * var9 >> 8 & 16711935) + ((arg4 & 65280) * var9 >> 8 & 65280);
                int var11 = 256 - var9;
                for (int var12 = 0; var12 < arg3; ++var12) {
                    for (int var13 = -arg2; var13 < 0; ++var13) {
                        int var14 = this.field4938[var8];
                        int var15 = ((var14 & 16711935) * var11 >> 8 & 16711935) + ((var14 & 65280) * var11 >> 8 & 65280);
                        this.field4938[var8++] = var10 + var15;
                    }
                    var8 += var7;
                }
            } else if (arg5 != 2) {
                throw new IllegalArgumentException();
            } else {
                for (int var16 = 0; var16 < arg3; ++var16) {
                    for (int var17 = -arg2; var17 < 0; ++var17) {
                        int var18 = this.field4938[var8];
                        int var19 = arg4 + var18;
                        int var20 = (arg4 & 16711935) + (var18 & 16711935);
                        int var21 = (var19 - var20 & 65536) + (var20 & 16777472);
                        this.field4938[var8++] = var19 - var21 | var21 - (var21 >>> 8);
                    }
                    var8 += var7;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "(II)V")
    public final void method1764(int arg0, int arg1) {
        this.field4940 = arg0;
        this.field4941 = arg1;
        this.field4956 = this.field4941 - 255;
        this.method2229();
    }

    @OriginalMember(owner = "client!pq", name = "k", descriptor = "()V")
    public final void method1757() {
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(F)V")
    public final void method1756(float arg0) {
        this.field4918 = (int) (arg0 * 65535.0F);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "()V")
    private final void method2228() {
        this.field4947 = this.field4926 - this.field4929;
        this.field4925 = this.field4946 - this.field4929;
        this.field4948 = this.field4951 - this.field4920;
        this.field4953 = this.field4939 - this.field4920;
        for (int var1 = 0; var1 < this.field4924; ++var1) {
            class402 var5 = this.field4915[var1].field1802;
            var5.field5989 = this.field4929 - this.field4926;
            var5.field5983 = this.field4920 - this.field4951;
            var5.field5984 = this.field4946 - this.field4926;
            var5.field5993 = this.field4939 - this.field4951;
        }
        int var2 = this.field4951 * this.field4922 + this.field4926;
        for (int var3 = this.field4951; var3 < this.field4939; ++var3) {
            for (int var4 = 0; var4 < this.field4924; ++var4) {
                this.field4915[var4].field1802.field5990[var3 - this.field4951] = var2;
            }
            var2 += this.field4922;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(II)I")
    public final int method1620(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIIIIILud;II)V")
    public final void method1776(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class2 arg6, int arg7, int arg8) {
        class188 var10 = (class188) arg6;
        int[] var11 = var10.field2523;
        int[] var12 = var10.field2529;
        int var13 = this.field4951 > arg8 ? this.field4951 : arg8;
        int var14 = this.field4939 < var11.length + arg8 ? this.field4939 : var11.length + arg8;
        int var15 = arg2 - arg0;
        int var16 = arg3 - arg1;
        if (var15 + var16 < 0) {
            arg0 += var15;
            var15 = -var15;
            arg1 += var16;
            var16 = -var16;
        }
        if (var15 > var16) {
            int var17 = arg1 << 16;
            int var18 = var17 + 32768;
            int var19 = var16 << 16;
            int var20 = (int) Math.floor((double) var19 / (double) var15 + 0.5D);
            int var21 = arg0 + var15;
            if (arg0 < this.field4926) {
                var18 += (this.field4926 - arg0) * var20;
                arg0 = this.field4926;
            }
            if (var21 >= this.field4946) {
                var21 = this.field4946 - 1;
            }
            int var22 = arg4 >>> 24;
            if (arg5 != 0 && (arg5 != 1 || var22 != 255)) {
                if (arg5 == 1) {
                    int var23 = (var22 << 24) + ((arg4 & 16711935) * var22 >> 8 & 16711935) + ((arg4 & 65280) * var22 >> 8 & 65280);
                    int var24 = 256 - var22;
                    while (arg0 <= var21) {
                        int var25 = var18 >> 16;
                        int var26 = var25 - arg8;
                        if (var25 >= var13 && var25 < var14) {
                            int var27 = var11[var26] + arg7;
                            if (arg0 >= var27 && arg0 < var12[var26] + var27) {
                                int var28 = this.field4922 * var25 + arg0;
                                int var29 = this.field4938[var28];
                                int var30 = ((var29 & 16711935) * var24 >> 8 & 16711935) + ((var29 & 65280) * var24 >> 8 & 65280);
                                this.field4938[var28] = var23 + var30;
                            }
                        }
                        var18 += var20;
                        ++arg0;
                    }
                } else if (arg5 == 2) {
                    while (arg0 <= var21) {
                        int var31 = var18 >> 16;
                        int var32 = var31 - arg8;
                        if (var31 >= var13 && var31 < var14) {
                            int var33 = var11[var32] + arg7;
                            if (arg0 >= var33 && arg0 < var12[var32] + var33) {
                                int var34 = this.field4922 * var31 + arg0;
                                int var35 = this.field4938[var34];
                                int var36 = arg4 + var35;
                                int var37 = (arg4 & 16711935) + (var35 & 16711935);
                                int var38 = (var36 - var37 & 65536) + (var37 & 16777472);
                                this.field4938[var34] = var36 - var38 | var38 - (var38 >>> 8);
                            }
                        }
                        var18 += var20;
                        ++arg0;
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            } else {
                while (arg0 <= var21) {
                    int var39 = var18 >> 16;
                    int var40 = var39 - arg8;
                    if (var39 >= var13 && var39 < var14) {
                        int var41 = var11[var40] + arg7;
                        if (arg0 >= var41 && arg0 < var12[var40] + var41) {
                            this.field4938[this.field4922 * var39 + arg0] = arg4;
                        }
                    }
                    var18 += var20;
                    ++arg0;
                }
            }
        } else {
            int var42 = arg0 << 16;
            int var43 = var42 + 32768;
            int var44 = var15 << 16;
            int var45 = (int) Math.floor((double) var44 / (double) var16 + 0.5D);
            int var46 = arg1 + var16;
            if (arg1 < var13) {
                var43 += (var13 - arg1) * var45;
                arg1 = var13;
            }
            if (var46 >= var14) {
                var46 = var14 - 1;
            }
            int var47 = arg4 >>> 24;
            if (arg5 == 0 || arg5 == 1 && var47 == 255) {
                while (arg1 <= var46) {
                    int var64 = var43 >> 16;
                    int var65 = arg1 - arg8;
                    int var66 = var11[var65] + arg7;
                    if (var64 >= this.field4926 && var64 < this.field4946 && var64 >= var66 && var64 < var12[var65] + var66) {
                        this.field4938[this.field4922 * arg1 + var64] = arg4;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 1) {
                int var48 = (var47 << 24) + ((arg4 & 16711935) * var47 >> 8 & 16711935) + ((arg4 & 65280) * var47 >> 8 & 65280);
                int var49 = 256 - var47;
                while (arg1 <= var46) {
                    int var50 = var43 >> 16;
                    int var51 = arg1 - arg8;
                    int var52 = var11[var51] + arg7;
                    if (var50 >= this.field4926 && var50 < this.field4946 && var50 >= var52 && var50 < var12[var51] + var52) {
                        int var53 = this.field4922 * arg1 + var50;
                        int var54 = this.field4938[var53];
                        int var55 = ((var54 & 16711935) * var49 >> 8 & 16711935) + ((var54 & 65280) * var49 >> 8 & 65280);
                        this.field4938[this.field4922 * arg1 + var50] = var48 + var55;
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else if (arg5 == 2) {
                while (arg1 <= var46) {
                    int var56 = var43 >> 16;
                    int var57 = arg1 - arg8;
                    int var58 = var11[var57] + arg7;
                    if (var56 >= this.field4926 && var56 < this.field4946 && var56 >= var58 && var56 < var12[var57] + var58) {
                        int var59 = this.field4922 * arg1 + var56;
                        int var60 = this.field4938[var59];
                        int var61 = arg4 + var60;
                        int var62 = (arg4 & 16711935) + (var60 & 16711935);
                        int var63 = (var61 - var62 & 65536) + (var62 & 16777472);
                        this.field4938[var59] = var61 - var63 | var63 - (var63 >>> 8);
                    }
                    var43 += var45;
                    ++arg1;
                }
            } else {
                throw new IllegalArgumentException();
            }
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(II[[I[[IIII)Lck;")
    public final class351 method1688(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        return new class116(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!pq", name = "q", descriptor = "()V")
    public final void method1748() {
        if (this.field4911 != null && this.field4919 != null) {
            try {
                Graphics var1 = this.field4911.getGraphics();
                this.field4919.method73(-1, 0, 0, var1);
            } catch (Exception var2) {
                this.field4911.repaint();
            }
        } else {
            throw new IllegalStateException("Can't flip an offscreen toolkit");
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIIIII[BII)V")
    public final void method1623(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg2 > 0 && arg3 > 0) {
            int var10 = 0;
            int var11 = 0;
            int var12 = (arg7 << 16) / arg2;
            int var13 = (arg6.length / arg7 << 16) / arg3;
            int var14 = this.field4922 * arg1 + arg0;
            int var15 = this.field4922 - arg2;
            if (arg1 + arg3 > this.field4939) {
                arg3 -= arg1 + arg3 - this.field4939;
            }
            if (arg1 < this.field4951) {
                int var16 = this.field4951 - arg1;
                arg3 -= var16;
                var14 += this.field4922 * var16;
                var11 += var13 * var16;
            }
            if (arg0 + arg2 > this.field4946) {
                int var17 = arg0 + arg2 - this.field4946;
                arg2 -= var17;
                var15 += var17;
            }
            if (arg0 < this.field4926) {
                int var18 = this.field4926 - arg0;
                arg2 -= var18;
                var14 += var18;
                var10 += var12 * var18;
                var15 += var18;
            }
            int var19 = arg4 >>> 24;
            int var20 = arg5 >>> 24;
            if (arg8 != 0 && (arg8 != 1 || var19 != 255 || var20 != 255)) {
                if (arg8 == 1) {
                    int var21 = var10;
                    for (int var22 = -arg3; var22 < 0; ++var22) {
                        int var23 = (var11 >> 16) * arg7;
                        for (int var24 = -arg2; var24 < 0; ++var24) {
                            int var25 = arg4;
                            if (arg6[(var10 >> 16) + var23] != 0) {
                                var25 = arg5;
                            }
                            int var26 = var25 >>> 24;
                            int var27 = 255 - var26;
                            int var28 = this.field4938[var14];
                            this.field4938[var14++] = ((var25 & 16711935) * var26 + (var28 & 16711935) * var27 & -16711936) + ((var25 & 65280) * var26 + (var28 & 65280) * var27 & 16711680) >> 8;
                            var10 += var12;
                        }
                        var11 += var13;
                        var10 = var21;
                        var14 += var15;
                    }
                } else if (arg8 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    int var29 = var10;
                    for (int var30 = -arg3; var30 < 0; ++var30) {
                        int var31 = (var11 >> 16) * arg7;
                        for (int var32 = -arg2; var32 < 0; ++var32) {
                            int var33 = arg4;
                            if (arg6[(var10 >> 16) + var31] != 0) {
                                var33 = arg5;
                            }
                            if (var33 != 0) {
                                int var34 = this.field4938[var14];
                                int var35 = var33 + var34;
                                int var36 = (var33 & 16711935) + (var34 & 16711935);
                                int var37 = (var35 - var36 & 65536) + (var36 & 16777472);
                                this.field4938[var14++] = var35 - var37 | var37 - (var37 >>> 8);
                            } else {
                                ++var14;
                            }
                            var10 += var12;
                        }
                        var11 += var13;
                        var10 = var29;
                        var14 += var15;
                    }
                }
            } else {
                int var38 = var10;
                for (int var39 = -arg3; var39 < 0; ++var39) {
                    int var40 = (var11 >> 16) * arg7;
                    for (int var41 = -arg2; var41 < 0; ++var41) {
                        if (arg6[(var10 >> 16) + var40] != 0) {
                            this.field4938[var14++] = arg5;
                        } else {
                            this.field4938[var14++] = arg4;
                        }
                        var10 += var12;
                    }
                    var11 += var13;
                    var10 = var38;
                    var14 += var15;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pq", name = "l", descriptor = "()V")
    public final void method1707() {
    }

    @OriginalMember(owner = "client!pq", name = "j", descriptor = "()Z")
    public final boolean method1740() {
        return false;
    }

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "(I)V")
    public final void method1699(int arg0) {
        int var2 = arg0 - this.field4933;
        for (Object var3 = this.field4914.method1134(false); var3 != null; var3 = this.field4914.method1145((byte) 104)) {
            class85 var4 = (class85) var3;
            if (var4.field1212) {
                var4.field1214 += var2;
                int var5 = var4.field1214 / 20;
                if (var5 > 0) {
                    class444 var6 = this.field4945.method186(var4.field1216, -9590);
                    var4.method610(var6.field6493 * var2 * 50 / 1000, var6.field6510 * var2 * 50 / 1000);
                    var4.field1214 -= var5 * 20;
                }
                var4.field1212 = false;
            }
        }
        this.field4933 = arg0;
        this.field4943.method1142((byte) -60, 5);
    }

    @OriginalMember(owner = "client!pq", name = "I", descriptor = "()Z")
    public final boolean method1717() {
        return false;
    }

    @OriginalMember(owner = "client!pq", name = "f", descriptor = "(I)V")
    public final void method1686(int arg0) {
        this.method1632(0, 0, this.field4922, this.field4955, arg0, 0);
    }

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "(IIIIII)V")
    public final void method1782(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = arg2 - arg0;
        int var8 = arg3 - arg1;
        if (var8 == 0) {
            if (var7 >= 0) {
                this.method1739(arg0, arg1, var7 + 1, arg4, arg5);
            } else {
                this.method1739(arg0 + var7, arg1, -var7 + 1, arg4, arg5);
            }
        } else if (var7 == 0) {
            if (var8 >= 0) {
                this.method1666(arg0, arg1, var8 + 1, arg4, arg5);
            } else {
                this.method1666(arg0, arg1 + var8, -var8 + 1, arg4, arg5);
            }
        } else {
            if (var7 + var8 < 0) {
                arg0 += var7;
                var7 = -var7;
                arg1 += var8;
                var8 = -var8;
            }
            if (var7 > var8) {
                int var9 = arg1 << 16;
                int var10 = var9 + 32768;
                int var11 = var8 << 16;
                int var12 = (int) Math.floor((double) var11 / (double) var7 + 0.5D);
                int var13 = arg0 + var7;
                if (arg0 < this.field4926) {
                    var10 += (this.field4926 - arg0) * var12;
                    arg0 = this.field4926;
                }
                if (var13 >= this.field4946) {
                    var13 = this.field4946 - 1;
                }
                int var14 = arg4 >>> 24;
                if (arg5 != 0 && (arg5 != 1 || var14 != 255)) {
                    if (arg5 == 1) {
                        int var15 = (var14 << 24) + ((arg4 & 16711935) * var14 >> 8 & 16711935) + ((arg4 & 65280) * var14 >> 8 & 65280);
                        int var16 = 256 - var14;
                        while (arg0 <= var13) {
                            int var17 = var10 >> 16;
                            if (var17 >= this.field4951 && var17 < this.field4939) {
                                int var18 = this.field4922 * var17 + arg0;
                                int var19 = this.field4938[var18];
                                int var20 = ((var19 & 16711935) * var16 >> 8 & 16711935) + ((var19 & 65280) * var16 >> 8 & 65280);
                                this.field4938[var18] = var15 + var20;
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else if (arg5 == 2) {
                        while (arg0 <= var13) {
                            int var21 = var10 >> 16;
                            if (var21 >= this.field4951 && var21 < this.field4939) {
                                int var22 = this.field4922 * var21 + arg0;
                                int var23 = this.field4938[var22];
                                int var24 = arg4 + var23;
                                int var25 = (arg4 & 16711935) + (var23 & 16711935);
                                int var26 = (var24 - var25 & 65536) + (var25 & 16777472);
                                this.field4938[var22] = var24 - var26 | var26 - (var26 >>> 8);
                            }
                            var10 += var12;
                            ++arg0;
                        }
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    while (arg0 <= var13) {
                        int var27 = var10 >> 16;
                        if (var27 >= this.field4951 && var27 < this.field4939) {
                            this.field4938[this.field4922 * var27 + arg0] = arg4;
                        }
                        var10 += var12;
                        ++arg0;
                    }
                }
            } else {
                int var28 = arg0 << 16;
                int var29 = var28 + 32768;
                int var30 = var7 << 16;
                int var31 = (int) Math.floor((double) var30 / (double) var8 + 0.5D);
                int var32 = arg1 + var8;
                if (arg1 < this.field4951) {
                    var29 += (this.field4951 - arg1) * var31;
                    arg1 = this.field4951;
                }
                if (var32 >= this.field4939) {
                    var32 = this.field4939 - 1;
                }
                int var33 = arg4 >>> 24;
                if (arg5 == 0 || arg5 == 1 && var33 == 255) {
                    while (arg1 <= var32) {
                        int var46 = var29 >> 16;
                        if (var46 >= this.field4926 && var46 < this.field4946) {
                            this.field4938[this.field4922 * arg1 + var46] = arg4;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 1) {
                    int var34 = (var33 << 24) + ((arg4 & 16711935) * var33 >> 8 & 16711935) + ((arg4 & 65280) * var33 >> 8 & 65280);
                    int var35 = 256 - var33;
                    while (arg1 <= var32) {
                        int var36 = var29 >> 16;
                        if (var36 >= this.field4926 && var36 < this.field4946) {
                            int var37 = this.field4922 * arg1 + var36;
                            int var38 = this.field4938[var37];
                            int var39 = ((var38 & 16711935) * var35 >> 8 & 16711935) + ((var38 & 65280) * var35 >> 8 & 65280);
                            this.field4938[this.field4922 * arg1 + var36] = var34 + var39;
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else if (arg5 == 2) {
                    while (arg1 <= var32) {
                        int var40 = var29 >> 16;
                        if (var40 >= this.field4926 && var40 < this.field4946) {
                            int var41 = this.field4922 * arg1 + var40;
                            int var42 = this.field4938[var41];
                            int var43 = arg4 + var42;
                            int var44 = (arg4 & 16711935) + (var42 & 16711935);
                            int var45 = (var43 - var44 & 65536) + (var44 & 16777472);
                            this.field4938[var41] = var43 - var45 | var45 - (var45 >>> 8);
                        }
                        var29 += var31;
                        ++arg1;
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
        }
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "()V")
    private final void method2229() {
        if (this.field4916 != 0.0F) {
            float var1 = (float) this.field4941;
            float var2 = (float) this.field4940;
            float var3 = -(var2 * 2.0F * var1) / (var1 - var2);
            float var4 = this.field4923 / (this.field4923 + this.field4916);
            float var5 = var4 * var4;
            float var6 = (1.0F - var4) * -var3 * (1.0F - var4) / this.field4916;
            this.field4917 = (int) (((float) this.field4941 - var3 * var5) / ((var1 + var2) / (var1 - var2) - var6) + 0.5F);
        } else {
            this.field4917 = this.field4941;
        }
    }

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "(IIII)V")
    public final void method1767(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 < 0) {
            arg0 = 0;
        }
        if (arg1 < 0) {
            arg1 = 0;
        }
        if (arg2 > this.field4922) {
            arg2 = this.field4922;
        }
        if (arg3 > this.field4955) {
            arg3 = this.field4955;
        }
        this.field4926 = arg0;
        this.field4946 = arg2;
        this.field4951 = arg1;
        this.field4939 = arg3;
        this.method2228();
    }

    @OriginalMember(owner = "client!pq", name = "z", descriptor = "()V")
    public final void method1749() {
        this.field4921 = this.field4928;
        this.field4949 = false;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(III[I)V")
    public final void method1783(int arg0, int arg1, int arg2, int[] arg3) {
        int var5 = (this.field4927.field2135 * arg2 + this.field4927.field2143 * arg1 + this.field4927.field2140 * arg0 >> 15) + this.field4927.field2138;
        if (var5 >= this.field4940 && var5 <= this.field4941) {
            int var6 = ((this.field4927.field2142 * arg2 + this.field4927.field2144 * arg0 + this.field4927.field2133 * arg1 >> 15) + this.field4927.field2137) * this.field4950 / var5;
            int var7 = ((this.field4927.field2139 * arg2 + this.field4927.field2141 * arg0 + this.field4927.field2136 * arg1 >> 15) + this.field4927.field2134) * this.field4935 / var5;
            if (var6 >= this.field4947 && var6 <= this.field4925 && var7 >= this.field4948 && var7 <= this.field4953) {
                arg3[0] = var6 - this.field4947;
                arg3[1] = var7 - this.field4948;
                arg3[2] = var5;
            } else {
                arg3[0] = arg3[1] = arg3[2] = -1;
            }
        } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
        }
    }

    @OriginalMember(owner = "client!pq", name = "C", descriptor = "()I")
    public final int method1709() {
        return 0;
    }

    @OriginalMember(owner = "client!pq", name = "w", descriptor = "()Z")
    public final boolean method1770() {
        return false;
    }

    @OriginalMember(owner = "client!pq", name = "m", descriptor = "()V")
    public final void method1652() {
        this.field4926 = 0;
        this.field4951 = 0;
        this.field4946 = this.field4922;
        this.field4939 = this.field4955;
        this.method2228();
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IFFFFF)V")
    public final void method1752(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
        this.field4931 = (int) (arg1 * 65535.0F);
        this.field4932 = (int) (arg2 * 65535.0F);
        float var7 = (float) Math.sqrt((double) (arg5 * arg5 + arg3 * arg3 + arg4 * arg4));
        this.field4952 = (int) (arg3 * 65535.0F / var7);
        this.field4934 = (int) (arg4 * 65535.0F / var7);
        this.field4913 = (int) (arg5 * 65535.0F / var7);
    }

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "(I)V")
    public final void method1727(int arg0) {
        this.field4915[arg0].method829((Runnable) null, -26114);
    }

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "(IIIII)V")
    public final void method1741(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 < 0) {
            arg2 = -arg2;
        }
        int var6 = arg1 - arg2;
        if (var6 < this.field4951) {
            var6 = this.field4951;
        }
        int var7 = arg1 + arg2 + 1;
        if (var7 > this.field4939) {
            var7 = this.field4939;
        }
        int var8 = var6;
        int var9 = arg2 * arg2;
        int var10 = 0;
        int var11 = arg1 - var6;
        int var12 = var11 * var11;
        int var13 = var12 - var11;
        if (arg1 > var7) {
            arg1 = var7;
        }
        int var14 = arg3 >>> 24;
        if (arg4 == 0 || arg4 == 1 && var14 == 255) {
            while (var8 < arg1) {
                while (var13 <= var9 || var12 <= var9) {
                    var12 += var10 + var10;
                    var13 += var10++ + var10;
                }
                int var64 = arg0 - var10 + 1;
                if (var64 < this.field4926) {
                    var64 = this.field4926;
                }
                int var65 = arg0 + var10;
                if (var65 > this.field4946) {
                    var65 = this.field4946;
                }
                int var66 = this.field4922 * var8 + var64;
                for (int var67 = var64; var67 < var65; ++var67) {
                    this.field4938[var66++] = arg3;
                }
                ++var8;
                var12 -= var11-- + var11;
                var13 -= var11 + var11;
            }
            int var55 = arg2;
            int var56 = var8 - arg1;
            int var57 = var56 * var56 + var9;
            int var58 = var57 - arg2;
            int var59 = var57 - var56;
            while (var8 < var7) {
                while (var59 > var9 && var58 > var9) {
                    var59 -= var55-- + var55;
                    var58 -= var55 + var55;
                }
                int var60 = arg0 - var55;
                if (var60 < this.field4926) {
                    var60 = this.field4926;
                }
                int var61 = arg0 + var55;
                if (var61 > this.field4946 - 1) {
                    var61 = this.field4946 - 1;
                }
                int var62 = this.field4922 * var8 + var60;
                for (int var63 = var60; var63 <= var61; ++var63) {
                    this.field4938[var62++] = arg3;
                }
                ++var8;
                var59 += var56 + var56;
                var58 += var56++ + var56;
            }
        } else if (arg4 == 1) {
            int var15 = (var14 << 24) + ((arg3 & 16711935) * var14 >> 8 & 16711935) + ((arg3 & 65280) * var14 >> 8 & 65280);
            int var16 = 256 - var14;
            while (var8 < arg1) {
                while (var13 <= var9 || var12 <= var9) {
                    var12 += var10 + var10;
                    var13 += var10++ + var10;
                }
                int var28 = arg0 - var10 + 1;
                if (var28 < this.field4926) {
                    var28 = this.field4926;
                }
                int var29 = arg0 + var10;
                if (var29 > this.field4946) {
                    var29 = this.field4946;
                }
                int var30 = this.field4922 * var8 + var28;
                for (int var31 = var28; var31 < var29; ++var31) {
                    int var32 = this.field4938[var30];
                    int var33 = ((var32 & 16711935) * var16 >> 8 & 16711935) + ((var32 & 65280) * var16 >> 8 & 65280);
                    this.field4938[var30++] = var15 + var33;
                }
                ++var8;
                var12 -= var11-- + var11;
                var13 -= var11 + var11;
            }
            int var17 = arg2;
            int var18 = -var11;
            int var19 = var18 * var18 + var9;
            int var20 = var19 - arg2;
            int var21 = var19 - var18;
            while (var8 < var7) {
                while (var21 > var9 && var20 > var9) {
                    var21 -= var17-- + var17;
                    var20 -= var17 + var17;
                }
                int var22 = arg0 - var17;
                if (var22 < this.field4926) {
                    var22 = this.field4926;
                }
                int var23 = arg0 + var17;
                if (var23 > this.field4946 - 1) {
                    var23 = this.field4946 - 1;
                }
                int var24 = this.field4922 * var8 + var22;
                for (int var25 = var22; var25 <= var23; ++var25) {
                    int var26 = this.field4938[var24];
                    int var27 = ((var26 & 16711935) * var16 >> 8 & 16711935) + ((var26 & 65280) * var16 >> 8 & 65280);
                    this.field4938[var24++] = var15 + var27;
                }
                ++var8;
                var21 += var18 + var18;
                var20 += var18++ + var18;
            }
        } else if (arg4 != 2) {
            throw new IllegalArgumentException();
        } else {
            while (var8 < arg1) {
                while (var13 <= var9 || var12 <= var9) {
                    var12 += var10 + var10;
                    var13 += var10++ + var10;
                }
                int var47 = arg0 - var10 + 1;
                if (var47 < this.field4926) {
                    var47 = this.field4926;
                }
                int var48 = arg0 + var10;
                if (var48 > this.field4946) {
                    var48 = this.field4946;
                }
                int var49 = this.field4922 * var8 + var47;
                for (int var50 = var47; var50 < var48; ++var50) {
                    int var51 = this.field4938[var49];
                    int var52 = arg3 + var51;
                    int var53 = (arg3 & 16711935) + (var51 & 16711935);
                    int var54 = (var52 - var53 & 65536) + (var53 & 16777472);
                    this.field4938[var49++] = var52 - var54 | var54 - (var54 >>> 8);
                }
                ++var8;
                var12 -= var11-- + var11;
                var13 -= var11 + var11;
            }
            int var34 = arg2;
            int var35 = -var11;
            int var36 = var35 * var35 + var9;
            int var37 = var36 - arg2;
            int var38 = var36 - var35;
            while (var8 < var7) {
                while (var38 > var9 && var37 > var9) {
                    var38 -= var34-- + var34;
                    var37 -= var34 + var34;
                }
                int var39 = arg0 - var34;
                if (var39 < this.field4926) {
                    var39 = this.field4926;
                }
                int var40 = arg0 + var34;
                if (var40 > this.field4946 - 1) {
                    var40 = this.field4946 - 1;
                }
                int var41 = this.field4922 * var8 + var39;
                for (int var42 = var39; var42 <= var40; ++var42) {
                    int var43 = this.field4938[var41];
                    int var44 = arg3 + var43;
                    int var45 = (arg3 & 16711935) + (var43 & 16711935);
                    int var46 = (var44 - var45 & 65536) + (var45 & 16777472);
                    this.field4938[var41++] = var44 - var46 | var46 - (var46 >>> 8);
                }
                ++var8;
                var38 += var35 + var35;
                var37 += var35++ + var35;
            }
        }
    }

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "(IIIIII)V")
    public final void method1731(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.method1739(arg0, arg1, arg2, arg4, arg5);
        this.method1739(arg0, arg1 + arg3 - 1, arg2, arg4, arg5);
        this.method1666(arg0, arg1 + 1, arg3 - 2, arg4, arg5);
        this.method1666(arg0 + arg2 - 1, arg1 + 1, arg3 - 2, arg4, arg5);
    }

    @OriginalMember(owner = "client!pq", name = "r", descriptor = "()V")
    public final void method1697() {
    }

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "()V")
    public final void method1670() {
        this.field4919 = class313.method2121(this.field4911, (byte) 21);
        this.field4938 = this.field4919.field155;
        this.field4922 = this.field4919.field152;
        this.field4955 = this.field4919.field160;
        for (int var1 = 0; var1 < this.field4924; ++var1) {
            this.field4915[var1].method827((byte) -99);
        }
        this.method1652();
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIII)V")
    public final void method1732(int arg0, int arg1, int arg2, int arg3) {
    }

    @OriginalMember(owner = "client!pq", name = "y", descriptor = "()Lvj;")
    public final class177 method1645() {
        return new class158();
    }

    @OriginalMember(owner = "client!pq", name = "u", descriptor = "()Z")
    public final boolean method1743() {
        return true;
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(II)I")
    public final int method1643(int arg0, int arg1) {
        int var3 = arg0 | 66560;
        return var3 & arg1 ^ arg1;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "([Ljava/awt/Rectangle;I)V")
    public final void method1719(Rectangle[] arg0, int arg1) {
        if (this.field4911 != null && this.field4919 != null) {
            try {
                Graphics var3 = this.field4911.getGraphics();
                for (int var4 = 0; var4 < arg1; ++var4) {
                    Rectangle var5 = arg0[var4];
                    if (var5.x <= this.field4922 && var5.y <= this.field4955 && var5.x + var5.width > 0 && var5.y + var5.height > 0) {
                        this.field4919.method69(var5.y, var5.height, (byte) -26, var3, var5.x, var5.width);
                    }
                }
            } catch (Exception var6) {
                this.field4911.repaint();
            }
        } else {
            throw new IllegalStateException("Can't flip an offscreen toolkit");
        }
    }

    @OriginalMember(owner = "client!pq", name = "h", descriptor = "()F")
    public final float method1724() {
        return this.field4916;
    }

    @OriginalMember(owner = "client!pq", name = "j", descriptor = "(I)Z")
    public final boolean method2230(int arg0) {
        return this.field4910 || this.field4945.method186(arg0, -9590).field6509;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Z)V")
    public final void method1638(boolean arg0) {
    }

    @OriginalMember(owner = "client!pq", name = "v", descriptor = "()Z")
    public final boolean method1720() {
        return false;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "([Ldc;Lop;Lvj;[Lkd;I)V")
    public final void method1692(class375[] arg0, class352 arg1, class177 arg2, class330[] arg3, int arg4) {
        class255[] var6 = new class255[arg0.length];
        for (int var7 = 0; var7 < arg0.length; ++var7) {
            if (arg0[var7] != null) {
                var6[var7] = (class255) arg0[var7];
            }
        }
        class255 var8 = class255.method1580(this, var6);
        var8.method1558(arg2, arg3 != null ? arg3[0] : null, arg1, arg4);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Ltr;)V")
    public final void method1780(class139 arg0) {
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Ljava/lang/Runnable;)Lue;")
    public final class131 method2231(Runnable arg0) {
        for (int var2 = 0; var2 < this.field4924; ++var2) {
            if (this.field4915[var2].field1807 == arg0) {
                return this.field4915[var2];
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIIIII)Lhs;")
    public final class420 method1774(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        return null;
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(IIIIII)Z")
    public final boolean method1781(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = (this.field4927.field2135 * arg2 + this.field4927.field2143 * arg1 + this.field4927.field2140 * arg0 >> 15) + this.field4927.field2138;
        if (var7 < 1) {
            var7 = 1;
        }
        int var8 = (this.field4927.field2135 * arg5 + this.field4927.field2143 * arg4 + this.field4927.field2140 * arg3 >> 15) + this.field4927.field2138;
        if (var8 < 1) {
            var8 = 1;
        }
        if ((var7 >= this.field4940 || var8 >= this.field4940) && (var7 <= this.field4941 || var8 <= this.field4941)) {
            int var9 = ((this.field4927.field2142 * arg2 + this.field4927.field2144 * arg0 + this.field4927.field2133 * arg1 >> 15) + this.field4927.field2137) * this.field4950 / var7;
            int var10 = ((this.field4927.field2142 * arg5 + this.field4927.field2144 * arg3 + this.field4927.field2133 * arg4 >> 15) + this.field4927.field2137) * this.field4950 / var8;
            if (var9 < this.field4947 && var10 < this.field4947 || var9 > this.field4925 && var10 > this.field4925) {
                return false;
            } else {
                int var11 = ((this.field4927.field2139 * arg2 + this.field4927.field2141 * arg0 + this.field4927.field2136 * arg1 >> 15) + this.field4927.field2134) * this.field4935 / var7;
                int var12 = ((this.field4927.field2139 * arg5 + this.field4927.field2141 * arg3 + this.field4927.field2136 * arg4 >> 15) + this.field4927.field2134) * this.field4935 / var8;
                return (var11 >= this.field4948 || var12 >= this.field4948) && (var11 <= this.field4953 || var12 <= this.field4953);
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lcl;[Lup;Z)Lwl;")
    public final class273 method1683(class313 arg0, class441[] arg1, boolean arg2) {
        int[] var4 = new int[arg1.length];
        int[] var5 = new int[arg1.length];
        boolean var6 = false;
        for (int var7 = 0; var7 < arg1.length; ++var7) {
            var4[var7] = arg1[var7].field6466;
            var5[var7] = arg1[var7].field6462;
            if (arg1[var7].field6460 != null) {
                var6 = true;
            }
        }
        if (arg2) {
            return new class401(this, arg0, arg1, var4, var5);
        } else if (var6) {
            return new class64(this, arg0, arg1, var4, var5);
        } else {
            return new class437(this, arg0, arg1, var4, var5);
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Ldc;Lop;Lvj;Lkd;I)V")
    public final void method1653(class375 arg0, class352 arg1, class177 arg2, class330 arg3, int arg4) {
        ((class255) arg0).method1558(arg2, arg3, arg1, arg4);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIIIZ)Lcq;")
    public final class67 method1663(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        int[] var6 = new int[arg2 * arg3];
        int var7 = this.field4922 * arg1 + arg0;
        int var8 = this.field4922 - arg2;
        for (int var9 = 0; var9 < arg3; ++var9) {
            int var10 = arg2 * var9;
            for (int var11 = 0; var11 < arg2; ++var11) {
                var6[var10 + var11] = this.field4938[var7++];
            }
            var7 += var8;
        }
        if (arg4) {
            return new class383(this, var6, arg2, arg3);
        } else {
            return new class95(this, var6, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lhs;)V")
    public final void method1671(class420 arg0) {
    }

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "(II)V")
    public final void method1788(int arg0, int arg1) {
        this.field4921 = arg0 & 16777215;
        int var3 = this.field4921 >>> 16 & 255;
        if (var3 < 2) {
            var3 = 2;
        }
        int var4 = this.field4921 >> 8 & 255;
        if (var4 < 2) {
            var4 = 2;
        }
        int var5 = this.field4921 & 255;
        if (var5 < 2) {
            var5 = 2;
        }
        this.field4921 = var3 << 16 | var4 << 8 | var5;
        if (arg1 < 0) {
            this.field4942 = false;
        } else {
            this.field4942 = true;
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(II[I[I)Lud;")
    public final class2 method1712(int arg0, int arg1, int[] arg2, int[] arg3) {
        return new class188(arg0, arg1, arg2, arg3);
    }

    @OriginalMember(owner = "client!pq", name = "k", descriptor = "(I)Z")
    public final boolean method2232(int arg0) {
        return this.field4945.method184(arg0, 14556);
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(I)V")
    public final void method1682(int arg0) {
        if (this.field4924 != arg0) {
            this.field4924 = arg0;
            this.field4915 = new class131[this.field4924];
            for (int var2 = 0; var2 < this.field4924; ++var2) {
                this.field4915[var2] = new class131(this);
            }
        }
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lop;)V")
    public final void method1700(class352 arg0) {
        class61 var2 = arg0.field5092.field5248;
        for (class61 var3 = var2.field801; var2 != var3; var3 = var3.field801) {
            class267 var4 = (class267) var3;
            int var5 = var4.field3849 >> 12;
            int var6 = var4.field3862 >> 12;
            int var7 = var4.field3860 >> 12;
            int var8 = (this.field4927.field2135 * var7 + this.field4927.field2143 * var6 + this.field4927.field2140 * var5 >> 15) + this.field4927.field2138;
            if (var8 >= this.field4940 && var8 <= this.field4941) {
                int var9 = ((this.field4927.field2142 * var7 + this.field4927.field2144 * var5 + this.field4927.field2133 * var6 >> 15) + this.field4927.field2137) * this.field4950 / var8 + this.field4929;
                int var10 = ((this.field4927.field2139 * var7 + this.field4927.field2141 * var5 + this.field4927.field2136 * var6 >> 15) + this.field4927.field2134) * this.field4935 / var8 + this.field4920;
                if (var9 >= this.field4926 && var9 <= this.field4946 && var10 >= this.field4951 && var10 <= this.field4939) {
                    if (var8 == 0) {
                        var8 = 1;
                    }
                    this.method2227(var4, var9, var10, (var4.field3861 >> 2) / var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!pq", name = "l", descriptor = "(I)I")
    public final int method2233(int arg0) {
        return this.field4945.method186(arg0, -9590).field6504 & 65535;
    }

    @OriginalMember(owner = "client!pq", name = "x", descriptor = "()I")
    public final int method1678() {
        int var1 = this.field4944;
        this.field4944 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!pq", name = "n", descriptor = "()Z")
    public final boolean method1734() {
        return true;
    }

    @OriginalMember(owner = "client!pq", name = "m", descriptor = "(I)[I")
    public final int[] method2234(int arg0) {
        class189 var2 = this.field4914;
        class85 var3;
        synchronized (this.field4914) {
            var3 = (class85) this.field4914.method1137((long) arg0, 2108653711);
            if (var3 == null) {
                if (!this.field4945.method184(arg0, 14556)) {
                    return null;
                }
                class444 var5 = this.field4945.method186(arg0, -9590);
                int var6 = !var5.field6509 && !this.field4910 ? 128 : 64;
                var3 = new class85(arg0, var6, this.field4945.method181(var6, (byte) 100, true, var6, arg0, 0.7F), var5.field6501);
                this.field4914.method1144((long) arg0, var3, -3480);
            }
        }
        var3.field1212 = true;
        return var3.method608();
    }

    @OriginalMember(owner = "client!pq", name = "n", descriptor = "(I)Z")
    public final boolean method2235(int arg0) {
        return this.field4945.method186(arg0, -9590).field6500;
    }

    @OriginalMember(owner = "client!pq", name = "s", descriptor = "()Z")
    public final boolean method1736() {
        return false;
    }

    @OriginalMember(owner = "client!pq", name = "J", descriptor = "()I")
    public final int method1647() {
        return this.field4941;
    }

    @OriginalMember(owner = "client!pq", name = "A", descriptor = "()Z")
    public final boolean method1730() {
        return false;
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(IIII)V")
    public final void method1665(int arg0, int arg1, int arg2, int arg3) {
        if (this.field4926 < arg0) {
            this.field4926 = arg0;
        }
        if (this.field4951 < arg1) {
            this.field4951 = arg1;
        }
        if (this.field4946 > arg2) {
            this.field4946 = arg2;
        }
        if (this.field4939 > arg3) {
            this.field4939 = arg3;
        }
        this.method2228();
    }

    @OriginalMember(owner = "client!pq", name = "D", descriptor = "()V")
    public final void method1744() {
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIIIIIIIII)V")
    public final void method1747(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class131 var11 = this.method2231(Thread.currentThread());
        class402 var12 = var11.field1802;
        var12.field5988 = false;
        int var13 = arg6 >>> 24;
        if (arg9 == 0 || arg9 == 1 && var13 == 255) {
            var12.field5988 = false;
            var12.field5985 = 0;
            var12.field5986 = true;
            var12.method2588(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        } else {
            if (arg9 != 1) {
                if (arg9 == 2) {
                    throw new IllegalStateException();
                }
                throw new IllegalArgumentException();
            }
            var12.field5988 = false;
            var12.field5985 = 255 - var13;
            var12.field5986 = true;
            var12.method2588(arg1, arg3, arg5, arg0, arg2, arg4, arg6, arg7, arg8);
        }
        var12.field5988 = true;
    }

    @OriginalMember(owner = "client!pq", name = "i", descriptor = "()Z")
    public final boolean method1695() {
        return false;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Ljava/awt/Canvas;)V")
    public final void method1705(Canvas arg0) {
        this.field4911 = arg0;
        this.method1670();
    }

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "()V")
    public final void method1694() {
        if (this.field4912) {
            class294.method2009(false, true, (byte) -81);
            this.field4912 = false;
        }
        this.field4911 = null;
        this.field4945 = null;
        this.field4919 = null;
        this.field4936 = true;
    }

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "()V")
    private final void method2236() {
        this.field4914 = new class189(20);
        this.field4927 = new class158();
        class226.method1312(123, true, false);
        this.field4912 = true;
        this.method1682(1);
        this.method1649(0);
        this.method1652();
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(FFF)V")
    public final void method1702(float arg0, float arg1, float arg2) {
    }

    @OriginalMember(owner = "client!pq", name = "M", descriptor = "()Z")
    public final boolean method2237() {
        return this.field4936;
    }

    @OriginalMember(owner = "client!pq", name = "F", descriptor = "()I")
    public final int method1779() {
        return 0;
    }

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "(IIIII)V")
    public final void method1739(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 >= this.field4951 && arg1 < this.field4939) {
            if (arg0 < this.field4926) {
                arg2 -= this.field4926 - arg0;
                arg0 = this.field4926;
            }
            if (arg0 + arg2 > this.field4946) {
                arg2 = this.field4946 - arg0;
            }
            int var6 = this.field4922 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field4938[var6 + var10];
                        int var12 = ((var11 & 16711935) * var9 >> 8 & 16711935) + ((var11 & 65280) * var9 >> 8 & 65280);
                        this.field4938[var6 + var10] = var8 + var12;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var13 = 0; var13 < arg2; ++var13) {
                        int var14 = this.field4938[var6 + var13];
                        int var15 = arg3 + var14;
                        int var16 = (arg3 & 16711935) + (var14 & 16711935);
                        int var17 = (var15 - var16 & 65536) + (var16 & 16777472);
                        this.field4938[var6 + var13] = var15 - var17 | var17 - (var17 >>> 8);
                    }
                }
            } else {
                for (int var18 = 0; var18 < arg2; ++var18) {
                    this.field4938[var6 + var18] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pq", name = "G", descriptor = "()I")
    public final int method1787() {
        int var1 = this.field4937;
        this.field4937 = 0;
        return var1;
    }

    @OriginalMember(owner = "client!pq", name = "h", descriptor = "(I)Ltr;")
    public final class139 method1693(int arg0) {
        return null;
    }

    @OriginalMember(owner = "client!pq", name = "K", descriptor = "()V")
    public final void method1751() {
        this.field4914.method1141(256);
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(Z)V")
    public final void method1769(boolean arg0) {
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lup;Z)Lcq;")
    public final class67 method1710(class441 arg0, boolean arg1) {
        int[] var3 = arg0.field6468;
        byte[] var4 = arg0.field6464;
        int var5 = arg0.field6466;
        int var6 = arg0.field6462;
        class301 var11;
        if (arg1 && arg0.field6460 == null) {
            int[] var7 = new int[var3.length];
            byte[] var8 = new byte[var5 * var6];
            for (int var9 = 0; var9 < var6; ++var9) {
                int var12 = var5 * var9;
                for (int var13 = 0; var13 < var5; ++var13) {
                    var8[var12 + var13] = var4[var12 + var13];
                }
            }
            for (int var10 = 0; var10 < var3.length; ++var10) {
                var7[var10] = var3[var10];
            }
            var11 = new class345(this, var8, var7, var5, var6);
        } else {
            int[] var14 = new int[var5 * var6];
            byte[] var15 = arg0.field6460;
            if (var15 != null) {
                for (int var16 = 0; var16 < var6; ++var16) {
                    int var17 = var5 * var16;
                    for (int var18 = 0; var18 < var5; ++var18) {
                        var14[var17 + var18] = var3[var4[var17 + var18] & 255] | var15[var17 + var18] << 24;
                    }
                }
                var11 = new class383(this, var14, var5, var6);
            } else {
                for (int var19 = 0; var19 < var6; ++var19) {
                    int var21 = var5 * var19;
                    for (int var22 = 0; var22 < var5; ++var22) {
                        var14[var21 + var22] = var3[var4[var21 + var22] & 255];
                    }
                }
                new class383(this, var14, var5, var6);
                var11 = new class95(this, var14, var5, var6);
            }
        }
        var11.method410(arg0.field6461, arg0.field6467, arg0.field6465, arg0.field6463);
        return var11;
    }

    @OriginalMember(owner = "client!pq", name = "H", descriptor = "()F")
    public final float method1619() {
        return this.field4923;
    }

    @OriginalMember(owner = "client!pq", name = "g", descriptor = "()Z")
    public final boolean method1625() {
        return true;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "([Ldc;Lvj;[Lkd;I)V")
    public final void method1679(class375[] arg0, class177 arg1, class330[] arg2, int arg3) {
        class255[] var5 = new class255[arg0.length];
        for (int var6 = 0; var6 < arg0.length; ++var6) {
            if (arg0[var6] != null) {
                var5[var6] = (class255) arg0[var6];
            }
        }
        class255 var7 = class255.method1580(this, var5);
        var7.method1558(arg1, arg2 != null ? arg2[0] : null, (class352) null, arg3);
    }

    @OriginalMember(owner = "client!pq", name = "L", descriptor = "()Lvj;")
    public final class177 method1735() {
        class131 var1 = this.method2231(Thread.currentThread());
        return var1.field1810;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lhs;Lhs;FLhs;)Lhs;")
    public final class420 method1681(class420 arg0, class420 arg1, float arg2, class420 arg3) {
        return null;
    }

    @OriginalMember(owner = "client!pq", name = "E", descriptor = "()Z")
    public final boolean method1773() {
        return true;
    }

    @OriginalMember(owner = "client!pq", name = "t", descriptor = "()Z")
    public final boolean method1726() {
        return false;
    }

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "(IIII)V")
    public final void method1723(int arg0, int arg1, int arg2, int arg3) {
        this.field4929 = arg0;
        this.field4920 = arg1;
        this.field4950 = arg2;
        this.field4935 = arg3;
        this.method2228();
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(III)V")
    public final void method1685(int arg0, int arg1, int arg2) {
        this.field4930 = arg0;
        this.field4921 = arg1;
        this.field4954 = arg2;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIIII)V")
    public final void method1666(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= this.field4926 && arg0 < this.field4946) {
            if (arg1 < this.field4951) {
                arg2 -= this.field4951 - arg1;
                arg1 = this.field4951;
            }
            if (arg1 + arg2 > this.field4939) {
                arg2 = this.field4939 - arg1;
            }
            int var6 = this.field4922 * arg1 + arg0;
            int var7 = arg3 >>> 24;
            if (arg4 != 0 && (arg4 != 1 || var7 != 255)) {
                if (arg4 == 1) {
                    int var8 = (var7 << 24) + ((arg3 & 16711935) * var7 >> 8 & 16711935) + ((arg3 & 65280) * var7 >> 8 & 65280);
                    int var9 = 256 - var7;
                    for (int var10 = 0; var10 < arg2; ++var10) {
                        int var11 = this.field4922 * var10 + var6;
                        int var12 = this.field4938[var11];
                        int var13 = ((var12 & 16711935) * var9 >> 8 & 16711935) + ((var12 & 65280) * var9 >> 8 & 65280);
                        this.field4938[var11] = var8 + var13;
                    }
                } else if (arg4 != 2) {
                    throw new IllegalArgumentException();
                } else {
                    for (int var14 = 0; var14 < arg2; ++var14) {
                        int var15 = this.field4922 * var14 + var6;
                        int var16 = this.field4938[var15];
                        int var17 = arg3 + var16;
                        int var18 = (arg3 & 16711935) + (var16 & 16711935);
                        int var19 = (var17 - var18 & 65536) + (var18 & 16777472);
                        this.field4938[var15] = var17 - var19 | var19 - (var19 >>> 8);
                    }
                }
            } else {
                for (int var20 = 0; var20 < arg2; ++var20) {
                    this.field4938[this.field4922 * var20 + var6] = arg3;
                }
            }
        }
    }

    @OriginalMember(owner = "client!pq", name = "p", descriptor = "()I")
    public final int method1771() {
        return this.field4940;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(I[Lwc;)V")
    public final void method1626(int arg0, class367[] arg1) {
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(FF)V")
    public final void method1737(float arg0, float arg1) {
        this.field4923 = arg0;
        this.field4916 = arg1;
        this.method2229();
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(IIIIIII)V")
    public final void method1704(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class131 var8 = this.method2231(Thread.currentThread());
        class402 var9 = var8.field1802;
        int var10 = arg2 - arg0;
        int var11 = arg3 - arg1;
        int var12 = var10 >= 0 ? var10 : -var10;
        int var13 = var11 >= 0 ? var11 : -var11;
        int var14 = var12;
        if (var12 < var13) {
            var14 = var13;
        }
        if (var14 != 0) {
            int var15 = (var10 << 16) / var14;
            int var16 = (var11 << 16) / var14;
            if (var16 <= var15) {
                var15 = -var15;
            } else {
                var16 = -var16;
            }
            int var17 = arg5 * var16 >> 17;
            int var18 = arg5 * var16 + 1 >> 17;
            int var19 = arg5 * var15 >> 17;
            int var20 = arg5 * var15 + 1 >> 17;
            int var21 = arg0 - var9.method2590();
            int var22 = arg1 - var9.method2584();
            int var23 = var17 + var21;
            int var24 = var21 - var18;
            int var25 = var10 + var21 - var18;
            int var26 = var10 + var21 + var17;
            int var27 = var19 + var22;
            int var28 = var22 - var20;
            int var29 = var11 + var22 - var20;
            int var30 = var11 + var22 + var19;
            if (arg6 == 0) {
                var9.field5985 = 0;
            } else {
                if (arg6 != 1) {
                    throw new IllegalArgumentException();
                }
                var9.field5985 = 255 - (arg4 >> 24);
            }
            var9.field5986 = var23 < 0 || var23 > var9.field5984 || var24 < 0 || var24 > var9.field5984 || var25 < 0 || var25 > var9.field5984;
            var9.method2589(var27, var28, var29, var23, var24, var25, arg4);
            var9.field5986 = var23 < 0 || var23 > var9.field5984 || var24 < 0 || var24 > var9.field5984 || var26 < 0 || var26 > var9.field5984;
            var9.method2589(var27, var29, var30, var23, var25, var26, arg4);
        }
    }

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "(IIII)[I")
    public final int[] method1729(int arg0, int arg1, int arg2, int arg3) {
        int[] var5 = new int[arg2 * arg3];
        int var6 = 0;
        for (int var7 = 0; var7 < arg3; ++var7) {
            int var8 = (arg1 + var7) * this.field4922 + arg0;
            for (int var9 = 0; var9 < arg2; ++var9) {
                var5[var6++] = this.field4938[var8 + var9];
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lwp;IIII)Ldc;")
    public final class375 method1715(class245 arg0, int arg1, int arg2, int arg3, int arg4) {
        return new class255(this, arg0, arg1, arg3, arg4, arg2);
    }

    @OriginalMember(owner = "client!pq", name = "B", descriptor = "()Z")
    public final boolean method1684() {
        return false;
    }

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "(Z)V")
    public final void method1698(boolean arg0) {
        this.field4910 = arg0;
        this.field4914.method1141(256);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "([I)V")
    public final void method1676(int[] arg0) {
        arg0[0] = this.field4926;
        arg0[1] = this.field4951;
        arg0[2] = this.field4946;
        arg0[3] = this.field4939;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(I)V")
    public final void method1649(int arg0) {
        this.field4915[arg0].method829(Thread.currentThread(), -26114);
    }

    @OriginalMember(owner = "client!pq", name = "o", descriptor = "()Z")
    public final boolean method1640() {
        return false;
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(Lvj;)V")
    public final void method1648(class177 arg0) {
        this.field4927 = (class158) arg0;
    }

    @OriginalMember(owner = "client!pq", name = "<init>", descriptor = "(Ljava/awt/Canvas;Lfh;I)V")
    public class342(Canvas arg0, class210 arg1, int arg2) {
        this.field4911 = arg0;
        this.field4945 = arg1;
        super.field6028 = arg2;
        this.field4919 = class313.method2121(this.field4911, (byte) 21);
        this.field4938 = this.field4919.field155;
        this.field4922 = this.field4919.field152;
        this.field4955 = this.field4919.field160;
        this.method2236();
    }
}
