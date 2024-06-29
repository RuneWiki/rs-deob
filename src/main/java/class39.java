import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!e")
public class class39 extends class119 {

    @OriginalMember(owner = "client!e", name = "v", descriptor = "[B")
    public byte[] field663;

    @OriginalMember(owner = "client!e", name = "q", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field658 = new CRC32();

    @OriginalMember(owner = "client!e", name = "t", descriptor = "Lai;")
    private static class10 field661 = class44.method278("Close", -61);

    @OriginalMember(owner = "client!e", name = "r", descriptor = "[B")
    public static byte[] field659 = new byte[520];

    @OriginalMember(owner = "client!e", name = "w", descriptor = "Lai;")
    public static class10 field664 = class44.method278("null", -64);

    @OriginalMember(owner = "client!e", name = "u", descriptor = "Lai;")
    public static class10 field662 = class44.method278("(U2", -32);

    @OriginalMember(owner = "client!e", name = "s", descriptor = "Lai;")
    public static class10 field660 = field661;

    @OriginalMember(owner = "client!e", name = "p", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!e", name = "a", descriptor = "(B)V")
    public static void method258(byte arg0) {
        field659 = null;
        field664 = null;
        field661 = null;
        int var1 = 12 % ((arg0 - 20) / 48);
        field662 = null;
        field658 = null;
        field660 = null;
    }

    @OriginalMember(owner = "client!e", name = "<init>", descriptor = "([B)V")
    public class39(byte[] arg0) {
        this.field663 = arg0;
    }
}
