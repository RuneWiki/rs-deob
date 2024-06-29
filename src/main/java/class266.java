import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ah")
public class class266 extends class114 {

    @OriginalMember(owner = "client!ah", name = "t", descriptor = "Los;")
    public class311 field3707;

    @OriginalMember(owner = "client!ah", name = "u", descriptor = "Lla;")
    public static class319 field3708 = new class319(99, -1);

    @OriginalMember(owner = "client!ah", name = "w", descriptor = "I")
    public static int field3710;

    @OriginalMember(owner = "client!ah", name = "v", descriptor = "Luu;")
    public static class191 field3709;

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(FIIIIIIZI)[[I")
    public static final int[][] method1703(float arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean arg7, int arg8) {
        field3710++;
        int[][] var9 = new int[arg2][arg6];
        if (arg3 <= 8) {
            field3708 = null;
        }
        class64 var10 = new class64();
        var10.field919 = arg1;
        var10.field913 = arg8;
        var10.field923 = (int) (arg0 * 4096.0F);
        var10.field924 = arg7;
        var10.field921 = arg4;
        var10.method357(105);
        class84.method576(arg6, arg2, -16531);
        for (int var11 = 0; var11 < arg2; var11++) {
            var10.method462(var11, false, var9[var11]);
        }
        return var9;
    }

    @OriginalMember(owner = "client!ah", name = "a", descriptor = "(Z)V")
    public static void method1704(boolean arg0) {
        field3708 = null;
        if (arg0) {
            field3709 = null;
        }
        field3709 = null;
    }

    @OriginalMember(owner = "client!ah", name = "<init>", descriptor = "(Los;)V")
    public class266(class311 arg0) {
        this.field3707 = arg0;
    }
}
