import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!je")
public class class166 extends class279 {

    @OriginalMember(owner = "client!je", name = "B", descriptor = "Lco;")
    private class188 field1928;

    @OriginalMember(owner = "client!je", name = "j", descriptor = "I")
    private int field1910;

    @OriginalMember(owner = "client!je", name = "G", descriptor = "[[I")
    public int[][] field1933;

    @OriginalMember(owner = "client!je", name = "x", descriptor = "[[I")
    private int[][] field1924;

    @OriginalMember(owner = "client!je", name = "E", descriptor = "I")
    private int field1931;

    @OriginalMember(owner = "client!je", name = "o", descriptor = "I")
    private int field1915;

    @OriginalMember(owner = "client!je", name = "t", descriptor = "[[B")
    private byte[][] field1920;

    @OriginalMember(owner = "client!je", name = "y", descriptor = "[[B")
    private byte[][] field1925;

    @OriginalMember(owner = "client!je", name = "m", descriptor = "I")
    private int field1913;

    @OriginalMember(owner = "client!je", name = "n", descriptor = "I")
    private int field1914;

    @OriginalMember(owner = "client!je", name = "p", descriptor = "I")
    private int field1916;

    @OriginalMember(owner = "client!je", name = "q", descriptor = "I")
    private int field1917;

    @OriginalMember(owner = "client!je", name = "r", descriptor = "I")
    private int field1918;

    @OriginalMember(owner = "client!je", name = "s", descriptor = "I")
    private int field1919;

    @OriginalMember(owner = "client!je", name = "u", descriptor = "I")
    private int field1921;

    @OriginalMember(owner = "client!je", name = "z", descriptor = "I")
    private int field1926;

    @OriginalMember(owner = "client!je", name = "A", descriptor = "I")
    private int field1927;

    @OriginalMember(owner = "client!je", name = "C", descriptor = "I")
    private int field1929;

    @OriginalMember(owner = "client!je", name = "D", descriptor = "I")
    private int field1930;

    @OriginalMember(owner = "client!je", name = "F", descriptor = "I")
    private int field1932;

    @OriginalMember(owner = "client!je", name = "l", descriptor = "[[Lno;")
    private class348[][] field1912;

    @OriginalMember(owner = "client!je", name = "v", descriptor = "[[Lcm;")
    private class375[][] field1922;

    @OriginalMember(owner = "client!je", name = "w", descriptor = "[[Lrj;")
    private class418[][] field1923;

    @OriginalMember(owner = "client!je", name = "k", descriptor = "[[Loq;")
    private class426[][] field1911;

    @OriginalMember(owner = "client!je", name = "d", descriptor = "(II)I")
    private static final int method1040(int arg0, int arg1) {
        int var2 = (arg0 & 16711680) * arg1 >> 23;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 253) {
            var2 = 253;
        }
        int var3 = (arg0 & 65280) * arg1 >> 15;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 253) {
            var3 = 253;
        }
        int var4 = (arg0 & 255) * arg1 >> 7;
        if (var4 < 2) {
            var4 = 2;
        } else if (var4 > 253) {
            var4 = 253;
        }
        return var2 << 16 | var3 << 8 | var4;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IILdc;[I[I[I)V")
    private final void method1041(int arg0, int arg1, class13 arg2, int[] arg3, int[] arg4, int[] arg5) {
        class426 var7 = this.field1911[arg0][arg1];
        if (var7 != null) {
            if ((var7.field5830 & 2) == 0) {
                int var8 = this.field1931 * arg0;
                int var9 = this.field1931 + var8;
                int var10 = this.field1931 * arg1;
                int var11 = this.field1931 + var10;
                int var14;
                int var15;
                int var17;
                int var20;
                int var21;
                int var22;
                int var23;
                int var24;
                int var25;
                int var26;
                int var27;
                int var29;
                int var31;
                int var32;
                int var33;
                int var34;
                int var35;
                if ((var7.field5830 & 1) != 0) {
                    int var12 = this.field1933[arg0][arg1];
                    int var13 = this.field1918 * var12;
                    var14 = (this.field1932 * var10 + this.field1916 * var8 + var13 >> 15) + this.field1914;
                    if (var14 <= this.field1928.field2169) {
                        return;
                    }
                    var15 = (this.field1932 * var10 + this.field1916 * var9 + var13 >> 15) + this.field1914;
                    if (var15 <= this.field1928.field2169) {
                        return;
                    }
                    int var16 = (this.field1932 * var11 + this.field1916 * var9 + var13 >> 15) + this.field1914;
                    if (var16 <= this.field1928.field2169) {
                        return;
                    }
                    var17 = (this.field1932 * var11 + this.field1916 * var8 + var13 >> 15) + this.field1914;
                    if (var17 <= this.field1928.field2169) {
                        return;
                    }
                    int var18 = this.field1930 * var12;
                    int var19 = this.field1913 * var12;
                    var20 = (this.field1929 * var10 + this.field1921 * var8 + var18 >> 15) + this.field1919;
                    var21 = this.field1928.field2171 * var20 / var14 + arg2.field168;
                    var22 = (this.field1917 * var10 + this.field1927 * var8 + var19 >> 15) + this.field1926;
                    var23 = this.field1928.field2176 * var22 / var14 + arg2.field163;
                    var24 = (this.field1929 * var10 + this.field1921 * var9 + var18 >> 15) + this.field1919;
                    var25 = this.field1928.field2171 * var24 / var15 + arg2.field168;
                    var26 = (this.field1917 * var10 + this.field1927 * var9 + var19 >> 15) + this.field1926;
                    var27 = this.field1928.field2176 * var26 / var15 + arg2.field163;
                    int var28 = (this.field1929 * var11 + this.field1921 * var9 + var18 >> 15) + this.field1919;
                    var29 = this.field1928.field2171 * var28 / var16 + arg2.field168;
                    int var30 = (this.field1917 * var11 + this.field1927 * var9 + var19 >> 15) + this.field1926;
                    var31 = this.field1928.field2176 * var30 / var16 + arg2.field163;
                    var32 = (this.field1929 * var11 + this.field1921 * var8 + var18 >> 15) + this.field1919;
                    var33 = this.field1928.field2171 * var32 / var17 + arg2.field168;
                    var34 = (this.field1917 * var11 + this.field1927 * var8 + var19 >> 15) + this.field1926;
                    var35 = this.field1928.field2176 * var34 / var17 + arg2.field163;
                } else {
                    int var36 = this.field1933[arg0][arg1];
                    int var37 = this.field1933[arg0 + 1][arg1];
                    int var38 = this.field1933[arg0 + 1][arg1 + 1];
                    int var39 = this.field1933[arg0][arg1 + 1];
                    var14 = (this.field1932 * var10 + this.field1918 * var36 + this.field1916 * var8 >> 15) + this.field1914;
                    if (var14 <= this.field1928.field2169) {
                        return;
                    }
                    var15 = (this.field1932 * var10 + this.field1918 * var37 + this.field1916 * var9 >> 15) + this.field1914;
                    if (var15 <= this.field1928.field2169) {
                        return;
                    }
                    int var40 = (this.field1932 * var11 + this.field1918 * var38 + this.field1916 * var9 >> 15) + this.field1914;
                    if (var40 <= this.field1928.field2169) {
                        return;
                    }
                    var17 = (this.field1932 * var11 + this.field1918 * var39 + this.field1916 * var8 >> 15) + this.field1914;
                    if (var17 <= this.field1928.field2169) {
                        return;
                    }
                    var20 = (this.field1929 * var10 + this.field1930 * var36 + this.field1921 * var8 >> 15) + this.field1919;
                    var21 = this.field1928.field2171 * var20 / var14 + arg2.field168;
                    var22 = (this.field1917 * var10 + this.field1927 * var8 + this.field1913 * var36 >> 15) + this.field1926;
                    var23 = this.field1928.field2176 * var22 / var14 + arg2.field163;
                    var24 = (this.field1929 * var10 + this.field1930 * var37 + this.field1921 * var9 >> 15) + this.field1919;
                    var25 = this.field1928.field2171 * var24 / var15 + arg2.field168;
                    var26 = (this.field1917 * var10 + this.field1927 * var9 + this.field1913 * var37 >> 15) + this.field1926;
                    var27 = this.field1928.field2176 * var26 / var15 + arg2.field163;
                    int var41 = (this.field1929 * var11 + this.field1930 * var38 + this.field1921 * var9 >> 15) + this.field1919;
                    var29 = this.field1928.field2171 * var41 / var40 + arg2.field168;
                    int var42 = (this.field1917 * var11 + this.field1927 * var9 + this.field1913 * var38 >> 15) + this.field1926;
                    var31 = this.field1928.field2176 * var42 / var40 + arg2.field163;
                    var32 = (this.field1929 * var11 + this.field1930 * var39 + this.field1921 * var8 >> 15) + this.field1919;
                    var33 = this.field1928.field2171 * var32 / var17 + arg2.field168;
                    var34 = (this.field1917 * var11 + this.field1927 * var8 + this.field1913 * var39 >> 15) + this.field1926;
                    var35 = this.field1928.field2176 * var34 / var17 + arg2.field163;
                }
                if ((var27 - var35) * (var29 - var33) - (var25 - var33) * (var31 - var35) > 0) {
                    arg2.field165 = var29 < 0 || var33 < 0 || var25 < 0 || var29 > arg2.field159 || var33 > arg2.field159 || var25 > arg2.field159;
                    if (var7.field5828 >= 0) {
                        if (this.method1048(this.field1928.field2202.method960(var7.field5828, (byte) -40).field4859)) {
                            arg2.field169 = 100;
                        }
                        arg2.method80(var31, var35, var27, var29, var33, var25, var7.field5834 & 65535, var7.field5831 & 65535, var7.field5833 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field5828);
                        arg2.field169 = 0;
                    } else {
                        arg2.method73(var31, var35, var27, var29, var33, var25, var7.field5834 & 65535, var7.field5831 & 65535, var7.field5833 & 65535);
                    }
                }
                if ((var21 - var25) * (var35 - var27) - (var23 - var27) * (var33 - var25) > 0) {
                    arg2.field165 = var21 < 0 || var25 < 0 || var33 < 0 || var21 > arg2.field159 || var25 > arg2.field159 || var33 > arg2.field159;
                    if (var7.field5828 >= 0) {
                        if (this.method1048(this.field1928.field2202.method960(var7.field5828, (byte) -40).field4859)) {
                            arg2.field169 = 100;
                        }
                        arg2.method80(var23, var27, var35, var21, var25, var33, var7.field5832 & 65535, var7.field5833 & 65535, var7.field5831 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field5828);
                        arg2.field169 = 0;
                        return;
                    }
                    arg2.method73(var23, var27, var35, var21, var25, var33, var7.field5832 & 65535, var7.field5833 & 65535, var7.field5831 & 65535);
                }
            }
        } else {
            class375 var43 = this.field1922[arg0][arg1];
            if (var43 != null) {
                for (int var44 = 0; var44 < var43.field5083; ++var44) {
                    int var84 = var43.field5074[var44];
                    int var85 = var43.field5075[var44];
                    int var86 = var43.field5085[var44];
                    int var87 = (this.field1932 * var86 + this.field1918 * var85 + this.field1916 * var84 >> 15) + this.field1914;
                    if (var87 <= this.field1928.field2169) {
                        return;
                    }
                    int var88 = (this.field1929 * var86 + this.field1930 * var85 + this.field1921 * var84 >> 15) + this.field1919;
                    int var89 = (this.field1917 * var86 + this.field1927 * var84 + this.field1913 * var85 >> 15) + this.field1926;
                    arg3[var44] = this.field1928.field2171 * var88 / var87 + arg2.field168;
                    arg4[var44] = this.field1928.field2176 * var89 / var87 + arg2.field163;
                }
                if (var43.field5081 != null) {
                    int var45 = this.field1933[arg0][arg1];
                    int var46 = this.field1933[arg0 + 1][arg1];
                    int var47 = this.field1933[arg0][arg1 + 1];
                    int var48 = this.field1931 * arg0;
                    int var49 = this.field1931 + var48;
                    int var50 = this.field1931 * arg1;
                    int var51 = this.field1931 + var50;
                    int var52 = (this.field1929 * var50 + this.field1930 * var45 + this.field1921 * var48 >> 15) + this.field1919;
                    int var53 = (this.field1917 * var50 + this.field1927 * var48 + this.field1913 * var45 >> 15) + this.field1926;
                    int var54 = (this.field1932 * var50 + this.field1918 * var45 + this.field1916 * var48 >> 15) + this.field1914;
                    int var55 = (this.field1929 * var50 + this.field1930 * var46 + this.field1921 * var49 >> 15) + this.field1919;
                    int var56 = (this.field1917 * var50 + this.field1927 * var49 + this.field1913 * var46 >> 15) + this.field1926;
                    int var57 = (this.field1932 * var50 + this.field1918 * var46 + this.field1916 * var49 >> 15) + this.field1914;
                    int var58 = (this.field1929 * var51 + this.field1930 * var47 + this.field1921 * var48 >> 15) + this.field1919;
                    int var59 = (this.field1917 * var51 + this.field1927 * var48 + this.field1913 * var47 >> 15) + this.field1926;
                    int var60 = (this.field1932 * var51 + this.field1918 * var47 + this.field1916 * var48 >> 15) + this.field1914;
                    for (int var61 = 0; var61 < var43.field5082; ++var61) {
                        short var62 = var43.field5078[var61];
                        short var63 = var43.field5073[var61];
                        short var64 = var43.field5079[var61];
                        int var65 = arg3[var62];
                        int var66 = arg3[var63];
                        int var67 = arg3[var64];
                        int var68 = arg4[var62];
                        int var69 = arg4[var63];
                        int var70 = arg4[var64];
                        if ((var65 - var66) * (var70 - var69) - (var67 - var66) * (var68 - var69) > 0) {
                            arg2.field165 = var65 < 0 || var66 < 0 || var67 < 0 || var65 > arg2.field159 || var66 > arg2.field159 || var67 > arg2.field159;
                            short var71 = var43.field5081[var61];
                            if (var71 != -1) {
                                if (this.method1048(this.field1928.field2202.method960(var71, (byte) -40).field4859)) {
                                    arg2.field169 = 100;
                                }
                                arg2.method80(var68, var69, var70, var65, var66, var67, var43.field5077[var62], var43.field5077[var63], var43.field5077[var64], var52, var55, var58, var53, var56, var59, var54, var57, var60, var71);
                                arg2.field169 = 0;
                            } else {
                                int var72 = var43.field5084[var61];
                                if (var72 != -1) {
                                    arg2.method73(var68, var69, var70, var65, var66, var67, class179.method1122(-4196, var43.field5077[var62], var72), class179.method1122(-4196, var43.field5077[var63], var72), class179.method1122(-4196, var43.field5077[var64], var72));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var73 = 0; var73 < var43.field5082; ++var73) {
                    short var74 = var43.field5078[var73];
                    short var75 = var43.field5073[var73];
                    short var76 = var43.field5079[var73];
                    int var77 = arg3[var74];
                    int var78 = arg3[var75];
                    int var79 = arg3[var76];
                    int var80 = arg4[var74];
                    int var81 = arg4[var75];
                    int var82 = arg4[var76];
                    if ((var77 - var78) * (var82 - var81) - (var79 - var78) * (var80 - var81) > 0) {
                        int var83 = var43.field5084[var73];
                        if (var83 != -1) {
                            arg2.field165 = var77 < 0 || var78 < 0 || var79 < 0 || var77 > arg2.field159 || var78 > arg2.field159 || var79 > arg2.field159;
                            arg2.method73(var80, var81, var82, var77, var78, var79, class179.method1122(-4196, var43.field5077[var74], var83), class179.method1122(-4196, var43.field5077[var75], var83), class179.method1122(-4196, var43.field5077[var76], var83));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II)V")
    public final void method1042(int arg0, int arg1) {
        class8 var3 = this.field1928.method1160(Thread.currentThread());
        var3.field78.field169 = 0;
        if (this.field1912 != null) {
            this.method1057(arg0, arg1, this.field1928.field2190, var3.field78, var3.field96, var3.field93, var3.field79);
        } else {
            if (this.field1911 != null) {
                this.method1041(arg0, arg1, var3.field78, var3.field96, var3.field93, var3.field79);
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIIII[[ZLdc;[I[I)V")
    private final void method1043(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class13 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field164 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field1912[var16][var17] != null) {
                        class348 var18 = this.field1912[var16][var17];
                        if (var18.field4731 != -1 && (var18.field4728 & 2) == 0 && var18.field4732 == 0) {
                            int var19 = this.field1928.method1163(var18.field4731);
                            arg8.method73(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class179.method1122(-4196, var18.field4733, var19), class179.method1122(-4196, var18.field4730, var19), class179.method1122(-4196, var18.field4734, var19));
                            arg8.method73(var15, var15, var15 - var13, var14, var13 + var14, var14, class179.method1122(-4196, var18.field4729, var19), class179.method1122(-4196, var18.field4734, var19), class179.method1122(-4196, var18.field4730, var19));
                        } else if (var18.field4732 == 0) {
                            arg8.method70(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field4733, var18.field4730, var18.field4734);
                            arg8.method70(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field4729, var18.field4734, var18.field4730);
                        } else {
                            int var20 = var18.field4732;
                            arg8.method70(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class237.method1520(-7965, var20, var18.field4733 & -16777216), class237.method1520(-7965, var20, var18.field4730 & -16777216), class237.method1520(-7965, var20, var18.field4734 & -16777216));
                            arg8.method70(var15, var15, var15 - var13, var14, var13 + var14, var14, class237.method1520(-7965, var20, var18.field4729 & -16777216), class237.method1520(-7965, var20, var18.field4734 & -16777216), class237.method1520(-7965, var20, var18.field4730 & -16777216));
                        }
                    } else if (this.field1923[var16][var17] != null) {
                        class418 var21 = this.field1923[var16][var17];
                        for (int var22 = 0; var22 < var21.field5705; ++var22) {
                            arg9[var22] = (var21.field5709[var22] - this.field1931 * var16) * var13 / this.field1931 + var14;
                            arg10[var22] = var15 - (var21.field5712[var22] - this.field1931 * var17) * var13 / this.field1931;
                        }
                        for (int var23 = 0; var23 < var21.field5713; ++var23) {
                            int var24 = var23 * 3;
                            int var25 = var24 + 1;
                            int var26 = var25 + 1;
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field5711 != null && var21.field5711[var23] != 0 && (var21.field5706 == null || var21.field5706 != null && var21.field5706[var23] == -1)) {
                                int var33 = var21.field5711[var23];
                                arg8.method70(var30, var31, var32, var27, var28, var29, class237.method1520(-7965, var33, -16777216 - (var21.field5708[var24] & -16777216)), class237.method1520(-7965, var33, -16777216 - (var21.field5708[var25] & -16777216)), class237.method1520(-7965, var33, -16777216 - (var21.field5708[var26] & -16777216)));
                            } else if (var21.field5706 != null && var21.field5706[var23] != -1) {
                                int var34 = this.field1928.method1163(var21.field5706[var23]);
                                arg8.method73(var30, var31, var32, var27, var28, var29, var34, var34, var34);
                            } else {
                                arg8.method70(var30, var31, var32, var27, var28, var29, var21.field5708[var24], var21.field5708[var25], var21.field5708[var26]);
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field164 = true;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lgi;IIIIZ)V")
    public final void method1044(class416 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(III)V")
    public final void method1045(int arg0, int arg1, int arg2) {
        if (this.field1925[arg0][arg1] < arg2) {
            this.field1925[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(III[[ZZ)V")
    public final void method1046(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class331 var6 = this.field1928.field2201;
        this.field1921 = var6.field4518;
        this.field1930 = var6.field4513;
        this.field1929 = var6.field4512;
        this.field1919 = var6.field4507;
        this.field1927 = var6.field4515;
        this.field1913 = var6.field4510;
        this.field1917 = var6.field4509;
        this.field1926 = var6.field4517;
        this.field1916 = var6.field4516;
        this.field1918 = var6.field4511;
        this.field1932 = var6.field4508;
        this.field1914 = var6.field4514;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(Lsi;[I)V")
    public final void method1047(class92 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(I)Z")
    private final boolean method1048(int arg0) {
        if ((this.field1910 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else {
            return arg0 == 8;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V")
    public final void method1049(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int arg12, int arg13, boolean arg14) {
        if (this.field1911 == null) {
            this.field1911 = new class426[super.field3612][super.field3611];
            this.field1922 = new class375[super.field3612][super.field3611];
        } else if (this.field1912 != null) {
            throw new IllegalStateException();
        }
        boolean var16 = false;
        if (arg8.length == 2 && arg5.length == 2 && (arg8[0] == arg8[1] || arg10[0] != -1 && arg10[0] == arg10[1])) {
            var16 = true;
            for (int var17 = 1; var17 < 2; ++var17) {
                int var18 = arg2[arg5[var17]];
                int var19 = arg4[arg5[var17]];
                if (var18 != 0 && this.field1931 != var18 || var19 != 0 && this.field1931 != var19) {
                    var16 = false;
                    break;
                }
            }
        }
        if (!var16) {
            class375 var20 = new class375();
            short var21 = (short) arg2.length;
            short var22 = (short) arg8.length;
            var20.field5083 = var21;
            var20.field5077 = new short[var21];
            var20.field5074 = new int[var21];
            var20.field5075 = new int[var21];
            var20.field5085 = new int[var21];
            for (int var23 = 0; var23 < var21; ++var23) {
                int var28 = arg2[var23];
                int var29 = arg4[var23];
                if (var28 == 0 && var29 == 0) {
                    var20.field5077[var23] = (short) (this.field1920[arg0][arg1] - this.field1925[arg0][arg1]);
                } else if (var28 == 0 && this.field1931 == var29) {
                    var20.field5077[var23] = (short) (this.field1920[arg0][arg1 + 1] - this.field1925[arg0][arg1 + 1]);
                } else if (this.field1931 == var28 && this.field1931 == var29) {
                    var20.field5077[var23] = (short) (this.field1920[arg0 + 1][arg1 + 1] - this.field1925[arg0 + 1][arg1 + 1]);
                } else if (this.field1931 == var28 && var29 == 0) {
                    var20.field5077[var23] = (short) (this.field1920[arg0 + 1][arg1] - this.field1925[arg0 + 1][arg1]);
                } else {
                    int var30 = (this.field1920[arg0 + 1][arg1] - this.field1925[arg0 + 1][arg1]) * var28 + (this.field1920[arg0][arg1] - this.field1925[arg0][arg1]) * (this.field1931 - var28);
                    int var31 = (this.field1920[arg0 + 1][arg1 + 1] - this.field1925[arg0 + 1][arg1 + 1]) * var28 + (this.field1920[arg0][arg1 + 1] - this.field1925[arg0][arg1 + 1]) * (this.field1931 - var28);
                    var20.field5077[var23] = (short) ((this.field1931 - var29) * var30 + var29 * var31 >> this.field1915 * 2);
                }
                int var32 = (arg0 << this.field1915) + var28;
                int var33 = (arg1 << this.field1915) + var29;
                var20.field5074[var23] = var32;
                var20.field5085[var23] = var33;
                var20.field5075[var23] = this.method1054(var32, var33) + (arg3 != null ? arg3[var23] : 0);
                if (var20.field5077[var23] < 2) {
                    var20.field5077[var23] = 2;
                }
            }
            boolean var24 = false;
            int var25 = 0;
            for (int var26 = 0; var26 < var22; ++var26) {
                if (arg8[var26] >= 0 || arg9 != null && arg9[var26] >= 0) {
                    ++var25;
                }
                if (arg10[var26] != -1 && !this.field1928.field2202.method960(arg10[var26], (byte) -40).field4862) {
                    var24 = true;
                }
            }
            var20.field5084 = new int[var25];
            if (arg9 != null) {
                var20.field5076 = new int[var25];
            }
            var20.field5078 = new short[var25];
            var20.field5073 = new short[var25];
            var20.field5079 = new short[var25];
            if (var24) {
                var20.field5081 = new short[var25];
                var20.field5080 = new short[var25];
            }
            for (int var27 = 0; var27 < var22; ++var27) {
                if (arg8[var27] >= 0 || arg9 != null && arg9[var27] >= 0) {
                    if (arg8[var27] >= 0) {
                        var20.field5084[var20.field5082] = class80.method507(-60, arg8[var27]);
                    } else {
                        var20.field5084[var20.field5082] = -1;
                    }
                    if (arg9 != null) {
                        if (arg9[var27] != -1) {
                            var20.field5076[var20.field5082] = class80.method507(-114, arg9[var27]);
                        } else {
                            var20.field5076[var20.field5082] = -1;
                        }
                    }
                    var20.field5078[var20.field5082] = (short) arg5[var27];
                    var20.field5073[var20.field5082] = (short) arg6[var27];
                    var20.field5079[var20.field5082] = (short) arg7[var27];
                    if (var24) {
                        if (arg10[var27] != -1 && !this.field1928.field2202.method960(arg10[var27], (byte) -40).field4862) {
                            var20.field5081[var20.field5082] = (short) arg10[var27];
                            var20.field5080[var20.field5082] = (short) arg11[var27];
                        } else {
                            var20.field5081[var20.field5082] = -1;
                        }
                    }
                    ++var20.field5082;
                }
            }
            this.field1922[arg0][arg1] = var20;
        } else {
            if (arg8[0] >= 0 || arg9 != null && arg9[0] >= 0) {
                class426 var34 = new class426();
                int var35 = arg8[0];
                int var36 = arg10[0];
                if (arg9 != null) {
                    var34.field5829 = class179.method1122(-4196, this.field1920[arg0][arg1] - this.field1925[arg0][arg1], class80.method507(-88, arg9[0]));
                    if (var35 == -1) {
                        var34.field5830 = (byte) (var34.field5830 | 2);
                    }
                }
                if (this.field1933[arg0 + 1][arg1] == this.field1933[arg0][arg1] && this.field1933[arg0 + 1][arg1 + 1] == this.field1933[arg0][arg1] && this.field1933[arg0][arg1 + 1] == this.field1933[arg0][arg1]) {
                    var34.field5830 = (byte) (var34.field5830 | 1);
                }
                if (var36 != -1 && (var34.field5830 & 2) == 0 && !this.field1928.field2202.method960(var36, (byte) -40).field4862) {
                    var34.field5832 = (short) (this.field1920[arg0][arg1] - this.field1925[arg0][arg1]);
                    var34.field5833 = (short) (this.field1920[arg0 + 1][arg1] - this.field1925[arg0 + 1][arg1]);
                    var34.field5834 = (short) (this.field1920[arg0 + 1][arg1 + 1] - this.field1925[arg0 + 1][arg1 + 1]);
                    var34.field5831 = (short) (this.field1920[arg0][arg1 + 1] - this.field1925[arg0][arg1 + 1]);
                    var34.field5828 = (short) var36;
                } else {
                    short var37 = class80.method507(-16, var35);
                    var34.field5832 = (short) class179.method1122(-4196, this.field1920[arg0][arg1] - this.field1925[arg0][arg1], var37);
                    var34.field5833 = (short) class179.method1122(-4196, this.field1920[arg0 + 1][arg1] - this.field1925[arg0 + 1][arg1], var37);
                    var34.field5834 = (short) class179.method1122(-4196, this.field1920[arg0 + 1][arg1 + 1] - this.field1925[arg0 + 1][arg1 + 1], var37);
                    var34.field5831 = (short) class179.method1122(-4196, this.field1920[arg0][arg1 + 1] - this.field1925[arg0][arg1 + 1], var37);
                    var34.field5828 = -1;
                }
                this.field1911[arg0][arg1] = var34;
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(II)I")
    public final int method1050(int arg0, int arg1) {
        return this.field1933[arg0][arg1];
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(Lgi;IIIIZ)V")
    public final void method1051(class416 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIIIIII[[Z)V")
    public final void method1052(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class8 var9 = this.field1928.method1160(Thread.currentThread());
        class13 var10 = var9.field78;
        var10.field169 = 0;
        var10.field165 = false;
        if (this.field1912 != null) {
            this.method1043(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field96, var9.field93);
        } else {
            if (this.field1911 != null) {
                this.method1056(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field96, var9.field93);
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "()V")
    public final void method1053() {
        this.field1920 = null;
        this.field1925 = null;
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(II)I")
    public final int method1054(int arg0, int arg1) {
        int var3 = arg0 >> this.field1915;
        int var4 = arg1 >> this.field1915;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field3612 - 1 && var4 <= super.field3611 - 1) {
            int var5 = arg0 & this.field1931 - 1;
            int var6 = arg1 & this.field1931 - 1;
            int var7 = (this.field1931 - var5) * this.field1933[var3][var4] + this.field1933[var3 + 1][var4] * var5 >> this.field1915;
            int var8 = (this.field1931 - var5) * this.field1933[var3][var4 + 1] + this.field1933[var3 + 1][var4 + 1] * var5 >> this.field1915;
            return (this.field1931 - var6) * var7 + var6 * var8 >> this.field1915;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IILgi;)Lgi;")
    public final class416 method1055(int arg0, int arg1, class416 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!je", name = "<init>", descriptor = "(Lco;IIII[[I[[II)V")
    public class166(class188 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4);
        this.field1928 = arg0;
        this.field1910 = arg2;
        this.field1933 = arg5;
        this.field1924 = arg6;
        this.field1931 = arg7;
        this.field1915 = 0;
        while (arg7 > 1) {
            ++this.field1915;
            arg7 >>= 1;
        }
        this.field1920 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field1928.field2193 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = this.field1933[var11 + 1][var10] - this.field1933[var11 - 1][var10];
                int var14 = this.field1933[var11][var10 + 1] - this.field1933[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + var13 * var13 + 65536));
                int var16 = (var13 << 8) / var15;
                int var17 = -65536 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field1928.field2209 * var18 + this.field1928.field2206 * var16 + this.field1928.field2205 * var17 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field1920[var11][var10] = (byte) var20;
            }
        }
        this.field1925 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!je", name = "b", descriptor = "(IIIIIII[[ZLdc;[I[I)V")
    private final void method1056(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class13 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field164 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field1911[var16][var17] != null) {
                        class426 var18 = this.field1911[var16][var17];
                        if (var18.field5828 != -1 && (var18.field5830 & 2) == 0 && var18.field5829 == -1) {
                            int var19 = this.field1928.method1163(var18.field5828);
                            arg8.method73(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class179.method1122(-4196, var18.field5834 & 65535, var19), class179.method1122(-4196, var18.field5831 & 65535, var19), class179.method1122(-4196, var18.field5833 & 65535, var19));
                            arg8.method73(var15, var15, var15 - var13, var14, var13 + var14, var14, class179.method1122(-4196, var18.field5832 & 65535, var19), class179.method1122(-4196, var18.field5833 & 65535, var19), class179.method1122(-4196, var18.field5831 & 65535, var19));
                        } else if (var18.field5829 == -1) {
                            arg8.method73(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field5834 & 65535, var18.field5831 & 65535, var18.field5833 & 65535);
                            arg8.method73(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field5832 & 65535, var18.field5833 & 65535, var18.field5831 & 65535);
                        } else {
                            int var20 = var18.field5829;
                            arg8.method73(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var20, var20, var20);
                            arg8.method73(var15, var15, var15 - var13, var14, var13 + var14, var14, var20, var20, var20);
                        }
                    } else if (this.field1922[var16][var17] != null) {
                        class375 var21 = this.field1922[var16][var17];
                        for (int var22 = 0; var22 < var21.field5083; ++var22) {
                            arg9[var22] = (var21.field5074[var22] - this.field1931 * var16) * var13 / this.field1931 + var14;
                            arg10[var22] = var15 - (var21.field5085[var22] - this.field1931 * var17) * var13 / this.field1931;
                        }
                        for (int var23 = 0; var23 < var21.field5082; ++var23) {
                            short var24 = var21.field5078[var23];
                            short var25 = var21.field5073[var23];
                            short var26 = var21.field5079[var23];
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field5076 != null && var21.field5076[var23] != -1) {
                                int var33 = var21.field5076[var23];
                                arg8.method73(var30, var31, var32, var27, var28, var29, class179.method1122(-4196, var21.field5077[var24], var33), class179.method1122(-4196, var21.field5077[var25], var33), class179.method1122(-4196, var21.field5077[var26], var33));
                            } else if (var21.field5081 != null && var21.field5081[var23] != -1) {
                                int var34 = this.field1928.method1163(var21.field5081[var23]);
                                arg8.method73(var30, var31, var32, var27, var28, var29, class179.method1122(-4196, var21.field5077[var24], var34), class179.method1122(-4196, var21.field5077[var25], var34), class179.method1122(-4196, var21.field5077[var26], var34));
                            } else {
                                int var35 = var21.field5084[var23];
                                arg8.method73(var30, var31, var32, var27, var28, var29, class179.method1122(-4196, var21.field5077[var24], var35), class179.method1122(-4196, var21.field5077[var25], var35), class179.method1122(-4196, var21.field5077[var26], var35));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field164 = true;
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(IIZLdc;[I[I[I)V")
    private final void method1057(int arg0, int arg1, boolean arg2, class13 arg3, int[] arg4, int[] arg5, int[] arg6) {
        class348 var8 = this.field1912[arg0][arg1];
        if (var8 != null) {
            if ((var8.field4728 & 2) == 0) {
                int var9 = this.field1931 * arg0;
                int var10 = this.field1931 + var9;
                int var11 = this.field1931 * arg1;
                int var12 = this.field1931 + var11;
                int var13 = 0;
                int var14 = 0;
                int var15 = 0;
                int var16 = 0;
                int var19;
                int var20;
                int var21;
                int var22;
                int var29;
                int var30;
                int var31;
                int var32;
                int var33;
                int var34;
                int var35;
                int var36;
                int var37;
                int var38;
                int var39;
                int var40;
                int var41;
                int var42;
                int var43;
                int var44;
                if ((var8.field4728 & 1) != 0 && !arg2) {
                    int var17 = this.field1933[arg0][arg1];
                    int var18 = this.field1918 * var17;
                    var19 = (this.field1932 * var11 + this.field1916 * var9 + var18 >> 15) + this.field1914;
                    if (var19 <= this.field1928.field2169) {
                        return;
                    }
                    var20 = (this.field1932 * var11 + this.field1916 * var10 + var18 >> 15) + this.field1914;
                    if (var20 <= this.field1928.field2169) {
                        return;
                    }
                    var21 = (this.field1932 * var12 + this.field1916 * var10 + var18 >> 15) + this.field1914;
                    if (var21 <= this.field1928.field2169) {
                        return;
                    }
                    var22 = (this.field1932 * var12 + this.field1916 * var9 + var18 >> 15) + this.field1914;
                    if (var22 <= this.field1928.field2169) {
                        return;
                    }
                    if (this.field1928.field2204) {
                        int var23 = var19 - this.field1928.field2208;
                        if (var23 > 0) {
                            var13 = var23;
                            if (var23 > 255) {
                                var13 = 255;
                            }
                        }
                        int var24 = var20 - this.field1928.field2208;
                        if (var24 > 0) {
                            var14 = var24;
                            if (var24 > 255) {
                                var14 = 255;
                            }
                        }
                        int var25 = var21 - this.field1928.field2208;
                        if (var25 > 0) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = var22 - this.field1928.field2208;
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    int var27 = this.field1930 * var17;
                    int var28 = this.field1913 * var17;
                    var29 = (this.field1929 * var11 + this.field1921 * var9 + var27 >> 15) + this.field1919;
                    var30 = this.field1928.field2171 * var29 / var19 + arg3.field168;
                    var31 = (this.field1917 * var11 + this.field1927 * var9 + var28 >> 15) + this.field1926;
                    var32 = this.field1928.field2176 * var31 / var19 + arg3.field163;
                    var33 = (this.field1929 * var11 + this.field1921 * var10 + var27 >> 15) + this.field1919;
                    var34 = this.field1928.field2171 * var33 / var20 + arg3.field168;
                    var35 = (this.field1917 * var11 + this.field1927 * var10 + var28 >> 15) + this.field1926;
                    var36 = this.field1928.field2176 * var35 / var20 + arg3.field163;
                    var37 = (this.field1929 * var12 + this.field1921 * var10 + var27 >> 15) + this.field1919;
                    var38 = this.field1928.field2171 * var37 / var21 + arg3.field168;
                    var39 = (this.field1917 * var12 + this.field1927 * var10 + var28 >> 15) + this.field1926;
                    var40 = this.field1928.field2176 * var39 / var21 + arg3.field163;
                    var41 = (this.field1929 * var12 + this.field1921 * var9 + var27 >> 15) + this.field1919;
                    var42 = this.field1928.field2171 * var41 / var22 + arg3.field168;
                    var43 = (this.field1917 * var12 + this.field1927 * var9 + var28 >> 15) + this.field1926;
                    var44 = this.field1928.field2176 * var43 / var22 + arg3.field163;
                } else {
                    int var45 = this.field1933[arg0][arg1];
                    int var46 = this.field1933[arg0 + 1][arg1];
                    int var47 = this.field1933[arg0 + 1][arg1 + 1];
                    int var48 = this.field1933[arg0][arg1 + 1];
                    var19 = (this.field1932 * var11 + this.field1918 * var45 + this.field1916 * var9 >> 15) + this.field1914;
                    if (var19 <= this.field1928.field2169) {
                        return;
                    }
                    var20 = (this.field1932 * var11 + this.field1918 * var46 + this.field1916 * var10 >> 15) + this.field1914;
                    if (var20 <= this.field1928.field2169) {
                        return;
                    }
                    var21 = (this.field1932 * var12 + this.field1918 * var47 + this.field1916 * var10 >> 15) + this.field1914;
                    if (var21 <= this.field1928.field2169) {
                        return;
                    }
                    var22 = (this.field1932 * var12 + this.field1918 * var48 + this.field1916 * var9 >> 15) + this.field1914;
                    if (var22 <= this.field1928.field2169) {
                        return;
                    }
                    if (arg2) {
                        int var49 = var19 - this.field1928.field2208;
                        if (var49 > 255) {
                            var49 = 255;
                        }
                        if (var49 > 0) {
                            var13 = var49;
                            int var50 = this.field1924[arg0][arg1] * var49 / 255;
                            if (var50 > 0) {
                                var45 -= var50;
                            }
                        }
                        int var51 = var20 - this.field1928.field2208;
                        if (var51 > 255) {
                            var51 = 255;
                        }
                        if (var51 > 0) {
                            var14 = var51;
                            int var52 = this.field1924[arg0 + 1][arg1] * var51 / 255;
                            if (var52 > 0) {
                                var46 -= var52;
                            }
                        }
                        int var53 = var21 - this.field1928.field2208;
                        if (var53 > 255) {
                            var53 = 255;
                        }
                        if (var53 > 0) {
                            var15 = var53;
                            int var54 = this.field1924[arg0 + 1][arg1 + 1] * var53 / 255;
                            if (var54 > 0) {
                                var47 -= var54;
                            }
                        }
                        int var55 = var22 - this.field1928.field2208;
                        if (var55 > 255) {
                            var55 = 255;
                        }
                        if (var55 > 0) {
                            var16 = var55;
                            int var56 = this.field1924[arg0][arg1 + 1] * var55 / 255;
                            if (var56 > 0) {
                                var48 -= var56;
                            }
                        }
                    } else if (this.field1928.field2204) {
                        int var57 = var19 - this.field1928.field2208;
                        if (var57 > 0) {
                            var13 = var57;
                            if (var57 > 255) {
                                var13 = 255;
                            }
                        }
                        int var58 = var20 - this.field1928.field2208;
                        if (var58 > 0) {
                            var14 = var58;
                            if (var58 > 255) {
                                var14 = 255;
                            }
                        }
                        int var59 = var21 - this.field1928.field2208;
                        if (var59 > 0) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = var22 - this.field1928.field2208;
                        if (var60 > 0) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    var29 = (this.field1929 * var11 + this.field1930 * var45 + this.field1921 * var9 >> 15) + this.field1919;
                    var30 = this.field1928.field2171 * var29 / var19 + arg3.field168;
                    var31 = (this.field1917 * var11 + this.field1927 * var9 + this.field1913 * var45 >> 15) + this.field1926;
                    var32 = this.field1928.field2176 * var31 / var19 + arg3.field163;
                    var33 = (this.field1929 * var11 + this.field1930 * var46 + this.field1921 * var10 >> 15) + this.field1919;
                    var34 = this.field1928.field2171 * var33 / var20 + arg3.field168;
                    var35 = (this.field1917 * var11 + this.field1927 * var10 + this.field1913 * var46 >> 15) + this.field1926;
                    var36 = this.field1928.field2176 * var35 / var20 + arg3.field163;
                    var37 = (this.field1929 * var12 + this.field1930 * var47 + this.field1921 * var10 >> 15) + this.field1919;
                    var38 = this.field1928.field2171 * var37 / var21 + arg3.field168;
                    var39 = (this.field1917 * var12 + this.field1927 * var10 + this.field1913 * var47 >> 15) + this.field1926;
                    var40 = this.field1928.field2176 * var39 / var21 + arg3.field163;
                    var41 = (this.field1929 * var12 + this.field1930 * var48 + this.field1921 * var9 >> 15) + this.field1919;
                    var42 = this.field1928.field2171 * var41 / var22 + arg3.field168;
                    var43 = (this.field1917 * var12 + this.field1927 * var9 + this.field1913 * var48 >> 15) + this.field1926;
                    var44 = this.field1928.field2176 * var43 / var22 + arg3.field163;
                }
                boolean var61 = var8.field4731 != -1 && this.method1048(this.field1928.field2202.method960(var8.field4731, (byte) -40).field4859);
                int var62 = var14 + var15 + var16;
                if ((var36 - var44) * (var38 - var42) - (var34 - var42) * (var40 - var44) > 0) {
                    arg3.field165 = var38 < 0 || var42 < 0 || var34 < 0 || var38 > arg3.field159 || var42 > arg3.field159 || var34 > arg3.field159;
                    if (var62 < 765) {
                        if (var61) {
                            arg3.field169 = 100;
                        }
                        if (var62 > 0) {
                            if (var8.field4731 >= 0) {
                                arg3.method71(var40, var44, var36, var38, var42, var34, this.field1928.field2175, var15, var16, var14, var8.field4733, var8.field4730, var8.field4734, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field4731);
                            } else {
                                arg3.method70(var40, var44, var36, var38, var42, var34, class237.method1520(-7965, var8.field4733, var15 << 24 | this.field1928.field2175), class237.method1520(-7965, var8.field4730, var16 << 24 | this.field1928.field2175), class237.method1520(-7965, var8.field4734, var14 << 24 | this.field1928.field2175));
                            }
                        } else if (var8.field4731 >= 0) {
                            arg3.method80(var40, var44, var36, var38, var42, var34, var8.field4733, var8.field4730, var8.field4734, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field4731);
                        } else {
                            arg3.method70(var40, var44, var36, var38, var42, var34, var8.field4733, var8.field4730, var8.field4734);
                        }
                        arg3.field169 = 0;
                    } else {
                        arg3.method75(var40, var44, var36, var38, var42, var34, this.field1928.field2175);
                    }
                }
                int var63 = var13 + var14 + var16;
                if ((var30 - var34) * (var44 - var36) - (var32 - var36) * (var42 - var34) > 0) {
                    arg3.field165 = var30 < 0 || var34 < 0 || var42 < 0 || var30 > arg3.field159 || var34 > arg3.field159 || var42 > arg3.field159;
                    if (var63 < 765) {
                        if (var61) {
                            arg3.field169 = 100;
                        }
                        if (var63 > 0) {
                            if (var8.field4731 >= 0) {
                                arg3.method71(var32, var36, var44, var30, var34, var42, this.field1928.field2175, var13, var14, var16, var8.field4729, var8.field4734, var8.field4730, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field4731);
                            } else {
                                arg3.method70(var32, var36, var44, var30, var34, var42, class237.method1520(-7965, var8.field4729, var13 << 24 | this.field1928.field2175), class237.method1520(-7965, var8.field4734, var14 << 24 | this.field1928.field2175), class237.method1520(-7965, var8.field4730, var16 << 24 | this.field1928.field2175));
                            }
                        } else if (var8.field4731 >= 0) {
                            arg3.method80(var32, var36, var44, var30, var34, var42, var8.field4729, var8.field4734, var8.field4730, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field4731);
                        } else {
                            arg3.method70(var32, var36, var44, var30, var34, var42, var8.field4729, var8.field4734, var8.field4730);
                        }
                        arg3.field169 = 0;
                        return;
                    }
                    arg3.method75(var32, var36, var44, var30, var34, var42, this.field1928.field2175);
                }
            }
        } else {
            class418 var64 = this.field1923[arg0][arg1];
            if (var64 != null) {
                for (int var65 = 0; var65 < var64.field5705; ++var65) {
                    short var105 = var64.field5709[var65];
                    int var106 = var64.field5707[var65];
                    short var107 = var64.field5712[var65];
                    int var108 = (this.field1932 * var107 + this.field1918 * var106 + this.field1916 * var105 >> 15) + this.field1914;
                    if (var108 <= this.field1928.field2169) {
                        return;
                    }
                    arg6[var65] = 0;
                    if (arg2) {
                        int var109 = var108 - this.field1928.field2208;
                        if (var109 > 255) {
                            var109 = 255;
                        }
                        if (var109 > 0) {
                            arg6[var65] = var109;
                            int var110 = var64.field5714[var65] * var109 / 255;
                            if (var110 > 0) {
                                var106 -= var110;
                            }
                        }
                    } else if (this.field1928.field2204) {
                        int var111 = var108 - this.field1928.field2208;
                        if (var111 > 0) {
                            arg6[var65] = var111;
                            if (arg6[var65] > 255) {
                                arg6[var65] = 255;
                            }
                        }
                    }
                    int var112 = (this.field1929 * var107 + this.field1930 * var106 + this.field1921 * var105 >> 15) + this.field1919;
                    int var113 = (this.field1917 * var107 + this.field1927 * var105 + this.field1913 * var106 >> 15) + this.field1926;
                    arg4[var65] = this.field1928.field2171 * var112 / var108 + arg3.field168;
                    arg5[var65] = this.field1928.field2176 * var113 / var108 + arg3.field163;
                }
                if (var64.field5706 != null) {
                    int var66 = this.field1933[arg0][arg1];
                    int var67 = this.field1933[arg0 + 1][arg1];
                    int var68 = this.field1933[arg0][arg1 + 1];
                    int var69 = this.field1931 * arg0;
                    int var70 = this.field1931 + var69;
                    int var71 = this.field1931 * arg1;
                    int var72 = this.field1931 + var71;
                    int var73 = (this.field1929 * var71 + this.field1930 * var66 + this.field1921 * var69 >> 15) + this.field1919;
                    int var74 = (this.field1917 * var71 + this.field1927 * var69 + this.field1913 * var66 >> 15) + this.field1926;
                    int var75 = (this.field1932 * var71 + this.field1918 * var66 + this.field1916 * var69 >> 15) + this.field1914;
                    int var76 = (this.field1929 * var71 + this.field1930 * var67 + this.field1921 * var70 >> 15) + this.field1919;
                    int var77 = (this.field1917 * var71 + this.field1927 * var70 + this.field1913 * var67 >> 15) + this.field1926;
                    int var78 = (this.field1932 * var71 + this.field1918 * var67 + this.field1916 * var70 >> 15) + this.field1914;
                    int var79 = (this.field1929 * var72 + this.field1930 * var68 + this.field1921 * var69 >> 15) + this.field1919;
                    int var80 = (this.field1917 * var72 + this.field1927 * var69 + this.field1913 * var68 >> 15) + this.field1926;
                    int var81 = (this.field1932 * var72 + this.field1918 * var68 + this.field1916 * var69 >> 15) + this.field1914;
                    for (int var82 = 0; var82 < var64.field5713; ++var82) {
                        int var83 = var82 * 3;
                        int var84 = var83 + 1;
                        int var85 = var84 + 1;
                        int var86 = arg4[var83];
                        int var87 = arg4[var84];
                        int var88 = arg4[var85];
                        int var89 = arg5[var83];
                        int var90 = arg5[var84];
                        int var91 = arg5[var85];
                        int var92 = arg6[var83] + arg6[var84] + arg6[var85];
                        if ((var86 - var87) * (var91 - var90) - (var88 - var87) * (var89 - var90) > 0) {
                            arg3.field165 = var86 < 0 || var87 < 0 || var88 < 0 || var86 > arg3.field159 || var87 > arg3.field159 || var88 > arg3.field159;
                            short var93 = var64.field5706[var82];
                            if (var92 < 765) {
                                if (var93 != -1 && this.method1048(this.field1928.field2202.method960(var93, (byte) -40).field4859)) {
                                    arg3.field169 = 100;
                                }
                                if (var92 > 0) {
                                    if (var93 != -1) {
                                        arg3.method71(var89, var90, var91, var86, var87, var88, this.field1928.field2175, arg6[var83], arg6[var84], arg6[var85], var64.field5708[var83], var64.field5708[var84], var64.field5708[var85], var73, var76, var79, var74, var77, var80, var75, var78, var81, var93);
                                    } else if ((var64.field5708[var83] & 16777215) != 0) {
                                        arg3.method70(var89, var90, var91, var86, var87, var88, class237.method1520(-7965, var64.field5708[var83], arg6[var83] << 24 | this.field1928.field2175), class237.method1520(-7965, var64.field5708[var84], arg6[var84] << 24 | this.field1928.field2175), class237.method1520(-7965, var64.field5708[var85], arg6[var85] << 24 | this.field1928.field2175));
                                    }
                                } else if (var93 != -1) {
                                    arg3.method80(var89, var90, var91, var86, var87, var88, var64.field5708[var83], var64.field5708[var84], var64.field5708[var85], var73, var76, var79, var74, var77, var80, var75, var78, var81, var93);
                                } else if ((var64.field5708[var83] & 16777215) != 0) {
                                    arg3.method70(var89, var90, var91, var86, var87, var88, var64.field5708[var83], var64.field5708[var84], var64.field5708[var85]);
                                }
                                arg3.field169 = 0;
                            } else {
                                arg3.method75(var89, var90, var91, var86, var87, var88, this.field1928.field2175);
                            }
                        }
                    }
                    return;
                }
                for (int var94 = 0; var94 < var64.field5713; ++var94) {
                    int var95 = var94 * 3;
                    int var96 = var95 + 1;
                    int var97 = var96 + 1;
                    int var98 = arg4[var95];
                    int var99 = arg4[var96];
                    int var100 = arg4[var97];
                    int var101 = arg5[var95];
                    int var102 = arg5[var96];
                    int var103 = arg5[var97];
                    int var104 = arg6[var95] + arg6[var96] + arg6[var97];
                    if ((var98 - var99) * (var103 - var102) - (var100 - var99) * (var101 - var102) > 0) {
                        arg3.field165 = var98 < 0 || var99 < 0 || var100 < 0 || var98 > arg3.field159 || var99 > arg3.field159 || var100 > arg3.field159;
                        if (var104 < 765) {
                            if (var104 > 0) {
                                if ((var64.field5708[var95] & 16777215) != 0) {
                                    arg3.method70(var101, var102, var103, var98, var99, var100, class307.method1952(-2, arg6[var95], var64.field5708[var95], this.field1928.field2175), class307.method1952(-2, arg6[var96], var64.field5708[var96], this.field1928.field2175), class307.method1952(-2, arg6[var97], var64.field5708[var97], this.field1928.field2175));
                                }
                            } else if ((var64.field5708[var95] & 16777215) != 0) {
                                arg3.method70(var101, var102, var103, var98, var99, var100, var64.field5708[var95], var64.field5708[var96], var64.field5708[var97]);
                            }
                        } else {
                            arg3.method75(var101, var102, var103, var98, var99, var100, this.field1928.field2175);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V")
    public final void method1058(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9, int arg10, boolean arg11) {
        if (this.field1912 == null) {
            this.field1912 = new class348[super.field3612][super.field3611];
            this.field1923 = new class418[super.field3612][super.field3611];
        } else if (this.field1911 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var13 = 0; var13 < arg5.length; ++var13) {
                if (arg5[var13] == -1) {
                    arg5[var13] = 0;
                } else {
                    arg5[var13] = class212.field2589[class80.method507(-18, arg5[var13]) & 65535] << 8 | 255;
                }
            }
            if (arg6 != null) {
                for (int var14 = 0; var14 < arg6.length; ++var14) {
                    if (arg6[var14] == -1) {
                        arg6[var14] = 0;
                    } else {
                        arg6[var14] = class212.field2589[class80.method507(-73, arg6[var14]) & 65535] << 8 | 255;
                    }
                }
            }
            boolean var15 = true;
            int var16 = -1;
            int var17 = -1;
            int var18 = -1;
            int var19 = -1;
            if (arg2.length == 6) {
                for (int var20 = 0; var20 < 6; ++var20) {
                    if (arg2[var20] == 0 && arg4[var20] == 0) {
                        if (var16 != -1 && arg5[var16] != arg5[var20]) {
                            var15 = false;
                            break;
                        }
                        var16 = var20;
                    } else if (arg2[var20] == this.field1931 && arg4[var20] == 0) {
                        if (var17 != -1 && arg5[var17] != arg5[var20]) {
                            var15 = false;
                            break;
                        }
                        var17 = var20;
                    } else if (arg2[var20] == this.field1931 && arg4[var20] == this.field1931) {
                        if (var18 != -1 && arg5[var18] != arg5[var20]) {
                            var15 = false;
                            break;
                        }
                        var18 = var20;
                    } else if (arg2[var20] == 0 && arg4[var20] == this.field1931) {
                        if (var19 != -1 && arg5[var19] != arg5[var20]) {
                            var15 = false;
                            break;
                        }
                        var19 = var20;
                    }
                }
                if (var16 == -1 || var17 == -1 || var18 == -1 || var19 == -1) {
                    var15 = false;
                }
                if (var15) {
                    if (arg3 != null) {
                        for (int var21 = 0; var21 < 4; ++var21) {
                            if (arg3[var21] != 0) {
                                var15 = false;
                                break;
                            }
                        }
                    }
                    if (var15) {
                        for (int var22 = 1; var22 < 4; ++var22) {
                            if (arg2[var22] != arg2[0] && arg2[0] + this.field1931 != arg2[var22] && arg2[0] - this.field1931 != arg2[var22]) {
                                var15 = false;
                                break;
                            }
                            if (arg4[var22] != arg4[0] && arg4[0] + this.field1931 != arg4[var22] && arg4[0] - this.field1931 != arg4[var22]) {
                                var15 = false;
                                break;
                            }
                        }
                    }
                }
            } else {
                var15 = false;
            }
            if (var15) {
                class348 var23 = new class348();
                int var24 = arg5[0];
                int var25 = arg7[0];
                if (arg6 != null) {
                    var23.field4732 = arg6[0] >> 8;
                    if (var24 == 0) {
                        var23.field4728 = (byte) (var23.field4728 | 2);
                    }
                } else if (var24 == 0) {
                    return;
                }
                if (this.field1933[arg0 + 1][arg1] == this.field1933[arg0][arg1] && this.field1933[arg0 + 1][arg1 + 1] == this.field1933[arg0][arg1] && this.field1933[arg0][arg1 + 1] == this.field1933[arg0][arg1]) {
                    var23.field4728 = (byte) (var23.field4728 | 1);
                }
                if (var25 != -1 && (var23.field4728 & 2) == 0 && !this.field1928.field2202.method960(var25, (byte) -40).field4862) {
                    var23.field4729 = this.field1920[arg0][arg1] - this.field1925[arg0][arg1];
                    var23.field4734 = this.field1920[arg0 + 1][arg1] - this.field1925[arg0 + 1][arg1];
                    var23.field4733 = this.field1920[arg0 + 1][arg1 + 1] - this.field1925[arg0 + 1][arg1 + 1];
                    var23.field4730 = this.field1920[arg0][arg1 + 1] - this.field1925[arg0][arg1 + 1];
                    var23.field4731 = (short) var25;
                } else {
                    int var26;
                    if (this.field1924 != null && arg10 != 0) {
                        var26 = this.field1924[arg0][arg1] * 255 / arg10;
                        if (var26 < 0) {
                            var26 = 0;
                        } else if (var26 > 255) {
                            var26 = 255;
                        }
                    } else {
                        var26 = 0;
                    }
                    var23.field4729 = class307.method1952(-2, var26, method1040(arg5[var16] >> 8, this.field1920[arg0][arg1] - this.field1925[arg0][arg1]), arg9);
                    if (var23.field4732 != 0) {
                        var23.field4729 |= 255 - (this.field1920[arg0][arg1] - this.field1925[arg0][arg1]) << 25;
                    }
                    int var27;
                    if (this.field1924 != null && arg10 != 0) {
                        var27 = this.field1924[arg0 + 1][arg1] * 255 / arg10;
                        if (var27 < 0) {
                            var27 = 0;
                        } else if (var27 > 255) {
                            var27 = 255;
                        }
                    } else {
                        var27 = 0;
                    }
                    var23.field4734 = class307.method1952(-2, var27, method1040(arg5[var17] >> 8, this.field1920[arg0 + 1][arg1] - this.field1925[arg0 + 1][arg1]), arg9);
                    if (var23.field4732 != 0) {
                        var23.field4734 |= 255 - (this.field1920[arg0 + 1][arg1] - this.field1925[arg0 + 1][arg1]) << 25;
                    }
                    int var28;
                    if (this.field1924 != null && arg10 != 0) {
                        var28 = this.field1924[arg0 + 1][arg1 + 1] * 255 / arg10;
                        if (var28 < 0) {
                            var28 = 0;
                        } else if (var28 > 255) {
                            var28 = 255;
                        }
                    } else {
                        var28 = 0;
                    }
                    var23.field4733 = class307.method1952(-2, var28, method1040(arg5[var18] >> 8, this.field1920[arg0 + 1][arg1 + 1] - this.field1925[arg0 + 1][arg1 + 1]), arg9);
                    if (var23.field4732 != 0) {
                        var23.field4733 |= 255 - (this.field1920[arg0 + 1][arg1 + 1] - this.field1925[arg0 + 1][arg1 + 1]) << 25;
                    }
                    int var29;
                    if (this.field1924 != null && arg10 != 0) {
                        var29 = this.field1924[arg0][arg1 + 1] * 255 / arg10;
                        if (var29 < 0) {
                            var29 = 0;
                        } else if (var29 > 255) {
                            var29 = 255;
                        }
                    } else {
                        var29 = 0;
                    }
                    var23.field4730 = class307.method1952(-2, var29, method1040(arg5[var19] >> 8, this.field1920[arg0][arg1 + 1] - this.field1925[arg0][arg1 + 1]), arg9);
                    if (var23.field4732 != 0) {
                        var23.field4730 |= 255 - (this.field1920[arg0][arg1 + 1] - this.field1925[arg0][arg1 + 1]) << 25;
                    }
                    var23.field4731 = -1;
                }
                this.field1912[arg0][arg1] = var23;
            } else {
                class418 var30 = new class418();
                var30.field5705 = (short) arg2.length;
                var30.field5713 = (short) (arg2.length / 3);
                var30.field5709 = new short[var30.field5705];
                var30.field5707 = new short[var30.field5705];
                var30.field5712 = new short[var30.field5705];
                var30.field5708 = new int[var30.field5705];
                if (this.field1924 != null) {
                    var30.field5714 = new short[var30.field5705];
                }
                for (int var31 = 0; var31 < var30.field5705; ++var31) {
                    int var46 = arg2[var31];
                    int var47 = arg4[var31];
                    boolean var48 = false;
                    int var49;
                    if (var46 == 0 && var47 == 0) {
                        var49 = this.field1920[arg0][arg1] - this.field1925[arg0][arg1];
                    } else if (var46 == 0 && this.field1931 == var47) {
                        var49 = this.field1920[arg0][arg1 + 1] - this.field1925[arg0][arg1 + 1];
                    } else if (this.field1931 == var46 && this.field1931 == var47) {
                        var49 = this.field1920[arg0 + 1][arg1 + 1] - this.field1925[arg0 + 1][arg1 + 1];
                    } else if (this.field1931 == var46 && var47 == 0) {
                        var49 = this.field1920[arg0 + 1][arg1] - this.field1925[arg0 + 1][arg1];
                    } else {
                        int var50 = (this.field1920[arg0 + 1][arg1] - this.field1925[arg0 + 1][arg1]) * var46 + (this.field1920[arg0][arg1] - this.field1925[arg0][arg1]) * (this.field1931 - var46);
                        int var51 = (this.field1920[arg0 + 1][arg1 + 1] - this.field1925[arg0 + 1][arg1 + 1]) * var46 + (this.field1920[arg0][arg1 + 1] - this.field1925[arg0][arg1 + 1]) * (this.field1931 - var46);
                        var49 = (this.field1931 - var47) * var50 + var47 * var51 >> this.field1915 * 2;
                    }
                    short var52 = (short) ((arg0 << this.field1915) + var46);
                    short var53 = (short) ((arg1 << this.field1915) + var47);
                    var30.field5709[var31] = var52;
                    var30.field5712[var31] = var53;
                    var30.field5707[var31] = (short) (this.method1054(var52, var53) + (arg3 != null ? arg3[var31] : 0));
                    if (var49 < 0) {
                        var49 = 0;
                    }
                    if (arg7[var31] != -1 && !this.field1928.field2202.method960(arg7[var31], (byte) -40).field4862) {
                        var30.field5708[var31] = var49;
                    } else if (arg5[var31] == 0) {
                        if (arg6 != null) {
                            var30.field5708[var31] = var49 << 25;
                        } else {
                            var30.field5708[var31] = 0;
                        }
                    } else {
                        int var54 = 0;
                        if (this.field1924 != null) {
                            boolean var55 = false;
                            int var56;
                            if (var46 == 0 && var47 == 0) {
                                var56 = this.field1924[arg0][arg1];
                            } else if (var46 == 0 && this.field1931 == var47) {
                                var56 = this.field1924[arg0][arg1 + 1];
                            } else if (this.field1931 == var46 && this.field1931 == var47) {
                                var56 = this.field1924[arg0 + 1][arg1 + 1];
                            } else if (this.field1931 == var46 && var47 == 0) {
                                var56 = this.field1924[arg0 + 1][arg1];
                            } else {
                                int var57 = (this.field1931 - var46) * this.field1924[arg0][arg1] + this.field1924[arg0 + 1][arg1] * var46;
                                int var58 = (this.field1931 - var46) * this.field1924[arg0][arg1 + 1] + this.field1924[arg0 + 1][arg1 + 1] * var46;
                                var56 = (this.field1931 - var47) * var57 + var47 * var58 >> this.field1915 * 2;
                            }
                            var30.field5714[var31] = (short) var56;
                            if (arg10 != 0) {
                                var54 = var56 * 255 / arg10;
                                if (var54 < 0) {
                                    var54 = 0;
                                } else if (var54 > 255) {
                                    var54 = 255;
                                }
                            }
                        }
                        var30.field5708[var31] = class307.method1952(-2, var54, method1040(arg5[var31] >> 8, var49), arg9);
                        if (arg6 != null) {
                            var30.field5708[var31] |= var49 << 25;
                        }
                    }
                }
                boolean var32 = false;
                for (int var33 = 0; var33 < var30.field5713; ++var33) {
                    if (arg7[var33 * 3] != -1 && !this.field1928.field2202.method960(arg7[var33 * 3], (byte) -40).field4862) {
                        var32 = true;
                    }
                }
                if (arg6 != null) {
                    var30.field5711 = new int[var30.field5713];
                }
                if (var32) {
                    var30.field5706 = new short[var30.field5713];
                    var30.field5710 = new short[var30.field5713];
                }
                for (int var34 = 0; var34 < var30.field5713; ++var34) {
                    int var35 = var34 * 3;
                    if (arg6 != null && arg6[var35] != 0) {
                        var30.field5711[var34] = arg6[var35] >> 8;
                    }
                    if (var32) {
                        int var36 = var35 + 1;
                        int var37 = var36 + 1;
                        boolean var38 = false;
                        boolean var39 = true;
                        int var40 = arg7[var35];
                        if (var40 != -1 && !this.field1928.field2202.method960(var40, (byte) -40).field4862) {
                            var38 = true;
                        } else {
                            var39 = false;
                        }
                        int var41 = arg7[var36];
                        if (var41 != -1 && !this.field1928.field2202.method960(var41, (byte) -40).field4862) {
                            var38 = true;
                        } else {
                            var39 = false;
                        }
                        int var42 = arg7[var37];
                        if (var42 != -1 && !this.field1928.field2202.method960(var42, (byte) -40).field4862) {
                            var38 = true;
                        } else {
                            var39 = false;
                        }
                        if (var39) {
                            var30.field5706[var34] = (short) var42;
                            var30.field5710[var34] = (short) arg8[var35];
                        } else {
                            if (var38) {
                                int var43 = arg7[var35];
                                if (var43 != -1 && !this.field1928.field2202.method960(var43, (byte) -40).field4862) {
                                    var30.field5708[var35] = class212.field2589[class80.method507(-112, this.field1928.field2202.method960(var43, (byte) -40).field4864 & 65535) & 65535];
                                }
                                int var44 = arg7[var36];
                                if (var44 != -1 && !this.field1928.field2202.method960(var44, (byte) -40).field4862) {
                                    var30.field5708[var36] = class212.field2589[class80.method507(-63, this.field1928.field2202.method960(var44, (byte) -40).field4864 & 65535) & 65535];
                                }
                                int var45 = arg7[var37];
                                if (var45 != -1 && !this.field1928.field2202.method960(var45, (byte) -40).field4862) {
                                    var30.field5708[var37] = class212.field2589[class80.method507(-85, this.field1928.field2202.method960(var45, (byte) -40).field4864 & 65535) & 65535];
                                }
                            }
                            var30.field5706[var34] = -1;
                        }
                    }
                }
                this.field1923[arg0][arg1] = var30;
            }
        }
    }

    @OriginalMember(owner = "client!je", name = "c", descriptor = "(Lgi;IIIIZ)Z")
    public final boolean method1059(class416 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }
}
