import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!al")
public class class67 {

    @OriginalMember(owner = "client!al", name = "b", descriptor = "[I")
    public static int[] field1120 = new int[] { 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 99, 120 };

    @OriginalMember(owner = "client!al", name = "d", descriptor = "I")
    public static int field1122 = 0;

    @OriginalMember(owner = "client!al", name = "c", descriptor = "Lqt;")
    public static class459 field1121 = new class459(27, 11);

    @OriginalMember(owner = "client!al", name = "a", descriptor = "I")
    public static int field1119;

    @OriginalMember(owner = "client!al", name = "e", descriptor = "Ljk;")
    public static class456 field1123;

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(I)V")
    public static void method532(int arg0) {
        field1121 = null;
        field1120 = null;
        field1123 = null;
        if (arg0 != 99) {
            field1120 = null;
        }
    }

    @OriginalMember(owner = "client!al", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;)Ljava/lang/String;")
    public static final String method533(String arg0, boolean arg1, String arg2, String arg3) {
        field1119++;
        if (arg1) {
            field1123 = null;
        }
        for (int var4 = arg2.indexOf(arg3); var4 != -1; var4 = arg2.indexOf(arg3, var4 + arg0.length())) {
            arg2 = arg2.substring(0, var4) + arg0 + arg2.substring(arg3.length() + var4);
        }
        return arg2;
    }
}
