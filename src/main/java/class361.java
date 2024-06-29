import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class361 {

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "[F")
    public static float[] field5192 = new float[2];

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "[I")
    public static int[] field5195 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "[I")
    public static int[] field5193 = new int[] { 0, 4, 3, 3, 1, 1, 3, 5, 1, 5, 3, 6, 4 };

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public static int field5190;

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
    public int field5191;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
    public static int field5196;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "J")
    public static long field5194;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "Ljava/lang/String;")
    public String field5197;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)V", line = 12)
    public static void method2306(byte arg0) {
        field5193 = null;
        field5195 = null;
        if (arg0 != 74) {
            method2306((byte) -2);
        }
        field5192 = null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IZ)Z", line = 24)
    public static final boolean method2307(int arg0, boolean arg1) {
        field5190++;
        if (!arg1) {
            method2307(90, true);
        }
        return arg0 == 3 || arg0 == 5 || arg0 == 6;
    }
}
