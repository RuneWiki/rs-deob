import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public class class133 {

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "Ldc;")
    public static class37 field2476 = class185.method1233((byte) 86, "Bitte benutzen Sie eine andere Welt)3");

    @OriginalMember(owner = "client!mc", name = "o", descriptor = "Ldc;")
    public static class37 field2480 = class185.method1233((byte) 86, "Mitglieder)2Welt");

    @OriginalMember(owner = "client!mc", name = "n", descriptor = "Ldc;")
    private static class37 field2479 = class185.method1233((byte) 86, "Connecting to update server");

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "Ldc;")
    public static class37 field2470 = field2479;

    @OriginalMember(owner = "client!mc", name = "m", descriptor = "Ldc;")
    private static class37 field2478 = class185.method1233((byte) 86, "Loaded wordpack");

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "Ldc;")
    public static class37 field2471 = field2478;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public static int field2466;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public static int field2467;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "I")
    public static int field2473;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
    public static int field2474;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
    public static int field2475;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "Lmf;")
    public static class136 field2469;

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "Lrb;")
    public static class187 field2472;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "Lwa;")
    public static class238 field2468;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "[I")
    public static int[] field2477;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ZIIIII)V")
    public static final void method923(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        class181.field3374[0].method662(arg2, arg5);
        field2467++;
        class181.field3374[1].method662(arg2, arg1 + arg5 - 16);
        int var6 = (arg1 - 32) * arg1 / arg3;
        if (var6 < 8) {
            var6 = 8;
        }
        int var7 = (arg1 - var6 - 32) * arg4 / (arg3 - arg1);
        if (!arg0) {
            field2468 = null;
        }
        class48.method420(arg2, arg5 + 16, 16, arg1 - 32, class18.field273);
        class48.method420(arg2, var7 + arg5 + 16, 16, var6, class239.field4397);
        class48.method409(arg2, var7 + arg5 + 16, var6, class157.field2984);
        class48.method409(arg2 + 1, 16 - -var7 + arg5, var6, class157.field2984);
        class48.method405(arg2, arg5 + var7 + 16, 16, class157.field2984);
        class48.method405(arg2, arg5 + var7 + 17, 16, class157.field2984);
        class48.method409(arg2 + 15, arg5 + var7 + 16, var6, class229.field4199);
        class48.method409(arg2 + 14, arg5 + 17 + var7, var6 - 1, class229.field4199);
        class48.method405(arg2, arg5 + var6 + var7 + 15, 16, class229.field4199);
        class48.method405(arg2 + 1, var7 + 14 + arg5 + var6, 15, class229.field4199);
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V")
    public static final void method924(int arg0) {
        int var1 = class240.field4412 - (int) ((double) class139.field2694.field2638 / class244.field4471);
        field2474++;
        if (arg0 != 15) {
            return;
        }
        int var2 = (int) ((double) class139.field2694.field2638 / class244.field4471) + class240.field4412;
        int var3 = class20.field338 - (int) ((double) class139.field2694.field2509 / class244.field4471);
        if (var1 < 0) {
            class240.field4412 = (int) ((double) class139.field2694.field2638 / class244.field4471);
            class147.field2811 = -1;
            class168.field3206 = -1;
        }
        int var4 = (int) ((double) class139.field2694.field2509 / class244.field4471) + class20.field338;
        if (class150.field2848 < var2) {
            class240.field4412 = class150.field2848 - (int) ((double) class139.field2694.field2638 / class244.field4471);
            class168.field3206 = -1;
            class147.field2811 = -1;
        }
        if (var3 < 0) {
            class147.field2811 = -1;
            class20.field338 = (int) ((double) class139.field2694.field2509 / class244.field4471);
            class168.field3206 = -1;
        }
        if (var4 > class190.field3528) {
            class168.field3206 = -1;
            class20.field338 = class190.field3528 - (int) ((double) class139.field2694.field2509 / class244.field4471);
            class147.field2811 = -1;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IZLdc;)V")
    public static final void method925(int arg0, boolean arg1, class37 arg2) {
        class69.field1252++;
        class49.field970.method1503(68, 2976);
        field2475++;
        class49.field970.method214((byte) 103, arg0);
        class49.field970.method208(arg2.method347(114), 1650435232);
        if (arg1) {
            method926((byte) -59);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(B)V")
    public static void method926(byte arg0) {
        field2479 = null;
        field2478 = null;
        field2468 = null;
        field2480 = null;
        int var1 = 63 / ((-arg0 - 9) / 58);
        field2471 = null;
        field2472 = null;
        field2469 = null;
        field2476 = null;
        field2477 = null;
        field2470 = null;
    }
}
