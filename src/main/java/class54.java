import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gda")
public class class54 {

    @OriginalMember(owner = "client!gda", name = "b", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field658 = new CRC32();

    @OriginalMember(owner = "client!gda", name = "c", descriptor = "Lkaa;")
    public static class47 field659 = new class47(37, 7);

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "[[[Z")
    public static boolean[][][] field657;

    @OriginalMember(owner = "client!gda", name = "a", descriptor = "(B)V", line = 9)
    public static void method369(byte arg0) {
        field659 = null;
        field658 = null;
        if (arg0 <= -33) {
            field657 = null;
        }
    }
}
