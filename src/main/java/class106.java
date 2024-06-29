import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class106 {

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "Ltb;")
    public static class210 field1808 = new class210(128);

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "Lcd;")
    public static class64 field1810 = null;

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "[I")
    public static int[] field1812 = new int[128];

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "Lmh;")
    public static class128 field1813 = class22.method156(123, ":clanreq:");

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "I")
    public static int field1807;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "Lem;")
    public static class10 field1811;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "Z")
    public static boolean field1809;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ILmh;)V", line = 57)
    public static final void method650(int arg0, class128 arg1) {
        field1805++;
        int var2 = class163.method1070(arg1, arg0 + 25152);
        if (var2 == -1) {
            return;
        }
        class30.field663 = class144.field2465.field1044[var2] - class212.field3754;
        class102.field1756 = class155.field2671 - (class144.field2465.field1043[var2] + -class39.field836) - 1;
        if (arg0 != -25153) {
            return;
        }
        int var3 = (int) ((float) class242.field4146.field260 / class143.field2438) + class30.field663;
        int var4 = class102.field1756 - ((int) ((float) class242.field4146.field226 / class143.field2438));
        int var5 = class30.field663 - ((int) ((float) class242.field4146.field260 / class143.field2438));
        int var6 = (int) ((float) class242.field4146.field226 / class143.field2438) + class102.field1756;
        if (var4 < 0) {
            class102.field1756 = (int) ((float) class242.field4146.field226 / class143.field2438);
        }
        if (var5 < 0) {
            class30.field663 = (int) ((float) class242.field4146.field260 / class143.field2438);
        }
        if (var6 > class155.field2671) {
            class102.field1756 = class155.field2671 - ((int) ((float) class242.field4146.field226 / class143.field2438));
        }
        if (class5.field110 < var3) {
            class30.field663 = class5.field110 - ((int) ((float) class242.field4146.field260 / class143.field2438));
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(ZIII)V", line = 125)
    public static final void method651(boolean arg0, int arg1, int arg2, int arg3) {
        if (!arg0) {
            field1807++;
            class128 var4 = class28.method177((byte) -124, new class128[] { class34.field736, class257.method1811(arg2, (byte) 51), class97.field1677, class257.method1811(arg3 >> 6, (byte) 122), class97.field1677, class257.method1811(arg1 >> 6, (byte) -121), class97.field1677, class257.method1811(arg3 & 0x3F, (byte) 54), class97.field1677, class257.method1811(arg1 & 0x3F, (byte) -125) });
            var4.method839((byte) -61);
            class294.method2014(0, var4);
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(IZI)V", line = 146)
    public static final void method652(int arg0, boolean arg1, int arg2) {
        field1804++;
        if (class275.field4769 < 2 && class28.field591 == 0 && !class31.field685) {
            return;
        }
        class128 var3;
        if (class28.field591 == 1 && class275.field4769 < 2) {
            var3 = class28.method177((byte) -90, new class128[] { class245.field4187, class47.field954, class194.field3381, class16.field441 });
        } else if (class31.field685 && class275.field4769 < 2) {
            var3 = class28.method177((byte) -105, new class128[] { class140.field2398, class47.field954, class120.field2024, class16.field441 });
        } else {
            var3 = class50.method342((byte) 46, class275.field4769 - 1);
        }
        if (class275.field4769 > 2) {
            var3 = class28.method177((byte) -100, new class128[] { var3, class147.field2515, class257.method1811(class275.field4769 - 2, (byte) 21), class1.field25 });
        }
        int var4 = client.field4159.method2069(var3, arg0 + 4, arg2 - -15, 16777215, 0, class265.field4602, class225.field3938);
        class118.method710(arg2, 15, var4 + client.field4159.method2070(var3), (byte) -128, arg0 + 4);
        if (arg1) {
            field1808 = (class210) null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lmh;I)V", line = 182)
    public static final void method653(class128 arg0, int arg1) {
        field1803++;
        for (class241 var2 = (class241) class102.field1741.method2024(arg1 ^ arg1); var2 != null; var2 = (class241) class102.field1741.method2027(1211754408)) {
            if (var2.field4130.method855(arg0, arg1 + 192)) {
                class139.field2384 = var2;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(B)V", line = 225)
    public static void method654(byte arg0) {
        field1812 = null;
        if (arg0 == 18) {
            field1811 = null;
            field1808 = null;
            field1813 = null;
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Lmh;ILdj;)Lwf;", line = 247)
    public static final class54 method655(class128 arg0, int arg1, class314 arg2) {
        field1806++;
        int var3 = arg2.method2142(1, arg0);
        if (var3 == -1) {
            return new class54(0);
        } else if (arg1 <= 93) {
            return (class54) null;
        } else {
            int[] var4 = arg2.method2145(var3, 0);
            class54 var5 = new class54(var4.length);
            for (int var6 = 0; var6 < var5.field1047; var6++) {
                class194 var7 = new class194(arg2.method2155(var4[var6], var3, (byte) 70));
                var5.field1049[var6] = var7.method1319(1);
                var5.field1041[var6] = var7.method1326((byte) 109);
                var5.field1044[var6] = (short) var7.method1308(-56);
                var5.field1043[var6] = (short) var7.method1308(-89);
                var5.field1040[var6] = var7.method1350(false);
            }
            return var5;
        }
    }
}
