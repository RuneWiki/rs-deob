import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class23 {

    @OriginalMember(owner = "client!uc", name = "b", descriptor = "I")
    public static int field418 = 1;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "I")
    public static int field417;

    @OriginalMember(owner = "client!uc", name = "c", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "Lqe;")
    public static class326 field420;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(I)V")
    public static void method197(int arg0) {
        field420 = null;
        if (arg0 != 0) {
            field418 = 126;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IILqa;Lda;ILdb;)Z")
    public static final boolean method198(int arg0, int arg1, class162 arg2, class42 arg3, int arg4, class210 arg5) {
        field417++;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg5.field3035 != null) {
            var7 = (arg5.field3045 + arg3.field644 - class2.field41) * (class2.field33 - class2.field49) / (class2.field45 - class2.field41) + class2.field49;
            var9 = class2.field48 - (class2.field48 - class2.field46) * (arg5.field3031 + arg3.field641 - class2.field43) / (class2.field38 - class2.field43);
            var8 = class2.field48 - (arg3.field641 + arg5.field3030 - class2.field43) * (class2.field48 - class2.field46) / (class2.field38 - class2.field43);
            var6 = class2.field49 + ((arg5.field3040 + arg3.field644 - class2.field41) * (class2.field33 - class2.field49) / (class2.field45 - class2.field41));
        }
        class528 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg5.field3042 != -1) {
            if (arg3.field638 && arg5.field3036 != -1) {
                var10 = arg5.method1404(arg2, arg1 - 142664517, true);
            } else {
                var10 = arg5.method1404(arg2, -142664515, false);
            }
            if (var10 != null) {
                var11 = arg3.field645 - (var10.method134() + 1 >> 1);
                if (var6 > var11) {
                    var6 = var11;
                }
                var12 = arg3.field645 + (var10.method134() + 1 >> 1);
                var13 = arg3.field650 - (var10.method131() + 1 >> 1);
                if (var7 < var12) {
                    var7 = var12;
                }
                if (var8 > var13) {
                    var8 = var13;
                }
                var14 = arg3.field650 + (var10.method131() + 1 >> 1);
                if (var9 < var14) {
                    var9 = var14;
                }
            }
        }
        class130 var15 = null;
        int var16 = 0;
        int var17 = 0;
        if (arg1 != 2) {
            method198(12, -110, null, null, -55, null);
        }
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        if (arg5.field3039 != null) {
            var15 = class33.method264(arg5.field3015, -102);
            if (var15 != null) {
                var16 = class469.field6896.method106(class283.field4111, null, arg5.field3039, null, false);
                int var23 = arg3.field650;
                if (var10 == null) {
                    var17 = var23 - var15.method959() * var16 / 2;
                } else {
                    var17 = var23 - ((var10.method131() >> 1) + (var16 * var15.method960()));
                }
                for (int var24 = 0; var24 < var16; var24++) {
                    String var25 = class283.field4111[var24];
                    if ((var16 - 1) > var24) {
                        var25 = var25.substring(0, var25.length() - 4);
                    }
                    int var26 = var15.method961(var25);
                    if (var26 > var18) {
                        var18 = var26;
                    }
                }
                var19 = arg3.field645 + arg4 - (var18 / 2);
                if (var19 < var6) {
                    var6 = var19;
                }
                var20 = var18 / 2 + arg4 + arg3.field645;
                var21 = arg0 + var17;
                if (var20 > var7) {
                    var7 = var20;
                }
                var22 = var17 + var16 * var15.method960() + arg0;
                if (var8 > var21) {
                    var8 = var21;
                }
                if (var22 > var9) {
                    var9 = var22;
                }
            }
        }
        if (var7 < class2.field49 || var6 > class2.field33 || class2.field46 > var9 || class2.field48 < var8) {
            return true;
        }
        if (arg5.field3035 != null) {
            int[] var27 = new int[arg5.field3035.length];
            for (int var28 = 0; var28 < (var27.length / 2); var28++) {
                int var30 = arg5.field3035[var28 * 2] + arg3.field644;
                int var31 = arg5.field3035[var28 * 2 + 1] + arg3.field641;
                var27[var28 * 2] = (class2.field33 - class2.field49) * (var30 - class2.field41) / (class2.field45 - class2.field41) + class2.field49;
                var27[var28 * 2 + 1] = class2.field48 - ((class2.field48 - class2.field46) * (var31 - class2.field43) / (class2.field38 - class2.field43));
            }
            class299.method1847(arg2, var27, arg5.field3019);
            for (int var29 = 0; var29 < var27.length / 2 - 1; var29++) {
                arg2.method1178(var27[var29 * 2], var27[var29 * 2 + 1], var27[(var29 + 1) * 2], var27[(var29 + 1) * 2 + 1], false, arg5.field3050);
            }
            arg2.method1178(var27[var27.length - 2], var27[var27.length - 1], var27[0], var27[1], false, arg5.field3050);
        }
        if (var10 != null) {
            if (class410.field6034 > 0 && (class36.field540 != -1 && class36.field540 == arg3.field649 || class25.field441 != -1 && class25.field441 == arg5.field3016)) {
                int var32;
                if (class421.field6199 > 50) {
                    var32 = 200 - (class421.field6199 * 2);
                } else {
                    var32 = class421.field6199 * 2;
                }
                int var33 = var32 << 24 | 0xFFFF00;
                arg2.method1170(arg3.field650, var33, (byte) 111, arg3.field645, var10.method137() / 2 + 7);
                arg2.method1170(arg3.field650, var33, (byte) 111, arg3.field645, var10.method137() / 2 + 5);
                arg2.method1170(arg3.field650, var33, (byte) 111, arg3.field645, var10.method137() / 2 + 3);
                arg2.method1170(arg3.field650, var33, (byte) 111, arg3.field645, var10.method137() / 2 + 1);
                arg2.method1170(arg3.field650, var33, (byte) 111, arg3.field645, var10.method137() / 2);
            }
            var10.method3129(arg3.field645 - (var10.method134() >> 1), arg3.field650 + -(var10.method131() >> 1));
        }
        if (arg5.field3039 != null && var15 != null) {
            class413.method2547(false, arg5, var18, arg3, arg2, var15, var16, var17);
        }
        if (arg5.field3042 != -1 || arg5.field3039 != null) {
            class469 var34 = new class469(arg3);
            var34.field6905 = var20;
            var34.field6903 = var11;
            var34.field6897 = var21;
            var34.field6900 = var14;
            var34.field6906 = var12;
            var34.field6895 = var22;
            var34.field6904 = var19;
            var34.field6898 = var13;
            class282.field4093.method2270(0, var34);
        }
        return false;
    }
}
