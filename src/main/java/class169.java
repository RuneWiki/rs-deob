import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bg")
public class class169 {

    @OriginalMember(owner = "client!bg", name = "h", descriptor = "I")
    public static int field2744 = 127;

    @OriginalMember(owner = "client!bg", name = "g", descriptor = "Lmh;")
    private static class62 field2743 = class201.method1405(true, "Jan");

    @OriginalMember(owner = "client!bg", name = "i", descriptor = "Lmh;")
    private static class62 field2745 = class201.method1405(true, "May");

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "I")
    public static int field2737 = 99;

    @OriginalMember(owner = "client!bg", name = "b", descriptor = "Lmh;")
    private static class62 field2738 = class201.method1405(true, "Feb");

    @OriginalMember(owner = "client!bg", name = "q", descriptor = "Lmh;")
    private static class62 field2753 = class201.method1405(true, "Sep");

    @OriginalMember(owner = "client!bg", name = "j", descriptor = "Lmh;")
    private static class62 field2746 = class201.method1405(true, "Oct");

    @OriginalMember(owner = "client!bg", name = "f", descriptor = "Lmh;")
    private static class62 field2742 = class201.method1405(true, "Mar");

    @OriginalMember(owner = "client!bg", name = "s", descriptor = "Lmh;")
    public static class62 field2755 = class201.method1405(true, "Verbindung mit Update)2Server)3)3)3");

    @OriginalMember(owner = "client!bg", name = "k", descriptor = "Lmh;")
    private static class62 field2747 = class201.method1405(true, "Nov");

    @OriginalMember(owner = "client!bg", name = "u", descriptor = "Lmh;")
    private static class62 field2757 = class201.method1405(true, "Dec");

    @OriginalMember(owner = "client!bg", name = "t", descriptor = "Lmh;")
    private static class62 field2756 = class201.method1405(true, "Apr");

    @OriginalMember(owner = "client!bg", name = "r", descriptor = "Lmh;")
    private static class62 field2754 = class201.method1405(true, "Jul");

    @OriginalMember(owner = "client!bg", name = "m", descriptor = "Lmh;")
    private static class62 field2749 = class201.method1405(true, "Jun");

    @OriginalMember(owner = "client!bg", name = "p", descriptor = "Lmh;")
    private static class62 field2752 = class201.method1405(true, "Aug");

    @OriginalMember(owner = "client!bg", name = "c", descriptor = "[Lmh;")
    public static class62[] field2739 = new class62[] { field2743, field2738, field2742, field2756, field2745, field2749, field2754, field2752, field2753, field2746, field2747, field2757 };

    @OriginalMember(owner = "client!bg", name = "v", descriptor = "F")
    public static float field2758;

    @OriginalMember(owner = "client!bg", name = "d", descriptor = "I")
    public static int field2740;

    @OriginalMember(owner = "client!bg", name = "e", descriptor = "I")
    public static int field2741;

    @OriginalMember(owner = "client!bg", name = "n", descriptor = "I")
    public static int field2750;

    @OriginalMember(owner = "client!bg", name = "o", descriptor = "I")
    public static int field2751;

    @OriginalMember(owner = "client!bg", name = "l", descriptor = "Ltj;")
    public static class11 field2748;

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(III)V", line = 13)
    public static final void method1215(int arg0, int arg1, int arg2) {
        int var3 = 100 / ((arg0 - 47) / 58);
        class151 var4 = class165.method1194((byte) 1, 13, arg1);
        var4.method1088(123);
        field2741++;
        var4.field2395 = arg2;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(I)V", line = 52)
    public static void method1216(int arg0) {
        if (arg0 != 28040) {
            method1215(-49, -94, 7);
        }
        field2745 = null;
        field2739 = null;
        field2757 = null;
        field2753 = null;
        field2743 = null;
        field2749 = null;
        field2747 = null;
        field2755 = null;
        field2738 = null;
        field2742 = null;
        field2756 = null;
        field2748 = null;
        field2752 = null;
        field2754 = null;
        field2746 = null;
    }

    @OriginalMember(owner = "client!bg", name = "a", descriptor = "(BI)Z", line = 120)
    public static final boolean method1217(byte arg0, int arg1) {
        field2750++;
        if (arg0 >= -41) {
            return false;
        } else {
            return (arg1 & 0x1) != 0;
        }
    }
}
