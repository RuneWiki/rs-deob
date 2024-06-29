import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class160 extends class86 {

    @OriginalMember(owner = "client!rd", name = "t", descriptor = "I")
    public int field2609 = 0;

    @OriginalMember(owner = "client!rd", name = "H", descriptor = "[Lsd;")
    public class26[] field2623 = new class26[5];

    @OriginalMember(owner = "client!rd", name = "M", descriptor = "[I")
    public int[] field2628 = new int[5];

    @OriginalMember(owner = "client!rd", name = "N", descriptor = "I")
    public int field2629;

    @OriginalMember(owner = "client!rd", name = "O", descriptor = "I")
    public int field2630;

    @OriginalMember(owner = "client!rd", name = "P", descriptor = "I")
    public int field2631;

    @OriginalMember(owner = "client!rd", name = "E", descriptor = "I")
    public int field2620;

    @OriginalMember(owner = "client!rd", name = "G", descriptor = "[J")
    public static long[] field2622 = new long[200];

    @OriginalMember(owner = "client!rd", name = "J", descriptor = "I")
    public static int field2625 = -2;

    @OriginalMember(owner = "client!rd", name = "z", descriptor = "Lbe;")
    public static class283 field2615 = class153.method941(127, "Lade Konfiguration )2 ");

    @OriginalMember(owner = "client!rd", name = "X", descriptor = "I")
    public static int field2639 = 1;

    @OriginalMember(owner = "client!rd", name = "u", descriptor = "Lbe;")
    public static class283 field2610 = class153.method941(127, "scape main");

    @OriginalMember(owner = "client!rd", name = "w", descriptor = "Lbe;")
    public static class283 field2612 = class153.method941(126, "(U5");

    @OriginalMember(owner = "client!rd", name = "bb", descriptor = "[I")
    public static int[] field2643 = new int[] { 1, 1, 1, 1, 4, 1, 1, 5, 6, 1, 5, 0, 7, 0, 4, 1, 7, 2, 1, 1, 6, 1, 1, 3, 6, 1, 7, 0, 0, 6, 7, 0, 1, 7, 6, 1, 1, 1, 5, 4, 3, 2, 1, 1, 0, 4, 1, 5 };

    @OriginalMember(owner = "client!rd", name = "y", descriptor = "Lbe;")
    public static class283 field2614 = class153.method941(-123, ")1 ");

    @OriginalMember(owner = "client!rd", name = "x", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!rd", name = "C", descriptor = "I")
    public int field2618;

    @OriginalMember(owner = "client!rd", name = "D", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!rd", name = "I", descriptor = "I")
    public int field2624;

    @OriginalMember(owner = "client!rd", name = "K", descriptor = "I")
    public int field2626;

    @OriginalMember(owner = "client!rd", name = "L", descriptor = "I")
    public int field2627;

    @OriginalMember(owner = "client!rd", name = "T", descriptor = "I")
    public static int field2635;

    @OriginalMember(owner = "client!rd", name = "U", descriptor = "I")
    public static int field2636;

    @OriginalMember(owner = "client!rd", name = "V", descriptor = "I")
    public static int field2637;

    @OriginalMember(owner = "client!rd", name = "Z", descriptor = "I")
    public int field2641;

    @OriginalMember(owner = "client!rd", name = "cb", descriptor = "I")
    public static int field2644;

    @OriginalMember(owner = "client!rd", name = "B", descriptor = "Lbc;")
    public class110 field2617;

    @OriginalMember(owner = "client!rd", name = "S", descriptor = "Lok;")
    public class141 field2634;

    @OriginalMember(owner = "client!rd", name = "F", descriptor = "Lrd;")
    public class160 field2621;

    @OriginalMember(owner = "client!rd", name = "Q", descriptor = "Lia;")
    public class197 field2632;

    @OriginalMember(owner = "client!rd", name = "W", descriptor = "Lkf;")
    public class211 field2638;

    @OriginalMember(owner = "client!rd", name = "ab", descriptor = "Lug;")
    public class291 field2642;

    @OriginalMember(owner = "client!rd", name = "A", descriptor = "Lal;")
    public class305 field2616;

    @OriginalMember(owner = "client!rd", name = "v", descriptor = "Z")
    public boolean field2611;

    @OriginalMember(owner = "client!rd", name = "R", descriptor = "Z")
    public boolean field2633;

    @OriginalMember(owner = "client!rd", name = "Y", descriptor = "Z")
    public boolean field2640;

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "(III)V", line = 8)
    public class160(int arg0, int arg1, int arg2) {
        this.field2629 = arg2;
        this.field2631 = this.field2630 = arg0;
        this.field2620 = arg1;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Z)I", line = 20)
    public static final int method974(boolean arg0) {
        field2644++;
        if ((double) class162.field2649 == 3.0D) {
            return 37;
        }
        if (!arg0) {
            method974(true);
        }
        if ((double) class162.field2649 == 4.0D) {
            return 50;
        } else if ((double) class162.field2649 == 6.0D) {
            return 75;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IB)V", line = 44)
    public static final void method975(int arg0, byte arg1) {
        field2636++;
        if (arg1 > -98) {
            method974(true);
        }
        class66.field914.method1637(true, arg0);
        class186.field3183.method1637(true, arg0);
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "(I)V", line = 60)
    public static void method976(int arg0) {
        field2643 = null;
        field2610 = null;
        field2614 = null;
        if (arg0 != 10760) {
            method976(4);
        }
        field2615 = null;
        field2622 = null;
        field2612 = null;
    }
}
