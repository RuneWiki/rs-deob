import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class215 extends class314 {

    @OriginalMember(owner = "client!h", name = "l", descriptor = "I")
    public static int field3781 = 0;

    @OriginalMember(owner = "client!h", name = "n", descriptor = "I")
    public static int field3783 = 0;

    @OriginalMember(owner = "client!h", name = "o", descriptor = "Lud;")
    public static class279 field3784 = class130.method1024("", 255);

    @OriginalMember(owner = "client!h", name = "k", descriptor = "I")
    public static int field3780;

    @OriginalMember(owner = "client!h", name = "m", descriptor = "I")
    public int field3782;

    @OriginalMember(owner = "client!h", name = "p", descriptor = "I")
    public int field3785;

    @OriginalMember(owner = "client!h", name = "r", descriptor = "I")
    public static int field3787;

    @OriginalMember(owner = "client!h", name = "s", descriptor = "I")
    public int field3788;

    @OriginalMember(owner = "client!h", name = "q", descriptor = "[[Lvk;")
    public static class168[][] field3786;

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(I)V", line = 21)
    public static void method1576(int arg0) {
        field3786 = (class168[][]) null;
        if (arg0 != 0) {
            method1577(23, -29);
        }
        field3784 = null;
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(II)V", line = 44)
    public static final void method1577(int arg0, int arg1) {
        class8.field155.method1339(arg0, arg1 + 19326);
        field3780++;
        if (arg1 != 0) {
            method1576(-105);
        }
        class169.field3058.method1339(arg0, 19326);
        class283.field5052.method1339(arg0, 19326);
    }
}
