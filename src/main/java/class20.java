import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class20 {

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public static int field436 = 0;

    @OriginalMember(owner = "client!c", name = "d", descriptor = "I")
    public static int field435 = 127;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "Lsg;")
    public static class169 field437 = class165.method1060("Die Adresse dieses Computers wurde gesperrt)1", 1536);

    @OriginalMember(owner = "client!c", name = "b", descriptor = "Lsg;")
    public static class169 field433 = class165.method1060("headicons_prayer", 1536);

    @OriginalMember(owner = "client!c", name = "h", descriptor = "I")
    public static int field439 = 0;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field432 = new CRC32();

    @OriginalMember(owner = "client!c", name = "j", descriptor = "Lsg;")
    private static class169 field441 = class165.method1060("skill)2", 1536);

    @OriginalMember(owner = "client!c", name = "i", descriptor = "Lsg;")
    public static class169 field440 = field441;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "Lud;")
    public static class184 field438;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "Ljava/lang/String;")
    public static String field442;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V")
    public static void method140(int arg0) {
        field438 = null;
        field442 = null;
        field440 = null;
        field432 = null;
        field433 = null;
        field441 = null;
        field437 = null;
        if (arg0 >= -93) {
            method140(-48);
        }
    }
}
