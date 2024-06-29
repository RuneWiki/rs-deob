import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!um")
public class class192 extends class46 {

    @OriginalMember(owner = "client!um", name = "F", descriptor = "I")
    private int field2686;

    @OriginalMember(owner = "client!um", name = "K", descriptor = "I")
    private int field2691;

    @OriginalMember(owner = "client!um", name = "z", descriptor = "I")
    private int field2680;

    @OriginalMember(owner = "client!um", name = "D", descriptor = "I")
    private int field2684;

    @OriginalMember(owner = "client!um", name = "y", descriptor = "Lbn;")
    public static class160 field2679 = new class160(62, -1);

    @OriginalMember(owner = "client!um", name = "C", descriptor = "[Ltp;")
    public static class196[] field2683 = new class196[14];

    @OriginalMember(owner = "client!um", name = "G", descriptor = "Lbn;")
    public static class160 field2687 = new class160(52, -1);

    @OriginalMember(owner = "client!um", name = "t", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!um", name = "u", descriptor = "I")
    private int field2675;

    @OriginalMember(owner = "client!um", name = "w", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!um", name = "x", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!um", name = "A", descriptor = "I")
    private int field2681;

    @OriginalMember(owner = "client!um", name = "B", descriptor = "I")
    private int field2682;

    @OriginalMember(owner = "client!um", name = "E", descriptor = "I")
    private int field2685;

    @OriginalMember(owner = "client!um", name = "H", descriptor = "I")
    public static int field2688;

    @OriginalMember(owner = "client!um", name = "I", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!um", name = "J", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!um", name = "L", descriptor = "I")
    public static int field2692;

    @OriginalMember(owner = "client!um", name = "v", descriptor = "[B")
    private byte[] field2676;

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(Z)V")
    public final void method27(boolean arg0) {
        this.field2685 = 0;
        if (arg0) {
            method1338(-84);
        }
        field2677++;
        this.field2681 = 0;
    }

    @OriginalMember(owner = "client!um", name = "<init>", descriptor = "(IIIIIFFF)V")
    public class192(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5, float arg6, float arg7) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field2686 = (int) (arg6 * 4096.0F);
        this.field2691 = (int) (arg7 * 4096.0F);
        this.field2684 = this.field2680 = (int) (Math.pow(0.5D, (double) (-arg5)) * 4096.0D);
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IB)V")
    public void method1336(int arg0, byte arg1) {
        field2690++;
        this.field2676[arg0] = arg1;
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(BI)V")
    public static final void method1337(byte arg0, int arg1) {
        class363 var2 = class148.field2017;
        synchronized (class148.field2017) {
            class148.field2017.method2300(arg1, true);
        }
        if (arg0 < -70) {
            field2692++;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(IBI)V")
    public final void method29(int arg0, byte arg1, int arg2) {
        field2674++;
        if (arg0 == 0) {
            this.field2682 = this.field2686 - (arg2 < 0 ? -arg2 : arg2);
            this.field2675 = 4096;
            this.field2682 = this.field2682 * this.field2682 >> 12;
            this.field2685 = this.field2682;
        } else {
            this.field2675 = this.field2691 * this.field2682 >> 12;
            this.field2682 = this.field2686 - (arg2 < 0 ? -arg2 : arg2);
            if (this.field2675 < 0) {
                this.field2675 = 0;
            } else if (this.field2675 > 4096) {
                this.field2675 = 4096;
            }
            this.field2682 = this.field2682 * this.field2682 >> 12;
            this.field2682 = this.field2682 * this.field2675 >> 12;
            this.field2685 += this.field2684 * this.field2682 >> 12;
            this.field2684 = this.field2684 * this.field2680 >> 12;
        }
        if (arg1 <= 105) {
            this.method1336(-25, (byte) -76);
        }
    }

    @OriginalMember(owner = "client!um", name = "e", descriptor = "(I)V")
    public static void method1338(int arg0) {
        if (arg0 == -6598) {
            field2683 = null;
            field2679 = null;
            field2687 = null;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(B)V")
    public final void method25(byte arg0) {
        this.field2685 >>= 0x4;
        field2689++;
        this.field2684 = this.field2680;
        if (this.field2685 < 0) {
            this.field2685 = 0;
        } else if (this.field2685 > 255) {
            this.field2685 = 255;
        }
        if (arg0 == -97) {
            this.method1336(this.field2681++, (byte) this.field2685);
            this.field2685 = 0;
        }
    }

    @OriginalMember(owner = "client!um", name = "a", descriptor = "(ZILjava/lang/String;)I")
    public static final int method1339(boolean arg0, int arg1, String arg2) {
        if (arg0) {
            field2688++;
            return class133.method890(58, arg2, true, arg1);
        } else {
            return 3;
        }
    }
}
