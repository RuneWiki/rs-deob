import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class168 {

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "Lbd;")
    public static class162 field2947 = class17.method142(0, "Fps:");

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "Z")
    public static boolean field2948 = false;

    @OriginalMember(owner = "client!ig", name = "e", descriptor = "I")
    public static int field2951 = -1;

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "Lda;")
    public static class143 field2949;

    @OriginalMember(owner = "client!ig", name = "d", descriptor = "Ljava/awt/Frame;")
    public static Frame field2950;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V", line = 31)
    public static void method1309(int arg0) {
        field2949 = null;
        if (arg0 == -1) {
            field2950 = null;
            field2947 = null;
        }
    }
}
