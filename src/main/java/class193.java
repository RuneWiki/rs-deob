import java.awt.Rectangle;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class193 {

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "[Ljava/awt/Rectangle;")
    public static Rectangle[] field2593 = new Rectangle[100];

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "Lda;")
    public class395 field2594;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "Lha;")
    public class425 field2595;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)V", line = 8)
    public static void method1256(int arg0) {
        if (arg0 > -29) {
            method1256(4);
        }
        field2593 = null;
    }
}
