import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class187 {

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "Ljava/util/zip/CRC32;")
    public static CRC32 field3348 = new CRC32();

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "Lkh;")
    public static class117 field3352 = class224.method1450((byte) -112, "Bitte versuchen Sie es in ");

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "I")
    public static int field3349 = 0;

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "I")
    public static int field3353 = 0;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "Lkh;")
    public static class117 field3354 = null;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "I")
    public static int field3347;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "Lth;")
    public static class216 field3350;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "Lwb;")
    public static class241 field3351;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V")
    public static void method1268(byte arg0) {
        field3354 = null;
        field3351 = null;
        field3348 = null;
        field3352 = null;
        field3350 = null;
        if (arg0 != -66) {
            field3352 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(Lah;B)I")
    public static final int method1269(class9 arg0, byte arg1) {
        field3347++;
        class123 var2 = (class123) class184.field3306.method460(((long) arg0.field218 << 32) + (long) arg0.field239, arg1 + -15);
        if (arg1 != 16) {
            field3350 = null;
        }
        return var2 == null ? arg0.field166 : var2.field2304;
    }
}
