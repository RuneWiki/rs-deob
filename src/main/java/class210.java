import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class210 {

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "Lld;")
    public static class105 field2836 = new class105();

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "I")
    public static int field2835;

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!tk", name = "d", descriptor = "I")
    public static int field2838;

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!tk", name = "e", descriptor = "Ljd;")
    public static class139 field2839;

    @OriginalMember(owner = "client!tk", name = "f", descriptor = "Lkp;")
    public static class312 field2840;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IILjc;III)V")
    public static final void method1194(int arg0, int arg1, class279 arg2, int arg3, int arg4, int arg5) {
        field2838++;
        if (arg2.field3690 == -1 && arg2.field3711 == null) {
            return;
        }
        int var6 = 0;
        int var7 = class488.field6789.field6671 * arg2.field3707 >> 8;
        if (arg2.field3692 < arg4) {
            var6 += arg4 - arg2.field3692;
        } else if (arg4 < arg2.field3697) {
            var6 += arg2.field3697 - arg4;
        }
        if (arg3 > arg2.field3704) {
            var6 += arg3 - arg2.field3704;
        } else if (arg3 < arg2.field3713) {
            var6 += arg2.field3713 - arg3;
        }
        if (arg2.field3701 == 0 || arg2.field3701 < var6 - 64 || class488.field6789.field6671 == 0 || arg2.field3705 != arg1) {
            if (arg2.field3706 != null) {
                class181.field2494.method2204(arg2.field3706);
                arg2.field3706 = null;
            }
            if (arg2.field3694 != null) {
                class181.field2494.method2204(arg2.field3694);
                arg2.field3694 = null;
            }
            return;
        }
        var6 -= 64;
        if (arg5 != -27082) {
            return;
        }
        if (var6 < 0) {
            var6 = 0;
        }
        int var8 = (arg2.field3701 - var6) * var7 / arg2.field3701;
        if (arg2.field3706 != null) {
            arg2.field3706.method286(var8);
        } else if (arg2.field3690 >= 0) {
            class85 var9 = class85.method534(class265.field3506, arg2.field3690, 0);
            if (var9 != null) {
                class465 var10 = var9.method533().method2743(class159.field2197);
                class44 var11 = class44.method314(var10, 100, var8);
                var11.method292(-1);
                class181.field2494.method2206(var11);
                arg2.field3706 = var11;
            }
        }
        if (arg2.field3694 != null) {
            arg2.field3694.method286(var8);
            if (arg2.field3694.method2608(25657)) {
                return;
            }
            arg2.field3694 = null;
        } else if (arg2.field3711 != null && (arg2.field3708 -= arg0) <= 0) {
            int var12 = (int) ((double) arg2.field3711.length * Math.random());
            class85 var13 = class85.method534(class265.field3506, arg2.field3711[var12], 0);
            if (var13 != null) {
                class465 var14 = var13.method533().method2743(class159.field2197);
                class44 var15 = class44.method314(var14, 100, var8);
                var15.method292(0);
                class181.field2494.method2206(var15);
                arg2.field3708 = (int) ((double) (arg2.field3693 - arg2.field3703) * Math.random()) + arg2.field3703;
                arg2.field3694 = var15;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(ILnh;II)V")
    public static final void method1195(int arg0, class487 arg1, int arg2, int arg3) {
        if (arg1.field1137 == arg3 && arg3 != -1) {
            class181 var4 = class395.field5477.method266(arg0 ^ 0x3EEB, arg3);
            int var5 = var4.field2470;
            if (var5 == 1) {
                arg1.field1130 = arg2;
                arg1.field1150 = 0;
                arg1.field1132 = 1;
                arg1.field1138 = 0;
                arg1.field1169 = 0;
                class402.method2437(var4, class233.field3103 == arg1, arg1.field6502, arg0 ^ 0x3A, arg1.field6501, arg1.field6507, arg1.field1150);
            }
            if (var5 == 2) {
                arg1.field1138 = 0;
            }
        } else if (arg3 == -1 || arg1.field1137 == -1 || class395.field5477.method266(16107, arg3).field2471 >= class395.field5477.method266(16107, arg1.field1137).field2471) {
            arg1.field1137 = arg3;
            arg1.field1138 = 0;
            arg1.field1169 = 0;
            arg1.field1202 = arg1.field1203;
            arg1.field1130 = arg2;
            arg1.field1132 = 1;
            arg1.field1150 = 0;
            if (arg1.field1137 != -1) {
                class402.method2437(class395.field5477.method266(arg0 + 16107, arg1.field1137), class233.field3103 == arg1, arg1.field6502, 73, arg1.field6501, arg1.field6507, arg1.field1150);
            }
        }
        field2835++;
        if (arg0 != 0) {
            field2840 = null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V")
    public static void method1196(int arg0) {
        if (arg0 == -27084) {
            field2836 = null;
            field2840 = null;
            field2839 = null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)V")
    public static final void method1197(int arg0) {
        field2837++;
        class31.method179((long) class70.field968, 0, class98.field1432);
        if (class196.field2674 != -1) {
            class208.method1183(5173, class196.field2674);
        }
        for (int var1 = 0; var1 < class318.field4195; var1++) {
            if (class102.field1468[var1]) {
                class385.field5327[var1] = true;
            }
            class42.field595[var1] = class102.field1468[var1];
            class102.field1468[var1] = false;
        }
        class59.field794 = class70.field968;
        if (class98.field1432.method1999()) {
            class243.field3239 = true;
        }
        if (arg0 != -9962) {
            field2841 = 75;
        }
        if (class196.field2674 != -1) {
            class318.field4195 = 0;
            class472.method2770(78);
        }
        class98.field1432.method2006();
        class213.method1204(class186.field2558, false);
        class448.field6098 = 0;
    }
}
