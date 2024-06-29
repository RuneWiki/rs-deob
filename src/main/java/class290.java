import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gj")
public class class290 {

    @OriginalMember(owner = "client!gj", name = "d", descriptor = "I")
    public static int field4969 = 0;

    @OriginalMember(owner = "client!gj", name = "f", descriptor = "I")
    public static int field4971 = 1;

    @OriginalMember(owner = "client!gj", name = "b", descriptor = "S")
    public static short field4967 = 256;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "I")
    public static int field4966;

    @OriginalMember(owner = "client!gj", name = "c", descriptor = "I")
    public static int field4968;

    @OriginalMember(owner = "client!gj", name = "e", descriptor = "Lel;")
    public static class3 field4970;

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(I)V", line = 13)
    public static void method2011(int arg0) {
        field4970 = null;
        if (arg0 != 25940) {
            field4971 = 18;
        }
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(Ltl;Z)Z", line = 28)
    public static final boolean method2012(class59 arg0, boolean arg1) {
        field4968++;
        if (arg0 == null) {
            return false;
        }
        if (!arg1) {
            field4967 = 118;
        }
        for (int var2 = 0; var2 < class156.field2548; var2++) {
            if (arg0.method472(class232.field3814[var2], 90)) {
                return true;
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!gj", name = "a", descriptor = "(IZ)I", line = 54)
    public static final int method2013(int arg0, boolean arg1) {
        field4966++;
        return arg1 ? 111 : arg0 >>> 8;
    }
}
