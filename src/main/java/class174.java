import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class174 {

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public static int field3578 = 0;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "Lch;")
    public static class29 field3575 = new class29(260);

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "I")
    public static int field3581 = 0;

    @OriginalMember(owner = "client!tc", name = "k", descriptor = "Lff;")
    public static class54 field3584 = null;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "Lgg;")
    private static class63 field3579 = class116.method911(43, "flash3:");

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "Lgg;")
    public static class63 field3582 = field3579;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "Lgg;")
    public static class63 field3580 = field3579;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public static int field3574;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public static int field3576;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public static int field3577;

    @OriginalMember(owner = "client!tc", name = "j", descriptor = "[S")
    public static short[] field3583;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(I)V")
    public static void method1160(int arg0) {
        field3582 = null;
        field3583 = null;
        field3584 = null;
        field3579 = null;
        if (arg0 == 0) {
            field3575 = null;
            field3580 = null;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1161(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field3576++;
        class123 var10 = null;
        for (class123 var11 = (class123) class29.field671.method1033(0); var11 != null; var11 = (class123) class29.field671.method1035(0)) {
            if (var11.field2726 == arg5 && var11.field2709 == arg3 && var11.field2728 == arg6 && var11.field2725 == arg2) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class123();
            var10.field2726 = arg5;
            var10.field2709 = arg3;
            var10.field2725 = arg2;
            var10.field2728 = arg6;
            class187.method1229((byte) -7, var10);
            class29.field671.method1034(0, var10);
        }
        var10.field2727 = arg9;
        if (arg0 >= -102) {
            method1161(93, 32, -17, -48, -69, 49, 91, -127, 76, -93);
        }
        var10.field2716 = arg4;
        var10.field2714 = arg1;
        var10.field2706 = arg8;
        var10.field2712 = arg7;
    }
}
