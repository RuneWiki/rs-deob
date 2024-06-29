import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oi")
public class class726 extends class601 {

    @OriginalMember(owner = "client!oi", name = "F", descriptor = "I")
    private int field9524 = 4096;

    @OriginalMember(owner = "client!oi", name = "M", descriptor = "I")
    private int field9530 = 0;

    @OriginalMember(owner = "client!oi", name = "H", descriptor = "Ljava/lang/String;")
    public static String field9525 = null;

    @OriginalMember(owner = "client!oi", name = "J", descriptor = "Luw;")
    public static class208 field9527 = new class208(75, 3);

    @OriginalMember(owner = "client!oi", name = "I", descriptor = "I")
    public static int field9526;

    @OriginalMember(owner = "client!oi", name = "K", descriptor = "I")
    public static int field9528;

    @OriginalMember(owner = "client!oi", name = "N", descriptor = "I")
    public static int field9531;

    @OriginalMember(owner = "client!oi", name = "L", descriptor = "J")
    public static long field9529;

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IB)[I")
    public final int[] method261(int arg0, byte arg1) {
        if (arg1 > -76) {
            this.method259((class234) null, -36, -94);
        }
        ++field9526;
        int[] var3 = super.field7643.method2054(arg0, 9986);
        if (super.field7643.field4364) {
            int[] var4 = this.method3243(arg0, 27123, 0);
            for (int var5 = 0; class418.field5518 > var5; ++var5) {
                int var6 = var4[var5];
                var3[var5] = ~var6 <= ~this.field9530 && this.field9524 >= var6 ? 4096 : 0;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(Lmc;II)V")
    public final void method259(class234 arg0, int arg1, int arg2) {
        if (~arg1 != -1) {
            if (arg1 == 1) {
                this.field9524 = arg0.method1553((byte) 34);
            }
        } else {
            this.field9530 = arg0.method1553((byte) -120);
        }
        int var5 = -127 / ((40 - arg2) / 52);
        ++field9528;
    }

    @OriginalMember(owner = "client!oi", name = "<init>", descriptor = "()V")
    public class726() {
        super(1, true);
    }

    @OriginalMember(owner = "client!oi", name = "a", descriptor = "(IIIIIII)Z")
    public static final boolean method3884(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field9531;
        int var7 = arg2 + arg6;
        int var8 = arg0 + arg4;
        int var9 = arg1 + arg3;
        if (!class239.method1574(23014, var8, arg2, var8, arg3, var9, var8, arg2, var9, var7)) {
            return false;
        } else if (!class239.method1574(arg5 + 23015, var8, arg2, var8, arg3, var9, var8, var7, arg3, var7)) {
            return false;
        } else {
            if (arg5 != -1) {
                field9525 = null;
            }
            if (~arg2 <= ~class602.field7656) {
                if (!class239.method1574(23014, var8, var7, arg4, var9, var9, var8, var7, arg3, var7)) {
                    return false;
                }
                if (!class239.method1574(23014, arg4, var7, arg4, var9, arg3, var8, var7, arg3, var7)) {
                    return false;
                }
            } else {
                if (!class239.method1574(23014, var8, arg2, arg4, var9, var9, var8, arg2, arg3, arg2)) {
                    return false;
                }
                if (!class239.method1574(23014, arg4, arg2, arg4, var9, arg3, var8, arg2, arg3, arg2)) {
                    return false;
                }
            }
            if (arg3 < class82.field1172) {
                if (!class239.method1574(arg5 ^ -23015, var8, arg2, arg4, arg3, arg3, var8, arg2, arg3, var7)) {
                    return false;
                }
                if (!class239.method1574(arg5 + 23015, arg4, arg2, arg4, arg3, arg3, var8, var7, arg3, var7)) {
                    return false;
                }
            } else {
                if (!class239.method1574(23014, var8, arg2, arg4, var9, var9, var8, arg2, var9, var7)) {
                    return false;
                }
                if (!class239.method1574(23014, arg4, arg2, arg4, var9, var9, var8, var7, var9, var7)) {
                    return false;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!oi", name = "f", descriptor = "(I)V")
    public static void method3885(int arg0) {
        field9527 = null;
        if (arg0 >= 43) {
            field9525 = null;
        }
    }
}
