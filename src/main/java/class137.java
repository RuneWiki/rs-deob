import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hi")
public class class137 extends class35 {

    @OriginalMember(owner = "client!hi", name = "D", descriptor = "I")
    private int field1961 = -1;

    @OriginalMember(owner = "client!hi", name = "l", descriptor = "Lhh;")
    private class84 field1943;

    @OriginalMember(owner = "client!hi", name = "q", descriptor = "I")
    private int field1948;

    @OriginalMember(owner = "client!hi", name = "B", descriptor = "[[I")
    public int[][] field1959;

    @OriginalMember(owner = "client!hi", name = "j", descriptor = "[[B")
    private byte[][] field1941;

    @OriginalMember(owner = "client!hi", name = "p", descriptor = "[[B")
    private byte[][] field1947;

    @OriginalMember(owner = "client!hi", name = "k", descriptor = "I")
    private int field1942;

    @OriginalMember(owner = "client!hi", name = "n", descriptor = "I")
    private int field1945;

    @OriginalMember(owner = "client!hi", name = "o", descriptor = "I")
    private int field1946;

    @OriginalMember(owner = "client!hi", name = "r", descriptor = "I")
    private int field1949;

    @OriginalMember(owner = "client!hi", name = "s", descriptor = "I")
    private int field1950;

    @OriginalMember(owner = "client!hi", name = "v", descriptor = "I")
    private int field1953;

    @OriginalMember(owner = "client!hi", name = "w", descriptor = "I")
    private int field1954;

    @OriginalMember(owner = "client!hi", name = "x", descriptor = "I")
    private int field1955;

    @OriginalMember(owner = "client!hi", name = "y", descriptor = "I")
    private int field1956;

    @OriginalMember(owner = "client!hi", name = "z", descriptor = "I")
    private int field1957;

    @OriginalMember(owner = "client!hi", name = "A", descriptor = "I")
    private int field1958;

    @OriginalMember(owner = "client!hi", name = "C", descriptor = "I")
    private int field1960;

    @OriginalMember(owner = "client!hi", name = "t", descriptor = "[[Loq;")
    private class239[][] field1951;

    @OriginalMember(owner = "client!hi", name = "m", descriptor = "[[Lro;")
    private class2[][] field1944;

    @OriginalMember(owner = "client!hi", name = "u", descriptor = "[[Lis;")
    private class346[][] field1952;

    @OriginalMember(owner = "client!hi", name = "i", descriptor = "[[Lvs;")
    private class416[][] field1940;

    @OriginalMember(owner = "client!hi", name = "U", descriptor = "(Lj;IIIIZ)V", line = 2)
    public final void method281(class377 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lor;[I)V", line = 7)
    public final void method271(class451 arg0, int[] arg1) {
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIIII[[Z)V", line = 14)
    public final void method278(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        class157 var9 = this.field1943.method591(Thread.currentThread());
        class472 var10 = var9.field2285;
        var10.field6491 = 0;
        var10.field6495 = false;
        if (this.field1940 != null) {
            this.method975(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field2307, var9.field2312);
        } else {
            if (this.field1952 != null) {
                this.method974(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, var10, var9.field2307, var9.field2312);
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "f", descriptor = "()V", line = 28)
    public final void method268() {
        this.field1941 = null;
        this.field1947 = null;
    }

    @OriginalMember(owner = "client!hi", name = "<init>", descriptor = "(Lhh;IIII[[I[[II)V", line = 32)
    public class137(class84 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4, arg7);
        this.field1943 = arg0;
        this.field1948 = arg2;
        this.field1959 = arg5;
        this.field1941 = new byte[arg3 + 1][arg4 + 1];
        int var9 = this.field1943.field1251 >> 9;
        for (int var10 = 1; var10 < arg4; ++var10) {
            for (int var11 = 1; var11 < arg3; ++var11) {
                int var13 = arg6[var11 + 1][var10] - arg6[var11 - 1][var10];
                int var14 = arg6[var11][var10 + 1] - arg6[var11][var10 - 1];
                int var15 = (int) Math.sqrt((double) (var14 * var14 + arg7 * 512 + var13 * var13));
                int var16 = (var13 << 8) / var15;
                int var17 = arg7 * -512 / var15;
                int var18 = (var14 << 8) / var15;
                int var19 = (this.field1943.field1274 * var18 + this.field1943.field1267 * var17 + this.field1943.field1265 * var16 >> 17) + var9;
                int var20 = var19 >> 1;
                if (var20 < 2) {
                    var20 = 2;
                } else if (var20 > 126) {
                    var20 = 126;
                }
                this.field1941[var11][var10] = (byte) var20;
            }
        }
        this.field1947 = new byte[arg3 + 1][arg4 + 1];
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIIIIII[[ZLab;[I[I)V", line = 83)
    private final void method974(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class472 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field6499 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field1952[var16][var17] != null) {
                        class346 var18 = this.field1952[var16][var17];
                        if (var18.field4560 != -1 && (var18.field4565 & 2) == 0 && var18.field4561 == -1) {
                            int var19 = this.field1943.method599(var18.field4560);
                            arg8.method2691(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class266.method1598(var18.field4566 & 65535, var19, (byte) 44), class266.method1598(var18.field4562 & 65535, var19, (byte) -121), class266.method1598(var18.field4563 & 65535, var19, (byte) 26));
                            arg8.method2691(var15, var15, var15 - var13, var14, var13 + var14, var14, class266.method1598(var18.field4564 & 65535, var19, (byte) -104), class266.method1598(var18.field4563 & 65535, var19, (byte) -120), class266.method1598(var18.field4562 & 65535, var19, (byte) 61));
                        } else if (var18.field4561 == -1) {
                            arg8.method2691(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field4566 & 65535, var18.field4562 & 65535, var18.field4563 & 65535);
                            arg8.method2691(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field4564 & 65535, var18.field4563 & 65535, var18.field4562 & 65535);
                        } else {
                            int var20 = var18.field4561;
                            arg8.method2691(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var20, var20, var20);
                            arg8.method2691(var15, var15, var15 - var13, var14, var13 + var14, var14, var20, var20, var20);
                        }
                    } else if (this.field1951[var16][var17] != null) {
                        class239 var21 = this.field1951[var16][var17];
                        for (int var22 = 0; var22 < var21.field3191; ++var22) {
                            arg9[var22] = var21.field3198[var22] * var13 / super.field555 + var14;
                            arg10[var22] = var15 - var21.field3194[var22] * var13 / super.field555;
                        }
                        for (int var23 = 0; var23 < var21.field3192; ++var23) {
                            short var24 = var21.field3200[var23];
                            short var25 = var21.field3193[var23];
                            short var26 = var21.field3201[var23];
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field3196 != null && var21.field3196[var23] != -1) {
                                int var33 = var21.field3196[var23];
                                arg8.method2691(var30, var31, var32, var27, var28, var29, class266.method1598(var21.field3197[var24], var33, (byte) -94), class266.method1598(var21.field3197[var25], var33, (byte) -114), class266.method1598(var21.field3197[var26], var33, (byte) -99));
                            } else if (var21.field3202 != null && var21.field3202[var23] != -1) {
                                int var34 = this.field1943.method599(var21.field3202[var23]);
                                arg8.method2691(var30, var31, var32, var27, var28, var29, class266.method1598(var21.field3197[var24], var34, (byte) -110), class266.method1598(var21.field3197[var25], var34, (byte) 52), class266.method1598(var21.field3197[var26], var34, (byte) 113));
                            } else {
                                int var35 = var21.field3199[var23];
                                arg8.method2691(var30, var31, var32, var27, var28, var29, class266.method1598(var21.field3197[var24], var35, (byte) -122), class266.method1598(var21.field3197[var25], var35, (byte) -123), class266.method1598(var21.field3197[var26], var35, (byte) 105));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field6499 = true;
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(IIIIIII[[ZLab;[I[I)V", line = 215)
    private final void method975(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7, class472 arg8, int[] arg9, int[] arg10) {
        int var12 = (arg6 - arg4) * arg2 / 256;
        int var13 = arg2 >> 8;
        arg8.field6499 = false;
        int var14 = arg0;
        int var15 = arg1 + var12;
        for (int var16 = arg3; var16 < arg5; ++var16) {
            for (int var17 = arg4; var17 < arg6; ++var17) {
                if (arg7[var16 - arg3][var17 - arg4]) {
                    if (this.field1940[var16][var17] != null) {
                        class416 var18 = this.field1940[var16][var17];
                        if (var18.field5745 != -1 && (var18.field5741 & 2) == 0 && var18.field5740 == 0) {
                            int var19 = this.field1943.method599(var18.field5745);
                            arg8.method2691(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class266.method1598(var18.field5744, var19, (byte) 77), class266.method1598(var18.field5743, var19, (byte) 66), class266.method1598(var18.field5739, var19, (byte) 109));
                            arg8.method2691(var15, var15, var15 - var13, var14, var13 + var14, var14, class266.method1598(var18.field5742, var19, (byte) 82), class266.method1598(var18.field5739, var19, (byte) -95), class266.method1598(var18.field5743, var19, (byte) -114));
                        } else if (var18.field5740 == 0) {
                            arg8.method2693(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, var18.field5744, var18.field5743, var18.field5739);
                            arg8.method2693(var15, var15, var15 - var13, var14, var13 + var14, var14, var18.field5742, var18.field5739, var18.field5743);
                        } else {
                            int var20 = var18.field5740;
                            arg8.method2693(var15 - var13, var15 - var13, var15, var13 + var14, var14, var13 + var14, class1.method2(var18.field5744 & -16777216, -115, var20), class1.method2(var18.field5743 & -16777216, 127, var20), class1.method2(var18.field5739 & -16777216, 89, var20));
                            arg8.method2693(var15, var15, var15 - var13, var14, var13 + var14, var14, class1.method2(var18.field5742 & -16777216, 48, var20), class1.method2(var18.field5739 & -16777216, 81, var20), class1.method2(var18.field5743 & -16777216, 84, var20));
                        }
                    } else if (this.field1944[var16][var17] != null) {
                        class2 var21 = this.field1944[var16][var17];
                        for (int var22 = 0; var22 < var21.field100; ++var22) {
                            arg9[var22] = var21.field105[var22] * var13 / super.field555 + var14;
                            arg10[var22] = var15 - var21.field103[var22] * var13 / super.field555;
                        }
                        for (int var23 = 0; var23 < var21.field98; ++var23) {
                            int var24 = var23 * 3;
                            int var25 = var24 + 1;
                            int var26 = var25 + 1;
                            int var27 = arg9[var24];
                            int var28 = arg9[var25];
                            int var29 = arg9[var26];
                            int var30 = arg10[var24];
                            int var31 = arg10[var25];
                            int var32 = arg10[var26];
                            if (var21.field102 == null || var21.field102[var23] == 0 || var21.field99 != null && (var21.field99 == null || var21.field99[var23] != -1)) {
                                if (var21.field99 != null && var21.field99[var23] != -1) {
                                    int var34 = this.field1943.method599(var21.field99[var23]);
                                    arg8.method2691(var30, var31, var32, var27, var28, var29, var34, var34, var34);
                                } else {
                                    arg8.method2693(var30, var31, var32, var27, var28, var29, var21.field101[var24], var21.field101[var25], var21.field101[var26]);
                                }
                            } else {
                                int var33 = var21.field102[var23];
                                arg8.method2693(var30, var31, var32, var27, var28, var29, class1.method2(-16777216 - (var21.field101[var24] & -16777216), -109, var33), class1.method2(-16777216 - (var21.field101[var25] & -16777216), -93, var33), class1.method2(-16777216 - (var21.field101[var26] & -16777216), 55, var33));
                            }
                        }
                    }
                }
                var15 -= var13;
            }
            var15 = arg1 + var12;
            var14 += var13;
        }
        arg8.field6499 = true;
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(III[[ZZ)V", line = 345)
    public final void method270(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        class408 var6 = this.field1943.field1254;
        this.field1961 = -1;
        this.field1946 = var6.field5598;
        this.field1956 = var6.field5605;
        this.field1950 = var6.field5604;
        this.field1945 = var6.field5595;
        this.field1955 = var6.field5596;
        this.field1949 = var6.field5599;
        this.field1953 = var6.field5600;
        this.field1957 = var6.field5601;
        this.field1942 = var6.field5597;
        this.field1954 = var6.field5594;
        this.field1958 = var6.field5603;
        this.field1960 = var6.field5602;
    }

    @OriginalMember(owner = "client!hi", name = "O", descriptor = "(IILj;)Lj;", line = 361)
    public final class377 method279(int arg0, int arg1, class377 arg2) {
        return null;
    }

    @OriginalMember(owner = "client!hi", name = "JA", descriptor = "(II[I[I[I[I[I[I[I[IIIIZ)V", line = 365)
    public final void method280(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int arg10, int arg11, int arg12, boolean arg13) {
        if (this.field1940 == null) {
            this.field1940 = new class416[super.field557][super.field559];
            this.field1944 = new class2[super.field557][super.field559];
        } else if (this.field1952 != null) {
            throw new IllegalStateException();
        }
        if (arg2 != null && arg2.length != 0) {
            for (int var15 = 0; var15 < arg6.length; ++var15) {
                if (arg6[var15] == -1) {
                    arg6[var15] = 0;
                } else {
                    arg6[var15] = class80.field1185[class479.method2745(72, arg6[var15]) & 65535] << 8 | 255;
                }
            }
            if (arg7 != null) {
                for (int var16 = 0; var16 < arg7.length; ++var16) {
                    if (arg7[var16] == -1) {
                        arg7[var16] = 0;
                    } else {
                        arg7[var16] = class80.field1185[class479.method2745(39, arg7[var16]) & 65535] << 8 | 255;
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
                    } else if (arg2[var22] == super.field555 && arg4[var22] == 0) {
                        if (var19 != -1 && arg6[var19] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var19 = var22;
                    } else if (arg2[var22] == super.field555 && arg4[var22] == super.field555) {
                        if (var20 != -1 && arg6[var20] != arg6[var22]) {
                            var17 = false;
                            break;
                        }
                        var20 = var22;
                    } else if (arg2[var22] == 0 && arg4[var22] == super.field555) {
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
                            if (arg2[var24] != arg2[0] && arg2[0] + super.field555 != arg2[var24] && arg2[0] - super.field555 != arg2[var24]) {
                                var17 = false;
                                break;
                            }
                            if (arg4[var24] != arg4[0] && arg4[0] + super.field555 != arg4[var24] && arg4[0] - super.field555 != arg4[var24]) {
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
                class416 var25 = new class416();
                int var26 = arg6[0];
                int var27 = arg8[0];
                if (arg7 != null) {
                    var25.field5740 = arg7[0] >> 8;
                    if (var26 == 0) {
                        var25.field5741 = (byte) (var25.field5741 | 2);
                    }
                } else if (var26 == 0) {
                    return;
                }
                if (this.field1959[arg0 + 1][arg1] == this.field1959[arg0][arg1] && this.field1959[arg0 + 1][arg1 + 1] == this.field1959[arg0][arg1] && this.field1959[arg0][arg1 + 1] == this.field1959[arg0][arg1]) {
                    var25.field5741 = (byte) (var25.field5741 | 1);
                }
                if (var27 != -1 && (var25.field5741 & 2) == 0 && !this.field1943.field2375.method677(2459, var27).field3638) {
                    var25.field5742 = this.field1941[arg0][arg1] - this.field1947[arg0][arg1];
                    var25.field5739 = this.field1941[arg0 + 1][arg1] - this.field1947[arg0 + 1][arg1];
                    var25.field5744 = this.field1941[arg0 + 1][arg1 + 1] - this.field1947[arg0 + 1][arg1 + 1];
                    var25.field5743 = this.field1941[arg0][arg1 + 1] - this.field1947[arg0][arg1 + 1];
                    var25.field5745 = (short) var27;
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
                    var25.field5742 = class501.method2863(method979(arg6[var18] >> 8, this.field1941[arg0][arg1] - this.field1947[arg0][arg1]), (byte) -103, arg10, var28);
                    if (var25.field5740 != 0) {
                        var25.field5742 |= 255 - (this.field1941[arg0][arg1] - this.field1947[arg0][arg1]) << 25;
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
                    var25.field5739 = class501.method2863(method979(arg6[var19] >> 8, this.field1941[arg0 + 1][arg1] - this.field1947[arg0 + 1][arg1]), (byte) -106, arg10, var29);
                    if (var25.field5740 != 0) {
                        var25.field5739 |= 255 - (this.field1941[arg0 + 1][arg1] - this.field1947[arg0 + 1][arg1]) << 25;
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
                    var25.field5744 = class501.method2863(method979(arg6[var20] >> 8, this.field1941[arg0 + 1][arg1 + 1] - this.field1947[arg0 + 1][arg1 + 1]), (byte) 117, arg10, var30);
                    if (var25.field5740 != 0) {
                        var25.field5744 |= 255 - (this.field1941[arg0 + 1][arg1 + 1] - this.field1947[arg0 + 1][arg1 + 1]) << 25;
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
                    var25.field5743 = class501.method2863(method979(arg6[var21] >> 8, this.field1941[arg0][arg1 + 1] - this.field1947[arg0][arg1 + 1]), (byte) -118, arg10, var31);
                    if (var25.field5740 != 0) {
                        var25.field5743 |= 255 - (this.field1941[arg0][arg1 + 1] - this.field1947[arg0][arg1 + 1]) << 25;
                    }
                    var25.field5745 = -1;
                }
                if (arg5 != null) {
                    var25.field5736 = (short) arg5[var20];
                    var25.field5738 = (short) arg5[var21];
                    var25.field5746 = (short) arg5[var19];
                    var25.field5737 = (short) arg5[var18];
                }
                this.field1940[arg0][arg1] = var25;
            } else {
                class2 var32 = new class2();
                var32.field100 = (short) arg2.length;
                var32.field98 = (short) (arg2.length / 3);
                var32.field105 = new short[var32.field100];
                var32.field104 = new short[var32.field100];
                var32.field103 = new short[var32.field100];
                var32.field101 = new int[var32.field100];
                if (arg5 != null) {
                    var32.field97 = new short[var32.field100];
                }
                for (int var33 = 0; var33 < var32.field100; ++var33) {
                    int var48 = arg2[var33];
                    int var49 = arg4[var33];
                    boolean var50 = false;
                    int var51;
                    if (var48 == 0 && var49 == 0) {
                        var51 = this.field1941[arg0][arg1] - this.field1947[arg0][arg1];
                    } else if (var48 == 0 && super.field555 == var49) {
                        var51 = this.field1941[arg0][arg1 + 1] - this.field1947[arg0][arg1 + 1];
                    } else if (super.field555 == var48 && super.field555 == var49) {
                        var51 = this.field1941[arg0 + 1][arg1 + 1] - this.field1947[arg0 + 1][arg1 + 1];
                    } else if (super.field555 == var48 && var49 == 0) {
                        var51 = this.field1941[arg0 + 1][arg1] - this.field1947[arg0 + 1][arg1];
                    } else {
                        int var52 = (this.field1941[arg0 + 1][arg1] - this.field1947[arg0 + 1][arg1]) * var48 + (this.field1941[arg0][arg1] - this.field1947[arg0][arg1]) * (super.field555 - var48);
                        int var53 = (this.field1941[arg0 + 1][arg1 + 1] - this.field1947[arg0 + 1][arg1 + 1]) * var48 + (this.field1941[arg0][arg1 + 1] - this.field1947[arg0][arg1 + 1]) * (super.field555 - var48);
                        var51 = (super.field555 - var49) * var52 + var49 * var53 >> super.field558 * 2;
                    }
                    int var54 = (arg0 << super.field558) + var48;
                    int var55 = (arg1 << super.field558) + var49;
                    var32.field105[var33] = (short) var48;
                    var32.field103[var33] = (short) var49;
                    var32.field104[var33] = (short) (this.method276(var54, var55) + (arg3 != null ? arg3[var33] : 0));
                    if (var51 < 0) {
                        var51 = 0;
                    }
                    if (arg8[var33] != -1 && !this.field1943.field2375.method677(2459, arg8[var33]).field3638) {
                        var32.field101[var33] = var51;
                    } else if (arg6[var33] == 0) {
                        if (arg7 != null) {
                            var32.field101[var33] = var51 << 25;
                        } else {
                            var32.field101[var33] = 0;
                        }
                    } else {
                        int var56 = 0;
                        if (arg5 != null) {
                            short var57 = var32.field97[var33] = (short) arg5[var33];
                            if (arg11 != 0) {
                                var56 = var57 * 255 / arg11;
                                if (var56 < 0) {
                                    var56 = 0;
                                } else if (var56 > 255) {
                                    var56 = 255;
                                }
                            }
                        }
                        var32.field101[var33] = class501.method2863(method979(arg6[var33] >> 8, var51), (byte) 109, arg10, var56);
                        if (arg7 != null) {
                            var32.field101[var33] |= var51 << 25;
                        }
                    }
                }
                boolean var34 = false;
                for (int var35 = 0; var35 < var32.field98; ++var35) {
                    if (arg8[var35 * 3] != -1 && !this.field1943.field2375.method677(2459, arg8[var35 * 3]).field3638) {
                        var34 = true;
                    }
                }
                if (arg7 != null) {
                    var32.field102 = new int[var32.field98];
                }
                if (var34) {
                    var32.field99 = new short[var32.field98];
                    var32.field106 = new short[var32.field98];
                }
                for (int var36 = 0; var36 < var32.field98; ++var36) {
                    int var37 = var36 * 3;
                    if (arg7 != null && arg7[var37] != 0) {
                        var32.field102[var36] = arg7[var37] >> 8;
                    }
                    if (var34) {
                        int var38 = var37 + 1;
                        int var39 = var38 + 1;
                        boolean var40 = false;
                        boolean var41 = true;
                        int var42 = arg8[var37];
                        if (var42 != -1 && !this.field1943.field2375.method677(2459, var42).field3638) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var43 = arg8[var38];
                        if (var43 != -1 && !this.field1943.field2375.method677(2459, var43).field3638) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        int var44 = arg8[var39];
                        if (var44 != -1 && !this.field1943.field2375.method677(2459, var44).field3638) {
                            var40 = true;
                        } else {
                            var41 = false;
                        }
                        if (var41) {
                            var32.field99[var36] = (short) var44;
                            var32.field106[var36] = (short) arg9[var37];
                        } else {
                            if (var40) {
                                int var45 = arg8[var37];
                                if (var45 != -1 && !this.field1943.field2375.method677(2459, var45).field3638) {
                                    var32.field101[var37] = class80.field1185[class479.method2745(-114, this.field1943.field2375.method677(2459, var45).field3647 & 65535) & 65535];
                                }
                                int var46 = arg8[var38];
                                if (var46 != -1 && !this.field1943.field2375.method677(2459, var46).field3638) {
                                    var32.field101[var38] = class80.field1185[class479.method2745(-110, this.field1943.field2375.method677(2459, var46).field3647 & 65535) & 65535];
                                }
                                int var47 = arg8[var39];
                                if (var47 != -1 && !this.field1943.field2375.method677(2459, var47).field3638) {
                                    var32.field101[var39] = class80.field1185[class479.method2745(100, this.field1943.field2375.method677(2459, var47).field3647 & 65535) & 65535];
                                }
                            }
                            var32.field99[var36] = -1;
                        }
                    }
                }
                this.field1944[arg0][arg1] = var32;
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[I[IIIIZ)V", line = 862)
    public final void method275(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int[] arg12, int arg13, int arg14, int arg15, boolean arg16) {
        if (this.field1952 == null) {
            this.field1952 = new class346[super.field557][super.field559];
            this.field1951 = new class239[super.field557][super.field559];
        } else if (this.field1940 != null) {
            throw new IllegalStateException();
        }
        boolean var18 = false;
        if (arg9.length == 2 && arg6.length == 2 && (arg9[0] == arg9[1] || arg11[0] != -1 && arg11[0] == arg11[1])) {
            var18 = true;
            for (int var19 = 1; var19 < 2; ++var19) {
                int var20 = arg2[arg6[var19]];
                int var21 = arg4[arg6[var19]];
                if (var20 != 0 && super.field555 != var20 || var21 != 0 && super.field555 != var21) {
                    var18 = false;
                    break;
                }
            }
        }
        if (!var18) {
            class239 var22 = new class239();
            short var23 = (short) arg2.length;
            short var24 = (short) arg9.length;
            var22.field3191 = var23;
            var22.field3197 = new short[var23];
            var22.field3198 = new short[var23];
            var22.field3190 = new short[var23];
            var22.field3194 = new short[var23];
            for (int var25 = 0; var25 < var23; ++var25) {
                int var30 = arg2[var25];
                int var31 = arg4[var25];
                if (var30 == 0 && var31 == 0) {
                    var22.field3197[var25] = (short) (this.field1941[arg0][arg1] - this.field1947[arg0][arg1]);
                } else if (var30 == 0 && super.field555 == var31) {
                    var22.field3197[var25] = (short) (this.field1941[arg0][arg1 + 1] - this.field1947[arg0][arg1 + 1]);
                } else if (super.field555 == var30 && super.field555 == var31) {
                    var22.field3197[var25] = (short) (this.field1941[arg0 + 1][arg1 + 1] - this.field1947[arg0 + 1][arg1 + 1]);
                } else if (super.field555 == var30 && var31 == 0) {
                    var22.field3197[var25] = (short) (this.field1941[arg0 + 1][arg1] - this.field1947[arg0 + 1][arg1]);
                } else {
                    int var32 = (this.field1941[arg0 + 1][arg1] - this.field1947[arg0 + 1][arg1]) * var30 + (this.field1941[arg0][arg1] - this.field1947[arg0][arg1]) * (super.field555 - var30);
                    int var33 = (this.field1941[arg0 + 1][arg1 + 1] - this.field1947[arg0 + 1][arg1 + 1]) * var30 + (this.field1941[arg0][arg1 + 1] - this.field1947[arg0][arg1 + 1]) * (super.field555 - var30);
                    var22.field3197[var25] = (short) ((super.field555 - var31) * var32 + var31 * var33 >> super.field558 * 2);
                }
                int var34 = (arg0 << super.field558) + var30;
                int var35 = (arg1 << super.field558) + var31;
                var22.field3198[var25] = (short) var30;
                var22.field3194[var25] = (short) var31;
                var22.field3190[var25] = (short) (this.method276(var34, var35) + (arg3 != null ? arg3[var25] : 0));
                if (var22.field3197[var25] < 2) {
                    var22.field3197[var25] = 2;
                }
            }
            boolean var26 = false;
            int var27 = 0;
            for (int var28 = 0; var28 < var24; ++var28) {
                if (arg9[var28] >= 0 || arg10 != null && arg10[var28] >= 0) {
                    ++var27;
                }
                if (arg11[var28] != -1 && !this.field1943.field2375.method677(2459, arg11[var28]).field3638) {
                    var26 = true;
                }
            }
            var22.field3199 = new int[var27];
            if (arg10 != null) {
                var22.field3196 = new int[var27];
            }
            var22.field3200 = new short[var27];
            var22.field3193 = new short[var27];
            var22.field3201 = new short[var27];
            if (var26) {
                var22.field3202 = new short[var27];
                var22.field3195 = new short[var27];
            }
            for (int var29 = 0; var29 < var24; ++var29) {
                if (arg9[var29] >= 0 || arg10 != null && arg10[var29] >= 0) {
                    if (arg9[var29] >= 0) {
                        var22.field3199[var22.field3192] = class479.method2745(42, arg9[var29]);
                    } else {
                        var22.field3199[var22.field3192] = -1;
                    }
                    if (arg10 != null) {
                        if (arg10[var29] != -1) {
                            var22.field3196[var22.field3192] = class479.method2745(-81, arg10[var29]);
                        } else {
                            var22.field3196[var22.field3192] = -1;
                        }
                    }
                    var22.field3200[var22.field3192] = (short) arg6[var29];
                    var22.field3193[var22.field3192] = (short) arg7[var29];
                    var22.field3201[var22.field3192] = (short) arg8[var29];
                    if (var26) {
                        if (arg11[var29] != -1 && !this.field1943.field2375.method677(2459, arg11[var29]).field3638) {
                            var22.field3202[var22.field3192] = (short) arg11[var29];
                            var22.field3195[var22.field3192] = (short) arg12[var29];
                        } else {
                            var22.field3202[var22.field3192] = -1;
                        }
                    }
                    ++var22.field3192;
                }
            }
            this.field1951[arg0][arg1] = var22;
        } else {
            if (arg9[0] >= 0 || arg10 != null && arg10[0] >= 0) {
                class346 var36 = new class346();
                int var37 = arg9[0];
                int var38 = arg11[0];
                if (arg10 != null) {
                    var36.field4561 = class266.method1598(this.field1941[arg0][arg1] - this.field1947[arg0][arg1], class479.method2745(-113, arg10[0]), (byte) 28);
                    if (var37 == -1) {
                        var36.field4565 = (byte) (var36.field4565 | 2);
                    }
                }
                if (this.field1959[arg0 + 1][arg1] == this.field1959[arg0][arg1] && this.field1959[arg0 + 1][arg1 + 1] == this.field1959[arg0][arg1] && this.field1959[arg0][arg1 + 1] == this.field1959[arg0][arg1]) {
                    var36.field4565 = (byte) (var36.field4565 | 1);
                }
                if (var38 != -1 && (var36.field4565 & 2) == 0 && !this.field1943.field2375.method677(2459, var38).field3638) {
                    var36.field4564 = (short) (this.field1941[arg0][arg1] - this.field1947[arg0][arg1]);
                    var36.field4563 = (short) (this.field1941[arg0 + 1][arg1] - this.field1947[arg0 + 1][arg1]);
                    var36.field4566 = (short) (this.field1941[arg0 + 1][arg1 + 1] - this.field1947[arg0 + 1][arg1 + 1]);
                    var36.field4562 = (short) (this.field1941[arg0][arg1 + 1] - this.field1947[arg0][arg1 + 1]);
                    var36.field4560 = (short) var38;
                } else {
                    short var39 = class479.method2745(-90, var37);
                    var36.field4564 = (short) class266.method1598(this.field1941[arg0][arg1] - this.field1947[arg0][arg1], var39, (byte) 84);
                    var36.field4563 = (short) class266.method1598(this.field1941[arg0 + 1][arg1] - this.field1947[arg0 + 1][arg1], var39, (byte) -110);
                    var36.field4566 = (short) class266.method1598(this.field1941[arg0 + 1][arg1 + 1] - this.field1947[arg0 + 1][arg1 + 1], var39, (byte) -126);
                    var36.field4562 = (short) class266.method1598(this.field1941[arg0][arg1 + 1] - this.field1947[arg0][arg1 + 1], var39, (byte) 75);
                    var36.field4560 = -1;
                }
                this.field1952[arg0][arg1] = var36;
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(Lj;IIIIZ)Z", line = 1092)
    public final boolean method269(class377 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        return false;
    }

    @OriginalMember(owner = "client!hi", name = "SA", descriptor = "(Lj;IIIIZ)V", line = 1097)
    public final void method266(class377 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IIZLab;[I[I[I)V", line = 1102)
    private final void method976(int arg0, int arg1, boolean arg2, class472 arg3, int[] arg4, int[] arg5, int[] arg6) {
        class416 var8 = this.field1940[arg0][arg1];
        if (var8 != null) {
            if ((var8.field5741 & 2) == 0) {
                int var9 = super.field555 * arg0;
                int var10 = super.field555 + var9;
                int var11 = super.field555 * arg1;
                int var12 = super.field555 + var11;
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
                if ((var8.field5741 & 1) != 0 && !arg2) {
                    int var17 = this.field1959[arg0][arg1];
                    if (this.field1961 == -1) {
                        int var18 = this.field1954 * var17;
                        var19 = (this.field1958 * var11 + this.field1942 * var9 + var18 >> 15) + this.field1960;
                        if (var19 <= this.field1943.field1268) {
                            return;
                        }
                        var20 = (this.field1958 * var11 + this.field1942 * var10 + var18 >> 15) + this.field1960;
                        if (var20 <= this.field1943.field1268) {
                            return;
                        }
                        var21 = (this.field1958 * var12 + this.field1942 * var10 + var18 >> 15) + this.field1960;
                        if (var21 <= this.field1943.field1268) {
                            return;
                        }
                        var22 = (this.field1958 * var12 + this.field1942 * var9 + var18 >> 15) + this.field1960;
                        if (var22 <= this.field1943.field1268) {
                            return;
                        }
                    } else {
                        var22 = this.field1961;
                        var21 = this.field1961;
                        var20 = this.field1961;
                        var19 = this.field1961;
                    }
                    if (this.field1943.field1288) {
                        int var23 = var19 - this.field1943.field1250;
                        if (var23 > 0) {
                            var13 = var23;
                            if (var23 > 255) {
                                var13 = 255;
                            }
                        }
                        int var24 = var20 - this.field1943.field1250;
                        if (var24 > 0) {
                            var14 = var24;
                            if (var24 > 255) {
                                var14 = 255;
                            }
                        }
                        int var25 = var21 - this.field1943.field1250;
                        if (var25 > 0) {
                            var15 = var25;
                            if (var25 > 255) {
                                var15 = 255;
                            }
                        }
                        int var26 = var22 - this.field1943.field1250;
                        if (var26 > 0) {
                            var16 = var26;
                            if (var26 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    int var27 = this.field1956 * var17;
                    int var28 = this.field1949 * var17;
                    var29 = (this.field1950 * var11 + this.field1946 * var9 + var27 >> 15) + this.field1945;
                    var30 = this.field1943.field1249 * var29 / var19 + arg3.field6492;
                    var31 = (this.field1953 * var11 + this.field1955 * var9 + var28 >> 15) + this.field1957;
                    var32 = this.field1943.field1279 * var31 / var19 + arg3.field6493;
                    var33 = (this.field1950 * var11 + this.field1946 * var10 + var27 >> 15) + this.field1945;
                    var34 = this.field1943.field1249 * var33 / var20 + arg3.field6492;
                    var35 = (this.field1953 * var11 + this.field1955 * var10 + var28 >> 15) + this.field1957;
                    var36 = this.field1943.field1279 * var35 / var20 + arg3.field6493;
                    var37 = (this.field1950 * var12 + this.field1946 * var10 + var27 >> 15) + this.field1945;
                    var38 = this.field1943.field1249 * var37 / var21 + arg3.field6492;
                    var39 = (this.field1953 * var12 + this.field1955 * var10 + var28 >> 15) + this.field1957;
                    var40 = this.field1943.field1279 * var39 / var21 + arg3.field6493;
                    var41 = (this.field1950 * var12 + this.field1946 * var9 + var27 >> 15) + this.field1945;
                    var42 = this.field1943.field1249 * var41 / var22 + arg3.field6492;
                    var43 = (this.field1953 * var12 + this.field1955 * var9 + var28 >> 15) + this.field1957;
                    var44 = this.field1943.field1279 * var43 / var22 + arg3.field6493;
                } else {
                    int var45 = this.field1959[arg0][arg1];
                    int var46 = this.field1959[arg0 + 1][arg1];
                    int var47 = this.field1959[arg0 + 1][arg1 + 1];
                    int var48 = this.field1959[arg0][arg1 + 1];
                    if (this.field1961 == -1) {
                        var19 = (this.field1958 * var11 + this.field1954 * var45 + this.field1942 * var9 >> 15) + this.field1960;
                        if (var19 <= this.field1943.field1268) {
                            return;
                        }
                        var20 = (this.field1958 * var11 + this.field1954 * var46 + this.field1942 * var10 >> 15) + this.field1960;
                        if (var20 <= this.field1943.field1268) {
                            return;
                        }
                        var21 = (this.field1958 * var12 + this.field1954 * var47 + this.field1942 * var10 >> 15) + this.field1960;
                        if (var21 <= this.field1943.field1268) {
                            return;
                        }
                        var22 = (this.field1958 * var12 + this.field1954 * var48 + this.field1942 * var9 >> 15) + this.field1960;
                        if (var22 <= this.field1943.field1268) {
                            return;
                        }
                    } else {
                        var22 = this.field1961;
                        var21 = this.field1961;
                        var20 = this.field1961;
                        var19 = this.field1961;
                    }
                    if (arg2) {
                        int var49 = var19 - this.field1943.field1250;
                        if (var49 > 255) {
                            var49 = 255;
                        }
                        if (var49 > 0) {
                            var13 = var49;
                            int var50 = var8.field5737 * var49 / 255;
                            if (var50 > 0) {
                                var45 -= var50;
                            }
                        }
                        int var51 = var20 - this.field1943.field1250;
                        if (var51 > 255) {
                            var51 = 255;
                        }
                        if (var51 > 0) {
                            var14 = var51;
                            int var52 = var8.field5746 * var51 / 255;
                            if (var52 > 0) {
                                var46 -= var52;
                            }
                        }
                        int var53 = var21 - this.field1943.field1250;
                        if (var53 > 255) {
                            var53 = 255;
                        }
                        if (var53 > 0) {
                            var15 = var53;
                            int var54 = var8.field5736 * var53 / 255;
                            if (var54 > 0) {
                                var47 -= var54;
                            }
                        }
                        int var55 = var22 - this.field1943.field1250;
                        if (var55 > 255) {
                            var55 = 255;
                        }
                        if (var55 > 0) {
                            var16 = var55;
                            int var56 = var8.field5738 * var55 / 255;
                            if (var56 > 0) {
                                var48 -= var56;
                            }
                        }
                    } else if (this.field1943.field1288) {
                        int var57 = var19 - this.field1943.field1250;
                        if (var57 > 0) {
                            var13 = var57;
                            if (var57 > 255) {
                                var13 = 255;
                            }
                        }
                        int var58 = var20 - this.field1943.field1250;
                        if (var58 > 0) {
                            var14 = var58;
                            if (var58 > 255) {
                                var14 = 255;
                            }
                        }
                        int var59 = var21 - this.field1943.field1250;
                        if (var59 > 0) {
                            var15 = var59;
                            if (var59 > 255) {
                                var15 = 255;
                            }
                        }
                        int var60 = var22 - this.field1943.field1250;
                        if (var60 > 0) {
                            var16 = var60;
                            if (var60 > 255) {
                                var16 = 255;
                            }
                        }
                    }
                    var29 = (this.field1950 * var11 + this.field1956 * var45 + this.field1946 * var9 >> 15) + this.field1945;
                    var30 = this.field1943.field1249 * var29 / var19 + arg3.field6492;
                    var31 = (this.field1953 * var11 + this.field1955 * var9 + this.field1949 * var45 >> 15) + this.field1957;
                    var32 = this.field1943.field1279 * var31 / var19 + arg3.field6493;
                    var33 = (this.field1950 * var11 + this.field1956 * var46 + this.field1946 * var10 >> 15) + this.field1945;
                    var34 = this.field1943.field1249 * var33 / var20 + arg3.field6492;
                    var35 = (this.field1953 * var11 + this.field1955 * var10 + this.field1949 * var46 >> 15) + this.field1957;
                    var36 = this.field1943.field1279 * var35 / var20 + arg3.field6493;
                    var37 = (this.field1950 * var12 + this.field1956 * var47 + this.field1946 * var10 >> 15) + this.field1945;
                    var38 = this.field1943.field1249 * var37 / var21 + arg3.field6492;
                    var39 = (this.field1953 * var12 + this.field1955 * var10 + this.field1949 * var47 >> 15) + this.field1957;
                    var40 = this.field1943.field1279 * var39 / var21 + arg3.field6493;
                    var41 = (this.field1950 * var12 + this.field1956 * var48 + this.field1946 * var9 >> 15) + this.field1945;
                    var42 = this.field1943.field1249 * var41 / var22 + arg3.field6492;
                    var43 = (this.field1953 * var12 + this.field1955 * var9 + this.field1949 * var48 >> 15) + this.field1957;
                    var44 = this.field1943.field1279 * var43 / var22 + arg3.field6493;
                }
                boolean var61 = var8.field5745 != -1 && this.method978(this.field1943.field2375.method677(2459, var8.field5745).field3651);
                int var62 = var14 + var15 + var16;
                if ((var36 - var44) * (var38 - var42) - (var34 - var42) * (var40 - var44) > 0) {
                    arg3.field6495 = var38 < 0 || var42 < 0 || var34 < 0 || var38 > arg3.field6490 || var42 > arg3.field6490 || var34 > arg3.field6490;
                    if (var62 < 765) {
                        if (var61) {
                            arg3.field6491 = 100;
                        }
                        if (var62 > 0) {
                            if (var8.field5745 >= 0) {
                                arg3.method2688(var40, var44, var36, var38, var42, var34, this.field1943.field1263, var15, var16, var14, var8.field5744, var8.field5743, var8.field5739, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field5745);
                            } else {
                                arg3.method2693(var40, var44, var36, var38, var42, var34, class1.method2(var15 << 24 | this.field1943.field1263, 86, var8.field5744), class1.method2(var16 << 24 | this.field1943.field1263, 99, var8.field5743), class1.method2(var14 << 24 | this.field1943.field1263, -128, var8.field5739));
                            }
                        } else if (var8.field5745 >= 0) {
                            arg3.method2690(var40, var44, var36, var38, var42, var34, var8.field5744, var8.field5743, var8.field5739, var37, var41, var33, var39, var43, var35, var21, var22, var20, var8.field5745);
                        } else {
                            arg3.method2693(var40, var44, var36, var38, var42, var34, var8.field5744, var8.field5743, var8.field5739);
                        }
                        arg3.field6491 = 0;
                    } else {
                        arg3.method2684(var40, var44, var36, var38, var42, var34, this.field1943.field1263);
                    }
                }
                int var63 = var13 + var14 + var16;
                if ((var30 - var34) * (var44 - var36) - (var32 - var36) * (var42 - var34) > 0) {
                    arg3.field6495 = var30 < 0 || var34 < 0 || var42 < 0 || var30 > arg3.field6490 || var34 > arg3.field6490 || var42 > arg3.field6490;
                    if (var63 < 765) {
                        if (var61) {
                            arg3.field6491 = 100;
                        }
                        if (var63 > 0) {
                            if (var8.field5745 >= 0) {
                                arg3.method2688(var32, var36, var44, var30, var34, var42, this.field1943.field1263, var13, var14, var16, var8.field5742, var8.field5739, var8.field5743, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field5745);
                            } else {
                                arg3.method2693(var32, var36, var44, var30, var34, var42, class1.method2(var13 << 24 | this.field1943.field1263, -109, var8.field5742), class1.method2(var14 << 24 | this.field1943.field1263, 38, var8.field5739), class1.method2(var16 << 24 | this.field1943.field1263, 87, var8.field5743));
                            }
                        } else if (var8.field5745 >= 0) {
                            arg3.method2690(var32, var36, var44, var30, var34, var42, var8.field5742, var8.field5739, var8.field5743, var29, var33, var41, var31, var35, var43, var19, var20, var22, var8.field5745);
                        } else {
                            arg3.method2693(var32, var36, var44, var30, var34, var42, var8.field5742, var8.field5739, var8.field5743);
                        }
                        arg3.field6491 = 0;
                        return;
                    }
                    arg3.method2684(var32, var36, var44, var30, var34, var42, this.field1943.field1263);
                }
            }
        } else {
            class2 var64 = this.field1944[arg0][arg1];
            if (var64 != null) {
                if (this.field1961 == -1) {
                    for (int var65 = 0; var65 < var64.field100; ++var65) {
                        int var66 = (arg0 << super.field558) + var64.field105[var65];
                        int var67 = var64.field104[var65];
                        int var68 = (arg1 << super.field558) + var64.field103[var65];
                        int var69 = (this.field1958 * var68 + this.field1954 * var67 + this.field1942 * var66 >> 15) + this.field1960;
                        if (var69 <= this.field1943.field1268) {
                            return;
                        }
                        arg6[var65] = 0;
                        if (arg2) {
                            int var70 = var69 - this.field1943.field1250;
                            if (var70 > 255) {
                                var70 = 255;
                            }
                            if (var70 > 0) {
                                arg6[var65] = var70;
                                int var71 = var64.field97[var65] * var70 / 255;
                                if (var71 > 0) {
                                    var67 -= var71;
                                }
                            }
                        } else if (this.field1943.field1288) {
                            int var72 = var69 - this.field1943.field1250;
                            if (var72 > 0) {
                                arg6[var65] = var72;
                                if (arg6[var65] > 255) {
                                    arg6[var65] = 255;
                                }
                            }
                        }
                        int var73 = (this.field1950 * var68 + this.field1956 * var67 + this.field1946 * var66 >> 15) + this.field1945;
                        int var74 = (this.field1953 * var68 + this.field1955 * var66 + this.field1949 * var67 >> 15) + this.field1957;
                        arg4[var65] = this.field1943.field1249 * var73 / var69 + arg3.field6492;
                        arg5[var65] = this.field1943.field1279 * var74 / var69 + arg3.field6493;
                    }
                } else {
                    for (int var75 = 0; var75 < var64.field100; ++var75) {
                        int var115 = (arg0 << super.field558) + var64.field105[var75];
                        int var116 = var64.field104[var75];
                        int var117 = (arg1 << super.field558) + var64.field103[var75];
                        arg6[var75] = 0;
                        if (arg2) {
                            int var118 = this.field1961 - this.field1943.field1250;
                            if (var118 > 255) {
                                var118 = 255;
                            }
                            if (var118 > 0) {
                                arg6[var75] = var118;
                                int var119 = var64.field97[var75] * var118 / 255;
                                if (var119 > 0) {
                                    var116 -= var119;
                                }
                            }
                        } else if (this.field1943.field1288) {
                            int var120 = this.field1961 - this.field1943.field1250;
                            if (var120 > 0) {
                                arg6[var75] = var120;
                                if (arg6[var75] > 255) {
                                    arg6[var75] = 255;
                                }
                            }
                        }
                        int var121 = (this.field1950 * var117 + this.field1956 * var116 + this.field1946 * var115 >> 15) + this.field1945;
                        int var122 = (this.field1953 * var117 + this.field1955 * var115 + this.field1949 * var116 >> 15) + this.field1957;
                        arg4[var75] = this.field1943.field1249 * var121 / this.field1961 + arg3.field6492;
                        arg5[var75] = this.field1943.field1279 * var122 / this.field1961 + arg3.field6493;
                    }
                }
                if (var64.field99 != null) {
                    int var76 = this.field1959[arg0][arg1];
                    int var77 = this.field1959[arg0 + 1][arg1];
                    int var78 = this.field1959[arg0][arg1 + 1];
                    int var79 = super.field555 * arg0;
                    int var80 = super.field555 + var79;
                    int var81 = super.field555 * arg1;
                    int var82 = super.field555 + var81;
                    int var83 = (this.field1950 * var81 + this.field1956 * var76 + this.field1946 * var79 >> 15) + this.field1945;
                    int var84 = (this.field1953 * var81 + this.field1955 * var79 + this.field1949 * var76 >> 15) + this.field1957;
                    int var85 = (this.field1958 * var81 + this.field1954 * var76 + this.field1942 * var79 >> 15) + this.field1960;
                    int var86 = (this.field1950 * var81 + this.field1956 * var77 + this.field1946 * var80 >> 15) + this.field1945;
                    int var87 = (this.field1953 * var81 + this.field1955 * var80 + this.field1949 * var77 >> 15) + this.field1957;
                    int var88 = (this.field1958 * var81 + this.field1954 * var77 + this.field1942 * var80 >> 15) + this.field1960;
                    int var89 = (this.field1950 * var82 + this.field1956 * var78 + this.field1946 * var79 >> 15) + this.field1945;
                    int var90 = (this.field1953 * var82 + this.field1955 * var79 + this.field1949 * var78 >> 15) + this.field1957;
                    int var91 = (this.field1958 * var82 + this.field1954 * var78 + this.field1942 * var79 >> 15) + this.field1960;
                    for (int var92 = 0; var92 < var64.field98; ++var92) {
                        int var93 = var92 * 3;
                        int var94 = var93 + 1;
                        int var95 = var94 + 1;
                        int var96 = arg4[var93];
                        int var97 = arg4[var94];
                        int var98 = arg4[var95];
                        int var99 = arg5[var93];
                        int var100 = arg5[var94];
                        int var101 = arg5[var95];
                        int var102 = arg6[var93] + arg6[var94] + arg6[var95];
                        if ((var96 - var97) * (var101 - var100) - (var98 - var97) * (var99 - var100) > 0) {
                            arg3.field6495 = var96 < 0 || var97 < 0 || var98 < 0 || var96 > arg3.field6490 || var97 > arg3.field6490 || var98 > arg3.field6490;
                            short var103 = var64.field99[var92];
                            if (var102 < 765) {
                                if (var103 != -1 && this.method978(this.field1943.field2375.method677(2459, var103).field3651)) {
                                    arg3.field6491 = 100;
                                }
                                if (var102 > 0) {
                                    if (var103 != -1) {
                                        arg3.method2688(var99, var100, var101, var96, var97, var98, this.field1943.field1263, arg6[var93], arg6[var94], arg6[var95], var64.field101[var93], var64.field101[var94], var64.field101[var95], var83, var86, var89, var84, var87, var90, var85, var88, var91, var103);
                                    } else if ((var64.field101[var93] & 16777215) != 0) {
                                        arg3.method2693(var99, var100, var101, var96, var97, var98, class1.method2(arg6[var93] << 24 | this.field1943.field1263, 89, var64.field101[var93]), class1.method2(arg6[var94] << 24 | this.field1943.field1263, 56, var64.field101[var94]), class1.method2(arg6[var95] << 24 | this.field1943.field1263, 38, var64.field101[var95]));
                                    }
                                } else if (var103 != -1) {
                                    arg3.method2690(var99, var100, var101, var96, var97, var98, var64.field101[var93], var64.field101[var94], var64.field101[var95], var83, var86, var89, var84, var87, var90, var85, var88, var91, var103);
                                } else if ((var64.field101[var93] & 16777215) != 0) {
                                    arg3.method2693(var99, var100, var101, var96, var97, var98, var64.field101[var93], var64.field101[var94], var64.field101[var95]);
                                }
                                arg3.field6491 = 0;
                            } else {
                                arg3.method2684(var99, var100, var101, var96, var97, var98, this.field1943.field1263);
                            }
                        }
                    }
                    return;
                }
                for (int var104 = 0; var104 < var64.field98; ++var104) {
                    int var105 = var104 * 3;
                    int var106 = var105 + 1;
                    int var107 = var106 + 1;
                    int var108 = arg4[var105];
                    int var109 = arg4[var106];
                    int var110 = arg4[var107];
                    int var111 = arg5[var105];
                    int var112 = arg5[var106];
                    int var113 = arg5[var107];
                    int var114 = arg6[var105] + arg6[var106] + arg6[var107];
                    if ((var108 - var109) * (var113 - var112) - (var110 - var109) * (var111 - var112) > 0) {
                        arg3.field6495 = var108 < 0 || var109 < 0 || var110 < 0 || var108 > arg3.field6490 || var109 > arg3.field6490 || var110 > arg3.field6490;
                        if (var114 < 765) {
                            if (var114 > 0) {
                                if ((var64.field101[var105] & 16777215) != 0) {
                                    arg3.method2693(var111, var112, var113, var108, var109, var110, class501.method2863(var64.field101[var105], (byte) 115, this.field1943.field1263, arg6[var105]), class501.method2863(var64.field101[var106], (byte) -80, this.field1943.field1263, arg6[var106]), class501.method2863(var64.field101[var107], (byte) 114, this.field1943.field1263, arg6[var107]));
                                }
                            } else if ((var64.field101[var105] & 16777215) != 0) {
                                arg3.method2693(var111, var112, var113, var108, var109, var110, var64.field101[var105], var64.field101[var106], var64.field101[var107]);
                            }
                        } else {
                            arg3.method2684(var111, var112, var113, var108, var109, var110, this.field1943.field1263);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "QA", descriptor = "(III)V", line = 1743)
    public final void method277(int arg0, int arg1, int arg2) {
        if (this.field1947[arg0][arg1] < arg2) {
            this.field1947[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(IILab;[I[I[I)V", line = 1750)
    private final void method977(int arg0, int arg1, class472 arg2, int[] arg3, int[] arg4, int[] arg5) {
        class346 var7 = this.field1952[arg0][arg1];
        if (var7 != null) {
            if ((var7.field4565 & 2) == 0) {
                int var8 = super.field555 * arg0;
                int var9 = super.field555 + var8;
                int var10 = super.field555 * arg1;
                int var11 = super.field555 + var10;
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
                if ((var7.field4565 & 1) != 0) {
                    int var12 = this.field1959[arg0][arg1];
                    int var16;
                    if (this.field1961 == -1) {
                        int var13 = this.field1954 * var12;
                        var14 = (this.field1958 * var10 + this.field1942 * var8 + var13 >> 15) + this.field1960;
                        if (var14 <= this.field1943.field1268) {
                            return;
                        }
                        var15 = (this.field1958 * var10 + this.field1942 * var9 + var13 >> 15) + this.field1960;
                        if (var15 <= this.field1943.field1268) {
                            return;
                        }
                        var16 = (this.field1958 * var11 + this.field1942 * var9 + var13 >> 15) + this.field1960;
                        if (var16 <= this.field1943.field1268) {
                            return;
                        }
                        var17 = (this.field1958 * var11 + this.field1942 * var8 + var13 >> 15) + this.field1960;
                        if (var17 <= this.field1943.field1268) {
                            return;
                        }
                    } else {
                        var17 = this.field1961;
                        var16 = this.field1961;
                        var15 = this.field1961;
                        var14 = this.field1961;
                    }
                    int var18 = this.field1956 * var12;
                    int var19 = this.field1949 * var12;
                    var20 = (this.field1950 * var10 + this.field1946 * var8 + var18 >> 15) + this.field1945;
                    var21 = this.field1943.field1249 * var20 / var14 + arg2.field6492;
                    var22 = (this.field1953 * var10 + this.field1955 * var8 + var19 >> 15) + this.field1957;
                    var23 = this.field1943.field1279 * var22 / var14 + arg2.field6493;
                    var24 = (this.field1950 * var10 + this.field1946 * var9 + var18 >> 15) + this.field1945;
                    var25 = this.field1943.field1249 * var24 / var15 + arg2.field6492;
                    var26 = (this.field1953 * var10 + this.field1955 * var9 + var19 >> 15) + this.field1957;
                    var27 = this.field1943.field1279 * var26 / var15 + arg2.field6493;
                    int var28 = (this.field1950 * var11 + this.field1946 * var9 + var18 >> 15) + this.field1945;
                    var29 = this.field1943.field1249 * var28 / var16 + arg2.field6492;
                    int var30 = (this.field1953 * var11 + this.field1955 * var9 + var19 >> 15) + this.field1957;
                    var31 = this.field1943.field1279 * var30 / var16 + arg2.field6493;
                    var32 = (this.field1950 * var11 + this.field1946 * var8 + var18 >> 15) + this.field1945;
                    var33 = this.field1943.field1249 * var32 / var17 + arg2.field6492;
                    var34 = (this.field1953 * var11 + this.field1955 * var8 + var19 >> 15) + this.field1957;
                    var35 = this.field1943.field1279 * var34 / var17 + arg2.field6493;
                } else {
                    int var36 = this.field1959[arg0][arg1];
                    int var37 = this.field1959[arg0 + 1][arg1];
                    int var38 = this.field1959[arg0 + 1][arg1 + 1];
                    int var39 = this.field1959[arg0][arg1 + 1];
                    int var40;
                    if (this.field1961 == -1) {
                        var14 = (this.field1958 * var10 + this.field1954 * var36 + this.field1942 * var8 >> 15) + this.field1960;
                        if (var14 <= this.field1943.field1268) {
                            return;
                        }
                        var15 = (this.field1958 * var10 + this.field1954 * var37 + this.field1942 * var9 >> 15) + this.field1960;
                        if (var15 <= this.field1943.field1268) {
                            return;
                        }
                        var40 = (this.field1958 * var11 + this.field1954 * var38 + this.field1942 * var9 >> 15) + this.field1960;
                        if (var40 <= this.field1943.field1268) {
                            return;
                        }
                        var17 = (this.field1958 * var11 + this.field1954 * var39 + this.field1942 * var8 >> 15) + this.field1960;
                        if (var17 <= this.field1943.field1268) {
                            return;
                        }
                    } else {
                        var17 = this.field1961;
                        var40 = this.field1961;
                        var15 = this.field1961;
                        var14 = this.field1961;
                    }
                    var20 = (this.field1950 * var10 + this.field1956 * var36 + this.field1946 * var8 >> 15) + this.field1945;
                    var21 = this.field1943.field1249 * var20 / var14 + arg2.field6492;
                    var22 = (this.field1953 * var10 + this.field1955 * var8 + this.field1949 * var36 >> 15) + this.field1957;
                    var23 = this.field1943.field1279 * var22 / var14 + arg2.field6493;
                    var24 = (this.field1950 * var10 + this.field1956 * var37 + this.field1946 * var9 >> 15) + this.field1945;
                    var25 = this.field1943.field1249 * var24 / var15 + arg2.field6492;
                    var26 = (this.field1953 * var10 + this.field1955 * var9 + this.field1949 * var37 >> 15) + this.field1957;
                    var27 = this.field1943.field1279 * var26 / var15 + arg2.field6493;
                    int var41 = (this.field1950 * var11 + this.field1956 * var38 + this.field1946 * var9 >> 15) + this.field1945;
                    var29 = this.field1943.field1249 * var41 / var40 + arg2.field6492;
                    int var42 = (this.field1953 * var11 + this.field1955 * var9 + this.field1949 * var38 >> 15) + this.field1957;
                    var31 = this.field1943.field1279 * var42 / var40 + arg2.field6493;
                    var32 = (this.field1950 * var11 + this.field1956 * var39 + this.field1946 * var8 >> 15) + this.field1945;
                    var33 = this.field1943.field1249 * var32 / var17 + arg2.field6492;
                    var34 = (this.field1953 * var11 + this.field1955 * var8 + this.field1949 * var39 >> 15) + this.field1957;
                    var35 = this.field1943.field1279 * var34 / var17 + arg2.field6493;
                }
                if ((var27 - var35) * (var29 - var33) - (var25 - var33) * (var31 - var35) > 0) {
                    arg2.field6495 = var29 < 0 || var33 < 0 || var25 < 0 || var29 > arg2.field6490 || var33 > arg2.field6490 || var25 > arg2.field6490;
                    if (var7.field4560 >= 0) {
                        if (this.method978(this.field1943.field2375.method677(2459, var7.field4560).field3651)) {
                            arg2.field6491 = 100;
                        }
                        arg2.method2690(var31, var35, var27, var29, var33, var25, var7.field4566 & 65535, var7.field4562 & 65535, var7.field4563 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field4560);
                        arg2.field6491 = 0;
                    } else {
                        arg2.method2691(var31, var35, var27, var29, var33, var25, var7.field4566 & 65535, var7.field4562 & 65535, var7.field4563 & 65535);
                    }
                }
                if ((var21 - var25) * (var35 - var27) - (var23 - var27) * (var33 - var25) > 0) {
                    arg2.field6495 = var21 < 0 || var25 < 0 || var33 < 0 || var21 > arg2.field6490 || var25 > arg2.field6490 || var33 > arg2.field6490;
                    if (var7.field4560 >= 0) {
                        if (this.method978(this.field1943.field2375.method677(2459, var7.field4560).field3651)) {
                            arg2.field6491 = 100;
                        }
                        arg2.method2690(var23, var27, var35, var21, var25, var33, var7.field4564 & 65535, var7.field4563 & 65535, var7.field4562 & 65535, var20, var24, var32, var22, var26, var34, var14, var15, var17, var7.field4560);
                        arg2.field6491 = 0;
                        return;
                    }
                    arg2.method2691(var23, var27, var35, var21, var25, var33, var7.field4564 & 65535, var7.field4563 & 65535, var7.field4562 & 65535);
                }
            }
        } else {
            class239 var43 = this.field1951[arg0][arg1];
            if (var43 != null) {
                if (this.field1961 == -1) {
                    for (int var44 = 0; var44 < var43.field3191; ++var44) {
                        int var45 = (arg0 << super.field558) + var43.field3198[var44];
                        short var46 = var43.field3190[var44];
                        int var47 = (arg1 << super.field558) + var43.field3194[var44];
                        int var48 = (this.field1958 * var47 + this.field1954 * var46 + this.field1942 * var45 >> 15) + this.field1960;
                        if (var48 <= this.field1943.field1268) {
                            return;
                        }
                        int var49 = (this.field1950 * var47 + this.field1956 * var46 + this.field1946 * var45 >> 15) + this.field1945;
                        int var50 = (this.field1953 * var47 + this.field1955 * var45 + this.field1949 * var46 >> 15) + this.field1957;
                        arg3[var44] = this.field1943.field1249 * var49 / var48 + arg2.field6492;
                        arg4[var44] = this.field1943.field1279 * var50 / var48 + arg2.field6493;
                    }
                } else {
                    for (int var51 = 0; var51 < var43.field3191; ++var51) {
                        int var91 = (arg0 << super.field558) + var43.field3198[var51];
                        short var92 = var43.field3190[var51];
                        int var93 = (arg1 << super.field558) + var43.field3194[var51];
                        int var94 = (this.field1950 * var93 + this.field1956 * var92 + this.field1946 * var91 >> 15) + this.field1945;
                        int var95 = (this.field1953 * var93 + this.field1955 * var91 + this.field1949 * var92 >> 15) + this.field1957;
                        arg3[var51] = this.field1943.field1249 * var94 / this.field1961 + arg2.field6492;
                        arg4[var51] = this.field1943.field1279 * var95 / this.field1961 + arg2.field6493;
                    }
                }
                if (var43.field3202 != null) {
                    int var52 = this.field1959[arg0][arg1];
                    int var53 = this.field1959[arg0 + 1][arg1];
                    int var54 = this.field1959[arg0][arg1 + 1];
                    int var55 = super.field555 * arg0;
                    int var56 = super.field555 + var55;
                    int var57 = super.field555 * arg1;
                    int var58 = super.field555 + var57;
                    int var59 = (this.field1950 * var57 + this.field1956 * var52 + this.field1946 * var55 >> 15) + this.field1945;
                    int var60 = (this.field1953 * var57 + this.field1955 * var55 + this.field1949 * var52 >> 15) + this.field1957;
                    int var61 = (this.field1958 * var57 + this.field1954 * var52 + this.field1942 * var55 >> 15) + this.field1960;
                    int var62 = (this.field1950 * var57 + this.field1956 * var53 + this.field1946 * var56 >> 15) + this.field1945;
                    int var63 = (this.field1953 * var57 + this.field1955 * var56 + this.field1949 * var53 >> 15) + this.field1957;
                    int var64 = (this.field1958 * var57 + this.field1954 * var53 + this.field1942 * var56 >> 15) + this.field1960;
                    int var65 = (this.field1950 * var58 + this.field1956 * var54 + this.field1946 * var55 >> 15) + this.field1945;
                    int var66 = (this.field1953 * var58 + this.field1955 * var55 + this.field1949 * var54 >> 15) + this.field1957;
                    int var67 = (this.field1958 * var58 + this.field1954 * var54 + this.field1942 * var55 >> 15) + this.field1960;
                    for (int var68 = 0; var68 < var43.field3192; ++var68) {
                        short var69 = var43.field3200[var68];
                        short var70 = var43.field3193[var68];
                        short var71 = var43.field3201[var68];
                        int var72 = arg3[var69];
                        int var73 = arg3[var70];
                        int var74 = arg3[var71];
                        int var75 = arg4[var69];
                        int var76 = arg4[var70];
                        int var77 = arg4[var71];
                        if ((var72 - var73) * (var77 - var76) - (var74 - var73) * (var75 - var76) > 0) {
                            arg2.field6495 = var72 < 0 || var73 < 0 || var74 < 0 || var72 > arg2.field6490 || var73 > arg2.field6490 || var74 > arg2.field6490;
                            short var78 = var43.field3202[var68];
                            if (var78 != -1) {
                                if (this.method978(this.field1943.field2375.method677(2459, var78).field3651)) {
                                    arg2.field6491 = 100;
                                }
                                arg2.method2690(var75, var76, var77, var72, var73, var74, var43.field3197[var69], var43.field3197[var70], var43.field3197[var71], var59, var62, var65, var60, var63, var66, var61, var64, var67, var78);
                                arg2.field6491 = 0;
                            } else {
                                int var79 = var43.field3199[var68];
                                if (var79 != -1) {
                                    arg2.method2691(var75, var76, var77, var72, var73, var74, class266.method1598(var43.field3197[var69], var79, (byte) 42), class266.method1598(var43.field3197[var70], var79, (byte) 96), class266.method1598(var43.field3197[var71], var79, (byte) -112));
                                }
                            }
                        }
                    }
                    return;
                }
                for (int var80 = 0; var80 < var43.field3192; ++var80) {
                    short var81 = var43.field3200[var80];
                    short var82 = var43.field3193[var80];
                    short var83 = var43.field3201[var80];
                    int var84 = arg3[var81];
                    int var85 = arg3[var82];
                    int var86 = arg3[var83];
                    int var87 = arg4[var81];
                    int var88 = arg4[var82];
                    int var89 = arg4[var83];
                    if ((var84 - var85) * (var89 - var88) - (var86 - var85) * (var87 - var88) > 0) {
                        int var90 = var43.field3199[var80];
                        if (var90 != -1) {
                            arg2.field6495 = var84 < 0 || var85 < 0 || var86 < 0 || var84 > arg2.field6490 || var85 > arg2.field6490 || var86 > arg2.field6490;
                            arg2.method2691(var87, var88, var89, var84, var85, var86, class266.method1598(var43.field3197[var81], var90, (byte) -115), class266.method1598(var43.field3197[var82], var90, (byte) 39), class266.method1598(var43.field3197[var83], var90, (byte) 73));
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(I)Z", line = 2105)
    private final boolean method978(int arg0) {
        if ((this.field1948 & 8) == 0) {
            return false;
        } else if (arg0 == 4) {
            return true;
        } else if (arg0 == 8) {
            return true;
        } else {
            return arg0 == 9;
        }
    }

    @OriginalMember(owner = "client!hi", name = "I", descriptor = "(II)I", line = 2121)
    public final int method272(int arg0, int arg1) {
        return this.field1959[arg0][arg1];
    }

    @OriginalMember(owner = "client!hi", name = "b", descriptor = "(II)I", line = 2125)
    private static final int method979(int arg0, int arg1) {
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

    @OriginalMember(owner = "client!hi", name = "va", descriptor = "(II)I", line = 2158)
    public final int method276(int arg0, int arg1) {
        int var3 = arg0 >> super.field558;
        int var4 = arg1 >> super.field558;
        if (var3 >= 0 && var4 >= 0 && var3 <= super.field557 - 1 && var4 <= super.field559 - 1) {
            int var5 = arg0 & super.field555 - 1;
            int var6 = arg1 & super.field555 - 1;
            int var7 = (super.field555 - var5) * this.field1959[var3][var4] + this.field1959[var3 + 1][var4] * var5 >> super.field558;
            int var8 = (super.field555 - var5) * this.field1959[var3][var4 + 1] + this.field1959[var3 + 1][var4 + 1] * var5 >> super.field558;
            return (super.field555 - var6) * var7 + var6 * var8 >> super.field558;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!hi", name = "a", descriptor = "(II)V", line = 2181)
    public final void method274(int arg0, int arg1) {
        class157 var3 = this.field1943.method591(Thread.currentThread());
        var3.field2285.field6491 = 0;
        if (this.field1940 != null) {
            this.method976(arg0, arg1, this.field1943.field1271, var3.field2285, var3.field2307, var3.field2312, var3.field2300);
        } else {
            if (this.field1952 != null) {
                this.method977(arg0, arg1, var3.field2285, var3.field2307, var3.field2312, var3.field2300);
            }
        }
    }
}
