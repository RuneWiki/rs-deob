import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class29 extends class128 {

    @OriginalMember(owner = "client!be", name = "Dc", descriptor = "I")
    public int field337 = -1;

    @OriginalMember(owner = "client!be", name = "Hc", descriptor = "I")
    public int field341 = 0;

    @OriginalMember(owner = "client!be", name = "Ec", descriptor = "Z")
    public boolean field338 = false;

    @OriginalMember(owner = "client!be", name = "zc", descriptor = "I")
    public int field333 = 0;

    @OriginalMember(owner = "client!be", name = "Ac", descriptor = "I")
    public int field334 = 255;

    @OriginalMember(owner = "client!be", name = "Uc", descriptor = "I")
    public int field354 = -1;

    @OriginalMember(owner = "client!be", name = "Pc", descriptor = "I")
    public int field349 = -1;

    @OriginalMember(owner = "client!be", name = "Tc", descriptor = "I")
    public int field353 = 0;

    @OriginalMember(owner = "client!be", name = "Sc", descriptor = "I")
    public int field352 = -1;

    @OriginalMember(owner = "client!be", name = "dd", descriptor = "I")
    public int field363 = 0;

    @OriginalMember(owner = "client!be", name = "Wc", descriptor = "I")
    public int field356 = -1;

    @OriginalMember(owner = "client!be", name = "Vc", descriptor = "I")
    public int field355 = 0;

    @OriginalMember(owner = "client!be", name = "gd", descriptor = "B")
    private byte field366 = 0;

    @OriginalMember(owner = "client!be", name = "ed", descriptor = "I")
    public int field364 = -1;

    @OriginalMember(owner = "client!be", name = "fd", descriptor = "I")
    public int field365 = -1;

    @OriginalMember(owner = "client!be", name = "Ic", descriptor = "I")
    public static int field342 = 0;

    @OriginalMember(owner = "client!be", name = "Oc", descriptor = "Z")
    public static volatile boolean field348 = false;

    @OriginalMember(owner = "client!be", name = "Fc", descriptor = "I")
    public static int field339 = -1;

    @OriginalMember(owner = "client!be", name = "Xc", descriptor = "I")
    public static int field357 = 99;

    @OriginalMember(owner = "client!be", name = "wc", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!be", name = "xc", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!be", name = "yc", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!be", name = "Bc", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!be", name = "Cc", descriptor = "I")
    public static int field336;

    @OriginalMember(owner = "client!be", name = "Gc", descriptor = "I")
    public static int field340;

    @OriginalMember(owner = "client!be", name = "Jc", descriptor = "I")
    public static int field343;

    @OriginalMember(owner = "client!be", name = "Lc", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!be", name = "Nc", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!be", name = "Qc", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!be", name = "Rc", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client!be", name = "Zc", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!be", name = "ad", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!be", name = "bd", descriptor = "I")
    public static int field361;

    @OriginalMember(owner = "client!be", name = "cd", descriptor = "I")
    public static int field362;

    @OriginalMember(owner = "client!be", name = "Mc", descriptor = "Lmf;")
    public class10 field346;

    @OriginalMember(owner = "client!be", name = "hd", descriptor = "Ln;")
    public static class16 field367;

    @OriginalMember(owner = "client!be", name = "Kc", descriptor = "Ljava/lang/String;")
    public String field344;

    @OriginalMember(owner = "client!be", name = "Yc", descriptor = "[[S")
    public static short[][] field358;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IILbj;IIIIIIIILpc;IIII)V")
    private final void method202(int arg0, int arg1, class157 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, class22 arg11, int arg12, int arg13, int arg14, int arg15) {
        ++field343;
        int var17 = arg8 * arg8 + arg12 * arg12;
        if (~var17 <= -17 && arg10 >= var17) {
            int var18 = 2047 & (int) (325.949D * Math.atan2((double) arg8, (double) arg12));
            class22 var19 = class109.method805(super.field1950, arg11, arg14, var18, super.field1979, super.field1910, (byte) -95);
            if (var19 != null) {
                var19.method2(0, arg13, arg6, arg1, arg5, arg9, arg7, arg3, -1L, arg0, arg2);
            }
            if (arg15 != -27157) {
                this.field354 = 72;
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lv;B)V")
    public final void method203(class152 arg0, byte arg1) {
        ++field350;
        arg0.field2511 = 0;
        int var3 = arg0.method1111(255);
        int var4 = var3 & 1;
        int var5 = super.method205(-84);
        boolean var6 = (4 & var3) != 0;
        int var7 = -1;
        if (arg1 > -125) {
            field342 = 80;
        }
        int[] var8 = new int[12];
        this.method923(((var3 & 62) >> 3) + 1, false);
        this.field366 = (byte) (3 & var3 >> 6);
        super.field1979 += (this.method205(-120) + -var5) * 64;
        super.field1910 += (this.method205(-85) + -var5) * 64;
        this.field352 = arg0.method1092((byte) -62);
        this.field337 = arg0.method1092((byte) -62);
        this.field341 = 0;
        for (int var9 = 0; ~var9 > -13; ++var9) {
            int var10 = arg0.method1111(255);
            if (~var10 == -1) {
                var8[var9] = 0;
            } else {
                int var11 = arg0.method1111(255);
                int var12 = (var10 << 8) + var11;
                if (var9 == 0 && var12 == 65535) {
                    var7 = arg0.method1126(false);
                    this.field341 = arg0.method1111(255);
                    break;
                }
                if (~var12 <= -32769) {
                    int var25 = class178.field2883[var12 + -32768];
                    var8[var9] = class244.method1747(var25, 1073741824);
                    int var26 = class254.method1800(var25, 15017).field896;
                    if (var26 != 0) {
                        this.field341 = var26;
                    }
                } else {
                    var8[var9] = class244.method1747(var12 - 256, Integer.MIN_VALUE);
                }
            }
        }
        int[] var13 = new int[5];
        for (int var14 = 0; var14 < 5; ++var14) {
            int var24 = arg0.method1111(255);
            if (~var24 > -1 || ~field358[var14].length >= ~var24) {
                var24 = 0;
            }
            var13[var14] = var24;
        }
        super.field1927 = arg0.method1126(false);
        long var15 = arg0.method1117(1677260448);
        this.field344 = class241.method1688(37, var15);
        this.field355 = arg0.method1111(255);
        if (var6) {
            this.field333 = arg0.method1126(false);
            this.field364 = -1;
            this.field363 = this.field355;
        } else {
            this.field333 = 0;
            this.field363 = arg0.method1111(255);
            this.field364 = arg0.method1111(255);
            if (this.field364 == 255) {
                this.field364 = -1;
            }
        }
        int var17 = this.field353;
        this.field353 = arg0.method1111(255);
        if (this.field353 != 0) {
            int var18 = this.field356;
            int var19 = this.field349;
            int var20 = this.field365;
            int var21 = this.field354;
            int var22 = this.field334;
            this.field356 = arg0.method1126(false);
            this.field365 = arg0.method1126(false);
            this.field349 = arg0.method1126(false);
            this.field354 = arg0.method1126(false);
            this.field334 = arg0.method1111(255);
            if (this.field353 != var17 || ~this.field356 != ~var18 || this.field365 != var20 || this.field349 != var19 || ~this.field354 != ~var21 || ~this.field334 != ~var22) {
                class113.method834(-24283, this);
            }
        } else {
            class143.method1022(this, 187);
        }
        if (this.field346 == null) {
            this.field346 = new class10();
        }
        int var23 = this.field346.field108;
        this.field346.method76(var8, var4 == 1, 27869, var7, var13, super.field1927);
        if (var7 != var23) {
            super.field1979 = super.field1917[0] * 128 + this.method205(103) * 64;
            super.field1910 = super.field1974[0] * 128 - -(this.method205(76) * 64);
        }
        if (super.field1886 != null) {
            super.field1886.method1160();
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIII)V")
    public final void method4(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field361;
    }

    @OriginalMember(owner = "client!be", name = "finalize", descriptor = "()V")
    protected final void finalize() {
        ++field345;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(ZIZI)V")
    public final void method204(boolean arg0, int arg1, boolean arg2, int arg3) {
        if (arg0) {
            this.field354 = -65;
        }
        super.method925(0, arg1, arg3, arg2, this.method205(67));
        ++field331;
    }

    @OriginalMember(owner = "client!be", name = "e", descriptor = "(I)I")
    public final int method205(int arg0) {
        ++field351;
        if (this.field346 != null && ~this.field346.field108 != 0) {
            return class234.method1657(0, this.field346.field108).field3997;
        } else {
            int var2 = -89 / ((4 - arg0) / 59);
            return super.method205(-116);
        }
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(B)Z")
    public final boolean method123(byte arg0) {
        ++field336;
        if (arg0 != 85) {
            return false;
        } else {
            return this.field346 != null;
        }
    }

    @OriginalMember(owner = "client!be", name = "f", descriptor = "(I)V")
    public static final void method206(int arg0) {
        ++field347;
        if (~class252.field4166 != arg0) {
            class63.method460(-1, (byte) -41, class252.field4166, -1);
            class252.field4166 = -1;
        }
    }

    @OriginalMember(owner = "client!be", name = "e", descriptor = "(B)V")
    public static void method207(byte arg0) {
        field358 = null;
        if (arg0 == -1) {
            field367 = null;
        }
    }

    @OriginalMember(owner = "client!be", name = "g", descriptor = "(I)Ljava/lang/String;")
    public final String method208(int arg0) {
        ++field332;
        String var2 = this.field344;
        if (class260.field4256 != null) {
            var2 = class260.field4256[this.field366] + var2;
        }
        if (arg0 != 30657) {
            return null;
        } else {
            if (class282.field4488 != null) {
                var2 = var2 + class282.field4488[this.field366];
            }
            return var2;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Llc;Llc;I)V")
    public static final void method209(class86 arg0, class86 arg1, int arg2) {
        ++field360;
        class245.field4028 = arg1;
        class230.field3715 = arg0;
        if (arg2 != 2) {
            field367 = null;
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "()I")
    public final int method3() {
        ++field335;
        return super.field1892;
    }

    @OriginalMember(owner = "client!be", name = "d", descriptor = "(I)I")
    public final int method124(int arg0) {
        ++field330;
        return arg0 != 127 ? 12 : super.field1927;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IIIIIIIIJILbj;)V")
    public final void method2(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class157 arg10) {
        ++field340;
        if (this.field346 != null) {
            class141 var13 = super.field1932 != -1 && super.field1941 == 0 ? class285.method1939(super.field1932, 112) : null;
            class141 var14 = super.field1966 == -1 || this.field338 || ~super.field1966 == ~this.method917((byte) 121).field3760 && var13 != null ? null : class285.method1939(super.field1966, 112);
            class22 var15 = this.field346.method88(super.field1888, super.field1951, var13, super.field1970, var14, super.field1937, true, super.field1921, super.field1875, super.field1889, 64);
            int var16 = class59.method427(-125);
            if (~class56.field809 != -1 && ~var16 > -51) {
                int var17 = 50 - var16;
                while (~class288.field4577 > ~var17) {
                    class253.field4170[class288.field4577] = new byte[102400];
                    ++class288.field4577;
                }
                while (~var17 > ~class288.field4577) {
                    --class288.field4577;
                    class253.field4170[class288.field4577] = null;
                }
            }
            if (var15 != null) {
                super.field1892 = var15.method3();
                if (class25.field287 && (~this.field346.field108 == 0 || class234.method1657(0, this.field346.field108).field3968)) {
                    class22 var18 = class198.method1458(240, var14 == null ? super.field1921 : super.field1875, super.field1907, 1, var14 == null ? var13 : var14, super.field1979, 0, super.field1910, var15, false, 0, super.field1950, 160, arg0);
                    var18.method2(0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, -1L, arg9, (class157) null);
                }
                if (class186.field2993 == this) {
                    for (int var19 = class96.field1425.length + -1; var19 >= 0; --var19) {
                        class297 var20 = class96.field1425[var19];
                        if (var20 != null && ~var20.field4703 != 0) {
                            if (var20.field4693 == 1 && ~var20.field4700 <= -1 && ~var20.field4700 > ~class169.field2730.length) {
                                class18 var21 = class169.field2730[var20.field4700];
                                if (var21 != null) {
                                    int var22 = var21.field1979 / 32 + -(class186.field2993.field1979 / 32);
                                    int var23 = var21.field1910 / 32 + -(class186.field2993.field1910 / 32);
                                    this.method202(arg9, arg3, (class157) null, arg7, arg0, arg4, arg2, arg6, var22, arg5, 360000, var15, var23, arg1, var20.field4703, -27157);
                                }
                            }
                            if (var20.field4693 == 2) {
                                int var24 = (-class282.field4487 + var20.field4701) * 4 + -(class186.field2993.field1979 / 32) + 2;
                                int var25 = (-class99.field1465 + var20.field4708) * 4 + (2 - class186.field2993.field1910 / 32);
                                int var26 = var20.field4690 * 4;
                                int var27 = var26 * var26;
                                this.method202(arg9, arg3, (class157) null, arg7, arg0, arg4, arg2, arg6, var24, arg5, var27, var15, var25, arg1, var20.field4703, -27157);
                            }
                            if (~var20.field4693 == -11 && var20.field4700 >= 0 && ~var20.field4700 > ~class92.field1374.length) {
                                class29 var28 = class92.field1374[var20.field4700];
                                if (var28 != null) {
                                    int var29 = var28.field1910 / 32 + -(class186.field2993.field1910 / 32);
                                    int var30 = var28.field1979 / 32 + -(class186.field2993.field1979 / 32);
                                    this.method202(arg9, arg3, (class157) null, arg7, arg0, arg4, arg2, arg6, var30, arg5, 360000, var15, var29, arg1, var20.field4703, -27157);
                                }
                            }
                        }
                    }
                }
                this.method926(103, var15);
                this.method920(arg0, -24517, var15);
                class22 var31 = null;
                if (!this.field338 && super.field1934 != -1 && super.field1948 != -1) {
                    class55 var32 = class187.method1387((byte) 18, super.field1934);
                    var31 = var32.method412(super.field1948, super.field1891, -16861, super.field1923);
                    if (var31 != null) {
                        var31.method156(0, -super.field1944, 0);
                        if (var32.field790) {
                            if (class56.field802 != 0) {
                                var31.method161(class56.field802);
                            }
                            if (class184.field2977 != 0) {
                                var31.method152(class184.field2977);
                            }
                            if (~class138.field2231 != -1) {
                                var31.method156(0, class138.field2231, 0);
                            }
                        }
                    }
                }
                class22 var33 = null;
                if (!this.field338 && super.field1931 != null) {
                    if (class264.field4290 >= super.field1946) {
                        super.field1931 = null;
                    }
                    if (~super.field1945 >= ~class264.field4290 && class264.field4290 < super.field1946) {
                        if (!(super.field1931 instanceof class43)) {
                            var33 = (class22) super.field1931;
                        } else {
                            var33 = (class22) ((class43) super.field1931).method329(-8349);
                        }
                        var33.method156(super.field1877 - super.field1979, super.field1973 - super.field1950, super.field1949 - super.field1910);
                        if (~super.field1928 != -513) {
                            if (~super.field1928 != -1025) {
                                if (~super.field1928 == -1537) {
                                    var33.method157();
                                }
                            } else {
                                var33.method143();
                            }
                        } else {
                            var33.method160();
                        }
                    }
                }
                if (var31 != null) {
                    var15 = ((class246) var15).method1770(var31);
                }
                if (var33 != null) {
                    var15 = ((class246) var15).method1770(var33);
                }
                var15.field246 = true;
                var15.method2(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, super.field1886);
                if (var33 != null) {
                    if (~super.field1928 == -513) {
                        var33.method157();
                    } else if (super.field1928 == 1024) {
                        var33.method143();
                    } else if (~super.field1928 == -1537) {
                        var33.method160();
                    }
                    var33.method156(super.field1979 - super.field1877, -super.field1973 + super.field1950, super.field1910 - super.field1949);
                }
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lwg;III)V")
    public static final void method210(class178 arg0, int arg1, int arg2, int arg3) {
        if (arg2 < class106.field1537) {
            class286 var4 = class220.field3525[arg1][arg2 + 1][arg3];
            if (var4 != null && var4.field4518 != null && var4.field4518.field2601.method1304()) {
                arg0.method1298(var4.field4518.field2601, 128, 0, 0, true);
            }
        }
        if (arg3 < class106.field1537) {
            class286 var5 = class220.field3525[arg1][arg2][arg3 + 1];
            if (var5 != null && var5.field4518 != null && var5.field4518.field2601.method1304()) {
                arg0.method1298(var5.field4518.field2601, 0, 0, 128, true);
            }
        }
        if (arg2 < class106.field1537 && arg3 < class232.field3724) {
            class286 var6 = class220.field3525[arg1][arg2 + 1][arg3 + 1];
            if (var6 != null && var6.field4518 != null && var6.field4518.field2601.method1304()) {
                arg0.method1298(var6.field4518.field2601, 128, 0, 128, true);
            }
        }
        if (arg2 < class106.field1537 && arg3 > 0) {
            class286 var7 = class220.field3525[arg1][arg2 + 1][arg3 - 1];
            if (var7 != null && var7.field4518 != null && var7.field4518.field2601.method1304()) {
                arg0.method1298(var7.field4518.field2601, 128, 0, -128, true);
            }
        }
    }
}
