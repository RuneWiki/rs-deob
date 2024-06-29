import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class648 {

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "[I")
    public static int[] field9260 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "I")
    public static int field9261;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "[[S")
    public static short[][] field9262;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lei;I)I")
    public static final int method3691(class177 arg0, int arg1) {
        if (arg1 != 29749) {
            method3692(-26);
        }
        field9261++;
        String var2 = class502.method2979(-125, arg0);
        return class96.field1014.method3139(arg1 ^ 0x744C, var2, class126.field1322);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V")
    public static void method3692(int arg0) {
        field9260 = null;
        if (arg0 != 10626) {
            method3692(-114);
        }
        field9262 = null;
    }
}
