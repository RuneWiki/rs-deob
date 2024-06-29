import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class3 {

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    public int field40 = 0;

    @OriginalMember(owner = "client!ab", name = "l", descriptor = "I")
    public int field48 = 0;

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "Lmc;")
    public static class75 field39 = class30.method234(true, "headicons_prayer");

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "Z")
    public static boolean field43 = false;

    @OriginalMember(owner = "client!ab", name = "h", descriptor = "Lkc;")
    public static class63 field44 = new class63(30);

    @OriginalMember(owner = "client!ab", name = "n", descriptor = "[I")
    public static int[] field50 = new int[] { 8, 11, 4, 6, 9, 7, 10 };

    @OriginalMember(owner = "client!ab", name = "q", descriptor = "Lkc;")
    public static class63 field53 = new class63(64);

    @OriginalMember(owner = "client!ab", name = "s", descriptor = "[J")
    public static long[] field55 = new long[32];

    @OriginalMember(owner = "client!ab", name = "t", descriptor = "I")
    public static int field56 = 2;

    @OriginalMember(owner = "client!ab", name = "u", descriptor = "Lmc;")
    private static class75 field57 = class30.method234(true, "Loading fonts )2 ");

    @OriginalMember(owner = "client!ab", name = "r", descriptor = "Lmc;")
    private static class75 field54 = class30.method234(true, "Continue");

    @OriginalMember(owner = "client!ab", name = "v", descriptor = "Lmc;")
    public static class75 field58 = class30.method234(true, "Wir vermuten ihr Spielkonto wurde gestohlen");

    @OriginalMember(owner = "client!ab", name = "w", descriptor = "Lmc;")
    public static class75 field59 = field57;

    @OriginalMember(owner = "client!ab", name = "x", descriptor = "Lmc;")
    public static class75 field60 = field54;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    public int field37;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "I")
    public int field38;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "I")
    public int field42;

    @OriginalMember(owner = "client!ab", name = "i", descriptor = "I")
    public static int field45;

    @OriginalMember(owner = "client!ab", name = "j", descriptor = "I")
    public int field46;

    @OriginalMember(owner = "client!ab", name = "k", descriptor = "I")
    public int field47;

    @OriginalMember(owner = "client!ab", name = "o", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!ab", name = "p", descriptor = "I")
    public static int field52;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "Lkd;")
    public class64 field41;

    @OriginalMember(owner = "client!ab", name = "m", descriptor = "Lkd;")
    public class64 field49;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V", line = 14)
    public static final void method18(byte arg0) {
        field45++;
        int var1 = class5.field77.method410(class74.field1852);
        int var2 = 0;
        if (arg0 != -19) {
            field58 = null;
        }
        while (class100.field2585 > var2) {
            int var10 = class5.field77.method421(class43.field1036[var2]);
            if (var10 > var1) {
                var1 = var10;
            }
            var2++;
        }
        var1 += 8;
        int var3 = class100.field2585 * 15 + 21;
        if (class12.field245 > 4 && class71.field1813 > 4 && class12.field245 < 516 && class71.field1813 < 338) {
            class90.field2218 = 0;
            class98.field2465 = var1;
            class34.field809 = class100.field2585 * 15 + 22;
            class15.field283 = true;
            int var4 = class12.field245 - var1 / 2 - 4;
            if (var1 + var4 > 512) {
                var4 = 512 - var1;
            }
            if (var4 < 0) {
                var4 = 0;
            }
            int var5 = class71.field1813 - 4;
            class110.field2802 = var4;
            if (var3 + var5 > 334) {
                var5 = 334 - var3;
            }
            if (var5 < 0) {
                var5 = 0;
            }
            class61.field1592 = var5;
        }
        if (class12.field245 > 553 && class71.field1813 > 205 && class12.field245 < 743 && class71.field1813 < 466) {
            class34.field809 = class100.field2585 * 15 + 22;
            class98.field2465 = var1;
            class15.field283 = true;
            class90.field2218 = 1;
            int var6 = class71.field1813 - 205;
            int var7 = class12.field245 - var1 / 2 - 553;
            if (var6 < 0) {
                var6 = 0;
            } else if (var3 + var6 > 261) {
                var6 = 261 - var3;
            }
            if (var7 < 0) {
                var7 = 0;
            } else if (var1 + var7 > 190) {
                var7 = 190 - var1;
            }
            class110.field2802 = var7;
            class61.field1592 = var6;
        }
        if (class12.field245 <= 17 || class71.field1813 <= 357 || class12.field245 >= 496 || class71.field1813 >= 453) {
            return;
        }
        class90.field2218 = 2;
        class34.field809 = class100.field2585 * 15 + 22;
        class15.field283 = true;
        int var8 = class12.field245 - var1 / 2 - 17;
        int var9 = class71.field1813 - 357;
        if (var8 < 0) {
            var8 = 0;
        } else if (var1 + var8 > 479) {
            var8 = 479 - var1;
        }
        class98.field2465 = var1;
        class110.field2802 = var8;
        if (var9 < 0) {
            var9 = 0;
        } else if (var3 + var9 > 96) {
            var9 = 96 - var3;
        }
        class61.field1592 = var9;
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(I)V", line = 144)
    public static void method19(int arg0) {
        field55 = null;
        field53 = null;
        field58 = null;
        field54 = null;
        if (arg0 != 334) {
            method18((byte) 117);
        }
        field39 = null;
        field60 = null;
        field44 = null;
        field50 = null;
        field57 = null;
        field59 = null;
    }
}
