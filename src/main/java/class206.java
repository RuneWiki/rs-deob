import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!th")
public class class206 {

    @OriginalMember(owner = "client!th", name = "c", descriptor = "Loc;")
    public static class151 field3647 = class137.method873(2, "Stufe)2");

    @OriginalMember(owner = "client!th", name = "a", descriptor = "Loc;")
    public static class151 field3645 = class137.method873(2, "::autoshadow on");

    @OriginalMember(owner = "client!th", name = "e", descriptor = "I")
    public static int field3649 = -1;

    @OriginalMember(owner = "client!th", name = "d", descriptor = "[I")
    public static int[] field3648 = new int[99];

    @OriginalMember(owner = "client!th", name = "g", descriptor = "I")
    public static int field3651 = 0;

    @OriginalMember(owner = "client!th", name = "h", descriptor = "I")
    public static int field3652;

    @OriginalMember(owner = "client!th", name = "k", descriptor = "I")
    public static int field3655;

    @OriginalMember(owner = "client!th", name = "i", descriptor = "[I")
    public static int[] field3653;

    @OriginalMember(owner = "client!th", name = "b", descriptor = "I")
    public static int field3646;

    @OriginalMember(owner = "client!th", name = "f", descriptor = "I")
    public static int field3650;

    @OriginalMember(owner = "client!th", name = "m", descriptor = "I")
    public static int field3657;

    @OriginalMember(owner = "client!th", name = "l", descriptor = "Lrd;")
    public static class182 field3656;

    @OriginalMember(owner = "client!th", name = "j", descriptor = "Lsd;")
    public static class192 field3654;

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(Lsd;Lma;Lsd;Lsd;B)Z")
    public static final boolean method1300(class192 arg0, class129 arg1, class192 arg2, class192 arg3, byte arg4) {
        if (arg4 >= -50) {
            return true;
        }
        class196.field3497 = arg2;
        class56.field1134 = arg0;
        field3650++;
        class69.field1363 = arg1;
        class83.field1581 = arg3;
        return true;
    }

    @OriginalMember(owner = "client!th", name = "a", descriptor = "(I)V")
    public static void method1301(int arg0) {
        field3653 = null;
        field3656 = null;
        if (arg0 == 0) {
            field3647 = null;
            field3654 = null;
            field3645 = null;
            field3648 = null;
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; var1++) {
            int var2 = var1 + 1;
            int var3 = (int) (Math.pow(2.0D, (double) var2 / 7.0D) * 300.0D + (double) var2);
            var0 += var3;
            field3648[var1] = var0 / 4;
        }
        field3652 = 0;
        field3655 = 0;
        field3653 = new int[1000];
    }
}
