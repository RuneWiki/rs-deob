import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!daa")
public class class406 {

    @OriginalMember(owner = "client!daa", name = "b", descriptor = "F")
    public static float field5162;

    @OriginalMember(owner = "client!daa", name = "c", descriptor = "I")
    public int field5163;

    @OriginalMember(owner = "client!daa", name = "e", descriptor = "I")
    public int field5165;

    @OriginalMember(owner = "client!daa", name = "f", descriptor = "I")
    public static int field5166;

    @OriginalMember(owner = "client!daa", name = "g", descriptor = "I")
    public int field5167;

    @OriginalMember(owner = "client!daa", name = "h", descriptor = "I")
    public int field5168;

    @OriginalMember(owner = "client!daa", name = "i", descriptor = "I")
    public int field5169;

    @OriginalMember(owner = "client!daa", name = "j", descriptor = "I")
    public int field5170;

    @OriginalMember(owner = "client!daa", name = "k", descriptor = "I")
    public int field5171;

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "[B")
    public byte[] field5161;

    @OriginalMember(owner = "client!daa", name = "d", descriptor = "[B")
    public byte[] field5164;

    @OriginalMember(owner = "client!daa", name = "a", descriptor = "(Ljava/io/File;B)[B")
    public static final byte[] method2301(File arg0, byte arg1) {
        if (arg1 >= -126) {
            return null;
        } else {
            field5166++;
            return class565.method3020((byte) 70, (int) arg0.length(), arg0);
        }
    }
}
