import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class22 {

    @OriginalMember(owner = "client!nk", name = "k", descriptor = "[I")
    public static int[] field344 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!nk", name = "f", descriptor = "Lbd;")
    public static class162 field339 = class17.method142(0, "Card:");

    @OriginalMember(owner = "client!nk", name = "y", descriptor = "Lbd;")
    public static class162 field358 = class17.method142(0, "::wm3");

    @OriginalMember(owner = "client!nk", name = "x", descriptor = "Lbd;")
    private static class162 field357 = class17.method142(0, "Take");

    @OriginalMember(owner = "client!nk", name = "r", descriptor = "Lbd;")
    public static class162 field351 = field357;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "I")
    public int field334;

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "I")
    public int field335;

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "I")
    public int field336;

    @OriginalMember(owner = "client!nk", name = "d", descriptor = "I")
    public static int field337;

    @OriginalMember(owner = "client!nk", name = "e", descriptor = "I")
    public int field338;

    @OriginalMember(owner = "client!nk", name = "g", descriptor = "I")
    public int field340;

    @OriginalMember(owner = "client!nk", name = "h", descriptor = "I")
    public int field341;

    @OriginalMember(owner = "client!nk", name = "i", descriptor = "I")
    public int field342;

    @OriginalMember(owner = "client!nk", name = "j", descriptor = "I")
    public int field343;

    @OriginalMember(owner = "client!nk", name = "l", descriptor = "I")
    public int field345;

    @OriginalMember(owner = "client!nk", name = "m", descriptor = "I")
    public int field346;

    @OriginalMember(owner = "client!nk", name = "n", descriptor = "I")
    public int field347;

    @OriginalMember(owner = "client!nk", name = "p", descriptor = "I")
    public int field349;

    @OriginalMember(owner = "client!nk", name = "q", descriptor = "I")
    public int field350;

    @OriginalMember(owner = "client!nk", name = "s", descriptor = "I")
    public int field352;

    @OriginalMember(owner = "client!nk", name = "t", descriptor = "I")
    public int field353;

    @OriginalMember(owner = "client!nk", name = "u", descriptor = "I")
    public int field354;

    @OriginalMember(owner = "client!nk", name = "v", descriptor = "I")
    public int field355;

    @OriginalMember(owner = "client!nk", name = "w", descriptor = "I")
    public int field356;

    @OriginalMember(owner = "client!nk", name = "z", descriptor = "I")
    public static int field359;

    @OriginalMember(owner = "client!nk", name = "o", descriptor = "Ldk;")
    public static class33 field348;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(B)V", line = 7)
    public static void method181(byte arg0) {
        field357 = null;
        field348 = null;
        field351 = null;
        field358 = null;
        field339 = null;
        int var1 = 49 / ((-arg0 - 65) / 41);
        field344 = null;
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(ZLlb;)V", line = 39)
    public static final void method182(boolean arg0, class60 arg1) {
        field337++;
        for (class64 var2 = (class64) client.field1884.method169(-118); var2 != null; var2 = (class64) client.field1884.method165((byte) -101)) {
            if (var2.field995 == arg1) {
                if (var2.field1003 != null) {
                    class313.field5290.method449(var2.field1003);
                    var2.field1003 = null;
                }
                var2.method1183(arg0);
                return;
            }
        }
        if (arg0) {
            field351 = (class162) null;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IIIIIIIIII)V", line = 78)
    public static final void method183(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class183 var10 = null;
        field359++;
        for (class183 var11 = (class183) class10.field123.method169(28); var11 != null; var11 = (class183) class10.field123.method165((byte) -101)) {
            if (var11.field3159 == arg9 && var11.field3148 == arg3 && var11.field3151 == arg4 && var11.field3153 == arg0) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class183();
            var10.field3153 = arg0;
            var10.field3148 = arg3;
            var10.field3151 = arg4;
            var10.field3159 = arg9;
            class126.method1017(var10, arg5 ^ 0xFFFFF151);
            class10.field123.method167(false, var10);
        }
        var10.field3146 = arg8;
        var10.field3143 = arg7;
        if (arg5 == 9581) {
            var10.field3156 = arg6;
            var10.field3154 = arg1;
            var10.field3152 = arg2;
        }
    }
}
