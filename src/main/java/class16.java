import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class16 {

    @OriginalMember(owner = "client!ca", name = "g", descriptor = "I")
    public static int field281 = 0;

    @OriginalMember(owner = "client!ca", name = "l", descriptor = "Lje;")
    private static class67 field286 = class85.method592(255, "Close");

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "Lje;")
    private static class67 field278 = class85.method592(255, "Please try again)3");

    @OriginalMember(owner = "client!ca", name = "p", descriptor = "Lje;")
    public static class67 field290 = class85.method592(255, "<)4col> x");

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "Lje;")
    public static class67 field275 = class85.method592(255, "null");

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "Lje;")
    public static class67 field279 = field286;

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "Lje;")
    public static class67 field280 = field278;

    @OriginalMember(owner = "client!ca", name = "h", descriptor = "Lje;")
    private static class67 field282 = class85.method592(255, "green:");

    @OriginalMember(owner = "client!ca", name = "w", descriptor = "Lje;")
    private static class67 field297 = class85.method592(255, "You have only just left another world)3");

    @OriginalMember(owner = "client!ca", name = "r", descriptor = "Lje;")
    public static class67 field292 = field282;

    @OriginalMember(owner = "client!ca", name = "x", descriptor = "Z")
    public static boolean field298 = false;

    @OriginalMember(owner = "client!ca", name = "u", descriptor = "Lje;")
    public static class67 field295 = field297;

    @OriginalMember(owner = "client!ca", name = "n", descriptor = "Lje;")
    public static class67 field288 = field282;

    @OriginalMember(owner = "client!ca", name = "y", descriptor = "Z")
    public static boolean field299 = false;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
    public static int field276;

    @OriginalMember(owner = "client!ca", name = "i", descriptor = "I")
    public static int field283;

    @OriginalMember(owner = "client!ca", name = "m", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!ca", name = "o", descriptor = "I")
    public static int field289;

    @OriginalMember(owner = "client!ca", name = "q", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!ca", name = "t", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!ca", name = "v", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!ca", name = "z", descriptor = "J")
    public long field300;

    @OriginalMember(owner = "client!ca", name = "k", descriptor = "Lca;")
    public class16 field285;

    @OriginalMember(owner = "client!ca", name = "s", descriptor = "Lca;")
    public class16 field293;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "Lg;")
    public static class43 field277;

    @OriginalMember(owner = "client!ca", name = "j", descriptor = "[Lkd;")
    public static class73[] field284;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(III)I")
    public static final int method110(int arg0, int arg1, int arg2) {
        field276++;
        int var3 = arg0 * arg1 + arg2;
        int var4 = var3 << 13 ^ var3;
        int var5 = (var4 * var4 * 15731 + 789221) * var4 + 1376312589 & Integer.MAX_VALUE;
        return var5 >> 19 & 0xFF;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V")
    public static final void method111(byte arg0) {
        int var1 = class89.field1976.method797(class118.field2669);
        field294++;
        for (int var2 = 0; var2 < class69.field1419; var2++) {
            int var6 = class89.field1976.method797(class37.method235((byte) 1, var2));
            if (var6 > var1) {
                var1 = var6;
            }
        }
        class58.field1154 = class69.field1419 * 15 + 22;
        if (arg0 < 1) {
            return;
        }
        int var3 = class69.field1419 * 15 + 21;
        class12.field222 = true;
        var1 += 8;
        int var4 = class50.field961 - var1 / 2;
        if (var1 + var4 > 765) {
            var4 = 765 - var1;
        }
        if (var4 < 0) {
            var4 = 0;
        }
        class123.field2740 = var4;
        int var5 = class126.field2773;
        class3.field25 = var1;
        if (var5 + var3 > 503) {
            var5 = 503 - var3;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        class58.field1166 = var5;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(IILm;Z)V")
    public static final void method112(int arg0, int arg1, class83 arg2, boolean arg3) {
        field296++;
        if (!arg3) {
            method111((byte) -40);
        }
        if (arg2.field2991 == arg1 && arg1 != -1) {
            int var4 = class49.method316(arg1, false).field2084;
            if (var4 == 1) {
                arg2.field2987 = arg0;
                arg2.field2933 = 0;
                arg2.field2975 = 0;
                arg2.field2944 = 0;
            }
            if (var4 == 2) {
                arg2.field2944 = 0;
            }
        } else if (arg1 == -1 || arg2.field2991 == -1 || class49.method316(arg1, !arg3).field2082 >= class49.method316(arg2.field2991, false).field2082) {
            arg2.field2991 = arg1;
            arg2.field2933 = 0;
            arg2.field2944 = 0;
            arg2.field2975 = 0;
            arg2.field2950 = arg2.field2947;
            arg2.field2987 = arg0;
        }
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)Z")
    public final boolean method113(int arg0) {
        if (arg0 != -766) {
            this.method113(68);
        }
        field289++;
        return this.field285 != null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(ZLje;)V")
    public static final void method114(boolean arg0, class67 arg1) {
        field291++;
        if (class135.field3049 >= 2) {
            if (arg1.method479(63, class60.field1195)) {
                System.gc();
            }
            if (arg1.method479(63, class104.field2359)) {
                class60.method421(38);
            }
            if (arg1.method479(63, class105.field2393)) {
                class46.field855 = true;
            }
            if (arg1.method479(63, class46.field848)) {
                class46.field855 = false;
            }
            if (arg1.method479(63, class152.field3493)) {
                for (int var2 = 0; var2 < 4; var2++) {
                    for (int var3 = 1; var3 < 103; var3++) {
                        for (int var4 = 1; var4 < 103; var4++) {
                            class86.field1900[var2].field611[var3][var4] = 0;
                        }
                    }
                }
            }
            if (arg1.method479(63, class126.field2758) && class41.field769 == 2) {
                throw new RuntimeException();
            }
            if (arg1.method454(class4.field69, (byte) -123)) {
                class79.field1739 = arg1.method463(12, -107).method459((byte) 52).method469((byte) 59);
                class88.method614(class49.method314(new class67[] { class137.field3094, class60.method420(class79.field1739, 28498) }, 0), null, 69, 0);
            }
            if (arg1.method479(63, class32.field570)) {
                class81.field1794 = true;
            }
        }
        class69.field1399.method285(82, (byte) 64);
        class69.field1399.method653(arg1.method445(false) - 1, 44);
        if (!arg0) {
            field277 = null;
        }
        class65.field1268++;
        class69.field1399.method673(arg1.method463(2, -108), -1393);
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V")
    public final void method115(int arg0) {
        if (arg0 != 26851) {
            return;
        }
        field287++;
        if (this.field285 != null) {
            this.field285.field293 = this.field293;
            this.field293.field285 = this.field285;
            this.field285 = null;
            this.field293 = null;
        }
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(B)V")
    public static void method116(byte arg0) {
        field288 = null;
        field279 = null;
        field284 = null;
        field286 = null;
        if (arg0 < 55) {
            method111((byte) 32);
        }
        field275 = null;
        field290 = null;
        field282 = null;
        field280 = null;
        field292 = null;
        field295 = null;
        field278 = null;
        field297 = null;
        field277 = null;
    }
}
