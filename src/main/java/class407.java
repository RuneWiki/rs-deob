import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class407 {

    @OriginalMember(owner = "client!vm", name = "d", descriptor = "I")
    public static int field6044 = 0;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "Lbd;")
    public static class37 field6041 = new class37();

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "I")
    public static int field6042;

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "I")
    public static int field6045;

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "Lpg;")
    public static class435 field6043;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(II)I", line = 7)
    public static final int method2550(int arg0, int arg1) {
        if (arg0 != -15194) {
            method2550(-32, 19);
        }
        field6042++;
        return arg1 >>> 10;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(I)V", line = 18)
    public static void method2551(int arg0) {
        if (arg0 == 240446186) {
            field6041 = null;
            field6043 = null;
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IIIII)V", line = 39)
    public static final void method2552(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field6045++;
        class211 var5 = class281.method1921(4, arg3, (byte) -92);
        var5.method1490((byte) 117);
        var5.field3379 = arg0;
        var5.field3383 = arg2;
        if (arg1 <= 22) {
            method2552(102, -45, -105, -45, 50);
        }
        var5.field3376 = arg4;
    }
}
