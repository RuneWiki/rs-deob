import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bk")
public class class121 {

    @OriginalMember(owner = "client!bk", name = "e", descriptor = "Z")
    public static boolean field1566 = true;

    @OriginalMember(owner = "client!bk", name = "d", descriptor = "Lqp;")
    public static class586 field1565 = new class586(33, -2);

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!bk", name = "b", descriptor = "I")
    public static int field1563;

    @OriginalMember(owner = "client!bk", name = "g", descriptor = "I")
    public static int field1568;

    @OriginalMember(owner = "client!bk", name = "c", descriptor = "Lbk;")
    public class121 field1564;

    @OriginalMember(owner = "client!bk", name = "f", descriptor = "Lbk;")
    public class121 field1567;

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(ILno;)V", line = 3)
    public static final void method735(int arg0, class483 arg1) {
        for (int var2 = 0; var2 < class202.field3016; var2++) {
            int var3 = class215.field3180[var2];
            class179 var4 = class383.field5604[var3];
            int var5 = arg1.method2561((byte) -52);
            if ((var5 & 0x10) != 0) {
                var5 += arg1.method2561((byte) -33) << 8;
            }
            if ((var5 & 0x100) != 0) {
                var5 += arg1.method2561((byte) 126) << 16;
            }
            class189.method1233(var3, var4, var5, (byte) -98, arg1);
        }
        if (arg0 != -1662988464) {
            field1566 = false;
        }
        field1563++;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(B)V", line = 38)
    public final void method736(byte arg0) {
        field1568++;
        if (this.field1564 == null) {
            return;
        }
        this.field1564.field1567 = this.field1567;
        if (arg0 >= -125) {
            method735(-38, null);
        }
        this.field1567.field1564 = this.field1564;
        this.field1564 = null;
        this.field1567 = null;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(BI)I", line = 59)
    public static final int method737(byte arg0, int arg1) {
        field1562++;
        if (arg0 < 9) {
            field1566 = false;
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!bk", name = "a", descriptor = "(I)V", line = 77)
    public static void method738(int arg0) {
        field1565 = null;
        if (arg0 != 1025) {
            field1565 = null;
        }
    }
}
