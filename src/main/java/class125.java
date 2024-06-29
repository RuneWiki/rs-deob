import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class125 {

    @OriginalMember(owner = "client!s", name = "c", descriptor = "[Le;")
    public static class29[] field2757 = new class29[1000];

    @OriginalMember(owner = "client!s", name = "g", descriptor = "Lpe;")
    public static class109 field2761 = class141.method1120("Verbinde mit Server)3)3)3", 0);

    @OriginalMember(owner = "client!s", name = "n", descriptor = "Lpe;")
    private static class109 field2768 = class141.method1120(" seconds)3", 0);

    @OriginalMember(owner = "client!s", name = "e", descriptor = "Lpe;")
    public static class109 field2759 = field2768;

    @OriginalMember(owner = "client!s", name = "m", descriptor = "Lpe;")
    public static class109 field2767 = class141.method1120("<)4col> x", 0);

    @OriginalMember(owner = "client!s", name = "p", descriptor = "I")
    public static int field2770 = -1;

    @OriginalMember(owner = "client!s", name = "o", descriptor = "I")
    public static int field2769 = 0;

    @OriginalMember(owner = "client!s", name = "j", descriptor = "Lpe;")
    private static class109 field2764 = class141.method1120("Cancel", 0);

    @OriginalMember(owner = "client!s", name = "d", descriptor = "Z")
    public static boolean field2758 = false;

    @OriginalMember(owner = "client!s", name = "q", descriptor = "[I")
    public static int[] field2771 = new int[] { 0, 1, 2, 3 };

    @OriginalMember(owner = "client!s", name = "s", descriptor = "Lpe;")
    public static class109 field2773 = field2764;

    @OriginalMember(owner = "client!s", name = "l", descriptor = "I")
    public static int field2766 = 0;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "I")
    public static int field2755;

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public static int field2760;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    public static int field2762;

    @OriginalMember(owner = "client!s", name = "k", descriptor = "I")
    public static int field2765;

    @OriginalMember(owner = "client!s", name = "r", descriptor = "I")
    public static int field2772;

    @OriginalMember(owner = "client!s", name = "t", descriptor = "I")
    public static int field2774;

    @OriginalMember(owner = "client!s", name = "b", descriptor = "Lqe;")
    public static class116 field2756;

    @OriginalMember(owner = "client!s", name = "u", descriptor = "Lre;")
    public static class123 field2775;

    @OriginalMember(owner = "client!s", name = "i", descriptor = "Z")
    public static boolean field2763;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(III)Lpe;")
    public static final class109 method1012(int arg0, int arg1, int arg2) {
        int var3 = arg1 - arg0;
        field2762++;
        if (var3 < -9) {
            return class45.field947;
        } else if (var3 < -6) {
            return class13.field308;
        } else if (var3 < -3) {
            return class145.field3179;
        } else if (var3 < 0) {
            return class154.field3517;
        } else if (arg2 > ~var3) {
            return class78.field1644;
        } else if (var3 > 6) {
            return class99.field2077;
        } else if (var3 > 3) {
            return class112.field2447;
        } else if (var3 > 0) {
            return class86.field1838;
        } else {
            return class8.field206;
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)V")
    public static final void method1013(int arg0, int arg1) {
        if (class55.field1118 == 0) {
            class156.field3606.method467(arg1, 0);
        } else {
            class48.field998 = arg1;
        }
        field2755++;
        if (arg0 >= -99) {
            method1015(-13);
        }
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)Lc;")
    public static final class15 method1014(int arg0) {
        field2760++;
        try {
            return arg0 == -1 ? (class15) Class.forName("uc").getDeclaredConstructor().newInstance() : null;
        } catch (Throwable var1) {
            return new class75();
        }
    }

    @OriginalMember(owner = "client!s", name = "b", descriptor = "(I)V")
    public static void method1015(int arg0) {
        field2761 = null;
        field2757 = null;
        if (arg0 != 0) {
            return;
        }
        field2768 = null;
        field2771 = null;
        field2764 = null;
        field2767 = null;
        field2756 = null;
        field2773 = null;
        field2775 = null;
        field2759 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(Lad;I)V")
    public static final void method1016(class5 arg0, int arg1) {
        field2774++;
        arg0.field131 = false;
        if (arg0.field130 != null) {
            arg0.field130.field537 = 0;
        }
        if (arg1 != -1) {
            field2770 = -23;
        }
        for (class5 var2 = arg0.method53(); var2 != null; var2 = arg0.method50()) {
            method1016(var2, -1);
        }
    }
}
