import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class169 extends class570 {

    @OriginalMember(owner = "client!os", name = "j", descriptor = "[I")
    public int[] field2929;

    @OriginalMember(owner = "client!os", name = "l", descriptor = "[I")
    public int[] field2931;

    @OriginalMember(owner = "client!os", name = "k", descriptor = "[[I")
    public static int[][] field2930 = new int[][] { { 0, 1, 2, 3 }, { 1, 2, 3, 0 }, { 1, 2, -1, 0 }, { 2, 0, -1, 1 }, { 0, 1, -1, 2 }, { 1, 2, -1, 0 }, { -1, 4, -1, 1 }, { -1, 1, 3, -1 }, { -1, 0, 2, -1 }, { 3, 5, 2, 0 }, { 0, 2, 5, 3 }, { 0, 2, 3, 5 }, { 0, 1, 2, 3 } };

    @OriginalMember(owner = "client!os", name = "n", descriptor = "[Lvh;")
    public static class626[] field2933 = new class626[37];

    @OriginalMember(owner = "client!os", name = "m", descriptor = "I")
    public static int field2932;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Z)V", line = 5)
    public static void method1352(boolean arg0) {
        field2933 = null;
        if (arg0) {
            method1352(true);
        }
        field2930 = null;
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(IIZ)Ljava/lang/String;", line = 25)
    public static final String method1353(int arg0, int arg1, boolean arg2) {
        field2932++;
        if (arg0 <= 87) {
            method1352(true);
        }
        return arg2 && arg1 >= 0 ? class181.method1401(arg1, arg2, 10, -1) : Integer.toString(arg1);
    }

    @OriginalMember(owner = "client!os", name = "<init>", descriptor = "(II[I[I)V", line = 48)
    public class169(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field2929 = arg2;
        this.field2931 = arg3;
    }
}
