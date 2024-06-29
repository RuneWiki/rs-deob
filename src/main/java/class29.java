import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class29 extends class578 {

    @OriginalMember(owner = "client!o", name = "i", descriptor = "I")
    private int field761;

    @OriginalMember(owner = "client!o", name = "o", descriptor = "I")
    private int field767;

    @OriginalMember(owner = "client!o", name = "f", descriptor = "I")
    private int field758;

    @OriginalMember(owner = "client!o", name = "j", descriptor = "I")
    private int field762;

    @OriginalMember(owner = "client!o", name = "g", descriptor = "I")
    public static int field759;

    @OriginalMember(owner = "client!o", name = "h", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!o", name = "k", descriptor = "I")
    public static int field763;

    @OriginalMember(owner = "client!o", name = "l", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!o", name = "n", descriptor = "I")
    public static int field766;

    @OriginalMember(owner = "client!o", name = "m", descriptor = "Lio;")
    public static class439 field765;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(III)V")
    public final void method399(int arg0, int arg1, int arg2) {
        ++field759;
        if (arg2 >= -98) {
            method403(-91, (class215) null);
        }
    }

    @OriginalMember(owner = "client!o", name = "c", descriptor = "(III)V")
    public final void method400(int arg0, int arg1, int arg2) {
        ++field764;
        int var4 = this.field758 * arg1 >> 12;
        if (arg2 >= -29) {
            this.field767 = 119;
        }
        int var5 = this.field767 * arg1 >> 12;
        int var6 = this.field762 * arg0 >> 12;
        int var7 = this.field761 * arg0 >> 12;
        class501.method2951(var4, (byte) 118, super.field7937, var6, var7, var5);
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(I)V")
    public static void method401(int arg0) {
        if (arg0 == -30065) {
            field765 = null;
        }
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(III)V")
    public final void method402(int arg0, int arg1, int arg2) {
        if (arg0 < 87) {
            this.field767 = 33;
        }
        ++field763;
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "(IIIIII)V")
    public class29(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        super(-1, arg4, arg5);
        this.field761 = arg3;
        this.field767 = arg2;
        this.field758 = arg0;
        this.field762 = arg1;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(ILcea;)Lot;")
    public static final class590 method403(int arg0, class215 arg1) {
        ++field766;
        String var2 = arg1.method1525((byte) 90);
        class95 var3 = class590.method3368(127)[arg1.method1535(arg0 ^ -27759)];
        if (arg0 != -27794) {
            return null;
        } else {
            class236 var4 = class554.method3187(arg0 + 47794)[arg1.method1535(255)];
            int var5 = arg1.method1520(13638);
            int var6 = arg1.method1520(13638);
            int var7 = arg1.method1535(255);
            int var8 = arg1.method1535(255);
            int var9 = arg1.method1535(255);
            int var10 = arg1.method1478(arg0 ^ -842372202);
            int var11 = arg1.method1478(842397944);
            int var12 = arg1.method1533((byte) -126);
            int var13 = arg1.method1533((byte) -126);
            int var14 = arg1.method1533((byte) -126);
            return new class590(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12, var13, var14);
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BILmf;IZZLmf;)I")
    public static final int method404(byte arg0, int arg1, class420 arg2, int arg3, boolean arg4, boolean arg5, class420 arg6) {
        ++field760;
        int var7 = class616.method3493(arg6, arg2, arg4, arg1, (byte) -30);
        if (var7 != 0) {
            return !arg4 ? var7 : -var7;
        } else if (~arg3 == 0) {
            return 0;
        } else if (arg0 >= -42) {
            return -65;
        } else {
            int var8 = class616.method3493(arg6, arg2, arg5, arg3, (byte) -30);
            return arg5 ? -var8 : var8;
        }
    }
}
