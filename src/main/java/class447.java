import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class447 extends class220 {

    @OriginalMember(owner = "client!pf", name = "Q", descriptor = "I")
    private int field6502 = 1024;

    @OriginalMember(owner = "client!pf", name = "V", descriptor = "I")
    private int field6507 = 1024;

    @OriginalMember(owner = "client!pf", name = "Y", descriptor = "I")
    private int field6510 = 2048;

    @OriginalMember(owner = "client!pf", name = "X", descriptor = "I")
    private int field6509 = 0;

    @OriginalMember(owner = "client!pf", name = "W", descriptor = "I")
    private int field6508 = 1024;

    @OriginalMember(owner = "client!pf", name = "S", descriptor = "I")
    private int field6504 = 409;

    @OriginalMember(owner = "client!pf", name = "ab", descriptor = "I")
    private int field6512 = 0;

    @OriginalMember(owner = "client!pf", name = "fb", descriptor = "I")
    private int field6517 = 819;

    @OriginalMember(owner = "client!pf", name = "ib", descriptor = "I")
    private int field6520 = 1024;

    @OriginalMember(owner = "client!pf", name = "U", descriptor = "Z")
    public static boolean field6506 = false;

    @OriginalMember(owner = "client!pf", name = "hb", descriptor = "[I")
    public static int[] field6519 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!pf", name = "P", descriptor = "I")
    public static int field6501;

    @OriginalMember(owner = "client!pf", name = "R", descriptor = "I")
    public static int field6503;

    @OriginalMember(owner = "client!pf", name = "T", descriptor = "I")
    public static int field6505;

    @OriginalMember(owner = "client!pf", name = "Z", descriptor = "I")
    public static int field6511;

    @OriginalMember(owner = "client!pf", name = "bb", descriptor = "I")
    public static int field6513;

    @OriginalMember(owner = "client!pf", name = "cb", descriptor = "I")
    public static int field6514;

    @OriginalMember(owner = "client!pf", name = "db", descriptor = "I")
    public static int field6515;

    @OriginalMember(owner = "client!pf", name = "eb", descriptor = "I")
    public static int field6516;

    @OriginalMember(owner = "client!pf", name = "gb", descriptor = "I")
    private int field6518;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "(I)V")
    public final void method440(int arg0) {
        if (arg0 != 0) {
            this.field6507 = 38;
        }
        ++field6501;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I[[ILjava/util/Random;IIIB)V")
    private final void method2808(int arg0, int[][] arg1, Random arg2, int arg3, int arg4, int arg5, byte arg6) {
        if (arg6 > -20) {
            method2812(103);
        }
        ++field6505;
        int var8 = ~this.field6520 < -1 ? -class205.method1296(2044605728, arg2, this.field6520) + 4096 : 4096;
        int var9 = this.field6518 * this.field6502 >> 12;
        int var10 = this.field6518 + -(var9 > 0 ? class205.method1296(2044605728, arg2, var9) : 0);
        if (class344.field5043 <= arg0) {
            arg0 -= class344.field5043;
        }
        if (var10 <= 0) {
            if (class344.field5043 >= arg0 + arg4) {
                for (int var11 = 0; arg3 > var11; ++var11) {
                    class111.method769(arg1[arg5 + var11], arg0, arg4, var8);
                }
            } else {
                int var12 = -arg0 + class344.field5043;
                for (int var13 = 0; ~arg3 < ~var13; ++var13) {
                    int[] var14 = arg1[arg5 - -var13];
                    class111.method769(var14, arg0, var12, var8);
                    class111.method769(var14, 0, -var12 + arg4, var8);
                }
            }
        } else if (arg3 > 0 && arg4 > 0) {
            int var15 = arg4 / 2;
            int var16 = arg3 / 2;
            int var17 = ~var15 <= ~var10 ? var10 : var15;
            int var18 = var16 < var10 ? var16 : var10;
            int var19 = arg0 - -var17;
            int var20 = arg4 - var17 * 2;
            for (int var21 = 0; ~arg3 < ~var21; ++var21) {
                int[] var22 = arg1[arg5 + var21];
                if (var21 < var18) {
                    int var23 = var8 * var21 / var18;
                    if (~this.field6509 == -1) {
                        for (int var24 = 0; var17 > var24; ++var24) {
                            int var25 = var8 * var24 / var17;
                            var22[class401.method2606(arg0 + var24, class392.field5887)] = var22[class401.method2606(class392.field5887, arg0 - 1 + -var24 + arg4)] = var23 * var25 >> 12;
                        }
                    } else {
                        for (int var26 = 0; var17 > var26; ++var26) {
                            int var28 = var8 * var26 / var17;
                            var22[class401.method2606(class392.field5887, arg0 - -var26)] = var22[class401.method2606(arg0 - 1 + -var26 + arg4, class392.field5887)] = var28 < var23 ? var28 : var23;
                        }
                    }
                    if (var19 + var20 <= class344.field5043) {
                        class111.method769(var22, var19, var20, var23);
                    } else {
                        int var27 = -var19 + class344.field5043;
                        class111.method769(var22, var19, var27, var23);
                        class111.method769(var22, 0, -var27 + var20, var23);
                    }
                } else {
                    int var29 = -var21 + -1 + arg3;
                    if (var18 > var29) {
                        int var30 = var8 * var29 / var18;
                        if (~this.field6509 == -1) {
                            for (int var31 = 0; ~var17 < ~var31; ++var31) {
                                int var32 = var8 * var31 / var17;
                                var22[class401.method2606(class392.field5887, arg0 + var31)] = var22[class401.method2606(-var31 + arg0 - (-arg4 + 1), class392.field5887)] = var30 * var32 >> 12;
                            }
                        } else {
                            for (int var33 = 0; var17 > var33; ++var33) {
                                int var35 = var8 * var33 / var17;
                                var22[class401.method2606(class392.field5887, arg0 - -var33)] = var22[class401.method2606(class392.field5887, -var33 + arg4 + -1 + arg0)] = var35 < var30 ? var35 : var30;
                            }
                        }
                        if (~class344.field5043 <= ~(var19 + var20)) {
                            class111.method769(var22, var19, var20, var30);
                        } else {
                            int var34 = class344.field5043 - var19;
                            class111.method769(var22, var19, var34, var30);
                            class111.method769(var22, 0, -var34 + var20, var30);
                        }
                    } else {
                        for (int var36 = 0; var36 < var17; ++var36) {
                            var22[class401.method2606(arg0 + var36, class392.field5887)] = var22[class401.method2606(arg0 - -arg4 + -var36 - 1, class392.field5887)] = var8 * var36 / var17;
                        }
                        if (var19 - -var20 <= class344.field5043) {
                            class111.method769(var22, var19, var20, var8);
                        } else {
                            int var37 = -var19 + class344.field5043;
                            class111.method769(var22, var19, var37, var8);
                            class111.method769(var22, 0, var20 - var37, var8);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "(II)V")
    public static final void method2809(int arg0, int arg1) {
        if (arg0 != -1) {
            field6519 = null;
        }
        ++field6503;
        class256 var2 = class363.method2385(14, arg1, (byte) 1);
        var2.method1611(-79);
    }

    @OriginalMember(owner = "client!pf", name = "<init>", descriptor = "()V")
    public class447() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ILnr;Lqr;IIIZILqc;IIIIIB)Lqc;")
    public static final class95 method2810(int arg0, class437 arg1, class15 arg2, int arg3, int arg4, int arg5, boolean arg6, int arg7, class95 arg8, int arg9, int arg10, int arg11, int arg12, int arg13, byte arg14) {
        ++field6515;
        if (arg8 == null) {
            return null;
        } else {
            int var15 = 1031;
            if (arg2 != null) {
                int var16 = var15 | arg2.method101(1, false, -1, arg7);
                var15 = var16 & -513;
            }
            long var17 = ((long) arg0 << 48) + ((long) ((arg3 << 24) + arg12 - -(arg13 << 16)) - -((long) arg11 << 32));
            class24 var19 = class51.field755;
            class95 var20;
            synchronized (class51.field755) {
                var20 = (class95) class51.field755.method209(119, var17);
            }
            if (arg14 != 22) {
                field6506 = true;
            }
            if (var20 == null || arg1.method2132(var20.method594(), var15) != 0) {
                if (var20 != null) {
                    var15 = arg1.method2068(var15, var20.method594());
                }
                byte var21;
                if (~arg12 == -2) {
                    var21 = 9;
                } else if (~arg12 == -3) {
                    var21 = 12;
                } else if (arg12 == 3) {
                    var21 = 15;
                } else if (~arg12 != -5) {
                    var21 = 21;
                } else {
                    var21 = 18;
                }
                byte var22 = 3;
                int[] var23 = new int[] { 64, 96, 128 };
                class180 var24 = new class180(var21 * var22 + 1, var21 * var22 * 2 + -var21, 0);
                int var25 = var24.method1116(0, 0, 0, arg14 ^ -24);
                int[][] var26 = new int[var22][var21];
                for (int var27 = 0; ~var22 < ~var27; ++var27) {
                    int var28 = var23[var27];
                    int var29 = var23[var27];
                    for (int var30 = 0; ~var21 < ~var30; ++var30) {
                        int var31 = (var30 << 14) / var21;
                        int var32 = class190.field2644[var31] * var28 >> 15;
                        int var33 = class190.field2635[var31] * var29 >> 15;
                        var26[var27][var30] = var24.method1116(var33, var32, 0, arg14 + -24);
                    }
                }
                for (int var34 = 0; var22 > var34; ++var34) {
                    int var35 = (var34 * 256 - -128) / var22;
                    int var36 = 256 - var35;
                    byte var37 = (byte) (arg3 * var35 + arg13 * var36 >> 8);
                    short var38 = (short) (((127 & arg0) * var35 + (arg11 & 127) * var36 & 32512) + ((64512 & arg0) * var35 + (arg11 & 64512) * var36 & 16515072) + ((arg0 & 896) * var35 + (896 & arg11) * var36 & 229376) >> 8);
                    for (int var39 = 0; ~var39 > ~var21; ++var39) {
                        if (var34 != 0) {
                            var24.method1115(var26[var34][(var39 - -1) % var21], var26[var34 + -1][var39], var38, var26[var34 + -1][(var39 + 1) % var21], (byte) -1, (byte) 1, (short) -1, (byte) -81, var37);
                            var24.method1115(var26[var34][var39], var26[var34 - 1][var39], var38, var26[var34][(var39 + 1) % var21], (byte) -1, (byte) 1, (short) -1, (byte) -120, var37);
                        } else {
                            var24.method1115(var26[0][var39], var25, var38, var26[0][(var39 + 1) % var21], (byte) -1, (byte) 1, (short) -1, (byte) -70, var37);
                        }
                    }
                }
                var20 = arg1.method2164(var24, var15, class392.field5892, 64, 768);
                class24 var40 = class51.field755;
                synchronized (class51.field755) {
                    class51.field755.method202(true, var20, var17);
                }
            }
            int var41 = arg12 * 64 - 1;
            int var42 = -var41;
            int var43 = -var41;
            int var44 = var41;
            int var45 = var41;
            if (arg6) {
                if (arg5 > 1024 && arg5 < 7168) {
                    var42 -= 128;
                }
                if (arg5 > 13312 || arg5 < 3072) {
                    var43 -= 128;
                }
                if (arg5 > 5120 && arg5 < 11264) {
                    var45 = var41 + 128;
                }
                if (~arg5 < -9217 && ~arg5 > -15361) {
                    var44 = var41 + 128;
                }
            }
            int var46 = arg8.method606();
            int var47 = arg8.method608();
            int var48 = arg8.method604();
            if (~var44 > ~var47) {
                var47 = var44;
            }
            if (~var48 > ~var43) {
                var48 = var43;
            }
            int var49 = arg8.method590();
            if (var46 < var42) {
                var46 = var42;
            }
            if (~var45 > ~var49) {
                var49 = var45;
            }
            class236 var50 = null;
            if (arg2 != null) {
                int var51 = arg2.field150[arg7];
                var50 = class376.method2496((byte) -119, var51 >> 16);
                arg7 = var51 & 65535;
            }
            class95 var52;
            if (var50 == null) {
                var52 = var20.method628((byte) 3, var15, true);
                var52.method603((-var46 + var47) / 2, 128, (var49 - var48) / 2);
                var52.method613((var46 + var47) / 2, 0, (var48 + var49) / 2);
            } else {
                var52 = var20.method628((byte) 3, var15, true);
                var52.method603((-var46 + var47) / 2, 128, (-var48 + var49) / 2);
                var52.method613((var46 + var47) / 2, 0, (var48 + var49) / 2);
                var52.method615(arg7, 96, var50);
            }
            if (arg9 != 0) {
                var52.method629(arg9);
            }
            if (~arg10 != -1) {
                var52.method592(arg10);
            }
            if (~arg4 != -1) {
                var52.method613(0, arg4, 0);
            }
            return var52;
        }
    }

    @OriginalMember(owner = "client!pf", name = "f", descriptor = "(B)V")
    public static final void method2811(byte arg0) {
        ++field6513;
        if (arg0 >= -2) {
            method2812(66);
        }
        for (class370 var1 = (class370) class370.field5503.method2649(0); var1 != null; var1 = (class370) class370.field5503.method2656(0)) {
            if (var1.field5494 == -1) {
                var1.field5502 = 0;
                class197.method1230(var1, 0);
            } else {
                var1.method2574((byte) 115);
            }
        }
    }

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "(I)V")
    public static void method2812(int arg0) {
        if (arg0 != 8) {
            method2810(-49, (class437) null, (class15) null, 65, 21, 71, true, -64, (class95) null, 6, 76, 62, 116, -16, (byte) 18);
        }
        field6519 = null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IBLil;)V")
    public final void method2(int arg0, byte arg1, class265 arg2) {
        ++field6511;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (arg0 != 6) {
                                    if (arg0 != 7) {
                                        if (arg0 == 8) {
                                            this.field6520 = arg2.method1685(arg1 ^ -8089);
                                        }
                                    } else {
                                        this.field6502 = arg2.method1685(8104);
                                    }
                                } else {
                                    this.field6509 = arg2.method1697(-54);
                                }
                            } else {
                                this.field6507 = arg2.method1685(arg1 + 8153);
                            }
                        } else {
                            this.field6517 = arg2.method1685(8104);
                        }
                    } else {
                        this.field6504 = arg2.method1685(8104);
                    }
                } else {
                    this.field6510 = arg2.method1685(8104);
                }
            } else {
                this.field6508 = arg2.method1685(arg1 + 8153);
            }
        } else {
            this.field6512 = arg2.method1697(-63);
        }
        if (arg1 != -49) {
            method2812(102);
        }
    }

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "(II)[I")
    public final int[] method43(int arg0, int arg1) {
        ++field6514;
        int[] var3 = super.field3125.method2005(arg1, (byte) 66);
        if (super.field3125.field4676) {
            int[][] var4 = super.field3125.method2006((byte) -105);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class344.field5043 * this.field6508 >> 12;
            int var15 = class344.field5043 * this.field6510 >> 12;
            int var16 = class110.field1518 * this.field6504 >> 12;
            int var17 = class110.field1518 * this.field6517 >> 12;
            if (~var17 >= -2) {
                return var4[arg1];
            }
            this.field6518 = class344.field5043 / 8 * this.field6507 >> 12;
            int var18 = class344.field5043 / var14 + 1;
            int[][] var19 = new int[var18][3];
            int[][] var20 = new int[var18][3];
            Random var21 = new Random((long) this.field6512);
            label130: while (true) {
                while (true) {
                    int var22 = class205.method1296(arg0 + 2044617271, var21, -var14 + var15) + var14;
                    int var23 = var16 - -class205.method1296(2044605728, var21, -var16 + var17);
                    int var24 = var8 + var22;
                    if (~var24 < ~class344.field5043) {
                        var24 = class344.field5043;
                        var22 = class344.field5043 - var8;
                    }
                    int var25;
                    if (var11) {
                        var25 = 0;
                    } else {
                        int var26 = var9;
                        int[] var27 = var20[var9];
                        int var28 = 0;
                        int var29 = var5 + var24;
                        if (var29 < 0) {
                            var29 += class344.field5043;
                        }
                        if (~var29 < ~class344.field5043) {
                            var29 -= class344.field5043;
                        }
                        var25 = var27[2];
                        while (true) {
                            int[] var30 = var20[var26];
                            if (var30[0] <= var29 && ~var30[1] <= ~var29) {
                                if (~var9 != ~var26) {
                                    int var31 = var5 + var8;
                                    if (~var31 > -1) {
                                        var31 += class344.field5043;
                                    }
                                    if (~var31 < ~class344.field5043) {
                                        var31 -= class344.field5043;
                                    }
                                    for (int var32 = 1; var32 <= var28; ++var32) {
                                        int[] var40 = var20[(var9 - -var32) % var12];
                                        var25 = Math.max(var25, var40[2]);
                                    }
                                    for (int var33 = 0; var28 >= var33; ++var33) {
                                        int[] var34 = var20[(var9 - -var33) % var12];
                                        int var35 = var34[2];
                                        if (~var25 != ~var35) {
                                            int var36 = var34[0];
                                            int var37 = var34[1];
                                            int var38;
                                            int var39;
                                            if (~var31 > ~var29) {
                                                var38 = Math.max(var31, var36);
                                                var39 = Math.min(var29, var37);
                                            } else if (var36 != 0) {
                                                var38 = Math.max(var31, var36);
                                                var39 = class344.field5043;
                                            } else {
                                                var39 = Math.min(var29, var37);
                                                var38 = 0;
                                            }
                                            this.method2808(var38 - -var7, var4, var21, -var35 + var25, -var38 + var39, var35, (byte) -87);
                                        }
                                    }
                                }
                                var9 = var26;
                                break;
                            }
                            ++var26;
                            if (~var26 <= ~var12) {
                                var26 = 0;
                            }
                            ++var28;
                        }
                    }
                    if (var25 - -var23 <= class110.field1518) {
                        var10 = false;
                    } else {
                        var23 = class110.field1518 - var25;
                    }
                    if (~class344.field5043 == ~var24) {
                        this.method2808(var6 + var8, var4, var21, var23, var22, var25, (byte) -53);
                        if (var10) {
                            break label130;
                        }
                        var10 = true;
                        int[] var41 = var19[var13++];
                        var41[0] = var8;
                        var41[2] = var23 + var25;
                        var41[1] = var24;
                        int[][] var42 = var20;
                        var20 = var19;
                        var19 = var42;
                        var12 = var13;
                        var13 = 0;
                        var7 = var6;
                        var6 = class205.method1296(2044605728, var21, class344.field5043);
                        var5 = -var7 + var6;
                        var8 = 0;
                        int var43 = var5;
                        if (~var5 > -1) {
                            var43 = class344.field5043 + var5;
                        }
                        var9 = 0;
                        if (~var43 < ~class344.field5043) {
                            var43 -= class344.field5043;
                        }
                        while (true) {
                            int[] var44 = var20[var9];
                            if (var44[0] <= var43 && ~var44[1] <= ~var43) {
                                var11 = false;
                                break;
                            }
                            ++var9;
                            if (var9 >= var12) {
                                var9 = 0;
                            }
                        }
                    } else {
                        int[] var45 = var19[var13++];
                        var45[1] = var24;
                        var45[2] = var23 + var25;
                        var45[0] = var8;
                        this.method2808(var6 + var8, var4, var21, var23, var22, var25, (byte) -91);
                        var8 = var24;
                    }
                }
            }
        }
        if (arg0 != -11543) {
            method2809(-11, -48);
        }
        return var3;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(ZLqj;)V")
    public static final void method2813(boolean arg0, class238 arg1) {
        ++field6516;
        if (!arg0) {
            method2814(23, 120, 85);
        }
        class240.field3382 = arg1;
    }

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "(III)Z")
    public static final boolean method2814(int arg0, int arg1, int arg2) {
        for (int var3 = 0; var3 < class369.field5489; ++var3) {
            class306 var4 = class79.field1086[var3];
            if (var4.field4382 == 1) {
                int var5 = var4.field4365 - arg0;
                if (var5 > 0) {
                    int var6 = (var4.field4380 * var5 >> 8) + var4.field4372;
                    int var7 = (var4.field4375 * var5 >> 8) + var4.field4385;
                    int var8 = (var4.field4381 * var5 >> 8) + var4.field4386;
                    int var9 = (var4.field4384 * var5 >> 8) + var4.field4364;
                    if (arg2 >= var6 && arg2 <= var7 && arg1 >= var8 && arg1 <= var9) {
                        return true;
                    }
                }
            } else if (var4.field4382 == 2) {
                int var10 = arg0 - var4.field4365;
                if (var10 > 0) {
                    int var11 = (var4.field4380 * var10 >> 8) + var4.field4372;
                    int var12 = (var4.field4375 * var10 >> 8) + var4.field4385;
                    int var13 = (var4.field4381 * var10 >> 8) + var4.field4386;
                    int var14 = (var4.field4384 * var10 >> 8) + var4.field4364;
                    if (arg2 >= var11 && arg2 <= var12 && arg1 >= var13 && arg1 <= var14) {
                        return true;
                    }
                }
            } else if (var4.field4382 == 3) {
                int var15 = var4.field4372 - arg2;
                if (var15 > 0) {
                    int var16 = (var4.field4366 * var15 >> 8) + var4.field4365;
                    int var17 = (var4.field4371 * var15 >> 8) + var4.field4363;
                    int var18 = (var4.field4381 * var15 >> 8) + var4.field4386;
                    int var19 = (var4.field4384 * var15 >> 8) + var4.field4364;
                    if (arg0 >= var16 && arg0 <= var17 && arg1 >= var18 && arg1 <= var19) {
                        return true;
                    }
                }
            } else if (var4.field4382 == 4) {
                int var20 = arg2 - var4.field4372;
                if (var20 > 0) {
                    int var21 = (var4.field4366 * var20 >> 8) + var4.field4365;
                    int var22 = (var4.field4371 * var20 >> 8) + var4.field4363;
                    int var23 = (var4.field4381 * var20 >> 8) + var4.field4386;
                    int var24 = (var4.field4384 * var20 >> 8) + var4.field4364;
                    if (arg0 >= var21 && arg0 <= var22 && arg1 >= var23 && arg1 <= var24) {
                        return true;
                    }
                }
            } else if (var4.field4382 == 5) {
                int var25 = arg1 - var4.field4386;
                if (var25 > 0) {
                    int var26 = (var4.field4366 * var25 >> 8) + var4.field4365;
                    int var27 = (var4.field4371 * var25 >> 8) + var4.field4363;
                    int var28 = (var4.field4380 * var25 >> 8) + var4.field4372;
                    int var29 = (var4.field4375 * var25 >> 8) + var4.field4385;
                    if (arg0 >= var26 && arg0 <= var27 && arg2 >= var28 && arg2 <= var29) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
