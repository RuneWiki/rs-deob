import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bda")
public class class210 extends class81 {

    @OriginalMember(owner = "client!bda", name = "h", descriptor = "[I")
    public int[] field2688;

    @OriginalMember(owner = "client!bda", name = "i", descriptor = "[I")
    public int[] field2689;

    @OriginalMember(owner = "client!bda", name = "g", descriptor = "Lus;")
    public static class328 field2687 = new class328(9, 1);

    @OriginalMember(owner = "client!bda", name = "j", descriptor = "Lfq;")
    public static class141 field2690 = new class141(0, 2, 2, 1);

    @OriginalMember(owner = "client!bda", name = "m", descriptor = "I")
    public static int field2693 = -1;

    @OriginalMember(owner = "client!bda", name = "l", descriptor = "Lus;")
    public static class328 field2692 = new class328(45, -1);

    @OriginalMember(owner = "client!bda", name = "k", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!bda", name = "n", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!bda", name = "a", descriptor = "(Z)V")
    public static void method1286(boolean arg0) {
        field2690 = null;
        field2687 = null;
        if (arg0) {
            method1286(false);
        }
        field2692 = null;
    }

    @OriginalMember(owner = "client!bda", name = "<init>", descriptor = "(II[I[I)V")
    public class210(int arg0, int arg1, int[] arg2, int[] arg3) {
        this.field2688 = arg2;
        this.field2689 = arg3;
    }
}
