import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gea")
public class class669 extends class601 {

    @OriginalMember(owner = "client!gea", name = "F", descriptor = "I")
    public static int field8689;

    @OriginalMember(owner = "client!gea", name = "G", descriptor = "I")
    public static int field8690;

    @OriginalMember(owner = "client!gea", name = "H", descriptor = "I")
    public static int field8691;

    @OriginalMember(owner = "client!gea", name = "I", descriptor = "I")
    public static int field8692;

    @OriginalMember(owner = "client!gea", name = "J", descriptor = "I")
    public static int field8693;

    @OriginalMember(owner = "client!gea", name = "K", descriptor = "I")
    public static int field8694;

    @OriginalMember(owner = "client!gea", name = "<init>", descriptor = "()V")
    public class669() {
        super(1, true);
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(ILha;ILjava/lang/String;IBII)V")
    public static final void method3623(int arg0, class570 arg1, int arg2, String arg3, int arg4, byte arg5, int arg6, int arg7) {
        if (arg5 != 23) {
            field8692 = -72;
        }
        if (class13.field139 == null || class91.field1241 == null) {
            if (class172.field2270.method130(arg5 + -25, class662.field8638) && class172.field2270.method130(-2, class535.field6750)) {
                class13.field139 = arg1.method977(class388.method2232(class172.field2270, class662.field8638, 0), true);
                class388 var8 = class388.method2232(class172.field2270, class535.field6750, 0);
                class91.field1241 = arg1.method977(var8, true);
                var8.method2234();
                class154.field1962 = arg1.method977(var8, true);
            } else {
                arg1.method921(arg2, arg6, arg0, arg4, class189.field2618 | 255 - class719.field9445 << 24, 1);
            }
        }
        ++field8693;
        if (class13.field139 != null && class91.field1241 != null) {
            int var9 = (arg0 - 2 * class91.field1241.method620()) / class13.field139.method620();
            for (int var10 = 0; var10 < var9; ++var10) {
                class13.field139.method4203(arg2 - (-class91.field1241.method620() - var10 * class13.field139.method620()), arg6);
            }
            class91.field1241.method4203(arg2, arg6);
            class154.field1962.method4203(-class154.field1962.method620() + arg0 + arg2, arg6);
        }
        class595.field7562.method2419(arg6 + 14, class404.field5373 | -16777216, arg3, -79, arg2 + 3, -1);
        arg1.method921(arg2, arg4 + arg6, arg0, -arg4 + arg7, class189.field2618 | -class719.field9445 + 255 << 24, 1);
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(IB)[I")
    public final int[] method261(int arg0, byte arg1) {
        ++field8690;
        int[] var3 = super.field7643.method2054(arg0, 9986);
        if (super.field7643.field4364) {
            int[][] var4 = this.method3247((byte) -100, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            for (int var8 = 0; class418.field5518 > var8; ++var8) {
                var3[var8] = (var5[var8] + var6[var8] - -var7[var8]) / 3;
            }
        }
        return arg1 >= -76 ? null : var3;
    }

    @OriginalMember(owner = "client!gea", name = "a", descriptor = "(IIILha;BIII)V")
    public static final void method3624(int arg0, int arg1, int arg2, class570 arg3, byte arg4, int arg5, int arg6, int arg7) {
        ++field8689;
        class699.field9263 = arg3;
        class467.field6041 = class699.field9263.method994();
        class58.field765 = class699.field9263.method994();
        class384.field4802 = class699.field9263.method994();
        class618.field7834 = arg2;
        class5.field58 = 0;
        class235.field3224 = 0;
        class65.field852 = arg6;
        class422.field5550 = arg1;
        class790.field10823 = arg0;
        int var8 = -33 / ((-48 - arg4) / 47);
        class264.field3511 = null;
        class596.field7567 = 1;
        class203.method1383(arg5, arg7, (byte) -80);
    }
}
