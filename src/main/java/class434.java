import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class434 {

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "[I")
    public static int[] field5434 = new int[256];

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "F")
    public static float field5436;

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "I")
    public static int field5435;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field5437;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V", line = 10)
    public static void method2283(int arg0) {
        if (arg0 != 256) {
            field5437 = null;
        }
        field5434 = null;
        field5437 = null;
    }

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;", line = 24)
    public static final String method2284(byte arg0, String arg1) {
        if (arg0 > -59) {
            method2283(88);
        }
        field5435++;
        if (class367.field4661.startsWith("win")) {
            return arg1 + ".dll";
        } else if (class367.field4661.startsWith("linux")) {
            return "lib" + arg1 + ".so";
        } else if (class367.field4661.startsWith("mac")) {
            return "lib" + arg1 + ".dylib";
        } else {
            return null;
        }
    }
}
