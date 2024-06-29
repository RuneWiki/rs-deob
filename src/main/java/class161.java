import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class161 {

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
    public static int field2065 = 0;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    public static int field2066 = 0;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
    public static int field2069 = -1;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "Lam;")
    public static class286 field2070;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(BI)V")
    public static final void method868(byte arg0, int arg1) {
        field2067++;
        if (arg0 >= 21) {
            class40 var2 = class162.method872(arg1, (byte) 92, 12);
            var2.method193(-101);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
    public static void method869(int arg0) {
        if (arg0 == 1953) {
            field2070 = null;
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Lam;I)V")
    public static final void method870(class286 arg0, int arg1) {
        field2068++;
        if (arg1 <= 79) {
            field2066 = -90;
        }
        class319.field4269 = arg0;
    }
}
