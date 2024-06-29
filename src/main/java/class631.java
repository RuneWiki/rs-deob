import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class631 extends class83 {

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "I")
    public int field8618 = -1;

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "[I")
    public static int[] field8615 = new int[14];

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "[I")
    public static int[] field8614 = new int[8];

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "I")
    public static int field8616;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "I")
    public static int field8617;

    @OriginalMember(owner = "client!cf", name = "t", descriptor = "I")
    public static int field8621;

    @OriginalMember(owner = "client!cf", name = "u", descriptor = "I")
    public int field8622;

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "Ljava/lang/String;")
    public String field8619;

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "Ljava/lang/String;")
    public String field8620;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(ILha;II)V", line = 7)
    public static final void method3565(int arg0, class66 arg1, int arg2, int arg3) {
        class448.field6026 = new class140[arg3][arg2];
        ++field8621;
        class390.field5065 = arg1;
        if (class434.field5725 != null) {
            class655.field9031 = class537.method3190(class434.field5725[0], class434.field5725[3], class434.field5725[5], -57, class434.field5725[2], class434.field5725[1], class434.field5725[4]);
        }
        class622.field8543 = new class140();
        class89.method814((byte) -75);
        if (arg0 != 4) {
            field8615 = null;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIIIIIBI)Z", line = 29)
    public static final boolean method3566(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8) {
        ++field8616;
        if (arg7 > 0) {
            method3566(-21, -102, 47, -27, 23, 13, -5, (byte) 33, 123);
        }
        if (~(arg3 + arg5) < ~arg8 && arg1 + arg8 > arg3) {
            return ~arg0 > ~(arg2 + arg6) && arg0 + arg4 > arg6;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "(I)Lrc;", line = 47)
    public final class565 method3567(int arg0) {
        if (arg0 != 3) {
            method3566(88, 117, 67, -40, -74, -123, 23, (byte) -68, -19);
        }
        ++field8617;
        return class208.field2472[super.field1123];
    }

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "(B)V", line = 58)
    public static void method3568(byte arg0) {
        field8615 = null;
        if (arg0 == 44) {
            field8614 = null;
        }
    }
}
