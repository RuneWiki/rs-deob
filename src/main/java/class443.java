import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hea")
public class class443 {

    @OriginalMember(owner = "client!hea", name = "b", descriptor = "Lvr;")
    public class146 field6311 = new class146();

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "[Luha;")
    public static class253[] field6310 = new class253[8];

    @OriginalMember(owner = "client!hea", name = "c", descriptor = "I")
    public static int field6312;

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(I)V")
    public static void method2671(int arg0) {
        field6310 = null;
        if (arg0 != 256) {
            field6310 = null;
        }
    }

    @OriginalMember(owner = "client!hea", name = "a", descriptor = "(IIIBIZI)V")
    public static final void method2672(int arg0, int arg1, int arg2, byte arg3, int arg4, boolean arg5, int arg6) {
        class222.field3179 = arg1;
        class12.field251 = arg2;
        if (arg3 > -126) {
            method2671(-92);
        }
        class219.field3129 = arg6;
        class2.field21 = arg4;
        field6312++;
        class717.field10088 = arg0;
        if (arg5 && class222.field3179 >= 100) {
            class277.field3866 = class2.field21 * 512 + 256;
            class359.field5216 = class717.field10088 * 512 + 256;
            class655.field9241 = class580.method3366(class410.field5771, (byte) -95, class359.field5216, class277.field3866) - class12.field251;
        }
        class180.field2732 = -1;
        class406.field5746 = -1;
        class763.field10510 = 2;
    }
}
