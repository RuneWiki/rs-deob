import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public class class130 {

    @OriginalMember(owner = "client!hw", name = "b", descriptor = "[[I")
    public static int[][] field1945 = new int[6][];

    @OriginalMember(owner = "client!hw", name = "d", descriptor = "I")
    public static int field1947 = 0;

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "Lqe;")
    public static class465 field1944 = new class465(47, -1);

    @OriginalMember(owner = "client!hw", name = "e", descriptor = "I")
    public static int field1948 = 0;

    @OriginalMember(owner = "client!hw", name = "h", descriptor = "Z")
    public static boolean field1951 = false;

    @OriginalMember(owner = "client!hw", name = "g", descriptor = "I")
    public static int field1950 = 0;

    @OriginalMember(owner = "client!hw", name = "c", descriptor = "I")
    public static int field1946;

    @OriginalMember(owner = "client!hw", name = "f", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(B)V", line = 5)
    public static final void method996(byte arg0) {
        field1946++;
        int var1 = 0;
        if (arg0 <= 45) {
            return;
        }
        for (int var2 = 0; var2 < class174.field2540; var2++) {
            for (int var3 = 0; var3 < class716.field9999; var3++) {
                if (class698.method3918(true, class390.field5454, var3, var2, 13882, var1)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(III)Lcu;", line = 45)
    public static final class217 method997(int arg0, int arg1, int arg2) {
        class416 var3 = class390.field5454[arg0][arg1][arg2];
        return var3 == null ? null : var3.field5844;
    }

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(Z)V", line = 57)
    public static void method998(boolean arg0) {
        if (!arg0) {
            field1944 = null;
            field1945 = null;
        }
    }
}
