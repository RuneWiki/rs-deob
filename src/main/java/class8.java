import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class8 {

    @OriginalMember(owner = "client!j", name = "c", descriptor = "I")
    public static int field160 = -1;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "[I")
    public static int[] field164 = new int[1000];

    @OriginalMember(owner = "client!j", name = "h", descriptor = "Lub;")
    private static class227 field165 = class257.method1749("slide:", 17263);

    @OriginalMember(owner = "client!j", name = "b", descriptor = "Lub;")
    public static class227 field159 = field165;

    @OriginalMember(owner = "client!j", name = "d", descriptor = "Lub;")
    public static class227 field161 = field165;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "I")
    public static int field158;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "I")
    public static int field162;

    @OriginalMember(owner = "client!j", name = "f", descriptor = "I")
    public static int field163;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(I)V")
    public static void method32(int arg0) {
        field161 = null;
        if (arg0 == 0) {
            field164 = null;
            field159 = null;
            field165 = null;
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BI)Z")
    public static final boolean method33(byte arg0, int arg1) {
        int var2 = -116 % ((37 - arg0) / 45);
        field158++;
        return arg1 >= 48 && arg1 <= 57;
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BII)I")
    public static final int method34(byte arg0, int arg1, int arg2) {
        field162++;
        class151 var3 = (class151) class42.field688.method1298(-121, (long) arg2);
        if (var3 == null) {
            return 0;
        } else {
            if (arg0 != -42) {
                method34((byte) -10, -49, 103);
            }
            return arg1 >= 0 && var3.field2626.length > arg1 ? var3.field2626[arg1] : 0;
        }
    }
}
