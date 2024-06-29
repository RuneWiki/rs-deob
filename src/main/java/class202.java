import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public abstract class class202 {

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "I")
    public static volatile int field3995 = 0;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "Lgg;")
    public static class63 field3997 = class116.method911(43, "Bitte warten Sie eine Minute");

    @OriginalMember(owner = "client!wd", name = "i", descriptor = "Lgg;")
    private static class63 field4003 = class116.method911(43, "Please wait )2 attempting to reestablish)3");

    @OriginalMember(owner = "client!wd", name = "k", descriptor = "I")
    public static int field4005 = 0;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "[I")
    public static int[] field3998 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!wd", name = "g", descriptor = "Lgg;")
    public static class63 field4001 = field4003;

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field3996;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!wd", name = "f", descriptor = "I")
    public static int field4000;

    @OriginalMember(owner = "client!wd", name = "h", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!wd", name = "j", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!wd", name = "l", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(B)V")
    public static final void method1330(byte arg0) {
        field3996++;
        if (class192.field3900 != null) {
            class99 var1 = class192.field3900;
            synchronized (class192.field3900) {
                class192.field3900 = null;
            }
        }
        if (arg0 != 52) {
            field4002 = 49;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I[B)V")
    public abstract void method1331(int arg0, byte[] arg1);

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(II)I")
    public static int method1332(int arg0, int arg1) {
        return arg0 | arg1;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(ILmc;I)V")
    public static final void method1333(int arg0, class111 arg1, int arg2) {
        field4006++;
        if (class46.field1093 != null) {
            class46.field1093.field54 = arg2 * 8 + 5;
            int var3 = class46.field1093.method56(arg0 - 16776961);
            int var4 = class46.field1093.method56(-1);
            arg1.method889((byte) 108, var4, var3);
            return;
        }
        class6.method96(true, 255, null, arg0 - 658057104, (byte) 0, 0, 255);
        if (arg0 != 16776960) {
            field4005 = 40;
        }
        class89.field2093[arg2] = arg1;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V")
    public static final void method1334(int arg0) {
        class123 var1 = (class123) class29.field671.method1033(arg0 ^ arg0);
        field4000++;
        while (var1 != null) {
            if (var1.field2727 > 0) {
                var1.field2727--;
            }
            if (var1.field2727 != 0) {
                if (var1.field2716 > 0) {
                    var1.field2716--;
                }
                if (var1.field2716 == 0 && var1.field2709 >= 1 && var1.field2728 >= 1 && var1.field2709 <= 102 && var1.field2728 <= 102 && (var1.field2712 < 0 || class37.method344(var1.field2714, var1.field2712, -20452))) {
                    class3.method58(arg0 ^ 0x66, var1.field2709, var1.field2726, var1.field2712, var1.field2725, var1.field2714, var1.field2728, var1.field2706);
                    var1.field2716 = -1;
                    if (var1.field2712 == var1.field2711 && var1.field2711 == -1) {
                        var1.method1172(arg0 + 54);
                    } else if (var1.field2712 == var1.field2711 && var1.field2724 == var1.field2706 && var1.field2718 == var1.field2714) {
                        var1.method1172(arg0 ^ 0x37);
                    }
                }
            } else if (var1.field2711 < 0 || class37.method344(var1.field2718, var1.field2711, -20452)) {
                class3.method58(-1, var1.field2709, var1.field2726, var1.field2711, var1.field2725, var1.field2718, var1.field2728, var1.field2724);
                var1.method1172(-98);
            }
            var1 = (class123) class29.field671.method1035(0);
        }
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(I)[B")
    public abstract byte[] method1335(int arg0);

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(IIIII)V")
    public static final void method1336(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4004++;
        if (arg2 != 0) {
            return;
        }
        if (class6.field149 == 1) {
            class47.field1161[class182.field3693 / 100].method1320(class32.field785 - 8, class49.field1188 + -8);
        }
        if (class6.field149 == 2) {
            class47.field1161[class182.field3693 / 100 + 4].method1320(class32.field785 - 8, class49.field1188 + -8);
        }
        class54.method534(-2);
        if (!class190.field3866) {
            return;
        }
        int var5 = arg0 + 507;
        int var6 = arg3 + 20;
        class62.field1560.method662(class89.method772((byte) 53, new class63[] { class110.field2489, class175.method1162((byte) -126, class84.field1999) }), var5, var6, 16776960, -1);
        int var10 = var6 + 15;
        Runtime var7 = Runtime.getRuntime();
        int var8 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
        int var9 = 16776960;
        if (var8 > 32768 && class198.field3964) {
            var9 = 16711680;
        }
        if (var8 > 65536 && !class198.field3964) {
            var9 = 16711680;
        }
        class62.field1560.method662(class89.method772((byte) 124, new class63[] { class60.field1525, class175.method1162((byte) -126, var8), class199.field3986 }), var5, var10, var9, -1);
        var6 = var10 + 15;
    }

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "(B)V")
    public static void method1337(byte arg0) {
        if (arg0 >= 6) {
            field4001 = null;
            field4003 = null;
            field3997 = null;
            field3998 = null;
        }
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(Ljc;Ljc;ZB)V")
    public static final void method1338(class85 arg0, class85 arg1, boolean arg2, byte arg3) {
        class93.field2194 = arg1;
        if (arg3 > -25) {
            field3995 = 4;
        }
        class203.field4030 = arg0;
        class74.field1822 = arg2;
        field3999++;
    }
}
