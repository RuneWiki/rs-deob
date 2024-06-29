import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hg")
public class class161 {

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "Lwa;")
    public static class75 field2726 = class66.method560(")4l=", false);

    @OriginalMember(owner = "client!hg", name = "c", descriptor = "Z")
    public static boolean field2727 = true;

    @OriginalMember(owner = "client!hg", name = "g", descriptor = "Lwa;")
    private static class75 field2731 = class66.method560("wishes to trade with you)3", false);

    @OriginalMember(owner = "client!hg", name = "i", descriptor = "Lwa;")
    private static class75 field2733 = class66.method560("RuneScape is loading )2 please wait)3)3)3", false);

    @OriginalMember(owner = "client!hg", name = "k", descriptor = "I")
    public static int field2735 = 0;

    @OriginalMember(owner = "client!hg", name = "m", descriptor = "I")
    public static int field2737 = 0;

    @OriginalMember(owner = "client!hg", name = "h", descriptor = "Lwa;")
    public static class75 field2732 = field2733;

    @OriginalMember(owner = "client!hg", name = "n", descriptor = "Z")
    public static boolean field2738 = false;

    @OriginalMember(owner = "client!hg", name = "p", descriptor = "I")
    public static int field2740 = 0;

    @OriginalMember(owner = "client!hg", name = "q", descriptor = "Lwa;")
    public static class75 field2741 = field2731;

    @OriginalMember(owner = "client!hg", name = "r", descriptor = "Lwa;")
    public static class75 field2742 = class66.method560(" )2> <col=ffff00>", false);

    @OriginalMember(owner = "client!hg", name = "s", descriptor = "Lwa;")
    public static class75 field2743 = class66.method560("gelb:", false);

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "I")
    public static int field2725;

    @OriginalMember(owner = "client!hg", name = "d", descriptor = "I")
    public static int field2728;

    @OriginalMember(owner = "client!hg", name = "e", descriptor = "I")
    public static int field2729;

    @OriginalMember(owner = "client!hg", name = "f", descriptor = "I")
    public static int field2730;

    @OriginalMember(owner = "client!hg", name = "j", descriptor = "I")
    public static int field2734;

    @OriginalMember(owner = "client!hg", name = "l", descriptor = "I")
    public static int field2736;

    @OriginalMember(owner = "client!hg", name = "o", descriptor = "I")
    public static int field2739;

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIIIIIII)V", line = 11)
    public static final void method1206(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2736++;
        if (arg2 < 128 || arg5 < 128 || arg2 > 13056 || arg5 > 13056) {
            class16.field208 = -1;
            class283.field4873 = -1;
            return;
        }
        int var8 = class32.method217(arg2, arg5, true, class67.field1174) - arg0;
        int var9 = var8 - class228.field3825;
        int var10 = arg2 - class245.field4120;
        int var11 = arg5 - class9.field121;
        int var12 = class21.field286[class232.field3931];
        int var13 = class21.field288[class232.field3931];
        int var14 = class21.field288[class87.field1433];
        int var15 = class21.field286[class87.field1433];
        int var16 = var10 * var15 + var11 * var14 >> 16;
        int var17 = var11 * var15 - (var10 * var14) >> 16;
        int var19 = var9 * var12 - (var13 * var17) >> 16;
        int var20 = var9 * var13 + var12 * var17 >> 16;
        if (arg3 > var20) {
            class16.field208 = -1;
            class283.field4873 = -1;
        } else {
            int var22 = arg6 * 512 >> 8;
            class16.field208 = var16 * var22 / var20 + arg7;
            int var23 = arg1 * 512 >> 8;
            class283.field4873 = arg4 + (var19 * var23 / var20);
        }
    }

    @OriginalMember(owner = "client!hg", name = "b", descriptor = "(IIIIIIII)V", line = 73)
    public static final void method1207(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field2730++;
        int var8 = 0;
        int var9 = arg2;
        int var10 = 0;
        int var11 = arg2 - arg7;
        int var12 = arg6 - arg7;
        int var13 = arg6 * arg6;
        int var14 = arg2 * arg2;
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var15 << 1;
        int var19 = var13 << 1;
        int var20 = var16 << 1;
        int var21 = arg2 << 1;
        int var22 = var11 << 1;
        int var23 = (1 - var21) * var13 + var17;
        int var24 = (1 - var22) * var16 + var18;
        int var25 = var14 - ((var21 - 1) * var19);
        int var26 = var15 - ((var22 - 1) * var20);
        int var27 = var14 << 2;
        int var28 = var13 << 2;
        int var29 = var16 << 2;
        int var30 = var17 * 3;
        int var31 = var15 << 2;
        int var32 = (var22 - 3) * var20;
        int var33 = var18 * 3;
        int var34 = (var21 - 3) * var19;
        int var35 = var27;
        int var36 = (arg2 - 1) * var28;
        int var37 = (arg1 + var11) * var29;
        int var38 = var31;
        if (arg3 >= class90.field1495 && class294.field5041 >= arg3) {
            int[] var39 = class63.field1096[arg3];
            int var40 = class14.method74(class288.field4956, arg0 - arg6, arg1 + -1178441848, class153.field2635);
            int var41 = class14.method74(class288.field4956, arg0 + arg6, arg1 ^ 0x463D9878, class153.field2635);
            int var42 = class14.method74(class288.field4956, arg0 - var12, -1178441849, class153.field2635);
            int var43 = class14.method74(class288.field4956, arg0 + var12, -1178441849, class153.field2635);
            class150.method1151(7, var39, var40, arg4, var42);
            class150.method1151(7, var39, var42, arg5, var43);
            class150.method1151(arg1 + 8, var39, var43, arg4, var41);
        }
        while (var9 > 0) {
            if (var23 < 0) {
                while (var23 < 0) {
                    var23 += var30;
                    var25 += var35;
                    var35 += var27;
                    var30 += var27;
                    var8++;
                }
            }
            if (var25 < 0) {
                var25 += var35;
                var8++;
                var23 += var30;
                var35 += var27;
                var30 += var27;
            }
            var25 += -var34;
            boolean var44 = var11 >= var9;
            var34 -= var28;
            var23 += -var36;
            var36 -= var28;
            var9--;
            if (var44) {
                if (var24 < 0) {
                    while (var24 < 0) {
                        var10++;
                        var26 += var38;
                        var24 += var33;
                        var33 += var31;
                        var38 += var31;
                    }
                }
                if (var26 < 0) {
                    var10++;
                    var26 += var38;
                    var38 += var31;
                    var24 += var33;
                    var33 += var31;
                }
                var26 += -var32;
                var24 += -var37;
                var32 -= var29;
                var37 -= var29;
            }
            int var45 = arg3 - var9;
            int var46 = arg3 + var9;
            if (class90.field1495 <= var46 && class294.field5041 >= var45) {
                int var47 = class14.method74(class288.field4956, arg0 + var8, -1178441849, class153.field2635);
                int var48 = class14.method74(class288.field4956, arg0 - var8, arg1 + -1178441848, class153.field2635);
                if (var44) {
                    int var49 = class14.method74(class288.field4956, arg0 + var10, -1178441849, class153.field2635);
                    int var50 = class14.method74(class288.field4956, arg0 - var10, -1178441849, class153.field2635);
                    if (var45 >= class90.field1495) {
                        int[] var51 = class63.field1096[var45];
                        class150.method1151(arg1 ^ 0xFFFFFFF8, var51, var48, arg4, var50);
                        class150.method1151(7, var51, var50, arg5, var49);
                        class150.method1151(arg1 + 8, var51, var49, arg4, var47);
                    }
                    if (class294.field5041 >= var46) {
                        int[] var52 = class63.field1096[var46];
                        class150.method1151(7, var52, var48, arg4, var50);
                        class150.method1151(arg1 + 8, var52, var50, arg5, var49);
                        class150.method1151(7, var52, var49, arg4, var47);
                    }
                } else {
                    if (class90.field1495 <= var45) {
                        class150.method1151(arg1 + 8, class63.field1096[var45], var48, arg4, var47);
                    }
                    if (var46 <= class294.field5041) {
                        class150.method1151(7, class63.field1096[var46], var48, arg4, var47);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(IIB)Lre;", line = 282)
    public static final class262 method1208(int arg0, int arg1, byte arg2) {
        field2734++;
        class262 var3 = class51.method374(-44, arg0);
        if (arg1 == -1) {
            return var3;
        } else {
            if (arg2 < 23) {
                method1207(-5, 31, -86, -9, 86, -48, -28, -45);
            }
            return var3 == null || var3.field4532 == null || arg1 >= var3.field4532.length ? null : var3.field4532[arg1];
        }
    }

    @OriginalMember(owner = "client!hg", name = "a", descriptor = "(B)V", line = 321)
    public static void method1209(byte arg0) {
        field2732 = null;
        field2743 = null;
        field2741 = null;
        field2726 = null;
        int var1 = -26 % ((33 - arg0) / 47);
        field2731 = null;
        field2733 = null;
        field2742 = null;
    }
}
