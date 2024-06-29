import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nfa")
public class class680 {

    @OriginalMember(owner = "client!nfa", name = "b", descriptor = "J")
    public long field9499;

    @OriginalMember(owner = "client!nfa", name = "e", descriptor = "Lrda;")
    private class663 field9502;

    @OriginalMember(owner = "client!nfa", name = "d", descriptor = "Lku;")
    public static class380 field9501 = new class380();

    @OriginalMember(owner = "client!nfa", name = "f", descriptor = "I")
    public static int field9503 = 0;

    @OriginalMember(owner = "client!nfa", name = "h", descriptor = "I")
    public static int field9505 = 0;

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "I")
    public static int field9498;

    @OriginalMember(owner = "client!nfa", name = "c", descriptor = "I")
    public static int field9500;

    @OriginalMember(owner = "client!nfa", name = "g", descriptor = "Lwu;")
    public static class376 field9504;

    @OriginalMember(owner = "client!nfa", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field9498++;
        this.field9502.method3596(this.field9499, true);
        super.finalize();
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(Z)V")
    public static void method3842(boolean arg0) {
        field9501 = null;
        if (!arg0) {
            field9504 = null;
        }
        field9504 = null;
    }

    @OriginalMember(owner = "client!nfa", name = "a", descriptor = "(IB)Z")
    public static final boolean method3843(int arg0, byte arg1) {
        if (arg1 <= 91) {
            field9505 = 21;
        }
        field9500++;
        return arg0 == 7 || arg0 == 9;
    }

    @OriginalMember(owner = "client!nfa", name = "<init>", descriptor = "(Lrda;J[Lcba;)V")
    public class680(class663 arg0, long arg1, class551[] arg2) {
        this.field9499 = arg1;
        this.field9502 = arg0;
    }
}
