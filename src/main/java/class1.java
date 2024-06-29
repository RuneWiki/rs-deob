import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class1 {

    @OriginalMember(owner = "client!a", name = "c", descriptor = "[I")
    public static int[] field3 = new int[128];

    @OriginalMember(owner = "client!a", name = "i", descriptor = "I")
    public static int field9 = 0;

    @OriginalMember(owner = "client!a", name = "l", descriptor = "I")
    public static int field12 = 0;

    @OriginalMember(owner = "client!a", name = "k", descriptor = "Loa;")
    public static class98 field11 = class38.method349(255, "@lre@");

    @OriginalMember(owner = "client!a", name = "p", descriptor = "Loa;")
    private static class98 field16 = class38.method349(255, "Loading fonts )2 ");

    @OriginalMember(owner = "client!a", name = "u", descriptor = "Loa;")
    public static class98 field21 = class38.method349(255, "Wir vermuten)1 dass Ihr Konto gestohlen wurde");

    @OriginalMember(owner = "client!a", name = "r", descriptor = "I")
    public static int field18 = 0;

    @OriginalMember(owner = "client!a", name = "h", descriptor = "Loa;")
    public static class98 field8 = field16;

    @OriginalMember(owner = "client!a", name = "s", descriptor = "Loa;")
    private static class98 field19 = class38.method349(255, "Loading interfaces )2 ");

    @OriginalMember(owner = "client!a", name = "v", descriptor = "Loa;")
    private static class98 field22 = class38.method349(255, "Starting game engine)3)3)3");

    @OriginalMember(owner = "client!a", name = "t", descriptor = "Loa;")
    private static class98 field20 = class38.method349(255, "Loaded gamescreen");

    @OriginalMember(owner = "client!a", name = "e", descriptor = "Loa;")
    public static class98 field5 = field22;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "Loa;")
    public static class98 field7 = class38.method349(255, "lila:");

    @OriginalMember(owner = "client!a", name = "d", descriptor = "Loa;")
    public static class98 field4 = field20;

    @OriginalMember(owner = "client!a", name = "b", descriptor = "Loa;")
    public static class98 field2 = field19;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "I")
    public static int field1;

    @OriginalMember(owner = "client!a", name = "j", descriptor = "I")
    public static int field10;

    @OriginalMember(owner = "client!a", name = "m", descriptor = "I")
    public static int field13;

    @OriginalMember(owner = "client!a", name = "o", descriptor = "I")
    public static int field15;

    @OriginalMember(owner = "client!a", name = "q", descriptor = "I")
    public static int field17;

    @OriginalMember(owner = "client!a", name = "f", descriptor = "I")
    public static int field6;

    @OriginalMember(owner = "client!a", name = "n", descriptor = "Ltb;")
    public static class130 field14;

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(I)V")
    public static final void method1(int arg0) {
        class132.field3116.method177(6624, 202);
        if (class132.field3111 != -1) {
            class29.method294(class132.field3111, 11840);
            class137.field3332 = true;
            class147.field3584 = true;
            class132.field3111 = -1;
            class96.field2195 = -1;
        }
        if (class71.field1462 != -1) {
            class29.method294(class71.field1462, 11840);
            class15.field306 = true;
            class71.field1462 = -1;
            class96.field2195 = -1;
        }
        field6++;
        class11.field238++;
        if (class77.field1694 != -1) {
            class29.method294(class77.field1694, 11840);
            class77.field1694 = -1;
            class96.method768((byte) 98, 30);
        }
        if (arg0 >= -3) {
            return;
        }
        if (class108.field2451 != -1) {
            class29.method294(class108.field2451, 11840);
            class108.field2451 = -1;
        }
        if (class71.field1460 != -1) {
            class29.method294(class71.field1460, 11840);
            class96.field2195 = -1;
            class71.field1460 = -1;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Z)V")
    public static final void method2(boolean arg0) {
        field1++;
        for (class31 var1 = (class31) class24.field583.method512(112); var1 != null; var1 = (class31) class24.field583.method513(-90)) {
            if (class114.field2572 != var1.field740 || var1.field742 < class119.field2680) {
                var1.method975(-123);
            } else if (var1.field721 <= class119.field2680) {
                if (var1.field738 > 0) {
                    class150 var2 = class38.field935[var1.field738 - 1];
                    if (var2 != null && var2.field3657 >= 0 && var2.field3657 < 13312 && var2.field3667 >= 0 && var2.field3667 < 13312) {
                        var1.method301(var2.field3657, var2.field3667, class119.field2680, class31.method305(-111, var2.field3667, var1.field740, var2.field3657) - var1.field724, 1);
                    }
                }
                if (var1.field738 < 0) {
                    int var3 = -var1.field738 - 1;
                    class55 var4;
                    if (class8.field191 == var3) {
                        var4 = class73.field1536;
                    } else {
                        var4 = class33.field832[var3];
                    }
                    if (var4 != null && var4.field3657 >= 0 && var4.field3657 < 13312 && var4.field3667 >= 0 && var4.field3667 < 13312) {
                        var1.method301(var4.field3657, var4.field3667, class119.field2680, class31.method305(-84, var4.field3667, var1.field740, var4.field3657) - var1.field724, 1);
                    }
                }
                var1.method307((byte) -11, class52.field1161);
                class138.field3373.method256(class114.field2572, (int) var1.field717, (int) var1.field750, (int) var1.field719, 60, var1, var1.field748, -1, false);
            }
        }
        if (!arg0) {
            method3(-45);
        }
    }

    @OriginalMember(owner = "client!a", name = "b", descriptor = "(I)V")
    public static void method3(int arg0) {
        field14 = null;
        field3 = null;
        field4 = null;
        field20 = null;
        if (arg0 != -1) {
            field16 = null;
        }
        field7 = null;
        field21 = null;
        field5 = null;
        field19 = null;
        field22 = null;
        field2 = null;
        field8 = null;
        field16 = null;
        field11 = null;
    }
}
