import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class186 {

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "[F")
    public static float[] field2109 = new float[4];

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "[Lpd;")
    public static class432[] field2112 = new class432[2048];

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "F")
    public static float field2110;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "Lbaa;")
    public static class591 field2113;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V")
    public static void method1130(int arg0) {
        field2112 = null;
        field2113 = null;
        if (arg0 != 0) {
            method1131((byte) -1, -120, 76);
        }
        field2109 = null;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BII)Z")
    public static final boolean method1131(byte arg0, int arg1, int arg2) {
        if (arg0 != 34) {
            method1131((byte) -52, 29, -113);
        }
        field2111++;
        return (arg1 & 0x10) != 0;
    }
}
