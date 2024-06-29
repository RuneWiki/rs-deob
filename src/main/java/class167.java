import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class167 {

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
    public static int field2640;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(IIIIBIIIII)Z", line = 6)
    public static final boolean method1224(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field2640++;
        if (!class240.method1588(arg7, arg3, -118, arg9)) {
            return false;
        }
        int var10 = class640.field8984[1];
        int var11 = class640.field8984[0];
        int var12 = class640.field8984[2];
        if (!class240.method1588(arg2, arg0, -126, arg1)) {
            return false;
        }
        int var13 = class640.field8984[2];
        int var14 = class640.field8984[0];
        int var15 = 97 % ((arg4 - 39) / 52);
        int var16 = class640.field8984[1];
        if (class240.method1588(arg6, arg5, -89, arg8)) {
            int var17 = class640.field8984[1];
            int var18 = class640.field8984[0];
            int var19 = class640.field8984[2];
            return class657.method3795(var14, (byte) -57, var16, var11, var12, var10, var18, var17, var13, var19);
        } else {
            return false;
        }
    }
}
