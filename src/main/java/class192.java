import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class192 {

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2879 = "Prepared sound engine";

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "I")
    public static int field2878;

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
    public static int field2880;

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "I")
    public static int field2882;

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "Ltj;")
    public static class201 field2881;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(B)I", line = 5)
    public static final int method1308(byte arg0) {
        field2880++;
        if (class236.field3637) {
            return 0;
        } else if (arg0 != -39) {
            return 32;
        } else if (class103.method653(-29308)) {
            return class38.field430 ? 2 : 1;
        } else {
            return 1;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V", line = 25)
    public static void method1309(int arg0) {
        field2879 = null;
        if (arg0 >= -102) {
            method1311((class294) null, 40, 30, -25, 89, 29);
        }
        field2881 = null;
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(IIIBIII)V", line = 37)
    public static final void method1310(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        if (arg3 != -23) {
            field2879 = (String) null;
        }
        field2877++;
        if (class337.field5389 <= arg1 && arg5 <= class344.field5460 && class244.field3844 <= arg6 && arg4 <= class2.field22) {
            if (arg2 == 1) {
                class259.method1826(arg4, arg5, arg6, arg1, true, arg0);
            } else {
                class10.method61(arg4, 0, arg6, arg0, arg5, arg1, arg2);
            }
        } else if (arg2 == 1) {
            class327.method2275(arg5, arg1, arg6, arg4, arg0, arg3 ^ 0x69);
        } else {
            class229.method1592(arg0, arg5, arg4, (byte) -96, arg1, arg6, arg2);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lio;IIIII)V", line = 84)
    public static final void method1311(class294 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class196.field2973 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class236.field3633) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class293.field4607 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class196 var14 = class194.field2947[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class72.field902[var11][var12 + 1][var13] + class72.field902[var11][var12][var13] + class72.field902[var11][var12][var13 + 1] + class72.field902[var11][var12 + 1][var13 + 1]) / 4 - (class72.field902[arg1][arg2 + 1][arg3] + class72.field902[arg1][arg2][arg3] + class72.field902[arg1][arg2][arg3 + 1] + class72.field902[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class123 var16 = var14.field2999;
                                    if (var16 != null) {
                                        if (var16.field1697.method851()) {
                                            arg0.method845(var16.field1697, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field1705 != null && var16.field1705.method851()) {
                                            arg0.method845(var16.field1705, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field2979; var17++) {
                                        class44 var18 = var14.field2998[var17];
                                        if (var18 != null && var18.field494.method851() && (var18.field504 == var12 || var7 == var12) && (var18.field497 == var13 || var9 == var13)) {
                                            int var19 = var18.field501 + 1 - var18.field504;
                                            int var20 = var18.field498 + 1 - var18.field497;
                                            arg0.method845(var18.field494, (var18.field504 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field497 - arg3) * 128 + (var20 - arg5) * 64, var6);
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

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(II)I", line = 179)
    public static final int method1312(int arg0, int arg1) {
        if (arg1 != 64) {
            field2881 = (class201) null;
        }
        field2878++;
        return arg0 & 0xFF;
    }
}
