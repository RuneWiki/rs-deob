import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class233 {

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "Lcia;")
    public static class612 field3141 = new class612(0, 0);

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "Lbda;")
    public static class505 field3143 = new class505(1);

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "[I")
    public static int[] field3145 = new int[6];

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public static int field3140;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V", line = 6)
    public static void method1500(byte arg0) {
        field3143 = null;
        if (arg0 == -64) {
            field3141 = null;
            field3145 = null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(IZII)V", line = 19)
    public static final void method1501(int arg0, boolean arg1, int arg2, int arg3) {
        if (class400.field5666.method1180((byte) 26, (long) arg0) == null) {
            if (class358.field5099) {
                class101 var4 = new class101(arg0, new class554(4096, class94.field1106, arg0), arg2, arg1);
                var4.field1210.method1939(10, class473.field6707[class549.field7669]);
                class400.field5666.method1179((long) arg0, var4, (byte) -26);
            } else {
                class436.method2642(true, arg0, arg1);
            }
        }
        field3142++;
        if (arg3 != 4096) {
            field3141 = null;
        }
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(II)Loaa;", line = 46)
    public static final class287 method1502(int arg0, int arg1) {
        field3140++;
        if (class374.field5243 && class700.field9766 <= arg1 && arg1 <= class503.field7223) {
            int var2 = 69 % ((-arg0 - 17) / 57);
            return class48.field568[arg1 - class700.field9766];
        } else {
            return null;
        }
    }
}
