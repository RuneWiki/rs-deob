import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public class class662 {

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "Lof;")
    public static class568 field9336 = new class568(12, 17);

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
    public static int field9339 = 0;

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "I")
    public static int field9342 = 0;

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "Lfc;")
    public static class235 field9341 = new class235(111, -1);

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "I")
    public static int field9335;

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "I")
    public static int field9338;

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "I")
    public static int field9340;

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "Ljava/lang/String;")
    public static String field9337;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(ZIFBIIII)[I", line = 3)
    public static final int[] method3669(boolean arg0, int arg1, float arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg3 != 120) {
            return null;
        }
        field9340++;
        int[] var8 = new int[arg6];
        class203 var9 = new class203();
        var9.field2978 = arg7;
        var9.field2974 = (int) (arg2 * 4096.0F);
        var9.field2987 = arg0;
        var9.field2988 = arg5;
        var9.field2981 = arg4;
        var9.field2975 = arg1;
        var9.method40(26);
        class687.method3782(arg6, 0, 1);
        var9.method1358(62, 0, var8);
        return var8;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(IIB)Z", line = 27)
    public static final boolean method3670(int arg0, int arg1, byte arg2) {
        field9338++;
        int var3 = 119 / ((23 - arg2) / 43);
        return (class233.method1473(-102, arg0, arg1) | (arg0 & 0x2000) != 0 | class117.method854(arg1, (byte) -82, arg0)) & class602.method3339(arg1, 55, arg0);
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(I)V", line = 45)
    public static void method3671(int arg0) {
        field9337 = null;
        field9336 = null;
        field9341 = null;
        if (arg0 != -19) {
            method3670(2, 107, (byte) 43);
        }
    }
}
