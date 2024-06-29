import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class143 extends class84 {

    @OriginalMember(owner = "client!ic", name = "V", descriptor = "I")
    private int field2306 = 2048;

    @OriginalMember(owner = "client!ic", name = "cb", descriptor = "I")
    private int field2313 = 819;

    @OriginalMember(owner = "client!ic", name = "O", descriptor = "I")
    private int field2299 = 1024;

    @OriginalMember(owner = "client!ic", name = "Z", descriptor = "I")
    private int field2310 = 1024;

    @OriginalMember(owner = "client!ic", name = "jb", descriptor = "I")
    private int field2320 = 1024;

    @OriginalMember(owner = "client!ic", name = "bb", descriptor = "I")
    private int field2312 = 0;

    @OriginalMember(owner = "client!ic", name = "db", descriptor = "I")
    private int field2314 = 1024;

    @OriginalMember(owner = "client!ic", name = "kb", descriptor = "I")
    private int field2321 = 0;

    @OriginalMember(owner = "client!ic", name = "mb", descriptor = "I")
    private int field2323 = 409;

    @OriginalMember(owner = "client!ic", name = "M", descriptor = "Ljava/lang/String;")
    public static String field2297 = "Your ignore list is full. Max of 100 users.";

    @OriginalMember(owner = "client!ic", name = "R", descriptor = "I")
    public static int field2302 = -1;

    @OriginalMember(owner = "client!ic", name = "eb", descriptor = "I")
    public static int field2315 = 0;

    @OriginalMember(owner = "client!ic", name = "Y", descriptor = "Led;")
    public static class187 field2309 = new class187();

    @OriginalMember(owner = "client!ic", name = "P", descriptor = "I")
    private int field2300;

    @OriginalMember(owner = "client!ic", name = "Q", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!ic", name = "S", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!ic", name = "T", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!ic", name = "U", descriptor = "I")
    public static int field2305;

    @OriginalMember(owner = "client!ic", name = "W", descriptor = "I")
    public static int field2307;

    @OriginalMember(owner = "client!ic", name = "X", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!ic", name = "ab", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!ic", name = "fb", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!ic", name = "gb", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!ic", name = "hb", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!ic", name = "ib", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!ic", name = "nb", descriptor = "I")
    public static int field2324;

    @OriginalMember(owner = "client!ic", name = "lb", descriptor = "Lva;")
    public static class35 field2322;

    @OriginalMember(owner = "client!ic", name = "ob", descriptor = "Llc;")
    public static class86 field2325;

    @OriginalMember(owner = "client!ic", name = "pb", descriptor = "Llc;")
    public static class86 field2326;

    @OriginalMember(owner = "client!ic", name = "N", descriptor = "Ljava/lang/String;")
    public static String field2298;

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(Z)V")
    public final void method481(boolean arg0) {
        if (!arg0) {
            ++field2308;
        }
    }

    @OriginalMember(owner = "client!ic", name = "i", descriptor = "(I)V")
    public static final void method1019(int arg0) {
        if (~class7.field67.toLowerCase().indexOf("microsoft") != 0) {
            class280.field4460[187] = 27;
            class280.field4460[223] = 28;
            class280.field4460[191] = 73;
            class280.field4460[221] = 43;
            class280.field4460[220] = 74;
            class280.field4460[219] = 42;
            class280.field4460[189] = 26;
            class280.field4460[222] = 59;
            class280.field4460[188] = 71;
            class280.field4460[190] = 72;
            class280.field4460[186] = 57;
            class280.field4460[192] = 58;
        } else {
            class280.field4460[61] = 27;
            class280.field4460[47] = 73;
            class280.field4460[45] = 26;
            class280.field4460[92] = 74;
            if (class7.field76 == null) {
                class280.field4460[192] = 58;
                class280.field4460[222] = 59;
            } else {
                class280.field4460[192] = 28;
                class280.field4460[520] = 59;
                class280.field4460[222] = 58;
            }
            class280.field4460[91] = 42;
            class280.field4460[46] = 72;
            class280.field4460[93] = 43;
            class280.field4460[59] = 57;
            class280.field4460[44] = 71;
        }
        if (arg0 != 1) {
            method1022((class29) null, 15);
        }
        ++field2301;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(III[[IIILjava/util/Random;)V")
    private final void method1020(int arg0, int arg1, int arg2, int[][] arg3, int arg4, int arg5, Random arg6) {
        ++field2324;
        int var8 = ~this.field2299 < -1 ? 4096 + -class145.method1041(arg6, (byte) 127, this.field2299) : 4096;
        int var9 = this.field2310 * this.field2300 >> 12;
        int var10 = this.field2300 + -(~var9 >= -1 ? 0 : class145.method1041(arg6, (byte) 126, var9));
        if (class20.field221 <= arg4) {
            arg4 -= class20.field221;
        }
        if (var10 > arg0) {
            if (arg1 > 0 && ~arg5 < -1) {
                int var11 = arg5 / 2;
                int var12 = arg1 / 2;
                int var13 = var12 >= var10 ? var10 : var12;
                int var14 = var10 > var11 ? var11 : var10;
                int var15 = -(var14 * 2) + arg5;
                int var16 = arg4 + var14;
                for (int var17 = 0; var17 < arg1; ++var17) {
                    int[] var18 = arg3[var17 - -arg2];
                    if (~var17 > ~var13) {
                        int var19 = var8 * var17 / var13;
                        if (this.field2312 == 0) {
                            for (int var20 = 0; ~var20 > ~var14; ++var20) {
                                int var21 = var8 * var20 / var14;
                                var18[class179.method1337(arg4 + var20, class36.field497)] = var18[class179.method1337(class36.field497, arg4 + -1 + arg5 + -var20)] = var19 * var21 >> 12;
                            }
                        } else {
                            for (int var22 = 0; var14 > var22; ++var22) {
                                int var24 = var8 * var22 / var14;
                                var18[class179.method1337(arg4 + var22, class36.field497)] = var18[class179.method1337(-var22 + -1 + arg4 + arg5, class36.field497)] = ~var24 <= ~var19 ? var19 : var24;
                            }
                        }
                        if (var15 + var16 > class20.field221) {
                            int var23 = -var16 + class20.field221;
                            class158.method1180(var18, var16, var23, var19);
                            class158.method1180(var18, 0, -var23 + var15, var19);
                        } else {
                            class158.method1180(var18, var16, var15, var19);
                        }
                    } else {
                        int var25 = -var17 + -1 + arg1;
                        if (~var13 < ~var25) {
                            int var26 = var8 * var25 / var13;
                            if (this.field2312 != 0) {
                                for (int var27 = 0; var14 > var27; ++var27) {
                                    int var28 = var8 * var27 / var14;
                                    var18[class179.method1337(class36.field497, arg4 + var27)] = var18[class179.method1337(-var27 + arg5 + arg4 + -1, class36.field497)] = ~var26 < ~var28 ? var28 : var26;
                                }
                            } else {
                                for (int var29 = 0; var14 > var29; ++var29) {
                                    int var31 = var8 * var29 / var14;
                                    var18[class179.method1337(class36.field497, arg4 + var29)] = var18[class179.method1337(class36.field497, -var29 + arg4 + arg5 + -1)] = var26 * var31 >> 12;
                                }
                            }
                            if (var15 + var16 <= class20.field221) {
                                class158.method1180(var18, var16, var15, var26);
                            } else {
                                int var30 = -var16 + class20.field221;
                                class158.method1180(var18, var16, var30, var26);
                                class158.method1180(var18, 0, -var30 + var15, var26);
                            }
                        } else {
                            for (int var32 = 0; var14 > var32; ++var32) {
                                var18[class179.method1337(class36.field497, arg4 + var32)] = var18[class179.method1337(-var32 + -1 + arg4 + arg5, class36.field497)] = var8 * var32 / var14;
                            }
                            if (~class20.field221 > ~(var15 + var16)) {
                                int var33 = -var16 + class20.field221;
                                class158.method1180(var18, var16, var33, var8);
                                class158.method1180(var18, 0, -var33 + var15, var8);
                            } else {
                                class158.method1180(var18, var16, var15, var8);
                            }
                        }
                    }
                }
            }
        } else if (~class20.field221 <= ~(arg4 + arg5)) {
            for (int var34 = 0; var34 < arg1; ++var34) {
                class158.method1180(arg3[arg2 - -var34], arg4, arg5, var8);
            }
        } else {
            int var35 = -arg4 + class20.field221;
            for (int var36 = 0; ~arg1 < ~var36; ++var36) {
                int[] var37 = arg3[arg2 + var36];
                class158.method1180(var37, arg4, var35, var8);
                class158.method1180(var37, 0, -var35 + arg5, var8);
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "j", descriptor = "(I)V")
    public static final void method1021(int arg0) {
        ++field2311;
        class78.field1133.method1558(-28);
        if (arg0 != -2061127966) {
            method1023(true, -125);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lbe;I)V")
    public static final void method1022(class29 arg0, int arg1) {
        ++field2303;
        class23 var2 = (class23) class288.field4566.method1034(class193.method1431(arg0.field344, false), (byte) 21);
        if (var2 != null) {
            if (var2.field251 != null) {
                class73.field1057.method795(var2.field251);
                var2.field251 = null;
            }
            var2.method1922(-1);
        }
        if (arg1 != 187) {
            method1021(-50);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(ZI)Ljava/lang/String;")
    public static final String method1023(boolean arg0, int arg1) {
        ++field2317;
        if (arg1 < 999999999) {
            return Integer.toString(arg1);
        } else {
            if (!arg0) {
                method1021(40);
            }
            return "*";
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIIII)V")
    public static final void method1024(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field2316;
        class177.method1330(class240.field3831[arg1], -arg2 + arg5, arg4, 32232, arg2 + arg5);
        int var6 = 0;
        int var7 = arg0;
        int var8 = arg2 * arg2;
        int var9 = arg0 * arg0;
        int var10 = var8 << 1;
        int var11 = var9 << 1;
        int var12 = arg0 << 1;
        if (arg3 > 26) {
            int var13 = var8 << 2;
            int var14 = (-var12 + 1) * var8 + var11;
            int var15 = -((var12 + -1) * var10) + var9;
            int var16 = var9 << 2;
            int var17 = ((var6 << 1) - -3) * var11;
            int var18 = (arg0 + -1) * var13;
            int var19 = ((arg0 << 1) + -3) * var10;
            int var20 = (var6 + 1) * var16;
            while (~var7 < -1) {
                if (var14 < 0) {
                    while (var14 < 0) {
                        var14 += var17;
                        var15 += var20;
                        var17 += var16;
                        ++var6;
                        var20 += var16;
                    }
                }
                if (~var15 > -1) {
                    ++var6;
                    var15 += var20;
                    var20 += var16;
                    var14 += var17;
                    var17 += var16;
                }
                --var7;
                int var21 = arg5 + var6;
                var15 += -var19;
                int var22 = arg1 + var7;
                var19 -= var13;
                int var23 = -var6 + arg5;
                int var24 = arg1 - var7;
                class177.method1330(class240.field3831[var24], var23, arg4, 32232, var21);
                class177.method1330(class240.field3831[var22], var23, arg4, 32232, var21);
                var14 += -var18;
                var18 -= var13;
            }
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIIZI)V")
    public static final void method1025(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        ++field2307;
        if (~class53.field775 == -2) {
            class17.field185[class52.field754 / 100].method60(class230.field3712 + -8, class220.field3529 - 8);
        }
        if (!arg3) {
            if (~class53.field775 == -3) {
                class17.field185[class52.field754 / 100 + 4].method60(class230.field3712 + -8, class220.field3529 + -8);
            }
            class58.method422(-98);
        }
    }

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "()V")
    public class143() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "(Z)V")
    public static void method1026(boolean arg0) {
        field2322 = null;
        field2298 = null;
        field2297 = null;
        field2309 = null;
        field2326 = null;
        field2325 = null;
        if (!arg0) {
            method1025(102, -111, 14, false, 59);
        }
    }

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "(BI)Lrg;")
    public static final class234 method1027(byte arg0, int arg1) {
        if (arg0 != -38) {
            method1025(-121, 48, 63, true, -67);
        }
        ++field2305;
        class234 var2 = (class234) class149.field2434.method310(-24190, (long) arg1);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3;
            if (arg1 < 32768) {
                var3 = class43.field625.method643(arg1, 0, false);
            } else {
                var3 = class224.field3583.method643(32767 & arg1, 0, false);
            }
            class234 var4 = new class234();
            if (var3 != null) {
                var4.method1651((byte) -71, new class152(var3));
            }
            if (~arg1 <= -32769) {
                var4.method1653(-104);
            }
            class149.field2434.method312((long) arg1, var4, (byte) -99);
            return var4;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(Lv;BI)V")
    public final void method31(class152 arg0, byte arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (~arg2 != -7) {
                                    if (arg2 != 7) {
                                        if (arg2 == 8) {
                                            this.field2299 = arg0.method1126(false);
                                        }
                                    } else {
                                        this.field2310 = arg0.method1126(false);
                                    }
                                } else {
                                    this.field2312 = arg0.method1111(255);
                                }
                            } else {
                                this.field2314 = arg0.method1126(false);
                            }
                        } else {
                            this.field2313 = arg0.method1126(false);
                        }
                    } else {
                        this.field2323 = arg0.method1126(false);
                    }
                } else {
                    this.field2306 = arg0.method1126(false);
                }
            } else {
                this.field2320 = arg0.method1126(false);
            }
        } else {
            this.field2321 = arg0.method1111(255);
        }
        if (arg1 <= 87) {
            field2325 = null;
        }
        ++field2319;
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(BI)[I")
    public final int[] method91(byte arg0, int arg1) {
        if (arg0 > -125) {
            method1023(false, -4);
        }
        ++field2304;
        int[] var3 = super.field1228.method1627(-1, arg1);
        if (super.field1228.field3651) {
            int[][] var4 = super.field1228.method1623(-15578);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class20.field221 * this.field2320 >> 12;
            int var15 = class20.field221 * this.field2306 >> 12;
            int var16 = class49.field718 * this.field2313 >> 12;
            int var17 = class49.field718 * this.field2323 >> 12;
            if (~var16 >= -2) {
                return var4[arg1];
            } else {
                this.field2300 = class20.field221 / 8 * this.field2314 >> 12;
                int var18 = 1 - -(class20.field221 / var14);
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field2321);
                while (true) {
                    while (true) {
                        int var22 = class145.method1041(var21, (byte) 123, -var14 + var15) + var14;
                        int var23 = var8 + var22;
                        int var24 = var17 + class145.method1041(var21, (byte) 125, -var17 + var16);
                        if (~var23 < ~class20.field221) {
                            var23 = class20.field221;
                            var22 = -var8 + class20.field221;
                        }
                        int var25;
                        if (var11) {
                            var25 = 0;
                        } else {
                            int var26 = var9;
                            int[] var27 = var20[var9];
                            var25 = var27[2];
                            int var28 = 0;
                            int var29 = var5 + var23;
                            if (var29 < 0) {
                                var29 += class20.field221;
                            }
                            if (var29 > class20.field221) {
                                var29 -= class20.field221;
                            }
                            while (true) {
                                int[] var30 = var20[var26];
                                if (var30[0] <= var29 && var29 <= var30[1]) {
                                    if (~var9 != ~var26) {
                                        int var31 = var5 + var8;
                                        if (var31 < 0) {
                                            var31 += class20.field221;
                                        }
                                        if (~class20.field221 > ~var31) {
                                            var31 -= class20.field221;
                                        }
                                        for (int var32 = 1; var28 >= var32; ++var32) {
                                            int[] var40 = var20[(var9 + var32) % var13];
                                            var25 = Math.max(var25, var40[2]);
                                        }
                                        for (int var33 = 0; var33 <= var28; ++var33) {
                                            int[] var34 = var20[(var9 + var33) % var13];
                                            int var35 = var34[2];
                                            if (var25 != var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (~var31 <= ~var29) {
                                                    if (~var36 != -1) {
                                                        var38 = Math.max(var31, var36);
                                                        var39 = class20.field221;
                                                    } else {
                                                        var38 = 0;
                                                        var39 = Math.min(var29, var37);
                                                    }
                                                } else {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var29, var37);
                                                }
                                                this.method1020(0, -var35 + var25, var35, var4, var7 + var38, -var38 + var39, var21);
                                            }
                                        }
                                    }
                                    var9 = var26;
                                    break;
                                }
                                ++var26;
                                if (var13 <= var26) {
                                    var26 = 0;
                                }
                                ++var28;
                            }
                        }
                        if (~class49.field718 > ~(var24 + var25)) {
                            var24 = -var25 + class49.field718;
                        } else {
                            var10 = false;
                        }
                        if (~class20.field221 != ~var23) {
                            int[] var41 = var19[var12++];
                            var41[0] = var8;
                            var41[2] = var25 - -var24;
                            var41[1] = var23;
                            this.method1020(0, var24, var25, var4, var6 + var8, var22, var21);
                            var8 = var23;
                        } else {
                            this.method1020(0, var24, var25, var4, var6 + var8, var22, var21);
                            if (var10) {
                                return var3;
                            }
                            int[][] var42 = var20;
                            int[] var43 = var19[var12++];
                            var20 = var19;
                            var19 = var42;
                            var9 = 0;
                            var43[1] = var23;
                            var13 = var12;
                            var43[2] = var24 + var25;
                            var11 = false;
                            var7 = var6;
                            var12 = 0;
                            var43[0] = var8;
                            var10 = true;
                            var6 = class145.method1041(var21, (byte) 127, class20.field221);
                            var5 = -var7 + var6;
                            var8 = 0;
                            int var44 = var5;
                            if (var5 < 0) {
                                var44 = class20.field221 + var5;
                            }
                            if (class20.field221 < var44) {
                                var44 -= class20.field221;
                            }
                            while (true) {
                                int[] var45 = var20[var9];
                                if (~var44 <= ~var45[0] && ~var45[1] <= ~var44) {
                                    break;
                                }
                                ++var9;
                                if (var9 >= var13) {
                                    var9 = 0;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            return var3;
        }
    }
}
