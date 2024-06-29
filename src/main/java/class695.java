import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ft")
public class class695 {

    @OriginalMember(owner = "client!ft", name = "e", descriptor = "Lkw;")
    private class346 field9829;

    @OriginalMember(owner = "client!ft", name = "f", descriptor = "I")
    public int field9830;

    @OriginalMember(owner = "client!ft", name = "b", descriptor = "I")
    public static int field9826 = 0;

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "Llc;")
    public static class435 field9825 = new class435(75, -2);

    @OriginalMember(owner = "client!ft", name = "c", descriptor = "I")
    public static int field9827;

    @OriginalMember(owner = "client!ft", name = "d", descriptor = "I")
    public static int field9828;

    @OriginalMember(owner = "client!ft", name = "g", descriptor = "I")
    public static int field9831;

    @OriginalMember(owner = "client!ft", name = "h", descriptor = "I")
    public static int field9832;

    @OriginalMember(owner = "client!ft", name = "i", descriptor = "Let;")
    public static class415 field9833;

    @OriginalMember(owner = "client!ft", name = "<init>", descriptor = "(Lkw;II)V")
    public class695(class346 arg0, int arg1, int arg2) {
        this.field9829 = arg0;
        this.field9830 = arg2;
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(B)I")
    public static final int method3915(byte arg0) {
        field9828++;
        if (class270.field3833 == 1) {
            return class677.field9619;
        } else if (arg0 == 86) {
            return 0;
        } else {
            return 3;
        }
    }

    @OriginalMember(owner = "client!ft", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field9827++;
        this.field9829.method2126(this.field9830, -4);
        super.finalize();
    }

    @OriginalMember(owner = "client!ft", name = "a", descriptor = "(Z)V")
    public static void method3916(boolean arg0) {
        field9833 = null;
        if (!arg0) {
            field9825 = null;
        }
    }
}
