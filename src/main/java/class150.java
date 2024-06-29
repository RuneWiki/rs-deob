import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mf")
public class class150 extends class16 {

    @OriginalMember(owner = "client!mf", name = "m", descriptor = "I")
    private int field2580 = -32768;

    @OriginalMember(owner = "client!mf", name = "n", descriptor = "[I")
    public static int[] field2581 = new int[32];

    @OriginalMember(owner = "client!mf", name = "p", descriptor = "I")
    public int field2583;

    @OriginalMember(owner = "client!mf", name = "q", descriptor = "I")
    public static int field2584;

    @OriginalMember(owner = "client!mf", name = "s", descriptor = "I")
    public static int field2586;

    @OriginalMember(owner = "client!mf", name = "t", descriptor = "I")
    public int field2587;

    @OriginalMember(owner = "client!mf", name = "u", descriptor = "I")
    public static int field2588;

    @OriginalMember(owner = "client!mf", name = "r", descriptor = "Lua;")
    public static class246 field2585;

    @OriginalMember(owner = "client!mf", name = "o", descriptor = "[I")
    public static int[] field2582;

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(IIIIIIIIJ)V")
    public final void method127(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8) {
        field2584++;
        class251 var11 = class100.method623(-1, this.field2587).method995(this.field2583, (class248) null, 0, -30);
        if (var11 != null) {
            var11.method127(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
            this.field2580 = var11.method126();
        }
    }

    @OriginalMember(owner = "client!mf", name = "a", descriptor = "(B)V")
    public static void method1019(byte arg0) {
        field2582 = null;
        field2581 = null;
        field2585 = null;
        if (arg0 != -86) {
            method1019((byte) -56);
        }
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "()I")
    public final int method126() {
        field2588++;
        return this.field2580;
    }

    @OriginalMember(owner = "client!mf", name = "b", descriptor = "(B)V")
    public static final void method1020(byte arg0) {
        class210.field3729.method992(-31);
        class142.field2363.method992(-31);
        class169.field2868.method992(-31);
        if (arg0 != -69) {
            field2585 = null;
        }
        field2586++;
    }
}
