import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class449 {

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "I")
    public static int field6284;

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "Z")
    public static boolean field6283;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "[Lsw;")
    public static class437[] field6282;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIII)I", line = 4)
    public static final int method2716(int arg0, int arg1, int arg2, int arg3) {
        int var4 = -81 % ((arg2 - 66) / 47);
        field6284++;
        int var5 = 255 - arg3;
        int var6 = ((arg1 & 0xFF00FF) * arg3 & 0xFF00FF00 | (arg1 & 0xFF00) * arg3 & 0xFF0000) >>> 8;
        return (((arg0 & 0xFF00) * var5 & 0xFF0000 | (arg0 & 0xFF00FF) * var5 & 0xFF00FF00) >>> 8) + var6;
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Z)V", line = 28)
    public static void method2717(boolean arg0) {
        field6282 = null;
        if (arg0) {
            method2716(-57, 102, 57, -110);
        }
    }
}
