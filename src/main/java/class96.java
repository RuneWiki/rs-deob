import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class96 {

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "Ljava/lang/String;")
    public static String field1555 = "Checking for updates - ";

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "I")
    public static int field1558 = 0;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "I")
    public static int field1553;

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "Z")
    public static boolean field1554;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "[Lkm;")
    public static class230[] field1556;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(JIB[I)Ljava/lang/String;")
    public static final String method681(long arg0, int arg1, byte arg2, int[] arg3) {
        field1557++;
        if (arg2 != -3) {
            method682(103);
        }
        if (class41.field613 != null) {
            String var5 = class41.field613.method1612(arg1, arg0, arg3, true);
            if (var5 != null) {
                return var5;
            }
        }
        return Long.toString(arg0);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(I)V")
    public static void method682(int arg0) {
        field1555 = null;
        field1556 = null;
        if (arg0 != 0) {
            method681(103L, -17, (byte) 105, (int[]) null);
        }
    }
}
