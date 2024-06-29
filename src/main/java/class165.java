import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wda")
public class class165 extends class70 {

    @OriginalMember(owner = "client!wda", name = "s", descriptor = "I")
    public int field2533;

    @OriginalMember(owner = "client!wda", name = "w", descriptor = "I")
    public int field2537;

    @OriginalMember(owner = "client!wda", name = "t", descriptor = "Ltm;")
    public static class334 field2534 = new class334(49, 3);

    @OriginalMember(owner = "client!wda", name = "x", descriptor = "I")
    public static int field2538 = 0;

    @OriginalMember(owner = "client!wda", name = "u", descriptor = "I")
    public static int field2535;

    @OriginalMember(owner = "client!wda", name = "v", descriptor = "I")
    public static int field2536;

    @OriginalMember(owner = "client!wda", name = "<init>", descriptor = "(Lnha;Ljn;IIIIIIIIII)V")
    public class165(class686 arg0, class322 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field2533 = arg11;
        this.field2537 = arg10;
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(I)Lvj;")
    public final class26 method117(int arg0) {
        field2536++;
        return arg0 == 1 ? class197.field3392 : null;
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(IIIIIBIII)V")
    public static final void method1233(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6, int arg7, int arg8) {
        if (arg5 == -117) {
            class217.method1556(arg8, arg4, arg0, arg1, arg6, arg3, arg7, 0, -21553, arg2);
            field2535++;
        }
    }

    @OriginalMember(owner = "client!wda", name = "a", descriptor = "(B)V")
    public static void method1234(byte arg0) {
        if (arg0 < 126) {
            field2538 = -115;
        }
        field2534 = null;
    }
}
