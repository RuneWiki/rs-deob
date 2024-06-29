import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class446 extends class324 {

    @OriginalMember(owner = "client!cn", name = "m", descriptor = "Leea;")
    public class114 field6669 = new class114();

    @OriginalMember(owner = "client!cn", name = "k", descriptor = "[Ljava/lang/String;")
    public static String[] field6667 = new String[100];

    @OriginalMember(owner = "client!cn", name = "l", descriptor = "[I")
    public static int[] field6668 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!cn", name = "n", descriptor = "I")
    public static int field6670;

    @OriginalMember(owner = "client!cn", name = "j", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field6666;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)[Ldb;")
    public static final class272[] method2777(byte arg0) {
        int var1 = 97 / ((arg0 + 66) / 40);
        field6670++;
        return new class272[] { class299.field4413, class485.field7098, class339.field4846, class442.field6598, class234.field3344, class410.field6249, class554.field7865, class457.field6836, class456.field6831, class1.field8, class421.field6309, class528.field7649, class377.field5753, class63.field711 };
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I)V")
    public static void method2778(int arg0) {
        field6667 = null;
        if (arg0 == -12552) {
            field6668 = null;
            field6666 = null;
        }
    }
}
