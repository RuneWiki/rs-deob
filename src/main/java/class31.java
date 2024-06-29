import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class31 {

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "Ljava/lang/String;")
    public static String field528 = "glow3:";

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "I")
    public static int field531 = 0;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field530 = 0;

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field529;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method235(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class55.field798[arg0][var8][var14] == -class271.field4367) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class166.field2746[arg0][arg1][arg3] + arg5;
            if (!class169.method1198(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class169.method1198(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class169.method1198(var9, var11, var13)) {
                return false;
            } else if (class169.method1198(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class163.method1117(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class169.method1198(var6 + 1, class166.field2746[arg0][arg1][arg3] + arg5, var7 + 1) && class169.method1198(var6 + 128 - 1, class166.field2746[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class169.method1198(var6 + 128 - 1, class166.field2746[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class169.method1198(var6 + 1, class166.field2746[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(B)V")
    public static void method236(byte arg0) {
        field528 = null;
        if (arg0 >= -96) {
            field531 = -64;
        }
    }
}
