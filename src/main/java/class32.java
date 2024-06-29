import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class32 {

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "[I")
    public static int[] field523 = new int[50];

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "Z")
    public static boolean field528 = false;

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "I")
    public static int field527 = 0;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "I")
    public static int field525;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "Lkb;")
    public static class80 field526;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(II)Lu;", line = 4)
    public static final class187 method348(int arg0, int arg1) {
        if (arg0 == 0) {
            field524++;
            return class132.field1875 && class192.field2766 <= arg1 && class227.field3155 >= arg1 ? class378.field5322[arg1 - class192.field2766] : null;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)I", line = 25)
    public static final int method349(byte arg0) {
        int var1 = 94 / ((-arg0 - 54) / 52);
        field525++;
        return class30.field501;
    }

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "(B)V", line = 44)
    public static void method350(byte arg0) {
        if (arg0 > -46) {
            field527 = 0;
        }
        field526 = null;
        field523 = null;
    }
}
