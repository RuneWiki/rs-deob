import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class665 extends class732 {

    @OriginalMember(owner = "client!pv", name = "g", descriptor = "[Lot;")
    public class378[] field9378;

    @OriginalMember(owner = "client!pv", name = "d", descriptor = "[Lec;")
    public static class103[] field9375 = new class103[14];

    @OriginalMember(owner = "client!pv", name = "e", descriptor = "I")
    public static int field9376;

    @OriginalMember(owner = "client!pv", name = "f", descriptor = "I")
    public static int field9377;

    @OriginalMember(owner = "client!pv", name = "h", descriptor = "I")
    public static int field9379;

    @OriginalMember(owner = "client!pv", name = "i", descriptor = "I")
    public static int field9380;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 6)
    public static final int method3815(String arg0, int arg1) {
        if (arg1 > -123) {
            field9375 = null;
        }
        field9379++;
        return class8.method41(arg0, (byte) 118, true, 10);
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(IILpaa;B)V", line = 21)
    public static final void method3816(int arg0, int arg1, class712 arg2, byte arg3) {
        if (arg2.field10066 == 0) {
            arg2.field10048 = arg2.field10085;
        } else if (arg2.field10066 == 1) {
            arg2.field10048 = (arg0 - arg2.field9966) / 2 + arg2.field10085;
        } else if (arg2.field10066 == 2) {
            arg2.field10048 = arg0 - arg2.field10085 - arg2.field9966;
        } else if (arg2.field10066 == 3) {
            arg2.field10048 = arg2.field10085 * arg0 >> 14;
        } else if (arg2.field10066 == 4) {
            arg2.field10048 = (arg2.field10085 * arg0 >> 14) + (arg0 - arg2.field9966) / 2;
        } else {
            arg2.field10048 = arg0 - arg2.field9966 - (arg2.field10085 * arg0 >> 14);
        }
        if (arg3 != 50) {
            method3815(null, 25);
        }
        field9376++;
        if (arg2.field10072 == 0) {
            arg2.field10013 = arg2.field10035;
        } else if (arg2.field10072 == 1) {
            arg2.field10013 = (arg1 - arg2.field10011) / 2 + arg2.field10035;
        } else if (arg2.field10072 == 2) {
            arg2.field10013 = arg1 - arg2.field10011 - arg2.field10035;
        } else if (arg2.field10072 == 3) {
            arg2.field10013 = arg2.field10035 * arg1 >> 14;
        } else if (arg2.field10072 == 4) {
            arg2.field10013 = (arg2.field10035 * arg1 >> 14) + (arg1 - arg2.field10011) / 2;
        } else {
            arg2.field10013 = arg1 - arg2.field10011 - (arg2.field10035 * arg1 >> 14);
        }
        if (!class399.field5526 || client.method2675(arg2).field1372 == 0 && arg2.field10039 != 0) {
            return;
        }
        if (arg2.field10013 < 0) {
            arg2.field10013 = 0;
        } else if ((arg2.field10013 + arg2.field10011) > arg1) {
            arg2.field10013 = arg1 - arg2.field10011;
        }
        if (arg2.field10048 < 0) {
            arg2.field10048 = 0;
        } else if ((arg2.field9966 + arg2.field10048) > arg0) {
            arg2.field10048 = arg0 - arg2.field9966;
            return;
        }
    }

    @OriginalMember(owner = "client!pv", name = "<init>", descriptor = "([Lot;)V", line = 94)
    public class665(class378[] arg0) {
        this.field9378 = arg0;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(Loq;ILjava/lang/String;Lda;ZLha;)V", line = 104)
    public static final void method3817(class742 arg0, int arg1, String arg2, class400 arg3, boolean arg4, class545 arg5) {
        field9380++;
        boolean var6 = !class70.field987 || class494.method2955(10);
        int var7 = 32 / ((-arg1 - 58) / 62);
        if (!var6) {
            return;
        }
        if (class70.field987 && var6) {
            class742 var13 = class430.field5924;
            class400 var14 = arg5.method2085(var13, class173.field2367, true);
            int var15 = var13.method4133(250, arg2, 114, null);
            int var16 = var13.method4136(var13.field10344, 250, (byte) -48, arg2, null);
            int var17 = class204.field2928.field4122;
            int var18 = var17 + 4;
            int var19 = var18 * 2 + var16;
            int var20 = var18 * 2 + var15;
            if (var20 < class220.field3096) {
                var20 = class220.field3096;
            }
            if (class515.field7186 > var19) {
                var19 = class515.field7186;
            }
            int var21 = class270.field3646.method554(class95.field1381, (byte) 125, var20) + class755.field10482;
            int var22 = class294.field3833.method2838(var19, class631.field8989, true) + class24.field271;
            if (class264.field3595) {
                var21 += class468.method2788(false);
                var22 += class142.method934((byte) -88);
            }
            arg5.method2126(class13.field188, false).method105(class757.field10527.field4122 + var21, class757.field10527.field4121 + var22, var20 - (class757.field10527.field4122 * 2), -(class757.field10527.field4121 * 2) + var19, 1, 0, 0);
            arg5.method2126(class757.field10527, true).method101(var21, var22);
            class757.field10527.method1864();
            arg5.method2126(class757.field10527, true).method101(var21 + var20 - var17, var22);
            class757.field10527.method1867();
            arg5.method2126(class757.field10527, true).method101(var20 + var21 - var17, var22 - -var19 + -var17);
            class757.field10527.method1864();
            arg5.method2126(class757.field10527, true).method101(var21, var19 + var22 - var17);
            class757.field10527.method1867();
            arg5.method2126(class204.field2928, true).method109(var21, class757.field10527.field4121 + var22, var17, var19 - (class757.field10527.field4121 * 2));
            class204.field2928.method1871();
            arg5.method2126(class204.field2928, true).method109(var21 + class757.field10527.field4122, var22, var20 - (class757.field10527.field4122 * 2), var17);
            class204.field2928.method1871();
            arg5.method2126(class204.field2928, true).method109(var21 + var20 - var17, class757.field10527.field4121 + var22, var17, var19 - (class757.field10527.field4121 * 2));
            class204.field2928.method1871();
            arg5.method2126(class204.field2928, true).method109(class757.field10527.field4122 + var21, -var17 + var19 + var22, var20 - (class757.field10527.field4122 * 2), var17);
            class204.field2928.method1871();
            var14.method2423(null, 1, (byte) 0, var18 + var21, 0, class509.field7101 | 0xFF000000, 0, -1, null, 0, arg2, var18 + var22, 1, null, var20 - var18 * 2, -(var18 * 2) + var19);
            class746.method4149(var20, var21, var19, (byte) 95, var22);
        } else {
            int var8 = arg0.method4133(250, arg2, 118, null);
            int var9 = arg0.method4137(null, -8629, arg2, 250) * 13;
            byte var10 = 4;
            int var11 = var10 + 6;
            int var12 = var10 + 6;
            arg5.method2194(var11 - var10, var12 - var10, var10 + var10 + var8, var9 + var10 + var10, -16777216, 0);
            arg5.method2166(var11 - var10, -var10 + var12, var8 + var10 + var10, var9 + var10 + var10, -1, 0);
            arg3.method2423(null, 1, (byte) -121, var11, 0, -1, 0, -1, null, 0, arg2, var12, 1, null, var8, var9);
            class746.method4149(var8 + var10 + var10, -var10 + var11, var9 + var10 + var10, (byte) 91, var12 - var10);
        }
        if (!arg4) {
            return;
        }
        try {
            if (class264.field3595) {
                class529.method3147(false);
            } else {
                arg5.method3262(0);
            }
        } catch (class425 var23) {
        }
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(Z)V", line = 201)
    public static void method3818(boolean arg0) {
        field9375 = null;
        if (!arg0) {
            method3818(true);
        }
    }
}
