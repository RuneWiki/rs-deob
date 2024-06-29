import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public class class212 {

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "[I")
    public static int[] field2646 = new int[2];

    @OriginalMember(owner = "client!kc", name = "a", descriptor = "(I)V", line = 3)
    public static void method1261(int arg0) {
        field2646 = null;
        if (arg0 != 2) {
            method1261(-56);
        }
    }
}
