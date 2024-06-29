import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!paa")
public class class583 extends class656 implements class308 {

    @OriginalMember(owner = "client!paa", name = "v", descriptor = "I")
    private int field7841;

    @OriginalMember(owner = "client!paa", name = "n", descriptor = "I")
    public static int field7833 = 0;

    @OriginalMember(owner = "client!paa", name = "s", descriptor = "[I")
    public static int[] field7838 = new int[6];

    @OriginalMember(owner = "client!paa", name = "p", descriptor = "I")
    public static int field7835 = 1403;

    @OriginalMember(owner = "client!paa", name = "m", descriptor = "I")
    public static int field7832;

    @OriginalMember(owner = "client!paa", name = "o", descriptor = "I")
    public static int field7834;

    @OriginalMember(owner = "client!paa", name = "q", descriptor = "I")
    public static int field7836;

    @OriginalMember(owner = "client!paa", name = "r", descriptor = "I")
    public static int field7837;

    @OriginalMember(owner = "client!paa", name = "t", descriptor = "I")
    public static int field7839;

    @OriginalMember(owner = "client!paa", name = "u", descriptor = "I")
    public static int field7840;

    @OriginalMember(owner = "client!paa", name = "w", descriptor = "I")
    public static int field7842;

    @OriginalMember(owner = "client!paa", name = "x", descriptor = "I")
    public static int field7843;

    @OriginalMember(owner = "client!paa", name = "b", descriptor = "(I)V", line = 5)
    public final void method2629(int arg0) {
        super.field8928.method3135(this, 25913);
        int var2 = 93 / ((12 - arg0) / 53);
        ++field7834;
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(B)J", line = 17)
    public final long method1824(byte arg0) {
        if (arg0 != -80) {
            return 81L;
        } else {
            ++field7836;
            return 0L;
        }
    }

    @OriginalMember(owner = "client!paa", name = "b", descriptor = "(B)I", line = 28)
    public final int method1825(byte arg0) {
        if (arg0 != -109) {
            return 17;
        } else {
            ++field7843;
            return super.field8926;
        }
    }

    @OriginalMember(owner = "client!paa", name = "c", descriptor = "(I)V", line = 41)
    public static void method3235(int arg0) {
        if (arg0 != 28559) {
            method3235(8);
        }
        field7838 = null;
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(I)I", line = 53)
    public final int method1827(int arg0) {
        if (arg0 <= 14) {
            field7838 = null;
        }
        ++field7842;
        return this.field7841;
    }

    @OriginalMember(owner = "client!paa", name = "a", descriptor = "(II[BI)V", line = 71)
    public final void method1826(int arg0, int arg1, byte[] arg2, int arg3) {
        this.method3663(106, arg2, arg3);
        if (arg1 != 29039) {
            field7837 = -113;
        }
        ++field7839;
        this.field7841 = arg0;
    }

    @OriginalMember(owner = "client!paa", name = "<init>", descriptor = "(Ljaa;I[BIZ)V", line = 83)
    public class583(class576 arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
        super(arg0, 34963, arg2, arg3, arg4);
        this.field7841 = arg1;
    }
}
