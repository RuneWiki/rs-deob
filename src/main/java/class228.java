import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class228 {

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "Z")
    public static boolean field3209 = false;

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "Laa;")
    public static class76 field3211 = new class76(18, 8);

    @OriginalMember(owner = "client!ca", name = "f", descriptor = "Lsl;")
    public static class456 field3214 = new class456("", 15);

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
    public static int field3210;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    public static int field3212;

    @OriginalMember(owner = "client!ca", name = "e", descriptor = "I")
    public static int field3213;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(I)V")
    public static final void method1420(int arg0) {
        class182.field2702 = arg0;
        class81.field1164 = 0;
        field3212++;
        class504.field7423 = -1;
        class133.field1990 = -1;
    }

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "(I)V")
    public static void method1421(int arg0) {
        field3214 = null;
        if (arg0 != -1) {
            method1422(-1, -43, -8);
        }
        field3211 = null;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(III)V")
    public static final void method1422(int arg0, int arg1, int arg2) {
        field3210++;
        class506 var3 = class14.method185(arg1 - 1304589743, arg0, 7);
        var3.method2992(arg1 - 15);
        var3.field7442 = arg2;
        if (arg1 != 15) {
            method1420(-94);
        }
    }
}
