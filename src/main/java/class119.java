import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vj")
public class class119 {

    @OriginalMember(owner = "client!vj", name = "c", descriptor = "[I")
    public static int[] field2064 = new int[2048];

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "Lfa;")
    public static class218 field2062 = new class218();

    @OriginalMember(owner = "client!vj", name = "e", descriptor = "Lid;")
    public static class282 field2066 = new class282(0, 0);

    @OriginalMember(owner = "client!vj", name = "g", descriptor = "Ljava/lang/String;")
    public static String field2068 = "flash2:";

    @OriginalMember(owner = "client!vj", name = "f", descriptor = "I")
    public static int field2067 = 0;

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!vj", name = "d", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!vj", name = "h", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!vj", name = "i", descriptor = "Llg;")
    public static class137 field2070;

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(Ljava/lang/String;B)I", line = 7)
    public static final int method1012(String arg0, byte arg1) {
        field2065++;
        if (class222.field3708 == null || arg0.length() == 0) {
            return -1;
        }
        int var2 = 0;
        if (arg1 <= 16) {
            field2062 = (class218) null;
        }
        while (class222.field3708.field4814 > var2) {
            if (class185.method1427(" ", -80, class222.field3708.field4819[var2], "<br>").equals(arg0)) {
                return var2;
            }
            var2++;
        }
        return -1;
    }

    @OriginalMember(owner = "client!vj", name = "a", descriptor = "(I)V", line = 35)
    public static final void method1013(int arg0) {
        int var1 = -75 / ((arg0 - 68) / 56);
        class36.field529.method470(12);
        field2063++;
    }

    @OriginalMember(owner = "client!vj", name = "b", descriptor = "(I)V", line = 46)
    public static void method1014(int arg0) {
        field2062 = null;
        field2070 = null;
        field2068 = null;
        field2066 = null;
        int var1 = -2 / ((arg0 - 52) / 35);
        field2064 = null;
    }
}
