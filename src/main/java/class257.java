import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!za")
public abstract class class257 extends class71 {

    @OriginalMember(owner = "client!za", name = "j", descriptor = "[I")
    public static int[] field3726 = new int[5];

    @OriginalMember(owner = "client!za", name = "a", descriptor = "(Z)V", line = 7)
    public static void method1738(boolean arg0) {
        field3726 = null;
        if (arg0) {
            method1738(true);
        }
    }
}
