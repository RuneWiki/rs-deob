import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class149 extends class249 {

    @OriginalMember(owner = "client!oh", name = "w", descriptor = "J")
    public long field2631;

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "Lmb;")
    public static class96 field2623 = class243.method1708("m-Ochte mit Ihnen handeln)3", (byte) 118);

    @OriginalMember(owner = "client!oh", name = "v", descriptor = "Lmb;")
    public static class96 field2630 = class243.method1708(":assistreq:", (byte) 122);

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "I")
    public static int field2627 = 0;

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "I")
    public static int field2624;

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!oh", name = "u", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!oh", name = "x", descriptor = "I")
    public static int field2632;

    @OriginalMember(owner = "client!oh", name = "t", descriptor = "Li;")
    public static class18 field2628;

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "[I")
    public static int[] field2625;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "(I)V")
    public static void method1093(int arg0) {
        if (arg0 != -1) {
            method1096((class3) null, (class3) null, (class33) null, -72, (class3) null);
        }
        field2628 = null;
        field2630 = null;
        field2625 = null;
        field2623 = null;
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IB)Lgk;")
    public static final class175 method1094(int arg0, byte arg1) {
        field2624++;
        if (arg0 == 0) {
            return new class232();
        } else if (arg0 == 1) {
            return new class248();
        } else if (arg0 == 2) {
            return new class29();
        } else if (arg0 == 3) {
            return new class185();
        } else if (arg0 == 4) {
            return new class80();
        } else if (arg0 == 5) {
            return new class171();
        } else if (arg0 == 6) {
            return new class256();
        } else if (arg0 == 7) {
            return new class73();
        } else if (arg0 == 8) {
            return new class221();
        } else if (arg0 == 9) {
            return new class49();
        } else if (arg0 == 10) {
            return new class25();
        } else if (arg0 == 11) {
            return new class266();
        } else if (arg0 == 12) {
            return new class245();
        } else if (arg0 == 13) {
            return new class1();
        } else if (arg0 == 14) {
            return new class140();
        } else if (arg0 == 15) {
            return new class230();
        } else if (arg0 == 16) {
            return new class17();
        } else if (arg0 == 17) {
            return new class68();
        } else if (arg0 == 18) {
            return new class10();
        } else if (arg0 == 19) {
            return new class79();
        } else if (arg0 == 20) {
            return new class20();
        } else if (arg0 == 21) {
            return new class270();
        } else if (arg0 == 22) {
            return new class188();
        } else if (arg0 == 23) {
            return new class91();
        } else if (arg0 == 24) {
            return new class9();
        } else if (arg0 == 25) {
            return new class127();
        } else if (arg0 == 26) {
            return new class259();
        } else if (arg0 == 27) {
            return new class269();
        } else if (arg0 == 28) {
            return new class118();
        } else if (arg0 == 29) {
            return new class264();
        } else if (arg0 == 30) {
            return new class141();
        } else if (arg0 == 31) {
            return new class119();
        } else if (arg0 == 32) {
            return new class153();
        } else if (arg0 == 33) {
            return new class23();
        } else if (arg0 == 34) {
            return new class122();
        } else if (arg0 == 35) {
            return new class117();
        } else if (arg0 == 36) {
            return new class139();
        } else if (arg0 == 37) {
            return new class83();
        } else if (arg0 == 38) {
            return new class21();
        } else if (arg0 == 39) {
            return new class244();
        } else {
            int var3 = 114 % ((61 - arg1) / 52);
            return null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "(B)I")
    public static final int method1095(byte arg0) {
        field2626++;
        if ((double) class180.field3097 == 3.0D) {
            return 37;
        }
        if (arg0 < 125) {
            field2630 = null;
        }
        if ((double) class180.field3097 == 4.0D) {
            return 50;
        } else if ((double) class180.field3097 == 6.0D) {
            return 75;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "()V")
    public class149() {
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(Lff;Lff;Lhk;ILff;)Z")
    public static final boolean method1096(class3 arg0, class3 arg1, class33 arg2, int arg3, class3 arg4) {
        class254.field4385 = arg2;
        if (arg3 >= -126) {
            field2625 = null;
        }
        class165.field2929 = arg1;
        field2632++;
        class138.field2476 = arg0;
        class213.field3676 = arg4;
        return true;
    }

    @OriginalMember(owner = "client!oh", name = "<init>", descriptor = "(J)V")
    public class149(long arg0) {
        this.field2631 = arg0;
    }
}
