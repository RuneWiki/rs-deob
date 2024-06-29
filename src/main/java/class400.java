import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class400 {

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "I")
    public static int field5649 = -1;

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "I")
    public static int field5650;

    @OriginalMember(owner = "client!sb", name = "d", descriptor = "I")
    public static int field5651;

    @OriginalMember(owner = "client!sb", name = "e", descriptor = "I")
    public static int field5652;

    @OriginalMember(owner = "client!sb", name = "g", descriptor = "I")
    public static int field5654;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "J")
    public static long field5648;

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "[I")
    public static int[] field5653;

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(B)I", line = 5)
    public static final int method2458(byte arg0) {
        if (arg0 != -12) {
            field5653 = null;
        }
        field5652++;
        return class778.field10694;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IILsha;I)V", line = 25)
    public static final void method2459(int arg0, int arg1, class115 arg2, int arg3) {
        class777.field10680 = arg2;
        field5650++;
        if (arg3 != 5510) {
            field5648 = 60L;
        }
        class688.field9603 = arg0;
        class512.field7020 = arg1;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(III[IIIIIIILsn;ZII[I)I", line = 38)
    public static final int method2460(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class739 arg10, boolean arg11, int arg12, int arg13, int[] arg14) {
        int var15 = 36 % ((-arg12 - 22) / 63);
        for (int var16 = 0; var16 < 128; var16++) {
            for (int var36 = 0; var36 < 128; var36++) {
                class135.field1727[var16][var36] = 0;
                class666.field9358[var16][var36] = 99999999;
            }
        }
        field5651++;
        boolean var17;
        if (arg5 == 1) {
            var17 = class537.method3192(arg6, arg13, arg4, arg10, arg7, arg2, arg8, arg1, arg0, arg9, true);
        } else if (arg5 == 2) {
            var17 = class570.method3354(arg9, arg1, arg13, -1, arg6, arg8, arg4, arg7, arg0, arg2, arg10);
        } else {
            var17 = class557.method3278(arg8, arg9, true, arg1, arg6, arg2, arg0, arg10, arg5, arg13, arg4, arg7);
        }
        int var18 = arg0 - 64;
        int var19 = arg4 - 64;
        int var20 = class730.field10104;
        int var21 = class386.field5509;
        if (!var17) {
            if (!arg11) {
                return -1;
            }
            int var22 = Integer.MAX_VALUE;
            int var23 = Integer.MAX_VALUE;
            byte var24 = 10;
            for (int var25 = arg8 - var24; var25 <= (arg8 + var24); var25++) {
                for (int var26 = arg1 - var24; var26 <= (arg1 + var24); var26++) {
                    int var27 = var25 - var18;
                    int var28 = var26 - var19;
                    if (var27 >= 0 && var28 >= 0 && var27 < 128 && var28 < 128 && class666.field9358[var27][var28] < 100) {
                        int var29 = 0;
                        if (var25 < arg8) {
                            var29 = arg8 - var25;
                        } else if (var25 > arg6 + arg8 - 1) {
                            var29 = var25 + 1 - arg8 - arg6;
                        }
                        int var30 = 0;
                        if (var26 < arg1) {
                            var30 = arg1 - var26;
                        } else if (var26 > arg1 + arg7 - 1) {
                            var30 = var26 + 1 - arg1 - arg7;
                        }
                        int var31 = var29 * var29 + var30 * var30;
                        if (var31 < var22 || var22 == var31 && var23 > class666.field9358[var27][var28]) {
                            var23 = class666.field9358[var27][var28];
                            var22 = var31;
                            var21 = var26;
                            var20 = var25;
                        }
                    }
                }
            }
            if (~var22 == Integer.MIN_VALUE) {
                return -1;
            }
        }
        if (arg0 == var20 && arg4 == var21) {
            return 0;
        }
        byte var32 = 0;
        class723.field10017[var32] = var20;
        int var38 = var32 + 1;
        class663.field9330[var32] = var21;
        int var33;
        int var34 = var33 = class135.field1727[var20 - var18][var21 - var19];
        while (arg0 != var20 || arg4 != var21) {
            if (var33 != var34) {
                class723.field10017[var38] = var20;
                var33 = var34;
                class663.field9330[var38++] = var21;
            }
            if ((var34 & 0x2) != 0) {
                var20++;
            } else if ((var34 & 0x8) != 0) {
                var20--;
            }
            if ((var34 & 0x1) != 0) {
                var21++;
            } else if ((var34 & 0x4) != 0) {
                var21--;
            }
            var34 = class135.field1727[var20 - var18][var21 - var19];
        }
        int var35 = 0;
        while (var38-- > 0) {
            arg14[var35] = class723.field10017[var38];
            arg3[var35++] = class663.field9330[var38];
            if (var35 >= arg14.length) {
                break;
            }
        }
        return var35;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(I)V", line = 213)
    public static void method2461(int arg0) {
        field5653 = null;
        if (arg0 != -26628) {
            method2461(-53);
        }
    }
}
