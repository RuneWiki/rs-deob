import java.awt.Image;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!di")
public class class225 {

    @OriginalMember(owner = "client!di", name = "a", descriptor = "[I")
    public static int[] field3319 = new int[32];

    @OriginalMember(owner = "client!di", name = "d", descriptor = "I")
    public static int field3322 = 0;

    @OriginalMember(owner = "client!di", name = "c", descriptor = "I")
    public static int field3321;

    @OriginalMember(owner = "client!di", name = "b", descriptor = "Ljava/awt/Image;")
    public static Image field3320;

    @OriginalMember(owner = "client!di", name = "a", descriptor = "(B)V")
    public static void method1476(byte arg0) {
        if (arg0 > 74) {
            field3320 = null;
            field3319 = null;
        }
    }
}
