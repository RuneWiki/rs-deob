import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class196 extends class60 {

    @OriginalMember(owner = "client!wc", name = "H", descriptor = "I")
    private final int field3511;

    @OriginalMember(owner = "client!wc", name = "E", descriptor = "I")
    private final int field3508;

    @OriginalMember(owner = "client!wc", name = "u", descriptor = "I")
    private final int field3498;

    @OriginalMember(owner = "client!wc", name = "w", descriptor = "I")
    private final int field3500;

    @OriginalMember(owner = "client!wc", name = "t", descriptor = "Lha;")
    public static class46 field3497 = class271.method1828("cross", -46);

    @OriginalMember(owner = "client!wc", name = "x", descriptor = "Lha;")
    private static class46 field3501 = class271.method1828("Choose Option", -46);

    @OriginalMember(owner = "client!wc", name = "C", descriptor = "Lha;")
    public static class46 field3506 = field3501;

    @OriginalMember(owner = "client!wc", name = "B", descriptor = "I")
    public static int field3505 = 0;

    @OriginalMember(owner = "client!wc", name = "v", descriptor = "Lha;")
    public static class46 field3499 = class271.method1828("; Expires=", -46);

    @OriginalMember(owner = "client!wc", name = "F", descriptor = "[I")
    public static int[] field3509 = new int[] { 2, 2, 4, 2, 1, 8, 4, 1, 4, 4, 2 };

    @OriginalMember(owner = "client!wc", name = "y", descriptor = "[I")
    public static int[] field3502 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!wc", name = "z", descriptor = "D")
    public static double field3503 = -1.0D;

    @OriginalMember(owner = "client!wc", name = "G", descriptor = "Lha;")
    public static class46 field3510 = class271.method1828("Cache:", -46);

    @OriginalMember(owner = "client!wc", name = "r", descriptor = "I")
    public static int field3495;

    @OriginalMember(owner = "client!wc", name = "s", descriptor = "I")
    public static int field3496;

    @OriginalMember(owner = "client!wc", name = "A", descriptor = "I")
    public static int field3504;

    @OriginalMember(owner = "client!wc", name = "D", descriptor = "I")
    public static int field3507;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)Z")
    public static final boolean method1402(int arg0, int arg1) {
        int var2 = 80 / ((21 - arg1) / 37);
        ++field3496;
        if (~arg0 <= -98 && arg0 <= 122) {
            return true;
        } else if (arg0 >= 65 && ~arg0 >= -91) {
            return true;
        } else {
            return ~arg0 <= -49 && arg0 <= 57;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(III)V")
    public final void method410(int arg0, int arg1, int arg2) {
        int var4 = this.field3498 * arg0 >> 12;
        ++field3495;
        int var5 = this.field3511 * arg0 >> 12;
        int var6 = -83 / ((53 - arg2) / 54);
        int var7 = this.field3500 * arg1 >> 12;
        int var8 = this.field3508 * arg1 >> 12;
        class260.method1741(super.field1009, var7, var8, 31489, var4, var5);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(BII)V")
    public final void method412(byte arg0, int arg1, int arg2) {
        int var4 = -38 % ((arg0 - 45) / 42);
        ++field3504;
    }

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "(I)V")
    public static void method1403(int arg0) {
        if (arg0 == 1) {
            field3506 = null;
            field3497 = null;
            field3502 = null;
            field3510 = null;
            field3501 = null;
            field3499 = null;
            field3509 = null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(IIIIII)V")
    public class196(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field3511 = arg2;
        this.field3508 = arg3;
        this.field3498 = arg0;
        this.field3500 = arg1;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(ZII)V")
    public final void method405(boolean arg0, int arg1, int arg2) {
        ++field3507;
        if (!arg0) {
            this.method405(false, -14, 100);
        }
    }
}
