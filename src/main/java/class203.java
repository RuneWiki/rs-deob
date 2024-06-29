import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class203 {

    @OriginalMember(owner = "client!we", name = "a", descriptor = "I")
    public static int field4002 = 0;

    @OriginalMember(owner = "client!we", name = "e", descriptor = "Lsd;")
    public static class166 field4006 = class135.method935("::rect_debug", 0);

    @OriginalMember(owner = "client!we", name = "h", descriptor = "Lsd;")
    public static class166 field4009 = class135.method935("Fehler bei der Verbindung zum Server)3", 0);

    @OriginalMember(owner = "client!we", name = "g", descriptor = "Lb;")
    public static class11 field4008 = new class11(30);

    @OriginalMember(owner = "client!we", name = "l", descriptor = "Lsd;")
    private static class166 field4013 = class135.method935("Type", 0);

    @OriginalMember(owner = "client!we", name = "k", descriptor = "Lsd;")
    public static class166 field4012 = field4013;

    @OriginalMember(owner = "client!we", name = "b", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!we", name = "d", descriptor = "I")
    public static int field4005;

    @OriginalMember(owner = "client!we", name = "f", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!we", name = "j", descriptor = "I")
    public static int field4011;

    @OriginalMember(owner = "client!we", name = "c", descriptor = "Lcb;")
    public static class22 field4004;

    @OriginalMember(owner = "client!we", name = "i", descriptor = "Lf;")
    public static class47 field4010;

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(I)V")
    public static final void method1333(int arg0) {
        if (arg0 != -1) {
            field4002 = -39;
        }
        field4005++;
        for (class18 var1 = (class18) class106.field2075.method1109((byte) -95); var1 != null; var1 = (class18) class106.field2075.method1115((byte) -68)) {
            if (class165.field3130 != var1.field318 || class49.field910 > var1.field311) {
                var1.method915(0);
            } else if (var1.field295 <= class49.field910) {
                if (var1.field291 > 0) {
                    class154 var2 = class124.field2434[var1.field291 - 1];
                    if (var2 != null && var2.field3526 >= 0 && var2.field3526 < 13312 && var2.field3513 >= 0 && var2.field3513 < 13312) {
                        var1.method115(var2.field3513, var2.field3526, (byte) 22, class119.method864(var2.field3526, var2.field3513, var1.field318, true) - var1.field315, class49.field910);
                    }
                }
                if (var1.field291 < 0) {
                    int var3 = -var1.field291 - 1;
                    class123 var4;
                    if (class69.field1397 == var3) {
                        var4 = class41.field728;
                    } else {
                        var4 = class182.field3451[var3];
                    }
                    if (var4 != null && var4.field3526 >= 0 && var4.field3526 < 13312 && var4.field3513 >= 0 && var4.field3513 < 13312) {
                        var1.method115(var4.field3513, var4.field3526, (byte) 22, class119.method864(var4.field3526, var4.field3513, var1.field318, true) - var1.field315, class49.field910);
                    }
                }
                var1.method108(class187.field3570, 1024);
                class131.field2556.method590(class165.field3130, (int) var1.field309, (int) var1.field305, (int) var1.field326, 60, var1, var1.field317, -1, false);
            }
        }
    }

    @OriginalMember(owner = "client!we", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1334(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4007++;
        if (arg3 < 17 || (arg0 < 1 || arg4 < 1 || arg0 > 102 || arg4 > 102)) {
            return;
        }
        if (class97.field1858 && class165.field3130 != arg2) {
            return;
        }
        int var8 = 0;
        boolean var9 = true;
        if (arg5 == 0) {
            var8 = class131.field2556.method595(arg2, arg0, arg4);
        }
        if (arg5 == 1) {
            var8 = class131.field2556.method622(arg2, arg0, arg4);
        }
        boolean var10 = false;
        if (arg5 == 2) {
            var8 = class131.field2556.method620(arg2, arg0, arg4);
        }
        boolean var11 = false;
        if (arg5 == 3) {
            var8 = class131.field2556.method600(arg2, arg0, arg4);
        }
        if (var8 != 0) {
            int var12 = var8 >> 14 & 0x7FFF;
            int var13 = class131.field2556.method576(arg2, arg0, arg4, var8);
            int var14 = var13 & 0x1F;
            int var15 = var13 >> 6 & 0x3;
            if (arg5 == 0) {
                class131.field2556.method605(arg2, arg0, arg4);
                class145 var16 = class170.method1185((byte) 58, var12);
                if (var16.field2819 != 0) {
                    class46.field822[arg2].method961(4, var15, var14, var16.field2866, arg4, arg0);
                }
            }
            if (arg5 == 1) {
                class131.field2556.method585(arg2, arg0, arg4);
            }
            if (arg5 == 2) {
                class131.field2556.method610(arg2, arg0, arg4);
                class145 var17 = class170.method1185((byte) 48, var12);
                if (var17.field2825 + arg0 > 103 || var17.field2825 + arg4 > 103 || var17.field2832 + arg0 > 103 || var17.field2832 + arg4 > 103) {
                    return;
                }
                if (var17.field2819 != 0) {
                    class46.field822[arg2].method968(var17.field2866, true, var15, arg4, var17.field2832, var17.field2825, arg0);
                }
            }
            if (arg5 == 3) {
                class131.field2556.method586(arg2, arg0, arg4);
                class145 var18 = class170.method1185((byte) 55, var12);
                if (var18.field2819 == 1) {
                    class46.field822[arg2].method969(9855, arg4, arg0);
                }
            }
        }
        if (arg6 < 0) {
            return;
        }
        int var19 = arg2;
        if (arg2 < 3 && (class122.field2387[1][arg0][arg4] & 0x2) == 2) {
            var19 = arg2 + 1;
        }
        class19.method122(class131.field2556, -6, arg2, var19, arg7, arg4, class46.field822[arg2], arg6, arg1, arg0);
        return;
    }

    @OriginalMember(owner = "client!we", name = "b", descriptor = "(I)V")
    public static void method1335(int arg0) {
        field4013 = null;
        field4009 = null;
        field4006 = null;
        field4012 = null;
        field4008 = null;
        if (arg0 != 536864357) {
            field4006 = null;
        }
        field4010 = null;
        field4004 = null;
    }
}
