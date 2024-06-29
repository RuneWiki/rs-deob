import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class198 {

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "Lqd;")
    public static class173 field3184 = new class173(16);

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3188 = " from your ignore list first.";

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public static int field3185;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public static int field3187;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "Ljg;")
    public static class168 field3191;

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "Ldk;")
    public static class251 field3189;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "Z")
    public static boolean field3186;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "[I")
    public static int[] field3190;

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(I)V")
    public static void method1383(int arg0) {
        field3184 = null;
        field3190 = null;
        field3188 = null;
        field3191 = null;
        field3189 = null;
        if (arg0 != 31) {
            field3191 = null;
        }
    }

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "(I)Z")
    public static final boolean method1384(int arg0) {
        field3185++;
        if (class281.field4493) {
            try {
                class297.method1967(false, "showVideoAd", class268.field4323.field751);
                return true;
            } catch (Throwable var1) {
            }
        }
        if (arg0 != -11559) {
            field3189 = null;
        }
        return false;
    }
}
