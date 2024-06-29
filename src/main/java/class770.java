import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fl")
public class class770 extends class731 {

    @OriginalMember(owner = "client!fl", name = "B", descriptor = "I")
    public int field10600;

    @OriginalMember(owner = "client!fl", name = "D", descriptor = "I")
    public static int field10601;

    @OriginalMember(owner = "client!fl", name = "E", descriptor = "Lvk;")
    public static class389 field10602;

    @OriginalMember(owner = "client!fl", name = "<init>", descriptor = "(Lur;Lcf;IIIIIIIIIIIIII)V", line = 5)
    public class770(class564 arg0, class631 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12, int arg13, int arg14, int arg15) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8, arg9, arg10, arg11, arg12, arg13, arg14);
        this.field10600 = arg15;
    }

    @OriginalMember(owner = "client!fl", name = "a", descriptor = "(B)Lhv;", line = 14)
    public final class546 method1557(byte arg0) {
        if (arg0 > -35) {
            return null;
        } else {
            field10601++;
            return class178.field2374;
        }
    }

    @OriginalMember(owner = "client!fl", name = "b", descriptor = "(B)V", line = 27)
    public static void method4258(byte arg0) {
        if (arg0 == 94) {
            field10602 = null;
        }
    }
}
