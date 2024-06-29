import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class157 {

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "Lmb;")
    public static class132 field2853 = class166.method1092("::errortest", 126);

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "Lmb;")
    public static class132 field2856 = class166.method1092("(U5", 120);

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field2855;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    public static int field2858;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "Lpb;")
    public static class165 field2854;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "[I")
    public static int[] field2857;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
    public static void method1022(byte arg0) {
        if (arg0 > 57) {
            field2854 = null;
            field2857 = null;
            field2853 = null;
            field2856 = null;
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)Lrb;")
    public static final class186 method1023(int arg0, int arg1, int arg2) {
        class169 var3 = class101.field1900[arg0][arg1][arg2];
        return var3 == null ? null : var3.field3098;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lpb;BLmb;Lpb;Lmb;)Lji;")
    public static final class107 method1024(class165 arg0, byte arg1, class132 arg2, class165 arg3, class132 arg4) {
        if (arg1 >= -53) {
            method1023(57, -127, -102);
        }
        field2855++;
        int var5 = arg0.method1065(arg4, -1);
        int var6 = arg0.method1090(-1, arg2, var5);
        return class49.method326(arg3, -4, arg0, var5, var6);
    }
}
