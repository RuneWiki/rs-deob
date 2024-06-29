import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class495 {

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "I")
    public static int field7309 = 0;

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "[I")
    public static int[] field7311 = new int[32];

    @OriginalMember(owner = "client!dd", name = "g", descriptor = "I")
    public static int field7315 = 0;

    @OriginalMember(owner = "client!dd", name = "h", descriptor = "[I")
    public static int[] field7316 = new int[] { 0, 1, 2, 3, 4, 5, 6, 14 };

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "I")
    public static int field7310;

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "I")
    public static int field7312;

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "I")
    public static int field7313;

    @OriginalMember(owner = "client!dd", name = "f", descriptor = "Lvb;")
    public static class130 field7314;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V")
    public static final void method2975(int arg0) {
        field7313++;
        class94 var1 = (class94) class286.field4081.method1640(false);
        if (arg0 != 1) {
            method2975(33);
        }
        while (var1 != null) {
            var1.method719();
            var1 = (class94) class286.field4081.method1641(true);
        }
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Z)V")
    public static void method2976(boolean arg0) {
        field7314 = null;
        field7311 = null;
        field7316 = null;
        if (!arg0) {
            method2975(12);
        }
    }
}
