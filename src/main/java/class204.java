import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aj")
public class class204 {

    @OriginalMember(owner = "client!aj", name = "b", descriptor = "Lvp;")
    public static class123 field2941 = new class123(26, 7);

    @OriginalMember(owner = "client!aj", name = "c", descriptor = "J")
    public static long field2942 = 0L;

    @OriginalMember(owner = "client!aj", name = "g", descriptor = "[I")
    public static int[] field2946 = new int[5];

    @OriginalMember(owner = "client!aj", name = "f", descriptor = "[F")
    public static float[] field2945 = new float[4];

    @OriginalMember(owner = "client!aj", name = "h", descriptor = "Lsv;")
    public static class467 field2947 = new class467(4, 1, 1, 1);

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "I")
    public static int field2940;

    @OriginalMember(owner = "client!aj", name = "d", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!aj", name = "e", descriptor = "Lig;")
    public static class160 field2944;

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(IIB)Z")
    public static final boolean method1369(int arg0, int arg1, byte arg2) {
        field2940++;
        if (arg2 >= -73) {
            return false;
        } else {
            return (arg1 & 0x10) != 0;
        }
    }

    @OriginalMember(owner = "client!aj", name = "a", descriptor = "(I)V")
    public static void method1370(int arg0) {
        field2946 = null;
        field2944 = null;
        field2945 = null;
        if (arg0 != -31263) {
            method1370(-58);
        }
        field2947 = null;
        field2941 = null;
    }
}
