import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class195 extends class440 {

    @OriginalMember(owner = "client!gb", name = "D", descriptor = "I")
    private int field2794;

    @OriginalMember(owner = "client!gb", name = "C", descriptor = "I")
    public static int field2793;

    @OriginalMember(owner = "client!gb", name = "E", descriptor = "I")
    public static int field2795;

    @OriginalMember(owner = "client!gb", name = "F", descriptor = "I")
    public static int field2796;

    @OriginalMember(owner = "client!gb", name = "G", descriptor = "I")
    public static int field2797;

    @OriginalMember(owner = "client!gb", name = "H", descriptor = "I")
    public static int field2798;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(BFFIF)F")
    public static final float method1319(byte arg0, float arg1, float arg2, int arg3, float arg4) {
        if (arg0 < 51) {
            return -1.9108313F;
        } else {
            ++field2797;
            float[] var5 = class577.field8130[arg3];
            return var5[2] * arg2 + var5[0] * arg1 + var5[1] * arg4;
        }
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(I)V")
    public class195(int arg0) {
        super(0, true);
        this.field2794 = 4096;
        this.field2794 = arg0;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILmo;I)V")
    public final void method234(int arg0, class695 arg1, int arg2) {
        if (~arg2 == -1) {
            this.field2794 = (arg1.method3826(false) << 12) / 255;
        }
        if (arg0 == 5) {
            ++field2793;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(IIZIII)V")
    public static final void method1320(int arg0, int arg1, boolean arg2, int arg3, int arg4, int arg5) {
        if (arg2) {
            ++field2796;
            if (~arg0 == ~arg1) {
                class508.method2920(arg1, (byte) -118, arg4, arg5, arg3);
            } else if (-arg1 + arg3 >= class15.field153 && arg1 + arg3 <= class248.field3859 && -arg0 + arg5 >= class520.field7329 && ~class239.field3747 <= ~(arg0 + arg5)) {
                class699.method3899(arg4, arg5, arg3, arg1, -103, arg0);
            } else {
                class552.method3132(arg5, 22099, arg3, arg0, arg4, arg1);
            }
        }
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
    public class195() {
        this(4096);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(BILpu;)Lf;")
    public static final class702 method1321(byte arg0, int arg1, class522 arg2) {
        int var3 = 113 % ((arg0 - -21) / 37);
        ++field2795;
        class702 var4 = (class702) class308.field4556.method2287(1, (long) arg1);
        if (var4 == null) {
            if (class27.field399) {
                var4 = class282.field4228.method138(class113.method886(arg2, arg1), true);
            } else {
                var4 = class637.method3545(arg2.method2994(arg1, (byte) 93), false);
            }
            class308.field4556.method2291(var4, (long) arg1, 1);
        }
        return var4;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(BI)[I")
    public final int[] method229(byte arg0, int arg1) {
        int var3 = -57 / ((arg0 - -56) / 41);
        ++field2798;
        int[] var4 = super.field6412.method3250((byte) 5, arg1);
        if (super.field6412.field8047) {
            class476.method2790(var4, 0, class549.field7715, this.field2794);
        }
        return var4;
    }
}
