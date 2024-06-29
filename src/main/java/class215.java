import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class215 {

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "Z")
    public static boolean field3244 = false;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
    public static int field3243;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "I")
    public int field3245;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "I")
    public int field3247;

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "I")
    public int field3248;

    @OriginalMember(owner = "client!pl", name = "g", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIIIII)Z", line = 10)
    public static final boolean method1456(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3249++;
        if (!class155.field2557) {
            return false;
        } else if (class495.field7220 < 100) {
            return false;
        } else if (arg0 == arg5 && arg3 == arg4) {
            if (!class118.method952(arg1, arg5, true, arg3)) {
                return false;
            }
            int var7 = arg5 << class49.field637;
            int var8 = arg3 << class49.field637;
            if (class623.method3516(arg2, 97, class457.field6576, var8, class687.field9745[arg1].method3858(arg3, arg5, (byte) 122), class457.field6576, var7)) {
                class78.field1197++;
                return true;
            } else {
                return false;
            }
        } else if (arg6 == 19100) {
            for (int var9 = arg5; var9 <= arg0; var9++) {
                for (int var12 = arg3; var12 <= arg4; var12++) {
                    if (class682.field9711[arg1][var9][var12] == (-class387.field5674)) {
                        return false;
                    }
                }
            }
            int var10 = (arg5 << class49.field637) + 1;
            int var11 = (arg3 << class49.field637) + 2;
            if (class623.method3516(arg2, arg6 - 19015, (arg0 - arg5 + 1) * class457.field6576, var11, class687.field9745[arg1].method3858(arg3, arg5, (byte) 33), (arg4 + 1 - arg3) * class457.field6576, var10)) {
                class78.field1197++;
                return true;
            } else {
                return false;
            }
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IIIIII)V", line = 85)
    public static final void method1457(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg0 < 86) {
            method1456(50, 49, 76, -123, 11, -88, 46);
        }
        for (int var6 = arg5; var6 <= arg4; var6++) {
            class223.method1484(class657.field9275[var6], arg1, -88, arg3, arg2);
        }
        field3246++;
    }
}
