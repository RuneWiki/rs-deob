import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class38 {

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "I")
    public static int field506 = 0;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "I")
    public static int field504;

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "I")
    public static int field505;

    @OriginalMember(owner = "client!vo", name = "e", descriptor = "I")
    public static int field507;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Ljava/lang/String;IB)V", line = 6)
    public static final void method175(String arg0, int arg1, byte arg2) {
        field507++;
        class99.field1350++;
        class1.method5(1, class108.field1478);
        class288.field4014.method746((byte) -114, class499.method2790(arg0, 110) + 1);
        if (arg2 > 38) {
            class288.field4014.method708(111, arg0);
            class288.field4014.method746((byte) -98, arg1);
        }
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(BI)Z", line = 24)
    public static final boolean method176(byte arg0, int arg1) {
        field503++;
        if (arg0 != 82) {
            return false;
        }
        for (class345 var2 = (class345) class487.field6761.method1270((byte) -25); var2 != null; var2 = (class345) class487.field6761.method1282(0)) {
            if (class287.method1729(var2.field4983, (byte) 17) && (long) arg1 == var2.field4979) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IIIIII)V", line = 56)
    public static final void method177(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg3; var6 <= arg2; var6++) {
            class548.method3012(arg0, (byte) 23, arg5, arg1, class476.field6655[var6]);
        }
        if (arg4 != 0) {
            field506 = 115;
        }
        field505++;
    }
}
