import java.awt.Font;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gfa")
public class class683 {

    @OriginalMember(owner = "client!gfa", name = "d", descriptor = "[I")
    public static int[] field9691 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "I")
    public static int field9688;

    @OriginalMember(owner = "client!gfa", name = "e", descriptor = "I")
    public static int field9692;

    @OriginalMember(owner = "client!gfa", name = "b", descriptor = "Ljo;")
    public static class303 field9689;

    @OriginalMember(owner = "client!gfa", name = "c", descriptor = "Ljava/awt/Font;")
    public static Font field9690;

    @OriginalMember(owner = "client!gfa", name = "a", descriptor = "(B)V")
    public static void method3810(byte arg0) {
        if (arg0 != 60) {
            method3810((byte) -108);
        }
        field9690 = null;
        field9691 = null;
        field9689 = null;
    }
}
