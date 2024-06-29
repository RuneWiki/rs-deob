import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class332 extends class626 {

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "I")
    public int field4683;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
    public int field4685;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "Lqaa;")
    public static class27 field4682 = new class27(24, 7);

    @OriginalMember(owner = "client!bb", name = "m", descriptor = "[I")
    public static int[] field4687 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "Ldl;")
    public static class62 field4686;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "[I")
    public static int[] field4684;

    @OriginalMember(owner = "client!bb", name = "<init>", descriptor = "(II)V")
    public class332(int arg0, int arg1) {
        this.field4683 = arg1;
        this.field4685 = arg0;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(B)V")
    public static void method2120(byte arg0) {
        field4686 = null;
        field4687 = null;
        if (arg0 > -68) {
            field4682 = null;
        }
        field4682 = null;
        field4684 = null;
    }
}
