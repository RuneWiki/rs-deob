import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class129 {

    @OriginalMember(owner = "client!n", name = "k", descriptor = "I")
    public static int field2441 = 0;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "Lrd;")
    private static class173 field2435 = class133.method843("Loading textures )2 ", -119);

    @OriginalMember(owner = "client!n", name = "b", descriptor = "[I")
    public static int[] field2432 = new int[5];

    @OriginalMember(owner = "client!n", name = "h", descriptor = "Lrd;")
    public static class173 field2438 = field2435;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "Lrd;")
    public static class173 field2433 = class133.method843(" )2> <col=ffffff>", 84);

    @OriginalMember(owner = "client!n", name = "j", descriptor = "Lrd;")
    public static class173 field2440 = class133.method843("cookieprefix", 86);

    @OriginalMember(owner = "client!n", name = "l", descriptor = "I")
    public static int field2442 = 0;

    @OriginalMember(owner = "client!n", name = "n", descriptor = "Lrd;")
    public static class173 field2444 = class133.method843("Startseite auf (WSpielkonto wiederherstellen(W)3", -112);

    @OriginalMember(owner = "client!n", name = "o", descriptor = "I")
    public static int field2445 = 0;

    @OriginalMember(owner = "client!n", name = "p", descriptor = "Lrd;")
    public static class173 field2446 = class133.method843("; Expires=Thu)1 01)2Jan)21970 00:00:00 GMT; Max)2Age=0", -77);

    @OriginalMember(owner = "client!n", name = "a", descriptor = "I")
    public static int field2431;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!n", name = "i", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!n", name = "m", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "J")
    public long field2437;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "Ln;")
    public class129 field2434;

    @OriginalMember(owner = "client!n", name = "q", descriptor = "Ln;")
    public class129 field2447;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)Z")
    public final boolean method822(int arg0) {
        field2439++;
        if (this.field2447 == null) {
            return false;
        } else {
            if (arg0 != 327) {
                field2433 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ILqf;)V")
    public static final void method823(int arg0, class165 arg1) {
        if (arg0 != 2670) {
            field2445 = 95;
        }
        field2443++;
        int var2 = arg1.field3170;
        if (var2 == 324) {
            if (class3.field30 == -1) {
                class7.field140 = arg1.field3052;
                class3.field30 = arg1.field3118;
            }
            if (class193.field3760.field2109) {
                arg1.field3118 = class3.field30;
            } else {
                arg1.field3118 = class7.field140;
            }
        } else if (var2 == 325) {
            if (class3.field30 == -1) {
                class3.field30 = arg1.field3118;
                class7.field140 = arg1.field3052;
            }
            if (class193.field3760.field2109) {
                arg1.field3118 = class7.field140;
            } else {
                arg1.field3118 = class3.field30;
            }
        } else if (var2 == 327) {
            arg1.field3125 = 150;
            arg1.field3115 = (int) (Math.sin((double) class217.field4203 / 40.0D) * 256.0D) & 0x7FF;
            arg1.field3159 = -1;
            arg1.field3086 = 5;
        } else if (var2 == 328) {
            if (class175.field3447.field4097 == null) {
                arg1.field3159 = 0;
            } else {
                arg1.field3125 = 150;
                arg1.field3115 = (int) (Math.sin((double) class217.field4203 / 40.0D) * 256.0D) & 0x7FF;
                arg1.field3086 = 5;
                arg1.field3159 = ((int) class175.field3447.field4097.method1132(106) << 11) + 2047;
                arg1.field3084 = class175.field3447.field2789;
                arg1.field3155 = class175.field3447.field2762;
            }
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V")
    public final void method824(byte arg0) {
        field2436++;
        if (this.field2447 == null) {
            return;
        }
        this.field2447.field2434 = this.field2434;
        this.field2434.field2447 = this.field2447;
        this.field2434 = null;
        if (arg0 >= -121) {
            method823(127, null);
        }
        this.field2447 = null;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(I)V")
    public static void method825(int arg0) {
        field2435 = null;
        field2440 = null;
        if (arg0 != 5) {
            field2446 = null;
        }
        field2432 = null;
        field2444 = null;
        field2438 = null;
        field2433 = null;
        field2446 = null;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II)Z")
    public static final boolean method826(int arg0, int arg1) {
        field2431++;
        if (arg0 != 1) {
            field2442 = -24;
        }
        return (arg1 & 0x1) != 0;
    }
}
