import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public class class285 {

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "I")
    public static int field3943;

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "I")
    public static int field3944;

    @OriginalMember(owner = "client!iw", name = "c", descriptor = "I")
    public static int field3945;

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1713(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class223.method1431(arg3, arg6, arg7, arg1, false, arg5, 0, arg0, arg8, arg4);
        int var9 = -83 % ((arg2 - 18) / 36);
        field3944++;
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(I)V")
    public static final void method1714(int arg0) {
        if (arg0 == -3918) {
            field3945++;
            class292.field4399.method322(class569.field7651, class664.field9363, class624.field8697);
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(Z)Z")
    public static final boolean method1715(boolean arg0) {
        field3943++;
        return arg0 ? false : class410.field5804;
    }
}
