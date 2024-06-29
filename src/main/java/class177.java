import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cfa")
public class class177 {

    @OriginalMember(owner = "client!cfa", name = "h", descriptor = "[I")
    public static int[] field2293 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

    @OriginalMember(owner = "client!cfa", name = "c", descriptor = "[I")
    public static int[] field2288 = new int[4096];

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "I")
    public static int field2286;

    @OriginalMember(owner = "client!cfa", name = "b", descriptor = "I")
    public static int field2287;

    @OriginalMember(owner = "client!cfa", name = "d", descriptor = "I")
    public static int field2289;

    @OriginalMember(owner = "client!cfa", name = "e", descriptor = "I")
    public static int field2290;

    @OriginalMember(owner = "client!cfa", name = "g", descriptor = "I")
    public static int field2292;

    @OriginalMember(owner = "client!cfa", name = "i", descriptor = "I")
    public static int field2294;

    @OriginalMember(owner = "client!cfa", name = "j", descriptor = "I")
    public static int field2295;

    @OriginalMember(owner = "client!cfa", name = "f", descriptor = "[[B")
    public static byte[][] field2291;

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field2288[var0] = class601.method3309(var0, 115);
        }
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(Z)V", line = 3)
    public static final void method1083(boolean arg0) {
        field2290++;
        if (!arg0) {
            method1084(true, true);
        }
        class129.field1556++;
        class650 var1 = class314.method1837(class586.field8191, arg0, class625.field8727);
        var1.field8928.method1141(0, -75);
        class108.method745(var1, -9);
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(ZZ)V", line = 20)
    public static final void method1084(boolean arg0, boolean arg1) {
        if (!arg0) {
            field2291 = null;
        }
        if (arg1) {
            if (class638.field8834 != -1) {
                class156.method976(10, class638.field8834);
            }
            for (class157 var2 = (class157) class148.field1802.method3245(false); var2 != null; var2 = (class157) class148.field1802.method3252(12938)) {
                if (!var2.method3425(-16972)) {
                    var2 = (class157) class148.field1802.method3245(!arg0);
                    if (var2 == null) {
                        break;
                    }
                }
                class22.method239(true, false, var2, 7799);
            }
            class638.field8834 = -1;
            class148.field1802 = new class583(8);
            class238.method1490(7);
            class638.field8834 = class100.field1231;
            class504.method2911(false, false);
            class728.method4033(-114);
            class445.method2628(class638.field8834);
        }
        field2294++;
        class667.field9134 = false;
        class432.field6111 = "";
        class516.field7276 = "";
        class511.method2944((byte) 122);
        class105.field1289 = -1;
        class419.method2492(class137.field1636, -24936);
        class339.field4374 = new class546();
        class339.field4374.field5790 = class613.field8591 * 512 / 2;
        class339.field4374.field5784 = class1.field3 * 512 / 2;
        class339.field4374.field435[0] = class613.field8591 / 2;
        class407.field5744 = 0;
        class505.field7134 = 0;
        class339.field4374.field426[0] = class1.field3 / 2;
        if (class276.field3497 == 2) {
            class505.field7134 = class274.field3466 << 9;
            class407.field5744 = class692.field9814 << 9;
        } else {
            class603.method3318(true);
        }
        class37.method328((byte) -45);
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(ILtn;)V", line = 86)
    public static final void method1085(int arg0, class179 arg1) {
        field2286++;
        if ((arg1.field2325.length - arg1.field2354) < 1) {
            return;
        }
        int var2 = arg1.method1094(255);
        if (var2 < 0 || var2 > 1 || arg1.field2325.length - arg1.field2354 < 2) {
            return;
        }
        int var3 = arg1.method1107(false);
        if ((arg1.field2325.length - arg1.field2354) < (var3 * 6)) {
            return;
        }
        int var4 = 0;
        if (arg0 >= -59) {
            return;
        }
        while (var4 < var3) {
            int var5 = arg1.method1107(false);
            int var6 = arg1.method1095((byte) 126);
            if (class173.field2267.length > var5 && class665.field9111[var5] && (class461.field6639.method625(var5, -1).field688 != '1' || var6 >= -1 && var6 <= 1)) {
                class173.field2267[var5] = var6;
            }
            var4++;
        }
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(I[ILlea;I)V", line = 134)
    public static final void method1086(int arg0, int[] arg1, class546 arg2, int arg3) {
        if (arg2.field408 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg2.field408.length; var5++) {
                if (arg2.field408[var5] != arg1[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg2.field376 != -1) {
                class747 var6 = class646.field8903.method643(arg2.field376, arg0 ^ 0xFFFFFFB7);
                int var7 = var6.field10437;
                if (var7 == 1) {
                    arg2.field346 = 0;
                    arg2.field364 = arg3;
                    arg2.field326 = 0;
                    arg2.field388 = 0;
                    arg2.field385 = 1;
                    if (!arg2.field417) {
                        class107.method729(arg2.field388, var6, arg2, -4855);
                    }
                }
                if (var7 == 2) {
                    arg2.field346 = 0;
                }
            }
        }
        field2289++;
        if (arg0 != 2) {
            field2288 = null;
        }
        boolean var8 = true;
        for (int var9 = 0; var9 < arg1.length; var9++) {
            if (arg1[var9] != -1) {
                var8 = false;
            }
            if (arg2.field408 == null || arg2.field408[var9] == -1 || class646.field8903.method643(arg1[var9], arg0 ^ 0xFFFFFFB6).field10447 >= class646.field8903.method643(arg2.field408[var9], -102).field10447) {
                arg2.field408 = arg1;
                arg2.field364 = arg3;
                break;
            }
        }
        if (var8) {
            arg2.field408 = arg1;
            arg2.field364 = arg3;
        }
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(B)V", line = 224)
    public static void method1087(byte arg0) {
        field2293 = null;
        field2288 = null;
        if (arg0 != 49) {
            field2288 = null;
        }
        field2291 = null;
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(III)Z", line = 236)
    public static final boolean method1088(int arg0, int arg1, int arg2) {
        if (arg1 != -1) {
            method1086(121, null, null, 0);
        }
        field2295++;
        return (arg0 & 0x21) != 0;
    }

    @OriginalMember(owner = "client!cfa", name = "a", descriptor = "(I)V", line = 250)
    public static final void method1089(int arg0) {
        field2292++;
        if (class470.field6755 != null) {
            for (int var1 = 0; var1 < class522.field7389; var1++) {
                class470.field6755[var1] = null;
            }
            class470.field6755 = null;
        }
        if (class185.field2426 != null) {
            for (int var2 = 0; var2 < class215.field2726; var2++) {
                class185.field2426[var2] = null;
            }
            class185.field2426 = null;
        }
        if (class359.field5120 != null) {
            for (int var3 = 0; var3 < class206.field2635; var3++) {
                class359.field5120[var3] = null;
            }
            class359.field5120 = null;
        }
        class597.field8284 = -1;
        class521.field7350 = -1;
        class248.field3164 = null;
        class468.field6737 = null;
        class384.field5349 = null;
        if (arg0 >= -37) {
            method1085(97, null);
        }
    }
}
