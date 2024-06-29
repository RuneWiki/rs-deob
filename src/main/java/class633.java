import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!laa")
public class class633 {

    @OriginalMember(owner = "client!laa", name = "e", descriptor = "J")
    public long field8883;

    @OriginalMember(owner = "client!laa", name = "b", descriptor = "Lqj;")
    private class548 field8880;

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "I")
    public static int field8879;

    @OriginalMember(owner = "client!laa", name = "d", descriptor = "I")
    public static int field8882;

    @OriginalMember(owner = "client!laa", name = "c", descriptor = "Lmf;")
    public static class72 field8881;

    @OriginalMember(owner = "client!laa", name = "f", descriptor = "[I")
    public static int[] field8884;

    @OriginalMember(owner = "client!laa", name = "a", descriptor = "(Z)V")
    public static void method3542(boolean arg0) {
        field8881 = null;
        if (arg0) {
            field8884 = null;
        }
    }

    @OriginalMember(owner = "client!laa", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field8882++;
        this.field8880.method2976(this.field8883, 33);
        super.finalize();
    }

    @OriginalMember(owner = "client!laa", name = "<init>", descriptor = "(Lqj;J[Laf;)V")
    public class633(class548 arg0, long arg1, class165[] arg2) {
        this.field8883 = arg1;
        this.field8880 = arg0;
    }
}
