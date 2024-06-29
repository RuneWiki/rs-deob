import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class333 implements class486 {

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    public int field4713;

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "I")
    public int field4707;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public int field4709;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public int field4706;

    @OriginalMember(owner = "client!cd", name = "j", descriptor = "Lgi;")
    public class705 field4715;

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "I")
    public int field4712;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "I")
    public int field4710;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "Log;")
    public class673 field4711;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    public int field4708;

    @OriginalMember(owner = "client!cd", name = "k", descriptor = "Lkw;")
    public static class263 field4716 = new class263("game4", 3);

    @OriginalMember(owner = "client!cd", name = "m", descriptor = "[I")
    public static int[] field4718 = new int[5];

    @OriginalMember(owner = "client!cd", name = "n", descriptor = "I")
    public static int field4719 = 0;

    @OriginalMember(owner = "client!cd", name = "l", descriptor = "I")
    public static int field4717 = -1;

    @OriginalMember(owner = "client!cd", name = "i", descriptor = "I")
    public static int field4714;

    @OriginalMember(owner = "client!cd", name = "o", descriptor = "Luq;")
    public static class172 field4720;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)Leo;", line = 4)
    public class313 method576(byte arg0) {
        field4714++;
        if (arg0 != 41) {
            field4716 = null;
        }
        return null;
    }

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "(B)V", line = 22)
    public static void method2147(byte arg0) {
        field4718 = null;
        field4720 = null;
        if (arg0 <= 51) {
            field4716 = null;
        }
        field4716 = null;
    }

    @OriginalMember(owner = "client!cd", name = "<init>", descriptor = "(Log;Lgi;IIIIIII)V", line = 40)
    public class333(class673 arg0, class705 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        this.field4713 = arg2;
        this.field4707 = arg8;
        this.field4709 = arg3;
        this.field4706 = arg7;
        this.field4715 = arg1;
        this.field4712 = arg6;
        this.field4710 = arg5;
        this.field4711 = arg0;
        this.field4708 = arg4;
    }
}
