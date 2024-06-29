import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class596 extends class469 {

    @OriginalMember(owner = "client!ic", name = "D", descriptor = "I")
    public static int field8635;

    @OriginalMember(owner = "client!ic", name = "E", descriptor = "I")
    public static int field8636;

    @OriginalMember(owner = "client!ic", name = "G", descriptor = "I")
    public static int field8638;

    @OriginalMember(owner = "client!ic", name = "F", descriptor = "Ldn;")
    public static class438 field8637;

    @OriginalMember(owner = "client!ic", name = "<init>", descriptor = "(IIIIIF)V")
    public class596(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ic", name = "f", descriptor = "(I)V")
    public static void method3451(int arg0) {
        field8637 = null;
        if (arg0 != 8048) {
            method3451(6);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IF)V")
    public final void method506(int arg0, float arg1) {
        super.field6557 = arg1;
        ++field8638;
        if (arg0 != -1) {
            this.method509(-94, 103, -81, 13);
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIII)V")
    public final void method509(int arg0, int arg1, int arg2, int arg3) {
        ++field8636;
        super.field6554 = arg3;
        super.field6558 = arg2;
        super.field6556 = arg0;
        if (arg1 != -1) {
            this.method509(-110, 67, 89, 69);
        }
    }
}
