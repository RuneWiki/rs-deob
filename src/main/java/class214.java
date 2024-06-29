import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class214 extends class76 {

    @OriginalMember(owner = "client!sa", name = "n", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field3083 = new CRC32();

    @OriginalMember(owner = "client!sa", name = "q", descriptor = "Lhf;")
    public static class413 field3086 = new class413();

    @OriginalMember(owner = "client!sa", name = "m", descriptor = "I")
    public static int field3082;

    @OriginalMember(owner = "client!sa", name = "o", descriptor = "Lsa;")
    public class214 field3084;

    @OriginalMember(owner = "client!sa", name = "s", descriptor = "Lsa;")
    public class214 field3088;

    @OriginalMember(owner = "client!sa", name = "r", descriptor = "Lcb;")
    public static class544 field3087;

    @OriginalMember(owner = "client!sa", name = "p", descriptor = "Lip;")
    public static class734 field3085;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(I)V", line = 3)
    public static void method1494(int arg0) {
        field3085 = null;
        field3086 = null;
        if (arg0 == 27276) {
            field3087 = null;
            field3083 = null;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(B)V", line = 17)
    public final void method1495(byte arg0) {
        field3082++;
        if (this.field3088 == null) {
            return;
        }
        if (arg0 >= -91) {
            method1494(53);
        }
        this.field3088.field3084 = this.field3084;
        this.field3084.field3088 = this.field3088;
        this.field3088 = null;
        this.field3084 = null;
    }
}
