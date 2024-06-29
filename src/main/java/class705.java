import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ms")
public class class705 extends class297 {

    @OriginalMember(owner = "client!ms", name = "p", descriptor = "Llh;")
    public static class487 field9963 = new class487(38, -1);

    @OriginalMember(owner = "client!ms", name = "q", descriptor = "F")
    public static float field9964 = 0.0F;

    @OriginalMember(owner = "client!ms", name = "r", descriptor = "I")
    public static int field9965 = 0;

    @OriginalMember(owner = "client!ms", name = "t", descriptor = "Llh;")
    public static class487 field9967 = new class487(83, 3);

    @OriginalMember(owner = "client!ms", name = "u", descriptor = "I")
    public static int field9968 = 0;

    @OriginalMember(owner = "client!ms", name = "o", descriptor = "I")
    public static int field9962;

    @OriginalMember(owner = "client!ms", name = "s", descriptor = "I")
    public static int field9966;

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;II)V")
    public static final void method3945(boolean arg0, String arg1, String arg2, int arg3, int arg4) {
        class523.method2985(arg0, arg3, arg2, arg1, false, true, arg4);
        field9962++;
    }

    @OriginalMember(owner = "client!ms", name = "b", descriptor = "(I)V")
    public static void method3946(int arg0) {
        if (arg0 > -101) {
            method3947((byte) 34, null);
        }
        field9967 = null;
        field9963 = null;
    }

    @OriginalMember(owner = "client!ms", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method3947(byte arg0, String arg1) {
        field9966++;
        return arg0 == -47 ? arg1.length() + 1 : 79;
    }
}
