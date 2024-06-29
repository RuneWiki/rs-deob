import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class649 {

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "Lfha;")
    private class378 field8917;

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "J")
    public long field8918;

    @OriginalMember(owner = "client!pl", name = "c", descriptor = "Ldv;")
    public static class657 field8919 = new class657(16);

    @OriginalMember(owner = "client!pl", name = "f", descriptor = "I")
    public static int field8922 = -1;

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "I")
    public static int field8920;

    @OriginalMember(owner = "client!pl", name = "e", descriptor = "I")
    public static int field8921;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)V")
    public static void method3577(byte arg0) {
        field8919 = null;
        if (arg0 != -114) {
            method3577((byte) 118);
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(DB)V")
    public static final void method3578(double arg0, byte arg1) {
        field8920++;
        int var3 = -82 % ((arg1 + 73) / 49);
        class363.field5149.method344(class210.field2759);
        class363.field5149.method360(0, 0, (int) arg0);
        class263.field3799.method483(class363.field5149);
    }

    @OriginalMember(owner = "client!pl", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.field8917.method2369(this.field8918, (byte) -107);
        field8921++;
        super.finalize();
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "(Lfha;JI)V")
    public class649(class378 arg0, long arg1, int arg2) {
        this.field8917 = arg0;
        this.field8918 = arg1;
    }
}
