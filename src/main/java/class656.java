import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class656 {

    @OriginalMember(owner = "client!fk", name = "c", descriptor = "J")
    public long field9193;

    @OriginalMember(owner = "client!fk", name = "g", descriptor = "Lno;")
    private class704 field9197;

    @OriginalMember(owner = "client!fk", name = "d", descriptor = "Lmia;")
    public static class63 field9194 = new class63(31, -1);

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "I")
    public static int field9191;

    @OriginalMember(owner = "client!fk", name = "b", descriptor = "I")
    public static int field9192;

    @OriginalMember(owner = "client!fk", name = "e", descriptor = "I")
    public static int field9195;

    @OriginalMember(owner = "client!fk", name = "f", descriptor = "Lqq;")
    public static class477 field9196;

    @OriginalMember(owner = "client!fk", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field9192++;
        this.field9197.method4004(0, this.field9193);
        super.finalize();
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(I)V")
    public static void method3794(int arg0) {
        if (arg0 == 19593) {
            field9194 = null;
            field9196 = null;
        }
    }

    @OriginalMember(owner = "client!fk", name = "<init>", descriptor = "(Lno;JI)V")
    public class656(class704 arg0, long arg1, int arg2) {
        this.field9193 = arg1;
        this.field9197 = arg0;
    }
}
