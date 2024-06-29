import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nc")
public class class126 {

    @OriginalMember(owner = "client!nc", name = "e", descriptor = "I")
    public int field2266;

    @OriginalMember(owner = "client!nc", name = "m", descriptor = "I")
    public int field2274;

    @OriginalMember(owner = "client!nc", name = "n", descriptor = "I")
    public int field2275;

    @OriginalMember(owner = "client!nc", name = "b", descriptor = "I")
    public int field2263;

    @OriginalMember(owner = "client!nc", name = "c", descriptor = "I")
    public static int field2264 = 0;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "Ltg;")
    public static class184 field2262 = class135.method812(" zuerst von Ihrer Ignorieren)2Liste(Q", 3);

    @OriginalMember(owner = "client!nc", name = "j", descriptor = "[I")
    public static int[] field2271 = new int[200];

    @OriginalMember(owner = "client!nc", name = "l", descriptor = "Ltg;")
    public static class184 field2273 = class135.method812("::rect_debug", 3);

    @OriginalMember(owner = "client!nc", name = "h", descriptor = "I")
    public static int field2269 = -1;

    @OriginalMember(owner = "client!nc", name = "k", descriptor = "Ltg;")
    private static class184 field2272 = class135.method812("Existing User", 3);

    @OriginalMember(owner = "client!nc", name = "d", descriptor = "Ltg;")
    public static class184 field2265 = field2272;

    @OriginalMember(owner = "client!nc", name = "f", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!nc", name = "g", descriptor = "I")
    public static int field2268;

    @OriginalMember(owner = "client!nc", name = "i", descriptor = "Lud;")
    public static class190 field2270;

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method761(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class186 var10 = null;
        field2268++;
        for (class186 var11 = (class186) class79.field1429.method404(false); var11 != null; var11 = (class186) class79.field1429.method414(-120)) {
            if (var11.field3592 == arg4 && var11.field3605 == arg1 && var11.field3600 == arg3 && var11.field3587 == arg7) {
                var10 = var11;
                break;
            }
        }
        if (var10 == null) {
            var10 = new class186();
            var10.field3587 = arg7;
            var10.field3592 = arg4;
            var10.field3605 = arg1;
            var10.field3600 = arg3;
            class150.method918(true, var10);
            class79.field1429.method402(16777215, var10);
        }
        var10.field3594 = arg2;
        var10.field3595 = arg6;
        var10.field3584 = arg8;
        var10.field3598 = arg0;
        var10.field3586 = arg9;
        if (arg5 != -5783) {
            field2265 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "a", descriptor = "(B)V")
    public static void method762(byte arg0) {
        field2265 = null;
        field2271 = null;
        field2272 = null;
        field2270 = null;
        field2262 = null;
        field2273 = null;
        if (arg0 != -101) {
            field2265 = null;
        }
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "()V")
    public class126() {
    }

    @OriginalMember(owner = "client!nc", name = "<init>", descriptor = "(Lnc;)V")
    public class126(class126 arg0) {
        this.field2266 = arg0.field2266;
        this.field2274 = arg0.field2274;
        this.field2275 = arg0.field2275;
        this.field2263 = arg0.field2263;
    }
}
