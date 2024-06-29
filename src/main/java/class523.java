import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wm")
public class class523 extends class375 {

    @OriginalMember(owner = "client!wm", name = "t", descriptor = "Lok;")
    private class228 field7385;

    @OriginalMember(owner = "client!wm", name = "u", descriptor = "I")
    public int field7386;

    @OriginalMember(owner = "client!wm", name = "w", descriptor = "J")
    private long field7388;

    @OriginalMember(owner = "client!wm", name = "x", descriptor = "Lnea;")
    public static class664 field7389 = new class664(47, -1);

    @OriginalMember(owner = "client!wm", name = "z", descriptor = "Lnea;")
    public static class664 field7391 = new class664(60, -1);

    @OriginalMember(owner = "client!wm", name = "A", descriptor = "Lqaa;")
    public static class26 field7392 = new class26(7500);

    @OriginalMember(owner = "client!wm", name = "v", descriptor = "I")
    public static int field7387;

    @OriginalMember(owner = "client!wm", name = "y", descriptor = "I")
    public static int field7390;

    @OriginalMember(owner = "client!wm", name = "B", descriptor = "I")
    public static int field7393;

    @OriginalMember(owner = "client!wm", name = "d", descriptor = "(B)V", line = 4)
    public static void method3010(byte arg0) {
        field7391 = null;
        if (arg0 != -111) {
            method3010((byte) 53);
        }
        field7392 = null;
        field7389 = null;
    }

    @OriginalMember(owner = "client!wm", name = "a", descriptor = "(I)V", line = 22)
    private final void method3011(int arg0) {
        if ((long) arg0 < this.field7388) {
            this.field7385.field3220.releasePbuffer(this.field7388);
            this.field7388 = 0L;
        }
        field7387++;
    }

    @OriginalMember(owner = "client!wm", name = "e", descriptor = "(B)J", line = 37)
    public final long method3012(byte arg0) {
        field7390++;
        if (arg0 < 6) {
            method3010((byte) 95);
        }
        return this.field7388;
    }

    @OriginalMember(owner = "client!wm", name = "finalize", descriptor = "()V", line = 52)
    protected final void finalize() throws Throwable {
        this.method3011(0);
        field7393++;
        super.finalize();
    }

    @OriginalMember(owner = "client!wm", name = "<init>", descriptor = "(Lok;II)V", line = 64)
    public class523(class228 arg0, int arg1, int arg2) {
        this.field7385 = arg0;
        this.field7386 = arg1 * arg2;
        this.field7388 = this.field7385.field3220.createPbuffer(arg1, arg2);
    }
}
