import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ic")
public class class502 {

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "Lge;")
    public static class511 field7245 = new class511(5);

    @OriginalMember(owner = "client!ic", name = "b", descriptor = "I")
    public static int field7246 = 0;

    @OriginalMember(owner = "client!ic", name = "c", descriptor = "[[B")
    public static byte[][] field7247;

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(IIILpl;Lpl;)V")
    public static final void method2931(int arg0, int arg1, int arg2, class469 arg3, class469 arg4) {
        class188 var5 = class53.method468(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field2755 = arg3;
            var5.field2774 = arg4;
        }
    }

    @OriginalMember(owner = "client!ic", name = "a", descriptor = "(I)V")
    public static void method2932(int arg0) {
        if (arg0 != 0) {
            field7246 = -50;
        }
        field7247 = null;
        field7245 = null;
    }
}
