import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fo")
public class class479 {

    @OriginalMember(owner = "client!fo", name = "b", descriptor = "Lrl;")
    public static class672 field7079 = new class672(48, -1);

    @OriginalMember(owner = "client!fo", name = "c", descriptor = "I")
    public static int field7080;

    @OriginalMember(owner = "client!fo", name = "d", descriptor = "I")
    public static int field7081;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "[[S")
    public static short[][] field7078;

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(IIIIIII)V", line = 5)
    public static final void method2966(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg5 - arg1) >= class576.field8218 && class340.field5510 >= (arg1 + arg5) && arg6 - arg1 >= class545.field7931 && class585.field8331 >= (arg6 + arg1)) {
            class592.method3454(arg1, arg2, arg6, arg5, arg3, arg4, 0);
        } else {
            class288.method2040(-14061, arg5, arg3, arg1, arg2, arg6, arg4);
        }
        field7080++;
        if (arg0 != -1) {
            method2967(98);
        }
    }

    @OriginalMember(owner = "client!fo", name = "a", descriptor = "(I)V", line = 37)
    public static void method2967(int arg0) {
        field7079 = null;
        field7078 = null;
        if (arg0 != -1) {
            field7078 = null;
        }
    }
}
