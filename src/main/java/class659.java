import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fj")
public class class659 extends class508 {

    @OriginalMember(owner = "client!fj", name = "v", descriptor = "Lqj;")
    private class548 field9344;

    @OriginalMember(owner = "client!fj", name = "x", descriptor = "I")
    public int field9346;

    @OriginalMember(owner = "client!fj", name = "u", descriptor = "J")
    private long field9343;

    @OriginalMember(owner = "client!fj", name = "z", descriptor = "Z")
    public static boolean field9348 = false;

    @OriginalMember(owner = "client!fj", name = "s", descriptor = "Lwp;")
    public static class453 field9341 = new class453(1, -1);

    @OriginalMember(owner = "client!fj", name = "w", descriptor = "I")
    public static int field9345;

    @OriginalMember(owner = "client!fj", name = "y", descriptor = "I")
    public static int field9347;

    @OriginalMember(owner = "client!fj", name = "A", descriptor = "I")
    public static int field9349;

    @OriginalMember(owner = "client!fj", name = "t", descriptor = "Lad;")
    public static class19 field9342;

    @OriginalMember(owner = "client!fj", name = "b", descriptor = "(B)J")
    public final long method3711(byte arg0) {
        if (arg0 >= -99) {
            field9348 = true;
        }
        field9347++;
        return this.field9343;
    }

    @OriginalMember(owner = "client!fj", name = "c", descriptor = "(B)V")
    private final void method3712(byte arg0) {
        if (arg0 != 44) {
            return;
        }
        if (this.field9343 > 0L) {
            this.field9344.field7436.releasePbuffer(this.field9343);
            this.field9343 = 0L;
        }
        field9349++;
    }

    @OriginalMember(owner = "client!fj", name = "d", descriptor = "(B)V")
    public static void method3713(byte arg0) {
        if (arg0 != 120) {
            field9341 = null;
        }
        field9342 = null;
        field9341 = null;
    }

    @OriginalMember(owner = "client!fj", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method3712((byte) 44);
        field9345++;
        super.finalize();
    }

    @OriginalMember(owner = "client!fj", name = "<init>", descriptor = "(Lqj;II)V")
    public class659(class548 arg0, int arg1, int arg2) {
        this.field9344 = arg0;
        this.field9346 = arg1 * arg2;
        this.field9343 = this.field9344.field7436.createPbuffer(arg1, arg2);
    }
}
