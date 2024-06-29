import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ca")
public class class137 extends InputStream {

    @OriginalMember(owner = "client!ca", name = "c", descriptor = "I")
    public static int field1758 = 0;

    @OriginalMember(owner = "client!ca", name = "b", descriptor = "I")
    public static int field1757 = 0;

    @OriginalMember(owner = "client!ca", name = "d", descriptor = "I")
    public static int field1759;

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field1756;

    @OriginalMember(owner = "client!ca", name = "read", descriptor = "()I")
    public final int read() {
        field1759++;
        class730.method4066((byte) -45, 30000L);
        return -1;
    }

    @OriginalMember(owner = "client!ca", name = "a", descriptor = "(B)V")
    public static void method920(byte arg0) {
        int var1 = 33 % ((arg0 + 48) / 55);
        field1756 = null;
    }
}
