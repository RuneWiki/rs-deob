import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class152 {

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "[Ljava/awt/Color;")
    public static Color[] field1953 = new Color[] { new Color(9179409), new Color(16777215) };

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
    public static int field1954 = -1;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "Z")
    public static boolean field1956 = false;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "[S")
    public static short[] field1955;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V", line = 3)
    public static void method929(int arg0) {
        field1953 = null;
        if (arg0 == 23779) {
            field1955 = null;
        }
    }
}
