import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!br")
public class class274 extends class5 {

    @OriginalMember(owner = "client!br", name = "j", descriptor = "I")
    public int field3808;

    @OriginalMember(owner = "client!br", name = "l", descriptor = "I")
    public int field3810;

    @OriginalMember(owner = "client!br", name = "n", descriptor = "Lof;")
    public static class446 field3812 = new class446("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!br", name = "k", descriptor = "I")
    public static int field3809;

    @OriginalMember(owner = "client!br", name = "m", descriptor = "Lqq;")
    public static class337 field3811;

    @OriginalMember(owner = "client!br", name = "a", descriptor = "(I)V", line = 3)
    public static void method1758(int arg0) {
        field3812 = null;
        if (arg0 <= -127) {
            field3811 = null;
        }
    }

    @OriginalMember(owner = "client!br", name = "<init>", descriptor = "(II)V", line = 17)
    public class274(int arg0, int arg1) {
        this.field3808 = arg1;
        this.field3810 = arg0;
    }
}
