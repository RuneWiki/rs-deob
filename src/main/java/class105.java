import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class105 {

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "Lkd;")
    private static class73 field2610 = class126.method1070((byte) -66, "Loading fonts )2 ");

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "I")
    public static int field2615 = 0;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "Lkd;")
    public static class73 field2605 = class126.method1070((byte) -66, "Ihre Freunde)2Liste ist voll(Q Mitglieder k-Onnen 200 Freunde hinzuf-Ugen)1 freie Spieler nur 100)3");

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "Lkd;")
    public static class73 field2612 = class126.method1070((byte) -66, "");

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "Lkd;")
    public static class73 field2614 = field2610;

    @OriginalMember(owner = "client!pa", name = "n", descriptor = "Lkd;")
    public static class73 field2618 = class126.method1070((byte) -66, " )2> ");

    @OriginalMember(owner = "client!pa", name = "s", descriptor = "Lkd;")
    public static class73 field2623 = class126.method1070((byte) -66, "(Z");

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field2607 = 0;

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "Lkd;")
    private static class73 field2616 = class126.method1070((byte) -66, "This computers address has been blocked");

    @OriginalMember(owner = "client!pa", name = "o", descriptor = "Lkd;")
    private static class73 field2619 = class126.method1070((byte) -66, "level)2");

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "Lkd;")
    public static class73 field2611 = field2619;

    @OriginalMember(owner = "client!pa", name = "t", descriptor = "I")
    public static int field2624 = -1;

    @OriginalMember(owner = "client!pa", name = "p", descriptor = "Lkd;")
    public static class73 field2620 = field2616;

    @OriginalMember(owner = "client!pa", name = "q", descriptor = "Lkd;")
    public static class73 field2621 = class126.method1070((byte) -66, "W-=hlen Sie eine Welt");

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "Lkd;")
    public static class73 field2613 = class126.method1070((byte) -66, "Wordpack geladen)3");

    @OriginalMember(owner = "client!pa", name = "m", descriptor = "Lkd;")
    public static class73 field2617 = class126.method1070((byte) -66, " loggt sich ein)3");

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public static int field2606;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!pa", name = "r", descriptor = "Lud;")
    public static class140 field2622;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIII)I")
    public static final int method837(int arg0, int arg1, int arg2, int arg3) {
        int var4 = 256 - arg1;
        int var5 = -18 / ((arg3 + 85) / 40);
        field2609++;
        return ((arg0 & 0xFF00) * arg1 + (arg2 & 0xFF00) * var4 & 0xFF0000) + ((arg0 & 0xFF00FF) * arg1 + (arg2 & 0xFF00FF) * var4 & 0xFF00FF00) >> 8;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lkd;I)I")
    public static final int method838(class73 arg0, int arg1) {
        field2606++;
        if (class143.field3558 == 1) {
            return 7;
        } else if (arg0.method642(126, class146.field3613)) {
            return 1;
        } else if (arg0.method642(-124, class50.field1328)) {
            return 1;
        } else if (arg0.method642(115, class111.field2758)) {
            return 2;
        } else if (arg0.method642(arg1 - 16711836, class58.field1557)) {
            return 2;
        } else if (arg0.method642(arg1 ^ 0xFF00FF7F, class74.field1905)) {
            return 3;
        } else if (arg0.method642(101, class45.field1179)) {
            return 4;
        } else if (arg0.method642(111, class109.field2690)) {
            return 5;
        } else if (arg0.method642(-32, class31.field872)) {
            return 6;
        } else {
            if (arg1 != 16711935) {
                method837(25, -119, 67, 69);
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
    public static void method839(int arg0) {
        field2614 = null;
        field2616 = null;
        field2623 = null;
        field2621 = null;
        field2610 = null;
        field2622 = null;
        if (arg0 != -10075) {
            method837(45, 44, 127, 100);
        }
        field2618 = null;
        field2620 = null;
        field2619 = null;
        field2612 = null;
        field2617 = null;
        field2611 = null;
        field2605 = null;
        field2613 = null;
    }
}
