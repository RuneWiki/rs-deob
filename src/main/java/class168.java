import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kw")
public class class168 {

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "Z")
    public static boolean field2522 = false;

    @OriginalMember(owner = "client!kw", name = "d", descriptor = "Lqv;")
    public static class316 field2524 = new class316(20, -2);

    @OriginalMember(owner = "client!kw", name = "c", descriptor = "I")
    public static int field2523;

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "[I")
    public static int[] field2521;

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(I)V", line = 4)
    public static final void method1202(int arg0) {
        if (arg0 != 20) {
            field2521 = null;
        }
        field2523++;
        for (class211 var1 = (class211) class153.field2328.method863(-1); var1 != null; var1 = (class211) class153.field2328.method865(-1)) {
            if (var1.field3166) {
                var1.method1421(-47);
            }
        }
        for (class211 var2 = (class211) class293.field4353.method863(-1); var2 != null; var2 = (class211) class293.field4353.method865(-1)) {
            if (var2.field3166) {
                var2.method1421(arg0 - 63);
            }
        }
    }

    @OriginalMember(owner = "client!kw", name = "a", descriptor = "(II)I", line = 36)
    public static int method1203(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "client!kw", name = "b", descriptor = "(I)V", line = 44)
    public static void method1204(int arg0) {
        field2521 = null;
        if (arg0 != -2) {
            field2522 = false;
        }
        field2524 = null;
    }
}
