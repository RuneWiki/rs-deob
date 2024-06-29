import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mba")
public class class444 extends class651 {

    @OriginalMember(owner = "client!mba", name = "s", descriptor = "I")
    public int field6236;

    @OriginalMember(owner = "client!mba", name = "o", descriptor = "I")
    public int field6232;

    @OriginalMember(owner = "client!mba", name = "p", descriptor = "[I")
    public static int[] field6233 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!mba", name = "n", descriptor = "I")
    public static int field6231 = 0;

    @OriginalMember(owner = "client!mba", name = "r", descriptor = "I")
    public static int field6235 = -1;

    @OriginalMember(owner = "client!mba", name = "t", descriptor = "Lmt;")
    public static class419 field6237 = new class419(10, 2, 2, 0);

    @OriginalMember(owner = "client!mba", name = "q", descriptor = "I")
    public static int field6234;

    @OriginalMember(owner = "client!mba", name = "a", descriptor = "(B)Lhv;", line = 5)
    public final class546 method1557(byte arg0) {
        field6234++;
        if (arg0 > -35) {
            method2667(123);
        }
        return class193.field2588;
    }

    @OriginalMember(owner = "client!mba", name = "b", descriptor = "(I)V", line = 23)
    public static void method2667(int arg0) {
        field6237 = null;
        field6233 = null;
        if (arg0 != 13361) {
            method2667(-116);
        }
    }

    @OriginalMember(owner = "client!mba", name = "<init>", descriptor = "(Lur;Lcf;IIIIIIIII)V", line = 43)
    public class444(class564 arg0, class631 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field6236 = arg10;
        this.field6232 = arg9;
    }
}
