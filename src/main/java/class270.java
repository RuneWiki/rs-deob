import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tia")
public class class270 extends class416 {

    @OriginalMember(owner = "client!tia", name = "E", descriptor = "S")
    public static short field3778 = 32767;

    @OriginalMember(owner = "client!tia", name = "G", descriptor = "Lkaa;")
    public static class47 field3780 = new class47(57, 3);

    @OriginalMember(owner = "client!tia", name = "x", descriptor = "I")
    public int field3771;

    @OriginalMember(owner = "client!tia", name = "D", descriptor = "I")
    public int field3777;

    @OriginalMember(owner = "client!tia", name = "F", descriptor = "I")
    public static int field3779;

    @OriginalMember(owner = "client!tia", name = "I", descriptor = "I")
    public int field3782;

    @OriginalMember(owner = "client!tia", name = "J", descriptor = "I")
    public int field3783;

    @OriginalMember(owner = "client!tia", name = "K", descriptor = "I")
    public static int field3784;

    @OriginalMember(owner = "client!tia", name = "H", descriptor = "Ldia;")
    public class235 field3781;

    @OriginalMember(owner = "client!tia", name = "y", descriptor = "Ljava/lang/String;")
    public String field3772;

    @OriginalMember(owner = "client!tia", name = "z", descriptor = "[I")
    public int[] field3773;

    @OriginalMember(owner = "client!tia", name = "C", descriptor = "[I")
    public int[] field3776;

    @OriginalMember(owner = "client!tia", name = "A", descriptor = "[Ldu;")
    public class360[] field3774;

    @OriginalMember(owner = "client!tia", name = "B", descriptor = "[Ljava/lang/String;")
    public String[] field3775;

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "([Lkf;II)V", line = 5)
    public static final void method1626(class256[] arg0, int arg1, int arg2) {
        if (arg1 >= arg2) {
            return;
        }
        int var3 = (arg1 + arg2) / 2;
        int var4 = arg1;
        class256 var5 = arg0[var3];
        arg0[var3] = arg0[arg2];
        arg0[arg2] = var5;
        int var6 = var5.field3509;
        for (int var7 = arg1; var7 < arg2; var7++) {
            if (arg0[var7].field3509 > (var7 & 0x1) + var6) {
                class256 var8 = arg0[var7];
                arg0[var7] = arg0[var4];
                arg0[var4++] = var8;
            }
        }
        arg0[arg2] = arg0[var4];
        arg0[var4] = var5;
        method1626(arg0, arg1, var4 - 1);
        method1626(arg0, var4 + 1, arg2);
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(IILkb;II[IZIIIII[III)I", line = 48)
    public static final int method1627(int arg0, int arg1, class691 arg2, int arg3, int arg4, int[] arg5, boolean arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int[] arg12, int arg13, int arg14) {
        field3779++;
        for (int var15 = 0; var15 < 128; var15++) {
            for (int var35 = 0; var35 < 128; var35++) {
                class372.field5176[var15][var35] = 0;
                class8.field155[var15][var35] = 99999999;
            }
        }
        if (arg9 != 28002) {
            return -61;
        }
        boolean var16;
        if (arg4 == 1) {
            var16 = class125.method991(arg2, arg0, arg13, arg14, arg1, (byte) 77, arg3, arg11, arg10, arg7, arg8);
        } else if (arg4 == 2) {
            var16 = class746.method4182(arg14, arg13, arg0, arg7, arg3, arg2, arg11, arg10, arg1, (byte) -93, arg8);
        } else {
            var16 = class660.method3580(arg4, arg0, arg14, arg10, arg3, arg2, arg11, arg8, arg7, -19272, arg1, arg13);
        }
        int var17 = arg1 - 64;
        int var18 = arg3 - 64;
        int var19 = class156.field2385;
        int var20 = class524.field6955;
        if (!var16) {
            if (!arg6) {
                return -1;
            }
            int var21 = Integer.MAX_VALUE;
            int var22 = Integer.MAX_VALUE;
            byte var23 = 10;
            for (int var24 = arg13 - var23; var24 <= (arg13 + var23); var24++) {
                for (int var25 = arg10 - var23; var25 <= arg10 + var23; var25++) {
                    int var26 = var24 - var17;
                    int var27 = var25 - var18;
                    if (var26 >= 0 && var27 >= 0 && var26 < 128 && var27 < 128 && class8.field155[var26][var27] < 100) {
                        int var28 = 0;
                        if (var24 < arg13) {
                            var28 = arg13 - var24;
                        } else if ((arg13 + arg0 - 1) < var24) {
                            var28 = -arg0 - arg13 - (-1 - var24);
                        }
                        int var29 = 0;
                        if (var25 < arg10) {
                            var29 = arg10 - var25;
                        } else if (arg7 + arg10 - 1 < var25) {
                            var29 = var25 - (arg7 + arg10 - 1);
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var21 > var30 || var21 == var30 && class8.field155[var26][var27] < var22) {
                            var20 = var25;
                            var21 = var30;
                            var19 = var24;
                            var22 = class8.field155[var26][var27];
                        }
                    }
                }
            }
            if (~var21 == Integer.MIN_VALUE) {
                return -1;
            }
        }
        if (arg1 == var19 && arg3 == var20) {
            return 0;
        }
        byte var31 = 0;
        class50.field638[var31] = var19;
        int var37 = var31 + 1;
        class10.field169[var31] = var20;
        int var32;
        int var33 = var32 = class372.field5176[var19 - var17][var20 - var18];
        while (arg1 != var19 || arg3 != var20) {
            if (var32 != var33) {
                var32 = var33;
                class50.field638[var37] = var19;
                class10.field169[var37++] = var20;
            }
            if ((var33 & 0x1) != 0) {
                var20++;
            } else if ((var33 & 0x4) != 0) {
                var20--;
            }
            if ((var33 & 0x2) != 0) {
                var19++;
            } else if ((var33 & 0x8) != 0) {
                var19--;
            }
            var33 = class372.field5176[var19 - var17][var20 - var18];
        }
        int var34 = 0;
        while ((var37--) > 0) {
            arg5[var34] = class50.field638[var37];
            arg12[var34++] = class10.field169[var37];
            if (arg5.length <= var34) {
                break;
            }
        }
        return var34;
    }

    @OriginalMember(owner = "client!tia", name = "a", descriptor = "(I)V", line = 228)
    public static void method1628(int arg0) {
        if (arg0 == 1) {
            field3780 = null;
        }
    }
}
