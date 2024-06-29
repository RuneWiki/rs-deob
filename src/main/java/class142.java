import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class142 extends class261 {

    @OriginalMember(owner = "client!lg", name = "l", descriptor = "Lgl;")
    public static class432 field2060 = new class432("", 13);

    @OriginalMember(owner = "client!lg", name = "m", descriptor = "[[I")
    public static int[][] field2061 = new int[6][];

    @OriginalMember(owner = "client!lg", name = "i", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!lg", name = "j", descriptor = "I")
    public static int field2058;

    @OriginalMember(owner = "client!lg", name = "k", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(I)Z", line = 11)
    public static final boolean method949(int arg0) {
        field2059++;
        if (arg0 != 10680) {
            field2057 = 48;
        }
        if (class197.field2784) {
            try {
                if ((Boolean) class131.method841(class419.field6254.field6861, -14144, "showingVideoAd")) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Z)V", line = 30)
    public static void method950(boolean arg0) {
        if (!arg0) {
            field2061 = null;
            field2060 = null;
        }
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ILjava/lang/String;)I", line = 46)
    public static final int method951(int arg0, String arg1) {
        field2058++;
        if (arg0 >= -4) {
            method950(true);
        }
        return arg1.length() + 1;
    }
}
