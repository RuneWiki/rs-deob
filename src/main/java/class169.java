import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class169 {

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field2061 = new String[100];

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    public static int field2059 = 0;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "Z")
    public static boolean field2063 = false;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    public static int field2064 = -1;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "Lta;")
    public static class181 field2060;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IILjava/lang/String;)V", line = 7)
    public static final void method969(int arg0, int arg1, String arg2) {
        field2062++;
        class467 var3 = class541.method3144(arg0, (byte) -126, arg1);
        var3.method2851(true);
        var3.field6933 = arg2;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V", line = 31)
    public static void method970(int arg0) {
        field2060 = null;
        if (arg0 != 0) {
            method970(-115);
        }
        field2061 = null;
    }
}
