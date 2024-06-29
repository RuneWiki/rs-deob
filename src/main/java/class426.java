import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cga")
public class class426 {

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "[I")
    public static int[] field5916 = new int[3];

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(I)V")
    public static void method2502(int arg0) {
        field5916 = null;
        if (arg0 != 3) {
            field5916 = null;
        }
    }
}
