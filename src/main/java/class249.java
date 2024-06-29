import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class249 {

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public static int field2928 = 0;

    @OriginalMember(owner = "client!ec", name = "g", descriptor = "[I")
    public static int[] field2934 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    public int field2929;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public int field2930;

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public static int field2931;

    @OriginalMember(owner = "client!ec", name = "f", descriptor = "I")
    public int field2933;

    @OriginalMember(owner = "client!ec", name = "e", descriptor = "Ljf;")
    public static class229 field2932;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(B)V", line = 9)
    public static void method1494(byte arg0) {
        int var1 = 68 % ((arg0 - 90) / 32);
        field2932 = null;
        field2934 = null;
    }

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "(B)Z", line = 22)
    public static final boolean method1495(byte arg0) {
        if (arg0 != -126) {
            return false;
        }
        field2931++;
        if (class171.field2050) {
            try {
                if ((Boolean) class745.method4171("showingVideoAd", class345.field4331, (byte) 25)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }
}
