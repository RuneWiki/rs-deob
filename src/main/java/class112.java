import java.nio.ByteBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class112 {

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "Z")
    public boolean field1819 = false;

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "I")
    public int field1820 = 0;

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "I")
    public int field1816 = 0;

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "Ljava/lang/String;")
    public static String field1814 = "Loaded wordpack";

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1815 = "Loading defaults - ";

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "Ll;")
    public class312 field1817;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "Ljava/nio/ByteBuffer;")
    public ByteBuffer field1813;

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(I)V", line = 24)
    public static void method875(int arg0) {
        if (arg0 != 0) {
            method875(-124);
        }
        field1815 = null;
        field1814 = null;
    }
}
