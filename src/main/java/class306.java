import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class306 {

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "I")
    public static int field3967;

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "I")
    public static int field3968;

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "I")
    public static int field3971;

    @OriginalMember(owner = "client!cn", name = "e", descriptor = "Lqc;")
    public static class379 field3970;

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "Lwu;")
    public static class557 field3969;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "Lclient;")
    public static client field3966;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V", line = 4)
    public static void method1787(int arg0) {
        field3966 = null;
        if (arg0 == 1) {
            field3970 = null;
            field3969 = null;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lig;IIIII)V", line = 20)
    public static final void method1788(class674 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class214.field3021 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class485.field6556) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class314.field4059 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class38 var14 = class352.field4549[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class52.field741[var11].method1959(124, var13, var12) + class52.field741[var11].method1959(127, var13, var12 + 1) + class52.field741[var11].method1959(127, var13 + 1, var12) + class52.field741[var11].method1959(126, var13 + 1, var12 + 1)) / 4 - (class52.field741[arg1].method1959(123, arg3, arg2) + class52.field741[arg1].method1959(123, arg3, arg2 + 1) + class52.field741[arg1].method1959(125, arg3 + 1, arg2) + class52.field741[arg1].method1959(126, arg3 + 1, arg2 + 1)) / 4;
                                    class217 var16 = var14.field539;
                                    class217 var17 = var14.field540;
                                    if (var16 != null && var16.method373((byte) -57)) {
                                        arg0.method365(var15, (byte) 106, var6, (var13 - arg3) * class96.field1402 + (1 - arg5) * class457.field6297, class646.field9160, (var12 - arg2) * class96.field1402 + (1 - arg4) * class457.field6297, var16);
                                    }
                                    if (var17 != null && var17.method373((byte) -57)) {
                                        arg0.method365(var15, (byte) 111, var6, (var13 - arg3) * class96.field1402 + (1 - arg5) * class457.field6297, class646.field9160, (var12 - arg2) * class96.field1402 + (1 - arg4) * class457.field6297, var17);
                                    }
                                    for (class590 var18 = var14.field538; var18 != null; var18 = var18.field8467) {
                                        class743 var19 = var18.field8468;
                                        if (var19 != null && var19.method373((byte) -57) && (var19.field10352 == var12 || var7 == var12) && (var19.field10357 == var13 || var9 == var13)) {
                                            int var20 = var19.field10365 + 1 - var19.field10352;
                                            int var21 = var19.field10353 + 1 - var19.field10357;
                                            arg0.method365(var15, (byte) 91, var6, (var19.field10357 - arg3) * class96.field1402 + (var21 - arg5) * class457.field6297, class646.field9160, (var19.field10352 - arg2) * class96.field1402 + (var20 - arg4) * class457.field6297, var19);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(Lfj;I)V", line = 119)
    public static final void method1789(class656 arg0, int arg1) {
        if (arg1 < 101) {
            method1789(null, -77);
        }
        field3967++;
        arg0.field9288 = null;
        if (class654.field9228 < 20) {
            class492.field6800.method1946(-115, arg0);
            class654.field9228++;
        }
    }
}
