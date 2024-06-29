import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class633 extends class759 implements class399 {

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "I")
    private int field8517;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "[I")
    public static int[] field8514 = new int[4096];

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "I")
    public static int field8515;

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "I")
    public static int field8516;

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "I")
    public static int field8518;

    @OriginalMember(owner = "client!cb", name = "h", descriptor = "I")
    public static int field8519;

    @OriginalMember(owner = "client!cb", name = "i", descriptor = "I")
    public static int field8520;

    @OriginalMember(owner = "client!cb", name = "j", descriptor = "I")
    public static int field8521;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(I)J")
    public final long method2488(int arg0) {
        if (arg0 != -6566) {
            method3550(78);
        }
        ++field8521;
        return super.field10577.getAddress();
    }

    @OriginalMember(owner = "client!cb", name = "b", descriptor = "(I)I")
    public final int method2487(int arg0) {
        ++field8518;
        if (arg0 <= 57) {
            this.field8517 = 28;
        }
        return this.field8517;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(I)I")
    public final int method2485(int arg0) {
        if (arg0 != 22162) {
            return -106;
        } else {
            ++field8519;
            return 0;
        }
    }

    @OriginalMember(owner = "client!cb", name = "d", descriptor = "(I)V")
    public static void method3550(int arg0) {
        if (arg0 == 4096) {
            field8514 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II[BI)V")
    public final void method2486(int arg0, int arg1, byte[] arg2, int arg3) {
        ++field8516;
        this.method4209(arg2, arg1);
        if (arg0 < 109) {
            method3551(127, -126);
        }
        this.field8517 = arg3;
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "(Ldw;I[BI)V")
    public class633(class664 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field8517 = arg1;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)I")
    public static final int method3551(int arg0, int arg1) {
        ++field8515;
        return arg1 > -56 ? 26 : 255 & arg0;
    }
}
