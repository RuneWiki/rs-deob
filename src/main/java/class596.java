import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class596 {

    @OriginalMember(owner = "client!on", name = "b", descriptor = "Lqba;")
    private class540 field8782;

    @OriginalMember(owner = "client!on", name = "c", descriptor = "I")
    public int field8783;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "Lqp;")
    public static class586 field8781 = new class586(54, 3);

    @OriginalMember(owner = "client!on", name = "d", descriptor = "I")
    public static int field8784;

    @OriginalMember(owner = "client!on", name = "a", descriptor = "(I)V")
    public static void method3459(int arg0) {
        field8781 = null;
        if (arg0 != 3) {
            field8781 = null;
        }
    }

    @OriginalMember(owner = "client!on", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field8784++;
        this.field8782.method3170((byte) -62, this.field8783);
        super.finalize();
    }

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Lqba;II)V")
    public class596(class540 arg0, int arg1, int arg2) {
        this.field8782 = arg0;
        this.field8783 = arg2;
    }
}
