import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vp")
public class class173 {

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "[I")
    public static int[] field2867 = new int[1];

    @OriginalMember(owner = "client!vp", name = "c", descriptor = "F")
    public static float field2869;

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!vp", name = "d", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!vp", name = "e", descriptor = "Lrfa;")
    public static class184 field2871;

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(I)[Lj;", line = 10)
    public static final class502[] method1412(int arg0) {
        field2870++;
        if (arg0 > -123) {
            field2871 = null;
        }
        return new class502[] { class159.field2715, class499.field7326, class629.field8875 };
    }

    @OriginalMember(owner = "client!vp", name = "b", descriptor = "(I)V", line = 48)
    public static void method1413(int arg0) {
        field2871 = null;
        if (arg0 == -1) {
            field2867 = null;
        }
    }

    @OriginalMember(owner = "client!vp", name = "a", descriptor = "(II)V", line = 62)
    public static final void method1414(int arg0, int arg1) {
        field2868++;
        class204.field3329 = arg1;
        class516.field7497 = -1;
        class471.field6976 = 3;
        class442.field6729 = 100;
        if (arg0 != 1) {
            method1414(51, 20);
        }
    }
}
