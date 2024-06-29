import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sq")
public abstract class class153 extends class174 {

    @OriginalMember(owner = "client!sq", name = "i", descriptor = "I")
    public int field1868 = -1;

    @OriginalMember(owner = "client!sq", name = "m", descriptor = "Lhr;")
    public class446 field1872;

    @OriginalMember(owner = "client!sq", name = "j", descriptor = "I")
    private int field1869;

    @OriginalMember(owner = "client!sq", name = "u", descriptor = "[[I")
    public int[][] field1880;

    @OriginalMember(owner = "client!sq", name = "y", descriptor = "[[B")
    private byte[][] field1884;

    @OriginalMember(owner = "client!sq", name = "o", descriptor = "[[B")
    private byte[][] field1874;

    @OriginalMember(owner = "client!sq", name = "g", descriptor = "I")
    public int field1866;

    @OriginalMember(owner = "client!sq", name = "l", descriptor = "I")
    public int field1871;

    @OriginalMember(owner = "client!sq", name = "n", descriptor = "I")
    public int field1873;

    @OriginalMember(owner = "client!sq", name = "q", descriptor = "I")
    public int field1876;

    @OriginalMember(owner = "client!sq", name = "r", descriptor = "I")
    public int field1877;

    @OriginalMember(owner = "client!sq", name = "s", descriptor = "I")
    public int field1878;

    @OriginalMember(owner = "client!sq", name = "t", descriptor = "I")
    public int field1879;

    @OriginalMember(owner = "client!sq", name = "v", descriptor = "I")
    public int field1881;

    @OriginalMember(owner = "client!sq", name = "w", descriptor = "I")
    public int field1882;

    @OriginalMember(owner = "client!sq", name = "x", descriptor = "I")
    public int field1883;

    @OriginalMember(owner = "client!sq", name = "z", descriptor = "I")
    public int field1885;

    @OriginalMember(owner = "client!sq", name = "B", descriptor = "I")
    public int field1887;

    @OriginalMember(owner = "client!sq", name = "h", descriptor = "[[Lco;")
    public class100[][] field1867;

    @OriginalMember(owner = "client!sq", name = "A", descriptor = "[[Lhc;")
    public class120[][] field1886;

    @OriginalMember(owner = "client!sq", name = "p", descriptor = "[[Lcl;")
    public class223[][] field1875;

    @OriginalMember(owner = "client!sq", name = "k", descriptor = "[[Lvca;")
    public class234[][] field1870;

    @OriginalMember(owner = "client!sq", name = "Q", descriptor = "(III)V", line = 8)
    public final void method841(int arg0, int arg1, int arg2) {
        if (this.field1874[arg0][arg1] < arg2) {
            this.field1874[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!sq", name = "N", descriptor = "()V", line = 13)
    public final void method842() {
        this.field1884 = null;
        this.field1874 = null;
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(II)I", line = 20)
    private static final int method843(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!sq", name = "F", descriptor = "(Lk;IIIIZ)V", line = 52)
    public final void method845(class483 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 55)
    public final void method846(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field1886 == null) {
            this.field1886 = new class120[super.field2116][super.field2114];
            this.field1875 = new class223[super.field2116][super.field2114];
        } else if (this.field1870 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field2115 != var20 || var21 != 0 && super.field2115 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class223 var22 = new class223();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field2746 = var23;
            var22.field2741 = new short[var23];
            var22.field2743 = new short[var23];
            var22.field2748 = new short[var23];
            var22.field2747 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var30 = arg2[var25];
                int var31 = arg4[var25];
                if (var30 == 0 && var31 == 0) {
                    var22.field2741[var25] = (short) (this.field1884[arg0][arg1] - this.field1874[arg0][arg1]);
                } else if (var30 == 0 && super.field2115 == var31) {
                    var22.field2741[var25] = (short) (this.field1884[arg0][arg1 + 1] - this.field1874[arg0][arg1 + 1]);
                } else if (super.field2115 == var30 && super.field2115 == var31) {
                    var22.field2741[var25] = (short) (this.field1884[arg0 + 1][arg1 + 1] - this.field1874[arg0 + 1][arg1 + 1]);
                } else if (super.field2115 == var30 && var31 == 0) {
                    var22.field2741[var25] = (short) (this.field1884[arg0 + 1][arg1] - this.field1874[arg0 + 1][arg1]);
                } else {
                    int var32 = (this.field1884[arg0 + 1][arg1] - this.field1874[arg0 + 1][arg1]) * var30 + (this.field1884[arg0][arg1] - this.field1874[arg0][arg1]) * (super.field2115 - var30);
                    int var33 = (this.field1884[arg0 + 1][arg1 + 1] - this.field1874[arg0 + 1][arg1 + 1]) * var30 + (this.field1884[arg0][arg1 + 1] - this.field1874[arg0][arg1 + 1]) * (super.field2115 - var30);
                    var22.field2741[var25] = (short) ((super.field2115 - var31) * var32 + var31 * var33 >> super.field2111 * 2);
                }
                int var34 = (arg0 << super.field2111) + var30;
                int var35 = (arg1 << super.field2111) + var31;
                var22.field2743[var25] = (short) var30;
                var22.field2747[var25] = (short) var31;
                var22.field2748[var25] = (short) (this.method847(var34, var35) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field2741[var25] < 2) {
                    var22.field2741[var25] = 2;
                }
            }
            boolean var26 = false;
            int var27 = 0;
            for (int var28 = 0; var28 < var24; ++var28) {
                if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
                    ++var27;
                }
                if (arg11[var28] != -1 && !this.field1872.field2481.method119(-118, arg11[var28]).field2646) {
                    var26 = true;
                }
            }
            var22.field2750 = new int[var27];
            if (arg10 != null) {
                var22.field2749 = new int[var27];
            }
            var22.field2751 = new short[var27];
            var22.field2742 = new short[var27];
            var22.field2752 = new short[var27];
            if (var26) {
                var22.field2744 = new short[var27];
                var22.field2740 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field2750[var22.field2745] = class390.method2237(arg9[var29], true);
                    } else {
                        var22.field2750[var22.field2745] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field2749[var22.field2745] = class390.method2237(arg10[var29], true);
                        } else {
                            var22.field2749[var22.field2745] = -1;
                        }
                    }
                    var22.field2751[var22.field2745] = (short) arg6[var29];
                    var22.field2742[var22.field2745] = (short) arg7[var29];
                    var22.field2752[var22.field2745] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field1872.field2481.method119(-127, arg11[var29]).field2646) {
                            var22.field2744[var22.field2745] = (short) arg11[var29];
                            var22.field2740[var22.field2745] = (short) arg12[var29];
                        } else {
                            var22.field2744[var22.field2745] = -1;
                        }
                    }
                    ++var22.field2745;
                }
            }
            this.field1875[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class120 var36 = new class120();
                int var37 = arg9[0];
                int var38 = arg11[0];
                if (arg10 != null) {
                    var36.field1513 = class10.method52(31129, this.field1884[arg0][arg1] - this.field1874[arg0][arg1], class390.method2237(arg10[0], true));
                    if (var37 == -1) {
                        var36.field1511 = (byte) (var36.field1511 | 2);
                    }
                }
                if (this.field1880[arg0 + 1][arg1] == this.field1880[arg0][arg1] && this.field1880[arg0 + 1][arg1 + 1] == this.field1880[arg0][arg1] && this.field1880[arg0][arg1 + 1] == this.field1880[arg0][arg1]) {
                    var36.field1511 = (byte) (var36.field1511 | 1);
                }
                if (var38 != -1 && (var36.field1511 & 2) == 0 && !this.field1872.field2481.method119(-127, var38).field2646) {
                    var36.field1515 = (short) (this.field1884[arg0][arg1] - this.field1874[arg0][arg1]);
                    var36.field1516 = (short) (this.field1884[arg0 + 1][arg1] - this.field1874[arg0 + 1][arg1]);
                    var36.field1510 = (short) (this.field1884[arg0 + 1][arg1 + 1] - this.field1874[arg0 + 1][arg1 + 1]);
                    var36.field1512 = (short) (this.field1884[arg0][arg1 + 1] - this.field1874[arg0][arg1 + 1]);
                    var36.field1514 = (short) var38;
                } else {
                    short var39 = class390.method2237(var37, true);
                    var36.field1515 = (short) class10.method52(31129, this.field1884[arg0][arg1] - this.field1874[arg0][arg1], var39);
                    var36.field1516 = (short) class10.method52(31129, this.field1884[arg0 + 1][arg1] - this.field1874[arg0 + 1][arg1], var39);
                    var36.field1510 = (short) class10.method52(31129, this.field1884[arg0 + 1][arg1 + 1] - this.field1874[arg0 + 1][arg1 + 1], var39);
                    var36.field1512 = (short) class10.method52(31129, this.field1884[arg0][arg1 + 1] - this.field1874[arg0][arg1 + 1], var39);
                    var36.field1514 = -1;
                }
                this.field1886[arg0][arg1] = var36;
            }
        }
    }

    @OriginalMember(owner = "client!sq", name = "aa", descriptor = "(II)I", line = 287)
    public final int method847(int arg0, int arg1) {
        int var3 = arg0 >> super.field2111;
        int var4 = arg1 >> super.field2111;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field2116 - 1 && var4 <= super.field2114 - 1) {
            int var5 = arg0 & super.field2115 - 1;
            int var6 = arg1 & super.field2115 - 1;
            int var7 = (super.field2115 - var5) * this.field1880[var3][var4] + this.field1880[var3 + 1][var4] * var5 >> super.field2111;
            int var8 = (super.field2115 - var5) * this.field1880[var3][var4 + 1] + this.field1880[var3 + 1][var4 + 1] * var5 >> super.field2111;
            return (super.field2115 - var6) * var7 + var6 * var8 >> super.field2111;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!sq", name = "ya", descriptor = "(Lk;IIIIZ)V", line = 304)
    public final void method848(class483 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!sq", name = "IA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 307)
    public final void method849(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (this.field1870 == null) {
            this.field1870 = new class234[super.field2116][super.field2114];
            this.field1867 = new class100[super.field2116][super.field2114];
        } else if (this.field1886 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var15 = 0; var15 < arg6.length; ++var15) {
                if (arg6[var15] == -1) {
                    arg6[var15] = 0;
                } else {
                    arg6[var15] = class404.field5317[class390.method2237(arg6[var15], true) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var16 = 0; var16 < arg7.length; ++var16) {
                    if (arg7[var16] == -1) {
                        arg7[var16] = 0;
                    } else {
                        arg7[var16] = class404.field5317[class390.method2237(arg7[var16], true) & 65535] << 8 | 255;
                    }
                }
            }
            boolean var17 = true;
            int var18 = -1;
            int var19 = -1;
            int var20 = -1;
            int var21 = -1;
            if (arg2.length == 6) {
                for (int var22 = 0; var22 < 6; ++var22) {
                    if (arg2[var22] == 0 && arg4[var22] == 0) {
                        if (var18 != -1 && arg6[var18] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var18 = var22;
                    } else if (arg2[var22] == super.field2115 && arg4[var22] == 0) {
                        if (var19 != -1 && arg6[var19] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var19 = var22;
                    } else if (arg2[var22] == super.field2115 && arg4[var22] == super.field2115) {
                        if (var20 != -1 && arg6[var20] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var20 = var22;
                    } else if (arg2[var22] == 0 && arg4[var22] == super.field2115) {
                        if (var21 != -1 && arg6[var21] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var21 = var22;
                    }
                }
                if (var18 == -1 || var19 == -1 || var20 == -1 || var21 == -1) {
                    var17 = false;
                }
                if (var17) {
                    if (arg3 != null) {
                        for (int var23 = 0; var23 < 4; ++var23) {
                            if (arg3[var23] != 0) {
                                var17 = false;
                                break;
                            }
                        }
                    }
                    if (var17) {
                        for (int var24 = 1; var24 < 4; ++var24) {
                            if (arg2[var24] != arg2[0] && arg2[0] + super.field2115 != arg2[var24] && arg2[0] - super.field2115 != arg2[var24]) {
                                var17 = false;
                                break;
                            }
                            if (arg4[var24] != arg4[0] && arg4[0] + super.field2115 != arg4[var24] && arg4[0] - super.field2115 != arg4[var24]) {
                                var17 = false;
                                break;
                            }
                        }
                    }
                }
            } else {
                var17 = false;
            }
            if (var17) {
                class234 var25 = new class234();
                int var26 = arg6[0];
                int var27 = arg8[0];
                if (arg7 != null) {
                    var25.field2874 = arg7[0] >> 8;
                    if (var26 == 0) {
                        var25.field2876 = (byte) (var25.field2876 | 2);
                    }
                } else if (var26 == 0) {
                    return;
                }
                if (this.field1880[arg0 + 1][arg1] == this.field1880[arg0][arg1] && this.field1880[arg0 + 1][arg1 + 1] == this.field1880[arg0][arg1] && this.field1880[arg0][arg1 + 1] == this.field1880[arg0][arg1]) {
                    var25.field2876 = (byte) (var25.field2876 | 1);
                }
                if (var27 != -1 && (var25.field2876 & 2) == 0 && !this.field1872.field2481.method119(-118, var27).field2646) {
                    var25.field2873 = this.field1884[arg0][arg1] - this.field1874[arg0][arg1];
                    var25.field2875 = this.field1884[arg0 + 1][arg1] - this.field1874[arg0 + 1][arg1];
                    var25.field2881 = this.field1884[arg0 + 1][arg1 + 1] - this.field1874[arg0 + 1][arg1 + 1];
                    var25.field2882 = this.field1884[arg0][arg1 + 1] - this.field1874[arg0][arg1 + 1];
                    var25.field2879 = (short) var27;
                } else {
                    int var28;
                    if (arg5 != null && arg11 != 0) {
                        var28 = arg5[var18] * 255 / arg11;
                        if (var28 < 0) {
                            var28 = 0;
                        } else if (var28 > 255) {
                            var28 = 255;
                        }
                    } else {
                        var28 = 0;
                    }
                    var25.field2873 = class29.method163(method843(arg6[var18] >> 8, this.field1884[arg0][arg1] - this.field1874[arg0][arg1]), -8552, var28, arg10);
                    if (var25.field2874 != 0) {
                        var25.field2873 |= 255 - (this.field1884[arg0][arg1] - this.field1874[arg0][arg1]) << 25;
                    }
                    int var29;
                    if (arg5 != null && arg11 != 0) {
                        var29 = arg5[var19] * 255 / arg11;
                        if (var29 < 0) {
                            var29 = 0;
                        } else if (var29 > 255) {
                            var29 = 255;
                        }
                    } else {
                        var29 = 0;
                    }
                    var25.field2875 = class29.method163(method843(arg6[var19] >> 8, this.field1884[arg0 + 1][arg1] - this.field1874[arg0 + 1][arg1]), -8552, var29, arg10);
                    if (var25.field2874 != 0) {
                        var25.field2875 |= 255 - (this.field1884[arg0 + 1][arg1] - this.field1874[arg0 + 1][arg1]) << 25;
                    }
                    int var30;
                    if (arg5 != null && arg11 != 0) {
                        var30 = arg5[var20] * 255 / arg11;
                        if (var30 < 0) {
                            var30 = 0;
                        } else if (var30 > 255) {
                            var30 = 255;
                        }
                    } else {
                        var30 = 0;
                    }
                    var25.field2881 = class29.method163(method843(arg6[var20] >> 8, this.field1884[arg0 + 1][arg1 + 1] - this.field1874[arg0 + 1][arg1 + 1]), -8552, var30, arg10);
                    if (var25.field2874 != 0) {
                        var25.field2881 |= 255 - (this.field1884[arg0 + 1][arg1 + 1] - this.field1874[arg0 + 1][arg1 + 1]) << 25;
                    }
                    int var31;
                    if (arg5 != null && arg11 != 0) {
                        var31 = arg5[var21] * 255 / arg11;
                        if (var31 < 0) {
                            var31 = 0;
                        } else if (var31 > 255) {
                            var31 = 255;
                        }
                    } else {
                        var31 = 0;
                    }
                    var25.field2882 = class29.method163(method843(arg6[var21] >> 8, this.field1884[arg0][arg1 + 1] - this.field1874[arg0][arg1 + 1]), -8552, var31, arg10);
                    if (var25.field2874 != 0) {
                        var25.field2882 |= 255 - (this.field1884[arg0][arg1 + 1] - this.field1874[arg0][arg1 + 1]) << 25;
                    }
                    var25.field2879 = -1;
                }
                if (arg5 != null) {
                    var25.field2878 = (short) arg5[var20];
                    var25.field2883 = (short) arg5[var21];
                    var25.field2880 = (short) arg5[var19];
                    var25.field2877 = (short) arg5[var18];
                }
                this.field1870[arg0][arg1] = var25;
            } else {
                class100 var32 = new class100();
                var32.field1246 = (short) arg2.length;
                var32.field1245 = (short) (arg2.length / 3);
                var32.field1247 = new short[var32.field1246];
                var32.field1239 = new short[var32.field1246];
                var32.field1243 = new short[var32.field1246];
                var32.field1242 = new int[var32.field1246];
                if (arg5 != null) {
                    var32.field1240 = new short[var32.field1246];
                }
                for (int var33 = 0; var33 < var32.field1246; ++var33) {
                    int var48 = arg2[var33];
                    int var49 = arg4[var33];
                    boolean var50 = false;
                    int var51;
                    if (var48 == 0 && var49 == 0) {
                        var51 = this.field1884[arg0][arg1] - this.field1874[arg0][arg1];
                    } else if (var48 == 0 && super.field2115 == var49) {
                        var51 = this.field1884[arg0][arg1 + 1] - this.field1874[arg0][arg1 + 1];
                    } else if (super.field2115 == var48 && super.field2115 == var49) {
                        var51 = this.field1884[arg0 + 1][arg1 + 1] - this.field1874[arg0 + 1][arg1 + 1];
                    } else if (super.field2115 == var48 && var49 == 0) {
                        var51 = this.field1884[arg0 + 1][arg1] - this.field1874[arg0 + 1][arg1];
                    } else {
                        int var52 = (this.field1884[arg0 + 1][arg1] - this.field1874[arg0 + 1][arg1]) * var48 + (this.field1884[arg0][arg1] - this.field1874[arg0][arg1]) * (super.field2115 - var48);
                        int var53 = (this.field1884[arg0 + 1][arg1 + 1] - this.field1874[arg0 + 1][arg1 + 1]) * var48 + (this.field1884[arg0][arg1 + 1] - this.field1874[arg0][arg1 + 1]) * (super.field2115 - var48);
                        var51 = (super.field2115 - var49) * var52 + var49 * var53 >> super.field2111 * 2;
                    }
                    int var54 = (arg0 << super.field2111) + var48;
                    int var55 = (arg1 << super.field2111) + var49;
                    var32.field1247[var33] = (short) var48;
                    var32.field1243[var33] = (short) var49;
                    var32.field1239[var33] = (short) (this.method847(var54, var55) + (arg3 != null ? arg3[var33] : 0));
                    if (var51 < 0) {
                        var51 = 0;
                    }
                    if (arg8[var33] != -1 && !this.field1872.field2481.method119(-120, arg8[var33]).field2646) {
                        var32.field1242[var33] = var51;
                    } else if (arg6[var33] == 0) {
                        if (arg7 != null) {
                            var32.field1242[var33] = var51 << 25;
                        } else {
                            var32.field1242[var33] = 0;
                        }
                    } else {
                        int var56 = 0;
                        if (arg5 != null) {
                            short var57 = var32.field1240[var33] = (short) arg5[var33];
                            if (arg11 != 0) {
                                var56 = var57 * 255 / arg11;
                                if (var56 < 0) {
                                    var56 = 0;
                                } else if (var56 > 255) {
                                    var56 = 255;
                                }
                            }
                        }
                        var32.field1242[var33] = class29.method163(method843(arg6[var33] >> 8, var51), -8552, var56, arg10);
                        if (arg7 != null) {
                            var32.field1242[var33] |= var51 << 25;
                        }
                    }
                }
                boolean var34 = false;
                for (int var35 = 0; var35 < var32.field1245; ++var35) {
                    if (arg8[var35 * 3] != -1 && !this.field1872.field2481.method119(-125, arg8[var35 * 3]).field2646) {
                        var34 = true;
                    }
                }
                if (arg7 != null) {
                    var32.field1244 = new int[var32.field1245];
                }
                if (var34) {
                    var32.field1241 = new short[var32.field1245];
                    var32.field1238 = new short[var32.field1245];
                }
                for (int var36 = 0; var36 < var32.field1245; ++var36) {
                    int var37 = var36 * 3;
                    if (arg7 != null && arg7[var37] != 0) {
                        var32.field1244[var36] = arg7[var37] >> 8;
                    }
                    if (var34) {
                        int var38 = var37 + 1;
                        int var39 = var38 + 1;
                        boolean var40 = false;
                        boolean var41 = true;
                        int var42 = arg8[var37];
                        if (var42 != -1 && !this.field1872.field2481.method119(-125, var42).field2646) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var43 = arg8[var38];
                        if (var43 != -1 && !this.field1872.field2481.method119(-125, var43).field2646) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var44 = arg8[var39];
                        if (var44 != -1 && !this.field1872.field2481.method119(-118, var44).field2646) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        if (var41) {
                            var32.field1241[var36] = (short) var44;
                            var32.field1238[var36] = (short) arg9[var37];
                        } else {
                            if (var40) {
                                int var45 = arg8[var37];
                                if (var45 != -1 && !this.field1872.field2481.method119(-125, var45).field2646) {
                                    var32.field1242[var37] = class404.field5317[class390.method2237(this.field1872.field2481.method119(-110, var45).field2641 & 65535, true) & 65535];
                                }
                                int var46 = arg8[var38];
                                if (var46 != -1 && !this.field1872.field2481.method119(-127, var46).field2646) {
                                    var32.field1242[var38] = class404.field5317[class390.method2237(this.field1872.field2481.method119(-126, var46).field2641 & 65535, true) & 65535];
                                }
                                int var47 = arg8[var39];
                                if (var47 != -1 && !this.field1872.field2481.method119(-109, var47).field2646) {
                                    var32.field1242[var39] = class404.field5317[class390.method2237(this.field1872.field2481.method119(-119, var47).field2641 & 65535, true) & 65535];
                                }
                            }
                            var32.field1241[var36] = -1;
                        }
                    }
                }
                this.field1867[arg0][arg1] = var32;
            }
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lcba;[I)V", line = 799)
    public final void method850(class469 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(Lk;IIIIZ)Z", line = 804)
    public final boolean method851(class483 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!sq", name = "X", descriptor = "(IILk;)Lk;", line = 812)
    public final class483 method853(int arg0, int arg1, class483 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(III[[ZZ)V", line = 817)
    public final void method854(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class487 var6 = this.field1872.field6151;
        this.field1868 = -1;
        this.field1883 = var6.field6804;
        this.field1878 = var6.field6801;
        this.field1885 = var6.field6805;
        this.field1882 = var6.field6802;
        this.field1866 = var6.field6809;
        this.field1881 = var6.field6803;
        this.field1879 = var6.field6806;
        this.field1887 = var6.field6810;
        this.field1873 = var6.field6807;
        this.field1871 = var6.field6811;
        this.field1876 = var6.field6808;
        this.field1877 = var6.field6800;
    }

    @OriginalMember(owner = "client!sq", name = "ba", descriptor = "(II)I", line = 835)
    public final int method855(int arg0, int arg1) {
        return this.field1880[arg0][arg1];
    }

    @OriginalMember(owner = "client!sq", name = "<init>", descriptor = "(Lhr;IIII[[I[[II)V", line = 841)
    public class153(class446 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field1872 = arg0;
        this.field1869 = arg2;
        this.field1880 = arg5;
        this.field1884 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field1872.field6163 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field1872.field6157 * var18 + this.field1872.field6180 * var16 + this.field1872.field6148 * var17 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field1884[var11][var10] = (byte) var20;
            }
        }
        this.field1874 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!sq", name = "b", descriptor = "(I)Z", line = 893)
    public final boolean method856(int arg0) {
        if ((this.field1869 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(II)V")
    public abstract void method844(int arg0, int arg1);

    @OriginalMember(owner = "client!sq", name = "a", descriptor = "(IIIIIII[[Z)V")
    public abstract void method852(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7);
}
