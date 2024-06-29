import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class369 extends class45 {

    @OriginalMember(owner = "client!al", name = "o", descriptor = "Ljava/lang/String;")
    public String field5334;

    @OriginalMember(owner = "client!al", name = "n", descriptor = "Ljava/lang/String;")
    public static String field5333 = "M";

    @OriginalMember(owner = "client!al", name = "m", descriptor = "[I")
    public static int[] field5332 = new int[128];

    @OriginalMember(owner = "client!al", name = "k", descriptor = "I")
    public static int field5330;

    @OriginalMember(owner = "client!al", name = "l", descriptor = "I")
    public static int field5331;

    @OriginalMember(owner = "client!al", name = "p", descriptor = "I")
    public static int field5335;

    @OriginalMember(owner = "client!al", name = "r", descriptor = "I")
    public static int field5337;

    @OriginalMember(owner = "client!al", name = "q", descriptor = "Lhs;")
    public static class420 field5336;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "(I)V", line = 19)
    public static void method2395(int arg0) {
        if (arg0 != -1172) {
            method2395(84);
        }
        field5333 = null;
        field5332 = null;
        field5336 = null;
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(IIIIIIIII)Z", line = 32)
    public static final boolean method2396(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (arg5 != -10954) {
            field5336 = null;
        }
        field5330++;
        if (arg3 < (arg0 + arg2) && arg3 + arg4 > arg0) {
            return arg1 + arg7 > arg8 && arg1 < arg8 + arg6;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "()V", line = 48)
    public class369() {
    }

    @OriginalMember(owner = "client!al", name = "<init>", descriptor = "(Ljava/lang/String;I)V", line = 55)
    public class369(String arg0, int arg1) {
        this.field5334 = arg0;
    }
}
