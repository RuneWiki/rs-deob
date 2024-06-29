import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class190 {

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2811 = "Hidden";

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "[I")
    public static int[] field2813 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "Z")
    public static boolean field2815 = false;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "I")
    public static int field2810;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "I")
    public static int field2814;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "I")
    public static int field2817;

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "Lba;")
    public static class157 field2816;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "[Ldj;")
    public static class138[] field2812;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lhc;I)Ljava/lang/String;")
    public static final String method1350(class53 arg0, int arg1) {
        field2817++;
        return arg1 == 14258 ? class161.method1165(32767, 7128, arg0) : null;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V")
    public static void method1351(int arg0) {
        field2816 = null;
        field2812 = null;
        field2811 = null;
        field2813 = null;
        if (arg0 != -1) {
            method1351(1);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ILlc;II)[Lbc;")
    public static final class148[] method1352(int arg0, class270 arg1, int arg2, int arg3) {
        field2814++;
        if (arg3 != 4) {
            field2815 = false;
        }
        return class144.method1079(arg0, arg1, arg2, (byte) 59) ? class68.method513(0) : null;
    }
}
