import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class457 implements class540 {

    @OriginalMember(owner = "client!gr", name = "e", descriptor = "I")
    public int field6405;

    @OriginalMember(owner = "client!gr", name = "f", descriptor = "[[I")
    public static int[][] field6406 = new int[6][];

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "I")
    public static int field6401;

    @OriginalMember(owner = "client!gr", name = "b", descriptor = "I")
    public static int field6402;

    @OriginalMember(owner = "client!gr", name = "c", descriptor = "I")
    public static int field6403;

    @OriginalMember(owner = "client!gr", name = "d", descriptor = "I")
    public static int field6404;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(IB)Z", line = 4)
    public static final boolean method2724(int arg0, byte arg1) {
        field6402++;
        if (arg1 != 89) {
            field6403 = -82;
        }
        if (arg0 == 19 || arg0 == 2 || arg0 == 59 || arg0 == 57 || arg0 == 1011) {
            return true;
        } else {
            return arg0 == 9 || arg0 == 1010;
        }
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(I)Lsaa;", line = 22)
    public final class345 method1656(int arg0) {
        field6404++;
        return arg0 == 0 ? class422.field5777 : null;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;II)V", line = 37)
    public static final void method2725(int arg0, String arg1, int arg2, String arg3, String arg4, String arg5, String arg6, int arg7, int arg8) {
        field6401++;
        class418 var9 = class147.field2133[99];
        int var10 = -96 / ((32 - arg7) / 38);
        for (int var11 = 99; var11 > 0; var11--) {
            class147.field2133[var11] = class147.field2133[var11 - 1];
        }
        if (var9 == null) {
            var9 = new class418(arg2, arg0, arg6, arg3, arg5, arg4, arg8, arg1);
        } else {
            var9.method2540(arg6, arg0, -12273, arg2, arg3, arg1, arg8, arg4, arg5);
        }
        class234.field3528++;
        class147.field2133[0] = var9;
        class300.field4335 = class366.field5096;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(B)V", line = 63)
    public static void method2726(byte arg0) {
        if (arg0 <= -47) {
            field6406 = null;
        }
    }

    @OriginalMember(owner = "client!gr", name = "<init>", descriptor = "(I)V", line = 79)
    public class457(int arg0) {
        this.field6405 = arg0;
    }
}
