import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uv")
public class class751 extends class679 {

    @OriginalMember(owner = "client!uv", name = "v", descriptor = "I")
    public int field10441;

    @OriginalMember(owner = "client!uv", name = "t", descriptor = "I")
    public int field10439;

    @OriginalMember(owner = "client!uv", name = "s", descriptor = "[Luea;")
    public static class243[] field10438 = new class243[128];

    @OriginalMember(owner = "client!uv", name = "x", descriptor = "I")
    public static int field10443 = 0;

    @OriginalMember(owner = "client!uv", name = "q", descriptor = "Lju;")
    public static class102 field10436 = new class102(40, 7);

    @OriginalMember(owner = "client!uv", name = "r", descriptor = "I")
    public static int field10437;

    @OriginalMember(owner = "client!uv", name = "u", descriptor = "I")
    public static int field10440;

    @OriginalMember(owner = "client!uv", name = "w", descriptor = "Lne;")
    public static class157 field10442;

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(I)Lag;")
    public final class214 method210(int arg0) {
        field10437++;
        return arg0 == 7288 ? class540.field7551 : null;
    }

    @OriginalMember(owner = "client!uv", name = "b", descriptor = "(I)V")
    public static void method4165(int arg0) {
        field10442 = null;
        field10436 = null;
        if (arg0 <= -10) {
            field10438 = null;
        }
    }

    @OriginalMember(owner = "client!uv", name = "<init>", descriptor = "(Lvfa;Lrq;IIIIIIIIII)V")
    public class751(class92 arg0, class482 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field10441 = arg11;
        this.field10439 = arg10;
    }

    @OriginalMember(owner = "client!uv", name = "a", descriptor = "(IIII)I")
    public static final int method4166(int arg0, int arg1, int arg2, int arg3) {
        field10440++;
        if (arg3 != 2600) {
            method4165(-102);
        }
        int var4 = 255 - arg1;
        int var5 = ((arg2 & 0xFF00) * arg1 & 0xFF0000 | (arg2 & 0xFF00FF) * arg1 & 0xFF00FF00) >>> 8;
        return (((arg0 & 0xFF00) * var4 & 0xFF0000 | (arg0 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8) + var5;
    }
}
