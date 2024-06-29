import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class101 {

    @OriginalMember(owner = "client!di", name = "e", descriptor = "Luf;")
    public static class168 field1574 = class148.method1019(-1720, "::qa_op_test");

    @OriginalMember(owner = "client!di", name = "f", descriptor = "Luf;")
    private static class168 field1575 = class148.method1019(-1720, " has logged out)3");

    @OriginalMember(owner = "client!di", name = "h", descriptor = "Luf;")
    public static class168 field1577 = field1575;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "I")
    public static int field1570;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "I")
    public static int field1571;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "I")
    public static int field1572;

    @OriginalMember(owner = "client!di", name = "i", descriptor = "I")
    public static int field1578;

    @OriginalMember(owner = "client!di", name = "j", descriptor = "I")
    public static int field1579;

    @OriginalMember(owner = "client!di", name = "g", descriptor = "Lqi;")
    public static class221 field1576;

    @OriginalMember(owner = "client!di", name = "d", descriptor = "[[S")
    public static short[][] field1573;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(ILkg;)I", line = 36)
    public static final int method763(int arg0, class22 arg1) {
        field1578++;
        if (arg0 != 23718) {
            method763(-110, (class22) null);
        }
        class196 var2 = arg1.field267;
        if (var2.field3188 != null) {
            var2 = var2.method1387((byte) -1);
            if (var2 == null) {
                return -1;
            }
        }
        int var3 = var2.field3239;
        if (arg1.field3045 == arg1.field3002) {
            var3 = var2.field3241;
        } else if (arg1.field3045 == arg1.field3004) {
            var3 = var2.field3217;
        }
        return var3;
    }

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B)V", line = 69)
    public static void method764(byte arg0) {
        if (arg0 >= -45) {
            method763(4, (class22) null);
        }
        field1576 = null;
        field1575 = null;
        field1577 = null;
        field1574 = null;
        field1573 = (short[][]) null;
    }
}
