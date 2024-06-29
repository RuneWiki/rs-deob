import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iu")
public class class530 {

    @OriginalMember(owner = "client!iu", name = "b", descriptor = "I")
    public static int field6723 = -1;

    @OriginalMember(owner = "client!iu", name = "k", descriptor = "I")
    public static int field6732 = 1;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "I")
    public static int field6722;

    @OriginalMember(owner = "client!iu", name = "c", descriptor = "I")
    public static int field6724;

    @OriginalMember(owner = "client!iu", name = "d", descriptor = "I")
    public static int field6725;

    @OriginalMember(owner = "client!iu", name = "e", descriptor = "I")
    public static int field6726;

    @OriginalMember(owner = "client!iu", name = "g", descriptor = "I")
    public static int field6728;

    @OriginalMember(owner = "client!iu", name = "h", descriptor = "I")
    public static int field6729;

    @OriginalMember(owner = "client!iu", name = "i", descriptor = "I")
    public static int field6730;

    @OriginalMember(owner = "client!iu", name = "j", descriptor = "I")
    public static int field6731;

    @OriginalMember(owner = "client!iu", name = "f", descriptor = "Lrga;")
    public static class308 field6727;

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Z)V")
    public static void method2901(boolean arg0) {
        if (!arg0) {
            field6727 = null;
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIB)Z")
    public static final boolean method2902(int arg0, int arg1, byte arg2) {
        field6728++;
        if (arg2 == 108) {
            return (arg1 & 0x34) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(Ljava/lang/String;Lha;Lda;ZILne;)V")
    public static final void method2903(String arg0, class570 arg1, class420 arg2, boolean arg3, int arg4, class166 arg5) {
        field6729++;
        if (arg4 != -1) {
            method2908((byte) 31, null);
        }
        boolean var6 = !class536.field6762 || class425.method2450(arg4 ^ 0xFFFFFFFC);
        if (!var6) {
            return;
        }
        if (class536.field6762 && var6) {
            class166 var12 = class718.field9422;
            class420 var13 = arg1.method1002(var12, class279.field3626, true);
            int var14 = var12.method1059((byte) -119, arg0, null, 250);
            int var15 = var12.method1053(arg0, null, 250, var12.field2209, 22036);
            int var16 = class164.field2174.field4950;
            int var17 = var16 + 4;
            int var18 = var17 * 2 + var14;
            int var19 = var17 * 2 + var15;
            if (var19 < class730.field9572) {
                var19 = class730.field9572;
            }
            if (var18 < class518.field6596) {
                var18 = class518.field6596;
            }
            int var20 = class785.field10774.method4129(arg4 + 1, class719.field9443, var18) + class405.field5376;
            int var21 = class23.field201.method90(class398.field5240, var19, 118) + class63.field829;
            if (class602.field7657) {
                var20 += class498.method2765((byte) -62);
                var21 += class507.method2806((byte) -78);
            }
            arg1.method977(class81.field1147, false).method625(var20 + class196.field2732.field4950, class196.field2732.field4946 + var21, var18 - (class196.field2732.field4950 * 2), -(class196.field2732.field4946 * 2) + var19, 1, 0, 0);
            arg1.method977(class196.field2732, true).method4203(var20, var21);
            class196.field2732.method2234();
            arg1.method977(class196.field2732, true).method4203(var18 + var20 - var16, var21);
            class196.field2732.method2238();
            arg1.method977(class196.field2732, true).method4203(var18 + var20 - var16, -var16 + var21 + var19);
            class196.field2732.method2234();
            arg1.method977(class196.field2732, true).method4203(var20, var19 + var21 - var16);
            class196.field2732.method2238();
            arg1.method977(class164.field2174, true).method4198(var20, class196.field2732.field4946 + var21, var16, var19 - (class196.field2732.field4946 * 2));
            class164.field2174.method2235();
            arg1.method977(class164.field2174, true).method4198(class196.field2732.field4950 + var20, var21, var18 - (class196.field2732.field4950 * 2), var16);
            class164.field2174.method2235();
            arg1.method977(class164.field2174, true).method4198(var18 + var20 - var16, class196.field2732.field4946 + var21, var16, var19 - (class196.field2732.field4946 * 2));
            class164.field2174.method2235();
            arg1.method977(class164.field2174, true).method4198(class196.field2732.field4950 + var20, var19 + var21 + -var16, var18 - (class196.field2732.field4950 * 2), var16);
            class164.field2174.method2235();
            var13.method2426((byte) -115, 1, null, var17 + var20, var17 + var21, arg0, 0, 1, null, var18 - (var17 * 2), 0, -1, 0, class719.field9457 | 0xFF000000, var19 - (var17 * 2), null);
            class205.method1388(arg4 ^ 0xFFFFFF9D, var20, var19, var21, var18);
        } else {
            int var7 = arg5.method1059((byte) -119, arg0, null, 250);
            int var8 = arg5.method1056(250, arg0, -1, null) * 13;
            byte var9 = 4;
            int var10 = var9 + 6;
            int var11 = var9 + 6;
            arg1.method921(var10 - var9, -var9 + var11, var7 + var9 + var9, var8 + var9 + var9, -16777216, 0);
            arg1.method911(var10 - var9, var11 - var9, var9 + var9 + var7, var9 + var9 + var8, -1, 0);
            arg2.method2426((byte) -126, 1, null, var10, var11, arg0, 0, 1, null, var7, 0, -1, 0, -1, var8, null);
            class205.method1388(41, var10 - var9, var8 + var9 + var9, var11 - var9, var7 + var9 + var9);
        }
        if (!arg3) {
            return;
        }
        try {
            if (class602.field7657) {
                class129.method762((byte) -96);
            } else {
                arg1.method3073(0);
            }
        } catch (class15 var22) {
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(I)V")
    public static final void method2904(int arg0) {
        class45.method278(0);
        field6726++;
        class343.field4206 = null;
        class629.field7987 = null;
        class501.field6435 = null;
        if (arg0 >= -109) {
            field6727 = null;
        }
        class702.field9291 = null;
        class259.field3483 = null;
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2905(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg2 <= 56) {
            return;
        }
        field6724++;
        if (arg0 == arg1) {
            class681.method3662(arg7, 118, arg4, arg6, arg3, arg5, arg1);
        } else if ((arg4 - arg1) >= class498.field6390 && class30.field274 >= (arg1 + arg4) && class80.field1131 <= (arg7 - arg0) && arg7 + arg0 <= class405.field5375) {
            class139.method798(arg7, -113, arg0, arg3, arg1, arg5, arg4, arg6);
        } else {
            class425.method2449(arg3, arg6, arg4, 13668, arg5, arg1, arg7, arg0);
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(IIIIIII)I")
    public static final int method2906(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = arg6 & 0x3;
        if ((arg4 & 0x1) == 1) {
            int var8 = arg5;
            arg5 = arg1;
            arg1 = var8;
        }
        field6730++;
        if (var7 == 0) {
            return arg2;
        } else if (var7 == 1) {
            return 7 + 1 - arg3 - arg5;
        } else if (arg0 <= 90) {
            return 16;
        } else if (var7 == 2) {
            return 1 - (arg1 - (7 - arg2));
        } else {
            return arg3;
        }
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(II)V")
    public static final void method2907(int arg0, int arg1) {
        field6725++;
        int var2 = 94 % ((arg1 + 85) / 39);
        class614 var3 = class497.method2759(1, 5977, (long) arg0);
        var3.method3279(false);
    }

    @OriginalMember(owner = "client!iu", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method2908(byte arg0, String arg1) {
        field6722++;
        int var2 = 38 / ((arg0 + 12) / 40);
        return class291.method1761(arg1, true, (byte) 90, 10);
    }
}
