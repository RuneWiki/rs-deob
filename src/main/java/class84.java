import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bp")
public class class84 {

    @OriginalMember(owner = "client!bp", name = "b", descriptor = "Lqe;")
    public static class605 field983 = new class605(0, -1);

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "I")
    public static int field982;

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(III)Z", line = 3)
    public static final boolean method489(int arg0, int arg1, int arg2) {
        field982++;
        if (arg2 != -1) {
            field983 = null;
        }
        return (arg1 & 0x60000) != 0 | class3.method10(false, arg1, arg0) || class133.method812(arg1, arg2 + 6, arg0) || class148.method875(arg1, -1, arg0);
    }

    @OriginalMember(owner = "client!bp", name = "a", descriptor = "(I)V", line = 14)
    public static void method490(int arg0) {
        field983 = null;
        if (arg0 != 393216) {
            field983 = null;
        }
    }
}
