import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class128 {

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field1439;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public static int field1440;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "Lf;")
    public static class534 field1438;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field1437;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V", line = 3)
    public static void method727(byte arg0) {
        field1437 = null;
        int var1 = -87 / ((18 - arg0) / 35);
        field1438 = null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)Lwg;", line = 24)
    public static final class59 method728(int arg0) {
        field1440++;
        try {
            return (class59) Class.forName("o").getDeclaredConstructor().newInstance();
        } catch (Throwable var1) {
            if (arg0 > -117) {
                field1438 = null;
            }
            return new class502();
        }
    }
}
