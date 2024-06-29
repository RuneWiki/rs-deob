import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pba")
public class class333 extends class297 {

    @OriginalMember(owner = "client!pba", name = "M", descriptor = "I")
    private int field4640;

    @OriginalMember(owner = "client!pba", name = "I", descriptor = "Lmu;")
    public static class303 field4636 = new class303(91, 2);

    @OriginalMember(owner = "client!pba", name = "J", descriptor = "I")
    public static int field4637;

    @OriginalMember(owner = "client!pba", name = "K", descriptor = "I")
    public static int field4638;

    @OriginalMember(owner = "client!pba", name = "L", descriptor = "I")
    public static int field4639;

    @OriginalMember(owner = "client!pba", name = "N", descriptor = "I")
    public static int field4641;

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(Lcea;II)V", line = 3)
    public final void method17(class215 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            this.field4640 = (arg0.method1535(255) << 12) / 255;
        }
        if (arg2 == 31015) {
            ++field4637;
        }
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(IBI)V", line = 30)
    public static final void method2106(int arg0, byte arg1, int arg2) {
        ++field4638;
        class594 var3 = class692.method3869(arg2, (byte) 105, 17);
        var3.method3378(-25490);
        var3.field8126 = arg0;
        int var4 = 59 / ((arg1 - -7) / 49);
    }

    @OriginalMember(owner = "client!pba", name = "f", descriptor = "(I)V", line = 43)
    public static void method2107(int arg0) {
        field4636 = null;
        if (arg0 != 0) {
            field4636 = null;
        }
    }

    @OriginalMember(owner = "client!pba", name = "<init>", descriptor = "(I)V", line = 57)
    public class333(int arg0) {
        super(0, true);
        this.field4640 = 4096;
        this.field4640 = arg0;
    }

    @OriginalMember(owner = "client!pba", name = "a", descriptor = "(ILma;ILin;ZII)V", line = 65)
    public static final void method2108(int arg0, class12 arg1, int arg2, class91 arg3, boolean arg4, int arg5, int arg6) {
        ++field4639;
        if (arg0 != 2) {
            field4636 = null;
        }
        class580.method3329(arg5, arg6, arg4, 96, arg3, arg2);
        class539.field7455 = arg1;
    }

    @OriginalMember(owner = "client!pba", name = "c", descriptor = "(II)[I", line = 78)
    public final int[] method15(int arg0, int arg1) {
        ++field4641;
        int[] var3 = super.field4165.method127(0, arg0);
        if (super.field4165.field266) {
            class363.method2321(var3, 0, class525.field7275, this.field4640);
        }
        if (arg1 != 255) {
            method2107(63);
        }
        return var3;
    }

    @OriginalMember(owner = "client!pba", name = "<init>", descriptor = "()V", line = 100)
    public class333() {
        this(4096);
    }
}
