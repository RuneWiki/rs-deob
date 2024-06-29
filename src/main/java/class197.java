import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uw")
public class class197 implements class205 {

    @OriginalMember(owner = "client!uw", name = "f", descriptor = "I")
    public int field2644;

    @OriginalMember(owner = "client!uw", name = "b", descriptor = "I")
    public int field2640;

    @OriginalMember(owner = "client!uw", name = "n", descriptor = "I")
    public int field2652;

    @OriginalMember(owner = "client!uw", name = "h", descriptor = "I")
    public int field2646;

    @OriginalMember(owner = "client!uw", name = "r", descriptor = "Lrg;")
    public class557 field2656;

    @OriginalMember(owner = "client!uw", name = "k", descriptor = "I")
    public int field2649;

    @OriginalMember(owner = "client!uw", name = "m", descriptor = "Lal;")
    public class125 field2651;

    @OriginalMember(owner = "client!uw", name = "q", descriptor = "I")
    public int field2655;

    @OriginalMember(owner = "client!uw", name = "l", descriptor = "I")
    public int field2650;

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "I")
    public int field2639;

    @OriginalMember(owner = "client!uw", name = "e", descriptor = "Z")
    public boolean field2643;

    @OriginalMember(owner = "client!uw", name = "c", descriptor = "I")
    public static int field2641 = 0;

    @OriginalMember(owner = "client!uw", name = "g", descriptor = "I")
    public static int field2645;

    @OriginalMember(owner = "client!uw", name = "i", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!uw", name = "j", descriptor = "I")
    public static int field2648;

    @OriginalMember(owner = "client!uw", name = "p", descriptor = "I")
    public static int field2654;

    @OriginalMember(owner = "client!uw", name = "o", descriptor = "Lnh;")
    public static class758 field2653;

    @OriginalMember(owner = "client!uw", name = "d", descriptor = "[I")
    public static int[] field2642;

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(Z)Lww;", line = 3)
    public final class288 method1206(boolean arg0) {
        field2647++;
        if (arg0) {
            method1210((byte) 81, null, 25, -127, -115, null, -91, 84, 51, 118, 13, null, 21, false, 43);
        }
        return class757.field10565;
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(IB)Lwe;", line = 25)
    public static final class359 method1207(int arg0, byte arg1) {
        field2645++;
        if (arg0 >= 0 && arg0 < 100) {
            if (arg1 < 68) {
                field2653 = null;
            }
            return class147.field2053[arg0];
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(I)V", line = 42)
    public static void method1208(int arg0) {
        field2653 = null;
        field2642 = null;
        int var1 = 46 / ((66 - arg0) / 32);
    }

    @OriginalMember(owner = "client!uw", name = "b", descriptor = "(I)[Lmga;", line = 57)
    public static final class30[] method1209(int arg0) {
        field2648++;
        return arg0 == 0 ? new class30[] { class341.field4815, class573.field7904, class629.field8454, class439.field6122, class164.field2263, class239.field3568 } : null;
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(BLnfa;III[IIIIII[IIZI)I", line = 70)
    public static final int method1210(byte arg0, class228 arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int[] arg11, int arg12, boolean arg13, int arg14) {
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                class202.field2678[var15][var35] = 0;
                class229.field3070[var15][var35] = 99999999;
            }
        }
        field2654++;
        boolean var16;
        if (arg3 == 1) {
            var16 = class365.method2310(arg10, arg1, arg7, arg12, arg8, arg9, arg4, -1, arg14, arg2, arg6);
        } else if (arg3 == 2) {
            var16 = class762.method4251(arg6, arg9, arg1, arg12, arg14, arg2, arg10, arg4, arg8, -11804, arg7);
        } else {
            var16 = class182.method1149(arg9, arg10, -93, arg12, arg6, arg8, arg2, arg3, arg7, arg1, arg4, arg14);
        }
        if (arg0 != -75) {
            method1210((byte) 114, null, -79, 49, 108, null, 109, -109, 36, -8, -105, null, -72, false, -24);
        }
        int var17 = arg7 - 64;
        int var18 = arg12 - 64;
        int var19 = class750.field10323;
        int var20 = class633.field8520;
        if (!var16) {
            if (!arg13) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg10 - var23; var24 <= (arg10 + var23); var24++) {
                for (int var25 = arg6 - var23; var25 <= (arg6 + var23); var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class229.field3070[var26][var27] < 100) {
                        int var28 = 0;
                        if (arg10 > var24) {
                            var28 = arg10 - var24;
                        } else if (arg14 + arg10 - 1 < var24) {
                            var28 = -arg10 - (-var24 - 1) - arg14;
                        }
                        int var29 = 0;
                        if (var25 < arg6) {
                            var29 = arg6 - var25;
                        } else if (var25 > arg6 + arg8 - 1) {
                            var29 = -arg8 - (arg6 - var25 - 1);
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var21 > var30 || var21 == var30 && class229.field3070[var26][var27] < var22) {
                            var22 = class229.field3070[var26][var27];
                            var20 = var25;
                            var19 = var24;
                            var21 = var30;
                        }
                    }
                }
            }
            if (var21 == Integer.MAX_VALUE) {
                return -1;
            }
        }
        if (arg7 == var19 && arg12 == var20) {
            return 0;
        }
        byte var31 = 0;
        class748.field10296[var31] = var19;
        int var37 = var31 + 1;
        class633.field8514[var31] = var20;
        int var32;
        int var33 = var32 = class202.field2678[var19 - var17][var20 - var18];
        while (arg7 != var19 || arg12 != var20) {
            if (var32 != var33) {
                class748.field10296[var37] = var19;
                var32 = var33;
                class633.field8514[var37++] = var20;
            }
            if ((var33 & 0x2) != 0) {
                var19++;
            } else if ((var33 & 0x8) != 0) {
                var19--;
            }
            if ((var33 & 0x1) != 0) {
                var20++;
            } else if ((var33 & 0x4) != 0) {
                var20--;
            }
            var33 = class202.field2678[var19 - var17][var20 - var18];
        }
        int var34 = 0;
        while ((var37--) > 0) {
            arg11[var34] = class748.field10296[var37];
            arg5[var34++] = class633.field8514[var37];
            if (var34 >= arg11.length) {
                break;
            }
        }
        return var34;
    }

    @OriginalMember(owner = "client!uw", name = "<init>", descriptor = "(ILrg;Lal;IIIIIIIZ)V", line = 250)
    public class197(int arg0, class557 arg1, class125 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10) {
        this.field2644 = arg9;
        this.field2640 = arg8;
        this.field2652 = arg4;
        this.field2646 = arg5;
        this.field2656 = arg1;
        this.field2649 = arg3;
        this.field2651 = arg2;
        this.field2655 = arg0;
        this.field2650 = arg6;
        this.field2639 = arg7;
        this.field2643 = arg10;
    }
}
