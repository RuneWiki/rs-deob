import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class195 extends class173 {

    @OriginalMember(owner = "client!ir", name = "t", descriptor = "Lrea;")
    public class127 field2705;

    @OriginalMember(owner = "client!ir", name = "v", descriptor = "[I")
    public static int[] field2707 = new int[4096];

    @OriginalMember(owner = "client!ir", name = "u", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field2706 = new CRC32();

    @OriginalMember(owner = "client!ir", name = "r", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!ir", name = "s", descriptor = "I")
    public static int field2704;

    @OriginalMember(owner = "client!ir", name = "w", descriptor = "I")
    public static int field2708;

    @OriginalMember(owner = "client!ir", name = "x", descriptor = "[I")
    public static int[] field2709;

    @OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Lrea;)V", line = 7)
    public class195(class127 arg0) {
        this.field2705 = arg0;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)V", line = 19)
    public static void method1350(int arg0) {
        field2709 = null;
        field2706 = null;
        if (arg0 == 4096) {
            field2707 = null;
        }
    }
}
