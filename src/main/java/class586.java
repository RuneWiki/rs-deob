import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qp")
public class class586 {

    @OriginalMember(owner = "client!qp", name = "g", descriptor = "I")
    public int field8710;

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "I")
    private int field8704;

    @OriginalMember(owner = "client!qp", name = "f", descriptor = "I")
    public static int field8709 = -1;

    @OriginalMember(owner = "client!qp", name = "d", descriptor = "Lqp;")
    public static class586 field8707 = new class586(72, -2);

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "I")
    public static int field8705;

    @OriginalMember(owner = "client!qp", name = "c", descriptor = "I")
    public static int field8706;

    @OriginalMember(owner = "client!qp", name = "e", descriptor = "I")
    public static int field8708;

    @OriginalMember(owner = "client!qp", name = "h", descriptor = "I")
    public static int field8711;

    @OriginalMember(owner = "client!qp", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8708++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(I)I")
    public final int method3421(int arg0) {
        field8706++;
        return arg0 == 28888 ? this.field8704 : 19;
    }

    @OriginalMember(owner = "client!qp", name = "a", descriptor = "(ILdda;)V")
    public static final void method3422(int arg0, class597 arg1) {
        if (arg0 >= -121) {
            method3423(54);
        }
        class10.field95 = arg1;
        field8711++;
    }

    @OriginalMember(owner = "client!qp", name = "b", descriptor = "(I)V")
    public static void method3423(int arg0) {
        if (arg0 != 72) {
            method3422(-12, null);
        }
        field8707 = null;
    }

    @OriginalMember(owner = "client!qp", name = "<init>", descriptor = "(II)V")
    public class586(int arg0, int arg1) {
        this.field8710 = arg1;
        this.field8704 = arg0;
    }
}
