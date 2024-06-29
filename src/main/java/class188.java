import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class188 extends class147 {

    @OriginalMember(owner = "client!ka", name = "p", descriptor = "I")
    public int field2961;

    @OriginalMember(owner = "client!ka", name = "q", descriptor = "Lih;")
    public static class32 field2962 = new class32();

    @OriginalMember(owner = "client!ka", name = "t", descriptor = "[I")
    public static int[] field2965 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!ka", name = "s", descriptor = "I")
    public static int field2964;

    @OriginalMember(owner = "client!ka", name = "u", descriptor = "I")
    public static int field2966;

    @OriginalMember(owner = "client!ka", name = "r", descriptor = "[I")
    public static int[] field2963;

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "()V", line = 3)
    public class188() {
    }

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "(I)V", line = 13)
    public static void method1287(int arg0) {
        field2963 = null;
        field2962 = null;
        if (arg0 == 1) {
            field2965 = null;
        }
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(I)V", line = 25)
    public class188(int arg0) {
        this.field2961 = arg0;
    }

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "(II)V", line = 39)
    public static final void method1288(int arg0, int arg1) {
        if (class38.field621 == arg1 && arg1 != 0) {
            class91 var2 = class9.field121[arg1];
            var2.method16(class135.field2069);
        }
        if (arg0 != -32584) {
            method1288(60, 23);
        }
        field2964++;
    }
}
