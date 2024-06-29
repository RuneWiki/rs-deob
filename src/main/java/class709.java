import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ar")
public class class709 extends class68 {

    @OriginalMember(owner = "client!ar", name = "E", descriptor = "I")
    public int field9697;

    @OriginalMember(owner = "client!ar", name = "B", descriptor = "Leo;")
    public static class313 field9694 = new class313(3, 2);

    @OriginalMember(owner = "client!ar", name = "F", descriptor = "Lmw;")
    public static class517 field9698 = new class517(57, 3);

    @OriginalMember(owner = "client!ar", name = "J", descriptor = "Ljb;")
    public static class519 field9702 = new class519(30, -1);

    @OriginalMember(owner = "client!ar", name = "C", descriptor = "I")
    public static int field9695;

    @OriginalMember(owner = "client!ar", name = "D", descriptor = "I")
    public static int field9696;

    @OriginalMember(owner = "client!ar", name = "G", descriptor = "I")
    public static int field9699;

    @OriginalMember(owner = "client!ar", name = "H", descriptor = "I")
    public static int field9700;

    @OriginalMember(owner = "client!ar", name = "I", descriptor = "I")
    public static int field9701;

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(B)Leo;")
    public final class313 method576(byte arg0) {
        if (arg0 != 41) {
            method3937((byte) -38);
        }
        field9695++;
        return class435.field6287;
    }

    @OriginalMember(owner = "client!ar", name = "a", descriptor = "(IZIZZ)V")
    public static final void method3936(int arg0, boolean arg1, int arg2, boolean arg3, boolean arg4) {
        class405.method2447(arg2, arg1, class310.field4388.length - 1, arg0, arg4, 3317, 0);
        field9699++;
        class200.field2600 = null;
        if (arg3) {
            method3937((byte) 102);
        }
        class193.field2511 = 0;
    }

    @OriginalMember(owner = "client!ar", name = "d", descriptor = "(B)V")
    public static void method3937(byte arg0) {
        field9694 = null;
        field9702 = null;
        if (arg0 == 30) {
            field9698 = null;
        }
    }

    @OriginalMember(owner = "client!ar", name = "<init>", descriptor = "(Log;Lgi;IIIIIIIIIIIIII)V")
    public class709(class673 arg0, class705 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);
        this.field9697 = arg15;
    }
}
