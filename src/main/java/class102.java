import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class102 extends class99 {

    @OriginalMember(owner = "client!oe", name = "T", descriptor = "Laf;")
    private static class7 field2409 = class48.method406(40, "Invalid username or password)3");

    @OriginalMember(owner = "client!oe", name = "eb", descriptor = "I")
    public static int field2420 = 0;

    @OriginalMember(owner = "client!oe", name = "W", descriptor = "Laf;")
    public static class7 field2412 = field2409;

    @OriginalMember(owner = "client!oe", name = "cb", descriptor = "Laf;")
    public static class7 field2418 = class48.method406(40, "gleiten:");

    @OriginalMember(owner = "client!oe", name = "hb", descriptor = "Laf;")
    public static class7 field2423 = class48.method406(40, "Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

    @OriginalMember(owner = "client!oe", name = "gb", descriptor = "Laf;")
    public static class7 field2422 = class48.method406(40, "Startseite auf (WSpielkonto wiederherstellen(W)3");

    @OriginalMember(owner = "client!oe", name = "X", descriptor = "Laf;")
    private static class7 field2413 = class48.method406(40, "Loaded title screen");

    @OriginalMember(owner = "client!oe", name = "V", descriptor = "Laf;")
    public static class7 field2411 = field2413;

    @OriginalMember(owner = "client!oe", name = "fb", descriptor = "Lgd;")
    public static class46 field2421 = new class46(64);

    @OriginalMember(owner = "client!oe", name = "lb", descriptor = "Laf;")
    public static class7 field2427 = class48.method406(40, "Zu viele Anmelde)2Versuche von Ihrer Adresse");

    @OriginalMember(owner = "client!oe", name = "kb", descriptor = "Laf;")
    public static class7 field2426 = class48.method406(40, "<)4col> x");

    @OriginalMember(owner = "client!oe", name = "mb", descriptor = "Laf;")
    private static class7 field2428 = class48.method406(40, "Members only world");

    @OriginalMember(owner = "client!oe", name = "nb", descriptor = "Laf;")
    public static class7 field2429 = field2428;

    @OriginalMember(owner = "client!oe", name = "R", descriptor = "I")
    public int field2407;

    @OriginalMember(owner = "client!oe", name = "S", descriptor = "I")
    public int field2408;

    @OriginalMember(owner = "client!oe", name = "U", descriptor = "I")
    public static int field2410;

    @OriginalMember(owner = "client!oe", name = "Y", descriptor = "I")
    public static int field2414;

    @OriginalMember(owner = "client!oe", name = "Z", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!oe", name = "bb", descriptor = "I")
    public int field2417;

    @OriginalMember(owner = "client!oe", name = "db", descriptor = "I")
    public static int field2419;

    @OriginalMember(owner = "client!oe", name = "ib", descriptor = "I")
    public static int field2424;

    @OriginalMember(owner = "client!oe", name = "jb", descriptor = "Lkf;")
    public static class75 field2425;

    @OriginalMember(owner = "client!oe", name = "ab", descriptor = "[I")
    public static int[] field2416;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Z)V")
    public static void method833(boolean arg0) {
        field2425 = null;
        field2428 = null;
        field2427 = null;
        field2416 = null;
        field2421 = null;
        if (!arg0) {
            return;
        }
        field2422 = null;
        field2429 = null;
        field2413 = null;
        field2426 = null;
        field2418 = null;
        field2411 = null;
        field2412 = null;
        field2423 = null;
        field2409 = null;
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(ILrd;)V")
    public final void method834(int arg0, class122 arg1) {
        int var3 = 100 % ((arg0 - 76) / 45);
        field2414++;
        while (true) {
            int var4 = arg1.method931((byte) 124);
            if (var4 == 0) {
                return;
            }
            this.method836(var4, arg1, (byte) 28);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZI)V")
    public static final void method835(int arg0, boolean arg1, int arg2) {
        client.field564++;
        if (arg1) {
            method833(true);
        }
        field2410++;
        class47.field1150.method1131(181, 2027385224);
        class47.field1150.method938(arg2, -2097152);
        class47.field1150.method942(2544, arg0);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILrd;B)V")
    private final void method836(int arg0, class122 arg1, byte arg2) {
        if (arg2 != 28) {
            field2425 = null;
        }
        field2419++;
        if (arg0 == 1) {
            this.field2417 = arg1.method965(false);
            this.field2408 = arg1.method931((byte) 124);
            this.field2407 = arg1.method931((byte) 124);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Laf;ILaf;Lkb;)Lqc;")
    public static final class114 method837(class7 arg0, int arg1, class7 arg2, class71 arg3) {
        field2424++;
        int var4 = arg3.method586(arg0, -4795);
        int var5 = arg3.method560(arg2, var4, 83);
        if (arg1 >= -14) {
            field2425 = null;
        }
        return class73.method625(arg3, (byte) 88, var4, var5);
    }
}
