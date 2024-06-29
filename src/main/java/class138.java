import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class138 {

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "[J")
    public static long[] field2884 = new long[100];

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "Lia;")
    public static class73 field2883 = new class73();

    @OriginalMember(owner = "client!pd", name = "c", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!pd", name = "d", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(II)V")
    public static final void method992(int arg0, int arg1) {
        field2885++;
        for (class53 var2 = (class53) class150.field3098.method177(123); var2 != null; var2 = (class53) class150.field3098.method185((byte) 63)) {
            if ((long) arg0 == (var2.field2172 >> 48 & 0xFFFFL)) {
                var2.method805(false);
            }
        }
        if (arg1 <= 6) {
            field2883 = null;
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V")
    public static void method993(int arg0) {
        field2883 = null;
        field2884 = null;
        int var1 = 39 / ((arg0 - 54) / 61);
    }
}
