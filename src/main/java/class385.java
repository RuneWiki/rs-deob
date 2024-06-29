import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ep")
public class class385 extends class401 {

    @OriginalMember(owner = "client!ep", name = "k", descriptor = "Lgca;")
    public class227 field5460 = new class227();

    @OriginalMember(owner = "client!ep", name = "j", descriptor = "[I")
    public static int[] field5459 = new int[2];

    @OriginalMember(owner = "client!ep", name = "l", descriptor = "[I")
    public static int[] field5461 = new int[32];

    @OriginalMember(owner = "client!ep", name = "a", descriptor = "(I)V")
    public static void method2280(int arg0) {
        if (arg0 > -57) {
            field5459 = null;
        }
        field5461 = null;
        field5459 = null;
    }
}
