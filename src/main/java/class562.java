import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class562 extends class50 {

    @OriginalMember(owner = "client!wj", name = "n", descriptor = "I")
    public static int field8226 = 0;

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "S")
    public static short field8221 = 256;

    @OriginalMember(owner = "client!wj", name = "j", descriptor = "I")
    public int field8222;

    @OriginalMember(owner = "client!wj", name = "k", descriptor = "I")
    public int field8223;

    @OriginalMember(owner = "client!wj", name = "l", descriptor = "I")
    public int field8224;

    @OriginalMember(owner = "client!wj", name = "m", descriptor = "I")
    public int field8225;

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "Lrg;")
    public class523 field8220;

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field8219;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(B)V")
    public static void method3251(byte arg0) {
        field8219 = null;
        if (arg0 <= 92) {
            field8219 = null;
        }
    }
}
