import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class704 {

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "Ljava/lang/String;")
    public static String field9864 = "";

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "[Lbs;")
    public static class717[] field9862 = new class717[14];

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "Lmga;")
    public static class739 field9866 = new class739(44, 3);

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field9863;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field9865;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public static int field9867;

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "I")
    public static int field9868;

    @OriginalMember(owner = "client!fb", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field9865++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method3942(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field9867++;
        if (class768.method4253(arg3 - 3, arg5)) {
            int var10 = 0;
            int var11 = 0;
            int var12 = 0;
            int var13 = arg3;
            int var14 = 0;
            if (class130.field1934) {
                var14 = class561.field7540;
                var12 = class628.field8784;
                var11 = class658.field9113;
                var10 = class87.field1219;
                var13 = class373.field5400;
                class561.field7540 = 1;
            }
            if (class376.field5492[arg5] == null) {
                class367.method2292(arg0, arg4 < 0, arg7, arg1, arg3 ^ 0x7800, arg2, -1, arg8, arg6, arg4, class111.field1528[arg5]);
            } else {
                class367.method2292(arg0, arg4 < 0, arg7, arg1, arg3 + 30720, arg2, -1, arg8, arg6, arg4, class376.field5492[arg5]);
            }
            if (class130.field1934) {
                if (arg4 >= 0 && class561.field7540 == 2) {
                    class716.method4001(class628.field8784, (byte) -102, class373.field5400, class658.field9113, class87.field1219);
                }
                class373.field5400 = var13;
                class658.field9113 = var11;
                class628.field8784 = var12;
                class561.field7540 = var14;
                class87.field1219 = var10;
            }
        } else if (arg4 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class627.field8773[var9] = true;
            }
        } else {
            class627.field8773[arg4] = true;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)V")
    public static void method3943(boolean arg0) {
        if (!arg0) {
            field9866 = null;
        }
        field9864 = null;
        field9862 = null;
        field9866 = null;
    }
}
