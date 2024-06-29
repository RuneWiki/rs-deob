import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public class class710 {

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
    public static int field9834;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
    public static int field9836;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "Leda;")
    public static class133 field9835;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(B)I", line = 4)
    public static final int method3995(byte arg0) {
        if (arg0 != 94) {
            field9835 = null;
        }
        field9834++;
        return class465.field6480++;
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V", line = 16)
    public static void method3996(int arg0) {
        if (arg0 == 25145) {
            field9835 = null;
        }
    }
}
