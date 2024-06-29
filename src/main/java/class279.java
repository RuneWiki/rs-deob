import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class279 {

    @OriginalMember(owner = "client!ei", name = "c", descriptor = "[I")
    public static int[] field4191 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "Z")
    public static boolean field4189 = false;

    @OriginalMember(owner = "client!ei", name = "b", descriptor = "I")
    public static int field4190;

    @OriginalMember(owner = "client!ei", name = "d", descriptor = "I")
    public static int field4192;

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(I)V")
    public static void method1985(int arg0) {
        field4191 = null;
        if (arg0 != 2) {
            field4189 = true;
        }
    }
}
