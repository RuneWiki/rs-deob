import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class74 extends class656 {

    @OriginalMember(owner = "client!u", name = "i", descriptor = "I")
    public volatile int field900 = -1;

    @OriginalMember(owner = "client!u", name = "l", descriptor = "Ljava/lang/String;")
    public volatile String field903;

    @OriginalMember(owner = "client!u", name = "k", descriptor = "I")
    public static int field902 = 0;

    @OriginalMember(owner = "client!u", name = "m", descriptor = "[Ljava/awt/Color;")
    public static Color[] field904 = new Color[] { new Color(9179409), new Color(16777215), new Color(16726277), new Color(16726277) };

    @OriginalMember(owner = "client!u", name = "j", descriptor = "Lrl;")
    public static class723 field901;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(B)V", line = 4)
    public static void method600(byte arg0) {
        field901 = null;
        field904 = null;
        if (arg0 != -78) {
            field904 = null;
        }
    }

    @OriginalMember(owner = "client!u", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 25)
    public class74(String arg0) {
        this.field903 = arg0;
    }
}
