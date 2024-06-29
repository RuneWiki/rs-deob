import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mp")
public class class711 {

    @OriginalMember(owner = "client!mp", name = "c", descriptor = "[I")
    public static int[] field9936 = new int[2];

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "I")
    public static int field9934;

    @OriginalMember(owner = "client!mp", name = "b", descriptor = "I")
    public static int field9935;

    @OriginalMember(owner = "client!mp", name = "d", descriptor = "Lta;")
    public static class201 field9937;

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(I)V", line = 5)
    public static void method3907(int arg0) {
        field9936 = null;
        if (arg0 != 0) {
            method3907(-61);
        }
        field9937 = null;
    }

    @OriginalMember(owner = "client!mp", name = "a", descriptor = "(Lji;B)Lqg;", line = 18)
    public static final class431 method3908(class572 arg0, byte arg1) {
        field9934++;
        class268 var2 = class75.method601(arg0, true);
        int var3 = arg0.method3071(228709168);
        return arg1 == -123 ? new class431(var2.field3388, var2.field3385, var2.field3383, var2.field3386, var2.field3381, var3) : null;
    }
}
