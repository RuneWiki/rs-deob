import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pv")
public class class61 {

    @OriginalMember(owner = "client!pv", name = "f", descriptor = "Lrg;")
    public static class548 field594 = new class548(77, 0);

    @OriginalMember(owner = "client!pv", name = "b", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!pv", name = "c", descriptor = "I")
    public int field591;

    @OriginalMember(owner = "client!pv", name = "d", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!pv", name = "e", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "Lgn;")
    public class598 field589;

    @OriginalMember(owner = "client!pv", name = "g", descriptor = "Lpv;")
    public class61 field595;

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(IZ)Let;")
    public static final class509 method348(int arg0, boolean arg1) {
        field593++;
        if (!arg1) {
            return null;
        }
        int var2 = arg0 >> 16;
        int var3 = arg0 & 0xFFFF;
        if (class459.field6326[var2] == null || class459.field6326[var2][var3] == null) {
            boolean var4 = class640.method3678(false, var2);
            if (!var4) {
                return null;
            }
        }
        return class459.field6326[var2][var3];
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(I)V")
    public final void method349(int arg0) {
        field590++;
        if (class485.field6791 >= 500) {
            return;
        }
        this.field595 = class538.field7881;
        if (arg0 != 24898) {
            this.field595 = null;
        }
        this.field591 = 0;
        this.field589 = null;
        class538.field7881 = this;
        class485.field6791++;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(Z)V")
    public static void method350(boolean arg0) {
        if (arg0) {
            method350(false);
        }
        field594 = null;
    }

    @OriginalMember(owner = "client!pv", name = "a", descriptor = "(IIIII[B[BII)V")
    public static final void method351(int arg0, int arg1, int arg2, int arg3, int arg4, byte[] arg5, byte[] arg6, int arg7, int arg8) {
        field592++;
        int var9 = -(arg1 >> 2);
        int var10 = -(arg1 & 0x3);
        if (arg7 != 65535) {
            return;
        }
        for (int var11 = -arg3; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg8++;
                arg5[var10001] += arg6[arg4++];
                int var14 = arg8++;
                arg5[var14] += arg6[arg4++];
                int var15 = arg8++;
                arg5[var15] += arg6[arg4++];
                int var16 = arg8++;
                arg5[var16] += arg6[arg4++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg8++;
                arg5[var10001] += arg6[arg4++];
            }
            arg8 += arg0;
            arg4 += arg2;
        }
    }
}
