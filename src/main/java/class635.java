import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lj")
public class class635 {

    @OriginalMember(owner = "client!lj", name = "b", descriptor = "Lfja;")
    public static class783 field8782 = new class783(40, 4);

    @OriginalMember(owner = "client!lj", name = "c", descriptor = "I")
    public static int field8783 = 0;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "I")
    public static int field8781;

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(IIBII)V", line = 7)
    public static final void method3551(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        if (arg2 < 53) {
            field8783 = 51;
        }
        field8781++;
        if (arg1 >= class223.field3260 && arg1 <= class706.field9700) {
            int var5 = class748.method4155(class268.field3766, 16, arg0, class236.field3392);
            int var6 = class748.method4155(class268.field3766, 16, arg4, class236.field3392);
            class480.method2747(arg3, var5, arg1, var6, (byte) 112);
        }
    }

    @OriginalMember(owner = "client!lj", name = "a", descriptor = "(I)V", line = 25)
    public static void method3552(int arg0) {
        int var1 = 77 / ((-arg0 - 46) / 37);
        field8782 = null;
    }
}
