import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oa")
public class class128 extends class196 {

    @OriginalMember(owner = "client!oa", name = "F", descriptor = "Lai;")
    public static class10 field2424 = class44.method278("me", -56);

    @OriginalMember(owner = "client!oa", name = "A", descriptor = "Lai;")
    public static class10 field2419 = class44.method278("Ihr Spielkonto wurde deaktiviert)3", -128);

    @OriginalMember(owner = "client!oa", name = "I", descriptor = "I")
    public static int field2427 = 0;

    @OriginalMember(owner = "client!oa", name = "K", descriptor = "[I")
    public static int[] field2429 = new int[32];

    @OriginalMember(owner = "client!oa", name = "P", descriptor = "Lai;")
    private static class10 field2433 = class44.method278("Members only world", -36);

    @OriginalMember(owner = "client!oa", name = "J", descriptor = "[I")
    public static int[] field2428 = new int[5];

    @OriginalMember(owner = "client!oa", name = "T", descriptor = "Lai;")
    public static class10 field2437 = class44.method278("Bitte warten Sie)3)3)3", -104);

    @OriginalMember(owner = "client!oa", name = "U", descriptor = "Lai;")
    public static class10 field2438 = field2433;

    @OriginalMember(owner = "client!oa", name = "V", descriptor = "Lai;")
    public static class10 field2439 = class44.method278(")4slr)3ws?order=LPWM", -30);

    @OriginalMember(owner = "client!oa", name = "R", descriptor = "Z")
    public static boolean field2435 = false;

    @OriginalMember(owner = "client!oa", name = "W", descriptor = "Lai;")
    public static class10 field2440 = class44.method278("<br>", 109);

    @OriginalMember(owner = "client!oa", name = "z", descriptor = "I")
    public int field2418;

    @OriginalMember(owner = "client!oa", name = "B", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!oa", name = "C", descriptor = "I")
    public int field2421;

    @OriginalMember(owner = "client!oa", name = "D", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!oa", name = "G", descriptor = "I")
    public int field2425;

    @OriginalMember(owner = "client!oa", name = "L", descriptor = "I")
    public int field2430;

    @OriginalMember(owner = "client!oa", name = "M", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!oa", name = "Q", descriptor = "I")
    public static int field2434;

    @OriginalMember(owner = "client!oa", name = "E", descriptor = "Lai;")
    public class10 field2423;

    @OriginalMember(owner = "client!oa", name = "H", descriptor = "[I")
    public int[] field2426;

    @OriginalMember(owner = "client!oa", name = "O", descriptor = "[I")
    public int[] field2432;

    @OriginalMember(owner = "client!oa", name = "S", descriptor = "[Lai;")
    public class10[] field2436;

    @OriginalMember(owner = "client!oa", name = "b", descriptor = "(B)V")
    public static final void method891(byte arg0) {
        int var1 = -42 % ((-arg0 - 21) / 38);
        field2422++;
        for (class171 var2 = (class171) class123.field2360.method1223(true); var2 != null; var2 = (class171) class123.field2360.method1226((byte) -57)) {
            if (var2.field3310 > 0) {
                var2.field3310--;
            }
            if (var2.field3310 != 0) {
                if (var2.field3306 > 0) {
                    var2.field3306--;
                }
                if (var2.field3306 == 0 && var2.field3302 >= 1 && var2.field3314 >= 1 && var2.field3302 <= 102 && var2.field3314 <= 102 && (var2.field3309 < 0 || class192.method1228(var2.field3315, 8, var2.field3309))) {
                    class35.method238(var2.field3309, var2.field3308, var2.field3302, var2.field3307, -14, var2.field3315, var2.field3303, var2.field3314);
                    var2.field3306 = -1;
                    if (var2.field3313 == var2.field3309 && var2.field3313 == -1) {
                        var2.method848(false);
                    } else if (var2.field3313 == var2.field3309 && var2.field3308 == var2.field3297 && var2.field3315 == var2.field3304) {
                        var2.method848(false);
                    }
                }
            } else if (var2.field3313 < 0 || class192.method1228(var2.field3304, 8, var2.field3313)) {
                class35.method238(var2.field3313, var2.field3297, var2.field3302, var2.field3307, 127, var2.field3304, var2.field3303, var2.field3314);
                var2.method848(false);
            }
        }
    }

    @OriginalMember(owner = "client!oa", name = "c", descriptor = "(B)V")
    public static void method892(byte arg0) {
        if (arg0 <= 101) {
            field2429 = null;
        }
        field2424 = null;
        field2439 = null;
        field2433 = null;
        field2428 = null;
        field2437 = null;
        field2438 = null;
        field2429 = null;
        field2419 = null;
        field2440 = null;
    }

    @OriginalMember(owner = "client!oa", name = "d", descriptor = "(B)I")
    public static final int method893(byte arg0) {
        field2420++;
        if (arg0 <= 111) {
            field2439 = null;
        }
        return 6;
    }
}
