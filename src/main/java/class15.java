import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vl")
public class class15 extends class585 {

    @OriginalMember(owner = "client!vl", name = "F", descriptor = "Lfba;")
    public static class27 field291 = new class27(30, 2);

    @OriginalMember(owner = "client!vl", name = "G", descriptor = "[Ljava/lang/String;")
    public static String[] field292 = new String[] { "Sun", "Mon", "Tue", "Wed", "Thu", "Fri", "Sat" };

    @OriginalMember(owner = "client!vl", name = "H", descriptor = "I")
    public static int field293 = 0;

    @OriginalMember(owner = "client!vl", name = "I", descriptor = "[I")
    public static int[] field294 = new int[32];

    @OriginalMember(owner = "client!vl", name = "E", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!vl", name = "c", descriptor = "(I)V")
    public static void method153(int arg0) {
        field292 = null;
        field291 = null;
        field294 = null;
        int var1 = 66 / ((65 - arg0) / 46);
    }

    @OriginalMember(owner = "client!vl", name = "<init>", descriptor = "()V")
    public class15() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vl", name = "b", descriptor = "(II)[I")
    public final int[] method55(int arg0, int arg1) {
        field290++;
        return arg1 < 123 ? null : class581.field8200;
    }
}
