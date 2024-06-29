import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public class class306 {

    @OriginalMember(owner = "client!io", name = "a", descriptor = "[Z")
    public static boolean[] field4450 = new boolean[100];

    @OriginalMember(owner = "client!io", name = "b", descriptor = "Ljava/awt/Image;")
    public static Image field4451;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(I)V", line = 12)
    public static void method1861(int arg0) {
        if (arg0 == 100) {
            field4450 = null;
            field4451 = null;
        }
    }
}
