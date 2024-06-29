import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class231 extends class18 {

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "I")
    public int field3284;

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "I")
    public int field3286;

    @OriginalMember(owner = "client!pi", name = "i", descriptor = "I")
    public static int field3287;

    @OriginalMember(owner = "client!pi", name = "k", descriptor = "I")
    public static int field3289;

    @OriginalMember(owner = "client!pi", name = "l", descriptor = "I")
    public int field3290;

    @OriginalMember(owner = "client!pi", name = "m", descriptor = "I")
    public int field3291;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "Len;")
    public static class276 field3285;

    @OriginalMember(owner = "client!pi", name = "j", descriptor = "Lap;")
    public class337 field3288;

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIIIIII)Z", line = 6)
    public static final boolean method1574(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field3287++;
        if ((arg6 + arg3) <= arg8 || arg6 >= (arg8 + arg7)) {
            return false;
        } else if (arg5 == 2) {
            return arg0 < (arg1 + arg4) && arg4 < arg0 + arg2;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(I)V", line = 29)
    public static void method1575(int arg0) {
        field3285 = null;
        if (arg0 != 4199) {
            method1574(-120, -53, -76, -66, 126, 108, 55, -9, 56);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IZIIIII)V", line = 40)
    public static final void method1576(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class4.field60 = arg3;
        field3289++;
        if (arg2 > -100) {
            method1576(113, false, -92, 105, 29, -113, 71);
        }
        class54.field721 = arg6;
        class363.field5623 = arg0;
        class522.field7720 = arg4;
        class30.field462 = arg5;
        if (arg1 && class522.field7720 >= 100) {
            class301.field4447 = class54.field721 * 128 + 64;
            class34.field539 = class363.field5623 * 128 + 64;
            class154.field2246 = class500.method2985(class34.field539, 5293, class195.field2770, class301.field4447) - class30.field462;
        }
        class432.field6409 = 2;
    }
}
