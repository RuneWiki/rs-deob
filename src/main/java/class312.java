import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class312 {

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "[I")
    public static int[] field5034 = new int[32];

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "I")
    public static volatile int field5035 = 0;

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(I)V")
    public static void method2116(int arg0) {
        field5034 = null;
        int var1 = 86 / ((-arg0 - 19) / 62);
    }
}
