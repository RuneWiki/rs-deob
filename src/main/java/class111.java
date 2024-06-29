import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!q")
public class class111 {

    @OriginalMember(owner = "client!q", name = "b", descriptor = "I")
    public static int field2615 = 1;

    @OriginalMember(owner = "client!q", name = "e", descriptor = "Lv;")
    public static class146 field2618 = class159.method1226((byte) -37, "Konfig geladen)3");

    @OriginalMember(owner = "client!q", name = "k", descriptor = "Lv;")
    public static class146 field2624 = class159.method1226((byte) -37, "headicons_pk");

    @OriginalMember(owner = "client!q", name = "g", descriptor = "Lv;")
    private static class146 field2620 = class159.method1226((byte) -37, "Please wait 5 minutes before trying again)3");

    @OriginalMember(owner = "client!q", name = "n", descriptor = "[I")
    public static int[] field2627 = new int[200];

    @OriginalMember(owner = "client!q", name = "l", descriptor = "Lv;")
    public static class146 field2625 = field2620;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!q", name = "c", descriptor = "I")
    public static int field2616;

    @OriginalMember(owner = "client!q", name = "d", descriptor = "I")
    public int field2617;

    @OriginalMember(owner = "client!q", name = "f", descriptor = "I")
    public int field2619;

    @OriginalMember(owner = "client!q", name = "h", descriptor = "I")
    public int field2621;

    @OriginalMember(owner = "client!q", name = "i", descriptor = "I")
    public int field2622;

    @OriginalMember(owner = "client!q", name = "p", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!q", name = "r", descriptor = "I")
    public int field2631;

    @OriginalMember(owner = "client!q", name = "s", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!q", name = "t", descriptor = "I")
    public static int field2633;

    @OriginalMember(owner = "client!q", name = "q", descriptor = "Le;")
    public static class29 field2630;

    @OriginalMember(owner = "client!q", name = "j", descriptor = "Ljd;")
    public class66 field2623;

    @OriginalMember(owner = "client!q", name = "m", descriptor = "Ljd;")
    public class66 field2626;

    @OriginalMember(owner = "client!q", name = "o", descriptor = "Ljd;")
    public class66 field2628;

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(I)V")
    public static void method872(int arg0) {
        field2620 = null;
        field2627 = null;
        if (arg0 != -5) {
            field2615 = -77;
        }
        field2625 = null;
        field2630 = null;
        field2624 = null;
        field2618 = null;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(B)V")
    public static final void method873(byte arg0) {
        if (arg0 <= 25) {
            return;
        }
        field2616++;
        if (class47.field1080 > 0) {
            class25.method152(89);
        } else {
            class88.method702(40, false);
            class95.field2282 = class58.field1298;
            class58.field1298 = null;
        }
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(I)V")
    public static final void method874(int arg0) {
        field2629++;
        while (class29.field597.method263(class35.field815, (byte) -83) >= 11) {
            int var1 = class29.field597.method262(arg0 - 112, 11);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class125.field2902[var1] == null) {
                class125.field2902[var1] = new class67();
                if (class88.field2088[var1] != null) {
                    class125.field2902[var1].method477(class88.field2088[var1], arg0 ^ 0xFFFFFFA2);
                }
                var2 = true;
            }
            class136.field3080[class126.field2925++] = var1;
            class67 var3 = class125.field2902[var1];
            var3.field754 = class94.field2229;
            int var4 = class29.field597.method262(-124, 1);
            int var5 = class29.field597.method262(62, 5);
            int var6 = class118.field2747[class29.field597.method262(arg0 ^ 0x1C, 3)];
            if (var5 > 15) {
                var5 -= 32;
            }
            if (var2) {
                var3.field780 = var3.field763 = var6;
            }
            int var7 = class29.field597.method262(-108, 5);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = class29.field597.method262(-21, 1);
            if (var8 == 1) {
                class72.field1685[class58.field1294++] = var1;
            }
            var3.method233(var4 == 1, 0, class116.field2696.field788[0] + var5, class116.field2696.field738[0] - -var7);
        }
        if (arg0 != 1) {
            method874(-76);
        }
        class29.field597.method260(73);
    }

    @OriginalMember(owner = "client!q", name = "b", descriptor = "(B)V")
    public static final void method875(byte arg0) {
        class24.field387 = new int[33];
        class79.field1941 = new int[33];
        class150.field3463 = new int[151];
        class110.field2612 = new int[151];
        for (int var1 = 0; var1 < 33; var1++) {
            int var7 = 999;
            int var8 = 0;
            for (int var9 = 0; var9 < 34; var9++) {
                if (class77.field1854.field3286[class77.field1854.field3280 * var1 + var9] == 0) {
                    if (var7 == 999) {
                        var7 = var9;
                    }
                } else if (var7 != 999) {
                    var8 = var9;
                    break;
                }
            }
            class24.field387[var1] = var7;
            class79.field1941[var1] = var8 - var7;
        }
        int var2 = 69 / ((arg0 - 52) / 63);
        for (int var3 = 5; var3 < 156; var3++) {
            int var4 = 999;
            int var5 = 0;
            for (int var6 = 25; var6 < 172; var6++) {
                if (class77.field1854.field3286[var6 + class77.field1854.field3280 * var3] == 0 && (var6 > 34 || var3 > 34)) {
                    if (var4 == 999) {
                        var4 = var6;
                    }
                } else if (var4 != 999) {
                    var5 = var6;
                    break;
                }
            }
            class150.field3463[var3 - 5] = var4 - 25;
            class110.field2612[var3 - 5] = var5 - var4;
        }
        field2632++;
    }

    @OriginalMember(owner = "client!q", name = "a", descriptor = "(ZZZ)I")
    public static final int method876(boolean arg0, boolean arg1, boolean arg2) {
        field2614++;
        int var3 = 0;
        if (arg1) {
            var3 += class71.field1644 + class145.field3303;
        }
        if (arg0) {
            var3 += class20.field303 + class108.field2583;
        }
        return arg2 ? -16 : var3;
    }
}
