import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class176 {

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "[I")
    public static int[] field2534 = new int[6];

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "I")
    public static int field2533;

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(I)V")
    public static void method1231(int arg0) {
        field2534 = null;
        int var1 = 56 % ((58 - arg0) / 57);
    }
}
