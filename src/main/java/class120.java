import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class120 extends class45 {

    @OriginalMember(owner = "client!oq", name = "n", descriptor = "I")
    public volatile int field1675 = -1;

    @OriginalMember(owner = "client!oq", name = "p", descriptor = "Ljava/lang/String;")
    public volatile String field1677;

    @OriginalMember(owner = "client!oq", name = "m", descriptor = "I")
    public static int field1674 = 0;

    @OriginalMember(owner = "client!oq", name = "o", descriptor = "Z")
    public static boolean field1676 = false;

    @OriginalMember(owner = "client!oq", name = "r", descriptor = "Ljava/lang/String;")
    public static String field1679 = " more options";

    @OriginalMember(owner = "client!oq", name = "q", descriptor = "Z")
    public static boolean field1678 = true;

    @OriginalMember(owner = "client!oq", name = "l", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field1673 = new CRC32();

    @OriginalMember(owner = "client!oq", name = "s", descriptor = "I")
    public static int field1680;

    @OriginalMember(owner = "client!oq", name = "k", descriptor = "[I")
    public static int[] field1672;

    @OriginalMember(owner = "client!oq", name = "a", descriptor = "(Z)V")
    public static void method773(boolean arg0) {
        field1679 = null;
        field1673 = null;
        if (!arg0) {
            method773(false);
        }
        field1672 = null;
    }

    @OriginalMember(owner = "client!oq", name = "<init>", descriptor = "(Ljava/lang/String;)V")
    public class120(String arg0) {
        this.field1677 = arg0;
    }
}
