import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!st")
public class class104 extends class344 {

    @OriginalMember(owner = "client!st", name = "D", descriptor = "Ljp;")
    public static class55 field1604 = new class55(45, 10);

    @OriginalMember(owner = "client!st", name = "E", descriptor = "I")
    public static int field1605 = -1;

    @OriginalMember(owner = "client!st", name = "F", descriptor = "[B")
    public static byte[] field1606 = new byte[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!st", name = "G", descriptor = "Ljh;")
    public static class462 field1607 = new class462();

    @OriginalMember(owner = "client!st", name = "H", descriptor = "I")
    public static int field1608 = -1;

    @OriginalMember(owner = "client!st", name = "B", descriptor = "I")
    public static int field1602;

    @OriginalMember(owner = "client!st", name = "C", descriptor = "I")
    public static int field1603;

    @OriginalMember(owner = "client!st", name = "<init>", descriptor = "(IIIIIF)V", line = 5)
    public class104(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!st", name = "d", descriptor = "(B)V", line = 8)
    public static void method834(byte arg0) {
        if (arg0 == 1) {
            field1604 = null;
            field1606 = null;
            field1607 = null;
        }
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(IIII)V", line = 23)
    public final void method835(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 < 103) {
            field1605 = -70;
        }
        super.field5134 = arg3;
        super.field5136 = arg1;
        ++field1603;
        super.field5128 = arg0;
    }

    @OriginalMember(owner = "client!st", name = "a", descriptor = "(BF)V", line = 43)
    public final void method836(byte arg0, float arg1) {
        if (arg0 < 70) {
            field1604 = null;
        }
        ++field1602;
        super.field5123 = arg1;
    }
}
