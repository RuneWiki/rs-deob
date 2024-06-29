import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class104 {

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "Loc;")
    public static class99 field2519 = class48.method402((byte) -104, "title)3jpg");

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "Loc;")
    public static class99 field2526 = class48.method402((byte) -104, "Sie befinden sich in einem Mitglieder)2Gebiet(Q");

    @OriginalMember(owner = "client!pb", name = "p", descriptor = "I")
    public static int field2533 = 0;

    @OriginalMember(owner = "client!pb", name = "n", descriptor = "I")
    public static int field2531 = 0;

    @OriginalMember(owner = "client!pb", name = "l", descriptor = "Loc;")
    public static class99 field2529 = class48.method402((byte) -104, "mapback");

    @OriginalMember(owner = "client!pb", name = "o", descriptor = "Loc;")
    private static class99 field2532 = class48.method402((byte) -104, "Attack");

    @OriginalMember(owner = "client!pb", name = "r", descriptor = "Loc;")
    public static class99 field2535 = class48.method402((byte) -104, "Verbindung mit Update)2Server)3)3)3");

    @OriginalMember(owner = "client!pb", name = "j", descriptor = "[I")
    public static int[] field2527 = new int[100];

    @OriginalMember(owner = "client!pb", name = "v", descriptor = "Loc;")
    public static class99 field2539 = class48.method402((byte) -104, "Keine Antwort vom Server)3");

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "Loc;")
    public static class99 field2521 = field2532;

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "Loc;")
    private static class99 field2522 = class48.method402((byte) -104, "wishes to duel with you)3");

    @OriginalMember(owner = "client!pb", name = "u", descriptor = "Loc;")
    public static class99 field2538 = class48.method402((byte) -104, " zuerst von Ihrer Freunde)2Liste(Q");

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "Loc;")
    public static class99 field2523 = field2522;

    @OriginalMember(owner = "client!pb", name = "k", descriptor = "Loc;")
    public static class99 field2528 = class48.method402((byte) -104, "oberen Rand der Webseite ausw-=hlen)3");

    @OriginalMember(owner = "client!pb", name = "x", descriptor = "Loc;")
    private static class99 field2541 = class48.method402((byte) -104, "Service unavailable)3");

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "Loc;")
    public static class99 field2520 = field2541;

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "I")
    public static int field2524;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
    public static int field2525;

    @OriginalMember(owner = "client!pb", name = "m", descriptor = "I")
    public static int field2530;

    @OriginalMember(owner = "client!pb", name = "w", descriptor = "I")
    public static int field2540;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "Loe;")
    public static class102 field2518;

    @OriginalMember(owner = "client!pb", name = "q", descriptor = "Loe;")
    public static class102 field2534;

    @OriginalMember(owner = "client!pb", name = "s", descriptor = "Lwe;")
    public static class150 field2536;

    @OriginalMember(owner = "client!pb", name = "t", descriptor = "Lhb;")
    public static class50 field2537;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(BII)V")
    public static final void method880(byte arg0, int arg1, int arg2) {
        field2530++;
        long var3 = (long) ((arg1 << 16) + arg2);
        if (arg0 != -68) {
            method882(58, -60L);
        }
        class61 var5 = (class61) class43.field1040.method1001(var3, (byte) -112);
        if (var5 != null) {
            class48.field1171.method599(arg0 ^ 0xFFFFFFBC, var5);
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(I)V")
    public static void method881(int arg0) {
        field2518 = null;
        field2519 = null;
        field2526 = null;
        field2523 = null;
        field2529 = null;
        field2541 = null;
        if (arg0 != -24329) {
            method881(127);
        }
        field2522 = null;
        field2539 = null;
        field2537 = null;
        field2520 = null;
        field2538 = null;
        field2532 = null;
        field2528 = null;
        field2521 = null;
        field2536 = null;
        field2534 = null;
        field2535 = null;
        field2527 = null;
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(IJ)V")
    public static final void method882(int arg0, long arg1) {
        field2525++;
        if (arg1 == 0L) {
            return;
        }
        for (int var3 = 0; var3 < class9.field230; var3++) {
            if (class88.field2185[var3] == arg1) {
                class52.field1243 = true;
                class63.field1660++;
                class9.field230--;
                for (int var4 = var3; var4 < class9.field230; var4++) {
                    class17.field463[var4] = class17.field463[var4 + 1];
                    class59.field1589[var4] = class59.field1589[var4 + 1];
                    class88.field2185[var4] = class88.field2185[var4 + 1];
                    class137.field3431[var4] = class137.field3431[var4 + 1];
                }
                class82.field2043 = class101.field2444 + 1;
                class134.field3276.method869((byte) 11, 127);
                class134.field3276.method490(true, arg1);
                break;
            }
        }
        if (arg0 < 61) {
            field2532 = null;
        }
    }
}
