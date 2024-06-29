import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class175 {

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "[J")
    public static long[] field2842 = new long[32];

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
    public static int field2845 = 0;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "F")
    public static float field2847;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
    public static int field2841;

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "I")
    public static int field2843;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "I")
    public static int field2844;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
    public static int field2849;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "Lth;")
    public class126 field2846;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "Lka;")
    public class279 field2840;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "Lmh;")
    public static class65 field2848;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIZ)I", line = 19)
    public static final int method1255(int arg0, int arg1, boolean arg2) {
        if (arg2) {
            return -103;
        } else {
            field2843++;
            int var3 = arg0 - 1 & arg1 >> 31;
            return ((arg1 >>> 31) + arg1) % arg0 + var3;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(B)V", line = 49)
    public static void method1256(byte arg0) {
        if (arg0 > -65) {
            method1256((byte) 13);
        }
        field2848 = null;
        field2842 = null;
    }
}
