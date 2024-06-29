import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class151 {

    @OriginalMember(owner = "client!id", name = "c", descriptor = "Z")
    public static boolean field2373 = false;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!id", name = "b", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!id", name = "d", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(II)Z")
    public static final boolean method1017(int arg0, int arg1) {
        class221.field3401 = arg0 + arg1 & 0xFFFF;
        field2374++;
        class55.field911 = true;
        return true;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(III)V")
    public static final void method1018(int arg0, int arg1, int arg2) {
        field2371++;
        if (class53.method394(false, arg2)) {
            class62.method466(arg1, class193.field3052[arg2], true);
            if (arg0 >= -8) {
                method1017(67, 70);
            }
        }
    }
}
