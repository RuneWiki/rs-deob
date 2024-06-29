import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class135 {

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "I")
    public int field2605 = -1;

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "I")
    public static int field2604 = 0;

    @OriginalMember(owner = "client!kh", name = "m", descriptor = "Lhh;")
    private static class163 field2614 = class137.method1065("Your ignore list is full)3 Max of 100 users)3", 17);

    @OriginalMember(owner = "client!kh", name = "p", descriptor = "I")
    public static int field2617 = 1;

    @OriginalMember(owner = "client!kh", name = "n", descriptor = "Lhh;")
    public static class163 field2615 = field2614;

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "Lqc;")
    public static class258 field2606 = new class258(4096);

    @OriginalMember(owner = "client!kh", name = "q", descriptor = "Lhh;")
    public static class163 field2618 = class137.method1065("<col=c0ff00>", 17);

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "I")
    public int field2602;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "I")
    public int field2603;

    @OriginalMember(owner = "client!kh", name = "f", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!kh", name = "g", descriptor = "I")
    public int field2608;

    @OriginalMember(owner = "client!kh", name = "h", descriptor = "I")
    public int field2609;

    @OriginalMember(owner = "client!kh", name = "i", descriptor = "I")
    public int field2610;

    @OriginalMember(owner = "client!kh", name = "j", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!kh", name = "k", descriptor = "I")
    public int field2612;

    @OriginalMember(owner = "client!kh", name = "l", descriptor = "I")
    public int field2613;

    @OriginalMember(owner = "client!kh", name = "o", descriptor = "I")
    public int field2616;

    @OriginalMember(owner = "client!kh", name = "r", descriptor = "Lpa;")
    public static class123 field2619;

    @OriginalMember(owner = "client!kh", name = "s", descriptor = "Lpa;")
    public static class123 field2620;

    @OriginalMember(owner = "client!kh", name = "t", descriptor = "[S")
    public static short[] field2621;

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(II)I")
    public static final int method1056(int arg0, int arg1) {
        field2611++;
        if (class218.field3968 == 1) {
            return 7;
        } else if (class218.field3968 == 2) {
            return 20;
        } else if (arg0 == 15) {
            return 13;
        } else if (arg0 == 16) {
            return 3;
        } else if (arg0 == 22) {
            return 8;
        } else if (arg0 == 31) {
            return 14;
        } else if (arg0 == 38) {
            return 2;
        } else if (arg0 == 43) {
            return 15;
        } else if (arg0 == 48) {
            return 17;
        } else if (arg0 == 58) {
            return 11;
        } else if (arg0 == 69) {
            return 6;
        } else if (arg0 == 74) {
            return 20;
        } else if (arg0 == 77) {
            return 1;
        } else if (arg0 == 101) {
            return 12;
        } else if (arg0 == 103) {
            return 19;
        } else if (arg0 == 152) {
            return 16;
        } else if (arg0 == 161) {
            return 4;
        } else if (arg0 == 162) {
            return 9;
        } else if (arg0 == 166) {
            return 10;
        } else if (arg0 == 179) {
            return 18;
        } else if (arg0 == 191) {
            return 5;
        } else {
            if (arg1 != 20) {
                method1056(-114, 38);
            }
            return 0;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(I)V")
    public static void method1057(int arg0) {
        field2606 = null;
        field2615 = null;
        field2618 = null;
        field2620 = null;
        field2621 = null;
        field2614 = null;
        if (arg0 >= 84) {
            field2619 = null;
        }
    }
}
