import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ca")
public class class5 {

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "Lia;")
    public static class15 field43 = class28.method196("Please wait)3)3)3 Rendering Map", false);

    @OriginalMember(owner = "mapview!ca", name = "b", descriptor = "[[B")
    public static byte[][] field44 = new byte[50][];

    @OriginalMember(owner = "mapview!ca", name = "c", descriptor = "I")
    public static volatile int field45 = 0;

    @OriginalMember(owner = "mapview!ca", name = "d", descriptor = "Lia;")
    public static class15 field46 = class28.method196("Skirt Shop", false);

    @OriginalMember(owner = "mapview!ca", name = "e", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "mapview!ca", name = "a", descriptor = "(B)J", line = 6)
    public static final synchronized long method24(byte arg0) {
        long var1 = System.currentTimeMillis();
        if (class25.field360 > var1) {
            class35.field489 += class25.field360 - var1;
        }
        if (arg0 <= 6) {
            field44 = null;
        }
        class25.field360 = var1;
        return class35.field489 + var1;
    }

    @OriginalMember(owner = "mapview!ca", name = "b", descriptor = "(B)V", line = 26)
    public static void method25(byte arg0) {
        field46 = null;
        if (arg0 == -31) {
            field43 = null;
            field44 = null;
        }
    }
}
