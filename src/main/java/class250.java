import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class250 {

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "Z")
    public static boolean field4537 = true;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "[I")
    public static int[] field4540 = new int[5];

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "I")
    public static int field4538;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public static int field4539;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V")
    public static void method1751(int arg0) {
        field4540 = null;
        if (arg0 >= -17) {
            method1751(-3);
        }
    }
}
