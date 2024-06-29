import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class575 {

    @OriginalMember(owner = "client!te", name = "e", descriptor = "Lno;")
    private class658 field7606;

    @OriginalMember(owner = "client!te", name = "g", descriptor = "J")
    public long field7608;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "I")
    public static int field7602 = 0;

    @OriginalMember(owner = "client!te", name = "d", descriptor = "F")
    public static float field7605 = 1.0F;

    @OriginalMember(owner = "client!te", name = "b", descriptor = "I")
    public static int field7603;

    @OriginalMember(owner = "client!te", name = "c", descriptor = "I")
    public static int field7604;

    @OriginalMember(owner = "client!te", name = "f", descriptor = "I")
    public static int field7607;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(Lgba;III)V", line = 6)
    public static final void method3150(class625 arg0, int arg1, int arg2, int arg3) {
        class164.field2572 = arg3;
        class645.field8657 = arg0;
        field7607++;
        class484.field6548 = arg2;
        if (arg1 != 5952) {
            method3150(null, 38, 3, 62);
        }
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(B)V", line = 25)
    public static final void method3151(byte arg0) {
        field7604++;
        class251.field3460.method442(((float) class344.field4718.field5453 * 0.1F + 0.7F) * class247.field3444);
        int var1 = 118 % ((arg0 + 21) / 34);
        class251.field3460.method371(class58.field825, class526.field7010, class296.field4182, (float) (class300.field4195 << 2), (float) (class348.field4776 << 2), (float) (class517.field6897 << 2));
        class251.field3460.method432(class456.field6197);
    }

    @OriginalMember(owner = "client!te", name = "finalize", descriptor = "()V", line = 39)
    protected final void finalize() throws Throwable {
        field7603++;
        this.field7606.method3647(this.field7608, true);
        super.finalize();
    }

    @OriginalMember(owner = "client!te", name = "<init>", descriptor = "(Lno;JI)V", line = 52)
    public class575(class658 arg0, long arg1, int arg2) {
        this.field7606 = arg0;
        this.field7608 = arg1;
    }
}
