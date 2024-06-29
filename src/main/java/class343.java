import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class343 {

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "F")
    public static float field4737 = 1.0F;

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "[I")
    public static int[] field4739 = new int[50];

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "I")
    public static int field4738;

    @OriginalMember(owner = "client!ns", name = "d", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)V")
    public static final void method2098(int arg0) {
        field4740++;
        class359.field4877 = new class19();
        if (arg0 >= -16) {
            method2099(-88, (byte) 90);
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IB)Z")
    public static final boolean method2099(int arg0, byte arg1) {
        field4738++;
        if (arg1 != 27) {
            field4739 = null;
        }
        return arg0 == 3 || arg0 == 7 || arg0 == 10;
    }

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "(I)V")
    public static void method2100(int arg0) {
        if (arg0 != 7) {
            field4739 = null;
        }
        field4739 = null;
    }
}
