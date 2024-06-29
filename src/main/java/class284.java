import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class284 {

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "Loo;")
    public static class652 field4192 = new class652(4);

    @OriginalMember(owner = "client!jl", name = "f", descriptor = "I")
    public static int field4196 = 0;

    @OriginalMember(owner = "client!jl", name = "i", descriptor = "I")
    public static int field4199 = 0;

    @OriginalMember(owner = "client!jl", name = "g", descriptor = "F")
    public static float field4197;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!jl", name = "d", descriptor = "I")
    public static int field4194;

    @OriginalMember(owner = "client!jl", name = "e", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!jl", name = "h", descriptor = "I")
    public static int field4198;

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "Ljga;")
    public static class746 field4193;

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(BLso;)Lk;", line = 5)
    public static final class590 method1846(byte arg0, class494 arg1) {
        if (arg0 <= 113) {
            field4192 = null;
        }
        field4198++;
        return new class590(arg1.method2988(-3), arg1.method2988(-3), arg1.method2988(-3), arg1.method2988(-3), arg1.method2960((byte) 94), arg1.method2960((byte) 94), arg1.method2964((byte) 38));
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(I)V", line = 36)
    public static void method1847(int arg0) {
        if (arg0 != -7848) {
            method1847(-6);
        }
        field4192 = null;
        field4193 = null;
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(BIIII)V", line = 47)
    public static final void method1848(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg4 >= class734.field10153 && class407.field5535 >= arg4) {
            int var5 = class527.method3176(arg1, class463.field6533, class618.field8645, -2);
            int var6 = class527.method3176(arg2, class463.field6533, class618.field8645, -2);
            class739.method4116(arg3, var6, 11, var5, arg4);
        }
        if (arg0 > -113) {
            method1847(2);
        }
        field4191++;
    }
}
