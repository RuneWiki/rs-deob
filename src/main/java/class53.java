import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class53 extends class291 {

    @OriginalMember(owner = "client!gp", name = "g", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field745;

    @OriginalMember(owner = "client!gp", name = "b", descriptor = "(I)V", line = 8)
    public static void method346(int arg0) {
        if (arg0 != -15790) {
            method346(-123);
        }
        field745 = null;
    }
}
