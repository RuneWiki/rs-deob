import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class670 {

    @OriginalMember(owner = "client!jn", name = "e", descriptor = "I")
    public int field9401 = -1;

    @OriginalMember(owner = "client!jn", name = "d", descriptor = "I")
    public int field9400 = -1;

    @OriginalMember(owner = "client!jn", name = "j", descriptor = "[I")
    public static int[] field9406 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "I")
    public static int field9397;

    @OriginalMember(owner = "client!jn", name = "b", descriptor = "I")
    public static int field9398;

    @OriginalMember(owner = "client!jn", name = "c", descriptor = "I")
    public static int field9399;

    @OriginalMember(owner = "client!jn", name = "g", descriptor = "I")
    public static int field9403;

    @OriginalMember(owner = "client!jn", name = "h", descriptor = "I")
    public static int field9404;

    @OriginalMember(owner = "client!jn", name = "f", descriptor = "Llf;")
    public static class215 field9402;

    @OriginalMember(owner = "client!jn", name = "i", descriptor = "[I")
    public int[] field9405;

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IZ)V")
    public static final void method3780(int arg0, boolean arg1) {
        field9404++;
        class136.field1928 = arg0;
        class663 var2 = class120.field1658;
        synchronized (class120.field1658) {
            class120.field1658.method3749(7648);
        }
        if (arg1) {
            field9403 = 13;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(B)V")
    public static void method3781(byte arg0) {
        field9406 = null;
        field9402 = null;
        if (arg0 != -15) {
            method3782(72, 32, (byte) 115, 77, 59);
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(IIBII)V")
    public static final void method3782(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field9397++;
        if (class128.field1831 <= arg0 && arg0 <= class529.field7169) {
            int var5 = class280.method1727((byte) 94, class533.field7200, class469.field6466, arg1);
            int var6 = class280.method1727((byte) 94, class533.field7200, class469.field6466, arg4);
            class553.method3106((byte) 119, arg3, var5, var6, arg0);
        }
        if (arg2 >= -76) {
            field9403 = -34;
        }
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILac;I)V")
    private final void method3783(int arg0, class501 arg1, int arg2) {
        if (arg2 != -18705) {
            method3780(126, true);
        }
        if (arg0 == 1) {
            this.field9400 = arg1.method2845(arg2 ^ 0x4910);
        } else if (arg0 == 2) {
            this.field9405 = new int[arg1.method2874((byte) -75)];
            for (int var4 = 0; var4 < this.field9405.length; var4++) {
                this.field9405[var4] = arg1.method2845(-1);
            }
        } else if (arg0 == 3) {
            this.field9401 = arg1.method2874((byte) -75);
        }
        field9399++;
    }

    @OriginalMember(owner = "client!jn", name = "a", descriptor = "(ILac;)V")
    public final void method3784(int arg0, class501 arg1) {
        field9398++;
        while (true) {
            int var3 = arg1.method2874((byte) -75);
            if (var3 == 0) {
                if (arg0 <= 62) {
                    this.method3784(46, null);
                    return;
                } else {
                    return;
                }
            }
            this.method3783(var3, arg1, -18705);
        }
    }
}
