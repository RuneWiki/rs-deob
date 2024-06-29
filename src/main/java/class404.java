import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class404 {

    @OriginalMember(owner = "client!fe", name = "g", descriptor = "J")
    public long field5993;

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "Lkd;")
    private class188 field5992;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "I")
    public static int field5987 = 0;

    @OriginalMember(owner = "client!fe", name = "c", descriptor = "I")
    public static int field5989 = 1403;

    @OriginalMember(owner = "client!fe", name = "b", descriptor = "I")
    public static int field5988;

    @OriginalMember(owner = "client!fe", name = "d", descriptor = "I")
    public static int field5990;

    @OriginalMember(owner = "client!fe", name = "e", descriptor = "Lul;")
    public static class406 field5991;

    @OriginalMember(owner = "client!fe", name = "finalize", descriptor = "()V", line = 3)
    protected final void finalize() throws Throwable {
        this.field5992.method1276(this.field5993, 115);
        field5990++;
        super.finalize();
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(I)V", line = 26)
    public static void method2526(int arg0) {
        if (arg0 != 20877) {
            method2526(85);
        }
        field5991 = null;
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "(Lkd;J[Lsn;)V", line = 39)
    public class404(class188 arg0, long arg1, class447[] arg2) {
        this.field5993 = arg1;
        this.field5992 = arg0;
    }
}
