import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ab")
public class class166 {

    @OriginalMember(owner = "client!ab", name = "c", descriptor = "I")
    public static int field2564 = -1;

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2563 = "Connected to update server";

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!ab", name = "d", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!ab", name = "e", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!ab", name = "g", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!ab", name = "f", descriptor = "Lnk;")
    public static class16 field2567;

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(B)V", line = 14)
    public static void method1184(byte arg0) {
        field2567 = null;
        if (arg0 >= 16) {
            field2563 = null;
        }
    }

    @OriginalMember(owner = "client!ab", name = "a", descriptor = "(IBI)V", line = 32)
    public static final void method1185(int arg0, byte arg1, int arg2) {
        if (arg1 != -2) {
            field2564 = 18;
        }
        class328.field5282.method304(86, 19830);
        class328.field5282.method1016(arg1 + 97, arg2);
        class328.field5282.method1049(arg0, (byte) -108);
        field2565++;
        class180.field2714++;
    }

    @OriginalMember(owner = "client!ab", name = "b", descriptor = "(B)V", line = 52)
    public static final void method1186(byte arg0) {
        class122.field1686.method383((byte) -48);
        int var1 = 64 / ((arg0 + 51) / 58);
        field2566++;
    }
}
