import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!va")
public class class147 extends class32 {

    @OriginalMember(owner = "client!va", name = "x", descriptor = "Lv;")
    private static class146 field3395 = class159.method1226((byte) -37, "This world is full)3");

    @OriginalMember(owner = "client!va", name = "v", descriptor = "Lv;")
    private static class146 field3393 = class159.method1226((byte) -37, "Create a free account");

    @OriginalMember(owner = "client!va", name = "I", descriptor = "Lv;")
    public static class146 field3406 = class159.method1226((byte) -37, "oberen Rand der Webseite ausw-=hlen)3");

    @OriginalMember(owner = "client!va", name = "L", descriptor = "Lv;")
    public static class146 field3409 = field3395;

    @OriginalMember(owner = "client!va", name = "V", descriptor = "Lv;")
    private static class146 field3419 = class159.method1226((byte) -37, "Select a world");

    @OriginalMember(owner = "client!va", name = "D", descriptor = "Lv;")
    public static class146 field3401 = class159.method1226((byte) -37, "Ihre Ignorieren)2Liste ist voll)1 Sie k-Onnen nur 100 Spieler darauf eintragen)3");

    @OriginalMember(owner = "client!va", name = "K", descriptor = "Lv;")
    public static class146 field3408 = field3393;

    @OriginalMember(owner = "client!va", name = "F", descriptor = "Lv;")
    public static class146 field3403 = field3419;

    @OriginalMember(owner = "client!va", name = "s", descriptor = "I")
    public int field3390;

    @OriginalMember(owner = "client!va", name = "t", descriptor = "I")
    public static int field3391;

    @OriginalMember(owner = "client!va", name = "u", descriptor = "I")
    public int field3392;

    @OriginalMember(owner = "client!va", name = "w", descriptor = "I")
    public int field3394;

    @OriginalMember(owner = "client!va", name = "y", descriptor = "I")
    public int field3396;

    @OriginalMember(owner = "client!va", name = "A", descriptor = "I")
    public int field3398;

    @OriginalMember(owner = "client!va", name = "B", descriptor = "I")
    public int field3399;

    @OriginalMember(owner = "client!va", name = "E", descriptor = "I")
    public int field3402;

    @OriginalMember(owner = "client!va", name = "G", descriptor = "I")
    public int field3404;

    @OriginalMember(owner = "client!va", name = "J", descriptor = "I")
    public int field3407;

    @OriginalMember(owner = "client!va", name = "M", descriptor = "I")
    public int field3410;

    @OriginalMember(owner = "client!va", name = "O", descriptor = "I")
    public static int field3412;

    @OriginalMember(owner = "client!va", name = "P", descriptor = "I")
    public int field3413;

    @OriginalMember(owner = "client!va", name = "R", descriptor = "I")
    public int field3415;

    @OriginalMember(owner = "client!va", name = "S", descriptor = "I")
    public static int field3416;

    @OriginalMember(owner = "client!va", name = "T", descriptor = "I")
    public static int field3417;

    @OriginalMember(owner = "client!va", name = "U", descriptor = "I")
    public int field3418;

    @OriginalMember(owner = "client!va", name = "W", descriptor = "I")
    public int field3420;

    @OriginalMember(owner = "client!va", name = "Y", descriptor = "I")
    public int field3422;

    @OriginalMember(owner = "client!va", name = "Z", descriptor = "I")
    public int field3423;

    @OriginalMember(owner = "client!va", name = "cb", descriptor = "I")
    public int field3426;

    @OriginalMember(owner = "client!va", name = "Q", descriptor = "J")
    public static long field3414;

    @OriginalMember(owner = "client!va", name = "z", descriptor = "Lpe;")
    public class109 field3397;

    @OriginalMember(owner = "client!va", name = "X", descriptor = "Lwd;")
    public class157 field3421;

    @OriginalMember(owner = "client!va", name = "H", descriptor = "Ldd;")
    public static class26 field3405;

    @OriginalMember(owner = "client!va", name = "C", descriptor = "Leb;")
    public class31 field3400;

    @OriginalMember(owner = "client!va", name = "ab", descriptor = "Lla;")
    public static class77 field3424;

    @OriginalMember(owner = "client!va", name = "bb", descriptor = "Lma;")
    public class84 field3425;

    @OriginalMember(owner = "client!va", name = "N", descriptor = "[I")
    public static int[] field3411;

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(Lv;II)V")
    public static final void method1121(class146 arg0, int arg1, int arg2) {
        boolean var3 = false;
        field3416++;
        class146 var4 = arg0.method1114(-127).method1087(false);
        for (int var5 = 0; var5 < class126.field2925; var5++) {
            class67 var6 = class125.field2902[class136.field3080[var5]];
            if (var6 != null && var6.field1506 != null && var6.field1506.method1111(var4, -41)) {
                class81.method617(0, 0, var6.field788[0], 1, 0, 1, false, var6.field738[0], 1, class116.field2696.field788[0], 2, class116.field2696.field738[0]);
                var3 = true;
                if (arg1 == 1) {
                    class38.field843++;
                    class82.field1990.method265((byte) -85, 241);
                    class82.field1990.method794(-1811428344, class136.field3080[var5]);
                } else if (arg1 == 4) {
                    class92.field2210++;
                    class82.field1990.method265((byte) -85, 51);
                    class82.field1990.method756(class136.field3080[var5], false);
                } else if (arg1 == 6) {
                    class92.field2202++;
                    class82.field1990.method265((byte) -85, 124);
                    class82.field1990.method756(class136.field3080[var5], false);
                } else if (arg1 == 7) {
                    class82.field1990.method265((byte) -85, 236);
                    class82.field1990.method756(class136.field3080[var5], false);
                    class82.field1987++;
                }
                break;
            }
        }
        if (!var3) {
            class26.method174(0, class158.field3633, (byte) -76, class71.method509(new class146[] { class87.field2062, var4 }, (byte) -112));
        }
        if (arg2 != 1) {
            method1122(-107);
        }
    }

    @OriginalMember(owner = "client!va", name = "e", descriptor = "(I)V")
    public static void method1122(int arg0) {
        field3401 = null;
        field3411 = null;
        field3408 = null;
        field3393 = null;
        field3405 = null;
        if (arg0 != 0) {
            field3409 = null;
        }
        field3409 = null;
        field3395 = null;
        field3424 = null;
        field3406 = null;
        field3403 = null;
        field3419 = null;
    }

    @OriginalMember(owner = "client!va", name = "a", descriptor = "(B)V")
    public final void method1123(byte arg0) {
        field3412++;
        this.field3400 = null;
        this.field3397 = null;
        int var2 = 14 / ((22 - arg0) / 56);
        this.field3421 = null;
        this.field3425 = null;
    }
}
