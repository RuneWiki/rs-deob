import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public class class131 {

    @OriginalMember(owner = "client!od", name = "a", descriptor = "I")
    public static int field2744 = 0;

    @OriginalMember(owner = "client!od", name = "b", descriptor = "I")
    public static int field2745;

    @OriginalMember(owner = "client!od", name = "c", descriptor = "Lga;")
    public static class58 field2746;

    @OriginalMember(owner = "client!od", name = "d", descriptor = "[S")
    public static short[] field2747;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(Led;B)Z")
    public static final boolean method851(class43 arg0, byte arg1) {
        field2745++;
        if (arg1 > -13) {
            method852(5);
        }
        if (arg0 == null) {
            return false;
        }
        for (int var2 = 0; var2 < class40.field778; var2++) {
            if (arg0.method250(63, class148.field3018[var2])) {
                return true;
            }
        }
        return arg0.method250(63, class67.field1348.field23);
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(I)V")
    public static void method852(int arg0) {
        if (arg0 != 1) {
            method852(123);
        }
        field2747 = null;
        field2746 = null;
    }
}
