import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!w")
public class class144 extends class264 {

    @OriginalMember(owner = "client!w", name = "N", descriptor = "I")
    public static int field2489 = 1;

    @OriginalMember(owner = "client!w", name = "U", descriptor = "[I")
    public static int[] field2496 = new int[2];

    @OriginalMember(owner = "client!w", name = "P", descriptor = "[I")
    public static int[] field2491 = new int[25];

    @OriginalMember(owner = "client!w", name = "S", descriptor = "Z")
    public static boolean field2494 = false;

    @OriginalMember(owner = "client!w", name = "R", descriptor = "Lcf;")
    public static class93 field2493 = class147.method1066("clignotant3:", -48);

    @OriginalMember(owner = "client!w", name = "W", descriptor = "[I")
    public static int[] field2498 = new int[2];

    @OriginalMember(owner = "client!w", name = "O", descriptor = "I")
    public static int field2490 = 0;

    @OriginalMember(owner = "client!w", name = "X", descriptor = "I")
    public static int field2499 = 0;

    @OriginalMember(owner = "client!w", name = "L", descriptor = "I")
    public static int field2488;

    @OriginalMember(owner = "client!w", name = "Q", descriptor = "I")
    public static int field2492;

    @OriginalMember(owner = "client!w", name = "T", descriptor = "I")
    public static int field2495;

    @OriginalMember(owner = "client!w", name = "K", descriptor = "Lhg;")
    public static class177 field2487;

    @OriginalMember(owner = "client!w", name = "V", descriptor = "[I")
    public static int[] field2497;

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(SJILcf;ZILcf;I)V")
    public static final void method1042(short arg0, long arg1, int arg2, class93 arg3, boolean arg4, int arg5, class93 arg6, int arg7) {
        ++field2495;
        if (!class58.field991) {
            if (arg4) {
                if (~class253.field4549 > -501) {
                    class228.field4089[class253.field4549] = arg3;
                    class86.field1553[class253.field4549] = arg6;
                    class214.field3911[class253.field4549] = arg2 == -1 ? class273.field4859 : arg2;
                    class216.field3942[class253.field4549] = arg0;
                    class73.field1319[class253.field4549] = arg1;
                    class38.field586[class253.field4549] = arg7;
                    class168.field2963[class253.field4549] = arg5;
                    ++class253.field4549;
                }
            }
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IB)[I")
    public final int[] method22(int arg0, byte arg1) {
        ++field2492;
        if (arg1 > -83) {
            return null;
        } else {
            int[] var3 = super.field4716.method532((byte) 83, arg0);
            if (super.field4716.field1424) {
                class107.method773(var3, 0, class176.field3060, class67.field1220[arg0]);
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(Z)V")
    public static void method1043(boolean arg0) {
        field2487 = null;
        if (arg0) {
            field2493 = null;
            field2497 = null;
            field2491 = null;
            field2498 = null;
            field2496 = null;
        }
    }

    @OriginalMember(owner = "client!w", name = "<init>", descriptor = "()V")
    public class144() {
        super(0, true);
    }

    @OriginalMember(owner = "client!w", name = "a", descriptor = "(IIIIIIIIIII)V")
    public static final void method1044(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        ++field2488;
        int var11 = arg6 - arg4;
        int var12 = -arg1 + arg9;
        if (arg10 != -19299) {
            field2494 = true;
        }
        int var13 = -1;
        if (~class19.field258 < -1) {
            if (~class48.field780 >= -11) {
                var13 = class48.field780 * 5;
            } else {
                var13 = -((class48.field780 + -10) * 5) + 50;
            }
        }
        int var14 = 983040 / arg7;
        int var15 = 983040 / arg2;
        for (int var16 = -var14; ~var16 > ~(var11 + var14); ++var16) {
            int var18 = (var16 + 1) * arg7 + arg8 >> 16;
            int var19 = arg7 * var16 + arg8 >> 16;
            int var20 = var18 - var19;
            if (var20 > 0) {
                int var21 = arg0 + var19;
                int var10000 = arg0 + var18;
                int var23 = var16 - -arg4 >> 6;
                if (var23 >= 0 && ~(class151.field2652.length - 1) <= ~var23) {
                    int[][] var24 = class151.field2652[var23];
                    for (int var25 = -var15; var12 + var15 > var25; ++var25) {
                        int var26 = arg5 - -(arg2 * var25) >> 16;
                        int var27 = arg5 - -((var25 + 1) * arg2) >> 16;
                        int var28 = -var26 + var27;
                        if (var28 > 0) {
                            int var29 = arg1 + var25 >> 6;
                            int var30 = arg3 + var26;
                            var10000 = arg3 + var27;
                            if (var29 >= 0 && ~var29 >= ~(var24.length + -1) && var24[var29] != null) {
                                int var32 = ((arg1 + var25 & 63) << 6) + (arg4 + var16 & 63);
                                int var33 = var24[var29][var32];
                                if (~var33 != -1) {
                                    class240 var34 = class34.method197(-125, var33 + -1);
                                    if (!class112.field1917[var34.field4272]) {
                                        if (~var13 != 0 && ~class90.field1617 == ~var34.field4272) {
                                            class163 var35 = new class163();
                                            var35.field2877 = var30;
                                            var35.field2880 = var21;
                                            var35.field2883 = var34.field4272;
                                            class30.field445.method1152((byte) -5, var35);
                                        } else {
                                            class4.field45[var34.field4272].method560(var21 + -7, var30 + -7);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        for (class163 var17 = (class163) class30.field445.method1151(arg10 + 19406); var17 != null; var17 = (class163) class30.field445.method1159(54)) {
            class75.method524(var17.field2880, var17.field2877, 15, 16776960, var13);
            class75.method524(var17.field2880, var17.field2877, 13, 16776960, var13);
            class75.method524(var17.field2880, var17.field2877, 11, 16776960, var13);
            class75.method524(var17.field2880, var17.field2877, 9, 16776960, var13);
            class4.field45[var17.field2883].method560(var17.field2880 + -7, var17.field2877 - 7);
        }
        class30.field445.method1153((byte) -6);
    }
}
