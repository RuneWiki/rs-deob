import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dn")
public class class302 extends class452 {

    @OriginalMember(owner = "client!dn", name = "f", descriptor = "I")
    public static int field4167 = 0;

    @OriginalMember(owner = "client!dn", name = "i", descriptor = "J")
    public static long field4170 = 0L;

    @OriginalMember(owner = "client!dn", name = "g", descriptor = "I")
    public static int field4168;

    @OriginalMember(owner = "client!dn", name = "h", descriptor = "I")
    public static int field4169;

    @OriginalMember(owner = "client!dn", name = "j", descriptor = "Lnq;")
    public static class268 field4171;

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IB)Lpg;", line = 12)
    public static final class437 method1949(int arg0, byte arg1) {
        field4169++;
        int var2 = -56 / ((arg1 - 10) / 56);
        return class327.field4481 && class200.field2771 <= arg0 && class139.field1989 >= arg0 ? class452.field6308[arg0 - class200.field2771] : null;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(B)V", line = 31)
    public static void method1950(byte arg0) {
        if (arg0 > -89) {
            field4167 = -74;
        }
        field4171 = null;
    }

    @OriginalMember(owner = "client!dn", name = "a", descriptor = "(IIII)I", line = 44)
    public static final int method1951(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 0) {
            field4167 = 76;
        }
        field4168++;
        if (arg2 >= arg0) {
            return arg2 <= arg3 ? arg2 : arg3;
        } else {
            return arg0;
        }
    }
}
