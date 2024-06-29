import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!d")
public class class30 {

    @OriginalMember(owner = "client!d", name = "e", descriptor = "Ljava/lang/Object;")
    public static Object field505 = new Object();

    @OriginalMember(owner = "client!d", name = "f", descriptor = "Lkb;")
    public static class93 field506 = class76.method390("sl_flags", 0);

    @OriginalMember(owner = "client!d", name = "g", descriptor = "Lag;")
    public static class8 field507 = new class8(5000);

    @OriginalMember(owner = "client!d", name = "k", descriptor = "I")
    public static int field511 = -1;

    @OriginalMember(owner = "client!d", name = "i", descriptor = "Lkb;")
    public static class93 field509 = class76.method390("Passwort: ", 0);

    @OriginalMember(owner = "client!d", name = "m", descriptor = "Lkb;")
    private static class93 field513 = class76.method390("Please reload this page)3", 0);

    @OriginalMember(owner = "client!d", name = "l", descriptor = "Lkb;")
    public static class93 field512 = field513;

    @OriginalMember(owner = "client!d", name = "j", descriptor = "I")
    public static int field510 = 0;

    @OriginalMember(owner = "client!d", name = "n", descriptor = "Lkb;")
    public static class93 field514 = class76.method390("Spieler", 0);

    @OriginalMember(owner = "client!d", name = "a", descriptor = "I")
    public static int field501;

    @OriginalMember(owner = "client!d", name = "b", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!d", name = "c", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!d", name = "d", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!d", name = "h", descriptor = "Lca;")
    public static class22 field508;

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(B)V")
    public static void method175(byte arg0) {
        if (arg0 >= -66) {
            return;
        }
        field509 = null;
        field512 = null;
        field508 = null;
        field514 = null;
        field505 = null;
        field513 = null;
        field506 = null;
        field507 = null;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(II)Leg;")
    public static final class46 method176(int arg0, int arg1) {
        field503++;
        class46 var2 = (class46) class191.field3721.method680((long) arg0, (byte) 118);
        if (var2 != null) {
            return var2;
        }
        class46 var3 = class115.method640(arg0, false, class204.field3935, -126, class190.field3712);
        if (var3 != null) {
            class191.field3721.method678(true, var3, (long) arg0);
        }
        if (arg1 <= 13) {
            method178(-102L, 68);
        }
        return var3;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(ZZ)V")
    public static final void method177(boolean arg0, boolean arg1) {
        if (!arg1) {
            field505 = null;
        }
        for (int var2 = 0; var2 < class195.field3788; var2++) {
            class76 var3 = class143.field2791[class49.field794[var2]];
            int var4 = (class49.field794[var2] << 14) + 536870912;
            if (var3 != null && var3.method190((byte) -88) && arg0 == var3.field1364.field3805 && var3.field1364.method1249(!arg1)) {
                int var5 = var3.field2032 >> 7;
                int var6 = var3.field2045 >> 7;
                if (var5 >= 0 && var5 < 104 && var6 >= 0 && var6 < 104) {
                    if (var3.field2046 == 1 && (var3.field2032 & 0x7F) == 64 && (var3.field2045 & 0x7F) == 64) {
                        if (class176.field3471[var5][var6] == class49.field793) {
                            continue;
                        }
                        class176.field3471[var5][var6] = class49.field793;
                    }
                    if (!var3.field1364.field3796) {
                        var4 += Integer.MIN_VALUE;
                    }
                    var3.field2028 = class189.method1226(var3.field2046 * 64 + var3.field2045 - 64, -1, var3.field2032 - -((var3.field2046 + -1) * 64), class114.field2145);
                    class175.field3458.method841(class114.field2145, var3.field2032, var3.field2045, var3.field2028, var3.field2046 * 64 + 60 - 64, var3, var3.field2075, var4, var3.field2055);
                }
            }
        }
        field504++;
    }

    @OriginalMember(owner = "client!d", name = "a", descriptor = "(JI)V")
    public static final void method178(long arg0, int arg1) {
        field501++;
        if (arg0 == 0L) {
            return;
        }
        if (class62.field991 >= 100 && class116.field2170 != 1 || class62.field991 >= 200) {
            class189.method1223(0, class43.field712, 2249, class36.field581);
            return;
        }
        class93 var3 = class133.method797(37, arg0).method505((byte) -121);
        if (arg1 < 30) {
            field507 = null;
        }
        for (int var4 = 0; var4 < class62.field991; var4++) {
            if (class151.field2910[var4] == arg0) {
                class189.method1223(0, class43.field712, 2249, class203.method1321(new class93[] { var3, class96.field1777 }, -111));
                return;
            }
        }
        for (int var5 = 0; var5 < class27.field424; var5++) {
            if (class166.field3280[var5] == arg0) {
                class189.method1223(0, class43.field712, 2249, class203.method1321(new class93[] { class182.field3604, var3, class39.field654 }, -115));
                return;
            }
        }
        if (var3.method485((byte) -91, class106.field1940.field550)) {
            class189.method1223(0, class43.field712, 2249, class4.field72);
            return;
        }
        class179.field3549[class62.field991] = var3;
        class151.field2910[class62.field991] = arg0;
        class166.field3269++;
        class114.field2119[class62.field991] = 0;
        class205.field3973[class62.field991] = 0;
        class16.field287 = class203.field3928;
        class62.field991++;
        class151.field2908.method47(147, 8);
        class151.field2908.method1064(arg0, -1);
    }
}
