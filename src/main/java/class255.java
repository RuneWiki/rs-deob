import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tga")
public class class255 {

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "Lri;")
    public static class342 field4027 = new class342();

    @OriginalMember(owner = "client!tga", name = "b", descriptor = "Ljava/awt/Image;")
    public static Image field4028;

    @OriginalMember(owner = "client!tga", name = "a", descriptor = "(B)V")
    public static void method1727(byte arg0) {
        if (arg0 != 76) {
            field4027 = null;
        }
        field4027 = null;
        field4028 = null;
    }
}
