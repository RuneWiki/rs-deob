import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class244 {

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public static int field3453;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field3454;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "I")
    public static int field3455;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(II)V")
    public static final void method1654(int arg0, int arg1) {
        field3455++;
        if (arg0 > arg1 || arg1 > 2) {
            arg1 = 0;
        }
        class178.field2456 = arg1;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(III)Lmk;")
    public static final class34 method1655(int arg0, int arg1, int arg2) {
        class125 var3 = class328.field4549[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1756;
    }

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "(II)V")
    public static final void method1656(int arg0, int arg1) {
        field3453++;
        if (arg0 != -24707) {
            method1654(78, 48);
        }
        class239 var2 = class436.method2740(8, arg1, -323285792);
        var2.method1628(14478);
    }
}
