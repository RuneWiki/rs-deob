import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!da")
public class class113 {

    @OriginalMember(owner = "client!da", name = "d", descriptor = "Lcd;")
    public static class64 field2083 = class44.method335((byte) 71, ": ");

    @OriginalMember(owner = "client!da", name = "e", descriptor = "I")
    public static int field2084 = 0;

    @OriginalMember(owner = "client!da", name = "c", descriptor = "I")
    public static int field2082 = -1;

    @OriginalMember(owner = "client!da", name = "f", descriptor = "Lcd;")
    private static class64 field2085 = class44.method335((byte) 71, "Please wait )2 attempting to reestablish)3");

    @OriginalMember(owner = "client!da", name = "j", descriptor = "I")
    public static volatile int field2089 = 0;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "Lcd;")
    public static class64 field2080 = field2085;

    @OriginalMember(owner = "client!da", name = "b", descriptor = "I")
    public static int field2081;

    @OriginalMember(owner = "client!da", name = "g", descriptor = "I")
    public static int field2086;

    @OriginalMember(owner = "client!da", name = "h", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!da", name = "m", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!da", name = "i", descriptor = "[I")
    public static int[] field2088;

    @OriginalMember(owner = "client!da", name = "k", descriptor = "[I")
    public static int[] field2090;

    @OriginalMember(owner = "client!da", name = "l", descriptor = "[Lri;")
    public static class63[] field2091;

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(Z)V", line = 33)
    public static void method810(boolean arg0) {
        field2080 = null;
        if (!arg0) {
            field2083 = (class64) null;
        }
        field2083 = null;
        field2090 = null;
        field2091 = null;
        field2085 = null;
        field2088 = null;
    }

    @OriginalMember(owner = "client!da", name = "a", descriptor = "(II)I", line = 57)
    public static final int method811(int arg0, int arg1) {
        if (arg1 < 23) {
            return 121;
        } else {
            field2092++;
            return arg0 >>> 7;
        }
    }
}
