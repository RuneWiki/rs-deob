import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class205 {

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "I")
    public int field2683;

    @OriginalMember(owner = "client!ru", name = "b", descriptor = "Lpa;")
    private class391 field2684;

    @OriginalMember(owner = "client!ru", name = "e", descriptor = "[C")
    public static char[] field2687 = new char[] { '[', ']', '#' };

    @OriginalMember(owner = "client!ru", name = "c", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!ru", name = "f", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!ru", name = "d", descriptor = "[Lvv;")
    public static class345[] field2686;

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(I)V", line = 8)
    public static void method1377(int arg0) {
        if (arg0 != -24265) {
            field2687 = null;
        }
        field2686 = null;
        field2687 = null;
    }

    @OriginalMember(owner = "client!ru", name = "finalize", descriptor = "()V", line = 22)
    protected final void finalize() throws Throwable {
        field2688++;
        this.field2684.method2475(this.field2683, (byte) 125);
        super.finalize();
    }

    @OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(Lpa;II)V", line = 34)
    public class205(class391 arg0, int arg1, int arg2) {
        this.field2683 = arg2;
        this.field2684 = arg0;
    }
}
