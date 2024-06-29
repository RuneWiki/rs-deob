import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hm")
public class class282 extends class424 {

    @OriginalMember(owner = "client!hm", name = "R", descriptor = "I")
    private int field3842 = 1024;

    @OriginalMember(owner = "client!hm", name = "X", descriptor = "I")
    private int field3848 = 2048;

    @OriginalMember(owner = "client!hm", name = "Y", descriptor = "I")
    private int field3849 = 0;

    @OriginalMember(owner = "client!hm", name = "Q", descriptor = "I")
    private int field3841 = 1024;

    @OriginalMember(owner = "client!hm", name = "ab", descriptor = "I")
    private int field3851 = 409;

    @OriginalMember(owner = "client!hm", name = "V", descriptor = "I")
    private int field3846 = 0;

    @OriginalMember(owner = "client!hm", name = "U", descriptor = "I")
    private int field3845 = 1024;

    @OriginalMember(owner = "client!hm", name = "eb", descriptor = "I")
    private int field3855 = 1024;

    @OriginalMember(owner = "client!hm", name = "Z", descriptor = "I")
    private int field3850 = 819;

    @OriginalMember(owner = "client!hm", name = "P", descriptor = "[I")
    public static int[] field3840 = new int[3];

    @OriginalMember(owner = "client!hm", name = "L", descriptor = "I")
    public static int field3836;

    @OriginalMember(owner = "client!hm", name = "M", descriptor = "I")
    private int field3837;

    @OriginalMember(owner = "client!hm", name = "N", descriptor = "I")
    public static int field3838;

    @OriginalMember(owner = "client!hm", name = "O", descriptor = "I")
    public static int field3839;

    @OriginalMember(owner = "client!hm", name = "T", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!hm", name = "W", descriptor = "I")
    public static int field3847;

    @OriginalMember(owner = "client!hm", name = "bb", descriptor = "I")
    public static int field3852;

    @OriginalMember(owner = "client!hm", name = "cb", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!hm", name = "db", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!hm", name = "fb", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!hm", name = "S", descriptor = "Lij;")
    public static class316 field3843;

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Lrg;BI)V")
    public final void method19(class366 arg0, byte arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (arg2 != 3) {
                        if (arg2 != 4) {
                            if (~arg2 != -6) {
                                if (arg2 != 6) {
                                    if (~arg2 != -8) {
                                        if (~arg2 == -9) {
                                            this.field3842 = arg0.method2297(13352);
                                        }
                                    } else {
                                        this.field3841 = arg0.method2297(arg1 + 13400);
                                    }
                                } else {
                                    this.field3849 = arg0.method2306((byte) 99);
                                }
                            } else {
                                this.field3855 = arg0.method2297(13352);
                            }
                        } else {
                            this.field3850 = arg0.method2297(13352);
                        }
                    } else {
                        this.field3851 = arg0.method2297(arg1 + 13400);
                    }
                } else {
                    this.field3848 = arg0.method2297(13352);
                }
            } else {
                this.field3845 = arg0.method2297(13352);
            }
        } else {
            this.field3846 = arg0.method2306((byte) 28);
        }
        if (arg1 != -48) {
            method1766((class223) null, -42);
        }
        ++field3836;
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(Liq;I)Z")
    public static final boolean method1766(class223 arg0, int arg1) {
        ++field3844;
        class447 var2 = class133.method996((byte) -19, arg0.method711(true));
        if (var2.field6317 == -1) {
            return true;
        } else {
            class215 var3 = class42.method359(var2.field6317, (byte) -61);
            if (arg1 != -3) {
                field3840 = null;
            }
            return ~var3.field3006 == 0 ? true : var3.method1436((byte) 69);
        }
    }

    @OriginalMember(owner = "client!hm", name = "g", descriptor = "(I)V")
    public static final void method1767(int arg0) {
        class273.field3734 = null;
        class269.field3687 = null;
        if (arg0 != 28070) {
            field3840 = null;
        }
        ++field3856;
    }

    @OriginalMember(owner = "client!hm", name = "b", descriptor = "(IB)[I")
    public final int[] method43(int arg0, byte arg1) {
        ++field3838;
        int[] var3 = super.field5892.method783(arg0, (byte) 103);
        if (super.field5892.field1427) {
            int[][] var4 = super.field5892.method781(32335);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class303.field4135 * this.field3845 >> 12;
            int var15 = class303.field4135 * this.field3848 >> 12;
            int var16 = class423.field5866 * this.field3851 >> 12;
            int var17 = class423.field5866 * this.field3850 >> 12;
            if (~var17 >= -2) {
                return var4[arg0];
            }
            this.field3837 = class303.field4135 / 8 * this.field3855 >> 12;
            int var18 = class303.field4135 / var14 + 1;
            int[][] var19 = new int[var18][3];
            int[][] var20 = new int[var18][3];
            Random var21 = new Random((long) this.field3846);
            label128: while (true) {
                while (true) {
                    int var22 = class92.method724(var21, var15 - var14, arg1 ^ -127) + var14;
                    int var23 = class92.method724(var21, -var16 + var17, 108) + var16;
                    int var24 = var8 + var22;
                    if (class303.field4135 < var24) {
                        var22 = class303.field4135 - var8;
                        var24 = class303.field4135;
                    }
                    int var25;
                    if (var11) {
                        var25 = 0;
                    } else {
                        int var26 = var9;
                        int[] var27 = var20[var9];
                        int var28 = 0;
                        int var29 = var5 + var24;
                        if (~var29 > -1) {
                            var29 += class303.field4135;
                        }
                        if (~class303.field4135 > ~var29) {
                            var29 -= class303.field4135;
                        }
                        var25 = var27[2];
                        while (true) {
                            int[] var30 = var20[var26];
                            if (~var29 <= ~var30[0] && var30[1] >= var29) {
                                if (var9 != var26) {
                                    int var31 = var5 + var8;
                                    if (var31 < 0) {
                                        var31 += class303.field4135;
                                    }
                                    if (class303.field4135 < var31) {
                                        var31 -= class303.field4135;
                                    }
                                    for (int var32 = 1; ~var28 <= ~var32; ++var32) {
                                        int[] var40 = var20[(var9 - -var32) % var12];
                                        var25 = Math.max(var25, var40[2]);
                                    }
                                    for (int var33 = 0; ~var28 <= ~var33; ++var33) {
                                        int[] var34 = var20[(var9 + var33) % var12];
                                        int var35 = var34[2];
                                        if (var25 != var35) {
                                            int var36 = var34[0];
                                            int var37 = var34[1];
                                            int var38;
                                            int var39;
                                            if (~var29 >= ~var31) {
                                                if (var36 == 0) {
                                                    var38 = Math.min(var29, var37);
                                                    var39 = 0;
                                                } else {
                                                    var39 = Math.max(var31, var36);
                                                    var38 = class303.field4135;
                                                }
                                            } else {
                                                var39 = Math.max(var31, var36);
                                                var38 = Math.min(var29, var37);
                                            }
                                            this.method1772(var4, (byte) -57, var35, -var35 + var25, var7 + var39, var21, -var39 + var38);
                                        }
                                    }
                                }
                                var9 = var26;
                                break;
                            }
                            ++var28;
                            int var10000 = ~var12;
                            ++var26;
                            if (var10000 >= ~var26) {
                                var26 = 0;
                            }
                        }
                    }
                    if (class423.field5866 < var25 - -var23) {
                        var23 = -var25 + class423.field5866;
                    } else {
                        var10 = false;
                    }
                    if (class303.field4135 == var24) {
                        this.method1772(var4, (byte) -60, var25, var23, var8 - -var6, var21, var22);
                        if (var10) {
                            break label128;
                        }
                        var10 = true;
                        int[] var41 = var19[var13++];
                        var41[0] = var8;
                        var41[2] = var25 - -var23;
                        var41[1] = var24;
                        int[][] var42 = var20;
                        var20 = var19;
                        var19 = var42;
                        var12 = var13;
                        var13 = 0;
                        var7 = var6;
                        var6 = class92.method724(var21, class303.field4135, arg1 ^ -110);
                        var5 = -var7 + var6;
                        var8 = 0;
                        int var43 = var5;
                        if (var5 < 0) {
                            var43 = class303.field4135 + var5;
                        }
                        var9 = 0;
                        if (class303.field4135 < var43) {
                            var43 -= class303.field4135;
                        }
                        while (true) {
                            int[] var44 = var20[var9];
                            if (~var44[0] >= ~var43 && ~var44[1] <= ~var43) {
                                var11 = false;
                                break;
                            }
                            ++var9;
                            if (var12 <= var9) {
                                var9 = 0;
                            }
                        }
                    } else {
                        int[] var45 = var19[var13++];
                        var45[2] = var23 + var25;
                        var45[1] = var24;
                        var45[0] = var8;
                        this.method1772(var4, (byte) -111, var25, var23, var6 + var8, var21, var22);
                        var8 = var24;
                    }
                }
            }
        }
        if (arg1 != -10) {
            this.method113(-47);
        }
        return var3;
    }

    @OriginalMember(owner = "client!hm", name = "d", descriptor = "(B)V")
    public static void method1768(byte arg0) {
        field3840 = null;
        field3843 = null;
        if (arg0 <= 19) {
            field3840 = null;
        }
    }

    @OriginalMember(owner = "client!hm", name = "<init>", descriptor = "()V")
    public class282() {
        super(0, true);
    }

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "(I)V")
    public final void method113(int arg0) {
        if (arg0 == 3) {
            ++field3853;
        }
    }

    @OriginalMember(owner = "client!hm", name = "c", descriptor = "(III)V")
    public static final void method1769(int arg0, int arg1, int arg2) {
        ++field3854;
        if (arg0 == 0) {
            if (class387.method2400(arg2, arg0 ^ 176)) {
                class111.method849((byte) -108, arg1, class103.field1425[arg2]);
            }
        }
    }

    @OriginalMember(owner = "client!hm", name = "h", descriptor = "(I)V")
    public static final void method1770(int arg0) {
        ++field3839;
        for (int var1 = 0; ~class418.field5783 < ~var1; ++var1) {
            int var3 = class251.field3505[var1];
            class419 var4 = class428.field5951[var3];
            int var5 = class75.field1068.method2306((byte) 91);
            if ((var5 & 4) != 0) {
                var5 += class75.field1068.method2306((byte) 119) << 8;
            }
            if ((var5 & 512) != 0) {
                int var6 = class75.field1068.method2277((byte) 111);
                int[] var7 = new int[var6];
                int[] var8 = new int[var6];
                int[] var9 = new int[var6];
                for (int var10 = 0; ~var10 > ~var6; ++var10) {
                    int var11 = class75.field1068.method2304(false);
                    if (var11 == 65535) {
                        var11 = -1;
                    }
                    var7[var10] = var11;
                    var8[var10] = class75.field1068.method2277((byte) 115);
                    var9[var10] = class75.field1068.method2304(false);
                }
                class200.method1375(var9, -93, var7, var8, var4);
            }
            if (~(var5 & 16) != -1) {
                int var12 = class75.field1068.method2251(-103);
                int var13 = class75.field1068.method2292(true);
                var4.method1287(class246.field3467, (byte) -107, var13, var12);
                var4.field2585 = class246.field3467 + 300;
                var4.field2610 = class75.field1068.method2277((byte) 108);
            }
            if (~(var5 & 128) != -1) {
                int var14 = class75.field1068.method2304(false);
                if (var14 == 65535) {
                    var14 = -1;
                }
                int var15 = class75.field1068.method2259((byte) -100);
                class101.method777(var15, var14, -82, var4);
            }
            if ((var5 & 256) != 0) {
                int var16 = class75.field1068.method2304(false);
                var4.field2608 = class75.field1068.method2277((byte) 112);
                var4.field2577 = class75.field1068.method2259((byte) -100);
                var4.field2632 = ~(32768 & var16) != -1;
                var4.field2614 = var16 & 32767;
                var4.field2630 = class246.field3467 + var4.field2614 + var4.field2608;
            }
            if ((1 & var5) != 0) {
                if (var4.field5807.method1517((byte) -127)) {
                    class294.method1790(var4, (byte) -111);
                }
                var4.method2586(class11.method57(-14758, class75.field1068.method2266(255)), -8);
                var4.method1291(var4.field5807.field3278, false);
                var4.field2629 = var4.field5807.field3268 << 3;
                if (var4.field5807.method1517((byte) -52)) {
                    class48.method392((class447) null, -6024, 0, var4.field2659[0], (class423) null, var4, var4.field2662[0], class343.field4623);
                }
            }
            if (~(2 & var5) != -1) {
                var4.field2590 = class75.field1068.method2304(false);
                if (var4.field2590 == 65535) {
                    var4.field2590 = -1;
                }
            }
            if ((var5 & 8) != 0) {
                int var17 = class75.field1068.method2304(false);
                if (~var17 == -65536) {
                    var17 = -1;
                }
                int var18 = class75.field1068.method2265(-4);
                boolean var19 = true;
                if (var17 != -1 && var4.field2636 != -1) {
                    if (var4.field2636 != var17) {
                        class344 var20 = class186.method1296(var17, false);
                        class344 var21 = class186.method1296(var4.field2636, false);
                        if (var20.field4648 != -1 && ~var21.field4648 != 0) {
                            class83 var22 = class408.method2521((byte) 118, var20.field4648);
                            class83 var23 = class408.method2521((byte) 65, var21.field4648);
                            if (var23.field1163 > var22.field1163) {
                                var19 = false;
                            }
                        }
                    } else {
                        class344 var24 = class186.method1296(var17, false);
                        if (var24.field4650 && var24.field4648 != -1) {
                            class83 var25 = class408.method2521((byte) -105, var24.field4648);
                            int var26 = var25.field1166;
                            if (~var26 != -1) {
                                if (~var26 != -2) {
                                    if (~var26 == -3) {
                                        var19 = false;
                                        var4.field2578 = 0;
                                    }
                                } else {
                                    var19 = true;
                                }
                            } else {
                                var19 = false;
                            }
                        }
                    }
                }
                if (var19) {
                    var4.field2643 = 0;
                    var4.field2636 = var17;
                    var4.field2584 = 0;
                    var4.field2599 = 1;
                    var4.field2605 = var18 >> 16;
                    var4.field2633 = (65535 & var18) + class246.field3467;
                    if (~class246.field3467 > ~var4.field2633) {
                        var4.field2643 = -1;
                    }
                    if (var4.field2636 != -1 && class246.field3467 == var4.field2633) {
                        int var27 = class186.method1296(var4.field2636, false).field4648;
                        if (var27 != -1) {
                            class83 var28 = class408.method2521((byte) -128, var27);
                            if (var28 != null && var28.field1145 != null) {
                                class431.method2657(var28, -63, var4.field40, false, 0, var4.field44);
                            }
                        }
                    }
                }
            }
            if ((64 & var5) != 0) {
                int var29 = class75.field1068.method2251(-105);
                int var30 = class75.field1068.method2259((byte) -100);
                var4.method1287(class246.field3467, (byte) -108, var30, var29);
            }
            if (~(32 & var5) != -1) {
                var4.field2589 = class75.field1068.method2255(-32226);
                var4.field2598 = 100;
            }
            if (~(var5 & 1024) != -1) {
                var4.field2613 = class75.field1068.method2291(-15939);
                var4.field2615 = class75.field1068.method2291(-15939);
            }
        }
        int var2 = 113 % ((arg0 - 17) / 37);
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "(IIIBIII)V")
    public static final void method1771(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        class418[] var7 = class273.field3733;
        if (arg3 == 66) {
            for (int var8 = 0; ~var7.length < ~var8; ++var8) {
                class418 var9 = var7[var8];
                if (var9 != null && ~var9.field5792 == -3) {
                    class387.method2395((var9.field5785 - class371.field5148 << 7) + var9.field5782, var9.field5791 * 2, arg6 >> 1, arg1 >> 1, (-class6.field65 + var9.field5778 << 7) + var9.field5795, arg5, (byte) -60, arg2);
                    if (~field3840[0] < 0 && ~(class246.field3467 % 20) > -11) {
                        class191.field2751[var9.field5789].method616(field3840[0] + arg0 + -12, field3840[1] - 28 + arg4);
                    }
                }
            }
            ++field3847;
        }
    }

    @OriginalMember(owner = "client!hm", name = "a", descriptor = "([[IBIIILjava/util/Random;I)V")
    private final void method1772(int[][] arg0, byte arg1, int arg2, int arg3, int arg4, Random arg5, int arg6) {
        ++field3852;
        int var8 = this.field3842 <= 0 ? 4096 : 4096 + -class92.method724(arg5, this.field3842, 99);
        int var9 = this.field3841 * this.field3837 >> 12;
        int var10 = this.field3837 + -(var9 > 0 ? class92.method724(arg5, var9, 100) : 0);
        if (arg1 <= -40) {
            if (arg4 >= class303.field4135) {
                arg4 -= class303.field4135;
            }
            if (~var10 < -1) {
                if (~arg3 < -1 && ~arg6 < -1) {
                    int var11 = arg6 / 2;
                    int var12 = arg3 / 2;
                    int var13 = ~var11 > ~var10 ? var11 : var10;
                    int var14 = ~var10 >= ~var12 ? var10 : var12;
                    int var15 = arg4 + var13;
                    int var16 = -(var13 * 2) + arg6;
                    for (int var17 = 0; ~var17 > ~arg3; ++var17) {
                        int[] var18 = arg0[arg2 + var17];
                        if (var17 < var14) {
                            int var19 = var8 * var17 / var14;
                            if (~this.field3849 == -1) {
                                for (int var20 = 0; var20 < var13; ++var20) {
                                    int var21 = var8 * var20 / var13;
                                    var18[class187.method1301(arg4 - -var20, class65.field898)] = var18[class187.method1301(class65.field898, arg4 + arg6 + -1 + -var20)] = var19 * var21 >> 12;
                                }
                            } else {
                                for (int var22 = 0; ~var13 < ~var22; ++var22) {
                                    int var24 = var8 * var22 / var13;
                                    var18[class187.method1301(arg4 + var22, class65.field898)] = var18[class187.method1301(arg6 - var22 + arg4 - 1, class65.field898)] = var24 >= var19 ? var19 : var24;
                                }
                            }
                            if (~(var15 - -var16) < ~class303.field4135) {
                                int var23 = -var15 + class303.field4135;
                                class79.method642(var18, var15, var23, var19);
                                class79.method642(var18, 0, -var23 + var16, var19);
                            } else {
                                class79.method642(var18, var15, var16, var19);
                            }
                        } else {
                            int var25 = -var17 + arg3 + -1;
                            if (var14 > var25) {
                                int var26 = var8 * var25 / var14;
                                if (~this.field3849 == -1) {
                                    for (int var27 = 0; var13 > var27; ++var27) {
                                        int var28 = var8 * var27 / var13;
                                        var18[class187.method1301(class65.field898, arg4 + var27)] = var18[class187.method1301(class65.field898, -var27 + arg4 + -1 - -arg6)] = var26 * var28 >> 12;
                                    }
                                } else {
                                    for (int var29 = 0; var13 > var29; ++var29) {
                                        int var31 = var8 * var29 / var13;
                                        var18[class187.method1301(arg4 - -var29, class65.field898)] = var18[class187.method1301(arg4 + arg6 - (var29 + 1), class65.field898)] = var31 < var26 ? var31 : var26;
                                    }
                                }
                                if (~(var15 + var16) < ~class303.field4135) {
                                    int var30 = -var15 + class303.field4135;
                                    class79.method642(var18, var15, var30, var26);
                                    class79.method642(var18, 0, -var30 + var16, var26);
                                } else {
                                    class79.method642(var18, var15, var16, var26);
                                }
                            } else {
                                for (int var32 = 0; ~var13 < ~var32; ++var32) {
                                    var18[class187.method1301(class65.field898, arg4 - -var32)] = var18[class187.method1301(class65.field898, -var32 + -1 + arg4 + arg6)] = var8 * var32 / var13;
                                }
                                if (~class303.field4135 <= ~(var15 - -var16)) {
                                    class79.method642(var18, var15, var16, var8);
                                } else {
                                    int var33 = class303.field4135 - var15;
                                    class79.method642(var18, var15, var33, var8);
                                    class79.method642(var18, 0, var16 - var33, var8);
                                }
                            }
                        }
                    }
                }
            } else if (class303.field4135 >= arg4 + arg6) {
                for (int var34 = 0; var34 < arg3; ++var34) {
                    class79.method642(arg0[arg2 + var34], arg4, arg6, var8);
                }
            } else {
                int var35 = -arg4 + class303.field4135;
                for (int var36 = 0; var36 < arg3; ++var36) {
                    int[] var37 = arg0[arg2 - -var36];
                    class79.method642(var37, arg4, var35, var8);
                    class79.method642(var37, 0, -var35 + arg6, var8);
                }
            }
        }
    }
}
