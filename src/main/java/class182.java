import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wd")
public class class182 {

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "Z")
    public static boolean field2720 = false;

    @OriginalMember(owner = "client!wd", name = "d", descriptor = "I")
    public static int field2723 = -2;

    @OriginalMember(owner = "client!wd", name = "e", descriptor = "Lhn;")
    public static class509 field2724 = new class509(67, 10);

    @OriginalMember(owner = "client!wd", name = "b", descriptor = "I")
    public static int field2721;

    @OriginalMember(owner = "client!wd", name = "c", descriptor = "[[B")
    public static byte[][] field2722;

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "(I)V", line = 11)
    public static void method1211(int arg0) {
        if (arg0 > -105) {
            method1212(null, -64);
        }
        field2724 = null;
        field2722 = null;
    }

    @OriginalMember(owner = "client!wd", name = "a", descriptor = "([BI)Z", line = 25)
    public static final boolean method1212(byte[] arg0, int arg1) {
        field2721++;
        class217 var2 = new class217(arg0);
        int var3 = var2.method1515((byte) 125);
        if (var3 != 2) {
            return false;
        }
        boolean var4 = var2.method1515((byte) 126) == 1;
        if (arg1 != 10) {
            field2720 = false;
        }
        if (var4) {
            class376.method2360(109, var2);
        }
        class433.method2684(true, var2);
        return true;
    }
}
