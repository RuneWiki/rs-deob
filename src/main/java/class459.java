import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nu")
public class class459 {

    @OriginalMember(owner = "client!nu", name = "b", descriptor = "I")
    public static int field6269 = 0;

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "[I")
    public static int[] field6268 = new int[13];

    @OriginalMember(owner = "client!nu", name = "d", descriptor = "Z")
    public static boolean field6271 = false;

    @OriginalMember(owner = "client!nu", name = "c", descriptor = "Lin;")
    public static class380 field6270 = new class380(89, 8);

    @OriginalMember(owner = "client!nu", name = "f", descriptor = "Lnea;")
    public static class600 field6273 = new class600(1);

    @OriginalMember(owner = "client!nu", name = "e", descriptor = "I")
    public static int field6272;

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "([BI)Ljava/lang/String;", line = 14)
    public static final String method2683(byte[] arg0, int arg1) {
        field6272++;
        if (arg1 != 8) {
            field6270 = null;
        }
        return class142.method1144(arg0, arg0.length, (byte) -53, 0);
    }

    @OriginalMember(owner = "client!nu", name = "a", descriptor = "(I)V", line = 37)
    public static void method2684(int arg0) {
        field6270 = null;
        field6268 = null;
        field6273 = null;
        if (arg0 < 29) {
            field6268 = null;
        }
    }
}
