import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sv")
public class class657 extends class585 {

    @OriginalMember(owner = "client!sv", name = "r", descriptor = "I")
    public int field9396;

    @OriginalMember(owner = "client!sv", name = "o", descriptor = "Lof;")
    public static class620 field9393 = new class620(50);

    @OriginalMember(owner = "client!sv", name = "p", descriptor = "I")
    public static int field9394;

    @OriginalMember(owner = "client!sv", name = "q", descriptor = "I")
    public static int field9395;

    @OriginalMember(owner = "client!sv", name = "s", descriptor = "I")
    public static int field9397;

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(BI)Z", line = 6)
    public static final boolean method3746(byte arg0, int arg1) {
        field9395++;
        if (arg1 == 44 || arg1 == 51 || arg1 == 25 || arg1 == 48 || arg1 == 2) {
            return true;
        } else if (arg1 == 45 || arg1 == 1010) {
            return true;
        } else {
            if (arg0 != 80) {
                method3746((byte) 71, 93);
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!sv", name = "<init>", descriptor = "(ILkda;Lcu;III)V", line = 23)
    public class657(int arg0, class388 arg1, class219 arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field9396 = arg5;
    }

    @OriginalMember(owner = "client!sv", name = "a", descriptor = "(I)Lhs;", line = 32)
    public final class325 method777(int arg0) {
        if (arg0 >= -8) {
            field9393 = null;
        }
        field9394++;
        return class675.field9561;
    }

    @OriginalMember(owner = "client!sv", name = "c", descriptor = "(I)V", line = 43)
    public static void method3747(int arg0) {
        if (arg0 == 25) {
            field9393 = null;
        }
    }
}
